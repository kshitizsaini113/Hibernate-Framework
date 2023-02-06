package com.hibernate.Entity.Mapping.OneToManyPkg;

import javax.persistence.*;

@Entity
public class Answwer {
    @Id
    private int answerId;
    private String answer;

    @ManyToOne
    @JoinColumn(name = "que")
    Quesstion question;

    public Answwer() {
    }

    public Answwer(int answerId, String answer, Quesstion question) {
        this.answerId = answerId;
        this.answer = answer;
        this.question = question;
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Quesstion getQuestion() {
        return question;
    }

    public void setQuestion(Quesstion question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "answerId=" + answerId +
                ", answer='" + answer +
                '}';
    }
}
