/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.passos.model.entidade.facade;

import com.passos.model.entidade.TabelaPreco;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author clayton.kendy
 */
@Local
public interface ITabelaPrecoFacadeLocal {

    public void salvar(TabelaPreco tabelaPreco);

    public void atualizar(TabelaPreco tabelaPreco);

    public void excluir(TabelaPreco tabelaPreco);

    public TabelaPreco find(Long id);

    public List<TabelaPreco> findAll();

    public List<TabelaPreco> findRange(int[] range);

    public int count();
}
