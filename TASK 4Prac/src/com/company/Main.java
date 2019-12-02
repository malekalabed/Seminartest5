package com.company;/*
 * Developed at Kristianstad University
 * URL: http://www.hkr.se
 */


import com.company.Visitor;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ArrayList<Visitor> uiu = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.print("How many visitors will there be? ");
        int visitorCount = input.nextInt();
        input.nextLine();

        for (int i = 0; i < visitorCount; i++) {
            System.out.print("Enter name: ");
            String name = input.nextLine();
            System.out.print("Enter company: ");
            String company = input.nextLine();

            Visitor v = new Visitor(name, company);
            uiu.add(v);
        }

        for(Visitor o : uiu) {
            System.out.printf("Conference        %s%n", o.getName());
            System.out.format("(visitor)         %s%n", o.getCompany());
            System.out.println();
        }

    }
}