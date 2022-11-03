package com.api.students_registeration.controllers;
import com.api.students_registeration.registration.registrationMethods;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.api.students_registeration.entities.students;


@RestController
public class registrationController {
    @Autowired
    private registrationMethods registrationMethods;

    // read all data
    @GetMapping("/students")
    public ResponseEntity<List<students>> getStudents() {
        List<students> list = this.registrationMethods.getALlStudents();

        if(list.size() == 0){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }else{
            return ResponseEntity.status(HttpStatus.OK).body(list);
        }
    }

    // search by  id
    @GetMapping("/students/{id}")
    public students getStudents(@PathVariable("id") int id){
        return this.registrationMethods.getStudentsById(id);
    }

    // create
    @PostMapping("/students")
    public students addStudents(@RequestBody students std){
        students s = this.registrationMethods.addStudents(std);
        return s;
    }

    // delete
    @DeleteMapping("/students/{stdId}")
    public void deleteStudents(@PathVariable("stdId") int stdId){
        this.registrationMethods.deleteStudents(stdId);
        System.out.println("deleted");
    }

    //update
    @PutMapping("/students/{stdid}")
    public students updateStudents(@RequestBody students std,@PathVariable("stdid") int stdId){
        this.registrationMethods.updateStudents(std, stdId);
        System.out.println("Updated");
        return std;
    }

    // search by name
    @GetMapping("/studentsname/{name}")
    public students getStudentName(@PathVariable("name") String name){
        return this.registrationMethods.getStudentsByName(name);
    }
}
