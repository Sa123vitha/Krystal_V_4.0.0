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

public class PrescriptionPOM {

	
	private Actions act;

	public PrescriptionPOM(WindowsDriver<WebElement> driver)
	{
		PageFactory.initElements(driver, this);
		act = new Actions(driver);
	}
	
	Boolean AddordeleteOardata=true;// global variable  if only oar data added or delete make AddordeleteOardata=true to skip of saving all the data
	  Boolean Withoutsavedelete=false;// global variable if oar added or deleted before saving prescription make Withoutsavedelete=true
	
	//GUI
	 
	
	 @FindBy(name = "Prescription")
	 WebElement PrescriptionTitle;
	 
	 @FindBy(name = "Patient Menu")
	 WebElement Patient_Menu;
	 
	 @FindBy(name = "DEMOGRAPHICS")
	 WebElement DEMOGRAPHICS;
	 
	 @FindBy(name = "PRESCRIPTION")
	 WebElement PRESCRIPTION;
	 
	 @FindBy(name = "PLAN APPROVAL")
	 WebElement PLANAPPROVAL;
	 
	 @FindBy(name = "SCHEDULING")
	 WebElement SCHEDULING;
	 
	 @FindBy(name = "PATIENT IMMOBILIZATION SETUP")
	 WebElement IMDdevice;
	 
	 @FindBy(name = "Site")
	 WebElement site;
	 
	 @FindBy(name = "Yes")
	 WebElement yes;
	 
	 @FindBy(name = "No")
	 WebElement no;
	 
	 @FindBy(name = "Yes")
	 WebElement bolusyes;
	 
	 @FindBy(name = "No")
	 WebElement bolusno;
	 
	 @FindBy(name = "IGRT Cycle")
	 WebElement igrt;
	 
	 @FindBy(name = "Review Cycle")
	 WebElement review;
	 
	 @FindBy(name = "CBC Cycle")
	 WebElement cbc;
	 
	 @FindBy(name = "MRI ID")
	 WebElement mrid;
	 
	 @FindBy(name = "PET-CT ID")
	 WebElement petid;
	 
	 @FindBy(name = "TREATMENT PARAMETERS")
	 WebElement treatparameter;
	 
	 @FindBy(name = "OAR CONSTRAINTS")
	 WebElement oar;
	 
	 @FindBy(name = "OAR")
	 WebElement oar1;
	 
	 @FindBy(name = "Minimum Dose (cGy)")
	 WebElement oarmimndose;
	 
	 @FindBy(name = "Maximum Dose (cGy)")
	 WebElement oarmaxdose;
	 
	 @FindBy(name = "Mean Dose (cGy)")
	 WebElement oarmeandose;
	 
	 @FindBy(name = "OAR Name")
	 WebElement oarname;
	 
	 @FindBy(name = "OAR Name")
	 WebElement oarname1;
	 
	 @FindBy(xpath = "//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection1View\"]/ComboBox[@AutomationId=\"ComboBoxViewModelTemplate\"]")                
	 WebElement prescriptiontemplate;
	 
	 @FindBy(name = "Minimum Dose (cGy)")
	 WebElement oarmimndose1;
	 
	 @FindBy(name = "Prescription Template")
	 WebElement prescriptiontemplate1;
	 
	 @FindBy(name = "Maximum Dose (cGy)")
	 WebElement oarmaxdose1;
	 
	 @FindBy(name = "Mean Dose (cGy)")
	 WebElement oarmeandose1;
	 
	 @FindBy(name = "CT ID")
	 WebElement ctid;
	 
	 @FindBy(name = "OARADD")
	 WebElement oaradd;
	 
	 @FindBy(name = "//TextBlock[contains(@Name,'Prescribed Machine')]") 
	 WebElement presmachine2;
	 
	 @FindBy(xpath = "//Custom[@ClassName=\"PrescriptionSection1View\"]/ComboBox[@AutomationId=\"ComboBoxViewModelPrescribedMachine\"]")
	 WebElement PrescribedMachineG1;
	 
	 @FindBy(name = "Description")
	 WebElement des;
	 
	 @FindBy(name = "INSERT")
	 WebElement insert;
	 
