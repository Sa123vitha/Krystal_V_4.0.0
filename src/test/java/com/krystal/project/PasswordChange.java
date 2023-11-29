package com.krystal.project;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.windows.WindowsDriver;

public class PasswordChange extends ReferencefileChemotheraphy {
	WebElement changePasswordHeader;
	WebElement currentPassword;
	WebElement newPassword;
	WebElement confrimPassword;
	WebElement changePassword;
	WebElement clear;
	WebElement passwordButton;
	WebElement ShowPassword;
	WebElement passwordScreen;
	WebElement currentPasswordErrorMessage;
	WebElement newPasswordErrorMessage;
	WebElement confrimPasswordErrorMessage;
	WebElement newErrorMessage;
	WebElement MismatchMessage;
	DemographicsExternal demo;
	@BeforeClass
	public void setUp1() throws MalformedURLException, InterruptedException {
	DesiredCapabilities appCapabilities = new DesiredCapabilities();
    appCapabilities.setCapability("app", "C:\\Program Files\\Panacea Medical Technologies\\Krystal\\Krystal.exe");
	driver = new WindowsDriver<WebElement>(new URL("http://127.0.0.1:4723"), appCapabilities);
	ReferenceSigin Sign=new ReferenceSigin();
	Sign.Login(driver);
	passwordButton=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"NavigationTopBarView\"]/Button[@AutomationId=\"SearchMenuButton\"]"));
	passwordButton.click();
 }
	@BeforeSuite
	public void setUp() {
		extent = ExtendManager.getInstance();
	}

	@Test(priority=1)
	public void funPasswordButton() throws InterruptedException, IOException
	{   demo=new DemographicsExternal();
	    
		passwordScreen=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Window[@ClassName=\"Popup\"]/Menu[@ClassName=\"ContextMenu\"]"));
		test = extent.createTest(funTestCaseName()+" Change password pop-up window should be opened in the top right corner of the screen");
		demo.isdisplayed(passwordScreen,"ChangePassword Screen",test,driver);
	}
	
	@Test(priority =3)
	public void ToverifyChangepasswordlabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Change Password label","Change Password label should be present");	
	changePasswordHeader=driver.findElement(By.xpath("//TextBlock[contains(@Name,'Change Password for')]"));
	ExternalBeamGUI1(changePasswordHeader, "Change Password", test);
	}
	@Test(priority =4)
	public void ToverifyCurrentpasswordlabel() throws IOException {
		test = extent.createTest(guiTestCaseName()+" Current Password label","Current Password label should be present");	
		currentPassword=driver.findElement(By.name("Current Password"));
		ExternalBeamGUI1(currentPassword, "Current Password", test);
		}
	@Test(priority =5)
	public void ToverifynewPasswordlabel() throws IOException {
		test = extent.createTest(guiTestCaseName()+" New Password label","New Password label should be present");	
		newPassword=driver.findElement(By.name("New Password"));
		ExternalBeamGUI1(newPassword, "New Password", test);
		}
	@Test(priority =6)
	public void ToverifyconfrimPasswordlabel() throws IOException {
		test = extent.createTest(guiTestCaseName()+" Confirm Password label","Confirm Password label should be present");	
		confrimPassword=driver.findElement(By.name("Confirm Password"));
		ExternalBeamGUI1(confrimPassword, "Confirm Password", test);
		}
		
	@Test(priority =7)
	public void ToverifyShowPasswordlabel() throws IOException {
		test = extent.createTest(guiTestCaseName()+" Show Password label","Show Password label should be present");	
		ShowPassword=driver.findElement(By.xpath("//Button[@HelpText=\"Show Password\"]"));
		demo.isdisplayed(ShowPassword,"ShowPassword", test, driver);
		}
	
	@Test(priority =7)
	public void Toverifyclearbutton() throws IOException {
		test = extent.createTest(guiTestCaseName()+" Clear label","clear label should be present");	
		clear=driver.findElement(By.name("CLEAR"));
		ExternalBeamGUI1(clear, "CLEAR", test);
		}
	@Test(priority =8)
	public void Toverifychangepasswordbutton() throws IOException {
		test = extent.createTest(guiTestCaseName()+" Change Password","Change Password label should be present");	
		changePassword=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Window[@ClassName=\"Popup\"]/Menu[@ClassName=\"ContextMenu\"]/Button[@Name=\"CHANGE PASSWORD\"][@AutomationId=\"BtnValidate\"]"));
		ExternalBeamGUI1(changePassword, "CHANGE PASSWORD", test);
		
	}
	@Test(priority =9)
	public void ToverifybuttonEnable() throws IOException {
		test = extent.createTest(guiTestCaseName()+" To verify by default change password is enabled");	
		demo.isEnabled(changePassword, "ChangePassword", test, driver);
		test = extent.createTest(guiTestCaseName()+" To verify by default clear button is disabled");	
		demo.BydefaultisEnabled(clear, "Clear", test, driver);
		test = extent.createTest(guiTestCaseName()+" To verify by show password button is disabled");	
		demo.BydefaultisEnabled(ShowPassword, "Show Password", test, driver);
		}
	
	@Test(priority =10)
	public void funchangepasswordbutton() throws IOException, InterruptedException {
		test = extent.createTest(funTestCaseName()+" To verify default change password enable");	
		demo.isEnabled(passwordButton,"Password", test,driver);
		changePassword.click();
		test = extent.createTest(funTestCaseName()+" To verify Password cannot be empty error message should be displayed in current, new, confrim password");
		Errormessage1();
		clear();
	
	}
		
	Actions action;
	private String imagePath;
	private Screen s;
	private Match match;
	@Test(priority=11)
	public void CurrentPasswordEmpty() throws InterruptedException, IOException
	{
		test = extent.createTest(funTestCaseName()+" To verify Enter Valid New and Confrim password and Current password is empty");	
		newPassword.click();
		action=new Actions(driver);
		action.moveByOffset(-100,3).click().perform();
		driver.switchTo().activeElement().sendKeys("Manager");
		ShowPassword.click();
		confrimPassword.click();
		action.moveByOffset(-100,3).click().perform();
		driver.switchTo().activeElement().sendKeys("Manager");
		changePassword.click();
		currentPasswordErrorMessage();
	}

	@Test(priority=12)
	public void NewPasswordEmpty() throws InterruptedException, IOException
	{
		test = extent.createTest(funTestCaseName()+" To verify Enter Valid Confrim password and Current password and  New paswordis empty");	
		clear();
		currentPassword.click();
		action.moveByOffset(-100,3).click().perform();
		driver.switchTo().activeElement().sendKeys("Manager");
		confrimPassword.click();
		action.moveByOffset(-100,3).click().perform();
		driver.switchTo().activeElement().sendKeys("Manager");
		changePassword.click();
		action.moveByOffset(-100,3).click().perform();
		newPasswordErrorMessage();
	}
	
	
	
	@Test(priority=13)
	public void ConfrimPasswordEmpty() throws InterruptedException, IOException
	{
		test = extent.createTest(funTestCaseName()+" To verify Enter Valid  Current password and  New pasword and Confrim password is empty");	
		clear();
		currentPassword.click();
		action.moveByOffset(-100,3).click().perform();
		driver.switchTo().activeElement().sendKeys("Manager");
		newPassword.click();
		action.moveByOffset(-100,3).click().perform();
		driver.switchTo().activeElement().sendKeys("Manager");
		changePassword.click();
		confrimPasswordErrorMessage();
	}
	
	@Test(priority=14)
	public void currentpasswordButton() throws InterruptedException, IOException
	{
		test = extent.createTest(funTestCaseName()+" To verify Current password accepting Alphabhets");	
		clear();
		ValidRangedata(currentPassword,"ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		showpassword(ShowPassword);
		clear();
		Thread.sleep(1000);
		currentPassword.click();
		test = extent.createTest(funTestCaseName()+" To verify Current password accepting special charcters");	
		ValidRangedata(currentPassword,"(*((&*&*^&^&%^&%^_)_()");
		showpassword(ShowPassword);
		Thread.sleep(1000);
		clear();
		Thread.sleep(1000);
		currentPassword.click();
		test = extent.createTest(funTestCaseName()+" To verify Current password accepting Numbers");	
		ValidRangedata(currentPassword,"1234567890");
		showpassword(ShowPassword);
		Thread.sleep(1000);
		clear();
		Thread.sleep(1000);
		currentPassword.click();
		test = extent.createTest(funTestCaseName()+" To verify Current password Accepting valid data");	
		ValidRangedata(currentPassword,"m");
		clear();
	}
	
	@Test(priority=15)
	public void newPasswordButton() throws InterruptedException, IOException
	{
		test = extent.createTest(funTestCaseName()+" To verify New password accepting Alphabhets");	
		ValidRangedata(newPassword,"ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		newpasswordshow();
		Thread.sleep(1000);
		clear();
		currentPassword.click();
		test = extent.createTest(funTestCaseName()+" To verify New password accepting special charcters");	
		ValidRangedata(newPassword,"(*((&*&*^&^&%^&%^_)_()");
		newpasswordshow();
		Thread.sleep(1000);
		clear();
		currentPassword.click();
		test = extent.createTest(funTestCaseName()+" To verify New password accepting Numbers");	
		ValidRangedata(newPassword,"1234567890");
		newpasswordshow();
		Thread.sleep(1000);
		clear();
		currentPassword.click();
		test = extent.createTest(funTestCaseName()+" To verify New password Accepting valid data");	
		ValidRangedata(newPassword,"Manager");
		newpasswordshow();
		clear();
	}
	@Test(priority=16)
	public void ConfrimPasswordButton() throws InterruptedException, IOException
	{
		test = extent.createTest(funTestCaseName()+" To verify Confrim Password accepting Alphabhets");	
		ValidRangedata(confrimPassword,"ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		confrimpasswordshow();
		Thread.sleep(1000);
		clear();
		test = extent.createTest(funTestCaseName()+" To verify Confrim Password accepting special charcters");
		ValidRangedata(confrimPassword,"(*((&*&*^&^&%^&%^_)_()");
		confrimpasswordshow();
		Thread.sleep(1000);
		clear();
		test = extent.createTest(funTestCaseName()+" To verify Confrim Password accepting Numbers");	
		ValidRangedata(confrimPassword,"1234567890");
		confrimpasswordshow();
		Thread.sleep(1000);
		clear();
		test = extent.createTest(funTestCaseName()+" To verify Confrim Password Accepting valid data");	
		ValidRangedata(confrimPassword,"Password");
		confrimpasswordshow();
		currentPassword.click();
		clear();	
		
	}
	@Test(priority=17)
	public void Passwordmismatch() throws InterruptedException, IOException
	{
		test = extent.createTest(funTestCaseName()+" To verify Current password and new password is invalid error message is displayed");	
		changePassword=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Window[@ClassName=\"Popup\"]/Menu[@ClassName=\"ContextMenu\"]/Button[@Name=\"CHANGE PASSWORD\"][@AutomationId=\"BtnValidate\"]"));
		currentPassword.click();
		action.moveByOffset(-100,3).click().perform();
		Thread.sleep(1000);
		driver.switchTo().activeElement().sendKeys("m");
		newPassword.click();
		action.moveByOffset(-100,3).click().perform();
		Thread.sleep(1000);
		driver.switchTo().activeElement().sendKeys("123456789");
		Thread.sleep(1000);
		confrimPassword.click();
		action.moveByOffset(-100,3).click().perform();
		Thread.sleep(1000);
		driver.switchTo().activeElement().sendKeys("Password");
		Thread.sleep(1000);
		changePassword.click();
		Thread.sleep(1000);
		Errormessage3();
		Thread.sleep(1000);
		clear();
	}
	
	@Test(priority=18)
	public void CurrentPasswordwrong() throws InterruptedException, IOException
	{
		test = extent.createTest(funTestCaseName()+" To verify Enter Valid New, Confrim password and invalid Current password");	
		clear();
		currentPassword.click();
		action.moveByOffset(-100,3).click().perform();
		driver.switchTo().activeElement().sendKeys("132422");
		newPassword.click();
		action.moveByOffset(-100,3).click().perform();
		driver.switchTo().activeElement().sendKeys("Password");
		confrimPassword.click();
		action.moveByOffset(-100,3).click().perform();
		driver.switchTo().activeElement().sendKeys("Password");
		Thread.sleep(2000);
		changePassword.click();
		Thread.sleep(2000);
		Errormessage4();
		clear();
	
	}
	@Test(priority=19)
	public void NewPasswordmin() throws InterruptedException, IOException
	{
		test = extent.createTest(funTestCaseName()+" To verify New password and Current password is 1 error message is displayed");
		currentPassword.click();
		action.moveByOffset(-100,3).click().perform();
		driver.switchTo().activeElement().sendKeys("m");
		newPassword.click();
		action.moveByOffset(-100,3).click().perform();
		driver.switchTo().activeElement().sendKeys("P");
		confrimPassword.click();
		action.moveByOffset(-100,3).click().perform();
		driver.switchTo().activeElement().sendKeys("P");
		Thread.sleep(2000);
		changePassword.click();
		minlengthErrorMessage();
		clear();
		test = extent.createTest(funTestCaseName()+" To verify New password and Current password is 5 error message is displayed");
		currentPassword.click();
		action.moveByOffset(-100,3).click().perform();
		driver.switchTo().activeElement().sendKeys("manag");
		newPassword.click();
		action.moveByOffset(-100,3).click().perform();
		driver.switchTo().activeElement().sendKeys("manag");
		confrimPassword.click();
		action.moveByOffset(-100,3).click().perform();
		driver.switchTo().activeElement().sendKeys("manag");
		Thread.sleep(2000);
		changePassword.click();
		minlengthErrorMessage();
		clear();
	
	}
	@Test(priority=20)
	public void NewPasswordmax() throws InterruptedException, IOException
	{
		
		currentPassword.click();
		driver.switchTo().activeElement().sendKeys("Manager");
		test = extent.createTest(funTestCaseName()+" To verify New password is not accepting more than 16 charcters");
	
		newPassword.click();
		action.moveByOffset(-100,3).click().perform();
		driver.switchTo().activeElement().sendKeys("New password 1234567890");
		maxlength(newPassword,"New password 1234567890",test);
	
		test = extent.createTest(funTestCaseName()+" To verify Confrim password is not accepting more than 16 charcters");
		confrimPassword.click();
		action.moveByOffset(-100,3).click().perform();
		driver.switchTo().activeElement().sendKeys("Confrim password 1234567890");
		maxlength(newPassword,"Confrim password 1234567890",test);
		
		Thread.sleep(2000);
		changePassword.click();
		test = extent.createTest(funTestCaseName()+" To verify click on clear button all the text enetred is empty");
		clear();
		demo.isempty(currentPassword,"currentPassword",test, driver);
		demo.isempty(newPassword,"newPassword",test, driver);
		demo.isempty(confrimPassword,"confrimPassword",test, driver);
		test = extent.createTest(funTestCaseName()+" To verify click on clear, it is disabled");
		demo.BydefaultisEnabled(clear,"CLEAR",test,driver);
	}
	
	@Test(priority=21)
	public void NewPasswordValid() throws InterruptedException, IOException
	{
		test = extent.createTest(funTestCaseName()+" To verify if enetred all the details are valid");
		clear();
		currentPassword.click();
		action.moveByOffset(-100,3).click().perform();
		driver.switchTo().activeElement().sendKeys("p");
		newPassword.click();
		action.moveByOffset(-100,3).click().perform();
		driver.switchTo().activeElement().sendKeys("Manager");
		confrimPassword.click();
		action.moveByOffset(-100,3).click().perform();
		driver.switchTo().activeElement().sendKeys("Manager");
		changePassword.click();
		Thread.sleep(2000);
		Sitesave1("Password Change","Password Changed for account.","Password Change","Password Changed for account.", 1, driver,test);
		Thread.sleep(1000);
	}
	
	public void showpassword(WebElement element) throws InterruptedException
	{
		Actions action=new Actions(driver);
		action.clickAndHold(ShowPassword).perform();
        Thread.sleep(2000);
        action.release(ShowPassword).perform();
	}
	
	public void newpasswordshow() throws InterruptedException
	{
		
		By locator = By.xpath("//Button[@HelpText=\"Show Password\"]");
		List<WebElement> elements = driver.findElements(locator);
		Thread.sleep(1000);

		int desiredIndex = 1; 
		if (desiredIndex < elements.size()) {
			Thread.sleep(1000);
		    WebElement element1 = elements.get(desiredIndex);
		    action.clickAndHold(element1).perform();
	        Thread.sleep(2000);
	        action.release(element1).perform();
		} 
	}
	public void confrimpasswordshow() throws InterruptedException, IOException
	{
		
		By locator = By.xpath("//Button[@HelpText=\"Show Password\"]");
		List<WebElement> elements = driver.findElements(locator);
		Thread.sleep(1000);

		int desiredIndex = 2; 
		if (desiredIndex < elements.size()) {
			Thread.sleep(1000);
		    WebElement element = elements.get(desiredIndex);
		    action.clickAndHold(element).perform();
	        Thread.sleep(2000);
	       

	        // Take a screenshot of the element
	        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

	        try {
	            // Crop the screenshot to capture only the element
	            File elementScreenshotFile = new File("D:\\element_screenshot.png");
	            FileUtils.copyFile(screenshotFile, elementScreenshotFile);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
            Thread.sleep(3000);
            imagePath = "D:\\viewpassword.png";
            s = new Screen();
            
            Pattern textPattern = new Pattern(imagePath);
			match.type("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
			match.click();
			String extractedText = match.text();
			Sikluxclass c= new Sikluxclass();
			c.Textcomparsion(extractedText, "ABCDEFGHIJKLMNOPQRSTUVWXYZ", test,driver);
			   Thread.sleep(5000);
	        action.release(element).perform();
		} 
		
	}
	

	public void maxlength(WebElement element, String Text,ExtentTest test1)
	{
		element.click();
		String Actualtext=driver.switchTo().activeElement().getText();
		
		if(Actualtext.length()<=16)
		{
			test1.pass("RUN PASS: New Password actual length is"+Actualtext.length());
		}
		else
		{
			test1.fail("RUN FAIL: New Password actual length is"+Actualtext.length());
		}
	}
	public void clear() throws InterruptedException
	{
		clear=driver.findElement(By.name("CLEAR"));
		clear.click();
	}
	
	public void ValidRangedata(WebElement Name, String Text) throws IOException
	{
		Name.click();
		action=new Actions(driver);
		action.moveByOffset(-100,3).click().perform();
		driver.switchTo().activeElement().sendKeys(Text);
		WebElement element=driver.switchTo().activeElement();
		demo.ByInvalidErrormessage(element, Text, test,driver);
	}
	
	public void ShowRangedata(WebElement Name, String Text) throws IOException
	{
		Name.click();
		action.moveByOffset(-100,3).click().perform();
		driver.switchTo().activeElement().sendKeys(Text);
		WebElement element=driver.switchTo().activeElement();
		demo.ByValidErrormessage(element, Text,test,driver);
		ExternalBeamGUI1(element,Text, test);
	}
	public void Errormessage1() throws InterruptedException, IOException
	{
		currentPasswordErrorMessage=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Window[@ClassName=\"Popup\"]/Menu[@ClassName=\"ContextMenu\"]/Edit[@AutomationId=\"PasswordBox\"]/Text[@Name=\"Current Password cannot be empty\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Current Password cannot be empty\"]"));
		demo.isdisplayed(currentPasswordErrorMessage, "Current Password cannot be empty", test, driver);
		ExternalBeamGUI1(currentPasswordErrorMessage, "Current Password cannot be empty", test);
		Thread.sleep(2000);
	    newPasswordErrorMessage=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Window[@ClassName=\"Popup\"]/Menu[@ClassName=\"ContextMenu\"]/Edit[@AutomationId=\"NewPasswordbox\"]/Text[@Name=\"New Password cannot be empty\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"New Password cannot be empty\"]"));
		
		demo.isdisplayed(newPasswordErrorMessage, "New Password cannot be empty", test, driver);
		ExternalBeamGUI1(newPasswordErrorMessage, "New Password cannot be empty", test);
		Thread.sleep(2000);
	    confrimPasswordErrorMessage=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Window[@ClassName=\"Popup\"]/Menu[@ClassName=\"ContextMenu\"]/Edit[@AutomationId=\"Confirmpasswordbox\"]/Text[@Name=\"Confirm Password cannot be empty\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Confirm Password cannot be empty\"]"));
	    
	    demo.isdisplayed(confrimPasswordErrorMessage, "Confirm Password cannot be empty", test, driver);
	    ExternalBeamGUI1(confrimPasswordErrorMessage, "Confirm Password cannot be empty", test);
	    Thread.sleep(2000);
	} 
	
	
	public void Errormessage3() throws InterruptedException, IOException
	{
		 MismatchMessage=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Window[@ClassName=\"Popup\"]/Menu[@ClassName=\"ContextMenu\"]/Edit[@AutomationId=\"NewPasswordbox\"]/Text[@Name=\"Passwords Do not Match\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Passwords Do not Match\"]"));
		 String ExceptedText="Passwords Do not Match";
		 String displayedText =MismatchMessage.getText();
		// demo.ByValidErrormessage(MismatchMessage, "Passwords Do not Match",test,driver);
		 ExternalBeamGUI1(MismatchMessage, "Passwords Do not Match", test);
		
	}
	public void Errormessage4() throws InterruptedException, IOException
	{
		 currentPasswordErrorMessage=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Window[@ClassName=\"Popup\"]/Menu[@ClassName=\"ContextMenu\"]/Edit[@AutomationId=\"PasswordBox\"]/Text[@Name=\"Current Password is invalid\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Current Password is invalid\"]"));
		 String ExceptedText="Current Password is invalid";
		// demo.ByValidErrormessage(currentPasswordErrorMessage, ExceptedText,test,driver);
		 ExternalBeamGUI1(currentPasswordErrorMessage, ExceptedText, test);
	}

	public void currentPasswordErrorMessage() throws InterruptedException, IOException
	{
		 currentPasswordErrorMessage=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Window[@ClassName=\"Popup\"]/Menu[@ClassName=\"ContextMenu\"]/Edit[@AutomationId=\"PasswordBox\"]/Text[@Name=\"Current Password cannot be empty\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Current Password cannot be empty\"]"));
		 demo.isdisplayed(currentPasswordErrorMessage, "Current Password cannot be empty",test,driver);
		 ExternalBeamGUI1(currentPasswordErrorMessage, "Current Password cannot be empty", test);
	}
	
	public void newPasswordErrorMessage() throws InterruptedException, IOException
	{
	//	newPasswordErrorMessage=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Window[@ClassName=\"Popup\"]/Menu[@ClassName=\"ContextMenu\"]/Edit[@AutomationId=\"NewPasswordbox\"]/Text[@Name=\"New Password cannot be empty\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"New Password cannot be empty\"]"));
		newPasswordErrorMessage=driver.findElement(By.xpath("//TextBlock[contains(@Name,'New Password cannot be empty')]"));
		demo.isdisplayed(newPasswordErrorMessage, "New Password cannot be empty",test,driver);
		ExternalBeamGUI1(newPasswordErrorMessage, "New Password cannot be empty", test);
	}
	public void confrimPasswordErrorMessage() throws InterruptedException, IOException
	{
		confrimPasswordErrorMessage=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Window[@ClassName=\"Popup\"]/Menu[@ClassName=\"ContextMenu\"]/Edit[@AutomationId=\"Confirmpasswordbox\"]/Text[@Name=\"Confirm Password cannot be empty\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Confirm Password cannot be empty\"]"));
		
		
		demo.isdisplayed(confrimPasswordErrorMessage, "Confirm Password cannot be empty",test,driver);
		ExternalBeamGUI1(confrimPasswordErrorMessage, "Confirm Password cannot be empty", test);
	}
	
	WebElement minlengthErrorMessage;
	public void minlengthErrorMessage() throws InterruptedException, IOException
	{
		minlengthErrorMessage=driver.findElement(By.name("Min length is 6"));
		demo.isdisplayed(minlengthErrorMessage, "Min length is 6",test,driver);
		ExternalBeamGUI1(minlengthErrorMessage, "Min length is 6", test);
	}
	public void ExternalBeamGUI1(WebElement Text, String Expected, ExtentTest test1) throws IOException {
	    try {
	        if (Text.getText().equals(Expected)) {
	            test1.pass("RUN PASS: Actual is " + Text.getText() + " Expected is " + Expected + " Same as Expected");
	        } else {
	            String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
	            String screenshotName = "D:\\Krystalnew\\error_screenshot_" + timestamp + ".png";
	            captureScreenshot(screenshotName);
	            test1.fail("RUN FAIL: Actual is " + Text.getText() + " Expected is " + Expected + " Not Same as Expected");
	            test1.addScreenCaptureFromPath(screenshotName);      
	        }
	    } catch (Exception e) {
	        test1.error("An error occurred: " + e.getMessage());
	        String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
	        String screenshotName = "D:\\Krystalnew\\error_screenshot_" + timestamp + ".png";
	        captureScreenshot(screenshotName);
	        test1.addScreenCaptureFromPath(screenshotName);
	    }
	}
	public void captureScreenshot(String screenshotName) {
	    try {
	        TakesScreenshot screenshot = (TakesScreenshot) driver;
	        File source = screenshot.getScreenshotAs(OutputType.FILE);
	        File destination = new File(screenshotName);
	        FileUtils.copyFile(source, destination);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	

@AfterSuite
public void tearDown() {
    extent.flush();
}
	
 
}
