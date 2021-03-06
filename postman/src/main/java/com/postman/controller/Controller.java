package com.postman.controller;

import com.postman.service.PostmanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {
    @Autowired
    private PostmanService postmanService;


    @GetMapping("/directive")
    public String getDirective() {
        return postmanService.command().getDirective();
    }

    @GetMapping("/forward")
    public String forwardDirective() {
        return postmanService.hello(postmanService.command());
    }
}
