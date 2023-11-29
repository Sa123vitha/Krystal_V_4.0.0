package com.krystal.project;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.appium.java_client.windows.WindowsDriver;

public class ChemoTherapyPOM {

	
	private Actions act;

	public ChemoTherapyPOM(WindowsDriver<WebElement> driver)
	{
		PageFactory.initElements(driver, this);
		act = new Actions(driver);
	} 
	
	@FindBy (xpath = "//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection2View\"]/Edit[@AutomationId=\"TextBoxViewModelRemarksMaxDose\"]/Text[@Name=\"Remarks\"][@AutomationId=\"LblName\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Remarks\"]")
	 WebElement Remarks1;
	
	
	
	@FindBy (xpath = "//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection2View\"]/ComboBox[starts-with(@AutomationId,\"ComboBoxViewModelDrug\")]")
	 WebElement Drugs1;
		
		@FindBy (xpath = "//Button[@HelpText=\"Add Tabs\"]")
		 WebElement Tabs;
		
		@FindBy (xpath = "//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection2View\"]/Button[starts-with(@AutomationId,\"BtnMoreAdd\")]")
		 WebElement Addfield;
		
		
		@FindBy (xpath = "//RadioButton[@Name=\"Chemotherapy\"]")
		 WebElement Chemotherapy;
		
		@FindBy (xpath = "//RadioButton[@Name=\"External Beam Radiotherapy\"]")
		 WebElement EBRT;
		
		@FindBy (xpath = "//Button[@HelpText=\"New Site,Phase\"]")
		 WebElement NewSite;
		
		@FindBy(name ="EXPORT")
		 
		 WebElement Export;
		
		@FindBy(name ="SAVE")
		 
		 WebElement Save;
		
		
		

		@FindBy(name ="Patient BSA Calculation")
		 @CacheLookup
		 WebElement bsa;
		
		@FindBy(name ="Treatment Type")
		 @CacheLookup
		 WebElement treattype;
		
		@FindBy(name ="Frequency")
		 @CacheLookup
		 WebElement freq;
		
		@FindBy(name ="Created Date and Time")
		 @CacheLookup
		 WebElement created;
		
		@FindBy(name ="Last Modified Date and Time")
		 @CacheLookup
		 WebElement modified;
		
		@FindBy(name ="New Site,Phase")
		 @CacheLookup
		 WebElement newphase;
		
		@FindBy(name ="Site")
		 @CacheLookup
		 WebElement site;
		
		@FindBy(name ="Click here to open menu")
		 @CacheLookup
		 WebElement menu1;
		
		@FindBy(name ="PRESCRIBED DEVICES")
		 @CacheLookup
		 WebElement presdevices;
		
		@FindBy(name ="PATIENT IMMOBILIZATION SETUP")
		 @CacheLookup
		 WebElement setup;
		
		@FindBy(name ="Sign Out (User ID: M)']")
		 @CacheLookup
		 WebElement signout;
		
		@FindBy(name ="Click here for Theme Menu")
		 @CacheLookup
		 WebElement theme1;
		
		@FindBy(name ="Belly Board")
		 @CacheLookup
		 WebElement belly;
		
		@FindBy(name ="Breast Board")
		 @CacheLookup
		 WebElement breast;
		
		@FindBy(name ="Head and Shoulder Base Plate")
		 @CacheLookup
		 WebElement head;
		
		@FindBy(name ="Knee fix Feet fix system")
		 @CacheLookup
		 WebElement kneefix;
		
		@FindBy(name ="Kneefix Base plate")
		 @CacheLookup
		 WebElement kneebase;
		
		@FindBy(name ="Pelvic Base plate")
		 @CacheLookup
		 WebElement pelvicbase;
		
		@FindBy(name ="Sigma Lite Board")
		 @CacheLookup
		 WebElement sigmalite;
		
		@FindBy(name ="Wing Board")
		 @CacheLookup
		 WebElement wing;
		
