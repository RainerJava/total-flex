package com.passos.totalflex.ejb.entidade.conta;

import com.passos.totalflex.ejb.entidade.IEntidadeBase;
import com.passos.totalflex.ejb.entidade.Produto;
import com.passos.totalflex.ejb.entidade.contrato.Contrato;
import com.passos.totalflex.ejb.entidade.exception.EntidadeException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author clayton
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Conta implements Serializable, IEntidadeBase {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private BigDecimal valorTotal;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;

    @NotNull
    @ManyToOne
    private FormaPagamento formaPagamento;

    @NotNull
    @ManyToOne
    private Contrato contrato;

    @NotNull
    @OneToMany(mappedBy = "conta")
//    @Size(min = 1)
    private List<Parcela> parcelaList;

    private List<Produto> produtoList;

    public Boolean isContaPagar() {
        throw new EntidadeException("entidade.metodo.nao.implementado");
    }

    public Boolean isContaReceber() {
        throw new EntidadeException("entidade.metodo.nao.implementado");
    }

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
        Integer size = this.parcelaList.size();

        if (size == null || size == 0) {
            throw new EntidadeException("entidade.inconsistente");
        }

        if (size != 1 && size != 0) {
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

    public Boolean isVencido() {
        for (Parcela parcela : getParcelaList()) {
            if (parcela.isVencido()) {
                return true;
            }
        }

        return false;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public List<Produto> getProdutoList() {
        return produtoList;
    }

    public void setProdutoList(List<Produto> produtoList) {
        this.produtoList = produtoList;
    }
   
}
