package com.passos.totalflex.ejb.facade;

import java.util.Iterator;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Abstrai implementações dos métodos padrões que são utilizados para manipular objetos persistentes
 * @author clayton.kendy
 */
public abstract class AbstractFacade<T> implements IFacade<T> {

    private Class<T> entityClass;

    @PersistenceContext(unitName = "db-tf")
    private EntityManager em;

    public  AbstractFacade(Class<T> entityClass) {
        this.setEntityClass(entityClass);
    }

    private void setEntityClass(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    protected EntityManager getEntityManager() {
        return em;
    }

    @Override
    public void create(T entity) {
        getEntityManager().persist(entity);
    }

    @Override
    public void create(List<T> entitytList) {
        for (Iterator<T> it = entitytList.iterator(); it.hasNext();) {
            T entity = it.next();
            this.create(entity);
        }
    }

    @Override
    public void edit(T entity) {
        getEntityManager().merge(entity);
    }

    @Override
    public void remove(T entity) {
        getEntityManager().remove(getEntityManager().merge(entity));
    }

    @Override
    public void remove(List<T> entityList) {
        for (Iterator<T> it = entityList.iterator(); it.hasNext();) {
            T entity = it.next();
            this.remove(entity);
        }
    }

    @Override
    public T find(Object id) {
        return getEntityManager().find(entityClass, id);
    }

    @Override
    public List<T> findAll() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        return getEntityManager().createQuery(cq).getResultList();
    }

    @Override
    public List<T> findRange(int[] range) {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        q.setMaxResults(range[1] - range[0]);
        q.setFirstResult(range[0]);
        return q.getResultList();
    }

    @Override
    public List<T> findRange(int first, int last) {
        int range[] = {first, last};
        return findRange(range);
    }

    @Override
    public int count() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        javax.persistence.criteria.Root<T> rt = cq.from(entityClass);
        cq.select(getEntityManager().getCriteriaBuilder().count(rt));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        return ((Long) q.getSingleResult()).intValue();
    }
}
