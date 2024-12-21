package com.codeinjar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorld {

    @GetMapping("/hello")
    public String HelloWorld(Model model){


        model.addAttribute("name", "World");
        return "hello"; //hello.html
    }
}
