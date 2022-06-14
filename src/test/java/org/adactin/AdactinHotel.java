package org.adactin;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;

public class AdactinHotel extends BaseClass {
public static void main(String[] args) {
	
	browserlaunch("chrome");
	urlLanuch("https://adactinhotelapp.com/index.php");
	implicityWait(20);
	Sample s=new Sample();
	sendk(s.getTxtUser(), "Ashok2694");
	sendk(s.getPassword(), "8O4OO3");
	click(s.getLogin());
	click(s.getLocation());
	selectByIndex(s.getLocation(), 3);
	click(s.getHotel());
	selectByIndex(s.getHotel(), 2);
	click(s.getRoom());
	selectByIndex(s.getRoom(), 3);
	click(s.getNoroom());
	selectByIndex(s.getNoroom(), 3);
	click(s.getCheckin());
	clear(s.getCheckin());
	sendk(s.getCheckin(), "25/5/22");
	click(s.getCheckout());
	clear(s.getCheckout());
	sendk(s.getCheckout(), "30/5/22");
	click(s.getAdult());
	selectByIndex(s.getAdult(), 3);
	click(s.getChild());
	selectByIndex(s.getChild(), 1);
	click(s.getSearch());
	click(s.getSelect());
	click(s.getContinues());
	sendk(s.getFristname(), "Ashok");
	sendk(s.getLastname(), "kumar");
	sendk(s.getAddress(), "Thanjavur-613502");
	sendk(s.getAtm(), "1234567891234567");
	selectByIndex(s.getCardtype(), 1);
	click(s.getExpiremonth());
	selectByIndex(s.getExpiremonth(), 3);
	click(s.getExpyear());
	selectByIndex(s.getExpyear(), 6);
	click(s.getBook());
	sendk(s.getCvv(),"987");
	click(s.getBook());
	System.out.println(javaScriptGetter(s.getOrdernumber()));
	}
	}

