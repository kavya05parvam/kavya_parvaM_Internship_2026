package com.probelms_loops_functions;

import java.util.Scanner;

public class SumOfEven {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();   // example: 10

        int i = 1;
        int res = 0;

        while (i <= num) {   // i <= 10

            if (i % 2 == 0) {   // check even number
                res = res + i;
            }

            i++;
        }

        System.out.println("Result is: " + res);
        sc.close();
    }
}