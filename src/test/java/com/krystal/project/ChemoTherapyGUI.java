package com.krystal.project;

import java.io.IOException;
import java.net.URL;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.windows.WindowsDriver;
public class ChemoTherapyGUI extends ReferencefileChemotheraphy{
 
	private ChemoTherapyPOM chemop;
	private Actions act;
	private Actions action;

	
	
	 @Test(priority =1)
	public void launch()  throws InterruptedException, IOException {
	//DesiredCapabilities appCapabilities = new DesiredCapabilities();
	//appCapabilities.setCapability("app", "C:\\Program Files\\Panacea Medical Technologies\\Krystal\\Krystal.exe");
	//driver = new WindowsDriver<WebElement>(new URL("http://127.0.0.1:4723"), appCapabilities);
	ReferenceSigin Sign=new ReferenceSigin();
	Sign.Login(driver);
	Sign.ChemotheraphyPrecsription(driver);
	chemop=new ChemoTherapyPOM(driver);
	action=new Actions(driver);
	act=new Actions(driver);
	}
	 @Test(priority =2)
	public void Menu() throws InterruptedException, IOException
	{
		 test = extent.createTest("==========TITLE BAR ICONS========");
		 test = extent.createTest(guiTestCaseName()+" To Verify Menu icon displayed and enabled");
		 demo.isdisplayed(chemop.Menu, "Menu icon", test, driver);
		 demo.isEnabled(chemop.Menu, "Menu icon", test, driver);
	}

		
	 @Test(priority =2)
		public void Signout() throws InterruptedException, IOException
		{
			 test = extent.createTest(guiTestCaseName()+" To Verify Signout icon displayed and enabled");
			 demo.isdisplayed(chemop.Signout, "Signout", test, driver);
			 demo.isEnabled(chemop.Signout, "Signout", test, driver);
		}
		
	 @Test(priority =3)
		public void Theme() throws InterruptedException, IOException
		{
			 test = extent.createTest(guiTestCaseName()+" To Verify Theme Icon displayed and enabled");
			 demo.isdisplayed(chemop.Theme, "Theme", test, driver);
			 demo.isEnabled(chemop.Theme, "Theme", test, driver);
		}
		
		
	 @Test(priority =4)
		public void Password() throws InterruptedException, IOException
		{
			 test = extent.createTest(guiTestCaseName()+" To Verify Password Icon displayed and enabled");
			 demo.isdisplayed(chemop.Password, "Password", test, driver);
				demo.isEnabled(chemop.Password, "Password", test, driver);
		}
		
	 @Test(priority =5)
		public void Titlename() throws InterruptedException, IOException
		{
			 test = extent.createTest(guiTestCaseName()+" To Verify Title Name label ");
			 demo.isdisplayed(chemop.Titlename, "Prescription", test, driver);
			 demo.Textcomparsion(chemop.Titlename, "Prescription", test, driver);
		}
		
		
	 @Test(priority =6)
		public void Productlogo() throws InterruptedException, IOException
		{
			 test = extent.createTest(guiTestCaseName()+" To Verify Product Logo  ");
			 demo.isdisplayed(chemop.Productlogo, "Logo", test, driver);
		}
		
	 @Test(priority =7)
		public void Patientlist() throws InterruptedException, IOException
		{
			 test = extent.createTest(guiTestCaseName()+" To Verify Patient List  ");
			 demo.isdisplayed(chemop.Patientlist, "Patientlist", test, driver);
		}
	 
		
	 @Test(priority =8)
		public void AddPatient() throws InterruptedException, IOException
		{
			 test = extent.createTest(guiTestCaseName()+" To Verify Add Patient Label  ");
			 demo.isdisplayed(chemop.Patientlist, "Patient list ", test, driver);
			 demo.BydefaultisEnabled(chemop.Patientlist, "Patient list ", test, driver);
			
		}
		
	 @Test(priority =9)
		public void Patientmenu() throws InterruptedException, IOException
		{
		    test = extent.createTest("==========SIDE BAR MENU ICONS=========");
			 test = extent.createTest(guiTestCaseName()+" To Verify Patient Menu Label  ");
			 demo.isdisplayed(chemop.PatientMenu, "Patient Menu", test, driver);
			demo.Textcomparsion(chemop.PatientMenu, "Patient Menu", test, driver);
		}
		
