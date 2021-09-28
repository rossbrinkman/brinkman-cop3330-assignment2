package ex39;

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
    void sortMapListByLastName() {
        List<HashMap<String,String>> maps = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            maps.add(new HashMap<>());
        }
        maps.get(0).put("Last Name", "Brinkman");
        maps.get(1).put("Last Name", "Colbert");
        maps.get(2).put("Last Name", "Aarons");
        App.SortMapListByLastName(maps);
        assertEquals(maps.get(0).get("Last Name"), "Aarons");
    }
}