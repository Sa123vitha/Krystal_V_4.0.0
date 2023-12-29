package com.krystal.project;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.ibm.icu.util.Region;

import io.appium.java_client.windows.WindowsDriver;

public class RoleConfig extends ReferencefileChemotheraphy{
	 WebElement Role;
	private WebElement select;
	private RolePOM rol;
	private WebElement select1;

	@Test(priority =1)
	public void Launch()  throws InterruptedException, IOException {
	//	DesiredCapabilities appCapabilities = new DesiredCapabilities();
	//	appCapabilities.setCapability("app", "C:\\Program Files\\Panacea Medical Technologies\\Krystal\\Krystal.exe");
	//	driver = new WindowsDriver<WebElement>(new URL("http://127.0.0.1:4723"), appCapabilities);
		ReferenceSigin Sign=new ReferenceSigin();
		Sign.Login(driver);
		Sign.Roleconfig(driver);
		rol=new RolePOM(driver);
	  }
	
	/*
 public void Krystalbutton() throws IOException
 {
	 test = extent.createTest(guiTestCaseName()+ "Krytsal Button enable by default and Menu items are displayed");
	 demo.isEnabled(Krystal, "Krystal", test, driver);
	 subtest=test.createNode(guiTestCaseName()+"Select All Label with checkbox");
	 demo.isdisplayed(, "Select All", subtest, driver);
	 subtest=test.createNode(guiTestCaseName()+"Treatment Plan Label");
	 demo.isdisplayed(, "Treatment Plan", subtest, driver);
	 subtest=test.createNode(guiTestCaseName()+"Machine Slot Label");
	 demo.isdisplayed(, "Machine Slot", subtest, driver);
	 subtest=test.createNode(guiTestCaseName()+"Holiday Settings Label");
	 demo.isdisplayed(, "Holiday Settings", subtest, driver);
	 subtest=test.createNode(guiTestCaseName()+"Templates Label");
	 demo.isdisplayed(, "Templates", subtest, driver);
	 subtest=test.createNode(guiTestCaseName()+"User Management Label");
	 demo.isdisplayed(, "UserManagement", subtest, driver);
	 
	 subtest=test.createNode(guiTestCaseName()+"General Settings Label");
	 demo.isdisplayed(, "General Settings", subtest, driver);
	 
	 subtest=test.createNode(guiTestCaseName()+"Audit Logs Label");
	 demo.isdisplayed(, "Audit Logs", subtest, driver);
	 
 }
*/
 @Test(priority =9)
	public void SelectallLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Select all label"," Select all label should be present ");	
	demo.Textcomparsion(select, "Select all", test,driver);
}
 @Test(priority =10)
 public void Rolenamevalid() throws IOException
 {
	 test = extent.createTest(funTestCaseName()+ " Rolename Entered valid data"); 

	     subtest =test.createNode(funTestCaseName()+" Rolname Entered Uppercase with Spaces");
	     randomUpper(30);
	     validcase(randomStringUpper);
	 
		 subtest =test.createNode(funTestCaseName()+" Rolname Entered Lowercase with Spaces");
		 randomLower(30);
		 validcase(randomStringLower);
		 
		 subtest =test.createNode(funTestCaseName()+" Rolname Entered Uppercase and lowercase with Spaces");
		 randomalpha(30);
		 validcase(randomStringalpha);
		 
		 subtest =test.createNode(funTestCaseName()+" Rolname Entered Numbers");
		 randomNumber(30);
		 validcase(randomStringNumber);
		 
		 subtest =test.createNode(funTestCaseName()+" Rolname Entered Specialchars");
		 randomstringtext(30);
		 validcase(randomString);		 
 }
 @Test(priority =11)
 public void Rolenameinvalid() throws IOException
 {
	 test = extent.createTest(funTestCaseName()+ " Rolename Entered invalid data, Error messages are displayed"); 
	 try {
		 subtest =test.createNode(funTestCaseName()+ " Entered data is less than 3");
		 invalidcase("Ro", "Role name length should be from 3 to 64", "Role name length should be from 3 to 64", subtest);
		 selectall();
		 }
		 catch(Exception e)
		 {
			 test.fail("Entered data is less than 3 No such element found");
		 }
	 
	 try {
		 subtest =test.createNode(funTestCaseName()+ " Entered data is Empty");
		 invalidcase("  ", "Role name cannot be blank", "Role name cannot be blank", subtest);
		 selectall();
		 }
		 catch(Exception e)
		 {
			 test.fail("No such element found");
		 } 
	 
	 try {
		 subtest =test.createNode(funTestCaseName()+ " Entered Roll name already exits");
		 invalidcase(randomStringLower, "Role name already exists", "Role name already exists", subtest);
		 selectall();
		 }
		 catch(Exception e)
		 {
			 test.fail("No such element found");
		 } 
	 try {
		 subtest =test.createNode(funTestCaseName()+ " Entered invalid  data specialchars \\,");
		 invalidcase("\\,", "Input must not contain \\ , '' , '\"", "Input must not contain \\ , '' , '\"", subtest);
		 selectall();
		 }
		 catch(Exception e)
		 {
			 test.fail("Entered invalid  data specialchars \\, No such element found");
		 }
 }



@Test(priority =13)
public void DemographicsPlan() throws InterruptedException, IOException
{
	try {
	test = extent.createTest(funTestCaseName()+ " Click on the Demographics checkbox, all the checkboxes should get enabled"); 
	 rollname("Demographics Plan", 1, test);//Treatment Plan
	 machineslot(2,test);// Demographics
	 machineslot(3,test);// View
	 machineslot(4,test);// Add
	 machineslot(5,test);// Edit
	 savedata();
	 
	 
	 test = extent.createTest(funTestCaseName()+ " UnCheck Add, All the remaining Checkboxes should be in enabled"); 
	 rollname("Demographics UnCheck Add", 1, test);// add and demographics
	 rollcheck(4,test);// TreatmentPlan
	 machineslot(2,test);// Demographics
	 machineslot(3,test);// View
	 machineslot(1,test);// Add
	 machineslot(5,test);// Edit
	 savedata();//add 
	 
	 test = extent.createTest(funTestCaseName()+ " Check Add, All the remaining Checkboxes should be in enabled");
	 rollname("Demographics Check Add", 1, test);
	 machineslot(4,test);// TreatmentPlan
	 machineslotcheck(2,test);// Demographics
	 machineslotcheck(3,test);// View
	 machineslotcheck(1,test);// Add
	 machineslotcheck(5,test);// Edit
	 savedata();
	 
	 test = extent.createTest(funTestCaseName()+ " UnCheck Edit, All the remaining Checkboxes should be in enabled"); 
	 rollcheck(5,test);// TreatmentPlan
	 machineslot(2,test);// Demographics
	 machineslot(3,test);// View
	 machineslot(1,test);// Add
	 machineslot(4,test);// Edit
	 
	 test = extent.createTest(funTestCaseName()+ " Check Edit, All the remaining Checkboxes should be in enabled");
	 machineslotcheck(5,test);// TreatmentPlan
	 machineslot(2,test);// Demographics
	 machineslot(3,test);// View
	 machineslot(1,test);// Add
	 machineslot(4,test);// Edit

	 test = extent.createTest(funTestCaseName()+ " Check View, All the remaining Checkboxes should be in disabled Except general settings");
	 machineslotmsg(3,test);
	 machineslotuncheck(2,test);// SIDDHARTH-II_C05
	 machineslot(1,test);
	 
	}
	catch(Exception e)
	{
		test.fail("No such element");
	}
	 
	 savedata();
}


public void add() throws InterruptedException, IOException
{
	 test = extent.createTest(funTestCaseName()+ " UnCheck Add, All the remaining Checkboxes should be in enabled"); 
	 rollname("Demographics UnCheck Add", 1, test);// add and demographics
	 rollcheck(4,test);// TreatmentPlan
	 machineslot(2,test);// Demographics
	 machineslot(3,test);// View
	 machineslot(1,test);// Add
	 machineslot(5,test);// Edit
	
	 
	 test = extent.createTest(funTestCaseName()+ " Check Add, All the remaining Checkboxes should be in enabled");
	 machineslotcheck(4,test);// TreatmentPlan
	 machineslot(2,test);// Demographics
	 machineslot(3,test);// View
	 machineslot(1,test);// Add
	 machineslot(5,test);// Edit
	 savedata();
}

public void PrescriptionPlan() throws InterruptedException, IOException
{
	try {
	test = extent.createTest(funTestCaseName()+ " Click on the Prescription checkbox, all the checkboxes should get enabled"); 
	 rollname("Prsecription Plan", 1, test);//Treatment Plan
	 machineslot(6,test);// Prescription
	 machineslot(7,test);// SIDDHARTH-II_C05
	 machineslot(8,test);// View
	 machineslot(9,test);// Add
	 machineslot(10,test);// Edit
	 
	 
	 test = extent.createTest(funTestCaseName()+ " UnCheck Add, All the remaining Checkboxes should be in enabled"); 
	 rollcheck(9,test);// Treatment Plan
	 machineslot(6,test);// Prescription
	 machineslot(7,test);// SIDDHARTH-II_C05
	 machineslot(8,test);// View
	 machineslot(1,test);// Add
	 machineslot(10,test);// Edit
	 
	 test = extent.createTest(funTestCaseName()+ " Check Add, All the remaining Checkboxes should be in enabled");
	 machineslotcheck(9,test);// Treatment Plan
	 machineslot(6,test);// Prescription
	 machineslot(7,test);// SIDDHARTH-II_C05
	 machineslot(8,test);// View
	 machineslot(1,test);// Add
	 machineslot(10,test);// Edit
	 
	 test = extent.createTest(funTestCaseName()+ " UnCheck Edit, All the remaining Checkboxes should be in enabled"); 
	 rollcheck(10,test);// Treatment Plan
	 machineslot(6,test);// Prescription
	 machineslot(7,test);// SIDDHARTH-II_C05
	 machineslot(8,test);// View
	 machineslot(1,test);// Add
	 machineslot(9,test);// Edit
	 
	 test = extent.createTest(funTestCaseName()+ " Check Edit, All the remaining Checkboxes should be in enabled");
	 machineslotcheck(10,test);// Treatment Plan
	 machineslot(6,test);// Prescription
	 machineslot(7,test);// SIDDHARTH-II_C05
	 machineslot(8,test);// View
	 machineslot(1,test);// Add
	 machineslot(9,test);// Edit

	 test = extent.createTest(funTestCaseName()+ " Check View, All the remaining Checkboxes should be in disabled Except general settings");
	 machineslotmsg(8,test);
	 machineslotuncheck(6,test);// SIDDHARTH-II_C05
	 machineslot(1,test);
	 
	 
	 test = extent.createTest(funTestCaseName()+ " Check Machine name, All the remaining Checkboxes should be in disabled");
	 machineslotcheck(6,test);
	 machineslotmsg(7,test);
	 machineslotuncheck(6,test);// SIDDHARTH-II_C05
	 machineslot(1,test);
	 
	}
	catch(Exception e)
	{
		test.fail("No such element");
	}
	 
	 savedata();
}
 

