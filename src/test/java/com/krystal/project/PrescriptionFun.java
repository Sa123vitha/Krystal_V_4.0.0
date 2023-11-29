package com.krystal.project;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
public class PrescriptionFun extends ReferencefileChemotheraphy{
	private PrescriptionPOM prescription;
	private Actions act;
	private int i;
	private String SiteText1;
	private String PlanIntent;
	private String PrescribedMachine;
	private String PlanIntent1;
	private String BeamType1;
	private String RadationType1;
	private String Energy1;
	private String Setuptechnique1;
	private String Phy;
	private String Physician1;
	private String SiteText11;
	private String PlanIntent11;
	private String BeamType11;
	private String RadationType11;
	private String Energy11;
	private String Setuptechnique11;
	private String Physician11;
	String Mean;
	private String PlanIntent21;
	private String BeamType21;
	private String RadationType21;
	private String Energy21;
	private String Setuptechnique21;
	private String Physician21;
	private String SiteText2;
	private String PlanIntent2;
	private String BeamType2;
	private String RadationType2;
	private String Energy2;
	private String Setuptechnique2;
	private String Physician2;

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
	//@Test(priority =1)
		public void button() throws InterruptedException{
		List<WebElement> elements = driver.findElements(By.className("ComboBox"));
	    Actions actions = new Actions(driver);
	    for (WebElement element : elements) {
	        actions.moveToElement(element).perform();
	        System.out.println(element.getLocation());
	        System.out.println(element.getText());
	        System.out.println("********************************************");
	        Thread.sleep(1000);
	    }
		}
	
	
	@Test(priority = 0)
	public void TextfieldEnabled() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+" :   To verify  textfields, radio button, Dropdown and buttons enable or disable  after navigating prescription ",  " textfields, radio button, Dropdown and buttons enable after navigating prescription  ");
		demo.isEnabled(prescription.Menu, "Menu", test,driver);
		demo.isEnabled(prescription.Signout1, "logout", test,driver);
		demo.isEnabled(prescription.Theme, "Theme", test,driver);
		demo.isEnabled(prescription.Password, "Password", test,driver);
		demo.isEnabled(prescription.PatientList, "PatientList", test,driver);
		demo.BydefaultisEnabled(prescription.AddPatient, "AddPatient", test,driver);
		demo.isEnabled(prescription.DEMOGRAPHICS, "DEMOGRAPHICS", test,driver);
		demo.isEnabled(prescription.PRESCRIPTION, "PRESCRIPTION", test,driver);
		demo.BydefaultisEnabled(prescription.PLANAPPROVAL, "PLANAPPROVAL", test,driver);
		demo.BydefaultisEnabled(prescription.SCHEDULING, "SCHEDULING", test,driver);
		demo.isEnabled(prescription.VITALS, "VITALS", test,driver);
		demo.isEnabled(prescription.LABREPORTS, "LABREPORTS", test,driver);
		demo.BydefaultisEnabled(prescription.TREATMENTREVIEW, "TREATMENTREVIEW", test,driver);
		demo.isSelected(prescription.external, "External Beam Radiotherapy", test,driver);
		demo.BydefaultisSelected(prescription.Chemotherapy, "Chemotherapy",test,driver);
		demo.BydefaultisEnabled(prescription.Addtab, "Addtab", test,driver);
		demo.isEnabled(prescription.Site, "Site", test,driver);
		demo.isEnabled(prescription.Template, "Template", test,driver);
		demo.isEnabled(prescription.TargetPrescriptionDose, "TargetPrescriptionDose", test,driver);
		demo.isEnabled(prescription.MinimumDose, "MinimumDose", test,driver);
		demo.isEnabled(prescription.MaximumDose, "MaximumDose", test,driver);
		demo.isEnabled(prescription.NumberOfFractions, "NumberOfFractions", test,driver);
		demo.isEnabled(prescription.PlanIntent, "PlanIntent", test,driver);
		demo.isEnabled(prescription.PrescribedMachine, "PrescribedMachine", test,driver);
		demo.isEnabled(prescription.BeamType, "BeamType", test,driver);
		demo.isEnabled(prescription.RadiationType, "RadiationType", test,driver);
		demo.isEnabled(prescription.Energy, "Energy", test,driver);
		demo.isEnabled(prescription.Technique, "Technique", test,driver);
		demo.isSelected(prescription.GatingNo, "GatingNo", test,driver);
		demo.BydefaultisSelected(prescription.GatingYes, "GatingYes",test,driver );
		demo.BydefaultisSelected(prescription.BolusYes, "BolusYes", test,driver);
		demo.isSelected(prescription.BolusNo, "BolusNo", test,driver);
		demo.isEnabled(prescription.ReviewCycle, "ReviewCycle", test,driver);
		demo.isEnabled(prescription.CBCCycle, "CBCCycle", test,driver);
		demo.isEnabled(prescription.Physician, "Physician", test,driver);
		demo.isEnabled(prescription.CT_ID, "CT_ID", test,driver);
		demo.isEnabled(prescription.MRI, "MRI", test,driver);
		demo.isEnabled(prescription.PET_CT_ID, "PET_CT_ID", test,driver);
		demo.isEnabled(prescription.OARAdd, "OARAdd", test,driver);
		demo.isEnabled(prescription.PatientImmobilzationsetupbutton, "IMDbuton", test,driver);
		demo.isEnabled(prescription.Save, "Save", test,driver);
	
	}
	
	@Test(priority = 1)
	public void SaveButtonEnable() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName() + " : Save button ","Save button should be enable by default");

		demo.isEnabled(prescription.Save, "SAVE", test,driver);
	}
	

	@Test(priority = 2)
	public void defaultsaveclick() throws IOException
	{
		test = extent.createTest(funTestCaseName() + ":Empty data click on the Save ","Error messages should get display");
		if(prescription.Save.isEnabled())
		{
		prescription.Save.click();
		demo.isdisplayed(prescription.Siteerror, "Please Select any site",test, driver);
		demo.isdisplayed(prescription.Inputblank, "Input cannot be blank",test, driver);
		}
		else
		{
			test.fail("Save Button not enabled");
		}
		
	}

	@Test(priority = 3)
	public void Sitedropdowndefault() throws InterruptedException, IOException {
		test = extent.createTest("================Siteprescription=================");
		test = extent.createTest(funTestCaseName() + " : Default data in site dropdown   should be Displayed");
        demo.Textcomparsion(prescription.Site, "Select any site", test,driver);
	}
	
	
	
	@Test(priority = 4)
	public void Siteselction() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName() + " : Site Selection from the dropdown ", "Selected site should be displayed in the dropdown");
		String Sitedata=Roleselection(test,0);
	}
	
	@Test(priority = 5)
	public void TargetPrescriptionDosetextfieldwithoutdata()
			throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+ " :   To verify  TargetPrescriptionDose textfield if without entering text and clicked on prescription.Save button ",
				" Input cannot be blank warning message should display  ");
		prescription.Save.click();
		demo.Textcomparsion(prescription.Targetwarnmsg, "Input cannot be blank", test,driver);
		prescription.TargetPrescriptionDose.clear();
	}

	@Test(priority = 6)
	public void TargetPrescriptionDosetextfieldifenterednumber()
			throws InterruptedException, IOException {

		test = extent.createTest(funTestCaseName()+" :   To verify  TargetPrescriptionDose textfield if entered numbered is in the minimum range and clicked on prescription.Save button ",
				" entered number should accept  ");
		prescription.TargetPrescriptionDose.sendKeys("1");
		prescription.Save.click();
		demo.Textcomparsion(prescription.TargetPrescriptionDose, "1", test,driver);
		prescription.TargetPrescriptionDose.clear();
	}

	@Test(priority = 7)
	public void TargetPrescriptionDosetextfieldifenteredMaxrange()
			throws InterruptedException, IOException {

		test = extent.createTest(funTestCaseName()+" :   To verify  TargetPrescriptionDose textfield if entered numbered is in the maximum range and clicked on prescription.Save button ",
				" entered number should accept ");
		prescription.TargetPrescriptionDose.sendKeys("10000");
		prescription.Save.click();
		demo.Textcomparsion(prescription.TargetPrescriptionDose, "10000", test,driver);
		prescription.TargetPrescriptionDose.clear();
	}

	@Test(priority = 8)
	public void TargetPrescriptionDosetextfieldifenterednumberOutOfrange()
			throws InterruptedException, IOException {

		test = extent.createTest(funTestCaseName()+ " :   To verify  TargetPrescriptionDose textfield if entered numbered is out of range and clicked on prescription.Save button ",
				" Range:[1 to 10000] warning message should display  ");
		prescription.TargetPrescriptionDose.sendKeys("1000000");
		prescription.Save.click();
		demo.Textcomparsion(prescription.Targetwarnmsg, "Range:[1 to 10000]", test,driver);
		prescription.TargetPrescriptionDose.clear();
	}

	@Test(priority = 9)
	public void TargetPrescriptionDosetextfieldifenteredlessthanrange()
			throws InterruptedException, IOException {

		test = extent.createTest(funTestCaseName()+ " :   To verify  TargetPrescriptionDose textfield if entered less range and clicked on prescription.Save button ",
				" Range:[1 to 10000] warning message should display  ");
		prescription.TargetPrescriptionDose.sendKeys("0.9");
		prescription.Save.click();
		demo.Textcomparsion(prescription.Targetwarnmsg, "Range:[1 to 10000]", test,driver);
		prescription.TargetPrescriptionDose.clear();
	}

	@Test(priority = 10)
	public void TargetPrescriptionDosetextfieldifenterednumberempty()
			throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+ " :   To verify  TargetPrescriptionDose textfield if empty and clicked on prescription.Save button ",
				" Input cannot be blank warning message should display  ");
		prescription.TargetPrescriptionDose.sendKeys("");
		prescription.Save.click();
		demo.Textcomparsion(prescription.Targetwarnmsg, "Input cannot be blank", test,driver);
		prescription.TargetPrescriptionDose.clear();
	}

	@Test(priority = 11)
	public void ToverifyTargetPrescriptionDosetextfieldifenteredAlphabets()
			throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+ " :   To verify  TargetPrescriptionDose textfield if entered Alphabets and clicked on prescription.Save button",
				" Input cannot be blank warning message should display  ");
		prescription.TargetPrescriptionDose.sendKeys("Lungs_Left_Site");
		prescription.Save.click();
		demo.Textcomparsion(prescription.Targetwarnmsg, "Input cannot be blank", test,driver);
		prescription.TargetPrescriptionDose.clear();
	}

	@Test(priority = 12)
	public void TargetPrescriptionDosetextfieldifenteredSpecialCharacter()
			throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+ " :   To verify  TargetPrescriptionDose textfield if entered Specialchar and clicked on prescription.Save button",
				" Input cannot be blank warning message should display  ");
		
		prescription.TargetPrescriptionDose.sendKeys("@$@#%##%");
		prescription.Save.click();

		demo.Textcomparsion(prescription.Targetwarnmsg, "Input cannot be blank", test,driver);
		prescription.TargetPrescriptionDose.clear();
	}

	@Test(priority = 13)
	public void TargetPrescriptionDosetextfieldifenteredSpaces()
			throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+ " :   To verify  TargetPrescriptionDose textfield if enter space and clicked on prescription.Save button ",
				" Input cannot be blank warning message should display  ");
	
		prescription.TargetPrescriptionDose.sendKeys("   ");
		prescription.Save.click();

		demo.Textcomparsion(prescription.Targetwarnmsg, "Input cannot be blank", test,driver);
		prescription.MinimumDose.clear();
	}

	@Test(priority = 14)
	public void TargetPrescriptionDosetextfieldifenteredAplphanumeric()
			throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+ " :   To verify  TargetPrescriptionDose textfield if enter Alphabets with number and clicked on prescription.Save button ",
				" It should accept 34 only  ");
		prescription.TargetPrescriptionDose.sendKeys("Leg#345");
		prescription.Save.click();
		demo.Textcomparsion(prescription.TargetPrescriptionDose, "345", test,driver);
	}

	
	public void Referenceprescriptionlate1(WebElement element,String Text,ExtentTest test,WebDriver driver) throws IOException
	{
		element.click();
		element.sendKeys(Text);
		prescription.Save.click();
		demo.Textcomparsion(element, Text, test,driver);
	}
	
	
	@Test(priority = 15)
	public void minDosetextfieldifenteredminiumvalue()
			throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+  " :   To verify  MinDose textfield if entered numbered is in the minimum range clicked on prescription.Save button ",
				" entered number should accept  ");
		Referenceprescriptionlate1(prescription.MinimumDose,"1",test,driver);
		prescription.MinimumDose.clear();
	}

	@Test(priority = 16)
	public void minDosetextfieldifenteredAnynumber()
			throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()
				+ " :   To verify  MinDose textfield if entered numbered is in the number and clicked on prescription.Save button ",
				" entered number should accept ");
		Referenceprescriptionlate1(prescription.MinimumDose,"1000",test,driver);
		prescription.MinimumDose.clear();

	}

	@Test(priority = 17)
	public void minDosetextfieldifenteredMaxnumber()
			throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()
				+ " :   To verify  MinDose textfield if entered numbered is in the maximum range and clicked on prescription.Save button ",
				" entered number should accept ");
		Referenceprescriptionlate1(prescription.MinimumDose,"10000",test,driver);
		prescription.MinimumDose.clear();

	}

	@Test(priority = 18)
	public void minDosetextfieldifenterednumberOutOfrangemin()
			throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()
				+ " :   To verify  MinDose textfield if entered numbered is out of range min range and clicked on prescription.Save button ",
				" Range:[1 to 10000] warning message should display ");
		Referenceprescriptionlate1(prescription.MinimumDose,"0.3",test,driver);
		demo.Textcomparsion(prescription.MinDosewarnmsg, "Range:[1 to 10000]", test,driver);
		prescription.MinimumDose.clear();
	}

	@Test(priority = 19)
	public void minDosetextfieldifenterednumberOutOfrange()
			throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()
				+ " :   To verify  MinDose textfield if entered numbered is out of range and clicked on prescription.Save button ",
				" Range:[1 to 10000] warning message should display ");
		Referenceprescriptionlate1(prescription.MinimumDose,"1000000",test,driver);
		demo.Textcomparsion(prescription.MinDosewarnmsg, "Range:[1 to 10000]", test,driver);
		prescription.MinimumDose.clear();
	}

	@Test(priority = 20)
	public void minDosetextfieldifenterednumberisempty() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+ " :   To verify  MinDose textfield if empty and clicked on prescription.Save button ",
				" Input cannot be blank warning message should display  ");
		prescription.MinimumDose.sendKeys("  ");
		prescription.Save.click();
		demo.Textcomparsion(prescription.MinDosewarnmsg, "Input cannot be blank", test,driver);
		prescription.MinimumDose.clear();
	}

	@Test(priority = 21)
	public void minDosetextfieldifenterednumberisAlphabets() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+ " :   To verify  MinDose textfield if entered Alphabets and clicked on prescription.Save button ",
				" Input cannot be blank warning message should display  ");
		prescription.MinimumDose.sendKeys("Lungs_Left_Site");
		prescription.Save.click();
		demo.Textcomparsion(prescription.MinDosewarnmsg, "Input cannot be blank", test,driver);
		prescription.MinimumDose.clear();
	}

	@Test(priority = 22)
	public void ToverifyminDosetextfieldifenterednumberisSpecial()throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()
				+ " :   To verify  MinDose textfield if entered Special char and clicked on prescription.Save button",
				" Input cannot be blank warning message should display  ");
		prescription.MinimumDose.sendKeys("@$@#%##%");
		prescription.Save.click();
		demo.Textcomparsion(prescription.MinDosewarnmsg, "Input cannot be blank", test,driver);
		prescription.MinimumDose.clear();
	}

	@Test(priority = 23)
	public void minDosetextfieldifenterednumberisSpaces() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+ " :   To verify  MinDose textfield if enter space and clicked on prescription.Save button ",
				" Input cannot be blank warning message should display  ");
		prescription.MinimumDose.sendKeys("  ");
		prescription.Save.click();
		demo.Textcomparsion(prescription.MinDosewarnmsg, "Input cannot be blank", test,driver);
		prescription.MinimumDose.clear();
	}

	@Test(priority = 24)
	public void minDosetextfieldifenterednumberisAplphanumeric()
			throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()
				+ " :   To verify  MinDose textfield if enter Alphabets with number and clicked on prescription.Save button ",
				" It should accept 34 only  ");
		prescription.MinimumDose.sendKeys("hdgf34");
		prescription.Save.click();
		demo.isdisplayed(prescription.MinimumDose, "hdgf34", test, driver);
		prescription.MinimumDose.clear();
	}
	
	
	@Test(priority = 25)
	public void TmaxDosetextfieldifenteredminiumvalue()
			throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()
				+ " :   To verify  MaxDose textfield if entered numbered is in the minimum range and clicked on prescription.Save button ",
				" entered number should accept  ");
		Referenceprescriptionlate1(prescription.MaximumDose,"1",test,driver);
		prescription.MaximumDose.clear();
	}

	@Test(priority = 26)
	public void maxDosetextfieldifenteredAnynumberintherange()
			throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName()
						+ " :   To verify  MaxDose textfield if entered numbered  and clicked on Save button ",
				" entered number should accept  ");
		Referenceprescriptionlate1(prescription.MaximumDose,"1000",test,driver);
		prescription.MaximumDose.clear();

	}

	@Test(priority = 27)
	public void maxDosetextfieldifenteredMaxnumber()
			throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()
				+ " :   To verify  MaxDose textfield if entered numbered is in the maximum range and clicked on save button ",
				" entered number should accept ");

		Referenceprescriptionlate1(prescription.MaximumDose,"10000",test,driver);
		prescription.MaximumDose.clear();

	}

	@Test(priority = 28)
	public void maxDosetextfieldifenterednumberisOutOfrange()
			throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()
				+ " :   To verify  MaxDose textfield if entered numbered is out of range and clicked on save button ",
				" Range:[1 to 10000] warning message should display  ");
		Referenceprescriptionlate1(prescription.MaximumDose,"10000000",test,driver);
		demo.Textcomparsion(prescription.MaxDosewarnmsg, "Range:[1 to 10000]", test,driver);
		prescription.MaximumDose.clear();
	}

	@Test(priority = 29)
	public void maxDosetextfieldifenterednumberisempty() throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName() + " :   To verify  MaxDose textfield if empty and clicked on Save button ",
				" Input cannot be blank warning message should display  ");
		Referenceprescriptionlate1(prescription.MaximumDose,"",test,driver);
		demo.Textcomparsion(prescription.MaxDosewarnmsg, "Input cannot be blank", test,driver);
		prescription.MaximumDose.clear();
	}

	@Test(priority = 30)
	public void maxDosetextfieldifenterednumberisAlphabets() throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName()
						+ " :   To verify  MaxDose textfield if entered Alphabets and clicked on prescription.Save button",
				" Input cannot be blank warning message should display  ");
		prescription.MaximumDose.sendKeys("POIOWEOIUIYE");
		prescription.Save.click();

		demo.Textcomparsion(prescription.MaxDosewarnmsg, "Input cannot be blank", test,driver);
		prescription.MaximumDose.clear();
	}

	@Test(priority = 31)
	public void maxDosetextfieldifenterednumberisSpecialCharacters()
			throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName()
						+ " :   To verify  MaxDose textfield if entered Special char and clicked on Save button",
				" Input cannot be blank warning message should display  ");
		prescription.MaximumDose.sendKeys("@$@#%##%");
		prescription.Save.click();
		demo.Textcomparsion(prescription.MaxDosewarnmsg, "Input cannot be blank", test,driver);
		prescription.MaximumDose.clear();
	}

	@Test(priority = 32)
	public void maxDosetextfieldifenterednumberisSpaces() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+ " :   To verify  MaxDose textfield if enter space and clicked on Save button ",
				" Input cannot be blank warning message should display  ");
		
		prescription.MaximumDose.sendKeys("  ");
		prescription.Save.click();
		demo.Textcomparsion(prescription.MaxDosewarnmsg, "Input cannot be blank", test,driver);
		prescription.MaximumDose.clear();
	}

	@Test(priority = 33)
	public void maxDosetextfieldifenterednumberisAplphanumeric()
			throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()
				+ " :   To verify  MaxDose textfield if enter Alphabets with number and clicked on Save button ",
				" It should accept 34 only  ");
		prescription.MaximumDose.sendKeys("KKJHDD87283673");
		prescription.Save.click();
		demo.isdisplayed(prescription.MaximumDose, "KKJHDD87283673", test, driver);
		prescription.MaximumDose.clear();
	}

	@Test(priority = 34)
	public void maxDosetextfieldifenteredminlessthanmaxc() throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName() + " :   To verify if entered maximum dose(4) less then Minimum dose(34)   ",
				" Min cannot be equal to MaxMax cannot be equal to Min warning message should display ");
		prescription.MinimumDose.clear();
		Referenceprescriptionlate1(prescription.MaximumDose,"4",test,driver);
		Referenceprescriptionlate1(prescription.MinimumDose,"34",test,driver);
		demo.TextfieldwithWarnmsg(prescription.MinDosewarnmsg.getText() + prescription.MaxDosewarnmsg.getText(),
				"Min cannot be greater than MaxMax cannot be lesser than Min", test,driver);

	}

	@Test(priority = 35)
	public void maxDosetextfieldifenteredminandmaxdosevaluessame()
			throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName()
						+ " :   To verify if entered maximum dose(34) and Minimum dose(34) values same  ",
				" Min cannot be greater than MaxMax cannot be lesser than Min warning message should display ");
		prescription.MinimumDose.clear();
		prescription.MaximumDose.clear();
		Referenceprescriptionlate1(prescription.MaximumDose,"34",test,driver);
		Referenceprescriptionlate1(prescription.MinimumDose,"34",test,driver);

		demo.TextfieldwithWarnmsg(prescription.MinDosewarnmsg.getText() + prescription.MaxDosewarnmsg.getText(),
				"Min cannot be equal to MaxMax cannot be equal to Min", test,driver);
		prescription.MaximumDose.clear();

	}

	@Test(priority = 36)
	public void maxDosetextfieldifenteredminandmax()
			throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName() + " :   To verify  Min and Max textfield functionality if entered numbers",
				" It should accept the number ");
		prescription.MinimumDose.clear();
		Referenceprescriptionlate1(prescription.MinimumDose,"10",test,driver);
		Referenceprescriptionlate1(prescription.MaximumDose,"20",test,driver);
		prescription.Save.click();
	}
	
	
	@Test(priority = 37)
	public void TnoOfFractiontextfieldifenteredminiumvalue()
			throws InterruptedException, IOException {

		test = extent.createTest(
				funTestCaseName() + " :   To verify No of fraction textfield if entered minimum range ",
				" It should accept the number (1)");
		Referenceprescriptionlate1(prescription.NumberOfFractions,"1",test,driver);

	}

	@Test(priority = 38)
	public void noOfFractiontextfieldifenteredlessthanminrange()
			throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName() + " :   To verify No of fraction textfield if entered more than max range ",
				" It should not accept the number (1)");
		prescription.NumberOfFractions.sendKeys("101");
		prescription.Save.click();
		demo.textfield(prescription.No_Of_Fractnswarnmsg, "Range:[1 to 100]", test,driver);
		prescription.NumberOfFractions.clear();

	}

	@Test(priority = 39)
	public void noOfFractiontextfieldifenteredMaxnumber()
			throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName() + " :   To verify No of fraction textfield if entered Maximum range ",
				" It should accept the number (100)");
		Referenceprescriptionlate1(prescription.NumberOfFractions,"100",test,driver);
		prescription.NumberOfFractions.clear();

	}

	@Test(priority = 40)
	public void noOfFractiontextfieldifenterednumberisOutOfrange()
			throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName() + " :   To verify No of fraction textfield if entered Maximum range ",
				" It should not accept the number (1000000) and Range:[1 to 100] warning message should display ");
		prescription.NumberOfFractions.sendKeys("1000000");
		prescription.Save.click();
		
		demo.textfield(prescription.No_Of_Fractnswarnmsg, "Range:[1 to 100]", test,driver);
		prescription.NumberOfFractions.click();
		prescription.NumberOfFractions.clear();
				
	}

	@Test(priority = 41)
	public void noOfFractiontextfieldifenterednumberempty()
			throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName() + " :   To verify No of fraction textfield if entered Empty ",
				"Input cannot be blank warning message should display");
		prescription.NumberOfFractions.click();
		prescription.NumberOfFractions.sendKeys("  ");
		prescription.Save.click();
		demo.textfield(prescription.No_Of_Fractnswarnmsg, "Input cannot be blank", test,driver);
		prescription.NumberOfFractions.clear();
	}

	@Test(priority = 42)
	public void noOfFractiontextfieldifenterednumberisAlphabets()
			throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName() + " :   To verify No of fraction textfield if entered alphanhets ",
				" It should not accept the alphabets (asgdfgfdg)");
		
		prescription.NumberOfFractions.sendKeys("asgdfgfdg");
		prescription.Save.click();
		demo.textfield(prescription.No_Of_Fractnswarnmsg, "Input cannot be blank", test,driver);
		prescription.NumberOfFractions.clear();
	}

	@Test(priority = 43)
	public void noOfFractiontextfieldifenterednumberisSpecialCharacters()
			throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName() + " :   To verify No of fraction textfield if entered SpecialCharacters ",
				" It should not accept the SpecialCharacters (@$@#%##%)");
		prescription.NumberOfFractions.sendKeys("@$@#%##%");
		prescription.Save.click();
		demo.textfield(prescription.No_Of_Fractnswarnmsg, "Input cannot be blank", test,driver);
		prescription.NumberOfFractions.clear();
	}

	@Test(priority = 44)
	public void noOfFractiontextfieldifenterednumberisSpaces()
			throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName() + " :   To verify No of fraction textfield if entered Empty ",
				" It should not accept the spaces ()");
		prescription.NumberOfFractions.sendKeys("     ");
		prescription.Save.click();
		demo.isdisplayed(prescription.No_Of_Fractnswarnmsg, "Input cannot be blank", test,driver);
		prescription.NumberOfFractions.clear();
	}

	@Test(priority = 45)
	public void noOfFractiontextfieldifenterednumberisAplphanumeric()
			throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName() + " :   To verify No of fraction textfield if entered Numbers with Alphabets ",
				" It should not accept the number (3)");
		Referenceprescriptionlate1(prescription.NumberOfFractions,"3",test,driver);
		prescription.NumberOfFractions.clear();
		prescription.NumberOfFractions.sendKeys("5");
	}
	@Test(priority = 46)
	public void PlanIntent() throws IOException
	{
		test = extent.createTest(funTestCaseName() + " To verify the Plan Intent dropdown");
		WebElement element =driver.findElements(By.className("ComboBox")).get(1);
		element.click();
		List<WebElement> datarow = element.findElements(By.className("Textblock"));
		  for (WebElement datarow1 : datarow) {
			  String Text1=datarow1.getText();
			  datarow1.click();
			  String Text2=element.getText();
			  if(Text1.equals(Text2))
			  {
				  test.pass("Text is displayed correctly with no error message");
			  }
			  else
			  {
				  test.fail("Data is empty"); 
			  }			  
		  }		  
		  }
	
