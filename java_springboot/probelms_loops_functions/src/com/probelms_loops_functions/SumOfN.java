package com.probelms_loops_functions;

import java.util.Scanner;

public class SumOfN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt(); //5
		int i = 1;
		int res= 0;
		while(i<=num) {
			res=res+i;
			i++;
		}
		System.out.println("Res is: "+res);
		
		sc.close();
		}
		

}
