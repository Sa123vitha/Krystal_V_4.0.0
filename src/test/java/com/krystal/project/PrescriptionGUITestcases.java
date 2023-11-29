package com.krystal.project;

import java.io.IOException;
import java.net.URL;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.windows.WindowsDriver;
public class PrescriptionGUITestcases extends ReferencefileChemotheraphy{
 
	
	private PrescriptionPOM user;
	private Actions act;
	private PrescriptionPOM prescription;
	private WebElement TemplateG1;
	private WebElement Add;

	@BeforeClass
	public void setUp1()  throws InterruptedException, IOException {
	DesiredCapabilities appCapabilities = new DesiredCapabilities();
	appCapabilities.setCapability("app", "C:\\Program Files\\Panacea Medical Technologies\\Krystal\\Krystal.exe");
	driver = new WindowsDriver<WebElement>(new URL("http://127.0.0.1:4723"), appCapabilities);
	ReferenceSigin Sign=new ReferenceSigin();
	Sign.Login(driver);
	Sign.Prescription(driver);
	prescription=new PrescriptionPOM(driver);
	act=new Actions(driver);
	}
	
	 @Test(priority =2)
		public void Menu() throws InterruptedException, IOException
		{
			 test = extent.createTest("==========TITLE BAR ICONS========");
			 test = extent.createTest(guiTestCaseName()+" To Verify Menu icon displayed and enabled");
			 demo.isdisplayed(prescription.Menu, "Menu icon", test, driver);
			 demo.isEnabled(prescription.Menu, "Menu icon", test, driver);
		}

			
		 @Test(priority =2)
			public void Signout() throws InterruptedException, IOException
			{
				 test = extent.createTest(guiTestCaseName()+" To Verify Signout icon displayed and enabled");
				 demo.isdisplayed(prescription.Signout, "Signout", test, driver);
				 demo.isEnabled(prescription.Signout, "Signout", test, driver);
			}
			
		 @Test(priority =3)
			public void Theme() throws InterruptedException, IOException
			{
				 test = extent.createTest(guiTestCaseName()+" To Verify Theme Icon displayed and enabled");
				 demo.isdisplayed(prescription.Theme, "Theme", test, driver);
				 demo.isEnabled(prescription.Theme, "Theme", test, driver);
			}
			
			
		 @Test(priority =4)
			public void Password() throws InterruptedException, IOException
			{
				 test = extent.createTest(guiTestCaseName()+" To Verify Password Icon displayed and enabled");
				 demo.isdisplayed(prescription.Password, "Password", test, driver);
					demo.isEnabled(prescription.Password, "Password", test, driver);
			}
			
		 @Test(priority =5)
			public void Titlename() throws InterruptedException, IOException
			{
				 test = extent.createTest(guiTestCaseName()+" To Verify Title Name label ");
				 demo.isdisplayed(prescription.Titlename, "Prescription", test, driver);
				 demo.Textcomparsion(prescription.Titlename, "Prescription", test, driver);
			}
			
			
		 @Test(priority =6)
			public void Productlogo() throws InterruptedException, IOException
			{
				 test = extent.createTest(guiTestCaseName()+" To Verify Product Logo  ");
				 demo.isdisplayed(prescription.Productlogo, "Logo", test, driver);
			}
			
		 @Test(priority =7)
			public void Patientlist() throws InterruptedException, IOException
			{
				 test = extent.createTest(guiTestCaseName()+" To Verify Patient List  ");
				 demo.isdisplayed(prescription.Patientlist, "Patientlist", test, driver);
			}
		 
			
		 @Test(priority =8)
			public void AddPatient() throws InterruptedException, IOException
			{
				 test = extent.createTest(guiTestCaseName()+" To Verify Add Patient Label  ");
				 demo.isdisplayed(prescription.Patientlist, "Patient list ", test, driver);
				 demo.BydefaultisEnabled(prescription.Patientlist, "Patient list ", test, driver);
				
			}
			
