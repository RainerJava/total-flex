/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.passos.totalflex.ejb.facade;

import java.util.List;

/**
 *
 * @author clayton.kendy
 */
public interface IFacade<T> {

    public void create(T E);

    public void create(List<T> entityList);

    public void edit(T E);

    public void remove(T E);

    public void remove(List<T> entityList);

    public T find(Object id);

    public List<T> findAll();

    public List<T> findRange(int[] range);

    public List<T> findRange(int first, int last);

    public int count();
}
