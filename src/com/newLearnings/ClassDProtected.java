package com.newLearnings;

import com.learnings.ClassAProtected;
import com.learnings.ClassAPublic;

public class ClassDProtected extends ClassAProtected {

	public static void main(String[] args) {
		// if we create object of class which has protected members.
		// we get compile errors
		// so create object of child class.
		ClassAProtected c1 = new ClassAProtected();
		// compile error - The field ClassAProtected.a is not visible
		int i1 = c1.a;
		System.out.println(i1);
		// compile error - The method message() from the type ClassAProtected is not
		// visible
		c1.message();
	}

}
