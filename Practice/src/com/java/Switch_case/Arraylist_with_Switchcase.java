package com.java.Switch_case;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist_with_Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		String repeat_process;

		do {

			System.out.println("1.ADD Element\n2.Delete Element\n3.Search Element\n4.Update Element ");
			System.out.println("Choose the following one to perform operation on ArrayList :");

			int value = sc.nextInt();
			switch (value) {
			case 1:
				System.out.println("Performing Addition");
				addition(list);
				break;

			case 2:
				System.out.println("Performing Deletion");
				deletion(list);
				break;

			case 3:
				System.out.println("Performing Verification");
				verification(list);
				break;
			case 4:
				System.out.println("Performing Updation");
				updation(list);
				break;
			}
			System.out.println("you want repeat process : yes or no");
			repeat_process = sc.next();
		} while (repeat_process.equals("yes"));

	}

	private static void updation(ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		System.out.println(list);
		System.out.println("Enter the element to be update :");
		Scanner sc = new Scanner(System.in);
		int element = sc.nextInt();
		if (list.contains(element)) {
			System.out.println("enter value to set:");
			int setvalue = sc.nextInt();
			list.set(list.indexOf(element), setvalue);
			System.out.println("Element added Sucessfully !");
			System.out.println(list);

		}

	}

	private static void verification(ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		System.out.println("Enter the element to be check :");
		Scanner sc = new Scanner(System.in);
		int element = sc.nextInt();
		int size=list.size();
		if (size < 0) {
			System.out.println(" Sorry Arraylist is empty");
		}
		else {
		
		System.out.println(list.contains(element)+"\n"+"element is present in list");
		//System.out.print("at"+list.indexOf(element));
		}

	}

	private static void deletion(ArrayList<Integer> list) {
		// TODO Auto-generated method
		System.out.println(list);
		int size = list.size();
		if (size < 0) {
			System.out.println("deletion is not possible ");
		} else if (size > 0) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the index of element to be delete :");
			int value = sc.nextInt();
			try{
				System.out.println("Element is deleted : ");
				System.out.print(list.remove(value));
				
				}
			catch(Exception e) {
				System.err.println("Dont use value ,use index");
				
				
			}
			

		} else {
			System.out.println(" NO elements in list!");
		}
	}

	private static void addition(ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		System.out.println("Enter the element to be add :");
		Scanner sc = new Scanner(System.in);
		int element = sc.nextInt();
		list.add(element);
		System.out.println("Element added Sucessfully !");
		System.out.println(list);

	}

}
