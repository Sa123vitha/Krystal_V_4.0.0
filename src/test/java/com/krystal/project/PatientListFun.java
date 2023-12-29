package com.krystal.project;

import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.windows.WindowsDriver;

public class PatientListFun extends ReferencefileChemotheraphy {
	private PatientListPOM patientlist;
	private Actions act;
	private WebElement name1;
	private WebElement RTID;
	private WebElement OtherID;
	private WebElement Age;
	private WebElement create;
	private WebElement modify;
	private Actions action;

	@Test(priority =1)
	public void Launch()  throws InterruptedException, IOException {
	//DesiredCapabilities appCapabilities = new DesiredCapabilities();
	//appCapabilities.setCapability("app", "C:\\Program Files\\Panacea Medical Technologies\\Krystal\\Krystal.exe");
	//driver = new WindowsDriver<WebElement>(new URL("http://127.0.0.1:4723"), appCapabilities);
	ReferenceSigin Sign=new ReferenceSigin();
	Sign.Patientlist(driver);
	patientlist=new PatientListPOM(driver);
	action=new Actions(driver);
	act=new Actions(driver);
	}
	

	@Test(priority = 3)
	public void Patienttablelist() throws IOException {
		 test = extent.createTest("!!!!!!!!!!PATEINT LIST FUN!!!!!!!");
		test=extent.createTest("====== GRID ======");
		test = extent.createTest(funTestCaseName()+ "Customization click", "CustomizationClick");  
		patientlist.cust.click();
		demo.isdisplayed(patientlist.select, "Select All", test,driver);
	  }

	
	@Test(priority = 4)
	public void Defaultenable() throws IOException {
		test = extent.createTest(funTestCaseName()+ "Default all the checkboxes should be enable");  
		demo.isSelected(patientlist.select, "Select All", test,driver);
		demo.isSelected(patientlist.age, "Age", test,driver);
		demo.isSelected(patientlist.createdate, "Created Date", test,driver);
		demo.isSelected(patientlist.dob, "Date of Birth", test,driver);
		demo.isSelected(patientlist.gender, "Gender", test,driver);
		demo.isSelected(patientlist.machine, "Machine", test,driver);
		demo.isSelected(patientlist.modified, "Modified Date", test,driver);
		demo.isSelected(patientlist.other, "Other ID", test,driver);
		demo.isSelected(patientlist.physician, "Physician", test,driver);
	  }
	@Test(priority = 5)
	public void Selectallclick() throws IOException
	{
		test = extent.createTest(funTestCaseName()+ "Uncheck the select all, All the checkboxes should be disable");
		patientlist.select.click();
		demo.BydefaultisSelected(patientlist.select, "Select All", test,driver);
		demo.BydefaultisSelected(patientlist.age, "Age", test,driver);
		demo.BydefaultisSelected(patientlist.createdate, "Created Date", test,driver);
		demo.BydefaultisSelected(patientlist.dob, "Date of Birth", test,driver);
		demo.BydefaultisSelected(patientlist.gender, "Gender", test,driver);
		demo.BydefaultisSelected(patientlist.machine, "Machine", test,driver);
		demo.BydefaultisSelected(patientlist.modified, "Modified Date", test,driver);
		demo.BydefaultisSelected(patientlist.other, "Other ID", test,driver);
		demo.BydefaultisSelected(patientlist.physician, "Physician", test,driver);
		patientlist.demo.click();
try {
			
			if(patientlist.age1.isDisplayed()||patientlist.create.isDisplayed()||patientlist.dob1.isDisplayed()||
					patientlist.gender1.isDisplayed()||patientlist.machine1.isDisplayed()
					||patientlist.phy.isDisplayed()||patientlist.otherid.isDisplayed())
            {
	test.fail("Patient Age is  displaying");
	test.fail("Patient Created date is  displaying");
	test.fail("Patient Date of Birth is  displaying");
	test.fail("Gender,Machine,Modifieddate,Otherid,Physician is  displaying");
	screenshot(test,driver);
             }
		}
		catch(Exception e){
			test.pass("Patient Age is not displaying");
			test.pass("Patient Created date is not displaying");
			test.pass("Patient Date of Birth is not displaying");
			test.pass("Gender,Machine,Modifieddate,Otherid,Physician is not displaying");
			screenshot(test,driver);
		}
	}

