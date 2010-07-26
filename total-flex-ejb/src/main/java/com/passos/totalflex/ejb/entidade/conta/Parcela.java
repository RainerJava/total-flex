package com.passos.totalflex.ejb.entidade.conta;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author clayton
 */
public class Parcela {

    private Long id;

    private Conta conta;

    private Date dataVencimento;

    private BigDecimal valorParcela;

    private Long numeroParcela;

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
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

    public Long getNumeroParcela() {
        return numeroParcela;
    }

    public void setNumeroParcela(Long numeroParcela) {
        this.numeroParcela = numeroParcela;
    }

    public BigDecimal getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(BigDecimal valorParcela) {
        this.valorParcela = valorParcela;
    }
}
