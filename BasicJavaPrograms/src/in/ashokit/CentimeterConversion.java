package in.ashokit;

import java.util.Scanner;

public class CentimeterConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the meters : ");
		float meters=sc.nextFloat();
		System.out.println("Given meters in centimeter : "+meters*100);
		System.out.println("Given meters in millimeter : "+meters*1000);
		

	}

}
