package com.seminar_task.college.repository.entity;

import jakarta.persistence.*;

import java.util.Set;

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

    @OneToMany(mappedBy = "teacher")
    private Set<CollegeClass> classes;

    public Teacher(Integer id, String name, String lastName){
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = getAge();
    }

    public Teacher(){}

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

    public Set<CollegeClass> getClasses() {
        return classes;
    }

    public void setClasses(Set<CollegeClass> classes) {
        this.classes = classes;
    }
}
