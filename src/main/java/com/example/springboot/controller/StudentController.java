package com.example.springboot.controller;

import com.example.springboot.model.Student;
import com.example.springboot.model.Users;
import com.example.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api")
public class StudentController {
    @Autowired
   private StudentService studentService;
    @PostMapping("/add")
    public ResponseEntity<Student> addStudent(@RequestBody Student student){
        System.out.println("printt");
        return new ResponseEntity<>(studentService.addStudent(student), HttpStatus.ACCEPTED);
    }
    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student){
      return studentService.updateStudent(student);
    }
    @GetMapping("/get")
    public List<Student> getStudents(){
        System.out.println("Get API called");
        return studentService.getStudent();
    }
    @PostMapping("/login")
    public Users login(@RequestBody Users user){
        System.out.println("API CALL");
        Users users1 = new Users();
        users1.setUsername("vijay");
        users1.setPassword("vijay");
        users1.setIs_active(user.getUsername().equals("vijay") & user.getPassword().equals("vijay")?true:false);
        return users1;
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
