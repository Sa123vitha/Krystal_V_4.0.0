package com.krystal.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.appium.java_client.windows.WindowsDriver;

public class TolerancePOM extends ReferencefileChemotheraphy{
WindowsDriver<WebElement> driver;
	
	public TolerancePOM(WindowsDriver<WebElement> driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(name = "Treatment Tolerance")
	WebElement treatementtolerance;

	@FindBy(name = "Table Number")
	WebElement tablenumber;
	
	@FindBy(name = "Table Name")
	WebElement tablename;
	
	@FindBy(name = "Gantry")
	WebElement gantry;
	
	@FindBy(name = "Rotation Angle (deg)")
	WebElement ganrotangle;
        @FindBy(name = "Beam Limiting Device")
	WebElement beamlimit;

	
	@FindBy(name = "Jaws (cm)")
	WebElement jaws;
	
	@FindBy(name = "MLC1 Leaf (cm)")
	WebElement mlcleaf1;
	
	@FindBy(name = "MLC2 Leaf (cm)")
	WebElement mlcleaf2;

    @FindBy(name = "Patient Support")
	WebElement PatientSupport;

	
	@FindBy(name = "Longitudinal (cm)")
	WebElement longitudinal;
	
	@FindBy(name = "Lateral (cm)")
	WebElement lateral;
	
	@FindBy(name = "Vertical (cm)")
	WebElement vertical;
	
	@FindBy(name = "Pitch Angle (deg)")
	WebElement pitch;
	
	@FindBy(name = "Roll Angle (deg)")
	WebElement roll;
	
	@FindBy(name = "SAVE")
	WebElement Save;
	
	@FindBy(name = "UPDATE")
	WebElement Update;
	
	@FindBy(name = "SELECT ALL")
	WebElement SelectAll;
	
	
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
	
	@FindBy(name = "Table number already exists")
	WebElement Numberexits;
	
	@FindBy(name = "Table name already exists")
	WebElement Nameexits;
	
	
   @FindBy (xpath = "//Button[@HelpText=\"Refresh\"]")
   WebElement Refresh;
   
   @FindBy (xpath = "//Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"ToleranceSettingsMainView\"]/Custom[@ClassName=\"ToleranceSettingsSection2View\"]/Button[@AutomationId=\"SearchMenuButton\"]")
   WebElement Searchdropdown;
   @FindBy(name = "Tolerance Table Number")
	WebElement toltablenumber;
	
   @FindBy(name = "Tolarence Table Name")
	WebElement toltablename;
	
  
	
	
}
