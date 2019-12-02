package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
	     boolean[][] board = new boolean[10][10];
	     int x = rand.nextInt( 10 );
	     int y = rand.nextInt( 10 );
	     board[y][x] = true;
        System.out.println("The ship is placed at(x= "+ x +",y= "+ y +")");
        int guessx;
                int guessy;
                int guesses = 0 ;

        do {
            guesses++;
            System.out.println("New guess;");
            System.out.print("x = ");
            guessx = input.nextInt();
            System.out.print("y = ");
            guessy = input.nextInt();
            if(board[guessy][guessx] == false){
                System.out.println("YOOOOU STOOPI");
            }else {
                System.out.println(" YOU GUESSED IT");

            }

        } while(board[guessy][guessx] == false);
        System.out.println("it took " + guesses + " guess(es)" );

    }
}
