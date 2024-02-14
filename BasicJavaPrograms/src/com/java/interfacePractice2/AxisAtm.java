package com.java.interfacePractice2;

public class AxisAtm implements ATM {

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println(" AxisAtm withdraw is going on");
		print();
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("AxisAtm withdraw is completed");
		
		
	}

}
