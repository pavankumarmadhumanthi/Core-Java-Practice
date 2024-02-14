package com.hikaripractice;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class ConnectionFactory {
	private static final String db_url = "jdbc:mysql://localhost:3306/Library";
	private static final String db_user = "root";
	private static final String db_pwd = "PAVANKUMAR";
	private static HikariDataSource ks = null;

	public static HikariDataSource getConnection() {
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
