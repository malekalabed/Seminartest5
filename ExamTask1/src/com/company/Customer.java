package com.company;

public class Customer {
    private String name;
    private String seat;

    public Customer(String name, String seat) {
        this.name = name;
        this.seat = seat;
    }

    public String getName() {
        return name;
    }

    public String getSeat() {
        return seat;
    }
}
