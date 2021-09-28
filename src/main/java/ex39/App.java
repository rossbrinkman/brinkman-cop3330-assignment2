package ex39;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ross Brinkman
 */

import java.util.*;
import java.util.Comparator;

public class App {
    public static void main( String[] args ) {
        List<HashMap<String, String>> employees = PopulateMapList();
        System.out.print("Name\t\t\t\t| Position\t\t\t| Separation Date\n" +
                "--------------------|-------------------|----------------");

        SortMapListByLastName(employees);
        PrintMapList(employees);
    }

    public static void PrintMapList(List<HashMap<String, String>> maps)
    {
        for (HashMap<String,String> hm : maps)
        {
            String name = hm.get("First Name") + " " + hm.get("Last Name");
            System.out.printf("\n%-20s| %-18s| %s", name, hm.get("Position"), hm.get("Separation Date"));
        }
    }

    public static void SortMapListByLastName(List<HashMap<String, String>> maps)
    {
        maps.sort(new Comparator<HashMap<String, String>>() {
            @Override
            public int compare(HashMap<String, String> o1, HashMap<String, String> o2) {
                return o1.get("Last Name").compareTo(o2.get("Last Name"));
            }
        });
    }

    public static List<HashMap<String, String>> PopulateMapList()
    {
        List<HashMap<String, String>> employees = new ArrayList<>();
        People people = new People();
        for (int i = 0; i < people.Table[0].length; i++)
            employees.add(new HashMap<>());

        for (int j = 0; j < people.Table[0].length; j++) {
            for(int i = 0; i < people.Table.length; i++)
            {
                switch (i)
                {
                    case 0:
                        employees.get(j).put("First Name", people.Table[i][j]);
                        break;
                    case 1:
                        employees.get(j).put("Last Name", people.Table[i][j]);
                        break;
                    case 2:
                        employees.get(j).put("Position", people.Table[i][j]);
                        break;
                    case 3:
                        employees.get(j).put("Separation Date", people.Table[i][j]);
                        break;
                }
            }
        }
        return employees;
    }
}
