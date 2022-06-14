package org.flipkart;

import java.sql.Driver;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
public LoginPage() {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//button[text()='✕']")
private WebElement login;
@FindBy(name="q")
private WebElement search;
@FindBy(xpath="(//div[@class='_10UF8M'])[2]")
private WebElement lowtohigh;

public WebElement getLowtohigh() {
	return lowtohigh;
}

public WebElement getSearch() {
	return search;
}

public WebElement getLogin() {
	return login;
}

}