public void ChemotheraphyPlan() throws InterruptedException, IOException
{
	try {
	test = extent.createTest(funTestCaseName()+ " Click on the Chemotheraphy checkbox, all the checkboxes should get enabled"); 
	 rollname("Chemotheraphy Plan", 1, test);//Treatment Plan
	 machineslot(11,test);// Chemotherapy 
	 machineslot(12,test);// View
	 machineslot(13,test);// Add
	 machineslot(14,test);// Edit
	 
	 
	 test = extent.createTest(funTestCaseName()+ " UnCheck Add, All the remaining Checkboxes should be in enabled"); 
	 rollcheck(13,test);// Chemotherapy 
	 machineslot(12,test);// View
	 machineslot(11,test);// Add
	 machineslot(14,test);// Edit
	 machineslot(1,test);
	 
	 test = extent.createTest(funTestCaseName()+ " Check Add, All the remaining Checkboxes should be in enabled");
	
	 machineslotcheck(13,test);// Chemotherapy 
	 machineslot(12,test);// View
	 machineslot(11,test);// Add
	 machineslot(14,test);// Edit
	 machineslot(1,test);
	 
	 test = extent.createTest(funTestCaseName()+ " UnCheck Edit, All the remaining Checkboxes should be in enabled"); 
	 rollcheck(14,test);// Chemotherapy 
	 machineslot(12,test);// View
	 machineslot(11,test);// Add
	 machineslot(13,test);// Edit
	 machineslot(1,test);
	 
	 test = extent.createTest(funTestCaseName()+ " Check Edit, All the remaining Checkboxes should be in enabled");
	 machineslotcheck(14,test);// Chemotherapy 
	 machineslot(12,test);// View
	 machineslot(11,test);// Add
	 machineslot(13,test);// Edit
	 machineslot(1,test);
	 
	 test = extent.createTest(funTestCaseName()+ " Check View, All the remaining Checkboxes should be in disabled Except general settings");
	 machineslotmsg(12,test);
	 machineslotuncheck(11,test);// SIDDHARTH-II_C05
	 machineslot(1,test);
	 
	}
	catch(Exception e)
	{
		test.fail("No such element");
	}
	 
	 savedata();
}
 
public void PlanApprovalPlan() throws InterruptedException, IOException
{
	try {
	test = extent.createTest(funTestCaseName()+ " Click on the PlanApproval checkbox, all the checkboxes should get enabled"); 
	 rollname("Prsecription Plan", 1, test);//Treatment Plan
	 machineslot(15,test);// Plan Approval
	 machineslot(16,test);// SIDDHARTH-II_C05
	 machineslot(17,test);// View
	 machineslot(18,test);// Import
	 machineslot(19,test);// Approve
	 
	 
	 test = extent.createTest(funTestCaseName()+ " UnCheck Import, All the remaining Checkboxes should be in enabled"); 
	 rollcheck(18,test);// Plan Approval
	 machineslot(16,test);// SIDDHARTH-II_C05
	 machineslot(17,test);// View
	 machineslot(15,test);// Import
	 machineslot(19,test);// Approve
	 machineslot(1,test);// Approve
	 
	 test = extent.createTest(funTestCaseName()+ " Check Import, All the remaining Checkboxes should be in enabled");
	 machineslotcheck(18,test);// Plan Approval
	 machineslot(16,test);// SIDDHARTH-II_C05
	 machineslot(17,test);// View
	 machineslot(15,test);// Import
	 machineslot(19,test);// Approve
	 machineslot(1,test);// Approve
	 
	 test = extent.createTest(funTestCaseName()+ " UnCheck Approve, All the remaining Checkboxes should be in enabled"); 
	 rollcheck(19,test);// Plan Approval
	 machineslot(16,test);// SIDDHARTH-II_C05
	 machineslot(17,test);// View
	 machineslot(15,test);// Import
	 machineslot(18,test);// Approve
	 machineslot(1,test);
	 
	 test = extent.createTest(funTestCaseName()+ " Check Approve, All the remaining Checkboxes should be in enabled");
	 machineslotcheck(19,test);// Plan Approval
	 machineslot(16,test);// SIDDHARTH-II_C05
	 machineslot(17,test);// View
	 machineslot(15,test);// Import
	 machineslot(18,test);// Approve
	 machineslot(1,test);// Approve

	 test = extent.createTest(funTestCaseName()+ " Check View, All the remaining Checkboxes should be in disabled Except general settings");
	 machineslotmsg(17,test);
	 machineslotuncheck(15,test);// SIDDHARTH-II_C05
	 machineslot(1,test);
	 
	 
	 test = extent.createTest(funTestCaseName()+ " Check Machine name, All the remaining Checkboxes should be in disabled");
	 machineslotcheck(15,test);
	 machineslotmsg(16,test);
	 machineslotuncheck(15,test);// SIDDHARTH-II_C05
	 machineslot(1,test);
	 
	}
	catch(Exception e)
	{
		test.fail("No such element");
	}
	 
	 savedata();
}


public void ScheudlingEbrt() throws InterruptedException, IOException
{
	try {
	test = extent.createTest(funTestCaseName()+ " Click on the Scheudling EBRT checkbox, all the checkboxes should get enabled"); 
	 rollname("EBRT Scheudling", 1, test);//Treatment Plan
	 machineslot(20,test);// Scheduling
	 machineslot(21,test);// EBRT
	 machineslot(22,test);// View
	 machineslot(23,test);// Schedule
	 machineslot(24,test);// Move
	 machineslot(25,test);// Reschedule
	 machineslot(26,test);// Abort
	 
	 
	 test = extent.createTest(funTestCaseName()+ " UnCheck Scheudle, All the remaining Checkboxes should be in enabled"); 
	 rollcheck(23,test);// Scheduling
	 machineslot(21,test);// EBRT
	 machineslot(22,test);// View
	 machineslot(20,test);// Schedule
	 machineslot(24,test);// Move
	 machineslot(25,test);// Reschedule
	 machineslot(26,test);// Abort
	 machineslot(1,test);// Abort
	 
	 test = extent.createTest(funTestCaseName()+ " Check Scheudle, All the remaining Checkboxes should be in enabled");
	 machineslotcheck(23,test);// Scheduling
	 machineslot(21,test);// EBRT
	 machineslot(22,test);// View
	 machineslot(20,test);// Schedule
	 machineslot(24,test);// Move
	 machineslot(25,test);// Reschedule
	 machineslot(26,test);// Abort
	 machineslot(1,test);// Abort
	 
	 test = extent.createTest(funTestCaseName()+ " UnCheck Move, All the remaining Checkboxes should be in enabled"); 
	 rollcheck(24,test);// Scheduling
	 machineslot(21,test);// EBRT
	 machineslot(22,test);// View
	 machineslot(20,test);// Schedule
	 machineslot(23,test);// Move
	 machineslot(25,test);// Reschedule
	 machineslot(26,test);// Abort
	 machineslot(1,test);// Abort
	 
	 test = extent.createTest(funTestCaseName()+ " Check Move, All the remaining Checkboxes should be in enabled");
	 machineslotcheck(24,test);// Scheduling
	 machineslot(21,test);// EBRT
	 machineslot(22,test);// View
	 machineslot(20,test);// Schedule
	 machineslot(23,test);// Move
	 machineslot(25,test);// Reschedule
	 machineslot(26,test);// Abort
	 machineslot(1,test);// Abort
	 
	 test = extent.createTest(funTestCaseName()+ " UnCheck Rescheudle, All the remaining Checkboxes should be in enabled"); 
	 rollcheck(25,test);// Scheduling
	 machineslot(21,test);// EBRT
	 machineslot(22,test);// View
	 machineslot(20,test);// Schedule
	 machineslot(23,test);// Move
	 machineslot(24,test);// Reschedule
	 machineslot(26,test);// Abort
	 machineslot(1,test);// Abort
	 
	 test = extent.createTest(funTestCaseName()+ " Check Rescheudle, All the remaining Checkboxes should be in enabled");
	 machineslotcheck(25,test);// Scheduling
	 machineslot(21,test);// EBRT
	 machineslot(22,test);// View
	 machineslot(20,test);// Schedule
	 machineslot(23,test);// Move
	 machineslot(24,test);// Reschedule
	 machineslot(26,test);// Abort
	 machineslot(1,test);// Abort
	 
	 test = extent.createTest(funTestCaseName()+ " UnCheck Abort, All the remaining Checkboxes should be in enabled"); 
	 rollcheck(26,test);// Scheduling
	 machineslot(21,test);// EBRT
	 machineslot(22,test);// View
	 machineslot(20,test);// Schedule
	 machineslot(23,test);// Move
	 machineslot(24,test);// Reschedule
	 machineslot(25,test);// Abort
	 machineslot(1,test);// Abort
	 
	 test = extent.createTest(funTestCaseName()+ " Check Abort, All the remaining Checkboxes should be in enabled");
	 machineslotcheck(26,test);// Scheduling
	 machineslot(21,test);// EBRT
	 machineslot(22,test);// View
	 machineslot(20,test);// Schedule
	 machineslot(23,test);// Move
	 machineslot(24,test);// Reschedule
	 machineslot(25,test);// Abort
	 machineslot(1,test);// Abort
	 
	 test = extent.createTest(funTestCaseName()+ " Check View, All the remaining Checkboxes should be in disabled Except Treatment Plan");
	 machineslotmsg(22,test);
	 machineslotuncheck(20,test);// SIDDHARTH-II_C05
	 machineslot(1,test);
	 
	 
	}
	catch(Exception e)
	{
		test.fail("No such element");
	}
	 
	 savedata();
}


