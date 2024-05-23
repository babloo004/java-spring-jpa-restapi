package com.avinash.RESTandJPA;

import com.avinash.RESTandJPA.model.Student;
import com.avinash.RESTandJPA.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    //Repo object
    @Autowired
    StudentRepo repo;

    //methods

    //add
    public List<Student> addStudent(Student student){
        repo.save(student);
        return repo.findAll();
    }

    //fetchAll
    public List<Student> fetchAll(){
        return repo.findAll();
    }

    //individual student
    public List<Student> getStudent(int roll){
        return repo.findByroll(roll);
    }

    //search
    public List<Student> searchStudent(String keyword){
        return repo.findByFnameContainingOrLnameContaining(keyword,keyword);
    }
}
