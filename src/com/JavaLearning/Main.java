package com.JavaLearning;

public class Main {

    public static void main(String[] args) {

        double myDoubleNum = 20.00d;
        double mySecondDoubleNum = 80.00d;
        double productOfAddedNums = (myDoubleNum + mySecondDoubleNum) * 100.00d;
        System.out.println("The product is = " + productOfAddedNums );

        double remainder = productOfAddedNums % 40.00d;
        System.out.println("remainder = " + remainder);

        boolean myRemainder = (remainder == 0) ? true : false;
        System.out.println("My remainder = " + myRemainder);
        if(myRemainder = true ){
            System.out.println("there is no any remainder");
        }else
            System.out.println("The remainder is " + myRemainder);

    }
}