		 @Test(priority =9)
			public void Patientmenu() throws InterruptedException, IOException
			{
			    test = extent.createTest("==========SIDE BAR MENU ICONS=========");
				 test = extent.createTest(guiTestCaseName()+" To Verify Patient Menu Label  ");
				 demo.isdisplayed(prescription.PatientMenu, "Patient Menu", test, driver);
				demo.Textcomparsion(prescription.PatientMenu, "Patient Menu", test, driver);
			}
			
		 @Test(priority =10)
			public void Demographics() throws InterruptedException, IOException
			{
			     
				 test = extent.createTest(guiTestCaseName()+" To Verify Demographics Label  ");
				 demo.Textcomparsion(prescription.Demographics,"DEMOGRAPHICS", test, driver);
				 demo.isEnabled(prescription.Demographics,"DEMOGRAPHICS", test, driver);
			}
		 
		 @Test(priority =11)
			public void Prescription() throws InterruptedException, IOException
			{
				 test = extent.createTest(guiTestCaseName()+" To Verify Prescription Label  ");
				 demo.Textcomparsion(prescription.Prescription,"PRESCRIPTION", test, driver);
				 demo.isEnabled(prescription.Prescription,"PRESCRIPTION", test, driver);
			}
		 
		 @Test(priority =12)
			public void Planapproval() throws InterruptedException, IOException
			{
				 test = extent.createTest(guiTestCaseName()+" To Verify Plan Approval Label  ");
				 demo.Textcomparsion(prescription.PlanAprroval,"PLAN APPROVAL", test, driver);
				 demo.BydefaultisEnabled(prescription.PlanAprroval,"PLAN APPROVAL", test, driver);
			}
		 
		 
		 @Test(priority =13)
			public void Scheduling() throws InterruptedException, IOException
			{
				 test = extent.createTest(guiTestCaseName()+" To Verify Scheduling Label  ");
				 demo.Textcomparsion(prescription.Scheudling,"SCHEDULING", test, driver);
				 demo.BydefaultisEnabled(prescription.Scheudling,"SCHEDULING", test, driver);
			}
		
		 @Test(priority =14)
			public void Vitals() throws InterruptedException, IOException
			{
				 test = extent.createTest(guiTestCaseName()+" To Verify Vitals Label  ");
				 demo.Textcomparsion(prescription.Vitals,"VITALS", test, driver);
				 demo.isEnabled(prescription.Vitals,"VITALS", test, driver);
			}
		 
		 @Test(priority =15)
			public void Labreports() throws InterruptedException, IOException
			{
				 test = extent.createTest(guiTestCaseName()+" To Verify LabReports Label  ");
				 demo.Textcomparsion(prescription.LabReports,"LAB REPORTS", test, driver);
				 demo.isEnabled(prescription.LabReports,"LAB REPORTS", test, driver);
			}
		 
		 @Test(priority =16)
			public void Treatmentoverview() throws InterruptedException, IOException
			{
				 test = extent.createTest(guiTestCaseName()+" To Verify Treatment Review Label  ");
				 demo.Textcomparsion(prescription.TreatmentReview, "TREATMENT REVIEW", test, driver);
				 demo.BydefaultisEnabled(prescription.TreatmentReview, "TREATMENT REVIEW", test, driver);
			}
		
		
		 @Test(priority =17)
		 public void ExternalBeam() throws IOException
		 {
			 test = extent.createTest(guiTestCaseName()+"  To verify the External Beam Radiotheraphy label", " External Beam Radiotheraphy label should be present");
			 demo.Textcomparsion( prescription.EBRT, "External Beam Radiotherapy", test,driver);
			 demo.isSelected(prescription.EBRT, "External Beam Radiotherapy", test,driver); 
		 }
		
