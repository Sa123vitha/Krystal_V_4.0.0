package com.krystal.project;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.sikuli.script.FindFailed;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.windows.WindowsDriver;

public class RoleConfigurationGUI extends ReferencefileChemotheraphy{

	private Actions act;
	private RoleConfigPOM role;
	private WebElement scroll;

	@Test(priority =1)
	public void Launch()  throws InterruptedException, IOException {
	//DesiredCapabilities appCapabilities = new DesiredCapabilities();
   // appCapabilities.setCapability("app", "C:\\Program Files\\Panacea Medical Technologies\\Krystal\\Krystal.exe");
	//driver = new WindowsDriver<WebElement>(new URL("http://127.0.0.1:4723"), appCapabilities);
	ReferenceSigin Sign=new ReferenceSigin();
	Sign.Roleconfig(driver);
	role=new RoleConfigPOM(driver);
	act=new Actions(driver);
	}
	
/*

	@Test(priority =2)
	public void RoleconfigurationLabel() throws IOException, InterruptedException {
	test = extent.createTest(guiTestCaseName()+" ROLE CONFIGURATION label"," ROLE CONFIGURATION label should be present ");	
	demo.Textcomparsion(role.roleconfig, "ROLE CONFIGURATION", test,driver);
	}
 
@Test(priority =3)
	public void RoleNameLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Role Name label"," Role Name label should be present ");	
	demo.Textcomparsion(role.rolename, "Role Name", test,driver);
	}
@Test(priority =4)
	public void KrystalLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Krystal label"," Krystal label should be present ");	
	demo.Textcomparsion(role.krystal, "Krystal", test,driver);
	}
@Test(priority =5)
	public void TreatmentLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Treatment label"," Treatment label should be present ");	
	demo.Textcomparsion(role.treatment, "Treatment", test,driver);
	}
@Test(priority =6)
	public void ImageviewerLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Image Viewer label"," Image Viewer label should be present ");	
	demo.Textcomparsion(role.imageview, "Image Viewer", test,driver);
	}
@Test(priority =7)
	public void CTAndroidLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" CT Android label"," CT Android label should be present ");	
	demo.Textcomparsion(role.ctandroid, "CT Android", test,driver);
	}
@Test(priority =8)
	public void DemographicsandroidLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Demographics Android label"," Demographics Android label should be present ");	
	demo.Textcomparsion(role.demoandroid, "Demographics Android", test,driver);
	}


@Test(priority =9)
public void SelectallLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Select all label"," Select all label should be present ");	
demo.Textcomparsion(role.select, "Select All", test,driver);
}

@Test(priority =10)
public void TreatmentplanLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Treatment Plan label"," Treatment Plan label should be present ");	
demo.Textcomparsion(role.treatmentplan, "Treatment Plan", test,driver);
}

@Test(priority =11)
public void MachineslotLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Machine Slot label"," Machine Slot label should be present ");	
demo.Textcomparsion(role.machineslot, "Machine Slot", test,driver);
}

@Test(priority =12)
public void Holidaysettings() throws IOException {
test = extent.createTest(guiTestCaseName()+" Holiday Settings"," Holiday Settings label should be present ");	
demo.Textcomparsion(role.holidaysettings, "Holiday Settings", test,driver);
}

@Test(priority =13)
public void Templates() throws IOException {
test = extent.createTest(guiTestCaseName()+" Templates"," Templates label should be present ");	
demo.Textcomparsion(role.templates, "Templates", test,driver);
}

@Test(priority =14)
public void Usermanagementlabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" User Management"," User Management label should be present ");	
demo.Textcomparsion(role.usermanagement, "User Management", test,driver);
}

@Test(priority =15)
public void Generalsettings() throws IOException {
test = extent.createTest(guiTestCaseName()+" General Settings"," General Settings label should be present ");	
demo.Textcomparsion(role.generalsettings, "General Settings", test,driver);
}

@Test(priority =16)
public void Auditlogs() throws IOException {
test = extent.createTest(guiTestCaseName()+" Audit Logs "," Audit Logs label should be present ");	
demo.Textcomparsion(role.auditlogs, "Audit Logs", test,driver);
}

@Test(priority =17)
public void Save() throws IOException {
test = extent.createTest(guiTestCaseName()+" SAVE "," SAVE label should be present ");	
   demo.Textcomparsion(role.rolesave, "SAVE", test,driver);
}

@Test(priority =18)
public void Selectall() throws IOException {
test = extent.createTest(guiTestCaseName()+" SELECT ALL"," SELECT ALL label should be present ");	
 demo.Textcomparsion(role.roleselect, "SELECT ALL", test,driver);
}

@Test(priority =19)
public void Refresh() throws IOException {
test = extent.createTest(guiTestCaseName()+" Refersh Icon"," Refersh Icon should be present ");	
 demo.Textcomparsion(role.refresh, "Refresh", test,driver);
}

@Test(priority =20)
public void Rolelist() throws IOException {
test = extent.createTest(guiTestCaseName()+" ROLE LIST "," ROLE LIST label should be present ");	
demo.Textcomparsion(role.rolelist, "ROLE LIST", test,driver);
}

@Test(priority =21)
public void Rolename() throws IOException {
test = extent.createTest(guiTestCaseName()+" Role Name "," Role Name label should be present ");	
 demo.Textcomparsion(role.rolelistname, "Role Name", test,driver);
}
@Test(priority =22)
public void Createddate() throws IOException {
test = extent.createTest(guiTestCaseName()+" Created Date "," Created Date label should be present ");	
 demo.Textcomparsion(role.createddate, "Created Date", test,driver);
}
@Test(priority =23)
public void Updateddate() throws IOException {
test = extent.createTest(guiTestCaseName()+" Updated Date "," Updated Date label should be present ");	
demo.Textcomparsion(role.updateddate, "Updated Date", test,driver);
}
@Test(priority =24)
public void Searchreole() throws IOException, InterruptedException {
test = extent.createTest(guiTestCaseName()+" Search Role "," Search Role label should be present ");	
demo.Textcomparsion(role.searchrole, "Search Role", test,driver);
}

@Test(priority =25)
public void Treatmentplan() throws IOException, InterruptedException {
	role.selectcheck.click();
	role.scroll.click();
//	WebElement Scroll = driver.findElement(By.className("Thumb"));
	Thread.sleep(2000);
//	 action.moveToElement(Scroll).click().perform();
	Actions action= new Actions(driver);
	action.dragAndDropBy(role.scroll,0,300).perform();
	action.dragAndDropBy(role.scroll,0,-200).perform();
	 action.moveToElement(role.schedule).click().perform();
//	action.sendKeys(Keys.PAGE_DOWN).build().perform();
      Thread.sleep(2000);
     
test = extent.createTest(guiTestCaseName()+" Treatment Plan label"," Treatment Plan label should be present ");	
demo.Textcomparsion(role.treatmentplan, "Treatment Plan", test,driver);
}

@Test(priority =26)
public void DemographicsLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Demographics label"," Demographics label should be present ");	
demo.Textcomparsion(role.demographics, "Demographics", test,driver);
}
@Test(priority =27)
public void ViewLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" View label"," View label should be present ");	
demo.Textcomparsion(role.demoview, "View", test,driver);
}
@Test(priority =28)
public void AddLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Add label"," Add label should be present ");	
demo.Textcomparsion(role.demoadd, "Add", test,driver);
}
@Test(priority =29)
public void EditLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Edit label"," Edit label should be present ");	
demo.Textcomparsion(role.demoedit, "Edit", test,driver);
}

@Test(priority =30)
public void PrescriptionLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Prescription label"," Prescription label should be present ");	
demo.Textcomparsion(role.pres, "Prescripiton", test,driver);
}
@Test(priority =31)
public void BhabhatrontawLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" BHABHATRON-II_C02 label"," BHABHATRON-II_C02 label should be present ");	
demo.Textcomparsion(role.bhabhatrontaw, "BHABHATRON-II_C02", test,driver);
}
@Test(priority =32)
public void Bhabhatronviewlabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" View label"," View label should be present ");	
demo.Textcomparsion(role.tawview, "View", test,driver);
}
@Test(priority =33)
public void Bhabhatronaddlabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Add label"," Add label should be present ");	
demo.Textcomparsion(role.tawadd, "Add", test,driver);
}
@Test(priority =34)
public void BhabhatroneditLabel1() throws IOException {
test = extent.createTest(guiTestCaseName()+" Edit label"," Edit label should be present ");	
demo.Textcomparsion(role.tawedit, "Edit", test,driver);
}

@Test(priority =35)
public void BhabhatronmlcLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" BHABHATRON-II MLC v2_C03 label"," BHABHATRON-II MLC v2_C03 label should be present ");	
demo.Textcomparsion(role.bhabhatronmlc, "BHABHATRON-II MLC v2_C03", test,driver);
}
@Test(priority =36)
public void BhabhatronmlcviewLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" View label"," View label should be present ");	
demo.Textcomparsion(role.mlcview, "View", test,driver);
}
@Test(priority =37)
public void BhabhatronmlcaddLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Add label"," Add label should be present ");	
demo.Textcomparsion(role.mlcadd, "Add", test,driver);
}
@Test(priority =38)
public void BhabhatronmlceditLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Edit label"," Edit label should be present ");	
demo.Textcomparsion(role.mlcedit, "Edit", test,driver);
}

@Test(priority =39)
public void SiddharthLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" SIDDHARTH-II_C05 label"," SIDDHARTH-II_C05 label should be present ");	
demo.Textcomparsion(role.siddharth, "SIDDHARTH-II_C05", test,driver);
}
@Test(priority =40)
public void SiddharthviewLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" View label"," View label should be present ");	
demo.Textcomparsion(role.siddharthview, "View", test,driver);
}
@Test(priority =41)
public void SiddharthaddLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Add label"," Add label should be present ");	
demo.Textcomparsion(role.siddharthadd, "Add", test,driver);
}
@Test(priority =42)
public void SiddhartheditLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Edit label"," Edit label should be present ");	
demo.Textcomparsion(role.siddharthedit, "Edit", test,driver);
}

@Test(priority =43)
public void Bhabhatron3Label() throws IOException {
test = extent.createTest(guiTestCaseName()+" BHABHATRON-3i_C04 label"," BHABHATRON-3i_C04 label should be present ");	
demo.Textcomparsion(role.bha3i, "BHABHATRON-3i_C04", test,driver);
}

@Test(priority =44)
public void BhabhatronviewLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" View label"," View label should be present ");	
demo.Textcomparsion(role.bhabhatronview, "View", test,driver);
}
@Test(priority =45)
public void BhabhatronaddLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Add label"," Add label should be present ");	
demo.Textcomparsion(role.bhabhatronadd, "Add", test,driver);
}
@Test(priority =46)
public void BhabhatroneditLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Edit label"," Edit label should be present ");	
demo.Textcomparsion(role.bhabhatronedit, "Edit", test,driver);
}

@Test(priority =47)
public void Chemotherapylabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Chemotherapy label"," Chemotherapy label should be present ");	
demo.Textcomparsion(role.chemotherapy, "Chemotherapy", test,driver);
}
@Test(priority =48)
public void Chemotherapyviewlabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" View label"," View label should be present ");	
demo.Textcomparsion(role.chemoview, "View", test,driver);
}
@Test(priority =49)
public void ChemotherapyaddLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Add label"," Add label should be present ");	
demo.Textcomparsion(role.chemoadd, "Add", test,driver);
}
@Test(priority =50)
public void ChemotherapyeditLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Edit label"," Edit label should be present ");	
demo.Textcomparsion(role.chemoedit, "Edit", test,driver);
}

@Test(priority =51)
public void planapprovalLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Plan Approval label"," Plan Approval label should be present ");	
demo.Textcomparsion(role.plan, "Plan Approval", test,driver);
}
@Test(priority =52)
public void planbhabhatrontawLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" BHABHATRON-II_C02 label"," BHABHATRON-II_C02 label should be present ");	
demo.Textcomparsion(role.planbhataw, "BHABHATRON-II_C02", test,driver);
}
@Test(priority =53)
public void planbhabhatrontawviewLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" View label"," View label should be present ");	
demo.Textcomparsion(role.planbhatawview, "View", test,driver);
}
@Test(priority =54)
public void planbhabhatrontawimportLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Import label"," Import label should be present ");	
demo.Textcomparsion(role.planbhatawimport, "Import", test,driver);
}
@Test(priority =55)
public void planbhabhatrontawapproveLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Approve label"," Approve label should be present ");	
demo.Textcomparsion(role.planbhatawapprove, "Approve", test,driver);
}

@Test(priority =56)
public void planbhabhatronmlcLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" BHABHATRON-II MLC v2_C03 label"," BHABHATRON-II MLC v2_C03 label should be present ");	
demo.Textcomparsion(role.planbhamlc, "BHABHATRON-II MLC v2_C03", test,driver);
}
@Test(priority =57)
public void planbhabhatronmlcviewLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" View label"," View label should be present ");	
demo.Textcomparsion(role.planbhamlcview, "View", test,driver);
}
@Test(priority =58)
public void planbhabhatronmlcimportLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Import label"," Import label should be present ");	
demo.Textcomparsion(role.planbhamlcimport, "Import", test,driver);
}
@Test(priority =59)
public void planbhabhatronmlcapproveLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Approve label"," Approve label should be present ");	
demo.Textcomparsion(role.planbhamlcapprove, "Approve", test,driver);
}

@Test(priority =60)
public void plansiddharthLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" SIDDHARTH-II_C05 label"," SIDDHARTH-II_C05 label should be present ");	
demo.Textcomparsion(role.plansiddharth, "SIDDHARTH-II_C05", test,driver);
}
@Test(priority =61)
public void plansiddharthviewLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" View label"," View label should be present ");	
demo.Textcomparsion(role.plansiddharthview, "View", test,driver);
}
@Test(priority =62)
public void plansiddharthimportLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Import label"," Import label should be present ");	
demo.Textcomparsion(role.plansiddharthimport, "Import", test,driver);
}
@Test(priority =63)
public void plansiddharthapproveLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Approve label"," Approve label should be present ");	
demo.Textcomparsion(role.plansiddharthapprove, "Approve", test,driver);
}

@Test(priority =64)
public void planbhabhatronLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" BHABHATRON-3i_C04 label"," BHABHATRON-3i_C04 label should be present ");	
demo.Textcomparsion(role.planbha, "BHABHATRON-3i_C04", test,driver);
}
@Test(priority =65)
public void planbhabhatronviewLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" View label"," View label should be present ");	
demo.Textcomparsion(role.planbhaview, "View", test,driver);
}
@Test(priority =66)
public void planbhabhatronimportLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Import label"," Import label should be present ");	
demo.Textcomparsion(role.planbhaimport, "Import", test,driver);
}
@Test(priority =67)
public void planbhabhatronapproveLabel() throws IOException, InterruptedException {
test = extent.createTest(guiTestCaseName()+" Approve label"," Approve label should be present ");	
demo.Textcomparsion(role.planbhaapprove, "Approve", test,driver);

}

@Test(priority =68)
public void SchedulingLabel() throws IOException, InterruptedException {
	role.scroll.click();
	Thread.sleep(2000);
	Actions action= new Actions(driver);
	action.dragAndDropBy(role.scroll,0,150).perform();
//	action.dragAndDropBy(role.scroll,0,-200).perform();
	 action.moveToElement(role.schedule).click().perform();
	//action.sendKeys(Keys.PAGE_DOWN).build().perform();
	  Thread.sleep(2000);
test = extent.createTest(guiTestCaseName()+" Scheduling label"," Scheduling label should be present ");	
demo.Textcomparsion(role.scheduling, "Scheduling", test,driver);
}


@Test(priority =69)
public void EBRTLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" EBRT label"," EBRT label should be present ");	
demo.Textcomparsion(role.EBRT, "EBRT", test,driver);
}
@Test(priority =70)
public void EBRTViewLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" View label"," View label should be present ");	
demo.Textcomparsion(role.ebrtview, "View", test,driver);
}
@Test(priority =71)
public void EBRTscheduleLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Schedule label"," Schedule label should be present ");	
demo.Textcomparsion(role.ebrtschedule, "Schedule", test,driver);
}
@Test(priority =72)
public void EBRTmoveLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Move label"," Move label should be present ");	
demo.Textcomparsion(role.ebrtmove, "Move", test,driver);
}
@Test(priority =73)
public void EBRTrescheduleLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Reschedule label"," Reschedule label should be present ");	
demo.Textcomparsion(role.ebrtreschedule, "Reschedule", test,driver);
}
@Test(priority =74)
public void EBRTabortLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Abort label"," Abort label should be present ");	
demo.Textcomparsion(role.ebrtabort, "Abort", test,driver);
}

@Test(priority =75)
public void ChemotherapyLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Chemotherapy label"," Chemotherapy label should be present ");	
demo.Textcomparsion(role.chemo, "Chemotherapy", test,driver);
}
@Test(priority =76)
public void ChemotherapyviewLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" View label"," View label should be present ");	
demo.Textcomparsion(role.chemotherapyview, "View", test,driver);
}
@Test(priority =77)
public void ChemotherapyscheduleLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Schedule label"," Schedule label should be present ");	
demo.Textcomparsion(role.chemotherapyschedule, "Schedule", test,driver);
}
@Test(priority =78)
public void ChemotherapymoveLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Move label"," Move label should be present ");	
demo.Textcomparsion(role.chemotherapymove, "Move", test,driver);
}
@Test(priority =79)
public void ChemotherapyrescheduleLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Reschedule label"," Reschedule label should be present ");	
demo.Textcomparsion(role.chemotherapyreschedule, "Reschedule", test,driver);
}
@Test(priority =80)
public void ChemotherapyabortLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Abort label"," Abort label should be present ");	
demo.Textcomparsion(role.chemotherapyabort, "Abort", test,driver);
}


@Test(priority =81)
public void VitalsLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Vitals label"," Vitals label should be present ");	
demo.Textcomparsion(role.vitals, "Vitals", test,driver);
}
@Test(priority =82)
public void VitalsviewLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" View label"," View label should be present ");	
demo.Textcomparsion(role.vitalsview, "View", test,driver);
}
@Test(priority =83)
public void VitalsaddLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Add label"," Add label should be present ");	
demo.Textcomparsion(role.vitalsadd, "Add", test,driver);
}
@Test(priority =84)
public void VitalseditLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Edit label"," Edit label should be present ");	
demo.Textcomparsion(role.vitalsedit, "Edit", test,driver);
}


@Test(priority =85)
public void LabreportsLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Lab Reports label"," Lab Reports label should be present ");	
demo.Textcomparsion(role.lab, "Lab Reports", test,driver);
}
@Test(priority =86)
public void LabreportsviewLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" View label"," View label should be present ");	
demo.Textcomparsion(role.labreportsview, "View", test,driver);
}
@Test(priority =87)
public void LabreportsaddLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Add label"," Add label should be present ");	
demo.Textcomparsion(role.labreportsadd, "Add", test,driver);
}
@Test(priority =88)
public void LabreportseditLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Edit label"," Edit label should be present ");	
demo.Textcomparsion(role.labreportsedit, "Edit", test,driver);
}
@Test(priority =89)
public void TreatmentreviewLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Treatment Review label"," Treatment Review label should be present ");	
demo.Textcomparsion(role.Treatment, "Treatment Review", test,driver);
}

@Test(priority =90)
public void Machineslot() throws IOException {
test = extent.createTest(guiTestCaseName()+" Machine Slot label"," Machine Slot label should be present ");	
demo.Textcomparsion(role.machineslot, "Machine Slot", test,driver);
}
@Test(priority =91)
public void BhabhatronTaw() throws IOException {
test = extent.createTest(guiTestCaseName()+" BHABHATRON-II_C02 label"," BHABHATRON-II_C02 label should be present ");	
demo.Textcomparsion(role.bhabhatrontaw, "BHABHATRON-II_C02", test,driver);
}
@Test(priority =92)
public void BhabhatronTawview() throws IOException {
test = extent.createTest(guiTestCaseName()+" View label"," View label should be present ");	
demo.Textcomparsion(role.machinebhatawview, "View", test,driver);
}
@Test(priority =93)
public void Bhabhatrontawfractionperhour() throws IOException {
test = extent.createTest(guiTestCaseName()+" Fractions per Hour label"," Fractions per Hour label should be present ");	
demo.Textcomparsion(role.machinebhatawfractions, "Fractions per Hour", test,driver);
}


@Test(priority =94)
public void BhabhatronMlc() throws IOException {
test = extent.createTest(guiTestCaseName()+" BHABHATRON-II MLC v2_C03 label"," BHABHATRON-II MLC v2_C03 label should be present ");	
demo.Textcomparsion(role.bhabhatronmlc, "BHABHATRON-II MLC v2_C03", test,driver);
}
@Test(priority =95)
public void BhabhatronMlcview() throws IOException {
test = extent.createTest(guiTestCaseName()+" View label"," View label should be present ");	
demo.Textcomparsion(role.machinebhamlcview, "View", test,driver);
}
@Test(priority =96)
public void Bhabhatronmlcfrcationsperhour() throws IOException {
test = extent.createTest(guiTestCaseName()+" Fractions per Hour label"," Fractions per Hour label should be present ");	
demo.Textcomparsion(role.machinebhamlcfractions, "Fractions per Hour", test,driver);
}


@Test(priority =97)
public void Siddharthlabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" SIDDHARTH-II_C05 label"," SIDDHARTH-II_C05 label should be present ");	
demo.Textcomparsion(role.siddharth, "SIDDHARTH-II_C05", test,driver);
}
@Test(priority =98)
public void Siddharthviewlabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" View label"," View label should be present ");	
demo.Textcomparsion(role.machinesiddharthview, "View", test,driver);
}

@Test(priority =99)
public void Siddharthrfa() throws IOException {
test = extent.createTest(guiTestCaseName()+" RFA"," RFA label should be present ");	
demo.Textcomparsion(role.machinesiddharthrfa, "RFA", test,driver);
}
@Test(priority =100)
public void Siddharthfrcationsperhour() throws IOException {
test = extent.createTest(guiTestCaseName()+" Fractions per Hour"," Fractions per Hour label should be present ");	
demo.Textcomparsion(role.machinesiddharthfractions, "Fractions per Hour", test,driver);
}


@Test(priority =101)
public void Bhabhatron3() throws IOException {
test = extent.createTest(guiTestCaseName()+" BHABHATRON-3i_C04 label"," BHABHATRON-3i_C04 label should be present ");	
demo.Textcomparsion(role.bha3i, "BHABHATRON-3i_C04", test,driver);
}
@Test(priority =102)
public void Bhabhatron3view() throws IOException {
test = extent.createTest(guiTestCaseName()+" View label"," View label should be present ");	
demo.Textcomparsion(role.machinebhaview, "View", test,driver);
}

@Test(priority =103)
public void Bhabhatronrrfa() throws IOException {
test = extent.createTest(guiTestCaseName()+" RFA label"," RFA label should be present ");	
demo.Textcomparsion(role.machinebharfa, "RFA", test,driver);
}
@Test(priority =104)
public void Bhabhatronfractiosperhour() throws IOException {
test = extent.createTest(guiTestCaseName()+" Fractions per Hour label"," Fractions per Hour label should be present ");	
demo.Textcomparsion(role.machinebhafrcations, "Fractions per Hour", test,driver);
}


@Test(priority =105)
public void Holidaysettingslabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Holiday Settings"," Holiday Settings label should be present ");	
demo.Textcomparsion(role.holiday, "Holiday Settings", test,driver);
}
@Test(priority =106)
public void Holidaysettingsview() throws IOException {
test = extent.createTest(guiTestCaseName()+" View"," View label should be present ");	
demo.Textcomparsion(role.holidayview, "View", test,driver);
}
@Test(priority =107)
public void Holidaysettingsadd() throws IOException {
test = extent.createTest(guiTestCaseName()+" Add"," Add label should be present ");	
demo.Textcomparsion(role.holidayadd, "Add", test,driver);
}
@Test(priority =108)
public void Holidaysettingsedit() throws IOException {
test = extent.createTest(guiTestCaseName()+" Edit"," Edit label should be present ");	
demo.Textcomparsion(role.holidayedit, "Edit", test,driver);
}


@Test(priority =109)
public void Templateslabel() throws IOException, InterruptedException {
role.scroll.click();
Thread.sleep(2000);
Actions action= new Actions(driver);
action.dragAndDropBy(role.scroll,0,150).perform();
//action.dragAndDropBy(role.scroll,0,-200).perform();
 action.moveToElement(role.template).click().perform();
//action.sendKeys(Keys.PAGE_DOWN).build().perform();
  Thread.sleep(2000);
test = extent.createTest(guiTestCaseName()+" Templates"," Templates label should be present ");	
demo.Textcomparsion(role.template, "Templates", test,driver);
}


@Test(priority =110)
public void BhabhatronTaw1() throws IOException {
test = extent.createTest(guiTestCaseName()+" BHABHATRON-II_C02"," BHABHATRON-II_C02 label should be present ");	
demo.Textcomparsion(role.bhabhatrontaw, "BHABHATRON-II_C02", test,driver);
}
@Test(priority =111)
public void Bhabhatrontawview1() throws IOException {
test = extent.createTest(guiTestCaseName()+" View"," View label should be present ");	
demo.Textcomparsion(role.tempbhatawview, "View", test,driver);
}
@Test(priority =112)
public void Bhabhatrontawadd1() throws IOException {
test = extent.createTest(guiTestCaseName()+" Add"," Add label should be present ");	
demo.Textcomparsion(role.tempbhatawadd, "Add", test,driver);
}
@Test(priority =113)
public void Bhabhatrontawedit1() throws IOException {
test = extent.createTest(guiTestCaseName()+" Edit"," Edit label should be present ");	
demo.Textcomparsion(role.tempbhatawedit, "Edit", test,driver);
}


@Test(priority =114)
public void Bhabhatronmlc1() throws IOException {
test = extent.createTest(guiTestCaseName()+" BHABHATRON-II MLC v2_C03"," BHABHATRON-II MLC v2_C03 label should be present ");	
demo.Textcomparsion(role.bhabhatronmlc, "BHABHATRON-II MLC v2_C03", test,driver);
}
@Test(priority =115)
public void Bhabhatronmlcview1() throws IOException {
test = extent.createTest(guiTestCaseName()+" View"," View label should be present ");	
demo.Textcomparsion(role.tempbhamlcview, "View", test,driver);
}
@Test(priority =116)
public void Bhabhatronmlcadd1() throws IOException {
test = extent.createTest(guiTestCaseName()+" Add"," Add label should be present ");	
demo.Textcomparsion(role.tempbhamlcadd, "Add", test,driver);
}
@Test(priority =117)
public void Bhabhatronmlcedit1() throws IOException {
test = extent.createTest(guiTestCaseName()+" Edit"," Edit label should be present ");	
demo.Textcomparsion(role.tempbhamlcedit, "Edit", test,driver);
}


@Test(priority =118)
public void Siddharth1() throws IOException {
test = extent.createTest(guiTestCaseName()+" SIDDHARTH-II_C05"," SIDDHARTH-II_C05 label should be present ");	
demo.Textcomparsion(role.siddharth, "SIDDHARTH-II_C05", test,driver);
}
@Test(priority =119)
public void Siddharthview1() throws IOException {
test = extent.createTest(guiTestCaseName()+" View"," View label should be present ");	
demo.Textcomparsion(role.tempsiddharthview, "View", test,driver);
}
@Test(priority =120)
public void Siddharthadd1() throws IOException {
test = extent.createTest(guiTestCaseName()+" Add"," Add label should be present ");	
demo.Textcomparsion(role.tempsiddharthadd, "Add", test,driver);
}
@Test(priority =121)
public void Siddharthedit1() throws IOException {
test = extent.createTest(guiTestCaseName()+" Edit"," Edit label should be present ");	
demo.Textcomparsion(role.tempsiddharthedit, "Edit", test,driver);
}

@Test(priority =122)
public void Bhabhatron3i() throws IOException {
test = extent.createTest(guiTestCaseName()+" BHABHATRON-3i_C04"," BHABHATRON-3i_C04 label should be present ");	
demo.Textcomparsion(role.bha3i, "BHABHATRON-3i_C04", test,driver);
}
@Test(priority =123)
public void Bhabhatronview3i() throws IOException {
test = extent.createTest(guiTestCaseName()+" View"," View label should be present ");	
demo.Textcomparsion(role.tempbhaview, "View", test,driver);
}
@Test(priority =124)
public void Bhabhatronadd3i() throws IOException {
test = extent.createTest(guiTestCaseName()+" Add"," Add label should be present ");	
demo.Textcomparsion(role.tempbhaadd, "Add", test,driver);
}
@Test(priority =125)
public void Bhabhatronedit2() throws IOException {
test = extent.createTest(guiTestCaseName()+" Edit"," Edit label should be present ");	
demo.Textcomparsion(role.tempbhaedit, "Edit", test,driver);
}


@Test(priority =126)
public void Usermanagement() throws IOException {
test = extent.createTest(guiTestCaseName()+" User Management"," User Management label should be present ");	
demo.Textcomparsion(role.user, "User Management", test,driver);
}
@Test(priority =127)
public void Usermanagementview() throws IOException {
test = extent.createTest(guiTestCaseName()+" View"," View label should be present ");	
demo.Textcomparsion(role.usermanagementview, "View", test,driver);
}
@Test(priority =128)
public void Usermanagementadd() throws IOException {
test = extent.createTest(guiTestCaseName()+" Add"," Add label should be present ");	
demo.Textcomparsion(role.usermanagementadd, "Add", test,driver);
}
@Test(priority =129)
public void Usermanagementedit() throws IOException {
test = extent.createTest(guiTestCaseName()+" Edit"," Edit label should be present ");	
demo.Textcomparsion(role.usermanagementedit, "Edit", test,driver);
}


@Test(priority =130)
public void Generalsettingslabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" General Setings"," General Setings label should be present ");	
demo.Textcomparsion(role.gensettings, "General Settings", test,driver);
}
@Test(priority =131)
public void Aprsettings() throws IOException {
test = extent.createTest(guiTestCaseName()+" APR Settings"," APR Settings label should be present ");	
demo.Textcomparsion(role.apr, "APR Settings", test,driver);
}


@Test(priority =132)
public void Siddharth2() throws IOException {
test = extent.createTest(guiTestCaseName()+" SIDDHARTH-II_C05"," SIDDHARTH-II_C05 label should be present ");	
demo.Textcomparsion(role.siddharth, "SIDDHARTH-II_C05", test,driver);
}
@Test(priority =133)
public void Siddharthview2() throws IOException {
test = extent.createTest(guiTestCaseName()+" View"," View label should be present ");	
demo.Textcomparsion(role.aprsetsiddharthview, "View", test,driver);
}
@Test(priority =134)
public void Siddharthadd2() throws IOException {
test = extent.createTest(guiTestCaseName()+" Add"," Add label should be present ");	
demo.Textcomparsion(role.aprsetsiddharthadd, "Add", test,driver);
}
@Test(priority =135)
public void Siddharthedit2() throws IOException {
test = extent.createTest(guiTestCaseName()+" Edit"," Edit label should be present ");	
demo.Textcomparsion(role.aprsetsiddharthedit, "Edit", test,driver);
}

@Test(priority =136)
public void Bhabhatron1() throws IOException {
test = extent.createTest(guiTestCaseName()+" BHABHATRON-3i_C04"," BHABHATRON-3i_C04 label should be present ");	
demo.Textcomparsion(role.bha3i, "BHABHATRON-3i_C04", test,driver);
}
@Test(priority =137)
public void Bhabhatronview1() throws IOException {
test = extent.createTest(guiTestCaseName()+" View"," View label should be present ");	
demo.Textcomparsion(role.aprsetbhaview, "View", test,driver);
}
@Test(priority =138)
public void Bhabhatronadd1() throws IOException {
test = extent.createTest(guiTestCaseName()+" Add"," Add label should be present ");	
demo.Textcomparsion(role.aprsetbhaadd, "Add", test,driver);
}
@Test(priority =139)
public void Bhabhatronedit1() throws IOException {
test = extent.createTest(guiTestCaseName()+" Edit"," Edit label should be present ");	
demo.Textcomparsion(role.aprsetbhaedit, "Edit", test,driver);
}


@Test(priority =140)
public void AprCBCTsettings() throws IOException {
test = extent.createTest(guiTestCaseName()+" APR CBCT Settings"," APR CBCT Settings label should be present ");	
demo.Textcomparsion(role.aprcbct, "APR CBCT Settings", test,driver);
}

@Test(priority =141)
public void SiddharthII() throws IOException {
test = extent.createTest(guiTestCaseName()+" SIDDHARTH-II_C05"," SIDDHARTH-II_C05 label should be present ");	
demo.Textcomparsion(role.siddharth, "SIDDHARTH-II_C05", test,driver);
}
@Test(priority =142)
public void SiddharthIIview() throws IOException {
test = extent.createTest(guiTestCaseName()+" View"," View label should be present ");	
demo.Textcomparsion(role.aprcbctsetsiddview, "View", test,driver);
}
@Test(priority =143)
public void SiddharthIIadd() throws IOException {
test = extent.createTest(guiTestCaseName()+" Add"," Add label should be present ");	
demo.Textcomparsion(role.aprcbctsetsiddadd, "Add", test,driver);
}
@Test(priority =144)
public void SiddharthIIedit() throws IOException {
test = extent.createTest(guiTestCaseName()+" Edit"," Edit label should be present ");	
demo.Textcomparsion(role.aprcbctsetsiddedit, "Edit", test,driver);
}

@Test(priority =145)
public void Bhabhatron3i1() throws IOException {
test = extent.createTest(guiTestCaseName()+" BHABHATRON-3i_C04"," BHABHATRON-3i_C04 label should be present ");	
demo.Textcomparsion(role.bha3i, "BHABHATRON-3i_C04", test,driver);
}
@Test(priority =146)
public void Bhabhatron3view1() throws IOException {
test = extent.createTest(guiTestCaseName()+" View"," View label should be present ");	
demo.Textcomparsion(role.aprcbctsetbhaview, "View", test,driver);
}
@Test(priority =147)
public void Bhabhatron3add() throws IOException {
test = extent.createTest(guiTestCaseName()+" Add"," Add label should be present ");	
demo.Textcomparsion(role.aprcbctsetbhaadd, "Add", test,driver);
}
@Test(priority =148)
public void Bhabhatron3edit() throws IOException {
test = extent.createTest(guiTestCaseName()+" Edit"," Edit label should be present ");	
demo.Textcomparsion(role.aprcbctsetbhaedit, "Edit", test,driver);
}


@Test(priority =149)
public void Chemotherapyconfiguration() throws IOException, InterruptedException {
	role.scroll.click();
	Thread.sleep(2000);
	Actions action= new Actions(driver);
	action.dragAndDropBy(role.scroll,0,200).perform();
	//action.dragAndDropBy(role.scroll,0,-200).perform();
	 action.moveToElement(role.chemoconfiguration).click().perform();
	//action.sendKeys(Keys.PAGE_DOWN).build().perform();
	  Thread.sleep(2000);
test = extent.createTest(guiTestCaseName()+" Chemotherapy Configuration"," Chemotherapy Configuration label should be present ");	
demo.Textcomparsion(role.chemoconfiguration, "Chemotherapy Configuration", test,driver);
}

@Test(priority =150)
public void Classification() throws IOException {
test = extent.createTest(guiTestCaseName()+" Classification"," Classification label should be present ");	
demo.Textcomparsion(role.classification, "Classification", test,driver);
}
@Test(priority =151)
public void Classificationview() throws IOException {
test = extent.createTest(guiTestCaseName()+" View"," View label should be present ");	
demo.Textcomparsion(role.classificationview, "View", test,driver);
}
@Test(priority =152)
public void Classificationadd() throws IOException {
test = extent.createTest(guiTestCaseName()+" Add"," Add label should be present ");	
demo.Textcomparsion(role.classificationadd, "Add", test,driver);
}
@Test(priority =153)
public void Classificationedit() throws IOException {
test = extent.createTest(guiTestCaseName()+" Edit"," Edit label should be present ");	
demo.Textcomparsion(role.classificationedit, "Edit", test,driver);
}


@Test(priority =154)
public void Regimen() throws IOException {
test = extent.createTest(guiTestCaseName()+" Regimen"," Regimen label should be present ");	
demo.Textcomparsion(role.Regimen, "Regimen", test,driver);
}
@Test(priority =155)
public void Regimenview() throws IOException {
test = extent.createTest(guiTestCaseName()+" View"," View label should be present ");	
demo.Textcomparsion(role.regimenview, "View", test,driver);
}
@Test(priority =156)
public void Regimenadd() throws IOException {
test = extent.createTest(guiTestCaseName()+" Add"," Add label should be present ");	
demo.Textcomparsion(role.regimenadd, "Add", test,driver);
}
@Test(priority =157)
public void Regimenedit() throws IOException {
test = extent.createTest(guiTestCaseName()+" Edit"," Edit label should be present ");	
demo.Textcomparsion(role.regimenedit, "Edit", test,driver);
}


@Test(priority =158)
public void Radiosensitizers() throws IOException {
test = extent.createTest(guiTestCaseName()+" Radio Sensitizers"," Radio Sensitizers label should be present ");	
demo.Textcomparsion(role.Radio, "Radio Sensitizers", test,driver);
}
@Test(priority =159)
public void Radiosensitizersview() throws IOException {
test = extent.createTest(guiTestCaseName()+" View"," View label should be present ");	
demo.Textcomparsion(role.radiosensitizersview, "View", test,driver);
}
@Test(priority =160)
public void Radiosensitizersadd() throws IOException {
test = extent.createTest(guiTestCaseName()+" Add"," Add label should be present ");	
demo.Textcomparsion(role.radiosensitizersadd, "Add", test,driver);
}
@Test(priority =161)
public void Radiosensitizersedit() throws IOException {
test = extent.createTest(guiTestCaseName()+" Edit"," Edit label should be present ");	
demo.Textcomparsion(role.radiosensitizersedit, "Edit", test,driver);
}

@Test(priority =162)
public void Drug() throws IOException {
test = extent.createTest(guiTestCaseName()+" Drug"," Drug label should be present ");	
demo.Textcomparsion(role.Drug, "Drug", test,driver);
}
@Test(priority =163)
public void Drugview() throws IOException {
test = extent.createTest(guiTestCaseName()+" View"," View label should be present ");	
demo.Textcomparsion(role.drugview, "View", test,driver);
}
@Test(priority =164)
public void Drugadd() throws IOException {
test = extent.createTest(guiTestCaseName()+" Add"," Add label should be present ");	
demo.Textcomparsion(role.drugadd, "Add", test,driver);
}
@Test(priority =165)
public void Drugedit() throws IOException {
test = extent.createTest(guiTestCaseName()+" Edit"," Edit label should be present ");	
demo.Textcomparsion(role.drugedit, "Edit", test,driver);
}


@Test(priority =166)
public void Fieldconfiguration() throws IOException {
test = extent.createTest(guiTestCaseName()+" Field Configuration"," Field Configuration label should be present ");	
demo.Textcomparsion(role.Field, "Field Configuration", test,driver);
}
@Test(priority =167)
public void Bhabhatrontawfield() throws IOException {
test = extent.createTest(guiTestCaseName()+" BHABHATRON-II_C02"," BHABHATRON-II_C02 label should be present ");	
demo.Textcomparsion(role.bhabhatrontaw, "BHABHATRON-II_C02", test,driver);
}
@Test(priority =168)
public void Bhabhatrontawviewfield() throws IOException {
test = extent.createTest(guiTestCaseName()+" View"," View label should be present ");	
demo.Textcomparsion(role.fieldconfigbhatawview, "View", test,driver);
}
@Test(priority =169)
public void Bhabhatrontawaddfield() throws IOException {
test = extent.createTest(guiTestCaseName()+" Add"," Add label should be present ");	
demo.Textcomparsion(role.fieldconfigbhatawadd, "Add", test,driver);
}
@Test(priority =170)
public void Bhabhatrontaweditfield() throws IOException {
test = extent.createTest(guiTestCaseName()+" Edit"," Edit label should be present ");	
demo.Textcomparsion(role.fieldconfigbhataedit, "Edit", test,driver);
}

@Test(priority =171)
public void Bhabhatronmlcfield() throws IOException {
test = extent.createTest(guiTestCaseName()+" BHABHATRON-II MLC v2_C03"," BHABHATRON-II MLC v2_C03 label should be present ");	
demo.Textcomparsion(role.bhabhatronmlc, "BHABHATRON-II MLC v2_C03", test,driver);
}
@Test(priority =172)
public void Bhabhatronmlcviewfield() throws IOException {
test = extent.createTest(guiTestCaseName()+" View"," View label should be present ");	
demo.Textcomparsion(role.fieldconfigbhamlcview, "View", test,driver);
}
@Test(priority =173)
public void Bhabhatronmlcaddfield() throws IOException {
test = extent.createTest(guiTestCaseName()+" Add"," Add label should be present ");	
demo.Textcomparsion(role.fieldconfigbhamlcadd, "Add", test,driver);
}
@Test(priority =174)
public void Bhabhatronmlceditfield() throws IOException {
test = extent.createTest(guiTestCaseName()+" Edit"," Edit label should be present ");	
demo.Textcomparsion(role.fieldconfigbhamlcedit, "Edit", test,driver);
}


@Test(priority =175)
public void Siddharthfield() throws IOException {
test = extent.createTest(guiTestCaseName()+" SIDDHARTH-II_C05"," SIDDHARTH-II_C05 label should be present ");	
demo.Textcomparsion(role.siddharth, "SIDDHARTH-II_C05", test,driver);
}
@Test(priority =176)
public void Siddharthviewfield() throws IOException {
test = extent.createTest(guiTestCaseName()+" View"," View label should be present ");	
demo.Textcomparsion(role.fieldconfigsiddview, "View", test,driver);
}
@Test(priority =177)
public void Siddharthaddfield() throws IOException {
test = extent.createTest(guiTestCaseName()+" Add"," Add label should be present ");	
demo.Textcomparsion(role.fieldconfigsiddadd, "Add", test,driver);
}
@Test(priority =178)
public void Siddhartheditfield() throws IOException {
test = extent.createTest(guiTestCaseName()+" Edit"," Edit label should be present ");	
demo.Textcomparsion(role.fieldconfigsiddedit, "Edit", test,driver);
}

@Test(priority =179)
public void Bhabhatronfield() throws IOException {
test = extent.createTest(guiTestCaseName()+" BHABHATRON-3i_C04"," BHABHATRON-3_C04 label should be present ");	
demo.Textcomparsion(role.bha3i, "BHABHATRON-3i_C04", test,driver);
}
@Test(priority =180)
public void Bhabhatronviewfield() throws IOException {
test = extent.createTest(guiTestCaseName()+" View"," View label should be present ");	
demo.Textcomparsion(role.fieldconfigbhaview, "View", test,driver);
}
@Test(priority =181)
public void Bhabhatronaddfield() throws IOException {
test = extent.createTest(guiTestCaseName()+" Add"," Add label should be present ");	
demo.Textcomparsion(role.fieldconfigbhaadd, "Add", test,driver);
}
@Test(priority =182)
public void Bhabhatroneditfield() throws IOException {
test = extent.createTest(guiTestCaseName()+" Edit"," Edit label should be present ");	
demo.Textcomparsion(role.fieldconfigbhaedit, "Edit", test,driver);
}

@Test(priority =183)
public void Machineqa() throws IOException, InterruptedException {
	role.scroll.click();
	Thread.sleep(2000);
	Actions action= new Actions(driver);
	action.dragAndDropBy(role.scroll,0,100).perform();
	//action.dragAndDropBy(role.scroll,0,-200).perform();
	 action.moveToElement(role.MachineQA).click().perform();
	//action.sendKeys(Keys.PAGE_DOWN).build().perform();
	  Thread.sleep(2000);	
test = extent.createTest(guiTestCaseName()+" Machine QA"," Machine QA label should be present ");	
demo.Textcomparsion(role.machineqa, "Machine QA", test,driver);
}


@Test(priority =184)
public void Siddharthqa() throws IOException {
test = extent.createTest(guiTestCaseName()+" SIDDHARTH-II_C05"," SIDDHARTH-II_C05 label should be present ");	
demo.Textcomparsion(role.siddharth, "SIDDHARTH-II_C05", test,driver);
}
@Test(priority =185)
public void Siddharthview() throws IOException {
test = extent.createTest(guiTestCaseName()+" View"," View label should be present ");	
demo.Textcomparsion(role.machineqasiddview, "View", test,driver);
}
@Test(priority =186)
public void Siddharthadd() throws IOException {
test = extent.createTest(guiTestCaseName()+" Import label"," Import label should be present ");	
demo.Textcomparsion(role.machineimport, "Import", test,driver);
}
@Test(priority =187)
public void Siddharthedit() throws IOException {
test = extent.createTest(guiTestCaseName()+" Edit"," Edit label should be present ");	
demo.Textcomparsion(role.machineqasiddedit, "Edit", test,driver);
}


@Test(priority =188)
public void Bhabhatronqa() throws IOException {
test = extent.createTest(guiTestCaseName()+" BHABHATRON-3i_C04"," BHABHATRON-3i_C04 label should be present ");	
demo.Textcomparsion(role.bha3i, "BHABHATRON-3i_C04", test,driver);
}
@Test(priority =189)
public void Bhabhatronviewqa() throws IOException {
test = extent.createTest(guiTestCaseName()+" View"," View label should be present ");	
demo.Textcomparsion(role.machineqabhaview, "View", test,driver);
}
@Test(priority =190)
public void Bhabhatronaddqa() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Import label"," Import label should be present ");	
	demo.Textcomparsion(role.machineimport, "Import", test,driver);
}
@Test(priority =191)
public void Bhabhatroneditqa() throws IOException {
test = extent.createTest(guiTestCaseName()+" Edit"," Edit label should be present ");	
demo.Textcomparsion(role.machineqabhaedit, "Edit", test,driver);
}

@Test(priority =192)
public void Roleconfiguration() throws IOException {
test = extent.createTest(guiTestCaseName()+" Site Configuration"," Site Configuration label should be present ");	
demo.Textcomparsion(role.Site, "Site Configuration", test,driver);
}
@Test(priority =193)
public void Roleconfigurationview() throws IOException {
test = extent.createTest(guiTestCaseName()+" View"," View label should be present ");	
demo.Textcomparsion(role.roleconfigview, "View", test,driver);
}
@Test(priority =194)
public void Roleconfigurationadd() throws IOException {
test = extent.createTest(guiTestCaseName()+" Add"," Add label should be present ");	
demo.Textcomparsion(role.roleconfigadd, "Add", test,driver);
}
@Test(priority =195)
public void Roleconfigurationedit() throws IOException {
test = extent.createTest(guiTestCaseName()+" Edit"," Edit label should be present ");	
demo.Textcomparsion(role.roleconfigedit,"Edit", test,driver);
}


@Test(priority =196)
public void Tolerancesettings() throws IOException {
test = extent.createTest(guiTestCaseName()+" Tolerance Settings"," Tolerance Settings label should be present ");	
demo.Textcomparsion(role.TolSettings, "Tolerance Settings", test,driver);
}
@Test(priority =197)
public void Bhabhatrontawtol() throws IOException {
test = extent.createTest(guiTestCaseName()+" BHABHATRON-II_C02"," BHABHATRON-II_C02 label should be present ");	
demo.Textcomparsion(role.bhabhatrontaw, "BHABHATRON-II_C02", test,driver);
}
@Test(priority =198)
public void Bhabhatrontawview() throws IOException {
test = extent.createTest(guiTestCaseName()+" View"," View label should be present ");	
demo.Textcomparsion(role.tolsettawview, "View", test,driver);
}
@Test(priority =199)
public void Bhabhatrontawadd() throws IOException {
test = extent.createTest(guiTestCaseName()+" Add"," Add label should be present ");	
demo.Textcomparsion(role.tolsettawadd, "Add", test,driver);
}
@Test(priority =200)
public void Bhabhatrontawedit() throws IOException {
test = extent.createTest(guiTestCaseName()+" Edit"," Edit label should be present ");	
demo.Textcomparsion(role.tolsettawedit, "Edit", test,driver);
}


@Test(priority =201)
public void Bhabhatronmlctol() throws IOException {
test = extent.createTest(guiTestCaseName()+" BHABHATRON-II MLC v2_C03"," BHABHATRON-II MLC v2_C03 label should be present ");	
demo.Textcomparsion(role.bhabhatronmlc, "BHABHATRON-II MLC v2_C03", test,driver);
}
@Test(priority =202)
public void Bhabhatronmlcview() throws IOException {
test = extent.createTest(guiTestCaseName()+" View"," View label should be present ");	
demo.Textcomparsion(role.tolsetmlcview, "View", test,driver);
}
@Test(priority =203)
public void Bhabhatronmlcadd() throws IOException {
test = extent.createTest(guiTestCaseName()+" Add"," Add label should be present ");	
demo.Textcomparsion(role.tolsetmlcadd, "Add", test,driver);
}
@Test(priority =204)
public void Bhabhatronmlcedit() throws IOException {
test = extent.createTest(guiTestCaseName()+" Edit"," Edit label should be present ");	
demo.Textcomparsion(role.tolsetmlcedit, "Edit", test,driver);
}


@Test(priority =205)
public void Siddharthtol() throws IOException {
test = extent.createTest(guiTestCaseName()+" SIDDHARTH-II_C05"," SIDDHARTH-II_C05 label should be present ");	
demo.Textcomparsion(role.siddharth, "SIDDHARTH-II_C05", test,driver);
}
@Test(priority =206)
public void Bhabhatronview() throws IOException {
test = extent.createTest(guiTestCaseName()+" View"," View label should be present ");	
demo.Textcomparsion(role.tolsetsidview, "View", test,driver);
}
@Test(priority =207)
public void Bhabhatronadd() throws IOException {
test = extent.createTest(guiTestCaseName()+" Add"," Add label should be present ");	
demo.Textcomparsion(role.tolsetsidadd, "Add", test,driver);
}
@Test(priority =208)
public void Bhabhatronedit() throws IOException {
test = extent.createTest(guiTestCaseName()+" Edit"," Edit label should be present ");	
demo.Textcomparsion(role.tolsetsidedit, "Edit", test,driver);
}

@Test(priority =209)
public void Bhabhatrontol() throws IOException {
test = extent.createTest(guiTestCaseName()+" BHABHATRON-3i_C04"," BHABHATRON-3_C04 label should be present ");	
demo.Textcomparsion(role.bha3i, "BHABHATRON-3i_C04", test,driver);
}
@Test(priority =210)
public void Bhabhatronviewtol() throws IOException {
test = extent.createTest(guiTestCaseName()+" View"," View label should be present ");	
demo.Textcomparsion(role.tolsetbhaview, "View", test,driver);
}
@Test(priority =211)
public void Bhabhatronaddtol() throws IOException {
test = extent.createTest(guiTestCaseName()+" Add"," Add label should be present ");	
demo.Textcomparsion(role.tolsetbhaadd, "Add", test,driver);
}
@Test(priority =212)
public void Bhabhatronedittol() throws IOException {
test = extent.createTest(guiTestCaseName()+" Edit"," Edit label should be present ");	
demo.Textcomparsion(role.tolsetbhaedit, "Edit", test,driver);
}



@Test(priority =213)
public void Designationconfiguration() throws IOException {
test = extent.createTest(guiTestCaseName()+" Designation Configuration "," Designation Configuration label should be present ");	
demo.Textcomparsion(role.Designation, "Designation Configuration", test,driver);
}
@Test(priority =214)
public void Designationconfigurationview() throws IOException {
test = extent.createTest(guiTestCaseName()+" View "," View label should be present ");	
demo.Textcomparsion(role.designationconfigview, "View", test,driver);
}
@Test(priority =215)
public void Designationconfigurationadd() throws IOException {
test = extent.createTest(guiTestCaseName()+" Add "," Add label should be present ");	
demo.Textcomparsion(role.designationconfigadd, "Add", test,driver);
}
@Test(priority =216)
public void Designationconfigurationedit() throws IOException {
test = extent.createTest(guiTestCaseName()+" Edit "," Edit label should be present ");	
demo.Textcomparsion(role.designationconfigedit, "Edit", test,driver);
}



@Test(priority =217)
	public void Auditlogslabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Audit Logs "," Audit Logs label should be present ");	
	demo.Textcomparsion(role.Audit, "Audit Logs", test,driver);
	}
@Test(priority =218)
	public void Auditlogsview() throws IOException {
	test = extent.createTest(guiTestCaseName()+" View "," View label should be present ");	
	demo.Textcomparsion(role.auditlogsview, "View", test,driver);
	}
@Test(priority =219)
	public void Auditlogsexport() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Export "," Export label should be present ");	
	demo.Textcomparsion(role.auditlogsexport, "Export", test,driver);
	}



*/

@Test(priority =220)
	public void SelectallT() throws IOException {
	role.treatment.click();
	test = extent.createTest(guiTestCaseName()+" Select All "," Select All label should be present ");	
	demo.Textcomparsion(role.selectall, "Select All", test,driver);
	}
 

@Test(priority =221)
public void BhabhatronT() throws IOException {
test = extent.createTest(guiTestCaseName()+" BHABHATRON-II_C02 "," BHABHATRON-II_C02 label should be present ");	
demo.Textcomparsion(role.bhabhatrontaw, "BHABHATRON-II_C02", test,driver);
}
@Test(priority =222)
public void BhabhatronmlcT() throws IOException {
test = extent.createTest(guiTestCaseName()+" BHABHATRON-II MLC v2_C03 "," BHABHATRON-II MLC v2_C03 label should be present ");	
demo.Textcomparsion(role.bhabhatronmlc, "BHABHATRON-II MLC v2_C03", test,driver);
}
@Test(priority =223)
public void Bhabhatront() throws IOException {
test = extent.createTest(guiTestCaseName()+" BHABHATRON-3i_C04 "," BHABHATRON-3i_C04 label should be present ");	
demo.Textcomparsion(role.bha3i, "BHABHATRON-3i_C04", test,driver);
}
@Test(priority =224)
public void SiddharthT() throws IOException {
test = extent.createTest(guiTestCaseName()+" SIDDHARTH-II_C05 "," SIDDHARTH-II_C05 label should be present ");	
demo.Textcomparsion(role.siddharth, "SIDDHARTH-II_C05", test,driver);
}


@Test(priority =225)
public void Bhabhatrontaw() throws IOException {
	role.selectcheck.click();
test = extent.createTest(guiTestCaseName()+" BHABHATRON-II_C02 "," BHABHATRON-II_C02 label should be present ");	
demo.Textcomparsion(role.bhabhatrontaw, "BHABHATRON-II_C02", test,driver);
}
@Test(priority =226)
public void Bhabhatrontawworklist() throws IOException {
test = extent.createTest(guiTestCaseName()+" Work List "," Work List label should be present ");	
demo.Textcomparsion(role.selectallbhatawworklist, "Work List", test,driver);
}
@Test(priority =227)
public void Bhabhatrontawresearchmode() throws IOException {
test = extent.createTest(guiTestCaseName()+" Research Mode "," Research Mode label should be present ");	
demo.Textcomparsion(role.selectallbhatawresearchmode, "Research Mode", test,driver);
}
@Test(priority =228)
public void Bhabhatrontawrsourcesettings() throws IOException {
test = extent.createTest(guiTestCaseName()+" Source Settings "," Source Settings label should be present ");	
demo.Textcomparsion(role.selectallbhatawsource, "Source Settings", test,driver);
}
	
	
@Test(priority =229)
public void Bhabhatronmlc() throws IOException {
test = extent.createTest(guiTestCaseName()+" BHABHATRON-II MLC v2_C03 "," BHABHATRON-II MLC v2_C03 label should be present ");	
demo.Textcomparsion(role.bhabhatronmlc, "BHABHATRON-II MLC v2_C03", test,driver);
}
@Test(priority =230)
public void Bhabhatronmlcworklist() throws IOException {
test = extent.createTest(guiTestCaseName()+" Work List "," Work List label should be present ");	
demo.Textcomparsion(role.selectallbhamlcworklist, "Work List", test,driver);
}
@Test(priority =231)
public void Bhabhatronmlcresearchmode() throws IOException {
test = extent.createTest(guiTestCaseName()+" Research Mode "," Research Mode label should be present ");	
demo.Textcomparsion(role.selectallbhamlcresearch, "Research Mode", test,driver);
}
@Test(priority =232)
public void Bhabhatronmlcsourcesettings() throws IOException {
test = extent.createTest(guiTestCaseName()+" Source Settings "," Source Settings label should be present ");	
demo.Textcomparsion(role.selectallbhamlcsource, "Source Settings", test,driver);
}	
	
	
@Test(priority =233)
public void Siddharth() throws IOException {
test = extent.createTest(guiTestCaseName()+" SIDDHARTH-II_C05 "," SIDDHARTH-II_C05 label should be present ");	
demo.Textcomparsion(role.siddharth, "SIDDHARTH-II_C05", test,driver);
}
@Test(priority =234)
public void Siddharthworklist() throws IOException {
test = extent.createTest(guiTestCaseName()+" Work List "," Work List label should be present ");	
demo.Textcomparsion(role.selectallsiddworklist, "Work List", test,driver);
}
@Test(priority =235)
public void Siddharthdailyqa() throws IOException {
test = extent.createTest(guiTestCaseName()+" Daily QA "," Daily QA label should be present ");	
demo.Textcomparsion(role.selectallsiddqa, "Daily QA", test,driver);
}
@Test(priority =236)
public void Siddharthdosimetry() throws IOException {
test = extent.createTest(guiTestCaseName()+" Dosimetry "," Dosimetry label should be present ");	
demo.Textcomparsion(role.selectallsidddose, "Dosimetry", test,driver);
}
@Test(priority =237)
public void Siddharthsourcesettings() throws IOException {
test = extent.createTest(guiTestCaseName()+" Source Settings "," Source Settings label should be present ");	
demo.Textcomparsion(role.selectallsiddsource, "Source Settings", test,driver);
}

@Test(priority =238)
public void Siddharthresearch() throws IOException {
test = extent.createTest(guiTestCaseName()+" Research Mode "," Research Mode label should be present ");	
demo.Textcomparsion(role.selectallsiddresearch, "Research Mode", test,driver);
}


@Test(priority =239)
public void Bhabhatron() throws IOException {
test = extent.createTest(guiTestCaseName()+" BHABHATRON-3i_C04 "," BHABHATRON-3i_C04 label should be present ");	
demo.Textcomparsion(role.bha3i, "BHABHATRON-3i_C04", test,driver);
}
@Test(priority =240)
public void Bhabhatronworklist() throws IOException {
test = extent.createTest(guiTestCaseName()+" Work List "," Work List label should be present ");	
demo.Textcomparsion(role.selectallbhaworklist, "Work List", test,driver);
}
@Test(priority =241)
public void Bhabhatrondailyqa() throws IOException {
test = extent.createTest(guiTestCaseName()+" Daily QA "," Daily QA label should be present ");	
demo.Textcomparsion(role.selectallbhadailyqa, "Daily QA", test,driver);
}
@Test(priority =242)
public void Bhabhatrondosimetry() throws IOException {
test = extent.createTest(guiTestCaseName()+" Dosimetry "," Dosimetry label should be present ");	
demo.Textcomparsion(role.selectallbhadosimetry, "Dosimetry", test,driver);
}

@Test(priority =243)
public void Bhabhatronresearch() throws IOException {
test = extent.createTest(guiTestCaseName()+" Research Mode "," Research Mode label should be present ");	
demo.Textcomparsion(role.selectallbharesearch, "Research Mode", test,driver);
}

@Test(priority =244)
public void Bhabhatronresearchmode() throws IOException {
test = extent.createTest(guiTestCaseName()+" Source Settings "," Source Settings label should be present ");	
demo.Textcomparsion(role.selectallbhasource, "Source Settings", test,driver);
}
 

@Test(priority =245)
public void Imageviewer() throws IOException {
	role.image.click();
test = extent.createTest(guiTestCaseName()+" Image Viewer "," Image Viewer label should be present ");	
demo.Textcomparsion(role.image, "Image Viewer", test,driver);
}
@Test(priority =246)
public void Loginimage() throws IOException {
test = extent.createTest(guiTestCaseName()+" Login "," Login label should be present ");	
demo.Textcomparsion(role.imagelogin, "Login", test,driver);
}


@Test(priority =247)
public void Ctandroid() throws IOException {
	role.ctandroid.click();
test = extent.createTest(guiTestCaseName()+" CT Android "," CT Android label should be present ");	
demo.Textcomparsion(role.ctandroid, "CT Android", test,driver);
}
@Test(priority =248)
public void Loginct() throws IOException {
test = extent.createTest(guiTestCaseName()+" Login "," Login label should be present ");	
demo.Textcomparsion(role.ctandroidlogin, "Login", test,driver);
}


@Test(priority =249)
public void Demographicsandroid() throws IOException {
	role.demoandroid1.click();
test = extent.createTest(guiTestCaseName()+" Demographics Android "," Demographics Android label should be present ");	
   demo.Textcomparsion(role.demoandroid1, "Demographics Android", test,driver);
}
@Test(priority =250)
public void Login() throws IOException {
test = extent.createTest(guiTestCaseName()+" Login "," Login label should be present ");	
   demo.Textcomparsion(role.demoandroidlogin, "Login", test,driver);
}





@Test(priority =251)
	public void Save1() throws IOException {
	test = extent.createTest(guiTestCaseName()+" SAVE "," SAVE label should be present ");	
       demo.Textcomparsion(role.rolesave, "SAVE", test,driver);
	}
@Test(priority =252)
	public void Selectall1() throws IOException {
	test = extent.createTest(guiTestCaseName()+" SELECT ALL"," SELECT ALL label should be present ");	
     demo.Textcomparsion(role.roleselect, "SELECT ALL", test,driver);
	}



@Test(priority =253)
	public void Rolelist1() throws IOException {
	test = extent.createTest(guiTestCaseName()+" ROLE LIST "," ROLE LIST label should be present ");	
   demo.Textcomparsion(role.rolelist, "ROLE LIST", test,driver);
	}
@Test(priority =254)
	public void Rolename1() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Role Name "," Role Name label should be present ");	
     demo.Textcomparsion(role.rolelistname, "Role Name", test,driver);
	}
@Test(priority =255)
	public void Createddate1() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Created Date "," Created Date label should be present ");	
     demo.Textcomparsion(role.createddate, "Created Date", test,driver);
	}
@Test(priority =256)
	public void Updateddate1() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Updated Date "," Updated Date label should be present ");	
   demo.Textcomparsion(role.updateddate, "Updated Date", test,driver);
	}
@Test(priority =257)
	public void Searchreole1() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Search Role "," Search Role label should be present ");	
   demo.Textcomparsion(role.searchrole, "Search Role", test,driver);
	}





















	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
