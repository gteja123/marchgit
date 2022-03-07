package com.automation.appln.businessscripts;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.automation.frameworks.BaseTest;
import com.automation.utilities.PojoReader;
import com.relevantcodes.extentreports.LogStatus;

import customisedexception.FrameworkException;

public class InstTest extends BaseTest {
	
	@Test
	public void instTest() throws IOException
	{
		    getExtentTest().log(LogStatus.PASS, "BROWSER IS OPENED");
		    String insurl = PojoReader.getPrConf().getPropertyValue("inst_url");
		    getDriver().get(insurl);
		    getExtentTest().log(LogStatus.PASS, "ENTERED URL AS: "+insurl);
		    
		   // String videos = PojoReader.getPrOr().getPropertyValue("inst_videos");  
		   
		   //  getDriver().findElement(By.xpath(videos)).click();
		    // getExtentTest().log(LogStatus.PASS, "CLICKED ON VIDEOS");
		   
	}

}
