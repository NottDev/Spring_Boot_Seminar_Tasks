package com.seminar_task.college.dto;

import com.seminar_task.college.repository.entity.CollegeClass;
import com.seminar_task.college.repository.entity.Student;
import com.seminar_task.college.repository.entity.Teacher;

public class CollegeClassDTO {

    private Integer classId;
    private String className;
    private String schedule;
    private Teacher teacher;
    private Student student;

    public CollegeClassDTO(){}

    public CollegeClassDTO(Integer classId, String className, String schedule) {
        this.classId = classId;
        this.className = className;
        this.schedule = schedule;
    }

    public CollegeClassDTO(CollegeClass collegeClass){
        this.classId = collegeClass.getClassId();
        this.className = collegeClass.getClassName();
        this.schedule = collegeClass.getSchedule();
        this.teacher = collegeClass.getTeacher();
        this.student = collegeClass.getStudent();
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

}
