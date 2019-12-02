package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //a newly started company wants to keep track of all the computers they will buy and use. they are planning to use both stationary computers and laptops


        } catch (Exception e) {
            e.printStackTrace();
        }
        //your task is to implement a program that does this the program shall be developed in accordance with the following
        // () -> requirements


        //1)creat a class that represents a laptop. call it laptop. for all laptops it shall be possible to see who is currently using it and also how long the battery lasts ( in minutes)

        //2) create a class that represents a stationary computer, call it Stationary. the stationary computers shall store in what room they are currently placed.

        //3) both laptops and stationary computers shall store information about what shop they bought in. use a superclass called Computer  that stores this information and make stationary and laptop subclassesof the computter class

        public class Main {
            private Scanner input = new Scanner(System.in);
            private Customer[] seats = new Customer[100];

            public static void main(String[] args) {
                Main myApp = new Main();

                int option;
                do {
                    myApp.printMenu();
                    option = myApp.input.nextInt();
                    myApp.input.nextLine();  switch (option) {
                        case 1:
                            myApp.bookCustomer();
                            break;
                        case 2:
                            myApp.viewBookings();
                            break;
                        default:
                            System.out.println("Not a valid option. Select 1, 2 or 3.");
                    }
                } while (option != 3);
                System.out.println("Thank you! Have a good flight.");
            }

// 4)the subclass and the super class shall all have contructors that assigns all instance variables new values that are sent to the contrusctor via parameters. the classes shall also have getter methods


            // 5) create two objects in the main method in the main class, one laptop object and one stationary computer object allahuakbar and assign data to all the instant variables in the two objects using the contructors

            // 6) use the getter methods to print all information from the two objects to the screen

            // the program must have -four classes (three + main) -one superclass  -two subclasses  -two objects  -getter methods   -constructors(taking parameters)
    }
}
