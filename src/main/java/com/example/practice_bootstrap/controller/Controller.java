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
    //creat new page for the table

    @GetMapping("/cars")
    public String table1() {
        return "tables-data";
    }
    @GetMapping("/customers")
    public String table2() {
        return "tables-general";
    }
    @GetMapping("/register")
    public String register() {
        return "pages-register";
    }

}

