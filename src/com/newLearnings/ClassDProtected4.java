package com.newLearnings;

import com.learnings.ClassAProtected;
import com.learnings.ClassAProtected2;
import com.learnings.ClassAPublic;

public class ClassDProtected4 extends ClassAProtected2 {

	public static void main(String[] args) {

		ClassDProtected4 c1 = new ClassDProtected4();

		// variable is default so not accessible outside package.
		// compile error - The field ClassAProtected2.a is not visible
		int i1 = c1.a;
		System.out.println(i1);

		c1.message();
	}

}
