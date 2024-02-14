package com.java.jdbc.PreparedStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Retrive_books_where {
	private static final String db_driver = "com.mysql.cj.jdbc.Driver";
	private static final String db_url = "jdbc:mysql://localhost:3306/Library";
	private static final String db_user = "root";
	private static final String db_pwd = "PAVANKUMAR";

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the book_id :");
		int id=sc.nextInt();
		String sql="select book_name from Books where book_id=?";
		Connection con=DriverManager.getConnection(db_url,db_user,db_pwd);
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setInt(1,id);
		
		ResultSet s=pstmt.executeQuery();
		while(s.next()) {
			System.out.println(s.getString(1));
		}
////			System.out.println(s.getString(2));
////			System.out.println(s.getDouble(3));
////		}
//		

	}

}
