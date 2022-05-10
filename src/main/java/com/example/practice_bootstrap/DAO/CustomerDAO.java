package com.example.practice_bootstrap.DAO;

import com.example.practice_bootstrap.model.Booking;
import com.example.practice_bootstrap.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
//REpository
@Repository
public class CustomerDAO {
    //Autowired
    @Autowired
    JdbcTemplate jdbcTemplate;
    //
    public List<Customer> getCustomers() {
        String sql = "SELECT * FROM nordic_motorhome.customers";
        RowMapper<Customer> rowMapper = new BeanPropertyRowMapper<>(Customer.class);
        return jdbcTemplate.query(sql, rowMapper);
    }

}
