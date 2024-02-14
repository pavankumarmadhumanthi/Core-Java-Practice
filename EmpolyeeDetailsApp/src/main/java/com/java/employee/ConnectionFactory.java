package com.java.employee;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;



public class ConnectionFactory {

	private static HikariDataSource ks = null;
	private ConnectionFactory() {
		
	}

	
	public static HikariDataSource getConnection() throws ClassNotFoundException, Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Properties pf=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\pavan\\eclipse-workspace\\UserLogin\\DataBase.properties");
		pf.load(fis);
		String db_url = pf.getProperty("db_url");
		String db_user = pf.getProperty("db_user");
		String db_pwd = pf.getProperty("db_pwd");
		if (ks == null) {
			HikariConfig config = new HikariConfig();
			config.setJdbcUrl(db_url);
			config.setUsername(db_user);
			config.setPassword(db_pwd);
			HikariDataSource datasource = new HikariDataSource(config);
			return datasource;
		}
		return ks;

	}

}

