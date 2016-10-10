/**
 * 
 */
package com.selenium.testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * @author Shame
 *
 */
public class TestNGListener implements ITestListener {

	@Override
	public void onFinish(ITestContext arg0) {
		
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		System.out.println("Test cases failed details " + arg0.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		System.out.println("Test cases skipped details " + arg0.getName());
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		System.out.println("Test cases Start details " + arg0.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}
