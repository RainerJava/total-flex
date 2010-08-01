/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.passos.totalflex.webjsf.servlet.crud;

import com.passos.totalflex.ejb.entidade.UnidadeFederativa;
import com.passos.totalflex.ejb.facade.IFacadeLocal;
import com.passos.totalflex.webjsf.servlet.HttpServletBase;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author clayton.kendy
 */
@WebServlet(name = "UnidadeFederativaServlet", urlPatterns = {"/servlet/UnidadeFederativaServlet"})
public class UnidadeFederativaServlet extends HttpServletBase {

    //[java:global/com.passos_total-flex-webjsf_war_1.0/UnidadeFederativa!com.passos.totalflex.ejb.facade.IFacadeLocal
    //java:global/com.passos_total-flex-webjsf_war_1.0/UnidadeFederativa]

    @EJB(beanName = "UnidadeFederativaFacade")
    private IFacadeLocal unFederativa;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nome = request.getParameter("nome");
        String abreviacao = request.getParameter("abreviacao");
        UnidadeFederativa uf = new UnidadeFederativa(nome, abreviacao);

        unFederativa.create(uf);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp_servlet/UnidadeFederativaLst.jsp");
        request.setAttribute("findAll", unFederativa.findAll());
        dispatcher.forward(request, response);

    }
}
