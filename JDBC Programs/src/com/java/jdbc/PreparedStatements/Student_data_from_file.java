package com.java.jdbc.PreparedStatements;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

import com.java.jdbc.CallableStatements.Student_table_dao;

public class Student_data_from_file {

	public static void main(String[] args) throws IOException, SQLException {
		// TODO Auto-generated method stub
		File f=new File("./Student_data.txt");
		if(!f.exists()) {
			f.createNewFile();
			System.out.println("New file is created!");
		}
		FileReader fr=new FileReader(f);
		try (BufferedReader br = new BufferedReader(fr)) {
			String line="";
			Student_table_dao student=new Student_table_dao();
			while((line=br.readLine())!=null) {
				//System.out.println(line);
				String[] arr=line.split(",");
				int sid=Integer.parseInt(arr[0]);
				String sname=arr[1];
				double sphone=Double.parseDouble(arr[2]);
				student.Student_data(sid, sname, sphone);	
				
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
