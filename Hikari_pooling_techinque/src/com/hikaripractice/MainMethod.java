package com.hikaripractice;

public class MainMethod {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Booksdao obj=new Booksdao();
		obj.getalldata();
		System.out.println("===========================================");
		Customersdao obj1=new Customersdao();
		obj.getalldata();

	}

}
