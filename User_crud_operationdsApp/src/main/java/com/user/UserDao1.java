package com.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.zaxxer.hikari.HikariDataSource;

public class UserDao1 {

	public boolean InsertUser(User usermodel) throws ClassNotFoundException, Exception {
		boolean value = false;
		String sql = "insert into user(username,useremail,userphno)values(?,?,?)";

		try {
			HikariDataSource ds = ConnectionFactory.getConnection();
			Connection con = ds.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, usermodel.getUsername());
			pstmt.setString(2, usermodel.getUseremail());
			pstmt.setInt(3, usermodel.getUserphno());
			int row = pstmt.executeUpdate();
			if (row >= 1) {
				value = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}

	public List<User> getallUsers() throws Exception {
		List<User> list = new ArrayList<>();
		try {
			HikariDataSource ds = ConnectionFactory.getConnection();
			Connection con = ds.getConnection();
			String sql = "select * from user";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				User usermodel = new User();
				usermodel.setUserid(rs.getInt(1));
				usermodel.setUsername(rs.getString(2));
				usermodel.setUseremail(rs.getString(3));
				usermodel.setUserphno(rs.getInt(4));
				list.add(usermodel);
			}
			return list;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;

	}
	public boolean updateUser(User usermodel) throws ClassNotFoundException, Exception {
		boolean value = false;
		String sql = "update user usename=?,useremail=?,userphno=?";

		try {
			HikariDataSource ds = ConnectionFactory.getConnection();
			Connection con = ds.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, usermodel.getUsername());
			pstmt.setString(2, usermodel.getUseremail());
			pstmt.setInt(3, usermodel.getUserphno());
			int row = pstmt.executeUpdate();
			if (row >= 1) {
				value = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}
	public boolean deleteUser(User usermodel) throws ClassNotFoundException, Exception {
		boolean value = false;
		String sql = "delete from user where useremail=?";

		try {
			HikariDataSource ds = ConnectionFactory.getConnection();
			Connection con = ds.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, usermodel.getUseremail());
			int row = pstmt.executeUpdate();
			if (row >= 1) {
				value = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}
	public User getUserById(User model) throws Exception {
		List<User> list = new ArrayList<>();
		try {
			HikariDataSource ds = ConnectionFactory.getConnection();
			Connection con = ds.getConnection();
			String sql = "select * from user where userid=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,model.getUserid());
			ResultSet rs =pstmt.executeQuery();
			while (rs.next()) {
				User usermodel = new User();
				usermodel.setUserid(rs.getInt(1));
				usermodel.setUsername(rs.getString(2));
				usermodel.setUseremail(rs.getString(3));
				usermodel.setUserphno(rs.getInt(4));
				
			}
			return model;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return model;

	}


}
