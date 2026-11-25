package com.example.crudSpringBootDemo.controller;


import com.example.crudSpringBootDemo.entity.Student;
import com.example.crudSpringBootDemo.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService= studentService;
    }

//    create student
    @PostMapping
    public String CreateStudent(@RequestBody Student student){
        System.out.println("inside student controller");

        Student createdStudent = studentService.createdStudent(student);
        return "Student Created";
    }
}