	 @Test(priority =10)
		public void Demographics() throws InterruptedException, IOException
		{
		     
			 test = extent.createTest(guiTestCaseName()+" To Verify Demographics Label  ");
			 demo.Textcomparsion(chemop.Demographics,"DEMOGRAPHICS", test, driver);
			 demo.isEnabled(chemop.Demographics,"DEMOGRAPHICS", test, driver);
		}
	 
	 @Test(priority =11)
		public void Prescription() throws InterruptedException, IOException
		{
			 test = extent.createTest(guiTestCaseName()+" To Verify Prescription Label  ");
			 demo.Textcomparsion(chemop.Prescription,"PRESCRIPTION", test, driver);
			 demo.isEnabled(chemop.Prescription,"PRESCRIPTION", test, driver);
		}
	 
	 @Test(priority =12)
		public void Planapproval() throws InterruptedException, IOException
		{
			 test = extent.createTest(guiTestCaseName()+" To Verify Plan Approval Label  ");
			 demo.Textcomparsion(chemop.PlanAprroval,"PLAN APPROVAL", test, driver);
			 demo.BydefaultisEnabled(chemop.PlanAprroval,"PLAN APPROVAL", test, driver);
		}
	 
	 
	 @Test(priority =13)
		public void Scheduling() throws InterruptedException, IOException
		{
			 test = extent.createTest(guiTestCaseName()+" To Verify Scheduling Label  ");
			 demo.Textcomparsion(chemop.Scheudling,"SCHEDULING", test, driver);
			 demo.BydefaultisEnabled(chemop.Scheudling,"SCHEDULING", test, driver);
		}
	
	 @Test(priority =14)
		public void Vitals() throws InterruptedException, IOException
		{
			 test = extent.createTest(guiTestCaseName()+" To Verify Vitals Label  ");
			 demo.Textcomparsion(chemop.Vitals,"VITALS", test, driver);
			 demo.isEnabled(chemop.Vitals,"VITALS", test, driver);
		}
	 
	 @Test(priority =15)
		public void Labreports() throws InterruptedException, IOException
		{
			 test = extent.createTest(guiTestCaseName()+" To Verify LabReports Label  ");
			 demo.Textcomparsion(chemop.LabReports,"LAB REPORTS", test, driver);
			 demo.isEnabled(chemop.LabReports,"LAB REPORTS", test, driver);
		}
	 
	 @Test(priority =16)
		public void Treatmentoverview() throws InterruptedException, IOException
		{
			 test = extent.createTest(guiTestCaseName()+" To Verify Treatment Review Label  ");
			 demo.Textcomparsion(chemop.TreatmentReview, "TREATMENT REVIEW", test, driver);
			 demo.BydefaultisEnabled(chemop.TreatmentReview, "TREATMENT REVIEW", test, driver);
		}
	
	
	 @Test(priority =17)
	 public void ExternalBeam() throws IOException
	 {
		 test = extent.createTest(guiTestCaseName()+"  To verify the External Beam Radiotheraphy label", " External Beam Radiotheraphy label should be present");
		 demo.Textcomparsion( chemop.EBRT, "External Beam Radiotherapy", test,driver);
		 demo.BydefaultisSelected(chemop.EBRT, "External Beam Radiotherapy", test,driver); 
	 }
	
	 @Test(priority =18)
	public void Toverifychemotherapylabel() throws IOException {
		 
		test = extent.createTest(guiTestCaseName()+"  To verify the Chemotherapy label", " Chemotherapy label should be present"); 
		demo.Textcomparsion( chemop.Chemotherapy, "Chemotherapy", test,driver);
		demo.isSelected(chemop.Chemotherapy, "Chemotherapy", test,driver);
	}
	 @Test(priority =19)
	public void AddTabs() throws IOException
	 {
		 test = extent.createTest(guiTestCaseName()+"  Add Tabs icon Disabled", " Default Add Tabs icon should be in disable");
		 demo.isEnabled(chemop.Tabs, "AddTabs", test,driver); 
	 }
	 @Test(priority =20)
	public void NewsiteandPhase() throws IOException
	 {
		 test = extent.createTest(guiTestCaseName()+"  New site,Phase was Displayed and enabled", " New site,Phase should be in Enable");
		 demo.isdisplayed( chemop.NewSite, "New Site,Phase", test,driver);
		 demo.isEnabled( chemop.NewSite, "New Site,Phase", test,driver);
	 }
	 
