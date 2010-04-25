
import com.passos.model.entidade.Pessoa;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author clayton
 */
public class X {

    public static void main(String[] args) {
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("up-tf");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        Pessoa p1 = new Pessoa();
        p1.setId(2);
        em.persist(p1);

        Pessoa p2 = new Pessoa();
        p2.setId(1);
        em.persist(p2);

        tx.commit();

        em.close();
        emf.close();
    }
}
