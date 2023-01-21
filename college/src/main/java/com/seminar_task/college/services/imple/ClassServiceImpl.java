package com.seminar_task.college.services.imple;

import com.seminar_task.college.dto.CollegeClassDTO;
import com.seminar_task.college.repository.IClassRepository;
import com.seminar_task.college.repository.entity.CollegeClass;
import com.seminar_task.college.services.IClassService;
import com.seminar_task.college.services.utilities.OutputMessages;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ClassServiceImpl implements IClassService {

    private static final OutputMessages outputMsg = new OutputMessages();
    private final IClassRepository repository;
    public ClassServiceImpl(IClassRepository repository) {
        this.repository = repository;
    }

    @Override
    public String save(CollegeClassDTO collegeClass) {
        boolean elementChecker = repository.existsById(collegeClass.getClassId());

        if(elementChecker) {
            return outputMsg.IdCheckError();
        }
        else {
            repository.save(new CollegeClass(collegeClass));
            return outputMsg.SaveSuccess();
        }
    }

    @Override
    public String update(CollegeClassDTO collegeClass) {
        Optional<CollegeClass> value = repository.findById(collegeClass.getClassId());
        if(value.isPresent()){
            repository.save(new CollegeClass(collegeClass));
            return outputMsg.UpdateSuccess();
        } else {
            return outputMsg.NotFoundError();
        }
    }

    @Override
    public String delete(CollegeClassDTO collegeClass) {
        boolean elementChecker = repository.existsById(collegeClass.getClassId());

        if(elementChecker) {
            repository.save(new CollegeClass(collegeClass));
            return outputMsg.DeleteSuccess();
        }
        else {
            return outputMsg.NotFoundError();
        }
    }

    @Override
    public List<CollegeClassDTO> getAll() {
        List<CollegeClass> list = (List<CollegeClass>) repository.findAll();

        return list.stream()
                .map(CollegeClassDTO::new)
                .collect(Collectors.toList());
    }
}
