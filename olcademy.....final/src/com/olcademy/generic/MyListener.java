package com.olcademy.generic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;

public class MyListener extends BaseTest implements ITestListener {
		
		@Override
		public void onFinish(ITestContext context) {
			Reporter.log(context.getName()+ " ended",true);
		}

		@Override
		public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
			
		}

		@Override
		public void onTestFailure(ITestResult result) {
			String failedName = result.getName();
			Reporter.log(failedName+" FAILED",true);
			
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("./screenshots/"+failedName+".png");
			try {
				Files.copy(src, dest);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override
		public void onTestSkipped(ITestResult result) {
			Reporter.log(result.getName()+" SKIPPED",true);
			
		}

		@Override
		public void onTestStart(ITestResult result) {
			Reporter.log(result.getName()+" started",true);
		}

		@Override
		public void onTestSuccess(ITestResult result) {
			Reporter.log(result.getName()+" PASSED",true);
			
		}
		@Override
		public void onStart(ITestContext context) {
			Reporter.log(context.getName()+ " started",true);
		}

	}



