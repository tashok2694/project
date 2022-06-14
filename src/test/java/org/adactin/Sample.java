package org.adactin;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sample extends BaseClass {
public Sample() {
	PageFactory.initElements(driver, this);
}
	
	@FindBy(name="username")
	private WebElement txtUser;
	@FindBy(name="password")
	private WebElement password;
	@FindBy(name="login")
	private WebElement login;
	@FindBy(name="location")
	private WebElement location;
	@FindBy(id="hotels")
	private WebElement hotel;
	@FindBy(id="room_type")
	private WebElement room;
	@FindBy(id="room_nos")
	private WebElement noroom;
	@FindBy(id="child_room")
	private WebElement child;
	@FindBy(name="datepick_in")
	private WebElement checkin;
	@FindBy(name="datepick_out")
	private WebElement checkout;
	@FindBy(id="adult_room")
	private WebElement adult;
	@FindBy(id="Submit")
	private WebElement search;
	@FindBy(id="continue")
	private WebElement continues;
	@FindBy(id="radiobutton_0")
	private WebElement select;
	@FindBy(name="first_name")
	private WebElement fristname;
	@FindBy(name="last_name")
	private WebElement lastname;
	@FindBy(name="address")
	private WebElement address;
	@FindBy(name="cc_num")
	private WebElement atm;
	@FindBy(name="cc_type")
	private WebElement cardtype;
	@FindBy(name="cc_exp_month")
	private WebElement expiremonth;
	@FindBy(name="cc_exp_year")
	private WebElement expyear;
	@FindBy(name="cc_cvv")
	private WebElement cvv;
	@FindBy(name="book_now")
	private WebElement book;
	@FindBy(name="first_name")
	private WebElement orderno;
	@FindBy(id="order_no")
	private WebElement ordernumber;
	
	public WebElement getOrdernumber() {
		return ordernumber;
	}
	public WebElement getFristname() {
		return fristname;
	}
	public WebElement getContinues() {
		return continues;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getAtm() {
		return atm;
	}
	public WebElement getCardtype() {
		return cardtype;
	}
	public WebElement getExpiremonth() {
		return expiremonth;
	}
	public WebElement getExpyear() {
		return expyear;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBook() {
		return book;
	}
	public void setSelect(WebElement select) {
	this.select = select;
	}
	public WebElement getOrderno() {
	return orderno;
	}
	
	public WebElement getSelect() {
		return select;
	}
	public WebElement getCheckout() {
		return checkout;
	}
	public WebElement getAdult() {
		return adult;
	}
	public WebElement getChild() {
		return child;
	}

	public WebElement getNoroom() {
		return noroom;
	}
	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoom() {
		return room;
	}
	public WebElement getTxtUser() {
		return txtUser;
	}
	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getSearch() {
		return search;
	}
}
