package com.seminar_task.college.services.imple;

import com.seminar_task.college.dto.TeacherDTO;
import com.seminar_task.college.repository.ITeacherRepository;
import com.seminar_task.college.repository.entity.Teacher;
import com.seminar_task.college.services.ITeacherService;
import com.seminar_task.college.services.OutputMessages;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TeacherServiceImpl implements ITeacherService {
    private static final OutputMessages outputMsg = new OutputMessages();
    private final ITeacherRepository repository;
    public TeacherServiceImpl(ITeacherRepository repository) {
        this.repository = repository;
    }

    @Override
    public String save(TeacherDTO teacher) {

        boolean elementChecker = repository.existsById(teacher.getId());

        if(elementChecker) {
            return outputMsg.IdCheckError();
        }
        else {
            repository.save(new Teacher(teacher));
            return outputMsg.SaveSuccess();
        }
    }

    @Override
    public String update(TeacherDTO teacher) {

        Optional<Teacher> value = repository.findById(teacher.getId());
        if(value.isEmpty()){
            repository.save(new Teacher(teacher));
            return outputMsg.UpdateSuccess();
        } else {
            return outputMsg.NotFoundError();
        }
    }

    @Override
    public String delete(TeacherDTO teacher) {
        boolean elementChecker = repository.existsById(teacher.getId());

        if(elementChecker) {
            repository.save(new Teacher(teacher));
            return outputMsg.DeleteSuccess();
        }
        else {
            return outputMsg.NotFoundError();
        }
    }

    @Override
    public List<TeacherDTO> getAll() {
        List<Teacher> list = (List<Teacher>) repository.findAll();

        return list.stream()
                .map(TeacherDTO::new)
                .collect(Collectors.toList());
    }
}
