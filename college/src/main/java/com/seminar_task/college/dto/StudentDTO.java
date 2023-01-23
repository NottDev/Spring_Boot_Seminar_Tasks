package com.seminar_task.college.dto;

import com.seminar_task.college.repository.entity.CollegeClass;
import com.seminar_task.college.repository.entity.Student;
import com.seminar_task.college.services.utilities.CalculateAge;

public class StudentDTO {

    CalculateAge calculateAge = new CalculateAge();

    private Integer id;
    private String name;
    private String lastName;
    private String dob;
    private Integer age;
    private CollegeClass collegeClass;

    public StudentDTO(){}

    public StudentDTO(Integer id, String name, String lastName, String dob, CollegeClass collegeClass) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.dob = dob;
        this.age = getAge();
        this.collegeClass = collegeClass;
    }

    public StudentDTO(Student student) {
        this.id = student.getId();
        this.name = student.getName();
        this.lastName = student.getLastName();
        this.dob = student.getDob();
        this.age = getAge();
        this.collegeClass = student.getCollegeClass();
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
        Integer dobYear = calculateAge.getDobYear(getDob());
        return calculateAge.foundAge(dobYear);
    }

    public CollegeClass getCollegeClass() {
        return collegeClass;
    }

    public void setCollegeClass(CollegeClass collegeClass) {
        this.collegeClass = collegeClass;
    }
}
