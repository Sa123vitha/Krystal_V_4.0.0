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
import org.sikuli.script.Region;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterClass;
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

	private PasswordChangePOM password;
	private Actions act;
	private Actions action;
	
	@Test(priority =1)
	public void Launch()  throws InterruptedException, IOException {
	ReferenceSigin Sign=new ReferenceSigin();
	Sign.Login(driver);
	passwordButton=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"NavigationTopBarView\"]/Button[@AutomationId=\"SearchMenuButton\"]"));
	passwordButton.click();
	password=new PasswordChangePOM(driver);
	act=new Actions(driver);
	action=new Actions(driver);
 }
	@BeforeSuite
	public void setUp() {
		extent = ExtendManager.getInstance();
	}

	@Test(priority=1)
	public void funPasswordButton() throws InterruptedException, IOException
	{   demo=new DemographicsExternal();
	    test = extent.createTest("!!!!!!!!!!CHANGE PASSWORD!!!!!!!");
		test = extent.createTest(funTestCaseName()+" Change password pop-up window should be opened in the top right corner of the screen");
		demo.isdisplayed(password.passwordScreen,"ChangePassword Screen",test,driver);
	}
	
	//@Test(priority =3)  //  Not able to identify the Header of the chnagepassword
	public void ToverifyChangepasswordlabel() throws IOException, InterruptedException {
	test = extent.createTest(guiTestCaseName()+" Change Password label","Change Password label should be present");	
	try {
	if(password.changePasswordHeader.isDisplayed())
	{
		test.pass("New Password is displayed");
	}
	}
	catch(Exception e)
	{
		catchexceptionscreenshot(test,e);
	}
	
	}
	@Test(priority =4)
	public void ToverifyCurrentpasswordlabel() throws IOException {
		test = extent.createTest(guiTestCaseName()+" Current Password label","Current Password label should be present");	
		demo.Textcomparsion(password.currentPassword, "Current Password", test,driver);
		}
	@Test(priority =5)
	public void ToverifynewPasswordlabel() throws IOException {
		test = extent.createTest(guiTestCaseName()+" New Password label","New Password label should be present");	
		demo.Textcomparsion(password.newPassword, "New Password", test,driver);
		}
	@Test(priority =6)
	public void ToverifyconfrimPasswordlabel() throws IOException {
		test = extent.createTest(guiTestCaseName()+" Confirm Password label","Confirm Password label should be present");	
		demo.Textcomparsion(password.confrimPassword, "Confirm Password", test,driver);
		}
		
	@Test(priority =7)
	public void ToverifyShowPasswordlabel() throws IOException {
		test = extent.createTest(guiTestCaseName()+" Show Password label","Show Password label should be present");	
		demo.isdisplayed(password.ShowPassword,"ShowPassword", test, driver);
		}
	
	@Test(priority =7)
	public void Toverifyclearbutton() throws IOException {
		test = extent.createTest(guiTestCaseName()+" Clear label","clear label should be present");	
		demo.Textcomparsion(password.clear, "CLEAR", test,driver);
		}
	@Test(priority =8)
	public void Toverifychangepasswordbutton() throws IOException {
		test = extent.createTest(guiTestCaseName()+" Change Password","Change Password label should be present");	
		demo.Textcomparsion(password.changePassword, "CHANGE PASSWORD", test,driver);
	}
	@Test(priority =9)
	public void ToverifybuttonEnable() throws IOException {
		test = extent.createTest(guiTestCaseName()+" To verify by default change password is enabled");	
		demo.isEnabled(password.changePassword, "ChangePassword", test, driver);
		test = extent.createTest(guiTestCaseName()+" To verify by default clear button is disabled");	
		demo.BydefaultisEnabled(password.clear, "Clear", test, driver);
		test = extent.createTest(guiTestCaseName()+" To verify by show password button is disabled");	
		demo.BydefaultisEnabled(password.ShowPassword, "Show Password", test, driver);
		}
	
	@Test(priority =10)
	public void funchangepasswordbutton() throws IOException, InterruptedException {
		test = extent.createTest(funTestCaseName()+" To verify default change password enable");	
		demo.isEnabled(password.changePassword,"CHANGE PASSWORD", test,driver);
		password.changePassword.click();
		test = extent.createTest(funTestCaseName()+" To verify Password cannot be empty error message should be displayed in current, new, confrim password");
		Errormessage1();
		clear();
	
	}
		

	private String imagePath;
	private Screen s;
	@Test(priority=11)
	public void CurrentPasswordEmpty() throws InterruptedException, IOException
	{
		test = extent.createTest(funTestCaseName()+" To verify Enter Valid New and Confrim password and Current password is empty");	
		password.newPassword.click();
		action.moveByOffset(-100,3).click().perform();
		driver.switchTo().activeElement().sendKeys("Manager");
		password.ShowPassword.click();
		password.confrimPassword.click();
		action.moveByOffset(-100,3).click().perform();
		driver.switchTo().activeElement().sendKeys("Manager");
		password.changePassword.click();
		Thread.sleep(1000);
		currentPasswordErrorMessage();
	}

	@Test(priority=12)
	public void NewPasswordEmpty() throws InterruptedException, IOException
	{
	
		test = extent.createTest(funTestCaseName()+" To verify Enter Valid Confrim password and Current password and  New pasword is empty");	
		clear();
		password.currentPassword.click();
		action.moveByOffset(-100,3).click().perform();
		driver.switchTo().activeElement().sendKeys("Manager");
		Thread.sleep(1000);
		password.confrimPassword.click();
		action.moveByOffset(-100,3).click().perform();
		driver.switchTo().activeElement().sendKeys("Manager");
		password.changePassword.click();
		demo.isdisplayed(password.newPasswordError, "New Password cannot be empty",test,driver);
		demo.Textcomparsion(password.newPasswordError, "New Password cannot be empty", test,driver);
		Thread.sleep(1000);
		
	}
	
	
	
	@Test(priority=13)
	public void ConfrimPasswordEmpty() throws InterruptedException, IOException
	{
		test = extent.createTest(funTestCaseName()+" To verify Enter Valid  Current password and  New pasword and Confrim password is empty");	
		clear();
		password.currentPassword.click();
		action.moveByOffset(-100,3).click().perform();
		driver.switchTo().activeElement().sendKeys("Manager");
		password.ShowPassword.click();
		Thread.sleep(1000);
		password.newPassword.click();
		action.moveByOffset(-100,3).click().perform();
		driver.switchTo().activeElement().sendKeys("Manager");
		password.ShowPassword.click();
		password.changePassword.click();
		action.moveByOffset(-100,3).click().perform();
		Thread.sleep(1000);
		confrimPasswordErrorMessage();
	}
	
	@Test(priority=14)
	public void currentpasswordButton() throws InterruptedException, IOException
	{
		test = extent.createTest(funTestCaseName()+" To verify Current password accepting Alphabhets");	
		clear();
		ValidRangedata(password.currentPassword,"ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		showpassword(password.ShowPassword);
		clear();
		Thread.sleep(1000);
		password.currentPassword.click();
		test = extent.createTest(funTestCaseName()+" To verify Current password accepting special charcters");	
		ValidRangedata(password.currentPassword,"(*((&*&*^&^&%^&%^_)_()");
		showpassword(password.ShowPassword);
		Thread.sleep(1000);
		clear();
		Thread.sleep(1000);
		password.currentPassword.click();
		test = extent.createTest(funTestCaseName()+" To verify Current password accepting Numbers");	
		ValidRangedata(password.currentPassword,"1234567890");
		showpassword(password.ShowPassword);
		Thread.sleep(1000);
		clear();
		Thread.sleep(1000);
		password.currentPassword.click();
		test = extent.createTest(funTestCaseName()+" To verify Current password Accepting valid data");	
		ValidRangedata(password.currentPassword,"m");
		clear();
	}
	
	@Test(priority=15)
	public void newPasswordButton() throws InterruptedException, IOException
	{
		test = extent.createTest(funTestCaseName()+" To verify New password accepting Alphabhets");	
		ValidRangedata(password.newPassword,"ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		newpasswordshow();
		Thread.sleep(1000);
		clear();
		password.currentPassword.click();
		test = extent.createTest(funTestCaseName()+" To verify New password accepting special charcters");	
		ValidRangedata(password.newPassword,"(*((&*&*^&^&%^&%^_)_()");
		newpasswordshow();
		Thread.sleep(1000);
		clear();
		password.currentPassword.click();
		test = extent.createTest(funTestCaseName()+" To verify New password accepting Numbers");	
		ValidRangedata(password.newPassword,"1234567890");
		newpasswordshow();
		Thread.sleep(1000);
		clear();
		password.currentPassword.click();
		test = extent.createTest(funTestCaseName()+" To verify New password Accepting valid data");	
		ValidRangedata(password.newPassword,"Manager");
		newpasswordshow();
		clear();
	}
	@Test(priority=16)
	
	public void ConfrimPasswordButton() throws InterruptedException, IOException
	{
		test = extent.createTest(funTestCaseName()+" To verify Confrim Password accepting Alphabhets");	
		ValidRangedata(password.confrimPassword,"ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		confrimpasswordshow(password.confrimPassword);
		Thread.sleep(1000);
		clear();
		test = extent.createTest(funTestCaseName()+" To verify Confrim Password accepting special charcters");
		ValidRangedata(password.confrimPassword,"(*((&*&*^&^&%^&%^_)_()");
		confrimpasswordshow(password.confrimPassword);
		Thread.sleep(1000);
		clear();
		test = extent.createTest(funTestCaseName()+" To verify Confrim Password accepting Numbers");	
		ValidRangedata(password.confrimPassword,"1234567890");
		confrimpasswordshow(password.confrimPassword);
		Thread.sleep(1000);
		clear();
		test = extent.createTest(funTestCaseName()+" To verify Confrim Password Accepting valid data");	
		ValidRangedata(password.confrimPassword,"Password");
		confrimpasswordshow(password.confrimPassword);
		password.currentPassword.click();
		clear();	
		
	}
	@Test(priority=17)
	public void Passwordmismatch() throws InterruptedException, IOException
	{
		test = extent.createTest(funTestCaseName()+" To verify Current password and new password is invalid error message is displayed");	
		password.currentPassword.click();
		action.moveByOffset(-100,3).click().perform();
		Thread.sleep(1000);
		driver.switchTo().activeElement().sendKeys("m");
		password.newPassword.click();
		action.moveByOffset(-100,3).click().perform();
		Thread.sleep(1000);
		driver.switchTo().activeElement().sendKeys("123456789");
		Thread.sleep(1000);
		password.confrimPassword.click();
		action.moveByOffset(-100,3).click().perform();
		Thread.sleep(1000);
		driver.switchTo().activeElement().sendKeys("Password");
		Thread.sleep(1000);
		password.changePassword.click();
		Thread.sleep(1000);
		Errormessage3(test);
		Thread.sleep(1000);
		clear();
	}
	
	@Test(priority=18)
	public void CurrentPasswordwrong() throws InterruptedException, IOException
	{
		test = extent.createTest(funTestCaseName()+" To verify Enter Valid New, Confrim password and invalid Current password");	
		clear();
		password.currentPassword.click();
		action.moveByOffset(-100,3).click().perform();
		driver.switchTo().activeElement().sendKeys("132422");
		password.newPassword.click();
		action.moveByOffset(-100,3).click().perform();
		driver.switchTo().activeElement().sendKeys("Password");
		password.confrimPassword.click();
		action.moveByOffset(-100,3).click().perform();
		driver.switchTo().activeElement().sendKeys("Password");
		Thread.sleep(2000);
		password.changePassword.click();
		Thread.sleep(2000);
		Errormessage4();
		clear();
	
	}
	@Test(priority=19)
	public void NewPasswordmin() throws InterruptedException, IOException
	{
		test = extent.createTest(funTestCaseName()+" To verify New password and Current password is 1 error message is displayed");
		password.currentPassword.click();
		action.moveByOffset(-100,3).click().perform();
		driver.switchTo().activeElement().sendKeys("m");
		password.newPassword.click();
		action.moveByOffset(-100,3).click().perform();
		driver.switchTo().activeElement().sendKeys("P");
		password.confrimPassword.click();
		action.moveByOffset(-100,3).click().perform();
		driver.switchTo().activeElement().sendKeys("P");
		Thread.sleep(2000);
		password.changePassword.click();
		minlengthErrorMessage();
		clear();
		test = extent.createTest(funTestCaseName()+" To verify New password and Current password is 5 error message is displayed");
		password.currentPassword.click();
		action.moveByOffset(-100,3).click().perform();
		driver.switchTo().activeElement().sendKeys("manag");
		password.newPassword.click();
		action.moveByOffset(-100,3).click().perform();
		driver.switchTo().activeElement().sendKeys("manag");
		password.confrimPassword.click();
		action.moveByOffset(-100,3).click().perform();
		driver.switchTo().activeElement().sendKeys("manag");
		Thread.sleep(2000);
		password.changePassword.click();
		minlengthErrorMessage();
		clear();
	
	}
	@Test(priority=20)
	public void NewPasswordmax() throws InterruptedException, IOException
	{
		
		password.currentPassword.click();
		driver.switchTo().activeElement().sendKeys("Manager");
		test = extent.createTest(funTestCaseName()+" To verify New password is not accepting more than 16 charcters");
	
		password.newPassword.click();
		action.moveByOffset(-100,3).click().perform();
		driver.switchTo().activeElement().sendKeys("New password 1234567890");
		maxlength(password.newPassword,"New password 1234567890",test);
	
		test = extent.createTest(funTestCaseName()+" To verify Confrim password is not accepting more than 16 charcters");
		password.confrimPassword.click();
		action.moveByOffset(-100,3).click().perform();
		driver.switchTo().activeElement().sendKeys("Confrim password 1234567890");
		maxlength(password.newPassword,"Confrim password 1234567890",test);
		
		Thread.sleep(2000);
		password.changePassword.click();
		test = extent.createTest(funTestCaseName()+" To verify click on clear button all the text enetred is empty");
		clear();
		demo.isempty(password.currentPassword,"currentPassword",test, driver);
		demo.isempty(password.newPassword,"newPassword",test, driver);
		demo.isempty(password.confrimPassword,"confrimPassword",test, driver);
		test = extent.createTest(funTestCaseName()+" To verify click on clear, it is disabled");
		demo.BydefaultisEnabled(password.clear,"CLEAR",test,driver);
	}
	
	@Test(priority=21)
	public void NewPasswordValid() throws InterruptedException, IOException
	{
		test = extent.createTest(funTestCaseName()+" To verify if enetred all the details are valid");
		clear();
		password.currentPassword.click();
		action.moveByOffset(-100,3).click().perform();
		driver.switchTo().activeElement().sendKeys("p");
		password.newPassword.click();
		action.moveByOffset(-100,3).click().perform();
		driver.switchTo().activeElement().sendKeys("Manager");
		password.confrimPassword.click();
		action.moveByOffset(-100,3).click().perform();
		driver.switchTo().activeElement().sendKeys("Manager");
		password.changePassword.click();
		Thread.sleep(2000);
		Sitesave1("Password Change","Password Changed for account.","Password Change","Password Changed for account.", 1, driver,test);
		Thread.sleep(1000);
	}
	@Test(priority=22)
	public void Launchlogin() throws IOException, InterruptedException
	{
		    test = extent.createTest(funTestCaseName()+" Signout and Login with Chnaged credtionals");
		    Signout(test);
		    Thread.sleep(2000);
		    password.Userbx.click();
			String usertest="m";
			String pswdtest="Manager";
			driver.switchTo().activeElement().sendKeys(usertest);
			Thread.sleep(1000);
			password.Pswdbox.click();
			driver.switchTo().activeElement().sendKeys(pswdtest);
			Thread.sleep(1000);
			password.SigninButton.click();
			demo.isdisplayed(password.PateintListscreen, "PateintListscreen", test,driver);
	}

	public void Signout(ExtentTest test) throws InterruptedException, IOException
	{
		password.Signout.click();
		Thread.sleep(1000);
		Sitesave1("Sign Out","Do you want to Sign out?","Sign out","Do you want to Sign out?", 1, driver,test);	
		Thread.sleep(1000);
	}

	public void showpassword(WebElement element) throws InterruptedException
	{
		Actions action=new Actions(driver);
		action.clickAndHold(password.ShowPassword).perform();
        Thread.sleep(2000);
        action.release(password.ShowPassword).perform();
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
	
	public void confrimpasswordshow(WebElement elementText) throws InterruptedException, IOException
	{
		//Match match;
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
            Match match = new Match();
			match.type("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
			match.click();
			try {
			elementText.getText();
		    System.out.println(elementText.getText());
			//demo.isdisplayed(elementText, "ABCDEFGHIJKLMNOPQRSTUVWXYZ", test, driver);
			}
			catch(Exception e)
			{
				test.error(e);
			}
			finally {
	        action.release(element).perform();
			}
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
		password.clear.click();
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
		demo.Textcomparsion(element,Text, test,driver);
	}
	public void Errormessage1() throws InterruptedException, IOException
	{
		demo.Textcomparsion(password.currentPasswordErrorMessage, "Current Password cannot be empty", test,driver);
		Thread.sleep(2000);
		
	    demo.isdisplayed(password.newPasswordErrorMessage, "New Password cannot be empty", test, driver);
		demo.Textcomparsion(password.newPasswordErrorMessage, "New Password cannot be empty", test,driver);
		Thread.sleep(2000);
		
	    demo.isdisplayed(password.confrimPasswordErrorMessage, "Confirm Password cannot be empty", test, driver);
	    demo.Textcomparsion(password.confrimPasswordErrorMessage, "Confirm Password cannot be empty", test,driver);
	    Thread.sleep(2000);
	} 
	
	
	public void Errormessage3(ExtentTest test) throws InterruptedException, IOException
	{
		 String ExceptedText="Passwords Do not Match";
		 String displayedText =password.MismatchMessage.getText();
		 demo.ByValidErrormessage(password.MismatchMessage, "Passwords Do not Match",test,driver);
		 demo.Textcomparsion(password.MismatchMessage, "Passwords Do not Match", test,driver);
	}
	public void Errormessage4() throws InterruptedException, IOException
	{
		 String ExceptedText="Current Password is invalid";
		// demo.ByValidErrormessage(currentPasswordErrorMessage, ExceptedText,test,driver);
		 demo.Textcomparsion(password.currentPasswordError, ExceptedText, test,driver);
	}

	public void currentPasswordErrorMessage() throws InterruptedException, IOException
	{
		 demo.isdisplayed(password.currentPasswordErrorMessage, "Current Password cannot be empty",test,driver);
		 demo.Textcomparsion(password.currentPasswordErrorMessage, "Current Password cannot be empty", test,driver);
	}
	
	
	public void confrimPasswordErrorMessage() throws InterruptedException, IOException
	{
		demo.isdisplayed(password.confrimPasswordErrorMessage, "Confirm Password cannot be empty",test,driver);
		demo.Textcomparsion(password.confrimPasswordErrorMessage, "Confirm Password cannot be empty", test,driver);
	}
	
	WebElement minlengthErrorMessage;
	public void minlengthErrorMessage() throws InterruptedException, IOException
	{
		demo.isdisplayed(password.minlengthErrorMessage, "Min length is 6",test,driver);
		demo.Textcomparsion(password.minlengthErrorMessage, "Min length is 6", test,driver);
	}

	
	public void catchexceptionscreenshot(ExtentTest test,Exception e) throws IOException
	{
		test.error("An error occurred: " + e.getMessage());
        String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        String screenshotName = "D:\\Krystalnew\\error_screenshot_" + timestamp + ".png";
        captureScreenshot(screenshotName);
        test.addScreenCaptureFromPath(screenshotName);
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
	
	
	

	
	
 
}
