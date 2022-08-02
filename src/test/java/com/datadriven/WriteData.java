package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {
	public static void writeDataInput() throws IOException {
		File f=new File("C:\\Users\\ADMIN\\eclipse-workspace\\TestMaven\\Excel\\Book1.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet s = wb.createSheet("booksel1");
		Row r = s.createRow(0);
        Cell c = r.createCell(0);	
        c.setCellValue("Username");
        wb.getSheet("booksel1").getRow(0).createCell(1).setCellValue("Password");
        wb.getSheet("booksel1").createRow(1).createCell(0).setCellValue("Selvi");
        wb.getSheet("booksel1").getRow(1).createCell(1).setCellValue("sel@123");
        FileOutputStream fos=new FileOutputStream(f);
        wb.write(fos);
        wb.close();
            
	}
public static void main(String[] args) throws Exception {
	writeDataInput();
}
}
