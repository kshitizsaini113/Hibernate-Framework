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

        question.setQuestion("Is it a question?");
        question.setQuestionId(6);
        answer.setAnswer("It is an answer for the question.");
        answer.setAnswerId(1006);
        question.setAnswerUni(answer);
        answer.setQuestion(question);

        session.save(answer);
        session.save(question);
        transaction.commit();

        Question fetchedQuestion = (Question) session.get(Question.class, 2);
        System.out.println(fetchedQuestion);

        Answer fetchedAnswer = (Answer) session.get(Answer.class, 1004);
        System.out.println(fetchedAnswer);

        session.close();
        sessionFactory.close();
    }
}