		@FindBy(name ="PATIENT IMMOBILIZATION SETUP")
		 @CacheLookup
		 WebElement patientsetup;
		
		
		@FindBy(name ="GENERAL / ADDITIONAL MEDICATIONS")
		 @CacheLookup
		 WebElement general;
		
		@FindBy(name ="Date and Time")
		 @CacheLookup
		 WebElement date;
		
		@FindBy(name ="Classification")
		 @CacheLookup
		 WebElement classification;
		
		@FindBy(name ="Time")
		 @CacheLookup
		 WebElement time;
		
		@FindBy(name ="Drug")
		 @CacheLookup
		 WebElement drug;
		
		@FindBy(name ="Drug Form")
		 @CacheLookup
		 WebElement drugform;
		
		@FindBy(name ="RadioSensitizers")
		 @CacheLookup
		 WebElement radio;
		
		@FindBy(name ="Software Version :")
		 @CacheLookup
		 WebElement software;
		
		@FindBy(name ="4.0.0 A7")
		 @CacheLookup
		 WebElement version;
		
		@FindBy(name ="Licensed to : Hospital_Name")
		 @CacheLookup
		 WebElement license;
		
		 
	    @FindBy(name ="Post-Surgery")
	    @CacheLookup
		 WebElement PostSurgery;
	    
	    @FindBy(name ="Patient Weight")
	    @CacheLookup
		 WebElement weight;
	    
	    @FindBy(name ="Patient Height")
	    @CacheLookup
		 WebElement height;
	    
	    @FindBy(name ="Phase")
	    @CacheLookup
		 WebElement phase1;
	    
	    @FindBy(name ="Dose")
	    @CacheLookup
		 WebElement dose;
	    
	    @FindBy(name ="Every")
	    @CacheLookup
		 WebElement every;
	    
	    @FindBy(name ="Days")
	    @CacheLookup
		 WebElement days;
	    
	    @FindBy(name ="Cycles")
	    @CacheLookup
		 WebElement cycle;
	    
	    @FindBy(name ="Symptoms")
	    @CacheLookup
		 WebElement symp;
		
		@FindBy(name ="Pre-Surgery")
		 @CacheLookup
		 WebElement PreSurgery;
		
		// @FindBy(xpath = "//Button[contains(@HelpText, 'Sign Out (User ID: m)')]")                
		// WebElement Signout;
		 
		// @FindBy(xpath = "//Button[contains(@HelpText, 'Click here to open menu')]")                
		// WebElement Menu;
		 
		// @FindBy(xpath = "//Button[contains(@HelpText, 'Click here for Theme Menu')]")                
		// WebElement Theme;
		 
		 @FindBy(xpath = "//Button[contains(@HelpText, 'New Site,Phase)]")              
		 WebElement Phase;
		 
		 @FindBy(xpath = "//Button[contains(@HelpText, 'Add Field)]")              
		 WebElement addfield;
		
		@FindBy(name ="Post-Radiation")
		 @CacheLookup
		 WebElement PostRadiation;
		
		@FindBy(name ="Symptoms")
		 @CacheLookup
		 WebElement symptoms;
		
		@FindBy(name ="Pre-Radiation")
		 @CacheLookup
		 WebElement PreRadiation;		
		@FindBy(name ="Concurrent")
		 @CacheLookup
		 WebElement Concurrent;
		
		
		@FindBy(name ="Topical")
		 WebElement Topical;
		
		@FindBy(name ="Oral")
		 WebElement Oral;
		
		@FindBy(name ="Injection")
		 WebElement Injection;
		
		@FindBy(name ="Intravenous")
		 WebElement Intravenous;
		
		@FindBy(name ="IntraArterial")
		 WebElement IntraArterial;
		
		@FindBy(name ="IntraPeritoneal")
		 WebElement IntraPeritoneal;
		
		@FindBy(name ="Intrathecal")
		 WebElement Intrathecal;
		
		@FindBy(name ="Others")
		 @CacheLookup
		 WebElement Others;
		
