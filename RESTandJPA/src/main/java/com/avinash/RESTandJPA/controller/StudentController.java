package com.avinash.RESTandJPA.controller;


import com.avinash.RESTandJPA.StudentService;
import com.avinash.RESTandJPA.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    //Service object
    @Autowired
    StudentService service;

    //methods

    //add
    @PostMapping("/student")
    public List<Student> addStudent(@RequestBody Student student){
        return service.addStudent(student);
    }

    //fetchAll()
    @GetMapping("/students")
    public List<Student> fetchAll(){
        return service.fetchAll();
    }

    //individual student
    @GetMapping("/student/{roll}")
    public List<Student> getStudent(@PathVariable("roll") int roll){
        return service.getStudent(roll);
    }

    //searchStudent
    @GetMapping("/student/search/{keyword}")
    public List<Student> searchStudent(@PathVariable("keyword") String keyword){
        return service.searchStudent(keyword);
    }
}
