package com.java.jdbc.Statements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Creating_book_table_insert_batch_dao {
	private static final String db_driver = "com.mysql.cj.jdbc.Driver";
	private static final String db_url = "jdbc:mysql://localhost:3306/Library";
	private static final String db_user = "root";
	private static final String db_pwd = "PAVANKUMAR";
	public void batch_Statement() throws Exception {
		Connection con= DriverManager.getConnection(db_url, db_user, db_pwd);
		java.sql.Statement stmt=con.createStatement();
		try {
		String sql="create table book(book_id int,book_name varchar(10),book_price double)";
		int res=stmt.executeUpdate(sql);
		}catch(Exception e) {
			System.out.print("book table is already created");
		}
		//stmt.addBatch("insert into book values(101, 'java', 1300.00)");
		//stmt.addBatch("insert into book values(102, 'adv-java', 130.00)");
		//stmt.addBatch("insert into book values(103, 'core-java', 135.00)");
		stmt.addBatch("insert into book values(105, 'css', 500.00)");
		int[] count=stmt.executeBatch();
		System.out.println("the no of records effecte:"+ count.length);
		
		
	}

}
