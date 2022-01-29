package manager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public interface DBController {

    void open();

    void close();

    EntityManagerFactory getEntityManagerFactory();

    EntityManager getManager();

    EntityTransaction getTransaction();


}
