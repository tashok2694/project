package org.browser;

import org.baseclass.BaseClass;

public class BrowserUrlLanuch extends BaseClass {
public static void main(String[] args) {
	browserlaunch("chrome");
	urlLanuch("https://netbanking.hdfcbank.com/netbanking/");
	String currentUrl = currentUrl();
	System.out.println(currentUrl);
	
}
}
