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

public class RoleConfigPOM {

	
	private Actions act;

	public RoleConfigPOM(WindowsDriver<WebElement> driver)
	{
		PageFactory.initElements(driver, this);
		act = new Actions(driver);
	
	}
	

	@FindBy(name = "ROLE CONFIGURATION")	
	WebElement roleconfig;
	
	@FindBy(name = "Role Name")	
	WebElement rolename;
	
	@FindBy(name = "Krystal")	
	WebElement krystal;
	
	@FindBy(name = "Treatment")	
	WebElement treatment;
	
	@FindBy(name = "Image Viewer")	
	WebElement imageview;
	
	@FindBy(name = "CT Android")	
	WebElement ctandroid;
	
	@FindBy(name = "Demographics Android")	
	WebElement demoandroid;
	
	@FindBy(name = "Select All")	
	WebElement select;
	
	@FindBy(name = "Treatment Plan")	
	WebElement treatmentplan;
	
	@FindBy(name = "Demographics")	
	WebElement demographics;
	
	@FindBy(xpath = "//Button[@HelpText=\"Refresh\"]")
	WebElement refresh;	
	
	@FindBy(name = "Add")	
	WebElement demoadd;
	
	@FindBy(name = "View")	
	WebElement demoview;
	
	@FindBy(name = "Edit")	
	WebElement demoedit;
	
	@FindBy(name = "Prescription")	
	WebElement prescription;
	
//	@FindBy(name = "BHABHATRON-II_CO2")	
//	WebElement bhabhatrontaw;
	
	@FindBy(name = "View")	
	WebElement tawview;
	
	@FindBy(name = "Add")	
	WebElement tawadd;
	
	@FindBy(name = "Edit")	
	WebElement tawedit;
	
//	@FindBy(name = "BHABHATRON-II MLC v2_CO3")	
//	WebElement bhabhatronmlc;
	
	@FindBy(name = "View")	
	WebElement mlcview;
	
	@FindBy(name = "Add")	
	WebElement mlcadd;
	
	@FindBy(name = "Edit")	
	WebElement mlcedit;
	
//	@FindBy(name = "BHABHATRON-3i_CO4")	
//	WebElement bha3i;
	
	@FindBy(name = "View")	
	WebElement bhabhatronview;
	
	@FindBy(name = "Add")	
	WebElement bhabhatronadd;
	
	@FindBy(name = "Edit")	
	WebElement bhabhatronedit;
	
//	@FindBy(name = "SIDDHARTH-II_CO5")	
//	WebElement siddharth;
	
	@FindBy(name = "View")	
	WebElement siddharthview;
	
	@FindBy(name = "Add")	
	WebElement siddharthadd;
	
	@FindBy(name = "Edit")	
	WebElement siddharthedit;
	
//	@FindBy(name = "Chemotherapy")	
//	WebElement chemotherapy;
	
	@FindBy(name = "View")	
	WebElement chemoview;
	
	@FindBy(name = "Add")	
	WebElement chemoadd;
	
	@FindBy(name = "Edit")	
	WebElement chemoedit;
	
//	@FindBy(name = "Plan Approval")	
//	WebElement planapproval;
	
//	@FindBy(name = "BHABHATRON-II_CO2")	
//	WebElement planbhataw;
	
	@FindBy(name = "View")	
	WebElement planbhatawview;
	
	@FindBy(name = "Import")	
	WebElement planbhatawimport;
	
	@FindBy(name = "Approve")	
	WebElement planbhatawapprove;
	
//	@FindBy(name = "BHABHATRON-II MLC v2_CO3")	
//	WebElement planbhamlc;
	
	@FindBy(name = "View")	
	WebElement planbhamlcview;
	
	@FindBy(name = "Import")	
	WebElement planbhamlcimport;
	
	@FindBy(name = "Approve")	
	WebElement planbhamlcapprove;
	
//	@FindBy(name = "BHABHATRON-3i_CO4")	
//	WebElement planbha;
	
	@FindBy(name = "View")	
	WebElement planbhaview;
	
	@FindBy(name = "Import")	
	WebElement planbhaimport;
	
	@FindBy(name = "Approve")	
	WebElement planbhaapprove;
	
//	@FindBy(name = "SIDDHARTH-II_CO5")	
//	WebElement plansiddharth;
	
	@FindBy(name = "View")	
	WebElement plansiddharthview;
	
