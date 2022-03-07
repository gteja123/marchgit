package com.automation.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.automation.frameworks.BaseTest;
import com.relevantcodes.extentreports.LogStatus;

public class Gmail_Home_Page extends BaseTest {
	
	@FindBy(id="identifierId")
	private static WebElement userName;
	
	@FindBy(id="identifierNext")
	private static WebElement nxt;
	
	@FindBy(xpath = "//span[text() = 'Sign in']")
	private static WebElement signIn;
	
	@FindBy(xpath = "//span[text()='to continue to Gmail']")
	private static WebElement continueToGmail;
	
	@FindBy(xpath = "//button[text()='Forget email?']")
	private static WebElement forgetGmail;
	
	@FindBy(xpath = "//a[text()='Learn more']")
	private static WebElement learnMore;
	
	@FindBy(xpath = "//span[text()='Create account']")
	private static WebElement createAccount;
	
	public static void enterUserName(String unData)
	{
		try {
			Assert.assertTrue(userName.isDisplayed()&&userName.isEnabled());
			getExtentTest().log(LogStatus.PASS, "UserName element is displayed and enabled");
			userName.clear();
			getExtentTest().log(LogStatus.PASS, "UserName field is cleared");
			userName.sendKeys(unData);
			getExtentTest().log(LogStatus.PASS, "Data Tying Action is done on username with test data");
     		}
		   catch (Exception exception) {
			   getExtentTest().log(LogStatus.FAIL, "UserName element is not displayed and enabled");
		}
	}

	public static void clickNextButton()
	{
		try {
			Assert.assertTrue(nxt.isDisplayed()&&nxt.isEnabled());
			getExtentTest().log(LogStatus.PASS, "Next element is displayed and enabled");
			nxt.click();
			getExtentTest().log(LogStatus.PASS, "Clicked on Next element");
     		}
		   catch (Exception exception) {
			   getExtentTest().log(LogStatus.FAIL, "Next element is not displayed and enabled");
		}
	}
	
	public static void clickForgetButton()
	{
		try {
			Assert.assertTrue(forgetGmail.isDisplayed()&&forgetGmail.isEnabled());
			getExtentTest().log(LogStatus.PASS, "forgetGmail element is displayed and enabled");
			nxt.click();
     		}
		   catch (Exception exception) {
			   getExtentTest().log(LogStatus.FAIL, "forgetGmailelement is not displayed and enabled");
		}
	}
	
	public static void clickCreateAccount()
	{
		try {
			Assert.assertTrue(createAccount.isDisplayed()&&createAccount.isEnabled());
			getExtentTest().log(LogStatus.PASS, "createAccount element is displayed and enabled");
			nxt.click();
     		}
		   catch (Exception exception) {
			   getExtentTest().log(LogStatus.FAIL, "createAccount element is not displayed and enabled");
		}
	}
	
	static
	{
		PageFactory.initElements(getDriver(), Gmail_Home_Page.class);
	}
	
	
}
