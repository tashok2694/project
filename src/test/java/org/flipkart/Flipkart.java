package org.flipkart;

import java.awt.AWTException;
import java.util.List;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Flipkart extends BaseClass{
public static void main(String[] args) throws AWTException, InterruptedException {
	browserlaunch("chrome");
	urlLanuch("https://www.flipkart.com/");
	implicityWait(10);
	LoginPage l = new LoginPage();
	click(l.getLogin());
//	sendk(l.getSearch(), "opeplus mobiles");
//	pressDown();
//	releaseDown();
//	pressEnter();
//	releaseEnter();
	sendkeys(l.getSearch(), "onePlus mobiles", Keys.ENTER);
	click(l.getLowtohigh());
	Thread.sleep(1000);
	
	List<WebElement> productName = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	List<WebElement> price = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
	System.out.println("Product price in Ascending Order");
	for(int i=0;i<=productName.size();i++) {
		System.out.println(productName.get(i).getText());
	}
}
}
