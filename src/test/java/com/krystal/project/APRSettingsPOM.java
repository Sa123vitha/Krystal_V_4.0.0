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

public class APRSettingsPOM extends ReferencefileChemotheraphy{
	
	WindowsDriver<WebElement> driver;
	public APRSettingsPOM(WindowsDriver<WebElement> driver)
		{
			PageFactory.initElements(driver, this);
		}
		@FindBy(name = "General Settings")
		WebElement generalsettings;
		
		@FindBy(name = "APR CONFIGURATION")
		WebElement AprConfiguration;
		
		@FindBy(name = "APR ID")
		WebElement aprid;
		
		@FindBy(name = "APR Site List")
		WebElement aprsitelist;
		
		@FindBy(name = "Site")
		WebElement aprsite;
		
		@FindBy(name = "Head")
		WebElement sitehead;
		
		@FindBy(name = "APR Imaging Type")
		WebElement aprimagingtype;
		
		@FindBy(name = "Imaging Type")
		WebElement imagingtype;
		
		@FindBy(name = "AP")
		WebElement ap;
		
		@FindBy(name = "PA")
		WebElement pa;
		
		@FindBy(name = "SAVE")
		WebElement Save;
		
		@FindBy(name = "UPDATE")
		WebElement Update;
	
		//@FindBy(xpath = "//Custom[@ClassName=\"APRSettingsMainView\"]/Custom[@ClassName=\"APRSettingsSection1View\"]/DataGrid[@ClassName=\"DataGrid\"]/DataItem[@ClassName=\"DataGridRow\"][@Name=\"APRSettingsSection1.Models.ListPendingViewModel\"]/Custom[@ClassName=\"DataGridCell\"][@Name=\"RLAT\"]/Text[@ClassName=\"TextBlock\"][@Name=\"RLAT\"]")
		@FindBy(name = "RLAT")
		WebElement rlat;
		
		//@FindBy(xpath = "//Custom[@ClassName=\"APRSettingsMainView\"]/Custom[@ClassName=\"APRSettingsSection1View\"]/DataGrid[@ClassName=\"DataGrid\"]/DataItem[@ClassName=\"DataGridRow\"][@Name=\"APRSettingsSection1.Models.ListPendingViewModel\"]/Custom[@ClassName=\"DataGridCell\"][@Name=\"LLAT\"]/Text[@ClassName=\"TextBlock\"][@Name=\"LLAT\"]")
		@FindBy(name = "LLAT")
		WebElement llat;
		
		//@FindBy(xpath = "//Custom[@ClassName=\"APRSettingsMainView\"]/Custom[@ClassName=\"APRSettingsSection1View\"]/DataGrid[@ClassName=\"DataGrid\"]/DataItem[@ClassName=\"DataGridRow\"][@Name=\"APRSettingsSection1.Models.ListPendingViewModel\"]/Custom[@ClassName=\"DataGridCell\"][@Name=\"Stereo Custom\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Stereo Custom\"]")
		@FindBy(name = "Stereo Custom")
		WebElement stereocustom;
		
		//@FindBy(xpath = "//Custom[@ClassName=\"APRSettingsMainView\"]/Custom[@ClassName=\"APRSettingsSection1View\"]/Text[@ClassName=\"Text\"][@Name=\"APR Patient Size\"]/Text[@Name=\"APR Patient Size\"][@AutomationId=\"Label\"]/Text[@ClassName=\"TextBlock\"][@Name=\"APR Patient Size\"]")
		@FindBy(name = "APR Patient Size")
		WebElement aprpatientsize;
		
		//@FindBy(xpath = "//Custom[@ClassName=\"APRSettingsMainView\"]/Custom[@ClassName=\"APRSettingsSection1View\"]/DataGrid[@ClassName=\"DataGrid\"]/Header[@AutomationId=\"PART_ColumnHeadersPresenter\"]/HeaderItem[@ClassName=\"DataGridColumnHeader\"][@Name=\"Patient Size\"]/Text[@Name=\"Patient Size\"][@AutomationId=\"Label\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Patient Size\"]")
		@FindBy(name = "Patient Size")
		WebElement patientsize;
		
		//@FindBy(xpath = "//Custom[@ClassName=\"APRSettingsMainView\"]/Custom[@ClassName=\"APRSettingsSection1View\"]/DataGrid[@ClassName=\"DataGrid\"]/DataItem[@ClassName=\"DataGridRow\"][@Name=\"APRSettingsSection1.Models.ListPendingViewModel\"]/Custom[@ClassName=\"DataGridCell\"][@Name=\"Pediatric\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Pediatric\"]")
		@FindBy(name = "Pediatric")
		WebElement paediatric;
	
		//@FindBy(xpath = "//Custom[@ClassName=\"APRSettingsMainView\"]/Custom[@ClassName=\"APRSettingsSection1View\"]/DataGrid[@ClassName=\"DataGrid\"]/DataItem[@ClassName=\"DataGridRow\"][@Name=\"APRSettingsSection1.Models.ListPendingViewModel\"]/Custom[@ClassName=\"DataGridCell\"][@Name=\"Small\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Small\"]")
		@FindBy(name = "Small")
		WebElement small;
		
		//@FindBy(xpath = "//Custom[@ClassName=\"APRSettingsMainView\"]/Custom[@ClassName=\"APRSettingsSection1View\"]/DataGrid[@ClassName=\"DataGrid\"]/DataItem[@ClassName=\"DataGridRow\"][@Name=\"APRSettingsSection1.Models.ListPendingViewModel\"]/Custom[@ClassName=\"DataGridCell\"][@Name=\"Medium\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Medium\"]")
		@FindBy(name = "Medium")
		WebElement medium;
		