	 @FindBy(name = "CLOSE")
	 WebElement close;
	 
	 @FindBy(name = "Physician")
	 WebElement physician;
	 
	 @FindBy(name = "Minimum Dose (cGy)")
	 WebElement mindose;
	 
	 @FindBy(name = "Dose Coverage Constraints")
	 WebElement DoseConstraints;
	 
	 
	  @FindBy(xpath = "//Button[contains(@HelpText, 'Sign Out')]")                
		 WebElement Signout1;
	 
	 @FindBy(name = "CURATIVE")
	 WebElement Curative;
	 
	 
	 @FindBy(name = "MACHINE_QA")
	 WebElement Machine_Qa;
	 
	 
	 @FindBy(name = "PALLIATIVE")
	 WebElement Palliative;
	 
	 
	 @FindBy(name = "PROPHYLACTIC")
	 WebElement Prophylactic;
	 
	 
	 @FindBy(name = "RESEARCH")
	 WebElement Research;
	 
	 
	 @FindBy(name = "SERVICE")
	 WebElement Service;
	 
	 @FindBy(name = "VERIFICATION")
	 WebElement Verification;
	 
	 @FindBy(name = "Target Prescription Dose (cGy)")
	 WebElement targetdose;
	 
	 @FindBy(name = "Maximum Dose (cGy)")
	 WebElement maxdose;
	 
	 @FindBy(name = "Number Of Fractions")
	 WebElement nofraction;
	 
	 @FindBy(name = "VITALS")
	 WebElement VITALS ;
	 
	 @FindBy(xpath = "//Custom[@ClassName=\"PrescriptionSection1View\"]/ComboBox[@AutomationId=\"ComboBoxViewModelBeamType\"]")
	 WebElement beamtype ;
	 
	 @FindBy(name = "Phase")
	 WebElement phase ;
	 
	 @FindBy(xpath = "//Custom[@ClassName=\"PrescriptionSection1View\"]/ComboBox[@AutomationId=\"ComboBoxViewModelEnergy\"]")
	 WebElement energy ;
	 
	 @FindBy(xpath ="//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelTotalDose\"]")
	 @CacheLookup
	 WebElement TargetPrescriptionDose;
	 
	 
	 @FindBy(xpath = "//Custom[@ClassName=\"PrescriptionSection1View\"]/ComboBox[@AutomationId=\"ComboBoxViewModelRadiationType\"]")
	 WebElement radtype ;
	 
	 @FindBy(name = "LAB REPORTS")
	 WebElement LABREPORTS;
	 
	 @FindBy(name = "Add")
	 WebElement add;
	 
	 @FindBy(name = "CT Schedule")
	 WebElement ctschedule;
	 
	 @FindBy(name = "Gating")
	 WebElement gating;
	 
	 @FindBy(name = "Bolus")
	 WebElement bolus;
	 
	 @FindBy(name = "TREATMENT REVIEW")
	 WebElement TREATMENTREVIEW;
	 
	 @FindBy(xpath ="//ComboBox[@AutomationId='ComboBoxViewModelTemplate']")
	 @CacheLookup
	 WebElement Phaselabel;
	 
	 @FindBy(xpath ="//ComboBox[@AutomationId='ComboBoxViewModelTemplate']")
	 @CacheLookup
	 WebElement Ctschedule;
	 
	 @FindBy(xpath ="//ComboBox[@AutomationId='ComboBoxViewModelTemplate']")
	 @CacheLookup
	 WebElement Gating1;
	 
	 @FindBy(xpath ="//ComboBox[@AutomationId='ComboBoxViewModelTemplate']")
	 @CacheLookup
	 WebElement bolus1;
	 
	 
	 @FindBy(xpath = "//Custom[@ClassName=\"PrescriptionSection1View\"]/ComboBox[@AutomationId=\"ComboBoxViewModelPrescribedMachine\"]")
	 WebElement presmachine1;
	 
	 @FindBy(name = "Prescription Save")
	 WebElement PrescriptionSavelabel;
	 
