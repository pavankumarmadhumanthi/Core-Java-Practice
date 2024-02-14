package com.java.java_fileasInput;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Textfile_reading_using_Scanner {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("./textfile1.txt");
		if (!f.exists()) {
			f.createNewFile();
		}
		System.out.println(f.exists());
		Scanner sc = new Scanner(f);
		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());

		}
		sc.close();

	}

}
