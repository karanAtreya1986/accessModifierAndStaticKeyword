package com.newLearnings;

import com.learnings.ClassAProtected;
import com.learnings.ClassAPublic;

public class ClassDProtected3 extends ClassAProtected {

	// compile error when trying to access default outside package
	// ClassAProtected cannot be resolved to a type
	public static void main(String[] args) {
		// if we create object of class which has protected members.
		// we get compile errors
		// so create object of child class and error resolved.
		ClassDProtected3 c1 = new ClassDProtected3();
		
		int i1 = c1.a;
		System.out.println(i1);
		
		c1.message();
	}

}
