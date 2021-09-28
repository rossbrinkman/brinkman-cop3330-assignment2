package ex26;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ross Brinkman
 */

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOffTest() {
        PaymentCalculator paymentCalculator = new PaymentCalculator();
        paymentCalculator.setaPR(0);
        paymentCalculator.setMonthlyPayment(0);
        paymentCalculator.setCreditCardBalance(0);
        assertEquals(0, paymentCalculator.calculateMonthsUntilPaidOff());

        paymentCalculator.setaPR(12);
        paymentCalculator.setMonthlyPayment(100);
        paymentCalculator.setCreditCardBalance(10000);
        assertEquals(479, paymentCalculator.calculateMonthsUntilPaidOff());
    }
}