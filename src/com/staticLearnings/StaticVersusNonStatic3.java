package com.staticLearnings;

public class StaticVersusNonStatic3 {

	int employeeid;
	String employeename;

	static String companyname;

	public StaticVersusNonStatic3(int employeeid, String employeename) {
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

	public static void main(String[] args) {

		// in this way we can change the static member using class name.
		// no need to use the class name also.
		companyname = "ranjani organisation";
		System.out.println("main code is starting from here");
		StaticVersusNonStatic3 e1 = new StaticVersusNonStatic3(1, "lion company");
		StaticVersusNonStatic3 e2 = new StaticVersusNonStatic3(2, "cheetah company");
		StaticVersusNonStatic3 e3 = new StaticVersusNonStatic3(3, "goat company");

		e1.display();
		e2.display();
		e3.display();
	}

}
