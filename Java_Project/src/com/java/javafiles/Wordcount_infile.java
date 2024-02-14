package com.java.javafiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Wordcount_infile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("./textfile1.txt");
		System.out.println(f.exists());
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		int sum = 0;
		int temp=0;
		
		while((temp=br.read())!=-1) {
			if(temp==32|| temp==13) {
				sum=sum+1;
			}
		}
		
		System.out.println(sum);

	}

}
