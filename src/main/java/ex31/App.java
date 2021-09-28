package ex31;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ross Brinkman
 */

public class App {
    public static void main( String[] args ) {
        float intensity = 55;
        System.out.println("Please enter your resting pulse: ");
        int restingPulse = ReadRestingPulse();
        System.out.println("Your age: ");
        int age = ReadAge();

        System.out.println("\nIntensity\t| Rate\n------------|--------");
        while (intensity <= 95)
        {
            System.out.printf("%d%%\t\t\t| %d bpm\n", (int)intensity, CalculateTargetHeartRate(restingPulse, age, intensity));
            intensity += 5;
        }
    }

    public static int CalculateTargetHeartRate(int restingHR, int age, float intensity)
    {
        intensity *= .01f;
        return (int)(((220 - age) - restingHR) * intensity) + restingHR;
    }

    public static int ReadAge()
    {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                return (int)scanner.nextFloat();
            } catch (InputMismatchException ime) {
                PrintNumberError();
                scanner.next();
            }
        }
    }

    public static int ReadRestingPulse()
    {
        Scanner scanner = new Scanner(System.in);
        int input;
        while (true) {
            try {
                input = (int)scanner.nextFloat();
                break;
            } catch (InputMismatchException ime) {
                PrintNumberError();
                scanner.next();
            }
        }
        return input;
    }

    public static void PrintNumberError()
    {System.out.println("Must be numeric input.");}
}
