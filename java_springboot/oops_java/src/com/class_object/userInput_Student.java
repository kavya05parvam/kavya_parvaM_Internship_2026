package com.class_object;

import java.util.Scanner;

public class userInput_Student {
	String name;
    int id;
    String email;

    public String isStudying() {
        return "Yes he is studying";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        Student s1 = new Student();
        System.out.println("Enter details for Student 1:");
        System.out.print("Enter name: ");
        s1.name = sc.nextLine();
        System.out.print("Enter id: ");
        s1.id = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter email: ");
        s1.email = sc.nextLine();

        String res1 = s1.isStudying();

        
        Student s2 = new Student();
        System.out.println("\nEnter details for Student 2:");
        System.out.print("Enter name: ");
        s2.name = sc.nextLine();
        System.out.print("Enter id: ");
        s2.id = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter email: ");
        s2.email = sc.nextLine();

        String res2 = s2.isStudying();

        
        System.out.println("\n--- Student Details ---");

        System.out.println("\nStudent 1:");
        System.out.println("Name: " + s1.name);
        System.out.println("ID: " + s1.id);
        System.out.println("Email: " + s1.email);
        System.out.println(res1);

        System.out.println("\nStudent 2:");
        System.out.println("Name: " + s2.name);
        System.out.println("ID: " + s2.id);
        System.out.println("Email: " + s2.email);
        System.out.println(res2);

        sc.close();
    }
}


