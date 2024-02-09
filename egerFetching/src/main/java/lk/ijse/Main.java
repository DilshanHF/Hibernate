package lk.ijse;

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

        Student s = session.get(Student.class,1);
        System.out.println(s);



        transaction.commit();
        session.close();
    }
}
