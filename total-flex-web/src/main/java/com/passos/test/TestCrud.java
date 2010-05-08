/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.passos.test;

import com.totalflex.web.servlet.HttpServletBase;
import com.totalflex.ejb.facadelocal.IFacadeLocal;
import com.totalflex.model.entidade.UnidadeMedida;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author clayton.kendy
 */
//@WebServlet
public class TestCrud extends HttpServletBase {

    @EJB(beanName="UnidadeMedidaFacadeLocal")
    private IFacadeLocal umRemote;


    @Override
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {


            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet TestCrud</title>");
            out.println("</head>");
            out.println("<body>");

            UnidadeMedida um = new UnidadeMedida("Litros", "Lt");
            umRemote.salvar(um);

//            um = new UnidadeMedida(null, null);
//            out.println("constui");
//
//            out.println("tentar salvar");
//            umRemote.salvar(um);
//            out.println("salvou");
            
            out.println("Quantidade: " + umRemote.count());
            um = (UnidadeMedida)umRemote.find(new Long(1));
            out.println(um.getNome());

            out.println("<h1>executado, veja o console</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }


    }
}
