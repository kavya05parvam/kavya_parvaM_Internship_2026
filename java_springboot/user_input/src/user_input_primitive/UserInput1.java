package user_input_primitive;

import java.util.Scanner;

public class UserInput1 {

    public static void main(String[] args) {

        // Scanner --> to take user input values
        // new --> to create object
        // class_name obj_name = new class_name();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        byte age = sc.nextByte();
        System.out.println("Age is : " + age);

        System.out.println("Enter marks: ");
        
        float marks = sc.nextFloat();

        System.out.print("Enter Gender: ");
        char gender = sc.next().charAt(0);

        System.out.println("Gender is : " + gender);
        System.out.println("your marks is : " + marks);
        
        sc.close();
    }
}