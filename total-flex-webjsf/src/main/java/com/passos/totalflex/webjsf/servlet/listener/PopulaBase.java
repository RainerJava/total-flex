/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.passos.totalflex.webjsf.servlet.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Web application lifecycle listener.
 * @author clayton.kendy
 */
@WebListener()
public class PopulaBase implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("[PopulaBase]Not supported yet.");

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("[PopulaBase]Not supported yet.");
    }
}
