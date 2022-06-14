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
import org.apache.poi.xssf.usermodel.extensions.XSSFCellAlignment;

public class UpdateExcel {
public static void main(String[] args) throws IOException {
	
	File f = new File("C:\\\\Users\\\\raj\\\\eclipse-workspace\\\\MavenSample\\\\src\\\\test\\\\resources\\\\Registor.xlsx");
	FileInputStream fi=new FileInputStream(f);
	
	Workbook w = new XSSFWorkbook(fi);
	Sheet cs = w.getSheet("Sheet1");
	Row cr = cs.getRow(10);
	Cell cc = cr.getCell(2);
	
	String value = cc.getStringCellValue();
	
	if(value.equals("susila")) {
		cc.setCellValue("Ashok");
		
		FileOutputStream fo = new FileOutputStream(f);
		w.write(fo);
		System.out.println("Valid");
	}
	else {
		System.out.println("mot Valid");
		}
}

}