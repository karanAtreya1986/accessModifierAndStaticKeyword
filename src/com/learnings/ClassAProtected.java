package com.learnings;

public class ClassAProtected {

	// Protected-
	// Accessed within class.
	// Same package – another class – can access Protected
	// Outside package – no extends – import class with protected from other package
	// – cannot access Protected.
	// Outside package – extends class which has protected in it – can access
	// Protected

	protected int a = 3234;

	protected void message() {
		System.out.println("message is public");
	}

	// when main is not public then we dont get the option to run as java
	// application.
	public static void main(String[] args) {
		ClassAProtected c1 = new ClassAProtected();
		int i1 = c1.a;
		System.out.println(i1);
		c1.message();
	}
}
