package com.java.java_fileasInput;
import java.io.*;

public class Newfile {
	public static void main(String[] args) throws IOException {
		File f=new File("D:\\Html Programs\\module.txt");
		System.out.println(f.createNewFile());
		//System.out.println(f.delete());
		/*if(f.exists()) {
			System.out.println(f.delete());
			System.out.println(f.createNewFile());
			
		}*/
		System.out.println(f.isHidden());
		System.out.println(f.canWrite());
		System.out.println(f.setWritable(false));
		System.out.println(f.canWrite());
	}

}