@Test(priority = 47)
public void ToverifyPlanIntentdropdownbydefault() throws InterruptedException, IOException {
	
	test = extent.createTest(funTestCaseName()+" :   To verify  PlanIntent dropdown default selection ",  " CURATIVE  should display in prescription.PlanIntent dropdown  ");
	if(prescription.PlanIntent.getText().equals("CURATIVE"))
		test.pass("CURATIVE should be displayed");
	else
		test.fail("CURATIVE  is not displayed");
	
}


@Test(priority = 48)
public void ToverifyPlanIntentdropdownbyselectingCURATIVE() throws InterruptedException, IOException {
	i=0;
	if(prescription.PlanIntents.length !=0 && i<12) {
		while(i<prescription.PlanIntents.length) {
			test = extent.createTest(funTestCaseName()+" : To verify the functionality of selecting "+prescription.PlanIntents[i]+" from the Dropdown ",prescription.PlanIntents[i]+" Should be selected and Displayed");
			Dropdown1(prescription.PlanIntent, prescription.PlanIntents, i, "prescription.PlanIntent", test);
	i++;
		}
	}else
		test.info("No PlanIntents are available");
	
}

@Test(priority = 49)
public void ToverifyPlanIntentdropdownbyselectingMACHINE_QA() throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify PlanIntent dropdown after selecting MACHINE_QA ",  " MACHINE_QA  should display in prescription.PlanIntent dropdown  ");
	Dropdown1(prescription.PlanIntent, prescription.PlanIntents, 1, "prescription.PlanIntent", test);
	
}

