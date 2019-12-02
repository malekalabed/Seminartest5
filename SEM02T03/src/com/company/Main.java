package com.company;

import java.util.Scanner;

public class Main {
    private static  final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Main myApp = new Main();

        System.out.print("Please specify the amount of packages you would like to have delivered : ");
        int packages = in.nextInt();
        myApp.ask("length");
        double length = in.nextDouble();
        myApp.ask("width");
        double width = in.nextDouble();
        myApp.ask("height");
        double height = in.nextDouble();

        myApp.packageVolume(packages, length, width, height);

    }

    private void packageVolume(int numberOfPackages, double length, double width, double height) {
        double volume = length * width * height;
        System.out.printf("%d stacks with the size %.0fx%.0fx%.0f will occupy the volume %.2f", numberOfPackages, length, width, height, volume);
    }

    private void ask(String thing) {
        if (thing.equals("width")) {
            System.out.print("Please specify the " + thing + " of the package  : ");
        } else {
            System.out.print("Please specify the " + thing + " of the package : ");
        }
    }
    }

