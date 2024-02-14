package com.java.javafiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Number0flines_intextfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("./textfile1.txt");
		System.out.println(f.exists());
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		int sum1 = 0;
		int sum=0;
		int total = 0;
		String str = "";

		while ((br.readLine()) != null) {
			sum = sum + 1;
		}
		
		while ((total=fr.read())!= -1) {
			if(total==13) {
				sum1=sum1+1;
			}
		}
		System.out.println(sum);
		
		System.out.println(sum1);

	}

}
