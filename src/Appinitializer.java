import embeded.Name;
import entity.Animal;
import entity.Customer;
import entity.Item;
import javafx.application.Application;
import javafx.stage.Stage;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfigeration;

public class Appinitializer{

    public static void main(String[] args) {

        Session session = FactoryConfigeration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        // get customer
        /*Customer c1 = session.get(Customer.class, "C002");
        System.out.println(c1);
        System.out.println(c1.getAddress());*/


        transaction.commit();

        session.close();

    }
}