	@FindBy(name = "Import")	
	WebElement plansiddharthimport;
	
	@FindBy(name = "Approve")	
	WebElement plansiddharthapprove;
	
	@FindBy(name = "Scheduling")	
	WebElement scheduling;
	
	@FindBy(name = "EBRT")	
	WebElement ebrt;
	
	@FindBy(name = "View")	
	WebElement ebrtview;
	
	@FindBy(name = "Schedule")	
	WebElement ebrtschedule;
	
	@FindBy(name = "Move")	
	WebElement ebrtmove;
	
	@FindBy(name = "Reschedule")	
	WebElement ebrtreschedule;
	
	@FindBy(name = "Abort")	
	WebElement ebrtabort;
	
//	@FindBy(name = "Chemotherapy")	
//	WebElement chemo;
	
	@FindBy(name = "View")	
	WebElement chemotherapyview;
	
	@FindBy(name = "Schedule")	
	WebElement chemotherapyschedule;
	
	@FindBy(name = "Move")	
	WebElement chemotherapymove;
	
	@FindBy(name = "Reschedule")	
	WebElement chemotherapyreschedule;
	
	@FindBy(name = "Abort")	
	WebElement chemotherapyabort;
	
//	@FindBy(name = "Vitals")	
//	WebElement vitals;
	
	@FindBy(name = "View")	
	WebElement vitalsview;
	
	@FindBy(name = "Add")	
	WebElement vitalsadd;
	
	@FindBy(name = "Edit")	
	WebElement vitalsedit;
	
//	@FindBy(name = "Lab Reports")	
//	WebElement labreports;
	
	@FindBy(name = "View")	
	WebElement labreportsview;
	
	@FindBy(name = "Add")	
	WebElement labreportsadd;
	
	@FindBy(name = "Edit")	
	WebElement labreportsedit;
	
//	@FindBy(name = "Treatment Review")	
//	WebElement treatmentreview;
	
//	@FindBy(name = "Machine Slot")	
//	WebElement machineslot;
	
//	@FindBy(name = "BHABHATRON-II_CO2")	
//	WebElement machinebhataw;
	
	@FindBy(name = "View")	
	WebElement machinebhatawview;
	
	@FindBy(name = "Fractions per Hour")	
	WebElement machinebhatawfractions;
	
	@FindBy(name = "BHABHATRON-II MLC v2_CO3")	
	WebElement machinebhamlc;
	
	@FindBy(name = "View")	
	WebElement machinebhamlcview;
	
	@FindBy(name = "Fractions per Hour")	
	WebElement machinebhamlcfractions;
	
	@FindBy(name = "BHABHATRON-3_CO4")	
	WebElement machinebha;
	
	@FindBy(name = "View")	
	WebElement machinebhaview;
	
	@FindBy(name = "Fractions per Hour")	
	WebElement machinebhafrcations;
	
	@FindBy(name = "Machine QA")	
	WebElement machinebhaqa;
	
	@FindBy(name = "RFA")	
	WebElement machinebharfa;
	
	@FindBy(name = "SIDDHARTH-II_CO5")	
	WebElement machinesiddharth;
	
	@FindBy(name = "View")	
	WebElement machinesiddharthview;
	
	@FindBy(name = "Machine QA")	
	WebElement machinesiddharthqa;
	
	@FindBy(name = "RFA")	
	WebElement machinesiddharthrfa;
	
	@FindBy(name = "Fractions per Hour")	
	WebElement machinesiddharthfractions;
	
	@FindBy(name = "Holiday Settings")	
	WebElement holidaysettings;
	
	@FindBy(name = "View")	
	WebElement holidayview;
	
	@FindBy(name = "Add")	
	WebElement holidayadd;
	
	@FindBy(name = "Edit")	
	WebElement holidayedit;
	
	@FindBy(name = "Import")	
	WebElement machineimport;
	
	@FindBy(name = "Templates")	
	WebElement templates;
	
	@FindBy(name = "BHABHATRON-II_CO2")	
	WebElement tempbhataw;
	
	@FindBy(name = "View")	
	WebElement tempbhatawview;
	
	@FindBy(name = "Add")	
	WebElement tempbhatawadd;
	
	@FindBy(name = "Edit")	
	WebElement tempbhatawedit;
	
	@FindBy(name = "BHABHATRON-II MLC v2_CO3")	
	WebElement tempbhamlc;
	