	 @FindBy(name = "Prescription Update")
	 WebElement PrescriptionUpdatelabel;
	 
	 
	 @FindBy(name="OAR Constraints Delete")
	WebElement WOARConstraintsDeletelabel;
	 
	 @FindBy(name="OAR Delete")
	 WebElement WOARDelete_label;
	 
	 @FindBy(name="Prescription Delete")
	 WebElement PrescriptionDelete;
	 
	 @FindBy(xpath="//Window[@ClassName=\"Window\"][@Name=\"MessageWindow\"]/Pane[@ClassName=\"ScrollViewer\"][@Name=\"Prescription data updated for selected site and phase.\"]/Text[@Name=\"Prescription data updated for selected site and phase.\"]")
	 WebElement WUpdateDescription;
	 
	 @FindBy(xpath="//Window[@ClassName=\"Window\"][@Name=\"MessageWindow\"]/Pane[@ClassName=\"ScrollViewer\"][@Name=\"Prescription data saved for selected site and phase.\"]/Text[@Name=\"Prescription data saved for selected site and phase.\"]")
	 WebElement WSaveDescription;
	 
	 @FindBy(xpath="//Window[@ClassName=\"Window\"][@Name=\"MessageWindow\"]/Pane[@ClassName=\"ScrollViewer\"][@Name=\"Do you want to delete the selected OAR Constraints?\"]/Text[@Name=\"Do you want to delete the selected OAR Constraints?\"]")
	 WebElement WOARDeleteDescription;
	 
	 @FindBy(xpath="//Window[@ClassName=\"Window\"][@Name=\"MessageWindow\"]/Button[@Name=\"CANCEL\"][starts-with(@AutomationId,\"successButton\")]")
	 WebElement WCancel;
	 
	 @FindBy(xpath="//Window[@ClassName=\"Window\"][@Name=\"MessageWindow\"]/Pane[@ClassName=\"ScrollViewer\"][@Name=\"Selected OAR Constraints deleted.\"]/Text[@Name=\"Selected OAR Constraints deleted.\"]")
	 WebElement WOARDeleteDescription2;
	
	 @FindBy(xpath ="//Window[@ClassName=\"Window\"][@Name=\"MessageWindow\"]/Pane[@ClassName=\"ScrollViewer\"][@Name=\"Do you want to delete the selected Prescription?\"]/Text[@Name=\"Do you want to delete the selected Prescription?\"]")
	 WebElement WDeleteTabDescription;
	 
	 @FindBy(xpath ="//Window[@ClassName=\"Window\"][@Name=\"MessageWindow\"]/Pane[@ClassName=\"ScrollViewer\"][@Name=\"Selected Prescription deleted.\"]/Text[@Name=\"Selected Prescription deleted.\"][@AutomationId=\"txtblockmessage\"]")
	 WebElement WDeleteTabDescription2;
	 
	 @FindBy(xpath = "//RadioButton[@AutomationId=\"GatingYesLabel\"]")
	@CacheLookup
	 WebElement BolusYeslbl;
	
	@FindBy(xpath = "//RadioButton[@AutomationId=\"GatingNoLabel\"]")
	 @CacheLookup
	 WebElement BolusNolbl;
	
	@FindBy(name = "Gating")
	 WebElement Gating;
	
	@FindBy(xpath ="//RadioButton[@AutomationId=\"BolusYesLabel\"]")
	 @CacheLookup
	 WebElement GatingYeslbl;
	
	@FindBy(xpath ="//RadioButton[@AutomationId=\"BolusNoLabel\"]")
	 @CacheLookup
	 WebElement GatingNolbl;
	 //functionality
	 
	
	
	 
	 @FindBy(xpath="//Button[@HelpText='Add Patient']")
	  WebElement AddPatient;
	 
	 @FindBy(xpath="//Button[@HelpText='Patient List']")
	  WebElement PatientList;
	 
	 @FindBy( xpath="//Button[@HelpText=\"Add Tabs\"]")
	 @CacheLookup
	 WebElement Addtab;
	 
	
	 @FindBy(xpath="//Button[@HelpText='New Site,Phase']")
	 @CacheLookup
	  WebElement NewSitephase;
	 
