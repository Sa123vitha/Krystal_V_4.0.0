package com.krystal.project;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.appium.java_client.windows.WindowsDriver;

public class DemographicsExternal extends Main {
	public void isdisplayed(WebElement Text, String Expected, ExtentTest test1, WebDriver driver) throws IOException {
	    try {
	    	if(Text.isDisplayed()) {
	        	
	    	 	test1.log(Status.PASS,"RUN PASS:" +Expected+ " is Displayed");
	        	
	        } else {
        	    String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
	            String screenshotName = "D:\\Krystalnew\\error_screenshot_" + timestamp + ".png";
	            captureScreenshot(screenshotName,driver);
	            test1.log(Status.FAIL,"RUN FAIL:" +Expected+ " is not displayed");
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
	
	public void isnotdisplayed(WebElement Text, String Expected, ExtentTest test1, WebDriver driver) throws IOException {
	    try {
	    	if(!Text.isDisplayed()) {
	        	
	    	 	test1.log(Status.PASS,"RUN PASS:" +Text.getText()+ "is not Displayed");
	        	
	        } else {
        	    String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
	            String screenshotName = "D:\\Krystalnew\\error_screenshot_" + timestamp + ".png";
	            captureScreenshot(screenshotName,driver);
	            test1.log(Status.FAIL,"RUN FAIL:" +Text.getText()+ "is displayed");
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
	
	public void isempty(WebElement Text, String Expected, ExtentTest test1, WebDriver driver) throws IOException
	{
		try {
			Text.click();
	    	String actualtext=driver.switchTo().activeElement().getText();
	    	if(actualtext.isEmpty()) {
	        	
	        	test1.log(Status.PASS,"RUN PASS: Text box is empty "+Expected);
	        	
	        } else {
        	    String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
	            String screenshotName = "D:\\Krystalnew\\error_screenshot_" + timestamp + ".png";
	            captureScreenshot(screenshotName,driver);
	            test1.log(Status.FAIL,"RUN FAIL: Text box is not empty "+actualtext);
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
	public void isemptynoclick(WebElement Text, String Expected, ExtentTest test1, WebDriver driver) throws IOException
	{
		try {
	    	String actualtext=Text.getText();
	    	if(actualtext.isEmpty()) {
	        	
	        	test1.log(Status.PASS,"RUN PASS: Text box is empty "+Expected);
	        	
	        } else {
        	    String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
	            String screenshotName = "D:\\Krystalnew\\error_screenshot_" + timestamp + ".png";
	            captureScreenshot(screenshotName,driver);
	            test1.log(Status.FAIL,"RUN FAIL: Text box is not empty "+actualtext);
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
	public void isnotempty(WebElement Text, String Expected, ExtentTest test1, WebDriver driver) throws IOException
	{
		try {
			Text.click();
	    	String actualtext=driver.switchTo().activeElement().getText();
	    	if(!actualtext.isEmpty()) {
	        	
	        	test1.log(Status.PASS,"RUN PASS: Text box is not empty "+actualtext);
	        	
	        } else {
        	    String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
	            String screenshotName = "D:\\Krystalnew\\error_screenshot_" + timestamp + ".png";
	            captureScreenshot(screenshotName,driver);
	            test1.log(Status.FAIL,"RUN FAIL: Text box is empty "+actualtext);
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
	public void isdisplayedvalid(WebElement Text, String Expected, ExtentTest test1, WebDriver driver) throws IOException {
	    try {
	    	if(Text.isDisplayed() && Text.equals(Expected) ) {
	        	
	        	test1.log(Status.PASS,"RUN PASS: Actual is " +Text.getText()+ "\n Excepted is " +Expected+ " Same as Excepeted");
	        	
	        } else {
        	    String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
	            String screenshotName = "D:\\Krystalnew\\error_screenshot_" + timestamp + ".png";
	            captureScreenshot(screenshotName,driver);
	            test1.log(Status.FAIL,"RUN FAIL: Actual is " + Text.getText() + "\n Expected is " + Expected + " Not Same as Expected");
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
	
	public void isEnabled(WebElement Text, String Expected, ExtentTest test1,WebDriver driver) throws IOException {
	    try {
	    	if(Text.isEnabled()) {
	        	
	        	test1.log(Status.PASS,"RUN PASS: " +Expected+ " is Enabled");
	        	
	        } else {
        	    String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
	            String screenshotName = "D:\\Krystalnew\\error_screenshot_" + timestamp + ".png";
	            captureScreenshot(screenshotName,driver);
	            test1.log(Status.FAIL,"RUN FAIL: "+Expected+ " is not Enabled");
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
	public void BydefaultisEnabled(WebElement Text, String Expected, ExtentTest test1,WebDriver driver) throws IOException {
	    try {
	    	if(!Text.isEnabled()) {
	        	
	        	test1.log(Status.PASS,"RUN PASS: " +Text.getText()+ " is not  Enabled");
	        	
	        } else {
        	    String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
	            String screenshotName = "D:\\Krystalnew\\error_screenshot_" + timestamp + ".png";
	            captureScreenshot(screenshotName,driver);
	            test1.log(Status.FAIL,"RUN FAIL: " +Text.getText()+ " is Enabled");
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
	
	public void isSelected(WebElement Text, String Expected, ExtentTest test1,WebDriver driver) throws IOException {
	    try {
	    	if(Text.isSelected()) {
	        	
	    		test1.log(Status.PASS,"RUN PASS: " +Text.getText()+ " is Selected");
	        	
	        } else {
	        	    String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		            String screenshotName = "D:\\Krystalnew\\error_screenshot_" + timestamp + ".png";
		            captureScreenshot(screenshotName,driver);
		            test1.log(Status.FAIL,"RUN FAIL: " +Text.getText()+ " is not Selected");
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
	public void BydefaultisSelected(WebElement Text,String Expected, ExtentTest test1,WebDriver driver) throws IOException {
	    try {
	    	if(!Text.isSelected()) {
	        	
	    		test1.log(Status.PASS,"RUN PASS: " +Text.getText()+ " is not  Selected");
	        	
	        } else {
        	    String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
	            String screenshotName = "D:\\Krystalnew\\error_screenshot_" + timestamp + ".png";
	            captureScreenshot(screenshotName,driver);
	            test1.log(Status.FAIL,"RUN FAIL: " +Text.getText()+ " is Selected");
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
	
	public void ByErrormessage(WebElement Text, String Expected, ExtentTest test1, WebDriver driver) throws IOException {
	    try {
	    	Text.click();
	    	String actualtext=driver.switchTo().activeElement().getText();
	    	if(actualtext.equals(Expected)) {
	        	
	        	test1.log(Status.PASS,"RUN PASS: Actual is " +actualtext+ "\nExcepted is " +Expected+ " Same as Excepeted");
	        	
	        } else {
        	    String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
	            String screenshotName = "D:\\Krystalnew\\error_screenshot_" + timestamp + ".png";
	            captureScreenshot(screenshotName,driver);
	            test1.log(Status.FAIL,"RUN FAIL: Actual is " + Text.getText() + "\nExpected is " + Expected + " Not Same as Expected");
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
	
	public void ByInvalidErrormessage(WebElement Text, String Expected, ExtentTest test1, WebDriver driver) throws IOException {
	    try {
	    	Text.click();
	    	String actualtext=driver.switchTo().activeElement().getText();
	    	if(!actualtext.equals(Expected)) {
	        	
	        	test1.log(Status.PASS,"RUN PASS: Actual is " +actualtext+ "\nExcepted is " +Expected+ " Same as Excepeted");
	        	
	        } else {
        	    String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
	            String screenshotName = "D:\\Krystalnew\\error_screenshot_" + timestamp + ".png";
	            captureScreenshot(screenshotName,driver);
	            test1.log(Status.FAIL,"RUN FAIL: Actual is " + Text.getText() + "\nExpected is " + Expected + " Not Same as Expected");
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
	public void ByValidErrormessage(WebElement Text, String Expected, ExtentTest test1, WebDriver driver) throws IOException {
	    try {
	    	Text.click();
	    	String actualtext=driver.switchTo().activeElement().getText();
	    	if(actualtext.equals(Expected)) {
	        	test1.log(Status.PASS,"RUN PASS: Actual is " +actualtext+ "\nExcepted is " +Expected+ " Same as Excepeted");
	        } else {
        	    String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
	            String screenshotName = "D:\\Krystalnew\\error_screenshot_" + timestamp + ".png";
	            captureScreenshot(screenshotName,driver);
	            test1.log(Status.FAIL,"RUN FAIL: Actual is " + Text.getText() + "\nExpected is " + Expected + " Not Same as Expected");
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

	public void Textcomparsion(WebElement Text, String Expected, ExtentTest test1,WebDriver driver) throws IOException {
	    try {
	    	Actions action=new Actions(driver);
	    	action.moveToElement(Text).perform();
	        if (Text.getText().equals(Expected)) {
	            test1.log(Status.PASS,"RUN PASS: Actual is " + Text.getText() + "\nExpected is " + Expected + " Same as Expected");
	        } else {
	            String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
	            String screenshotName = "D:\\Krystalnew\\error_screenshot_" + timestamp + ".png";
	            captureScreenshot(screenshotName,driver);
	            test1.log(Status.FAIL,"RUN FAIL: Actual is " + Text.getText() + "\nExpected is " + Expected + " Not Same as Expected");
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
	
	public void screenshot(ExtentTest test1,WebDriver driver) throws IOException
	{
		 String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
	     String screenshotName = "D:\\Krystalnew\\error_screenshot_" + timestamp + ".png";
	     captureScreenshot(screenshotName,driver);
	     test1.addScreenCaptureFromPath(screenshotName);
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
	
	
	public void ByActionclass(WebElement Text, String Expected, ExtentTest test1, WebDriver driver) throws IOException {
	    try {
	    	Actions action=new Actions(driver);
	    	Text.click();
	    	//action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).click().perform();
	    	String actualtext=driver.switchTo().activeElement().getText();
	    	if(actualtext.equals(Expected)) {
	        	
	        	test1.log(Status.PASS,"RUN PASS: "+Text.getText()+" ->Actual is " +actualtext+ "\nExcepted is " +Expected+ " Same as Excepeted");
	        	Thread.sleep(500);
	        	
	        } else {
        	    String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
	            String screenshotName = "D:\\Krystalnew\\error_screenshot_" + timestamp + ".png";
	            captureScreenshot(screenshotName,driver);
	            test1.log(Status.FAIL,"RUN FAIL:  Actual is " + actualtext + "\nExpected is " + Expected + " Not Same as Expected");
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
	
	
	public void Passwordtextfield(WebElement Text, WebElement Eyeicon, String Expected, ExtentTest test1,WebDriver driver)
			throws IOException {
		try {
			Actions act=new Actions(driver);

			act.moveToElement(Eyeicon).clickAndHold().perform();

			String actualtext = Text.getText();
			System.out.println(Text.getText() + " actual");

			act.release(Eyeicon).perform();

			if (Text.getText().equals(Expected)) {
	            test1.log(Status.PASS,"RUN PASS: Actual is " + Text.getText() + "\nExpected is " + Expected + " Same as Expected");
	        } else {
	            String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
	            String screenshotName = "D:\\Krystalnew\\error_screenshot_" + timestamp + ".png";
	            captureScreenshot(screenshotName,driver);
	            test1.log(Status.FAIL,"RUN FAIL: Actual is " + Text.getText() + "\nExpected is " + Expected + " Not Same as Expected");
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

	
	public  void TextfieldwithWarnmsg(String Text, String Expected, ExtentTest test1,WebDriver driver) {
		// TODO Auto-generated method stub
		try {

			String actualtext = Text;
			System.out.println("RUN PASS: Actual is " + actualtext + " Excepted is " + Expected + ", Actual Same as Excepeted");
			if (actualtext.equals(Expected)) {

				test1.pass("RUN PASS: Actual is " + actualtext + " Excepted is " + Expected+ ", Actual Same as Excepeted");

			} else {
				String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
				String screenshotName = "D:\\Krystalnew\\error_screenshot_" + timestamp + ".png";
				captureScreenshot(screenshotName,driver);
				test1.fail("RUN FAIL: Actual is " + actualtext + " Excepted is " + Expected+ ", Actual is not Same as Excepeted");
				test1.addScreenCaptureFromPath(screenshotName);
			}

		} catch (Exception e) {
			test1.fail("An error occurred: " + e.getMessage());
			String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
			String screenshotName = "D:\\" + timestamp + ".png";
			captureScreenshot(screenshotName,driver);
			//test1.addScreenCaptureFromPath(screenshotName);
		}
	}
	
	public  void textfield(WebElement Text, String Expected, ExtentTest test1,WebDriver driver) throws IOException {
		try {

			String actualtext = Text.getText();
			System.out.println("RUN PASS: Actual is " + actualtext + " Excepted is " + Expected + ", Actual Same as Excepeted");
		
			if (actualtext.equals(Expected)) {

				test1.pass("RUN PASS: Actual is " + actualtext + " Excepted is " + Expected
						+ ", Actual Same as Excepeted");

			} else {
				String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
				String screenshotName = "D:\\Krystalnew\\error_screenshot_" + timestamp + ".png";
				captureScreenshot(screenshotName,driver);
				test1.fail("RUN FAIL: Actual is " + actualtext + " Excepted is " + Expected + " both are  not same");
				test1.addScreenCaptureFromPath(screenshotName);
			}

		} catch (Exception e) {
			test1.fail("An error occurred: " + e.getMessage());
			String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
			String screenshotName = "D:\\" + timestamp + ".png";
			captureScreenshot(screenshotName,driver);
			test1.addScreenCaptureFromPath(screenshotName);
		}
	}

	public  void textfield(WebElement text, String value) throws InterruptedException {

		boolean EN = text.isDisplayed();
		if (EN) {
		
			boolean ED = text.isEnabled();
			if (ED) {
			
				text.sendKeys(value);
						
			} else {	
			}
		} else {}

	}

	

	
		
	
	
}