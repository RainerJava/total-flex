/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.passos.model.entidade.commandquery;

import com.passos.model.Context;
import com.passos.model.entidade.UnidadeMedida;
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

        Context ctx = new Context();
        ctx.put(ECommand.SALVAR, um);
        ums.execute(ctx);

    }

    @Override
    public void excluir(UnidadeMedida um) {
        Context ctx = new Context();
        ctx.put(ECommand.EXCLUIR, um);
        ums.execute(ctx);
    }
}
