package org.example.bonus;

import java.lang.Math;

public class CreditPaymentService {

    public double creditCalculate (int creditAmount, int creditDuration, double creditPercent) {
        double percentMonthly = creditPercent / (100 * 12);
        double beforePow = 1 + percentMonthly;
        double pow = Math.pow(beforePow, -creditDuration);
        double coefficientAnnuent = percentMonthly / (1 - pow);
        double monthlyPay = creditAmount * coefficientAnnuent;
        return monthlyPay;
    }



}