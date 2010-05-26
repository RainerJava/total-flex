/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.passos.totalflex.ejb.entidade;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Clayton
 */
@Entity
public class PessoaFisica extends Pessoa implements Serializable, EntidadeBase {

    private static final long serialVersionUID = 1L;

    @Size(max = 50)
    @NotNull
    private String nome;
    @Size(max = 8, min = 8)
    private String rg;
    @Size(max = 11, min = 11)
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }


}
