package com.mongo.mongodbdemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.mongodbdemo.models.Person;
import com.mongo.mongodbdemo.repository.PersonRepo;

@RestController
@RequestMapping("/person")
public class MyController {

    @Autowired
    private PersonRepo personRepo;

    @RequestMapping("/save")
    public ResponseEntity<?> savePerson(@RequestBody Person person) {
        Person savedPerson = this.personRepo.save(person);
        return ResponseEntity.ok(savedPerson);
    }

    @RequestMapping("/get")
    public ResponseEntity<?> getPerson() {
        return ResponseEntity.ok(this.personRepo.findAll());
    }
    
}
