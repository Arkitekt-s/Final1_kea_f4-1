package com.example.practice_bootstrap.DAO;

import com.example.practice_bootstrap.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class VehicleDAO {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Vehicle> getVehicles() {
        return jdbcTemplate.query(
                "SELECT * FROM nordic_motorhome.vehicles",
                new BeanPropertyRowMapper<>(Vehicle.class)
        );
    }
}
