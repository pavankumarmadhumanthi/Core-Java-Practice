package com.book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.zaxxer.hikari.HikariDataSource;

public class BookDao {

	public boolean setData(BookModel bookModel) throws Exception, Exception {
		boolean value = false;
		try {
			HikariDataSource ds = ConnectionFactory.getConnection();
			Connection con = ds.getConnection();
			String sql = "insert into book(bookname,bookprice,authorname)values(?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bookModel.getBookname());
			pstmt.setInt(2, bookModel.getBookprice());
			pstmt.setString(3, bookModel.getAuthorname());
			int row = pstmt.executeUpdate();
			return value=true;
		} catch (Exception e) {
			return value;
		}
	}

	public List<BookModel> getData() throws Exception, Exception {
		List<BookModel> bookModel1=new ArrayList<>();
		try {
			HikariDataSource ds = ConnectionFactory.getConnection();
			Connection con = ds.getConnection();
			String sql="select * from book";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
			    int bookid=rs.getInt(1);
				String bookname=rs.getString(2);
				int bookprice=rs.getInt(3);
				String authorname=rs.getString(4);
				BookModel model=new BookModel();
				
				bookModel1.add(new BookModel(bookid,bookname,bookprice,authorname));
			
			}
			return bookModel1;
		} catch (Exception e) {
			throw e;
		}
		
	
}

	
}
