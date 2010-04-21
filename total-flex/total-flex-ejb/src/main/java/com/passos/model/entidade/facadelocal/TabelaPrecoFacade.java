package com.passos.model.entidade.facadelocal;

import com.passos.model.entidade.TabelaPreco;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Clayton K. N. Passos
 */
@Stateless
public class TabelaPrecoFacade implements IFacadeLocal<TabelaPreco> {

    @PersistenceContext(unitName = "up-tf")
    private EntityManager em;

    @Override
    public void salvar(TabelaPreco tabelaPreco) {
        em.persist(tabelaPreco);
    }

    @Override
    public void atualizar(TabelaPreco tabelaPreco) {
        em.merge(tabelaPreco);
    }

    @Override
    public void excluir(TabelaPreco tabelaPreco) {
        em.remove(em.merge(tabelaPreco));
    }

    @Override
    public TabelaPreco find(Long id) {
        return em.find(TabelaPreco.class, id);
    }

    @Override
    public List<TabelaPreco> findAll() {
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(TabelaPreco.class));
        return em.createQuery(cq).getResultList();
    }

    @Override
    public List<TabelaPreco> findRange(int[] range) {
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(TabelaPreco.class));
        Query q = em.createQuery(cq);
        q.setMaxResults(range[1] - range[0]);
        q.setFirstResult(range[0]);
        return q.getResultList();
    }

    @Override
    public int count() {
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        Root<TabelaPreco> rt = cq.from(TabelaPreco.class);
        cq.select(em.getCriteriaBuilder().count(rt));
        Query q = em.createQuery(cq);
        return ((Long) q.getSingleResult()).intValue();
    }
}