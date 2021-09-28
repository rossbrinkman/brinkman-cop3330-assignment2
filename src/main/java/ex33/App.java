package ex33;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ross Brinkman
 */

public class App {
    public static void main(String[] args) {
        String[] displays = {"Yes", "No", "Maybe", "Ask again later"};
        Scanner scanner = new Scanner(System.in);
        int randomNum = GenerateNumber(0,3);

        System.out.println("What's your question? ");
        scanner.nextLine();

        System.out.printf("%s", displays[randomNum]);
    }

    public static int GenerateNumber(int min, int max)
    {
        return ThreadLocalRandom.current().nextInt(min, max+1);
    }
}
