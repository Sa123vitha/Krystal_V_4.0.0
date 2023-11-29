package com.krystal.project;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.SkipException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.windows.WindowsDriver;


public class TemplatesTest extends ReferencefileChemotheraphy{

	private TemplatePOM Temp;
	private Actions act;

	@BeforeClass
	public void setUp1()  throws InterruptedException, IOException {
	DesiredCapabilities appCapabilities = new DesiredCapabilities();
	appCapabilities.setCapability("app", "C:\\Program Files\\Panacea Medical Technologies\\Krystal\\Krystal.exe");
	driver = new WindowsDriver<WebElement>(new URL("http://127.0.0.1:4723"), appCapabilities);
	ReferenceSigin Sign=new ReferenceSigin();
	Sign.Login(driver);
	Sign.Templates(driver);
	Temp=new TemplatePOM(driver);
	act=new Actions(driver);
	}
	
	
	@Test(priority = 9)
	public void ToverifyTitleofthescreen() throws InterruptedException, IOException {
		test = extent.createTest(guiTestCaseName() + " :To verify the Title of the screen"," Templates label should be present");
		demo.Textcomparsion(Temp.TemplatesTitle, "Templates", test,driver);
	}
	@Test(priority = 10)
	public void ToverifyTreatmentReviewlabel() throws IOException {
		test = extent.createTest(guiTestCaseName() + ":  To verify the TREATMENT PARAMETERS label",
				" TREATMENT REVIEW label should be present");
		demo.Textcomparsion(Temp.ButtonNames.get(7), "TREATMENT PARAMETERS", test,driver);
	}

	@Test(priority = 11)
	public void ToverifyTsitelabel() throws IOException,InterruptedException {
		test = extent.createTest(guiTestCaseName() + " :  To verify the Site label"," Site label should be present");
		act.moveToElement(Temp.Site).build().perform();
		act.moveByOffset(-90, -20).build().perform();
		Thread.sleep(1000);
		WebElement SiteG = driver.findElement(By.name("Site"));
		demo.Textcomparsion(SiteG, "Site", test,driver);
	}

	@Test(priority = 12)
	public void ToverifythePrescriptionTemplateNamelabel() throws IOException,InterruptedException {
		test = extent.createTest(guiTestCaseName() + " :  To verify the Template Name label",
				" Template Name label should be present");
		demo.Textcomparsion(Temp.LabelNames.get(0), "Template Name", test,driver);
	}

	@Test(priority = 13)
	public void Toverifytargetprescriptiondoselabel() throws IOException {
		test = extent.createTest(guiTestCaseName() + ":  To verify the Target Prescription Dose (cGy) label",
				" Target Prescription Dose (cGy) label should be present");
		// demo.Textcomparsion(Temp.LabelNames.get(12), "Target
		// Prescription Dose (cGy)", test,driver);
		demo.Textcomparsion(Temp.LabelNames.get(2), "Target Prescription Dose (cGy)", test,driver);
	}

	@Test(priority = 15)
	public void ToverifyMimimumdoselabel() throws IOException {
		test = extent.createTest(guiTestCaseName() + "  :  To verify the Minimum Dose (cGy) label"," Minimum Dose (cGy) label should be present");
		demo.Textcomparsion(Temp.LabelNames.get(3), "Minimum Dose (cGy)", test,driver);
	}

	@Test(priority = 16)
	public void ToverifyMaximumdoselabel() throws IOException {
		test = extent.createTest(guiTestCaseName() + " :  To verify the Maximum Dose (cGy) label",
				" Maximum Dose (cGy) label should be present");
		demo.Textcomparsion(Temp.LabelNames.get(4), "Maximum Dose (cGy)", test,driver);
	}

	@Test(priority = 17)
	public void Toverifynumberoffractionlabel() throws IOException {
		test = extent.createTest(guiTestCaseName() + " :  To verify the Number Of Fractions label",
				" Number Of Fractions label should be present");
		demo.Textcomparsion(Temp.LabelNames.get(1), "Number of Fractions", test,driver);
	}

