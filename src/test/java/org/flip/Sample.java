package org.flip;



import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Sample extends BaseClass {
public static void main(String[] args) {
		urlLaunch("https://www.flipkart.com/");
	implicitWait(20);
	FlipKart f = new FlipKart();
	WebElement close = f.getClose();
	click(close);
	WebElement fashion = f.getFashion();
	moveToElement(fashion);
	WebElement watches = f.getWatches();
	moveToElement(watches);
	WebElement wallet = f.getWallet();
	moveToElement(wallet);
	click(wallet);
	WebElement mywallet = f.getMywallet();
	click(mywallet);
	windowsHandle(1);
	click(f.getAddToCard());
	windowsHandle(0);
	click(f.getSelect2());
	windowsHandle(2);
	click(f.getAddToCard2());
	}

private static void windowsHandle(int i) {
	// TODO Auto-generated method stub
	
}

private static void moveToElement(WebElement fashion) {
	// TODO Auto-generated method stub
	
}

private static void click(WebElement close) {
	// TODO Auto-generated method stub
	
}

private static void implicitWait(int i) {
	// TODO Auto-generated method stub
	
}

private static void urlLaunch(String string) {
	// TODO Auto-generated method stub
	
}

private static WebDriver chromeBrowser() {
	// TODO Auto-generated method stub
	return null;
}
	
		
		
	}

