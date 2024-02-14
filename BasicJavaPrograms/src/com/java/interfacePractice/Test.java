package com.java.interfacePractice;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank=new HdfcBank();
		bank.deposit();
		bank.withdraw();
		System.out.println("===============================");
		Bank bank1=new AxisBank();
		bank1.deposit();
		bank1.withdraw();
		System.out.println("===============================");
		Bank bank2=new SbiBank();
		bank2.deposit();
		bank2.withdraw();
	}

}
