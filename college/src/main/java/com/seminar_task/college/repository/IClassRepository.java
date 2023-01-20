package com.seminar_task.college.repository;

import com.seminar_task.college.repository.entity.CollegeClass;
import org.springframework.data.repository.CrudRepository;

public interface IClassRepository extends CrudRepository<CollegeClass, Integer> {
}
