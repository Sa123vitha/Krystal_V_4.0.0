package com.krystal.project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.appium.java_client.windows.WindowsDriver;

public class SitePOM {
	

	public SitePOM(WindowsDriver<WebElement> driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(name = "SITE CONFIGURATION")
	WebElement siteconfig;
	
	@FindBy(name = "Site Name")
	WebElement SiteName;
	
	@FindBy(name = "SAVE")
	WebElement Save;
	
	@FindBy(name = "SITE LIST")
	WebElement sitelist;
	
	@FindBy(name = "Site Name")
	WebElement SiteHead;
	
	@FindBy(name = "Site Name")
	WebElement sitenamelist;
	
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
	//************Error displayed**********************
	
	@FindBy(name = "Site name already exists")
	WebElement SiteErrormsg;
 
}
