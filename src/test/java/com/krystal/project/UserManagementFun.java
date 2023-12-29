package com.krystal.project;


import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.sikuli.script.FindFailed;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import io.appium.java_client.windows.WindowsDriver;
public class UserManagementFun extends ReferencefileChemotheraphy{
 
	private UserManagementPOM user;
	private Actions act;
	private String m;
	private WebElement User;
	ReferenceSigin Sign;
	private Actions action;

	@Test(priority =1)
	public void Launch()  throws InterruptedException, IOException {
	//DesiredCapabilities appCapabilities = new DesiredCapabilities();
	//appCapabilities.setCapability("app", "C:\\Program Files\\Panacea Medical Technologies\\Krystal\\Krystal.exe");
	//driver = new WindowsDriver<WebElement>(new URL("http://127.0.0.1:4723"), appCapabilities);
	Sign=new ReferenceSigin();
	Sign.Login(driver);
	Sign.UserManagement(driver);
	user=new UserManagementPOM(driver);
	action=new Actions(driver);
	act=new Actions(driver);
	}

	@Test(priority = 1)
	public void UserEmptyTextbox() throws InterruptedException, IOException, ClassNotFoundException, SQLException {
		test = extent.createTest("!!!!!!!!!!USER MANAGEMENT MODULE!!!!!!!!!!");
		
		test = extent.createTest(funTestCaseName() +" Check default Textbox is Empty");	
		 demo.isempty(user.User_ID, "User_ID", test,driver);
		 demo.isempty(user.FName, "First Name", test,driver);
		 demo.isempty(user.MName, "Middle Name", test,driver);
			demo.isempty(user.LName, "Last Name", test,driver);
			demo.isempty(user.Password, "Password", test,driver);
			demo.isempty(user.Confirmpassword, "Confirm password", test,driver);
			demo.isemptynoclick(user.Role, "Role", test,driver);
			demo.isemptynoclick(user.Designation, "Designation", test,driver);   // APR should be added
			demo.BydefaultisSelected(user.Active,"Active", test,driver);
			demo.BydefaultisSelected(user.Inactive,"Inactive", test, driver);
	}
	@Test(priority = 2)
	public void Savebuttonenabled() throws IOException
	{
		test = extent.createTest(funTestCaseName() +" To Verify Save Button Enbaled by default");
		demo.isEnabled(user.Save, "SAVE", test, driver);
	}
	
	@Test(priority = 3)// Not able to find the elements 
	public void Emptydatamessage() throws IOException, InterruptedException
	{
		test = extent.createTest(funTestCaseName() +" To Verify Empty data click on Save button, Error Messages get displayed");
		try{
			user.Save.click();
			Thread.sleep(3000);
			demo.isdisplayed(user.InputBlank, "Input cannot be blank", test, driver);
			demo.Textcomparsion(user.InputBlank, "Input cannot be blank", test, driver);
			
			demo.isdisplayed(user.SelectAnyRole, "Select Any Role", test, driver);
			demo.Textcomparsion(user.SelectAnyRole, "Select Any Role", test, driver);
			
			demo.isdisplayed(user.SelectAnyDesignation, "Select Any Designation", test, driver);
			demo.Textcomparsion(user.SelectAnyDesignation, "Select Any Designation", test, driver);
			
			demo.isdisplayed(user.SelectAnyAprId, "Select Any APR ID", test, driver);
			demo.Textcomparsion(user.SelectAnyAprId, "Select Any APR ID", test, driver);
			
			demo.isdisplayed(user.SelectAnyAprCBCTId, "Select Any APR CBCT ID", test, driver);
			demo.Textcomparsion(user.SelectAnyAprCBCTId, "Select Any APR CBCT ID", test, driver);
			
			demo.isdisplayed(user.SelectAnyStatus, "Select Any Status", test, driver);
			demo.Textcomparsion(user.SelectAnyStatus, "Select Any Status", test, driver);
		}
		catch(Exception e)
		{
			 catchexceptionscreenshot(test,e);
		}
		
	}

	@Test(priority = 4)
	public void UserIdDisplayedandEnabled() throws IOException {
		test = extent.createTest("========USERID VALID==========");
		test = extent.createTest(funTestCaseName() +" To Verify User ID text field is displayed and Enabled ",  " User ID text field should display and Enable");   
		demo.isdisplayed(user.User_ID, "User_ID", test,driver);
		demo.isEnabled(user.User_ID, "User_ID", test,driver);
	}
	
	@Test(priority = 5)
	public void UserIDValidcharacters() throws IOException {

		test = extent.createTest(funTestCaseName() +" To Verify User ID text field characters Enter alphanumeric and special characters",  " Alphanumeric and special characters should allow to enter");
		user.User_ID.sendKeys("Qwe12#r");
		user.Save.click();
		demo.Textcomparsion(user.User_ID, "Qwe12#r", test,driver);
		user.User_ID.clear();
	
	}
	
	@Test(priority = 6)
	public void UserIDValidenteredonlyNumbers() throws IOException {
		test = extent.createTest(funTestCaseName() +" To Verify User ID text field if Entered only numbers ",  " User ID text field should Accept numbers(59874665)");   
		user.User_ID.sendKeys("598746655");
		user.Save.click();
		demo.Textcomparsion(user.User_ID, "598746655", test,driver);
		user.User_ID.clear();
			
	}
	
	@Test(priority = 7)
	public void UserIDValidNAlphabets() throws IOException {
		test = extent.createTest(funTestCaseName() +" To Verify User ID text field if Entered only Alphabhets ",  " User ID text field should Accept alphabets (abcderfg)");   
		user.User_ID.sendKeys("abcderfg");
		user.Save.click();
		demo.Textcomparsion(user.User_ID, "abcderfg", test,driver);
		user.User_ID.clear();	
	}
	
	@Test(priority = 8)
	public void UserIDValidalphabetsuppercase() throws IOException {
		test = extent.createTest(funTestCaseName() +" To verify functionality of User ID text field if Entered only alphabets in uppercase ",  " User ID text field should Accept alphabets in uppercase (HDFJKFDJSDFG)");   
		user.User_ID.sendKeys("HDFJKFDJSDFG");
		user.Save.click();
		demo.Textcomparsion(user.User_ID, "HDFJKFDJSDFG", test,driver);
		user.User_ID.clear();	
	}
	
	@Test(priority = 9)
	public void UserIDValidMaxrange() throws IOException {
		test = extent.createTest(funTestCaseName() +"   To verify functionality of User ID text field if Entered text is more than max range ",  " User ID text field should not Accept text after 16 characters (12345678901234567)");   
		String expected="123454678901234567";
		user.User_ID.sendKeys("123454678901234567");
		user.Save.click();
		demo.Textcomparsion(user.User_ID, expected.substring(0, 16), test,driver);
		user.User_ID.clear();	
	}

	
	@Test(priority = 10)
	public void UserIDInvalidwhitespace() throws IOException {
		test = extent.createTest("========USERID INVALID==========");
		test = extent.createTest(funTestCaseName() +" To Verify User ID text field  with white space",  "  White Space not allowed warning message should display ");
		user.User_ID.sendKeys("  ");
		user.Save.click();
		if(user.User_ID.getText().equals("  ")) 
		demo.Textcomparsion(user.warnmsg.get(0), "Input cannot be blank", test,driver);
		user.User_ID.clear();	
	}
	
	
	
