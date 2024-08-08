package com.example.springboot;

import com.example.springboot.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorSample {
    public void sample(){
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("vijay",3,100));
        list.add(new Employee("ajith",3,200));
        list.add(new Employee("am",3,300));


        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Double.compare(o2.getSalary(),o1.getSalary());
            }
        });

//        System.out.println(list);
        list.stream().forEach(s-> System.out.println(s.getName() + " : "+ s.getSalary()));
    }

}
