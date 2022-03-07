package com.automation.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.automation.frameworks.BaseTest;
import com.relevantcodes.extentreports.LogStatus;

public class Gmail_Pwd_Page extends BaseTest {
	@FindBy(name="password")
	private static WebElement password;
	
	@FindBy(id="passwordNext")
	private static WebElement pwdNxt;
	
	@FindBy(xpath = "//span[text() = 'Forgot password?']")
	private static WebElement FrgtPwd;
	
	@FindBy(xpath = "//div[text()='Show password']")
	private static WebElement showpwd;
	
	@FindBy(xpath = "//button[text()='Forget email?']")
	private static WebElement forgetGmail;
	
	
	
	public static void enterUserName(String pwdData)
	{
		try {
			Assert.assertTrue(password.isDisplayed()&&password.isEnabled());
			getExtentTest().log(LogStatus.PASS, "password element is displayed and enabled");
			password.clear();
			getExtentTest().log(LogStatus.PASS, "password field is cleared");
			password.sendKeys(pwdData);
			getExtentTest().log(LogStatus.PASS, "Data Tying Action is done on username with test data");
     		}
		   catch (Exception exception) {
			   getExtentTest().log(LogStatus.FAIL, "password element is not displayed and enabled");
		}
	}

	public static void clickPwdNextButton()
	{
		try {
			Assert.assertTrue(pwdNxt.isDisplayed()&&pwdNxt.isEnabled());
			getExtentTest().log(LogStatus.PASS, "pwdNxt element is displayed and enabled");
			pwdNxt.click();
     		}
		   catch (Exception exception) {
			   getExtentTest().log(LogStatus.FAIL, "pwdNxt element is not displayed and enabled");
		}
	}
	
	public static void clickFrgtPwd()
	{
		try {
			Assert.assertTrue(FrgtPwd.isDisplayed()&&FrgtPwd.isEnabled());
			getExtentTest().log(LogStatus.PASS, "FrgtPwd element is displayed and enabled");
			FrgtPwd.click();
     		}
		   catch (Exception exception) {
			   getExtentTest().log(LogStatus.FAIL, "FrgtPwd is not displayed and enabled");
		}
	}
	
	public static void clickshowpwd()
	{
		try {
			Assert.assertTrue(showpwd.isDisplayed()&&showpwd.isEnabled());
			getExtentTest().log(LogStatus.PASS, "showpwd element is displayed and enabled");
			showpwd.click();
     		}
		   catch (Exception exception) {
			   getExtentTest().log(LogStatus.FAIL, "showpwd element is not displayed and enabled");
		}
	}
	
	static
	{
		PageFactory.initElements(getDriver(), Gmail_Pwd_Page.class);
	}

}
