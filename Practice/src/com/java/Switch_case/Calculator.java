package com.java.Switch_case;

import java.util.Scanner;

public class Calculator {

	public static void addition(int a, int b) {
		System.out.println(a + b);
	}

	public static void subtract(int a, int b) {
		System.out.print(a - b);
	}

	public static void multiplcation(int a, int b) {
		System.out.print(a*b);
	}

	public static void division(float a, float b) {
		double value=a/b;
		System.out.print(value);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the values for a and b :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("  1.addition 2.substraction 3.multiplication 4.divisin ");
		int value = sc.nextInt();

		switch (value) {
		case 1:
			addition(a, b);
			break;
		case 2:
			subtract(a, b);
			break;
		case 3:
			multiplcation(a, b);
			break;
		case 4:
			if(b==0) {
				System.out.println("b value not equal to zero 0 ");
			}
			else {
			division(a, b);
			}
			break;
		default:
			System.out.println("please enter the value from given");

		}

	}

}
