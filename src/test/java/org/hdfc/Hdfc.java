package org.hdfc;


import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hdfc extends BaseClass {
	
	public Hdfc() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="login_page")
	private WebElement frame;

	
	@FindBy(xpath="//input[@type='text']")
	private WebElement custId;
	
	@FindBy(xpath="//a[@class='btn btn-primary login-btn']")
	private WebElement btn;
	
	public WebElement getFrame() {
		return frame;
	}

	public WebElement getCustId() {
		return custId;
	}

	public WebElement getBtn() {
		return btn;
	}
}
