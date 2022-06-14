package org;

import org.baseclass.BaseClass;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLogin extends  BaseClass {
public FacebookLogin() {
	PageFactory.initElements(driver	, this);
}
	@FindBy(name="email")
	private WebElement txtUser;
	@FindBy(name="pass")
	private WebElement txtPass;
	public WebElement getTxtUser() {
		return txtUser;
	}
	public WebElement getTxtPass() {
		return txtPass;
	}

}
