package com.staticLearnings;

public class CounterClass2 {

	// Where to use non static-
	// When the values need not be unique. Like in ecommerce, product id will be
	// different for each product.

	// now we used static variable
	// when we print the value is incremented at every object call
	static int count = 10;

	public CounterClass2() {
		count++;
		System.out.println("Count value is " + count);
	}

	public static void main(String[] args) {

		CounterClass2 c1 = new CounterClass2();
		CounterClass2 c2 = new CounterClass2();
		CounterClass2 c3 = new CounterClass2();

	}

}
