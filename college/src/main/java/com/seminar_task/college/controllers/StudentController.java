package com.seminar_task.college.controllers;

import com.seminar_task.college.dto.StudentDTO;
import com.seminar_task.college.services.IStudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {
    private final IStudentService iStudentService;
    public StudentController(IStudentService iStudentService) {
        this.iStudentService = iStudentService;
    }

    @GetMapping()
    public ResponseEntity<?> getStudentAll(){
        try{
            return ResponseEntity
                    .ok()
                    .body(iStudentService.getAll());
        } catch (Exception e){
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable(name = "id") String id){
        try{
            return ResponseEntity
                    .ok()
                    .body(iStudentService.getStudentById(id));
        } catch (Exception e){
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping()
    public ResponseEntity<?>
    saveStudent(@RequestBody StudentDTO student){
        try {
            return new ResponseEntity<>( iStudentService.save(student), HttpStatus.CREATED);
        } catch (Exception e){
            return ResponseEntity.badRequest().build();
        }
    }

    @PutMapping()
    public ResponseEntity<?>
    updateStudent(@RequestBody StudentDTO student){
        try {
            return new ResponseEntity<>( iStudentService.update(student), HttpStatus.CREATED);
        } catch (Exception e){
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping()
    public ResponseEntity<?>
    deleteStudent(@RequestBody StudentDTO student){
        try {
            return new ResponseEntity<>( iStudentService.delete(student), HttpStatus.CREATED);
        } catch (Exception e){
            return ResponseEntity.notFound().build();
        }
    }
}
