package com.java.jdbc.Statements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert_value_of_table {
	private static final String db_driver = "com.mysql.cj.jdbc.Driver";
	private static final String db_url = "jdbc:mysql://localhost:3306/Library";
	private static final String db_user = "root";
	private static final String db_pwd = "PAVANKUMAR";

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con=DriverManager.getConnection(db_url,db_user,db_pwd);
		Statement stmt=con.createStatement();
		String sql="insert into Books(book_id,book_name,book_price) values(101,'java',1020),(102,'core java',500),(103,'react',750)";
		int result=stmt.executeUpdate(sql);
		System.out.println(result);

	}

}
