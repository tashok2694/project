package org.excel;

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

public class WriteExcel {
public static void main(String[] args) throws IOException {
//	File f = new File("C:\\Users\\raj\\eclipse-workspace\\MavenSample\\src\\test\\resources\\Registor.xlsx");
//	Workbook w=new XSSFWorkbook(0);
//	Sheet  sc = w.createSheet("Sheet1");
//	Row rc = sc.createRow(10);
//	Cell cc = rc.createCell(2);
//	cc.setCellValue("Ashok");
//	FileOutputStream fo=new FileOutputStream(f);
//	w.write(fo);
//	System.out.println("done");
	
//	Add A Sheet in Exiting File
	
	File f=new File("C:\\Users\\raj\\eclipse-workspace\\MavenSample\\src\\test\\resources\\Registor.xlsx");
	FileInputStream fi = new FileInputStream(f);
	Workbook w = new XSSFWorkbook(fi);
	Sheet cs = w.getSheet("Sheet1");
	Row cr = cs.createRow(11);
	Cell cc = cr.createCell(3);
	cc.setCellValue("arun");
	FileOutputStream fo=new FileOutputStream(f);
	w.write(fo);
	System.out.println("done");
	
}  
}
