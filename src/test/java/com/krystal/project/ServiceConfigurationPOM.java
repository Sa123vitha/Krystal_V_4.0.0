package com.krystal.project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.windows.WindowsDriver;

public class ServiceConfigurationPOM extends ReferencefileChemotheraphy {
 
	public ServiceConfigurationPOM(WindowsDriver<WebElement> driver)
	{
		PageFactory.initElements(driver, this);
	}
		
		
	 @FindBy (name = "Service Configuration")
	 WebElement serviceConfiguration;
	    
	 @FindBy (name = "Application Paths")
	 WebElement applicationPaths;	
		
	 @FindBy (name = "DICOM Import")
	 WebElement dicomImport;
		
	 @FindBy (name = "DICOM to SQL  + Tag Change")
	 WebElement dicomtoSql;	
		
	 @FindBy (name = "DICOM Export")
	 WebElement dicomExport;	
		
	 @FindBy (name = "DICOM Plan Validation")
	 WebElement dicomPlanValidation;
	
	 @FindBy (name = "Fluency Map")
	 WebElement fluencyMap;	
	
	 @FindBy (name = "SOPInstanceUID Tag Change")
	 WebElement sopInstanceuidTagchange;	
	
	 @FindBy (name = "MLC Shaper")
	 WebElement mlcShaper;	
	
	 @FindBy (name = "Create Plan From Excel")
	 WebElement createPlanFromExcel;	
	
	 @FindBy (name = "Delete DCM")
	 WebElement deleteDCM;	
	
	 @FindBy (name = "DICOM To SQL TPS Data Conversion")
	 WebElement dicomtoSqlTps;
	 
	 @FindBy (name = "Database Paths")
	 WebElement databasePaths;	
	 
	 @FindBy (name = "CBCT Viewer")
	 WebElement CBCTViewer;	
	 
	 @FindBy (name = "Source")
	 WebElement asource;
	 
	 @FindBy (name = "Database Name")
	 WebElement adatabaseName;
	 
	 @FindBy (name = "User Name")
	 WebElement auserName;
	 
	 @FindBy (name = "Password")
	 WebElement apassword;
	 
	 @FindBy (name = "Offline Siddharth Hospital")
	 WebElement offlineSiddharthHospital;
	 
	 @FindBy (name = "Offline Siddharth OfflineRnV")
	 WebElement offlineSiddharthOffline;
	 
	 @FindBy (name = "Offline Settings")
	 WebElement offlineSettings;
	 
	 @FindBy (name = "Impact Factory Settings")
	 WebElement impactFactorySettings;
	 
	 @FindBy (name = "Audit Log")
	 WebElement auditLog;
	
	 @FindBy (name = "Source")
	 WebElement bsource;
	
	 @FindBy (name = "Database Name")
	 WebElement bdatabaseName;
	 
	 @FindBy (name = "User Name")
	 WebElement buserName;
	 
	 @FindBy (name = "Password")
	 WebElement bpassword;
	 
	 @FindBy (name = "Temp Treatment")
	 WebElement tempTreatment;
	 
	 @FindBy (name = "CCB Treatment")
	 WebElement ccbTreatment;
	 
	 @FindBy (name = "MachineQA")
	 WebElement machineQA;
	 
	 @FindBy (name = "LanguageTranslator")
	 WebElement languageTranslator;
	 
	 @FindBy (name = "PatientQA")
	 WebElement PatientQA;
	 
	 @FindBy (name = "EDIT")
	 WebElement edit;
	 
	 @FindBy (name = "UPDATE")
	 WebElement update;
	 
	 @FindBy (name = "CONFIGURE ANDROID")
	 WebElement configureAndroid;
	 
	 @FindBy (name = "Log Enabled")
	 WebElement logEnabled;
	 
	 @FindBy (name = "Language Translation")
	 WebElement languageTranslation;
	 
	 @FindBy (name = "EDIT")
	 WebElement Edit;
	 
	 @FindBy (name = "UPDATE")
	 WebElement Update;
	 
	 @FindBy (name = "Impact Android Device ID")
	 WebElement ImpactAndroid;
	 
	 @FindBy (name = "CONFIGURE")
	 WebElement Configure;
		
	 @FindBy (name = "CANCEL")
	 WebElement Cancel;
	 
	 @FindBy (name = "Input cannot be empty")
	 WebElement Errordisplay;
	 
	 @FindBy (className = "TextBox")
	 WebElement element;
	 
	 @FindBy (name = "Database Connection Established")
	 WebElement Connection;
	 
	 @FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneratorSettingsMainView\"]/Custom[@ClassName=\"ServiceConfigurationView\"]/CheckBox[@ClassName=\"CheckBox\"][2]")
	 WebElement languageTranslator1;
	 
	 
	 
	 
	 
	 
	 
	 
	 
}