package com.hikaripractice;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariDataSource;

public class Customersdao {
	public void getalldata() throws Exception {
		HikariDataSource ds=ConnectionFactory.getConnection();
		Connection con=ds.getConnection();
		java.sql.Statement stmt=con.createStatement();
		String sql="select * from Customers";
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next()) {
			System.out.print(rs.getInt(1)+" ");
			System.out.print(rs.getString(2)+" ");
			System.out.print(rs.getDouble(3));
		}
		
		
	}

}
