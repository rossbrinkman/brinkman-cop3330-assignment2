package ex27;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ross Brinkman
 */

class AppTest {

    @Test
    void validateFirstName() {

        assertEquals(0, App.ValidateFirstName(""));
        assertEquals(-1, App.ValidateFirstName("H"));
        assertEquals(1, App.ValidateFirstName("Ross"));
    }

    @Test
    void validateLastName() {
        assertEquals(0, App.ValidateLastName(""));
        assertEquals(-1, App.ValidateLastName("H"));
        assertEquals(1, App.ValidateLastName("Brinkman"));
    }

    @Test
    void validateZIPCode() {
        assertEquals(0, App.ValidateZIPCode(""));
        assertEquals(-1, App.ValidateZIPCode("H"));
        assertEquals(1, App.ValidateZIPCode("12345"));
    }

    @Test
    void validateEmployeeID() {
        assertEquals(0, App.ValidateEmployeeID(""));
        assertEquals(-1, App.ValidateEmployeeID("H"));
        assertEquals(1, App.ValidateEmployeeID("RO-1234"));
    }
}