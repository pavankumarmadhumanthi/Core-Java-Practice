package com.studentdata;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.zaxxer.hikari.HikariDataSource;



public class Student_dao {
	public void dataInsert(int id,String name,String email,Double phno,String address) throws Exception {
		HikariDataSource ds= ConnectionFactory.getConnection();
		Connection  con=ds.getConnection();
		try {
		String sql="create table Student_data(stid int,sname varchar,semail varchar,phno double,saddress varchar)";
		Statement stmt=con.createStatement();
		stmt.executeUpdate(sql);
		
		}catch(Exception e) {
			System.out.println("table already created !");
		}
		String sql="insert into Student_data values(?,?,?,?,?)";
		PreparedStatement pstmt =con.prepareStatement(sql);
		pstmt.setInt(1,id);
		pstmt.setString(2, name);
		pstmt.setString(3, email);
		pstmt.setDouble(4, phno);
		pstmt.setString(5, address);
		int rows=pstmt.executeUpdate();
		System.out.println(rows);
				
				

	con.close();
	}
}