	@Test(priority = 7)
	public void Unselectge() throws IOException {
		test = extent.createTest(funTestCaseName()+ "Uncheck the age checkbox");  
		patientlist.cust.click();
		patientlist.select.click();
		patientlist.age.click();
		
		demo.BydefaultisSelected(patientlist.select, "Select All", test,driver);
		demo.BydefaultisSelected(patientlist.age, "Age", test,driver);
		demo.isSelected(patientlist.createdate, "Created Date", test,driver);
		demo.isSelected(patientlist.dob, "Date of Birth", test,driver);
		demo.isSelected(patientlist.gender, "Gender", test,driver);
		demo.isSelected(patientlist.machine, "Machine", test,driver);
		demo.isSelected(patientlist.modified, "Modified Date", test,driver);
		demo.isSelected(patientlist.other, "Other ID", test,driver);
		demo.isSelected(patientlist.physician, "Physician", test,driver);
		patientlist.demo.click();
		test = extent.createTest(funTestCaseName()+ "Uncheck Age should not display in the Grid");
		try {
			
           if(patientlist.age1.isDisplayed())
            {
	test.fail("Patient Age is  displaying");
	screenshot(test,driver);
             }
		}
		catch(Exception e){
			test.pass("Patient Age is not displaying");
			screenshot(test,driver);
		}
	  }
	@Test(priority = 8)
	public void UnselectcustomizationAge() throws IOException
	{
		test = extent.createTest(funTestCaseName()+ "Uncheck Age should is unchecked in the Customization");
		patientlist.cust.click();
		demo.BydefaultisSelected(patientlist.select, "Select All", test,driver);
		demo.BydefaultisSelected(patientlist.age, "Age", test,driver);
	}

	@Test(priority = 9)
	public void Unselectpatientlist() throws IOException {
		test = extent.createTest(funTestCaseName()+ "Uncheck CreatedDate checkbox");  
		patientlist.createdate.click();
		
		demo.BydefaultisSelected(patientlist.select, "Select All", test,driver);
		demo.BydefaultisSelected(patientlist.age, "Age", test,driver);
		demo.BydefaultisSelected(patientlist.createdate, "Created Date", test,driver);
		demo.isSelected(patientlist.dob, "Date of Birth", test,driver);
		demo.isSelected(patientlist.gender, "Gender", test,driver);
		demo.isSelected(patientlist.machine, "Machine", test,driver);
		demo.isSelected(patientlist.modified, "Modified Date", test,driver);
		demo.isSelected(patientlist.other, "Other ID", test,driver);
		demo.isSelected(patientlist.physician, "Physician", test,driver);
		patientlist.demo.click();
		test = extent.createTest(funTestCaseName()+ "Uncheck CreatedDate should not display in the Grid");
		try {
			
           if(patientlist.age1.isDisplayed()||patientlist.create.isDisplayed())
            {
	test.fail("Patient Age is  displaying");
	test.fail("Patient Created date is  displaying");
	screenshot(test,driver);
             }
		}
		catch(Exception e){
			test.pass("Patient Age is not displaying");
			test.pass("Patient Created date is not displaying");
			screenshot(test,driver);
		}
	  }
	
	@Test(priority = 11)
	public void UnselectcustomizationCreated() throws IOException
	{
		test = extent.createTest(funTestCaseName()+ "Uncheck CreatedDate unchecked in the Customization");
		patientlist.cust.click();
		demo.BydefaultisSelected(patientlist.select, "Select All", test,driver);
		demo.BydefaultisSelected(patientlist.age, "Age", test,driver);
		demo.BydefaultisSelected(patientlist.createdate, "Created Date", test,driver);
	}
	
