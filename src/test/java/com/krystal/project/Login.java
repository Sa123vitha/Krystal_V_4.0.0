package com.krystal.project;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.windows.WindowsDriver;

public class Login extends ReferencefileChemotheraphy {
	
	DemographicsExternal demo;
	LoginPOM login;
	SoftAssert softAssert = new SoftAssert();
	@BeforeSuite
	public void setUp() {
		extent = ExtendManager.getInstance();
	}
	
	@Test(priority =0)
	public void Launch()  throws InterruptedException, IOException {
	//	DesiredCapabilities appCapabilities = new DesiredCapabilities();
	//	appCapabilities.setCapability("app", "C:\\Program Files\\Panacea Medical Technologies\\Krystal\\Krystal.exe");
	//	driver = new WindowsDriver<WebElement>(new URL("http://127.0.0.1:4723"), appCapabilities);
		login= new LoginPOM(driver);
		demo=new DemographicsExternal() ;
	}
	
	@Test(priority =1)
	public void ToverifySigninproductlogo() throws IOException {
		test = extent.createTest("============SIGNIN MODULE========");
	test = extent.createTest(guiTestCaseName()+" To Verify Signin Product logo"," Signin Product logo should be present");		
	demo.isdisplayed(login.SigninProductlogo, "SigninProductlogo", test,driver);
	}
	
	@Test(priority =2)
	public void ToverifySigninproductImage() throws IOException, InterruptedException 
	{
		test = extent.createTest(guiTestCaseName()+" To Verify  Signin Product Image"," Signin Product Image should be present");	
		demo.isdisplayed(login.SigninProductImage, "SigninProductImage", test,driver);
		Thread.sleep(1000);
	}
	@Test(priority =3)
	public void ToverifyProductnamelabel() throws IOException, InterruptedException 
	{
		test = extent.createTest(guiTestCaseName()+" To Verify  Product name label"," Product name should be present");	
		demo.Textcomparsion(login.Productname, "Product Name :", test,driver);
		Thread.sleep(2000);
	}
	@Test(priority =6)
	public void ToverifyOfflineRnVlabel() throws IOException 
	{
		test = extent.createTest(guiTestCaseName()+" To Verify Offline Record & Verification label","Offline Record & Verification label should be present");	
		demo.Textcomparsion(login.OfflineRnV, "Offline Record & Verification", test,driver);
	}
	@Test(priority =7)
	public void ToverifySigninlabel() throws IOException 
	{
		test = extent.createTest(guiTestCaseName()+" To Verify Signin  label","Signin  label should be present");	
        //demo.Textcomparsion(login.Signinlabel, "SIGN IN", test,driver);
        demo.Textcomparsion(login.Signinlabel, "SIGN IN BUTTON", test,driver);
	}
	@Test(priority =8)
	public void ToverifyUserNamelabel() throws IOException 
	{
		test = extent.createTest(guiTestCaseName()+" To Verify User ID label","User ID label should be present");	
		demo.Textcomparsion(login.UserID, "User ID_Txt", test,driver);
		
	}
	@Test(priority =9)
	public void ToverifyPasswordlabel() throws IOException 
	{
		test = extent.createTest(guiTestCaseName()+" To Verify Password label","Password label should be present");	
		demo.Textcomparsion(login.Password, "Password", test,driver);
	}
	@Test(priority =10)
	public void ToverifySigninButtonlabel() throws IOException 
	{
		test = extent.createTest(guiTestCaseName()+" To Verify Signin Button","Signin Button label should be present");
		demo.Textcomparsion(login.SigninButton, "SIGN IN", test,driver);
	}
	
