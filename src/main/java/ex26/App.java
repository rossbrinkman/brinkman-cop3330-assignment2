package ex26;

import java.util.Scanner;
import java.util.InputMismatchException;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ross Brinkman
 */

public class App {
    public static void main( String[] args ) {

        System.out.println("What is your balance? ");
        PaymentCalculator paymentCalculator = new PaymentCalculator();

        paymentCalculator.setCreditCardBalance(scanFloat());
        System.out.println("What is the APR on the card (as a percent)? ");
        paymentCalculator.setaPR(scanFloat());
        System.out.println("What is the monthly payment you can make? ");
        paymentCalculator.setMonthlyPayment(scanFloat());

        int months = paymentCalculator.calculateMonthsUntilPaidOff();
        System.out.printf("It will take you %d months to pay off this card.", months);
    }

    public static float scanFloat()
    {
        Scanner scanner = new Scanner(System.in);
        float num;
        try{num = scanner.nextFloat();}
        catch (InputMismatchException inputMismatchException)
        {
            throw new RuntimeException("Needs numeric value");
        }
        return num;
    }
}
