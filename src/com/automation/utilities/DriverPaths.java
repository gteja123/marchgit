package com.automation.utilities;

public interface DriverPaths {
	
	String edgeKEY  = "webdriver.edge.driver";
	String edgeValue = " ";
	
	String ieKEY  = "webdriver.ie.driver";
	String ieValue = "webdriver.edge.driver";
	
	String firefoxKEY  = "webdriver.gecko.driver";
	String firefoxValue = " ";
	
	String chromeKEY  = "webdriver.chrome.driver";
	String chromeValue = System.getProperty("user.dir")+"\\Drivers\\chromedriver98.exe";
	
}
