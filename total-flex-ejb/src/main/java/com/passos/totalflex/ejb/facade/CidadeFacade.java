/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.passos.totalflex.ejb.facade;

import com.passos.totalflex.ejb.entidade.Cidade;
import javax.ejb.Stateless;

/**
 *
 * @author clayton.kendy
 */
@Stateless(name = "EntidadeBase")
public class CidadeFacade extends AbstractFacade<Cidade> implements IFacadeLocal<Cidade> {

    public CidadeFacade() {
        super(Cidade.class);
    }
}
