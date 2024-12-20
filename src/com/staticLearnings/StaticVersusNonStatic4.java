package com.staticLearnings;

public class StaticVersusNonStatic4 {

	int employeeid;
	String employeename;

	static String companyname;

	public StaticVersusNonStatic4(int employeeid, String employeename) {
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

	// we are defining static method which will update the company name.
	static void organisationNameUpdate() {
		companyname = " gorilla enterprises";
	}

	public static void main(String[] args) {

		System.out.println("main code is starting from here");

		// how to call static method which updates the name.
		organisationNameUpdate();
		StaticVersusNonStatic4 e1 = new StaticVersusNonStatic4(1, "lion company");
		StaticVersusNonStatic4 e2 = new StaticVersusNonStatic4(2, "cheetah company");
		StaticVersusNonStatic4 e3 = new StaticVersusNonStatic4(3, "goat company");

		e1.display();
		e2.display();
		e3.display();
	}

}
