package ex38;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ross Brinkman
 */

public class App {
    public static void main( String[] args ) throws IOException {
        BufferedReader bi = new BufferedReader(
                new InputStreamReader(System.in));
        String[] input;

        System.out.print("Enter a list of numbers separated by spaces: ");
        input = bi.readLine().split(" ");
        int[] inputArray = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            inputArray[i] = Integer.parseInt(input[i]);
        }

        Object[] evenNumbers = filterEvenNumbers(inputArray);
        System.out.printf("The even numbers are", evenNumbers);
        for (Object evenNumber : evenNumbers) {
            System.out.printf(" %s", evenNumber);
        }
        System.out.print(".");
    }

    public static Object[] filterEvenNumbers(int[] nums)
    {
        List<Integer> evenNums = new ArrayList<>();

        for(int i : nums)
        {
            if(i % 2 == 0)
                evenNums.add(i);
        }
        return evenNums.toArray();
    }

}