	@Test(priority = 18)
	public void Toverifyprescribedmachinelabel() throws IOException,InterruptedException {
		test = extent.createTest(guiTestCaseName() + " :  To verify the Prescribed Machine label",
				" Prescribed Machine label should be present");
		act.moveToElement(Temp.PrescribedMachine).build().perform();
		act.moveByOffset(-130, -20).build().perform();
		Thread.sleep(3000);
		WebElement TempPrescribedMachine1 = driver.findElement(By.name("Prescribed Machine"));
		demo.Textcomparsion(TempPrescribedMachine1, "Prescribed Machine", test,driver);
	}
	@Test(priority = 19)
	public void Toverifyradiationtypelabel() throws IOException,InterruptedException {
		test = extent.createTest(guiTestCaseName() + " :  To verify the Radiation Type label",
				" Radiation Type label should be present");
		act.moveToElement(Temp.RadiationType).build().perform();
		act.moveByOffset(-140, -20).build().perform();
		Thread.sleep(900);
		WebElement Radiation_Type = driver.findElement(By.name("Radiation Type"));
		demo.Textcomparsion(Radiation_Type, "Radiation Type", test,driver);
	}


	@Test(priority = 20)
	public void Toverifybeamtypelabel() throws IOException,InterruptedException {
		test = extent.createTest(guiTestCaseName() + " :  To verify the Beam Type label",
				" Beam Type label should be present");
		act.moveToElement(Temp.BeamType).build().perform();
		act.moveByOffset(-150, -20).build().perform();
		Thread.sleep(2000);
		WebElement Beam_Type = driver.findElement(By.name("Beam Type"));
		demo.Textcomparsion(Beam_Type, "Beam Type", test,driver);
	}
	@Test(priority = 21)
	public void Toverifysetuptechniquelabel() throws IOException,InterruptedException {
		test = extent.createTest(guiTestCaseName() + " :  To verify the Set up technique label",
				" Set up technique label should be present");
		act.moveToElement(Temp.Technique).build().perform();
		act.moveByOffset(-130, -20).build().perform();
		Thread.sleep(900);
		WebElement Setup_technique = driver.findElement(By.name("Set up Technique"));
		demo.Textcomparsion(Setup_technique, "Set up Technique", test,driver);
	}

	
	@Test(priority = 22)
	public void Toverifyenergylabel() throws IOException,InterruptedException {
		test = extent.createTest(guiTestCaseName() + " :  To verify the Energy (MeV) label",
				" Energy (MeV) label should be present");
		act.moveToElement(Temp.Energy).build().perform();
		act.moveByOffset(-150, -20).build().perform();
		Thread.sleep(900);
		WebElement Energy_MeV = driver.findElement(By.name("Energy (MV)"));
		demo.Textcomparsion(Energy_MeV, "Energy (MV)", test,driver);
	}
	
	@Test(priority = 23)
	public void Toverifyigrtlabel() throws IOException {
		test = extent.createTest(guiTestCaseName() + " :  To verify the IGRT Cycle label",
				"IGRT Cycle label should be present");
		if (Temp.PrescribedMachine.getText().contains("_C04")
				|| Temp.PrescribedMachine.getText().contains("_C05")) {
			demo.Textcomparsion(Temp.LabelNames.get(5), "IGRT Cycle", test,driver);
		} else
			new SkipException("element skipped");
	}

	@Test(priority = 24)
	public void Toverifyreviewcyclelabel() throws IOException {
		test = extent.createTest(guiTestCaseName() + " :  To verify the Review Cycle label",
				" Review Cycle label should be present");
		demo.Textcomparsion(Temp.LabelNames.get(6), "Review Cycle", test,driver);
	}

	@Test(priority = 25)
	public void ToverifyCbccyclelabel() throws IOException {
		test = extent.createTest(guiTestCaseName() + ":  To verify the CBC Cycle label",
				" CBC Cycle label should be present");
		demo.Textcomparsion(Temp.LabelNames.get(7), "CBC Cycle", test,driver);
	}

