package conditional_looping_statement.src.looping_statements;

import java.util.Scanner;

public class DoWhileLoop {
		public static void main(String[] args) {
			Scanner sc = new  Scanner(System.in);
			System.out.println("Enter a number: ");
			int count = sc.nextInt(); //-1
			int i = 1;
			do{
				System.out.println("Value: "+i);
				i++; //2
			}while(i<=count); //2<=-1
				sc.close();
			}

					;
		}

	

