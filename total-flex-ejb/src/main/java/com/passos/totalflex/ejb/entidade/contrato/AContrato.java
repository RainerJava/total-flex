package com.passos.totalflex.ejb.entidade.contrato;

import com.passos.totalflex.ejb.entidade.IEntidadeBase;
import com.passos.totalflex.ejb.entidade.Pessoa;
import com.passos.totalflex.ejb.entidade.conta.ContaPagar;
import com.passos.totalflex.ejb.entidade.conta.ContaReceber;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author clayton
 */
public abstract class AContrato implements Serializable, IEntidadeBase {

    private Long id;

    private Pessoa comprador;

    private Pessoa vendedor;

    private Date dataCriacao;

    private List<ContaPagar> contaPagarList;

    private List<ContaReceber> contaReceberList;

    /**
     * Serviço comercializado
     */
    private Servico servico;

    public abstract Boolean isContratoCompra();

    public abstract Boolean isContratoVenda();

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

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
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
        this.contaReceberList = contaReceberList;
    }
}
