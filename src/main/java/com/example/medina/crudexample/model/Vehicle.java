package com.example.medina.crudexample.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Vehicle {
    private final String d;
    private final UUID id;
    private final String firstName;
    private final String lastName;

    public Vehicle(String d, @JsonProperty("id") UUID id,
                   @JsonProperty("firstName") String firstName,
                   @JsonProperty("lastName") String lastName) {
        this.d = d;
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public UUID getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
