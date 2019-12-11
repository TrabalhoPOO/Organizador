package infra;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author ht3000974
 * @author ht3000796
 */
public class ConnectionFactoryHibernate {

    private static EntityManagerFactory emf = null;
    private static EntityManager em = null;

    public static EntityManager getEntityManager() {
        try {
            if (emf == null) {
                emf = Persistence.createEntityManagerFactory("OrganizadorPU");
                em = emf.createEntityManager();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return em;
    }
    
    
}
