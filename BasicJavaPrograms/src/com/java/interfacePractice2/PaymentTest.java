package com.java.interfacePractice2;

public class PaymentTest {
	public static void main(String[] args) {
		Ipaymet pay=new CreditPayment();
		pay.payment();
		System.out.println("============");
		Ipaymet pay2=new DebitPayment();
		pay2.payment();
		
	}

}