	@Test(priority =11)
	public void ToverifyClearButtonlabel() throws IOException 
	{
		test = extent.createTest(guiTestCaseName()+" To Verify Clear Button label","Clear Button label should be present");	
		demo.Textcomparsion(login.ClearButton, "CLEAR", test,driver);
	}
	@Test(priority =12)
	public void ToverifyNoticelabel() throws IOException 
	{
		test = extent.createTest(guiTestCaseName()+" To Verify Disclaimer Notice : label","Disclaimer Notice : label should be present");	
		demo.Textcomparsion(login.Notice, "Disclaimer Notice :", test,driver);
	}
	@Test(priority =13)
	public void ToverifyNoticeDescriptionlabel() throws IOException 
	{
		test = extent.createTest(guiTestCaseName()+" To Verify Notice Description label","Notice Description should be present");	
		demo.Textcomparsion(login.NoticeDescription, "This software is protected by copyright law and international treaties. Unauthorized duplication or distribution of this software or any other portion of it may result in severe civil and criminal penalties and will be prosecuted to the maximum extent possible under the law.", test,driver);
	}
	@Test(priority =14)
	public void ToverifyLicensedlabel() throws IOException 
	{
		test = extent.createTest(guiTestCaseName()+" To Verify Licensed To : label","Licensed To : label should be present");	
		demo.Textcomparsion(login.Licensed, "Licensed To :", test,driver);
	}
	
	@Test(priority =15)
	public void ToverifyHospitallabel() throws IOException 
	{
		test = extent.createTest(guiTestCaseName()+" To Verify Hospital Name  label","Hospital Name label should be present");	
		demo.Textcomparsion(login.Hospital, "Hospital_Name", test,driver);
	}
	@Test(priority =16)
	public void ToverifyHelplabel() throws IOException 
	{
		test = extent.createTest(guiTestCaseName()+" To Verify Help label","Help label should be present");	
		demo.Textcomparsion(login.Help, "HELP", test,driver);
	}
	@Test(priority =17)
	public void ToverifyExitlabel() throws IOException 
	{
		test = extent.createTest(guiTestCaseName()+" To Verify Exit label","Exit label should be present");	
		demo.Textcomparsion(login.Exit, "EXIT", test,driver);
	}
	
	@Test(priority =18)
	public void ToverifySoftwareVersionlabel() throws IOException, InterruptedException 
	{
		test = extent.createTest(guiTestCaseName()+" To Verify Software Version label","Software Version label should be present");	
		demo.Textcomparsion(login.SoftwareVersion, "Software Version :", test,driver);
		Thread.sleep(2000);
	}
	@Test(priority =19)
	public void ToverifyVesrionNumberlabel() throws IOException 
	{
		test = extent.createTest(guiTestCaseName()+" To Verify 4.0.0 A7 label","4.0.0 A7 label should be present");	
		demo.Textcomparsion(login.VersionNumber, "4.0.0 A7", test,driver);
	}
	@Test(priority =20)
	public void ToverifyCopyrightlabel() throws IOException 
	{   test = extent.createTest(guiTestCaseName()+" To Verify Copyright © Panacea Medical Technologies 2023 label"," Copyright © Panacea Medical Technologies 2023 label should be present");
		demo.Textcomparsion(login.Copyright, "Copyright © Panacea Medical Technologies 2023", test,driver);
	}
	@Test(priority =21)
	public void Helpclick() throws InterruptedException
	{
		login.Helpfun.click();
		Thread.sleep(2000);
	}
	@Test(priority =22)
	public void HelpContact() throws InterruptedException, IOException
	{
		test = extent.createTest(guiTestCaseName()+" To Verify Contact Panacea Medical Technologies label"," Contact Panacea Medical Technologies label should be present");	
		demo.Textcomparsion(login.HelpContact, "Contact Panacea Medical Technologies", test,driver);
	}
	@Test(priority =23)
	public void HelpRegional () throws InterruptedException, IOException
	{
		test = extent.createTest(guiTestCaseName()+" To Verify Regional Service Engineer label","Regional Service Engineer label should be present");	
		demo.Textcomparsion(login.HelpRegional, "Regional Service Engineer", test,driver);
		Thread.sleep(2000);
	}
	@Test(priority =24)
	public void HelpService () throws InterruptedException, IOException
	{
		test = extent.createTest(guiTestCaseName()+" To Verify Service Engineer : label","Service Engineer : label should be present");	
	   demo.Textcomparsion(login.HelpService, "Service Engineer : ", test,driver);
	   Thread.sleep(2000);
	}
	@Test(priority =25)
	public void HelpSCN () throws InterruptedException, IOException
	{
		test = extent.createTest(guiTestCaseName()+" To Verify Contact Number label","Contact Number  label should be present");	
		demo.Textcomparsion(login.HelpSCN, "Contact Number : ", test,driver);
	}
	@Test(priority =26)
	public void HelpEmail () throws InterruptedException, IOException
	{
		test = extent.createTest(guiTestCaseName()+" To Verify E-mail ID  label","E-mail ID  label should be present");	
		demo.Textcomparsion(login.HelpEmail, "E-mail ID :", test,driver);
	}
	@Test(priority =27)
	public void HelpHeadoffice () throws InterruptedException, IOException
	{
		test = extent.createTest(guiTestCaseName()+" To Verify Head Office label","Head Office  label should be present");	
		demo.Textcomparsion(login.HelpHeadoffice, "Head Office", test,driver);
		Thread.sleep(2000);
	}
	@Test(priority =28)
	public void HelpRCN () throws InterruptedException, IOException
	{
		test = extent.createTest(guiTestCaseName()+" To Verify Contact Number label","Contact Number label should be present");	
		demo.Textcomparsion(login.HelpRCN, "Contact Number : ", test,driver);
	}
	@Test(priority =29)
	public void HelpEmailID () throws InterruptedException, IOException
	{
		test = extent.createTest(guiTestCaseName()+" To Verify E-mail ID label","E-mail ID  label should be present");	
		demo.Textcomparsion(login.HelpEmailID, "E-mail ID :", test,driver);
	}
	@Test(priority =30)
	public void HelpClose () throws InterruptedException, IOException
	{
		test = extent.createTest(guiTestCaseName()+" To Verify Close label","Close  label should be present");	
		demo.isdisplayed(login.HelpClose, "SigninButton", test,driver);
	}
	
	
	
