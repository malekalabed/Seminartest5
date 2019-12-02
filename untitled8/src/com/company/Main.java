package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
		String name;
		Integer age;
		double gpa;
		System.out.print("Enter your name : ");
		name = input.nextLine();
		System.out.print("Enter your age : ");
		age = input.nextInt();
		System.out.print("Enter your gpa :");
		gpa = input.nextDouble();


	System.out.printf("%s is %d years old. %s has a gpa of %4.1f.\n",
			name, age, name, gpa);

    }
}
