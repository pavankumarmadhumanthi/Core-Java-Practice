package in.ashokit;

import java.util.Scanner;

public class StringBye {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number : ");
		int num=sc.nextInt();
		if(num%5==0) {
			System.out.println("hello");
		}else {
			System.out.println("Byee");
		}

	}

}