	@Test(priority = 12)
	public void UnselectDate() throws IOException {
		test = extent.createTest(funTestCaseName()+ "Uncheck the Dateofbirth checkbox");  
		patientlist.dob.click();
		
		demo.BydefaultisSelected(patientlist.select, "Select All", test,driver);
		demo.BydefaultisSelected(patientlist.age, "Age", test,driver);
		demo.BydefaultisSelected(patientlist.createdate, "Created Date", test,driver);
		demo.BydefaultisSelected(patientlist.dob, "Date of Birth", test,driver);
		demo.isSelected(patientlist.gender, "Gender", test,driver);
		demo.isSelected(patientlist.machine, "Machine", test,driver);
		demo.isSelected(patientlist.modified, "Modified Date", test,driver);
		demo.isSelected(patientlist.other, "Other ID", test,driver);
		demo.isSelected(patientlist.physician, "Physician", test,driver);
		patientlist.demo.click();
		test = extent.createTest(funTestCaseName()+ "Uncheck Dateofbirth should not display in the Grid");
		try {
			
           if(patientlist.age1.isDisplayed()||patientlist.create.isDisplayed()||patientlist.dob1.isDisplayed())
            {
	test.fail("Patient Age is  displaying");
	test.fail("Patient Created date is  displaying");
	test.fail("Patient Date of Birth is  displaying");
	screenshot(test,driver);
             }
		}
		catch(Exception e){
			test.pass("Patient Age is not displaying");
			test.pass("Patient Created date is not displaying");
			test.pass("Patient Date of Birth is not displaying");
			screenshot(test,driver);
		}
	  }
	
	@Test(priority = 14)
	public void Unselectcustomizationdate() throws IOException
	{
		test = extent.createTest(funTestCaseName()+ "Uncheck Dateofbirth should is unchecked in the Customization");
		patientlist.cust.click();
		demo.BydefaultisSelected(patientlist.select, "Select All", test,driver);
		demo.BydefaultisSelected(patientlist.age, "Age", test,driver);
		demo.BydefaultisSelected(patientlist.createdate, "Created Date", test,driver);
		demo.BydefaultisSelected(patientlist.dob, "Date of Birth", test,driver);
	}
	
	@Test(priority = 15)
	public void UnselectGender() throws IOException {
		test = extent.createTest(funTestCaseName()+ "Uncheck the Gender checkbox");  
		patientlist.gender.click();
		
		demo.BydefaultisSelected(patientlist.select, "Select All", test,driver);
		demo.BydefaultisSelected(patientlist.age, "Age", test,driver);
		demo.BydefaultisSelected(patientlist.createdate, "Created Date", test,driver);
		demo.BydefaultisSelected(patientlist.dob, "Date of Birth", test,driver);
		demo.BydefaultisSelected(patientlist.gender, "Gender", test,driver);
		demo.isSelected(patientlist.machine, "Machine", test,driver);
		demo.isSelected(patientlist.modified, "Modified Date", test,driver);
		demo.isSelected(patientlist.other, "Other ID", test,driver);
		demo.isSelected(patientlist.physician, "Physician", test,driver);
		patientlist.demo.click();
		test = extent.createTest(funTestCaseName()+ "Uncheck Gender should not display in the Grid");
		try {
			
			 if(patientlist.age1.isDisplayed()||patientlist.create.isDisplayed()||patientlist.dob1.isDisplayed()||patientlist.gender1.isDisplayed())
            {
	test.fail("Patient Age is  displaying");
	test.fail("Patient Created date is  displaying");
	test.fail("Patient Date of Birth is  displaying");
	test.fail("Gender is  displaying");
	screenshot(test,driver);
             }
		}
		catch(Exception e){
			test.pass("Patient Age is not displaying");
			test.pass("Patient Created date is not displaying");
			test.pass("Patient Date of Birth is not displaying");
			test.pass("Patient Gender is not displaying");
			screenshot(test,driver);
		}
	  }
	
