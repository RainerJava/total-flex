package com.passos.totalflex.ejb.entidade.conta;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author clayton
 */
public class Parcela {

    private Long id;

    private AConta conta;

    private Date dataVencimento;

    private Date dataPagamento;

    private BigDecimal valorParcela;

    private BigDecimal valorPago;

    public Boolean isVencido(){
        return this.dataVencimento.getTime() <= System.currentTimeMillis();
    }

    public AConta getConta() {
        return conta;
    }

    public void setConta(AConta conta) {
        this.conta = conta;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public BigDecimal getValorPago() {
        return valorPago;
    }

    public void setValorPago(BigDecimal valorPago) {
        this.valorPago = valorPago;
    }


    public BigDecimal getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(BigDecimal valorParcela) {
        this.valorParcela = valorParcela;
    }
}
