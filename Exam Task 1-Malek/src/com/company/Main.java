package com.company;

public class Main {
    public static void main(String[] args) {
        Laptoop laptop = new Laptoop("IKEA", "John", 150);
        Stationarry stationary = new Stationarry("ICA", "Computer Lab");

        System.out.println("Laptop:\nStore bought in: " + laptop.getStoreBoughtIn());
        System.out.println("Name of user: " + laptop.getUserName());
        System.out.println("Minutes of battery left: " + laptop.getMinutesLeft() + " min");
        System.out.println();

        System.out.println("Stationary:\nStore bought in: " + stationary.getStoreBoughtIn());
        System.out.println("Placed in room: " + stationary.getRoomPlacedIn());
    }
}

