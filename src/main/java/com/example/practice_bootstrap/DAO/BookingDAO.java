package com.example.practice_bootstrap.DAO;

import com.example.practice_bootstrap.model.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookingDAO {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Booking> getBookings() {
        String sql = "SELECT * FROM nordic_motorhome.bookings;";
        RowMapper<Booking> rowMapper = new BeanPropertyRowMapper<>(Booking.class);
        return jdbcTemplate.query(sql, rowMapper);
    }

}
