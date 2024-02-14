package com.userdataform;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariDataSource;

public class UserDetailsdao {
	
	public boolean setData(String name,int passwor,Double phno,String email) throws Exception {
		
		
			HikariDataSource ds = ConnectionFactory.getConnection();
			Connection con=ds.getConnection();
			String sql="insert into UserDetails values(?,?,?,?)";
			try {
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setString(1,name);
			pstmt.setInt(2,passwor);
			pstmt.setDouble(3,phno);
			pstmt.setString(4,email);
			int rows=pstmt.executeUpdate();
			System.out.println(rows);
			return true;
		} catch (SQLException e) {
			
			return false;
			}
		}
		
		
		
		
	public String getData(int passwor,String email) throws Exception {
			
			String name="";
			try {
				HikariDataSource ds = ConnectionFactory.getConnection();
				Connection con=ds.getConnection();
				String sql="select * from UserDetails where passwor=? and email=?";
				PreparedStatement pstmt=con.prepareStatement(sql);
				pstmt.setDouble(1, passwor);
				pstmt.setString(2,email);
				ResultSet res=pstmt.executeQuery();
				if(res.next()) {
					name=res.getString(1);
				}
			} catch (SQLException e) {
				
				name="";
			}
			if(name.length()>1) {
				return name;
			}
			return name;
			
		}
}


			
			



