import embeded.Name;
import entity.*;
import javafx.application.Application;
import javafx.stage.Stage;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import util.FactoryConfigeration;

import java.util.List;

public class Appinitializer{

    public static void main(String[] args) {



        Session session = FactoryConfigeration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        String hql= "FROM Owner";
        Query query = session.createQuery(hql);
        List<Owner> list = query.list();

        for (Owner owner:list) {
            System.out.println(owner.getOid());
            System.out.println(owner.getName());
        }

        transaction.commit();

        session.close();

    }
}
