package com.seminar_task.college.repository.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "COLLEGE_CLASSES")
public class CollegeClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true)
    private Long classId;

    @Column(name = "CLASS_TOPIC", nullable = false)
    private String className;

    @ManyToOne
    @JoinColumn(name = "TEACHER_FK", nullable = false)
    private Teacher teacher;

    @OneToOne(mappedBy = "collegeClass")
    private Student student;

    public CollegeClass(){}

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

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
