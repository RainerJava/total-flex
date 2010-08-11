/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.passos.totalflex.webjsf.servlet.util;

import com.passos.totalflex.ejb.entidade.UnidadeFederativa;
import com.passos.totalflex.ejb.entidade.UnidadeMedida;
import com.passos.totalflex.ejb.facadelocal.IFacadeLocal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.naming.Context;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author clayton
 */
public class PopulaServlet extends HttpServlet {

    private Context ctx;
    @EJB(beanName = "UnidadeMedidaFacadeLocal")
    private IFacadeLocal unidadeMedidaFacade;
    @EJB(beanName = "UnidadeFederativaFacade")
    private com.passos.totalflex.ejb.facade.IFacadeLocal unidadeFederativaFacade;

    public void process(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        this.populaUnidadeMedida();
        this.pupulaUnidadeFederativa();
    }

    private void pupulaUnidadeFederativa() throws ServletException {
        List<UnidadeFederativa> unidadeFederativaList = new ArrayList<UnidadeFederativa>();
        unidadeFederativaList.add(new UnidadeFederativa("Paraná", "PR"));
        unidadeFederativaList.add(new UnidadeFederativa("São Paulo", "SP"));
        unidadeFederativaList.add(new UnidadeFederativa("Santa Cantarina", "SC"));
        unidadeFederativaList.add(new UnidadeFederativa("Rio Grande do Sul", "RS"));

        unidadeFederativaFacade.create(unidadeFederativaList);
    }

    private void populaUnidadeMedida() throws ServletException {
        try {
            UnidadeMedida um = new UnidadeMedida("Litros", "Lt");
            unidadeMedidaFacade.salvar(um);

            List<UnidadeMedida> unidadeMedidaList = new ArrayList<UnidadeMedida>();
            unidadeMedidaList.add(new UnidadeMedida("Litros", "Lt"));
            unidadeMedidaList.add(new UnidadeMedida("Gramas", "Gr"));
            unidadeMedidaList.add(new UnidadeMedida("Kilos", "Kl"));

        } catch (Exception ex) {
            Logger.getLogger(PopulaServlet.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServletException(ex);
        }


    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        this.process(request, response);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        this.process(request, response);
    }
}
