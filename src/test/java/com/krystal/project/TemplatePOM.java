package com.krystal.project;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.appium.java_client.windows.WindowsDriver;

public class TemplatePOM {

public Actions act;

public TemplatePOM(WindowsDriver<WebElement> driver) 
{                                                          
PageFactory.initElements(driver, this);                
act = new Actions(driver);                             
} 


@FindBy(name = "Templates")
WebElement TemplatesTitle;

@FindBy(name = "TREATMENT PARAMETERS")
WebElement TreatmentParameters;

@FindBy(xpath = "//Custom[@ClassName=\"PrescriptionTemplatesSection1View\"]/Text[@ClassName=\"Text\"][@Name=\"Template Name\"]/Text[@Name=\"Template Name\"][@AutomationId=\"Label\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Template Name\"]")
WebElement ATemplate_Name;

@FindBy(xpath = "//Window[@ClassName=\"Popup\"]/Menu[@ClassName=\"ContextMenu\"]/RadioButton[@ClassName=\"RadioButton\"][@Name=\"Template Name\"]")
WebElement Template_Name;

@FindBy(xpath = "//Window[@ClassName=\"Popup\"]/Menu[@ClassName=\"ContextMenu\"]/RadioButton[@ClassName=\"RadioButton\"][@Name=\"Site Name\"]")
WebElement SiteName;

@FindBy(name = "Search Template Name")
WebElement SearchTemplateName;

@FindBy(name = "Search Site Name")
WebElement SearchSiteName;

ArrayList<String> Sites;
@FindBy(xpath = "//Custom[@ClassName=\"PrescriptionTemplatesSection2View\"]/ComboBox[@ClassName=\"ComboBox\"][1]")
 @CacheLookup
 WebElement Site;

@FindBy(name = "Select any site")
WebElement Selectsite;

@FindBy(xpath = "//Text[@ClassName=\"TextBlock\"][@Name=\"Template Name\"]")
WebElement TemplateNamelbl;


@FindBy(xpath = "//Custom[@ClassName=\"PrescriptionTemplatesSection2View\"]/Edit[@ClassName=\"TextBox\"][1]")
 @CacheLookup
 WebElement TemplateName;

@FindBy(xpath = "//Custom[@ClassName=\"PrescriptionTemplatesSection2View\"]/Edit[@ClassName=\"TextBox\"][3]")
 @CacheLookup
 WebElement TargetPrescriptionDose;

@FindBy(name = "Dose Constraints")
 WebElement DoseConstraints;

@FindBy(xpath ="//Custom[@ClassName=\"PrescriptionTemplatesSection2View\"]/Edit[@ClassName=\"TextBox\"][4]")
 @CacheLookup
 WebElement MinimumDose;

@FindBy(xpath = "//Custom[@ClassName=\"PrescriptionTemplatesSection2View\"]/Edit[@ClassName=\"TextBox\"][5]")
 @CacheLookup
 WebElement MaximumDose;

@FindBy(xpath = "//Custom[@ClassName=\"PrescriptionTemplatesSection2View\"]/Edit[@ClassName=\"TextBox\"][2]")
 @CacheLookup
 WebElement NumberofFractions;


String[] PrescribedMachines = { "BHABHATRON-II_C02", "SIDDHARTH-II_C05", "BHABHATRON-3i_C04" };

@FindBy(xpath = "//Custom[@ClassName=\"PrescriptionTemplatesSection2View\"]/ComboBox[@ClassName=\"ComboBox\"][2]")
 @CacheLookup
 WebElement PrescribedMachine;

