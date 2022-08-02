package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {

	private static void readData() throws IOException {

		File f=new File("C:\\Users\\ADMIN\\eclipse-workspace\\TestMaven\\Excel\\datadrivendemo.xlsx");
		FileInputStream fis= new  FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		CellType cellType = cell.getCellType();
		if(cellType.equals(CellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
		}
		else if(cellType.equals(CellType.NUMERIC)) {
			CellType numeric = CellType.NUMERIC;
			System.out.println(numeric);
		}
		wb.close();
	}
	
	public static void main(String[] args) throws IOException {
		readData();
		System.out.println("Print successfully");
	}
}
