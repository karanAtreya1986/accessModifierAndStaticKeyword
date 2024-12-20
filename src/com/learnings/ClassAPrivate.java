package com.learnings;

public class ClassAPrivate {

	// Private –
	// Can be accessed within same class.
	// Other class in same package – no access.
	// Outside package with inheritance – no access
	// Outside package without inheritance – no access

	private int a = 3234;

	private void message() {
		System.out.println("message is public");
	}

	public static void main(String[] args) {
		ClassAPrivate c1 = new ClassAPrivate();
		int i1 = c1.a;
		System.out.println(i1);
		c1.message();
	}
}
