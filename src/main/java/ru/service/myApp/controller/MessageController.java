package ru.service.myApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @GetMapping("/message/{name}")
    public String message(@PathVariable String name){
        return "Hello " + name;
    }
}
