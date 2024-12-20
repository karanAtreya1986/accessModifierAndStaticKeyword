package com.newLearnings;

import com.learnings.ClassAProtected;
import com.learnings.ClassAPublic;

public class ClassDProtected2 extends ClassAProtected {

	public static void main(String[] args) {
		// if we create object of class which has protected members.
		// we get compile errors
		// so create object of child class.
		// run time polymorphism way of object creation also does not work.
		ClassAProtected c1 = new ClassDProtected2();
		// compile error - The field ClassAProtected.a is not visible
		int i1 = c1.a;
		System.out.println(i1);
		// compile error - The method message() from the type ClassAProtected is not
		// visible
		c1.message();
	}

}
