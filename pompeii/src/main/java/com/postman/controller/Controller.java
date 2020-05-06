package com.postman.controller;

import com.postman.service.PompeiiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {
    @Autowired
    private PompeiiService pompeiiService;


    @GetMapping("/directive")
    public String getDirective() {
        return pompeiiService.getCommand();
    }

}
