package com.java.Threading;

public class Run implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Run d=new Run();
		Thread thread=new Thread(d);
		thread.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread is running");
		System.out.println(10);
		
	}

}
