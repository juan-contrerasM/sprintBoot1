package com.example.projectSprint1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//anotacion para que el sprint sepa que es un controller sprint
@Controller
@RequestMapping("/miapp")
public class ControllerBasic {

    //anotacion para saber que es un metodo
    @GetMapping(path = {"/saludar","/hola","/"})
    public String saludar (){
        return "index";
    }
}