		 @Test(priority =18)
		public void Toverifychemotherapylabel() throws IOException {
			 
			test = extent.createTest(guiTestCaseName()+"  To verify the Chemotherapy label", " Chemotherapy label should be present"); 
			demo.Textcomparsion( prescription.Chemotherapy, "Chemotherapy", test,driver);
			demo.BydefaultisSelected(prescription.Chemotherapy, "Chemotherapy", test,driver);
		}
		 @Test(priority =19)
		public void AddTabs() throws IOException
		 {
			 test = extent.createTest(guiTestCaseName()+"  Add Tabs icon Disabled", " Default Add Tabs icon should be in disable");
			 demo.BydefaultisEnabled(prescription.Tabs, "AddTabs", test,driver); 
		 }
		 @Test(priority =20)
		public void NewsiteandPhase() throws IOException
		 {
			 test = extent.createTest(guiTestCaseName()+"  New site,Phase was Displayed and enabled", " New site,Phase should be in Enable");
			 demo.isdisplayed( prescription.NewSite, "New Site,Phase", test,driver);
			 demo.isEnabled( prescription.NewSite, "New Site,Phase", test,driver);
		 }
		 
		 @Test(priority =21)
			public void Exportbutton() throws IOException
			 {
				 test = extent.createTest(guiTestCaseName()+"Export button enabled", " Export button should be in enabled");
				 demo.Textcomparsion( prescription.Export, "EXPORT", test,driver);
				 demo.isEnabled( prescription.Export, "EXPORT", test,driver);
			 }
		 
		 @Test(priority =22)
			public void SaveButton() throws IOException
			 {
				 test = extent.createTest(guiTestCaseName()+"Save button enabled", " Save button should be in enabled");
				 demo.Textcomparsion( prescription.Save, "SAVE", test,driver);
				 demo.isEnabled( prescription.Save, "SAVE", test,driver);
			 }
		@Test(priority =25)
		public void ToverifyParameterslabel() throws IOException {
			 test = extent.createTest("==========Treatment Parameters=========");
			test = extent.createTest(guiTestCaseName() +"  To verify the Treatment Parameters label", "  Treatment Parametersshould be present"); 
			demo.Textcomparsion( prescription.TreatmentParameters, "TREATMENT PARAMETERS", test,driver); 
		}
	
	@Test(priority = 26)
	public void ToverifyTsitelabel() throws IOException, InterruptedException {
		test = extent.createTest(guiTestCaseName()+" To verify the Site label", " Site label should be present"); 
		demo.Textcomparsion(prescription.site, "Site", test,driver);
		Thread.sleep(2000);
	}
	
	@Test(priority = 27)
	public void ToverifythePrescriptionTemplatelabel() throws IOException, InterruptedException {
		test = extent.createTest(guiTestCaseName()+" To verify the Prescription Template label", " Prescription Template label should be present"); 
		Thread.sleep(2000);
		demo.isdisplayed(prescription.prescriptiontemplate, "Prescription Template", test,driver);	
	}
	
	@Test(priority =28)
	public void ToverifyChemophaselabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+"  To verify the Phase label", " Phase label should be present"); 
		demo.Textcomparsion(prescription.phase, "Phase", test,driver);
	}
	@Test(priority = 29)
	public void Toverifytargetprescriptiondoselabel() throws IOException , IOException {
		test = extent.createTest(guiTestCaseName()+" To verify the Target Prescription Dose (cGy) label", " Target Prescription Dose (cGy) label should be present"); 
		demo.Textcomparsion(prescription.targetdose, "Target Prescription Dose (cGy)", test,driver);	
	}
	
	@Test(priority = 30)
	public void ToverifyDoseConstraints() throws IOException, IOException {
	test = extent.createTest(guiTestCaseName()+"  To verify the Dose Coverage Constraints label", " Dose Coverage Constraints label should be present"); 
		demo.Textcomparsion(prescription.DoseConstraints, "Dose Coverage Constraints", test,driver); 
	}

