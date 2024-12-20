package com.learnings;

public class ClassADefault2 {

	// Default-
	// Accessed within class.
	// Same package – another class – can access Default.
	// Outside package – no extends – import default class from other package –
	// cannot access Default.
	// Outside package – extends default class– cannot access Default.

	// suppose variables are default, class is public, method is default, then
	// outside package the class will be accessible but not the default variables
	// and default method.

	int a = 3234;

	void message() {
		System.out.println("message is public");
	}

	// when main is not public then we dont get the option to run as java
	// application.
	public static void main(String[] args) {
		ClassADefault2 c1 = new ClassADefault2();
		int i1 = c1.a;
		System.out.println(i1);
		c1.message();
	}
}