public void ChemotheraphyEbrt() throws InterruptedException, IOException
{
	try {
	test = extent.createTest(funTestCaseName()+ " Click on the Chemotheraphy checkbox, all the checkboxes should get enabled"); 
	 rollname("Chemotheraphy Scheudling", 1, test);//Treatment Plan

	 machineslot(20,test);// Scheduling
	 machineslot(27,test);// Chemotherapy
	 machineslot(28,test);// View
	 machineslot(29,test);// Schedule
	 machineslot(30,test);// Move
	 machineslot(31,test);// Rechedule
	 machineslot(32,test);// Abort
	 
	 
	 test = extent.createTest(funTestCaseName()+ " UnCheck ChemotheraphyScheudle, All the remaining Checkboxes should be in enabled");  
	 rollcheck(29,test);// Scheduling
	 machineslot(27,test);// Chemotherapy
	 machineslot(28,test);// View
	 machineslot(20,test);// Schedule
	 machineslot(30,test);// Move
	 machineslot(31,test);// Rechedule
	 machineslot(32,test);// Abort
	 machineslot(1,test);// Abort
	 
	 test = extent.createTest(funTestCaseName()+ " Check ChemotheraphyScheudle, All the remaining Checkboxes should be in enabled");
	 
	 machineslotcheck(29,test);// Scheduling
	 machineslot(27,test);// Chemotherapy
	 machineslot(28,test);// View
	 machineslot(20,test);// Schedule
	 machineslot(30,test);// Move
	 machineslot(31,test);// Rechedule
	 machineslot(32,test);// Abort
	 machineslot(1,test);// Abort
	 
	 test = extent.createTest(funTestCaseName()+ " UnCheck ChemotheraphyMove, All the remaining Checkboxes should be in enabled"); 
	 rollcheck(30,test);// Scheduling
	 machineslot(27,test);// Chemotherapy
	 machineslot(28,test);// View
	 machineslot(20,test);// Schedule
	 machineslot(29,test);// Move
	 machineslot(31,test);// Rechedule
	 machineslot(32,test);// Abort
	 machineslot(1,test);// Abort
	 
	 test = extent.createTest(funTestCaseName()+ " Check ChemotheraphyMove, All the remaining Checkboxes should be in enabled");
	 machineslotcheck(30,test);// Scheduling
	 machineslot(27,test);// Chemotherapy
	 machineslot(28,test);// View
	 machineslot(20,test);// Schedule
	 machineslot(29,test);// Move
	 machineslot(31,test);// Rechedule
	 machineslot(32,test);// Abort
	 machineslot(1,test);// Abort
	 
	 test = extent.createTest(funTestCaseName()+ " UnCheck ChemotheraphyRescheudle, All the remaining Checkboxes should be in enabled"); 
	 rollcheck(31,test);// Scheduling
	 machineslot(27,test);// Chemotherapy
	 machineslot(28,test);// View
	 machineslot(20,test);// Schedule
	 machineslot(29,test);// Move
	 machineslot(30,test);// Rechedule
	 machineslot(32,test);// Abort
	 machineslot(1,test);// Abort
	 
	 test = extent.createTest(funTestCaseName()+ " Check ChemotheraphyRescheudle, All the remaining Checkboxes should be in enabled");
	 machineslotcheck(31,test);// Scheduling
	 machineslot(27,test);// Chemotherapy
	 machineslot(28,test);// View
	 machineslot(20,test);// Schedule
	 machineslot(29,test);// Move
	 machineslot(30,test);// Rechedule
	 machineslot(32,test);// Abort
	 machineslot(1,test);// Abort
	 
	 test = extent.createTest(funTestCaseName()+ " UnCheck ChemotheraphyAbort, All the remaining Checkboxes should be in enabled"); 
	 rollcheck(32,test);// Scheduling
	 machineslot(27,test);// Chemotherapy
	 machineslot(28,test);// View
	 machineslot(20,test);// Schedule
	 machineslot(29,test);// Move
	 machineslot(30,test);// Rechedule
	 machineslot(31,test);// Abort
	 machineslot(1,test);// Abort
	 
	 test = extent.createTest(funTestCaseName()+ " Check ChemotheraphyAbort, All the remaining Checkboxes should be in enabled");
	 machineslotcheck(32,test);// Scheduling
	 machineslot(27,test);// Chemotherapy
	 machineslot(28,test);// View
	 machineslot(20,test);// Schedule
	 machineslot(29,test);// Move
	 machineslot(30,test);// Rechedule
	 machineslot(31,test);// Abort
	 machineslot(1,test);// Abort
	 
	 machineslot(20,test);// Scheduling
	 machineslot(27,test);// Chemotherapy
	 machineslot(28,test);// View
	 machineslot(29,test);// Schedule
	 machineslot(30,test);// Move
	 machineslot(31,test);// Rechedule
	 machineslot(32,test);// Abort
	 
	 test = extent.createTest(funTestCaseName()+ " Check ChemotheraphyView, All the remaining Checkboxes should be in disabled Except Treatment Plan");
	 machineslotmsg(28,test);
	 machineslotuncheck(27,test);// SIDDHARTH-II_C05
	 machineslot(1,test);
	}
	catch(Exception e)
	{
		test.fail("No such element");
	}
	 
	 savedata();
}

public void Vitals() throws InterruptedException, IOException
{
	try {
	test = extent.createTest(funTestCaseName()+ " Click on the Vitals checkbox, all the checkboxes should get enabled"); 
	 rollname("Vitals", 1, test);//Treatment Plan
	 machineslot(33,test);// Vitals
	 machineslot(34,test);// View
	 machineslot(35,test);// Add
	 machineslot(36,test); //Edit
	 
	 
	 test = extent.createTest(funTestCaseName()+ " UnCheck Add, All the remaining Checkboxes should be in enabled"); 
	
	 rollcheck(35,test);// Vitals
	 machineslot(34,test);// View
	 machineslot(33,test);// Add
	 machineslot(36,test); //Edit
	 machineslot(1,test); //Edit
	 
	 test = extent.createTest(funTestCaseName()+ " Check Add, All the remaining Checkboxes should be in enabled");
	 
	 machineslotcheck(35,test);// Vitals
	 machineslot(34,test);// View
	 machineslot(33,test);// Add
	 machineslot(36,test); //Edit
	 machineslot(1,test); //Edit
	 
	 test = extent.createTest(funTestCaseName()+ " UnCheck Edit, All the remaining Checkboxes should be in enabled"); 
	 rollcheck(36,test);// Vitals
	 machineslot(34,test);// View
	 machineslot(33,test);// Add
	 machineslot(35,test); //Edit
	 machineslot(1,test); //Edit
	 
	 test = extent.createTest(funTestCaseName()+ " Check Edit, All the remaining Checkboxes should be in enabled");
	 machineslotcheck(36,test);// Vitals
	 machineslot(34,test);// View
	 machineslot(33,test);// Add
	 machineslot(35,test); //Edit
	 machineslot(1,test); //Edit

	 test = extent.createTest(funTestCaseName()+ " Check View, All the remaining Checkboxes should be in disabled Except general settings");
	 machineslotmsg(34,test);
	 machineslotuncheck(33,test);// SIDDHARTH-II_C05
	 machineslot(1,test);
	 
	}
	catch(Exception e)
	{
		test.fail("No such element");
	}
	 
	 savedata();

}

public void LabReports() throws InterruptedException, IOException
{
	try {
	test = extent.createTest(funTestCaseName()+ " Click on the Laberports checkbox, all the checkboxes should get enabled"); 
	 rollname("LabReports", 1, test);//Treatment Plan
	 machineslot(37,test);// LabReports
	 machineslot(38,test);// View
	 machineslot(39,test);// Add
	 machineslot(40,test);// Edit
	 
	 test = extent.createTest(funTestCaseName()+ " UnCheck Add, All the remaining Checkboxes should be in enabled"); 

	 rollcheck(39,test);// LabReports
	 machineslot(38,test);// View
	 machineslot(37,test);// Add
	 machineslot(40,test);// Edit
	 machineslot(1,test); //Edit
	 
	 test = extent.createTest(funTestCaseName()+ " Check Add, All the remaining Checkboxes should be in enabled");
	 machineslotcheck(39,test);// LabReports
	 machineslot(38,test);// View
	 machineslot(37,test);// Add
	 machineslot(40,test);// Edit
	 machineslot(1,test); //Edit
	 
	 test = extent.createTest(funTestCaseName()+ " UnCheck Edit, All the remaining Checkboxes should be in enabled"); 
	 rollcheck(40,test);// LabReports
	 machineslot(38,test);// View
	 machineslot(37,test);// Add
	 machineslot(39,test);// Edit
	 machineslot(1,test); //Edit
	 
	 test = extent.createTest(funTestCaseName()+ " Check Edit, All the remaining Checkboxes should be in enabled");
	 machineslotcheck(40,test);// LabReports
	 machineslot(38,test);// View
	 machineslot(37,test);// Add
	 machineslot(39,test);// Edit
	 machineslot(1,test); //Edit

	 test = extent.createTest(funTestCaseName()+ " Check View, All the remaining Checkboxes should be in disabled Except general settings");
	 machineslotmsg(38,test);
	 machineslotuncheck(37,test);// SIDDHARTH-II_C05
	 machineslot(1,test);
	}
	catch(Exception e)
	{
		test.fail("No such element");
	}
	 
	 savedata();

}


public void TreatmentReview() throws InterruptedException, IOException
{


	test = extent.createTest(funTestCaseName()+ " Click on the Treatment Plan checkbox, Treatment Rview Checkbox should get enabled"); 
	 rollname("Treatment Review", 1, test);//Treatment Plan
	 machineslot(41,test);
	 test = extent.createTest(funTestCaseName()+ " Click on the Treatment Review checkbox, Treatment Rview Checkbox should get Disabled"); 
	 rollcheck(41,test);
	 
	 test = extent.createTest(funTestCaseName()+ " Click on the Treatment Review checkbox, Treatment Rview Checkbox should get Enabled");
	 machineslotcheck(41,test);
	 
	 savedata();
}
 
 
 
 
 
 
 
 
 
 
 
