package com.hibernate.Entity.Mapping.OneToOnePkg;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Question {
    @Id
    private int questionId;
    private String question;

    @OneToOne
    @JoinColumn(name = "ansId")
    private Answer answerUni;

    public Question() {
    }

    public Question(int questionId, String question, Answer answerUni) {
        this.questionId = questionId;
        this.question = question;
        this.answerUni = answerUni;
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

    public Answer getAnswerUni() {
        return answerUni;
    }

    public void setAnswerUni(Answer answerUni) {
        this.answerUni = answerUni;
    }

    @Override
    public String toString() {
        return "Question{" +
                "questionId=" + questionId +
                ", question='" + question + '\'' +
                ", answerUni=" + answerUni +
                '}';
    }
}
