package com.passos.totalflex.ejb.entidade.conta;

import com.passos.totalflex.ejb.entidade.IEntidadeBase;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Cheque, Boleto, Nota Promissória
 * 
 * TipoForma de pagamento
 *
 * @author clayton
 */
@Entity
public class FormaPagamento implements Serializable, IEntidadeBase {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Size(max = 255)
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
