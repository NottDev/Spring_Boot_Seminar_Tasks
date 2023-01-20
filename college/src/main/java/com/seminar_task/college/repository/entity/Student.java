package com.seminar_task.college.repository.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "STUDENTS")
public class Student {

    @Id
    @Column(name = "STUDENT_ID", unique = true)
    private Integer id;

    @Column(name = "STUDENT_NAME", nullable = false)
    private String name;

    @Column(name = "STUDENT_LAST_NAME", nullable = false)
    private String lastName;

    @Column(name = "STUDENT_DOB")
    private String dob;

    @Column(name = "STUDENT_AGE")
    private Integer age;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CLASS_TAKEN_ID", referencedColumnName = "ID")
    private CollegeClass collegeClass;

    public Student(){}

    public Student(Integer id, String name, String lastName, String dob, Integer age) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.dob = dob;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public CollegeClass getCollegeClass() {
        return collegeClass;
    }

    public void setCollegeClass(CollegeClass collegeClass) {
        this.collegeClass = collegeClass;
    }
}
