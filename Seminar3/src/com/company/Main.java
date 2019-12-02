package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of rows you desire:");
        int rows = input.nextInt();
        System.out.println("Enter the number of colummns your desire:");
        int columms = input.nextInt();

        int r = 0;
        int c = 0;
        while (r < rows) {
            //code here
            while (c < columms) {
                System.out.print("x");
                c++;
            }
            System.out.println();
            c = 0;
            r++;
        }


    }
}
