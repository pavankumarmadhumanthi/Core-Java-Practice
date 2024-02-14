package com.hikaripractice;


import java.sql.Connection;
import java.sql.ResultSet;
import com.zaxxer.hikari.HikariDataSource;

public class Booksdao {
	public void getalldata() throws Exception {
		HikariDataSource ds = ConnectionFactory.getConnection();
		Connection con=ds.getConnection();
		String sql="select * from Books";
		java.sql.Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next()) {
			System.out.print(rs.getInt(1)+" ");
			System.out.print(rs.getString(2)+" ");
			System.out.println(rs.getDouble(3));
		}
		
		
		
	}
	
}
		
