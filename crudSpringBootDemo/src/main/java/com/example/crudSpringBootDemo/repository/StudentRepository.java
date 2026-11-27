package com.example.crudSpringBootDemo.repository;


import com.example.crudSpringBootDemo.entity.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentRepository {

    public Student saveStudent(Student saveStudent){
        System.out.println("inside student repository");
        System.out.println("exiting student repository");

        return null;
    }
}
