package com.java.ThreadExamples;

public class MyThread2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run method is executing");
		
	}
	
	public static void main(String[] args) {
		MyThread2 t=new MyThread2();
		Thread t1=new Thread(t);
		t1.start();
		
		
		
	}

}
