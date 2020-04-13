package br.com.alura.forum.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController{

    @RequestMapping("/")
    public String HelloWorld(){
        return "Hello World";
    }
}