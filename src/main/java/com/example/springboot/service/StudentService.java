package com.example.springboot.service;

import com.example.springboot.model.Student;
import com.example.springboot.repository.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
@Autowired
     private StudentDao studentDao;

    public List<Student> getStudent(){
        return studentDao.findAll();
    }

    public Student addStudent(Student student) {
       return studentDao.save(student);
    }

    public Optional<Student> getStudentById(int id) {
       return studentDao.findById(id);
    }

    public  List<Student> getByName(String name) {
        return studentDao.findByName(name);
    }

    public Student updateStudent(Student student) {
      Student st = studentDao.findById(student.getId()).orElse(null);
      st.setId(student.getId());
      st.setName(student.getName());
      st.setAddress(student.getAddress());
      return studentDao.save(st);
    }
}
