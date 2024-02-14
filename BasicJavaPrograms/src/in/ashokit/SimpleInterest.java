package in.ashokit;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Principle amount: ");
		int amount=sc.nextInt();
		System.out.println("Enter the Rate of Interest: ");
		int rate=sc.nextInt();
		System.out.println("Enter the time in years :");
		int time=sc.nextInt();
		
	
		System.out.println("Simple interest = "+(amount*rate*time)/100);

	}
}
