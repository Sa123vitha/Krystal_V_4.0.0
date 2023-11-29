package com.krystal.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.appium.java_client.windows.WindowsDriver;

public class LoginPOM extends ReferencefileChemotheraphy {
 
	public LoginPOM(WindowsDriver<WebElement> driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Image[@ClassName=\"Image\"]")
	WebElement SigninProductlogo;
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Image[@ClassName=\"Image\"]")
	WebElement SigninProductImage;
	
//	@FindBy(name =" Product Name :" )
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Text[@Name=\"Product Name :\"][@AutomationId=\"Product\"]/Text[@Name=\"Product Name :\"][@AutomationId=\"Label\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Product Name :\"]")
	WebElement Productname;
	
	@FindBy(name ="Offline Record & Verification" )
//	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Text[@Name=\"Offline Record &amp; Verification\"][@AutomationId=\"ProductName\"]/Text[@Name=\"Offline Record &amp; Verification\"][@AutomationId=\"Label\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Offline Record &amp; Verification\"]")
	WebElement OfflineRnV;
	
	@FindBy(xpath ="//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Text[@ClassName=\"Text\"][@Name=\"SIGN IN\"]/Text[@Name=\"SIGN IN\"][@AutomationId=\"Label\"]/Text[@ClassName=\"TextBlock\"][@Name=\"SIGN IN\"]")
	WebElement Signinlabel;
	
	@FindBy(name ="User ID" )
	WebElement UserID;
	
	@FindBy(name ="Password" )
	WebElement Password;
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Button[@Name=\"SIGN IN\"][@AutomationId=\"BtnValidate\"]")
	WebElement SigninButton;
	
	@FindBy(name ="CLEAR" )
	WebElement ClearButton;
	
	
	@FindBy(name ="Disclaimer Notice :" )
	WebElement Notice;
	
	@FindBy(name ="This software is protected by copyright law and international treaties. Unauthorized duplication or distribution of this software or any other portion of it may result in severe civil and criminal penalties and will be prosecuted to the maximum extent possible under the law." )
	WebElement NoticeDescription;
	
	@FindBy(name ="Licensed To :" )
	WebElement Licensed;
	
	@FindBy(name ="Hospital_Name" )
	WebElement Hospital;
	
	@FindBy(name ="HELP" )
	WebElement Help;
	
	@FindBy(name ="EXIT" )
	WebElement Exit;
	
	@FindBy(name ="Software Version :" )
	WebElement SoftwareVersion;
	
	@FindBy(name ="4.0.0 A7" )
	WebElement VersionNumber;
	
	@FindBy(name ="Copyright © Panacea Medical Technologies 2023" )
	WebElement Copyright;
	
	@FindBy(name ="HELP" )
	WebElement Helpfun;
	
	@FindBy(name ="Contact Panacea Medical Technologies" )
	WebElement HelpContact;
	
	@FindBy(name ="Regional Service Engineer" )
	WebElement HelpRegional;
	
//	@FindBy(name ="Service Engineer :" )
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Window[@ClassName=\"Window\"][@Name=\"Custom Popup\"]/Custom[@ClassName=\"CustomHelpView\"]/Text[@Name=\"Service Engineer : \"][starts-with(@AutomationId,\"L\")]/Text[@Name=\"Service Engineer : \"][@AutomationId=\"Label\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Service Engineer : \"]")
	WebElement HelpService;
	
//	@FindBy(name ="Contact Number :" )
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Window[@ClassName=\"Window\"][@Name=\"Custom Popup\"]/Custom[@ClassName=\"CustomHelpView\"]/Text[@Name=\"Contact Number : \"][starts-with(@AutomationId,\"L\")]/Text[@Name=\"Contact Number : \"][@AutomationId=\"Label\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Contact Number : \"]")
	WebElement HelpSCN;
	
	@FindBy(name ="E-mail ID :" )
	WebElement HelpEmail;
	
	@FindBy(name ="Head Office" )
	WebElement HelpHeadoffice;
	
//	@FindBy(name ="Contact number :" )
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Window[@ClassName=\"Window\"][@Name=\"Custom Popup\"]/Custom[@ClassName=\"CustomHelpView\"]/Text[@Name=\"Contact Number : \"][starts-with(@AutomationId,\"L\")]/Text[@Name=\"Contact Number : \"][@AutomationId=\"Label\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Contact Number : \"]")
	WebElement HelpRCN;
	
	@FindBy(name ="E-mail ID :" )
	WebElement HelpEmailID;
	
	@FindBy(name ="Close" )
	WebElement HelpClose;
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Edit[@AutomationId=\"PwdBoxUserPassword\"]")
	WebElement Pswdbox;
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Edit[@AutomationId=\"TxtbxUsername\"]")
	WebElement Userbx;
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"OpenPatientMainView\"]/Custom[@ClassName=\"OpenPatientTableView\"]")
	WebElement PateintListscreen;
	
	@FindBy(xpath ="//Text[@AutomationId=\"ServiceEngineerName\"]")
	WebElement actualServiceEnginer;
	
	@FindBy(xpath ="//Text[@AutomationId=\"ServiceEngineerContactNum\"]")
	WebElement actualPhoneNumber;
	
	@FindBy(name ="supportService@panaceamedical.com")
	WebElement actualEmailid;
	
	@FindBy(name ="(+91) 9865776545")
	WebElement actualRegionalService;
	
	@FindBy(name ="supportHeadOfc@panaceamedical.com")
	WebElement actualRegionEmailid;
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Text[@Name=\"User ID or Password cannot be empty.\"][@AutomationId=\"LblSignInError\"]/Text[@ClassName=\"TextBlock\"][@Name=\"User ID or Password cannot be empty.\"]")
	WebElement Errormessage;
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Text[@Name=\"Invalid Credentials\"][@AutomationId=\"LblSignInError\"]")
	WebElement UPError;
	
	
	 @FindBy (xpath = "//Button[@HelpText=\"Sign Out (User ID: m)\"]")
	 WebElement Signout;
	 
	 
	 @FindBy (xpath = "//Button[@HelpText=\"Show Password\"]")
	 WebElement Eyeicon;
	 
	 // Labreports POM
	 
	 @FindBy(name ="IMPORT")
	WebElement ImportReport;
	 
	 @FindBy(name ="LAB REPORTS")
		WebElement labreports;
	 
	 @FindBy(name ="Lab Reports")
		WebElement labreportstitle;
	 
	 @FindBy(name ="Close")
		WebElement Close;
	
	
	
}
