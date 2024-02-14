package com.string;

import java.util.Random;
import java.util.Scanner;

public class Randomotp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str="abcdefghijklmnopqrstuvwxyz1234567890";
		for(int i=0;i<4;i++) {
		
		System.out.print(str.charAt(new Random().nextInt(str.length())));
		
	}}
}
