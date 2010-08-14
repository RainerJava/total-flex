package com.passos.totalflex.ejb.entidade.contrato;

import com.passos.totalflex.ejb.entidade.IEntidadeBase;
import com.passos.totalflex.ejb.entidade.Pessoa;
import com.passos.totalflex.ejb.entidade.conta.ContaPagar;
import com.passos.totalflex.ejb.entidade.conta.ContaReceber;
import com.passos.totalflex.ejb.entidade.exception.EntidadeException;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author clayton
 */
@Entity
public class Contrato implements Serializable, IEntidadeBase {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Temporal(TemporalType.DATE)
    private Date dataCriacao;

    @NotNull
    @ManyToOne
    private Pessoa comprador;

    @NotNull
    @ManyToOne
    private Pessoa vendedor;

    @OneToMany(mappedBy = "contrato")
    private List<ContaPagar> contaPagarList;

    @OneToMany(mappedBy = "contrato")
    private List<ContaReceber> contaReceberList;

    public Boolean isContratoCompra() {
        throw new EntidadeException("entidade.metodo.nao.implementado");
    }

    public Boolean isContratoVenda() {
        throw new EntidadeException("entidade.metodo.nao.implementado");
    }

    public Pessoa getComprador() {
        return comprador;
    }

    public void setComprador(Pessoa comprador) {
        this.comprador = comprador;
    }

    public Pessoa getVendedor() {
        return vendedor;
    }

    public void setVendedor(Pessoa vendedor) {
        this.vendedor = vendedor;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<ContaPagar> getContaPagarList() {
        return contaPagarList;
    }

    public void setContaPagarList(List<ContaPagar> contaPagarList) {
        this.contaPagarList = contaPagarList;
    }

    public List<ContaReceber> getContaReceberList() {
        return contaReceberList;
    }

    public void setContaReceberList(List<ContaReceber> contaReceberList) {
        if (contaReceberList == null) {
            throw new EntidadeException();
        }

        this.contaReceberList = contaReceberList;
    }
}
