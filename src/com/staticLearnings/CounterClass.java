package com.staticLearnings;

public class CounterClass {

	// Where to use static-
	// Values are unique. Example company name in ecommerce, boat will have ten
	// different headphones. here boat is common to all.

	// non static variable
	// output will be 11 for all three object calls because it is non static
	int count = 10;

	public CounterClass() {
		count++;
		System.out.println("Count value is " + count);
	}

	public static void main(String[] args) {

		CounterClass c1 = new CounterClass();
		CounterClass c2 = new CounterClass();
		CounterClass c3 = new CounterClass();

	}

}