	@FindBy(name = "View")	
	WebElement tempbhamlcview;
	
	@FindBy(name = "Add")	
	WebElement tempbhamlcadd;
	
	@FindBy(name = "Edit")	
	WebElement tempbhamlcedit;
	
	@FindBy(name = "BHABHATRON-3_CO4")	
	WebElement tempbha;
	
	@FindBy(name = "View")	
	WebElement tempbhaview;
	
	@FindBy(name = "Add")	
	WebElement tempbhaadd;
	
	@FindBy(name = "Edit")	
	WebElement tempbhaedit;
	
	@FindBy(name = "SIDDHARTH-II_CO5")	
	WebElement tempsiddharth;
	
	@FindBy(name = "View")	
	WebElement tempsiddharthview;
	
	@FindBy(name = "Add")	
	WebElement tempsiddharthadd;
	
	@FindBy(name = "Edit")	
	WebElement tempsiddharthedit;
	
	@FindBy(name = "User Management")	
	WebElement usermanagement;
	
	@FindBy(name = "View")	
	WebElement usermanagementview;
	
	@FindBy(name = "Add")	
	WebElement usermanagementadd;
	
	@FindBy(name = "Edit")	
	WebElement usermanagementedit;
	
	@FindBy(name = "General Settings")	
	WebElement generalsettings;
	
	@FindBy(name = "APR Settings")	
	WebElement aprsettings;
	
	@FindBy(name = "BHABHATRON-3_CO4")	
	WebElement bhabhatron;
	
	@FindBy(name = "View")	
	WebElement aprsetbhaview;
	
	@FindBy(name = "Add")	
	WebElement aprsetbhaadd;
	
	@FindBy(name = "Edit")	
	WebElement aprsetbhaedit;
	
	@FindBy(name = "SIDDHARTH-II_CO5")	
	WebElement aprsetsiddharth;
	
	@FindBy(name = "View")	
	WebElement aprsetsiddharthview;
	
	@FindBy(name = "Add")	
	WebElement aprsetsiddharthadd;
	
	@FindBy(name = "Edit")	
	WebElement aprsetsiddharthedit;
	
	@FindBy(name = "APR CBCT Settings")	
	WebElement aprcbctset;
	
	@FindBy(name = "BHABHATRON-3_CO4")	
	WebElement aprcbctsetbha;
	
	@FindBy(name = "View")	
	WebElement aprcbctsetbhaview;
	
	@FindBy(name = "Add")	
	WebElement aprcbctsetbhaadd;
	
	@FindBy(name = "Edit")	
	WebElement aprcbctsetbhaedit;
	
	@FindBy(name = "SIDDHARTH-II_CO5")	
	WebElement aprcbctsetsiddharth;
	
	@FindBy(name = "View")	
	WebElement aprcbctsetsiddview;
	
	@FindBy(name = "Add")	
	WebElement aprcbctsetsiddadd;
	
	@FindBy(name = "Edit")	
	WebElement aprcbctsetsiddedit;
	
	@FindBy(name = "Chemotherapy Configuration")	
	WebElement chemoconfig;
	
	@FindBy(name = "Classification")	
	WebElement chemoclassification;
	
	@FindBy(name = "View")	
	WebElement classificationview;
	
	@FindBy(name = "Add")	
	WebElement classificationadd;
	
	@FindBy(name = "Edit")	
	WebElement classificationedit;
	
	@FindBy(name = "Regimen")	
	WebElement regimen;
	
	@FindBy(name = "View")	
	WebElement regimenview;
	
	@FindBy(name = "Add")	
	WebElement regimenadd;
	
	@FindBy(name = "Edit")	
	WebElement regimenedit;
	
	@FindBy(name = "Radio Sensitizers")	
	WebElement radiosensitizers;
	
	@FindBy(name = "View")	
	WebElement radiosensitizersview;
	
	@FindBy(name = "Add")	
	WebElement radiosensitizersadd;
	
	@FindBy(name = "Edit")	
	WebElement radiosensitizersedit;
	
	@FindBy(name = "Drug")	
	WebElement drug;
	
	@FindBy(name = "View")	
	WebElement drugview;
	
	@FindBy(name = "Add")	
	WebElement drugadd;
	
	@FindBy(name = "Edit")	
	WebElement drugedit;
	
	@FindBy(name = "Field Configuration")	
	WebElement fieldconfig;
	
