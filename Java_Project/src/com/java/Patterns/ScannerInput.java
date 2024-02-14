package com.java.Patterns;
import java.util.*;

public class ScannerInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value for i");
		int i=sc.nextInt();
		System.out.println("enter value for j");
		int j=sc.nextInt();
		int temp=i;
		i=j;
		j=i;
		System.out.println("i is "+i+"j is "+j);
		/*scanner is pre-definesd in java
		 * system.in is inputstreamer
		 * */
		sc.close();
		
		
	}

}
