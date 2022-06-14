package org.locator;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sample extends BaseClass {

	public Sample() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="src")
	private WebElement from;
	@FindBy(id="dest")
	private WebElement dest;
	@FindBy(id="search_btn")
	private WebElement btn;
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement calender;
	public WebElement getCalender() {
		return calender;
	}
	public WebElement getBtn() {
		return btn;
	}
	public WebElement getFrom() {
		return from;
	}
	public WebElement getDest() {
		return dest;
	}
	
}