	 @Test(priority =21)
		public void Exportbutton() throws IOException
		 {
			 test = extent.createTest(guiTestCaseName()+"Export button enabled", " Export button should be in enabled");
			 demo.Textcomparsion( chemop.Export, "EXPORT", test,driver);
			 demo.isEnabled( chemop.Export, "EXPORT", test,driver);
		 }
	 
	 @Test(priority =22)
		public void SaveButton() throws IOException
		 {
			 test = extent.createTest(guiTestCaseName()+"Save button enabled", " Save button should be in enabled");
			 demo.Textcomparsion( chemop.Save, "SAVE", test,driver);
			 demo.isEnabled( chemop.Save, "SAVE", test,driver);
		 }
	
	
	
	@Test(priority =25)
	public void ToverifyParameterslabel() throws IOException {
		 test = extent.createTest("==========Treatment Parameters=========");
		test = extent.createTest(guiTestCaseName() +"  To verify the Treatment Parameters label", "  Treatment Parametersshould be present"); 
		demo.Textcomparsion( chemop.TreatmentParameters, "TREATMENT PARAMETERS", test,driver); 
	}
	
	
	@Test(priority =26)
	public void Toverifysitelabel() throws IOException {
		
		test = extent.createTest(guiTestCaseName() +"  To verify the Site label", " Site label should be present"); 
		demo.Textcomparsion( chemop.site, "Site", test,driver); 
	}
	
	@Test(priority =26)
	public void ToverifyPhaselabel() throws IOException {
		
		test = extent.createTest(guiTestCaseName() +"  To verify the Phase label", " Phase label should be present"); 
		demo.isdisplayed( chemop.phasenum, "Phase", test,driver); 
	}
	
	@Test(priority =27)
	public void Toverifytreatmenttypelabel() throws IOException {
		test = extent.createTest(guiTestCaseName()+"  To verify the Treatment Type label", " Treatment Type label should be present"); 
		demo.Textcomparsion( chemop.treattype, "Treatment Type", test,driver);
		chemop.treattype.click();
	}
	@Test(priority =28)
	public void Toverifypostsurgerylabel() throws IOException {
		test = extent.createTest(guiTestCaseName()+"  To verify the Post-Surgery label", " Post-Surgery label should be present"); 
		demo.Textcomparsion( chemop.PostSurgery, "Post-Surgery", test,driver);
	}
	@Test(priority =29)
	public void Toverifypresurgerylabel() throws IOException {
		test = extent.createTest(guiTestCaseName()+" To verify the Pre-Surgery label", " Pre-Surgery label should be present"); 
		demo.Textcomparsion( chemop.PreSurgery, "Pre-Surgery", test,driver);
	}
	@Test(priority =30)
	public void Toverifypostradiationlabel() throws IOException {
		test = extent.createTest(guiTestCaseName()+" To verify the Post-Radiation label", " Post-Radiation label should be present"); 
		demo.Textcomparsion(chemop. PostRadiation, "Post-Radiation", test,driver);
	}
	@Test(priority =31)
	public void Toverifypreradiationlabel() throws IOException {
		test = extent.createTest(guiTestCaseName() +"  To verify the Pre-Radiation label", " Pre-Radiation label should be present"); 
		demo.Textcomparsion( chemop.PreRadiation, "Pre-Radiation", test,driver);
	}

	@Test(priority =32)
	public void Toverifyconcurrentlabel() throws IOException {
		test = extent.createTest(guiTestCaseName()+"  To verify the Concurrent label", " Concurrent label should be present"); 
		demo.Textcomparsion( chemop.Concurrent, "Concurrent", test,driver);
		action=new Actions(driver);
		action.moveToElement(chemop.Concurrent).click().perform();
	}
	
