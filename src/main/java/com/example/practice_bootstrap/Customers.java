package com.example.practice_bootstrap;

import java.util.Date;


//@lombok.Data

public class Customers {
    private  int customer_id;
    private String firstname;
    private String lastname;
    private int Phonenumber;
    private String Licence_nr;
    private String Licence_type;
    private Date date_of_birth;

    public Customers(int customer_id, String firstname, String lastname, int phonenumber, String licence_nr, String licence_type, Date date_of_birth) {
        this.customer_id = customer_id;
        this.firstname = firstname;
        this.lastname = lastname;
        Phonenumber = phonenumber;
        Licence_nr = licence_nr;
        Licence_type = licence_type;
        this.date_of_birth = date_of_birth;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getPhonenumber() {
        return Phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        Phonenumber = phonenumber;
    }

    public String getLicence_nr() {
        return Licence_nr;
    }

    public void setLicence_nr(String licence_nr) {
        Licence_nr = licence_nr;
    }

    public String getLicence_type() {
        return Licence_type;
    }

    public void setLicence_type(String licence_type) {
        Licence_type = licence_type;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "customer_id=" + customer_id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", Phonenumber=" + Phonenumber +
                ", Licence_nr='" + Licence_nr + '\'' +
                ", Licence_type='" + Licence_type + '\'' +
                ", date_of_birth=" + date_of_birth +
                '}';
    }
}
