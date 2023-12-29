package com.krystal.project;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.windows.WindowsDriver;

public class Referencefile {
	public ExtentReports extent;
	public ExtentTest test;
	public static int testCaseCount = 1;
	public WindowsDriver<WebElement> driver;

	
	 @BeforeClass
		public void setUp1()  throws InterruptedException, IOException {
		DesiredCapabilities appCapabilities = new DesiredCapabilities();
		appCapabilities.setCapability("app", "C:\\Program Files\\Panacea Medical Technologies\\Krystal\\Krystal.exe");
		driver = new WindowsDriver<WebElement>(new URL("http://127.0.0.1:4723"), appCapabilities);
		}
	public String guiTestCaseName() throws IOException {
	    return "STC_GUI_" + String.format("%02d", testCaseCount++);
	}
	public String funTestCaseName() throws IOException {
	    return "STC_FUN_" + String.format("%02d", testCaseCount++);
	}
		
		@BeforeSuite
		public void setUp() {
			extent = ExtendManager.getInstance();
		}
		 DemographicsExternal demo=new DemographicsExternal() ;
 
	
	public void InvalidData(WebElement Invaliddata, WebDriver driver) throws IOException
	{
		test = extent.createTest(funTestCaseName()+" To verify " +Invaliddata.getText()+" textbox should not accept the alphabhets");
		Invaliddata(Invaliddata, "ABCHGHSGHFSHGDHGDD","Only whole and decimal numbers allowed","Only whole and decimal numbers allowed",driver,test);
		test = extent.createTest(funTestCaseName()+" To verify " +Invaliddata.getText()+" textbox should not accept the specialchars");
		Invaliddata(Invaliddata, "#$%&()*-/:;<=>?@[]^_`{|}~","Only whole and decimal numbers allowed","Only whole and decimal numbers allowed",driver,test);
		test = extent.createTest(funTestCaseName()+"To verify " +Invaliddata.getText()+" textbox should not accept the invalidchars");
		Invaliddata(Invaliddata, "\\,\",'","Only whole and decimal numbers allowed","Only whole and decimal numbers allowed",driver,test);
		test = extent.createTest(funTestCaseName()+" To verify " +Invaliddata.getText()+" textbox should not accept the alphanumeric");
		Invaliddata(Invaliddata,  "shgdjdgd&^&%&","Only whole and decimal numbers allowed","Only whole and decimal numbers allowed",driver,test);
	}
	

	public void Invaliddata(WebElement Name, String Text,String actual, String Excepted,WebDriver driver,ExtentTest test) throws IOException
	{
		Name.click();
		driver.switchTo().activeElement().sendKeys(Text);
		demo.isempty(Name,Text, test,driver);
		try {
			WebElement errormsg=driver.findElement(By.name(actual));
			demo.isdisplayed(errormsg, Excepted, test,driver);
			demo.Textcomparsion(errormsg, Excepted, test,driver);
		}
		catch(Exception e)
		{
			test.pass("Text box not displaying any rror message");
		}
		
		driver.switchTo().activeElement().clear();
	}
	
	public void popuphandleupdate(WebDriver driver) throws IOException, InterruptedException
	{
	
		String mainWindowHandle = driver.getWindowHandle();
	    Set<String> windowHandles = driver.getWindowHandles();

	    for (String handle : windowHandles) {
	        if (!handle.equals(mainWindowHandle)) {
	            driver.switchTo().window(handle);
	            test = extent.createTest(guiTestCaseName()+" To verify update popup titlename");
	            WebElement ToleranceSave=driver.findElement(By.name("Tolerance Range Configurtaion"));
	            demo.Textcomparsion(ToleranceSave, "Prescription Settings Update", test,driver);
	            try {
	            WebElement ToleranceSavedescription=driver.findElement(By.name("Tolerance Range data updated."));
	            test = extent.createTest(guiTestCaseName()+" To verify update popup description");
	            demo.Textcomparsion(ToleranceSavedescription, "Tolerance Range data updated.", test,driver);
	            }
	            catch(Exception e) {
	            	test.fail("Element not found");
	            }
	            test = extent.createTest(guiTestCaseName()+" To verify update popup ok button");
	            WebElement OK=driver.findElement(By.name("OK"));
	            demo.Textcomparsion(OK, "OK", test,driver);
	        	OK.click();	
	        	Thread.sleep(2000);
	            break; 
	        }
	    }
	    driver.switchTo().window(mainWindowHandle);
	}
	public void editupdatedata(WebElement element, String text,WebDriver driver,ExtentTest test) throws IOException
	{
		demo.ByErrormessage(element, text,test,driver);
	}

