package com.automation.appln.businessscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.automation.frameworks.BaseTest;
import com.automation.utilities.PojoReader;
import com.relevantcodes.extentreports.LogStatus;

import customisedexception.FrameworkException;

public class FpTest extends BaseTest {
	
	@Test
	public void fptest() throws IOException
	{
	    getExtentTest().log(LogStatus.PASS, "BROWSER IS OPENED");
	    String url = PojoReader.getPrConf().getPropertyValue("fp_url");
	   
	    getDriver().get(url); 
	    getExtentTest().log(LogStatus.PASS, "ENTERED URL AS: "+url);
	}
}
