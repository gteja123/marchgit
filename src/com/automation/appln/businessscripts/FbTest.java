package com.automation.appln.businessscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.automation.frameworks.BaseTest;
import com.automation.utilities.PojoReader;
import com.relevantcodes.extentreports.LogStatus;

import customisedexception.FrameworkException;

public class FbTest extends BaseTest
{
	 @Test
     public void fbTest() throws IOException
     {    getExtentTest().log(LogStatus.PASS, "BROWSER IS OPENED");
          String url = PojoReader.getPrConf().getPropertyValue("fb_url");
    	  
          getDriver().get(url);
          getExtentTest().log(LogStatus.PASS, "ENTERED URL AS: "+url);
    	  
          //getDriver().findElement(By.id("demo"));
    	  
    	  
     }
}
