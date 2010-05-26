/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.passos.totalflex.ejb.facadelocal;

import com.passos.totalflex.ejb.entidade.EntidadeBase;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author clayton.kendy
 */
@Local
public interface IFacadeLocal<E extends EntidadeBase> {

    public void salvar(E entidade);

    public void atualizar(E entidade);

    public void excluir(E entidade);

    public E find(Long id);

    public List<E> findAll();

    public List<E> findRange(int[] range);

    public int count();
}
