package ex29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ross Brinkman
 */

class AppTest {

    @Test
    void calculateYears() {
        assertEquals(1, App.CalculateYears(72));
        assertEquals(144, App.CalculateYears(.5f));
        assertEquals(4.8f, App.CalculateYears(15f));
    }
}