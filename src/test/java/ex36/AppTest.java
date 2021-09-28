package ex36;

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
    void std() {
        List<Integer> ints = new ArrayList<>();
        ints.add(1); ints.add(2); ints.add(12); ints.add(21); ints.add(3); ints.add(17);
        assertEquals(8.925618f, App.std(ints, 5));
    }

    @Test
    void maximum() {
        List<Integer> ints = new ArrayList<>();
        ints.add(1); ints.add(2); ints.add(12); ints.add(21); ints.add(3); ints.add(17);
        assertEquals(21, App.maximum(ints));
    }

    @Test
    void minimum() {
        List<Integer> ints = new ArrayList<>();
        ints.add(1); ints.add(2); ints.add(12); ints.add(21); ints.add(3); ints.add(17);
        assertEquals(1, App.minimum(ints));
    }

    @Test
    void average() {
        List<Integer> ints = new ArrayList<>();
        ints.add(1); ints.add(2); ints.add(12); ints.add(21); ints.add(3); ints.add(17);
        assertEquals(9.333333f, App.average(ints));
    }
}