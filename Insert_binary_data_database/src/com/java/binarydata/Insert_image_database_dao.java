package com.java.binarydata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

import com.hikaripractice.ConnectionFactory;
import com.mysql.cj.xdevapi.PreparableStatement;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class Insert_image_database_dao {
	public void insertImage() throws Exception {
		Scanner sc=new Scanner(System.in);
		HikariDataSource ds=ConnectionFactory.getConnection();
		Connection con=ds.getConnection();
		
		try {
			String sql="create table cricket(cid int,c_name varchar(10),c_image blob)";
			Statement stmt=con.createStatement();
			int row=stmt.executeUpdate(sql);
			System.out.println(row);
					
			
		} catch (Exception e) {
			System.out.println("the table is already created! now insertion is going!");
		}
		System.out.println("enter the no of record insert:");
		int number=sc.nextInt();
		while(number>=1) {
			
		try {
			String sql="insert into cricket values(?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			System.out.println("enter cid:");
			int cid=sc.nextInt();
			System.out.println("enter name:");
			String cname=sc.next();
			System.out.println("give file location :");
			String filelocation=sc.next();
			File f=new File(filelocation);
			FileInputStream fis=new FileInputStream(f);
			pstmt.setInt(1,cid);
			pstmt.setString(2,cname);
			pstmt.setBlob(3,fis);
			int rws=pstmt.executeUpdate();
			System.out.println(rws);
			
		} catch (Exception e) {
			System.out.println("error in reading");
		}
		number--;
		}
	}

}
