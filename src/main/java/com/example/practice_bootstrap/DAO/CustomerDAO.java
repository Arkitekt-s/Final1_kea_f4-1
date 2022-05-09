package com.example.practice_bootstrap.DAO;

import com.example.practice_bootstrap.model.Booking;
import com.example.practice_bootstrap.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDAO {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Customer> getCustomers() {
        return jdbcTemplate.query(
                "SELECT * FROM nordic_motorhome.customers",
                new BeanPropertyRowMapper<>(Customer.class)
        );
    }

}