 String[] BeamTypes = {"DYNAMIC", "STATIC"};
@FindBy(xpath = "//Custom[@ClassName=\"PrescriptionTemplatesSection2View\"]/ComboBox[@ClassName=\"ComboBox\"][3]")
 @CacheLookup
 WebElement BeamType;

String[] RadiationTypes = { "PHOTON" };
@FindBy(xpath = "//Custom[@ClassName=\"PrescriptionTemplatesSection2View\"]/ComboBox[@ClassName=\"ComboBox\"][4]")
 @CacheLookup
 WebElement RadiationType;

String[] Energys = { "6","1.25" };
@FindBy(xpath = "//Custom[@ClassName=\"PrescriptionTemplatesSection2View\"]/ComboBox[@ClassName=\"ComboBox\"][5]")
 @CacheLookup
 WebElement Energy;


String[] Techniques = { "BREAST_BRIDGE", "FIXED_SSD", "ISOCENTRIC", "SKIN_APPOSITION", "TBI" }; 
@FindBy(xpath = "//Custom[@ClassName=\"PrescriptionTemplatesSection2View\"]/ComboBox[@ClassName=\"ComboBox\"][6]")
 @CacheLookup
 WebElement Technique;

@FindBy(xpath = "//Custom[@ClassName=\"PrescriptionTemplatesSection2View\"]/Edit[@ClassName=\"TextBox\"][6]")
 @CacheLookup
 WebElement IGRTCycle;

@FindBy(xpath = "//Custom[@ClassName=\"PrescriptionTemplatesSection2View\"]/Edit[@ClassName=\"TextBox\"][7]")
 @CacheLookup
 WebElement ReviewCycle;

@FindBy(xpath = "//Custom[@ClassName=\"PrescriptionTemplatesSection2View\"]/Edit[@ClassName=\"TextBox\"][8]")
 @CacheLookup
WebElement CBCCyclelabel ;

@FindBy(name = "Bolus")
 @CacheLookup
 WebElement Bolus;

@FindBy(xpath = "//RadioButton[@ClassName=\"RadioButton\"][@Name=\"Yes\"]")
 @CacheLookup
 WebElement BolusYes;

@FindBy(xpath = "//RadioButton[@ClassName=\"RadioButton\"][@Name=\"No\"]")
 @CacheLookup
 WebElement BolusNo;

@FindBy(name = "Gating")
 WebElement Gating;

@FindBy(xpath ="//RadioButton[@ClassName=\"RadioButton\"][@Name=\"Yes\"][2]")
 @CacheLookup
 WebElement GatingYes;

@FindBy(xpath ="//RadioButton[@ClassName=\"RadioButton\"][@Name=\"No\"][2]")
 @CacheLookup
 WebElement GatingNo;

@FindBy(name = "SAVE")
 WebElement Save;

@FindBy(xpath = "//Custom[@ClassName=\"PrescriptionTemplatesSection1View\"]/Pane[@ClassName=\"ScrollViewer\"]/Button[@ClassName=\"Button\"][1]")
 WebElement ViewTemplate;

@FindBy(xpath = "//Custom[@ClassName=\"PrescriptionTemplatesSection1View\"]/Pane[@ClassName=\"ScrollViewer\"]/Button[@ClassName=\"Button\"][2]")
WebElement Delete;

@FindBy(name = "EDIT")
 WebElement Edit;

@FindBy(name = "UPDATE")
WebElement Update;


@FindBy(xpath = "//Text[contains(@Name,Input must not contain)]")
WebElement Inputcontains;

@FindBy(xpath="//Custom[@ClassName=\"PrescriptionTemplatesSection2View\"]/Edit[@ClassName=\"TextBox\"]/Text[@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"]")
  List<WebElement> warnmsg;

@FindBy(xpath="//Custom[@ClassName=\"PrescriptionTemplatesSection2View\"]/Edit[@ClassName=\"TextBox\"]/Text[@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"]")
 List<WebElement> warnmsgC;

//0--Templatename, 1--No of fraction, 2-- target, 3--min, 4--max, 5--igrt,6--review,7--cbc, 8--oarname,9--Oarmin, 10--OarMax

//******** OAR Constraints*****************


	@FindBy(xpath = "//Custom[@ClassName=\"PrescriptionTemplatesSection2View\"]/Button[@AutomationId=\"BtnMoreAdd\"]")
	 WebElement OARAdd;
	
	@FindBy(name = "OAR")
	 WebElement OAR;
	
	@FindBy(name = "Min Dose (cGy)")
	 WebElement MinDose;
	
