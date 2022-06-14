package org.hdfc;


import org.baseclass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcLogin extends BaseClass {
public static void main(String[] args) {
		browserlaunch("chrome");
		urlLanuch("https://netbanking.hdfcbank.com/netbanking/");
		implicityWait(10);
		Hdfc h = new Hdfc();
		frame(0);
		sendk(h.getCustId(), "87999964");
		click(h.getBtn());
	    
	
	
}
}