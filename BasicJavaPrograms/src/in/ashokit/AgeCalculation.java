package in.ashokit;

import java.util.Scanner;

public class AgeCalculation {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the Yout Birth Year : ");
			int year = sc.nextInt();
			System.out.println("enter the current year : ");
			int current=sc.nextInt();
			if(year<=current) {
			System.out.println("Your age is :"+(current-year));
			}
			else {
				System.out.println("INVALID!");
				
			}
			
		}

	}


