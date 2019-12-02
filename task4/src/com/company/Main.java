package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double stud;
        double  u=0, low=0, mid = 0, high = 0 ;
        double score;

        System.out.println("Please insert the number of students");
        stud = input.nextInt();

        for (int i = 1; i <= stud; i++ ) {
            System.out.println("Please insert grade for student number (" + i + ") (Scores go from 0p to 40p)");
            score = input.nextDouble();

            if (score >= 0 && score < 20) {
                u++;
            } else if (score >= 20 && score < 30) {
                low++;
            } else if (score >= 30 && score < 36) {
                mid++;
            } else if (score >= 36 && score <= 40) {
                high++;
            } else {
                System.out.println("Error, wrong score inserted!");
                i--;
            }
        }
        double a = 100*u/stud, b = 100*low/stud, c = 100*mid/stud, d = 100*high/stud;
        char p = '%';
        System.out.printf("%nNumber of 'U (Fail)' grades: %.0f (%.2f%c)", u, a, p);
        System.out.printf("%nNumber of '3' grades: %.0f (%.2f%c)", low, b, p);
        System.out.printf("%nNumber of '4' grades: %.0f (%.2f%c)", mid, c, p);
        System.out.printf("%nNumber of '5' grades: %.0f (%.2f%c)", high, d, p);
    }
}