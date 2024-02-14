package com.java.connection_pooling;

import java.beans.Statement;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class Connectionpoll_Example {
	//private static final String db_driver = "com.mysql.cj.jdbc.Driver";
	//private static final String db_url = "jdbc:mysql://localhost:3306/Library";
	//private static final String db_user = "root";
	//private static final String db_pwd = "PAVANKUMAR";
	
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File f=new File("C:\\Users\\pavan\\eclipse-workspace\\JDBC Programs\\database.properties");
		FileInputStream fis = new FileInputStream(f);
		Properties p=new Properties();
		p.load(fis);
		String url=p.getProperty("url");
		String user=p.getProperty("Username");
		String pwd=p.getProperty("Password");
		HikariConfig config=new HikariConfig();
		config.setJdbcUrl(url);
		config.setUsername(user);
		config.setPassword(pwd);
		HikariDataSource datasource=new HikariDataSource(config);
		Connection con=datasource.getConnection();
		java.sql.Statement stmt=con.createStatement();
		String sql="select * from Customers";
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next()) {
			System.out.print(rs.getInt(1)+" ");
			System.out.print(rs.getString(2)+" ");
			System.out.print(rs.getDouble(3));
			System.out.println(" ");
			
		}
		
		
		
		
		
		

	}

}