	@Test(priority =33)// Textcompasion not done
	public void Toverifylinkprescriptionlabel() throws IOException, InterruptedException {
		test = extent.createTest(guiTestCaseName() +"  To verify the Link Prescription label", " Link Prescription label should be present"); 
		demo.isdisplayed( chemop.LinkPrescription, "Link Prescription", test,driver);
	}

	@Test(priority =34)
	public void Toverifyotherslabel() throws IOException, InterruptedException {
		test = extent.createTest(guiTestCaseName() +"  To verify the Others label", " Others label should be present");
		chemop.treattype.click();
		Thread.sleep(1000);
		demo.Textcomparsion(chemop. Others, "Others", test,driver);
		chemop.treattype.click();
		
	}
	
	
	@Test(priority =35)
	public void Toverifyclassificationlabel() throws IOException {
		test = extent.createTest(guiTestCaseName() +" To verify the Classification label", " Classification label should be present"); 
		demo.Textcomparsion( chemop.classification, "Classification", test,driver); 
	}
	@Test(priority =36)
	public void ToverifyDruglabel() throws IOException {
		test = extent.createTest(guiTestCaseName() +"  To verify the Drug label", " Drug label should be present"); 
		demo.Textcomparsion( chemop.drug, "Drug", test,driver);
	}
	@Test(priority =37)
	public void ToverifyDrugformlabel() throws IOException {
		test = extent.createTest(guiTestCaseName() +"  To verify the Drug Form label", " Drug Form label should be present"); 
		demo.Textcomparsion( chemop.drugform, "Drug Form", test,driver);
		 chemop.drugform.click();
	}
	
	
	@Test(priority =38)
	public void Topicallabel() throws IOException {
		test = extent.createTest(guiTestCaseName()+"  To verify the Topical label", " Topical label should be present"); 
		demo.Textcomparsion( chemop.Topical, "Topical", test,driver);
	}
	
	@Test(priority =39)
	public void Orallabel() throws IOException {
		test = extent.createTest(guiTestCaseName()+"  To verify the Oral label", " Oral label should be present"); 
		demo.Textcomparsion( chemop.Oral, "Oral", test,driver);
	}
	
	@Test(priority =40)
	public void Injectionlabel() throws IOException {
		test = extent.createTest(guiTestCaseName()+"  To verify the Injection label", " Injection label should be present"); 
		demo.Textcomparsion( chemop.Injection, "Injection", test,driver);
	}
	
	@Test(priority =41)
	public void Intravenouslabel() throws IOException {
		test = extent.createTest(guiTestCaseName()+"  To verify the Intravenous label", " Intravenous label should be present"); 
		demo.Textcomparsion( chemop.Intravenous, "Intravenous", test,driver);
	}
	
	
	@Test(priority =42)
	public void IntraArteriallabel() throws IOException {
		test = extent.createTest(guiTestCaseName()+"  To verify the IntraArterial label", " IntraArterial label should be present"); 
		demo.Textcomparsion( chemop.IntraArterial, "IntraArterial", test,driver);
	}
	
	@Test(priority =43
			)
	public void IntraPeritoneallabel() throws IOException {
		test = extent.createTest(guiTestCaseName()+"  To verify the IntraPeritoneal label", " IntraPeritoneal label should be present"); 
		demo.Textcomparsion( chemop.IntraPeritoneal, "IntraPeritoneal", test,driver);
	}
	
