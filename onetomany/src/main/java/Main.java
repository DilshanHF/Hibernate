import lk.ijse.config.FactoryConfiguration;
import lk.ijse.entity.Laptop;
import lk.ijse.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

       Laptop laptop1 = new Laptop();
       laptop1.setLid(5505);
       laptop1.setModel("mac");

       Laptop laptop2 = new Laptop();
       laptop2.setLid(2);
       laptop2.setModel("mac");

        List<Laptop>laptopsList = new ArrayList<>();
        laptopsList.add(laptop1);
        laptopsList.add(laptop2);

        Student student = new Student();
        student.setId(1001);
        student.setName("dilshan");
        student.setAddress("galle");
        student.setLaptop(laptopsList);




        Session session = FactoryConfiguration.getFactoryConfiguration().getSession();
        Transaction transaction = session.beginTransaction();

        session.save(laptop1);
        session.save(laptop2);
        session.save(student);


        transaction.commit();
        session.close();
    }
}
