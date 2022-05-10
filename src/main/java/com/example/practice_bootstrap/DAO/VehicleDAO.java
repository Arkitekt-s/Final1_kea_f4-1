package com.example.practice_bootstrap.DAO;

import com.example.practice_bootstrap.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class VehicleDAO {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Vehicle> getVehicles() {
        String sql = "SELECT * FROM nordic_motorhome.vehicles";
        RowMapper<Vehicle> rowMapper = new BeanPropertyRowMapper<>(Vehicle.class);
        return jdbcTemplate.query(sql, rowMapper);
    }
}