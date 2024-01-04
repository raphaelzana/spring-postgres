package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Customer {

    @Id
    private Long id;
    private String firstname;
    private String lastname;

    protected Customer() {}

    public Customer(Long id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s']",
                id, firstname, lastname);
    }

    public Long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
}
