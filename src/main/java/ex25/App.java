package ex25;

import java.util.Scanner;
import java.lang.String;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ross Brinkman
 */

public class App {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a password and I will evaluate it: ");

        Password password = new Password();
        password.setPassword(scanner.nextLine());
        int validationStatus = password.passwordValidator();

        String strength = SetStatus(validationStatus);

        System.out.printf("The password '%s' is a %s password\n", password.getPassword(), strength);
    }

    public static String SetStatus(int status)
    {
        switch (status)
        {
            case 1:
                return "very weak";
            case 2:
                return "weak";
            case 3:
                return "medium";
            case 4:
                return "strong";
            case 5:
                return "very strong";
            default:
                return "nonexistent";
        }
    }
}
