package in.ashokit;

import java.util.Scanner;

public class PositiveorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number : ");
		int num=sc.nextInt();
		if(num>0) {
			System.out.println(num +" is positive number");
		}else if(num<0) {
			System.out.println(num +" is negative number");
		}else {
			System.out.println(num + "is a zero");
		}

	}

}
