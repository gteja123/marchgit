package com.automation.frameworks;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.internal.TestResult;

import com.automation.utilities.DriverPaths;
import com.automation.utilities.ScreenShotUtility;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import customisedexception.FrameworkException;

public class BaseTest 
{
   private static WebDriver driver;
   private static String tcName;
   private static ExtentReports extentReports;
   private static ExtentTest extentTest;
	@Parameters({"browser"})
	@BeforeSuite
	public void openBrowser(@Optional("chrome")String browser)
	{
	   if (browser.equalsIgnoreCase("firefox"))
	   {
		 System.setProperty(DriverPaths.firefoxKEY,DriverPaths.firefoxValue);
		 driver = new FirefoxDriver(); 
		 init();
		}
		else if (browser.equalsIgnoreCase("chrome"))
	    {
		 System.setProperty(DriverPaths.chromeKEY,DriverPaths.chromeValue);
	     driver = new ChromeDriver(); 
		 init();
	    }
		else if (browser.equalsIgnoreCase("ie"))
		{
		 System.setProperty(DriverPaths.ieKEY,DriverPaths.ieValue);
  	   	 driver = new ChromeDriver(); 
	     init();
		}
		else if (browser.equalsIgnoreCase("edge"))
		{
				System.setProperty(DriverPaths.edgeKEY,DriverPaths.edgeValue);
			    driver = new ChromeDriver(); 
			    init();
		}
	}
	 
	public void init()
	{
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(49, TimeUnit.SECONDS);
	}

	@AfterSuite
	public void closeBrowser() throws FrameworkException
	{
	    if(driver!=null)
		{
		driver.close();
	    }
		else 
		{
		FrameworkException exception = new FrameworkException("Diver is pointing to null.....");
		throw exception;
		}
     }

    @BeforeMethod
    public void beforeTcExecution(Method method)
    {
		tcName =  method.getName();
		       System.out.println("Current Test case execution is: "+tcName);
		       extentTest = extentReports.startTest(tcName);
		       extentTest.log(LogStatus.INFO, "Current Test case execution is: "+tcName);
	}
    @AfterMethod
    public void afterTCExecution(ITestResult result) throws IOException
	{
	     String tcName = result.getName();
	     //  long endMilliSecs = result.getEndMillis();
	     //  String tcName = result.getName();
	     // long startMilliSec = result.getEndMillis();
	    if(result.getStatus() == ITestResult.SUCCESS)
	    {
	    System.out.println("TC IS PASSED: "+tcName);
	    extentTest.log(LogStatus.PASS, "TC IS PASSED: "+tcName);
	    }
	    else if (result.getStatus() == ITestResult.FAILURE)
	    {
	     // take a screenshot
	     // get exception information why its got failed
	     // add screenshot and exception to reports
	     // mark thema as failure
	     System.out.println("TC IS FAILED: "+tcName);
	 	 String imagePath = ScreenShotUtility.TakeScreenShot(tcName);
	 	extentTest.log(LogStatus.FAIL, "TC IS FAILED: "+tcName);
	 	extentTest.log(LogStatus.FAIL,"TC IS FAILED", result.getThrowable());
	    extentTest.addScreenCapture(imagePath);
	 	 }
	 	else if (result.getStatus() == ITestResult.SKIP)
	    {
	     // take a screenshot
	     // get exception information why its got failed
	     // add screenshot and exception to reports
	     // mark thema as failure
	     System.out.println("TC IS SKIPPED: "+tcName);
	     String imagepaath = ScreenShotUtility.TakeScreenShot(tcName);
	     extentTest.log(LogStatus.FAIL, "TC IS SKIPPED: "+tcName);
		 extentTest.log(LogStatus.FAIL,"TC IS SKIPPED", result.getThrowable() );
         extentTest.addScreenCapture(imagepaath);
	    }
	     extentReports.endTest(extentTest); 
	     extentReports.flush();
	    }
	  
    
    @BeforeTest
    public void initReports()
    {
    	extentReports = new ExtentReports(System.getProperty("user.dir")+"\\Reports\\report.html");
    	Map<String, String> mapInfo = new HashMap<String, String>();
		extentReports.addSystemInfo("username","TEJA");
	    extentReports.addSystemInfo("application"," JAVA SELENUIM");
		extentReports.addSystemInfo("testcases","Regression suite");
		extentReports.addSystemInfo(mapInfo);
    }
    
    @AfterTest
    public void generateReports() throws FrameworkException {
    	if(extentReports!=null)
    	{
    		extentReports.close();
    	}
    	else {
    	FrameworkException exception = new FrameworkException("Extent reports pointing to null...");
       throw exception;
    	}
    }
    
    //This is a getter() method to access Driver Variable outside the class
    public static WebDriver getDriver()
    {
	   return driver;
    }
     
     //This is a getter() method to access TestCase Name outside the class
    public static String getTcName()
    {
	   return tcName;
    }
    
    //This is a getter() method to access TestCase Name outside the class
    public static ExtentTest getExtentTest() {
		return extentTest;
	}
}


