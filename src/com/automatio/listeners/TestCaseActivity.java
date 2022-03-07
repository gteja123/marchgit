package com.automatio.listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.automation.utilities.ScreenShotUtility;

public class TestCaseActivity implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("TEST CASE IS STARTED: "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("TEST CASE IS PASSED: "+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("TEST CASE IS FAILED: "+result.getName());	
		try {
			ScreenShotUtility.TakeScreenShot(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("TEST CASE IS SKIPPED: "+result.getName());	
		try {
			ScreenShotUtility.TakeScreenShot(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	@Override
	public void onStart(ITestContext context) {
		System.out.println("SUITE EXECUTION IS STARTED");	
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("SUITE EXECUTION IS COMPLETED");	
	}
}
