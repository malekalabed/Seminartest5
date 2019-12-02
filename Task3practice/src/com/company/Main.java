package com.company;

import com.company.Animal;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Andreas Nilsson <andreas.nilsson@hkr.se>
 */
public class Main {
    private Scanner input = new Scanner(System.in);
    private ArrayList<Animal> animals = new ArrayList<>();

    public static void main(String[] args) {
        Main myApp = new Main();

        int choice;

        do{
            myApp.printMenu();
            choice = myApp.input.nextInt();
            myApp.input.nextLine();
            switch (choice) {
                case 1:
                    myApp.createTerrestrial();
                    break;
                case 2:
                    myApp.createAquatic();
                    break;
                case 3:
                    myApp.viewAnimals();
                    break;
            }
        } while(choice != 4);
    }

    private void viewAnimals() {
        for(Animal a : animals) {
            System.out.println(a);
        }
    }

    private void createTerrestrial() {
        System.out.print("Enter name: ");
        String name = input.nextLine();
        System.out.print("Enter number of legs: ");
        int legs = input.nextInt();

        Terrestrial t = new Terrestrial();
        t.setNumberOfLegs(legs);
        t.setName(name);

        animals.add(t);
    }

    private void createAquatic() {
        System.out.print("Enter name: ");
        String name = input.nextLine();
        System.out.print("Enter number of fins: ");
        int fins = input.nextInt();

        Aquatic a = new Aquatic(fins, name);

        animals.add(a);
    }

    private void printMenu() {
        System.out.println("---- Menu ----");
        System.out.println("1) Add a terrestrial animal");
        System.out.println("2) Add a Aquatic animal");
        System.out.println("3) View all animals");
        System.out.println("4) Exit");
    }
}