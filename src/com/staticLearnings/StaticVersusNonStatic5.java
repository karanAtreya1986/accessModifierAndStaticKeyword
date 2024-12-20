package com.staticLearnings;

public class StaticVersusNonStatic5 {

	int employeeid;
	String employeename;

	static String companyname;

	public StaticVersusNonStatic5(int employeeid, String employeename) {
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
		// static block cannot directly access non static things.
		// compile error - Cannot make a static reference to the non-static field
		// employeeid
		employeeid = 324234;
	}

	public static void main(String[] args) {

		System.out.println("main code is starting from here");

		organisationNameUpdate();
		StaticVersusNonStatic5 e1 = new StaticVersusNonStatic5(1, "lion company");
		StaticVersusNonStatic5 e2 = new StaticVersusNonStatic5(2, "cheetah company");
		StaticVersusNonStatic5 e3 = new StaticVersusNonStatic5(3, "goat company");

		e1.display();
		e2.display();
		e3.display();
	}

}
