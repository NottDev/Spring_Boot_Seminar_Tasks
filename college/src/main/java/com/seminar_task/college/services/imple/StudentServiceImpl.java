package com.seminar_task.college.services.imple;

import com.seminar_task.college.dto.StudentDTO;
import com.seminar_task.college.repository.IStudentRepository;
import com.seminar_task.college.repository.entity.Student;
import com.seminar_task.college.services.IStudentService;
import com.seminar_task.college.services.utilities.OutputMessages;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements IStudentService {

    private static final OutputMessages outputMsg = new OutputMessages();
    private final IStudentRepository repository;
    public StudentServiceImpl(IStudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public String save(StudentDTO student) {
        boolean elementChecker = repository.existsById(student.getId());

        if(elementChecker) {
            return outputMsg.IdCheckError();
        }
        else {
            repository.save(new Student(student));
            return outputMsg.SaveSuccess();
        }
    }

    @Override
    public String update(StudentDTO student) {
        Optional<Student> value = repository.findById(student.getId());
        if(value.isPresent()){
            repository.save(new Student(student));
            return outputMsg.UpdateSuccess();
        } else {
            return outputMsg.NotFoundError();
        }
    }

    @Override
    public String delete(StudentDTO student) {
        boolean elementChecker = repository.existsById(student.getId());

        if(elementChecker) {
            repository.save(new Student(student));
            return outputMsg.DeleteSuccess();
        }
        else {
            return outputMsg.NotFoundError();
        }
    }

    @Override
    public List<StudentDTO> getAll() {
        List<Student> list = (List<Student>) repository.findAll();

        return list.stream()
                .map(StudentDTO::new)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Student> getStudentById(String id){
        return repository.findById(Integer.parseInt(id));
    }
}
