package com.hibernate;

import com.hibernate.Entity.Address;
import com.hibernate.Entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        Student student1 = new Student(4, "DEF", "UVW");
        System.out.println(student1);

        Address address1 = new Address();
        address1.setStreet("street1");
        address1.setCity("delhi");
        address1.setOpen(true);
        address1.setAddedDate(new Date());
        address1.setX(134);

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/main/resources/java-logo-vert-blk.png");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        byte[] data;
        try {
            data = new byte[fis.available()];
            fis.read(data);
            address1.setImage(data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(student1);
        session.save(address1);
        transaction.commit();
        session.close();
    }
}
