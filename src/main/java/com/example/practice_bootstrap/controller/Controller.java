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
        return "Cars";
    }
    @GetMapping("/register")
    public String register() {
        return "pages-register";
    }
    @GetMapping("/customers")
    public String customers() {
        return "customers ";
    }
    @GetMapping("/vehicles")
    public String vehicles() {
        return "vehicles";
    }
    @GetMapping("/bookings")
    public String bookings() {
        return "bookings";
    }

}

