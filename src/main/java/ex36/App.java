package ex36;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.text.DecimalFormat;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ross Brinkman
 */

public class App {
    public static void main( String[] args ) {
        List<Integer> list = new ArrayList<>();
        DecimalFormat f = new DecimalFormat("#0.0#");
        Object result;

        do{
            result = ReadInput();
            if(result instanceof Integer)
                list.add((int)result);
        } while (!Objects.equals(result, "done"));

        System.out.print("Numbers:");
        for(Integer i : list) {
            System.out.printf(" %d", i);
            if(!i.equals(list.get(list.size()-1)))
                System.out.print(",");
            else
                System.out.print(" ");
        }

        float average = average(list);
        int min = minimum(list);
        int max = maximum(list);
        float std = std(list, average);
        System.out.printf("\nThe average is %s ", f.format(average));
        System.out.printf("\nThe minimum is %d ", min);
        System.out.printf("\nThe maximum is %d ", max);
        System.out.printf("\nThe standard deviation is %s ", f.format(std));

    }
    public static float std(List<Integer> l, float average)
    {
        float total = 0;
        for(Integer i : l)
        {
            double resultSquared = Math.pow((i - average), 2);
            total += resultSquared;
        }
        float meanOfResult = total/l.size();

        return (float) Math.sqrt(meanOfResult);
    }

    public static int maximum(List<Integer> l)
    {
        int maximum = l.get(0);
        for(Integer i : l)
        {
            if(i > maximum)
                maximum = i;
        }
        return maximum;
    }

    public static int minimum(List<Integer> l)
    {
        int minimum = l.get(0);
        for(Integer i : l)
        {
            if(i < minimum)
                minimum = i;
        }
        return minimum;
    }

    public static float average(List<Integer> l)
    {
        float total = 0;
        for(Integer i : l)
        {
            total += i;
        }
        return total/l.size();
    }

    public static Object ReadInput()
    {
        Scanner scanner = new Scanner(System.in);
        Object input;
        while (true)
        {
            System.out.print("Enter a number: ");
            input = scanner.next();
            if(Objects.equals(input, "done"))
                return input;
            try{
                input = Integer.parseInt(input.toString());
                return input;
            }
            catch (NumberFormatException nfe)
            {
                System.out.println("Invalid input. Must be a number.");
            }
        }
    }

}
