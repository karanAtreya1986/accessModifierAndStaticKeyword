package com.newLearnings;

import com.learnings.ClassAPublic;

public class ClassCDefault {

	// compile error when trying to access default outside package
	// ClassADefault cannot be resolved to a type
	public static void main(String[] args) {
		ClassADefault c1 = new ClassADefault();
		int i1 = c1.a;
		System.out.println(i1);
		c1.message();
	}

}
