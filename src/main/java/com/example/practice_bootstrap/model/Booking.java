package com.example.practice_bootstrap.model;

//import javax.persistence.Entity;
//import javax.persistence.Id;
import java.time.LocalDate;
import lombok.Data;

//@Entity
@Data
public class Booking {
    //@Id
    // attributes
    private int bookingID;
    private String licensePlate;
    private int customerID;
    private LocalDate startDate;
    private LocalDate endDate;

    /*
    // constructor
    public Booking() {

    }
    public Booking(int bookingID, String licensePlate, int customerID, LocalDate startDate, LocalDate endDate) {
        this.bookingID = bookingID;
        this.licensePlate = licensePlate;
        this.customerID = customerID;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // getters
    public int getBookingID() {
        return bookingID;
    }
    public String getLicensePlate() {
        return licensePlate;
    }
    public int getCustomerID() {
        return customerID;
    }
    public LocalDate getStartDate() {
        return startDate;
    }
    public LocalDate getEndDate() {
        return endDate;
    }

    // setters
    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingID=" + bookingID +
                ", licensePlate='" + licensePlate + '\'' +
                ", customerID=" + customerID +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
    */
}
