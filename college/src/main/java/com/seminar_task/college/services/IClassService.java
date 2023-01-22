package com.seminar_task.college.services;

import com.seminar_task.college.dto.CollegeClassDTO;

import java.util.List;

public interface IClassService {
    String save(CollegeClassDTO collegeClass);
    String update(CollegeClassDTO collegeClass);
    String delete(CollegeClassDTO collegeClass);
    List<CollegeClassDTO> getAll();
}