	@Test(priority = 26)
	public void Toverifygatinglabel() throws IOException {
		test = extent.createTest(guiTestCaseName() + "  :  To verify the Gating label",
				" Gating label should be present");
		demo.Textcomparsion(Temp.Gating, "Gating", test,driver);
	}

	@Test(priority = 27)
	public void Toverifygatingyeslabel() throws IOException {
		test = extent.createTest(guiTestCaseName() + ":  To verify the Yes label for gating",
				" Yes label should be present");
		demo.Textcomparsion(Temp.GatingYes, "Yes", test,driver);
	}

	@Test(priority = 28)
	public void Toverifygatingnolabel() throws IOException {
		test = extent.createTest(guiTestCaseName() + ":  To verify the No label for gating",
				" No label should be present");
		demo.Textcomparsion(Temp.GatingNo, "No", test,driver);
	}

	@Test(priority = 29)
	public void Toverifyboluslabel() throws IOException {
		test = extent.createTest(guiTestCaseName() + ":  To verify the Bolus label",
				" Bolus label should be present");
		demo.Textcomparsion(Temp.Bolus, "Bolus", test,driver);
	}

	@Test(priority = 30)
	public void Toverifybolusyeslabel() throws IOException {
		test = extent.createTest(guiTestCaseName() + " :  To verify the Yes label for bolus",
				" Yes label should be present");
		demo.Textcomparsion(Temp.BolusYes, "Yes", test,driver);
	}

	@Test(priority = 31)
	public void Toverifybolusnolabel() throws IOException {
		test = extent.createTest(guiTestCaseName() + " :  To verify the No label for Bolus",
				" No label should be present");
		demo.Textcomparsion(Temp.BolusNo, "No", test,driver);
	}
	
	


	@Test(priority = 39)
	public void ToverifytitleOarconstarintslabel() throws IOException {
		test = extent.createTest(guiTestCaseName() + " :  To verify the OAR CONSTRAINTS label",
				" OAR CONSTRAINTS label should be present");
		demo.Textcomparsion(Temp.ButtonNames.get(9), "OAR CONSTRAINTS", test,driver);
	}

	@Test(priority = 40)
	public void ToverifyOARlabel() throws IOException {
		test = extent.createTest(guiTestCaseName() + ":  To verify the OAR label",
				" OAR label should be present");
		demo.Textcomparsion(Temp.OAR, "OAR", test,driver);
	}

	@Test(priority = 41)
	public void ToverifyOARmindoselabel() throws IOException {
		test = extent.createTest(guiTestCaseName() + " :  To verify the Min Dose (cGy) label",
				" Min Dose (cGy) label should be present");
		demo.Textcomparsion(Temp.MinDose, "Min Dose (cGy)", test,driver);
	}

	@Test(priority = 42)
	public void ToverifyOARmaxdosedoselabel() throws IOException {
		test = extent.createTest(guiTestCaseName() + " :  To verify the Max Dose (cGy) label",
				" Max Dose (cGy) label should be present");
		demo.Textcomparsion(Temp.MaxDose, "Max Dose (cGy)", test,driver);
	}

	@Test(priority = 43)
	public void ToverifyOARmeandosedoselabel() throws IOException {
		test = extent.createTest(guiTestCaseName() + " :  To verify the Mean Dose (cGy) label",
				" Mean Dose (cGy) label should be present");
		demo.Textcomparsion(Temp.MeanDose, "Mean Dose (cGy)", test,driver);
	}

	@Test(priority = 44)
	public void ToverifyOARdescriptionlabel() throws IOException {
		test = extent.createTest(guiTestCaseName() + " :  To verify the Description label",
				" Description label should be present");
		demo.Textcomparsion(Temp.Description, "Description", test,driver);
	}

	@Test(priority = 45)
	public void ToverifyOARnamelabel() throws IOException,InterruptedException {
		Temp.OARAdd.click();
		test = extent.createTest(guiTestCaseName() + ":  To verify the OAR Name label",
				" OAR Name label should be present");
		demo.Textcomparsion(Temp.LabelNames.get(8), "OAR", test,driver);
	}

