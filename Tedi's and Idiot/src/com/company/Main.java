package com.company;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main myApp = new Main();


        myApp.menu();

    }

    public void printMenu(){
        System.out.format("Welcome to Call Answering System:\n" +
                "(1) - View Calls \n" +
                "(2) - Add Calls \n" +
                "(3) - Remove Calls \n" +
                "(4) - Quit \n");
    }
    public void menu(){
        Call myApp = new Call();
        Scanner input = new Scanner(System.in);
        int choice = 0;

        while(choice != 4){
            printMenu();
            System.out.println();
            System.out.println("Enter your Choice:");
            choice = input.nextInt();
            System.out.println("---------------------------------");

            switch (choice){
                case 1:
                    if(myApp.queue.size() == 0){
                        System.out.println("There are no calls in the queue");
                    }else{
                    for(Call caller: myApp.queue){
                        System.out.println(caller);
                    }}
                    break;
                case 2:
                    System.out.println("Enter callers name:");
                    String name = input.next();
                    // input.next();
                    System.out.println("Enter callers number:");
                    int callerID = input.nextInt();
                    Call caller = new Call(name, callerID);
                    myApp.addToArray(caller);
                    break;
                case 3:
                    myApp.finnishCall();
                    break;
                case 4:
                    System.out.println("Thank you for using this app!");
                    break;
                    default:
                        System.out.println("Enter a valid choice!");
            }


        }

    }




}
