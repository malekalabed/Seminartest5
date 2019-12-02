package com.company;

import java.util.Scanner;

public class Main {

    private static Object exception;

    public static void main(String[] args) {
        System.out.println("Please input a integer");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Please input a integer");
        Scanner u = new Scanner(System.in);
        int a = in.nextInt();

        System.out.println("the sum of the first number divided by the second number is  " + (n / a) + ".");


    }
}
