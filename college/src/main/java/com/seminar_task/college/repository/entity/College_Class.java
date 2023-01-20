package com.seminar_task.college.repository.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "COLLEGE_CLASSES")
public class College_Class {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer classId;

    @Column(name = "CLASS_TOPIC", nullable = false)
    private String className;

    @ManyToOne
    @JoinColumn(name = "TEACHER_FK", nullable = false)
    private Teacher teacher;

    public College_Class(){}

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
