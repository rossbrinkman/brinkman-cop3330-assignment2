package ex34;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ross Brinkman
 */

public class App {
    public static void main( String[] args ) {
        List<String> list =new ArrayList<>();
        list.add("John Smith"); list.add("Jackie Jackson"); list.add("Chris Jones");
        list.add("Amanda Cullen"); list.add("Jeremy Goodwin");
        Scanner scanner = new Scanner(System.in);

        System.out.printf("There are %d employees", list.size());
        for(String s : list)
        {
            System.out.printf("\n%s", s);
        }

        System.out.print("\n\nEnter an employee name to remove: ");
        String toRemove = scanner.nextLine();
        RemoveString(list, toRemove);

        for(String s : list)
        {
            System.out.printf("\n%s", s);
        }
    }

    public static void RemoveString(List<String> l, String toRemove)
    {
        l.remove(toRemove);
    }
}
