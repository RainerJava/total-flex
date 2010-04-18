/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.passos.model.entidade.commandquery;

import com.passos.model.entidade.UnidadeMedida;
import javax.ejb.Remote;

/**
 *
 * @author clayton
 */
@Remote
public interface IUnidadeMedidaLocal {

    public void excluir(UnidadeMedida um);

    public void salvar(UnidadeMedida um);
}
