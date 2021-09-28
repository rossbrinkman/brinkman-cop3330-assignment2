package ex32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ross Brinkman
 */

class AppTest {

    @Test
    void CheckResultTest()
    {
        assertEquals(-1, App.CheckResult(1,2));
        assertEquals(1, App.CheckResult(2,1));
        assertEquals(0, App.CheckResult(1,1));
    }

    @Test
    void calculateNumber() {
        int i = App.CalculateNumber(1);
        assertTrue((i > 0 && i < 10));
        i = App.CalculateNumber(2);
        assertTrue((i > 0 && i < 100));
        i = App.CalculateNumber(3);
        assertTrue((i > 0 && i < 1000));
    }
}