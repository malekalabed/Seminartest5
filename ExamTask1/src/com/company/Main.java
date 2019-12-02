package com.company;




import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private Scanner input = new Scanner(System.in);
    private ArrayList<Customer> Customers = new ArrayList<>();


    public static void main(String[] args) {
        Main myApp = new Main();
        int choice;
        do {
            System.out.println("-----Menu-----");
            System.out.println("1)-----Add Booking-----");
            System.out.println("2)-----View Booking-----");
            System.out.println("3)-----Exit-----");
            choice = myApp.input.nextInt();
            myApp.input.nextLine();
            switch (choice) {
                case 1:
                    myApp.addPassenger();
                    break;
                case 2:
                    break;
                case 3:

            }

        } while (choice != 3);


    }
    private void addPassenger() {
        System.out.println("Enter Passenger name ");
        String Passengername = input.nextLine();
        System.out.println("Enter Seat Desired ");
        String seatnumber = input.nextLine();

        Customer customer = new Customer(seatnumber, Passengername);
        Customers.add(customer);



    }
    private void viewbookings(){
        for (int i = 0,)

    }
}
