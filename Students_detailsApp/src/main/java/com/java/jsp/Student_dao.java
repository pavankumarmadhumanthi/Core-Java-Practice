package com.java.jsp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.zaxxer.hikari.HikariDataSource;

public class Student_dao {
	
	public ResultSet getStudentdata(int id) {
		ResultSet rs=null;
		try {
			HikariDataSource ds = ConnectionFactory.getConnection();
			Connection con=ds.getConnection();
			String sql="select * from students where id=?";
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setInt(1,id);
			
			 rs = pstmt.executeQuery();
			return rs;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	
	public boolean insertStudentdata(int id, String name,String course,double  phone,String date_of_joining,String email,int pasword) throws ClassNotFoundException, Exception {
		try {
			HikariDataSource ds = ConnectionFactory.getConnection();
			Connection con=ds.getConnection();
			String sql="insert into students values(?,?,?,?,?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setInt(1,id);
			pstmt.setString(2,name);
			pstmt.setString(3,course);
			pstmt.setDouble(4,phone);
			pstmt.setString(5,date_of_joining);
			pstmt.setString(6,email);
			pstmt.setInt(7, pasword);
			int rs = pstmt.executeUpdate();
			if(rs>0) {
				return true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	public ResultSet getAllStudents() {
		ResultSet rs=null;
		try {
			HikariDataSource ds = ConnectionFactory.getConnection();
			Connection con=ds.getConnection();
			String sql="select * from students";
			Statement cstmt = con.createStatement();
			 rs = cstmt.executeQuery(sql);
			return rs;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
		
	}
}