	 @FindBy(xpath="//RadioButton[@Name='External Beam Radiotherapy']")
	 WebElement external;
	 
	
	 @FindBy(name="Delete")
	 WebElement DeleteTab;
	 
	 @FindBy(name="Description")
	 WebElement description;
	 
	// @FindBy(name="External Beam Radiotherapy")
	// WebElement external;
	 
	
	 
	 @FindBy(xpath ="//Custom[@ClassName=\"NavigationTopBarMiniSubTabsView\"]/RadioButton[@ClassName=\"RadioButton\"][@Name=\"External Beam Radiotheraphy\"]")
	 @CacheLookup
	 WebElement External_Beam_RadiotheraphyRadio;
	 
	

	 
	// String[] Sites = { "Select any site","Head","Leg" };
	 //@FindBy(xpath ="//Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection1View\"]/ComboBox[@AutomationId=\"ComboBoxViewModelSite\"]")
	// @CacheLookup
	// WebElement Site;
	 
	 String[] Sites = { "Select any site","Head","Leg" };
	 @FindBy(xpath ="//Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection1View\"]/ComboBox[@AutomationId=\"ComboBoxViewModelSite\"]")
	 @CacheLookup
	 WebElement Site;
	 
	 String[] Templates = { "No Template","TemplateHead"};
	 @FindBy(xpath ="//ComboBox[@AutomationId='ComboBoxViewModelTemplate']")
	 @CacheLookup
	 WebElement Template;
	 
	 @FindBy(xpath ="//Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection1View\"]/Button[@AutomationId=\"NumericUpDownPhaseNo\"]/Text[@AutomationId=\"TxtNum\"]")
	 @CacheLookup
	 WebElement phasenum;	 
			 
	 @FindBy(xpath ="//Button[@AutomationId='CmdDown']")
	 @CacheLookup
	 WebElement PhaseDowniconlabel;
	 
	 @FindBy(xpath ="//Button[@AutomationId='CmdUp']")
	 @CacheLookup
	 WebElement Phaseupiconlabel;
		
	 @FindBy(xpath ="//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelTotalDose\"]")
	 @CacheLookup
	 WebElement TargetPrescriptiondose;
	 
	 @FindBy(xpath ="//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelMaxDose\"]")
	 @CacheLookup
	 WebElement MaximumDose;
	 
	 @FindBy(xpath ="//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelMinDose\"]")
	 @CacheLookup
	 WebElement MinimumDose;
	 
	 @FindBy(xpath="//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelNumberOfFractions\"]")
	 @CacheLookup
	 WebElement NumberOfFractions;
	 
	 String[] PlanIntents = { "CURATIVE", "MACHINE_QA", "PALLIATIVE", "PROPHYLACTIC", "RESEARCH", "SERVICE", "VERIFICATION" };
	 @FindBy(xpath="//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection1View\"]/ComboBox[@AutomationId=\"ComboBoxViewModelPlanIntent\"]")
	 @CacheLookup
	 WebElement PlanIntent1;
	 
	 @FindBy(xpath="//Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection1View\"]/Button[@AutomationId=\"CTSchedule\"]")
	 @CacheLookup
	 WebElement CTSchedule; 
			 
	 String[] PrescribedMachines = {"BHABHATRON-3i_C04" };//"BHABHATRON-II_C02", "SIDDHARTH-II_C05",
	 @FindBy(xpath="//Custom[@ClassName=\"PrescriptionSection1View\"]/ComboBox[@AutomationId=\"ComboBoxViewModelPrescribedMachine\"]")
	 @CacheLookup
	 WebElement PrescribedMachine;
	 
	 String[] BeamTypes = {"DYNAMIC", "STATIC"};
	 @FindBy(xpath ="//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection1View\"]/ComboBox[@AutomationId=\"ComboBoxViewModelBeamType\"]")
	 @CacheLookup
	 WebElement BeamType;
	 
	 String[] RadiationTypes = { "PHOTON" };
	 @FindBy(xpath ="//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection1View\"]/ComboBox[@AutomationId=\"ComboBoxViewModelRadiationType\"]")
	 @CacheLookup
	 WebElement RadiationType;
	 
