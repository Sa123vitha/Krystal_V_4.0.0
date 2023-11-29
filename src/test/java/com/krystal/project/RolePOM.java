package com.krystal.project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.appium.java_client.windows.WindowsDriver;

public class RolePOM extends ReferencefileChemotheraphy{

		WindowsDriver<WebElement> driver;
		public RolePOM(WindowsDriver<WebElement> driver)
			{
				
				PageFactory.initElements(driver, this);
			}
			@FindBy(name = "Role Name")
			WebElement rolename;
			
			@FindBy(className = "CheckBox")
			WebElement select;
			
			@FindBy(name = "SAVE")
			WebElement Save;
			
			@FindBy(name = "UPDATE")
			WebElement Update;
			
			@FindBy(name = "SELECT ALL")
			WebElement SelectAll;
			
			@FindBy(name = "SIGN IN")
			WebElement Signin;
			
			@FindBy(name = "Treatment")
			WebElement Treatment;
			
			@FindBy(name = "Image Viewer")
			WebElement ImageViewer;
			
			@FindBy(name = "CT Android")
			WebElement CTAndroid;
			
			@FindBy(name = "Demographics Android")
			WebElement DemographicsAndroid;
			
			@FindBy(className = "CheckBox")
			WebElement Login;
			
			@FindBy(xpath = "//Custom[@ClassName=\"APRSettingsMainView\"]/Custom[@ClassName=\"APRSettingsSection1View\"]/DataGrid[@ClassName=\"DataGrid\"]/Header[@AutomationId=\"PART_ColumnHeadersPresenter\"]/HeaderItem[@ClassName=\"DataGridColumnHeader\"][@Name=\"Imaging Type\"]/Text[@Name=\"Imaging Type\"][@AutomationId=\"Label\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Imaging Type\"]")
			WebElement imagingtype;
}
