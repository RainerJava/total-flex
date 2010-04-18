/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.passos.model.entidade;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author clayton
 */
@Entity
public class TabelaPreco implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    @OneToMany(mappedBy = "tabelaPreco")
    private List<ProdutoTabelaPreco> produtoTabelaPrecoList;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<ProdutoTabelaPreco> getProdutoTabelaPrecoList() {
        return produtoTabelaPrecoList;
    }

    public void setProdutoTabelaPrecoList(List<ProdutoTabelaPreco> produtoTabelaPrecoList) {
        this.produtoTabelaPrecoList = produtoTabelaPrecoList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return "com.passos.model.entidade.TabelaPreco[id=" + id + "]";
    }

}
