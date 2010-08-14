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
public class ContaPagar extends Conta {

    /**
     * Quem ira receber o valor
     */
    @NotNull
    @ManyToOne
    private Pessoa credor;

    @Override
    public Boolean isContaPagar() {
        return true;
    }

    @Override
    public Boolean isContaReceber() {
        return false;
    }

    public Pessoa getCredor() {
        return credor;
    }

    public void setCredor(Pessoa credor) {
        this.credor = credor;
    }
}
