package oorg.robot;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Robot extends BaseClass{
	public static void main(String[] args) {
		browserlaunch("chrome");
		urlLanuch("https://www.facebook.com/");
		
}
}