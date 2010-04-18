/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.passos.model.entidade.commandquery;

import com.passos.model.Context;
import java.util.Collection;

/**
 *
 * @author clayton
 */
public interface IQuery {
    public Collection execute(Context ctx);

}