		@FindBy(name ="Remarks")
		 @CacheLookup
		 WebElement remark;
		
		@FindBy(name ="Regimens")
		 @CacheLookup
		 WebElement regimen;
		
		String[] TreatmentTypes = { "Post-Surgery", "Pre-Surgery", "Post-Radiation", "Pre-Radiation", "Concurrent","Others" };
		 @FindBy( xpath="//Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection2View\"]/ComboBox[@AutomationId=\"ComboBoxViewModelTreatmentType\"]")
		@CacheLookup
		WebElement TreatmentType;

		 @FindBy( xpath="//Button[@HelpText=\"Add Tabs\"][2]")
		 @CacheLookup
		 WebElement Addtab;
		 
		 @FindBy( xpath="//Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"NavigationTopBarMiniTabsView\"]/Pane[@ClassName=\"ScrollViewer\"]/Button[@ClassName=\"Button\"]")
		 List<WebElement> SitePhase;
		 
		 @FindBy( xpath="//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"NavigationTopBarSubView\"]/Pane[@ClassName=\"ScrollViewer\"]/Button[@ClassName=\"Button\"]")
		 List<WebElement>  Rtids;
		 
		@FindBy(xpath ="//Custom[@ClassName=\"PrescriptionSection2View\"]/Text[@Name=\"Link Prescription\"][@AutomationId=\"LinkPrescription\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Link Prescription\"]")
		 @CacheLookup
		 WebElement LinkPrescriptionlbl;
		
		@FindBy(xpath ="//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection2View\"]/ComboBox[@AutomationId=\"ComboBoxViewModelLinkPrescription\"]")
		 @CacheLookup
		 WebElement LinkPrescription;

	//	String[] Sites = { "Head", "Leg" };
		ArrayList<String>Sites;
		@FindBy(xpath ="//Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection2View\"]/ComboBox[@AutomationId=\"ComboBoxViewModelSite\"]")
		 @CacheLookup
		 WebElement Site;
		
		 @FindBy(xpath ="//Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection1View\"]/Button[@AutomationId=\"NumericUpDownPhaseNo\"]/Text[@AutomationId=\"TxtNum\"]")
		 @CacheLookup
		 WebElement phasenum;	
		 
		//String[] Classifications = { "abc", "def", "ghi" };
		ArrayList<String>Classifications;
		@FindBy(xpath ="//Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection2View\"]/ComboBox[@AutomationId=\"ComboBoxViewModelClassification\"]")
		 @CacheLookup
		 WebElement Classification;
		
		//String[] Drugs = { "Drug", "Drug1", "Drug2", "Drug3", "Drug4" };
		ArrayList<String>Drugs;
		@FindBy(xpath ="//Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection2View\"]/ComboBox[@AutomationId=\"ComboBoxViewModelDrug\"]")
		 @CacheLookup
		 WebElement Drug;
		
		String[] DrugForms = { "Topical", "Oral", "Injection", "Intravenous", "IntraArterial", "Intraperitoneal", "intrathecal" };
		@FindBy(xpath ="//Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection2View\"]/ComboBox[@AutomationId=\"ComboBoxViewModelDrugForm\"]")
		 @CacheLookup
		 WebElement DrugForm;
		
		//String[] RadioSensitizers = { "Radio1", "Radio2", "Radio3" };
		ArrayList<String>RadioSensitizers;
		@FindBy(xpath ="//Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection2View\"]/ComboBox[@AutomationId=\"ComboBoxViewModelRadioSensitizers\"]")
		 @CacheLookup
		 WebElement RadioSensitizer;
		
		//String[] Regimens = { "Regiemen1", "Regimen2","Regimen2" };
		ArrayList<String>Regimens;
		@FindBy(xpath ="//Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection2View\"]/ComboBox[@AutomationId=\"ComboBoxViewModelRegimens\"]")
		 @CacheLookup
		 WebElement Regimen;
		
