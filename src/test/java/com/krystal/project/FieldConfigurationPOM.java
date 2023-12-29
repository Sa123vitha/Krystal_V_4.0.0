package com.krystal.project;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.windows.WindowsDriver;

public class FieldConfigurationPOM extends ReferencefileChemotheraphy{
	
	WindowsDriver<WebElement> driver;
	public FieldConfigurationPOM(WindowsDriver<WebElement> driver)
		{
			PageFactory.initElements(driver, this);
		}
	
	
	@FindBy(name = "Field Configuration")
	WebElement fieldconfig;
	
	@FindBy(name = "Add Field")
	WebElement addfield;
	
	@FindBy(name = "Field Name")
	WebElement fieldname;
	
	@FindBy(name = "Regular Field Creation")
	WebElement regfieldconfig;
	
	@FindBy(name = "Collimator Type")
	WebElement collitype;
	
	@FindBy(name = "Symmetric")
	WebElement symm;
	
	@FindBy(name = "Asymmetric")
	WebElement fieldnameAsymtric;
	
	@FindBy(name = "FX(cm) [Min:0,Max:30]")
	WebElement symfx;
	
	@FindBy(name = "FY(cm) [Min:0,Max:30]")
	WebElement symfy;
	
	@FindBy(name = "FX1(cm) [Min:-15,Max:7.5]")
	WebElement asymfx1;
	
	@FindBy(name = "FX2(cm) [Min:-7.5,Max:15]")
	WebElement asymfx2;
	
	@FindBy(name = "FY1(cm) [Min:-15,Max:7.5]")
	WebElement asymfy1;
	
	@FindBy(name = "FY2(cm) [Min:-7.5,Max:15]")
	WebElement asymfy2;
	
	
	@FindBy(name = "Leaf Values")
	WebElement leafval;
	
	@FindBy(name = "Collimator Angle")
	WebElement colliangle;
	
	@FindBy(name = "Leaf Number")
	WebElement leafnum;
	
	@FindBy(name = "Bank A")
	WebElement banka;
	
	@FindBy(name = "Bank B")
	WebElement bankb;
	
	@FindBy(name = "APPLY")
	WebElement apply;
	
	@FindBy(name = "SAVE")
	WebElement fieldsave;
	
	@FindBy(name = "UPDATE")
	WebElement fieldupdate;
	
	@FindBy(name = "Beam Eye View")
	WebElement beamview;
	
	@FindBy(name = "Configured Field List")
	WebElement configfield;
	
	@FindBy(name = "Search Field Name")
	WebElement searchfield;
	
	@FindBy(name = "Search Field Type")
	WebElement searchtype;
	
	@FindBy(name = "Select Machine")
	WebElement selectmachine;
	
	@FindBy(name = "Field Type")
	WebElement fieldtype;
	
	@FindBy(name = "Field Name")
	WebElement fieldname1;
	
	@FindBy(name = "Add field")
	WebElement Addfield1;
	
	@FindBy(name = "Collimator Angle")
	WebElement angle;
	
	
	
	//Taw
    @FindBy(name = "FX(cm) [Min:0,Max:35]")
	WebElement Symfx;
	
	@FindBy(name = "FY(cm) [Min:0,Max:35]")
	WebElement Symfy;
	
	@FindBy(name = "FX1(cm) [Min:-17.5,Max:0]")
	WebElement ASymfx1;
	
	@FindBy(name = "FX2(cm) [Min:0,Max:17.5]")
	WebElement ASymfx2;
	
	@FindBy(name = "FY1(cm) [Min:-17.5,Max:0]")
	WebElement ASymfy1;
	
	@FindBy(name = "FY2(cm) [Min:0,Max:17.5]")
	WebElement ASymfY2;
	
	//MLC
    @FindBy(name = "FX(cm) [Min:0,Max:25]")
	WebElement MSymfx;
	
	@FindBy(name = "FY(cm) [Min:0,Max:25]")
	WebElement MSymfy;
	
	@FindBy(name = "FX1(cm) [Min:-12.5,Max:6]")
	WebElement MASymfx1;
	
	@FindBy(name = "FX2(cm) [Min:-6,Max:12.5]")
	WebElement MASymfx2;
	
	@FindBy(name = "FY1(cm) [Min:-12.5,Max:0]")
	WebElement MASymfy1;
	
	@FindBy(name = "FY2(cm) [Min:0,Max:12.5]")
	WebElement MASymfY2;
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"FieldConfigurationMainView\"]/Custom[@ClassName=\"FieldConfigurationSection3View\"]/ComboBox[@ClassName=\"ComboBox\"]")
	WebElement selmachine;
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"FieldConfigurationMainView\"]/Custom[@ClassName=\"FieldConfigurationSection1View\"]/RadioButton[@ClassName=\"RadioButton\"][@Name=\"Asymmetric\"]")
	WebElement Assy;
	
//	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"FieldConfigurationMainView\"]/Custom[@ClassName=\"FieldConfigurationSection3View\"]/Edit[@ClassName=\"TextBox\"]/Edit[starts-with(@AutomationId,\"presenter\")]")
//	WebElement Search;
	
	@FindBy(name = "Search Field Name")
	WebElement Search;	
	
	@FindBy(name = "Search Field Type")
	WebElement searchfieldType;	
	
	@FindBy(name = "FX(cm) [Min:0,Max:30]")
	WebElement fxcm;	
	
	@FindBy(name = "FY(cm) [Min:0,Max:30]")
	WebElement fycm;	
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"FieldConfigurationMainView\"]/Custom[@ClassName=\"FieldConfigurationSection3View\"]/Button[@AutomationId=\"SearchMenuButton\"]")
	WebElement selection;
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Window[@ClassName=\"Popup\"]/Menu[@ClassName=\"ContextMenu\"]/RadioButton[@ClassName=\"RadioButton\"][@Name=\"Field Name\"]/Text[@Name=\"Field Name\"][@AutomationId=\"RadioLabel\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Field Name\"]")
	WebElement fieldName;
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Window[@ClassName=\"Popup\"]/Menu[@ClassName=\"ContextMenu\"]/RadioButton[@ClassName=\"RadioButton\"][@Name=\"Field Type\"]/Text[@Name=\"Field Type\"][@AutomationId=\"RadioLabel\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Field Type\"]")
    WebElement fieldType;
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"FieldConfigurationMainView\"]/Custom[@ClassName=\"FieldConfigurationSection3View\"]/ComboBox[@ClassName=\"ComboBox\"]")
	WebElement select;
	
//	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"FieldConfigurationMainView\"]/Custom[@ClassName=\"FieldConfigurationSection3View\"]/Edit[@ClassName=\"TextBox\"]/Edit[starts-with(@AutomationId,\"presenter\")]")
//    WebElement searchfieldType;
	
	
	
	//Error	
	
	@FindBy(name = "Field Name Cannot be Empty")
	WebElement Fieldnameempty;
	@FindBy(name = "Input must not contain \\ , '' , '")
		WebElement Fieldnameepecialchar;
	@FindBy(name = "Field Name already exits")
		WebElement Fieldnamealreadyexits1;
	@FindBy(name = "Field Name already exits")
		WebElement Fieldnamealreadyexits2;
	@FindBy(name = "Field Name cannot be empty")
		WebElement Fieldnamealreadyexits4;
		
	
	
	
	
	
	
	
	
}