@Test(priority = 31)
	public void ToverifyMimimumdoselabel() throws IOException, IOException {
	test = extent.createTest(guiTestCaseName()+"  To verify the Minimum Dose (cGy) label", " Minimum Dose (cGy) label should be present"); 
		demo.Textcomparsion(prescription.mindose, "Minimum Dose (cGy)", test,driver); 
	}
@Test(priority = 32)
	public void ToverifyMaximumdoselabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" To verify the Maximum Dose (cGy) label", " Maximum Dose (cGy) label should be present"); 
		demo.Textcomparsion(prescription.maxdose, "Maximum Dose (cGy)", test,driver);
	}
@Test(priority = 33)
	public void Toverifynumberoffractionlabel() throws IOException, InterruptedException {
	test = extent.createTest(guiTestCaseName()+"  To verify the Number Of Fractions label", " Number Of Fractions label should be present"); 
	demo.Textcomparsion(prescription.nofraction, "Number Of Fractions", test,driver); 
	Thread.sleep(1000);
	}

@Test(priority = 34)
public void PlanIntent() throws IOException, InterruptedException {
test = extent.createTest(guiTestCaseName()+"  To verify the Plan Intent label", " Plan Intent label should be present"); 
demo.isdisplayed(prescription.PlanIntent, "Plan Intent", test,driver); 
prescription.PlanIntent.click();
Thread.sleep(1000);
}

@Test(priority = 35)
public void Curative() throws IOException, InterruptedException {
test = extent.createTest(guiTestCaseName()+"  To verify the Curative label", " Curative label should be present"); 
demo.Textcomparsion(prescription.Curative, "CURATIVE", test,driver); 

}

@Test(priority = 36)
public void Machine_Qa() throws IOException, InterruptedException {
test = extent.createTest(guiTestCaseName()+"  To verify the MACHINE_QA label", " MACHINE_QA label should be present"); 
demo.Textcomparsion(prescription.Machine_Qa, "MACHINE_QA", test,driver); 

}

@Test(priority = 37)
public void Palliative() throws IOException, InterruptedException {
test = extent.createTest(guiTestCaseName()+"  To verify the Palliative label", " Palliative label should be present"); 
demo.Textcomparsion(prescription.Palliative, "PALLIATIVE", test,driver); 

}

@Test(priority = 38)
public void Prophylactic() throws IOException, InterruptedException {
test = extent.createTest(guiTestCaseName()+"  To verify the Prophylactic label", " Prophylactic label should be present"); 
demo.Textcomparsion(prescription.Prophylactic, "PROPHYLACTIC", test,driver); 

}

@Test(priority = 39)
public void Research() throws IOException, InterruptedException {
test = extent.createTest(guiTestCaseName()+"  To verify the Research label", " Research label should be present"); 
demo.Textcomparsion(prescription.Research, "RESEARCH", test,driver); 

}

@Test(priority = 40)
public void Service() throws IOException, InterruptedException {
test = extent.createTest(guiTestCaseName()+"  To verify the Service label", " Service label should be present"); 
demo.Textcomparsion(prescription.Service, "SERVICE", test,driver); 

}

@Test(priority = 41)
public void Verification() throws IOException, InterruptedException {
test = extent.createTest(guiTestCaseName()+"  To verify the Verification label", " Verification label should be present"); 
demo.Textcomparsion(prescription.Verification, "VERIFICATION", test,driver); 
prescription.PlanIntent.click();

}


WebElement PrescribedMachineG1;
private WebElement OARADD;
private WebElement oaradd;
@Test(priority = 42)
	public void Toverifyprescribedmachinelabel() throws IOException, InterruptedException {
	test = extent.createTest(guiTestCaseName()+"  To verify the Prescribed Machine label", " Prescribed Machine label should be present"); 
		Thread.sleep(3000);
		demo.isdisplayed(prescription.PrescribedMachineG1, "Prescribed Machine", test,driver);
		Thread.sleep(2000);
	}
