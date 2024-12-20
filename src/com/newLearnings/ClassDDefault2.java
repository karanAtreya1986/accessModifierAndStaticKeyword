package com.newLearnings;

import com.learnings.ClassAPublic;

//ClassADefault cannot be resolved to a type
public class ClassDDefault2 extends ClassADefault2 {

	// compile error when trying to access default outside package
	// ClassADefault cannot be resolved to a type
	public static void main(String[] args) {
		ClassADefault2 c1 = new ClassADefault2();
		int i1 = c1.a;
		System.out.println(i1);
		c1.message();
	}

}
