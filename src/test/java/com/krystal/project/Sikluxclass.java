package com.krystal.project;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

public class Sikluxclass {
  
	public void Textcomparsion(String Text, String Expected, ExtentTest test1,WebDriver driver) throws IOException {
	    try {
	        if (Text.contains(Expected)) {
	            test1.pass("RUN PASS: Actual is " + Text + "\nExpected is " + Expected + " Same as Expected");
	        } else {
	            String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
	            String screenshotName = "D:\\Krystalnew\\error_screenshot_" + timestamp + ".png";
	            captureScreenshot(screenshotName,driver);
	            test1.fail("RUN FAIL: Actual is " + Text + "\nExpected is " + Expected + " Not Same as Expected");
	            test1.addScreenCaptureFromPath(screenshotName);      
	        }
	    } catch (Exception e) {
	        test1.error("An error occurred: " + e.getMessage());
	        String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
	        String screenshotName = "D:\\Krystalnew\\error_screenshot_" + timestamp + ".png";
	        captureScreenshot(screenshotName,driver);
	        test1.addScreenCaptureFromPath(screenshotName);
	    }
	}
	
	
	
	public void captureScreenshot(String screenshotName, WebDriver driver) {
	    try {
	    	TakesScreenshot screenshot = (TakesScreenshot) driver;
	        File source = screenshot.getScreenshotAs(OutputType.FILE);
	        File destination = new File(screenshotName);
	        FileUtils.copyFile(source, destination);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
	
	
	
}
