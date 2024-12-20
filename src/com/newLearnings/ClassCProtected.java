package com.newLearnings;

import com.learnings.ClassAPublic;

public class ClassCProtected {

	// compile error when trying to access default outside package
	// ClassAProtected cannot be resolved to a type
	public static void main(String[] args) {
		ClassAProtected c1 = new ClassAProtected();
		int i1 = c1.a;
		System.out.println(i1);
		c1.message();
	}

}
