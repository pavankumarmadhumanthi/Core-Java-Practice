package com.java.inheritance;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Guest guest=new Guest();
		guest.read();
		
		Developer dev = new Developer();
		dev.read();
		dev.write();
		
		Admin ad=new Admin();
		ad.read();
		ad.write();
		ad.manage();
	}

}