	@FindBy(name = "Mean Dose (cGy)")
	 WebElement MeanDose;
	
	@FindBy(name = "Max Dose (cGy)")
	 WebElement MaxDose;
	
	@FindBy(name = "Description")
	 WebElement Description;
	
	@FindBy(name = "INSERT")
	 WebElement OARInsertButton;
	
	@FindBy(name = "CLOSE")
	 WebElement OARCloseButton;
	
	@FindBy(xpath = "//Custom[@ClassName=\"PrescriptionTemplatesSection2View\"]/Edit[@ClassName=\"TextBox\"][9]")
	 @CacheLookup
	 WebElement OARName;
	
	@FindBy(xpath = "//Custom[@ClassName=\"PrescriptionTemplatesSection2View\"]/Edit[@ClassName=\"TextBox\"][10]")
	 @CacheLookup
	 WebElement OARMinDose;
	
	@FindBy(xpath = "//Custom[@ClassName=\"PrescriptionTemplatesSection2View\"]/Edit[@ClassName=\"TextBox\"][11]")
	 @CacheLookup
	 WebElement OARMaxDose;
	
	@FindBy(xpath = "//Custom[@ClassName=\"PrescriptionTemplatesSection2View\"]/Edit[@ClassName=\"TextBox\"][12]")
	 @CacheLookup
	 WebElement OARMeanDose;
	
	@FindBy(xpath = "//Custom[@ClassName=\"PrescriptionTemplatesSection2View\"]/Edit[@ClassName=\"TextBox\"][13]")
	 @CacheLookup
	 WebElement OARDescription;
	
	@FindBy(name = "Template Add")
	 WebElement WAddTemplateTitle;
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"MessageWindow\"]/Pane[@ClassName=\"ScrollViewer\"]/Text[@AutomationId=\"txtblockmessage\"]")
	WebElement WAddTemplateDescription;
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"MessageWindow\"]/Button[@Name=\"OK\"][starts-with(@AutomationId,\"successButton\")]")
	 WebElement WAddTemplateOK;
	
	@FindBy(name = "Template Update")
	 WebElement WUpadteTemplateTitle;
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"MessageWindow\"]/Button[@Name=\"CANCEL\"][starts-with(@AutomationId,\"successButton\")]")
	 WebElement WAddTemplateCancel;
	
	@FindBy(name = "Template Delete")
	 WebElement WDeleteTemplateTitle;
	
	@FindBy(name = "OAR Constraints Delete")
	 WebElement WOARTitle;
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"MessageWindow\"]/Pane[@ClassName=\"ScrollViewer\"]/Text[@AutomationId=\"txtblockmessage\"]")
	 WebElement WDeleteTemplateDescription;
	
	@FindBy(xpath = "//Custom[@ClassName=\"PrescriptionTemplatesSection1View\"]/Button[@AutomationId=\"SearchMenuButton\"]")
	 WebElement Searchmenu;
	

	@FindBy(xpath = "//Custom[@ClassName=\"PrescriptionTemplatesSection2View\"]/Button[@ClassName=\"Button\"][@Name=\"PATIENT IMMOBILIZATION SETUP\"]")
	 WebElement PatientImmobilzationsetupbutton;
	
	@FindBy(xpath = "//Custom[@ClassName=\"PrescriptionTemplatesSection1View\"]/Pane[@ClassName=\"ScrollViewer\"]/Text[@ClassName=\"Text\"]/Text[@AutomationId=\"Label\"]/Text[@ClassName=\"TextBlock\"]")
	@CacheLookup
	List<WebElement> TemplatesNames;
	
	@FindBy(xpath = "//Custom[@ClassName=\"PrescriptionTemplatesSection1View\"]/Pane[@ClassName=\"ScrollViewer\"]/Text[@ClassName=\"Text\"]/Text[@AutomationId=\"Label\"]/Text[@ClassName=\"TextBlock\"]")
	List<WebElement> TextNameC;

