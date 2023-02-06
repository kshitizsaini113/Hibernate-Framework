package com.hibernate.Entity.Mapping.OneToManyPkg;

import javax.persistence.*;
import java.util.List;

@Entity
public class Quesstion {
    @Id
    private int questionId;
    private String question;

    @OneToMany(mappedBy = "question")
    private List<Answwer> answers;

    public Quesstion() {
    }

    public Quesstion(int questionId, String question, List<Answwer> answers) {
        this.questionId = questionId;
        this.question = question;
        this.answers = answers;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<Answwer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answwer> answers) {
        this.answers = answers;
    }

    @Override
    public String toString() {
        return "Quesstion{" +
                "questionId=" + questionId +
                ", question='" + question + '\'' +
                ", answers=" + answers +
                '}';
    }
}
