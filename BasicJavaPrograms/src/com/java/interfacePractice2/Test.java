package com.java.interfacePractice2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM t=new AxisAtm();
		t.withdraw();
		System.out.println("=====================");
		ATM t1=new HdfcAtm();
		t1.withdraw();
		System.out.println("=====================");
		ATM t2=new SBIAtm();
		t2.withdraw();

	}

}
