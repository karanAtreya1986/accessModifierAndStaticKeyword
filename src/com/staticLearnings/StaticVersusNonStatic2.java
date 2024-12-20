package com.staticLearnings;

public class StaticVersusNonStatic2 {

	int employeeid;
	String employeename;

	static String companyname;

	public StaticVersusNonStatic2(int employeeid, String employeename) {
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
		StaticVersusNonStatic2.companyname = "ranjani organisation";
		System.out.println("main code is starting from here");
		StaticVersusNonStatic2 e1 = new StaticVersusNonStatic2(1, "lion company");
		StaticVersusNonStatic2 e2 = new StaticVersusNonStatic2(2, "cheetah company");
		StaticVersusNonStatic2 e3 = new StaticVersusNonStatic2(3, "goat company");

		e1.display();
		e2.display();
		e3.display();
	}

}
