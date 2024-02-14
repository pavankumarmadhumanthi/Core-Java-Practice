package com.java.abstraction;

public class Hp implements Laptop,Tab {

	@Override
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("hp cut");
		
	}

	@Override
	public void paste() {
		// TODO Auto-generated method stub
		System.out.println("hp paste");
		
	}

	@Override
	public void keyboard() {
		// TODO Auto-generated method stub
		System.out.println("hp keyboard ");
		
	}

	@Override
	public void gaming() {
		// TODO Auto-generated method stub
		System.out.println("tab gaming");
	
		
	}

	@Override
	public void security() {
		// TODO Auto-generated method stub
		Laptop.super.security();
	}


	

}
