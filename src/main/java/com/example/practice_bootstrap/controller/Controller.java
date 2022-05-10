package com.example.practice_bootstrap.controller;

import com.example.practice_bootstrap.DAO.CustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    //autowire to the repository
    @Autowired
    CustomerDAO customerDAO;

    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }
    //creat new page for the table

    @GetMapping("/customers")
    public String customers(Model model) {
        model.addAttribute("customers", customerDAO.getCustomers());
        return "customers";
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

