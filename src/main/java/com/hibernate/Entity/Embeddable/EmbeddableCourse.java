package com.hibernate.Entity.Embeddable;

import javax.persistence.Embeddable;

@Embeddable
public class EmbeddableCourse {
    private String courseName;
    private int courseDuration;

    public EmbeddableCourse() {
    }

    public EmbeddableCourse(String courseName, int courseDuration) {
        this.courseName = courseName;
        this.courseDuration = courseDuration;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(int courseDuration) {
        this.courseDuration = courseDuration;
    }

    @Override
    public String toString() {
        return "EmbeddableCourse{" +
                "courseName='" + courseName + '\'' +
                ", courseDuration=" + courseDuration +
                '}';
    }
}
