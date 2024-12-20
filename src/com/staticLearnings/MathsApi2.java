package com.staticLearnings;

public class MathsApi2 {

	static int a = 10;

	static void display() {
		System.out.println("static method");
	}

	public static void main(String[] args) {

		// we can access static members using objects also
		// only thing we get the compiler warning as seen below, so not good practice.

		MathsApi2 m2 = new MathsApi2();
		// The static field MathsApi2.a should be accessed in a static way
		int i1 = m2.a;
		System.out.println(i1);
		// The static method display() from the type MathsApi2 should be accessed in a
		// static way
		m2.display();
	}

}
