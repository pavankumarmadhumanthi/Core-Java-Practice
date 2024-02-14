package com.java.java_fileasInput;

import java.io.File;
import java.io.IOException;

public class Files {
	public static void main(String[] args) throws IOException {
		File f=new File("D:\\Ecliple_file_handling\\resume1.txt");
		//System.out.println(f.createNewFile());
		System.out.println(f.delete());
		//System.out.println(f.exists());
		/*if(f.exists()) {
			f.delete();
		}
		System.out.println(f.createNewFile());*/
		//System.out.println(f.isHidden());
		//System.out.println(f.canWrite());
		//to create folder we use same file instance but we use f.mkdir()for creating single folder
		//for more than one folder use f.mkdirs and remainings are same are files
		}
	}


