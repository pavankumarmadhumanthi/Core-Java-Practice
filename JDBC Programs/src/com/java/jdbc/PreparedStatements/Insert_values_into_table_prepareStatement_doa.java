package com.java.jdbc.PreparedStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert_values_into_table_prepareStatement_doa {
	private static final String db_driver = "com.mysql.cj.jdbc.Driver";
	private static final String db_url = "jdbc:mysql://localhost:3306/Library";
	private static final String db_user = "root";
	private static final String db_pwd = "PAVANKUMAR";
	public void preparedInsert() throws SQLException {
		Connection con=DriverManager.getConnection(db_url, db_user, db_pwd);
		String sql="insert into book values(?,?,?)";
		PreparedStatement pstmt=con.prepareStatement(sql);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many records you want to insert");
		int records=sc.nextInt();
		while(records>=1) {
		System.out.println("enter the book id: ");
		int id=sc.nextInt();
		System.out.println("enter ths book name :");
		String bookname=sc.next();
		System.out.println("enter the bookprice :");
		double bookprice=sc.nextDouble();
		
		pstmt.setInt(1,id);
		pstmt.setString(2,bookname);
		pstmt.setDouble(3,bookprice);
		pstmt.addBatch();
		records=records-1;
		if(records==0) {
			int[] rows=pstmt.executeBatch();
			System.out.println("no of rows effected :"+rows.length);
			
		}
		}
		
	}

}
