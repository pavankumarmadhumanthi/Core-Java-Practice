package com.java.writing_into_xls;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadingAllDataExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File f=new File("C:\\Users\\pavan\\eclipse-workspace\\Apache_poi_microsoft_files_reading\\Test1writing.xls");
		FileInputStream fis=new FileInputStream(f);
		HSSFWorkbook workbook=new HSSFWorkbook(fis);
		HSSFSheet sheet=workbook.getSheetAt(0);
		int rowcount=sheet.getPhysicalNumberOfRows();
		for(int i=0;i<rowcount;i++) {
			HSSFRow row=sheet.getRow(i);
			int cellcount=row.getPhysicalNumberOfCells();
			for(int j=0;j<cellcount;j++) {
				HSSFCell cell=row.getCell(j);
				String cellValue=getCellValue(cell);
				System.out.print(" "+cellValue);
			}
			
		}
		workbook.close();
		fis.close();
		
		
	}
	public static String getCellValue(HSSFCell cell)
	{
		switch(cell.getCellType()) {
		case NUMERIC:
			return String.valueOf(cell.getNumericCellValue());
		case STRING:
			return String.valueOf(cell.getStringCellValue());
		case BOOLEAN:
			return String.valueOf(cell.getBooleanCellValue());
		default:
			return cell.getStringCellValue();
		
		}
	}
}
