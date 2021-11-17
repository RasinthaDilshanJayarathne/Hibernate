import embeded.Name;
import entity.*;
import javafx.application.Application;
import javafx.stage.Stage;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfigeration;

public class Appinitializer{

    public static void main(String[] args) {

        /*Lectuer lectuer = new Lectuer();
        lectuer.setlId("L001");
        lectuer.setName("Saman");

        Subject subject = new Subject();
        subject.setsId("S001");
        subject.setName("Java");

        Subject subject1 = new Subject();
        subject1.setsId("S002");
        subject1.setName("DataBase");

        lectuer.getSubjectList().add(subject);
        lectuer.getSubjectList().add(subject1);

        subject.getLectuerList().add(lectuer);
        subject1.getLectuerList().add(lectuer);*/

        Lectuer lectuer = new Lectuer();
        lectuer.setlId("L002");
        lectuer.setName("Ranjith");

        Lectuer lectuer1 = new Lectuer();
        lectuer1.setlId("L003");
        lectuer1.setName("Bandara");


        Session session = FactoryConfigeration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        Subject DataBase = session.get(Subject.class, "S002");
        lectuer.getSubjectList().add(DataBase);
        lectuer1.getSubjectList().add(DataBase);

        session.save(lectuer);
        session.save(lectuer1);

        transaction.commit();

        session.close();

    }
}