	@Test(priority = 16)
	public void UnselectcustomizationGender() throws IOException
	{
		test = extent.createTest(funTestCaseName()+ "Uncheck Gender should is unchecked in the Customization");
		patientlist.cust.click();
		demo.BydefaultisSelected(patientlist.select, "Select All", test,driver);
		demo.BydefaultisSelected(patientlist.age, "Age", test,driver);
		demo.BydefaultisSelected(patientlist.createdate, "Created Date", test,driver);
		demo.BydefaultisSelected(patientlist.dob, "Date of Birth", test,driver);
		demo.BydefaultisSelected(patientlist.gender, "Gender", test,driver);
	}
	
	
	@Test(priority = 17)
	public void UnselectMachine() throws IOException {
		test = extent.createTest(funTestCaseName()+ "Uncheck the Machine,Modified checkbox");  
		patientlist.machine.click();
		patientlist.modified.click();
		
		demo.BydefaultisSelected(patientlist.select, "Select All", test,driver);
		demo.BydefaultisSelected(patientlist.age, "Age", test,driver);
		demo.BydefaultisSelected(patientlist.createdate, "Created Date", test,driver);
		demo.BydefaultisSelected(patientlist.dob, "Date of Birth", test,driver);
		demo.BydefaultisSelected(patientlist.gender, "Gender", test,driver);
		demo.BydefaultisSelected(patientlist.machine, "Machine", test,driver);
		demo.BydefaultisSelected(patientlist.modified, "Modified Date", test,driver);
		demo.isSelected(patientlist.other, "Other ID", test,driver);
		demo.isSelected(patientlist.physician, "Physician", test,driver);
		patientlist.demo.click();
		test = extent.createTest(funTestCaseName()+ "Uncheck Machine,Modified should not display in the Grid");
		try {
			
			if(patientlist.age1.isDisplayed()||patientlist.create.isDisplayed()||patientlist.dob1.isDisplayed()||
					patientlist.gender1.isDisplayed()||patientlist.machine1.isDisplayed()||patientlist.phy.isDisplayed())
            {
	test.fail("Patient Age is  displaying");
	test.fail("Patient Created date is  displaying");
	test.fail("Patient Date of Birth is  displaying");
	test.fail("Gender,Machine,Modifieddate is  displaying");
	screenshot(test,driver);
             }
		}
		catch(Exception e){
			test.pass("Patient Age is not displaying");
			test.pass("Patient Created date is not displaying");
			test.pass("Patient Date of Birth is not displaying");
			test.pass("Gender,Machine,Modifieddate is not displaying");
			screenshot(test,driver);
		}
	  }
	
	@Test(priority = 18)
	public void UnselectcustomizationMachine() throws IOException
	{
		test = extent.createTest(funTestCaseName()+ "Uncheck Machine,Modifiedshould is unchecked in the Customization");
		patientlist.cust.click();
		demo.BydefaultisSelected(patientlist.select, "Select All", test,driver);
		demo.BydefaultisSelected(patientlist.age, "Age", test,driver);
		demo.BydefaultisSelected(patientlist.createdate, "Created Date", test,driver);
		demo.BydefaultisSelected(patientlist.dob, "Date of Birth", test,driver);
		demo.BydefaultisSelected(patientlist.gender, "Gender", test,driver);
		demo.BydefaultisSelected(patientlist.machine, "Machine", test,driver);
		demo.BydefaultisSelected(patientlist.modified, "Modified Date", test,driver);
	}
	

	
	
