package com.java.writing_into_xls;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class CreateReadingExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File f=new File("C:\\Users\\pavan\\eclipse-workspace\\Apache_poi_microsoft_files_reading\\Test1writing.xls");
		FileInputStream fis=new FileInputStream(f);
		HSSFWorkbook workbook=new HSSFWorkbook(fis);
		HSSFSheet sheet=workbook.getSheet("sample");
		int id=(int) sheet.getRow(0).getCell(0).getNumericCellValue();
		String name=sheet.getRow(0).getCell(1).getStringCellValue();
		System.out.println(id);
		System.out.println(name);
		workbook.close();
		fis.close();
		//f.close();

	}

}