		//@FindBy(xpath = "//Custom[@ClassName=\"APRSettingsMainView\"]/Custom[@ClassName=\"APRSettingsSection1View\"]/DataGrid[@ClassName=\"DataGrid\"]/DataItem[@ClassName=\"DataGridRow\"][@Name=\"APRSettingsSection1.Models.ListPendingViewModel\"]/Custom[@ClassName=\"DataGridCell\"][@Name=\"Large\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Large\"]")
		@FindBy(name = "Large")
		WebElement large;
		
		//@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"APRSettingsMainView\"]/Custom[@ClassName=\"APRSettingsSection1View\"]/ComboBox[@ClassName=\"ComboBox\"][1]")
		@FindBy(name = "kV")
		WebElement kv;
		
		//@FindBy(xpath="//Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"APRSettingsMainView\"]/Custom[@ClassName=\"APRSettingsSection1View\"]/ComboBox[@ClassName=\"ComboBox\"][1]")
		
		
		
		
		@FindBy(xpath = "//Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"APRSettingsMainView\"]/Custom[@ClassName=\"APRSettingsSection1View\"]/ComboBox[@ClassName=\"ComboBox\"][2]")
		//@FindBy(name = "mA")
		WebElement ma;
		
		@FindBy(xpath = "//Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"APRSettingsMainView\"]/Custom[@ClassName=\"APRSettingsSection1View\"]/ComboBox[@ClassName=\"ComboBox\"][3]")
		//@FindBy(name = "ms")
		WebElement ms;
		
		//@FindBy(xpath = "//Custom[@ClassName=\"APRSettingsMainView\"]/Custom[@ClassName=\"APRSettingsSection1View\"]/Edit[@ClassName=\"TextBox\"]/Text[@Name=\"Dose (cGy)\"][@AutomationId=\"LblName\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Dose (cGy)\"]")
		@FindBy(name = "Dose (cGy)")
		WebElement dosecgy;
		
		//@FindBy(xpath = "//Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"APRSettingsMainView\"]/Custom[@ClassName=\"APRSettingsSection2View\"]/Button[@ClassName=\"Button\"][@Name=\"APR LIST\"]")
		@FindBy(name = "APR LIST")
		WebElement aprlist;
		
		//@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"APRSettingsMainView\"]/Custom[@ClassName=\"APRSettingsSection2View\"]/ComboBox[@ClassName=\"ComboBox\"]")
		@FindBy(name = "Select Machine")
		WebElement selectmachine;
		
		@FindBy(xpath = "//Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"APRSettingsMainView\"]/Custom[@ClassName=\"APRSettingsSection2View\"]/Edit[@ClassName=\"TextBox\"]/Edit[starts-with(@AutomationId,\"presenter\")]")
		//@FindBy(name = "Select Machine")
		WebElement searchaprid;
		
		//@FindBy(xpath = "//Custom[@ClassName=\"APRSettingsMainView\"]/Custom[@ClassName=\"APRSettingsSection2View\"]/DataGrid[@ClassName=\"DataGrid\"]/Header[@AutomationId=\"PART_ColumnHeadersPresenter\"]/HeaderItem[@ClassName=\"DataGridColumnHeader\"][@Name=\"APR ID\"]/Text[@Name=\"APR ID\"][@AutomationId=\"Label\"]/Text[@ClassName=\"TextBlock\"][@Name=\"APR ID\"]")
		@FindBy(name = "APR ID")
		WebElement aprid1;
	
		//@FindBy(xpath = "//Custom[@ClassName=\"APRSettingsMainView\"]/Custom[@ClassName=\"APRSettingsSection2View\"]/DataGrid[@ClassName=\"DataGrid\"]/Header[@AutomationId=\"PART_ColumnHeadersPresenter\"]/HeaderItem[@ClassName=\"DataGridColumnHeader\"][@Name=\"Created Date\"]/Text[@Name=\"Created Date\"][@AutomationId=\"Label\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Created Date\"]")
		@FindBy(name = "Created Date")
		WebElement createddate;
		
		//@FindBy(xpath = "//Custom[@ClassName=\"APRSettingsMainView\"]/Custom[@ClassName=\"APRSettingsSection2View\"]/DataGrid[@ClassName=\"DataGrid\"]/Header[@AutomationId=\"PART_ColumnHeadersPresenter\"]/HeaderItem[@ClassName=\"DataGridColumnHeader\"][@Name=\"Modified Date\"]/Text[@Name=\"Modified Date\"][@AutomationId=\"Label\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Modified Date\"]")
		@FindBy(name = "Modified Date")
		WebElement modifieddate;
	
		@FindBy(name = "APR ID :")
		WebElement aprid2;
		
		@FindBy(name = "Sl No")
		WebElement SlNo;
		
		@FindBy(name = "Site")
		WebElement Site;
		
		@FindBy(name = "Imaging Type")
		WebElement ImagingType;
		
		@FindBy(name = "Patient Size")
		WebElement PatientSize;
		
		@FindBy(name = "kV")
		WebElement kV1;
		
		@FindBy(name = "mA")
		WebElement mA1;
		
		@FindBy(name = "ms")
		WebElement ms1;
		@FindBy(name = "Dose")
		WebElement Dose;
		@FindBy(name = "*Dose - cGy")
		WebElement Doseindication;
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

		
}
