package in.ashokit;

import java.util.Scanner;

public class SwappingTwoNumbersWithout {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.print("enter the value a");
			int a=sc.nextInt();
			System.out.print("Enter the value of b: ");
			int b=sc.nextInt();
			System.out.println("before Swapping a="+a+" " +"b=" + b);
			
			a=a+b;
			b=a-b;
			a=a-b;
			
			System.out.println("after Swapping a="+a+" " +"b=" + b);

		}

	

}
