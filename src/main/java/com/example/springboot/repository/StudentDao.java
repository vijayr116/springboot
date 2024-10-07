package com.example.springboot.repository;

import com.example.springboot.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface StudentDao extends JpaRepository<Student,Integer> {
    List<Student> findByName(String name);


}
