/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.passos.model.entidade.commandquery;

import com.passos.model.entidade.EntidadeBase;
import java.util.Map;

/**
 * chave: ECommand.SALVAR
 *
 * @author clayton
 */
public class UnidadeMedidaSalva implements ICommandLocal{

    @Override
    public void execute(Map<ECommand, EntidadeBase> map) {
        System.out.println("Salvando " + map.get(ECommand.SALVAR));

    }

}
