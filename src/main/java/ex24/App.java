package ex24;
import java.util.Scanner;
import java.util.Arrays;
import java.lang.String;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ross Brinkman
 */

public class App {
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two strings and I'll tell you if they are anagrams:\nEnter the first string: ");
        String input1 = scanner.nextLine();
        System.out.println("Enter the second string: ");
        String input2 = scanner.nextLine();

        if(isAnagram(input1, input2))
            System.out.printf("\"%s\" and \"%s\" are anagrams%n", input1, input2);
        else
            System.out.printf("\"%s\" and \"%s\" are not anagrams", input1, input2);
    }

    public static boolean isAnagram( String input1, String input2)
    {
        input1 = input1.trim().toLowerCase();
        input2 = input2.trim().toLowerCase();

        if(input1.length() != input2.length())
            return false;

        char[] tempArray1 = input1.toCharArray();
        char[] tempArray2 = input2.toCharArray();

        Arrays.sort(tempArray1);
        Arrays.sort(tempArray2);

        input1 = new String(tempArray1);
        input2 = new String(tempArray2);

        return input1.equals(input2);
    }

}
