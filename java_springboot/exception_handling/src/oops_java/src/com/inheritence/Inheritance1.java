package com.inheritence;

class Parent{
	int age=40;
	public void parent() {
		System.out.println("This is parent class method");
	}
	
}

class Child extends Parent{
	public void  child() {
		System.out.println("This is child class method");
	}
	
	
}

public class Inheritance1 {
	public static void main(String [] args) {
		
		Child c1 = new Child ();
		System.out.println("age: "+c1.age);
		c1.parent();
		c1.child();
		
		
		
	}

}
