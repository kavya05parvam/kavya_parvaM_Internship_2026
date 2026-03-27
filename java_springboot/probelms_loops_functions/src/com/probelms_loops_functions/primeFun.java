package com.problems_loops_functions;

import java.util.Scanner;

public class PrimeLoop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int num = sc.nextInt();   // example: 5
        boolean flag = true;

        for (int i = 2; i <= num / 2; i++) {   // check divisibility
            if (num % i == 0) {
                flag = false;
            }
        }

        if (flag == true) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }

    }
}