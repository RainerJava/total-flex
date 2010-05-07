/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.totalflex.model.entidade;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author clayton
 */
@Entity
public class Produto implements Serializable, EntidadeBase {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    @Size(max = 255)
    private String nome;

    @OneToMany(mappedBy = "produto")
    private List<ProdutoTabelaPreco> produtoTabelaPrecoList;

    public List<ProdutoTabelaPreco> getProdutoTabelaPrecoList() {
        return produtoTabelaPrecoList;
    }

    public void setProdutoTabelaPrecoList(List<ProdutoTabelaPreco> produtoTabelaPrecoList) {
        this.produtoTabelaPrecoList = produtoTabelaPrecoList;
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
        return "com.passos.model.entidade.Produto[id=" + id + "]";
    }
}
