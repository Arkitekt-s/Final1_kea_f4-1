package com.example.practice_bootstrap.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import lombok.Data;

//@Entity
@Data
public class Customer {
    //@Id
    // attributes
    private int customerId;
    private String firstName;
    private String lastName;
    private int phoneNumber;
    private String licenseNr;
    private String cLicense;
    private LocalDate dateOfBirth;

    // constructor
//    public Customer() {
//
//    }
//    public Customer(int customerID, String firstName, String lastName, int phoneNumber, String licenceNumber, String licenceType, LocalDate dateOfBirth) {
//        this.customerID = customerID;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.phoneNumber = phoneNumber;
//        this.licenceNumber = licenceNumber;
//        this.licenceType = licenceType;
//        this.dateOfBirth = dateOfBirth;
//    }
//
//    // getters
//    public int getCustomerID() {
//        return customerID;
//    }
//    public String getFirstName() {
//        return firstName;
//    }
//    public String getLastName() {
//        return lastName;
//    }
//    public int getPhoneNumber() {
//        return phoneNumber;
//    }
//    public String getLicenceNumber() {
//        return licenceNumber;
//    }
//    public String getLicenceType() {
//        return licenceType;
//    }
//    public LocalDate getDateOfBirth() {
//        return dateOfBirth;
//    }
//
//    // setters
//    public void setCustomerID(int customerID) {
//        this.customerID = customerID;
//    }
//    public void setFirstname(String firstName) {
//        this.firstName = firstName;
//    }
//    public void setLastname(String lastName) {
//        this.lastName = lastName;
//    }
//    public void setPhoneNumber(int phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//    public void setLicenceNumber(String licenceNumber) {
//        this.licenceNumber = licenceNumber;
//    }
//    public void setLicenceType(String licenceType) {
//        this.licenceType = licenceType;
//    }
//    public void setDateOfBirth(LocalDate dateOfBirth) {
//        this.dateOfBirth = dateOfBirth;
//    }
//
//    @Override
//    public String toString() {
//        return "Customers{" +
//                "customer_id=" + customerID +
//                ", firstname='" + firstName + '\'' +
//                ", lastname='" + lastName + '\'' +
//                ", Phonenumber=" + phoneNumber +
//                ", Licence_nr='" + licenceNumber + '\'' +
//                ", Licence_type='" + licenceType + '\'' +
//                ", date_of_birth=" + dateOfBirth +
//                '}';
//    }
}