package com.newLearnings;

import com.learnings.ClassAPrivate;
import com.learnings.ClassAPublic;

public class ClassCPrivate {

	public static void main(String[] args) {
		ClassAPrivate c1 = new ClassAPrivate();
		// The field ClassAPrivate.a is not visible - compile error.
		int i1 = c1.a;
		System.out.println(i1);
		// The method message() from the type ClassAPrivate is not visible - compile
		// error
		c1.message();
	}

}
