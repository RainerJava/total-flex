/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.passos.totalflex.ejb.entidade.contrato;

import com.passos.totalflex.ejb.entidade.IEntidadeBase;
import java.io.Serializable;

/**
 *
 * @author clayton
 */
public class Servico implements Serializable, IEntidadeBase {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