	@Test(priority = 19)
	public void UnselectOtherid() throws IOException {
		test = extent.createTest(funTestCaseName()+ "Uncheck the Otherid,Physician checkbox");  
		
		patientlist.other.click();
		patientlist.physician.click();
		
		demo.BydefaultisSelected(patientlist.select, "Select All", test,driver);
		demo.BydefaultisSelected(patientlist.age, "Age", test,driver);
		demo.BydefaultisSelected(patientlist.createdate, "Created Date", test,driver);
		demo.BydefaultisSelected(patientlist.dob, "Date of Birth", test,driver);
		demo.BydefaultisSelected(patientlist.gender, "Gender", test,driver);
		demo.BydefaultisSelected(patientlist.machine, "Machine", test,driver);
		demo.BydefaultisSelected(patientlist.modified, "Modified Date", test,driver);
		demo.BydefaultisSelected(patientlist.other, "Other ID", test,driver);
		demo.BydefaultisSelected(patientlist.physician, "Physician", test,driver);
		patientlist.demo.click();
		test = extent.createTest(funTestCaseName()+ "Uncheck Otherid,Physician should not display in the Grid");
		try {
			
			if(patientlist.age1.isDisplayed()||patientlist.create.isDisplayed()||patientlist.dob1.isDisplayed()||
					patientlist.gender1.isDisplayed()||patientlist.machine1.isDisplayed()
					||patientlist.phy.isDisplayed()||patientlist.otherid.isDisplayed())
            {
	test.fail("Patient Age is  displaying");
	test.fail("Patient Created date is  displaying");
	test.fail("Patient Date of Birth is  displaying");
	test.fail("Gender,Machine,Modifieddate,Otherid,Physician is  displaying");
	screenshot(test,driver);
             }
		}
		catch(Exception e){
			test.pass("Patient Age is not displaying");
			test.pass("Patient Created date is not displaying");
			test.pass("Patient Date of Birth is not displaying");
			test.pass("Gender,Machine,Modifieddate,Otherid,Physician is not displaying");
			screenshot(test,driver);
		}
	  }
	
	@Test(priority = 20)
	public void UnselectcustomizationOtherid() throws IOException
	{
		test = extent.createTest(funTestCaseName()+ "Uncheck Otherid,Physician should be unchecked in the Customization");
		patientlist.cust.click();
		demo.BydefaultisSelected(patientlist.select, "Select All", test,driver);
		demo.BydefaultisSelected(patientlist.age, "Age", test,driver);
		demo.BydefaultisSelected(patientlist.createdate, "Created Date", test,driver);
		demo.BydefaultisSelected(patientlist.dob, "Date of Birth", test,driver);
		demo.BydefaultisSelected(patientlist.gender, "Gender", test,driver);
		demo.BydefaultisSelected(patientlist.machine, "Machine", test,driver);
		demo.BydefaultisSelected(patientlist.modified, "Modified Date", test,driver);
		demo.BydefaultisSelected(patientlist.other, "Other ID", test,driver);
		demo.BydefaultisSelected(patientlist.physician, "Physician", test,driver);
		patientlist.select.click();
	}
	
	@Test(priority = 21)
	public void searchbyRTID() throws IOException, FindFailed, InterruptedException
	{
		test = extent.createTest(funTestCaseName()+ "Search by RTID");
		patientlist.selection.click();
		viewdataserachfunholiday(test,driver,1);
	}
		

	@Test(priority = 22)
public void searchbyname() throws IOException, FindFailed, InterruptedException
{
	test = extent.createTest(funTestCaseName()+ "Search by name");
	patientlist.selection.click();
	patientlist.name.click();
	Thread.sleep(1000);
	viewdataserachfunholiday(test,driver,0);
}
	

	@Test(priority = 23)
public void searchbyotherid() throws IOException, FindFailed, InterruptedException
{
	test = extent.createTest(funTestCaseName()+ "Search by otherid");
	patientlist.selection.click();
	patientlist.otherid.click();
	Thread.sleep(1000);
	viewdataserachfunholiday(test,driver,2);
}
	
	@Test(priority = 24)
	public void searchbydob() throws IOException, FindFailed, InterruptedException
	{
		test = extent.createTest(funTestCaseName()+ "Search by DOB");
		patientlist.selection.click();
		patientlist.dob.click();
		Thread.sleep(1000);
		viewdataserachfunholiday(test,driver,4);
	}
	
