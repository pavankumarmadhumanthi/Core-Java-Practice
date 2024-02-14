package com.java.java_fileasInput;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Textfile_reading_using_filereader {
	public static void main(String[] args) throws IOException {
		File f = new File("./textfile1.txt");
		if (!f.exists()) {
			f.createNewFile();
		}
		System.out.println(f.exists());
		FileReader fr=new FileReader(f);
		int asci;
		while((asci=fr.read())!=-1) {
			System.out.print((char)asci);
			
		}
		fr.close();
		
	}

}
