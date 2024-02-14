package com.java.interfacePart1;

public class Apple implements Laptop{

	@Override
	public void copy() {
		// TODO Auto-generated method stub
		System.out.println("Copy method of Apple");
	}

	@Override
	public void paste() {
		// TODO Auto-generated method stub
		System.out.println("paste method of Apple");
	}

	@Override
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("Cut method of Apple");
	}

	@Override
	public void keyboard() {
		// TODO Auto-generated method stub
		System.out.println("Keyboard method of Apple");
	}

}