@Test(priority = 43)
	public void Toverifybeamtypelabel() throws IOException, InterruptedException {
	test = extent.createTest(guiTestCaseName()+"  To verify the Beam Type label", " Beam Type label should be present"); 
	Thread.sleep(2000);
		demo.isdisplayed(prescription.beamtype, "Beam Type", test,driver);
		Thread.sleep(2000);
	}
@Test(priority =44)
	public void Toverifyradiationtypelabel() throws IOException ,InterruptedException {
	test = extent.createTest(guiTestCaseName()+"  To verify the Radiation Type label", " Radiation Type label should be present");
	Thread.sleep(2000);
		demo.isdisplayed(prescription.radtype, "Radiation Type", test,driver);
		Thread.sleep(2000);
	}
@Test(priority =45)
	public void Toverifyenergylabel() throws IOException , InterruptedException {
	test = extent.createTest(guiTestCaseName()+"  To verify the Energy (MeV) label", " Energy (MeV) label should be present");
	Thread.sleep(2000);
		demo.isdisplayed(prescription.energy, "Energy (MeV)", test,driver);
		Thread.sleep(2000);
	}
@Test(priority =50)
	public void Toverifysetuptechniquelabel() throws IOException , InterruptedException {
	test = extent.createTest(guiTestCaseName()+" To verify the Set up technique label", " Set up technique label should be present");
	Thread.sleep(2000);
		demo.isdisplayed(prescription.Setuptechnique, "Set up technique", test,driver);
		prescription.Setuptechnique.click();
	}

@Test(priority =51)
public void Bridge() throws IOException {
test = extent.createTest(guiTestCaseName()+"  To verify the BREAST_BRIDGE label", "BREAST_BRIDGE label should be present"); 
	demo.Textcomparsion(prescription.Bridge, "BREAST_BRIDGE", test,driver);
}


@Test(priority =52)
public void FIXED_SSD() throws IOException {
test = extent.createTest(guiTestCaseName()+"  To verify the FIXED_SSD label", "FIXED_SSD label should be present"); 
	demo.Textcomparsion(prescription.Fixed, "FIXED_SSD", test,driver);
}

@Test(priority =53)
public void ISOCENTRIC() throws IOException {
test = extent.createTest(guiTestCaseName()+"  To verify the ISOCENTRIC label", "ISOCENTRIC label should be present"); 
	demo.Textcomparsion(prescription.Isocentric, "ISOCENTRIC", test,driver);
}

@Test(priority =54)
public void SKIN_APPOSITION() throws IOException {
test = extent.createTest(guiTestCaseName()+"  To verify the SKIN_APPOSITION label", "SKIN_APPOSITION label should be present"); 
	demo.Textcomparsion(prescription.Skin, "SKIN_APPOSITION", test,driver);
}
@Test(priority =55)
public void TBI() throws IOException {
test = extent.createTest(guiTestCaseName()+"  To verify the TBI label", "TBI label should be present"); 
	demo.Textcomparsion(prescription.Tbi, "TBI", test,driver);
	prescription.Setuptechnique.click();
}

@Test(priority =60)
	public void ToverifyCtschedulelabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+"  To verify the CT Schedule label", " CT Schedule label should be present"); 
		demo.Textcomparsion(prescription.ctschedule, "CT Schedule", test,driver);
	}
@Test(priority =61)
	public void Toverifygatinglabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+"  To verify the Gating label", " Gating label should be present"); 
		demo.Textcomparsion(prescription.gating, "Gating", test,driver);
	}
@Test(priority =62)
	public void Toverifygatingyeslabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" To verify the Yes label for gating", " Yes label should be present"); 
		demo.Textcomparsion(prescription.yes, "Yes", test,driver);
	}
@Test(priority =63)
	public void Toverifygatingnolabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+"  To verify the No label for gating", " No label should be present"); 
		demo.Textcomparsion(prescription.no, "No", test,driver);
	}
@Test(priority =64)
	public void Toverifyboluslabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+"  To verify the Bolus label", " Bolus label should be present"); 
		demo.Textcomparsion(prescription.bolus, "Bolus", test,driver);
	}
