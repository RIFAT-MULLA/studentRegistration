package com.api.students_registeration.registration;
import com.api.students_registeration.entities.students;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.students_registeration.studentRepository;


@Component
public class registrationMethods {
    
    @Autowired
    private studentRepository regRepository;

    // get/read all data
    public List<students> getALlStudents(){
        List<students> list = (List<students>)this.regRepository.findAll();
        return list;
    }

    // get/read data by ID
    public students getStudentsById(int id){
        students std = null;        
        try {
            std = this.regRepository.findById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return std;
    }    

    // add/create data
    public students addStudents(students std){
        students result  = this.regRepository.save(std);
        return result;
    }

    // delete data
    public void deleteStudents(int id){
        this.regRepository.deleteById(id);
    }

    // Update book
    public void updateStudents(students std, int stdId){
        std.setId(stdId);
        this.regRepository.save(std);     
    }    

    public students getStudentsByName(String name) {
        students std = null;
        std = this.regRepository.findByName(name);
        return std;
    }

}
