package org.codedifferently;

import java.util.Random;

public class RandomGenerator {

Random random = new Random();
public int generateRandomInt() {

 //generating random number for visit ID
    int num = random.nextInt(1000,10000)  ;
    return num;
}

//price between $1-$100
    Random num2= new Random();{
    double price = Math.round((random.nextDouble() * 100) * 100.0) / 100.0;
    double price2 = Math.round((random.nextDouble() * 100) * 100.0) / 100.0;
    double price3 = Math.round((random.nextDouble() * 100) * 100.0) / 100.0;
    }
//calculating tax rate
    Random tax1= new Random();{
        double taxRate = random.nextInt(2, 9);

    }











}

