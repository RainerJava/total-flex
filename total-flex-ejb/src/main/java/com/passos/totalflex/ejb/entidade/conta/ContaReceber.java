/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.passos.totalflex.ejb.entidade.conta;

import com.passos.totalflex.ejb.entidade.Pessoa;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

/**
 *
 * @author clayton
 */
@Entity
public class ContaReceber extends Conta {

    @NotNull
    @ManyToOne
    private Pessoa devedor;

    @Override
    public Boolean isContaPagar() {
        return false;
    }

    @Override
    public Boolean isContaReceber() {
        return true;
    }

    public Pessoa getDevedor() {
        return devedor;
    }

    public void setDevedor(Pessoa devedor) {
        this.devedor = devedor;
    }
}
