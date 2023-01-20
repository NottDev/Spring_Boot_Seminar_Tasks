package com.seminar_task.college.dto;

import com.seminar_task.college.repository.entity.CollegeClass;
import com.seminar_task.college.repository.entity.Student;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

public class StudentDTO {

    private Integer id;
    private String name;
    private String lastName;
    private String dob;
    private Integer age;
    private CollegeClass collegeClass;

    public StudentDTO(){}

    public StudentDTO(Integer id, String name, String lastName, String dob, Integer age) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.dob = dob;
        this.age = age;
    }

    public StudentDTO(Student student) {
        this.id = student.getId();
        this.name = student.getName();
        this.lastName = student.getLastName();
        this.dob = student.getDob();
        this.age = student.getAge();
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
