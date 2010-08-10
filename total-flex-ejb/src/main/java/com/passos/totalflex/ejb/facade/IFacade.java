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

    void create(T E);

    void create(List<T> entityList);

    void edit(T E);

    void remove(T E);

    void remove(List<T> entityList);

    T find(Object id);

    List<T> findAll();

    List<T> findRange(int[] range);

    List<T> findRange(int first, int last);

    int count();
}
