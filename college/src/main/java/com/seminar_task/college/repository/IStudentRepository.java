package com.seminar_task.college.repository;

import com.seminar_task.college.repository.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface IStudentRepository extends CrudRepository<Student, Integer> {
}
