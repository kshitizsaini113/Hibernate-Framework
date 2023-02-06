package com.hibernate;

import com.hibernate.Entity.Address;
import com.hibernate.Entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.openSession();

        Student student1 = (Student) session.get(Student.class, 1);
        System.out.println(student1);

        Address address1 = (Address) session.get(Address.class, 2);
        System.out.println(address1);

        session.close();
        sessionFactory.close();
    }
}