	@Test(priority =44)
	public void Intrathecallabel() throws IOException {
		test = extent.createTest(guiTestCaseName()+"  To verify the Intrathecal label", " Intrathecal label should be present"); 
		demo.Textcomparsion( chemop.Intrathecal, "Intrathecal", test,driver);
		chemop.drugform.click();
	}
	

	
	@Test(priority =50)
	public void ToverifyDrugdoselabel() throws IOException {
		test = extent.createTest(guiTestCaseName()+" To verify the DrugDose label", " DrugDose label should be present"); 
		demo.isdisplayed( chemop.DrugDose, "DrugDose", test,driver);
	}
	@Test(priority =51)
	public void Toverifyradiosensitizerslabel() throws IOException {
		test = extent.createTest(guiTestCaseName() +" To verify the RadioSensitizers label", " RadioSensitizers label should be present"); 
		demo.Textcomparsion( chemop.radio, "RadioSensitizers", test,driver);
	}
	@Test(priority =52)
	public void Toverifyregimenslabel() throws IOException {
		test = extent.createTest(guiTestCaseName() +"  To verify the Regimens label", " Regimens label should be present"); 
		demo.Textcomparsion(chemop.regimen, "Regimens", test,driver);
	}
	
	@Test(priority =53)
	public void Toverifypatientbsacalculationlabel() throws IOException {
		test = extent.createTest(guiTestCaseName()+" To verify the Patient BSA Calculation label", " Patient BSA Calculation label should be present"); 
		demo.Textcomparsion( chemop.bsa, "Patient BSA Calculation", test,driver);
	}
	@Test(priority =54)// missing
	public void Toverifypatientweightlabel() throws IOException {
		test = extent.createTest(guiTestCaseName() +" To verify the Patient Weight label", " Patient Weight label should be present"); 
		demo.Textcomparsion(chemop.weight, "Patient Weight", test,driver);
	}
	@Test(priority =55)
	public void Toverifypatientheightlabel() throws IOException {
		test = extent.createTest(guiTestCaseName() +"  To verify the Patient Height label", " Patient Height label should be present"); 
		demo.Textcomparsion(chemop. height, "Patient Height", test,driver);
	}
	@Test(priority =56)
	public void Toverifydoselabel() throws IOException {
		test = extent.createTest(guiTestCaseName() +"  To verify the Dose label", " Dose label should be present"); 
		demo.Textcomparsion( chemop.dose, "Dose", test,driver);
	}
	@Test(priority =57)
	public void Toverifycycleslabel() throws IOException {
		test = extent.createTest(guiTestCaseName() +" To verify the Cycles label", " Cycles label should be present"); 
		demo.Textcomparsion(chemop. cycle, "Cycles", test,driver);
	}
	@Test(priority =58)
	public void Toverifyfrequencylabel() throws IOException {
		test = extent.createTest(guiTestCaseName() +"  To verify the Frequency label", " Frequency label should be present"); 
		demo.Textcomparsion(chemop. freq, "Frequency", test,driver);
	}
	@Test(priority =59)
	public void Toverifyweeklylabel() throws IOException {
		test = extent.createTest(guiTestCaseName() +"  To verify the Weekly label", " Weekly label should be present"); 
		demo.Textcomparsion( chemop. Weeklylbl, "Weekly", test,driver);
		demo.BydefaultisSelected( chemop. Weeklylbl, "Weekly", test,driver);
	}
	@Test(priority =60)
	public void Toverifymondaylabel() throws IOException {
		test = extent.createTest(guiTestCaseName() +"  To verify the Monday label", " Monday label should be present"); 
		demo.Textcomparsion( chemop.Monday, "Monday", test,driver);
		demo.BydefaultisSelected( chemop.Monday, "Monday", test,driver);
	}
	@Test(priority =61)
	public void Toverifytuesdaylabel() throws IOException {
		test = extent.createTest(guiTestCaseName() +"  To verify the Tuesday label", " Tuesday label should be present"); 
		demo.Textcomparsion(chemop.Tuesday, "Tuesday", test,driver);
		demo.BydefaultisSelected(chemop.Tuesday, "Tuesday", test,driver);
	}
	@Test(priority =62)
	public void Toverifywednesdaylabel() throws IOException {
		test = extent.createTest(guiTestCaseName()+"  To verify the Wednesday label", " Wednesday label should be present"); 
		demo.Textcomparsion(chemop.Wednesday, "Wednesday", test,driver);
		demo.BydefaultisSelected(chemop.Wednesday, "Wednesday", test,driver);
	}
	@Test(priority =63)
	public void Toverifythursdaylabel() throws IOException {
		test = extent.createTest(guiTestCaseName() +"  To verify the Thursday label", " Thursday label should be present"); 
		demo.Textcomparsion(chemop.Thursday, "Thursday", test,driver);
		demo.BydefaultisSelected(chemop.Thursday, "Thursday", test,driver);
	}
	@Test(priority =64)
	public void Toverifyfridaylabel() throws IOException {
		test = extent.createTest(guiTestCaseName() +"  To verify the Friday label", " Friday label should be present"); 
		demo.Textcomparsion(chemop.Friday, "Friday", test,driver);
		demo.BydefaultisSelected(chemop.Friday, "Friday", test,driver);
	}
	@Test(priority =65)
	public void Toverifysaturdaylabel() throws IOException {
		test = extent.createTest(guiTestCaseName() +"  To verify the Saturday label", " Saturday label should be present"); 
		demo.Textcomparsion(chemop.Saturday, "Saturday", test,driver);
		demo.BydefaultisSelected(chemop.Saturday, "Saturday", test,driver);
	}
	@Test(priority =66)
	public void Toverifysundaylabel() throws IOException {
		test = extent.createTest(guiTestCaseName() +"  To verify the Sunday label", " Sunday label should be present"); 
		demo.Textcomparsion(chemop.Sunday, "Sunday", test,driver);
		demo.BydefaultisSelected(chemop.Sunday, "Sunday", test,driver);
	}
	@Test(priority =67)
	public void Toverifycustomlabel() throws IOException {
		test = extent.createTest(guiTestCaseName() +"  To verify the Custom label", " Custom label should be present"); 
	    demo.Textcomparsion(chemop.Customlbl, "Custom", test,driver);
	}
	@Test(priority =68)
	public void Toverifyeverylabel() throws IOException {
		test = extent.createTest(guiTestCaseName() +"  To verify the Every label", " Every label should be present"); 
		demo.Textcomparsion(chemop.every, "Every", test,driver);
	}
	@Test(priority =69)
	public void Toverifyeverydropdown() throws IOException {
		test = extent.createTest(guiTestCaseName() +"  To verify the days label", " days label should be present"); 
		demo.Textcomparsion(chemop.Days, "Days", test,driver);
	}

