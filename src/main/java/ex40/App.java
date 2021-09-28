package ex40;

import ex39.People;

import java.util.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ross Brinkman
 */

public class App {
    public static void main( String[] args ) {
        List<HashMap<String, String>> employees = PopulateMapList();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a search string: ");
        String search = scanner.next();
        List<HashMap<String, String>> filteredEmployees = FilterList(search, employees);
        SortMapListByLastName(filteredEmployees);
        System.out.println("\nResults: ");
        System.out.print("\nName\t\t\t\t| Position\t\t\t| Separation Date\n" +
                "--------------------|-------------------|----------------");
        PrintMapList(filteredEmployees);
    }

    public static List<HashMap<String, String>> FilterList(String search, List<HashMap<String,String>> currentList)
    {
        List<HashMap<String, String>> filteredEmployees = new ArrayList<>();
        search = search.toLowerCase();

        for (HashMap<String, String> hashMap : currentList)
        {
            String f = hashMap.get("First Name").toLowerCase();
            String l = hashMap.get("Last Name").toLowerCase();
            if(f.contains(search) || l.contains(search))
                filteredEmployees.add(hashMap);
        }

        return filteredEmployees;
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

    public static void SortMapListByLastName(List<HashMap<String, String>> maps)
    {
        maps.sort(new Comparator<HashMap<String, String>>() {
            @Override
            public int compare(HashMap<String, String> o1, HashMap<String, String> o2) {
                return o1.get("Last Name").compareTo(o2.get("Last Name"));
            }
        });
    }

    public static void PrintMapList(List<HashMap<String, String>> maps)
    {
        for (HashMap<String,String> hm : maps)
        {
            String name = hm.get("First Name") + " " + hm.get("Last Name");
            System.out.printf("\n%-20s| %-18s| %s", name, hm.get("Position"), hm.get("Separation Date"));
        }
    }
}
