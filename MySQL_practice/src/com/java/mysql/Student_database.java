package com.java.mysql;

import java.sql.*;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Statement;

public class Student_database {
	private static final String db_driver = "com.mysql.cj.jdbc.Driver";
	private static final String db_url = "jdbc:mysql://localhost:3306/student";
	private static final String db_user = "root";
	private static final String db_pwd = "PAVANKUMAR";

	public static void main(String[] args) throws Exception {
		Class.forName(db_driver);
		try (Connection con = DriverManager.getConnection(db_url, db_user, db_pwd)) {
			java.sql.Statement stmt = con.createStatement();
			//String str = "insert into student(std_id ,std_name ,std_branch)values(121,'pavan','cse'),(122,'naveen','Mech'),(123,'kumar','ece'),(124,'akhil','civil')";
			String str="select * from student;";
			ResultSet rs = stmt.executeQuery(str);
			while(rs.next()) {
				int id=rs.getInt(1);
				System.out.print(id+" ");
				String name=rs.getString(2);
				System.out.print(name+" ");
				String branch=rs.getString(3);
				System.out.println(branch);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
