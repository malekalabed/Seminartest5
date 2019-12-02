package com.company;

import java.util.Scanner;

public class Main {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Main myApp = new Main();
        System.out.print("Please enter your current balance : ");
        double balance = in.nextDouble();
        for (int i = 0; i < 9; i++) {
            double interestRate = i + 2;
            myApp.interestRate(balance, interestRate);
            System.out.printf("--- --- ---");
        }
    }

    private void interestRate(double balance, double interest) {
        double newBalance = balance + balance * interest / 100;
        char percent = '%';
        System.out.printf("--- --- ---%nInitial amount         : %.2f%nInterest rate          : %.2f%c%nBalance after one year : %.2f%n", balance, interest, percent, newBalance);
    }
    }

