package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public static void main(String[] args) throws IOException {
		
	
	File f = new File("C:\\Users\\raj\\eclipse-workspace\\MavenSample\\src\\test\\resources\\selenium.xlsx");
	FileInputStream f1 = new FileInputStream(f);
	Workbook w = new XSSFWorkbook(f1);
	Sheet s = w.getSheet("Sheet1");
	Row r = s.getRow(0);
	Cell c = r.getCell(4);
	System.out.println(c);
	int ph = s.getPhysicalNumberOfRows();
	System.out.println(ph);
	
	int pc = r.getPhysicalNumberOfCells();
	System.out.println(pc);
	
	for(int i=0;i<r.getPhysicalNumberOfCells();i++) {
		Cell cell = r.getCell(i);
		System.out.println(cell);
	}
		for(int i=0;i<r.getPhysicalNumberOfCells();i++) {
			Row rr = s.getRow(i);
			for(int j=0;j<rr.getPhysicalNumberOfCells();j++) {
			Cell cc = rr.getCell(j);
				System.out.println(cc);
				}
	}
}
}