package ex30;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ross Brinkman
 */

public class App {
    public static void main( String[] args ) {
        int[][] table = new int [12][12];

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                table[i][j] = (i+1) * (j+1);
                System.out.printf("%5s",table[i][j]);
            }
            System.out.print("\n");
        }
    }

}
