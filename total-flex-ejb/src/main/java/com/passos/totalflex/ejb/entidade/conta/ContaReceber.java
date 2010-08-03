/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.passos.totalflex.ejb.entidade.conta;

import com.passos.totalflex.ejb.entidade.contrato.AContrato;

/**
 *
 * @author clayton
 */
public class ContaReceber extends AConta {

    private AContrato contrato;

    @Override
    public Boolean isContaPagar() {
        return false;
    }

    @Override
    public Boolean isContaReceber() {
        return true;
    }

 
}
