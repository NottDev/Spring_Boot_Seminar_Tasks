package com.seminar_task.college.repository.entity;

import com.seminar_task.college.dto.CollegeClassDTO;
import jakarta.persistence.*;

@Entity
@Table(name = "COLLEGE_CLASSES")
public class CollegeClass {

    @Id
    @Column(name = "ID", unique = true)
    private Integer classId;

    @Column(name = "CLASS_TOPIC", nullable = false)
    private String className;

    @Column(name = "SCHEDULE", nullable = false)
    private String schedule;

    @ManyToOne
    @JoinColumn(name = "TEACHER_FK")
    private Teacher teacher;

    @OneToOne(mappedBy = "collegeClass")
    private Student student;

    public CollegeClass(){}

    public CollegeClass(Integer classId, String className, String schedule) {
        this.classId = classId;
        this.className = className;
        this.schedule = schedule;
    }

    public CollegeClass(CollegeClassDTO collegeClassDTO){
        this.classId = collegeClassDTO.getClassId();
        this.className = collegeClassDTO.getClassName();
        this.schedule = collegeClassDTO.getSchedule();
        this.teacher = collegeClassDTO.getTeacher();
        this.student = collegeClassDTO.getStudent();
    }

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

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }
}