	//	String[] DrugDoses ;
		ArrayList<String>DrugDoses;
		@FindBy(xpath ="//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection2View\"]/ComboBox[@AutomationId=\"ComboBoxViewModelDrugDose\"]")
		 @CacheLookup
		 WebElement DrugDose;
		
		@FindBy(xpath ="//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"NavigationTopBarMiniTabsView\"]/Button[@Name=\"SAVE\"][starts-with(@AutomationId,\"UpdateBtn\")]")
		 @CacheLookup
		 WebElement Save1;
		
	
		
		@FindBy(xpath ="//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection2View\"]/Edit[@AutomationId=\"TextBoxViewModelPatientWeight\"]")
		 @CacheLookup
		 WebElement PatientWeight;
		
		String[] PatientWeightUnit = {"kg","lbs"};
		@FindBy(xpath ="//Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection2View\"]/ComboBox[@AutomationId=\"ComboBoxViewModelPatientWeight\"]")
		 @CacheLookup
		 WebElement PatientWeight_D;
		
		String[] PatientHeightUnit = {"cm","inches"};
		@FindBy(xpath ="//Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection2View\"]/ComboBox[@AutomationId=\"ComboBoxViewModelPatientHeight\"]")
		 @CacheLookup
		 WebElement PatientHeight_D;
		
		@FindBy(xpath ="//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection2View\"]/Edit[@AutomationId=\"TextBoxViewModelPatientHeight\"]")
		 @CacheLookup
		 WebElement PatientHeight;
		
		@FindBy(xpath ="//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection2View\"]/Edit[@AutomationId=\"TextBoxViewModelDose\"]")
		 @CacheLookup
		 WebElement Dose;
		
		@FindBy(xpath ="//Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection2View\"]/RadioButton[@Name=\"Weekly\"][@AutomationId=\"Weekly\"]")
		 @CacheLookup
		 WebElement WeeklyRadiobutton;
		
		@FindBy(xpath ="//Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection2View\"]/RadioButton[@Name=\"Weekly\"][@AutomationId=\"Weekly\"]/Text[@Name=\"Weekly\"][@AutomationId=\"RadioLabel\"]")
		 @CacheLookup
		 WebElement Weeklylbl;
		
		@FindBy(xpath ="//Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection2View\"]/CheckBox[@Name=\"Monday\"][@AutomationId=\"Monday\"]")
		 @CacheLookup
		 WebElement Monday;
		
		@FindBy(xpath ="//Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection2View\"]/CheckBox[@Name=\"Tuesday\"][@AutomationId=\"Tuesday\"]")
		 @CacheLookup
		 WebElement Tuesday;
		
		@FindBy(xpath ="//Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection2View\"]/CheckBox[@Name=\"Wednesday\"][@AutomationId=\"Wednesday\"]")
		 @CacheLookup
		 WebElement Wednesday;
		
		@FindBy(xpath ="//Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection2View\"]/CheckBox[@Name=\"Thursday\"][@AutomationId=\"Thursday\"]")
		 @CacheLookup
		 WebElement Thursday;
		
		@FindBy(xpath ="//Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection2View\"]/CheckBox[@Name=\"Friday\"][@AutomationId=\"Friday\"]")
		 @CacheLookup
		 WebElement Friday;
		
		@FindBy(xpath ="//Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection2View\"]/CheckBox[@Name=\"Saturday\"][@AutomationId=\"Saturday\"]")
		 @CacheLookup
		 WebElement Saturday;
		
		@FindBy(xpath ="//Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection2View\"]/CheckBox[@Name=\"Sunday\"][@AutomationId=\"Sunday\"]")
		 @CacheLookup
		 WebElement Sunday;
		
		@FindBy(xpath ="//Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection2View\"]/RadioButton[@Name=\"Custom\"][@AutomationId=\"Custom\"]")
		 @CacheLookup
		 WebElement CustomRadiobutton;
		
		@FindBy(xpath ="//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection2View\"]/RadioButton[@Name=\"Custom\"][@AutomationId=\"Custom\"]/Text[@Name=\"Custom\"][@AutomationId=\"RadioLabel\"]")
		 @CacheLookup
		 WebElement Customlbl;
		