@Test(priority = 50)
public void ToverifyPlanIntentdropdownbyselectingPALLIATIVE() throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify  PlanIntent dropdown after selecting PALLIATIVE ",  " PALLIATIVE  should display in prescription.PlanIntent dropdown  ");
	Dropdown1(prescription.PlanIntent, prescription.PlanIntents, 2, "prescription.PlanIntent", test);
	
}

@Test(priority = 51)
public void ToverifyPlanIntentdropdownbyselectingPROPHYLACTIC() throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify PlanIntent dropdown after selecting PROPHYLACTIC ",  " PROPHYLACTIC  should display in prescription.PlanIntent dropdown  ");
	Dropdown1(prescription.PlanIntent, prescription.PlanIntents, 3, "prescription.PlanIntent", test);
	
}

@Test(priority = 52)
public void ToverifyPlanIntentdropdownbyselectingRESEARCH() throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify PlanIntent dropdown after selecting RESEARCH ",  " RESEARCH  should display in prescription.PlanIntent dropdown  ");
	Dropdown1(prescription.PlanIntent, prescription.PlanIntents, 4, "prescription.PlanIntent", test);
	
}

@Test(priority = 53)
public void ToverifyPlanIntentdropdownbyselectingSERVICE() throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify  PlanIntent dropdown after selecting SERVICE ",  " SERVICE  should display in prescription.PlanIntent dropdown  ");
	Dropdown1(prescription.PlanIntent, prescription.PlanIntents, 5, "prescription.PlanIntent", test);
	
}

@Test(priority = 54)
public void ToverifyPlanIntentdropdownbyselectingVERIFICATION() throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify  PlanIntent dropdown after selecting VERIFICATION ",  " VERIFICATION  should display in prescription.PlanIntent dropdown  ");
	Dropdown1(prescription.PlanIntent, prescription.PlanIntents, 6, "prescription.PlanIntent", test);
	
}

String[] a2 = {"DYNAMIC", "STATIC"};	

@Test(priority = 55)
public void ToverifyBeamTypedropdownbydefault() throws InterruptedException, IOException {
	prescription.BeamType=prescription.BeamType;
	test = extent.createTest(funTestCaseName()+" :   To verify BeamType dropdown default selection ",  " DYNAMIC  should display in prescription.BeamType dropdown  ");
	if(prescription.BeamType.getText().equals("DYNAMIC"))
		test.pass("DYNAMIC should be displayed");
	else
		test.fail("DYNAMIC  is not displayed and "+prescription.BeamType.getText() +" is displayed");
	
}
@Test(priority = 56)
public void ToverifyBeamTypedropdownbyselectingDynamic() throws InterruptedException, IOException {

	test = extent.createTest(funTestCaseName()+" :   To verify  PrescribedMachine dropdown after selecting DYNAMIC ",  " DYNAMIC  should display in prescription.BeamType dropdown  ");
	Dropdown1(prescription.BeamType, prescription.BeamTypes, 0, "prescription.BeamType", test);
	
}

@Test(priority = 57)
public void ToverifyRadiationTypeedropdownbyselectingStatic() throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify PrescribedMachine dropdown after selecting STATIC ",  " STATIC  should display in prescription.BeamType dropdown  ");
	Dropdown1(prescription.BeamType, prescription.BeamTypes, 1, "prescription.BeamType", test);
	
}


@Test(priority = 58)
public void ToverifyRadiationTypedropdownbyselectingstatic1() throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify  PrescribedMachine dropdown after selecting STATIC ",  " STATIC  should display in prescription.BeamType dropdown  ");
	Dropdown1(prescription.RadiationType, prescription.RadiationTypes, 0, "RadiationType", test);
	
}

@Test(priority = 59)
public void ToverifyEnergydropdownbydefault() throws InterruptedException, IOException {
	
	test = extent.createTest(funTestCaseName()+" :   To verify Energy dropdown default selection ",  " 1.25  should display in prescription.BeamType dropdown  ");
	if(prescription.Energy.getText().equals("6"))
		test.pass(prescription.Energy.getText()+" should be displayed");
	else
		test.fail("6  is not displayed");
	
}

@Test(priority = 60)
public void Toverifynergydropdownbyselectingstatic() throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify  Energy dropdown after selecting 6 ",  " 6  should display in prescription.BeamType dropdown  ");
	Dropdown1(prescription.Energy, prescription.Energys, 0, "Energy", test);
	
}

@Test(priority = 61)
public void ToverifyTechniquedropdownbydefault() throws InterruptedException, IOException {
	
	test = extent.createTest(funTestCaseName()+" :   To verify  Technique dropdown default selection ",  " BREAST_BRIDGE  should display in prescription.BeamType dropdown  ");
	if(prescription.Technique.getText().equals("BREAST_BRIDGE"))
		test.pass("BREAST_BRIDGE  is displayed");
	else
		test.fail("BREAST_BRIDGE  is not displayed");
	
}

String[] a5 = { "BREAST_BRIDGE", "FIXED_SSD", "ISOCENTRIC", "SKIN_APPOSITION", "TBI" };
@Test(priority = 62)

public void ToverifyTechniquedropdownbyselectingBREAST_BRIDGE() throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify  Technique dropdown after selecting BREAST_BRIDGE ",  " BREAST_BRIDGE  should display in prescription.BeamType dropdown  ");

	Dropdown1(prescription.Technique, prescription.Techniques, 0, "prescription.Technique", test);
	
}

@Test(priority = 63)
public void ToverifyTechniquedropdownbyselectingFIXED_SSD() throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify Technique dropdown after selecting FIXED_SSD ",  " FIXED_SSD  should display in prescription.BeamType dropdown  ");
	Dropdown1(prescription.Technique, prescription.Techniques, 1, "prescription.Technique", test);
	
}

@Test(priority = 64)
public void ToverifyTechniquedropdownbyselectingISOCENTRIC() throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify Technique dropdown after selecting ISOCENTRIC ",  " ISOCENTRIC  should display in prescription.BeamType dropdown  ");
	Dropdown1(prescription.Technique, prescription.Techniques, 2, "prescription.Technique", test);
	
}

@Test(priority = 65)
public void ToverifyTechniquedropdownbyselectingSKIN_APPOSITION() throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify Technique dropdown after selecting SKIN_APPOSITION ",  " SKIN_APPOSITION  should display in prescription.BeamType dropdown  ");
	Dropdown1(prescription.Technique, prescription.Techniques, 3, "prescription.Technique", test);
	
}

@Test(priority = 66)
public void ToverifyTechniquedropdownbyselectingTBI() throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify Technique dropdown after selecting TBI ",  " TBI  should display in prescription.BeamType dropdown  ");
	Dropdown1(prescription.Technique, prescription.Techniques, 4, "prescription.Technique", test);
	
}
@Test(priority = 76)
public void CBCcycletextfieldifenteredminiumvalue()
		throws InterruptedException, IOException {
	test = extent.createTest(
			funTestCaseName()+ " :   To verify CBCCycle textfield if entered minium range ",
			" It should accept the minium range number (1)");
	Referenceprescriptionlate1(prescription.CBCCycle,"1",test,driver);
	prescription.CBCCycle.clear();
}

@Test(priority = 77)
public void CBCcycletextfieldifenteredAnynumberintherange()
		throws InterruptedException, IOException {
	test = extent.createTest(
			funTestCaseName()+ " :   To verify CBCCycle textfield if entered Any number in the range ",
			" It should accept the number (25)");
	Referenceprescriptionlate1(prescription.CBCCycle,"25",test,driver);
	prescription.CBCCycle.clear();

}

@Test(priority = 78)
public void CBCcycletextfieldifenteredMaxnumber()
		throws InterruptedException, IOException {
	test = extent.createTest(
			funTestCaseName()+ " :   To verify CBCCycle textfield if entered Maximum range ",
			" It should accept the number (99)");
	Referenceprescriptionlate1(prescription.CBCCycle,"99",test,driver);
	prescription.CBCCycle.clear();

}

@Test(priority = 79)
public void cycletextfieldifenterednumberisOutOfrange() throws InterruptedException, IOException {
	test = extent.createTest(
			funTestCaseName()+ " :   To verify CBCCycle textfield if entered Maximum range ",
			" It should not accept the number (100)");
	prescription.CBCCycle.sendKeys("100");
	prescription.Save.click();
	demo.TextfieldwithWarnmsg(prescription.CBCcyclewarnmsg.getText(), "Range:[1 to 99]", test,driver);
	prescription.CBCCycle.clear();
}

@Test(priority = 80)
public void CBCcycletextfieldifenterednumberisempty() throws InterruptedException, IOException {
	test = extent.createTest(
			funTestCaseName()+ " :   To verify CBCCycle textfield if entered Maximum range ",
			"Input cannot be blank warning message should display");
	prescription.CBCCycle.sendKeys("");
	prescription.Save.click();
	demo.TextfieldwithWarnmsg(prescription.CBCcyclewarnmsg.getText(), "Input cannot be blank", test,driver);
	prescription.CBCCycle.clear();
}

@Test(priority = 81)
public void CBCcycletextfieldifenterednumberisAlphabets()
		throws InterruptedException, IOException {
	test = extent.createTest(
			funTestCaseName()+ " :   To verify CBCCycle textfield if entered Maximum range ",
			" It should not accept the alphabets (asgdfgfdg)");
	prescription.CBCCycle.sendKeys("asgdfgfdg");
	prescription.Save.click();
	demo.TextfieldwithWarnmsg(prescription.CBCcyclewarnmsg.getText(), "Input cannot be blank", test,driver);
	prescription.CBCCycle.clear();
}

@Test(priority = 82)
public void CBCcycletextfieldifenterednumberisSpecialCharacters()
		throws InterruptedException, IOException {
	test = extent.createTest(
			funTestCaseName()+ " :   To verify CBCCycle textfield if entered SpecialCharacters ",
			" It should not accept the SpecialCharacters (@$@#%##%)");
	prescription.CBCCycle.sendKeys("@$@#%##%");
	prescription.Save.click();
	demo.TextfieldwithWarnmsg(prescription.CBCcyclewarnmsg.getText(), "Input cannot be blank", test,driver);
	prescription.CBCCycle.clear();
}

@Test(priority = 83)
public void CBCcycletextfieldifenterednumberisSpaces() throws InterruptedException, IOException {
	test = extent.createTest(
			funTestCaseName()+ " :   To verify CBCCycle textfield if entered Maximum range ",
			" It should not accept the spaces ()");
	prescription.CBCCycle.sendKeys("      ");
	prescription.Save.click();
	demo.TextfieldwithWarnmsg(prescription.CBCcyclewarnmsg.getText(), "Input cannot be blank", test,driver);
	prescription.CBCCycle.click();
	prescription.CBCCycle.clear();
}


@Test(priority = 84)
public void CBCcycletextfieldifenterednumberisAplphanumeric()
		throws InterruptedException, IOException {
	test = extent.createTest(
			funTestCaseName()+ " :   To verify CBCCycle textfield if entered Aplphanumeric values(4fg) ",
			" It should accept the only numbers (4)");
	prescription.CBCCycle.sendKeys("4");
	demo.isdisplayed(prescription.CBCCycle, "4", test, driver);
	prescription.Save.click();
}

@Test(priority = 85)
public void IGRTtextfieldifenteredAlphabets()
		throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+ " :   To verify IGRTCycle textfield if entered Alphabets ",
			" It should not Accept the data");
	prescription.IGRTCycle.sendKeys("Cgy");
	prescription.Save.click();
	demo.isempty(prescription.IGRTCycle, "Cgy",test, driver);
	prescription.IGRTCycle.clear();
}

@Test(priority = 86)
public void IGRTtextfieldifenteredoutofrange()
		throws InterruptedException, IOException {
	test = extent.createTest(
			funTestCaseName()+ " :   To verify IGRTCycle textfield if entered out of range ",
			" It should Display Range:[1 to 99]");
	prescription.IGRTCycle.sendKeys("100");
	prescription.Save.click();
	demo.TextfieldwithWarnmsg(prescription.IGRTcyclewarnmsg.getText(), "Range:[1 to 99]", test,driver);
	prescription.IGRTCycle.clear();
}

@Test(priority = 87)
public void IGRTtextfieldifenteredmaximumvalue()
		throws InterruptedException, IOException {
	test = extent.createTest(
			funTestCaseName()+ " :   To verify IGRTCycle textfield if entered maximum range ",
			" It should accept the maximum range number (99)");
	Referenceprescriptionlate1(prescription.IGRTCycle,"99",test,driver);
	prescription.IGRTCycle.clear();
}

@Test(priority = 88)
public void IGTRtextfieldifenterednumberisAplphanumeric()
		throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()
			+ " :   To verify CBCCycle textfield if entered Aplphanumeric and special characters values(#$%#4fg) ",
			" It should accept the only numbers (4)");
	prescription.IGRTCycle.sendKeys("#$%#466fg");
	prescription.Save.click();
	demo.TextfieldwithWarnmsg(prescription.IGRTcyclewarnmsg.getText(), "Range:[1 to 99]", test,driver);
	prescription.IGRTCycle.clear();
}

