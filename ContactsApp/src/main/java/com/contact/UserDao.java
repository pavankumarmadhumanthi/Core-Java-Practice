package com.contact;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariDataSource;

public class UserDao {

	public boolean createUser(String username,String useremail,String userpassword,String userphno) throws ClassNotFoundException, Exception {
		boolean value = false;
		try {
			HikariDataSource ds = ConnectionFactory.getConnection();
			String sql = "insert into emailuser(username,useremail,userpassword,userphno)values(?,?,?,?)";
			Connection con = ds.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, username);
			pstmt.setString(2, useremail);
			pstmt.setString(3, userpassword);
			pstmt.setString(4, userphno);
			int row = pstmt.executeUpdate();
			if (row == 1) {
				value = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}
	public int getUser(String useremail,String userpassword) {
		int value=0;
		try {
			HikariDataSource ds = ConnectionFactory.getConnection();
			String sql = "select * from emailuser where useremail=? and userpassword=?";
			Connection con = ds.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1,useremail);
			pstmt.setString(2,userpassword);
			
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				value=rs.getInt("userid");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
		
		
	}

}
