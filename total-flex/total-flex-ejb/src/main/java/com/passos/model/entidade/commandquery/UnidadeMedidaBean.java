/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.passos.model.entidade.commandquery;

import com.passos.model.entidade.EntidadeBase;
import com.passos.model.entidade.UnidadeMedida;
import java.util.HashMap;
import java.util.Map;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author clayton
 */
@Stateless
public class UnidadeMedidaBean implements IUnidadeMedidaLocal {

    @EJB
    private UnidadeMedidaSalva ums;

    @Override
    public void salvar(UnidadeMedida um) {

        Map<ECommand, EntidadeBase> map = new HashMap<ECommand, EntidadeBase>();
        map.put(ECommand.SALVAR, um);
        ums.execute(map);

    }

    @Override
    public void excluir(UnidadeMedida um) {
        Map<ECommand, EntidadeBase> map = new HashMap<ECommand, EntidadeBase>();
        map.put(ECommand.EXCLUIR, um);
        ums.execute(map);
    }
}
