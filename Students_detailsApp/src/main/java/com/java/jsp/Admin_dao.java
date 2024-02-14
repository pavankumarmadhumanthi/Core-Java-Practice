package com.java.jsp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariDataSource;

public class Admin_dao {
	
	
	public boolean getAdmindata(String email,int pasword) throws ClassNotFoundException, Exception {
		try {
			HikariDataSource ds = ConnectionFactory.getConnection();
			Connection con=ds.getConnection();
			String sql="select * from admin where email=? and pasword=?";
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setString(1,email);
			pstmt.setInt(2, pasword);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				return true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	

	public boolean insertAdmindata(String email,int pasword) throws ClassNotFoundException, Exception {
		try {
			HikariDataSource ds = ConnectionFactory.getConnection();
			Connection con=ds.getConnection();
			String sql="insert into admin values(?,?)";
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setString(1,email);
			pstmt.setInt(2, pasword);
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
	
}
