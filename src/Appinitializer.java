import entity.Customer;
import entity.Item;
import javafx.application.Application;
import javafx.stage.Stage;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfigeration;

public class Appinitializer{

    public static void main(String[] args) {
        Customer customer=new Customer();
        customer.setId("C002");
        customer.setName("Rasi");
        customer.setAddress("12/d ");
        customer.setSalary(500000);

        Item item=new Item();
        item.setCode("I002");
        item.setDiscription("Cake");
        item.setQty(100);
        item.setUnitPrice(250.00);

        Session session = FactoryConfigeration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        // get customer
        Customer c1 = session.get(Customer.class, "C002");
        System.out.println(c1);
        System.out.println(c1.getAddress());

       /* session.save(customer);
        session.save(item);*/

        transaction.commit();

        session.close();

    }
}
