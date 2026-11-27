package com.example.crudSpringBootDemo.service;


import com.example.crudSpringBootDemo.entity.Student;
import com.example.crudSpringBootDemo.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }
    public Student createdStudent(Student studentReq){
        System.out.println("inside student service");

        Student studentResp = studentRepository.saveStudent(studentReq);
        System.out.println("exiting student service");
        return studentResp;
    }
}
