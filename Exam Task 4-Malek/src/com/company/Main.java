package com.company;

import java.util.Scanner;
public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int arrayLength = 5;
        String[] first = new String[arrayLength];
        String[] second = new String[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            String inputWord;
            System.out.printf("Enter word %d: ", (i + 1));
            inputWord = input.nextLine();
            first[i] = inputWord;
            System.out.printf("Translation for word %d: ", (i + 1));
            inputWord = input.nextLine();
            second[i] = inputWord;
        }

        for (int i = 0; i < first.length; i++) {
            boolean exit = false;
            while (!exit) {
                System.out.printf("Translate %s: ", first[i]);
                String translation = input.nextLine();
                if (translation.equalsIgnoreCase(second[i])) {
                    exit = true;
                }
            }
        }

        System.out.println("Great work!");
    }
}

