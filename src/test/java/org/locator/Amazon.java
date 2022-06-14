package org.locator;

import org.baseclass.BaseClass;

public class Amazon extends BaseClass{

	public static void main(String[] args) {
		AmazonSample a = new AmazonSample();
		browserlaunch("chrome");
		urlLanuch("https://www.amazon.in/");
		implicityWait(10);
		sendk(a.getSearch(),"iphone");
		click(a.getBtn());
		
	}
}
