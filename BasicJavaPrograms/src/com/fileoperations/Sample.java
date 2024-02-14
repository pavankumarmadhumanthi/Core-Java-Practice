package com.fileoperations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Sample {

	public static void main(String[] args) throws IOException {
		
		File f1=new File("demo1.txt");
		FileWriter fw=new FileWriter(f1);
		String name1="Hi everyone ";
		fw.write(name1);
		fw.close();
		
		File f2=new File("demo2.txt");
		FileWriter fw2=new FileWriter(f2);
		String name2="how are you? ";
		fw2.write(name2);
		fw2.close();
		
		File f3=new File("demo3.txt");
		String[] files= {"demo1.txt","demo2.txt"};
		FileWriter fw3=new FileWriter(f3,true);
		
		for(int i=0;i<files.length;i++) {
			FileReader fr=new FileReader(files[i]);
			BufferedReader br=new BufferedReader(fr);
			String line=br.readLine();
			while(line!=null) {
				fw3.write(line);
				line=br.readLine();
				fw3.write("\n");
			}
		}
		fw3.close();
		
		
		

	}

}
