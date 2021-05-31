package com.example.SpringwebfluxMongoDB.Repository;

import com.example.SpringwebfluxMongoDB.Model.Student;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface StudentRepository extends ReactiveMongoRepository<Student,String> {
}