@Test(priority =15)
 public void Machineslotcheck() throws InterruptedException, IOException
 {
	 test = extent.createTest(funTestCaseName()+ " Click on the Machine slot checkbox, all the checkboxes should get enabled"); 
	 rollname("Machine slot", 2, test);
	 machineslot(3,test);// SIDDHARTH-II_C05
	 machineslot(4,test);// View
	 machineslot(5,test);// MachineQA
	 machineslot(6,test);// RFA
	 machineslot(7,test);// Fractionsperhour 

	 test = extent.createTest(funTestCaseName()+ " Uncheck Machine QA, All the remaining Checkboxes should be in enabled");
	 rollcheck(5,test);
	 machineslot(3,test);// SIDDHARTH-II_C05
	 machineslot(4,test);// View
	 machineslot(6,test);// RFA
	 machineslot(7,test);// Fractionsperhour 
	 
	 test = extent.createTest(funTestCaseName()+ " Check Machine QA, All the remaining Checkboxes should be in enabled");
	 machineslotcheck(5,test);
	 machineslot(3,test);// SIDDHARTH-II_C05
	 machineslot(4,test);// View
	 machineslot(6,test);// RFA
	 machineslot(7,test);// Fractionsperhour 
	 
	 test = extent.createTest(funTestCaseName()+ " Uncheck RFA, All the remaining Checkboxes should be in enabled");
	 rollcheck(6,test);// RFA
	 machineslot(3,test);// SIDDHARTH-II_C05
	 machineslot(4,test);// View
	 machineslot(5,test);
	 machineslot(7,test);// Fractionsperhour 
	 
	 test = extent.createTest(funTestCaseName()+ " Check RFA, All the remaining Checkboxes should be in enabled");
	 machineslotcheck(6,test);// RFA
	 machineslot(3,test);// SIDDHARTH-II_C05
	 machineslot(4,test);// View
	 machineslot(5,test);
	 machineslot(7,test);// Fractionsperhour 
	 
	 
	 test = extent.createTest(funTestCaseName()+ " Uncheck Fractionperhour, All the remaining Checkboxes should be in enabled");
	 rollcheck(7,test);// RFA
	 machineslot(3,test);// SIDDHARTH-II_C05
	 machineslot(4,test);// View
	 machineslot(5,test);
	 machineslot(6,test);// Fractionsperhour 
	 
	 test = extent.createTest(funTestCaseName()+ " Check Fractionperhour, All the remaining Checkboxes should be in enabled");
	 machineslotcheck(7,test);
	 machineslot(3,test);// SIDDHARTH-II_C05
	 machineslot(4,test);// View
	 machineslot(5,test);// RFA
	 machineslot(6,test);// Fractionsperhour 
	 
	 test = extent.createTest(funTestCaseName()+ " Check View, All the remaining Checkboxes should be in disabled");
	 machineslotmsg(4,test);
	 machineslotuncheck(2,test);// SIDDHARTH-II_C05
	 
	 test = extent.createTest(funTestCaseName()+ " Check Machine name, All the remaining Checkboxes should be in disabled");
	 machineslotcheck(2,test);
	 machineslotmsg(3,test);
	 machineslotuncheck(2,test);// SIDDHARTH-II_C05
	 
	 savedata();
	
	 
}
@Test(priority =18)
public void holidaysettings() throws IOException, InterruptedException
{
	test = extent.createTest(funTestCaseName()+ " Click on the Holidaysettings checkbox, all the checkboxes should get enabled"); 
	 rollname("Holiday Settings", 3, test);
	 machineslot(4,test);// View
	 machineslot(5,test);// Add
	 machineslot(6,test);// Edit 
	 
	 test = extent.createTest(funTestCaseName()+ " UnCheck Add, All the remaining Checkboxes should be in enabled"); 
	 rollcheck(5,test);
	 machineslot(4,test);// View
	 machineslot(6,test);// Edit 
	 
	 test = extent.createTest(funTestCaseName()+ " Check Add, All the remaining Checkboxes should be in enabled");
	 machineslotcheck(5,test);
	 machineslot(4,test);// View
	 machineslot(6,test);// Edit 
	 
	 test = extent.createTest(funTestCaseName()+ " UnCheck Edit, All the remaining Checkboxes should be in enabled"); 
	 rollcheck(6,test);
	 machineslot(4,test);// View
	 machineslot(5,test);// Edit 
	 
	 test = extent.createTest(funTestCaseName()+ " Check Edit, All the remaining Checkboxes should be in enabled");
	 machineslotcheck(6,test);
	 machineslot(4,test);// View
	 machineslot(5,test);// Edit 
	 
	 test = extent.createTest(funTestCaseName()+ " Check View, All the remaining Checkboxes should be in disabled");
	 machineslotmsg(4,test);
	 machineslotuncheck(3,test);// SIDDHARTH-II_C05	 
	 
	 savedata();
}
@Test(priority =20)
public void Template() throws IOException, InterruptedException
{
	test = extent.createTest(funTestCaseName()+ " Click on the Templates checkbox, all the checkboxes should get enabled"); 
	 rollname("Templates", 4, test);
	 machineslot(5,test);// Sid
	 machineslot(6,test);// View
	 machineslot(7,test);// Add
	 machineslot(8,test);// Edit
	 
	 test = extent.createTest(funTestCaseName()+ " UnCheck Add, All the remaining Checkboxes should be in enabled"); 
	 rollcheck(7,test);
	 machineslot(5,test);// Sid
	 machineslot(6,test);// View
	 machineslot(8,test);// Edit
	 
	 test = extent.createTest(funTestCaseName()+ " Check Add, All the remaining Checkboxes should be in enabled");
	 machineslotcheck(7,test);
	 machineslot(5,test);// Sid
	 machineslot(6,test);// View
	 machineslot(8,test);// Edit
	 
	 test = extent.createTest(funTestCaseName()+ " UnCheck Edit, All the remaining Checkboxes should be in enabled"); 
	 rollcheck(8,test);
	 machineslot(5,test);// Sid
	 machineslot(6,test);// View
	 machineslot(7,test);// Edit
	 
	 test = extent.createTest(funTestCaseName()+ " Check Edit, All the remaining Checkboxes should be in enabled");
	 machineslotcheck(8,test);
	 machineslot(5,test);// Sid
	 machineslot(6,test);// View
	 machineslot(7,test);// Edit

	 test = extent.createTest(funTestCaseName()+ " Check View, All the remaining Checkboxes should be in disabled");
	 machineslotmsg(6,test);
	 machineslotuncheck(4,test);// SIDDHARTH-II_C05
	 
	 test = extent.createTest(funTestCaseName()+ " Check Machine name, All the remaining Checkboxes should be in disabled");
	 machineslotcheck(4,test);
	 machineslotmsg(5,test);
	 machineslotuncheck(4,test);// SIDDHARTH-II_C05
	 
	 savedata();
}

@Test(priority =22)
public void Auditlogscheck() throws IOException, InterruptedException
{
	 test = extent.createTest(funTestCaseName()+ " Click on the Auditlogs checkbox, all the checkboxes should get enabled"); 
	 rollname("Auditlogs", 7, test);
	 machineslot(8,test);// View
	 machineslot(9,test);// Export
	 
	 test = extent.createTest(funTestCaseName()+ " UnCheck on the Export checkbox, All the checkboxes should be enabled"); 
	 rollcheck(9,test);
	 machineslot(7,test);// Logs
	 machineslot(9,test);// View
	 
	 test = extent.createTest(funTestCaseName()+ " Check on the Export checkbox, All the checkboxes should be enabled"); 
	 machineslotcheck(9,test);
	 machineslot(7,test);// Logs
	 machineslot(9,test);// View
	 
	 test = extent.createTest(funTestCaseName()+ " Check View, All the remaining Checkboxes should be in disabled");
	 machineslotmsg(9,test);
	 machineslotuncheck(7,test);// SIDDHARTH-II_C05
	 
	 savedata();
}
@Test(priority =24)
public void usermanagement() throws IOException, InterruptedException
{
	test = extent.createTest(funTestCaseName()+ " Click on the UserManagement checkbox, all the checkboxes should get enabled"); 
	 rollname("User Management", 5, test);
	 machineslot(6,test);// View
	 machineslot(7,test);// Add
	 machineslot(8,test);// Edit 
	 
	 test = extent.createTest(funTestCaseName()+ " UnCheck Add, All the remaining Checkboxes should be in enabled"); 
	 rollcheck(7,test);
	 machineslot(6,test);// View
	 machineslot(8,test);// Edit 
	 
	 test = extent.createTest(funTestCaseName()+ " Check Add, All the remaining Checkboxes should be in enabled");
	 machineslotcheck(7,test);
	 machineslot(6,test);// View
	 machineslot(8,test);// Edit 
	 
	 test = extent.createTest(funTestCaseName()+ " UnCheck Edit, All the remaining Checkboxes should be in enabled"); 
	 rollcheck(8,test);
	 machineslot(6,test);// View
	 machineslot(7,test);// Edit 
	 
	 test = extent.createTest(funTestCaseName()+ " Check Edit, All the remaining Checkboxes should be in enabled");
	 machineslotcheck(8,test);
	 machineslot(6,test);// View
	 machineslot(7,test);// Edit 
	 
	 test = extent.createTest(funTestCaseName()+ " Check View, All the remaining Checkboxes should be in disabled");
	 machineslotmsg(6,test);
	 machineslotuncheck(5,test);// SIDDHARTH-II_C05	
	 
	 savedata();
}

@Test(priority =27)
public void GeneralSettingsAPR() throws IOException, InterruptedException
{
	try {
	test = extent.createTest(funTestCaseName()+ " Click on the APR Settings checkbox, all the checkboxes should get enabled"); 
	 rollname("APR Settings", 6, test);
	 machineslot(7,test);// APR Settings
	 machineslot(8,test);// SIDDHARTH-II_C05
	 machineslot(9,test);// View
	 machineslot(10,test);// Add
	 machineslot(11,test);// Edit
	 
	 
	 test = extent.createTest(funTestCaseName()+ " UnCheck Add, All the remaining Checkboxes should be in enabled"); 
	 rollcheck(10,test);// APR Settings
	 machineslot(8,test);// SIDDHARTH-II_C05
	 machineslot(9,test);// View
	 machineslot(7,test);// Add
	 machineslot(11,test);// Edit
	 
	 test = extent.createTest(funTestCaseName()+ " Check Add, All the remaining Checkboxes should be in enabled");
	 machineslotcheck(10,test);// APR Settings
	 machineslot(8,test);// SIDDHARTH-II_C05
	 machineslot(9,test);// View
	 machineslot(7,test);// Add
	 machineslot(11,test);// Edit
	
	 test = extent.createTest(funTestCaseName()+ " UnCheck Edit, All the remaining Checkboxes should be in enabled"); 
	 rollcheck(11,test);// APR Settings
	 machineslot(8,test);// SIDDHARTH-II_C05
	 machineslot(9,test);// View
	 machineslot(7,test);// Add
	 machineslot(10,test);// Edit
	 
	 test = extent.createTest(funTestCaseName()+ " Check Edit, All the remaining Checkboxes should be in enabled");
	 machineslotcheck(11,test);// APR Settings
	 machineslot(8,test);// SIDDHARTH-II_C05
	 machineslot(9,test);// View
	 machineslot(7,test);// Add
	 machineslot(10,test);// Edit

	 test = extent.createTest(funTestCaseName()+ " Check View, All the remaining Checkboxes should be in disabled Except general settings");
	 machineslotmsg(9,test);
	 machineslotuncheck(7,test);// SIDDHARTH-II_C05
	 machineslot(6,test);
	 
	 test = extent.createTest(funTestCaseName()+ " Check Machine name, All the remaining Checkboxes should be in disabled");
	 machineslotcheck(7,test);
	 machineslotmsg(8,test);
	 machineslotuncheck(7,test);// SIDDHARTH-II_C05
	 machineslot(6,test);
	 Thread.sleep(1000);
	}
	catch(Exception e)
	{
		test.fail("No such element");
	}
	 
	 savedata();
}

