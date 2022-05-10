package com.example.practice_bootstrap.controller;

import com.example.practice_bootstrap.DAO.CustomerDAO;
import com.example.practice_bootstrap.DAO.VehicleDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    //autowire to the repository
@Autowired
CustomerDAO customerDAO;

@Autowired
VehicleDAO vehicleDAO;



    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }
    //creat new page for the table

    @GetMapping("/cars")
    public String table1(Model model) {
        model.addAttribute("vehicles", vehicleDAO.getVehicles());
        return "Cars";
    }
    @GetMapping("/customers")
    public String table2(Model model) {
        model.addAttribute("customers", customerDAO.getCustomers());
        return "customers ";
    }
    @GetMapping("/register")
    public String register() {
        return "pages-register";
    }

}

