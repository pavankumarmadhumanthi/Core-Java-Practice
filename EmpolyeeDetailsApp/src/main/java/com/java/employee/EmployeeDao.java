package com.java.employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.zaxxer.hikari.HikariDataSource;

public class EmployeeDao {
	public int addEmployee(EmployeeModel model) throws ClassNotFoundException, Exception {
		int count=0;
		HikariDataSource ds = ConnectionFactory.getConnection();
		Connection con = ds.getConnection();
		String sql="insert into employee values(?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1,model.getEmployeeId());
		pstmt.setString(2,model.getEmployeeName());
		pstmt.setString(3,model.getEmail());
		pstmt.setString(4,model.getCity());
		count = pstmt.executeUpdate();
		return count;
	}
	
	public List<EmployeeModel> getEmployeeById(int id) throws ClassNotFoundException, Exception {
		List<EmployeeModel> employee1=new ArrayList<>();
		HikariDataSource ds = ConnectionFactory.getConnection();
		Connection con = ds.getConnection();
		String sql="select * from employee where EmployeeId=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, id);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			int EmployeeId=rs.getInt(1);
			String EmployeeName=rs.getString(2);
			String email=rs.getString(3);
			String city=rs.getString(4);
			employee1.add(new EmployeeModel(EmployeeId,EmployeeName,email,city));	
		}
		return employee1;

		
	}
	public List<EmployeeModel> getAllEmployee(int id) throws ClassNotFoundException, Exception {
		List<EmployeeModel> employee1=new ArrayList<>();
		HikariDataSource ds = ConnectionFactory.getConnection();
		Connection con = ds.getConnection();
		String sql="select * from employee where id=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, id);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			int EmployeeId=rs.getInt(1);
			String EmployeeName=rs.getString(2);
			String email=rs.getString(3);
			String city=rs.getString(4);
			employee1.add(new EmployeeModel(EmployeeId,EmployeeName,email,city));	
		}
		return employee1;
		
	}


}
