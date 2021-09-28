package ex25;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ross Brinkman
 */

class PasswordTest {

    @Test
    void passwordValidatorTest() {
        Password password = new Password();
        password.setPassword("184962");
        assertEquals(1, password.passwordValidator());
        password.setPassword("HGF");
        assertEquals(2, password.passwordValidator());
        password.setPassword("@dg5");
        assertEquals(3, password.passwordValidator());
        password.setPassword("1234ACVBD");
        assertEquals(4, password.passwordValidator());
        password.setPassword("@123%DFGD");
        assertEquals(5, password.passwordValidator());
    }
}