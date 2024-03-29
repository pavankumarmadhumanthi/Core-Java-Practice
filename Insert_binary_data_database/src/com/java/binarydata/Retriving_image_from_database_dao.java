package com.java.binarydata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.hikaripractice.ConnectionFactory;
import com.zaxxer.hikari.HikariDataSource;

public class Retriving_image_from_database_dao {
	public void getImage() throws Exception {
		// File f =new File(D:\imagefromdatabase)
		HikariDataSource ds = ConnectionFactory.getConnection();
		Connection con = ds.getConnection();
		String sql = "select * from cricket where cid=102";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			Blob blob = rs.getBlob(3);
			
			if (blob != null) {
				InputStream is = blob.getBinaryStream();
				File file=new File("./image1.jpeg");
				if(!file.exists()) {
					file.createNewFile();
				}
				FileOutputStream fos = new FileOutputStream(file);
				byte[] b = new byte[1024];
				int data = 0;
			
				while ((data = is.read(b)) != -1) {
					fos.write(b, 0, data);
					
				}

				// Now you have saved the image to a file, and you can display it as needed
				System.out.println("Image saved to 'image.jpg'");
			}

		}

	}

}
