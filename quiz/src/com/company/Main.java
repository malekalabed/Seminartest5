package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] Passengers = new String[4];

        for(int i=0; i < Passengers.length; i++){
            System.out.format("Enter Name %d", (i+1));
            Passengers[0] = input.nextLine();


        }
        System.out.println(Passengers[0]);

    }
}
