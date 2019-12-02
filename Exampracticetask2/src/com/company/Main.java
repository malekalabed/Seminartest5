package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
	boolean[][] board = new boolean[10][10];
	int x = rand.nextInt(10);
	int y = rand.nextInt(10);
	board[x][y] = true;
        System.out.println("The ship is placed at x= " + x +" y=" + y +"");
        int guessx;
        int guessy;
        int guesses = 0;
         do{
             System.out.println("New guess ");
             System.out.print("X = ");
             guessx = input.nextInt();
             System.out.print("Y = ");
             guessy = input.nextInt();
             if(board [guessx][guessy] == false);
             System.out.println("YOU STOOPID");
             else
         }
         while(board[guessx][guessy] == false);

    }
}
