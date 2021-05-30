package com.example.SpringwebfluxMongoDB.Controller;

import com.example.SpringwebfluxMongoDB.Model.Student;
import com.example.SpringwebfluxMongoDB.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class StudentController {
    @Autowired
    private StudentRepository repo;

    @GetMapping("/findAllStudent")
    public Flux<Student> getAllStudent(){
        return repo.findAll();
    }
}
