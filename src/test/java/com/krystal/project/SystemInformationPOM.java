package com.krystal.project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.windows.WindowsDriver;

public class SystemInformationPOM extends ReferencefileChemotheraphy {
 
	public SystemInformationPOM(WindowsDriver<WebElement> driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	 @FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Edit[@AutomationId=\"TxtbxUsername\"]")
	 WebElement Userbx;
	
	 @FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Edit[@AutomationId=\"PwdBoxUserPassword\"]")
	 WebElement Pswdbox;
	
	 @FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Button[@Name=\"SIGN IN\"][@AutomationId=\"BtnValidate\"]")
	 WebElement Signinbutton;
	
	 @FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneratorSettingsMainView\"]/Custom[@ClassName=\"GeneratorSettingsSection1View\"]/ComboBox[@ClassName=\"ComboBox\"]")
	 WebElement Generatorsettings;
	
	 
	 @FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Window[@ClassName=\"Popup\"]/ListItem[@ClassName=\"ListBoxItem\"][@Name=\"System Information\"]/Text[@ClassName=\"TextBlock\"][@Name=\"System Information\"]")
	 WebElement SystemInformation;
	 
	 
	 @FindBy (name = "ComboBox")
	 WebElement Menucombobox;
	
	 @FindBy (name = "System Information")
	 WebElement systeminfo;
	 
	 @FindBy (name = "Computer Name")
	 WebElement compname;
	 
	 @FindBy (name = "Windows Edition")
	 WebElement windowsedit;
	 
	 @FindBy (name = "Operating System")
	 WebElement os;
	 
	 @FindBy (name = "OS Version")
	 WebElement osversion;
	 
	 @FindBy (name = "OS Build")
	 WebElement osbuild;
	 
	 @FindBy (name = "Installed On")
	 WebElement installedon;
	 
	 @FindBy (name = "System Directory")
	 WebElement systemdir;
	 
	 @FindBy (name = "System Language")
	 WebElement systemlang;
	 
	 @FindBy (name = "UserDomainName")
	 WebElement userdomain;
	 
	 @FindBy (name = "RAM")
	 WebElement ram;
	
	 @FindBy (name = "Graphic Card")
	 WebElement graphiccard;
	 
	 @FindBy (name = "Processor type")
	 WebElement processtype;
	 
	 @FindBy (name = "Machine Serial Number")
	 WebElement machinesernum;
	 
	 @FindBy (name = "Application Installed Path")
	 WebElement appinstalled;
	 
	 @FindBy (name = "IP Address")
	 WebElement ipadd;
	 
	 @FindBy (name = "Disk Partiton")
	 WebElement disk;
	 
	 @FindBy (name = "C:\\")
	 WebElement cdrive;
	 
	 @FindBy (name = "D:\\")
	 WebElement ddriver;
	 
	 @FindBy (name = "H:\\")
	 WebElement hdrive;
	 
	 @FindBy (name = "P:\\")
	 WebElement pdrive;
	 
	 @FindBy (name = "Database Name")
	 WebElement dbname;
	 
	 @FindBy (name = "Version")
	 WebElement version;
	 
	 @FindBy (name = "Configuration Path")
	 WebElement configpath;
	 
	 @FindBy (name = "CCB_Treatment")
	 WebElement ccbtreat;
	 
	 @FindBy (name = "Impact Factory Setting")
	 WebElement impactfacset;
	 
	 @FindBy (name = "Offline_Settings")
	 WebElement offlineset;
	 
	 @FindBy (name = "Offline_Siddharth_Hospital")
	 WebElement offlinesiddhos;
	 
	 @FindBy (name = "Offline_Siddharth_OffLineRnV")
	 WebElement offlinesiddrnv;
	 
	 @FindBy (name = "Temp_Treatment")
	 WebElement temptreatment;
	 
	 @FindBy (name = "Machine QA")
	 WebElement machqa;
	 
	 @FindBy (name = "Language Translator")
	 WebElement langtrans;
	 
	 @FindBy (name = "Audit Log")
	 WebElement Auditlog;
	 
	 @FindBy (name = "Patient_QA")
	 WebElement PatientQA;
	 
	 @FindBy (name = "Hospital Information")
	 WebElement hospitalinfo;
	 
	 @FindBy (name = "Hospital Name")
	 WebElement hospitalname;
	 
	 @FindBy (name = "Hospital Address")
	 WebElement hospitaladd;
	 
	 @FindBy (name = "User Name")
	 WebElement username;
	 
	 @FindBy (name = "Contact Number")
	 WebElement contact;

	 @FindBy (name = "Licensed Date/Time")
	 WebElement license;
	 
	 @FindBy (name = "EXPORT")
	 WebElement export;
	 
	 @FindBy (name = "This PC")
	 WebElement ThisPc;
	 
	 @FindBy (name = "Desktop")
	 WebElement Desktop;
	 
	 @FindBy (name = "OK")
	 WebElement OK;
	 
	 @FindBy (name = "pop-up exported")
	 WebElement OK1;
	 
	 
	 
}

		
		
		