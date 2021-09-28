package ex24;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ross Brinkman
 */

public class AppTest {

    @Test
    public void AnagramShouldReturnTrue()
    {
        assertTrue(App.isAnagram("asdfghj"," JHGFDSA  "));
        assertTrue(App.isAnagram("note","tone"));
        assertTrue(App.isAnagram("Stressed"," Desserts"));
    }
}