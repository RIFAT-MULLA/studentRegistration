package com.api.students_registeration;

import org.springframework.data.repository.CrudRepository;
import com.api.students_registeration.entities.students;

public interface studentRepository extends CrudRepository<students, Integer>{
    public students findById(int id);
    public students findByName(String name);
}