	 String[] Energys = { "6" };
	 @FindBy(xpath="//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection1View\"]/ComboBox[@AutomationId=\"ComboBoxViewModelEnergy\"]")
	 @CacheLookup
	 WebElement Energy;
	 
	   String[] Techniques = { "BREAST_BRIDGE", "FIXED_SSD", "ISOCENTRIC", "SKIN_APPOSITION", "TBI" }; 
	 @FindBy(xpath="//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection1View\"]/ComboBox[@AutomationId=\"ComboBoxViewModelTechnique\"]")
	 @CacheLookup
	 WebElement Technique;
	 
	
	 
	 @FindBy(xpath ="//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection1View\"]/RadioButton[@Name=\"Yes\"][@AutomationId=\"GatingYesLabel\"]")
	 @CacheLookup
	 WebElement GatingYes;
	 
	 @FindBy(xpath ="//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection1View\"]/RadioButton[@Name=\"No\"][@AutomationId=\"GatingNoLabel\"]")
	 @CacheLookup
	 WebElement GatingNo;
	 
	 
	 @FindBy(xpath ="//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection1View\"]/RadioButton[@Name=\"Yes\"][@AutomationId=\"BolusYesLabel\"]")
	 @CacheLookup
	 WebElement BolusYes;
	 
	 @FindBy(xpath ="//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection1View\"]/RadioButton[@Name=\"No\"][@AutomationId=\"BolusNoLabel\"]")
	 @CacheLookup
	 WebElement BolusNo;
	 
	 String[] Physicians = {"111111  ","123456  "};
	 @FindBy(xpath="//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection1View\"]/ComboBox[@AutomationId=\"ComboBoxViewModelPhysician\"]")
	 @CacheLookup
	 WebElement Physician;
	 
	 @FindBy(xpath="//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelIGRTCycle\"]")
	 @CacheLookup
	 WebElement IGRTCycle;
	
	 
	 @FindBy(xpath="//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelReviewCycle\"]")
	 @CacheLookup
	 WebElement ReviewCycle;
	 
	 @FindBy(xpath="//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelCBCCycle\"]")
	 @CacheLookup
	 WebElement CBCCycle;
	
	 @FindBy(xpath="//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelMRIID\"]")
	 @CacheLookup
	 WebElement MRI;
	 
	 @FindBy(xpath="//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelCTID\"]")
	 @CacheLookup
	 WebElement CT_ID;
	
	 @FindBy(xpath="//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelPETCTID\"]")
	 @CacheLookup
	 WebElement PET_CT_ID;
	 
	 @FindBy(xpath="//Window[@ClassName=\"Window\"][@Name=\"MessageWindow\"]/Button[@Name=\"OK\"][starts-with(@AutomationId,\"successButton\")]")
	 WebElement WOK;
	 
	 @FindBy(xpath="//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"NavigationTopBarMiniTabsView\"]/Button[@Name=\"EDIT\"][@AutomationId=\"UpdateBtn\"]")
	 WebElement Edit;
	
	 @FindBy(xpath="//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"NavigationTopBarMiniTabsView\"]/Button[@Name=\"UPDATE\"][@AutomationId=\"UpdateBtn\"]")
	 WebElement Update;
	 
	 
	//OAR
	 
	 @FindBy(xpath="//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection1View\"]/Button[@AutomationId=\"BtnMoreAdd\"]")
	 @CacheLookup
	 WebElement OARAdd;
	 
	 @FindBy(xpath="//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelOARName\"]")
	 @CacheLookup
	 WebElement OARName;
	 
	 @FindBy(xpath="//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelOARMinDose\"]")
	 @CacheLookup
	 WebElement OARMinDose;
	 
	 @FindBy(xpath="//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelOARMaxDose\"]")
	 @CacheLookup
	 WebElement OARMaxDose;
	 
	 @FindBy(xpath="//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelOARMeanDose\"]")
	 @CacheLookup
	 WebElement OARMeanDose;
	 
	 @FindBy(xpath="//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelDescription\"]")
	 @CacheLookup
	 WebElement OARDescription;
	 
