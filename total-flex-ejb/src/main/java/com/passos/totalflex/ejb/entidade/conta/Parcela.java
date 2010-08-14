package com.passos.totalflex.ejb.entidade.conta;

import com.passos.totalflex.ejb.entidade.IEntidadeBase;
import com.passos.totalflex.ejb.entidade.exception.EntidadeException;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author clayton
 */
@Entity
public class Parcela implements IEntidadeBase {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @NotNull
    private Conta conta;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataVencimento;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataPagamento;

    private BigDecimal valorParcela;

    private BigDecimal valorPago;

    public Boolean isVencido() {
        return this.dataVencimento.getTime() <= System.currentTimeMillis();
    }

    public Long diasEmAtrazo(){
        throw new EntidadeException("entidade.metod.nao.implementado");
    }

    public BigDecimal valorDiferido() {
        return this.valorPago.subtract(this.valorParcela);
    }

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
