package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Main myApp = new Main();
	int positive = myApp.nonnegativenumber();
        System.out.println("you entered  " + positive);
    }
    public int nonnegativenumber(){
        Scanner input = new Scanner(System.in);
        int number;
        do {
            System.out.println("Please enter a positive number");
            number = input.nextInt();
        } while (number < 0);
        return number;
    }

}
