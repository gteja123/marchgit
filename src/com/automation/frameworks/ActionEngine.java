package com.automation.frameworks;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

abstract public class ActionEngine extends BaseTest
{
	public static void enterUrl( String url)
	{
		 try
   	  {
   		  getDriver().get(url);
   		  getExtentTest().log(LogStatus.PASS, "URL is entered as: "+url);
   	  }
	      catch(Exception exception)
   	  {
	    	  getExtentTest().log(LogStatus.FAIL, "URL is not  entered as: "+url);
   	  }
	      }
	
	
      public static void clickByWe(WebElement element, String elementDescription)
      {
    	  try
    	  {
    		  Assert.assertTrue(element.isDisplayed()&&element.isEnabled());
    		  getExtentTest().log(LogStatus.PASS, elementDescription+"element is displayed and enabled");
    		  element.click();
    		  getExtentTest().log(LogStatus.PASS, elementDescription+ "element is clicked");
    	  }
	      catch(Exception exception)
    	  {
	    	  getExtentTest().log(LogStatus.FAIL, elementDescription+" element is not clicked");
    	  }
	      }

      public static void clickByJS(WebElement element, String elementDescription)
      {
    	  try
    	  {
    		  Assert.assertTrue(element.isDisplayed()&&element.isEnabled());
    		  getExtentTest().log(LogStatus.PASS, elementDescription+"element is displayed and enabled");
    		  element.click();
    		  getExtentTest().log(LogStatus.PASS, elementDescription+ "element is clicked");
    	  }
	      catch(Exception exception)
    	  {
	    	  getExtentTest().log(LogStatus.FAIL, elementDescription+" element is not clicked");
    	  }
	      }
      public static void clickByActions(WebElement element, String elementDescription)
      {
    	  try
    	  {
    		  Assert.assertTrue(element.isDisplayed()&&element.isEnabled());
    		  getExtentTest().log(LogStatus.PASS, elementDescription+"element is displayed and enabled");
    		  Actions actions = new Actions(getDriver());
    		  actions.click(element).build().perform();
    		  getExtentTest().log(LogStatus.PASS, elementDescription+ "element is clicked");
    	  }
	      catch(Exception exception)
    	  {
	    	  getExtentTest().log(LogStatus.FAIL, elementDescription+" element is not clicked");
    	  }
	      }
      
      public static void clickByActions1(WebElement element, String elementDescription)
      {
    	  try
    	  {
    		  Assert.assertTrue(element.isDisplayed()&&element.isEnabled());
    		  getExtentTest().log(LogStatus.PASS, elementDescription+"element is displayed and enabled");
    		  Actions actions = new Actions(getDriver());
    		  actions.sendKeys(element, Keys.ENTER).build().perform();
    		  
    		  getExtentTest().log(LogStatus.PASS, elementDescription+ "element is clicked");
    	  }
	      catch(Exception exception)
    	  {
	    	  getExtentTest().log(LogStatus.FAIL, elementDescription+" element is not clicked");
    	  }
	      }
      
      public static void doubleclickByActions1(WebElement element, String elementDescription)
      {
    	  try
    	  {
    		  Assert.assertTrue(element.isDisplayed()&&element.isEnabled());
    		  getExtentTest().log(LogStatus.PASS, elementDescription+"element is displayed and enabled");
    		  Actions actions = new Actions(getDriver());
    		  actions.doubleClick(element).build().perform();
      		  getExtentTest().log(LogStatus.PASS, elementDescription+ "element is clicked");
    	  }
	      catch(Exception exception)
    	  {
	    	  getExtentTest().log(LogStatus.FAIL, elementDescription+" element is not clicked");
    	  }
	      }
      
      public static void clickByActionsEnter(WebElement element, String elementDescription)
      {
    	  try
    	  {
    		  Assert.assertTrue(element.isDisplayed()&&element.isEnabled());
    		  getExtentTest().log(LogStatus.PASS, elementDescription+"element is displayed and enabled");
    		  Actions actions = new Actions(getDriver());
    		  actions.sendKeys(element, Keys.ENTER).build().perform();
    		  getExtentTest().log(LogStatus.PASS, elementDescription+ "element is clicked");
    	  }
	      catch(Exception exception)
    	  {
	    	  getExtentTest().log(LogStatus.FAIL, elementDescription+" element is not clicked");
    	  }
	      }

