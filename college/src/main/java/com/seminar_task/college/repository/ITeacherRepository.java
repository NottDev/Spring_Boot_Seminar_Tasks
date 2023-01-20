package com.seminar_task.college.repository;

import com.seminar_task.college.repository.entity.Teacher;
import org.springframework.data.repository.CrudRepository;

public interface ITeacherRepository extends CrudRepository<Teacher, Integer> {
}
