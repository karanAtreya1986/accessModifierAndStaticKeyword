package com.staticLearnings;

public class StaticVersusNonStatic {

	// non static
	int employeeid;
	String employeename;

	// static
	static String companyname;

	// constructor used to initialise non static members.
	public StaticVersusNonStatic(int employeeid, String employeename) {
		super();
		this.employeeid = employeeid;
		this.employeename = employeename;
	}

	// Static initializer block to initialize static members. Executes before main
	// method so that data loaded into memory when program runs.
	// can be used to load the properties file, set db connections, etc and other
	// code areas which are not dependent on business logic, but they are just
	// pre-requisite.

	static {
		System.out.println("static block runs before main also");
		companyname = "tiger ali";
	}

	// non static method
	// just to print timepass code
	void display() {
		System.out.println("employee id is --" + employeeid + " employee name is --" + employeename + " ,org name is --"
				+ companyname);
	}

	public static void main(String[] args) {
		System.out.println("main code is starting from here");
		StaticVersusNonStatic e1 = new StaticVersusNonStatic(1, "lion company");
		StaticVersusNonStatic e2 = new StaticVersusNonStatic(2, "cheetah company");
		StaticVersusNonStatic e3 = new StaticVersusNonStatic(3, "goat company");

		e1.display();
		e2.display();
		e3.display();
	}

}