@Test(priority =30)
public void GeneralSettingsAPRCBCT() throws IOException, InterruptedException
{
	try {
	test = extent.createTest(funTestCaseName()+ " Click on the APR Settings checkbox, all the checkboxes should get enabled"); 
	 rollname("APR CBCTSettings", 6, test);
	 machineslot(12,test);// APR Settings
	 machineslot(13,test);// SIDDHARTH-II_C05
	 machineslot(14,test);// View
	 machineslot(15,test);// Add
	 machineslot(16,test);// Edit
	 
	 
	 test = extent.createTest(funTestCaseName()+ " UnCheck Add, All the remaining Checkboxes should be in enabled"); 
	 rollcheck(15,test);// APR Settings
	 machineslot(13,test);// SIDDHARTH-II_C05
	 machineslot(14,test);// View
	 machineslot(16,test);// Add
	 machineslot(12,test);// Edit
	 
	 test = extent.createTest(funTestCaseName()+ " Check Add, All the remaining Checkboxes should be in enabled");
	 machineslotcheck(15,test);// APR Settings
	 machineslot(13,test);// SIDDHARTH-II_C05
	 machineslot(14,test);// View
	 machineslot(16,test);// Add
	 machineslot(12,test);// Edit
	
	 test = extent.createTest(funTestCaseName()+ " UnCheck Edit, All the remaining Checkboxes should be in enabled"); 
	 rollcheck(12,test);// APR Settings
	 machineslot(13,test);// SIDDHARTH-II_C05
	 machineslot(14,test);// View
	 machineslot(16,test);// Add
	 machineslot(15,test);// Edit
	 
	 test = extent.createTest(funTestCaseName()+ " Check Edit, All the remaining Checkboxes should be in enabled");
	 machineslotcheck(12,test);// APR Settings
	 machineslot(13,test);// SIDDHARTH-II_C05
	 machineslot(14,test);// View
	 machineslot(16,test);// Add
	 machineslot(15,test);// Edit

	 test = extent.createTest(funTestCaseName()+ " Check View, All the remaining Checkboxes should be in disabled Except general settings");
	 machineslotmsg(14,test);
	 machineslotuncheck(12,test);// SIDDHARTH-II_C05
	 machineslot(6,test);
	 
	 test = extent.createTest(funTestCaseName()+ " Check Machine name, All the remaining Checkboxes should be in disabled");
	 machineslotcheck(12,test);
	 machineslotmsg(13,test);
	 machineslotuncheck(12,test);// SIDDHARTH-II_C05
	 machineslot(6,test);
	 Thread.sleep(1000);
	}
	catch(Exception e)
	{
	 savedata();
	}
}

@Test(priority =33)
public void ChemoConfiguration() throws IOException, InterruptedException
{
	try {
	 test = extent.createTest(funTestCaseName()+ " Click on the Chemptheraphy configuration checkbox, all the checkboxes should get enabled"); 
	 rollname("Classification chemotheraphy",6, test);
	 machineslot(17,test);// Chemotherapy Configuration
	 machineslot(18,test);// Classification
	 machineslot(19,test);// View
	 machineslot(20,test);// Add
	 machineslot(21,test);// Edit
	 
	 test = extent.createTest(funTestCaseName()+ " UnCheck Add, All the remaining Checkboxes should be in enabled"); 
	 
	 rollcheck(20,test);// Chemotherapy Configuration
	 machineslot(18,test);// Classification
	 machineslot(19,test);// View
	 machineslot(17,test);// Add
	 machineslot(21,test);// Edit
	 
	 test = extent.createTest(funTestCaseName()+ " Check Add, All the remaining Checkboxes should be in enabled");
	 machineslotcheck(20,test);// Chemotherapy Configuration
	 machineslot(18,test);// Classification
	 machineslot(19,test);// View
	 machineslot(17,test);// Add
	 machineslot(21,test);// Edit
	 
	
	 test = extent.createTest(funTestCaseName()+ " UnCheck Edit, All the remaining Checkboxes should be in enabled"); 
	 rollcheck(21,test);// Chemotherapy Configuration
	 machineslot(18,test);// Classification
	 machineslot(19,test);// View
	 machineslot(17,test);// Add
	 machineslot(20,test);// Edit
	 
	 test = extent.createTest(funTestCaseName()+ " Check Edit, All the remaining Checkboxes should be in enabled");
	 machineslotcheck(21,test);// Chemotherapy Configuration
	 machineslot(18,test);// Classification
	 machineslot(19,test);// View
	 machineslot(17,test);// Add
	 machineslot(20,test);// Edit

	 test = extent.createTest(funTestCaseName()+ " Check View, All the remaining Checkboxes should be in disabled Except general settings");
	 machineslotmsg(19,test);
	 machineslotuncheck(18,test);// SIDDHARTH-II_C05
	 machineslot(6,test);
	 
	}
	catch(Exception e)
	{
	 savedata();
	}
}


@Test(priority =36)
public void RegimenConfiguration() throws IOException, InterruptedException
{
	try {
	 test = extent.createTest(funTestCaseName()+ " Click on the Regimen configuration checkbox, all the checkboxes should get enabled"); 
	 rollname("Regimen chemotheraphy",6, test);
	 machineslot(17,test);// Chemotherapy Configuration
	 machineslot(22,test);// Classification
	 machineslot(23,test);// View
	 machineslot(24,test);// Add
	 machineslot(25,test);// Edit
	 
	 test = extent.createTest(funTestCaseName()+ " UnCheck Add, All the remaining Checkboxes should be in enabled"); 
	 rollcheck(24,test);// Chemotherapy Configuration
	 machineslot(22,test);// Classification
	 machineslot(23,test);// View
	 machineslot(17,test);// Add
	 machineslot(25,test);// Edit
	 
	 test = extent.createTest(funTestCaseName()+ " Check Add, All the remaining Checkboxes should be in enabled");
	 machineslotcheck(24,test);// Chemotherapy Configuration
	 machineslot(22,test);// Classification
	 machineslot(23,test);// View
	 machineslot(17,test);// Add
	 machineslot(25,test);// Edit
	 
	
	 test = extent.createTest(funTestCaseName()+ " UnCheck Edit, All the remaining Checkboxes should be in enabled");
	 rollcheck(25,test);// Chemotherapy Configuration
	 machineslot(22,test);// Classification
	 machineslot(23,test);// View
	 machineslot(17,test);// Add
	 machineslot(24,test);// Edit
	
	 
	 test = extent.createTest(funTestCaseName()+ " Check Edit, All the remaining Checkboxes should be in enabled");
	 machineslotcheck(21,test);// Chemotherapy Configuration
	 machineslot(22,test);// Classification
	 machineslot(23,test);// View
	 machineslot(17,test);// Add
	 machineslot(20,test);// Edit

	 test = extent.createTest(funTestCaseName()+ " Check View, All the remaining Checkboxes should be in disabled Except general settings");
	 machineslotmsg(23,test);
	 machineslotuncheck(22,test);// SIDDHARTH-II_C05
	 machineslot(6,test);
	 
	}
	catch(Exception e)
	{
	 savedata();
	}
}

@Test(priority =38)
public void RadioConfiguration() throws IOException, InterruptedException
{
	try {
	 test = extent.createTest(funTestCaseName()+ " Click on the Radio configuration checkbox, all the checkboxes should get enabled"); 
	 rollname("Radio chemotheraphy",6, test);
	 machineslot(17,test);// Chemotherapy Configuration
	 machineslot(26,test);// Radio
	 machineslot(27,test);// View
	 machineslot(28,test);// Add
	 machineslot(29,test);// Edit
	 
	 test = extent.createTest(funTestCaseName()+ " UnCheck Add, All the remaining Checkboxes should be in enabled");  
	 rollcheck(28,test);// Chemotherapy Configuration
	 machineslot(26,test);// Radio
	 machineslot(27,test);// View
	 machineslot(17,test);// Add
	 machineslot(29,test);// Edit
	 
	 test = extent.createTest(funTestCaseName()+ " Check Add, All the remaining Checkboxes should be in enabled");
	 machineslotcheck(28,test);// Chemotherapy Configuration
	 machineslot(26,test);// Radio
	 machineslot(27,test);// View
	 machineslot(17,test);// Add
	 machineslot(29,test);// Edit
	 
	
	 test = extent.createTest(funTestCaseName()+ " UnCheck Edit, All the remaining Checkboxes should be in enabled");
	 rollcheck(29,test);// Chemotherapy Configuration
	 machineslot(26,test);// Radio
	 machineslot(27,test);// View
	 machineslot(17,test);// Add
	 machineslot(28,test);// Edit
	 
	 test = extent.createTest(funTestCaseName()+ " Check Edit, All the remaining Checkboxes should be in enabled");
	 machineslotcheck(29,test);// Chemotherapy Configuration
	 machineslot(26,test);// Radio
	 machineslot(27,test);// View
	 machineslot(17,test);// Add
	 machineslot(28,test);// Edit

	 test = extent.createTest(funTestCaseName()+ " Check View, All the remaining Checkboxes should be in disabled Except general settings");
	 machineslotmsg(27,test);
	 machineslotuncheck(26,test);// SIDDHARTH-II_C05
	 machineslot(6,test);

	}
	catch(Exception e)
	{
	 savedata();
	}
}

