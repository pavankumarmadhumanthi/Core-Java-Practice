package com.java.exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Exception_handling2 {

	public static void main(String[] args) throws IOException {
		// resources passing to the try block
		// Multiple catch blocks
		// multiple exceptions in single catch block
		// user defined exceptions
		File f = new File("./textfile1.txt");
		if (!f.exists()) {
			f.createNewFile();
		}
		System.out.println(f.exists());
		try (BufferedReader br = new BufferedReader(new FileReader(f));) {
			String line = new String();
			String text = "";

			while ((line = br.readLine()) != null) {
				// System.out.println(text=line);
				// System.out.println(line);
				text = text + line + "\n";
			}
			System.out.println(text);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// System.out.println(text);

	}

}
