package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main myApp = new Main();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word to be translated: ");
        String output = input.nextLine();
        String finalWord = myApp.getTranslation(output);
        System.out.printf("Robber language: %s", finalWord);
    }

    private String getTranslation(String input){
        String finalWord = "";
        for (int j = 0; j < input.length(); j++){
            char c = input.charAt(j);
            switch (c){
                case 'A':
                    finalWord += "A";
                    break;
                case 'a':
                    finalWord += "a";
                    break;
                case 'E':
                    finalWord += "E";
                    break;
                case 'e':
                    finalWord += "e";
                    break;
                case 'I':
                    finalWord += "I";
                    break;
                case 'i':
                    finalWord += "i";
                    break;
                case 'M':
                    finalWord += "MOM";
                    break;
                case 'm':
                    finalWord += "mom";
                    break;
                case 'Q':
                    finalWord += "QOQ";
                    break;
                case 'q':
                    finalWord += "qoq";
                    break;
                case 'U':
                    finalWord += "U";
                    break;
                case 'u':
                    finalWord += "u";
                    break;
                case 'Y':
                    finalWord += "Y";
                    break;
                case 'y':
                    finalWord += "y";
                    break;
                case 'B':
                    finalWord += "BOB";
                    break;
                case 'b':
                    finalWord += "bob";
                    break;
                case 'F':
                    finalWord += "FOF";
                    break;
                case 'f':
                    finalWord += "fof";
                    break;
                case 'J':
                    finalWord += "JOJ";
                    break;
                case 'j':
                    finalWord += "joj";
                    break;
                case 'N':
                    finalWord += "NON";
                    break;
                case 'n':
                    finalWord += "non";
                    break;
                case 'R':
                    finalWord += "ROR";
                    break;
                case 'r':
                    finalWord += "ror";
                    break;
                case 'V':
                    finalWord += "VOV";
                    break;
                case 'v':
                    finalWord += "vov";
                    break;
                case 'Z':
                    finalWord += "ZOZ";
                    break;
                case 'z':
                    finalWord += "zoz";
                    break;
                case 'C':
                    finalWord += "COC";
                    break;
                case 'c':
                    finalWord += "coc";
                    break;
                case 'G':
                    finalWord += "GOG";
                    break;
                case 'g':
                    finalWord += "gog";
                    break;
                case 'K':
                    finalWord += "KOK";
                    break;
                case 'k':
                    finalWord += "kok";
                    break;
                case 'O':
                    finalWord += "O";
                    break;
                case 'o':
                    finalWord += "o";
                    break;
                case 'S':
                    finalWord += "SOS";
                    break;
                case 's':
                    finalWord += "sos";
                    break;
                case 'W':
                    finalWord += "WOW";
                    break;
                case 'w':
                    finalWord += "wow";
                    break;
                case 'D':
                    finalWord += "DOD";
                    break;
                case 'd':
                    finalWord += "dod";
                    break;
                case 'H':
                    finalWord += "HOH";
                    break;
                case 'h':
                    finalWord += "hoh";
                    break;
                case 'L':
                    finalWord += "LOL";
                    break;
                case 'l':
                    finalWord += "lol";
                    break;
                case 'P':
                    finalWord += "POP";
                    break;
                case 'p':
                    finalWord += "pop";
                    break;
                case 'T':
                    finalWord += "TOT";
                    break;
                case 't':
                    finalWord += "tot";
                    break;
                case 'X':
                    finalWord += "XOX";
                    break;
                case 'x':
                    finalWord += "x";
                    break;
            }
        }
        return finalWord;
    }
}