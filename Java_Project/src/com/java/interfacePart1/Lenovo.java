package com.java.interfacePart1;

public class Lenovo implements Laptop {

	@Override
	public void copy() {
		// TODO Auto-generated method stub
		System.out.println("copy method of Lenovo");
	}

	@Override
	public void paste() {
		// TODO Auto-generated method stub
		System.out.println("paste method of Lenovo");
	}

	@Override
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("cut method of Lenovo");
	}

	@Override
	public void keyboard() {
		// TODO Auto-generated method stub
		System.out.println("keyboard method of Lenovo");
	}
	@Override
	public void security() {
		System.out.println("this lenovo security");
	
	}
}
