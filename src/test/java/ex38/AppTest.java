package ex38;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ross Brinkman
 */

class AppTest {

    @Test
    void filterEvenNumbers() {
        int[] numbers = {15,29,29,49,61,63,11,6,97};
        Object[] evenNumbers = {6};
        assertEquals(evenNumbers[0], App.filterEvenNumbers(numbers)[0]);
    }
}