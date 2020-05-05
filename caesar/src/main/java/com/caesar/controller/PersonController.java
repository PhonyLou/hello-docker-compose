package com.caesar.controller;

import com.caesar.person.entity.Person;
import com.caesar.person.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonController {
    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/people")
    public List<Person> getAllPerson() {
        return personRepository.findAll();
    }
}
