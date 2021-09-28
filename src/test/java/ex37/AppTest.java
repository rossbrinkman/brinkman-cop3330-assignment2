package ex37;

import org.junit.jupiter.api.Test;

import static ex37.App.GenerateNumber;
import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ross Brinkman
 */

class AppTest {

    @Test
    void createPassword() {
        assertDoesNotThrow(()->App.CreatePassword(12, 3, 3));
        assertDoesNotThrow(()->App.CreatePassword(50, 5, 8));
        assertDoesNotThrow(()->App.CreatePassword(15, 2, 6));
    }

    @Test
    void generateSpecialCharacter() {
        assertDoesNotThrow(App::GenerateSpecialCharacter);
    }

    @Test
    void generateNumber() {
        assertDoesNotThrow(()->GenerateNumber(1, 10));
        assertDoesNotThrow(()->GenerateNumber(50, 100));
        assertDoesNotThrow(()->GenerateNumber(-5, 20));
    }

    @Test
    void generateLetter() {
        assertDoesNotThrow(App::GenerateLetter);
    }
}