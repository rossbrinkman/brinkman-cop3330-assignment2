package ex28;

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
    void AddNumbers() {
        List<Float> floats = new ArrayList<>();
        floats.add(10f);
        floats.add(11f);
        floats.add(12f);
        floats.add(13f);
        floats.add(14f);
        assertEquals(60, App.AddNumbers(floats));
    }
}