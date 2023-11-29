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

public class PlanApprovalPOM {

	
	private Actions act;

	public PlanApprovalPOM(WindowsDriver<WebElement> driver)
	{
		PageFactory.initElements(driver, this);
		act = new Actions(driver);
	}
		
	
     	@FindBy(name = "Plan Approval")
		WebElement plan;
	
     	@FindBy(name = "Patient Menu")
     	WebElement patientmenu;

     	@FindBy(name = "DEMOGRAPHICS")
     	WebElement demo;

     	@FindBy(name = "PRESCRIPTION")
     	WebElement pres;

     	@FindBy(name = "PLAN APPROVAL")
     	WebElement plan1;

     	@FindBy(name = "SCHEDULING")
     	WebElement scheduling;

     	@FindBy(name = "VITALS")
     	WebElement vital;

     	@FindBy(name = "LAB REPORTS")
     	WebElement lab;
     	
     	@FindBy(name = "TREATMENT REVIEW")
     	WebElement review;

     	@FindBy(name = "IMPORT QA PLAN")
     	WebElement importqa;
		
     	@FindBy(name = "IMPORT RT PLAN")
     	WebElement importrt;
		
     	@FindBy(name = "CREATE PLAN")
     	WebElement createPlan;
		
     	@FindBy(name = "VIEW PLAN")
     	WebElement viewplan;
		
     	@FindBy(name = "VALIDATE PLAN")
     	WebElement validate;
		
     	@FindBy(name = "APPROVE PLAN")
     	WebElement approveplan;
		
     	@FindBy(name = "PLAN DETAILS")
     	WebElement plandetails1;
		
     	@FindBy(name = "Target Prescription Dose(cGy)")
     	WebElement targetdose;
		
     	@FindBy(name = "Number of Fraction Groups")
     	WebElement fractiongroup;
		
     	@FindBy(name = "Number of fractions planned")
     	WebElement fractionplanned;
     	
     	@FindBy(name = "Beam Name")
     	WebElement beamname;
     	
     	@FindBy(name = "Beam Number")
     	WebElement beamnum;
     	
     	@FindBy(name = "Beam MeterSet (MINUTE)")
     	WebElement beammeter;
     	
     	@FindBy(name = "Wedge Type")
     	WebElement wedge;
     	
     	@FindBy(name = "Iso Wedge Time (MINUTE)")
     	WebElement isowedge;
     	
     	@FindBy(name = "Beam Type")
     	WebElement beamtype;
     	
     	@FindBy(name = "STATIC")
     	WebElement stat;
     	
     	@FindBy(name = "Fraction Group")
     	WebElement fractiong;
     	
     	@FindBy(name = "Number of beams")
     	WebElement beams;
     	
     	@FindBy(name = "BEAM PARAMETERS")
     	WebElement beamparameter;
     	
     	@FindBy(name = "GANTRY")
     	WebElement gantry;
     	
     	@FindBy(name = "Radiation Type")
     	WebElement radtype;
     	
     	@FindBy(name = "PHOTON")
     	WebElement photon;
     	
     	@FindBy(name = "Beam Dose (Gy)")
     	WebElement beamdose;
     	
     	@FindBy(name = "BEV")
     	WebElement bev;
     	
     	@FindBy(name = "FLUENCE MAP")
     	WebElement fluence;
     	
     	@FindBy(name = "DOSE RATE")
     	WebElement doserate;
     	
     	@FindBy(name = "Select Tolerance Table")
     	WebElement toltable;
     	
     	@FindBy(name = "Tolerance Table Name")
     	WebElement toltablename;
     	
     	@FindBy(name = "Tolerance Table Number")
     	WebElement toltablenum;
     	
     	@FindBy(name = "Control Point Index")
     	WebElement control;
     	
     
     	
     	
     	@FindBy (xpath = "//Custom[@ClassName=\"NavigationTopBarView\"]/Text[@ClassName=\"Text\"][@Name=\"Plan Approval\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Plan Approval\"]")
     	WebElement planapproval;
     	
