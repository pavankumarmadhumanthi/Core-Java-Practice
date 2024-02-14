package com.java.jdbc.CallableStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import com.mysql.cj.jdbc.CallableStatement;

public class Student_name_dao {
	private static final String db_driver = "com.mysql.cj.jdbc.Driver";
	private static final String db_url = "jdbc:mysql://localhost:3306/Library";
	private static final String db_user = "root";
	private static final String db_pwd = "PAVANKUMAR";

	public void getNameById(int id) throws Exception {
		Connection con =DriverManager.getConnection(db_url, db_user, db_pwd);
		String sql="call student_names(?,?)";
		java.sql.CallableStatement cstmt=con.prepareCall(sql);
		cstmt.setInt(1, id);
		cstmt.registerOutParameter(2,Types.VARCHAR);
		ResultSet rs=cstmt.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getString(1));
		}
	
		
		
		
		
		
		
	}

}
