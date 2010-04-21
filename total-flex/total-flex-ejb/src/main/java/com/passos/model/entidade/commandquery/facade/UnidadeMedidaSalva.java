package com.passos.model.entidade.commandquery.facade;

import com.passos.model.entidade.EntidadeBase;
import com.passos.model.entidade.commandquery.ECommand;
import com.passos.model.entidade.commandquery.ICommandLocal;
import java.util.Map;

/**
 * chave: ECommand.SALVAR
 *
 * @author clayton
 */
public class UnidadeMedidaSalva implements ICommandLocal{

    @Override
    public void execute(Map<ECommand, EntidadeBase> map) {
        System.out.println("Salvando: " + map.get(ECommand.SALVAR));
    }

}
