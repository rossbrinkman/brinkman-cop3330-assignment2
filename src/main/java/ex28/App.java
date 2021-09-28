package ex28;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.text.DecimalFormat;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ross Brinkman
 */

public class App {
    public static void main( String[] args ) {
        DecimalFormat f = new DecimalFormat("#0.##");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 5 numbers");
        List<Float> floats = new ArrayList<>();

        String input;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            input = scanner.nextLine();
            floats.add(Float.parseFloat(input));
        }
        float number = AddNumbers(floats);

        System.out.printf("Total is %s", f.format(number));
    }

    public static float AddNumbers(List<Float> nums)
    {
        float number = 0;
        for (int i = 0; i < 5; i++) {
            number += nums.get(i);
        }
        return number;
    }
}
