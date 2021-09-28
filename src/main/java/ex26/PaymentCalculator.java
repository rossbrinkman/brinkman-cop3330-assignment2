package ex26;

import java.lang.Math;

import static java.lang.Math.log10;

public class PaymentCalculator {
    private float creditCardBalance, aPR, monthlyPayment;

    public float getCreditCardBalance() { return creditCardBalance; }

    public void setCreditCardBalance(float creditCardBalance) { this.creditCardBalance = creditCardBalance; }

    public float getaPR() { return aPR; }

    public void setaPR(float aPR) { this.aPR = (aPR/100)/365; }

    public float getMonthlyPayment() { return monthlyPayment; }

    public void setMonthlyPayment(float monthlyPayment) { this.monthlyPayment = monthlyPayment; }

    public int calculateMonthsUntilPaidOff()
    {
        double result = -1 * (1f/30f) * log10(1f + creditCardBalance/monthlyPayment * (1f-Math.pow((1f+aPR), 30))) / log10(1f + aPR);
        return (int)Math.ceil(result);
    }

}
