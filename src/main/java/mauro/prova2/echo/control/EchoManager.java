package mauro.prova2.echo.control;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mauro.prova2.echo.entity.Echo;

public class EchoManager {
    @PersistenceContext
    EntityManager em;

    public Echo find(String message) {
        return em.find(Echo.class, message);
    }

    public void insert(Echo echo) {
        em.persist(echo);
    }
}
