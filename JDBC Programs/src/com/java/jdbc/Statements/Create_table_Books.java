
package com.java.jdbc.Statements;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Create_table_Books {
	private static final String db_driver = "com.mysql.cj.jdbc.Driver";
	private static final String db_url = "jdbc:mysql://localhost:3306/Library";
	private static final String db_user = "root";
	private static final String db_pwd = "PAVANKUMAR";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName(db_driver);
		Connection con =DriverManager.getConnection(db_url, db_user,db_pwd);
		java.sql.Statement stmt=con.createStatement();
		String sql="create table Books(book_id int, book_name varchar(10),book_price double)";
		int result=stmt.executeUpdate(sql);
		
		
		
		
	}

}
