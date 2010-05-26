package com.passos.totalflex.ejb.entidade;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Clayton K. N. Passos
 */
@Entity
public class Telefone extends Contato implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 3, min = 3)
    @NotNull
    private String ddd;
    @Size(max = 8, min = 8)
    private String numero;
    @NotNull
    private Boolean movel;

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public Boolean isMovel() {
        return movel;
    }

    public Boolean isMovel(Boolean isMovel) {
        return movel = isMovel;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
