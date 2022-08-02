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

public class All_Read_Data {
	public static void allData() throws IOException {
		File f=new File("C:\\Users\\ADMIN\\eclipse-workspace\\TestMaven\\Excel\\datadrivendemo.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet s = wb.getSheet("Sheet1");
		int rowsize=s.getPhysicalNumberOfRows();
		for(int i=0;i<rowsize;i++) {
			Row r=s.getRow(i);
			int cellsize=r.getPhysicalNumberOfCells();
			for(int j=0;j<cellsize;j++) {
				Cell c=r.getCell(j);
				CellType ce=c.getCellType();
				if(ce.equals(CellType.STRING)) {
					String v = c.getStringCellValue();
					System.out.print(v);
				}else if(ce.equals(CellType.NUMERIC)) {
					double d = c.getNumericCellValue();
					int n=(int)d;
					System.out.print(n);
					
				}
				System.out.print("|");
				
				
			}
			System.out.println();
		}
		
		

	}
	public static void main(String[] args) throws Exception {
		allData();
		
		
	}

}
