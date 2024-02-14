package com.ashokit;

import java.util.ArrayList;

import java.util.Scanner;

public class Test {

	public static void showProducts(ArrayList<Product> list) {
		System.out.println("PID"+"\t"+"PNAME"+"\t"+"PRICE");
		System.out.println("=============================");

		list.forEach(p -> System.out.println(p));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Product> al = new ArrayList<>();
		al.add(new Product(1, "laptop", 34564.0));
		al.add(new Product(2, "phone", 3456.0));
		al.add(new Product(3, "car", 345645.0));
		al.add(new Product(4, "tv", 34564.0));
		al.add(new Product(5, "bike", 54564.0));
		showProducts(al);
	}
}
