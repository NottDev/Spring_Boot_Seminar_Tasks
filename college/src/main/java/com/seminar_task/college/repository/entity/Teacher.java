package com.seminar_task.college.repository.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.seminar_task.college.dto.TeacherDTO;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "TEACHERS")
public class Teacher {

    @Id
    @Column(name = "TEACHER_ID", unique = true)
    private Integer id;

    @Column(name = "TEACHER_NAME", nullable = false)
    private String name;

    @Column(name = "TEACHER_LAST_NAME", nullable = false)
    private String lastName;

    @Column(name = "TEACHER_AGE")
    private Integer age;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "teacher", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<CollegeClass> classes;

    public Teacher(Integer id, String name, String lastName, Integer age){
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public Teacher(){}

    public Teacher(TeacherDTO teacher) {
        this.id = teacher.getId();
        this.name = teacher.getName();
        this.lastName = teacher.getLastName();
        this.age = teacher.getAge();
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<CollegeClass> getClasses() {
        return classes;
    }

    public void setClasses(List<CollegeClass> classes) {
        this.classes = classes;
    }
}
