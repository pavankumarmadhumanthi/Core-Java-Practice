package in.ashokit;

import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the body weight : ");
		float weight=sc.nextFloat();
		System.out.println("enter the height : ");
		float height=sc.nextFloat();
		System.out.println("BMi is : "+ weight/Math.pow(height/100, 2));
	}

}
