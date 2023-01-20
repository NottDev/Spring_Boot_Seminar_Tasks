package com.seminar_task.college.dto;

import com.seminar_task.college.repository.entity.Teacher;

public class TeacherDTO {

    private Integer id;
    private String name;
    private String lastName;
    private Integer age;

    public TeacherDTO(){}

    public TeacherDTO(Integer id, String name, String lastName, Integer age){
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public TeacherDTO(Teacher teacher){
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
}