	@Test(priority = 11)
	public void UserIDInvalidwhitespaceandcharacters() throws IOException {
		test = extent.createTest(funTestCaseName() +" To Verify User ID text field  with white space and characters","  White Space not allowed warning message should display ").createNode("tree", "one");
		
		user.User_ID.clear();
		user.User_ID.sendKeys("    tt");
		user.Save.click();
		if(user.User_ID.getText().equals("    tt")) {
			demo.Textcomparsion(user.warnmsg.get(0), "White Space not allowed", test,driver);
		}
		user.User_ID.clear();	
	}
	@Test(priority = 12)
	public void UserIDInvalidlessthanMinlength() throws IOException {
		test = extent.createTest(funTestCaseName() +" To Verify User ID text field if entered text is less than min range ",  "Input Character Min 6 warning message should display");
		user.User_ID.clear();
		user.User_ID.sendKeys("Qwe");
		user.Save.click();
		if(user.User_ID.getText().equals("Qwe"))
		demo.Textcomparsion(user.warnmsg.get(0), "Input Character Min 6", test,driver);
		user.User_ID.clear();
	}
	


	@Test(priority = 13)
	public void ValidFirstnameAlphabhets() throws InterruptedException, IOException {
		test = extent.createTest("===========VALID FIRSTNAME=========");
		test = extent.createTest(funTestCaseName() +" To Verify Firstname textfield accepting alphabhets ",  " firstname textfield should accept alphabhets and display");   
		user.FName.sendKeys("ASDFFGHHJKJLK");
		user.Save.click();
		demo.Textcomparsion(user.FName, "ASDFFGHHJKJLK", test,driver);
		user.FName.clear();
		
	}
	@Test(priority = 14)
	public void ValidFirstnamealphanumerics() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+" To Verify Firstname textfield by entering Alphanumarics ",  " firstname textfield should accept text (ss5644gdfg548dfg326)");   
		user.FName.sendKeys("ss5644gdfg548dfg326");
		user.Save.click();
		demo.Textcomparsion(user.FName,"ss5644gdfg548dfg326", test,driver);
		user.FName.clear();
	}
	
	
	@Test(priority = 15)
	public void ValidFirstnameSpecialCharacters() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+" To Verify Firstname textfield by entering SpecialCharacters ",  " firstname textfield should accept text (!@#$%$^&*()_+{}[];:?.,/*|)");   
		user.FName.sendKeys("!@#$%$^&*()_+{}[];:?.,/*|");
		user.Save.click();
		demo.Textcomparsion(user.FName,"!@#$%$^&*()_+{}[];:?.,/*|", test,driver);
		user.FName.clear();
	}
	
	@Test(priority = 16)
	public void ValidFirstnameacceptingMinrange() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName() +" To Verify Firstname textfield accepting Min Range(3) ",  " firstname textfield should accept Minimum range text");   
		user.FName.sendKeys("ASD");
		user.Save.click();
		demo.Textcomparsion(user.FName, "ASD", test,driver);
		user.FName.clear();
	}
	
	@Test(priority = 17)
	public void ValidFirstnameacceptingMaxrange() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName() +" To Verify Firstname textfield accepting Max Range(40 char) ",  " firstname textfield should accept Maximum range text");   
		user.FName.sendKeys("Aqwertyuiopasdfghjklzxcvbnmmnbvcxzmnmnbv");
		user.Save.click();
		demo.Textcomparsion(user.FName, "Aqwertyuiopasdfghjklzxcvbnmmnbvcxzmnmnbv", test,driver);
		user.FName.clear();
	}
	
	@Test(priority = 18)
	public void InValidFirstnamelessthanminrange() throws InterruptedException, IOException {
		test = extent.createTest("===========INVALID FIRSTNAME=========");
		test = extent.createTest(funTestCaseName()+" To Verify Firstname textfield by entering less than Minimum Range(3 char) ",  " Input Character Min 3 warning message sdould dispaly ");   
		user.FName.sendKeys("Aq");
		user.Save.click();
		if(user.FName.getText().length()<3)
		demo.Textcomparsion(user.warnmsg.get(1),"Input Character Min 3", test,driver);
		user.FName.clear();
	}
	
	@Test(priority = 19)
	public void InValidFirstnameenteringmorethanMaxrange() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName() +" To Verify Firstname textfield by entering more than Max Range(40 char) ",  " firstname textfield should not accept text after Maximum range text");   
		user.FName.sendKeys("Aqwertyuiopasdfghjklzxcvbnmmnbvcxzmnmnbvrtrty");
		user.Save.click();
		String Maxrange = "Aqwertyuiopasdfghjklzxcvbnmmnbvcxzmnmnbvrtrty";
		String Fuser=user.FName.getText();
		System.out.println(Fuser.length());
		demo.Textcomparsion(user.FName,Maxrange.substring(0, 40), test,driver);
		user.FName.clear();
	}
	
	
	

	
	@Test(priority = 21)
	public void InValidFirstnameBlank() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+" To Verify Firstname textfield by entering Blank ",  " Error message should get display");   
		user.FName.sendKeys("");
		user.Save.click();
		demo.Textcomparsion(user.FName,"", test,driver);	
	}
	

	
	
	
	

	
	
	@Test(priority = 22)
	public void ValidMiddleNameAlphabhets() throws InterruptedException, IOException {
		test = extent.createTest("===========MIDDLENAME==============");
		test = extent.createTest(funTestCaseName()+" To Verify Middlename textfield accepting alphabhets ",  " Middlename textfield should accept alphabhets and display");   
		user.MName.sendKeys("ASDFFGHHJKJL");
		user.Save.click();
		demo.Textcomparsion(user.MName, "ASDFFGHHJKJL", test,driver);
		user.MName.clear();
	}
	
	@Test(priority = 23)
	public void ValidMiddleNameMinrange() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+" To Verify  Middlename textfield if it is blank ",  " Middlename textfield should allow to save user ");   
		user.MName.sendKeys("");
		user.Save.click();
		demo.Textcomparsion(user.MName, "", test,driver);
		user.MName.clear();
	}
	
	@Test(priority = 24)
	public void ValidMiddleNameMaxrange() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+" To Verify Middlename textfield accepting Max Range(12 char) ",  " Middlename textfield should accept Maximum range text");   
		user.MName.sendKeys("Aqwertyuiopa");
		user.Save.click();
		demo.Textcomparsion(user.MName, "Aqwertyuiopa", test,driver);
		user.MName.clear();
	}
	
	@Test(priority = 25)
	public void InValidMiddleNamemorethanMaxrange() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+" To Verify  Middlename textfield by entering more than Max Range(12 char) ",  " Middlename textfield should not accept text after Maximum range text");   
		user.MName.sendKeys("Aqwertyuiopasdfghjklzxcvbnmmnbvcxzmnmnbvrtrty");
		user.Save.click();
		String Maxrange = "Aqwertyuiopasdfghjklzxcvbnmmnbvcxzmnmnbvrtrty";
		demo.Textcomparsion(user.MName,Maxrange.substring(0, 12), test,driver);
		user.MName.clear();
	}	
	
	
	@Test(priority = 26)
	public void ValidMiddleNameSpecialCharacters() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+" To Verify  Middlename textfield by entering SpecialCharacters ",  " Middlename textfield should accept text (!@%^&*;:?.,/*|)");   
		user.MName.sendKeys("!@%^&*;:?.,/");
		user.Save.click();
		demo.Textcomparsion(user.MName,"!@%^&*;:?.,/", test,driver);
		user.MName.clear();
	}
	
	@Test(priority = 27)
	public void ValidMiddleNamealphanumerics() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+" To Verify  Middlename textfield by entering Alphanumarics ",  " Middlename textfield should accept text (s564gdfg326)");   
		user.MName.sendKeys("s564gdfg326");
		user.Save.click();
		demo.Textcomparsion(user.MName,"s564gdfg326", test,driver);
		user.MName.clear();
	}
	
	
	@Test(priority = 28)
	public void ValidLastNameAlphabhets() throws InterruptedException, IOException {
		test = extent.createTest("===========LASTNAME==============");
		test = extent.createTest(funTestCaseName()+" To Verify  Lastname textfield accepting alphabhets ",  " Lastname textfield should accept alphabhets and display");   
		user.LName.sendKeys("ASDFFGHHJKJL");
		user.Save.click();
		demo.Textcomparsion(user.LName, "ASDFFGHHJKJL", test,driver);
		user.LName.clear();
	}
	
	@Test(priority = 29)
	public void ValidLastNameMinrange() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+" To Verify  Lastname textfield if it is blank ",  " Lastname textfield should allow to save user ");   
		user.LName.sendKeys("");
		user.Save.click();
		demo.Textcomparsion(user.LName, "", test,driver);
		user.LName.clear();
	}
	
	@Test(priority = 30)
	public void ValidLastNameMaxrange() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+" To Verify   Lastname textfield accepting Max Range(12 char) ",  " Lastname textfield should accept Maximum range text");   
		user.LName.sendKeys("Aqwertyuiopa");
		user.Save.click();
		demo.Textcomparsion(user.LName, "Aqwertyuiopa", test,driver);
		user.LName.clear();
	}
	
	@Test(priority = 31)
	public void InValidLastNamemorethanMaxrange() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+" To Verify Lastname textfield by entering more than Max Range(12 char) ",  " Lastname textfield should not accept text after Maximum range text");   
		user.LName.sendKeys("Aqwertyuiopasdfghjklzxcvbnmmnbvcxzmnmnbvrtrty");
		user.Save.click();
		String Maxrange = "Aqwertyuiopasdfghjklzxcvbnmmnbvcxzmnmnbvrtrty";
		demo.Textcomparsion(user.LName,Maxrange.substring(0, 12), test,driver);
		user.LName.clear();
	}	
	
	
	@Test(priority = 32)
	public void ValidLastNameSpecialCharacters() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+" To Verify Lastname textfield by entering SpecialCharacters ",  " Lastname textfield should accept text (!@%^&*;:?.,/*|)");   
		user.LName.sendKeys("!@%^&*;:?.,/");
		user.Save.click();
		demo.Textcomparsion(user.LName,"!@%^&*;:?.,/", test,driver);
		user.LName.clear();
	}
	
	@Test(priority = 33)
	public void ValidLastNamealphanumerics() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+" To Verify Lastname textfield by entering Alphanumarics ",  " Lastname textfield should accept text (s564gdfg326)");   
		user.LName.sendKeys("s564gdfg326");
		user.Save.click();
		demo.Textcomparsion(user.LName,"s564gdfg326", test,driver);
		user.LName.clear();
	}
	
	@Test(priority = 34)
	public void ValidPasswordnumerics() throws InterruptedException, IOException {
		test = extent.createTest("===========PASSWORD==============");
		test = extent.createTest(funTestCaseName()+" To Verify  Password textfield by entering numarics ",  " Password textfield should accept text (134569756)");   
		user.Password.sendKeys("134569756");
		user.Save.click();
		demo.isdisplayed(user.Password,"134569756", test,driver);
		user.Password.clear();
	}
	
	@Test(priority = 35)
	public void ValidPasswordalphanumerics() throws InterruptedException, IOException {
		
		test = extent.createTest(funTestCaseName()+" To Verify Password textfield by entering Alphanumarics ",  " Password textfield should accept text (s564gdfg326)");   
		user.Password.sendKeys("s564gdfg326");
		user.Save.click();
		demo.isdisplayed(user.Password, "s564gdfg326",  test,driver);
		user.Password.clear();
	}
	
	

	
	@Test(priority = 36)
	public void ValidPasswordminimumrange() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+" To Verify Password textfield by entering alphanumarics and specialcharaters",  " Password textfield should accept alphanumarics and specialcharaters text (1#@3dfeg975)");   
		user.Password.sendKeys("1#@3dfeg975");
		user.Save.click();
		demo.isdisplayed(user.Password, "1#@3dfeg975", test,driver);
		user.Password.clear();
	}
	
	@Test(priority = 37)
	public void ValidPasswordmorethanMaxrange() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+" To Verify  Password textfield by entering more than Max Range(16 char) ",  " Password textfield should not accept text after Maximum range text");   
		user.Password.sendKeys("Aqwertyuiopasdfghjklzxcvbnmmnbvcxzmnmnbvrtrty");
		user.Save.click();
		String Maxrange = "Aqwertyuiopasdfghjklzxcvbnmmnbvcxzmnmnbvrtrty";
		demo.isdisplayed(user.Password, Maxrange.substring(0, 16), test,driver);
		user.Password.clear();
	}	
	@Test(priority = 38)
	public void ValidPasswordEnteringMaxrange() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+" To Verify  Password textfield accepting Max Range(16 char) ",  " Password textfield should accept Maximum range text");   
		user.Password.sendKeys("Aqwertyuiopa");
		user.Save.click();
		demo.isdisplayed(user.Password, "Aqwertyuiopa", test,driver);
	}
	
	
	@Test(priority = 39)
	public void ValidPasswordSpecialCharacters() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+" To Verify Password textfield by entering SpecialCharacters ",  " Password textfield should accept text (!@%^&*;:?.,/*|)");   
		user.Password.sendKeys("!@%^&*;:?.,/");
		user.Save.click();
		demo.isdisplayed(user.Password,"!@%^&*;:?.,/", test,driver);
		user.Password.clear();
	}
	
	@Test(priority = 40)
	public void InValidPasswordisblank() throws IOException {
		test = extent.createTest(funTestCaseName()+" To Verify functionality of Password text field if empty",  "  Input cannot be blank warning message should display ");   
		user.Password.sendKeys(" ");
		user.Save.click();
		demo.isdisplayed(user.InputBlank, "Input cannot be blank", test,driver);
		user.Password.clear();	
	}
	@Test(priority = 41)
	public void InValidPasswordlessthanMaxrange() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+" To Verify Password textfield by entering less than Minimum Range(3 char) ",  " Input Character Min 6 warning message sdould dispaly ");   
		user.Password.sendKeys("Aqgfd");
		user.Save.click();
		if(user.Password.getText().length()<6)
		demo.Textcomparsion(user.Inputchar, "Input Character Min 6", test,driver);
		user.Password.clear();
	}

	@Test(priority = 42)
	public void ValidCPasswordnumerics() throws InterruptedException, IOException {
		test = extent.createTest("===========CONFRIM PASSWORD==============");
		test = extent.createTest(funTestCaseName()+" To Verify Password textfield by entering numerics",  " Password textfield should accept text (134569756)");   
		user.Confirmpassword.sendKeys("134569756");
		user.Save.click();
		demo.isdisplayed(user.Confirmpassword, "134569756", test,driver);
		user.Confirmpassword.clear();
	}
	
	@Test(priority = 43)
	public void ValidCPasswordalphanumerics() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+" To Verify Password textfield by entering Alphanumarics ",  " Password textfield should accept text (s564gdfg326)");   
		user.Confirmpassword.sendKeys("s564gdfg326");
		user.Save.click();
		demo.isdisplayed(user.Confirmpassword,"s564gdfg326", test,driver);
		demo.isdisplayed(user.Cpassword, "Password Do not match", test,driver);
		user.Confirmpassword.clear();
	}
	
	@Test(priority = 44)
	public void ValidCPasswordminimumrange() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+" To Verify Password textfield by entering alphanumarics and specialcharaters",  " Password textfield should accept alphanumarics and specialcharaters text (1#@3dfeg975)");   
		user.Confirmpassword.sendKeys("1#@3dfeg975");
		user.Save.click();
		demo.isdisplayed(user.Confirmpassword, "1#@3dfeg975", test,driver);
		demo.isdisplayed(user.Cpassword, "password Do not match", test,driver);
		user.Confirmpassword.clear();
	}
	
	@Test(priority = 45)
	public void ValidCPasswordmorethanMaxrange() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+" To Verify  Password textfield by entering more than Max Range(16 char) ",  " Password textfield should not accept text after Maximum range text");   
		user.Confirmpassword.sendKeys("Aqwertyuiopasdfghjklzxcvbnmmnbvcxzmnmnbvrtrty");
		user.Save.click();
		String Maxrange = "Aqwertyuiopasdfghjklzxcvbnmmnbvcxzmnmnbvrtrty";
		demo.isdisplayed(user.Confirmpassword,Maxrange.substring(0, 16), test,driver);
		demo.isdisplayed(user.Cpassword, "password Do not match", test,driver);
		user.Confirmpassword.clear();
	}	
	
	
	
	
	@Test(priority = 46)
	public void ValidCPasswordMaxrange() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+" To Verify  Password textfield accepting Max Range(16 char) ",  " Password textfield should accept Maximum range text");   
		user.Confirmpassword.sendKeys("Aqwertyuiopa");
		user.Save.click();
		demo.isdisplayed(user.Confirmpassword, "Aqwertyuiopa", test,driver);
	}
	
	
	@Test(priority = 47)
	public void ValidCPasswordSpecialCharacters() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+" To Verify  Password textfield by entering SpecialCharacters ",  " Password textfield should accept text (!@%^&*;:?.,/*|)");   
		user.Confirmpassword.sendKeys("!@%^&*;:?.,/");
		user.Save.click();
		demo.isdisplayed(user.Confirmpassword,"!@%^&*;:?.,/", test,driver);
		user.Confirmpassword.clear();
	}
	
	@Test(priority = 48)
	public void InValidCPasswordtextfieldisblank() throws IOException {
		test = extent.createTest(funTestCaseName()+" To Verify  Functionality of User ID text field if empty",  "  Input cannot be blank warning message should display ");   
		user.Confirmpassword.sendKeys("");
		user.Save.click();
		if(user.Confirmpassword.getText().equals("")) 
		demo.Textcomparsion(user.Cpassword, "Input cannot be blank", test,driver);
		user.Confirmpassword.clear();	
	}
	
	@Test(priority = 49)
	public void InValidCPasswordlessthanMaxrange() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+" To Verify Confirm Password textfield by entering less than Minimum Range(3 char) ",  " Input Character Min 6 warning message sdould dispaly ");   
		user.Confirmpassword.sendKeys("Aq");
		user.Save.click();
		if(user.Confirmpassword.getText().length()<6)
			demo.Textcomparsion(user.Cpassword, "Input Character Min 6", test,driver);
		user.Confirmpassword.clear();
	}
		
	
	@Test(priority = 50)
	public void Roleclick() throws IOException, InterruptedException
	{
		test = extent.createTest("====== Role & Designation=====");
		test = extent.createTest(funTestCaseName()+" To Verify Role Dropdown selection");
		Roleselection(test,0);
	}
	
	@Test(priority = 51)
	public void Designationclick() throws IOException, InterruptedException
	{
		test = extent.createTest(funTestCaseName()+" To Verify Designation Dropdown selection");
		Roleselection(test,1);
	}
	
	
	@Test(priority = 52)// APR ID AND APR CBCT should be added
	public void Status() throws IOException, InterruptedException
	{
		test = extent.createTest(funTestCaseName()+" To Verify Designation Dropdown selection");
		Roleselection(test,1);
	}
	
	
	@Test(priority = 53)
	public void ActiveEnabled() throws InterruptedException, IOException {
		test = extent.createTest("=====Active=====");
		test = extent.createTest(funTestCaseName()+"   To verify Active Raiobutton Enabled ",  " Active Radio button should Enabled  ");
		demo.isEnabled(user.Active, "Active", test,driver);
		
	}

	@Test(priority = 54)
	public void ActiveStatus() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+"  To verify default status of Active radio button ", " Active Radio button should be not selcted  ");
		demo.BydefaultisSelected(user.Active, "Active", test,driver);
		
	}

	
	@Test(priority = 55)
	public void Activeclick() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+"  To verify Active radio button after clicked on it",  " Active Radio button should be in selected mode  ");
		user.Active.click();
		demo.isSelected(user.Active, "Active", test,driver);
	}
	
	@Test(priority = 56)
	public void Activeclickagain() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+" To Verify Enabled Active button, Cick again",  " Active Radio button should be in selected mode  ");
		user.Active.click();
		demo.isSelected(user.Active, "Active", test,driver);
	}
	


	
	@Test(priority = 57)
	public void InActiveStatus() throws InterruptedException, IOException {
		test = extent.createTest("=====Inactive=====");
		test = extent.createTest(funTestCaseName()+" To verify default status of InActive radio button ",  " Inactive Radio button should not selcted");
		demo.BydefaultisSelected(user.Inactive, "Inactive", test,driver);
	}
	
	
	@Test(priority = 58)
	public void InActiveclick() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+"  To verify InActive radio button after clicked on it",  " Inactive Radio button should be in selected mode  ");
		user.Inactive.click();
		demo.isSelected(user.Inactive, "Inactive", test,driver);
	}
	
	@Test(priority = 59)
	public void InActiveclickagain() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+"  Enabled InActive button, Cick again"," Inactive Radio button should be in selected mode  ");
		user.Inactive.click();
		demo.isSelected(user.Inactive, "Inactive", test,driver);
	}
    @Test(priority = 60)
	public void Toverifysavebuttonenabledordisabled() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+"  To verify default status of Save button ",  "default Save button should Disable  ");
		demo.isEnabled(user.Save, "SAVE", test, driver);
	}

	@Test(priority = 61)
	public void EnterData() throws IOException, InterruptedException
	{
		test = extent.createTest(funTestCaseName()+"  To verify  all  the textfield ,dropdown and Radio button after nativating to User Management screen",  " all  the textfield ,dropdown should be blank and Radio button should be unselect  ");
		EnterTextfieldsData(test);
		demo.isEnabled(user.Save, "SAVE", test, driver);
		test = extent.createTest(funTestCaseName()+" Click on the Save Button",  "Pop-up should be displayed");
		user.Save.click();
		Sitesave1("User Add", "User added with selected credentials.", "User Add", "User added with selected credentials.",0,driver,test);
	}
	@Test(priority = 62)// After Saving
	public void UserIDInValidMaxrangeUserIDExits() throws IOException, InterruptedException {
		test = extent.createTest(funTestCaseName() +"  To verify functionality of User ID text field if Entered Same UserID ",  " User ID already exists warning message should display");   
		user.User_ID.sendKeys("UserId");
		if(user.User_ID.getText().equals("UserId"))
			Thread.sleep(1000);
			user.Save.click();
			Thread.sleep(1000);
		demo.Textcomparsion(user.UserIDexits, "User ID already exists", test,driver);
		user.User_ID.clear();
	}
	
	@Test(priority = 63)
	public void InValidFirstnamesameusernameagain() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+" To Verify Firstname textfield by entering same user Name again ",  " User Name already exists warning message sdould dispaly ");   
		user.FName1.sendKeys("Abcjjj4der121f");
		user.MName1.sendKeys("Abcds1d1erf");
		user.LName1.sendKeys("Abcdeyty1tyrf");
		Thread.sleep(1000);
		user.Save.click();
		Thread.sleep(1000);
		demo.Textcomparsion(user.UserNameexits,"User Name already exists", test,driver);
		user.FName1.clear();
		user.MName1.clear();
		user.LName1.clear();
	}
	String UserId="USER_#456";
	String FName="Abv11r11f";	String MName="Abcds1d1erf";
	String LName="Abcdeyty1ty";
	String Role="New rolaa 2";
	String Designations="sdgdghdefh";
	String PreferredAprId="piouiut";
	String PreferredAprCBCTId="dyglreiy";
	String status="Inactive";
	
	
	public void EnterTextfieldsData(ExtentTest test) throws InterruptedException, IOException {
	
		user.User_ID1.sendKeys("UserId");
		demo.Textcomparsion(user.User_ID1, "UserId", test, driver);
		user.FName1.sendKeys("Abcjjj4der121f"); 
		demo.Textcomparsion(user.FName1, "Abcjjj4der121f", test, driver);
		user.MName1.sendKeys("Abcds1d1erf");
		demo.Textcomparsion(user.MName1, "Abcds1d1erf", test, driver);
		user.LName1.sendKeys("Abcdeyty1tyrf");
		demo.Textcomparsion(user.LName1, "Abcdeyty1tyr", test, driver);
		user.Password1.sendKeys("1234567890");
		demo.isdisplayed(user.Password1, "1234567890", test, driver);
		user.Confirmpassword1.sendKeys("1234567890");
		demo.isdisplayed(user.Confirmpassword1, "1234567890", test, driver);
		Roleselection(test,0);
		Roleselection(test,1);
	//	Roleselection(test,1);
	//	Roleselection(test,1);
		user.Active.click();
		
	}
	
	
	@Test(priority = 64)
	public void SavedDataexitsinList() throws IOException, InterruptedException
	{
		test = extent.createTest(funTestCaseName()+" To Verify Save the Data,It should display in list",  "UserData should display in the List");
		Data(test,"UserId");
		
		
	}
	
	@Test(priority = 65)
	public void enetredsamedata() throws IOException, InterruptedException
	{
		test = extent.createTest(funTestCaseName()+" To Verify Enetred same data again",  "User ID already exits errormessage should get displayed");
		EnterTextfieldsData(test);
		demo.isEnabled(user.Save, "SAVE", test, driver);
		user.Save.click();
		demo.isdisplayed(user.UserIDexits, "User ID already exists", test,driver);
		demo.Textcomparsion(user.UserIDexits, "User ID already exists", test,driver);
		
		demo.isdisplayed(user.UserNameexits, "User Name already exists", test,driver);
		demo.Textcomparsion(user.UserNameexits, "User Name already exists", test,driver);	
	}
	
	
	
	
	@Test(priority=66, dataProvider = "testDatavalid")
	 public void ActiveUser(String Testcase,String UserID, String FN, String MN,String LN,String Password,String CP) throws IOException, InterruptedException
	 {	 
		 test=extent.createTest("=======VALID USER DATA SAVE WITH ACTIVE USER======");
		 try {
		 UserAdd(Testcase,UserID,FN,MN,LN,Password,CP); 
		 user.Active.click();
		 demo.isEnabled(user.Save, "Save", test, driver);
		 user.Save.click();
		 Sitesave1("User Add", "User added with selected credentials.", "User Add", "User added with selected credentials.",0,driver,test);
		 test = extent.createTest(funTestCaseName()+" To verify Entered Valid is displayed in the list");
		 Data(test, UserID);
		 }
		 catch(Exception e)
	 	 {
	 	 catchexceptionscreenshot(test,e);
	 	 }
	 }
	
	

	@Test(priority=67, dataProvider = "testDataInactive")
	 public void InActiveUser(String Testcase,String UserID, String FN, String MN,String LN,String Password,String CP) throws IOException, InterruptedException
	 {	 
		 test=extent.createTest("======VALID USER DATA SAVE WITH INACTIVE USER======");
		 try {
		 UserAdd(Testcase,UserID,FN,MN,LN,Password,CP); 
		 user.Inactive.click();
		 demo.isEnabled(user.Save, "Save", test, driver);
		 user.Save.click();
		 Sitesave1("User Add", "User added with selected credentials.", "User Add", "User added with selected credentials.",0,driver,test);
		Thread.sleep(1000);
		 test = extent.createTest(funTestCaseName()+" To verify Entered Valid is displayed in the list");
		 test.info(UserID);
		 Data(test, UserID);
		 }
		 catch(Exception e)
	 	 {
	 	 catchexceptionscreenshot(test,e);
	 	 }
	 }
	
	@Test(priority=68, dataProvider = "testDataAdd")
	 public void AddUser(String Testcase,String UserID, String FN, String MN,String LN,String Password,String CP) throws IOException, InterruptedException
	 {	 
		 test=extent.createTest("=======Add icon======");
		 try {
		 UserAdd(Testcase,UserID,FN,MN,LN,Password,CP); 
		 user.Active.click();
		 user.AddUser.click();
		 test = extent.createTest(funTestCaseName()+" To Verify Click on Addicon, Textbox should be empty");
		 demo.isempty(user.User_ID, "User_ID", test,driver);
		 demo.isempty(user.FName, "First Name", test,driver);
		 demo.isempty(user.MName, "Middle Name", test,driver);
			demo.isempty(user.LName, "Last Name", test,driver);
			demo.isempty(user.Password, "Password", test,driver);
			demo.isempty(user.Confirmpassword, "Confirm password", test,driver);
			demo.isemptynoclick(user.Role, "Role", test,driver);
			demo.isemptynoclick(user.Designation, "Designation", test,driver);   // APR should be added
			demo.BydefaultisSelected(user.Active,"Active", test,driver);
			demo.BydefaultisSelected(user.Inactive,"Inactive", test, driver);
		 Data(test, UserID);
		 }
		 catch(Exception e)
	 	 {
	 	 catchexceptionscreenshot(test,e);
	 	 }
	 }
	
	@Test(priority=69, dataProvider = "testDataEmpty")
	 public void EmptyData(String Testcase,String UserID, String FN, String MN,String LN,String Password,String CP,String E1) throws IOException, InterruptedException
	 {	 
		 test=extent.createTest("=======Empty Data=======");
		 try {
		 UserAdd(Testcase,UserID,FN,MN,LN,Password,CP); 
		 user.Save.click();
		 demo.isdisplayed(user.InputBlank, E1, test, driver);
		 }
		 catch(Exception e)
	 	 {
	 	 catchexceptionscreenshot(test,e);
	 	 }
	 }
	
	//*************************Edit***************************
	@Test(priority=70)
	public void Editenable() throws IOException
	{
		try {
			test = extent.createTest("=======EDIT=======");
			test = extent.createTest(guiTestCaseName()+" Edit icon are enabled by default");
			vieweditenable("ChemotherapyConfigurationSection4View", 0,test,driver,"Ëdit");
		}
			catch(Exception e)
			{
				test.fail("Edit Button is not enabled");
				catchexceptionscreenshot(test,e);
			}
	}
	
	
	@Test(priority=71)
	public void Editok() throws InterruptedException, IOException, FindFailed
	{
		test = extent.createTest(funTestCaseName()+" To Verify Click on User Edit data, Update and Reset Password button should be displayed and enabled");
		try {
			Thread.sleep(1000);
			Editdrug(test,"Edit", 0,0);
			}
			catch(Exception e)
			{
				test.fail("Edit Button is not enabled");
				catchexceptionscreenshot1(test,e);
			}
		/*  It is showing as not displayed
		try {
			demo.isdisplayed(user.User_ID, "User_ID", test,driver);
			demo.isdisplayed(user.FName, "First Name", test,driver);
			demo.isdisplayed(user.MName, "Middle Name", test,driver);
			demo.isdisplayed(user.LName, "Last Name", test,driver);
			demo.isdisplayed(user.Role, "Role", test,driver);
			demo.isdisplayed(user.Designation, "Designation", test,driver);
			demo.isdisplayed(user.Active,"Active", test,driver);
			demo.isdisplayed(user.Inactive,"Inactive", test, driver);
		}
		catch(Exception e)
		{
			test.fail(e);
		}	
		*/
		
		try {
			demo.isdisplayed(user.Update, "UPDATE", test, driver);
			demo.isEnabled(user.Update, "UPDATE", test, driver);
			demo.isdisplayed(user.ResetPassword, "RESETPASSWORD", test, driver);
			demo.isEnabled(user.ResetPassword, "RESETPASSWORD", test, driver);
		}
		catch(Exception e)
		{
			
			catchexceptionscreenshot(test,e);
		}		
	}
	@Test(priority=72)
	public void EditUpdate() throws IOException, InterruptedException
	{
		test = extent.createTest(funTestCaseName()+" To Verify Click on Upadte without Modifying the data");
		Thread.sleep(1000);
		user.Update.click();
		try {
		Sitesave1("User Update", "Selected User Details updated.", "User Update", "Selected User Details updated.",0,driver,test);
		}
		catch(Exception e)
		{
			catchexceptionscreenshot(test,e);
		}
	
	}
	
	@Test(priority=73)
	public void EditModify() throws IOException, InterruptedException
	{
		test = extent.createTest(funTestCaseName()+" To Verify Click on Edit and Modify the data");
		Editdrug(test,"Edit", 0,0);
		try {
			user.FName1.clear();
			user.FName1.sendKeys("User_987635"); 	
			user.Update.click();
			try {
			Sitesave1("User Update", "Selected User Details updated.", "User Update", "Selected User Details updated.",0,driver,test);
			}
			catch(Exception e)
			{
				catchexceptionscreenshot(test,e);
			}
		}
		catch(Exception e)
		{
			catchexceptionscreenshot(test,e);
		}
	
	}
	
	@Test(priority=74)
	public void EditandModifydata() throws IOException, InterruptedException
	{
		test = extent.createTest(funTestCaseName()+" To Verify Check Modify data Updated correctly");
		Editdrug(test,"Edit", 0,0);
		user.FName1.click();
		demo.Textcomparsion(user.FName1, "User_987635", test, driver);
	}
	
	@Test(priority=75)
	public void EditandReset() throws IOException, InterruptedException
	{
		test = extent.createTest("=========RESET ICON========");
		test = extent.createTest(funTestCaseName()+" To Verify Without editing, Click on the reset the data should not change");
		Editdrug(test,"Edit", 0,0);
		user.Reset.click(); 
		demo.Textcomparsion(user.User_ID1, "UserId", test, driver);
		demo.Textcomparsion(user.FName1, "User_987635", test, driver);
		demo.Textcomparsion(user.MName1, "Abcds1d1erf", test, driver);
		demo.Textcomparsion(user.LName1, "Abcdeyty1tyr", test, driver);
	}
	
	@Test(priority=76)
	public void EditdataandReset() throws IOException, InterruptedException
	{
	
		String FirstN=user.FName1.getText();
		String MiddleN=user.MName1.getText();
		String LastN=user.LName1.getText();
		String Role1=user.Role1.getText();
		String Design1=user.Designation1.getText();
		test = extent.createTest(funTestCaseName()+" To Verify Edit the FirstName,Click Reset");
		user.FName1.sendKeys("Dr.Tejaswini");
		user.Reset.click(); 
		demo.Textcomparsion(user.FName1, FirstN, test, driver);
		
		test = extent.createTest(funTestCaseName()+" To Verify Edit the MiddleName,Click Reset");
		user.MName1.sendKeys("Arya");
		user.Reset.click(); 
		demo.Textcomparsion(user.MName1, MiddleN, test, driver);
		
		test = extent.createTest(funTestCaseName()+" To Verify Edit the LastName,Click Reset");
		user.LName1.sendKeys("Arya");
		user.Reset.click(); 
		demo.Textcomparsion(user.LName1, LastN, test, driver);
		
		test = extent.createTest(funTestCaseName()+" To Verify Edit the Rolename,Click Reset");
		Roleselection(test,0);
		user.Reset.click(); 
		demo.Textcomparsion(user.Role1, Role1, test, driver);
		
		test = extent.createTest(funTestCaseName()+" To Verify Edit the Designation,Click Reset");
		Roleselection(test,1);
		user.Reset.click(); 
		demo.Textcomparsion(user.Designation1, Design1, test, driver);  // APR Should be added
		user.Update.click();
		try {
		Sitesave1("User Update", "Selected User Details updated.", "User Update", "Selected User Details updated.",0,driver,test);
		}
		catch(Exception e)
		{
			catchexceptionscreenshot(test,e);
		}
		
	}

	public void ActiveUserSignin() throws IOException
	{
		test = extent.createTest(funTestCaseName()+"Click on Edit, Reset Password should be Enable");
	}
	
	public void InActiveUserAccessdenied() throws IOException
	{
		test = extent.createTest("=======Inactive User=======");
		test = extent.createTest(funTestCaseName()+"Click on Edit, Reset Password should be Enable");
	}
	
	@Test(priority=77)
	public void ResetPasswordactive() throws IOException, InterruptedException
	{
		try {
		test = extent.createTest("=======RESET PASSWORD======");
		test = extent.createTest(funTestCaseName()+" To Verify Click on Edit, Reset Password should be Enable");
		Editdrug(test,"Edit", 0,0);
		demo.isEnabled(user.ResetPassword, "RESET PASSWORD", test, driver);
		user.ResetPassword.click();
		Sitesave1("Password Reset","Password has been reset for the selected user.","Password Reset","Password has been reset for the selected user.",0,driver,test);
		test = extent.createTest(funTestCaseName()+" To Verify Active user able to login");
		SignoutLogin();
		demo.isdisplayed(user.TreatmentPlan, "Treatment Plan", test, driver);
		user.Signout.click();
		Thread.sleep(1000);
		Sitesave1("Sign Out","Do you want to Sign out?","Sign out","Do you want to Sign out?", 1, driver,test);
		}
		catch(Exception e)
		{
			test.error(e);
		}
		finally {
			user.Userbx.clear();
			user.Pswdbox.clear();
			Thread.sleep(1000);
		    Sign.Login(driver);
		    Thread.sleep(10000);
		}
	}
	
	@Test(priority=78)
	public void ResetPasswordInactive() throws IOException, InterruptedException
	{
		test = extent.createTest(funTestCaseName()+"Click on Edit, Inactive user, Click on the Reset Password");
		try {
		Sign.UserManagement(driver);
		Thread.sleep(1000);
		Editdrug(test,"Edit", 0,0);
		Thread.sleep(1000);
		user.Inactive.click();
		Thread.sleep(1000);
		user.Update.click();
		Thread.sleep(1000);
		Sitesave1("User Update", "Selected User Details updated.", "User Update", "Selected User Details updated.",0,driver,test);
		demo.isEnabled(user.ResetPassword, "RESET PASSWORD", test, driver);
		Thread.sleep(1000);
		Editdrug(test,"Edit", 0,0);
		user.ResetPassword.click();
		Sitesave1("Password Reset","Password has been reset for the selected user.","Password Reset","Password has been reset for the selected user.",0,driver,test);
		}
		catch(Exception e)
		{
			test.error(e);
		}
		finally {
		SignoutLogin();
		demo.isdisplayed(user.UserInactive,"User Inactive Mode", test, driver);
		demo.Textcomparsion(user.UserInactive,"User Inactive Mode", test, driver);
		user.Userbx.clear();
		user.Pswdbox.clear();
		Thread.sleep(1000);
		Sign.Login(driver);
		Thread.sleep(100000);
		Sign.UserManagement(driver);
		Thread.sleep(100000);
		}
	}
	public void  SignoutLogin() throws IOException, InterruptedException 
	{
		user.Signout.click();
		Thread.sleep(1000);
		Sitesave1("Sign Out","Do you want to Sign out?","Sign out","Do you want to Sign out?", 1, driver,test);	
		Thread.sleep(1000);
		user.Userbx.click();
		driver.switchTo().activeElement().sendKeys("UserId");
		user.Pswdbox.click();
		driver.switchTo().activeElement().sendKeys("12345678");
		user.SigninButton.click();	
	}
	

	@Test(priority=79)
	public void SearchUseridvalid() throws FindFailed, IOException, InterruptedException
	{
		test = extent.createTest(funTestCaseName()+" To Verify Valid Serach User by UserId");
		viewdataUser(test,driver,"D:\\Help\\UserRole\\SearchUerid.png",1,1);
		
		test = extent.createTest(funTestCaseName()+" To Verify InValid Search User by UserId");
		viewdataUserinvalid(test,driver,"D:\\Help\\UserRole\\SearchUerid.png",5,5);
	
	}
	@Test(priority=80)
	public void SearchUsernamevalid() throws FindFailed, IOException, InterruptedException
	{
		user.SearchMenuButtonicon.click();
		user.SearchMenuusername.click();
		test = extent.createTest(funTestCaseName()+"Valid Serach User by UserName");
		viewdataUser(test,driver,"D:\\Help\\UserRole\\SearchFullname.png",2,2);
		
		test = extent.createTest(funTestCaseName()+"InValid Search User by UserFullName");
		viewdataUserinvalid(test,driver,"D:\\Help\\UserRole\\SearchFullname.png",1,1);
	
	}
	
	//********************** Page navigation

	 @Test(priority = 81)
		public void pageenabled() throws IOException, InterruptedException
		{
		        test = extent.createTest(guiTestCaseName()+" To verify  Next and Last are enabled if enetred more user data");
		        demo.isEnabled(user.NextPageButton,"Next page button", test,driver);
		    	demo.isEnabled(user.LastPageButton,"Last page button", test,driver);
		    }
		    	

		@Test(priority = 82)
		public void Nextpageenable() throws IOException, FindFailed, InterruptedException
		{
			if(user.NextPageButton.isEnabled())
			{
				user.NextPageButton.click();
				test = extent.createTest(guiTestCaseName()+" To verify Click on the Next, First and Previous are enabled");
				demo.isEnabled(user.FirstPageButton,"First page Button", test,driver);
				demo.isEnabled(user.PreviousPageButton,"Previous Page Button", test,driver);
			}
			else {
				test.fail("Next Page button is not enabled");
			}
			
		}
		@Test(priority = 83)
		public void previouspageenabled() throws FindFailed, IOException, InterruptedException
		{
			if(user.PreviousPageButton.isEnabled())
			{
				user.PreviousPageButton.click();
				test = extent.createTest(guiTestCaseName()+" To verify Click on the Previous, Next and Last are enabled");
				demo.isEnabled(user.NextPageButton,"Next page button", test,driver);
		    	demo.isEnabled(user.LastPageButton,"Last page button", test,driver);
			}
			else {
				test.fail("PreviousPageButton is not enabled");
			}	
				
		}
		@Test(priority = 84)
		public void Lastpageenabled() throws FindFailed, IOException, InterruptedException
		{
			if(user.LastPageButton.isEnabled())
			{
				user.LastPageButton.click();
				test = extent.createTest(guiTestCaseName()+" To verify Click on the Last, First and Previous are enabled");
				demo.isEnabled(user.FirstPageButton,"First page button", test,driver);
				demo.isEnabled(user.PreviousPageButton,"PreviousPageButton", test,driver);
			}
			else {
				test.fail("LastPageButton is not enabled");
			}
		}
		@Test(priority = 85)
		public void FirstPageEnabled() throws FindFailed, IOException, InterruptedException
		{
			if(user.FirstPageButton.isEnabled())
			{
				user.FirstPageButton.click();
				test = extent.createTest(guiTestCaseName()+" To verify Click on the First, Next and Last are enabled");
				demo.isEnabled(user.NextPageButton,"Next page button", test,driver);
		    	demo.isEnabled(user.LastPageButton,"Last page button", test,driver);
			}
			else {
				test.fail("First Page button is not enabled");
			}
		}
		

	public void Editdrug(ExtentTest test, String Text, int i,int j) throws IOException, InterruptedException
	{

	    WebElement Listrow = driver.findElements(By.className("DataGridRow")).get(i);
	    WebElement Edit=Listrow.findElements(By.className("DataGridCell")).get(j);
		if(Edit.isEnabled())
		{
		Actions action=new Actions(driver);
		action.moveToElement(Edit).click().perform();
		}
		else
		{
			test.fail(Text+ "Button is not enabled");
		}
		
	}
	 public void UserAdd(String Testcase1,String UserID1, String FN1, String MN1,String LN1,String Password1,String CP1) throws IOException, InterruptedException
	 {
		 test=extent.createTest(funTestCaseName() +"," +Testcase1);
		 user.User_ID1.click();
		 driver.switchTo().activeElement().clear();
		 user.User_ID1.sendKeys(UserID1);
		 
		 user.FName1.click();
		 driver.switchTo().activeElement().clear();
		 user.FName1.sendKeys(FN1);
		 
		 user.MName1.click();
		 driver.switchTo().activeElement().clear();
		 Thread.sleep(1000);
		 user.MName1.sendKeys(MN1);
		 
		 user.LName1.click();
		 driver.switchTo().activeElement().clear();
		 user.LName1.sendKeys(LN1);
		 
		 user.Password1.click();
		 driver.switchTo().activeElement().clear();
		 user.Password1.sendKeys(Password1);
		 
		 user.Confirmpassword1.click();
		 driver.switchTo().activeElement().clear();
		 user.Confirmpassword1.sendKeys(CP1);
		 
		 Roleselection(test,0);
		 Roleselection(test,1);
//		 Roleselection(test,1);
//		 Roleselection(test,1);
	 }
		 
		
	
	public void Data(ExtentTest test, String Text) throws IOException, InterruptedException {
	    List<WebElement> rows = driver.findElements(By.className("DataGridRow"));
	    for (WebElement row : rows) {
	        WebElement firstCell = row.findElements(By.className("DataGridCell")).get(1);
	        System.out.println(firstCell.getText());

	        if (firstCell.getText().equals(Text)) {
	            demo.isdisplayed(firstCell, Text, test, driver);
	            break;
	        }
	    }
	}
	
	String Text;
	public String Roleselection(ExtentTest test, int i) throws InterruptedException, IOException {
	    WebElement element = driver.findElements(By.className("ComboBox")).get(i);
	    element.click();
	    Thread.sleep(1000);
	    List<WebElement> element1 = element.findElements(By.className("TextBlock"));

	    int size = element1.size();
	    System.out.println("Size of element1: " + size);

	    if (size > 0) {
	        Random rand = new Random();
	        int randomIndex = rand.nextInt(size);

	        System.out.println("Random index: " + randomIndex);
	        
	        String ColorIndex = Integer.toString(randomIndex);
	        WebElement elementcolor = element1.get(randomIndex);
	        Text=elementcolor.getText();
	        test.info(Text);
	        
	        Actions action = new Actions(driver);
	        action.moveToElement(elementcolor).click().perform();
	        
	        if(element.getText().equals(Text))
	        {
	        	 demo.Textcomparsion(element, Text, test, driver);
	        }
	        else
	        {
	        	 element.click();
		           WebElement Scroll = driver.findElement(By.className("Thumb"));
		           WebElement Scroll1 = driver.findElements(By.className("RepeatButton")).get(1);
		           Thread.sleep(3000);
	           action.dragAndDrop(Scroll,Scroll1).perform();
	           Thread.sleep(3000);
	           action.moveToElement(elementcolor).click().perform();
	        }
	        if(element.getText().equals(Text))
	        {
	        	 demo.Textcomparsion(element, Text, test, driver);
	        }
	        else
	        {
	        	  element.click();
		           WebElement Scroll = driver.findElement(By.className("Thumb"));
		           WebElement Scroll1 = driver.findElements(By.className("RepeatButton")).get(0);
		           Thread.sleep(3000);
	           action.dragAndDrop(Scroll,Scroll1).perform();
	           Thread.sleep(3000);
	           action.moveToElement(elementcolor).click().perform();
	        }
	        
	        
	    } else {
	        System.out.println("No TextBlock elements found within ComboBox.");
	    }
	    return Text;
	}

	
	public static void captureScreenshot(String screenshotName,WebDriver driver) {
		try {
			TakesScreenshot screenshot = (TakesScreenshot) driver;
			File source = screenshot.getScreenshotAs(OutputType.FILE);
			File destination = new File(screenshotName);
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			e.printStackTrace();  
		}
		
	}
	
	@DataProvider(name = "testDatavalid")   // Active
	  public Object[][] testDatavalidname() {
	      return ToleranceDataproviderClass.getUserData("Sheet1"); 
	  }
	
	
	@DataProvider(name = "testDataInactive")   //Inactive 
	  public Object[][] testDataInactivename() {
	      return ToleranceDataproviderClass.getUserData("Sheet2"); 
	  }
	
	@DataProvider(name = "testDataAdd")   //Add
	  public Object[][] testDataAdd() {
	      return ToleranceDataproviderClass.getUserData("Sheet3"); 
	  }
	
	@DataProvider(name = "testDataEmpty")   //Empty Data
	  public Object[][] testDataEmpty() {
	      return ToleranceDataproviderClass.getUserData("Sheet4"); 
	  }
	
	
	
	
}
