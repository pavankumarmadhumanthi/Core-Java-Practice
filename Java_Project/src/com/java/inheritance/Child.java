package com.java.inheritance;
class Parent{
	String name="Bmw";
}

public class Child extends Parent{
	
	public void hello() {
		System.out.println(name);
		
		
	}
	
	public static void main(String[] args) {
		Child c=new Child();
		c.hello();
		
		
		
	}
	 
 }
