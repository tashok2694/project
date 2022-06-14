package org.javascript;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sample extends BaseClass {
public Sample() {
	PageFactory.initElements(driver, this);
}
	@FindBy(xpath="(//div[@class='trainer-info'])[5]") 
	private WebElement porur;
	public WebElement getPorur() {
		return porur;
	}
	
	
	
}

