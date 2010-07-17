/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.passos.totalflex.ejb.entidade;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Clayton K. N. Passos
 */
@Entity
public class TabelaPreco implements Serializable, EntidadeBase {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @NotNull
    private String nome;
    private String descricao;
    @ManyToMany(mappedBy = "tabelaPrecoSet")
    private Set<Produto> produtoSet;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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

    public Set<Produto> getProdutoSet() {
        return produtoSet;
    }

    public void setProdutoSet(Set<Produto> produtoSet) {
        this.produtoSet = produtoSet;
    }
}
