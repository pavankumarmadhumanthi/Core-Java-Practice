package com.java.ThreadExamples;

public class MyThread extends Thread {
	public void run() {
		System.out.println(" Thread is executed !");
	}
	public static void main(String[] args) {
		MyThread t=new MyThread();
		
		t.start();
		
	}

}
