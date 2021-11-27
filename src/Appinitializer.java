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

        /*String hql= "SELECT name FROM Owner";
        Query query = session.createQuery(hql);
        List<String> list = query.list();

        for (String s:list) {
            System.out.print(s);
        }*/

        /*String hql= "FROM  Owner c WHERE name LIKE 'Ra%'";

        List<Owner> list = session.createQuery(hql).list();

        for (Owner owner:list) {
            System.out.print(owner.getOid() + ":");
            System.out.println(owner.getName());
        }*/

        String hql = "FROM Owner o ORDER BY o.Oid DESC";
        List<Owner> list = session.createQuery(hql).list();

        for (Owner owner:list) {
            System.out.print(owner.getOid() + ":");
            System.out.println(owner.getName());
        }

        transaction.commit();

        session.close();

    }
}
