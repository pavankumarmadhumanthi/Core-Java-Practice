package com.java.interfacePractice2;

public class HdfcAtm implements ATM{

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println(" HdfcAtm withdraw is going on");
		print();	
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("HdfcAtm withdraw is completed");
		
	}

}
