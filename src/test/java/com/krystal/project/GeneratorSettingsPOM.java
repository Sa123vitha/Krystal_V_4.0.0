package com.krystal.project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.appium.java_client.windows.WindowsDriver;

public class GeneratorSettingsPOM extends ReferencefileChemotheraphy{
WindowsDriver<WebElement> driver;
	
	public GeneratorSettingsPOM(WindowsDriver<WebElement> driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "Service Settings")
	WebElement generatorSettings;
	
	@FindBy(name = "Select Machine")
	WebElement selectMachine;
	
	@FindBy(name = "Generator Limitations")
	WebElement GeneratorLimitations;
	
	@FindBy(name = "Maximum mAs Limit")
	WebElement maximummAsLimit;
	
	@FindBy(name = "Maximum kW Limit")
	WebElement maximumkwLimit;
	
	@FindBy(name = "ms Range")
	WebElement msRange;
	
	@FindBy(name = "Minimum ms")
	WebElement Minms;
	
	@FindBy(name = "Maximum ms")
	WebElement Maxms;
	
	@FindBy(name = "Radiographic kV Range")
	WebElement radiographicKvRange;
	
	@FindBy(name = "Minimum kV")
	WebElement minimumkV;
	
	@FindBy(name = "Maximum kV")
	WebElement maximumkV;
	
	@FindBy(name = "kV Steps")
	WebElement kVSteps;
	
	@FindBy(name = "CBCT kV Range")
	WebElement cbctkVRange;
	
	@FindBy(name = "Minimum kV")
	WebElement cbctminimumKv;
	
	@FindBy(name = "Maximum kV")
	WebElement cbctmaximumKv;
	
	@FindBy(name = "kV Steps")
	WebElement cbctkVsteps;
	
	@FindBy(name = "X-Ray tube Sepecification")
	WebElement XraySpec;
	
	@FindBy(name = "X-Ray tube filter thickness")
	WebElement XRaytube;
	
	@FindBy(name = "SAVE")
	WebElement Save;
	
	@FindBy(name = "mA Settings")
	WebElement mASettings;
	
	@FindBy(name = "ms Settings")
	WebElement mSSettings;
	
	@FindBy(name = "Frame Rate Settings")
	WebElement frameRate;
	
	@FindBy(name = "EDIT")
	WebElement Edit;
	
	@FindBy(name = "UPDATE")
	WebElement Update;
	
	@FindBy(name = "CANCEL")
	WebElement Cancel;
	
}
