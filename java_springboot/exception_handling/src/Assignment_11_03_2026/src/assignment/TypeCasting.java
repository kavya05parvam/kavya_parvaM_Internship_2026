package assignment;

import java.util.Scanner;

public class TypeCasting {
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter integer number: ");
        int number = sc.nextInt();

        double d = number;        // Implicit Casting
        int n = (int) d;          // Explicit Casting

        System.out.println("Original Integer Value: " + number);
        System.out.println("After Implicit Casting (int to double): " + d);
        System.out.println("After Explicit Casting (double to int): " + n);

        sc.close();
    }
}


