package com.java.java_writinginfile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Writinginto_file_using_Fileoutputstream {
	public static void main(String[] args) throws IOException {
		File f = new File("./writing_into_textfile.txt");
		if (f.exists()) {
			f.delete();
		}
		System.out.println(f.createNewFile());
		String str="pavan";
		FileOutputStream fos=new FileOutputStream(f);
		fos.write(72);
		fos.write(69);
		fos.write(76);
		fos.write(76);
		fos.write(79);
		for(char ch:str.toCharArray()) {
			fos.write((int)ch);
		}
		fos.flush();//flush internally calls close()
		
	}
}
