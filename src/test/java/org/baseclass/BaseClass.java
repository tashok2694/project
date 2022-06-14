package org.baseclass;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	
	public static void browserlaunch(String bname) {
		
		if(bname.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			}
		else if(bname.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		}
	public static void urlLanuch(String u) {
		driver.get(u);
		driver.manage().window().maximize();
}
	public static void implicityWait(int t) {
		driver.manage().timeouts().implicitlyWait(t,TimeUnit.SECONDS);
}
	public static String currentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
		}
	public static void sendk(WebElement s,String st) {
		s.sendKeys(st);
}
	public static void quit() {
		driver.quit();
}
	public static void clear(WebElement e) {
		e.clear();

	}
	public static void click(WebElement e) {
	e.click();

	}
	public static String getTitle() {
		String title =driver.getTitle();
		return title;
			}
	public static String getText(WebElement g) {
		 String gettext =g.getText();
		return gettext;
	}
	public static String getAttribute(WebElement a) {
		 String get = a.getAttribute("value");
		return get;
}
	public static Actions doubleclick(WebElement d) {
		Actions a=new Actions(driver);
		a.doubleClick(d).perform();
		return a;
}
	public static Actions rightClick(WebElement c) {
		Actions a=new Actions(driver);
		a.contextClick(c).perform();
		return a;
}
	public static Actions moveto(WebElement m) {
		Actions a=new Actions(driver);
		return a.moveToElement(m);
}
	public static Actions dragandDrop(WebElement target,WebElement source) {
	Actions a=new Actions(driver);
	return a.dragAndDrop(source, target);
}	
	public static void pressUp() throws AWTException {
		 Robot r=new Robot();
		 r.keyPress(KeyEvent.VK_UP);
}
	public static void releaseup() throws AWTException {
		Robot r=new Robot();
		r.keyRelease(KeyEvent.VK_UP);

	}
	public static void pressDown() throws AWTException {
		 Robot r=new Robot();
		 r.keyPress(KeyEvent.VK_DOWN);
	}
	public static void sendks(WebElement s,String st) {
		s.sendKeys(st);
}
	public static void sendkeys(WebElement s,String st , Keys key) {
		s.sendKeys(st,key);
}
	
	public static void releaseDown() throws AWTException {
		 Robot r=new Robot();
		 r.keyRelease(KeyEvent.VK_DOWN);
	}
	
	public static void pressEnter() throws AWTException {
		 Robot r=new Robot();
		 r.keyPress(KeyEvent.VK_ENTER);
	}
	public static void releaseEnter() throws AWTException {
		 Robot r=new Robot();
		 r.keyRelease(KeyEvent.VK_ENTER);
		 
	}
	public static void alertAccept() {
		Alert a=driver.switchTo().alert();
		a.accept();
	}
	public static void alertDismiss() {
		Alert a=driver.switchTo().alert();
		a.dismiss();
	}
	public static Select selectValue(WebElement e,String a) {
		Select s=new Select(e);
		s.selectByValue(a);
		return s;
		}
	public static void selectByVisible(WebElement e,String a) {
		Select s=new Select(e);
		s.selectByVisibleText(a);
		}
	public static void selectByValue(WebElement e,int v) {
		Select s=new Select(e);
		s.selectByIndex(v );
}
	public static List<WebElement> getOption(WebElement e) {
		Select s=new Select(e);
		List<WebElement> options = s.getOptions();
		return options;
		}
	public static List<WebElement> getAllSelect(WebElement e) {
		Select s=new Select(e);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		return allSelectedOptions;
	}
	public static WebElement getFirstSelect(WebElement e) {
		Select s=new Select(e);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		return firstSelectedOption;
	}
	public static boolean isMultiple(WebElement e) {
		Select s=new Select(e);
		boolean multiple = s.isMultiple();
		return multiple;
		}
	public static List<WebElement> selectAll(WebElement e) {
		Select s=new Select(e);
		List<WebElement> Options = s.getAllSelectedOptions();
		for(int i=0;i<Options.size();i++) {
			WebElement w = Options.get(i);
		}
		return Options;
		}
	public static void frame(int t) {
		driver.switchTo().frame(t);
}
	public static void selectByIndex(WebElement e,int i) {
		Select s=new Select(e);
		s.selectByIndex(i);

	}
	public static void selectByValue(WebElement e,String a) {
		Select s=new Select(e);
		s.selectByValue(a);
	}
	public static Object javaScriptGetter(WebElement w) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Object obj = js.executeScript("return arguments[0].getAttribute('value')", w).toString();
		return obj;
		}
	public static void action(WebElement w) {
		Actions a= new Actions(driver);
		a.moveToElement(w).build().perform();

	}
	public static void javaScriptScrollUp(WebElement w) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(flase)", w);
		}
	public static  void javaScriptScrollDown(WebElement w) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arugments[0].scrollIntoUp(true)", w);
		

	}
	public static String getExcel(String filename,String sheet,int i,int h) throws IOException {
		File f=new File("C:\\Users\\raj\\eclipse-workspace\\MavenSample\\src\\test\\resources\\"+filename+".xlsx");
		FileInputStream f1=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(f1);
		Sheet s = w.getSheet(sheet);
		Row r = s.getRow(i);
		Cell c = r.getCell(h);
		int cellType = c.getCellType();
		String value;
		
		if(cellType==1) {
			value = c.getStringCellValue();
		}
		else {
			if(DateUtil.isCellDateFormatted(c)) {
				Date dd = c.getDateCellValue();
				SimpleDateFormat da=new SimpleDateFormat("MM-dd-yyyy");
				value = da.format(dd);
				}
			else {
				double nc = c.getNumericCellValue();
				long l=(long)nc;
				 value = String.valueOf(l);
			}
			}
		return value;
		

	}
}