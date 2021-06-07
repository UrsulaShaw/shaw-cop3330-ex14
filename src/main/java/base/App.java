/*
 * UCF COP3330 Summer 2021 Assignment 1 Solution
 * Copyright 2021 Ursula Shaw
 */

package base;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double taxRate = 0.055;

        System.out.println("What is the order amount? ");
        double amount = Double.parseDouble(in.nextLine());
        System.out.println("What is the state? ");
        String state = in.nextLine();

        if (state.equals("MN")) {
            double tax = amount*taxRate;
            System.out.printf("The subtotal is $%.2f" ,amount);
            amount = amount + tax;
            System.out.printf("The tax is $%.2f", tax);
        }
        System.out.printf("The total is $%.2f", amount);
    }
}