@Test(priority =40)
public void Drug() throws IOException, InterruptedException
{
	try {
	 test = extent.createTest(funTestCaseName()+ " Click on the Drug configuration checkbox, all the checkboxes should get enabled"); 
	 rollname("Drug chemotheraphy",6, test);
	 machineslot(17,test);// Chemotherapy Configuration
	 machineslot(30,test);// Drug
	 machineslot(31,test);// View
	 machineslot(32,test);// Add
	 machineslot(33,test);// Edit
	 
	 test = extent.createTest(funTestCaseName()+ " UnCheck Add, All the remaining Checkboxes should be in enabled");  
	 rollcheck(32,test);// Chemotherapy Configuration
	 machineslot(30,test);// Drug
	 machineslot(31,test);// View
	 machineslot(17,test);// Add
	 machineslot(33,test);// Edit
	 
	 test = extent.createTest(funTestCaseName()+ " Check Add, All the remaining Checkboxes should be in enabled");
	 machineslotcheck(32,test);// Chemotherapy Configuration
	 machineslot(30,test);// Drug
	 machineslot(31,test);// View
	 machineslot(17,test);// Add
	 machineslot(33,test);// Edit
	 
	
	 test = extent.createTest(funTestCaseName()+ " UnCheck Edit, All the remaining Checkboxes should be in enabled");
	 rollcheck(33,test);// Chemotherapy Configuration
	 machineslot(30,test);// Drug
	 machineslot(31,test);// View
	 machineslot(17,test);// Add
	 machineslot(32,test);// Edit
	 
	 test = extent.createTest(funTestCaseName()+ " Check Edit, All the remaining Checkboxes should be in enabled");
	 machineslotcheck(33,test);// Chemotherapy Configuration
	 machineslot(30,test);// Drug
	 machineslot(31,test);// View
	 machineslot(17,test);// Add
	 machineslot(32,test);// Edit

	 test = extent.createTest(funTestCaseName()+ " Check View, All the remaining Checkboxes should be in disabled Except general settings");
	 machineslotmsg(31,test);
	 machineslotuncheck(30,test);// SIDDHARTH-II_C05
	 machineslot(6,test);

	}
	catch(Exception e)
	{
	 savedata();
	}
}
@Test(priority =42)
public void Fieldconfig() throws InterruptedException, IOException
{
	test = extent.createTest(funTestCaseName()+ " Click on the Field Configuration checkbox, all the checkboxes should get enabled"); 
	 rollname("Field Configuration", 6, test);
	 machineslot(34,test);// FieldConfiguration
	 machineslot(35,test);// SIDDHARTH-II_C05
	 machineslot(36,test);// View
	 machineslot(37,test);// Add
	 machineslot(38,test);// Edit
	 
	 test = extent.createTest(funTestCaseName()+ " UnCheck Add, All the remaining Checkboxes should be in enabled"); 
	 rollcheck(37,test);// FieldConfiguration
	 machineslot(35,test);// SIDDHARTH-II_C05
	 machineslot(36,test);// View
	 machineslot(34,test);// Add
	 machineslot(38,test);// Edit
	 
	 test = extent.createTest(funTestCaseName()+ " Check Add, All the remaining Checkboxes should be in enabled");
	 machineslotcheck(37,test);// FieldConfiguration
	 machineslot(35,test);// SIDDHARTH-II_C05
	 machineslot(36,test);// View
	 machineslot(34,test);// Add
	 machineslot(38,test);// Edit
	
	 test = extent.createTest(funTestCaseName()+ " UnCheck Edit, All the remaining Checkboxes should be in enabled"); 
	 rollcheck(38,test);// FieldConfiguration
	 machineslot(35,test);// SIDDHARTH-II_C05
	 machineslot(36,test);// View
	 machineslot(34,test);// Add
	 machineslot(37,test);// Edit
	 
	 test = extent.createTest(funTestCaseName()+ " Check Edit, All the remaining Checkboxes should be in enabled");
	 machineslotcheck(38,test);// FieldConfiguration
	 machineslot(35,test);// SIDDHARTH-II_C05
	 machineslot(36,test);// View
	 machineslot(34,test);// Add
	 machineslot(37,test);// Edit

	 test = extent.createTest(funTestCaseName()+ " Check View, All the remaining Checkboxes should be in disabled Except general settings");
	 machineslotmsg(38,test);
	 machineslotuncheck(12,test);// SIDDHARTH-II_C05
	 machineslot(6,test);
	 
	 test = extent.createTest(funTestCaseName()+ " Check Machine name, All the remaining Checkboxes should be in disabled");
	 machineslotcheck(12,test);
	 machineslotmsg(13,test);
	 machineslotuncheck(12,test);// SIDDHARTH-II_C05
	 machineslot(6,test);
	 
	 Thread.sleep(1000);
	 
	 savedata();
}

public void MachineQAcheck() throws InterruptedException, IOException
{
	test = extent.createTest(funTestCaseName()+ " Click on the MachineQA checkbox, all the checkboxes should get enabled"); 
	 rollname("Machine QA", 6, test);
	 machineslot(39,test);// Machine QA
	 machineslot(40,test);// SIDDHARTH-II_C05
	 machineslot(41,test);// View
	 machineslot(42,test);// Add
	 machineslot(43,test);// Edit
	 
	 test = extent.createTest(funTestCaseName()+ " UnCheck Add, All the remaining Checkboxes should be in enabled"); 
	 rollcheck(42,test);// Machine QA
	 machineslot(40,test);// SIDDHARTH-II_C05
	 machineslot(41,test);// View
	 machineslot(39,test);// Add
	 machineslot(43,test);// Edit
	 
	 test = extent.createTest(funTestCaseName()+ " Check Add, All the remaining Checkboxes should be in enabled");
	 machineslotcheck(42,test);// Machine QA
	 machineslot(40,test);// SIDDHARTH-II_C05
	 machineslot(41,test);// View
	 machineslot(39,test);// Add
	 machineslot(43,test);// Edit
	
	 test = extent.createTest(funTestCaseName()+ " UnCheck Edit, All the remaining Checkboxes should be in enabled"); 
	 rollcheck(43,test);// Machine QA
	 machineslot(40,test);// SIDDHARTH-II_C05
	 machineslot(41,test);// View
	 machineslot(39,test);// Add
	 machineslot(42,test);// Edit
	 
	 test = extent.createTest(funTestCaseName()+ " Check Edit, All the remaining Checkboxes should be in enabled");
	 
	 machineslotcheck(43,test);// Machine QA
	 machineslot(40,test);// SIDDHARTH-II_C05
	 machineslot(41,test);// View
	 machineslot(39,test);// Add
	 machineslot(42,test);// Edit

	 test = extent.createTest(funTestCaseName()+ " Check View, All the remaining Checkboxes should be in disabled Except general settings");
	 machineslotmsg(41,test);
	 machineslotuncheck(39,test);// SIDDHARTH-II_C05
	 machineslot(6,test);
	 
	 test = extent.createTest(funTestCaseName()+ " Check Machine name, All the remaining Checkboxes should be in disabled");
	 machineslotcheck(39,test);
	 machineslotmsg(40,test);
	 machineslotuncheck(39,test);// SIDDHARTH-II_C05
	 machineslot(6,test);
	 
	 Thread.sleep(1000);
	 
	 savedata();
}

public void RoleConfiguration() throws InterruptedException, IOException
{
	test = extent.createTest(funTestCaseName()+ " Click on the Role configuration checkbox, all the checkboxes should get enabled"); 
	 rollname("Role Configuration", 6, test);
	 machineslot(44,test);// RoleConfiguration 
	 machineslot(45,test);// View
	 machineslot(46,test);// Add
	 machineslot(47,test);// Edit
	 
	 test = extent.createTest(funTestCaseName()+ " UnCheck Add, All the remaining Checkboxes should be in enabled");  
	 rollcheck(46,test);// RoleConfiguration 
	 machineslot(45,test);// View
	 machineslot(44,test);// Add
	 machineslot(47,test);// Edit
	 
	 test = extent.createTest(funTestCaseName()+ " Check Add, All the remaining Checkboxes should be in enabled");
	 machineslotcheck(46,test);// RoleConfiguration 
	 machineslot(45,test);// View
	 machineslot(44,test);// Add
	 machineslot(47,test);// Edit
	
	 test = extent.createTest(funTestCaseName()+ " UnCheck Edit, All the remaining Checkboxes should be in enabled"); 
	 rollcheck(47,test);// RoleConfiguration 
	 machineslot(45,test);// View
	 machineslot(44,test);// Add
	 machineslot(46,test);// Edit
	 
	 test = extent.createTest(funTestCaseName()+ " Check Edit, All the remaining Checkboxes should be in enabled"); 
	 machineslotcheck(47,test);// RoleConfiguration 
	 machineslot(45,test);// View
	 machineslot(44,test);// Add
	 machineslot(46,test);// Edit

	 test = extent.createTest(funTestCaseName()+ " Check View, All the remaining Checkboxes should be in disabled Except general settings");
	 machineslotmsg(45,test);
	 machineslotuncheck(44,test);// SIDDHARTH-II_C05
	 machineslot(6,test);
	
	 Thread.sleep(1000);
	 savedata();
}

public void SiteConfiguration() throws InterruptedException, IOException
{
	test = extent.createTest(funTestCaseName()+ " Click on the Role configuration checkbox, all the checkboxes should get enabled"); 
	 rollname("Site Configuration", 6, test);
	 
	 machineslot(48,test);// SiteConfig 
	 machineslot(49,test);// View
	 machineslot(50,test);// Add
	 machineslot(51,test);// Edit
	 
	 test = extent.createTest(funTestCaseName()+ " UnCheck Add, All the remaining Checkboxes should be in enabled");  
	 rollcheck(50,test);// SiteConfig 
	 machineslot(49,test);// View
	 machineslot(48,test);// Add
	 machineslot(51,test);// Edit
	 
	 test = extent.createTest(funTestCaseName()+ " Check Add, All the remaining Checkboxes should be in enabled");
	 machineslotcheck(50,test);// SiteConfig 
	 machineslot(49,test);// View
	 machineslot(48,test);// Add
	 machineslot(51,test);// Edit
	
	 test = extent.createTest(funTestCaseName()+ " UnCheck Edit, All the remaining Checkboxes should be in enabled"); 
	 rollcheck(51,test);// SiteConfig 
	 machineslot(49,test);// View
	 machineslot(48,test);// Add
	 machineslot(50,test);// Edit
	 
	 test = extent.createTest(funTestCaseName()+ " Check Edit, All the remaining Checkboxes should be in enabled"); 
	 machineslotcheck(51,test);// SiteConfig 
	 machineslot(49,test);// View
	 machineslot(48,test);// Add
	 machineslot(50,test);// Edit

	 test = extent.createTest(funTestCaseName()+ " Check View, All the remaining Checkboxes should be in disabled Except general settings");
	 machineslotmsg(49,test);
	 machineslotuncheck(48,test);// SIDDHARTH-II_C05
	 machineslot(6,test);
	
	 Thread.sleep(1000);
	 savedata();
}

