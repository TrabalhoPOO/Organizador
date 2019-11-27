package infra;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author ht3000974
 * @author ht3000796
 */
public class ConnectionFactoryHibernate {

    private static EntityManagerFactory emf;

    public static EntityManager getEntityManager() {
        try {
            if (emf == null) {
                emf = Persistence.createEntityManagerFactory("OrganizadorPU");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return emf.createEntityManager();
    }
}
