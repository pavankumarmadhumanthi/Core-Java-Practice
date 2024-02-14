package com.java.writing_into_xls;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExelSheet {
	public static void main(String[] args) throws Exception {

		File f = new File("C:\\Users\\pavan\\Downloads\\Sample-Employee-Data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.getSheetAt(2);
		int rowcount = sheet.getPhysicalNumberOfRows();
		for (int i = 0; i < rowcount; i++) {
			XSSFRow row = sheet.getRow(i);
			int cellcount = row.getPhysicalNumberOfCells();
			for (int j = 0; j < cellcount; j++) {
				XSSFCell cell = row.getCell(j);
				String cellValue = getCellValue(cell);
				System.out.print(" " + cellValue);
			}

		}
		workbook.close();
		fis.close();

	}

	public static String getCellValue(XSSFCell cell) {
		switch (cell.getCellType()) {
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
