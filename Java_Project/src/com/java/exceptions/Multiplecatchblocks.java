package com.java.exceptions;
import java.io.*;
import java.util.*;

public class Multiplecatchblocks {
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
		//multiple try blocks not allowed but multiple try catch allow
		try (BufferedReader br = new BufferedReader(new FileReader(f));) {
			String line = new String();
			String text = "";

			while ((line = br.readLine()) != null) {
				// System.out.println(text=line);
				// System.out.println(line);
				text = text + line + "\n";
			}
			System.out.println(text);
			int[] arr= {1,2};
			System.out.println(arr[3]);
		} /*catch (Exception e) {
			e.printStackTrace();//we can handle all exceptions at once
		}*/
		// System.out.println(text);
		catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("you got array exception");
		}
		catch(FileNotFoundException | ArithmeticException e2) {//this individual handling when know exceptions
			e2.printStackTrace();
		}
		/*catch(ArithmeticException e3) {
			e3.printStackTrace();
		}*///we can use single catch to catch more exceptions by using | symbol and single variable
		System.out.println("end of program");
		

	}

}
//when you write system.exit() finally block doesnt execute after this statement thread exits
