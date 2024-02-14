package com.ashokit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {
	public void arithmeticException() {
		try {
			int num=10;
			int value=num/0;
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Arithmetic Exception occured");
			
		}
		System.out.println("Exception is handled");
	}
	public void nullPointerException() {
		try {
			String str=null;
			int length=str.length();
		}catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("Null Pointer exception is handled");
	}
	public void checkedException() throws FileNotFoundException {
			FileInputStream fis =new FileInputStream("/welcome.txt");
	}
	
	public static void main(String[] args) throws Exception {
		ExceptionHandling e=new ExceptionHandling();
		e.arithmeticException();
		e.nullPointerException();
		e.checkedException();
		
	}

}
