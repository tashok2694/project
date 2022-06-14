package org.excel;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;

import org.baseclass.BaseClass;

public class FaceBook extends BaseClass {

	 public static void main(String[] args) throws IOException, AWTException {
		 browserlaunch("chrome");
		 urlLanuch("https://www.facebook.com/");
		 Sample s=new Sample();
		sendk(s.getTxtuser(),getExcel("selenium", "Sheet2", 1, 0));
		
		
	}
	
}