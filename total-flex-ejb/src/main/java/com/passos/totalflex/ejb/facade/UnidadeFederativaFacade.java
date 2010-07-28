/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.passos.totalflex.ejb.facade;

import com.passos.totalflex.ejb.entidade.UnidadeFederativa;
import javax.ejb.Stateless;

/**
 *
 * @author clayton.kendy
 */
@Stateless(name="UnidadeFederativaFacade")
public class UnidadeFederativaFacade extends AbstractFacade<UnidadeFederativa>
        implements IFacadeLocal<UnidadeFederativa> {

    public UnidadeFederativaFacade() {
        super(UnidadeFederativa.class);
    }
}
