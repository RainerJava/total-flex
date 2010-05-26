package com.passos.totalflex.ejb.facadelocal;


import com.passos.totalflex.ejb.entidade.UnidadeMedida;
import java.util.List;
import javax.ejb.EJB;
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
@Stateless(name="UnidadeMedidaFacadeLocal")
@EJB()
public class UnidadeMedidaFacadeLocal implements IFacadeLocal<UnidadeMedida> {
    @PersistenceContext(unitName = "db-tf")
    private EntityManager em;

    @Override
    public void salvar(UnidadeMedida unidadeMedida) {
        em.persist(unidadeMedida);
    }

    @Override
    public void atualizar(UnidadeMedida unidadeMedida) {
        em.merge(unidadeMedida);
    }

    @Override
    public void excluir(UnidadeMedida unidadeMedida) {
        em.remove(em.merge(unidadeMedida));
    }

    @Override
    public UnidadeMedida find(Long id) {
        return em.find(UnidadeMedida.class, id);
    }

    @Override
    public List<UnidadeMedida> findAll() {
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(UnidadeMedida.class));
        return em.createQuery(cq).getResultList();
    }

    @Override
    public List<UnidadeMedida> findRange(int[] range) {
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(UnidadeMedida.class));
        Query q = em.createQuery(cq);
        q.setMaxResults(range[1] - range[0]);
        q.setFirstResult(range[0]);
        return q.getResultList();
    }

    @Override
    public int count() {
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        Root<UnidadeMedida> rt = cq.from(UnidadeMedida.class);
        cq.select(em.getCriteriaBuilder().count(rt));
        Query q = em.createQuery(cq);
        return ((Long) q.getSingleResult()).intValue();
    }

}
