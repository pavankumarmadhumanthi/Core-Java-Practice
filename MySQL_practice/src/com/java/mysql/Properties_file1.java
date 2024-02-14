package com.java.mysql;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.util.*;

	public class Properties_file1 {
		void properties() throws IOException {
			File f = new File("Database.properties");
			if (!f.exists()) {
				f.createNewFile();
			}
			System.out.println(f.exists());
			Properties pr = new Properties();
			pr.setProperty("url", "localhost123");
			pr.setProperty("username", "admin");
			pr.setProperty("password", "admin123");

			FileOutputStream fp = new FileOutputStream(f);
			pr.store(fp, "new properties file is created");

			FileInputStream fs = new FileInputStream(f);
			pr.load(fs);
			Set<Object> st = pr.keySet();
			for (Object key : st) {
				System.out.println(key);
			}
			System.out.println(pr.isEmpty());

		}

	}
