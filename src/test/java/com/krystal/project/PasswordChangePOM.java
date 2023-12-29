package com.krystal.project;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.appium.java_client.windows.WindowsDriver;

public class PasswordChangePOM {

	
	private Actions act;

	public PasswordChangePOM(WindowsDriver<WebElement> driver)
	{
		PageFactory.initElements(driver, this);
		act = new Actions(driver);
	}	
		
		
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Window[@ClassName=\"Popup\"]/Menu[@ClassName=\"ContextMenu\"]")	
	WebElement passwordScreen;	
		
	@FindBy(xpath = "//*[contains(@Name,'Change Password for')]")
	WebElement changePasswordHeader;

		
	@FindBy(name = "Current Password")	
	WebElement currentPassword;	
		
	@FindBy(name = "New Password")	
	WebElement newPassword;		
		
	@FindBy(name = "Confirm Password")	
	WebElement confrimPassword;		
		
	@FindBy(xpath = "//Button[@HelpText=\"Show Password\"]")
	WebElement ShowPassword;			
		
	@FindBy(name = "CLEAR")	
	WebElement clear;
	
	@FindBy(name = "Min length is 6")	
	WebElement minlengthErrorMessage;	
		
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Window[@ClassName=\"Popup\"]/Menu[@ClassName=\"ContextMenu\"]/Button[@Name=\"CHANGE PASSWORD\"][@AutomationId=\"BtnValidate\"]")	
	WebElement changePassword;	
		
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Window[@ClassName=\"Popup\"]/Menu[@ClassName=\"ContextMenu\"]/Edit[@AutomationId=\"PasswordBox\"]/Text[@Name=\"Current Password cannot be empty\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Current Password cannot be empty\"]")
	WebElement currentPasswordErrorMessage;
		
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Window[@ClassName=\"Popup\"]/Menu[@ClassName=\"ContextMenu\"]/Edit[@AutomationId=\"NewPasswordbox\"]/Text[@Name=\"New Password cannot be empty\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"New Password cannot be empty\"]")
	WebElement newPasswordErrorMessage;
		
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Window[@ClassName=\"Popup\"]/Menu[@ClassName=\"ContextMenu\"]/Edit[@AutomationId=\"Confirmpasswordbox\"]/Text[@Name=\"Confirm Password cannot be empty\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Confirm Password cannot be empty\"]")	
	WebElement confrimPasswordErrorMessage;	
		
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Window[@ClassName=\"Popup\"]/Menu[@ClassName=\"ContextMenu\"]/Edit[@AutomationId=\"NewPasswordbox\"]/Text[@Name=\"Passwords Do not Match\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Passwords Do not Match\"]")	
	WebElement MismatchMessage;	
		
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Window[@ClassName=\"Popup\"]/Menu[@ClassName=\"ContextMenu\"]/Edit[@AutomationId=\"PasswordBox\"]/Text[@Name=\"Current Password is invalid\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Current Password is invalid\"]")	
	WebElement currentPasswordError;
		
	@FindBy(name ="New Password cannot be empty")	
	WebElement newPasswordError;	
		
		
	 @FindBy (xpath = "//Button[@HelpText=\"Sign Out (User ID: m)\"]")
	 WebElement Signout;
		
		
	 @FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"OpenPatientMainView\"]/Custom[@ClassName=\"OpenPatientTableView\"]")
		WebElement PateintListscreen;
		
	 @FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Edit[@AutomationId=\"PwdBoxUserPassword\"]")
		WebElement Pswdbox;
		
		@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Edit[@AutomationId=\"TxtbxUsername\"]")
		WebElement Userbx;
		
		@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Button[@Name=\"SIGN IN\"][@AutomationId=\"BtnValidate\"]")
		WebElement SigninButton;
		
	}

