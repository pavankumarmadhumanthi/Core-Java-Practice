package com.string;

import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String to be encryption :");
		String message=new String(sc.nextLine());
		System.out.println("enter the key for encryption :");
		String key=new String(sc.nextLine());
		String msg=encryption(message,key);
		System.out.println(msg);
		

	}

	private static String encryption(String message, String key) {
		
		String[] msg=message.split(" ");
		String[] keys=key.split(" ");
		boolean value=true;
		String regex="^[a-b]+$";
		StringBuffer answer=new StringBuffer();
		
		if(msg.length!=keys.length) {
			value=false;
		}
		for(int i=0;i<message.length();i++) {
			if(regex.contains(message.charAt(i)+"")) {
				value=false;
			}
		}
		if(value) {
			for(int i=0;i<msg.length;i++) {
				int ch=msg[i].length();
				if(ch%2==0) {
					for(int j=0;j<ch;j++) {
						
					}
				}
				
			}
		}
		
		
		
		return key;
		

}
}

