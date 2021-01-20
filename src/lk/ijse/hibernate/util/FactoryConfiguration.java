package lk.ijse.hibernate.util;

import lk.ijse.hibernate.entity.AlienOneToMany;
import lk.ijse.hibernate.entity.SpaceCraftOneToMany;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfiguration {
    private static FactoryConfiguration factoryConfiguration;
    private SessionFactory sessionFactory;

    private FactoryConfiguration(){
        Configuration configuration = new Configuration().configure()/*addAnnotatedClass(Alien.class)
                .addAnnotatedClass(SpaceCraft.class)*/
                .addAnnotatedClass(AlienOneToMany.class)
                .addAnnotatedClass(SpaceCraftOneToMany.class);
        sessionFactory = configuration.buildSessionFactory();
    }

    public static FactoryConfiguration getInstance(){
        return (factoryConfiguration  == null ) ? factoryConfiguration = new FactoryConfiguration() : factoryConfiguration;
    }

    public Session getSession(){
        return sessionFactory.openSession();
    }
}
