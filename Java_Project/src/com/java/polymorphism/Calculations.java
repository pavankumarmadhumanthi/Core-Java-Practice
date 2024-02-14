package com.java.polymorphism;

public class Calculations {
	public void add(int a,int b) {
		int add= a+b;
		System.out.println(add);
	}
	public void add(int a,int b,int c) {
		int add=a+b+c;
		System.out.println(add);

}
	public static void main(String[] args) {
		Calculations calculations = new Calculations();
		calculations.add(2, 6); 
	}
}
