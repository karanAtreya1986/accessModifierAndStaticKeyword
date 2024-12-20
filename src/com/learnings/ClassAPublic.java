package com.learnings;

public class ClassAPublic {

	// Access modifier –
	// Default mainly used with interfaces, classes, methods sometimes, variables,
	// inner classes. When we don’t mention anything, its default.

	// Class can have-
	// public
	// abstract
	// final

	// rest everything written inside class can have public, private, protected,
	// default.

	// Public keyword-
	// Tried with public class , public method , public variable.
	// Accessed within class.
	// Same package – another class – can access public.
	// Outside package – no extends – import public class from other package – can
	// access
	// public.
	// Outside package – extends public class – can access public.

	public int a = 3234;

	public void message() {
		System.out.println("message is public");
	}

	public static void main(String[] args) {
		ClassAPublic c1 = new ClassAPublic();
		int i1 = c1.a;
		System.out.println(i1);
		c1.message();
	}
}
