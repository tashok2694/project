package org.javascript;

import org.baseclass.BaseClass;

public class Greens extends BaseClass {
public static void main(String[] args) {
	Sample s=new Sample();
	browserlaunch("chrome");
	urlLanuch("http://www.greenstechnologys.com/");
	implicityWait(10);
	javaScriptScrollDown(s.getPorur());
}
}
