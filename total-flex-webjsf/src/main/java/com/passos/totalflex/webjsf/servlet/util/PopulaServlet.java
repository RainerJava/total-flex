/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.passos.totalflex.webjsf.servlet.util;

import com.passos.totalflex.ejb.CachingServiceLocator;
import com.passos.totalflex.ejb.entidade.UnidadeMedida;
import com.passos.totalflex.ejb.facadelocal.IFacadeLocal;
import com.passos.totalflex.ejb.facadelocal.UnidadeMedidaFacadeLocal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.NamingException;
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

    public void process(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        this.populaUnidadeMedida();
    }

    public void populaUnidadeMedida() throws ServletException {
        IFacadeLocal facade;
        try {
            CachingServiceLocator locator = CachingServiceLocator.getInstance();
            facade = (UnidadeMedidaFacadeLocal) locator.getLocalHome("java:global/classes/UnidadeMedidaFacadeLocal");

            UnidadeMedida um = new UnidadeMedida("Litros", "Lt");
            facade.salvar(um);

            List<UnidadeMedida> unidadeMedidaList = new ArrayList<UnidadeMedida>();
            unidadeMedidaList.add(new UnidadeMedida("Litros", "Lt"));
            unidadeMedidaList.add(new UnidadeMedida("Gramas", "Gr"));
            unidadeMedidaList.add(new UnidadeMedida("Kilos", "Kl"));



        } catch (NamingException ex) {
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
