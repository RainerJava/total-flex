/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.passos.totalflex.ejb.entidade.util;

import com.passos.totalflex.ejb.entidade.exception.EntidadeException;
import java.util.Collection;

/**
 *
 * @author clayton
 */
public  class Valida {

    public static final Object isNull(Object entidade) {
        if (entidade == null) {
            throw new EntidadeException();
        }

        return entidade;
    }

    public static final Collection isVazio(Collection entidades) {
        isNull(entidades);

        if (entidades.size() == 0) {
            throw new EntidadeException();
        }
        return entidades;

    }
}
