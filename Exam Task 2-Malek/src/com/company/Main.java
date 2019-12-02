package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();

        while(true){
            System.out.println();
            System.out.println("1) Add piece");
            System.out.println("2) Write 100cm planks needed");
            System.out.print("X) ");
            int choice = input.nextInt();
            System.out.println();
            if (choice == 1){
                System.out.print("Length (cm) : ");
                int length = input.nextInt();
                input.nextLine();
                array.add(length);
            } else if (choice == 2){
                int lengthCount = 0;
                for (Integer x: array){
                    lengthCount = lengthCount + x;
                }
                int numberOfPlanks = lengthCount / 100;
                if (lengthCount % 100 != 0){
                    numberOfPlanks++;
                }
                System.out.printf("%d planks are needed. Total value (cm) : %d",
                        numberOfPlanks, lengthCount);
            }
        }
    }
}
