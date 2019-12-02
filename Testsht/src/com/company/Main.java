package com.company;

import java.util.Scanner;
public class Main {
    private final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Main myApp = new Main();
        myApp.getphoentic();

    }

    private void getphoentic() {

        char letter;
        String phonetic = null;


        Scanner kb = new Scanner(System.in);


        System.out.print("Enter a letter to be translated (or EXIT to quit program) : ");
        letter = kb.next().charAt(0);



          switch (Character.toUpperCase(letter)) {
              case 'A':
                  phonetic = "Alpha";
                  break;
              case 'B':
                  phonetic = "Bravo";
                  break;
              case 'C':
                  phonetic = "Charlie";
                  break;
              case 'D':
                  phonetic = "Delta";
                  break;
              case 'E':
                  phonetic = "Echo";
                  break;
              case 'F':
                  phonetic = "Foxtrot";
                  break;
              case 'G':
                  phonetic = "Golf";
                  break;
              case 'H':
                  phonetic = "Hotel";
                  break;
              case 'I':
                  phonetic = "India";
                  break;
              case 'J':
                  phonetic = "Juliet";
              case 'K':
                  phonetic = "Kilo";
                  break;
              case 'L':
                  phonetic = "Lima";
                  break;
              case 'M':
                  phonetic = "Mike";
                  break;
              case 'N':
                  phonetic = "November";
                  break;
              case 'O':
                  phonetic = "Oscar";
                  break;
              case 'P':
                  phonetic = "Papa";
                  break;
              case 'Q':
                  phonetic = "Quebec";
                  break;
              case 'R':
                  phonetic = "Romeo";
                  break;
              case 'S':
                  phonetic = "Sierra";
                  break;
              case 'T':
                  phonetic = "Tango";
                  break;
              case 'U':
                  phonetic = "Uniform";
                  break;
              case 'V':
                  phonetic = "Victor";
                  break;
              case 'W':
                  phonetic = "Whiskey";
                  break;
              case 'X':
                  phonetic = "X-Ray";
                  break;
              case 'Y':
                  phonetic = "Yankee";
                  break;
              case 'Z':
                  phonetic = "Zulu";
                  return;

          }System.out.println(phonetic);

        }


      }








