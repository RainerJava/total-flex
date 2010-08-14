/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.passos.totalflex.ejb.entidade.exception;

/**
 *
 * @author clayton
 */
public class EntidadeException extends RuntimeException {

    public EntidadeException(Throwable cause) {
        super(cause);
    }

    public EntidadeException(String message, Throwable cause) {
        super(message, cause);
    }

    public EntidadeException(String message) {
        super(message);
    }

    public EntidadeException() {
    }
}
