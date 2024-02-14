package com.java.string_operations;

import java.util.Scanner;

public class Dateofbirth {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the date of birth");
		String dob = sc.next();
		String[] s=dob.split("-");
		int date=Integer.parseInt(s[0]);
		int year=Integer.parseInt(s[2]);
		String mon=s[1];
		int luckynum=0;
		if(mon.charAt(0)>=48 && mon.charAt(0)<=57) {
			luckynum=findLuckynum(date,Integer.parseInt(mon),year);
		}else {
			String months="janfebmaraprmayjunjulaugsepoctnovdec";
			mon=mon.toLowerCase();
			mon=mon.substring(0,3);
			int month=months.indexOf(mon);
			month=((int)(month/3)+1);
			luckynum=findLuckynum(date,month,year);
		}
		System.out.println(luckynum);
	}

	private static int findLuckynum(int date, int mon, int year) {
		int luckynum=0;
	 luckynum=luckynum+sumofnum(date);
	 luckynum=luckynum+sumofnum(mon);
	 luckynum=luckynum+sumofnum(year);
	 if(luckynum>9) {
		 luckynum=sumofnum(luckynum);
	 }
	return luckynum;
	}
	private static int sumofnum(int num) {
		int sum=0;
		int rem=0;
		while(num!=0) {
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		
		
		return sum;
	}

}
