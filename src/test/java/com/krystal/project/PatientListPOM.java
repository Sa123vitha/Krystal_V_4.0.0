package com.krystal.project;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.appium.java_client.windows.WindowsDriver;

public class PatientListPOM {

	
	private Actions act;

	public PatientListPOM(WindowsDriver<WebElement> driver)
	{
		PageFactory.initElements(driver, this);
		act = new Actions(driver);
	}



@FindBy(name = "Patient Table List")
WebElement patientlist;

@FindBy(name = "Patient List")
WebElement Patient;

@FindBy(name = "Select All")
WebElement select;

@FindBy(name = "Age")
WebElement age;

@FindBy(name = "Created Date")
WebElement createdate;

@FindBy(name = "Date of Birth")
WebElement dob;

@FindBy(name = "Gender")
WebElement gender;

@FindBy(name = "Machine")
WebElement machine;

@FindBy(name = "Modified Date")
WebElement modified;

@FindBy(name = "Other ID")
WebElement other;

@FindBy(name = "Physician")
WebElement physician;

@FindBy(name = "Name")
WebElement name;

@FindBy(name = "RT ID")
WebElement rtid;

@FindBy(name = "Other ID")
WebElement otherid;

@FindBy(name = "Gender")
WebElement gender1;

@FindBy(name = "Date of Birth")
WebElement dob1;

@FindBy(name = "Age")
WebElement age1;

@FindBy(name = "Created date")
WebElement create;

@FindBy(name = "Modified date")
WebElement modify;

@FindBy(name = "Physician")
WebElement phy;

@FindBy(name = "Machine")
WebElement machine1;

@FindBy(name = "Male")
WebElement male;

@FindBy(name = "Female")
WebElement female;

@FindBy(name = "Others")
WebElement others;

@FindBy(name = "Patient Menu")
WebElement patientmenu;

@FindBy(name = "DEMOGRAPHICS")
WebElement demo;

@FindBy(name = "PRESCRIPTION")
WebElement pres;

@FindBy(name = "PLAN APPROVAL")
WebElement plan;

@FindBy(name = "SCHEDULING")
WebElement scheduling;

@FindBy(name = "VITALS")
WebElement vital;

@FindBy(name = "LAB REPORTS")
WebElement lab;

@FindBy(name = "TREATMENT REVIEW")
WebElement review;

@FindBy(name = "Search RT ID")
WebElement search;

@FindBy(name = "Patient List")
WebElement titlelist;

@FindBy(name = "Software Version :")
WebElement swversion;

@FindBy(name = "Licensed to : ")
WebElement license;

@FindBy(name = "Hospital_Name")
WebElement hospital;

@FindBy(xpath= "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"OpenPatientMainView\"]/Custom[@ClassName=\"OpenPatientTableView\"]/Edit[@ClassName=\"TextBox\"]/Edit[starts-with(@AutomationId,\"presenter\")]")
WebElement searchbox;

@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Window[@ClassName=\"Popup\"]/Menu[@ClassName=\"ContextMenu\"]/RadioButton[@ClassName=\"RadioButton\"][@Name=\"Name\"]")
WebElement searchname;

@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"OpenPatientMainView\"]/Custom[@ClassName=\"OpenPatientTableView\"]/Edit[@ClassName=\"TextBox\"]/Edit[starts-with(@AutomationId,\"presenter\")]")
WebElement searchnametext;

@FindBy(xpath="//Button[@HelpText='Customization']")
WebElement cust;

@FindBy(xpath="//Button[@HelpText='Search By Selection']")
WebElement searchselection;

@FindBy(xpath="//Button[@HelpText='Gender Filter']")
WebElement filter;

@FindBy(xpath="//Button[@HelpText='Search By selection']")
WebElement selection;

@FindBy(xpath= "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"FooterView\"]/Text[@ClassName=\"Text\"][@Name=\"Licensed to : HospitalName\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Licensed to : Hospital_Name\"]")
WebElement licensed;

@FindBy(xpath = "//TextBlock[contains(@Name,'Licensed to : Hospital_Name')]")                
WebElement licensed1;

@FindBy(xpath="//Button[@HelpText='Sort']")
WebElement namesort;

@FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"NavigationTopBarView\"]/Button[@AutomationId=\"ToolTip\"]") 
WebElement Menu;

@FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"NavigationTopBarView\"]/Button[@ClassName=\"Button\"]")
WebElement Signout;

@FindBy (xpath ="//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"NavigationTopBarView\"]/Button[@AutomationId=\"SearchMenuBuutton\"]")
WebElement Theme;

@FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"NavigationTopBarView\"]/Button[@AutomationId=\"SearchMenuButton\"]")
WebElement Password;


	@FindBy(name = "First")
	WebElement FirstPageButton;
	
	@FindBy(name = "Previous")
	WebElement PreviousPageButton;
	
	@FindBy(name = "Next")
	WebElement NextPageButton;
	
	@FindBy(name = "Last")
	WebElement LastPageButton;
	
	@FindBy(name = "Page")
	WebElement PageButton;
	
	@FindBy(name ="1" )
	WebElement Onelabel;
	
	@FindBy(name = "of")
	WebElement oflabel;
	
	@FindBy(name = "2")
	WebElement oftwo;
	
	@FindBy(name = "Select All")
	WebElement GselectAll;
	
	@FindBy(name = "Female")
	WebElement GFemale;
	
	@FindBy(name = "Male")
	WebElement Gmale;
	
	@FindBy(name = "Others")
	WebElement Gothers;















}