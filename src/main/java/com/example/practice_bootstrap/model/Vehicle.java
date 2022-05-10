package com.example.practice_bootstrap.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;

//@Entity
@Data
public class Vehicle {
    //@Id
    // attributes
    private String licensePlate;
    private int type;
    private int capacity;
    private String brand;
    private String model;
    private String licenceType;
    private double totalKM;

    /*
    // constructor
    public Vehicle() {

    }
    public Vehicle(String licensePlate, int type, int capacity, String brand, String model, String licenceType, double totalKM) {
        this.licensePlate = licensePlate;
        this.type = type;
        this.capacity = capacity;
        this.brand = brand;
        this.model = model;
        this.licenceType = licenceType;
        this.totalKM = totalKM;
    }

    // getters
    public String getLicensePlate() {
        return licensePlate;
    }
    public int getType() {
        return type;
    }
    public int getCapacity() {
        return capacity;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public String getLicenceType() {
        return licenceType;
    }
    public double getTotalKM() {
        return totalKM;
    }

    // setters
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
    public void setType(int type) {
        this.type = type;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setLicenceType(String licenceType) {
        this.licenceType = licenceType;
    }
    public void setTotalKM(double totalKM) {
        this.totalKM = totalKM;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "licensePlate='" + licensePlate + '\'' +
                ", type=" + type +
                ", capacity=" + capacity +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", licenceType='" + licenceType + '\'' +
                ", totalKM=" + totalKM +
                '}';
    }
    */
}
