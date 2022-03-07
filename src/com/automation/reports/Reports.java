package com.automation.reports;

import java.util.HashMap;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Reports {
	public static void main(String[] args) {
		ExtentReports extentReports = new ExtentReports("C:\\Users\\lenovo\\Desktop\\TESTING\\FrameWorks\\Reports\\report.html");
		 
		Map<String, String> mapInfo = new HashMap<String, String>();
		extentReports.addSystemInfo("username","TEJA");
	    extentReports.addSystemInfo("application"," JAVA SELENUIM");
		extentReports.addSystemInfo("testcases","Regression suite");
		extentReports.addSystemInfo(mapInfo);
		
	    ExtentTest extentTest = extentReports.startTest("demo");
		extentTest.log(LogStatus.PASS, "BROWSR IS OPENED");
		extentTest.log(LogStatus.PASS, "ENTER URL AS WWW.GMAIL.COM");
		extentTest.log(LogStatus.PASS, "ENTER  USERNAME AS gtejaswarrao@gmail.com");
		extentTest.log(LogStatus.PASS, "CLICKED ON NEXT BUTTON");
		
		extentReports.endTest(extentTest);
		extentReports.flush();
		extentReports.close();
				
	}
}

