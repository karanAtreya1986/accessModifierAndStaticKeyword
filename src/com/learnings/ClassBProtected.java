package com.learnings;

public class ClassBProtected {

	public static void main(String[] args) {
		ClassAProtected c1 = new ClassAProtected();
		int i1 = c1.a;
		System.out.println(i1);
		c1.message();
	}

}
