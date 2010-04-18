/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.passos.model.entidade.commandquery;

import com.passos.model.Context;
import javax.ejb.Local;

/**
 *
 * @author clayton
 */
@Local
public interface ICommandLocal {

    public void execute(Context ctx);
}
