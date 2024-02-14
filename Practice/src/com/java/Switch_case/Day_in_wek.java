package com.java.Switch_case;

import java.util.Scanner;

public class Day_in_wek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.Monday \n 2.Tuesday \n 3.Wednesday \n 4.Thursday \n 5.Friday \n 6.Saturday \n 7.Sunday");
		System.out.println("Choose which day you like most:");
		int day = sc.nextInt();
		switch (day) {
		case 1:
			System.out.println(" Yes! monday is a good day ");
			break;
		case 2:
			System.out.println(" Yes! tuesday is a good day ");
			break;
		case 3:
			System.out.println(" Yes! wednesday is a good day ");
			break;
		case 4:
			System.out.println(" Yes! Thursday is a good day ");
			break;
		case 5:
			System.out.println(" Yes! Friday is a good day ");
			break;
		case 6:
			System.out.println(" Yes! Saturday is a good day ");
			break;
		case 7:
			System.out.println(" Yes! Sunday is a good day ");
			break;
		}

	}

}