	public void InValidRangeAngle(WebElement InValidrange,WebDriver driver) throws IOException
	{
		test = extent.createTest(funTestCaseName()+" To verify " +InValidrange.getText()+" range less than 1 and more than 100 error message is displayed or not");
		Invalidrange(InValidrange, "0.4","Range:[0.5 to 100]","Range:[0.5 to 100]",driver);
		driver.switchTo().activeElement().clear();
		Invalidrange(InValidrange, "0","Range:[0.5 to 100]","Range:[0.5 to 100]",driver);
		driver.switchTo().activeElement().clear();
		Invalidrange(InValidrange, "0.1","Range:[0.5 to 100]","Range:[0.5 to 100]",driver);
		driver.switchTo().activeElement().clear();
		Invalidrange(InValidrange, "101","Range:[0.5 to 100]","Range:[0.5 to 100]",driver);
		driver.switchTo().activeElement().clear();
		Invalidrange(InValidrange, "100.1","Range:[0.5 to 100]","Range:[0.5 to 100]",driver);
		driver.switchTo().activeElement().clear();
		Invalidrange(InValidrange, "0.49","Range:[0.5 to 100]","Range:[0.5 to 100]",driver);
	}
	
	
	public void InValidTablenumber(WebElement InValidrange,WebDriver driver) throws IOException
	{
		test = extent.createTest(funTestCaseName()+" To verify " +InValidrange.getText()+" Table NUmber Range");
		Invalidrange(InValidrange, "0","Range:[1 to 1000]","Range:[1 to 1000]",driver);
		driver.switchTo().activeElement().clear();
		Invalidrange(InValidrange, "0.9","Range:[1 to 1000]","Range:[1 to 1000]",driver);
		driver.switchTo().activeElement().clear();
		Invalidrange(InValidrange, "1000.1","Range:[1 to 1000]","Range:[1 to 1000]",driver);
		driver.switchTo().activeElement().clear();
		Invalidrange(InValidrange, "1000.19","Range:[1 to 1000]","Range:[1 to 1000]",driver);
		driver.switchTo().activeElement().clear();
		Invalidrange(InValidrange, "0.99","Range:[1 to 1000]","Range:[1 to 1000]",driver);
		driver.switchTo().activeElement().clear();
	}
	
	public void InValidRangeBeam(WebElement InValidrange,WebDriver driver) throws IOException
	{

			test = extent.createTest(funTestCaseName()+" To verify " +InValidrange.getText()+" range less than 0.1 and more than 100 error message is displayed or not");
			Invalidrange(InValidrange, "0","Range:[0.1 to 100]","Range:[0.1 to 100]",driver);
			driver.switchTo().activeElement().clear();
			Invalidrange(InValidrange, "0.01","Range:[0.1 to 100]","Range:[0.1 to 100]",driver);
			driver.switchTo().activeElement().clear();
			Invalidrange(InValidrange, "100.9","Range:[0.1 to 100]","Range:[0.1 to 100]",driver);
			driver.switchTo().activeElement().clear();
			Invalidrange(InValidrange, "101","Range:[0.1 to 100]","Range:[0.1 to 100]",driver);
			driver.switchTo().activeElement().clear();
			Invalidrange(InValidrange, "0.01","Range:[0.1 to 100]","Range:[0.1 to 100]",driver);
		}
	
	public void InValidRangeCouch(WebElement InValidrange,WebDriver driver) throws IOException
	{

			test = extent.createTest(funTestCaseName()+" To verify " +InValidrange.getText()+" range less than 0.2 and more than 100 error message is displayed or not");
			Invalidrange(InValidrange, "0.1","Range:[0.2 to 100]","Range:[0.2 to 100]",driver);
			driver.switchTo().activeElement().clear();
			Invalidrange(InValidrange, "0","Range:[0.2 to 100]","Range:[0.2 to 100]",driver);
			driver.switchTo().activeElement().clear();
			Invalidrange(InValidrange, "101","Range:[0.2 to 100]","Range:[0.2 to 100]",driver);
			driver.switchTo().activeElement().clear();
			Invalidrange(InValidrange, "101.9","Range:[0.2 to 100]","Range:[0.2 to 100]",driver);
			driver.switchTo().activeElement().clear();
			Invalidrange(InValidrange, "1000","Range:[0.2 to 100]","Range:[0.2 to 100]",driver);
		}
	
	public void InValidRangeCouchAngle(WebElement InValidrange,WebDriver driver) throws IOException
	{

			test = extent.createTest(funTestCaseName()+" To verify " +InValidrange.getText()+" range less than 0.1 and more than 5 error message is displayed or not");
			Invalidrange(InValidrange, "0.01","Range:[0.1 to 5]","Range:[0.1 to 5]",driver);
			driver.switchTo().activeElement().clear();
			Invalidrange(InValidrange, "0","Range:[0.1 to 5]","Range:[0.1 to 5]",driver);
			driver.switchTo().activeElement().clear();
			Invalidrange(InValidrange, "5.01","Range:[0.1 to 5]","Range:[0.1 to 5]",driver);
			driver.switchTo().activeElement().clear();
			Invalidrange(InValidrange, "5.1","Range:[0.1 to 5]","Range:[0.1 to 5]",driver);
			driver.switchTo().activeElement().clear();
			Invalidrange(InValidrange, "6","Range:[0.1 to 5]","Range:[0.1 to 5]",driver);
		}
	