@Test(priority = 89)
public void IGRTtextfieldifenteredanynumberinrange()
		throws InterruptedException, IOException {
	test = extent.createTest(
			funTestCaseName()+ " :   To verify IGRTCycle textfield if entered Any number in the Range ",
			" It should accept the Data");
	Referenceprescriptionlate1(prescription.IGRTCycle,"12",test,driver);
}


@Test(priority = 90)
public void Radiobuttonofgatingyeswithoutselecting() throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+ " :   To verify Gating yes and No radio button ",
			" Gating yes and No radio button should be in Deselect");
	demo.BydefaultisSelected(prescription.GatingYes,  "Yes",test,driver);
	demo.isSelected(prescription.GatingNo,  "No",test,driver);
	
}

@Test(priority = 91)
public void Radiobuttonofgatingyeswithselecting() throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+ " :   To verify Gating yes radio button ",
			"  Gating yes radio button should be selected");
	act.moveToElement(prescription.GatingYes).moveByOffset(-3,0).click().perform();
	demo.isSelected(prescription.GatingYes,  "Yes",test,driver);
	demo.BydefaultisSelected(prescription.GatingNo,  "No",test,driver);
}

@Test(priority = 92)
public void RadiobuttonofgatingyNowithoutselecting() throws InterruptedException, IOException {
	test = extent.createTest(
			funTestCaseName()+ " :   To verify Gating Yes and No radio button aftyer select No ",
			"Gating Yes should be in Deselect and No should be select");
	act.moveToElement(prescription.GatingNo).click().perform();
	demo.BydefaultisSelected(prescription.GatingYes,  "Yes",test,driver);
	demo.isSelected(prescription.GatingNo,  "No",test,driver);
}

@Test(priority = 93)
public void Radiobuttonofbolusyeswithoutselecting() throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+ " :   To verify Bolus yes and No radio button ",
			" Bolus yes and No radio button present");
	demo.BydefaultisSelected(prescription.BolusYes,  "Yes",test,driver);
	demo.isSelected(prescription.BolusNo,  "No",test,driver);
	
}

@Test(priority = 94)
public void RadiobuttonofBolusyeswithselecting() throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+ " :   To verify Bolus yes radio button ",
			"  Bolus yes radio button should be selected");
	act.moveToElement(prescription.BolusYes).moveByOffset(-3,0).click().perform();
	demo.isSelected(prescription.BolusYes,  "Yes",test,driver);
	demo.BydefaultisSelected(prescription.BolusNo,  "No",test,driver);
}

@Test(priority = 95)
public void RadiobuttonofBolusNowithoutselecting() throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+ " :   To verify Bolus No radio button ",
			"Bolus Yes should be in Deselect and No should be select");
	act.moveToElement(prescription.BolusNo).click().perform();
	demo.BydefaultisSelected(prescription.BolusYes,  "Yes",test,driver);
	demo.isSelected(prescription.BolusNo,  "No",test,driver);
}

@Test(priority = 96)
public void ToverifyPhysiciandropdownbydefault() throws InterruptedException, IOException {
	
	test = extent.createTest(funTestCaseName()+" :   To verify  Physican dropdown default selection ",  " 123456  should display in Physican dropdown  ");
	Roleselection(test,8);
}


@Test(priority = 97)
public void ToverifyCTtextfieldifisEmptyandclickedOnSavebutton() throws InterruptedException, IOException {

	test = extent.createTest(funTestCaseName()+" :   To verify CT_ID textfield if textfield is empty ",  " It should allow to prescription.Save the entered text");
	demo.textfield(prescription.CT_ID, "");
	prescription.Save.click();
	demo.isempty(prescription.CT_ID, "CT-ID", test, driver);
	prescription.CT_ID.clear();
}

@Test(priority = 98)
public void ToverifyCTtextfieldifenteredalphabetsandclickedOnSavebutton() throws InterruptedException, IOException {

	test = extent.createTest(funTestCaseName()+" :   To verify CT_ID textfield if entered text is alphabets ",  " It should allow to prescription.Save the entered text");
	demo.textfield(prescription.CT_ID, "SDFBFISGDFI");
	prescription.Save.click();
	demo.Textcomparsion(prescription.CT_ID, "SDFBFISGDFI", test, driver);
	prescription.CT_ID.clear();
}

@Test(priority = 99)
public void ToverifyCTtextfieldifenteredAnynumberintherangeandclickedOnSavebutton() throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify CT_ID textfield if any number in the textfield  ",  " It should allow to prescription.Save the entered text");
	demo.textfield(prescription.CT_ID, "4643464");
	prescription.Save.click();	
	demo.textfield(prescription.CT_ID,"4643464",test,driver);
	prescription.CT_ID.clear();

}
@Test(priority = 100)
public void ToverifyCTtextfieldifenteredismorethanitsacceptinglengthandclickedOnSavebutton() throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify CT_ID textfield if entered text(100dfghshiasy57A55) is more than its accepting length ",  " It should not accept the text more than range(100dfghshiasy57A) ");
	demo.textfield(prescription.CT_ID, "100dfghshiasy57A55");
	prescription.Save.click();
	demo.textfield(prescription.CT_ID,"100dfghshiasy57A",test,driver);
	prescription.CT_ID.clear();
} 


@Test(priority = 101)
public void ToverifyCTtextfieldifenteredisalphanumaricandclickedOnSavebutton() throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify CT_ID textfield if entered text is alphanumaric ",  " It should  accept the text  and allow to Save the data ");
	demo.textfield(prescription.CT_ID, "100dfgh00");
	prescription.Save.click();
	demo.textfield(prescription.CT_ID,"100dfgh00",test,driver);
	prescription.CT_ID.clear();
}

@Test(priority = 102)
public void ToverifyCTtextfieldifenteredalphanumaricandspecialcharactersandclickedOnSavebutton() throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify CT_ID textfield if alphanumaric and special characters ",  " It should allow to Save the entered text");
	demo.textfield(prescription.CT_ID, "965+$#KJ@9");
	prescription.Save.click();
	demo.textfield(prescription.CT_ID,"965+$#KJ@9",test,driver);
	prescription.Save.click();
	prescription.CT_ID.clear();
}

@Test(priority = 103)
public void ToverifyMRItextfieldifenteredismorethanitsacceptinglengthandclickedOnSavebutton() throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify CT_ID textfield if entered text(100dfgh00000000998) is more than its accepting length ",  " It should not accept the text more than range(100dfgh000000000) ");
	demo.textfield(prescription.CT_ID, "100dfgh00000000998");
	prescription.Save.click();
	demo.textfield(prescription.CT_ID,"100dfgh000000009",test,driver);
	
} 

@Test(priority = 104)
public void ToverifyMRItextfieldifisEmptyandclickedOnSavebutton() throws InterruptedException, IOException {

	test = extent.createTest(funTestCaseName()+" :   To verify MRI textfield if textfield is Spaces ",  " It should allow to Save the entered text");
	demo.textfield(prescription.MRI, "  ");
	prescription.Save.click();
	demo.isnotempty(prescription.MRI, "   ", test, driver);
	prescription.MRI.clear();
}
@Test(priority = 105)
public void ToverifyMRItextfieldifenteredminiumvalueandclickedOnbutton() throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify MRI textfield if entered text is alphabets ",  " It should allow to Save the entered text");
	demo.textfield(prescription.MRI, "SDFBFISGDFI");
	prescription.Save.click();
	demo.Textcomparsion(prescription.MRI, "SDFBFISGDFI", test, driver);
	prescription.MRI.clear();
}

@Test(priority = 106)
public void ToverifyMRItextfieldifenteredMaxnumberandclickedOnSavebutton() throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify MRI textfield if alphanumaric and special characters ",  " It should allow to Save the entered text");
	demo.textfield(prescription.MRI, "965+$#KJ@9");
	prescription.Save.click();
	demo.textfield(prescription.MRI,"965+$#KJ@9",test,driver);
	prescription.MRI.clear();

}

@Test(priority = 107)
public void ToverifyMRItextfieldifenterednumberisOutOfrangeandclickedOnSavebutton() throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify MRI textfield if entered text is alphanumaric ",  " It should  accept the text  and allow to Save the data ");
	demo.textfield(prescription.MRI, "100dfgh0000");
	prescription.Save.click();
	demo.textfield(prescription.MRI,"100dfgh0000",test,driver);
	prescription.MRI.clear();
}

@Test(priority = 108)
public void ToverifyMRItextfieldifenteredAnynumberintherangeandclickedOnSavebutton() throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify MRI textfield if any number in the textfield  ",  " It should allow to Save the entered text");
	demo.textfield(prescription.MRI, "4643464");
	prescription.Save.click();
	demo.textfield(prescription.MRI,"4643464",test,driver);
}
@Test(priority = 109)
public void ToverifyPETCTIDtextfieldifisEmptyandclickedOnSavebutton() throws InterruptedException, IOException {
	prescription.PET_CT_ID=prescription.PET_CT_ID;
	test = extent.createTest(funTestCaseName()+" :   To verify PET_CT_ID textfield if textfield is spaces ",  " It should allow to Save the entered text");
	demo.textfield(prescription.PET_CT_ID, "   ");
	prescription.Save.click();
	demo.isnotempty(prescription.PET_CT_ID, "   ", test, driver);
	prescription.PET_CT_ID.clear();
}

@Test(priority = 110)
public void ToverifyPETCTIDtextfieldifenteredminiumvalueandclickedOnSavebutton() throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify PET_CT_ID textfield if entered text is alphabets ",  " It should allow toSave the entered text");
	demo.textfield(prescription.PET_CT_ID, "SDFBFISGDFI");
	prescription.Save.click();
	demo.textfield(prescription.PET_CT_ID, "SDFBFISGDFI",test,driver);
	prescription.PET_CT_ID.clear();
}

@Test(priority = 111)
public void ToverifyPETCTIDtextfieldifenteredAnynumberintherangeandclickedOnSavebutton()
		throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify PET_CT_ID textfield if any number(4643464) in the textfield  ",  " It should allow to Save the entered text");
	demo.textfield(prescription.PET_CT_ID, "4643464");
	prescription.Save.click();
	demo.textfield(prescription.PET_CT_ID, "4643464",test,driver);
	prescription.PET_CT_ID.clear();

}
@Test(priority = 112)
public void ToverifyPETCTIDtextfieldifenteredismorethanitsacceptinglengthandclickedOnSavebutton() throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify PET_CT_ID textfield if entered text is more than its accepting length ",  " It should not accept the text more than range ");
	demo.textfield(prescription.PET_CT_ID, "100dfgDHhDFHFG00");
	prescription.Save.click();
	demo.textfield(prescription.PET_CT_ID,"100dfgDHhDFHFG00",test,driver);
	prescription.PET_CT_ID.clear();
} 


@Test(priority = 113)
public void ToverifyPETCTIDtextfieldifenterednumberisOutOfrangeandclickedOnSavebutton()
		throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify PET_CT_ID textfield if entered text is alphanumaric ",  " It should  accept the text  and allow to Save the data ");
	demo.textfield(prescription.PET_CT_ID, "100dgh04IUYFTH");
	prescription.Save.click();
	demo.textfield(prescription.PET_CT_ID, "100dgh04IUYFTH",test,driver);
	prescription.PET_CT_ID.clear();
}


@Test(priority = 114)
public void ToverifyPETCTIDtextfieldifenteredMaxnumberandclickedOnSavebutton() throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify PET_CT_ID textfield if alphanumaric and special characters ",  " It should allow to Save the entered text");
	demo.textfield(prescription.PET_CT_ID, "965+$#KJ@9");
	demo.textfield(prescription.PET_CT_ID, "965+$#KJ@9", test,driver);

}




//OAR

	@Test(priority = 115)
	public void ToverifyTOARNametextfieldifenteraproperName()throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify OAR Name Textfield Entering Name ",  " OAR Name Textfield should accept Name ");
	
	prescription.OARAdd.click();
	demo.textfield(prescription.OARName, "Ravindra");
	demo.textfield(prescription.OARName,"Ravindra",test,driver);// writing report
	prescription.OARName.clear();
	}

	@Test(priority = 116)
	public void ToverifyOARNametextfielifenteraspecailcharas1stletterinthenameName()throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify OAR Name Textfield Entering Special characters First and Alphabets  ",  " OAR Name Textfield should Display Input must start with characters  ");
	demo.textfield(prescription.OARName, "@hgdsfg");
	demo.textfield(prescription.OARNamewarnmsg,"Input must start with characters",test,driver);
	prescription.OARName.clear();
	}

	@Test(priority = 117)
	public void ToverifyOARNametextfielifenteranumbersasspecialchartinthenameName()throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify OAR Name Textfield Entering Alphabets with Special characters ",  " OAR Name Textfield should Display Only alphabets,digits,space allowed ");
	demo.textfield(prescription.OARName, "agds@fg");
	demo.textfield(prescription.OARNamewarnmsg,"Only alphabets,digits,space allowed",test,driver);
	prescription.OARName.clear();
	}
	 		
	@Test(priority = 118)
	public void ToverifyOARNametextfielifenter2lettersinthenameName()throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify OAR Name Textfield Entering Two Letters  ",  " OAR Name Textfield should Display Input must have atleast 3 characters ");
	demo.textfield(prescription.OARName, "ag");
	demo.textfield(prescription.OARNamewarnmsg,"Input must have atleast 3 characters",test,driver);
	prescription.OARName.clear();
	}	
	
	@Test(priority = 119)
	public void ToverifyOARNametextfielifenterNUMBERASsinthenameName()throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify OAR Name Textfield Entering Numbers  ",  " OAR Name Textfield should Input Must start with characters ");
	demo.textfield(prescription.OARName, "465464346");
	demo.textfield(prescription.OARNamewarnmsg,"Input must start with characters",test,driver);
	prescription.OARName.clear();
	
	}
	
	@Test(priority = 120)
	public void ToverifyOARNametextfielifenterALPHANUMERICSPECIALCHARsinthenameName()throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify OAR Name Textfield Entering Alphanumeric with Special characters  ",  " OAR Name Textfield should Display Input Must start with characters ");
	demo.textfield(prescription.OARName, "46hgjhg@54646");
	demo.textfield(prescription.OARNamewarnmsg,"Input must start with characters",test,driver);
	prescription.OARName.clear();
	
	}	
	
	@Test(priority = 121)
	public void ToverifyOARNametextfielifOArNameisEmpty()throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify OAR Name Textfield Entering Alphanumeric with Special characters  ",  " OAR Name Textfield should Display Input Must start with characters ");
	demo.textfield(prescription.OARName, "");
	demo.textfield(prescription.OARNamewarnmsg,"Input cannot be blank",test,driver);
	prescription.OARName.clear();
	
	}	
	
	@Test(priority = 122)
	public void ToverifyOARNametextfielifenteredAlphanemeric()throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify OAR Name Textfield Entering Alphanumeric  ",  " OAR Name Textfield should accept the data ");
	demo.textfield(prescription.OARName, "ad3");
	demo.textfield(prescription.OARName,"ad3",test,driver);
	
	}	
	

	@Test(priority = 123)
	public void ToverifyOARminDosetextfieldifenteredminiumvalue() throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify OAR Minimum dose Textfield Entering Minimum value  ",  " Minimum Dose Textfield should Accept the Minimum Value ");
	prescription.OARMinDose=prescription.OARMinDose;
	demo.textfield(prescription.OARMinDose, "10");
	demo.textfield(prescription.OARMinDose,"10",test,driver);
	prescription.OARMinDose.clear();
	}
	
