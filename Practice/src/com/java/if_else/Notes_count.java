package com.java.if_else;

import java.util.Scanner;

public class Notes_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount : ");
		int amount=sc.nextInt();
		int notes=0;
		if(amount>0) {
			if(amount/500>=0) {
				notes=amount/500;
				System.out.println("the number of 500 notes in amount :"+notes);
				amount=amount-(500*notes);
				}
			else {
				System.out.println("the number of 500 notes are :0 ");
			}
			if(amount/200!=0) {
				notes=amount/200;
				System.out.println("the number of 200 notes in amount :"+notes);
				amount=amount-(200*notes);
				}
			else {
				System.out.println("the number of 200 notes are :0 ");
			}
			if(amount/100!=0) {
				notes=amount/100;
				System.out.println("the number of 100 notes in amount :"+notes);
				amount=amount-(100*notes);
				}
			else {
				System.out.println("the number of 100 notes are :0 ");
			}
			if(amount/20!=0) {
				notes=amount/20;
				System.out.println("the number of 20 notes in amount :"+notes);
				amount=amount-(20*notes);
				}
			else {
				System.out.println("the number of 20 notes are :0 ");
			}
			if(amount%10!=0) {
				notes=amount/10;
				System.out.println("the number of 10 notes in amount :"+notes);
				amount=amount-(10*notes);
				}
			else {
				System.out.println("the number of 10 notes are :0 ");
			}
			if(amount/5!=0) {
				notes=amount/5;
				System.out.println("the number of 5 notes in amount :"+notes);
				amount=amount-(5*notes);
				}
			else {
				System.out.println("the number of 5 notes are :0 ");
			}
			if(amount/2!=0) {
				notes=amount/2;
				System.out.println("the number of 2 notes in amount :"+notes);
				amount=amount-(2*notes);
				}
			else {
				System.out.println("the number of 2 notes are :0 ");
			}
			if(amount/1!=0) {
				notes=amount/1;
				System.out.println("the number of 1 notes in amount :"+notes);
				amount=amount-(1*notes);
				}
			else {
				System.out.println("the number of 1 notes are :0 ");
			}
		}

	}

}
