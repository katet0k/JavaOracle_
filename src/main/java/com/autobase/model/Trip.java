package com.autobase.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    private Request request;
    
    @ManyToOne
    private Driver driver;
    
    @ManyToOne
    private Vehicle vehicle;
    
    private String tripStatus;
    private int payment;

    // Геттери і сеттери
}
