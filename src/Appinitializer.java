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

        /*String hql = "FROM Owner o ORDER BY o.Oid DESC";
        List<Owner> list = session.createQuery(hql).list();

        for (Owner owner:list) {
            System.out.print(owner.getOid() + ":");
            System.out.println(owner.getName());
        }*/
/*
        String name = "Rasi";
        String hql = "FROM Owner WHERE name = :owner_name";
        Query query = session.createQuery(hql);
        query.setParameter("owner_name",name);
        List<Owner> list = query.list();

        for (Owner owner :list) {
            System.out.print(owner.getOid() + ":");
            System.out.println(owner.getName());
        }*/

        /*String name = "Somapala";
        String id = "O002";
        String hql = "UPDATE Owner SET name = :owner_name WHERE Oid = :owner_id";
        Query query = session.createQuery(hql);
        query.setParameter("owner_id",id);
        query.setParameter("owner_name",name);

        int i = query.executeUpdate();

        if (i>0){
            System.out.println("Hureeeeeee!!!");
        }else{
            System.out.println("Error");
        }*/

       /* String id ="O002";
        String hql = "DELETE FROM Owner WHERE Oid = :owner_id";

        Query query = session.createQuery(hql);
        query.setParameter("owner_id",id);

        if (query.executeUpdate() > 0){
            System.out.println("Hureeeeeee!!!");
        }else {
            System.out.println("Error");
        }*/

        String hql ="SELECT o.Oid, p.name FROM Owner o INNER  JOIN Pet p ON o.Oid = p.owner_Oid";
        List<Object[]> list = session.createQuery(hql).list();

        for (Object[] objects :list) {
            System.out.println(objects[0] + ":" + objects[1] + ":" + objects[2]);
        }

        transaction.commit();

        session.close();

    }
}
