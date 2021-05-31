package com.example.SpringbootMongo.Controller;

import com.example.SpringbootMongo.Model.Student;
import com.example.SpringbootMongo.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentRepository repo;
    private int count =0;

    @GetMapping("/findAllStudent")
    public List<Student> getAllStudent(){
        System.out.println("Request No: " + count++);
        return repo.findAll();
    }

    @PostMapping("/saveStudent")
    public String saveStudent(@RequestBody Student student){
        repo.save(student);
        return "student added";
    }
    
}