@Test(priority = 124)
	public void ToverifyminDosetextfieldifenteredAnynumberintherange()throws InterruptedException, IOException {
test = extent.createTest(funTestCaseName()+" :   To verify OAR Minimum dose Textfield Entering any number within the Range  ",  " Minimum Dose Textfield should Accept the Data ");
	demo.textfield(prescription.OARMinDose, "1000");
	demo.textfield(prescription.OARMinDose,"1000",test,driver);
	prescription.OARMinDose.clear();
	}

	@Test(priority = 125)
	public void ToverifyminDosetextfieldifenteredMaxnumber() throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify OAR Minimum dose Textfield Entering maximum Number  ",  " Minimum Dose Textfield should Accept the Data ");
	demo.textfield(prescription.OARMinDose, "10000");
	demo.textfield(prescription.OARMinDose,"10000",test,driver);
	prescription.OARMinDose.clear();
	}

	@Test(priority = 126)
	public void ToverifyminDosetextfieldifenterednumberisOutOfrange() throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify OAR Minimum dose Textfield Entering out of range values  ",  " Minimum Dose Textfield should Display Input is greater than max value 10000 ");
	demo.textfield(prescription.OARMinDose, "1000000");
	demo.textfield(prescription.OARMinDosewarnmsg,"Input is greater than max value 10000",test,driver);
	prescription.OARMinDose.clear();
	}

	@Test(priority = 129)
	public void ToverifyminDosetextfieldifenterednumberisempty() throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify OAR Minimum dose Textfield is Empty  ",  " Minimum Dose Textfield should Display Input cannot be blank ");
	demo.textfield(prescription.OARMinDose, "");
	demo.textfield(prescription.OARMinDosewarnmsg,"Input cannot be blank",test,driver);
	prescription.OARMinDose.clear();
	}

	@Test(priority = 127)
	public void ToverifyminDosetextfieldifenterednumberisAlphabets() throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify OAR Minimum dose Textfield Entering Alphabets  ",  "Minimum Dose Textfield should Display Only numbers are allowed ");	 		
	demo.textfield(prescription.OARMinDose, "asgdfgfdg");
	demo.textfield(prescription.OARMinDosewarnmsg,"Only numbers are allowed",test,driver);
	prescription.OARMinDose.clear();
	}

	@Test(priority = 128)
	public void ToverifyminDosetextfieldifenterednumberisSpecialCharacters()throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify OAR Minimum dose Textfield Entering Special characters  ",  " Minimum Dose Textfield should Display Only numbers are allowed ");	 		
	demo.textfield(prescription.OARMinDose, "@$@#%##%");
	demo.textfield(prescription.OARMinDosewarnmsg,"Only numbers are allowed",test,driver);
	prescription.OARMinDose.clear();
	}

	@Test(priority = 129)
	public void ToverifyminDosetextfieldifenterednumberisSpaces() throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify OAR Minimum dose Textfield Entering Numbers with spaces  ",  " Minimum Dose Textfield should Display Only numbers are allowed ");	 		
	demo.textfield(prescription.OARMinDose, " 2 3    ");
	demo.textfield(prescription.OARMinDosewarnmsg,"Only numbers are allowed",test,driver);
	prescription.OARMinDose.clear();
	}

	@Test(priority = 130)
	public void ToverifyminDosetextfieldifenterednumberisAplphanumeric()throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify OAR Minimum dose Textfield Entering Alphanumeric  ",  " Minimum Dose Textfield should Display Only numbers are allowed ");	 		
	demo.textfield(prescription.OARMinDose, "hdgf34");
	demo.textfield(prescription.OARMinDosewarnmsg,"Only numbers are allowed",test,driver);
	prescription.OARMinDose.clear();
	}
	@Test(priority = 131)
	public void ToverifyminDosetextfieldifenterednumber()throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify OAR Minimum dose Textfield Entering Number  ",  " Minimum Dose Textfield should accept the data ");	 		
	demo.textfield(prescription.OARMinDose, "45");
	demo.textfield(prescription.OARMinDose,"45",test,driver);
	prescription.OARMinDose.clear();
	}

	
	

	@Test(priority = 132)
	public void ToverifyOARmaxDosetextfieldifenteredminiumvalue() throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify OAR Maximum dose Textfield Entering Minimum value  ",  " Maximum Dose Textfield should Accept the Data ");	 		
	
	demo.textfield(prescription.OARMaxDose, "10");
	demo.textfield(prescription.OARMaxDose,"10",test,driver);
	prescription.OARMaxDose.clear();
	}

	@Test(priority = 133)
	public void ToverifyOARmaxDosetextfieldifenteredAnynumberintherangeand()throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify OAR Maximum dose Textfield Entering any number in the range  ",  " Maximum Dose Textfield should Accept the Data ");	 		
	demo.textfield(prescription.OARMaxDose, "1000");
	demo.textfield(prescription.OARMaxDose,"1000",test,driver);
	prescription.OARMaxDose.clear();

	}

	@Test(priority = 134)
	public void ToverifyOARmaxDosetextfieldifenteredMaxnumber() throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify OAR Maximum dose Textfield Entering maximum Number  ",  " Maximum Dose Textfield should Accept the Data ");	 		
	demo.textfield(prescription.OARMaxDose, "10000");
	demo.textfield(prescription.OARMaxDose,"10000",test,driver);
	prescription.OARMaxDose.clear();

	}

	@Test(priority = 135)
	public void ToverifyOARmaxDosetextfieldifenterednumberisOutOfrange() throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify OAR Maximum dose Textfield Entering out of range values  ",  " Maximum Dose Textfield should display Input is greater than max value 10000 ");	 		
	demo.textfield(prescription.OARMaxDose, "1000000");
	demo.textfield(prescription.OARMaxDosewarnmsg,"Input is greater than max value 10000",test,driver);
	prescription.OARMaxDose.clear();
	}

	@Test(priority = 136)
	public void ToverifyOARmaxDosetextfieldifenterednumberisempty() throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify OAR Maximum dose Textfield is Empty  ",  " Maximum Dose Textfield should display Input cannot be blank ");	 		
	demo.textfield(prescription.OARMaxDose, "");
	demo.textfield(prescription.OARMaxDosewarnmsg,"Input cannot be blank",test,driver);
	prescription.OARMaxDose.clear();
	}

	@Test(priority = 137)
	public void ToverifyOARmaxDosetextfieldifenterednumberisAlphabets() throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify OAR Maximum dose Textfield Entering Alphabets  ",  " Maximum Dose Textfield should display Only numbers are allowed");
	demo.textfield(prescription.OARMaxDose, "asgdfgfdg");
	demo.textfield(prescription.OARMaxDosewarnmsg,"Only numbers are allowed",test,driver);
	prescription.OARMaxDose.clear();
	}

	@Test(priority = 138)
	public void ToverifyOARmaxDosetextfieldifenterednumberisSpecialCharacters()throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify OAR Maximum dose Textfield Entering Special characters", " Maximum Dose Textfield Should Display Only numbers are allowed");
	demo.textfield(prescription.OARMaxDose, "@$@#%##%");
	demo.textfield(prescription.OARMaxDosewarnmsg,"Only numbers are allowed",test,driver);
	prescription.OARMaxDose.clear();
	}

	@Test(priority = 139)
	public void ToverifyOARmaxDosetextfieldifenterednumberisSpaces() throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify OAR Maximum dose Textfield Entering Numbers with spaces", "Maximum Dose Textfield Should Display Only numbers are allowed");
	demo.textfield(prescription.OARMaxDose, "  4 8");
	demo.textfield(prescription.OARMaxDosewarnmsg,"Only numbers are allowed",test,driver);
	prescription.OARMaxDose.clear();
	}

	@Test(priority = 140)
	public void ToverifyOARmaxDosetextfieldifenterednumberisAplphanumeric()throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify OAR Maximum dose Textfield Entering Alphanumeric", " Maximum Dose Textfield Should Display only numbers are allowed");
	demo.textfield(prescription.OARMaxDose, "hdgf34");
	demo.textfield(prescription.OARMaxDosewarnmsg,"Only numbers are allowed",test,driver);
	prescription.OARMaxDose.clear();
	}	
	
	
	
	
	@Test(priority = 141)
	public void ToverifyOARMIANDmaxDosetextfieldifenterednumberisSAME()throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify OAR Minium(100) and Maximum dose(100 values  Entering Numbers are same", "Minimum Dose cannot be equal to Maximum DoseMaximum Dose cannot be equal to Minimum Dose warning message Should Display ");
	demo.textfield(prescription.OARMinDose, "100");
	demo.textfield(prescription.OARMaxDose, "100");
	demo.TextfieldwithWarnmsg(prescription.OARMinDosewarnmsg.getText() + prescription.OARMaxDosewarnmsg.getText(),"Minimum Dose cannot be equal to Maximum DoseMaximum Dose cannot be equal to Minimum Dose", test,driver);
	prescription.OARMinDose.clear();
	prescription.OARMaxDose.clear();
	}	
	
	@Test(priority = 142)
	public void ToverifyOARmaxDosetextfieldifenterednumber()throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify OAR Maximum dose Textfield Entering Numbers ", "Maximum Dose Textfield Should accept the data");
	
	demo.textfield(prescription.OARMinDose, "100");
	demo.textfield(prescription.OARMaxDose, "10");
	demo.TextfieldwithWarnmsg(prescription.OARMinDosewarnmsg.getText() + prescription.OARMaxDosewarnmsg.getText(),"Minimum Dose cannot be greater than Maximum DoseMaximum Dose cannot be less than Minimum Dose", test,driver);
	prescription.OARMinDose.clear();
	prescription.OARMaxDose.clear();
	}	
	
	@Test(priority = 142)
	public void ToverifyOARmaxDosetextfieldvalid()throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify OAR Maximum dose Textfield Entering Alphanumeric", " Maximum Dose Textfield Should Display only numbers are allowed");
	demo.textfield(prescription.OARMaxDose, "GD45");
	demo.textfield(prescription.OARMaxDosewarnmsg,"Only numbers are allowed",test,driver);
	}
	
	
	
	
	//@Test(priority = 143)
	public void ToverifyOARMEANDosetextfield() throws InterruptedException, IOException {
		float total = 0;
		test = extent.createTest(funTestCaseName()+" :   To verify Mean Dose vaule ",  " Mean dose value should be  "+total);
		prescription.OARMeanDose=prescription.OARMeanDose;
		
		demo.textfield(prescription.OARMinDose, "100");
		demo.textfield(prescription.OARMaxDose, "525");
		
		float OARMIN =(float) Float.parseFloat(prescription.OARMinDose.getText());
		float OARMAX = (float)Float.parseFloat(prescription.OARMaxDose.getText());
		
		
		 total = (OARMIN+OARMAX)/2;
		 Mean = String.valueOf(total);
		String Mean1 = prescription.OARMeanDose.getText();
			
		if(Mean.equals(Mean1)) {
			test.pass(prescription.OARMeanDose.getText()+"is mean Dose");
		}else {
			test.fail("Mean calculation is wrong"); 
		}
	}
//		@Test(priority = 144)
	public void ToverifyOARMEANDosetextfielifMAXandMINtextisEmpty() throws InterruptedException {

		prescription.OARMinDose.clear();
		prescription.OARMaxDose.clear();
			
	
	}
	
	

	@Test(priority = 145)
	public void ToverifyOARDescriptiontextfieldifenteredminiumvalueand() throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify OAR Description Textfield Entering minimum value", " Description Textfield Should accept the Minimum value");
	
	demo.textfield(prescription.OARDescription, "SDFBFISGDFI");
	demo.textfield(prescription.OARDescription,"SDFBFISGDFI",test,driver);
	prescription.OARDescription.clear();
	}

	@Test(priority = 146)
	public void ToverifyOARDescriptiontextfieldifenteredAnynumberintherange() throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify OAR Description Textfield Entering Any number Within the Range", "Description Textfield Should Accept the Data");
	demo.textfield(prescription.OARDescription, "4643464");
	demo.textfield(prescription.OARDescription,"4643464",test,driver);
  prescription.OARDescription.clear();

	}

	@Test(priority = 147)
	public void ToverifyOARDescriptiontextfieldifenteredMaxnumber() throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify OAR Description Textfield Entering Maximum number", " Description Textfield should accept the data");
	demo.textfield(prescription.OARDescription, "965+$#KJ@9");
	demo.textfield(prescription.OARDescription,"965+$#KJ@9",test,driver);
	prescription.OARDescription.clear();

	}
	@Test(priority = 148)
	public void ToverifyOARDescriptiontextfieldifenterednumberisOutOfrange() throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify OAR Description Textfield Entering out of range values", " Description Textfield should accept the data");
	demo.textfield(prescription.OARDescription, "100dfgh0000");
	prescription.Save.click();
	demo.textfield(prescription.OARDescription,"100dfgh0000",test,driver);
	prescription.OARInsertButton.click();
	prescription.OARCloseButton.click();
	}

	
	@Test(priority = 149)
	public void Toverifyinsertbutton() throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify Insert button", " Insert button should Enable and prescription.Saved oAr should display in list");

