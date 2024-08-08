package com.example.springboot.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Student{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;

}