	 @FindBy(xpath="//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection1View\"]/Button[@Name=\"CLOSE\"][@AutomationId=\"CloseButton\"]")
	 @CacheLookup
	 WebElement OARCloseButton;
	 
	 @FindBy(xpath="//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection1View\"]/Button[@Name=\"INSERT\"][@AutomationId=\"InsertButton\"]")
	 @CacheLookup
	 WebElement OARInsertButton;
	 
	 @FindBy(xpath="//Custom[@ClassName=\"PrescriptionSection1View\"]/DataGrid[@AutomationId=\"Oardatagrid\"]/DataItem[@ClassName=\"DataGridRow\"][@Name=\"Presentation.UiElements.ViewModels.TableViewModel\"]/Custom[@ClassName=\"DataGridCell\"]")
	 @CacheLookup
	 List<WebElement> OAR;
	 
	 @FindBy(xpath="//Custom[@ClassName=\"PrescriptionSection1View\"]/DataGrid[@AutomationId=\"Oardatagrid\"]/DataItem[@ClassName=\"DataGridRow\"][@Name=\"Presentation.UiElements.ViewModels.TableViewModel\"]/Custom[@ClassName=\"DataGridCell\"]")
	 List<WebElement> WithoutChacheOAR;
	 
	 @FindBy(className = "CheckBox")
	 @CacheLookup
	 List<WebElement> Checkbox;
	
	@FindBy(className = "CheckBox")
	 List<WebElement> CheckboxC;
	
	
	@FindBy(xpath ="//Pane[@ClassName=\"ScrollViewer\"]/Text[@AutomationId=\"LabelData\"]/Text[@AutomationId=\"Label\"]/Text[@ClassName=\"TextBlock\"]")
	@CacheLookup
	List<WebElement> IMDlabel;
	
	@FindBy(xpath = "//Button[@ClassName=\"Button\"][@Name=\"PATIENT IMMOBILIZATION SETUP\"]")
	 WebElement PatientImmobilzationsetupbutton;
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Prescription Export\"]/TitleBar[@AutomationId=\"TitleBar\"]")
	WebElement PrescriptionExport;

	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Prescription Export\"]/Custom[@ClassName=\"ExportPrescriptionView\"]//Text[@AutomationId=\"Label\"]/Text[@ClassName=\"TextBlock\"]")
	List<WebElement> WExportlbl;

	@FindBy(xpath = "//Button[@Name=\"EXPORT\"][@AutomationId=\"ExportButton\"]")
	WebElement WExportbtn;
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Prescription Export\"]/Window[@ClassName=\"#32770\"][@Name=\"Export Prescription\"]/TitleBar[@AutomationId=\"TitleBar\"]")
	WebElement WFileExportTitle;
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Prescription Export\"]/Window[@ClassName=\"#32770\"][@Name=\"Export Prescription\"]/Button[@ClassName=\"Button\"][@Name=\"Save\"]")
	WebElement WFileSave;
	
	@FindBy(name = "Prescription Export")
	WebElement WExportTitle;
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"MessageWindow\"]/Pane[@ClassName=\"ScrollViewer\"]")
	WebElement WFileSaveDescription;
	
	@FindBy(xpath = "//Window[@ClassName=\"#32770\"][@Name=\"Export Prescription\"]/Window[@ClassName=\"#32770\"][@Name=\"Confirm Save As\"]/TitleBar[@AutomationId=\"TitleBar\"]")
	WebElement WSameFileSaveTitele;
	
	@FindBy(xpath ="//Window[@ClassName=\"#32770\"][@Name=\"Export Prescription\"]/Window[@ClassName=\"#32770\"][@Name=\"Confirm Save As\"]/Text[@AutomationId=\"ContentText\"]")
	WebElement WSameFileSaveDescription;
	
	
	@FindBy(xpath ="//Window[@ClassName=\"#32770\"][@Name=\"Export Prescription\"]/Window[@ClassName=\"#32770\"][@Name=\"Confirm Save As\"]/Button[@Name=\"Yes\"]")
	WebElement WSameFileSaveYes;
	
	@FindBy(xpath ="//Window[@ClassName=\"#32770\"][@Name=\"Export Prescription\"]/Window[@ClassName=\"#32770\"][@Name=\"Confirm Save As\"]/Button[@Name=\"No\"]")
	WebElement WSameFileSaveNo;
	
	@FindBy(xpath ="//Window[@ClassName=\"#32770\"][@Name=\"Export Prescription\"]/Pane[@ClassName=\"DUIViewWndClassName\"]/ComboBox[@Name=\"File name:\"][@AutomationId=\"FileNameControlHost\"]/Edit[@ClassName=\"Edit\"][@Name=\"File name:\"]")
	WebElement WFileTextbox;
	
	 @FindBy( xpath="//Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"NavigationTopBarMiniTabsView\"]/Pane[@ClassName=\"ScrollViewer\"]/Button[@ClassName=\"Button\"]")
	 List<WebElement> SitePhase;
	 
	 @FindBy (xpath = "//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection2View\"]/Button[starts-with(@AutomationId,\"BtnMoreAdd\")]")
	 WebElement Addfield;
	 
	 
