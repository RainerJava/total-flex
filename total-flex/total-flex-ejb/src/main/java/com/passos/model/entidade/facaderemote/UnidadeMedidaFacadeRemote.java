package com.passos.model.entidade.facaderemote;

import com.passos.model.entidade.UnidadeMedida;
import com.passos.model.entidade.facadelocal.UnidadeMedidaFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author clayton
 */
@Stateless
public class UnidadeMedidaFacadeRemote implements IFacadeRemote<UnidadeMedida> {

    @EJB
    private UnidadeMedidaFacadeLocal unidadeMedidaFacadeLocal;

    @Override
    public void salvar(UnidadeMedida um) {
        System.out.println("salvando " + um);
        //    unidadeMedidaFacadeLocal.salvar(um);
    }

    @Override
    public void excluir(UnidadeMedida um) {
        unidadeMedidaFacadeLocal.excluir(um);
    }

    @Override
    public void atualizar(UnidadeMedida unidadeMedida) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public UnidadeMedida find(Object id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<UnidadeMedida> findAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<UnidadeMedida> findRange(int[] range) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int count() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
