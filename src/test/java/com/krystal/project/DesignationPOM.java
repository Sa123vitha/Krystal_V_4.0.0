package com.krystal.project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.appium.java_client.windows.WindowsDriver;

public class DesignationPOM extends ReferencefileChemotheraphy{
	
	public DesignationPOM(WindowsDriver<WebElement> driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(name = "ADD DESIGNATION")
	WebElement addDesignation;
	

	@FindBy(name = "Designation Name")
	WebElement designationName;
	

	@FindBy(name = "Prescription")
	WebElement prescriptionName;
	

	@FindBy(name = "Yes")
	WebElement yes;
	
	@FindBy(name = "No")
	WebElement no;
	

	@FindBy(name = "SAVE")
	WebElement Save;
	
	@FindBy(name = "UPDATE")
	WebElement Update;
	

	@FindBy(name = "DESIGNATION LIST")
	WebElement designationList;
	
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
	
	@FindBy(name = "Designation Name Already Present.")
	WebElement Alreadyexits;
	
	
	
 
}