@Test(priority =64)
	public void Toverifybolusyeslabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+"  To verify the Yes label for bolus", " Yes label should be present"); 
		demo.Textcomparsion(prescription.bolusyes, "Yes", test,driver);
	}
@Test(priority =65)
	public void Toverifybolusnolabel() throws IOException {
	test = extent.createTest(guiTestCaseName()  +" To verify the No label for Bolus", " No label should be present"); 
		demo.Textcomparsion(prescription.bolusno, "No", test,driver);
	}
@Test(priority =31)
	public void Toverifyigrtlabel() throws IOException {
	test = extent.createTest(guiTestCaseName() +"  To verify the IGRT Cycle label", "IGRT Cycle label should be present"); 
		
		demo.Textcomparsion(prescription.igrt, "IGRT Cycle", test,driver);
		
	}
@Test(priority =66)
	public void Toverifyreviewcyclelabel() throws IOException {
	test = extent.createTest(guiTestCaseName() +"  To verify the Review Cycle label", " Review Cycle label should be present"); 
		demo.Textcomparsion(prescription.review, "Review Cycle", test,driver);
	}
@Test(priority =67)
	public void ToverifyCbccyclelabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+"  To verify the CBC Cycle label", " CBC Cycle label should be present"); 
		demo.Textcomparsion(prescription.cbc, "CBC Cycle", test,driver);
	}
@Test(priority =68)
	public void Toverifyphysicianlabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+"  To verify the Physician label", " Physician label should be present"); 
		demo.Textcomparsion(prescription.physician, "Physician", test,driver);
	}
@Test(priority =69)
	public void ToverifyCTIDlabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+"  To verify the CT ID label", " CT ID label should be present"); 
		demo.Textcomparsion(prescription.ctid, "CT ID", test,driver);
	}
@Test(priority =70)
	public void ToverifyMRIIDlabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+"  To verify the MRI ID label", " MRI ID label should be present"); 
		demo.Textcomparsion(prescription.mrid, "MRI ID", test,driver);
	}
@Test(priority =70)
	public void ToverifyPETCTIDlabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" To verify the PET-CT ID label", "PET-CT ID label should be present"); 
		demo.Textcomparsion(prescription.petid, "PET-CT ID", test,driver);
	}

@Test(priority =71)
	public void ToverifytitleOarconstarintslabel() throws IOException {
	test = extent.createTest("====================OAR CONSTAINTS==========");
	test = extent.createTest(guiTestCaseName()+"  To verify the OAR CONSTRAINTS label", " OAR CONSTRAINTS label should be present"); 
    demo.Textcomparsion(prescription.oar, "OAR CONSTRAINTS", test,driver);
	}
@Test(priority =72)
	public void ToverifyOARlabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+"  To verify the OAR label", " OAR label should be present"); 
		demo.Textcomparsion(prescription. oar1, "OAR", test,driver);
	}
@Test(priority =73)
	public void ToverifyOARmindoselabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+"  To verify the OAR Min label", " OAR Min label should be present"); 
		demo.Textcomparsion(prescription. oarmimndose, "Minimum Dose (cGy)", test,driver);
	}
@Test(priority =74)
	public void ToverifyOARmaxdosedoselabel() throws IOException {
	test = extent.createTest(guiTestCaseName() +"  To verify the Maximum Dose (cGy) label", " Maximum Dose (cGy) label should be present"); 
		demo.Textcomparsion( prescription.oarmaxdose, "Maximum Dose (cGy)", test,driver);
	}
@Test(priority =75)
	public void ToverifyOARmeandosedoselabel() throws IOException {
	test = extent.createTest(guiTestCaseName() +"  To verify the Mean Dose (cGy) label", " Mean Dose (cGy) label should be present"); 
		demo.Textcomparsion(prescription. oarmeandose, "Mean Dose (cGy)", test,driver);
	}