	@Test(priority = 46)
	public void ToverifyOARmintxtdoselabel() throws IOException {
		test = extent.createTest(guiTestCaseName() + " :  To verify the Minimum Dose (cGy) label",
				" Minimum Dose (cGy) label should be present");
		demo.Textcomparsion(Temp.LabelNames.get(9), "Min Dose (cGy)", test,driver);
	}

	@Test(priority = 47)
	public void ToverifyOARmaxdoselabel() throws IOException {
		test = extent.createTest(guiTestCaseName() + ":  To verify the Maximum Dose (cGy) label",
				" Maximum Dose (cGy) label should be present");
		demo.Textcomparsion(Temp.LabelNames.get(10), "Max Dose (cGy)", test,driver);
	}

	@Test(priority = 48)
	public void ToverifyOARmeandoselabel() throws IOException {
		test = extent.createTest(guiTestCaseName() + " :  To verify the Mean Dose (cGy) label",
				" Mean Dose (cGy) label should be present");
		demo.Textcomparsion(Temp.LabelNames.get(11), "Mean Dose (cGy)", test,driver);
	}

	@Test(priority = 49)
	public void ToverifyOARdescriptiontxtlabel() throws IOException {
		test = extent.createTest(guiTestCaseName() + " :  To verify the Description label",
				" Description label should be present");
		demo.Textcomparsion(Temp.LabelNames.get(12), "Description", test,driver);

	}

	@Test(priority = 50)
	public void ToverifyOARinsertlabel() throws IOException {
		test = extent.createTest(guiTestCaseName() + "  :  To verify the INSERT label",
				" INSERT label should be present");
		demo.Textcomparsion(Temp.OARInsertButton, "INSERT", test,driver);
	}

	@Test(priority = 51)
	public void ToverifyOARcloselabel() throws IOException {
		test = extent.createTest(guiTestCaseName() + " :  To verify the CLOSE label",
				" CLOSE label should be present");
		demo.Textcomparsion(Temp.OARCloseButton, "CLOSE", test,driver);
		Temp.OARCloseButton.click();
	}

	@Test(priority = 52)
	public void Toverifysavebuttonlabel() throws IOException {
		test = extent.createTest(guiTestCaseName() + " :  To verify the SAVE button label",
				" SAVE button label should be present");
		demo.Textcomparsion(Temp.Save, "SAVE", test,driver);

	}

	@Test(priority = 53)
	public void Toverifyavailabletemplatelabellabel() throws IOException {
		test = extent.createTest(guiTestCaseName() + " :  To verify the AVAILABLE TEMPLATES label",
				" AVAILABLE TEMPLATES label should be present");
		demo.Textcomparsion(Temp.ButtonNames.get(4), "AVAILABLE TEMPLATES", test,driver);

	}

	@Test(priority = 53)
	public void ToverifyList() throws InterruptedException, IOException {
		test = extent.createTest(guiTestCaseName() + " :To verify the ListName TemplateName"," ListName should be present");
		demo.Textcomparsion(Temp.ATemplate_Name, "Template Name", test,driver);
	}

	@Test(priority = 54)
	public void Toverifysearchtemplatenamelabellabel() throws IOException {
		test = extent.createTest(guiTestCaseName() + ":  To verify the  Search Template Name label",
				" Search Template Name label should be present");
		demo.Textcomparsion(Temp.SearchTemplateName, "Search Template Name", test,driver);
	}

	@Test(priority = 55)
	public void ToverifyTemplateNameinsearchdropdownlabel() throws IOException {
		Temp.Searchmenu.click();
		test = extent.createTest(guiTestCaseName() + "  :  To verify the Template Name label",
				" Template Name label should be present");
		demo.Textcomparsion(Temp.Template_Name, "Template Name", test,driver);
	}

	@Test(priority = 56)
	public void ToverifyOARc1loselabel() throws IOException {
		test = extent.createTest(guiTestCaseName() + " :  To verify the Site Name label",
				" Site Name label should be present");
		demo.Textcomparsion(Temp.SiteName, "Site Name", test,driver);
		Temp.SiteName.click();
	}

