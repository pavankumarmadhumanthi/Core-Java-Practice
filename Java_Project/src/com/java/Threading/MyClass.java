package com.java.Threading;

public class MyClass extends Thread {
	
	@Override
	public synchronized void run(){ 
		
		System.out.println("thread is running..."); 
		
		System.out.println(10);
		
		}  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass m=new MyClass();
		m.start();
		MyClass m1=new MyClass();
		m1.start();
		MyClass m2=new MyClass();
		m2.start();
	}

}
