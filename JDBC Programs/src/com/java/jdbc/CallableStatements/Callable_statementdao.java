package com.java.jdbc.CallableStatements;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Callable_statementdao {
	private static final String db_driver = "com.mysql.cj.jdbc.Driver";
	private static final String db_url = "jdbc:mysql://localhost:3306/Library";
	private static final String db_user = "root";
	private static final String db_pwd = "PAVANKUMAR";
	
	
	public void studentnames() throws Exception 
	{
		Connection con=DriverManager.getConnection(db_url,db_user,db_pwd);
		String sql="call studen_names()";
		CallableStatement cstmt=con.prepareCall(sql);
		ResultSet rs=cstmt.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getString(1));
		}
		con.close();
		
	}
}
