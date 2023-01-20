package com.seminar_task.college.services.imple;

import com.seminar_task.college.repository.ITeacherRepository;
import com.seminar_task.college.services.ITeacherService;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements ITeacherService {

    private final ITeacherRepository repository;

    public TeacherServiceImpl(ITeacherRepository repository) {
        this.repository = repository;
    }
}