	@Test(priority = 25)
	public void searchbyrtid() throws IOException, FindFailed, InterruptedException
	{
		test = extent.createTest(funTestCaseName()+ "Search by RTID");
		patientlist.selection.click();
		patientlist.rtid.click();
		Thread.sleep(1000);
		viewdataserachfunholiday(test,driver,1);
	}
	

	@Test(priority = 26)
	public void GenderFemalefilter() throws IOException
	{
	test = extent.createTest(funTestCaseName()+ "Gender Female sort");
	WebElement Gender = driver.findElement(By.xpath("//Button[contains(@HelpText,'Gender Filter')]"));
	Gender.click();
	demo.isSelected(patientlist.GselectAll, "Select All", test, driver);
	demo.isSelected(patientlist.GFemale, "Female", test, driver);
	demo.isSelected(patientlist.Gmale, "Female", test, driver);
	demo.isSelected(patientlist.Gothers, "Female", test, driver);
	patientlist.Gmale.click();
	patientlist.Gothers.click();
	patientlist.patientlist.click();
	Gender.click();
	demo.isSelected(patientlist.GFemale, "Female", test, driver);
	demo.BydefaultisSelected(patientlist.Gmale, "Female", test, driver);
	demo.BydefaultisSelected(patientlist.Gothers, "Female", test, driver);
	patientlist.patientlist.click();
	try {
		if(patientlist.male.isDisplayed()||patientlist.others.isDisplayed())
		{
			test.fail("Male and Others are displayed");
		}
		
	}
	catch(Exception e){
		test.pass("Male and Others are not  displayed");
		screenshot(test,driver);
	}
	

	}
		
	@Test(priority = 27)
	public void GenderMalefilter() throws IOException, InterruptedException
	{
		test = extent.createTest(funTestCaseName()+ "Gender Male sort");
	WebElement Gender = driver.findElement(By.xpath("//Button[contains(@HelpText,'Gender Filter')]"));
	Gender.click();
	patientlist.GselectAll.click();
	Thread.sleep(1000);
	demo.isSelected(patientlist.GselectAll, "Select All", test, driver);
	demo.isSelected(patientlist.GFemale, "Female", test, driver);
	demo.isSelected(patientlist.Gmale, "Male", test, driver);
	demo.isSelected(patientlist.Gothers, "Others", test, driver);
	patientlist.GFemale.click();
	patientlist.Gothers.click();
	patientlist.patientlist.click();
	Gender.click();
	demo.BydefaultisSelected(patientlist.GFemale, "Female", test, driver);
	demo.isSelected(patientlist.Gmale, "Male", test, driver);
	demo.BydefaultisSelected(patientlist.Gothers, "Others", test, driver);
	patientlist.patientlist.click();
	try {
		if(patientlist.female.isDisplayed()||patientlist.others.isDisplayed())
		{
			test.fail("Female and Others are displayed");
		}
	}
	catch(Exception e){
		test.pass("Female and Others are not  displayed");
		screenshot(test,driver);
	}
	}
	
	@Test(priority = 28)
	public void GenderOthersfilter() throws IOException
	{
	test = extent.createTest(funTestCaseName()+ "Gender Others sort");
	WebElement Gender = driver.findElement(By.xpath("//Button[contains(@HelpText,'Gender Filter')]"));
	Gender.click();
	patientlist.GselectAll.click();
	demo.isSelected(patientlist.GselectAll, "Select All", test, driver);
	demo.isSelected(patientlist.GFemale, "Female", test, driver);
	demo.isSelected(patientlist.Gmale, "Male", test, driver);
	demo.isSelected(patientlist.Gothers, "Others", test, driver);
	patientlist.GFemale.click();
	patientlist.Gmale.click();
	patientlist.patientlist.click();
	Gender.click();
	demo.BydefaultisSelected(patientlist.GFemale, "Female", test, driver);
	demo.BydefaultisSelected(patientlist.Gmale, "Male", test, driver);
	demo.isSelected(patientlist.Gothers, "Others", test, driver);
	patientlist.patientlist.click();
	try {
		if(patientlist.female.isDisplayed()||patientlist.male.isDisplayed())
		{
			test.fail("Female and Male are displayed");
		}
		
	}
	catch(Exception e){
		test.pass("Female and Male are not  displayed");
		screenshot(test,driver);
	}
	}

	
	