	@FindBy(name = "BHABHATRON-II_CO2")	
	WebElement fieldconfigbhataw;
	
	@FindBy(name = "View")	
	WebElement fieldconfigbhatawview;
	
	@FindBy(name = "Add")	
	WebElement fieldconfigbhatawadd;
	
	@FindBy(name = "Edit")	
	WebElement fieldconfigbhataedit;
	
	@FindBy(name = "BHABHATRON-II MLC v2_CO3")	
	WebElement fieldconfigbhamlc;
	
	@FindBy(name = "View")	
	WebElement fieldconfigbhamlcview;
	
	@FindBy(name = "Add")	
	WebElement fieldconfigbhamlcadd;
	
	@FindBy(name = "Edit")	
	WebElement fieldconfigbhamlcedit;
	
	@FindBy(name = "BHABHATRON-3_CO4")	
	WebElement fieldconfigbha;
	
	@FindBy(name = "View")	
	WebElement fieldconfigbhaview;
	
	@FindBy(name = "Add")	
	WebElement fieldconfigbhaadd;
	
	@FindBy(name = "Edit")	
	WebElement fieldconfigbhaedit;
	
	@FindBy(name = "SIDDHARTH-II_CO5")	
	WebElement fieldconfigsidd;
	
	@FindBy(name = "View")	
	WebElement fieldconfigsiddview;
	
	@FindBy(name = "Add")	
	WebElement fieldconfigsiddadd;
	
	@FindBy(name = "Edit")	
	WebElement fieldconfigsiddedit;
	
	@FindBy(name = "Machine QA")	
	WebElement machineqa;
	
	@FindBy(name = "BHABHATRON-3_CO4")	
	WebElement machineqabha;
	
	@FindBy(name = "View")	
	WebElement machineqabhaview;
	
	@FindBy(name = "Add")	
	WebElement machineqabhaadd;
	
	@FindBy(name = "Edit")	
	WebElement machineqabhaedit;
	
	@FindBy(name = "SIDDHARTH-II_CO5")	
	WebElement machineqasidd;
	
	@FindBy(name = "View")	
	WebElement machineqasiddview;
	
	@FindBy(name = "Add")	
	WebElement machineqasiddadd;
	
	@FindBy(name = "Edit")	
	WebElement machineqasiddedit;
	
	@FindBy(name = "Role Configuration")	
	WebElement roleconfig1;
	
	@FindBy(name = "View")	
	WebElement roleconfigview;
	
	@FindBy(name = "Add")	
	WebElement roleconfigadd;
	
	@FindBy(name = "Edit")	
	WebElement roleconfigedit;
	
	@FindBy(name = "Tolerance Settings")	
	WebElement tolset;
	
	@FindBy(name = "BHABHATRON-II_CO2")	
	WebElement tolsettaw;
	
	@FindBy(name = "View")	
	WebElement tolsettawview;
	
	@FindBy(name = "Add")	
	WebElement tolsettawadd;
	
	@FindBy(name = "Edit")	
	WebElement tolsettawedit;
	
	@FindBy(name = "BHABHATRON-II MLC v2_CO3")	
	WebElement tolsetmlc;
	
	@FindBy(name = "View")	
	WebElement tolsetmlcview;
	
	@FindBy(name = "Add")	
	WebElement tolsetmlcadd;
	
	@FindBy(name = "Edit")	
	WebElement tolsetmlcedit;
	
	@FindBy(name = "BHABHATRON-3_CO4")	
	WebElement tolsetbha;
	
	@FindBy(name = "View")	
	WebElement tolsetbhaview;
	
	@FindBy(name = "Add")	
	WebElement tolsetbhaadd;
	
	@FindBy(name = "Edit")	
	WebElement tolsetbhaedit;
	
	@FindBy(name = "SIDDHARTH-II_CO5")	
	WebElement tolsetsidd;
	
	@FindBy(name = "View")	
	WebElement tolsetsidview;
	
	@FindBy(name = "Add")	
	WebElement tolsetsidadd;
	
	@FindBy(name = "Edit")	
	WebElement tolsetsidedit;
	
	@FindBy(name = "Designation Configuration")	
	WebElement designationconfig;
	
	@FindBy(name = "View")	
	WebElement designationconfigview;
	
	@FindBy(name = "Add")	
	WebElement designationconfigadd;
	
