package com.java.java_writinginfile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writinginto_file_using_Filewriter {

	public static void main(String[] args) throws IOException {
		File f = new File("./writing_into_textfile.txt");
		if (f.exists()) {
			f.delete();
		}
		System.out.println(f.createNewFile());
		String[] str = {"Kumar"};
		FileWriter fw = new FileWriter(f);
		fw.write("pavan kumar");
		fw.flush();

	}
}
