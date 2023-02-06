package com.hibernate.Entity.Embeddable;

import com.hibernate.Entity.Embeddable.EmbeddableCourse;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class EmbeddableStudent {
    @Id
    private int studentId;

    private String studentName;

    private EmbeddableCourse course;

    public EmbeddableStudent() {
    }

    public EmbeddableStudent(int studentId, String studentName, EmbeddableCourse course) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.course = course;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public EmbeddableCourse getCourse() {
        return course;
    }

    public void setCourse(EmbeddableCourse course) {
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmbeddableStudent)) return false;
        EmbeddableStudent student = (EmbeddableStudent) o;
        return getStudentId() == student.getStudentId() && Objects.equals(getStudentName(), student.getStudentName()) && Objects.equals(getCourse(), student.getCourse());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStudentId(), getStudentName(), getCourse());
    }

    @Override
    public String toString() {
        return "EmbeddableStudent{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", course=" + course +
                '}';
    }
}
