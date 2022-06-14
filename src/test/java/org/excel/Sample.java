package org.excel;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.robot.Robot;

public class Sample extends BaseClass {

	public Sample() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private WebElement txtuser;
	@FindBy(id="pass")
	private WebElement password;
	public WebElement getTxtuser() {
		return txtuser;
	}
	public WebElement getPassword() {
		return password;
	}
	
	
}