	@Test(priority =44)
	public void Namesort() throws IOException, InterruptedException {
		test=extent.createTest("====== Sort Icon ======");
	test = extent.createTest(guiTestCaseName()+" To Verify the Name Sort Enabled"," Name Sort should be Enabled ");	
	name1=driver.findElements(By.xpath("//Button[@HelpText='Sort']")).get(0);
	act.moveToElement(name1).click().perform();
	 demo.isdisplayed(name1,"Name", test, driver);
	 demo.isEnabled(name1,"Name", test, driver);
	 act.moveToElement(name1).click().perform();
	}
	@Test(priority =45)
	public void ModifiedDatesort() throws IOException {
	test = extent.createTest(guiTestCaseName()+" To Verify the ModifiedDate Sort Enabled"," ModifiedDate Sort should be Enabled ");	
	modify=driver.findElements(By.xpath("//Button[@HelpText='Sort']")).get(5);
	act.moveToElement(modify).click().perform();
	 demo.isdisplayed(modify,"Modified Date", test, driver);
	 demo.isEnabled(modify,"Modified Date", test, driver);
	 act.moveToElement(modify).click().perform();
	}
	
	@Test(priority =46)
	public void Agesort() throws IOException {
	test = extent.createTest(guiTestCaseName()+" To Verify the Age Sort Enabled"," Age Sort should be Enabled ");	
	Age=driver.findElements(By.xpath("//Button[@HelpText='Sort']")).get(3);
	Age.click();
	 demo.isdisplayed(Age,"Age", test, driver);
	 demo.isEnabled(Age,"Age", test, driver);
		Age.click();
	}
	
	@Test(priority =47)
	public void OtherIDsort() throws IOException {
	test = extent.createTest(guiTestCaseName()+" To Verify the OtherID Sort Enabled"," OtherID Sort should be Enabled ");	
	OtherID=driver.findElements(By.xpath("//Button[@HelpText='Sort']")).get(2);
	act.moveToElement(OtherID).click().perform();
	 demo.isdisplayed(OtherID,"Other_ID", test, driver);
	 demo.isEnabled(OtherID,"Other_ID", test, driver);
	 act.moveToElement(OtherID).click().perform();
	}
	
	
	@Test(priority =48)
	public void CreatedDatesort() throws IOException {
	test = extent.createTest(guiTestCaseName()+" To Verify the CreatedDate Sort Enabled"," CreatedDate Sort should be Enabled ");	
	create=driver.findElements(By.xpath("//Button[@HelpText='Sort']")).get(4);
	create.click();
	 demo.isdisplayed(create,"CreatedDate", test, driver);
	 demo.isEnabled(create,"CreatedDate", test, driver);
	 create.click();
	}
	
