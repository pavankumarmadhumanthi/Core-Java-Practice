package com.java.java_fileasInput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Textfile_reading_using_Bufferreader {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("./textfile1.txt");
		if (!f.exists()) {
			f.createNewFile();
		}
		//FileReader fr=new FileReader(f);//we can also use inputstreamreader 
		System.out.println(f.exists());
		FileInputStream fis=new FileInputStream(f);
		InputStreamReader rs=new InputStreamReader(fis);
		BufferedReader br=new BufferedReader(rs);
		/*int asci;
		while((asci=br.read())!=-1) {
			System.out.print((char)asci);
		}*/
		String line=new String();
		while((line=br.readLine())!=null) {
			
			System.out.println(line);
		}

}
}
