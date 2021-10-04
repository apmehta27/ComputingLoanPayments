package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
        System.out.println("Please the interest rate:");
        double interestRate = input.nextDouble();
        double monthlyInterestRate = interestRate/1200;
        System.out.println("Please the number of years:");
        double years = input.nextDouble();
        System.out.println("Please the loan amount:");
        double loanAmount = input.nextDouble();
        double monthlyPayment = (loanAmount * monthlyInterestRate)/ (1 - (1/Math.pow(1 + monthlyInterestRate,years * 12.0)));
        double totalPayment  = monthlyPayment * years * 12 ;
        System.out.println("\n" + interestRate + "\t");
        System.out.println("Monthly payment: " + monthlyPayment + "\t ");;
        System.out.println("Total Payment : " + totalPayment);

//        int i = 1024;
//        byte b = 127;
//        double d = 1.232, tiny = d / 1000000.0;
//        boolean bool = true;
//        System.out.format(" This is an integer: %d and this is a byte: %d.\n", i, b);
//        System.out.format(" This is a double: %.4f and this is tiny: %.4e.\r\n", d, tiny);
//        System.out.format(" And this is a String: %s", "This is a string.\r\n");

    }
}
