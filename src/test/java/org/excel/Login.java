package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.baseclass.BaseClass;

public class Login extends BaseClass {
public static String main(String[] args) throws IOException {
	File f=new File("C:\\Users\\raj\\eclipse-workspace\\MavenSample\\src\\test\\resources\\selenium.xlsx");
	FileInputStream f1=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(f1);
	Sheet s = w.getSheet("Sheet2");
	Row r = s.getRow(1);
	Cell c = r.getCell(2);
	String value;
	int cellType = c.getCellType();
	if(cellType==1) {
		 value = c.getStringCellValue();
		
	}
	else {
		if(DateUtil.isCellDateFormatted(c)) {
			Date ds = c.getDateCellValue();
			SimpleDateFormat dd=new SimpleDateFormat("dd-MM-yy");
			value = dd.format(ds);
		}
		else {
			double n = c.getNumericCellValue();
			long l=(long)n;
			 value = String.valueOf(l);
		}
		}
	return value;
	}
	}
		
	