	@Test(priority =70) 
	public void Toverifycreateddateandtimelabel() throws IOException {
		test = extent.createTest(guiTestCaseName() +" To verify the Created Date and Time label", " Created Date and Time label should be present"); 
	   demo.Textcomparsion(chemop.created, "Created Date and Time", test,driver);
	}


	//@Test(priority =72)   // Missing Case
	public void ToverifyCreateddateandtimeReadlabel() throws IOException {
		test = extent.createTest(guiTestCaseName() +" To verify the date label",   "  date label should be present");

	}
	
	@Test(priority =74)
	public void Toverifylastmodifieddateandtimelabel() throws IOException {
		test = extent.createTest(guiTestCaseName() +"  To verify the Last Modified Date and Time label", " Last Modified Date and Time label should be present"); 
		demo.Textcomparsion(chemop.modified, "Last Modified Date and Time", test,driver);
	}
//	@Test(priority =76)
	public void Toverifylastmodifieddateandtimereadlabel() throws IOException {
		test = extent.createTest(guiTestCaseName() +"  To verify the  label",  " date label should be present"); 
		//demo.Textcomparsion(chemo.ModifiedDateandTimeRead, date, test,driver);
	}
	@Test(priority =78)
	public void Toverifygeneraladditionalmedications() throws IOException {
		
		test = extent.createTest("================General Medications==========");
		test = extent.createTest(guiTestCaseName() +" GENERAL / ADDITIONAL MEDICATIONS label", " GENERAL / ADDITIONAL MEDICATIONS label should be present"); 
		demo.Textcomparsion(chemop.general, "GENERAL / ADDITIONAL MEDICATIONS", test,driver);
	}

