package org.codedifferently;

import java.util.Random;

public class Calculations {
    //build methods
    Random random = new Random();

    public double generateSubtotal(double price, double price2, double price3) {
        //builds subtotal for 3 random prices
        return Math.round((price + price2 + price3) * 100) / 100;

    }

        //calculate tax
        public double calculateTax(double subtotal, double tax1) {
        return  Math.round(subtotal * tax1 * 100.0) / 100.0;

    }

        //apply discount
        public double applyDiscount(double subtotal, double discountRate, double minAmount) {
            if (subtotal >= minAmount) {
                double discount = subtotal * discountRate;
                return Math.round((subtotal - discount) * 100.0) / 100.0;
            }
            return subtotal;
        }

    public double calculateFinalTotal(
            double subtotal,
            double discountRate,
            double minAmount,
            double taxRate
    ) {
        double discountedSubtotal = applyDiscount(subtotal, discountRate, minAmount);
        double tax = calculateTax(discountedSubtotal, taxRate);
        return Math.round((discountedSubtotal + tax) * 100.0) / 100.0;
    }



}



