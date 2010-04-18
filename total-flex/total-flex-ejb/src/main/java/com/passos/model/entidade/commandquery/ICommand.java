/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.passos.model.entidade.commandquery;

import com.passos.model.Context;

/**
 *
 * @author clayton
 */
public interface ICommand {

    public void execute(Context ctx);

}
