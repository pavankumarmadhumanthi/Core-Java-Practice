package com.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File f=new File("C:\\Users\\pavan\\Downloads\\EmployeeData.xlsx");
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook workbook =new XSSFWorkbook(fis);
		XSSFSheet sheetAt = workbook.getSheet("Solution");
		int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
		for(int i=0;i<physicalNumberOfRows;i++) {
			XSSFRow row = sheetAt.getRow(i);
			int physicalNumberOfCells = row.getPhysicalNumberOfCells();
			for(int j=0;j<physicalNumberOfCells;j++) {
				XSSFCell cell = row.getCell(j);
				System.out.println(cell);
			}
			System.out.println(" ");
			
		}

	}

}
