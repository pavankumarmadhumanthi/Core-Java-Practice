package com.filehandling;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.studentdata.ConnectionFactory;
import com.zaxxer.hikari.HikariDataSource;

public class Filedao {
	public boolean insert(String filename,String fileurl) throws ClassNotFoundException, SQLException {
		try {
			HikariDataSource ds = ConnectionFactory.getConnection();
			Connection con = ds.getConnection();
			String sql = "insert into filedata values(?,?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, filename);
			pstmt.setString(2, fileurl);
			int row=pstmt.executeUpdate();
			return true;
		} catch (ClassNotFoundException |SQLException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		
		}

	}

}
