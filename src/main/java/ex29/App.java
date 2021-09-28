package ex29;

import java.util.Scanner;
import java.text.DecimalFormat;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ross Brinkman
 */

public class App {
    public static void main( String[] args ) {
        DecimalFormat f = new DecimalFormat("#0.##");
        System.out.println("What is the rate of return? ");
        float validInput = ValidateInput();
        float years = CalculateYears(validInput);
        System.out.printf("It will take %s years to double your initial investment.", f.format(years));
    }

    public static float CalculateYears(float rate)
    {
        return 72/rate;
    }

    public static float ValidateInput()
    {
        Scanner scanner = new Scanner(System.in);
        float correctInput;

        while(true) {
            String input = scanner.nextLine();
            try {
                correctInput = Float.parseFloat(input);
            }
            catch (NumberFormatException nfe)
            {
                PrintInvalid();
                continue;
            }
            if(correctInput == 0f)
                PrintInvalid();
            else
                return correctInput;
        }

    }

    public static void PrintInvalid()
    {
        System.out.println("Sorry, that's not a valid input");
    }
}
