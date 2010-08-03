/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.passos.totalflex.ejb.entidade.contrato;

/**
 *
 * @author clayton
 */
public class ContratoVenda extends AContrato {

    @Override
    public Boolean isContratoVenda() {
        return true;
    }

    @Override
    public Boolean isContratoCompra() {
        return false;
    }
}

