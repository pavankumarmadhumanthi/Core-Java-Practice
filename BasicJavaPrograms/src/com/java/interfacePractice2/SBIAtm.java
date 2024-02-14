package com.java.interfacePractice2;

public class SBIAtm implements ATM{

	@Override
	public void withdraw() {
		System.out.println(" SBIAtm withdraw is going on");
		print();	
		
		
	}

	@Override
	public void print() {
		System.out.println("SBIAtm withdraw is completed");

		
	}

}
