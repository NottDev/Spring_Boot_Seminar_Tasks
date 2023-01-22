package com.seminar_task.college.controllers;

import com.seminar_task.college.dto.TeacherDTO;
import com.seminar_task.college.services.ITeacherService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    private final ITeacherService iTeacherService;
    public TeacherController(ITeacherService iTeacherService) {
        this.iTeacherService = iTeacherService;
    }

    @GetMapping()
    public ResponseEntity<?> getTeacherAll(){
        try{
            return ResponseEntity
                    .ok()
                    .body(iTeacherService.getAll());
        } catch (Exception e){
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping()
    public ResponseEntity<?>
    saveTeacher(@RequestBody TeacherDTO teacher){
        try {
            return new ResponseEntity<>( iTeacherService.save(teacher), HttpStatus.CREATED);
        } catch (Exception e){
            return ResponseEntity.badRequest().build();
        }
    }

    @PutMapping()
    public ResponseEntity<?>
    updateTeacher(@RequestBody TeacherDTO teacher){
        try {
            return new ResponseEntity<>( iTeacherService.update(teacher), HttpStatus.CREATED);
        } catch (Exception e){
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping()
    public ResponseEntity<?>
    deleteTeacher(@RequestBody TeacherDTO teacher){
        try {
            return new ResponseEntity<>( iTeacherService.delete(teacher), HttpStatus.CREATED);
        } catch (Exception e){
            return ResponseEntity.notFound().build();
        }
    }
}
