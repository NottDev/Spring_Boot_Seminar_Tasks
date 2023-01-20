package com.seminar_task.college.repository;

import com.seminar_task.college.repository.entity.College_Class;
import org.springframework.data.repository.CrudRepository;

public interface IClassRepository extends CrudRepository<College_Class, Integer> {
}