	public void Rangeequal(WebElement Min,WebElement Max,WebDriver driver) throws IOException
	{
		test = extent.createTest(funTestCaseName()+" To verify enetred equal range for "+Min.getText()+ Max.getText()+" error message is displayed or not");
		Invalidrangeequal(Min, Max,"1","1", "Min cannot be equal to Max", "Min cannot be equal to Max","Max cannot be equal to Min", "Max cannot be equal to Min",driver);
	}
	public void Rangegreaterequal(WebElement Min,WebElement Max,WebDriver driver) throws IOException
	{
		test = extent.createTest(funTestCaseName()+" To verify enetred min greater range for "+Min.getText()+ " error message is displayed or not");
		Invalidrangeequal(Min, Max,"5","3","Min cannot be greater than Max", "Min cannot be greater than Max","Max cannot be lesser than Min", "Max cannot be lesser than Min",driver);
	}
	public void Invalidrangeequal(WebElement Name, WebElement RangeName, String Text, String Text1, String actual, String Excepted,String actual1, String Excepted1,WebDriver driver) throws IOException
	{
		Name.click();
		driver.switchTo().activeElement().clear();
		driver.switchTo().activeElement().sendKeys(Text);
		RangeName.click();
		driver.switchTo().activeElement().clear();
		driver.switchTo().activeElement().sendKeys(Text1);
		WebElement errormsg=driver.findElement(By.name(actual));
		demo.isdisplayed(errormsg, Excepted, test,driver);
		demo.Textcomparsion(errormsg, Excepted, test,driver);
		WebElement errormsgdisplayed=driver.findElement(By.name(actual1));
		demo.isdisplayed(errormsgdisplayed, Excepted1, test,driver);
		demo.Textcomparsion(errormsgdisplayed, Excepted1, test,driver);
	}
	public void Rangevalid(WebElement Min,WebElement Max, String value, String value1,WebDriver driver) throws IOException
	{
		
		Validdata(Min, Max,value,value1,"Range:[1 to 1000]", "Range:[1 to 1000]",driver);
	}
	public void Validdata(WebElement Name, WebElement RangeName, String Text, String Text1, String actual,String Excepted,WebDriver driver) throws IOException
	{
		test = extent.createTest(funTestCaseName()+" To verify enetred Valid range for "+Name.getText()+" no error message is displayed");
		Name.click();
		driver.switchTo().activeElement().clear();
		driver.switchTo().activeElement().sendKeys(Text);
		demo.ByErrormessage(Name,Text, test,driver);
		RangeName.click();
		driver.switchTo().activeElement().clear();
		driver.switchTo().activeElement().sendKeys(Text1);
		demo.ByErrormessage(RangeName,Text1, test,driver);
		WebElement Element=driver.switchTo().activeElement();
		
		try {
			WebElement errormsg=driver.findElement(By.name(actual));
			demo.isdisplayed(errormsg, Excepted, test,driver);
			demo.ByErrormessage(errormsg, Excepted, test,driver);
		}
		catch(Exception e)
		{
			test.pass("Range Error message not displayed for the valid data");
		}
	}
	
	public void textdisable(WebElement element, WebElement element1,WebDriver driver, ExtentTest test) throws IOException
	{
		Actions action=new Actions(driver);
		action.moveToElement(element).click().perform();
		demo.BydefaultisSelected(element, "Click", test,driver);
		action.moveToElement(element1).click().perform();
		demo.BydefaultisSelected(element1, "Click", test,driver);
	}
	
	public void Invalidrange(WebElement Name, String Text, String actual, String Excepted,WebDriver driver) throws IOException
	{
		Name.click();
		driver.switchTo().activeElement().sendKeys(Text);
		WebElement errormsg=driver.findElement(By.name(actual));
		demo.isdisplayed(errormsg, Excepted, test,driver);
		demo.Textcomparsion(errormsg, Excepted, test,driver);
	}
	
	public void Savedisable(WebElement Name, String Text,WebDriver driver) throws IOException
	{
		demo.isEnabled(Name, Text, test,driver);
	}
	

	 @AfterClass
	   public void tearDown() {
	       // Flush the Extent Reports after all tests in the class
	       extent.flush();
	   }
	 @AfterClass
	   public void quit() throws InterruptedException
	   {
	   	driver.quit();
	   	 Thread.sleep(7000);
	   }

	
	
	
	
	
	
	
	
	
	
}
