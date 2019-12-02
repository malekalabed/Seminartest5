package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Main myApp = new Main();

        System.out.printf("Welcome to our bank!\n");

        System.out.print("Please, enter your name : ");
        String name = in.nextLine();
        System.out.print("Please, enter your address : ");
        String address = in.nextLine();
        System.out.print("Please, enter your phone number : ");
        String phoneNumber = in.nextLine();
        System.out.print("Please, enter your account number : ");
        int accountNumber = in.nextInt();

        double balance = 0;
        boolean exit = false;

        do {
            System.out.printf("%n1. Deposit%n2. Withdraw%n3. View account%n4. Exit%n");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    balance = myApp.transaction("deposit", balance);
                    break;
                case 2:
                    balance = myApp.transaction("withdraw", balance);
                    break;
                case 3:
                    myApp.info(name, address, phoneNumber, accountNumber, balance);
                    break;
                case 4:
                    System.out.println("Are you sure you want to exit ? (yes/no)");
                    String exitChoice = in.next();
                    if (exitChoice.equalsIgnoreCase("yes") || exitChoice.equalsIgnoreCase("y")) {
                        System.out.println("Thank you for visiting us.");
                        exit = true;
                    }
                    break;
                default:
                    System.out.println("Please enter a proper answer.");
                    break;
            }
        } while (!exit);

    }

    private double deposit(double balance, double depositAmount) {
        balance += depositAmount;
        return balance;
    }

    private double withdraw(double balance, double withdrawAmount) {
        balance -= withdrawAmount;
        return balance;
    }

    private void info(String name, String address, String phoneNumber, int accountNumber, double balance) {
        System.out.printf("Name : %s%nAddress : %s%nPhone number : %s%nAccount number : %d%n", name, address, phoneNumber, accountNumber);
        System.out.println("Balance : " + balance);
    }

    private double transaction(String actionType, double balance) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the amount you would like to " + actionType + " : ");
        if (actionType.equals("deposit")) {
            double depositAmount = in.nextDouble();
            balance = deposit(balance, depositAmount);
        } else if (actionType.equals("withdraw")) {
            double withdrawAmount = in.nextDouble();
            balance = withdraw(balance, withdrawAmount);
        }
        System.out.println("Your new balance is : " + balance);
        return balance;
    }
    }