public void TolernaceConfiguration() throws InterruptedException, IOException// work
{
	test = extent.createTest(funTestCaseName()+ " Click on the Tolerance Configuration, all the checkboxes should get enabled"); 
	 rollname("Tolerance Configuration", 6, test);

	 machineslot(52,test);// ToleranceSettings
	 machineslot(53,test);// SIDDHARTH-II_C05
	 machineslot(54,test);// View
	 machineslot(55,test);// Add
	 machineslot(56,test);// Edit
	 
	 test = extent.createTest(funTestCaseName()+ " UnCheck Add, All the remaining Checkboxes should be in enabled"); 
	 rollcheck(55,test);// ToleranceSettings
	 machineslot(53,test);// SIDDHARTH-II_C05
	 machineslot(54,test);// View
	 machineslot(52,test);// Add
	 machineslot(56,test);// Edit
	 
	 test = extent.createTest(funTestCaseName()+ " Check Add, All the remaining Checkboxes should be in enabled");
	 machineslotcheck(55,test);// ToleranceSettings
	 machineslot(53,test);// SIDDHARTH-II_C05
	 machineslot(54,test);// View
	 machineslot(52,test);// Add
	 machineslot(56,test);// Edit
	
	 test = extent.createTest(funTestCaseName()+ " UnCheck Edit, All the remaining Checkboxes should be in enabled"); 
	 rollcheck(56,test);// ToleranceSettings
	 machineslot(53,test);// SIDDHARTH-II_C05
	 machineslot(54,test);// View
	 machineslot(52,test);// Add
	 machineslot(55,test);// Edit
	 
	 test = extent.createTest(funTestCaseName()+ " Check Edit, All the remaining Checkboxes should be in enabled");
	 rollcheck(55,test);// ToleranceSettings
	 machineslot(53,test);// SIDDHARTH-II_C05
	 machineslot(54,test);// View
	 machineslot(52,test);// Add
	 machineslot(56,test);// Edit

	 test = extent.createTest(funTestCaseName()+ " Check View, All the remaining Checkboxes should be in disabled Except general settings");
	 machineslotmsg(54,test);
	 machineslotuncheck(52,test);// SIDDHARTH-II_C05
	 machineslot(6,test);
	 
	 test = extent.createTest(funTestCaseName()+ " Check Machine name, All the remaining Checkboxes should be in disabled");
	 machineslotcheck(52,test);
	 machineslotmsg(54,test);
	 machineslotuncheck(52,test);// SIDDHARTH-II_C05
	 machineslot(6,test);
	 
	 Thread.sleep(1000);
	 
	 savedata();
}

public void DesignationConfiguration() throws InterruptedException, IOException
{
	test = extent.createTest(funTestCaseName()+ " Click on the Role configuration checkbox, all the checkboxes should get enabled"); 
	 rollname("Designation configuration", 6, test);
	 
	 machineslot(57,test);// DesignationConfig
	 machineslot(58,test);// View
	 machineslot(59,test);// Add
	 machineslot(60,test);// Edit
	 
	 test = extent.createTest(funTestCaseName()+ " UnCheck Add, All the remaining Checkboxes should be in enabled");  
	 rollcheck(59,test);// DesignationConfig
	 machineslot(58,test);// View
	 machineslot(57,test);// Add
	 machineslot(60,test);// Edit
	 
	 test = extent.createTest(funTestCaseName()+ " Check Add, All the remaining Checkboxes should be in enabled");
	 machineslotcheck(59,test);// DesignationConfig
	 machineslot(58,test);// View
	 machineslot(57,test);// Add
	 machineslot(60,test);// Edit
	
	 test = extent.createTest(funTestCaseName()+ " UnCheck Edit, All the remaining Checkboxes should be in enabled"); 
	 rollcheck(60,test);// DesignationConfig
	 machineslot(58,test);// View
	 machineslot(57,test);// Add
	 machineslot(59,test);// Edit
	 
	 test = extent.createTest(funTestCaseName()+ " Check Edit, All the remaining Checkboxes should be in enabled"); 
	 machineslotcheck(60,test);// DesignationConfig
	 machineslot(58,test);// View
	 machineslot(57,test);// Add
	 machineslot(59,test);// Edit

	 test = extent.createTest(funTestCaseName()+ " Check View, All the remaining Checkboxes should be in disabled Except general settings");
	 machineslotmsg(58,test);
	 machineslotuncheck(57,test);// SIDDHARTH-II_C05
	 machineslot(6,test);
	
	 Thread.sleep(1000);
	 savedata();
}

@Test(priority =45)
public void Treatment() throws InterruptedException, IOException
{
	test = extent.createTest(funTestCaseName()+ " Check Select all, All the remaining Checkboxes should be in enabled");
	Treatmentname("Select all",test);
	rol.Treatment.click();
	selectall();
	machineslot(1,test);// Machine name
	machineslot(2,test);// Work
	machineslot(3,test);//Daily
	machineslot(4,test);//Dosi
	machineslot(5,test);//Source
	savedata();
	
	test = extent.createTest(funTestCaseName()+ " Click on the Machine name, All the remaining Checkboxes should be in enabled");
	Treatmentname("Treatment1",test);
	rol.Treatment.click();
	machineslotcheck(1,test);
	Thread.sleep(1000);
	selctenbaled();
	machineslot(2,test);// Work
	machineslot(3,test);//Daily
	machineslot(4,test);//Dosi
	machineslot(5,test);//Source
	savedata();
	
	test = extent.createTest(funTestCaseName()+ " Uncheck the Worklist");
	Treatmentname("Treatment1",test);
	rol.Treatment.click();
	selectall();
	machineslotmsg(2,test);
	machineslotuncheck(2,test);
	machineslot(3,test);
	machineslot(4,test);
	machineslot(5,test);
	selctdisabled();
	savedata();
	
	
	
	test = extent.createTest(funTestCaseName()+ " Uncheck the DailyQA");
	Treatmentname("Treatment1",test);
	rol.Treatment.click();
	selectall();
	machineslotmsg(3,test);
	machineslotuncheck(3,test);
	machineslot(2,test);
	machineslot(4,test);
	machineslot(5,test);
	selctdisabled();
	savedata();
	
	
	test = extent.createTest(funTestCaseName()+ " Uncheck the Dosimetry");
	Treatmentname("Treatment1",test);
	rol.Treatment.click();
	selectall();
	machineslotmsg(4,test);
	machineslotuncheck(4,test);
	machineslot(3,test);
	machineslot(2,test);
	machineslot(5,test);
	selctdisabled();
	savedata();
	
	test = extent.createTest(funTestCaseName()+ " Uncheck the SourceSettings");
	Treatmentname("Treatment1",test);
	rol.Treatment.click();
	selectall();
	machineslotmsg(5,test);
	machineslotuncheck(5,test);
	machineslot(3,test);
	machineslot(2,test);
	machineslot(4,test);
	selctdisabled();
	savedata();
	
}
@Test(priority =48)
public void Imageviewer() throws IOException
{
	rol.ImageViewer.click();
	test = extent.createTest(funTestCaseName()+ " Click on the ImageViewer, Button should get enabled");
	demo.isEnabled(rol.ImageViewer, "ImageViewer", test, driver);
	
	test = extent.createTest(funTestCaseName()+ " Click on the ImageViewer, Login should get displayed");
	demo.isdisplayed(rol.Login, "Login", test, driver);
	
	test = extent.createTest(funTestCaseName()+ " Imageviewer Login in not selcted bydefault");
	demo.BydefaultisSelected(rol.Login, "Login", test, driver);
	
	test = extent.createTest(funTestCaseName()+ " Imageviewer login check");
	rol.Login.click();
	demo.isSelected(rol.Login,"Login",test,driver);
	demo.isEnabled(rol.Save, "Save", test, driver);
	
	rol.CTAndroid.click();
	test = extent.createTest(funTestCaseName()+ " Click on the CTAndroid, Button should get enabled");
	demo.isEnabled(rol.CTAndroid, "CT Android", test, driver);
	
	test = extent.createTest(funTestCaseName()+ " Click on the CTandroid, Login should get displayed");
	demo.isdisplayed(rol.Login, "Login", test, driver);
	
	test = extent.createTest(funTestCaseName()+ " CTandroid Login in not selcted bydefault");
	demo.BydefaultisSelected(rol.Login, "Login", test, driver);
	
	test = extent.createTest(funTestCaseName()+ " CTandroid login check");
	rol.Login.click();
	demo.isSelected(rol.Login,"Login",test,driver);
	demo.isEnabled(rol.Save, "Save", test, driver);
	
	rol.DemographicsAndroid.click();
	test = extent.createTest(funTestCaseName()+ " Click on the Demographics, Button should get enabled");
	demo.isEnabled(rol.DemographicsAndroid, "Demographics Android", test, driver);
	
	test = extent.createTest(funTestCaseName()+ " Click on the Demographics, Login should get displayed");
	demo.isdisplayed(rol.Login, "Login", test, driver);
	
	test = extent.createTest(funTestCaseName()+ " Demographics Login in not selcted bydefault");
	demo.BydefaultisSelected(rol.Login, "Login", test, driver);
	
	test = extent.createTest(funTestCaseName()+ " Demographics login check");
	rol.Login.click();
	demo.isSelected(rol.Login,"Login",test,driver);
	demo.isEnabled(rol.Save, "Save", test, driver);
}


public void Roleadd() throws IOException
{
	test = extent.createTest(funTestCaseName()+ " Click on the Addicon");	
	
}

@Test(priority =50)
public void refresh() throws IOException, FindFailed, InterruptedException
{
	 test = extent.createTest(funTestCaseName()+ "Click on Refresh icon pop-up message should be displayed"); 
	 randomstringtext(30);
	 rol.rolename.click();
	 driver.switchTo().activeElement().sendKeys(randomString);
	
	 Roleconfig("D:\\Help\\Role\\Refersh.PNG"); 
	 
	 subtest=test.createNode(funTestCaseName()+ "Click on Cancel button pop-up should be closed and Rolname should be displayed");
	 Rollcancel("Role Configuration","The data you entered will be lost. Do you want to continue?","Role Configuration","The data you entered will be lost. Do you want to continue?",subtest,driver);
	 demo.isnotempty(rol.rolename, randomString, subtest, driver);
	 Roleconfig("D:\\Help\\Role\\Refersh.PNG"); 
	 
	 subtest=test.createNode(funTestCaseName()+ "Click on OK button pop-up should be closed and Rolname should be Empty");
	 Rollsave("Role Configuration","The data you entered will be lost. Do you want to continue?","Role Configuration","The data you entered will be lost. Do you want to continue?",subtest,driver);
	 demo.isempty(rol.rolename, randomString, subtest, driver); 
}

