package com.java.jdbc.PreparedStatements;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Create_table_using_from_file {
	private static final String db_driver = "com.mysql.cj.jdbc.Driver";
	private static final String db_url = "jdbc:mysql://localhost:3306/Library";
	private static final String db_user = "root";
	private static final String db_pwd = "PAVANKUMAR";

	public static void main(String[] args) throws IOException, SQLException {
		// TODO Auto-generated method stub
		File f=new File("./Product_details.txt");
		if(!f.exists()) {
			f.createNewFile();
		}
		FileReader fs=new FileReader(f);
		BufferedReader br=new BufferedReader(fs);
		
		String line="";
		while((line=br.readLine())!=null){
			//System.out.println(line);
			String[] values=line.split(",");
			Connection con=DriverManager.getConnection(db_url,db_user,db_pwd);
			String sql="insert into Products(product_id,product_name,product_price)values(?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setInt(1,Integer.parseInt(values[0]));
			pstmt.setString(2,values[1]);
			pstmt.setDouble(3,Double.parseDouble(values[2]));
			int r=pstmt.executeUpdate();
			System.out.print(r);
//			while(rs.next()) {
//			System.out.println(rs.getInt(1));
//			System.out.println(rs.getString(2));
//			System.out.println(rs.getInt(3));
//			}
//			
			
		}
		

	}

}
