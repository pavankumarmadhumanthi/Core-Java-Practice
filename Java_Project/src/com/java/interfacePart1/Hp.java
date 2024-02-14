package com.java.interfacePart1;

public class Hp implements Laptop{

	@Override
	public void copy() {
		// TODO Auto-generated method stub
		System.out.println("copy method of Hp");
	}

	@Override
	public void paste() {
		// TODO Auto-generated method stub
		System.out.println("paste method of hp");
	}

	@Override
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("cut method of hp");
	}

	@Override
	public void keyboard() {
		// TODO Auto-generated method stub
		System.out.println("Keyboard method of hp");
	}

}