	 @Test(priority =31)
	public void Helpbutton() throws FileNotFoundException,InterruptedException, IOException
	{
		     test = extent.createTest(funTestCaseName()+" To verify the functionality of Help window data");
		     login.Helpfun.click();
		     ArrayList<String> myTest = new ArrayList<String>();
		     Thread.sleep(1000);
		     
		     String Ser=login.actualServiceEnginer.getText();
		     myTest.add(Ser);
		     Thread.sleep(1000);
		     
		     String Ser1=login.actualPhoneNumber.getText();
		     myTest.add(Ser1);
		     Thread.sleep(1000);
		     
		     String Ser2=login.actualEmailid.getText();
		     myTest.add(Ser2);
		     Thread.sleep(1000);
		     
	         String Ser3=login.actualRegionalService.getText();
		     myTest.add(Ser3);
		     Thread.sleep(1000);
		     
	         String Ser4=login.actualRegionEmailid.getText();
		     myTest.add(Ser4);
			String filePath = "D:\\Krystal\\Help\\Contact Details\\ContactDetails.txt";
			
			
			ArrayList<String> myList = new ArrayList<String>();
			try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
		    String line;  
	        for (int i = 0; i <myTest.size(); i++) {
	            line = reader.readLine();
	            myList.add(line);
	            softAssert.assertEquals(myTest.get(i),myList.get(i));
	            
	            if(myTest.get(i).equals(myList.get(i)))
	            		{
	            	test.pass("RUN PASS: Actual is " +myTest.get(i)+ " Excepted is " +myList.get(i)+ " Same as Excepeted");
	            		}
	            else
	            {
	            	test.fail("RUN FAIL: Actual is " +myTest.get(i)+ " Excepted is " +myList.get(i)+ " Not Same as Excepeted");
	            }
	           
	            softAssert.assertAll();
	            }
		
		}
	}
	
	@Test(priority =32)
	public void close() throws IOException
	{
		test = extent.createTest(funTestCaseName()+" To verify Click on close button helpwindow is closed");
		login.HelpClose.click();
		demo.isdisplayed(login.SigninProductImage, "SigninProductImage", test,driver);
	}
	
	@Test(priority =33)
	public void defaultbuttonenable() throws IOException 
	{
		test = extent.createTest(guiTestCaseName()+" To Verify the Functionality of Signin button enabled"," Signin button should be enabled");
		demo.isEnabled(login.SigninButton, "SigninButton", test,driver);
		test = extent.createTest(guiTestCaseName()+" To Verify the Functionality of Clear button enabled"," Clear button should be enabled");
		demo.isEnabled(login.ClearButton, "ClearButton", test,driver);
		test = extent.createTest(guiTestCaseName()+" To Verify the Functionality of Help button enabled"," Help button should be enabled");
		demo.isEnabled(login.Help, "Help", test,driver);
		test = extent.createTest(guiTestCaseName()+" To Verify the Functionality of Exit button enabled"," Exit button should be enabled");
		demo.isEnabled(login.Exit, "Exit", test,driver);
	}
	@Test(priority =34)
	public void Signinempty() throws IOException, InterruptedException 
	{
		test = extent.createTest(funTestCaseName()+" To verify click on Signin Empty error message is displaying");
		Signinclick();
		Emptyerrormessage();
	}
	WebElement Pswdbox;
	@Test(priority =35)
	public void Useridempty() throws IOException, InterruptedException 
	{
		test = extent.createTest(funTestCaseName()+" To verify Password empty error message is displaying");
		login.Pswdbox.click();
		driver.switchTo().activeElement().sendKeys("123456");
		Signinclick();
		Emptyerrormessage();
		Buttonclear();
	}
	@Test(priority =36)
	public void Passwordempty() throws IOException, InterruptedException 
	{
		test = extent.createTest(funTestCaseName()+" To verify Userid empty error message is displaying");
		login.UserID.click();
		driver.switchTo().activeElement().sendKeys("User123");
		Signinclick();
		Emptyerrormessage();
		Buttonclear();
	}
	WebElement Userbx;
	@Test(priority =37)
	public void ValidUserId() throws IOException, InterruptedException 
	{
		test = extent.createTest(funTestCaseName()+" To verify Enetred Valid userid and invalid Password error message is displayed");
		login.Userbx.click();
		driver.switchTo().activeElement().sendKeys("m");
		Thread.sleep(1000);
		login.Pswdbox.click();
		driver.switchTo().activeElement().sendKeys("123456");
		Thread.sleep(1000);
		Signinclick();
		Invalidmessage();
		Thread.sleep(1000);
		Buttonclear();
		
	}
	@Test(priority =38)
	public void ValidPassword() throws IOException, InterruptedException 
	{
		test = extent.createTest(funTestCaseName()+" To verify Enetred Valid userid and invalid Password error message is displayed");
		login.Userbx.click();
		driver.switchTo().activeElement().sendKeys("1234567");
		Thread.sleep(1000);
		login.Pswdbox.click();
		driver.switchTo().activeElement().sendKeys("p");
		Thread.sleep(1000);
		Signinclick();
		Thread.sleep(1000);
		Invalidmessage();
		Buttonclear();
		
	}
	@Test(priority =39)
	public void InvalidUserPassword() throws IOException, InterruptedException 
	{
		test = extent.createTest(funTestCaseName()+" To verify Enetred Valid userid and invalid Password error message is displaying");
		login.Userbx.click();
		driver.switchTo().activeElement().sendKeys("m");
		Thread.sleep(1000);
		login.Pswdbox.click();
		driver.switchTo().activeElement().sendKeys("123456");
		Thread.sleep(1000);
		Signinclick();
		Thread.sleep(1000);
		Invalidmessage();
		test = extent.createTest(funTestCaseName()+" To verify Click on the clear Userid and Password is empty");
		Buttonclear();
		demo.isempty(login.Userbx, "UserID", test,driver);
		demo.isempty(login.Pswdbox, "Password", test,driver);
	}
	
	@Test(priority =40)
	public void InvalidBothUserIdandPassword() throws IOException, InterruptedException 
	{
		test = extent.createTest(funTestCaseName()+" To verify Enetred Invalid userid and invalid Password error message is displaying");
		login.Userbx.click();
		driver.switchTo().activeElement().sendKeys("mNAGET76346");
		Thread.sleep(1000);
		login.Pswdbox.click();
		driver.switchTo().activeElement().sendKeys("12345CBJHC6");
		Thread.sleep(1000);
		Signinclick();
		Thread.sleep(1000);
		Invalidmessage();
		test = extent.createTest(funTestCaseName()+" To verify Click on the clear Userid and Password is empty");
		Buttonclear();
		demo.isempty(login.Userbx, "UserID", test,driver);
		demo.isempty(login.Pswdbox, "Password", test,driver);
	}
	
	@Test(priority =41)
	public void Eyeiconshow() throws IOException, InterruptedException, FindFailed
	{
		test = extent.createTest(funTestCaseName()+" To verify the click on the Eyeicon password is visible or not");
		login.Userbx.click();
		driver.switchTo().activeElement().sendKeys("manager");
		Thread.sleep(1000);
		login.Pswdbox.click();
		driver.switchTo().activeElement().sendKeys("12345&^%%%^$^%$");
		demo.isdisplayed(login.Pswdbox, "12345&^%%%^$^%$", test, driver);
		Actions action=new Actions(driver);
		action.clickAndHold(login.Eyeicon).perform();
		Thread.sleep(3000);
		action.release().perform();
		Thread.sleep(1000);
		Buttonclear();
	}

	public void ValidUserPassword() throws IOException, InterruptedException 
	{
		test = extent.createTest(funTestCaseName()+" To verify Enetred Valid userid and Password signin page is displayed");
		login.Userbx.click();
		String usertest="m";
		String pswdtest="p";
		driver.switchTo().activeElement().sendKeys(usertest);
		Thread.sleep(1000);
		login.Pswdbox.click();
		driver.switchTo().activeElement().sendKeys(pswdtest);
		Thread.sleep(1000);
		Signinclick();
		Patientlistscreen();
	}
	
	@Test(priority =43)
	public void  SignoutLogin() throws IOException, InterruptedException 
	{
		ValidUserPassword();
		test = extent.createTest(funTestCaseName()+" To verify After sign-in again log-out the textfield is clear or not");
		login.Signout.click();
		Thread.sleep(1000);
		Sitesave1("Sign Out","Do you want to Sign out?","Sign out","Do you want to Sign out?", 1, driver,test);	
		Thread.sleep(1000);
		login.Userbx.click();
		demo.isempty(login.Userbx, "UserIDtextbox", test, driver);
		login.Pswdbox.click();
		demo.isempty(login.Pswdbox, "Passwordtextbox", test, driver);
	}
	//@Test(priority =44)
	public void  Exitapplication() throws IOException, InterruptedException 
	{
		test = extent.createTest(funTestCaseName()+" To verify exit the application and Relogin Error should not display");
		Actions action=new Actions(driver);
		action.moveToElement(login.Exit).doubleClick().perform();
		Thread.sleep(5000);
		setUp1();
	}
	public void Signinclick() throws InterruptedException
	{
		login.SigninButton.click();
		Thread.sleep(1000);
	}
	public void Emptyerrormessage() throws InterruptedException, IOException
	{
		 String ExceptedText="User ID or Password cannot be empty.";
		 demo.isdisplayed(login.Errormessage, ExceptedText, test,driver);
		 demo.Textcomparsion(login.Errormessage, ExceptedText, test,driver);
	}
	public void Invalidmessage() throws InterruptedException, IOException
	{
		String ActualUPError = "Invalid Credentials";
		demo.isdisplayed(login.UPError, ActualUPError, test,driver);
		demo.Textcomparsion(login.UPError, ActualUPError, test,driver);
	}
	public void Buttonclear() throws InterruptedException 
	{
		login.ClearButton.click();
		Thread.sleep(1000);
	}
	
	public void Patientlistscreen() throws InterruptedException, IOException 
	{
		
		demo.isdisplayed(login.PateintListscreen, "PateintListscreen", test,driver);
	
	}
	



}