//	@FindBy(className = "TextBlock")
//	@CacheLookup
//	List<WebElement> LabelNames;
	
	@FindBy(xpath = "//Custom[@ClassName=\"PrescriptionTemplatesSection2View\"]/Edit[@ClassName=\"TextBox\"]/Text[@AutomationId=\"LblName\"]/Text[@ClassName=\"TextBlock\"]")
	List<WebElement> LabelNames;
	
//	@FindBy(className = "TextBlock")
//	List<WebElement> TextName1;
	
	@FindBy(xpath ="//Custom[@ClassName=\"PrescriptionTemplatesMainView\"]/Custom[@ClassName=\"PrescriptionTemplatesSection1View\"]/Pane[@ClassName=\"ScrollViewer\"]/Button[@ClassName=\"Button\"]")
	List<WebElement> ButtonName;
	
	@FindBy(className = "Button")
	 @CacheLookup
	List<WebElement> ButtonNames;
	
	@FindBy(className = "Button")
	List<WebElement> ButtonNamesC;
	
	@FindBy(className = "Button")
	List<WebElement> Button;
	
	@FindBy(className = "ListBoxItem")
	 @CacheLookup
	 List<WebElement> Dropdown;

	
	@FindBy(className = "ListBoxItem")
	 List<WebElement> DropdownC;
	
	@FindBy(className = "CheckBox")
	 @CacheLookup
	 List<WebElement> Checkbox;
	
	@FindBy(className = "CheckBox")
	 List<WebElement> CheckboxC;
	
	@FindBy(xpath ="//Pane[@ClassName=\"ScrollViewer\"]/Text[@AutomationId=\"LabelData\"]/Text[@AutomationId=\"Label\"]/Text[@ClassName=\"TextBlock\"]")
	List<WebElement> IMDlabelC;
	
	@FindBy(xpath ="//Pane[@ClassName=\"ScrollViewer\"]/Text[@AutomationId=\"LabelData\"]/Text[@AutomationId=\"Label\"]/Text[@ClassName=\"TextBlock\"]")
	@CacheLookup
	List<WebElement> IMDlabel;
	
	@FindBy(xpath="//Thumb[@LocalizedControlType='thumb']")
	public static WebElement MScroll;
	
	@FindBy(className = "Thumb")
	public static
	WebElement Dropdownscroll;
	
	@FindBy(xpath="//Custom[@ClassName=\"PrescriptionTemplatesSection2View\"]/DataGrid[@ClassName=\"DataGrid\"]/DataItem[@ClassName=\"DataGridRow\"][@Name=\"Presentation.UiElements.ViewModels.TableViewModel\"]/Custom[@ClassName=\"DataGridCell\"]")
	List<WebElement> OarGrid;
	
	@FindBy(xpath="//Custom[@ClassName=\"PrescriptionTemplatesMainView\"]/Custom[@ClassName=\"PrescriptionTemplatesSection1View\"]/Edit[@ClassName=\"TextBox\"]/Edit[starts-with(@AutomationId,\"presenter\")]")
	@CacheLookup
	WebElement Searchbox;


	@FindBy(name = "Please Select any site")
	 WebElement Siteerror;
	
	@FindBy(name = "Please enter a name for the template")
	 WebElement Templateerror;
	
	@FindBy(name = "Input cannot be blank")
	 WebElement Inputblank;
	
	@FindBy(xpath = "//Button[contains(@HelpText, 'Add Field')]")                
	 WebElement Addfield;
	
	@FindBy(xpath = "//Button[contains(@HelpText, 'Reset')]")                
	 WebElement Reset;

	@FindBy(xpath = "//TextBlock[contains(@Name,'Prescription Template')]")                
	 WebElement Ptemplate;
	
	
	@FindBy(name = "CLOSE")                
	 WebElement Close;
	
	@FindBy(name = "Do you want to delete the selected Template?")                
	 WebElement Deletepopup;
	
	
	@FindBy(name = "Template Name already exists, please enter a different name!")                
	 WebElement TemplateNameexits;
		
//	@FindBy(xpath ="//Button[@HelpText=\"View Template\"][0]")

	// WebElement ViewTemplate;
	
	









  
}
