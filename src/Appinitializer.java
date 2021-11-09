import entity.Customer;
import javafx.application.Application;
import javafx.stage.Stage;

public class Appinitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Customer customer=new Customer();
        customer.getId("C001");
        customer.getTitle("Mis");
        customer.getName("Nimali");
        customer.getAddress("123/b ");
        customer.getCity("Galle");
        customer.getProvince("South");
        customer.getPostalCode("1234");


    }
}
