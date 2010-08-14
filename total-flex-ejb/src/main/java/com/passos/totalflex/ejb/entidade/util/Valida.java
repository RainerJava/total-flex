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

    public static final Object isNullThrowException(Object entidade) {
        if (entidade == null) {
            throw new EntidadeException();
        }

        return entidade;
    }

    public static final Collection isVazioThrowException(Collection entidade) {
        isNullThrowException(entidade);

        if (entidade.size() == 0) {
            throw new EntidadeException();
        }
        return entidade;

    }
}
