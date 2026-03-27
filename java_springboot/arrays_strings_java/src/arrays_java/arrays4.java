package arrays_java;

import java.util.Scanner;

public class arrays4 {
	public static void main(String [] args) {
		/*2D:
		 * [][]--> [rows] [columns]
		 */
		
		Scanner sc = new Scanner(System.in);

        int[][] arr = new int[2][3];

        System.out.println("Enter Elements: ");

        // input
        for (int i = 0; i <= 1; i++) { // row
            for (int j = 0; j <= 2; j++) { // col
                System.out.println("Enter [" + i + "][" + j + "] ele: ");
                arr[i][j] = sc.nextInt();
            }
        }

        // print
        for (int i = 0; i <= 1; i++) { // row
            for (int j = 0; j <= 2; j++) { // col
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
            sc.close();
        }
    }
}
		

