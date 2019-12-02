package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
		String name, heshe = "";
		Integer age;
		double gpa;
		Boolean isFemale;
	System.out.print("Enter Your name : ");
	name = input.nextLine();
	System.out.print("Enter Your age : ");
	age = input.nextInt();
	System.out.print("Enter Your gpa : ");
	gpa = input.nextDouble();
	System.out.print("Are you a female ? (true/false) : ");
	isFemale = input.nextBoolean();
	heshe = isFemale ? "she" : "He";



	System.out.printf("%s is %d years old. %s has a gpa of %4.2f.\n",
            name, age, heshe, gpa);
    }
}
