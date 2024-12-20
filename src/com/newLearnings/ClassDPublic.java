package com.newLearnings;

import com.learnings.ClassAPublic;

public class ClassDPublic extends ClassAPublic{
	
	public static void main(String[] args) {
		ClassAPublic c1 = new ClassAPublic();
		int i1 = c1.a;
		System.out.println(i1);
		c1.message();
	}

}
