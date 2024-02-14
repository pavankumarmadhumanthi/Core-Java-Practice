package com.java.inheritance;

public class Admin extends Developer {
	public void manage() {
		super.read();
		write();
		System.out.println("mange");
		
	}
	public void read() {
		System.out.println("are accessing the admin read method");
	}

}