      public static void DTA(WebElement element, String testData, String elementDescription){
    	  try
    	  {
    		  Assert.assertTrue(element.isDisplayed()&&element.isEnabled());
    		  getExtentTest().log(LogStatus.PASS, elementDescription+"element is displayed and enabled");
    	      element.clear();
    	      getExtentTest().log(LogStatus.PASS,"clear action is done on element: "+elementDescription);
    		  element.sendKeys(testData);
    		  getExtentTest().log(LogStatus.PASS, "data type action is done on element"+elementDescription);
    	  }
	      catch(Exception exception)
    	  {
	    	  getExtentTest().log(LogStatus.FAIL, elementDescription+" element is not clicked");
    	  }
      }	  
    	  public static void DTAByActions(WebElement element, String testData, String elementDescription){
        	  try
        	  {
        		  Assert.assertTrue(element.isDisplayed()&&element.isEnabled());
        		  getExtentTest().log(LogStatus.PASS, elementDescription+"element is displayed and enabled");
        		  Actions actions = new Actions(getDriver());
        		  actions.sendKeys(element, testData).build().perform();
        		  getExtentTest().log(LogStatus.PASS, "data type action is done on element"+elementDescription);
        	  }
    	      catch(Exception exception)
        	  {
    	    	  getExtentTest().log(LogStatus.FAIL, elementDescription+" element is not clicked");
        	  }
        	  
    	  }
    	  
    	  public static void handleDropDowns(WebElement element, String how, String howValue)
    	  {
    		  try
    		  {
    			  Assert.assertTrue(element.isDisplayed()&&element.isEnabled());
    			  Select select = new Select(element);
    			  if(how.equalsIgnoreCase("value"))
    			  {
    				  select.selectByValue(howValue);
    				  getExtentTest().log(LogStatus.PASS,"selected element from drop down: using"+howValue);
    			  }
    			  else if (how.equalsIgnoreCase("text"))
    			  {
    				  select.selectByVisibleText(howValue);
    				  getExtentTest().log(LogStatus.PASS,"selected element from drop down: using"+howValue);
    			  }
    			  else if (how.equalsIgnoreCase("index"))
    			  {
    				  select.selectByVisibleText(howValue);
    				  getExtentTest().log(LogStatus.PASS,"selected element from drop down: using"+howValue);
    			  }
       		  }
                catch(Exception exception)
    		  {
                	getExtentTest().log(LogStatus.FAIL," Not selected element from drop down: using"+howValue);
    		  }
    		  
    	  }
    	   public static String handleMultipleWindows() {
    		   String secWindow = "";
   			try {
				Set<String> windows = getDriver().getWindowHandles();
				String curWindow = getDriver().getWindowHandle();
				for(String str : windows)
				{
					if(str.equalsIgnoreCase(curWindow)) {
						getExtentTest().log(LogStatus.INFO, "Selenium is already focusing");
					}
					else {
						getDriver().switchTo().window(str);
						getExtentTest().log(LogStatus.PASS, "Switched to window: "+str);
						secWindow = getDriver().getWindowHandle();
					}
				}
			}
           catch(Exception exception){
        	   getExtentTest().log(LogStatus.FAIL, "Not able to Switch");
           }
			return secWindow;
		}
    	  
    	   public static String handleMultipleWindows(int index) {
    		   String secWindow = "";
    	   
			try {
				Set<String> windows = getDriver().getWindowHandles();
				List<String> listWindows = new ArrayList<String>(windows);
				String WindowIndex = listWindows.get(index);
			    getDriver().switchTo().window(WindowIndex);
			    getExtentTest().log(LogStatus.PASS, "Switched to Window: "+index);
			}
           catch(Exception exception){
        	   getExtentTest().log(LogStatus.FAIL, "Not able to Switch");
           }
			return secWindow;
		}
      }