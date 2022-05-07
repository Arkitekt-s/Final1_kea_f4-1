package com.example.practice_bootstrap.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    //autowire to the repository




    @GetMapping("/")
    public String index(Model model) {



        return "index";
    }
}

