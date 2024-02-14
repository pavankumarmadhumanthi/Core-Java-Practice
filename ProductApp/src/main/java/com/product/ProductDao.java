package com.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.zaxxer.hikari.HikariDataSource;

public class ProductDao {
	public boolean insertProduct(ProductModel productModel) throws Exception{
		boolean value=false;
		try {
			HikariDataSource ds = ConnectionFactory.getConnection();
			Connection con = ds.getConnection();
			String sql="insert into product(productname,productprice,productQuantity)values(?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1,productModel.getProductname());
			pstmt.setInt(2, productModel.getProductprice());
			pstmt.setInt(3,productModel.getProductQuantity());
			 int rows = pstmt.executeUpdate();
			 return value=true;
		} catch (Exception e) {
			e.printStackTrace();
		
		}
		return value;
	

	}
	public List<ProductModel>searchByProductId(ProductModel productmodel) {
		List<ProductModel> list=new ArrayList<>();
		try {
		HikariDataSource ds = ConnectionFactory.getConnection();
		Connection con = ds.getConnection();
		String sql="select * from product where productid=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1,productmodel.getProductid());
		 ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			productmodel.setProductid(rs.getInt(1));
			productmodel.setProductname(rs.getString(2));
			productmodel.setProductprice(rs.getInt(3));
			productmodel.setProductQuantity(rs.getInt(4));
			list.add(productmodel);
		}
		return list;
	} catch (Exception e) {
		e.printStackTrace();
	}
		return list;
	}
	
	
	public List<ProductModel>searchAllProducts() {
		List<ProductModel> list=new ArrayList<>();
		try {
		HikariDataSource ds = ConnectionFactory.getConnection();
		Connection con = ds.getConnection();
		String sql="select * from product ";
		 Statement cstmt = con.createStatement();
		 ResultSet rs = cstmt.executeQuery(sql);
		while(rs.next()) {
			ProductModel productmodel =new ProductModel();
			productmodel.setProductid(rs.getInt(1));
			productmodel.setProductname(rs.getString(2));
			productmodel.setProductprice(rs.getInt(3));
			productmodel.setProductQuantity(rs.getInt(4));
			list.add(productmodel);
		}
		return list;
	} catch (Exception e) {
		e.printStackTrace();
		
	}
		return list;
	}
	
	
}


