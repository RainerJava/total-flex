package com.passos.totalflex.ejb.entidade;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author clayton
 */
@Entity
public class UnidadeMedida implements Serializable, IEntidadeBase {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    @Size(max = 255)
    private String nome;
    @NotNull
    @Size(max = 2)
    private String abreviacao;

    protected UnidadeMedida() {
    }

    public UnidadeMedida(@NotNull String nome, @NotNull @Size(max = 2) String abreviacao) {
        this.nome = nome;
        this.abreviacao = abreviacao;
    }

    public String getAbreviacao() {
        return abreviacao;
    }

    public void setAbreviacao(@NotNull @Size(max = 2) String abreviacao) {
        this.abreviacao = abreviacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return this.getAbreviacao();
    }
}
