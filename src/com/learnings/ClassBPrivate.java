package com.learnings;

public class ClassBPrivate {

	public static void main(String[] args) {
		ClassAPrivate c1 = new ClassAPrivate();
		// cant access private outside class.
		// compile error - The field ClassAPrivate.a is not visible.
		int i1 = c1.a;
		System.out.println(i1);
		// compile error - The method message() from the type ClassAPrivate is not
		// visible
		c1.message();
	}

}
