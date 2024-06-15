package com.mongo.mongodbdemo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.mongodbdemo.models.Person;

public interface PersonRepo extends MongoRepository<Person, String>{
    
}
