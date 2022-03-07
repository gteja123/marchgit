package com.automation.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.automation.frameworks.BaseTest;

public interface ScreenShotUtility {
	public static String TakeScreenShot() throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) BaseTest.getDriver();
        File file= ts.getScreenshotAs(OutputType.FILE);
        String imagepath = System.getProperty("user.dir")+"\\Screenshots\\"+BaseTest.getTcName()+".jpeg";      
        FileUtils.copyFile(file, new File(imagepath));
        return imagepath;
	}
	
	public static String TakeScreenShot(String tcName) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) BaseTest.getDriver();
        File file= ts.getScreenshotAs(OutputType.FILE);
        String imagepath = System.getProperty("user.dir")+"\\Screenshots\\"+tcName+".jpeg";      
        FileUtils.copyFile(file, new File(imagepath));
        return imagepath;
	}

}
