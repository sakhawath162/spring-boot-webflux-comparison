package com.example.SpringbootMongo.Repository;

import com.example.SpringbootMongo.Model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {
}
