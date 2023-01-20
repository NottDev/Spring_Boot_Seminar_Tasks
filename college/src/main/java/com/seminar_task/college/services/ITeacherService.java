package com.seminar_task.college.services;

import com.seminar_task.college.dto.TeacherDTO;

import java.util.List;

public interface ITeacherService {

    String save(TeacherDTO teacher);
    String update(TeacherDTO teacher);
    String delete(TeacherDTO teacher);
    List<TeacherDTO> getAll();
}
