package com.java.jdbc.CallableStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Student_table_dao {
	private static final String db_driver = "com.mysql.cj.jdbc.Driver";
	private static final String db_url = "jdbc:mysql://localhost:3306/Library";
	private static final String db_user = "root";
	private static final String db_pwd = "PAVANKUMAR";

	public void Student_data(int sid, String sname, double sphone) throws SQLException {
		Connection con = DriverManager.getConnection(db_url,db_user,db_pwd);
		String sql = "insert into Student values(?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, sid);
		pstmt.setString(2, sname);
		pstmt.setDouble(3, sphone);
		int rows_effected = pstmt.executeUpdate();
		System.out.println("row_effected " + rows_effected);
	}

}
