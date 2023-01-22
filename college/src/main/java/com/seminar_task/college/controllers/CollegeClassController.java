package com.seminar_task.college.controllers;

import com.seminar_task.college.dto.CollegeClassDTO;
import com.seminar_task.college.services.IClassService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/class")
public class CollegeClassController {

    private final IClassService iClassService;
    public CollegeClassController(IClassService iClassService) {
        this.iClassService = iClassService;
    }

    @GetMapping()
    public ResponseEntity<?> getClassAll(){
        try{
            return ResponseEntity
                    .ok()
                    .body(iClassService.getAll());
        } catch (Exception e){
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping()
    public ResponseEntity<?>
    saveClass(@RequestBody CollegeClassDTO collegeClass){
        try {
            return new ResponseEntity<>( iClassService.save(collegeClass), HttpStatus.CREATED);
        } catch (Exception e){
            return ResponseEntity.badRequest().build();
        }
    }

    @PutMapping()
    public ResponseEntity<?>
    updateClass(@RequestBody CollegeClassDTO collegeClass){
        try {
            return new ResponseEntity<>( iClassService.update(collegeClass), HttpStatus.CREATED);
        } catch (Exception e){
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping()
    public ResponseEntity<?>
    deleteClass(@RequestBody CollegeClassDTO collegeClass){
        try {
            return new ResponseEntity<>( iClassService.delete(collegeClass), HttpStatus.CREATED);
        } catch (Exception e){
            return ResponseEntity.notFound().build();
        }
    }
}
