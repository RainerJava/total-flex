/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.passos.totalflex.ejb.facadelocal;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author clayton.kendy
 */
public abstract class AFacadeLocal {

    @PersistenceContext(unitName = "db-tf")
    protected EntityManager em;
}