@Test(priority =52)
public void Addicon() throws IOException, FindFailed, InterruptedException
{
	 test = extent.createTest(funTestCaseName()+ "Enter the data and Click on Addicon icon pop-up message should be displayed"); 
	 randomstringtext(30);
	 rol.rolename.click();
	 driver.switchTo().activeElement().sendKeys(randomString);
	
	 Roleconfig("D:\\Help\\Role\\Radd.PNG"); 
	 
	 subtest=test.createNode(funTestCaseName()+ "Click on Cancel button pop-up should be closed and Rolname should be displayed");
	 Rollcancel("Role Configuration","The data you entered will be lost. Do you want to continue?","Role Configuration","The data you entered will be lost. Do you want to continue?",subtest,driver);
	 demo.isnotempty(rol.rolename, randomString, subtest, driver);
	 Roleconfig("D:\\Help\\Role\\Radd.PNG"); 
	 
	 subtest=test.createNode(funTestCaseName()+ "Click on OK button pop-up should be closed and Rolname should be Empty");
	 
	 Rollsave("Role Configuration","The data you entered will be lost. Do you want to continue?","Role Configuration","The data you entered will be lost. Do you want to continue?",subtest,driver);
	 demo.isempty(rol.rolename, randomString, subtest, driver); 
}
@Test(priority =54)
public void Editicon() throws IOException, FindFailed, InterruptedException
{
	 test = extent.createTest(funTestCaseName()+ "Edit button functionality"); 
	
	 Roleconfig("D:\\Help\\Role\\Redit.PNG"); 
	 
	 subtest=test.createNode(funTestCaseName()+ "Click on Edit button,Update button should be enable");
	 demo.isEnabled(rol.Update, selectedBeamtype, subtest, driver);
	 demo.Textcomparsion(rol.Update,"UPDATE",subtest, driver);

	 subtest=test.createNode(funTestCaseName()+ "Click on Update button, Without any changes in data.");
	 update();
	 Rollcancel("Role Configuration","For role configuration applicability changes to take effect, application has to be signed out. Do you want to continue?","Role Configuration",
			 "For role configuration applicability changes to take effect, application has to be signed out. Do you want to continue?",subtest,driver);
	 
	 subtest=test.createNode(funTestCaseName()+ "Click on OK button, Update pop-up should be present");
	 update();
	 Rollsave("Role Configuration","For role configuration applicability changes to take effect, application has to be signed out. Do you want to continue?","Role Configuration",
			 "For role configuration applicability changes to take effect, application has to be signed out. Do you want to continue?",subtest,driver);
	 Rollsave("Role Update","Selected Role updated.","Role Update","Selected Role updated.", subtest,driver);
	 subtest=test.createNode(funTestCaseName()+ "Click on OK button in update, Signin screen is displayed");
	 Thread.sleep(6000);
	 demo.isdisplayed(rol.Signin, "Signin", subtest, driver);
	 ReferenceSigin Sign=new ReferenceSigin();
	 Sign.Login(driver);
	 Sign.Roleconfig(driver);
	 Thread.sleep(4000);
	 subtest=test.createNode(funTestCaseName()+ "Click on Update button, Edit the data");
	 Roleconfig("D:\\Help\\Role\\Redit.PNG");
	 selectall();
	 selectall();
	 update();
	 Rollsave("Role Configuration","For role configuration applicability changes to take effect, application has to be signed out. Do you want to continue?","Role Configuration",
			 "For role configuration applicability changes to take effect, application has to be signed out. Do you want to continue?",subtest,driver);
	 Rollsave("Role Update","Selected Role updated.","Role Update","Selected Role updated.", subtest,driver);
	 subtest=test.createNode(funTestCaseName()+ "Click on OK button in update, Signin screen is displayed");
	 Thread.sleep(6000);
	 demo.isdisplayed(rol.Signin, "Signin", subtest, driver);
	 Sign.Login(driver);
	 Sign.Roleconfig(driver);
	 
}
@Test(priority =56)
public void SelectAllbutton() throws IOException
{
	 test = extent.createTest(funTestCaseName()+ " Select All Button Enable and disable functionality");
	 subtest=test.createNode(funTestCaseName()+ " Default Select all button should be Enable");
	 demo.isEnabled(rol.SelectAll, "Select All", subtest, driver);
	 
	 subtest=test.createNode(funTestCaseName()+ " Click on Select all checkbox, Select all should be disable");
	 selectall();
	 demo.isSelected(rol.select, "Select All", subtest, driver);
	 demo.BydefaultisEnabled(rol.SelectAll, " Select All", subtest, driver);
	 
	 subtest=test.createNode(funTestCaseName()+ " Click on Select ALL button,Select checkbox should be enable and Select all button should be disable");
	 rol.SelectAll.click();
	 demo.isSelected(rol.select, "Select All", subtest, driver);
	 demo.BydefaultisEnabled(rol.SelectAll, "Select All", subtest, driver);
	 
	 subtest=test.createNode(funTestCaseName()+ " Click on Select checkbox once enabled, Checkbox should get disabled and Select all button should get enabled");
	 selectall();
	 demo.BydefaultisSelected(rol.select, "Select All", subtest, driver);
	 demo.isEnabled(rol.SelectAll, "Select All", subtest, driver);
}
@Test(priority =58)
public void SearchRole() throws IOException, FindFailed, InterruptedException
{
	 test = extent.createTest(funTestCaseName()+ " Search button functionality");
	 subtest=test.createNode(funTestCaseName()+ "Click on the search button and enter the numbers"); 
	 Roleconfig("D:\\Help\\Role\\Rsearch.PNG");
	 driver.switchTo().activeElement().sendKeys(randomStringNumber);
	 driver.switchTo().activeElement().clear();
	 Thread.sleep(1000);
	 subtest=test.createNode(funTestCaseName()+ "Click on the search button and enter the charcters"); 
	 Roleconfig("D:\\Help\\Role\\Rsearch.PNG");
	 Thread.sleep(1000);
	 driver.switchTo().activeElement().sendKeys("hgjh"); 
}
 public void machineslot(int i,ExtentTest test1) throws InterruptedException, IOException
 {
	 WebElement checkbox = driver.findElements(By.className("CheckBox")).get(i);
	 demo.isSelected(checkbox,"checkbox", test1, driver);
 }
 
 public void machineslotuncheck(int i,ExtentTest test1) throws InterruptedException, IOException
 {
	 WebElement checkbox = driver.findElements(By.className("CheckBox")).get(i);
	 demo.BydefaultisSelected(checkbox,"checkbox", test1, driver);
 }
 
 public void machineslotcheck(int i,ExtentTest test1) throws InterruptedException, IOException
 {
	 WebElement checkbox = driver.findElements(By.className("CheckBox")).get(i);
	 checkbox.click();
	 demo.isSelected(checkbox,"checkbox", test1, driver);
 }
 
 public void machineslotmsg(int i,ExtentTest test1) throws InterruptedException, IOException
 {
	 WebElement checkbox = driver.findElements(By.className("CheckBox")).get(i);
	 checkbox.click();
 }
 
 public void rollcheck(int i,ExtentTest test1) throws IOException, InterruptedException
 {
	 WebElement checkbox = driver.findElements(By.className("CheckBox")).get(i);
	 checkbox.click();
	 demo.BydefaultisSelected(checkbox,"checkbox", test1, driver); 
 }
 
 public void rollviewcheck(int i,ExtentTest test1,int j) throws InterruptedException, IOException
 {
	 WebElement checkbox = driver.findElements(By.className("CheckBox")).get(i);
	 checkbox.click();
	 demo.BydefaultisSelected(checkbox,"checkbox", test1, driver);
	 
	 WebElement checkbox1 = driver.findElements(By.className("CheckBox")).get(j);
	 demo.BydefaultisSelected(checkbox1,"checkbox1", test1, driver);
 }
 
 
 
 
 public void rollname(String Text, int i, ExtentTest test1) throws InterruptedException, IOException
 {
	 rol.rolename.click();
	 driver.switchTo().activeElement().sendKeys(Text);
	 WebElement checkbox = driver.findElements(By.className("CheckBox")).get(i);
	 checkbox.click();
	 demo.isSelected(checkbox,"checkbox", test1, driver);
 }
 
 public void Treatmentname(String Text,ExtentTest test1) throws InterruptedException, IOException
 {
	 rol.rolename.click();
	 driver.switchTo().activeElement().sendKeys(Text);
 }

 public void update()
 {
	 rol.Update.click();
 }
 
 public void validcase(String Text)
 {
	 try {
		 rol.rolename.click();
		 driver.switchTo().activeElement().sendKeys(Text);
		 demo.ByValidErrormessage(rol.rolename, Text, subtest, driver);
		 selectall();
		 subtest =test.createNode(funTestCaseName()+" Save Button enabled when enetered data");
		 demo.isEnabled(rol.Save, "Save", subtest, driver);
		 savedata();
		 }
		 catch(Exception e)
		 {
			 test.fail("Pop-up is not displayed");
		 } 
 }
 
 public void invalidcase(String Text, String InputText, String ExceptedDescription, ExtentTest test1) throws IOException
 {
	 rol.rolename.click();
	 driver.switchTo().activeElement().clear();
	 driver.switchTo().activeElement().sendKeys(Text); 
	 selectall();
	 demo.isEnabled(rol.Save, "Save", test1, driver);
	 rol.Save.click();
	 errormessagedisplayed1(InputText,ExceptedDescription,test1);	
 }
 
 public void Roleconfig(String Text) throws FindFailed {
	 Screen screen = new Screen();
	 String imagePath = Text;
	 Pattern pattern = new Pattern(imagePath);
     Match match = screen.find(pattern);
     match.click();
 }
 	
public void selectall() throws IOException
{
	rol.select.click();
	
}

public void selctenbaled() throws IOException
{
	demo.isEnabled(rol.select, "Select All", test, driver);
}

public void selctdisabled() throws IOException
{
	demo.BydefaultisEnabled(rol.select, "Select All", test, driver);
}
	
public void savedata() throws InterruptedException, IOException
{
	rol.Save.click();
	subtest=test.createNode(funTestCaseName()+"Pop-up titlaname, description and ok button verification");
	Rollsave("Role Save","Role data saved.","Role Save","Role data saved.", subtest,driver);
}


	  
}
