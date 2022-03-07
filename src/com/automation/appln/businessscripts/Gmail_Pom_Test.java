package com.automation.appln.businessscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.automation.frameworks.ActionEngine;
import com.automation.frameworks.BaseTest;
import com.automation.pageobjects.Gmail_Home_Page;
import com.automation.utilities.PojoReader;

import customisedexception.FrameworkException;

public class Gmail_Pom_Test extends BaseTest {
	public void gmailLoginTest() throws IOException, EncryptedDocumentException, InvalidFormatException, FrameworkException
	
	{
		ActionEngine.enterUrl(PojoReader.getPrConf().getPropertyValue("qa_url"));
		Gmail_Home_Page.enterUserName(PojoReader.getExcelReaderObj().getCellData("sheetname", "Gmail_Data", 0, 1));
		Gmail_Home_Page.clickNextButton();
	}

}
