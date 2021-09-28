package ex35;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ross Brinkman
 */

public class App {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = new ArrayList<>();
        int randomInt;
        String nextInput;

        do{
            System.out.println("Enter a name: ");
            nextInput = scanner.nextLine();
            if(!nextInput.isEmpty())
                input.add(nextInput);
        } while (!nextInput.isEmpty());

        randomInt = GenerateNumber(0, input.size());
        System.out.printf("The winner is... %s", input.get(randomInt));
    }

    public static int GenerateNumber(int min, int max)
    {
        return ThreadLocalRandom.current().nextInt(min, max+1);
    }
}
