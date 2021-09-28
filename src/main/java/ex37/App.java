package ex37;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ross Brinkman
 */

public class App {
    public static void main( String[] args ) {
        int length, specialChars, numbers;

        System.out.print("What's the minimum length? ");
        length = ReadInput();
        System.out.print("How many special characters? ");
        specialChars = ReadInput();
        System.out.print("How many numbers? ");
        numbers = ReadInput();
        System.out.printf("Your password is %s", CreatePassword(length, specialChars, numbers));
    }

    public static String CreatePassword(int maxLength, int maxSpecialChars, int maxNumbers)
    {
        char[] password = new char[maxLength];
        int specialCount = 0, numCount = 0, letterCount = 0, maxLetters = (maxLength - maxNumbers) - maxSpecialChars;
        for(int i=0; i<password.length; i++)
        {
            int rand = GenerateNumber(0,2);
            switch (rand)
            {
                default:
                    if(letterCount < maxLetters) {
                        password[i] = GenerateLetter();
                        letterCount++;
                    }
                    else
                        i--;
                    break;
                case 1:
                    if(numCount < maxNumbers)
                    {
                        int rnd = GenerateNumber(0,9);
                        password[i] = Character.forDigit(rnd, 10);
                        numCount++;
                    }
                    else
                        i--;
                    break;
                case 2:
                    if(specialCount < maxNumbers)
                    {
                        password[i] = GenerateSpecialCharacter();
                        specialCount++;
                    }
                    else
                        i--;
                    break;
            }
        }
        return String.valueOf(password);
    }

    public static char GenerateSpecialCharacter()
    {
        char[] list = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '?', '/', '<', '>', '.'};
        return list[GenerateNumber(0,list.length-1)];
    }

    public static int GenerateNumber(int min, int max)
    {
        return ThreadLocalRandom.current().nextInt(min, max+1);
    }

    public static char GenerateLetter()
    {
        Random r = new Random();
        return (char)('a'+ r.nextInt(26));
    }

    public static int ReadInput() {
        Scanner scanner = new Scanner(System.in);
        String input;
        int output;
        while (true) {
            input = scanner.next();
            try {
                output = Integer.parseInt(input);
                return output;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid input. Must be a number.");
            }
        }
    }
}