	@Test(priority =79)
	public void Toverifysymptomslabel() throws IOException {
		test = extent.createTest(guiTestCaseName()+"  To verify the Symptoms label", " Symptoms label should be present"); 
		demo.Textcomparsion(chemop.symp, "Symptoms", test,driver);
	}
	@Test(priority =80)
	public void Toverifydruglabel() throws IOException {
		test = extent.createTest(guiTestCaseName()+"  To verify the Drug label", " Drug label should be present"); 
		demo.Textcomparsion(chemop.drug, "Drug", test,driver);	
	}
	@Test(priority =81)
	public void Toverifyremarkslabel() throws IOException {
		test = extent.createTest(guiTestCaseName()+"  To verify the Remarks label", " Remarks label should be present"); 
		demo.Textcomparsion(chemop.remark, "Remarks", test,driver);	
	}
	@Test(priority =82)
	public void Toverifydatelabel() throws IOException {
		test = extent.createTest(guiTestCaseName() +"  To verify the Date and time  label", " Date and time label should be present"); 
		demo.Textcomparsion(chemop.date, "Date and Time", test,driver);	
	}
	
	@Test(priority =83)
	public void Addfield() throws IOException, InterruptedException {
		test = extent.createTest(guiTestCaseName()+"To verify the Addfield label", "Addfield button Should be present");
		
		demo.isEnabled(chemop.Addfield, "Add feild", test,driver);	
		Actions act=new Actions(driver);
		act.moveToElement(chemop.Addfield).click().perform();
	}

	@Test(priority =84)
	public void Toverifysymptomlabel() throws IOException, InterruptedException {
		test = extent.createTest(guiTestCaseName()+"To verify the symptom label", "symptom Label Should be present");
		demo.Textcomparsion(chemop.symptoms, "Symptoms", test,driver);	
		Thread.sleep(1000);
	}
	
	@Test(priority =87)
	public void ToverifyDrugslabel() throws IOException, InterruptedException {
		test = extent.createTest(guiTestCaseName()+"To verify the Drug label", "Drug Label Should be present");
		demo.isdisplayed(chemop.Drugs1, "Drug", test,driver);	
		Thread.sleep(1000);
	
	}
	@Test(priority =87)
	public void ToverifyRemarkslabel() throws IOException, InterruptedException {
		test = extent.createTest(guiTestCaseName()+"To verify the Remarks label", "Remarks Label Should be present");
		demo.Textcomparsion(chemop.Remarks1, "Remarks", test,driver);	
		Thread.sleep(1000);
	}
	
	@Test(priority =88)
	public void ToverifyInsertlabel() throws IOException, InterruptedException {
		test = extent.createTest(guiTestCaseName()+"To verify the Insert label", "Insert Label Should be present");
		demo.Textcomparsion(chemop.Insert, "INSERT", test,driver);	
		demo.BydefaultisEnabled(chemop.Insert, "INSERT", test,driver);	
		Thread.sleep(1000);
	}
	
	@Test(priority =89)
	public void ToverifyCloseel() throws IOException, InterruptedException {
		test = extent.createTest(guiTestCaseName()+"To verify the Close ", "Close Label Should be present");
		demo.Textcomparsion(chemop.Close, "CLOSE", test,driver);	
		demo.isEnabled(chemop.Close, "CLOSE", test,driver);	
		Thread.sleep(1000);  
	}
	@Test(priority =90)
	public void Toverifysoftwareversionlabellabel() throws IOException {
		test = extent.createTest("===========Footerbar===============");
		test = extent.createTest(guiTestCaseName() +"  To verify the Software Version : label", " Software Version : label should be present"); 
		demo.Textcomparsion(chemop.software, "Software Version :", test,driver);		
	}
	@Test(priority =91)
	public void Toverifysoftwareversionnumberlabel() throws IOException {
		test = extent.createTest(guiTestCaseName() +"  To verify the 4.0.0 A3 label", " 4.0.0 A3 label should be present"); 
		demo.Textcomparsion(chemop.version, "4.0.0 A7", test,driver);
	}
	@Test(priority =92)
	public void Toverifylicensedtolabel() throws IOException, InterruptedException {
		test = extent.createTest(guiTestCaseName() +"  To verify the Licensed to : Hospital_Name label", " Licensed to : Hospital_Name label should be present"); 
		demo.Textcomparsion(chemop.license, "Licensed to : Hospital_Name", test,driver);	
		Thread.sleep(2000);
	}
	
}
	