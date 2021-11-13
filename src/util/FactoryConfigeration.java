package util;

import entity.Customer;
import entity.Item;
import entity.Passport;
import entity.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfigeration {
    private static FactoryConfigeration factoryConfigeration;
    private SessionFactory sessionFactory;

    private FactoryConfigeration(){
        Configuration configuration = new Configuration().configure().addAnnotatedClass(Passport.class).addAnnotatedClass(Person.class);
        sessionFactory=configuration.buildSessionFactory();

    }
    public static FactoryConfigeration getInstance(){
        return (factoryConfigeration==null)? factoryConfigeration=new FactoryConfigeration() : factoryConfigeration;
    }

    public Session getSession(){
        return sessionFactory.openSession();
    }
}
