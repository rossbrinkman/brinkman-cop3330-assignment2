package ex34;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ross Brinkman
 */

class AppTest {

    @Test
    void RemoveFromList() {
        List<String> l = new ArrayList<>();
        l.add("Ross"); l.add("Mike"); l.add("Steve"); l.add("Jorge");
        App.RemoveString(l, "Ross");
        assertEquals(l.get(0), "Mike");
    }
}