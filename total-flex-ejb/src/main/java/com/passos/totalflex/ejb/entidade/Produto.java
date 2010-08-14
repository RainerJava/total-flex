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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author clayton
 */
@Entity
public class Produto implements Serializable, IEntidadeBase {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Size(max = 255, min = 1)
    private String nome;

    @Size(max = 255)
    private String descricao;

    /**
     * Reservado para armazenar o código do fornecedor do produto
     */
    @Size(max = 100)
    private String codigoFornecedor;

    @ManyToMany
    @JoinTable(name = "Produto_TabelaPreco", joinColumns = {
        @JoinColumn(name = "idProduto")}, inverseJoinColumns = {
        @JoinColumn(name = "idTabelaPreco")})
    private Set<TabelaPreco> tabelaPrecoSet;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigoFornecedor(String codigoFornecedor) {
        this.codigoFornecedor = codigoFornecedor;
    }

    public String getCodigoFornecedor() {
        return codigoFornecedor;
    }

    public Set<TabelaPreco> getTabelaPrecoSet() {
        return tabelaPrecoSet;
    }

    public void setTabelaPrecoSet(Set<TabelaPreco> tabelaPrecoSet) {
        this.tabelaPrecoSet = tabelaPrecoSet;

    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
