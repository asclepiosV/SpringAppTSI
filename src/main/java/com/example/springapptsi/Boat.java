package com.example.springapptsi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Boat {
    private @Id @GeneratedValue Integer id;
    private int year;
    private String name;
    private double price;
    public Boat(){}

    public Integer getId() {
        return this.id;
    }
    public int getYear() {
        return this.year;
    }
    public String getName() {
        return this.name;
    }
    public double getPrice() {
        return this.price;
    }
}

