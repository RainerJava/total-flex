/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.passos.totalflex.ejb.entidade.conta;

import com.passos.totalflex.ejb.entidade.IEntidadeBase;
import com.passos.totalflex.ejb.entidade.IVendedor;
import com.passos.totalflex.ejb.entidade.contrato.Contrato;
import com.passos.totalflex.ejb.entidade.Pessoa;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 *
 * @author clayton
 */
public class Conta implements Serializable, IEntidadeBase {

    private Long id;

    private IVendedor vendedor;

    private Pessoa cliente;

    private Contrato contrato;

    private FormaPagamento formaPagamento;

    private List<Parcela> parcelaList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
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

    public IVendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(IVendedor vendedor) {
        this.vendedor = vendedor;
    }

    /**
     * 
     */
    public BigDecimal valorTotal;

    public Date dataCriacao;

    public boolean isGeradoAutomatico() {

        if (this.contrato == null) {
            return false;
        }
        return true;

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
}
