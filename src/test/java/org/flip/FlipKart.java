package org.flip;


import org.baseclass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipKart extends BaseClass {
	
	public FlipKart() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	private WebElement close;
	
	@FindBy(xpath="(//div[@class='xtXmba'])[4]")
	private WebElement fashion;
	
	@FindBy(xpath="(//a[contains(text(),'Watches and Accessories')]")
	private WebElement watches;
	
	@FindBy(xpath="//a[text()='Wallets']")
	private WebElement wallet;
	
	@FindBy(xpath="(//div[@class='_1xHGtK _373qXS'])[3]")
	private WebElement mywallet;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	private WebElement addToCard;
	
	@FindBy(xpath="(//div[@class='_1xHGtK _373qXS'])[5]")
	private WebElement select2;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	private WebElement addToCard2;

	public WebElement getClose() {
		return close;
	}

	public WebElement getFashion() {
		return fashion;
	}

	public WebElement getWatches() {
		return watches;
	}

	public WebElement getWallet() {
		return wallet;
	}

	public WebElement getMywallet() {
		return mywallet;
	}

	public WebElement getAddToCard() {
		return addToCard;
	}

	public WebElement getSelect2() {
		return select2;
	}

	public WebElement getAddToCard2() {
		return addToCard2;
	}     
	
	
		
}
