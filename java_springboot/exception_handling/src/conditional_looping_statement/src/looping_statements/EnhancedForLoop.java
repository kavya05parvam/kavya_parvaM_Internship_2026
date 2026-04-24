package conditional_looping_statement.src.looping_statements;

import java.util.Arrays;

public class EnhancedForLoop {

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50};

        System.out.println("Res: " + Arrays.toString(arr));

        for (int ele : arr) {
            System.out.print(ele + " ");
        }

    }
}