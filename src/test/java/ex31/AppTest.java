package ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ross Brinkman
 */

class AppTest {

    @Test
    void calculateTargetHeartRate() {
        assertEquals(159, App.CalculateTargetHeartRate(65, 10, 65));
        assertEquals(171, App.CalculateTargetHeartRate(75, 38, 90));
        assertEquals(180, App.CalculateTargetHeartRate(56, 21, 87));
    }
}