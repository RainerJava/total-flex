/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.passos.totalflex.ejb.entidade;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Administrador
 */
@Entity
public class UnidadeFederativa implements Serializable, IEntidadeBase {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Size(max = 50)
    @NotNull(message = "validacao.NaoPodeSerVazia")
    private String nome;
    @NotNull(message = "Abrevia��o n�o pode ser vazia")
    @Size(max = 2, min = 2, message = "Abrevia��o deve ter duas letras obrigat�riamente")
    private String abreviacao;

    public UnidadeFederativa() {
    }

    public UnidadeFederativa(String nome, String abreviacao) {
        this.nome = nome;
        this.abreviacao = abreviacao;
    }

    public String getAbreviacao() {
        return abreviacao;
    }

    public void setAbreviacao(String abreviacao) {
        this.abreviacao = abreviacao;
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

    public String toString() {
        return this.abreviacao;
    }
}
