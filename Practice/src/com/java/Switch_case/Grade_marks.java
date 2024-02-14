package com.java.Switch_case;

import java.util.Scanner;

public class Grade_marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter your grade ,you will get marks range");
		System.out.println("A   B    C   D ");
		Scanner sc=new Scanner(System.in);
		char value=sc.next().charAt(0);
		switch(value) {
		case 'A':
			System.out.println("yours marks in between 85 - 100 ");
			break;
		case 'B':
			System.out.println("yours marks in between 70 - 85 ");
			break;
		case 'C':
			System.out.println("yours marks in between 55 - 70 ");
			break;
		case 'D':
			System.out.println("yours marks in between 45 - 55 ");
			break;
		default:
			System.err.println("you entered wrong option ! please enter value from given above");
		}

	}

}
