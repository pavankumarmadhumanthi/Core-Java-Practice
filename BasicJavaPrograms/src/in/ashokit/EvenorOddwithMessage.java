package in.ashokit;

import java.util.Scanner;

public class EvenorOddwithMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
		int num = sc.nextInt();
		if (num > 100) {
			if (num % 2 == 0) {
				System.out.println(num + " Given number is even number");
			} else {
				System.out.println(num + " Given number is odd number");
			}
		} else {
			System.out.println("Given number is less than 100");
		}

	}

}
