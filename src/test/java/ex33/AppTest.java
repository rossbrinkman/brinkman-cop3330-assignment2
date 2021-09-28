package ex33;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ross Brinkman
 */

class AppTest {

    @Test
    void TestRandomNumber() {
        int rnd = App.GenerateNumber(57,98);
        assertTrue((rnd > 57 && rnd < 98));
    }
}