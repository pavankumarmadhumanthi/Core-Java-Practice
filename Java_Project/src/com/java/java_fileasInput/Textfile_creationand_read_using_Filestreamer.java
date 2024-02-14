package com.java.java_fileasInput;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Textfile_creationand_read_using_Filestreamer {
	public static void main(String[] args) throws IOException {
		/*text files contain only alpha_numeric and special character*/
		File f=new File("./textfile1.txt");
		if(!f.exists()) {
			System.out.println( "new file created"+" "+f.createNewFile());
		}
		//System.out.println(f.exists());
		FileInputStream fis=new FileInputStream(f);
		int asciicode;
		String text="";
		while((asciicode=fis.read())!=-1) {//read method takes single character from file everytime and -1 when reachs file end
			System.out.print((char)asciicode);
			//System.out.print((char)fis.read());
			text=(text+String.valueOf((char)asciicode));
		};
		//System.out.println(text);
		fis.close();
		
		
	}

}
