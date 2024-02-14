package com.java.exceptions;
//stack trace
/*
 * Exception name -java.lang.ArithmeticExeception
 * exception message-/ by zero
 * which line number
 * methods info
 */

public class ArithmeticExce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program execution is started");
		int num1=5;
		int num2=0;
		int res=0;
		try {
			res=num1/num2;
			}
		catch(ArithmeticException e) {
			System.out.println("the result exception occured"+e);//write a logic to enter this msg to logging files
			throw e;// after writing any code after throw will not be executed
			//because its stop execution after throw statement
		}
		finally {
			System.out.println("this is final block");
		}
		
		System.out.println("program execution is ended"+" "+res);
	}

}
