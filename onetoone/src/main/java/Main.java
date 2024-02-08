import lk.ijse.config.FactoryConfiguration;
import lk.ijse.entity.Laptop;
import lk.ijse.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {

    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        laptop.setLid(1001);
        laptop.setModel("Hp");

        Student student = new Student();
        student.setId(7005);
        student.setName("Dilshan");
        student.setAddress("Panadura");
        student.setLaptop(laptop);

        Session session = FactoryConfiguration.getFactoryConfiguration().getSession();
        Transaction transaction = session.beginTransaction();

        session.save(student);
        session.save(laptop);

        transaction.commit();
        session.close();

    }
}
