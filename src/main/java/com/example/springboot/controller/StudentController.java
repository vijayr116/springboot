package com.example.springboot.controller;

import com.example.springboot.model.Student;
import com.example.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api")
public class StudentController {

    @Autowired
   private StudentService studentService;
    @PostMapping("/add")
    public ResponseEntity<Student> addStudent(@RequestBody Student student){
        System.out.println("printt");
//        studentService.addStudent(student);
        return new ResponseEntity<>(studentService.addStudent(student), HttpStatus.ACCEPTED);
    }

    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student){
      return studentService.updateStudent(student);
    }
    @GetMapping("/get")
    public List<Student> getStudents(){
        return studentService.getStudent();
    }
    @GetMapping("/getById/{id}")
    public Optional<Student> getStudentsById(@PathVariable int id){
        return studentService.getStudentById(id);
    }
    @GetMapping("/getByName/{name}")
    public List<Student> getByName(@PathVariable String name){
        return studentService.getByName(name);
    }
}
