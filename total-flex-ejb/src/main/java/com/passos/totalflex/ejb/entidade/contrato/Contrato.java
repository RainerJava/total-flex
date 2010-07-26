package com.passos.totalflex.ejb.entidade.contrato;

import com.passos.totalflex.ejb.entidade.IEntidadeBase;
import com.passos.totalflex.ejb.entidade.Pessoa;
import com.passos.totalflex.ejb.entidade.IVendedor;
import com.passos.totalflex.ejb.entidade.conta.Conta;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author clayton
 */
public class Contrato implements Serializable, IEntidadeBase {

    private Long id;

    private Pessoa pessoa;

    private IVendedor IVendedor;

    private Date dataCriacao;

    private Conta conta;

    private Servico servico;

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
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

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public IVendedor getIVendedor() {
        return IVendedor;
    }

    public void setIVendedor(IVendedor IVendedor) {
        this.IVendedor = IVendedor;
    }
}
