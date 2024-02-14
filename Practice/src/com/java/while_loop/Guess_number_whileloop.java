package com.java.while_loop;

import java.util.Random;
import java.util.Scanner;

public class Guess_number_whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Random ran=new Random();
		int secret_num=ran.nextInt(100);
		System.out.println(secret_num);
		int guess;
		int attemps=0;
		System.out.println("Guess the number in between 1-100:");
		while(true) {
			attemps=attemps+1;
			guess=sc.nextInt();
			
			if(secret_num==guess) {
				System.out.println("wow super your guess is correct!"+guess);
				System.out.println("you taken nearly "+attemps+" attemps");
				break;
			}
			else if(secret_num>guess) {
				System.out.println("Sorry please try higher number!");
			}
			else if(secret_num<guess){
				System.out.println("Sorry please try lower value !");
			}
			
		}
		
		

	}

}
