package com.example.practice_bootstrap.controller;

import com.example.practice_bootstrap.DAO.BookingDAO;
import com.example.practice_bootstrap.DAO.CustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    //autowire to the repository
    @Autowired
    CustomerDAO customerDAO;
    @Autowired
    BookingDAO bookingDAO;

    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }
    //creat new page for the table

    @GetMapping("/customers")
    public String showCustomers(Model model) {
        model.addAttribute("customersList", customerDAO.getCustomers());
        return "customers";
    }

    @GetMapping("/vehicles")
    public String showVehicles() {
        return "vehicles";
    }

    @GetMapping("/bookings")
    public String showBookings(Model model) {
        model.addAttribute("bookingsList", bookingDAO.getBookings());
        return "bookings";
    }

}