	@Test(priority = 57)
	public void ToverifysearchSitenamelabellabel() throws IOException {
		test = extent.createTest(guiTestCaseName() + ":  To verify the  Search Site Name label",
				" Search Template Name label should be present");
		demo.Textcomparsion(Temp.SearchSiteName, "Search Site Name", test,driver);
	}

	@Test(priority = 58)
	public void Toverifypatientimmobilizationlabel() throws IOException {
		test = extent.createTest(guiTestCaseName() + " :  To verify the SAVE button label",
				" SAVE button label should be present");
		demo.Textcomparsion(Temp.ButtonNames.get(6), "PATIENT IMMOBILIZATION SETUP", test,driver);
	}

	@Test(priority = 59)
	public void ToverifyPrescribedDeviceTitleButtonlabel() throws IOException,InterruptedException {
//	Template.ButtonNames.get(6).click();
		Temp.PatientImmobilzationsetupbutton.click();
		test = extent.createTest(guiTestCaseName() + " :  To verify the PRESCRIBED DEVICES label",
				"PRESCRIBED DEVICES label should be present");
		WebElement PrescribedDeviceTitleButton = driver.findElement(By.name("PRESCRIBED DEVICES"));
		demo.Textcomparsion(PrescribedDeviceTitleButton, "PRESCRIBED DEVICES", test,driver);
	}

	@Test(priority = 60)
	public void ToverifyBellyBoardlabel() throws IOException {
		test = extent.createTest(guiTestCaseName() + " :  To verify the Belly Board label",
				"Belly Board label should be present");
		WebElement Belly_Board = driver.findElement(By.name("Belly Board"));
		demo.Textcomparsion(Belly_Board, "Belly Board", test,driver);

	}

	@Test(priority = 61)
	public void ToverifyBreastBoardlabel() throws IOException {
		test = extent.createTest(guiTestCaseName() + " :  To verify the Breast Board label",
				"Breast Board label should be present");
		WebElement Breast_Board = driver.findElement(By.name("Breast Board"));
		demo.Textcomparsion(Breast_Board, "Breast Board", test,driver);

	}

	@Test(priority = 62)
	public void ToverifyHeadandShoulderBasePlatelabel() throws IOException {
		test = extent.createTest(guiTestCaseName() + "  :  To verify the Head and Shoulder Base Plate label",
				"Head and Shoulder Base Plate label should be present");
		WebElement HandandshoulderBaseplate = driver.findElement(By.name("Head and Shoulder Base plate"));
		demo.Textcomparsion(HandandshoulderBaseplate, "Head and Shoulder Base plate", test,driver);

	}

