/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.passos.totalflex.ejb.entidade;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Administrador
 */
@Entity
public class PessoaJuridica extends Pessoa implements Serializable, IEntidadeBase {

    private static final long serialVersionUID = 1L;

    @NotNull
    private String cpnj;

    public String getCpnj() {
        return cpnj;
    }

    public void setCpnj(String cpnj) {
        this.cpnj = cpnj;
    }
}
