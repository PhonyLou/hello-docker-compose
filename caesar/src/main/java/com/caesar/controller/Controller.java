package com.caesar.controller;

import com.caesar.directive.entity.Directive;
import com.caesar.directive.repository.DirectiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {
    @Autowired
    private DirectiveRepository directiveRepository;


    @GetMapping("/directive")
    public List<Directive> getAllDirective() {
        return directiveRepository.findAll();
    }
}
