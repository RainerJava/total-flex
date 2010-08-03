/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.passos.totalflex.ejb.entidade.conta;

import com.passos.totalflex.ejb.entidade.IEntidadeBase;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 *
 * @author clayton
 */
public abstract class AConta implements Serializable, IEntidadeBase {

    private Long id;

    private FormaPagamento formaPagamento;

    private List<Parcela> parcelaList;

    public BigDecimal valorTotal;

    public Date dataCriacao;

    public abstract Boolean isContaPagar();

    public abstract Boolean isContaReceber();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public List<Parcela> getParcelaList() {
        return parcelaList;
    }

    public void setParcelaList(List<Parcela> parcelaList) {
        this.parcelaList = parcelaList;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public boolean isParcelado() {
        if (this.parcelaList != null && this.parcelaList.size() != 0) {
            return true;
        }

        return false;
    }

    public Long quantidadeParcelas() {
        if (this.isParcelado()) {
            return new Long(this.parcelaList.size());
        }
        return new Long(0);
    }

    protected List<Parcela> geraParcela() {
        return parcelaList;
    }

    public Boolean isVencido() {
        for (Parcela parcela : getParcelaList()) {
            if (parcela.isVencido()) {
                return true;
            }
        }

        return false;
    }
}
