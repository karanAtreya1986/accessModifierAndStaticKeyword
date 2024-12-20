package com.newLearnings;

import com.learnings.ClassAPublic;

public class ClassD2Public extends ClassAPublic {

	public static void main(String[] args) {
		// create object of child class and we can access parent class methods due to
		// inheritance.
		ClassD2Public c1 = new ClassD2Public();
		int i1 = c1.a;
		System.out.println(i1);
		c1.message();
	}

}
