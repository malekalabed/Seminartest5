package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("What is your name? ");
	String yourName;
	yourName = input.nextLine();
	System.out.printf("Hello, %S!!!\n", yourName);

    }
}
