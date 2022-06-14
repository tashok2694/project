package org;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.baseclass.BaseClass;
import org.browser.BrowserUrlLanuch;
import org.openqa.selenium.Keys;

public class FaceBokk extends BaseClass {
public static void main(String[] args) throws AWTException {
	browserlaunch("chrome");
	urlLanuch("https://www.facebook.com/");
	implicityWait(20);
	FacebookLogin fb = new FacebookLogin(); 
	sendk(fb.getTxtUser(), "Ashok2694");
	sendk(fb.getTxtPass(), "9876");
	doubleclick(fb.getTxtUser());
	rightClick(fb.getTxtUser());
	pressDown();
	releaseDown();
	pressEnter();
	releaseEnter();
}
}
