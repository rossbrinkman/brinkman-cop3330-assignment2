package ex27;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ross Brinkman
 */

public class App {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter the last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Enter the ZIP code: ");
        String zipCode = scanner.nextLine();
        System.out.println("Enter the employee ID: ");
        String employeeID = scanner.nextLine();

        String output = ValidateInput(firstName, lastName, zipCode, employeeID);
        if(output.isEmpty())
            System.out.print("There were no errors found.");
        else
            System.out.print(output);
    }

    public static String ValidateInput(String firstName, String lastName, String zipCode, String employeeID)
    {
        String firstNameOutput, lastNameOutput, employeeIDOutput, zipCodeOutput;

        if(ValidateFirstName(firstName) == 1)
            firstNameOutput = "";
        else if(ValidateFirstName(firstName) == -1)
            firstNameOutput = "The first name must be at least 2 characters long.\n";
        else
            firstNameOutput = "The first name must be at least 2 characters long.\n" + IfEmpty("first name");

        if(ValidateLastName(lastName) == 1)
            lastNameOutput = "";
        else if(ValidateLastName(lastName) == -1)
            lastNameOutput = "The last name must be at least 2 characters long.";
        else
            lastNameOutput = "The last name must be at least 2 characters long." + IfEmpty("last name");

        if(ValidateEmployeeID(employeeID) == 1)
            employeeIDOutput = "";
        else if(ValidateEmployeeID(employeeID) == -1)
            employeeIDOutput = "\nThe employee ID must be in the format of AA-1234.";
        else
            employeeIDOutput = "\nThe employee ID must be in the format of AA-1234." + IfEmpty("employee ID");

        if(ValidateZIPCode(zipCode) == 1)
            zipCodeOutput = "";
        else if(ValidateZIPCode(zipCode) == -1)
            zipCodeOutput = "\nThe zipcode must be a 5 digit number.";
        else
            zipCodeOutput = "\nThe zipcode must be a 5 digit number." + IfEmpty("ZIP code");

        return firstNameOutput + lastNameOutput + employeeIDOutput + zipCodeOutput;
    }
    public static int ValidateFirstName(String firstName)
    {
        if(firstName.length() == 0)
            return 0;
        else if(firstName.length() <2)
            return -1;
        else
            return 1;
    }
    public static int ValidateLastName(String lastName)
    {
        if(lastName.length() == 0)
            return 0;
        else if(lastName.length() <2)
            return -1;
        else
            return 1;
    }
    public static int ValidateZIPCode(String zipCode)
    {
        zipCode = zipCode.trim();
        if(zipCode.isEmpty())
            return 0;
        else if(zipCode.length() != 5)
            return -1;
        char[] zipChars = zipCode.toCharArray();
        for(char c : zipChars)
        {
            if(!Character.isDigit(c))
                return -1;
        }
        return 1;
    }
    public static int ValidateEmployeeID(String iD)
    {
        if(iD.isEmpty())
            return 0;
        else if(iD.length() < 6)
            return -1;
        iD = iD.trim();
        char[] IDChars = iD.toCharArray();
        if(IDChars[2] != '-')
            return -1;
        for (int i = 0; i < 2; i++) {
            if(!Character.isLetter(IDChars[i])) {
                return -1;
            }
        }
        for (int i = 3; i < 6; i++) {
            if(!Character.isDigit(IDChars[i])) {
                return -1;
            }
        }
        return 1;
    }
    public static String IfEmpty(String name) {
        return "\nThe " + name + " must be filled in.";
    }
}
