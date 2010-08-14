/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.passos.totalflex.ejb.facade;

import com.passos.totalflex.ejb.entidade.IEntidadeBase;
import javax.ejb.Stateless;

/**
 *
 * @author clayton.kendy
 */
@Stateless(name = "EntidadeBase")
public class EntidadeBaseFacade extends AbstractFacade<IEntidadeBase> implements IFacadeLocal<IEntidadeBase> {

    public EntidadeBaseFacade() {
        super(IEntidadeBase.class);
    }
}
