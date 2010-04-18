/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.passos.model.entidade.commandquery;

import com.passos.model.Context;

/**
 * chave: ECommand.SALVAR
 *
 * @author clayton
 */
public class UnidadeMedidaSalva implements ICommandLocal{

    @Override
    public void execute(Context ctx) {
        System.out.println("Salvando " + ctx.get(ECommand.SALVAR));

    }

}
