package com.company;

import java.util.Scanner;

public class Main {
    private static final Scanner in = new Scanner(System.in);
    private double balance;
    private double finalFreeMoney;

    public static void main(String[] args) {
        Main myApp = new Main();

        System.out.print("Please, enter your balance : ");
        myApp.balance = in.nextDouble();
        for (int i = 0; i < 10; i++) {
            int depositsLeft = 9 - i;
            double money = myApp.addingStep();
            if (i < 8) {
                System.out.printf("Your new balance is %.2f SEK%n", money);
                System.out.printf("You have %d deposits left.%n", depositsLeft);
            } else if ( i == 8 ){
                System.out.printf("Your new balance is %.2f SEK%n", money);
                System.out.printf("You have %d left deposit left.%n", depositsLeft);
            } else {
                System.out.printf("Your final balance is %.2f SEK%n", money);
            }
        }
    }

    private double addingStep() {
        System.out.printf("--- --- ---%nPlease enter the amount you would like to deposit : ");
        double deposit = in.nextDouble();
        finalFreeMoney = freeMoney(deposit);
        balance += finalFreeMoney;
        return balance;
    }

    private double freeMoney(double money) {
        finalFreeMoney = money + (money * 0.1);
        return finalFreeMoney;
    }

    }

