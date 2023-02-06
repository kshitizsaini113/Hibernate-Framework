package com.hibernate;

import antlr.debug.TraceAdapter;
import com.hibernate.Entity.Embeddable.EmbeddableCourse;
import com.hibernate.Entity.Embeddable.EmbeddableStudent;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Embeddable {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        EmbeddableCourse course = new EmbeddableCourse();
        course.setCourseName("B.Tech");
        course.setCourseDuration(4);

        EmbeddableStudent student = new EmbeddableStudent();
        student.setStudentName("ABC");
        student.setStudentId(1);
        student.setCourse(course);

        session.save(student);
        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
