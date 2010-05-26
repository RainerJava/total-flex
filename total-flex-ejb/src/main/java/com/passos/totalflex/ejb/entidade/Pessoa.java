package com.passos.totalflex.ejb.entidade;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

/**
 * @author Clayton K. N. Passos
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED) //UMA TABELA POR CLASSE
public class Pessoa implements Serializable, EntidadeBase {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private Long id;
    private Boolean excluido;
    /**
     * Endereço de cobrança, endereço de correspondência
     */
    @OneToMany
    @JoinColumn(name = "idPessoa")
    private Set<Endereco> enderecoSet;
    @OneToMany
    @JoinColumn(name = "idPessoa")
    private Set<Telefone> telefoneSet;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setId(int id) {
        this.id = new Long(id);
    }

    public Boolean isExcluido() {
        return excluido;
    }

    public Boolean isExcluido(Boolean isExcluido) {
        return excluido = isExcluido;
    }

    public Set<Endereco> getEnderecoSet() {
        return enderecoSet;
    }

    public void setEnderecoSet(Set<Endereco> enderecoSet) {
        this.enderecoSet = enderecoSet;
    }

    public Set<Endereco> addEndereco(Endereco endereco) {
        if (this.enderecoSet == null) {
            this.enderecoSet = new HashSet<Endereco>();
        }
        this.enderecoSet.add(endereco);

        return this.enderecoSet;
    }

    public Set<Telefone> getTelefoneSet() {
        return telefoneSet;
    }

    public void setTelefoneSet(Set<Telefone> telefoneSet) {
        this.telefoneSet = telefoneSet;
    }

    public Set<Telefone> addTelefone(Telefone telefone) {
        if (this.telefoneSet == null) {
            this.telefoneSet = new HashSet<Telefone>();
        }
        this.telefoneSet.add(telefone);
        return this.telefoneSet;
    }
}
