/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.totalflex.model.entidade;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author clayton
 */
@Entity
public class UnidadeMedida implements Serializable, EntidadeBase {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    @Size(max = 255)
    private String nome;
    
    @NotNull
    @Size(max = 10)
    private String abreviatura;

    protected  UnidadeMedida() {
    }

    public UnidadeMedida(@NotNull String nome, @NotNull String abreviatura) {
        this.nome = nome;
        this.abreviatura = abreviatura;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "...entidade.UnidadeMedida[id=" + id + "]";
    }
}
