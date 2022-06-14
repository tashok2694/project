package org.locator;

import org.baseclass.BaseClass;

public class Redbus extends BaseClass{
public static void main(String[] args) {
	browserlaunch("chrome");
	urlLanuch("https://www.redbus.in/");
	Sample s = new Sample();
	sendk(s.getFrom(), "thanjavur");
	sendk(s.getDest(), "chennai");
	click(s.getBtn());
	action(s.getCalender());
	
	
}
}
