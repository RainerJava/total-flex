/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.passos.totalflex.ejb.facade;

import com.passos.totalflex.ejb.entidade.UnidadeFederativa;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;
import javax.naming.NamingException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author clayton
 */
public class UnidadeFederativaFacadeTest {

    private EJBContainer container;
    private Context context;
    private IFacadeLocal<UnidadeFederativa> facade;

    public UnidadeFederativaFacadeTest() {
    }

    @Before
    public void setUp() throws NamingException {
        Map properties = new HashMap();
        properties.put(EJBContainer.MODULES, new File("target/classes"));
//        properties.put("org.glassfish.ejb.embedded.glassfish.installation.root", "/Applications/NetBeans/sges-v3/glassfish");
//properties.put("javax.persistence.logging.level","FINE");

        container = EJBContainer.createEJBContainer(properties);
        context = container.getContext();
        facade = (IFacadeLocal) context.lookup("java:global/classes/UnidadeFederativaFacade");
    }

    @After
    public void tearDown() throws NamingException {
        context.close();
        container.close();
    }

    @Test
    public void testCreateUnidadeFederativa() throws NamingException {
        UnidadeFederativa uf = new UnidadeFederativa("Paraná", "PR");
        facade.create(uf);

        List<UnidadeFederativa> all = facade.findAll();

        assertEquals(1, all.size());
        assertEquals(all.get(0).getAbreviacao(), uf.getAbreviacao());
        assertEquals(all.get(0).getNome(), uf.getNome());
    }

    @Test(expected = javax.ejb.EJBException.class)
    public void testTestaConsistenciaSigla() {
        UnidadeFederativa uf = new UnidadeFederativa("Paraná", "");
        facade.create(uf);

    }

    @Test(expected = javax.ejb.EJBException.class)
    public void testTestaConsistenciaNome() {
        UnidadeFederativa uf = new UnidadeFederativa(null, "PR");
        facade.create(uf);

    }
}
