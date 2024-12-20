package com.staticLearnings;

public class MathsApi3 {

	static int a = 10;

	static void display() {
		System.out.println("static method");
	}

	public static void main(String[] args) {

		// when we use predefined apis already part of java, that time class name is
		// mandatory
		// for user defined names, class name is not mandatory.
		int i2=Math.max(1, 2);
		System.out.println(i2);
	}

}