	@Test(priority = 63)
	public void ToverifyKneefixFeetfixsystemlabel() throws IOException {
		test = extent.createTest(guiTestCaseName() + " :  To verify the Knee fix Feet fix system label",
				"Knee fix Feet fix system label should be present");
		WebElement KneefixFeetfixsystem = driver.findElement(By.name("Knee fix Feet fix system"));
		demo.Textcomparsion(KneefixFeetfixsystem, "Knee fix Feet fix system", test,driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
	}
	@Test(priority = 65)
	public void ToverifyPelvicBaseplatelabel() throws IOException {
		test = extent.createTest(guiTestCaseName() + " :  To verify the Pelvic Base plate label",
				"Pelvic Base plate label should be present");
		WebElement PelvicBaseplate = driver.findElement(By.name("Pelvic Base plate"));
		demo.Textcomparsion(PelvicBaseplate, "Pelvic Base plate", test,driver);

	}

	@Test(priority = 66)
	public void ToverifySigmaLiteBoardlabel() throws IOException {
		test = extent.createTest(guiTestCaseName() + " :  To verify the Sigma Lite Board label",
				"Sigma Lite Board label should be present");
		WebElement SigmaLiteBoard = driver.findElement(By.name("Sigma Lite Board"));
		demo.Textcomparsion(SigmaLiteBoard, "Sigma Lite Board", test,driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();

	}

	@Test(priority = 66)
	public void ToverifyWingBoardlabel() throws IOException {
		test = extent.createTest(guiTestCaseName() + " :  To verify the Wing Board label",
				"Wing Board label should be present");
		WebElement WingBoard = driver.findElement(By.name("Wing Board"));
		demo.Textcomparsion(WingBoard, "Wing Board", test,driver);

	}
	@Test(priority = 67)
	public void ToverifyKneefixBaseplatelabel() throws IOException {
		test = extent.createTest(guiTestCaseName() + " :  To verify the Kneefix Base plate label",
				"Kneefix Base plate label should be present");
		WebElement KneefixBaseplate = driver.findElement(By.name("Knee fix Base plate"));
		demo.Textcomparsion(KneefixBaseplate, "Knee fix Base plate", test,driver);
	}
	@Test(priority = 68)
	public void ToverifyKneefix() throws IOException {
		test = extent.createTest(guiTestCaseName() + " :  To verify the KneeFix label",
				"Kneefix Base plate label should be present");
		WebElement Kneefix = driver.findElement(By.name("Knee fix"));
		demo.Textcomparsion(Kneefix, "Knee fix", test,driver);
	}
	
	@Test(priority = 69)
	public void ToverifyFeetfix() throws IOException {
		test = extent.createTest(guiTestCaseName() + " :  To verify the FeetFix label",
				"FeetFix label should be present");
		WebElement Feetfix = driver.findElement(By.name("Feet fix"));
		demo.Textcomparsion(Feetfix, "Feet fix", test,driver);
	}

	@Test(priority = 70)
	public void ToverifyavailabletemplatelabelIMD() throws IOException {
		test = extent.createTest(guiTestCaseName() + " :  To verify the AVAILABLE TEMPLATES label in IMD devices",
				" AVAILABLE TEMPLATES label should be present");
		demo.Textcomparsion(Temp.ButtonNames.get(4), "AVAILABLE TEMPLATES", test,driver);

	}

	@Test(priority = 71)
	public void ToverifyListIMD() throws InterruptedException, IOException {
		test = extent.createTest(guiTestCaseName() + " :To verify the ListName TemplateName label in IMD devices"," ListName should be present");
		demo.Textcomparsion(Temp.ATemplate_Name, "Template Name", test,driver);
	}

	@Test(priority = 72)
	public void ToverifysearchtemplatenamelabelIMD() throws IOException, InterruptedException {
		Temp.Searchmenu.click();
		Temp.Template_Name.click();
		Thread.sleep(1000);
		test = extent.createTest(guiTestCaseName() + ":  To verify the  Search Template Name label in IMD devices",
				" Search Template Name label should be present");
		demo.Textcomparsion(Temp.SearchTemplateName, "Search Template Name", test,driver);
	}

	@Test(priority = 73)
	public void ToverifyTemplateNameinsearchdropdownIMD() throws IOException {
		Temp.Searchmenu.click();
		test = extent.createTest(guiTestCaseName() + "  :  To verify the Template Name label in IMD devices",
				" Template Name label should be present");
		demo.Textcomparsion(Temp.Template_Name, "Template Name", test,driver);
	}

	@Test(priority = 74)
	public void ToverifyOARc1loselabelIMD() throws IOException, InterruptedException {
		test = extent.createTest(guiTestCaseName() + " :  To verify the Site Name label in IMD devices",
				" Site Name label should be present");
		demo.Textcomparsion(Temp.SiteName, "Site Name", test,driver);
		Temp.SiteName.click();
		Thread.sleep(1000);
	}

	@Test(priority = 75)
	public void ToverifysearchSitenamelabelIMD() throws IOException {
		test = extent.createTest(guiTestCaseName() + ":  To verify the  Search Site Name label in IMD devices",
				" Search Template Name label should be present");
		demo.Textcomparsion(Temp.SearchSiteName, "Search Site Name", test,driver);
	}

	@Test(priority = 76)
	public void Toverifysavebutton1label() throws IOException {
		test = extent.createTest(guiTestCaseName() + " :  To verify the SAVE button label",
				" SAVE button label should be present");
		demo.Textcomparsion(Temp.Save, "SAVE", test,driver);
	}

	@AfterSuite
	public void tearDown() {
		extent.flush();
	}
	
	
	
	
}