     	@FindBy (xpath = "//Custom[@ClassName=\"PlanReviewMainView\"]/Custom[@ClassName=\"PlanReviewSection1View\"]/Button[@ClassName=\"Button\"][@Name=\"IMPORT PLAN\"]")
     	WebElement importplan;
     	
     	@FindBy (xpath = "//Custom[@ClassName=\"PlanReviewMainView\"]/Custom[@ClassName=\"PlanReviewSection1View\"]/Button[@ClassName=\"Button\"][@Name=\"CREATE PLAN\"]")
     	WebElement createplan;
     	
     	@FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Custom Popup\"]/Custom[@ClassName=\"ToleranceTableView\"]/Text[@ClassName=\"Text\"][1]")
     	WebElement selecttolerance;
     	
     	@FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Custom Popup\"]/Custom[@ClassName=\"ToleranceTableView\"]/Text[@ClassName=\"Text\"][2]")
     	WebElement tolerancetable;
     	
     	@FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Custom Popup\"]/Custom[@ClassName=\"ToleranceTableView\"]/Text[@ClassName=\"Text\"][3]")
     	WebElement tolerancenumber;
     	
     	@FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Window[@ClassName=\"Window\"][@Name=\"Custom Popup\"]/Custom[@ClassName=\"ToleranceTableView\"]/Text[@ClassName=\"Text\"][4]")
     	WebElement tolerancenumberread;
     	
     	@FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Window[@ClassName=\"Window\"][@Name=\"Custom Popup\"]/Custom[@ClassName=\"ToleranceTableView\"]/ComboBox[@ClassName=\"ComboBox\"]")
     	WebElement tabledropdown;
     	
     	@FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Window[@ClassName=\"Window\"][@Name=\"Custom Popup\"]/Custom[@ClassName=\"ToleranceTableView\"]/Text[@ClassName=\"Text\"][5]")
     	WebElement attributes;
     	
     	@FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Window[@ClassName=\"Window\"][@Name=\"Custom Popup\"]/Custom[@ClassName=\"ToleranceTableView\"]/Text[@ClassName=\"Text\"][6]")
     	WebElement tol1;
     			
     	@FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Window[@ClassName=\"Window\"][@Name=\"Custom Popup\"]/Custom[@ClassName=\"ToleranceTableView\"]/Text[@ClassName=\"Text\"][7]")
        WebElement ganangle;
     	
     	@FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Window[@ClassName=\"Window\"][@Name=\"Custom Popup\"]/Custom[@ClassName=\"ToleranceTableView\"]/Text[@ClassName=\"Text\"][8]")
     	WebElement ganangleread;
     	
     	@FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Window[@ClassName=\"Window\"][@Name=\"Custom Popup\"]/Custom[@ClassName=\"ToleranceTableView\"]/Text[@ClassName=\"Text\"][9]")
     	WebElement beamlimiting;
     	
     	@FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Window[@ClassName=\"Window\"][@Name=\"Custom Popup\"]/Custom[@ClassName=\"ToleranceTableView\"]/Text[@ClassName=\"Text\"][10]")
     	WebElement beamlimitingread;
     	
     	@FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Window[@ClassName=\"Window\"][@Name=\"Custom Popup\"]/Custom[@ClassName=\"ToleranceTableView\"]/Text[@ClassName=\"Text\"][11]")
        WebElement beamasyx;
     	
     	@FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Window[@ClassName=\"Window\"][@Name=\"Custom Popup\"]/Custom[@ClassName=\"ToleranceTableView\"]/Text[@ClassName=\"Text\"][12]")
        WebElement beamasyxread;
     	
     	@FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Window[@ClassName=\"Window\"][@Name=\"Custom Popup\"]/Custom[@ClassName=\"ToleranceTableView\"]/Text[@ClassName=\"Text\"][13]")
        WebElement asyy;
     	
     	@FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Window[@ClassName=\"Window\"][@Name=\"Custom Popup\"]/Custom[@ClassName=\"ToleranceTableView\"]/Text[@ClassName=\"Text\"][14]")
     	WebElement asyyread;
     	
     	@FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Window[@ClassName=\"Window\"][@Name=\"Custom Popup\"]/Custom[@ClassName=\"ToleranceTableView\"]/Text[@ClassName=\"Text\"][15]")
     	WebElement mlcx;
     	
     	@FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Window[@ClassName=\"Window\"][@Name=\"Custom Popup\"]/Custom[@ClassName=\"ToleranceTableView\"]/Text[@ClassName=\"Text\"][16]")
     	WebElement mlcxread;
     	
     	@FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Window[@ClassName=\"Window\"][@Name=\"Custom Popup\"]/Custom[@ClassName=\"ToleranceTableView\"]/Text[@ClassName=\"Text\"][17]")
     	WebElement mlcy;
     	
     	@FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Window[@ClassName=\"Window\"][@Name=\"Custom Popup\"]/Custom[@ClassName=\"ToleranceTableView\"]/Text[@ClassName=\"Text\"][18]")
        WebElement mlcyread;
     	
     	@FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Window[@ClassName=\"Window\"][@Name=\"Custom Popup\"]/Custom[@ClassName=\"ToleranceTableView\"]/Text[@ClassName=\"Text\"][19]")
     	WebElement patientsupport;
     	
     	@FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Window[@ClassName=\"Window\"][@Name=\"Custom Popup\"]/Custom[@ClassName=\"ToleranceTableView\"]/Text[@ClassName=\"Text\"][20]")
        WebElement patientangleread;
     	
     	@FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Window[@ClassName=\"Window\"][@Name=\"Custom Popup\"]/Custom[@ClassName=\"ToleranceTableView\"]/Text[@ClassName=\"Text\"][21]")
     	WebElement longposition;
     	
     	@FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Window[@ClassName=\"Window\"][@Name=\"Custom Popup\"]/Custom[@ClassName=\"ToleranceTableView\"]/Text[@ClassName=\"Text\"][22]")
     	WebElement readlong;
     	
     	@FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Window[@ClassName=\"Window\"][@Name=\"Custom Popup\"]/Custom[@ClassName=\"ToleranceTableView\"]/Text[@ClassName=\"Text\"][23]")
     	WebElement latposition;
     	
     	@FindBy (xpath =" //Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Window[@ClassName=\"Window\"][@Name=\"Custom Popup\"]/Custom[@ClassName=\"ToleranceTableView\"]/Text[@ClassName=\"Text\"][24]")
     	WebElement latread;
     	
     	@FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Window[@ClassName=\"Window\"][@Name=\"Custom Popup\"]/Custom[@ClassName=\"ToleranceTableView\"]/Text[@ClassName=\"Text\"][25]")
     	WebElement vertical;
     	
     	@FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Window[@ClassName=\"Window\"][@Name=\"Custom Popup\"]/Custom[@ClassName=\"ToleranceTableView\"]/Text[@ClassName=\"Text\"][26]")
     	WebElement readvertical;
     	
     	@FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Window[@ClassName=\"Window\"][@Name=\"Custom Popup\"]/Custom[@ClassName=\"ToleranceTableView\"]/Text[@ClassName=\"Text\"][27]")
     	WebElement pitch;
     	
     	@FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Window[@ClassName=\"Window\"][@Name=\"Custom Popup\"]/Custom[@ClassName=\"ToleranceTableView\"]/Text[@ClassName=\"Text\"][28]")
     	WebElement readpitch;
     	
     	@FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Window[@ClassName=\"Window\"][@Name=\"Custom Popup\"]/Custom[@ClassName=\"ToleranceTableView\"]/Text[@ClassName=\"Text\"][29]")
     	WebElement roll;
     	
     	@FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Window[@ClassName=\"Window\"][@Name=\"Custom Popup\"]/Custom[@ClassName=\"ToleranceTableView\"]/Text[@ClassName=\"Text\"][30]")
     	WebElement rollread;
     	
     	@FindBy (name = "CLOSE")
     	WebElement CLOSE;
     	
     	@FindBy (name = "CONFIRM")
     	WebElement confirmbtm;
     	
     	@FindBy (name = "Number of Fractions")
     	WebElement frac;
     	
     	@FindBy (name = "Patient Position")
     	WebElement position;
     	
     	@FindBy (name = "Energy (MV)")
     	WebElement energy;
     	
     	@FindBy (name = "Radiation Type")
     	WebElement energy1;
     	
     	@FindBy (name = "Plan Description")
     	WebElement description;
     	
     	@FindBy (name = "Beam Sequence")
     	WebElement sequence;
     	
     	@FindBy (name = "Add Beam")
     	WebElement addbeam;
     	
     	@FindBy (name = "Gantry Angle(deg)")
     	WebElement gandegree;
     	
     	@FindBy (name = "Field Type")
     	WebElement field;
     	
     	@FindBy (name = "Bolus (cm)")
     	WebElement bolus;
     	
     	@FindBy (name = "Treatment Time (MINUTE)")
     	WebElement treattime;
     	
     	@FindBy (name = "Collimator Angle(deg)")
     	WebElement colli;
     	
     	@FindBy (name = "Dose (MU)")
     	WebElement dose;
     	
     	@FindBy (name = "Field Type")
     	WebElement fieldtype1;
     	
     	@FindBy (name = "Filter Type")
     	WebElement filter;
     	
     	@FindBy (name = "Dose Rate(MU/MINUTE)")
     	WebElement doserate1;
     	
     	@FindBy (name = "FX(cm) [Min:0,Max:20]")
     	WebElement fxcm1;
     	
     	@FindBy (name = "FY(cm) [Min:0,Max:30]")
     	WebElement fycm;
     	
     	@FindBy (name = "FX1(cm) [Min:-15, Max:7.5]")
     	WebElement x1;
     	
     	@FindBy (name = "FX2(cm) [Min:-7.5, Max:15]")
     	WebElement x2;
     	
     	@FindBy (name = "FY1(cm) [Min:-15, Max:7.5]")
     	WebElement y1;
     	
     	@FindBy (name = "FY2(cm) [Min:-7.5, Max:15]")
     	WebElement y2;
     	
     	@FindBy (name = "FieldName")
     	WebElement FieldNme;
     	
     	@FindBy (name = "Wedge Type")
     	WebElement wedgetype;
     	
     	@FindBy (name = "Wedge ID")
     	WebElement wedgeid1;
     	
     	@FindBy (name = "Iso Wedge Time (MINUTE)")
     	WebElement isotime;
     	
     	@FindBy (name = "Refresh")
     	WebElement refresh1;
     	
     	@FindBy (name = "CREATE PLAN")
     	WebElement createplan1;
     	
     	@FindBy (name = "FX(cm) [Min:0,Max:30]")
     	WebElement fxcm;
     	
     	@FindBy (name = "Treatment Time (MINUTE)")
     	WebElement time;
     	
     	@FindBy (name = "Collimator Angle(deg)")
     	WebElement collidegree;
     	
     	@FindBy (xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Window[@ClassName=\"Window\"][@Name=\"Custom Popup\"]/Custom[@ClassName=\"ToleranceTableView\"]/Text[@ClassName=\"Text\"][31]")
     	WebElement close;
     	
     	@FindBy (xpath = "//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PlanReviewMainView\"]/Custom[@ClassName=\"PlanReviewSection8View\"]/Text[@Name=\"Plan Details\"][@AutomationId=\"LblName\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Plan Details\"]")
     	WebElement plandetails;
     	
     	@FindBy (xpath = "//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PlanReviewMainView\"]/Custom[@ClassName=\"PlanReviewSection8View\"]/Edit[@ClassName=\"TextBox\"]/Text[@Name=\"Plan Name\"][@AutomationId=\"LblName\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Plan Name\"]")
     	WebElement planname;
     	
     	@FindBy (xpath = "//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PlanReviewMainView\"]/Custom[@ClassName=\"PlanReviewSection8View\"]/Edit[@ClassName=\"TextBox\"]/Text[@Name=\"Planned By\"][@AutomationId=\"LblName\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Planned By\"]")
     	WebElement plannedby;
     	
     	@FindBy (xpath = "//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PlanReviewMainView\"]/Custom[@ClassName=\"PlanReviewSection8View\"]/Edit[@ClassName=\"TextBox\"]/Text[@Name=\"Treatment Machine\"][@AutomationId=\"LblName\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Treatment Machine\"]")
     	WebElement treatmentmachine;
     	
     	@FindBy (xpath = "//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PlanReviewMainView\"]/Custom[@ClassName=\"PlanReviewSection8View\"]/ComboBox[@ClassName=\"ComboBox\"][1]")
     	WebElement Patientposition;
     	
     	@FindBy (xpath = "//Custom[@ClassName=\"PlanReviewMainView\"]/Custom[@ClassName=\"PlanReviewSection8View\"]/Edit[@ClassName=\"TextBox\"]/Text[@Name=\"Beam Name\"][@AutomationId=\"LblName\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Beam Name\"]")
     	WebElement name;
     	
     	@FindBy (xpath = "//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PlanReviewMainView\"]/Custom[@ClassName=\"PlanReviewSection8View\"]/Edit[@ClassName=\"TextBox\"][8]")
     	WebElement nametxt;
     	
     	@FindBy (xpath = "//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PlanReviewMainView\"]/Custom[@ClassName=\"PlanReviewSection8View\"]/Edit[@ClassName=\"TextBox\"][11]")
     	WebElement gandegreetxt;
     	
     	@FindBy (xpath = "//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PlanReviewMainView\"]/Custom[@ClassName=\"PlanReviewSection8View\"]/Edit[@ClassName=\"TextBox\"][12]")
        WebElement collidegreetxt;
     	 
     	@FindBy (xpath = "//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PlanReviewMainView\"]/Custom[@ClassName=\"PlanReviewSection8View\"]/Edit[@ClassName=\"TextBox\"][14]")
     	WebElement timetxt;
     	
     	@FindBy (xpath = "//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PlanReviewMainView\"]/Custom[@ClassName=\"PlanReviewSection8View\"]/ComboBox[@ClassName=\"ComboBox\"][2]")
     	WebElement field1;
     	
     	@FindBy (xpath = "//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PlanReviewMainView\"]/Custom[@ClassName=\"PlanReviewSection8View\"]/Edit[@ClassName=\"TextBox\"][15]")
     	WebElement fxcmtxt;
     	
     	@FindBy (xpath = "//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PlanReviewMainView\"]/Custom[@ClassName=\"PlanReviewSection8View\"]/ComboBox[@ClassName=\"ComboBox\"][2]")
     	WebElement fieldtype;
     	
     	@FindBy (xpath = "//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PlanReviewMainView\"]/Custom[@ClassName=\"PlanReviewSection8View\"]/ComboBox[@ClassName=\"ComboBox\"][4]")
     	WebElement fieldName;
     	
     	@FindBy (xpath = "//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PlanReviewMainView\"]/Custom[@ClassName=\"PlanReviewSection8View\"]/ComboBox[@ClassName=\"ComboBox\"][5]")
     	WebElement Wedgetype;
     	
     	@FindBy (xpath = "//Custom[@ClassName=\"PlanReviewMainView\"]/Custom[@ClassName=\"PlanReviewSection8View\"]/ComboBox[@ClassName=\"ComboBox\"][6]")
     	WebElement wedgeid;
     	
     	@FindBy (xpath = "//Custom[@ClassName=\"PlanReviewMainView\"]/Custom[@ClassName=\"PlanReviewSection8View\"]/Button[@ClassName=\"Button\"][@Name=\"ADD BEAM\"]")
     	WebElement addbeam1;
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
     	
	}	
		
		
		
