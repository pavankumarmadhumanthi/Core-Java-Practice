package com.java.jdbc.transcations;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Transcations_money {
	private static final String db_driver = "com.mysql.cj.jdbc.Driver";
	private static final String db_url = "jdbc:mysql://localhost:3306/Library";
	private static final String db_user = "root";
	private static final String db_pwd = "PAVANKUMAR";
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con=DriverManager.getConnection(db_url, db_user, db_pwd);
		con.setAutoCommit(false);
		try {
			String sql="create table Customers(customer_id int,customer_name varchar(10),customer_bal double)";
			java.sql.Statement stmt=con.createStatement();
			stmt.executeUpdate(sql);
			con.commit();
			
		}catch(Exception e) {
			//e.printStackTrace();
			//e.getMessage();
			System.err.println("Customers table is already created");
		}
		try {
			
			java.sql.Statement stmt= con.createStatement();
			String sql1="update Customers set customer_bal=customer_bal-2000 where customer_id= 101";
			stmt.executeUpdate(sql1);
			String sql2="update Customers set customer_bal=customer_bal+2000 where customer_id=102";
			stmt.executeUpdate(sql2);
			con.commit();
			System.out.println("Transcation is successfull!");
			
		}catch(Exception e) {
			con.rollback();
			e.printStackTrace();
		}
		con.close();
	
	}

}
