package in.ashokit;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the bill amount : ");
		int amount=sc.nextInt();
		if(amount<1000) {
			System.out.println("Sorry no discount apply !");
			
		}
		if(1001<=amount && amount<=2000) {
			System.out.println("5% discount apply !");
			
		}
		if(2001<=amount && amount<=5000) {
			System.out.println("10% discount apply !");
			
		}
		if(amount>5000) {
			System.out.println("20% discount apply !");
			
		}

	}

}
