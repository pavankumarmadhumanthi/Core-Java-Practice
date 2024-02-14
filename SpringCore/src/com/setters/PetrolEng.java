package com.setters;

public class PetrolEng implements Engine {

	@Override
	public boolean start() {
		System.out.println("petrol engine Started");
		return true;
		
	}

}