	@Test(priority =50)
	public void RTIDsort() throws IOException {
	test = extent.createTest(guiTestCaseName()+" To Verify the RTID Sort Enabled"," RTID Sort should be Enabled ");	
	RTID=driver.findElements(By.xpath("//Button[@HelpText='Sort']")).get(1);
	act.moveToElement(RTID).click().perform();
	 demo.isdisplayed(RTID,"RTID", test, driver);
	 demo.isEnabled(RTID,"RTID", test, driver);
	 act.moveToElement(RTID).click().perform();
	}
	

	
	public void viewdataserachfunholiday(ExtentTest Test, WebDriver driver,int i) throws IOException, FindFailed, InterruptedException {
	    List<WebElement> Listrow = driver.findElements(By.className("DataGridRow"));

	    for (WebElement link : Listrow) {
	        List<WebElement> datarow = link.findElements(By.className("DataGridCell"));

	        if (datarow.size() >= 2) {
	            WebElement elementToSearch = datarow.get(i);
	            String linkText = elementToSearch.getText();

	            edit("D:\\Help\\Signin\\Searchbox.PNG");

	            WebElement searchBox = driver.switchTo().activeElement();
	            searchBox.sendKeys(linkText);
	            List<WebElement> updatedListrow = driver.findElements(By.className("DataGridRow"));
		        boolean isTextFound = false;

		        for (WebElement updatedRow : updatedListrow) {
		            WebElement updatedDelete = updatedRow.findElements(By.className("DataGridCell")).get(i);
		            String updatedText = updatedDelete.getText();

		            if (updatedText.equals(linkText)) {
		                isTextFound = true;
		                break; 
		            }
		        }

		        if (isTextFound) {
		        	test.pass(linkText + " Searched element found in datagrid");
		        } else {
		        	test.pass(linkText + " Searched element not found in datagrid");
		        }

	            // Clear the search box
	            searchBox.clear();
	            Thread.sleep(1000);
	            demo.isempty(searchBox, linkText, Test, driver);
	        }
	        break;
	    }
	}
	
	@Test(priority = 51)
	public void Physicianfilter() throws IOException
	{
		
		WebElement Physician = driver.findElement(By.xpath("//Button[contains(@HelpText,'Physician Filter')]"));
		Physician.click();
		
		
	}
	@Test(priority = 52)
	public void PhysicianSelectAll() throws IOException
	{
		test = extent.createTest(funTestCaseName()+ "Physician sort, Click on the Select All");
		demo.isSelected(patientlist.GselectAll, "Select All", test, driver);
		patientlist.GselectAll.click();
		patientlist.patientlist.click();	
	}
	//@Test(priority = 53)
	public void DataListEmpty() throws IOException
	{
		test = extent.createTest(funTestCaseName()+ "Data List Empty");
		WebElement elementToSearch = driver.findElements(By.className("DataGridRow")).get(0);
		WebElement DataGridCell = elementToSearch.findElements(By.className("DataGridCell")).get(0);
		String Name=DataGridCell.getText();
		if(Name.isBlank())
		{
			test.pass("Data is empty"+Name);
		}
		else
		{
			test.fail("Data is not  empty"+Name);
		}
	}
	
	
	
	@Test(priority = 55)
	public void Machinefilter() throws IOException
	{
		
		WebElement MachineFilter = driver.findElement(By.xpath("//Button[contains(@HelpText,'Machine Filter')]"));
		MachineFilter.click();
		
		
	}
	@Test(priority = 56)
	public void MachinefilterSelectAll() throws IOException
	{
		test = extent.createTest(funTestCaseName()+ "Machinefilter sort, Click on the Select All");
		demo.isSelected(patientlist.GselectAll, "Select All", test, driver);
		patientlist.GselectAll.click();
		patientlist.patientlist.click();	
	}
	
	
	
	//@Test(priority = 57)
	public void DataListEmptyMachinesort() throws IOException
	{
		test = extent.createTest(funTestCaseName()+ "Data List Empty");
		WebElement elementToSearch = driver.findElements(By.className("DataGridRow")).get(0);
		WebElement DataGridCell = elementToSearch.findElements(By.className("DataGridCell")).get(1);
		String Name=DataGridCell.getText();
		if(Name.isEmpty())
		{
			test.pass("Data is empty"+Name);
		}
		else
		{
			test.fail("Data is not  empty"+Name);
		}
	}
	
	
	



	


	




	public void screenshot(ExtentTest test1,WebDriver driver) throws IOException
	{
		 String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
	     String screenshotName = "D:\\Krystalnew\\error_screenshot_" + timestamp + ".png";
	     demo.captureScreenshot(screenshotName,driver);
	     test1.addScreenCaptureFromPath(screenshotName);
	}

	 


}
