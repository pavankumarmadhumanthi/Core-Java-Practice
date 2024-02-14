package com.java.java_writinginfile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writinginto_file_using_Bufferwriter {
	public static void main(String[] args) throws IOException {
		File f = new File("./writing_into_textfile.txt");
		if (f.exists()) {
			f.delete();
		}
		System.out.println(f.createNewFile());
		String str="pavanjkasfhawehfwuefdf";
		
		BufferedWriter bw=new BufferedWriter(new FileWriter(f));
		bw.write(str);
		bw.flush();
		
		//also possile update the file
	

}
}
