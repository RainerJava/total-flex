package com.passos.model.entidade.facaderemote;

import com.passos.model.entidade.EntidadeBase;
import com.passos.model.entidade.UnidadeMedida;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author clayton.kendy
 */
@Remote
public interface IFacadeRemote<E extends EntidadeBase> {

    public void salvar(UnidadeMedida unidadeMedida);

    public void atualizar(UnidadeMedida unidadeMedida);

    public void excluir(UnidadeMedida unidadeMedida);

    public UnidadeMedida find(Object id);

    public List<UnidadeMedida> findAll();

    public List<UnidadeMedida> findRange(int[] range);

    public int count();
}