		@FindBy(xpath ="//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection2View\"]/Edit[@AutomationId=\"TextBoxViewModelEvery\"]")
		@CacheLookup
		 WebElement Every;
		
		@FindBy(xpath ="//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection2View\"]/Edit[@AutomationId=\"TextBoxViewModelEvery\"]/Text[@ClassName=\"Text\"]")
		 WebElement Every1;
		
	
		@FindBy(xpath ="//Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection2View\"]/Text[@ClassName=\"Text\"][@Name=\"Days\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Days\"]")
		 @CacheLookup
		 WebElement Days;
		
		@FindBy(xpath ="//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection2View\"]/Edit[@AutomationId=\"TextBoxViewModelCycles\"]")
		 @CacheLookup
		 WebElement Cycles;
		
		@FindBy(xpath ="//Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection2View\"]/Button[starts-with(@AutomationId,\"BtnMoreAdd\")]")
		 @CacheLookup
		 WebElement AddMedications;
		
//		@FindBy(xpath ="//Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection2View\"]/Pane[@AutomationId=\"GeneralAdditionalMedicationsScrolviewer\"]/Edit[@AutomationId=\"TextBoxViewModelSymptoms\"]")
//		 @CacheLookup
//		 List<WebElement> Symptom;
//		
//		@FindBy(xpath ="//Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection2View\"]/Pane[@AutomationId=\"GeneralAdditionalMedicationsScrolviewer\"]/Edit[@AutomationId=\"TextBoxViewModelSymptoms\"]")
//		 List<WebElement> SymptomC;
//		
//		@FindBy(xpath ="//Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection2View\"]/Pane[@AutomationId=\"GeneralAdditionalMedicationsScrolviewer\"]/Edit[@AutomationId=\"TextBoxViewModelRemarks\"]")
//		 @CacheLookup
//		List<WebElement> Remarks;
//		
//		@FindBy(xpath ="//Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection2View\"]/Pane[@AutomationId=\"GeneralAdditionalMedicationsScrolviewer\"]/Edit[@AutomationId=\"TextBoxViewModelRemarks\"]")
//		 List<WebElement> RemarksC;
//		
//		@FindBy(xpath ="//Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection2View\"]/Pane[@AutomationId=\"GeneralAdditionalMedicationsScrolviewer\"]/ComboBox[@AutomationId=\"ComboBoxViewModelDrug\"]")
//		List<WebElement> DrugMedication;
//		
		@FindBy(xpath ="//Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection2View\"]/Pane[@AutomationId=\"GeneralAdditionalMedicationsScrolviewer\"]/Button[@AutomationId=\"DeleteButton\"]")
		List<WebElement> deleteMedication;
		
		@FindBy(xpath ="//Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection2View\"]/Pane[@AutomationId=\"GeneralAdditionalMedicationsScrolviewer\"]/Button[@AutomationId=\"DeleteButton\"]")
		List<WebElement> deleteMedicationWoutC;
		
		@FindBy(xpath ="//Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection2View\"]/Edit[@AutomationId=\"TextBoxViewModelSymptoms\"]")
		@CacheLookup
		WebElement Symptom;
		
		@FindBy(xpath ="//Custom[@ClassName=\"PrescriptionSection2View\"]/Edit[@AutomationId=\"TextBoxViewModelRemarksMaxDose\"]")
		@CacheLookup
		WebElement Remarks;
		
		//@FindBy(xpath ="//ComboBox[starts-with(@AutomationId,\"ComboBoxViewModelDrug1\")")
		@FindBy(className ="ComboBox")
		@CacheLookup
		List<WebElement> combobox;
		
		@FindBy(className ="Button")
		@CacheLookup
		List<WebElement> PhaseNo;
		