//	Warnmessages
	
	@FindBy(xpath="//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelTotalDose\"]/Text[@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"]")
	WebElement Targetwarnmsg;
	
	@FindBy(xpath="//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelMinDose\"]/Text[@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"]")
	 WebElement MinDosewarnmsg;
	
	@FindBy(xpath="//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelMaxDose\"]/Text[@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"]")
	 WebElement MaxDosewarnmsg;
	
	
	@FindBy(xpath="//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelNumberOfFractions\"]/Text[@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"]")
	 WebElement No_Of_Fractnswarnmsg;
	
	@FindBy(xpath="//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelIGRTCycle\"]/Text[@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"]")
	 WebElement IGRTcyclewarnmsg;
	
	@FindBy(xpath="//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelReviewCycle\"]/Text[@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"]")
	 WebElement Reviewcyclewarnmsg;
	
	@FindBy(xpath="//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelCBCCycle\"]/Text[@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"]")
	WebElement CBCcyclewarnmsg;
	
	@FindBy(xpath="//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelOARName\"]/Text[@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"]")
	 WebElement OARNamewarnmsg;
	
	@FindBy(xpath="//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelOARMinDose\"]/Text[@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"]")
	 WebElement OARMinDosewarnmsg;
	
	@FindBy(xpath="//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelOARMaxDose\"]/Text[@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"]")
	 WebElement OARMaxDosewarnmsg;
	
	
	@FindBy(xpath="//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection1View\"]/ComboBox[@AutomationId=\"ComboBoxViewModelPlanIntent\"]")
	 @CacheLookup
	 WebElement PlanIntent;
	
	
	
	
	 @FindBy(name = "TREATMENT PARAMETERS")
	 WebElement TreatmentParameters;
	 
	 
	 @FindBy(name = "Prescription")
	 WebElement Titlename;
	 
	 
	 @FindBy(xpath = "//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection1View\"]/ComboBox[@AutomationId=\"ComboBoxViewModelTechnique\"]")
	 WebElement Setuptechnique;
	 
	
	 
	 
	 
	 @FindBy(name = "BREAST_BRIDGE")
	 WebElement Bridge;
	 
	 
	 @FindBy(name = "FIXED_SSD")
	 WebElement Fixed;
	 
	 
	 @FindBy(name = "ISOCENTRIC")
	 WebElement Isocentric;
	 
	 
	 @FindBy(name = "SKIN_APPOSITION")
	 WebElement Skin;
	 
	 
	 @FindBy(name = "TBI")
	 WebElement Tbi;
	 

	
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
	
		@FindBy (xpath = "//Button[@HelpText=\"Add Tabs\"]")
		 WebElement Tabs;
		
		@FindBy(name = "Please Select any site")
		 WebElement Siteerror;
		
		@FindBy(name = "Please enter a name for the template")
		 WebElement Templateerror;
		
		@FindBy(name = "Input cannot be blank")
		 WebElement Inputblank;
		
		@FindBy(xpath = "//Button[contains(@HelpText, 'Add Field')]")                
		 WebElement Addfield1;
		
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
		
		
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
}
