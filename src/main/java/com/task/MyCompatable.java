package com.task;

import com.example.springboot.Employee;

public class MyCompatable implements Comparable<Employee>{
    @Override
    public int compareTo(Employee o) {
        return 0;
    }
}
