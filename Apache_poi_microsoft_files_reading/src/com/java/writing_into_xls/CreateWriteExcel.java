package com.java.writing_into_xls;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class CreateWriteExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		HSSFWorkbook workbook=new HSSFWorkbook();
		HSSFSheet sheet=workbook.createSheet("sample");
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue(1);
		sheet.getRow(0).createCell(1).setCellValue("pavan");
		
		sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue(2);
		sheet.getRow(1).createCell(1).setCellValue("Arjun");
		
		File file=new File("C:\\Users\\pavan\\eclipse-workspace\\Apache_poi_microsoft_files_reading\\Test1writing.xls");
		FileOutputStream fos=new FileOutputStream(file);
		
		workbook.write(file);
		workbook.close();
		

	}

}