@Test(priority =76)
	public void ToverifyOARdescriptionlabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+"  To verify the Description label", " Description label should be present"); 
		demo.Textcomparsion(prescription. description, "Description", test,driver);
	}

 @Test(priority =77)
	public void ToverifyOARAddlabel() throws IOException, InterruptedException {
	test = extent.createTest(guiTestCaseName() +"  To verify the Add Field label", " Add Field label should be present"); 
	demo.isEnabled(prescription.OARAdd, "Add feild", test,driver);	
	Actions act=new Actions(driver);
	act.moveToElement(prescription.OARAdd).click().perform();
	}
@Test(priority =78)
	public void ToverifyOARnamelabel() throws IOException, InterruptedException {
	test = extent.createTest(guiTestCaseName()+" To verify the OAR Name label", " OAR Name label should be present");
		demo.isdisplayed(prescription.OARName, "OAR Name", test,driver);
	}
@Test(priority =79)
	public void ToverifyOARmintxtdoselabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+"  To verify the Minimum Dose (cGy) label", " Minimum Dose (cGy) label should be present"); 
	demo.Textcomparsion( prescription.oarmimndose1, "Minimum Dose (cGy)", test,driver);
	}
@Test(priority =80)
	public void ToverifyOARmaxdoselabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" To verify the Maximum Dose (cGy) label", " Maximum Dose (cGy) label should be present"); 
		demo.Textcomparsion( prescription.oarmaxdose1, "Maximum Dose (cGy)", test,driver);
	}
@Test(priority =81)
	public void ToverifyOARmeandoselabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+"  To verify the Mean Dose (cGy) label", " Mean Dose (cGy) label should be present"); 
		demo.Textcomparsion( prescription.oarmeandose1, "Mean Dose (cGy)", test,driver);
	}
@Test(priority =82)
	public void ToverifyOARdescriptiontxtlabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" To verify the Description label", " Description label should be present"); 
		demo.Textcomparsion( prescription.des, "Description", test,driver);
	}
@Test(priority =83)
	public void ToverifyOARinsertlabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" To verify the INSERT label", " INSERT label should be present"); 
		demo.Textcomparsion( prescription.insert, "INSERT", test,driver);
	}
@Test(priority =84)
	public void ToverifyOARcloselabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+"  To verify the CLOSE label", " CLOSE label should be present"); 
		demo.Textcomparsion( prescription.close, "CLOSE", test,driver);
	}

@Test(priority = 85)
public void Toverifypatientimmobilizationlabel() throws IOException {
	test = extent.createTest(guiTestCaseName() + " :  To verify the SAVE button label",
			" SAVE button label should be present");
	demo.Textcomparsion(prescription.IMDdevice, "PATIENT IMMOBILIZATION SETUP", test,driver);
}

@Test(priority = 86)
public void ToverifyPrescribedDeviceTitleButtonlabel() throws IOException,InterruptedException {
//Template.ButtonNames.get(6).click();
	action.moveToElement(prescription.IMDdevice).click().perform();
	Thread.sleep(7000);
	test = extent.createTest(guiTestCaseName() + " :  To verify the PRESCRIBED DEVICES label",
			"PRESCRIBED DEVICES label should be present");
	WebElement PrescribedDeviceTitleButton = driver.findElement(By.name("PRESCRIBED DEVICES"));
	demo.Textcomparsion(PrescribedDeviceTitleButton, "PRESCRIBED DEVICES", test,driver);
}

@Test(priority = 90)
public void ToverifyBellyBoardlabel() throws IOException {
	action.moveToElement(prescription.IMDdevice).doubleClick().perform();
	test = extent.createTest(guiTestCaseName() + " :  To verify the Belly Board label",
			"Belly Board label should be present");
	WebElement Belly_Board = driver.findElement(By.name("Belly Board"));
	demo.Textcomparsion(Belly_Board, "Belly Board", test,driver);

}

