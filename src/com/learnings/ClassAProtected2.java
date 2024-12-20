package com.learnings;

public class ClassAProtected2 {

	// some are protected, some are default.

	int a = 3234;

	protected void message() {
		System.out.println("message is public");
	}

	public static void main(String[] args) {
		ClassAProtected2 c1 = new ClassAProtected2();
		int i1 = c1.a;
		System.out.println(i1);
		c1.message();
	}
}
