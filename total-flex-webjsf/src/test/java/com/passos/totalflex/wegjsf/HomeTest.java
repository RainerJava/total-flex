/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.passos.totalflex.wegjsf;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.SeleneseTestCase;

/**
 *
 * @author clayton
 */
public class HomeTest extends SeleneseTestCase {

    @Override
    public void setUp() throws Exception {
        setUp("https://www.google.com/", "*iexplore");
    }

    public void testHome() throws Exception {
        selenium.open("http://localhost:8080/total-flex-webjsf/");
        assertEquals("JSF2", selenium.getTitle());
    }
}
