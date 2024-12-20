package com.staticLearnings;

public class StaticVersusNonStatic6 {

	int employeeid;
	String employeename;

	static String companyname;

	public StaticVersusNonStatic6(int employeeid, String employeename) {
		super();
		this.employeeid = employeeid;
		this.employeename = employeename;
	}

	static {
		System.out.println("static block runs before main also");
		companyname = "tiger ali";
	}

	void display() {
		System.out.println("employee id is --" + employeeid + " employee name is --" + employeename + " ,org name is --"
				+ companyname);
	}

	static void organisationNameUpdate() {
		companyname = " gorilla enterprises";

		// static block cannot access non static.
		// so we need to create object and access static.
		StaticVersusNonStatic6 s6 = new StaticVersusNonStatic6(3245434, companyname);
		s6.employeeid = 324234;

		// prints memory address
		System.out.println(s6);

		int i6 = s6.employeeid;
		System.out.println("value printed in this case not memory address " + i6);

		String s66 = s6.toString();
		// prints memory address
		System.out.println(s66);
	}

	public static void main(String[] args) {

		System.out.println("main code is starting from here");

		organisationNameUpdate();
		StaticVersusNonStatic6 e1 = new StaticVersusNonStatic6(1, "lion company");
		StaticVersusNonStatic6 e2 = new StaticVersusNonStatic6(2, "cheetah company");
		StaticVersusNonStatic6 e3 = new StaticVersusNonStatic6(3, "goat company");

		StaticVersusNonStatic6 e4 = new StaticVersusNonStatic6(4, "hi guys");

		e1.display();
		e2.display();
		e3.display();

		e4.display();
	}

}