	@FindBy(name = "Edit")	
	WebElement designationconfigedit;
	
	@FindBy(name = "Audit Logs")	
	WebElement auditlogs;
	
	@FindBy(name = "View")	
	WebElement auditlogsview;
	
	@FindBy(name = "Export")	
	WebElement auditlogsexport;
	
	@FindBy(name = "BHABHATRON-II_CO2")	
	WebElement treatmentbhataw;
	
	@FindBy(name = "BHABHATRON-II MLC v2_CO3")	
	WebElement treatmentbhamlc;
	
	@FindBy(name = "BHABHATRON-3_CO4")	
	WebElement treatmentbha;
	
	@FindBy(name = "SIDDHARTH-II_CO5")	
	WebElement treatmentsidd;
	
	@FindBy(name = "Select All")	
	WebElement selectall;
	
	@FindBy(name = "BHABHATRON-II_CO2")	
	WebElement selectallbhataw;
	
	@FindBy(name = "Work List")	
	WebElement selectallbhatawworklist;
	
	@FindBy(name = "Research Mode")	
	WebElement selectallbhatawresearchmode;
	
	@FindBy(name = "Source Settings")	
	WebElement selectallbhatawsource;
	
	@FindBy(name = "BHABHATRON-II MLC v2_CO3")	
	WebElement selectallbhamlc;
	
	@FindBy(name = "Work List")	
	WebElement selectallbhamlcworklist;
	
	@FindBy(name = "Research Mode")	
	WebElement selectallbhamlcresearch;
	
	@FindBy(name = "Source Settings")	
	WebElement selectallbhamlcsource;
	
	@FindBy(name = "BHABHATRON-3_CO4")	
	WebElement selectallbha;
	
	@FindBy(name = "Work List")	
	WebElement selectallbhaworklist;
	
	@FindBy(name = "Daily QA")	
	WebElement selectallbhadailyqa;
	
	@FindBy(name = "Dosimetry")	
	WebElement selectallbhadosimetry;
	
	@FindBy(name = "Research Mode")	
	WebElement selectallbharesearch;
	
	@FindBy(name = "Source Settings")	
	WebElement selectallbhasource;
	
	@FindBy(name = "SIDDHARTH-II_CO5")	
	WebElement selectallsiddharth;
	
	@FindBy(name = "Work List")	
	WebElement selectallsiddworklist;
	
	@FindBy(name = "Daily QA")	
	WebElement selectallsiddqa;
	
	@FindBy(name = "Dosimetry")	
	WebElement selectallsidddose;
	
	@FindBy(name = "Research Mode")	
	WebElement selectallsiddresearch;
	
	@FindBy(name = "Source Settings")	
	WebElement selectallsiddsource;
	
	@FindBy(name = "Image Viewer")	
	WebElement image;
	
	@FindBy(name = "Login")	
	WebElement imagelogin;
	
	@FindBy(name = "CT Android")	
	WebElement ctandroid1;
	
	@FindBy(name = "Login")	
	WebElement ctandroidlogin;
	
	@FindBy(name = "Demographics Android")	
	WebElement demoandroid1;
	
	@FindBy(name = "Login")	
	WebElement demoandroidlogin;
	
	@FindBy(name = "SAVE")	
	WebElement rolesave;
	
	@FindBy(name = "SELECT ALL")	
	WebElement roleselect;
	
	@FindBy(name = "ROLE LIST")	
	WebElement rolelist;
	
	@FindBy(name = "Role Name")	
	WebElement rolelistname;
	
	@FindBy(name = "Created Date")	
	WebElement createddate;
	
	@FindBy(name = "Updated Date")	
	WebElement updateddate;
	
	@FindBy(name = "Search Role")	
	WebElement searchrole;
	
