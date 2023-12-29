package com.krystal.project;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.appium.java_client.windows.WindowsDriver;

public class ChemotheraphyPOM {
	
	
	
	public ChemotheraphyPOM(WindowsDriver<WebElement> driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "CLASSIFICATION CONFIGURATION")
	WebElement classificationConfiguration;
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"ChemotherapyConfigurationMainView\"]/Custom[@ClassName=\"ChemotherapyConfigurationSection1View\"]/Edit[@ClassName=\"TextBox\"]/Text[@Name=\"Classification Name\"][@AutomationId=\"LblName\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Classification Name\"]")
	WebElement classificationName;
	
	@FindBy(name = "Classification Name")
	WebElement ClassificationName;
	
	@FindBy(name = "CLASSIFICATION LIST")
	WebElement ClassificationList;
	
	@FindBy(name = "REGIMEN LIST")
	WebElement RegimenList;
	
	@FindBy(name = "RADIO SENSITIZERS LIST")
	WebElement RadiosenitizersList;
	
	@FindBy(name = "DRUG & DRUG DOSE LIST")
	WebElement DrugList;
	
	
	@FindBy(name = "Classification Name already exists.")
	WebElement ClassificationErrormsg;
	
	@FindBy(name = "SAVE")
	WebElement Save;
	
	@FindBy(name = "Regimen Name")
	WebElement RegimenName;
	@FindBy(name = "Radio Sensitizers Name")
	WebElement RadioName;
	
	
	
	@FindBy(name = "Regimen Name already exists.")
	WebElement RegimenErrormsg;
	
	@FindBy(name = "Radio Sensitizer already exists.")
	WebElement RadioErrormsg;
	
	@FindBy(name = "Drug Name")
	WebElement DrugName;
	
	@FindBy(name = "Drug Name already exists.")
	WebElement DrugNameexits;
	
	@FindBy(name = "Input cannot be blank")
	WebElement blankmessage;
	
	@FindBy(name = "Select Any")
	WebElement SelectAny;
	
	@FindBy(name = "UPDATE")
	WebElement Update;
	
	@FindBy(name = "Dose")
	WebElement Dose;
	
	@FindBy(name = "Unit")
	WebElement Unit;
	
	
	@FindBy(className = "Button")    
    List<WebElement> allElements;
	
	/*
WebElement CloseButton = allElements.get(4);
	WebElement DoseLabel = allElements.get(5);
WebElement Addicon = allElements.get(6);
WebElement Edit = allElements.get(8);
WebElement Delete = allElements.get(9);
	
	
	@FindBy(className = "TextBox")    
    List<WebElement> TextBox;
	WebElement Drugbox = TextBox.get(0);
	
	
	@FindBy(className = "ComboBox")    
    List<WebElement> ComboBox;
	WebElement DrugUnit = ComboBox.get(1);
     
	
	*/
	
	
	
	
}
