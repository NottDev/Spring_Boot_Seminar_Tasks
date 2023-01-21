package com.seminar_task.college.services;

import com.seminar_task.college.dto.StudentDTO;
import com.seminar_task.college.repository.entity.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;

public interface IStudentService {

    String save(StudentDTO student);
    String update(StudentDTO student);
    String delete(StudentDTO student);
    List<StudentDTO> getAll();

    Optional<Student> getStudentById(String id);
}
