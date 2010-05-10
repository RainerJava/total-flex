/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.totalflex.model.entidade;

import java.io.Serializable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author Administrador
 */
@Entity
public class PessoaJuridica extends Pessoa implements Serializable, EntidadeBase {

    private static final long serialVersionUID = 1L;
    private String cpnj;

    public String getCpnj() {
        return cpnj;
    }

    public void setCpnj(String cpnj) {
        this.cpnj = cpnj;
    }
}
