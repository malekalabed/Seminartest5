package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Main myApp = new Main ();
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.print("Enter a : ");
        a = input.nextInt();
        System.out.print("Enter b: ");
        b = input.nextInt();
        System.out.print("Enter c : ");
        c = input.nextInt();
        int min = myApp.min( a, b, c);
        double max = myApp.max( a, b, c);
        double avg = myApp.avg( a, b, c);
        double sum = myApp.sum(a, b, c);
        System.out.println("Minimum is " + min);
        System.out.println("Maximum is " + max);
        System.out.println("Average is " + avg);
        System.out.println("Sum is " + sum);


    }
    private int min(int a, int b, int c) {

        int min = a;

        if(b < min ){
            min = b;
        }
        if(c < min){
            min = c;
        }
        return min;

    }
    private double max(int a, int b, int c) {

        double max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
    private double avg(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }
    private double sum(int a, int b, int c) {
        return (a + b + c);
    }

}
