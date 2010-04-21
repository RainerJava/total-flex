package com.passos.model.entidade.commandquery.facade;

import com.passos.model.entidade.EntidadeBase;
import com.passos.model.entidade.UnidadeMedida;
import com.passos.model.entidade.commandquery.ECommand;
import java.util.HashMap;
import java.util.Map;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author clayton
 */
@Stateless
public class UnidadeMedidaFacade implements IUnidadeMedidaFacadeRemote {

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