		@FindBy(className ="ToolTip")
		@CacheLookup
		List<WebElement> ToolTip;
		
		
//		@FindBy(xpath ="//Window[@ClassName=\"Window\"][@Name=\"MessageWindow\"]/Pane[@ClassName=\"ScrollViewer\"][starts-with(@Name,\"Do you want to delete the selected General/Additional Medication\")]/Text[starts-with(@Name,\"Do you want to delete the selected General/Additional Medication\")]")
//		WebElement WDeletedescription;
		@FindBy(xpath ="//Pane[@ClassName=\"ScrollViewer\"]/Text[@AutomationId=\"txtblockmessage\"]")
		WebElement WDeletedescription;
		
		@FindBy(xpath ="//Window[@ClassName=\"Window\"][@Name=\"MessageWindow\"]/Button[@Name=\"OK\"][starts-with(@AutomationId,\"successButton\")]")
		 WebElement Wok;
		
		@FindBy(xpath ="//Window[@ClassName=\"Window\"][@Name=\"MessageWindow\"]/Button[@Name=\"CANCEL\"][starts-with(@AutomationId,\"successButton\")]")
		 WebElement WCancel;
		
		@FindBy(name ="General/Additional Medication  Delete")
		 WebElement WMedicationTiltle;
		
		@FindBy(name ="General Medications Delete")
		 WebElement WMedicationTiltle2;
		
		@FindBy(xpath ="//Window[@ClassName=\"Window\"][@Name=\"MessageWindow\"]/Pane[@ClassName=\"ScrollViewer\"][starts-with(@Name,\"Chemotherapy Prescription data saved for selected site and phase\")]/Text[starts-with(@Name,\"Chemotherapy Prescription data saved for selected site and phase\")][@AutomationId=\"txtblockmessage\"]")
		 WebElement WsaveDescription;
		
		@FindBy(name ="Chemotherapy Prescription Save")
		 WebElement WSaveTiltle;
		
		 @FindBy(name="Delete")
		 WebElement DeleteTab;
		 
		 @FindBy(name="ChemoPrescription Delete")
		 WebElement WDeleteTitle;
		 
		 @FindBy(xpath ="//Window[@ClassName=\"Window\"][@Name=\"MessageWindow\"]/Pane[@ClassName=\"ScrollViewer\"][@Name=\"Do you want to delete the selected ChemoPrescription?\"]/Text[@Name=\"Do you want to delete the selected ChemoPrescription?\"][@AutomationId=\"txtblockmessage\"]")
		 WebElement WDeleteDescription;
		 
		 @FindBy(name="Chemotherapy Prescription Delete")
		 WebElement WDeleteTitle2;
		 
		 @FindBy(xpath ="//Window[@ClassName=\"Window\"][@Name=\"MessageWindow\"]/Pane[@ClassName=\"ScrollViewer\"][@Name=\"Selected Chemotherapy Prescription deleted.\"]/Text[@Name=\"Selected Chemotherapy Prescription deleted.\"][@AutomationId=\"txtblockmessage\"]")
		 WebElement WDeleteDescription2;
		 
		// @FindBy(xpath ="//Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"NavigationTopBarMiniTabsView\"]/Button[@Name=\"EDIT\"][starts-with(@AutomationId,\"UpdateBtn\")]")
		// WebElement Edit;
		 
		// @FindBy(xpath ="//Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"NavigationTopBarMiniTabsView\"]/Button[@Name=\"UPDATE\"][starts-with(@AutomationId,\"UpdateBtn\")]")
		// WebElement Update;
		 
		 @FindBy(xpath ="//Window[@ClassName=\"Window\"][@Name=\"MessageWindow\"]/Pane[@ClassName=\"ScrollViewer\"][@Name=\"ChemoPrescription data updated for selected site and phase.\"]/Text[@Name=\"ChemoPrescription data updated for selected site and phase.\"][@AutomationId=\"txtblockmessage\"]")
		 WebElement WUpdateDescription;
		 
		 @FindBy(name="ChemoPrescription Update")
		 WebElement WUpdateTitle;
		 
