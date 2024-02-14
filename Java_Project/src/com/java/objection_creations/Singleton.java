package com.java.objection_creations;

public class Singleton {
	private static Singleton instance=null;

	private Singleton() {
		
	}
	public void thisMethod() {
		System.out.print("this is method");
		
	}
	public static Singleton getInstance() {
		if(instance==null ) {
			instance=new Singleton();
		}
		return instance;
	}
}
