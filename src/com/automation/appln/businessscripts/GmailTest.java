package com.automation.appln.businessscripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test; 

import com.automation.frameworks.BaseTest;
import com.automation.utilities.PojoReader;
import com.relevantcodes.extentreports.LogStatus;

import customisedexception.FrameworkException;

public class GmailTest extends BaseTest {
	@Test
	public void loginTest() throws IOException, EncryptedDocumentException, InvalidFormatException, FrameworkException
	{
		String unData ="";
	    getExtentTest().log(LogStatus.PASS, "BROWSER IS OPENED");
		String Url = PojoReader.getPrConf().getPropertyValue("qa_url");
		getDriver().get(Url);	
	    getExtentTest().log(LogStatus.PASS, "ENTERED URL AS: "+Url);
     
	    String unId = PojoReader.getPrOr().getPropertyValue("un_id");
	    getExtentTest().log(LogStatus.INFO, "USER NAME ID IS: "+unId);
	    
		String nxtId = PojoReader.getPrOr().getPropertyValue("nxt_id");
		getExtentTest().log(LogStatus.INFO, "NEXT ID IS: "+nxtId);
		
		unData = PojoReader.getExcelReaderObj().getCellData("sheetName", "Gmail_Data",0,0);
	    getExtentTest().log(LogStatus.INFO, "USER NAME TEST DATA IS: "+unData);
	   
	    WebElement un = getDriver().findElement(By.id(unId));
	    un.clear();
	    getExtentTest().log(LogStatus.PASS, "USER NAME FILED IS CLEARED");
	   
	    un.sendKeys(unData);
	    getExtentTest().log(LogStatus.PASS, "DATA TYPING ACTION IS DONE ON USER NAME WITH TEST DATA: "+unData);
	    
        WebElement nxt = getDriver().findElement(By.id(nxtId));
        nxt.click();   
        getExtentTest().log(LogStatus.PASS, "CLICKED ON NEXT BUTTON");
}
}
