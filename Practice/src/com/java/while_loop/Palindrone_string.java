package com.java.while_loop;

import java.util.Scanner;

public class Palindrone_string {


		public static void main(String[] args) {
		    Scanner sc=new Scanner(System.in);
		    System.out.println("enter the value of n");
		    String str=sc.next();
		    int sum=0;
		    int len=str.length();
		    for(int i=str.length()-1;i>=0;i--){
		    	int value =str.charAt(i)-'0';
		        sum=sum*10+value;
		        //System.out.println(sum);
		        System.out.println(str.charAt(i));
		        
		    }
			System.out.println(sum);
			if(sum==Integer.parseInt(str)) {
				System.out.println("given number is palindrone");
				
			}
		}
	}