prescription.OARAdd.click();
demo.textfield(prescription.OARName, "HandLeft");
demo.textfield(prescription.OARMinDose, "10");
demo.textfield(prescription.OARMaxDose, "100");
demo.isEnabled(prescription.OARInsertButton, "Insert", test, driver);
demo.isEnabled(prescription.OARCloseButton, "Close", test, driver);
prescription.OARInsertButton.click();
prescription.OARCloseButton.click();
prescription.OARAdd.click();
demo.textfield(prescription.OARName, "TestOAR");
demo.textfield(prescription.OARMinDose, "10");
demo.textfield(prescription.OARMaxDose, "100");
prescription.OARInsertButton.click();
prescription.OARCloseButton.click();

	}
	@Test(priority = 150)
	public void ToverifyOARNametextfieldifenterednumberisOutOfrange() throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" :   To verify OAR name Textfield by Entering same name", "OAR Name Already Exists warn message should display");
	prescription.OARAdd.click();
	demo.textfield(prescription.OARName, "HandLeft");
	demo.textfield(prescription.OARNamewarnmsg,"OAR Name Already Exists",test,driver);
	prescription.OARCloseButton.click();
	}

@Test(priority = 151)
public void Reviewcycletextfieldifenteredminiumvalue()
		throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+ " :   To verify ReviewCycle textfield if entered minium range ",
			" It should accept the minium range number (1)");
	prescription.ReviewCycle.sendKeys("1");
	demo.Textcomparsion(prescription.ReviewCycle, "1", test, driver);
	prescription.ReviewCycle.clear();
}

@Test(priority = 152)
public void ReviewcycletextfieldifenteredAnynumberintherange()
		throws InterruptedException, IOException {
	test = extent.createTest(
			funTestCaseName()+ " :   To verify ReviewCycle textfield if enteredAny number in the range ",
			" It should accept the number (15)");
	prescription.ReviewCycle.sendKeys("15");
	demo.Textcomparsion(prescription.ReviewCycle, "15", test, driver);
	prescription.ReviewCycle.clear();
}

@Test(priority = 153)
public void ReviewcycletextfieldifenteredMaxnumber()
		throws InterruptedException, IOException {
	test = extent.createTest(
			funTestCaseName()+ " :   To verify ReviewCycle textfield if entered Maximum range ",
			" It should accept the number (99)");
	prescription.ReviewCycle.sendKeys("99");
	demo.Textcomparsion(prescription.ReviewCycle, "99", test, driver);
	prescription.ReviewCycle.clear();

}

@Test(priority = 154)
public void ReviewcycletextfieldifenterednumberisOutOfrange()
		throws InterruptedException, IOException {
	test = extent.createTest(
			funTestCaseName()+ " :   To verify ReviewCycle textfield if entered Maximum range ",
			" It should not accept the number (100)");
	prescription.ReviewCycle.sendKeys("100");
	prescription.Save.click();
	demo.TextfieldwithWarnmsg(prescription.Reviewcyclewarnmsg.getText(), "Range:[1 to 99]", test,driver);
	prescription.ReviewCycle.clear();
}

@Test(priority = 155)
public void Reviewcycletextfieldifenterednumberisempty() throws InterruptedException, IOException {
	test = extent.createTest(
			funTestCaseName()+ " :   To verify ReviewCycle textfield if entered Maximum range ",
			"Input cannot be blank warning message should display");
	prescription.ReviewCycle.sendKeys("");
	prescription.Save.click();
	demo.TextfieldwithWarnmsg(prescription.Reviewcyclewarnmsg.getText(), "Input cannot be blank", test,driver);
	prescription.ReviewCycle.clear();
}

@Test(priority = 166)
public void ReviewcycletextfieldAlphabets()
		throws InterruptedException, IOException {
	test = extent.createTest(
			funTestCaseName()+ " :   To verify ReviewCycle textfield if entered Maximum range ",
			" It should not accept the alphabets (asgdfgfdg)");
	prescription.ReviewCycle.sendKeys("asgdfgfdg");
	prescription.Save.click();
	demo.TextfieldwithWarnmsg(prescription.Reviewcyclewarnmsg.getText(), "Input cannot be blank", test,driver);
	prescription.ReviewCycle.clear();
}

@Test(priority = 167)
public void ReviewcycleSpecialCharacter()
		throws InterruptedException, IOException {
	test = extent.createTest(
			funTestCaseName()+ " :   To verify ReviewCycle textfield if entered SpecialCharacters ",
			" It should not accept the SpecialCharacters (@$@#%##%)");

	prescription.ReviewCycle.sendKeys("@$@#%##%");
	prescription.Save.click();
	demo.TextfieldwithWarnmsg(prescription.Reviewcyclewarnmsg.getText(), "Input cannot be blank", test,driver);
	prescription.ReviewCycle.clear();
}

@Test(priority = 168)
public void ReviewcycleSpaces() throws InterruptedException, IOException {
	test = extent.createTest(
			funTestCaseName()+ " :   To verify ReviewCycle textfield if entered Maximum range ",
			" It should not accept the spaces ()");
	prescription.ReviewCycle.sendKeys("     ");
	prescription.Save.click();
	demo.TextfieldwithWarnmsg(prescription.Reviewcyclewarnmsg.getText(), "Input cannot be blank", test,driver);
	prescription.ReviewCycle.clear();
}

