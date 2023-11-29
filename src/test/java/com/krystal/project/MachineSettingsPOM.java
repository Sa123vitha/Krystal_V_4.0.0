package com.krystal.project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.windows.WindowsDriver;

public class MachineSettingsPOM extends ReferencefileChemotheraphy {
 
	public MachineSettingsPOM(WindowsDriver<WebElement> driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	 @FindBy (name = "Machine List")
	 WebElement machinelist;
	
	 @FindBy (name = "Select Browse File")
	 WebElement selectbrowse;
	
	 @FindBy (name = "BROWSE")
	 WebElement browse;
	
	 @FindBy (name = "Model Name")
	 WebElement modelname;
	
	 @FindBy (name = "Device Serial Number")
	 WebElement devsernum;
	
	 @FindBy (name = "File Updated")
	 WebElement fileupdated;
	
	 @FindBy (name = "actualtext")
	 WebElement Machine1;
	
	 @FindBy (xpath = "//Button[@HelpText=\"Sign Out (User ID: s)\"]")
	 WebElement Signout;
	
	
	
	
	
	
	
	
	
	
	
}