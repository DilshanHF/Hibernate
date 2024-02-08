import lk.ijse.config.FactoryConfiguration;
import lk.ijse.entity.Laptop;
import lk.ijse.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getFactoryConfiguration().getSession();
        Transaction transaction = session.beginTransaction();

        Laptop l1 = new Laptop(1,"dell",null);
        Laptop l2 = new Laptop(2,"dell",null);

        List<Laptop> laptops = List.of(l1,l2);

        Student s1 = new Student(1001,"kamal","panadura",laptops);
        Student s2 = new Student(1002,"namal","panadura",laptops);

        List<Student> students = List.of(s1,s2);

        l1.setStudents(students);
        l2.setStudents(students);

        session.save(l1);
        session.save(l2);
        session.save(s1);
        session.save(s2);


        transaction.commit();
        session.close();




    }
}
