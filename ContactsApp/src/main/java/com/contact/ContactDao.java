package com.contact;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.zaxxer.hikari.HikariDataSource;

public class ContactDao {
	public boolean createUser(int userid,String contactname,String contactemail,String contact) throws ClassNotFoundException, Exception {
		boolean value = false;
		try {
			HikariDataSource ds = ConnectionFactory.getConnection();
			String sql = "insert into contacts(userid,contactname,contactemail,contact)values(?,?,?,?)";
			Connection con = ds.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, userid);
			pstmt.setString(2, contactname);
			pstmt.setString(3, contactemail);
			pstmt.setString(4, contact);
			int row = pstmt.executeUpdate();
			if (row == 1) {
				value = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;

	}
	public List<Contact> getContacts(int userid) {
		List<Contact> list=new ArrayList<>();
		try {
			HikariDataSource ds = ConnectionFactory.getConnection();
			String sql = "select * from contacts where userid=?";
			Connection con = ds.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,userid);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Contact contact =new Contact();
				contact.setUser(rs.getInt("userid"));
				contact.setContactname(rs.getString("contactname"));
				contact.setContactemail(rs.getString("contactemail"));
				contact.setContact(rs.getString("contact"));
				list.add(contact);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
		
		
	}

}


