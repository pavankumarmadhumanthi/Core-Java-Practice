package com.java.java_fileasInput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile_adddata_ReadData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f=new File("D:\\Java_programs\\test.text");
		if(!f.exists()) {
			System.out.println(f.createNewFile());
		}
		FileWriter fw=new FileWriter(f);
		System.out.println("Enter the data to be stored in file");
		Scanner sc=new Scanner(System.in);
		String data=sc.nextLine();
		fw.write(data);
		fw.flush();
	
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String value="";
		while((value=br.readLine())!=null) {
			System.out.println(value);
		}
	
//		int value;
//		while((value=fr.read())!=-1){
//		System.out.print((char)value);
//		}
//		

	
	}
}
