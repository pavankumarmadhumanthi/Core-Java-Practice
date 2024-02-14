package com.spring.strategydesignpattern;

public class Car {
	
	public static void main(String[] args) {
		
	
	Drive d=new Drive(new PetrolEngine());
	
	d.cardrive();
	
	}

}