	// Checkboxes
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"RoleManagementMainView\"]/Custom[@ClassName=\"RoleManagementSection1View\"]/Pane[@ClassName=\"ScrollViewer\"]/CheckBox[@ClassName=\"CheckBox\"]")
	WebElement selectcheck;
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"RoleManagementMainView\"]/Custom[@ClassName=\"RoleManagementSection1View\"]/Pane[@ClassName=\"ScrollViewer\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Prescripiton\"]")
	WebElement pres;
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"RoleManagementMainView\"]/Custom[@ClassName=\"RoleManagementSection1View\"]/Pane[@ClassName=\"ScrollViewer\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Plan Approval\"]")
	WebElement plan;
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"RoleManagementMainView\"]/Custom[@ClassName=\"RoleManagementSection1View\"]/Pane[@ClassName=\"ScrollViewer\"]/Text[@ClassName=\"TextBlock\"][@Name=\"BHABHATRON-II_C02\"]")
	WebElement bhabhatrontaw;
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"RoleManagementMainView\"]/Custom[@ClassName=\"RoleManagementSection1View\"]/Pane[@ClassName=\"ScrollViewer\"]/Text[@ClassName=\"TextBlock\"][@Name=\"BHABHATRON-II MLC v2_C03\"]")
	WebElement bhabhatronmlc;
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"RoleManagementMainView\"]/Custom[@ClassName=\"RoleManagementSection1View\"]/Pane[@ClassName=\"ScrollViewer\"]/Text[@ClassName=\"TextBlock\"][@Name=\"SIDDHARTH-II_C05\"]")
	WebElement siddharth;
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"RoleManagementMainView\"]/Custom[@ClassName=\"RoleManagementSection1View\"]/Pane[@ClassName=\"ScrollViewer\"]/Text[@ClassName=\"TextBlock\"][@Name=\"BHABHATRON-3i_C04\"]")
	WebElement bha3i;
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"RoleManagementMainView\"]/Custom[@ClassName=\"RoleManagementSection1View\"]/Pane[@ClassName=\"ScrollViewer\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Chemotherapy\"]")
	WebElement chemotherapy;
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"RoleManagementMainView\"]/Custom[@ClassName=\"RoleManagementSection1View\"]/Pane[@ClassName=\"ScrollViewer\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Plan Approval\"]")
	WebElement planapproval;
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"RoleManagementMainView\"]/Custom[@ClassName=\"RoleManagementSection1View\"]/Pane[@ClassName=\"ScrollViewer\"]/Text[@ClassName=\"TextBlock\"][@Name=\"BHABHATRON-II_C02\"]")
	WebElement planbhataw;
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"RoleManagementMainView\"]/Custom[@ClassName=\"RoleManagementSection1View\"]/Pane[@ClassName=\"ScrollViewer\"]/Text[@ClassName=\"TextBlock\"][@Name=\"BHABHATRON-II MLC v2_C03\"]")
	WebElement planbhamlc;
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"RoleManagementMainView\"]/Custom[@ClassName=\"RoleManagementSection1View\"]/Pane[@ClassName=\"ScrollViewer\"]/Text[@ClassName=\"TextBlock\"][@Name=\"SIDDHARTH-II_C05\"]")
	WebElement plansiddharth;
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"RoleManagementMainView\"]/Custom[@ClassName=\"RoleManagementSection1View\"]/Pane[@ClassName=\"ScrollViewer\"]/Text[@ClassName=\"TextBlock\"][@Name=\"BHABHATRON-3i_C04\"]")
	WebElement planbha;
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"RoleManagementMainView\"]/Custom[@ClassName=\"RoleManagementSection1View\"]/Pane[@ClassName=\"ScrollViewer\"]/ScrollBar[@AutomationId=\"PART_VerticalScrollBar\"]/Thumb[@ClassName=\"Thumb\"]")
	WebElement scroll;
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"RoleManagementMainView\"]/Custom[@ClassName=\"RoleManagementSection1View\"]/Pane[@ClassName=\"ScrollViewer\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Scheduling\"]")
	WebElement schedule;
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"RoleManagementMainView\"]/Custom[@ClassName=\"RoleManagementSection1View\"]/Pane[@ClassName=\"ScrollViewer\"]/Text[@ClassName=\"TextBlock\"][@Name=\"EBRT\"]")
	WebElement EBRT; 
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"RoleManagementMainView\"]/Custom[@ClassName=\"RoleManagementSection1View\"]/Pane[@ClassName=\"ScrollViewer\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Chemotherapy\"]")
	WebElement chemo;
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"RoleManagementMainView\"]/Custom[@ClassName=\"RoleManagementSection1View\"]/Pane[@ClassName=\"ScrollViewer\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Vitals\"]")
	WebElement vitals;	
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"RoleManagementMainView\"]/Custom[@ClassName=\"RoleManagementSection1View\"]/Pane[@ClassName=\"ScrollViewer\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Lab Reports\"]")
	WebElement lab;
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"RoleManagementMainView\"]/Custom[@ClassName=\"RoleManagementSection1View\"]/Pane[@ClassName=\"ScrollViewer\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Treatment Review\"]")
	WebElement Treatment;
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"RoleManagementMainView\"]/Custom[@ClassName=\"RoleManagementSection1View\"]/Pane[@ClassName=\"ScrollViewer\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Machine Slot\"]")
	WebElement machineslot;
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"RoleManagementMainView\"]/Custom[@ClassName=\"RoleManagementSection1View\"]/Pane[@ClassName=\"ScrollViewer\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Holiday Settings\"]")
	WebElement holiday;
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"RoleManagementMainView\"]/Custom[@ClassName=\"RoleManagementSection1View\"]/Pane[@ClassName=\"ScrollViewer\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Templates\"]")
	WebElement template;
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"RoleManagementMainView\"]/Custom[@ClassName=\"RoleManagementSection1View\"]/Pane[@ClassName=\"ScrollViewer\"]/Text[@ClassName=\"TextBlock\"][@Name=\"User Management\"]")
	WebElement user;
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"RoleManagementMainView\"]/Custom[@ClassName=\"RoleManagementSection1View\"]/Pane[@ClassName=\"ScrollViewer\"]/Text[@ClassName=\"TextBlock\"][@Name=\"General Settings\"]")		
	WebElement gensettings;		
			
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"RoleManagementMainView\"]/Custom[@ClassName=\"RoleManagementSection1View\"]/Pane[@ClassName=\"ScrollViewer\"]/Text[@ClassName=\"TextBlock\"][@Name=\"APR Settings\"]")		
	WebElement apr;	
			
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"RoleManagementMainView\"]/Custom[@ClassName=\"RoleManagementSection1View\"]/Pane[@ClassName=\"ScrollViewer\"]/Text[@ClassName=\"TextBlock\"][@Name=\"APR CBCT Settings\"]")
	WebElement aprcbct;	
			
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"RoleManagementMainView\"]/Custom[@ClassName=\"RoleManagementSection1View\"]/Pane[@ClassName=\"ScrollViewer\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Chemotherapy Configuration\"]")		
	WebElement chemoconfiguration;
			
	@FindBy(xpath =	"//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"RoleManagementMainView\"]/Custom[@ClassName=\"RoleManagementSection1View\"]/Pane[@ClassName=\"ScrollViewer\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Classification\"]")	
	WebElement classification;	
			
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"RoleManagementMainView\"]/Custom[@ClassName=\"RoleManagementSection1View\"]/Pane[@ClassName=\"ScrollViewer\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Regimen\"]")		
	WebElement Regimen;		
			
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"RoleManagementMainView\"]/Custom[@ClassName=\"RoleManagementSection1View\"]/Pane[@ClassName=\"ScrollViewer\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Radio Sensitizers\"]")		
	WebElement Radio;		
			
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"RoleManagementMainView\"]/Custom[@ClassName=\"RoleManagementSection1View\"]/Pane[@ClassName=\"ScrollViewer\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Drug\"]")		
	WebElement Drug; 		
			
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"RoleManagementMainView\"]/Custom[@ClassName=\"RoleManagementSection1View\"]/Pane[@ClassName=\"ScrollViewer\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Field Configuration\"]")		
	WebElement Field;
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"RoleManagementMainView\"]/Custom[@ClassName=\"RoleManagementSection1View\"]/Pane[@ClassName=\"ScrollViewer\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Machine QA\"]")
	WebElement MachineQA;
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"RoleManagementMainView\"]/Custom[@ClassName=\"RoleManagementSection1View\"]/Pane[@ClassName=\"ScrollViewer\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Site Configuration\"]")
	WebElement Site;
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"RoleManagementMainView\"]/Custom[@ClassName=\"RoleManagementSection1View\"]/Pane[@ClassName=\"ScrollViewer\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Tolerance Settings\"]")
	WebElement TolSettings;
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"RoleManagementMainView\"]/Custom[@ClassName=\"RoleManagementSection1View\"]/Pane[@ClassName=\"ScrollViewer\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Designation Configuration\"]")
	WebElement Designation;
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"RoleManagementMainView\"]/Custom[@ClassName=\"RoleManagementSection1View\"]/Pane[@ClassName=\"ScrollViewer\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Audit Logs\"]")
	WebElement Audit;
	
	
	
	
	
	
	
	
	
}