package com.hibernate;

import com.hibernate.Entity.Mapping.OneToOnePkg.Answer;
import com.hibernate.Entity.Mapping.OneToOnePkg.Question;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOne {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Question question = new Question();
        Answer answer = new Answer();

        question.setQuestion("What is a question?");
        question.setQuestionId(1);
        answer.setAnswer("It is a answer");
        answer.setAnswerId(1001);
        question.setAnswerUni(answer);

        session.save(answer);
        session.save(question);
        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
