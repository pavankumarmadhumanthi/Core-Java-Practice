package com.java.string_operations;

public class Removing_repeated_char {

	public static void main(String[] args) {
		String str = "PavanKumarMadhumanthi";
		char[] name = str.toCharArray();
		StringBuffer b = new StringBuffer();
		for (int i = 0; i < name.length; i++) {
			boolean flag = true;
			for (int j = i + 1; j < name.length; j++) {
				if (name[i] == name[j]) {
					flag = false;
				}
			}
			if (flag) {
				b.append(name[i]);
			}
		}
		System.out.println(b);
	}
}
