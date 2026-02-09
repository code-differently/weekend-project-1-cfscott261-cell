package org.codedifferently;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //must enter name
        System.out.print("Enter name- ");
        String name = input.nextLine();

        //must enter budget
        System.out.print("Budget- $");
        double budget = Double.parseDouble(input.nextLine());

        //enter valid coupon code
        System.out.print("Coupon Code- ");
        String code = input.nextLine();

        //my classes
        RandomGenerator rg = new RandomGenerator();
        Calculations calc = new Calculations();
        Receipt receipt = new Receipt();

        // item prices
        double price1 = rg.generatePrice();
        double price2 = rg.generatePrice();
        double price3 = rg.generatePrice();

        double[] prices = {price1, price2, price3};


        double subtotal = calc.generateSubtotal(price1, price2, price3);

        boolean validCoupon = receipt.validateCoupon(code);
        double discountRate = validCoupon ? rg.generateDiscountRate() : 0;
        double discountedSubtotal = calc.applyDiscount(subtotal, discountRate, 0);
        double discountAmount = subtotal - discountedSubtotal;

        double taxRate = rg.generateTaxRate();
        double tax = calc.calculateTax(discountedSubtotal, taxRate);

        double total = discountedSubtotal + tax;

        // the receipt code
        int visitId = rg.generateRandomInt();
        String receiptCode = receipt.buildReceiptCode(name, visitId);

        //print receipt

        System.out.println("**********************************");
        System.out.println("     Corey's Stop and Shop ");
        System.out.println("**********************************");
        System.out.println("Visit ID: " + visitId);
        System.out.println("Receipt Code: " + receiptCode);
        System.out.println("----------------------------------");
        System.out.printf("Item 1: $%.2f%n", price1);
        System.out.printf("Item 2: $%.2f%n", price2);
        System.out.printf("Item 3: $%.2f%n", price3);
        System.out.println("----------------------------------");
        System.out.printf("Subtotal: $%.2f%n", subtotal);
        System.out.printf("Tax: $%.2f%n", tax);
        System.out.printf("Discount: -$%.2f%n", discountAmount);
        System.out.println("----------------------------------");
        System.out.printf("TOTAL: $%.2f%n", total);

        if (budget >= total) {
            System.out.printf("Budget Remaining: $%.2f%n", budget - total);
        } else {
            System.out.printf("Amount Short: $%.2f%n", total - budget);
        }

        System.out.println("==================================");
        System.out.println("Thank you for shopping!");
    }
}



