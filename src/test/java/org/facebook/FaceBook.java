package org.facebook;


import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook  extends BaseClass {
public static void main(String[] args) {
	
	WebDriver driver = chromeBrowser();
	
	urlLaunch("https://www.facebook.com/");
	
	implicitWait(20);
	
	String currentUrl = getCurrent();
	System.out.println(currentUrl);
	
	String title = getTitle();
	System.out.println(title);
   
    
  WebElement userName = driver.findElement(By.id("email"));
   sendKeys(userName, "Ashok");
   
   WebElement password = driver.findElement(By.id("pass"));
   sendKeys(password, "748688");
    
  WebElement btn = driver.findElement(By.name("login"));
   click(btn);
}

private static WebDriver chromeBrowser() {
	// TODO Auto-generated method stub
	return null;
}

public static void click(WebElement btn) {
	// TODO Auto-generated method stub
	
}

private static void sendKeys(WebElement userName, String string) {
	// TODO Auto-generated method stub
	
}

public static String getTitle() {
	// TODO Auto-generated method stub
	return null;
}

private static String getCurrent() {
	// TODO Auto-generated method stub
	return null;
}

private static void implicitWait(int i) {
	// TODO Auto-generated method stub
	
}

private static void urlLaunch(String string) {
	// TODO Auto-generated method stub
	
}
}
