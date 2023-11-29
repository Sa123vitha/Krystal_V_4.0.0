package com.krystal.project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.windows.WindowsDriver;

public class DemographicsPOM extends ReferencefileChemotheraphy {
	
	WindowsDriver<WebElement> driver;
 
	public DemographicsPOM(WindowsDriver<WebElement> driver)
	{
		PageFactory.initElements(driver, this);
	}

	    @FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"NavigationTopBarView\"]/Button[@AutomationId=\"ToolTip\"]") 
		WebElement Menu;
		
	    @FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"NavigationTopBarView\"]/Button[@ClassName=\"Button\"]")
		WebElement Signout;
		
	    @FindBy (xpath ="//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"NavigationTopBarView\"]/Button[@AutomationId=\"SearchMenuBuutton\"]")
	    WebElement Theme;
		
	    @FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"NavigationTopBarView\"]/Button[@AutomationId=\"SearchMenuButton\"]")
	    WebElement Password;
		
	    @FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"NavigationTopBarView\"]/Text[@ClassName=\"Text\"][@Name=\"Demographics\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Demographics\"]")
	    WebElement Titlename;
		
	    @FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"NavigationTopBarView\"]/Image[@ClassName=\"Image\"]")
	    WebElement Productlogo;
		
	    @FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"NavigationTopBarSubView\"]/Button[@ClassName=\"Button\"]")
	    WebElement Patientlist;
		
	    @FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"NavigationTopBarSubView\"]/Button[@ClassName=\"Button\"]") 
	    WebElement Addpatient;
		
	    @FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"SideMenuSubView\"]/Text[@ClassName=\"Text\"][@Name=\"Patient Menu\"]/Text[@Name=\"Patient Menu\"][@AutomationId=\"Label\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Patient Menu\"]")
	    WebElement PatientMenu;
		
	    @FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"SideMenuSubView\"]/Button[@ClassName=\"Button\"][@Name=\"DEMOGRAPHICS\"]")
	    WebElement Demographics;
	    
	    @FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"SideMenuSubView\"]/Button[@ClassName=\"Button\"][@Name=\"PRESCRIPTION\"]")
	    WebElement Prescription;
	    
	    @FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"SideMenuSubView\"]/Button[@ClassName=\"Button\"][@Name=\"PLAN APPROVAL\"]")
	    WebElement PlanAprroval;
	    
	    @FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"SideMenuSubView\"]/Button[@ClassName=\"Button\"][@Name=\"SCHEDULING\"]")
	    WebElement Scheudling;
	    
	    @FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"SideMenuSubView\"]/Button[@ClassName=\"Button\"][@Name=\"VITALS\"]")
	    WebElement Vitals;
	    
	    @FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"SideMenuSubView\"]/Button[@ClassName=\"Button\"][@Name=\"LAB REPORTS\"]")
	    WebElement LabReports;
	    
	    @FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"SideMenuSubView\"]/Button[@ClassName=\"Button\"][@Name=\"TREATMENT REVIEW\"]")
	    WebElement TreatmentReview;

	    @FindBy (name = "PATIENT BASIC INFORMATION")
	    WebElement PBI;
	    
	    @FindBy (name = "First Name")
	    WebElement FN;
	    
	    @FindBy (name = "Middle Name")
	    WebElement MN;
	    
	    @FindBy (name = "Last Name")
	    WebElement LN;
	    
	    @FindBy (name = "Other ID")
	    WebElement OID;
	    
	    @FindBy (name = "Blood Group")
	    WebElement BG;
	    
	    @FindBy (name = "Patient Size")
	    WebElement PatientSizedropdown;
	    
	    @FindBy (name = "SAVE")
	    WebElement Save;
	    
	    @FindBy (name = "Male")
	    WebElement Male;
	    
	    @FindBy (name = "Female")
	    WebElement Female;
	    
	    @FindBy (name = "Others")
	    WebElement Others;
	    
	    @FindBy (name = "Patient Weight (kg)")
	    WebElement Weight;
	    
	    @FindBy (name = "Nationality")
	    WebElement Nationality;
	    
	    @FindBy (name = "Languages Known")
	    WebElement LanguagesKnown;
	    
	    @FindBy (name = "ID Type")
	    WebElement IDtype;
	    
	    @FindBy (name = "ID Number")
	    WebElement IDNumber;
	    
	    @FindBy (name = "Remarks")
	    WebElement Remarks;
	    
	    @FindBy (name = "Phone Number")
	    WebElement PhoneNumber;
	    
	    @FindBy (name = "Alternate Number")
	    WebElement AlternateNumber;
	    
	    @FindBy (name = "CONTACT DETAILS")
	    WebElement Contactdetails;
	    
	    @FindBy (name = "Email ID")
	    WebElement EmailID;
	    
	    @FindBy (name = "Current Address")
	    WebElement CurrentAddress;
	    
	    @FindBy (name = "Permanent Address")
	    WebElement PermanentAddress;
	    
	    @FindBy (name = "Region")
	    WebElement Region;
	    
	    @FindBy (name = "Zip Code")
	    WebElement Zipcode;
	    
	    @FindBy (name = "CARE TAKER DETAILS")
	    WebElement caretakerdetails;
	    
	    @FindBy (xpath = "//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"DemographicsMainView\"]/Custom[@ClassName=\"DemographicsSection2View\"]/Edit[@AutomationId=\"TextBoxViewModelCaretakerName\"]")
	    WebElement Caretakername;
	    
	    @FindBy (xpath = "//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"DemographicsMainView\"]/Custom[@ClassName=\"DemographicsSection2View\"]/Edit[@AutomationId=\"TextBoxViewModelCtContactNum\"]")
	    WebElement ContactNumber;
	    
	    @FindBy (name = "Name")
	    WebElement CareName;
	    
	    @FindBy (name = "Contact Number")
	    WebElement CareContactNumber;
	    
	    
	    @FindBy (name = "Relationship")
	    WebElement Relationship;
	    
	    @FindBy (name = "CAMERA")
	    WebElement Camera;
	    
	    @FindBy (name = "BROWSE")
	    WebElement Browse;
	    
	    
	    //*********************Errormessage*********************
	    @FindBy (name = "Input cannot be blank")
	    WebElement Blankmessage;
	    
	    @FindBy (name = "Please select a date")
	    WebElement Selectdate;
	    
	    @FindBy (name = "Select a blood group")
	    WebElement Selectbloodgroup;
	    
	    @FindBy (name = "Please Select a Gender")
	    WebElement Selectgender;
	    
	    
	    
	}
	