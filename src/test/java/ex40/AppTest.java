package ex40;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ross Brinkman
 */

class AppTest {

    @Test
    void filterList() {
        List<HashMap<String,String>> maps = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            maps.add(new HashMap<>());
        }
        maps.get(0).put("Last Name", "Brinkman");   maps.get(0).put("First Name", "Ross");
        maps.get(1).put("Last Name", "Colbert");    maps.get(1).put("First Name", "Evie");
        maps.get(2).put("Last Name", "Aarons");     maps.get(2).put("First Name", "Mark");
        maps.get(3).put("Last Name", "Stephenson"); maps.get(3).put("First Name", "Maggie");
        List<HashMap<String,String>> filteredMaps = App.FilterList("ph",maps);
        assertEquals(filteredMaps.get(0).get("Last Name"), "Stephenson");
        filteredMaps = App.FilterList("oss",maps);
        assertEquals(filteredMaps.get(0).get("Last Name"), "Brinkman");
        filteredMaps = App.FilterList("ark",maps);
        assertEquals(filteredMaps.get(0).get("Last Name"), "Aarons");
    }

    @Test
    void sortMapListByLastName() {
        List<HashMap<String,String>> maps = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            maps.add(new HashMap<>());
        }
        maps.get(0).put("Last Name", "Brinkman");
        maps.get(1).put("Last Name", "Colbert");
        maps.get(2).put("Last Name", "Aarons");
        ex40.App.SortMapListByLastName(maps);
        assertEquals(maps.get(0).get("Last Name"), "Aarons");
    }
}