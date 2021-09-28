package ex32;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ross Brinkman
 */

public class App {
    public static void main( String[] args ) {
        char playAgain;
        System.out.println("Let's play Guess the Number! ");

        do {
            System.out.println("\nEnter the difficulty level (1, 2, or 3):");
            int difficultyLevel = ReadNumericInput();
            int randomNumber = CalculateNumber(difficultyLevel);
            System.out.println("I have my number, what's your guess? ");
            GameLoop(randomNumber);
            System.out.println("\n\nDo you wish to play again (Y/N)? ");
        }while (ReadCharInput() == 'y');
    }

    public static void GameLoop(int randomNum)
    {
        GuessManager guessManager = new GuessManager();
        int checkResult;

        do {
            guessManager.ReadGuess();
            checkResult = CheckResult(guessManager.getGuess(), randomNum);
            PrintGuessResult(checkResult, guessManager.getGuesses());
        }while (checkResult != 0);
    }

    public static int CheckResult(int a, int b)
    {
        return Integer.compare(a, b);
    }

    public static void PrintGuessResult(int result, int guesses)
    {
        switch (result)
        {
            default:
                System.out.println("Too low. Guess again: ");
                break;
            case 0:
                System.out.printf("You got it in %d guesses!", guesses);
                break;
            case 1:
                System.out.println("Too high. Guess again: ");
                break;
        }
    }

    public static int CalculateNumber(int difficulty)
    {
        switch (difficulty)
        {
            default:
                return ThreadLocalRandom.current().nextInt(1, 10);
            case 2:
                return ThreadLocalRandom.current().nextInt(1, 100);
            case 3:
                return ThreadLocalRandom.current().nextInt(1, 1000);
        }

    }
    public static int ReadNumericInput()
    {
        Scanner scanner = new Scanner(System.in);

        int input;
        while (true) {
            try {
                input = (int)scanner.nextFloat();
                break;
            } catch (InputMismatchException ime) {
                PrintError("a number ");
                scanner.next();
            }
        }
        return input;
    }
    public static char ReadCharInput()
    {
        Scanner scanner = new Scanner(System.in);
        String input;
        while (true) {
            input = scanner.nextLine();
            input = input.trim().toLowerCase();
            if(input.length() != 1 || (!input.equals("y") && !input.equals("n")))
                PrintError("'y' or 'n' ");
            else
                break;
        }
        char[] tempArray = input.toCharArray();
        return tempArray[0];
    }
    public static void PrintError(String type)
    {
        System.out.printf("Invalid input, must be %s: ", type);
    }
}
