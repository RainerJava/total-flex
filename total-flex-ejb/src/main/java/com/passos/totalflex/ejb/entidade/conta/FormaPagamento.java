package com.passos.totalflex.ejb.entidade.conta;

/**
 * Cheque, Boleto, Nota Promissória
 *
 * @author clayton
 */
public class FormaPagamento {

    private Long id;

    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
}
