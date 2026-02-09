package org.codedifferently;

import java.util.Random;

public class RandomGenerator {

    Random random = new Random();

    // generating random number for visit ID
    public int generateRandomInt() {
        return random.nextInt(1000, 10000);
    }

    // price between $1.00 - $100.00
    public double generatePrice() {
        return Math.round(random.nextDouble() * 100.0 * 100.0) / 100.0;
    }

    // tax rate between 2% - 8%
    public double generateTaxRate() {
        return random.nextInt(2, 9) / 100.0;
    }

    // discount percentage between 5% - 20%
    public double generateDiscountRate() {
        return random.nextInt(5, 21) / 100.0;
    }
}