package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int trigger = 1;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Is the person?");
            System.out.println("1)Female            2)Male");
            int g = input.nextInt();
            System.out.println("Is the person already a registered customer?");
            System.out.println("1)Yes                2)No");
            int c = input.nextInt();
            System.out.println("How old is the person");
            System.out.println("1)0-10       2)11-20     3)20+");
            int a = input.nextInt();


            if (g > 1) {
                System.out.println("Person is a Male");
            } else {
                System.out.println("Person is a Female");
            }


            if (c > 1) {
                System.out.println("No, person is not a registered customer");
            } else {
                System.out.println("Yes, Person is a registered customer");
            }

            if (a > 2) {
                System.out.println("Person is older than 20");
            } else if (a > 1) {
                System.out.println("Person is 11-20 years old");
            } else {
                System.out.println("Person is 0-10 years old");
            }

            System.out.println("Are the answers correct?");
            System.out.println("1)Yes       2)No");
            int answer = input.nextInt();
            if (answer > 1) {
                trigger = 2;
            } else {
                trigger = 1;
            }

        } while (trigger > 1);

            System.out.println("Thank You!");



    }
}