@Test(priority = 169)
public void ReviewcycleAplphanumeric()
		throws InterruptedException, IOException {
	test = extent.createTest(
			funTestCaseName()+ " :To verify ReviewCycle textfield if entered Aplphanumeric values ",
			" It should accept the only numbers (3)");
	prescription.ReviewCycle.sendKeys("3hD");

	demo.isdisplayed(prescription.ReviewCycle, "3", test, driver);
	prescription.ReviewCycle.clear();
	prescription.ReviewCycle.sendKeys("5");
	act.moveToElement(prescription.Save).click().perform();
   	Sitesave1("Prescription Save", "Prescription data saved for selected site and phase.", "Prescription Save", "Prescription data saved for selected site and phase.", 0, driver,test);
}


	 @Test(priority = 170)
	   public void Toverifytextfieldaftersavedprescription() throws InterruptedException, IOException{
		test = extent.createTest(funTestCaseName()+" :   To verify All the textfield, Dropdown and radiobuttons in Treatment parameters ",  "  All the textfield, Dropdown and radiobuttons in Treatment parameters should disable");
		
		demo.BydefaultisEnabled(prescription.Site, "Site", test,driver);
		demo.BydefaultisEnabled(prescription.Template, "Template", test,driver);
		demo.BydefaultisEnabled(prescription.TargetPrescriptionDose, "TargetPrescriptionDose", test,driver);
		demo.BydefaultisEnabled(prescription.MinimumDose, "MinimumDose", test,driver);
		demo.BydefaultisEnabled(prescription.MaximumDose, "MaximumDose", test,driver);
		demo.BydefaultisEnabled(prescription.NumberOfFractions, "NumberOfFractions", test,driver);
		demo.BydefaultisEnabled(prescription.PlanIntent, "PlanIntent", test,driver);
		demo.BydefaultisEnabled(prescription.PrescribedMachine, "PrescribedMachine", test,driver);
		demo.BydefaultisEnabled(prescription.BeamType, "BeamType", test,driver);
		demo.BydefaultisEnabled(prescription.RadiationType, "RadiationType", test,driver);
		demo.BydefaultisEnabled(prescription.Energy, "Energy", test,driver);
		demo.BydefaultisEnabled(prescription.Technique, "Technique", test,driver);
		demo.BydefaultisEnabled(prescription.GatingNo, "GatingNo", test,driver);
		demo.BydefaultisEnabled(prescription.GatingYes, "GatingYes", test,driver);
		demo.BydefaultisEnabled(prescription.BolusYes, "BolusYes", test,driver);
		demo.BydefaultisEnabled(prescription.BolusNo, "BolusNo", test,driver);
		demo.BydefaultisEnabled(prescription.ReviewCycle, "ReviewCycle", test,driver);
		demo.BydefaultisEnabled(prescription.CBCCycle, "CBCCyclelabel", test,driver);
		demo.BydefaultisEnabled(prescription.Physician, "Physician", test,driver);
		demo.BydefaultisEnabled(prescription.CT_ID, "CT_ID", test,driver);
		demo.BydefaultisEnabled(prescription.MRI, "MRI", test,driver);
		demo.BydefaultisEnabled(prescription.PET_CT_ID, "PET_CT_ID", test,driver);
		demo.BydefaultisEnabled(prescription.OARAdd, "OARAdd", test,driver);
		demo.isEnabled(prescription.PatientImmobilzationsetupbutton, "IMDbuton", test,driver);
		demo.isEnabled(prescription.Edit, "Edit", test,driver);
		
	 }

	
	   @Test(priority =171)
	   public void PrecsriptionOAR() throws IOException, InterruptedException
	   {
	   	act.moveToElement(prescription.Save).click().perform();
	   	test = extent.createTest("===========Prescription Save=========");
	   	test = extent.createTest(funTestCaseName()+" : Click on the Prescription, Save the data");
	    if(!(prescription.SitePhase.get(0).getAttribute("HelpText").equals("New Site,Phase"))) 
	    	   prescription.Addtab.click();
	   	SiteText1=Roleselection(test, 0);
		Validweight1(prescription.TargetPrescriptionDose,"10000",driver,test);
		Validweight1(prescription.MinimumDose,"1",driver,test);
		Validweight1(prescription.MaximumDose,"10000",driver,test);
		Validweight1(prescription.NumberOfFractions,"99",driver,test);
	   	PlanIntent1=Roleselection(test, 2);
	   	BeamType1=Roleselection(test, 4);	
	   	RadationType1=Roleselection(test, 5);
	   	Energy1=Roleselection(test, 6);
		Setuptechnique1=Roleselection(test, 7);
		Physician1=Roleselection(test, 8);
		act.moveToElement(prescription.GatingYes).moveByOffset(-3,0).click().perform();
	   
		act.moveToElement(prescription.BolusNo).click().perform();
		Validweight1(prescription.IGRTCycle,"99",driver,test);
		
		Validweight1(prescription.ReviewCycle,"99",driver,test);
		Validweight1(prescription.CBCCycle,"99",driver,test);
		
		Validweight1(prescription.CT_ID,"120",driver,test);
		Validweight1(prescription.MRI,"100",driver,test);
		Validweight1(prescription.PET_CT_ID,"300",driver,test);
		

	   	prescription.OARAdd.click();
	   	
	   	Validweight1(prescription.OARName, "Heart039837",driver,test);
	   	Validweight1(prescription.OARMinDose, "70",driver,test);
	   	Validweight1(prescription.OARMaxDose, "90",driver,test);
	   	
	   	prescription.OARInsertButton.click();
	   	prescription.OARCloseButton.click();
	   	Thread.sleep(1000);
	   	
	   	datagrid(0,"Heart039837","70","90",test,driver);
	   	Thread.sleep(1000);
	   	act.moveToElement(prescription.Save).click().perform();
	   	Sitesave1("Prescription Save", "Prescription data saved for selected site and phase.", "Prescription Save", "Prescription data saved for selected site and phase.", 0, driver,test);
	   	test = extent.createTest(funTestCaseName()+" : Prescription saved,  Button should be enabled and disabled");
	   	demo.isEnabled(prescription.Demographics, "Demographics", test, driver);
	   	demo.isEnabled(prescription.Prescription, "Presription", test, driver);
	   	demo.isEnabled(prescription.PlanAprroval, "Plan Approval", test, driver);
		demo.BydefaultisEnabled(prescription.Scheudling, "Scheudling", test, driver);
		demo.isEnabled(prescription.Vitals, "Vitals", test, driver);
		demo.isEnabled(prescription.LabReports, "LabReports", test, driver);
		demo.BydefaultisEnabled(prescription.TreatmentReview, "TreatmentReview", test, driver);
	   
	   
	   
	   }
	   
	  
	   
	   @Test(priority =172)
	   public void SaveDataeditforpost() throws IOException, InterruptedException
	   {
	   	Thread.sleep(1000);
	   	test = extent.createTest(funTestCaseName()+" : Click on the Prescription Save, Edit button should be enable");
	   	demo.isEnabled(prescription.Edit, "EDIT",test, driver);
	   	test = extent.createTest(funTestCaseName()+" : Click on the Prescription Edit,Update button should be displayed");
	   	Thread.sleep(2000);
	   	act.moveToElement(prescription.Edit).click().perform();
	   	demo.isEnabled(prescription.Update, "UPDATE",test, driver);
	   	Thread.sleep(1000);
	   	test = extent.createTest(funTestCaseName()+" : Click on the Prescription Edit,Without modify click on the Update");
	   	Editcomparison(0, SiteText1,test,driver);
	   	EditText(prescription.TargetPrescriptionDose, "10000",test,driver);
		EditText(prescription.MinimumDose, "1",test,driver);
		EditText(prescription.MaximumDose, "10000",test,driver);
		EditText(prescription.NumberOfFractions, "99",test,driver);
	   	
	   	Editcomparison(2, PlanIntent1,test,driver);
	   	Editcomparison(4, BeamType1,test,driver);
	 	Editcomparison(5, RadationType1,test,driver);
	 	Editcomparison(6, Energy1,test,driver);
		Editcomparison(7, Setuptechnique1,test,driver);
		Editcomparison(8, Physician1,test,driver);
		demo.isSelected(prescription.GatingYes, "Gatingyes",test, driver);
		demo.isSelected(prescription.BolusNo, "BolusNo",test, driver);
		EditText(prescription.IGRTCycle, "99",test,driver);
		EditText(prescription.ReviewCycle, "99",test,driver);
		EditText(prescription.CBCCycle, "99",test,driver);
		EditText(prescription.CT_ID, "120",test,driver);
		EditText(prescription.MRI, "100",test,driver);
		EditText(prescription.PET_CT_ID, "300",test,driver);
	   
	 	datagrid(0,"Heart039837","70","90",test,driver);
	   	Thread.sleep(1000);
	   	act.moveToElement(prescription.Update).click().perform();
	   	Sitesave1("Prescription Update","Prescription data updated for selected site and phase.", "Prescription Update","Prescription data updated for selected site and phase.", 0, driver,test);
	   	test = extent.createTest(funTestCaseName()+" : Prescription saved,  Button should be enabled and disabled");
	   	demo.isEnabled(prescription.Demographics, "Demographics", test, driver);
	   	demo.isEnabled(prescription.Prescription, "Presription", test, driver);
	   	demo.isEnabled(prescription.PlanAprroval, "Plan Approval", test, driver);
		demo.BydefaultisEnabled(prescription.Scheudling, "Scheudling", test, driver);
		demo.isEnabled(prescription.Vitals, "Vitals", test, driver);
		demo.isEnabled(prescription.LabReports, "LabReports", test, driver);
		demo.BydefaultisEnabled(prescription.TreatmentReview, "TreatmentReview", test, driver);
	   }

	  @Test(priority =173)
	   public void PrescriptionEdit() throws IOException, InterruptedException
	   {
	   	test = extent.createTest("===========Prescription EDIT AND MODIFY=========");
	   	test = extent.createTest(funTestCaseName()+" : Prescription Edit and Update the data");
	   	act.moveToElement(prescription.Edit).click().perform();
	   
	   	prescription.TargetPrescriptionDose.clear();
		Validweight1(prescription.TargetPrescriptionDose,"100",driver,test);
		prescription.MinimumDose.clear();
		Validweight1(prescription.MinimumDose,"10",driver,test);
		prescription.MaximumDose.clear();
		Validweight1(prescription.MaximumDose,"100",driver,test);
		prescription.NumberOfFractions.clear();
		Validweight1(prescription.NumberOfFractions,"10",driver,test);
	   	PlanIntent11=Roleselection(test, 2);
	   	BeamType11=Roleselection(test, 4);	
	   	RadationType11=Roleselection(test, 5);
	   	Energy11=Roleselection(test, 6);
		Setuptechnique11=Roleselection(test, 7);
		Physician11=Roleselection(test, 8);
		act.moveToElement(prescription.BolusYes).moveByOffset(-3,0).click().perform();
		act.moveToElement(prescription.GatingNo).click().perform();
		prescription.IGRTCycle.clear();
		Validweight1(prescription.IGRTCycle,"1",driver,test);
		prescription.ReviewCycle.clear();
		Validweight1(prescription.ReviewCycle,"1",driver,test);
		prescription.CBCCycle.clear();
		Validweight1(prescription.CBCCycle,"1",driver,test);
		prescription.CT_ID.clear();
		Validweight1(prescription.CT_ID,"1CTH2673",driver,test);
		prescription.MRI.clear();
		Validweight1(prescription.MRI,"1HJ_983",driver,test);
		prescription.PET_CT_ID.clear();
		Validweight1(prescription.PET_CT_ID,"1*263573",driver,test);
		

	   	prescription.OARAdd.click();
	   	
	   	Validweight1(prescription.OARName, "HeadRight",driver,test);
	   	Validweight1(prescription.OARMinDose, "20",driver,test);
	   	Validweight1(prescription.OARMaxDose, "37",driver,test);
	   	
	   	prescription.OARInsertButton.click();
	   	prescription.OARCloseButton.click();
	   	Thread.sleep(1000);
	   	
	   	datagrid(0,"Heart039837","70","90",test,driver);
	  	datagrid(1,"HeadRight","20","37",test,driver);
	   	Thread.sleep(1000);	
	   	
	   act.moveToElement(prescription.Update).click().perform();
	   	Sitesave1("Prescription Update","Prescription data updated for selected site and phase.", "Prescription Update","Prescription data updated for selected site and phase.", 0, driver,test);
	   	test = extent.createTest(funTestCaseName()+" : Prescription saved,  Button should be enabled and disabled");
	   	demo.isEnabled(prescription.Demographics, "Demographics", test, driver);
	   	demo.isEnabled(prescription.Prescription, "Presription", test, driver);
	   	demo.isEnabled(prescription.PlanAprroval, "Plan Approval", test, driver);
		demo.BydefaultisEnabled(prescription.Scheudling, "Scheudling", test, driver);
		demo.isEnabled(prescription.Vitals, "Vitals", test, driver);
		demo.isEnabled(prescription.LabReports, "LabReports", test, driver);
		demo.BydefaultisEnabled(prescription.TreatmentReview, "TreatmentReview", test, driver);
	   }

	  @Test(priority =174)
	   public void Editcomprasionpost() throws IOException, InterruptedException
	   {
	   	test = extent.createTest(funTestCaseName()+" : Click on the Prescription Edit,Update button should be displayed");
	   	Thread.sleep(1000);
	   	act.moveToElement(prescription.Edit).click().perform();
	   	demo.isEnabled(prescription.Update, "UPDATE",test, driver);
	   	Thread.sleep(1000);
	   	test = extent.createTest(funTestCaseName()+" : Click on the Prescription Edit, modify data click on the Update");
	   	Editcomparison(0, SiteText1,test,driver);
	   	EditText(prescription.TargetPrescriptionDose, "100",test,driver);
		EditText(prescription.MinimumDose, "10",test,driver);
		EditText(prescription.MaximumDose, "100",test,driver);
		EditText(prescription.NumberOfFractions, "10",test,driver);
	   	
	   	Editcomparison(2, PlanIntent11,test,driver);
	   	Editcomparison(4, BeamType11,test,driver);
	 	Editcomparison(5, RadationType11,test,driver);
	 	Editcomparison(6, Energy11,test,driver);
		Editcomparison(7, Setuptechnique11,test,driver);
		Editcomparison(8, Physician11,test,driver);
		demo.isSelected(prescription.BolusYes, "Gatingyes",test, driver);
		demo.isSelected(prescription.GatingNo, "BolusNo",test, driver);
		EditText(prescription.IGRTCycle, "1",test,driver);
		EditText(prescription.ReviewCycle, "1",test,driver);
		EditText(prescription.CBCCycle, "1",test,driver);
		EditText(prescription.CT_ID, "1CTH2673",test,driver);
		EditText(prescription.MRI, "1HJ_983",test,driver);
		EditText(prescription.PET_CT_ID, "1*263573",test,driver);
	   
	 	datagrid(0,"Heart039837","70","90",test,driver);
	 	datagrid(1,"HeadRight","20","37",test,driver);
	   	Thread.sleep(1000);
	   	act.moveToElement(prescription.Update).click().perform();
	   	Sitesave1("Prescription Update","Prescription data updated for selected site and phase.", "Prescription Update","Prescription data updated for selected site and phase.", 0, driver,test);
	   	test = extent.createTest(funTestCaseName()+" : Prescription saved,  Button should be enabled and disabled");
	   	demo.isEnabled(prescription.Demographics, "Demographics", test, driver);
	   	demo.isEnabled(prescription.Prescription, "Presription", test, driver);
	   	demo.isEnabled(prescription.PlanAprroval, "Plan Approval", test, driver);
		demo.BydefaultisEnabled(prescription.Scheudling, "Scheudling", test, driver);
		demo.isEnabled(prescription.Vitals, "Vitals", test, driver);
		demo.isEnabled(prescription.LabReports, "LabReports", test, driver);
		demo.BydefaultisEnabled(prescription.TreatmentReview, "TreatmentReview", test, driver);
	   }

	   
	   
	  
	   
	   @Test(priority =175) 
		  public void PrescriptionAdd() throws IOException, InterruptedException
		  {
			 	test = extent.createTest("===========Prescription Save for the IMD=========");
			  test = extent.createTest(funTestCaseName()+" To verify Add OAR,IMD devices and delete in edit time");
		       if(!(prescription.SitePhase.get(0).getAttribute("HelpText").equals("New Site,Phase"))) 
		       {
		    	   prescription.Addtab.click();
		       }
		   	SiteText2=Roleselection(test, 0);
			Validweight1(prescription.TargetPrescriptionDose,"198",driver,test);
			Validweight1(prescription.MinimumDose,"13",driver,test);
			Validweight1(prescription.MaximumDose,"34",driver,test);
			Validweight1(prescription.NumberOfFractions,"15",driver,test);
		   	PlanIntent2=Roleselection(test, 2);
		   	BeamType2=Roleselection(test, 4);	
		   	RadationType2=Roleselection(test, 5);
		   	Energy2=Roleselection(test, 6);
			Setuptechnique2=Roleselection(test, 7);
			Physician2=Roleselection(test, 8);
			act.moveToElement(prescription.GatingYes).moveByOffset(-3,0).click().perform();
			act.moveToElement(prescription.BolusYes).moveByOffset(-3,0).click().perform();
		  
			Validweight1(prescription.IGRTCycle,"11",driver,test);
			
			Validweight1(prescription.ReviewCycle,"12",driver,test);
			Validweight1(prescription.CBCCycle,"13",driver,test);
			
			Validweight1(prescription.CT_ID,"0933",driver,test);
			Validweight1(prescription.MRI,"8373",driver,test);
			Validweight1(prescription.PET_CT_ID,"37474",driver,test);
			

		   	prescription.OARAdd.click();
		   	
		   	Validweight1(prescription.OARName, "BrainLeft",driver,test);
		   	Validweight1(prescription.OARMinDose, "29",driver,test);
		   	Validweight1(prescription.OARMaxDose, "37",driver,test);
		   	
		   	prescription.OARInsertButton.click();
		   	prescription.OARCloseButton.click();
		   	Thread.sleep(1000);
		   	
	        prescription.OARAdd.click();
		   	
		   	Validweight1(prescription.OARName, "BrainRight",driver,test);
		   	Validweight1(prescription.OARMinDose, "37",driver,test);
		   	Validweight1(prescription.OARMaxDose, "180",driver,test);
		   	
		   	prescription.OARInsertButton.click();
		   	prescription.OARCloseButton.click();
		   	Thread.sleep(1000);
		   	
	         prescription.OARAdd.click();
		   	
		   	Validweight1(prescription.OARName, "BrainCenter",driver,test);
		   	Validweight1(prescription.OARMinDose, "2",driver,test);
		   	Validweight1(prescription.OARMaxDose, "10",driver,test);
		   	
		   	prescription.OARInsertButton.click();
		   	prescription.OARCloseButton.click();
		   	Thread.sleep(1000);
		   	
			datagrid(0,"BrainLeft","29","37",test,driver);
		   	datagrid(1,"BrainRight","37","180",test,driver);
			datagrid(2,"BrainCenter","2","10",test,driver);
		   	
		   	prescription.IMDdevice.click();
		   	Thread.sleep(2000);
		   	prescription.Checkbox.get(2).click();
			demo.isSelected(prescription.Checkbox.get(2),"Head and Shoulder Base plate",test,driver);
			Thread.sleep(2000);
		 
		   	act.moveToElement(prescription.Save).click().perform();
		   	Sitesave1("Prescription Save", "Prescription data saved for selected site and phase.", "Prescription Save", "Prescription data saved for selected site and phase.", 0, driver,test);
		   	test = extent.createTest(funTestCaseName()+" : Prescription saved,  Button should be enabled and disabled");
		   	demo.isEnabled(prescription.Demographics, "Demographics", test, driver);
		   	demo.isEnabled(prescription.Prescription, "Presription", test, driver);
		   	demo.isEnabled(prescription.PlanAprroval, "Plan Approval", test, driver);
			demo.BydefaultisEnabled(prescription.Scheudling, "Scheudling", test, driver);
			demo.isEnabled(prescription.Vitals, "Vitals", test, driver);
			demo.isEnabled(prescription.LabReports, "LabReports", test, driver);
			demo.BydefaultisEnabled(prescription.TreatmentReview, "TreatmentReview", test, driver);
		        
		  }
		   
		   
		  @Test(priority =176)
		   public void SaveDataeditforIMD() throws IOException, InterruptedException
		   {
		   	Thread.sleep(1000);
		   	test = extent.createTest(funTestCaseName()+" : Click on the Prescription Save, Edit button should be enable");
		   	demo.isEnabled(prescription.Edit, "EDIT",test, driver);
		   	test = extent.createTest(funTestCaseName()+" : Click on the Prescription Edit,Update button should be displayed");
		   	Thread.sleep(2000);
		   	act.moveToElement(prescription.Edit).click().perform();
		   	demo.isEnabled(prescription.Update, "UPDATE",test, driver);
		   	Thread.sleep(1000);
		   	test = extent.createTest(funTestCaseName()+" : Click on the Prescription Edit,Without modify click on the Update");
		   	Editcomparison(0, SiteText2,test,driver);
		   	EditText(prescription.TargetPrescriptionDose, "198",test,driver);
			EditText(prescription.MinimumDose, "13",test,driver);
			EditText(prescription.MaximumDose, "34",test,driver);
			EditText(prescription.NumberOfFractions, "15",test,driver);
		   	
		   	Editcomparison(2, PlanIntent2,test,driver);
		   	Editcomparison(4, BeamType2,test,driver);
		 	Editcomparison(5, RadationType2,test,driver);
		 	Editcomparison(6, Energy2,test,driver);
			Editcomparison(7, Setuptechnique2,test,driver);
			Editcomparison(8, Physician2,test,driver);
			demo.isSelected(prescription.GatingYes, "Gatingyes",test, driver);
			demo.isSelected(prescription.BolusYes, "BolusYes",test, driver);
			EditText(prescription.IGRTCycle, "11",test,driver);
			EditText(prescription.ReviewCycle, "12",test,driver);
			EditText(prescription.CBCCycle, "13",test,driver);
			EditText(prescription.CT_ID, "0933",test,driver);
			EditText(prescription.MRI, "8373",test,driver);
			EditText(prescription.PET_CT_ID, "37474",test,driver);
			Thread.sleep(2000);
			datagrid(0,"BrainLeft","29","37",test,driver);
		   	datagrid(1,"BrainRight","37","180",test,driver);
			datagrid(2,"BrainCenter","2","10",test,driver);
			Thread.sleep(2000);
		   	
			prescription.IMDdevice.click();
			Thread.sleep(1000);
			demo.isSelected(prescription.Checkbox.get(2),"Head and Shoulder Base plate",test,driver);
			Thread.sleep(1000);
		   	act.moveToElement(prescription.Update).click().perform();
		   	Sitesave1("Prescription Update","Prescription data updated for selected site and phase.", "Prescription Update","Prescription data updated for selected site and phase.", 0, driver,test);
		   	test = extent.createTest(funTestCaseName()+" : Prescription saved,  Button should be enabled and disabled");
		   	demo.isEnabled(prescription.Demographics, "Demographics", test, driver);
		   	demo.isEnabled(prescription.Prescription, "Presription", test, driver);
		   	demo.isEnabled(prescription.PlanAprroval, "Plan Approval", test, driver);
			demo.BydefaultisEnabled(prescription.Scheudling, "Scheudling", test, driver);
			demo.isEnabled(prescription.Vitals, "Vitals", test, driver);
			demo.isEnabled(prescription.LabReports, "LabReports", test, driver);
			demo.BydefaultisEnabled(prescription.TreatmentReview, "TreatmentReview", test, driver);
			Thread.sleep(1000);
		   } 
		   
		   
		   
		   @Test(priority =177)
		   public void PrecriptionEditIMD() throws IOException, InterruptedException
		   {
		   	test = extent.createTest("===========Prescription EDIT AND MODIFY for IMD=========");
		   	test = extent.createTest(funTestCaseName()+" : Prescription Edit and Update the data");
		   	act.moveToElement(prescription.Edit).click().perform();
		   
		   	prescription.TargetPrescriptionDose.clear();
			Validweight1(prescription.TargetPrescriptionDose,"298",driver,test);
			prescription.MinimumDose.clear();
			Validweight1(prescription.MinimumDose,"20",driver,test);
			prescription.MaximumDose.clear();
			Validweight1(prescription.MaximumDose,"30",driver,test);
			prescription.NumberOfFractions.clear();
			Validweight1(prescription.NumberOfFractions,"40",driver,test);
		   	PlanIntent21=Roleselection(test, 2);
		   	BeamType21=Roleselection(test, 4);	
		   	RadationType21=Roleselection(test, 5);
		   	Energy21=Roleselection(test, 6);
			Setuptechnique21=Roleselection(test, 7);
			Physician21=Roleselection(test, 8);
			act.moveToElement(prescription.BolusYes).moveByOffset(-3,0).click().perform();
			act.moveToElement(prescription.GatingYes).moveByOffset(-3,0).click().perform();
			prescription.IGRTCycle.clear();
			Validweight1(prescription.IGRTCycle,"12",driver,test);
			prescription.ReviewCycle.clear();
			Validweight1(prescription.ReviewCycle,"16",driver,test);
			prescription.CBCCycle.clear();
			Validweight1(prescription.CBCCycle,"18",driver,test);
			prescription.CT_ID.clear();
			Validweight1(prescription.CT_ID,"KUEYE9373",driver,test);
			prescription.MRI.clear();
			Validweight1(prescription.MRI,"KJDH_39739",driver,test);
			prescription.PET_CT_ID.clear();
			Validweight1(prescription.PET_CT_ID,"FKJHF_398987",driver,test);
			

		   	prescription.OARAdd.click();
		   	
		   	Validweight1(prescription.OARName, "OARTest",driver,test);
		   	Validweight1(prescription.OARMinDose, "67",driver,test);
		   	Validweight1(prescription.OARMaxDose, "89",driver,test);
		   	
		   	prescription.OARInsertButton.click();
		   	prescription.OARCloseButton.click();
		   	Thread.sleep(1000);
		   	
		   	datagrid(0,"BrainLeft","29","37",test,driver);
		   	datagrid(1,"BrainRight","37","180",test,driver);
			datagrid(2,"BrainCenter","2","10",test,driver);
			datagrid(3,"OARTest","67","89",test,driver);
		   	Thread.sleep(1000);
		  
		   	datadelete(0,test,driver);
		   	Sitesave1("OAR Constraints Delete","Do you want to delete the selected OAR Constraints?", "OAR Constraints Delete","Do you want to delete the selected OAR Constraints?", 0, driver,test);
		   	try {
		   		Sitesave1("OAR Delete","Selected OAR Constraints deleted.", "OAR Delete","Selected OAR Constraints deleted.", 0, driver,test);
		   	}
		   	catch(Exception e)
		   	{
		   		test.info("No pop-up displayed");
		   	}
		   
		   	
		   	datagrid(0,"BrainRight","37","180",test,driver);
			datagrid(1,"BrainCenter","2","10",test,driver);
			datagrid(2,"OARTest","67","89",test,driver);
			
			//prescription.IMDdevice.click();
			//prescription.Checkbox.get(2).click();
			//act.moveToElement(prescription.Checkbox.get(2)).click().perform();
			//demo.BydefaultisSelected(prescription.Checkbox.get(2)," Knee fix Feet fix system checkbox", test, driver);
	     	//Thread.sleep(1000);
			//act.moveToElement(prescription.Checkbox.get(0)).click().perform();
			//demo.isSelected(prescription.Checkbox.get(0), "Head and Shoulder checkbox",test,driver);
			//Thread.sleep(2000);
		    act.moveToElement(prescription.Update).click().perform();
		   	Sitesave1("Prescription Update","Prescription data updated for selected site and phase.", "Prescription Update","Prescription data updated for selected site and phase.", 0, driver,test);
		   	test = extent.createTest(funTestCaseName()+" : Prescription saved,  Button should be enabled and disabled");
		   	demo.isEnabled(prescription.Demographics, "Demographics", test, driver);
		   	demo.isEnabled(prescription.Prescription, "Presription", test, driver);
		   	demo.isEnabled(prescription.PlanAprroval, "Plan Approval", test, driver);
			demo.BydefaultisEnabled(prescription.Scheudling, "Scheudling", test, driver);
			demo.isEnabled(prescription.Vitals, "Vitals", test, driver);
			demo.isEnabled(prescription.LabReports, "LabReports", test, driver);
			demo.BydefaultisEnabled(prescription.TreatmentReview, "TreatmentReview", test, driver);
		   }
		   @Test(priority =178)
		   public void EditcomprasionIMD() throws IOException, InterruptedException
		   {
		   	test = extent.createTest(funTestCaseName()+" : Click on the Prescription Edit,Update button should be displayed");
		   	Thread.sleep(1000);
		   	act.moveToElement(prescription.Edit).click().perform();
		   	Thread.sleep(2000);
		   	demo.isEnabled(prescription.Update, "UPDATE",test, driver);
		   	Thread.sleep(1000);
		   	test = extent.createTest(funTestCaseName()+" : Click on the Prescription Edit, modify data click on the Update");
		   	Editcomparison(0, SiteText2,test,driver);
		   	EditText(prescription.TargetPrescriptionDose, "298",test,driver);
			EditText(prescription.MinimumDose, "20",test,driver);
			EditText(prescription.MaximumDose, "30",test,driver);
			EditText(prescription.NumberOfFractions, "40",test,driver);
		   	
		   	Editcomparison(2, PlanIntent21,test,driver);
		   	Editcomparison(4, BeamType21,test,driver);
		 	Editcomparison(5, RadationType21,test,driver);
		 	Editcomparison(6, Energy21,test,driver);
			Editcomparison(7, Setuptechnique21,test,driver);
			Editcomparison(8, Physician21,test,driver);
			demo.isSelected(prescription.BolusYes, "Gatingyes",test, driver);
			demo.isSelected(prescription.GatingYes, "BolusNo",test, driver);
			EditText(prescription.IGRTCycle, "12",test,driver);
			EditText(prescription.ReviewCycle, "16",test,driver);
			EditText(prescription.CBCCycle, "18",test,driver);
			EditText(prescription.CT_ID, "KUEYE9373",test,driver);
			EditText(prescription.MRI, "KJDH_39739",test,driver);
			EditText(prescription.PET_CT_ID, "1*FKJHF_398987",test,driver);
		   
			datagrid(0,"BrainRight","37","180",test,driver);
			datagrid(1,"BrainCenter","2","10",test,driver);
			datagrid(2,"OARTest","67","89",test,driver);
			
			prescription.IMDdevice.click();
			Thread.sleep(1000);
			demo.isSelected(prescription.Checkbox.get(0), "Head and Shoulder checkbox",test,driver);
			//demo.isSelected(prescription.Checkbox.get(2), "Knee fix",test,driver);
		   	//Thread.sleep(1000);
			
		   	act.moveToElement(prescription.Update).click().perform();
		   	Sitesave1("Prescription Update","Prescription data updated for selected site and phase.", "Prescription Update","Prescription data updated for selected site and phase.", 0, driver,test);
		   	test = extent.createTest(funTestCaseName()+" : Prescription saved,  Button should be enabled and disabled");
		   	demo.isEnabled(prescription.Demographics, "Demographics", test, driver);
		   	demo.isEnabled(prescription.Prescription, "Presription", test, driver);
		   	demo.isEnabled(prescription.PlanAprroval, "Plan Approval", test, driver);
			demo.BydefaultisEnabled(prescription.Scheudling, "Scheudling", test, driver);
			demo.isEnabled(prescription.Vitals, "Vitals", test, driver);
			demo.isEnabled(prescription.LabReports, "LabReports", test, driver);
			demo.BydefaultisEnabled(prescription.TreatmentReview, "TreatmentReview", test, driver);
		   }

		   
		   public void datadelete(int i,ExtentTest test,WebDriver driver) throws IOException, InterruptedException
		   {
		   	List<WebElement> Listrow = driver.findElements(By.className("DataGridRow"));
		   	WebElement element=Listrow.get(i);
		   	WebElement Delete=element.findElements(By.className("DataGridCell")).get(0);
		   	demo.isEnabled(Delete, "Delete", test, driver);
		   	Delete.click();	
		   }
		   
		
		   
		   public void Validweight1(WebElement element, String Text,WebDriver driver,ExtentTest test) throws IOException
		   {
		   	element.click();
		   	driver.switchTo().activeElement().sendKeys(Text);
		   	demo.Textcomparsion(element, Text, test, driver);
		   }


		   public void datagrid(int i,String ES,String ED, String ER, ExtentTest test,WebDriver driver) throws IOException
		   {
			WebElement OARgrid=driver.findElement(By.xpath("//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection1View\"]/DataGrid[@AutomationId=\"Oardatagrid\"]"));
			List<WebElement> Listrow = OARgrid.findElements(By.className("DataGridRow"));
			WebElement element=Listrow.get(i);
			WebElement Delete=element.findElements(By.className("DataGridCell")).get(0);
			demo.isEnabled(Delete, "Delete", test, driver);
			WebElement Symptom=element.findElements(By.className("DataGridCell")).get(1);
			String Symptomtext=Symptom.getText();
			demo.Textcomparsion(Symptom, ES, test, driver);
			WebElement Drug=element.findElements(By.className("DataGridCell")).get(2);
			String Drugtext=Drug.getText();
			demo.Textcomparsion(Drug, ED, test, driver);
			WebElement Remarks=element.findElements(By.className("DataGridCell")).get(3);
			String Remarkstext=Remarks.getText();
			demo.Textcomparsion(Remarks, ER, test, driver);
			//WebElement DateandTime=element.findElements(By.className("DataGridCell")).get(4);
		}	
			

		   public void Editcomparison(int i, String Text,ExtentTest test,WebDriver driver) throws IOException
		   {
		   	WebElement element = driver.findElements(By.className("ComboBox")).get(i);
		   	demo.Textcomparsion(element, Text, test, driver);

		   }
		   public void EditText(WebElement element, String Text,ExtentTest test,WebDriver driver) throws IOException
		   {
		   	element.click();
		   	demo.Textcomparsion(element, Text, test, driver);

		   }
		 
		 
		
		

		    ArrayList<String> Phases;
		  		public ArrayList<String> SiteTabs(List<WebElement> text) throws InterruptedException {
		  			
		  			 Phases = new ArrayList<String>();
		  			Iterator<WebElement> itr1 = text.iterator();
		  			
		  			while (itr1.hasNext()) {
		  				WebElement li = itr1.next();
		  				if(li.isDisplayed()) {
		  				System.out.print(li.getAttribute("HelpText")); 
		  				Phases.add(li.getAttribute("HelpText"));
		  				}
		  			}
		  			Phases.remove(Phases.size()-1);
		  			return Phases;
		  		}








		  		ArrayList<String> OArList;

		  		public ArrayList<String> setOARDatatoArray() {
		  			OArList.add(prescription.OARName.getText() + "," + prescription.OARMinDose.getText() + "," + prescription.OARMaxDose.getText() + ","+ prescription.OARMeanDose.getText() + "," + prescription.OARDescription.getText());
		  			return OArList;
		  		}




	public void Referenceprescriptionlate(WebElement element,String Text,ExtentTest test,WebDriver driver) throws IOException
	{
		element.click();
		element.sendKeys(Text);
		prescription.Save.click();
		demo.Textcomparsion(element, Text, test,driver);
	}

	public String Dropdown1(WebElement drop1, String[] A, int i, String DropdownName, ExtentTest test1)
			throws InterruptedException {

		boolean a, a1 = drop1.isEnabled();
		if (a = drop1.isDisplayed()) {
			if (a1) {
				drop1.click();
				Thread.sleep(500);
				WebElement site = driver.findElement(By.name(A[i]));
				Thread.sleep(600);
				act.moveToElement(site).click().perform();
				if (drop1.getText().equals(site.getText()))
					test1.pass(drop1.getText() + " is  displayed in " + DropdownName + " dropdown");
				else
					test1.pass(drop1.getText() + " is not displayed in " + DropdownName + "dropdown");
			}
		}
		return A[i];
	}
		


	@AfterClass
	public void tearDown() {
	    // Flush the Extent Reports after all tests in the class
	    extent.flush();
	}
	@AfterClass
	public void quit() throws InterruptedException
	{
		driver.quit();
		 Thread.sleep(5000);
	}



		
	}

