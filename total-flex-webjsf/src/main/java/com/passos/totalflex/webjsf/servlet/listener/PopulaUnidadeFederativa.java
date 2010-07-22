/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.passos.totalflex.webjsf.servlet.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Web application lifecycle listener.
 * @author clayton.kendy
 */
public class PopulaUnidadeFederativa implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
       System.out.println("[PopulaUnidadeFederativa]Not supported yet.");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("[PopulaUnidadeFederativa]Not supported yet.");
    }
}
