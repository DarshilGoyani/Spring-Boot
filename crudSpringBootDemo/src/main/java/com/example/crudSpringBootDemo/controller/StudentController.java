package com.example.crudSpringBootDemo.controller;


import com.example.crudSpringBootDemo.entity.Student;
import com.example.crudSpringBootDemo.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService= studentService;
    }

//    create student
    @PostMapping
    public ResponseEntity<Student> CreateStudent(@RequestBody Student student){
        Student createdStudent = studentService.createdStudent(student);

        return ResponseEntity.status(HttpStatus.CREATED).body(createdStudent);
    }

//    get one student
    @GetMapping("/{id}")
    public ResponseEntity<Student> GetOneStudent(@PathVariable Long id){
        Student getStudent = StudentService.getOneStudent(id);

        if (getStudent == null){
            return ResponseEntity.notFound().build();
        }

        return  ResponseEntity.ok(getStudent);
    }


}
