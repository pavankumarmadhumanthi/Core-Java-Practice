package com.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.zaxxer.hikari.HikariDataSource;

public class UserDao {

	public boolean createUser(User user) throws Exception {
		boolean value = false;
		try {
			HikariDataSource ds = ConnectionFactory.getConnection();
			Connection con = ds.getConnection();
			String sql = "insert into user(username,useremail,userphno)values(?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getUseremail());
			pstmt.setInt(3, user.getUserphno());
			int row = pstmt.executeUpdate();
			if (row != 0) {
				value = true;
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;

	}

	public boolean updateUser(String username,String useremail,int userphno,int userid) {
		boolean value = false;
		try {
			HikariDataSource ds = ConnectionFactory.getConnection();
			Connection con = ds.getConnection();
			String sql = "update user set username=? useremail=? userphno=? where userid=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, username);
			pstmt.setString(2, useremail);
			pstmt.setInt(3, userphno);
			pstmt.setInt(4, userid);
			
			int row = pstmt.executeUpdate();
	
			if (row != 0) {
				value = true;
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;

	}

	public boolean deleteUser(User user) throws ClassNotFoundException, Exception {
		boolean value = false;

		try {
			HikariDataSource ds = ConnectionFactory.getConnection();
			Connection con = ds.getConnection();
			String sql = "delete from user where userid=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, user.getUserid());
			int row = pstmt.executeUpdate();
			if (row != 0) {
				value = true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return value;

	}

	public List<User> retrieveAllUsers() {
		List<User> list = new ArrayList<User>();

		try {
			HikariDataSource ds = ConnectionFactory.getConnection();
			Connection con = ds.getConnection();
			String sql = "select * from user";
			Statement cstmt = con.createStatement();
			ResultSet rs = cstmt.executeQuery(sql);
			while (rs.next()) {
				User user = new User();
				user.setUserid(rs.getInt("userid"));
				user.setUsername(rs.getString("username"));
				user.setUseremail(rs.getString("useremail"));
				user.setUserphno(rs.getInt("userphno"));
				list.add(user);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;

	}

	public User retrieveUser(int userId) {
		User user = new User();
		try {
			HikariDataSource ds = ConnectionFactory.getConnection();
			Connection con = ds.getConnection();
			String sql = "select * from user where userid=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, userId);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				user.setUsername(rs.getString("username"));
				user.setUseremail(rs.getString("useremail"));
				user.setUserphno(rs.getInt("userphno"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;

	}

}
