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
        String budget = input.nextLine();

        //enter valid coupon code
        System.out.print("Coupon Code- ");
        String code = input.nextLine();

    }
}
