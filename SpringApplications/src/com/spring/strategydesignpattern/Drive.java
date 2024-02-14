package com.spring.strategydesignpattern;

public class Drive {
	Engine eng;
	public Drive(Engine eng) {
		this.eng=eng;
		
	}
	public void cardrive() {
		eng.start();
	}
	
}