		 @FindBy(xpath ="//Custom[@ClassName=\"PrescriptionSection2View\"]/Button[@Name=\"INSERT\"][@AutomationId=\"InsertButton\"]")
		 WebElement Insert;
		 
		 @FindBy(xpath ="//Custom[@ClassName=\"PrescriptionSection2View\"]/Button[@Name=\"CLOSE\"][@AutomationId=\"CloseButton\"]")
		 WebElement Close;
		 
		 @FindBy(xpath="//Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection2View\"]/Edit[@AutomationId=\"TextBoxViewModelPatientWeight\"]/Text[@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"]")
		 List<WebElement> Warnmsg;
		 
		 @FindBy(xpath="//Custom[@ClassName=\"PrescriptionSection2View\"]/Edit[@AutomationId=\"TextBoxViewModelSymptoms\"]/Text[@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"]")
		 WebElement Symptomwarn;

		 @FindBy(name = "TREATMENT PARAMETERS")
		 WebElement TreatmentParameters;
		 
		 
		 @FindBy(name = "Prescription")
		 WebElement Titlename;
		 
		
		
			
		
		 @FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"NavigationTopBarView\"]/Button[@AutomationId=\"ToolTip\"]") 
			WebElement Menu;
			
		    @FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"NavigationTopBarView\"]/Button[@ClassName=\"Button\"]")
			WebElement Signout;
			
		    @FindBy (xpath ="//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"NavigationTopBarView\"]/Button[@AutomationId=\"SearchMenuBuutton\"]")
		    WebElement Theme;
			
		    @FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"NavigationTopBarView\"]/Button[@AutomationId=\"SearchMenuButton\"]")
		    WebElement Password;
			
		 //   @FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"NavigationTopBarView\"]/Text[@ClassName=\"Text\"][@Name=\"Demographics\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Prescription\"]")
		 //   WebElement Titlename;
			
		    @FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"NavigationTopBarView\"]/Image[@ClassName=\"Image\"]")
		    WebElement Productlogo;
			
		    @FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"NavigationTopBarSubView\"]/Button[@ClassName=\"Button\"]")
		    WebElement Patientlist;
			
		    @FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"NavigationTopBarSubView\"]/Button[@ClassName=\"Button\"]") 
		    WebElement Addpatient;
			
		    @FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"SideMenuSubView\"]/Text[@ClassName=\"Text\"][@Name=\"Patient Menu\"]/Text[@Name=\"Patient Menu\"][@AutomationId=\"Label\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Patient Menu\"]")
		    WebElement PatientMenu;
			
		    @FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"SideMenuSubView\"]/Button[@ClassName=\"Button\"][@Name=\"DEMOGRAPHICS\"]")
		    WebElement Demographics;
		    
		    @FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"SideMenuSubView\"]/Button[@ClassName=\"Button\"][@Name=\"PRESCRIPTION\"]")
		    WebElement Prescription;
		    
		    @FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"SideMenuSubView\"]/Button[@ClassName=\"Button\"][@Name=\"PLAN APPROVAL\"]")
		    WebElement PlanAprroval;
		    
		    @FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"SideMenuSubView\"]/Button[@ClassName=\"Button\"][@Name=\"SCHEDULING\"]")
		    WebElement Scheudling;
		    
		    @FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"SideMenuSubView\"]/Button[@ClassName=\"Button\"][@Name=\"VITALS\"]")
		    WebElement Vitals;
		    
		    @FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"SideMenuSubView\"]/Button[@ClassName=\"Button\"][@Name=\"LAB REPORTS\"]")
		    WebElement LabReports;
		    
		    @FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"SideMenuSubView\"]/Button[@ClassName=\"Button\"][@Name=\"TREATMENT REVIEW\"]")
		    WebElement TreatmentReview;
		
			@FindBy(name = "Select any site")
			 WebElement Sitemsg;
			
			@FindBy(name = "EDIT")
			 WebElement Edit;
			
			@FindBy(name = "UPDATE")
			 WebElement Update;
			 
			 
		
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

}

