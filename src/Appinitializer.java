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
        customer.setId("C001");
        customer.setName("Kavee");
        customer.setAddress("123/dd ");
        customer.setSalary(500000);

        Item item=new Item();
        item.setCode("I001");
        item.setDiscription("Milk");
        item.setQty(100);
        item.setUnitPrice(50.00);

        Session session = FactoryConfigeration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        session.save(customer);
        session.save(item);

        transaction.commit();

        session.close();

    }
}