@Test(priority = 91)
public void ToverifyBreastBoardlabel() throws IOException {
	test = extent.createTest(guiTestCaseName() + " :  To verify the Breast Board label",
			"Breast Board label should be present");
	WebElement Breast_Board = driver.findElement(By.name("Breast Board"));
	demo.Textcomparsion(Breast_Board, "Breast Board", test,driver);

}

@Test(priority = 92)
public void ToverifyHeadandShoulderBasePlatelabel() throws IOException {
	test = extent.createTest(guiTestCaseName() + "  :  To verify the Head and Shoulder Base Plate label",
			"Head and Shoulder Base Plate label should be present");
	WebElement HandandshoulderBaseplate = driver.findElement(By.name("Head and Shoulder Base plate"));
	demo.Textcomparsion(HandandshoulderBaseplate, "Head and Shoulder Base plate", test,driver);

}

@Test(priority = 93)
public void ToverifyKneefixFeetfixsystemlabel() throws IOException {
	test = extent.createTest(guiTestCaseName() + " :  To verify the Knee fix Feet fix system label",
			"Knee fix Feet fix system label should be present");
	WebElement KneefixFeetfixsystem = driver.findElement(By.name("Knee fix Feet fix system"));
	demo.Textcomparsion(KneefixFeetfixsystem, "Knee fix Feet fix system", test,driver);
	act.sendKeys(Keys.PAGE_DOWN).perform();
}



@Test(priority = 95)
public void ToverifyPelvicBaseplatelabel() throws IOException {
	test = extent.createTest(guiTestCaseName() + " :  To verify the Pelvic Base plate label",
			"Pelvic Base plate label should be present");
	WebElement PelvicBaseplate = driver.findElement(By.name("Pelvic Base plate"));
	demo.Textcomparsion(PelvicBaseplate, "Pelvic Base plate", test,driver);
}

@Test(priority = 96)
public void ToverifySigmaLiteBoardlabel() throws IOException {
	test = extent.createTest(guiTestCaseName() + " :  To verify the Sigma Lite Board label",
			"Sigma Lite Board label should be present");
	WebElement SigmaLiteBoard = driver.findElement(By.name("Sigma Lite Board"));
	demo.Textcomparsion(SigmaLiteBoard, "Sigma Lite Board", test,driver);
	act.sendKeys(Keys.PAGE_DOWN).perform();
}

@Test(priority = 96)
public void ToverifyWingBoardlabel() throws IOException {
	test = extent.createTest(guiTestCaseName() + " :  To verify the Wing Board label",
			"Wing Board label should be present");
	WebElement WingBoard = driver.findElement(By.name("Wing Board"));
	demo.Textcomparsion(WingBoard, "Wing Board", test,driver);

}
@Test(priority = 97)
public void ToverifyKneefixBaseplatelabel() throws IOException {
	test = extent.createTest(guiTestCaseName() + " :  To verify the Kneefix Base plate label",
			"Kneefix Base plate label should be present");
	WebElement KneefixBaseplate = driver.findElement(By.name("Knee fix Base plate"));
	demo.Textcomparsion(KneefixBaseplate, "Knee fix Base plate", test,driver);
}
@Test(priority = 98)
public void ToverifyKneefix() throws IOException {
	test = extent.createTest(guiTestCaseName() + " :  To verify the KneeFix label",
			"Kneefix Base plate label should be present");
	WebElement Kneefix = driver.findElement(By.name("Knee fix"));
	demo.Textcomparsion(Kneefix, "Knee fix", test,driver);
}

@Test(priority = 99)
public void ToverifyFeetfix() throws IOException {
	test = extent.createTest(guiTestCaseName() + " :  To verify the FeetFix label",
			"FeetFix label should be present");
	WebElement Feetfix = driver.findElement(By.name("Feet fix"));
	demo.Textcomparsion(Feetfix, "Feet fix", test,driver);
}

	
	 @AfterSuite
	    public void tearDown() {
	        extent.flush();
	    }
// @Test(priority =77) and 78 need to check 
	
	
}
