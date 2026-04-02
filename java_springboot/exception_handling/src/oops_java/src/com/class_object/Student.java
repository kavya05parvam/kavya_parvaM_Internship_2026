package com.class_object;

public class Student {
	
	 String name;
	    int id;
	    String email;

	    public String isStudying() {
	        return "Yes he is studying";
	    }

	    public static void main(String[] args) {

	        // First student
	        Student s1 = new Student();
	        s1.name = "mohan";
	        s1.id = 121;
	        s1.email = "mohan@student.com";

	        String res1 = s1.isStudying();

	        System.out.println("name: " + s1.name);
	        System.out.println("id: " + s1.id);
	        System.out.println("email: " + s1.email);
	        System.out.println(res1);


	        // Second student
	        Student s2 = new Student();
	        s2.name = "rahul";
	        s2.id = 101;
	        s2.email = "rahul@student.com";

	        String res2 = s2.isStudying();

	        System.out.println("name: " + s2.name);
	        System.out.println("id: " + s2.id);
	        System.out.println("email: " + s2.email);
	        System.out.println(res2);
	
	
	    }
}
