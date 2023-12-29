package com.krystal.project;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.windows.WindowsDriver;



public class TemplatesFun extends ReferencefileChemotheraphy{

	private TemplatePOM Temp;
	private Actions act;
	private Actions action;

	@Test(priority =0)
	public void Launch()  throws InterruptedException, IOException {
//	DesiredCapabilities appCapabilities = new DesiredCapabilities();
//	appCapabilities.setCapability("app", "C:\\Program Files\\Panacea Medical Technologies\\Krystal\\Krystal.exe");
//	driver = new WindowsDriver<WebElement>(new URL("http://127.0.0.1:4723"), appCapabilities);
	ReferenceSigin Sign=new ReferenceSigin();
	Sign.Login(driver);
	Sign.Templates(driver);
	Temp=new TemplatePOM(driver);
	action=new Actions(driver);
	act=new Actions(driver);
	}

	

	
	@Test(priority = 1)
	public void SaveButtonEnable() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName() + " : Save button ","Save button should be enable by default");
        Temp.OARAdd.click();
        Temp.OARCloseButton.click();
		demo.isEnabled(Temp.Save, "SAVE", test,driver);
	}
	

	@Test(priority = 1)
	public void defaultsaveclick() throws IOException
	{
		test = extent.createTest(funTestCaseName() + ":Empty data click on the Save ","Error messages should get display");
		if(Temp.Save.isEnabled())
		{
		Temp.Save.click();
		demo.isdisplayed(Temp.Siteerror1, "Please Select any site",test, driver);
		demo.isdisplayed(Temp.Templateerror, "Please enter a name for the template",test, driver);
		demo.isdisplayed(Temp.Inputblank, "Input cannot be blank",test, driver);
		}
		else
		{
			test.fail("Save Button not enabled");
		}
		
	}
	

	@Test(priority = 3)
	public void Sitedropdowndefault() throws InterruptedException, IOException {
		test = extent.createTest("================SiteTemplate=================");
		test = extent.createTest(funTestCaseName() + " : Default data in site dropdown should be Displayed");
        demo.Textcomparsion(Temp.Site, "Select any site", test,driver);
	}
	
	
	
	@Test(priority = 4)
	public void Siteselction() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName() + " : Site Selection from the dropdown ", "Selected site should be displayed in the dropdown");
		RoleselectionText(test,0);
	}
	
	
	
	@Test(priority = 11)
	public void Templatetextfieldifenteredalphabets()
			throws InterruptedException, IOException {
		test = extent.createTest("================Template Name=================");
		test = extent.createTest(funTestCaseName()+ " :  To verify the functionality of Entering Alphabets in Template Name textfield ",
         "Template Name Textfield should accept the Alphabets");
		Temp.TemplateName.sendKeys("Head_Template");
		Temp.Save.click();
		demo.Textcomparsion(Temp.TemplateName, "Head_Template", test,driver);
		Temp.TemplateName.clear();
	}

	@Test(priority = 15)
	public void Templatetextfieldifenteringnumbers()
			throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+ " :  To verify the functionality of Entering Numbers in Template Name textfield ",
				"Template Name Textfield should accept the Numbers");
		Temp.TemplateName.sendKeys("52654354");
		Temp.Save.click();
		demo.Textcomparsion(Temp.TemplateName, "52654354", test,driver);
		Temp.TemplateName.clear();
	}

	@Test(priority = 16)
	public void TemplatetextfieldifenteredSpecialcharcters()
			throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+ " :  To verify the functionality of Entering Specailchar( \\,\'\',\') in Template Name textfield ",
				"Template Name Textfield should not accept the special charater ");
		Temp.TemplateName.sendKeys("\\&*)(");
		Temp.Save.click();
		demo.Textcomparsion(Temp.warnmsg.get(0), "Input must not contain \\ , \'' , \'", test,driver);
		Temp.TemplateName.clear();
		Temp.TemplateName.sendKeys("}\'");
		Temp.Save.click();
		demo.Textcomparsion(Temp.warnmsg.get(0), "Input must not contain \\ , \'' , \'", test,driver);
		Temp.TemplateName.clear();
		Temp.TemplateName.sendKeys("?#@34\'\'");
		Temp.Save.click();
		demo.Textcomparsion(Temp.warnmsg.get(0), "Input must not contain \\ , \'' , \'", test,driver);
		Temp.TemplateName.clear();
	}
	
	@Test(priority = 18)
	public void TemplatetextfieldifenteringAlphanumeric()
			throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName()+ " :  To verify the functionality of Enteringalphanumeric texts ",
				"Template Name Textfield should accept the Alphanumeric values");
		Temp.TemplateName.sendKeys("Head_Neck_672_Site");
		Temp.Save.click();
		demo.Textcomparsion(Temp.TemplateName, "Head_Neck_672_Site", test,driver);
		Temp.TemplateName.clear();
	}
	
	
	@Test(priority = 25)
	public void TargetPrescriptionDosetextfieldwithoutdata()
			throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+ " :   To verify  TargetPrescriptionDose textfield if without entering text and clicked on Temp.Save button ",
				" Input cannot be blank warning message should display  ");
		Temp.Save.click();
		demo.Textcomparsion(Temp.warnmsg.get(2), "Input cannot be blank", test,driver);
		Temp.TargetPrescriptionDose.clear();
	}

	@Test(priority = 26)
	public void TargetPrescriptionDosetextfieldifenterednumber()
			throws InterruptedException, IOException {

		test = extent.createTest(funTestCaseName()+" :   To verify  TargetPrescriptionDose textfield if entered numbered is in the minimum range and clicked on Temp.Save button ",
				" entered number should accept  ");
		Temp.TargetPrescriptionDose.sendKeys("1");
		Temp.Save.click();
		demo.Textcomparsion(Temp.TargetPrescriptionDose, "1", test,driver);
		Temp.TargetPrescriptionDose.clear();
	}

	@Test(priority = 27)
	public void TargetPrescriptionDosetextfieldifenteredMaxrange()
			throws InterruptedException, IOException {

		test = extent.createTest(funTestCaseName()+" :   To verify  TargetPrescriptionDose textfield if entered numbered is in the maximum range and clicked on Temp.Save button ",
				" entered number should accept ");
		Temp.TargetPrescriptionDose.sendKeys("10000");
		Temp.Save.click();
		demo.Textcomparsion(Temp.TargetPrescriptionDose, "10000", test,driver);
		Temp.TargetPrescriptionDose.clear();
	}

	@Test(priority = 28)
	public void TargetPrescriptionDosetextfieldifenterednumberOutOfrange()
			throws InterruptedException, IOException {

		test = extent.createTest(funTestCaseName()+ " :   To verify  TargetPrescriptionDose textfield if entered numbered is out of range and clicked on Temp.Save button ",
				" Range:[1 to 10000] warning message should display  ");
		Temp.TargetPrescriptionDose.sendKeys("1000000");
		Temp.Save.click();
		demo.Textcomparsion(Temp.warnmsg.get(2), "Range:[1 to 10000]", test,driver);
		Temp.TargetPrescriptionDose.clear();
	}

	@Test(priority = 29)
	public void TargetPrescriptionDosetextfieldifenteredlessthanrange()
			throws InterruptedException, IOException {

		test = extent.createTest(funTestCaseName()+ " :   To verify  TargetPrescriptionDose textfield if entered less range and clicked on Temp.Save button ",
				" Range:[1 to 10000] warning message should display  ");
		Temp.TargetPrescriptionDose.sendKeys("0.9");
		Temp.Save.click();
		demo.Textcomparsion(Temp.warnmsg.get(2), "Range:[1 to 10000]", test,driver);
		Temp.TargetPrescriptionDose.clear();
	}

	@Test(priority = 30)
	public void TargetPrescriptionDosetextfieldifenterednumberempty()
			throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+ " :   To verify  TargetPrescriptionDose textfield if empty and clicked on Temp.Save button ",
				" Input cannot be blank warning message should display  ");
		Temp.TargetPrescriptionDose.sendKeys("");
		Temp.Save.click();
		demo.Textcomparsion(Temp.warnmsg.get(2), "Input cannot be blank", test,driver);
		Temp.TargetPrescriptionDose.clear();
	}

	@Test(priority = 31)
	public void ToverifyTargetPrescriptionDosetextfieldifenteredAlphabets()
			throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+ " :   To verify  TargetPrescriptionDose textfield if entered Alphabets and clicked on Temp.Save button",
				" Input cannot be blank warning message should display  ");
		Temp.TargetPrescriptionDose.sendKeys("Lungs_Left_Site");
		Temp.Save.click();
		demo.Textcomparsion(Temp.warnmsg.get(2), "Input cannot be blank", test,driver);
		Temp.TargetPrescriptionDose.clear();
	}

	@Test(priority = 32)
	public void TargetPrescriptionDosetextfieldifenteredSpecialCharacter()
			throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+ " :   To verify  TargetPrescriptionDose textfield if entered Specialchar and clicked on Temp.Save button",
				" Input cannot be blank warning message should display  ");
		
		Temp.TargetPrescriptionDose.sendKeys("@$@#%##%");
		Temp.Save.click();

		demo.Textcomparsion(Temp.warnmsg.get(2), "Input cannot be blank", test,driver);
		Temp.TargetPrescriptionDose.clear();
	}

	@Test(priority = 33)
	public void TargetPrescriptionDosetextfieldifenteredSpaces()
			throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+ " :   To verify  TargetPrescriptionDose textfield if enter space and clicked on Temp.Save button ",
				" Input cannot be blank warning message should display  ");
	
		Temp.TargetPrescriptionDose.sendKeys("    ");
		Temp.Save.click();

		demo.Textcomparsion(Temp.warnmsg.get(2), "Input cannot be blank", test,driver);
		Temp.TargetPrescriptionDose.clear();
	}

	@Test(priority = 34)
	public void TargetPrescriptionDosetextfieldifenteredAplphanumeric()
			throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+ " :To verify  TargetPrescriptionDose textfield if enter Alphabets with number and clicked on Temp.Save button ",
				" It should accept 34 only  ");
		Temp.TargetPrescriptionDose.sendKeys("Leg#345");
		Temp.Save.click();
		demo.Textcomparsion(Temp.TargetPrescriptionDose, "345", test,driver);
	}

	
	public void Referencetemplate(WebElement element,String Text,ExtentTest test,WebDriver driver) throws IOException
	{
		element.click();
		element.sendKeys(Text);
		Temp.Save.click();
		demo.Textcomparsion(element, Text, test,driver);
	}
	@Test(priority = 38)
	public void minDosetextfieldifenteredminiumvalue()
			throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+  " :   To verify  MinDose textfield if entered numbered is in the minimum range clicked on Temp.Save button ",
				" entered number should accept  ");
		Referencetemplate(Temp.MinimumDose,"1",test,driver);
		Temp.MinimumDose.clear();
	}

	@Test(priority = 39)
	public void minDosetextfieldifenteredAnynumber()
			throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()
				+ " :   To verify  MinDose textfield if entered numbered is in the number and clicked on Temp.Save button ",
				" entered number should accept ");
		Referencetemplate(Temp.MinimumDose,"1000",test,driver);
		Temp.MinimumDose.clear();

	}

	@Test(priority = 40)
	public void minDosetextfieldifenteredMaxnumber()
			throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()
				+ " :   To verify  MinDose textfield if entered numbered is in the maximum range and clicked on Temp.Save button ",
				" entered number should accept ");
		Referencetemplate(Temp.MinimumDose,"10000",test,driver);
		Temp.MinimumDose.clear();

	}

	@Test(priority = 41)
	public void minDosetextfieldifenterednumberOutOfrangemin()
			throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()
				+ " :   To verify  MinDose textfield if entered numbered is out of range min range and clicked on Temp.Save button ",
				" Range:[1 to 10000] warning message should display ");
		Referencetemplate(Temp.MinimumDose,"0.3",test,driver);
		demo.Textcomparsion(Temp.warnmsg.get(3), "Range:[1 to 10000]", test,driver);
		Temp.MinimumDose.clear();
	}

	@Test(priority = 42)
	public void minDosetextfieldifenterednumberOutOfrange()
			throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()
				+ " :   To verify  MinDose textfield if entered numbered is out of range and clicked on Temp.Save button ",
				" Range:[1 to 10000] warning message should display ");
		Referencetemplate(Temp.MinimumDose,"1000000",test,driver);
		demo.Textcomparsion(Temp.warnmsg.get(3), "Range:[1 to 10000]", test,driver);
		Temp.MinimumDose.clear();
	}

	@Test(priority = 43)
	public void minDosetextfieldifenterednumberisempty() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+ " :   To verify  MinDose textfield if empty and clicked on Temp.Save button ",
				" Input cannot be blank warning message should display  ");
		Temp.MinimumDose.sendKeys("  ");
		Temp.Save.click();
		demo.Textcomparsion(Temp.warnmsg.get(3), "Input cannot be blank", test,driver);
		Temp.MinimumDose.clear();
	}

	@Test(priority = 44)
	public void minDosetextfieldifenterednumberisAlphabets() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+ " :   To verify  MinDose textfield if entered Alphabets and clicked on Temp.Save button ",
				" Input cannot be blank warning message should display  ");
		Temp.MinimumDose.sendKeys("Lungs_Left_Site");
		Temp.Save.click();
		demo.Textcomparsion(Temp.warnmsg.get(3), "Input cannot be blank", test,driver);
		Temp.MinimumDose.clear();
	}

	@Test(priority = 45)
	public void ToverifyminDosetextfieldifenterednumberisSpecial()throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()
				+ " :   To verify  MinDose textfield if entered Special char and clicked on Temp.Save button",
				" Input cannot be blank warning message should display  ");
		Temp.MinimumDose.sendKeys("@$@#%##%");
		Temp.Save.click();
		demo.Textcomparsion(Temp.warnmsg.get(3), "Input cannot be blank", test,driver);
		Temp.MinimumDose.clear();
	}

	@Test(priority = 46)
	public void minDosetextfieldifenterednumberisSpaces() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+ " :   To verify  MinDose textfield if enter space and clicked on Temp.Save button ",
				" Input cannot be blank warning message should display  ");
		Temp.MinimumDose.sendKeys("  ");
		Temp.Save.click();
		demo.Textcomparsion(Temp.warnmsg.get(3), "Input cannot be blank", test,driver);
		Temp.MinimumDose.clear();
	}

	@Test(priority = 47)
	public void minDosetextfieldifenterednumberisAplphanumeric()
			throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()
				+ " :   To verify  MinDose textfield if enter Alphabets with number and clicked on Temp.Save button ",
				" It should accept 34 only  ");
		Temp.MinimumDose.sendKeys("hdgf34");
		Temp.Save.click();
		demo.isdisplayed(Temp.MinimumDose, "hdgf34", test, driver);
		Temp.MinimumDose.clear();
	}
	
	
	@Test(priority = 50)
	public void TmaxDosetextfieldifenteredminiumvalue()
			throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()
				+ " :   To verify  MaxDose textfield if entered numbered is in the minimum range and clicked on Temp.Save button ",
				" entered number should accept  ");
		Referencetemplate(Temp.MaximumDose,"1",test,driver);
		Temp.MaximumDose.clear();
	}

	@Test(priority = 51)
	public void maxDosetextfieldifenteredAnynumberintherange()
			throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName()
						+ " :   To verify  MaxDose textfield if entered numbered  and clicked on Save button ",
				" entered number should accept  ");
		Referencetemplate(Temp.MaximumDose,"1000",test,driver);
		Temp.MaximumDose.clear();

	}

	@Test(priority = 52)
	public void maxDosetextfieldifenteredMaxnumber()
			throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()
				+ " :   To verify  MaxDose textfield if entered numbered is in the maximum range and clicked on save button ",
				" entered number should accept ");

		Referencetemplate(Temp.MaximumDose,"10000",test,driver);
		Temp.MaximumDose.clear();

	}

	@Test(priority = 53)
	public void maxDosetextfieldifenterednumberisOutOfrange()
			throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()
				+ " :   To verify  MaxDose textfield if entered numbered is out of range and clicked on save button ",
				" Range:[1 to 10000] warning message should display  ");
		Referencetemplate(Temp.MaximumDose,"10000000",test,driver);
		demo.Textcomparsion(Temp.warnmsg.get(4), "Range:[1 to 10000]", test,driver);
		Temp.MaximumDose.clear();
	}

	@Test(priority = 54)
	public void maxDosetextfieldifenterednumberisempty() throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName() + " :   To verify  MaxDose textfield if empty and clicked on Save button ",
				" Input cannot be blank warning message should display  ");
		Referencetemplate(Temp.MaximumDose,"",test,driver);
		demo.Textcomparsion(Temp.warnmsg.get(4), "Input cannot be blank", test,driver);
		Temp.MaximumDose.clear();
	}

	@Test(priority = 55)
	public void maxDosetextfieldifenterednumberisAlphabets() throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName()
						+ " :   To verify  MaxDose textfield if entered Alphabets and clicked on Temp.Save button",
				" Input cannot be blank warning message should display  ");
		Temp.MaximumDose.sendKeys("POIOWEOIUIYE");
		Temp.Save.click();

		demo.Textcomparsion(Temp.warnmsg.get(4), "Input cannot be blank", test,driver);
		Temp.MaximumDose.clear();
	}

	@Test(priority = 56)
	public void maxDosetextfieldifenterednumberisSpecialCharacters()
			throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName()
						+ " :   To verify  MaxDose textfield if entered Special char and clicked on Save button",
				" Input cannot be blank warning message should display  ");
		Temp.MaximumDose.sendKeys("@$@#%##%");
		Temp.Save.click();
		demo.Textcomparsion(Temp.warnmsg.get(4), "Input cannot be blank", test,driver);
		Temp.MaximumDose.clear();
	}

	@Test(priority = 57)
	public void maxDosetextfieldifenterednumberisSpaces() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+ " :   To verify  MaxDose textfield if enter space and clicked on Save button ",
				" Input cannot be blank warning message should display  ");
		
		Temp.MaximumDose.sendKeys("  ");
		Temp.Save.click();
		demo.Textcomparsion(Temp.warnmsg.get(4), "Input cannot be blank", test,driver);
		Temp.MaximumDose.clear();
	}

	@Test(priority = 58)
	public void maxDosetextfieldifenterednumberisAplphanumeric()
			throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()
				+ " :   To verify  MaxDose textfield if enter Alphabets with number and clicked on Save button ",
				" It should accept 34 only  ");
		Temp.MaximumDose.sendKeys("KKJHDD87283673");
		Temp.Save.click();
		demo.isdisplayed(Temp.MaximumDose, "KKJHDD87283673", test, driver);
		Temp.MaximumDose.clear();
	}

	@Test(priority = 59)
	public void maxDosetextfieldifenteredminlessthanmaxc() throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName() + " :   To verify if entered maximum dose(4) less then Minimum dose(34)   ",
				" Min cannot be equal to MaxMax cannot be equal to Min warning message should display ");
		Temp.MinimumDose.clear();
		Referencetemplate(Temp.MaximumDose,"4",test,driver);
		Referencetemplate(Temp.MinimumDose,"34",test,driver);
		demo.TextfieldwithWarnmsg(Temp.warnmsg.get(3).getText() + Temp.warnmsg.get(4).getText(),
				"Min cannot be greater than MaxMax cannot be lesser than Min", test,driver);

	}

	@Test(priority = 60)
	public void maxDosetextfieldifenteredminandmaxdosevaluessame()
			throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName()
						+ " :   To verify if entered maximum dose(34) and Minimum dose(34) values same  ",
				" Min cannot be greater than MaxMax cannot be lesser than Min warning message should display ");
		Temp.MinimumDose.clear();
		Temp.MaximumDose.clear();
		Referencetemplate(Temp.MaximumDose,"34",test,driver);
		Referencetemplate(Temp.MinimumDose,"34",test,driver);

		demo.TextfieldwithWarnmsg(Temp.warnmsg.get(3).getText() + Temp.warnmsg.get(4).getText(),
				"Min cannot be equal to MaxMax cannot be equal to Min", test,driver);
		Temp.MaximumDose.clear();

	}

	@Test(priority = 61)
	public void maxDosetextfieldifenteredminandmax()
			throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName() + " :   To verify  Min and Max textfield functionality if entered numbers",
				" It should accept the number ");
		Temp.MinimumDose.clear();
		Referencetemplate(Temp.MinimumDose,"10",test,driver);
		Referencetemplate(Temp.MaximumDose,"20",test,driver);
		Temp.Save.click();
	}
	
	
	@Test(priority = 65)
	public void TnoOfFractiontextfieldifenteredminiumvalue()
			throws InterruptedException, IOException {

		test = extent.createTest(
				funTestCaseName() + " :   To verify No of fraction textfield if entered minimum range ",
				" It should accept the number (1)");
		Referencetemplate(Temp.NumberofFractions,"1",test,driver);

	}

	@Test(priority = 66)
	public void noOfFractiontextfieldifenteredlessthanminrange()
			throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName() + " :   To verify No of fraction textfield if entered more than max range ",
				" It should not accept the number (1)");
		Temp.NumberofFractions.sendKeys("101");
		Temp.Save.click();
		demo.TextfieldwithWarnmsg(Temp.warnmsg.get(1).getText(), "Range:[1 to 100]", test,driver);
		Temp.NumberofFractions.clear();

	}

	@Test(priority = 67)
	public void noOfFractiontextfieldifenteredMaxnumber()
			throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName() + " :   To verify No of fraction textfield if entered Maximum range ",
				" It should accept the number (100)");
		Referencetemplate(Temp.NumberofFractions,"100",test,driver);
		Temp.NumberofFractions.clear();

	}

	@Test(priority = 68)
	public void noOfFractiontextfieldifenterednumberisOutOfrange()
			throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName() + " :   To verify No of fraction textfield if entered Maximum range ",
				" It should not accept the number (1000000) and Range:[1 to 100] warning message should display ");
		Temp.NumberofFractions.sendKeys("1000000");
		Temp.Save.click();
		if(Temp.NumberofFractions.getText().equals("10000"))
				{
		demo.TextfieldwithWarnmsg(Temp.warnmsg.get(1).getText(), "Range:[1 to 100]", test,driver);
		Temp.NumberofFractions.clear();
				}
		else
		{
			test.fail("Textfield is accepting more than the 10000 digits");
		}
	}

	@Test(priority = 69)
	public void noOfFractiontextfieldifenterednumberempty()
			throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName() + " :   To verify No of fraction textfield if entered Maximum range ",
				"Input cannot be blank warning message should display");
		Referencetemplate(Temp.NumberofFractions,"",test,driver);
		demo.TextfieldwithWarnmsg(Temp.warnmsg.get(1).getText(), "Input cannot be blank", test,driver);
		Temp.NumberofFractions.clear();
	}

	@Test(priority = 70)
	public void noOfFractiontextfieldifenterednumberisAlphabets()
			throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName() + " :   To verify No of fraction textfield if entered Maximum range ",
				" It should not accept the alphabets (asgdfgfdg)");
		
		Temp.NumberofFractions.sendKeys("asgdfgfdg");
		Temp.Save.click();
		demo.TextfieldwithWarnmsg(Temp.warnmsg.get(1).getText(), "Input cannot be blank", test,driver);
		Temp.NumberofFractions.clear();
	}

	@Test(priority = 71)
	public void noOfFractiontextfieldifenterednumberisSpecialCharacters()
			throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName() + " :   To verify No of fraction textfield if entered SpecialCharacters ",
				" It should not accept the SpecialCharacters (@$@#%##%)");
		Temp.NumberofFractions.sendKeys("@$@#%##%");
		Temp.Save.click();
		demo.TextfieldwithWarnmsg(Temp.warnmsg.get(1).getText(), "Input cannot be blank", test,driver);
		Temp.NumberofFractions.clear();
	}

	@Test(priority = 72)
	public void noOfFractiontextfieldifenterednumberisSpaces()
			throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName() + " :   To verify No of fraction textfield if entered Maximum range ",
				" It should not accept the spaces ()");
		Temp.NumberofFractions.sendKeys("     ");
		Temp.Save.click();
		demo.TextfieldwithWarnmsg(Temp.warnmsg.get(1).getText(), "Input cannot be blank", test,driver);
		Temp.NumberofFractions.clear();
	}

	@Test(priority = 73)
	public void noOfFractiontextfieldifenterednumberisAplphanumeric()
			throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName() + " :   To verify No of fraction textfield if entered Numbers with Alphabets ",
				" It should not accept the number (3)");
		Referencetemplate(Temp.NumberofFractions,"3",test,driver);
		Temp.NumberofFractions.clear();
	}
	
	

	@Test(priority = 99)
	public void Reviewcycletextfieldifenteredminiumvalue()
			throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+ " :   To verify ReviewCycle textfield if entered minium range ",
				" It should accept the minium range number (1)");
		Referencetemplate(Temp.ReviewCycle,"1",test,driver);
		Temp.ReviewCycle.clear();
	}

	@Test(priority = 100)
	public void ReviewcycletextfieldifenteredAnynumberintherange()
			throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName()+ " :   To verify ReviewCycle textfield if enteredAny number in the range ",
				" It should accept the number (15)");
		Referencetemplate(Temp.ReviewCycle,"15",test,driver);
		Temp.ReviewCycle.clear();
	}

	@Test(priority = 101)
	public void ReviewcycletextfieldifenteredMaxnumber()
			throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName()+ " :   To verify ReviewCycle textfield if entered Number 99 ",
				" It should accept the number (99)");
		Referencetemplate(Temp.ReviewCycle,"99",test,driver);
		Temp.ReviewCycle.clear();

	}

	@Test(priority = 102)
	public void ReviewcycletextfieldifenterednumberisOutOfrange()
			throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName()+ " :   To verify ReviewCycle textfield if entered Maximum range number 100",
				" It should not accept the number (100)");
		Temp.ReviewCycle.sendKeys("100");
		Temp.Save.click();
		demo.TextfieldwithWarnmsg(Temp.warnmsg.get(6).getText(), "Range:[1 to 99]", test,driver);
		Temp.ReviewCycle.clear();
	}



	@Test(priority = 104)
	public void ReviewcycletextfieldAlphabets()
			throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName()+ " :   To verify ReviewCycle textfield if entered Alphabhets ",
				" It should not accept the alphabets (asgdfgfdg)");
		Temp.ReviewCycle.sendKeys("asgdfgfdg");
		Temp.Save.click();
		demo.TextfieldwithWarnmsg(Temp.warnmsg.get(6).getText(), "Input cannot be blank", test,driver);
		Temp.ReviewCycle.clear();
	}

	@Test(priority = 105)
	public void ReviewcycleSpecialCharacter()
			throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName()+ " :   To verify ReviewCycle textfield if entered SpecialCharacters ",
				" It should not accept the SpecialCharacters (@$@#%##%)");

		Temp.ReviewCycle.sendKeys("@$@#%##%");
		Temp.Save.click();
		demo.TextfieldwithWarnmsg(Temp.warnmsg.get(6).getText(), "Input cannot be blank", test,driver);
		Temp.ReviewCycle.clear();
	}

	@Test(priority = 106)
	public void ReviewcycleSpaces() throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName()+ " :   To verify ReviewCycle textfield if entered Spaces ",
				" It should not accept the spaces ()");
		Temp.ReviewCycle.sendKeys("     ");
		Temp.Save.click();
		demo.TextfieldwithWarnmsg(Temp.warnmsg.get(6).getText(), "Input cannot be blank", test,driver);
		Temp.ReviewCycle.clear();
	}

	@Test(priority = 107)
	public void ReviewcycleAplphanumeric()
			throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName()+ " :To verify ReviewCycle textfield if entered Aplphanumeric values ",
				" It should accept the only numbers (3)");
		Temp.ReviewCycle.sendKeys("3hD");
		Temp.Save.click();
		demo.isdisplayed(Temp.ReviewCycle, "3", test, driver);
		Temp.ReviewCycle.clear();
	}

	@Test(priority = 111)
	public void CBCcycletextfieldifenteredminiumvalue()
			throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName()+ " :   To verify CBCCycle textfield if entered minium range ",
				" It should accept the minium range number (1)");
		Referencetemplate(Temp.CBCCyclelabel,"1",test,driver);
		Temp.CBCCyclelabel.clear();
	}

	@Test(priority = 112)
	public void CBCcycletextfieldifenteredAnynumberintherange()
			throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName()+ " :   To verify CBCCycle textfield if enteredAny number in the range ",
				" It should accept the number (25)");
		Referencetemplate(Temp.CBCCyclelabel,"25",test,driver);
		Temp.CBCCyclelabel.clear();

	}

	@Test(priority = 113)
	public void CBCcycletextfieldifenteredMaxnumber()
			throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName()+ " :   To verify CBCCycle textfield if entered Maximum range ",
				" It should accept the number (99)");
		Referencetemplate(Temp.CBCCyclelabel,"99",test,driver);
		Temp.CBCCyclelabel.clear();

	}

	@Test(priority = 114)
	public void cycletextfieldifenterednumberisOutOfrange() throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName()+ " :   To verify CBCCycle textfield if entered Maximum range ",
				" It should not accept the number (100)");
		Temp.CBCCyclelabel.sendKeys("100");
		Temp.Save.click();
		demo.TextfieldwithWarnmsg(Temp.warnmsg.get(7).getText(), "Range:[1 to 99]", test,driver);
		Temp.CBCCyclelabel.clear();
	}

	@Test(priority = 115)
	public void CBCcycletextfieldifenterednumberisempty() throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName()+ " :   To verify CBCCycle textfield if entered Maximum range ",
				"Input cannot be blank warning message should display");
		Temp.CBCCyclelabel.sendKeys("");
		Temp.Save.click();
		demo.TextfieldwithWarnmsg(Temp.warnmsg.get(7).getText(), "Input cannot be blank", test,driver);
		Temp.CBCCyclelabel.clear();
	}

	@Test(priority = 116)
	public void CBCcycletextfieldifenterednumberisAlphabets()
			throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName()+ " :   To verify CBCCycle textfield if entered Maximum range ",
				" It should not accept the alphabets (asgdfgfdg)");
		Temp.CBCCyclelabel.sendKeys("asgdfgfdg");
		Temp.Save.click();
		demo.TextfieldwithWarnmsg(Temp.warnmsg.get(7).getText(), "Input cannot be blank", test,driver);
		Temp.CBCCyclelabel.clear();
	}

	@Test(priority = 117)
	public void CBCcycletextfieldifenterednumberisSpecialCharacters()
			throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName()+ " :   To verify CBCCycle textfield if entered SpecialCharacters ",
				" It should not accept the SpecialCharacters (@$@#%##%)");
		Temp.CBCCyclelabel.sendKeys("@$@#%##%");
		Temp.Save.click();
		demo.TextfieldwithWarnmsg(Temp.warnmsg.get(7).getText(), "Input cannot be blank", test,driver);
		Temp.CBCCyclelabel.clear();
	}

	@Test(priority = 118)
	public void CBCcycletextfieldifenterednumberisSpaces() throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName()+ " :   To verify CBCCycle textfield if entered Maximum range ",
				" It should not accept the spaces ()");
		Temp.CBCCyclelabel.sendKeys("      ");
		Temp.Save.click();
		demo.TextfieldwithWarnmsg(Temp.warnmsg.get(7).getText(), "Input cannot be blank", test,driver);
		Temp.CBCCyclelabel.clear();
	}
	

	@Test(priority = 120)
	public void CBCcycletextfieldifenterednumberisAplphanumeric()
			throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName()+ " :   To verify CBCCycle textfield if entered Aplphanumeric values(4fg) ",
				" It should accept the only numbers (4)");
		Temp.CBCCyclelabel.sendKeys("4Cgy");
		Temp.Save.click();
		demo.isdisplayed(Temp.CBCCyclelabel, "4", test, driver);
		Temp.CBCCyclelabel.clear();
	}

	@Test(priority = 122)
	public void IGRTtextfieldifenteredAlphabets()
			throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+ " :   To verify IGRTCycle textfield if entered Alphabets ",
				" It should not Accept the data");
		Temp.IGRTCycle.sendKeys("Cgy");
		Temp.Save.click();
		demo.TextfieldwithWarnmsg(Temp.warnmsg.get(5).getText(), "Input cannot be blank", test,driver);
		Temp.IGRTCycle.clear();
	}

	@Test(priority = 123)
	public void IGRTtextfieldifenteredoutofrange()
			throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName()+ " :   To verify IGRTCycle textfield if entered out of range ",
				" It should Display Range:[1 to 99]");
		Temp.IGRTCycle.sendKeys("100");
		Temp.Save.click();
		demo.TextfieldwithWarnmsg(Temp.warnmsg.get(5).getText(), "Range:[1 to 99]", test,driver);
		Temp.IGRTCycle.clear();
	}

	@Test(priority = 124)
	public void IGRTtextfieldifenteredmaximumvalue()
			throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName()+ " :   To verify IGRTCycle textfield if entered maximum range ",
				" It should accept the maximum range number (99)");
		Referencetemplate(Temp.IGRTCycle,"99",test,driver);
		Temp.IGRTCycle.clear();
	}

	@Test(priority = 138)
	public void IGTRtextfieldifenterednumberisAplphanumeric()
			throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()
				+ " :   To verify CBCCycle textfield if entered Aplphanumeric and special characters values(#$%#4fg) ",
				" It should accept the only numbers (4)");
		Temp.IGRTCycle.sendKeys("#$%#466fg");
		Temp.Save.click();
		demo.TextfieldwithWarnmsg(Temp.warnmsg.get(5).getText(), "Range:[1 to 99]", test,driver);
		Temp.IGRTCycle.clear();
	}

	@Test(priority = 139)
	public void IGRTtextfieldifenteredanynumberinrange()
			throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName()+ " :   To verify IGRTCycle textfield if entered Any number in the Range ",
				" It should accept the Data");
		Referencetemplate(Temp.IGRTCycle,"12",test,driver);
	}

	@Test(priority = 140)
	public void Radiobuttonofgatingyeswithoutselecting() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+ " :   To verify Gating yes and No radio button ",
				" Gating yes and No radio button should be in Deselect");
		demo.BydefaultisSelected(Temp.GatingYes,  "Yes",test,driver);
		demo.BydefaultisSelected(Temp.GatingNo,  "No",test,driver);
		
	}

	@Test(priority = 141)
	public void Radiobuttonofgatingyeswithselecting() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+ " :   To verify Gating yes radio button ",
				"  Gating yes radio button should be selected");
		Temp.GatingYes.click();
		demo.isSelected(Temp.GatingYes,  "Yes",test,driver);
		demo.BydefaultisSelected(Temp.GatingNo,  "No",test,driver);
	}

	@Test(priority = 142)
	public void RadiobuttonofgatingyNowithoutselecting() throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName()+ " :   To verify Gating Yes and No radio button aftyer select No ",
				"Gating Yes should be in Deselect and No should be select");
		Temp.GatingNo.click();
		demo.BydefaultisSelected(Temp.GatingYes,  "Yes",test,driver);
		demo.isSelected(Temp.GatingNo,  "No",test,driver);
	}

	@Test(priority = 144)
	public void Radiobuttonofbolusyeswithoutselecting() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+ " :   To verify Bolus yes radio button ",
				" Bolus yes and No radio button should be in Deselect");
		demo.BydefaultisSelected(Temp.BolusYes,  "Yes",test,driver);
		demo.BydefaultisSelected(Temp.BolusNo,  "No",test,driver);
		
	}

	@Test(priority = 145)
	public void RadiobuttonofBolusyeswithselecting() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+ " :   To verify Bolus yes radio button ",
				"  Bolus yes radio button should be selected");
		Temp.BolusYes.click();
		demo.isSelected(Temp.BolusYes,  "Yes",test,driver);
		demo.BydefaultisSelected(Temp.BolusNo,  "No",test,driver);
	}

	@Test(priority = 146)
	public void RadiobuttonofBolusNowithoutselecting() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+ " :   To verify Bolus No radio button ",
				"Bolus Yes should be in Deselect and No should be select");
		Temp.BolusNo.click();
		demo.BydefaultisSelected(Temp.BolusYes,  "Yes",test,driver);
		demo.isSelected(Temp.BolusNo,  "No",test,driver);
	}
	
	
	
	///////////OAR================================================
	
	

	
	public void ReferenceOAR(WebElement element,String Text,ExtentTest test,WebDriver driver) throws IOException
	{
		element.click();
		element.sendKeys(Text);
		Temp.OARInsertButton.click();
		demo.Textcomparsion(element, Text, test,driver);
	}
	
	public void ReferenceTextOAR(WebElement element,String Text,ExtentTest test,WebDriver driver) throws IOException
	{
		element.click();
		element.sendKeys(Text);
		Temp.OARInsertButton.click();
		demo.isempty(element, Text, test,driver);
	}
	
	
	
	
	
	@Test(priority = 147)
	public void ToverifyTOARNametextfieldifenteraproperName() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+ " :   To verify OAR Name Textfield Entering Name "," OAR Name Textfield should accept Name ");
		Temp.OARAdd.click();
		ReferenceOAR(Temp.OARName,"LeftSide_Lungs",test,driver);
		Temp.OARName.clear();
	}

	@Test(priority = 148)
	public void ToverifyOARNametextfielifenteraspecailcharas1stletterinthenameName() throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName()
						+ " :   To verify OAR Name Textfield Entering Special characters First and Alphabets  ",
				" OAR Name Textfield should Display Input must start with characters  ");
		
		ReferenceOAR(Temp.OARName,"@%$##hgdsfg",test,driver);
		
		demo.TextfieldwithWarnmsg(Temp.warnmsg.get(8).getText(), "Input must start with characters", test,driver);
																													
		Temp.OARName.clear();
	}

	@Test(priority = 149)
	public void ToverifyOARNametextfielifenteranumbersasspecialchartinthenameName() throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName()
						+ " :   To verify OAR Name Textfield Entering Alphabets with Special characters ",
				" OAR Name Textfield should Display Only alphabets,digits,space allowed ");
		
		ReferenceOAR(Temp.OARName,"agds@fg",test,driver);
		demo.TextfieldwithWarnmsg(Temp.warnmsg.get(8).getText(), "Only alphabets,digits,space allowed", test,driver);
		Temp.OARName.clear();
	}

	@Test(priority = 150)
	public void ToverifyOARNametextfielifenter2lettersinthenameName() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+ " :   To verify OAR Name Textfield Entering Two Letters  ",
				" OAR Name Textfield should Display Input must have atleast 3 characters ");
		ReferenceOAR(Temp.OARName,"ag",test,driver);
		demo.TextfieldwithWarnmsg(Temp.warnmsg.get(8).getText(), "Input must have atleast 3 characters", test,driver);
		Temp.OARName.clear();
	}

	@Test(priority = 151)
	public void ToverifyOARNametextfielifenterNUMBERASsinthenameName() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+ " :   To verify OAR Name Textfield Entering Numbers  ",
				" OAR Name Textfield should Input Must start with characters ");
		ReferenceOAR(Temp.OARName,"465464346",test,driver);
		
		demo.TextfieldwithWarnmsg(Temp.warnmsg.get(8).getText(), "Input must start with characters", test,driver);
		Temp.OARName.clear();
	}

	@Test(priority = 152)
	public void ToverifyOARNametextfielifenterALPHANUMERICSPECIALCHARsinthenameName() throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName()
						+ " :   To verify OAR Name Textfield Entering Alphanumeric with Special characters  ",
				" OAR Name Textfield should Display Input Must start with characters ");
		ReferenceOAR(Temp.OARName, "46hgjhg@54646",test,driver);
		
		demo.TextfieldwithWarnmsg(Temp.warnmsg.get(8).getText(), "Input must start with characters", test,driver);
		Temp.OARName.clear();

	}

	@Test(priority = 153)
	public void ToverifyOARNametextfielifenteredAlphanemeric() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+ " :   To verify OAR Name Textfield Entering Alphanumeric  ",
				" OAR Name Textfield should accept the data ");
	
		ReferenceOAR(Temp.OARName,"ad3",test,driver);
		Temp.OARName.clear();
	}

	@Test(priority = 154)
	public void ToverifyOARminDosetextfieldifenteredminiumvalue() throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName()+ " :   To verify OAR Minimum dose Textfield Entering Minimum value  ",
				" Minimum Dose Textfield should Accept the Minimum Value ");

		ReferenceOAR(Temp.OARName,"10",test,driver);
		Temp.OARName.clear();
	}

	@Test(priority = 155)
	public void ToverifyminDosetextfieldifenteredAnynumberintherange() throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName()
						+ " :   To verify OAR Minimum dose Textfield Entering any number within the Range  ",
				" Minimum Dose Textfield should Accept the Data ");
		ReferenceOAR(Temp.OARMinDose,"1000",test,driver);
		Temp.OARMinDose.clear();
	}

	@Test(priority = 156)
	public void ToverifyminDosetextfieldifenteredMaxnumber() throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName()+ " :   To verify OAR Minimum dose Textfield Entering maximum Number  ",
				" Minimum Dose Textfield should Accept the Data");
		ReferenceOAR(Temp.OARMinDose,"10000",test,driver);
		Temp.OARMinDose.clear();
	}

	@Test(priority = 157)
	public void ToverifyminDosetextfieldifenterednumberisOutOfrange() throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName()+ " :   To verify OAR Minimum dose Textfield Entering out of range values  ",
				" Minimum Dose Textfield should Display Input is greater than max value 10000 ");
		ReferenceOAR(Temp.OARMinDose,"1000000",test,driver);
		demo.TextfieldwithWarnmsg(Temp.warnmsg.get(9).getText(), "Range:[1 to 10000]", test,driver);
		Temp.OARMinDose.clear();
	}

	@Test(priority = 158)
	public void ToverifyminDosetextfieldifenterednumberisempty() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+ " :   To verify OAR Minimum dose Textfield is Empty  ",
				" Minimum Dose Textfield should Display Input cannot be blank ");
		ReferenceOAR(Temp.OARMinDose,"",test,driver);
		demo.TextfieldwithWarnmsg(Temp.warnmsg.get(9).getText(), "Input cannot be blank", test,driver);
	}

	@Test(priority = 159)
	public void ToverifyminDosetextfieldifenterednumberisAlphabets() throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName()+ " :  To verify OAR Minimum dose Textfield Entering Alphabets  ",
				"Minimum Dose Textfield should Display Only numbers are allowed ");
		ReferenceTextOAR(Temp.OARMinDose,"asgdfgfdg",test,driver);
		demo.TextfieldwithWarnmsg(Temp.warnmsg.get(9).getText(), "Input cannot be blank", test,driver);
		Temp.OARMinDose.clear();
	}

	@Test(priority = 160)
	public void ToverifyminDosetextfieldifenterednumberisSpecialCharacters() throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName()+ " :   To verify OAR Minimum dose Textfield Entering Special characters  ",
				" Minimum Dose Textfield should Display Only numbers are allowed ");
		ReferenceTextOAR(Temp.OARMinDose,"@$@#%##%",test,driver);
		demo.TextfieldwithWarnmsg(Temp.warnmsg.get(9).getText(), "Input cannot be blank", test,driver);
		Temp.OARMinDose.clear();
	}

	@Test(priority = 161)
	public void ToverifyminDosetextfieldifenterednumberisSpaces() throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName()+ " :   To verify OAR Minimum dose Textfield Entering Numbers with spaces  ",
				" Minimum Dose Textfield should Display Only numbers are allowed ");
		Temp.OARMinDose.sendKeys(" 2 3     ");
		Temp.OARInsertButton.click();
	    demo.isdisplayed(Temp.OARMinDose,"23", test, driver);
		Temp.OARMinDose.clear();
	}

	@Test(priority = 162)
	public void ToverifyminDosetextfieldifenterednumberisAplphanumeric() throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName()+ " :   To verify OAR Minimum dose Textfield Entering Alphanumeric  ",
				" Minimum Dose Textfield should Display Only numbers are allowed ");
		Temp.OARMinDose.sendKeys("hdgf34");
		Temp.OARInsertButton.click();
		demo.isdisplayed(Temp.OARMinDose, "34", test, driver);
		Temp.OARMinDose.clear();
	}

	@Test(priority = 163)
	public void ToverifyminDosetextfieldifenterednumber() throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName()+ " :   To verify OAR Minimum dose Textfield Entering Number  ",
				" Minimum Dose Textfield should accept the data ");
		ReferenceOAR(Temp.OARMinDose,"45",test,driver);
		Temp.OARMinDose.clear();
	}

	@Test(priority = 164)
	public void ToverifyOARmaxDosetextfieldifenteredminiumvalue() throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName()+ " :   To verify OAR Maximum dose Textfield Entering Minimum value  ",
				" Maximum Dose Textfield should Accept the Data ");
		ReferenceOAR(Temp.OARMaxDose,"10",test,driver);
		Temp.OARMaxDose.clear();
	}


	@Test(priority = 165)
	public void ToverifyOARmaxDosetextfieldifenteredAnynumberintherangeand() throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName()
						+ " :   To verify OAR Maximum dose Textfield Entering any number in the range  ",
				" Maximum Dose Textfield should Accept the Data ");
		ReferenceOAR(Temp.OARMaxDose,"1000",test,driver);
		Temp.OARMaxDose.clear();

	}


	@Test(priority = 166)
	public void ToverifyOARmaxDosetextfieldifenteredMaxnumber() throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName()+ " :   To verify OAR Maximum dose Textfield Entering maximum Number  ",
				" Maximum Dose Textfield should Accept the Data ");
		ReferenceOAR(Temp.OARMaxDose,"10000",test,driver);
		Temp.OARMaxDose.clear();

	}

	@Test(priority = 167)
	public void ToverifyOARmaxDosetextfieldifenterednumberisOutOfrange() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+ " :   To verify OAR Maximum dose Textfield Entering out of range values  ",
				" Maximum Dose Textfield should display Input is greater than max value 10000 ");
		ReferenceOAR(Temp.OARMaxDose,"1000000",test,driver);
		demo.TextfieldwithWarnmsg(Temp.warnmsg.get(10).getText(), "Range:[1 to 10000]", test,driver);
		Temp.OARMaxDose.clear();
	}

	@Test(priority = 168)
	public void ToverifyOARmaxDosetextfieldifenterednumberisempty() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+ " :   To verify OAR Maximum dose Textfield is Empty  ",
				" Maximum Dose Textfield should display Input cannot be blank ");
		ReferenceOAR(Temp.OARMaxDose,"",test,driver);
		demo.TextfieldwithWarnmsg(Temp.warnmsg.get(10).getText(), "Input cannot be blank", test,driver);
		Temp.OARMaxDose.clear();
	}

	@Test(priority = 169)
	public void ToverifyOARmaxDosetextfieldifenterednumberisAlphabets() throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName()+ " :   To verify OAR Maximum dose Textfield Entering Alphabets  ",
				" Maximum Dose Textfield should display Only numbers are allowed");
		ReferenceTextOAR(Temp.OARMaxDose,"oiouiefjhjyue",test,driver);
		demo.TextfieldwithWarnmsg(Temp.warnmsg.get(10).getText(), "Input cannot be blank", test,driver);
		Temp.OARMaxDose.clear();
	}

	@Test(priority = 170)
	public void ToverifyOARmaxDosetextfieldifenterednumberisSpecialCharacters() throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName()+ " :   To verify OAR Maximum dose Textfield Entering Special characters",
				"  Only numbers are allowed");
	
		ReferenceTextOAR(Temp.OARMaxDose,"@$@#%##%",test,driver);
		demo.TextfieldwithWarnmsg(Temp.warnmsg.get(10).getText(), "Input cannot be blank", test,driver);
		Temp.OARMaxDose.clear();
	}

	@Test(priority = 171)
	public void ToverifyOARmaxDosetextfieldifenterednumberisSpaces() throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName()+ " :   To verify OAR Maximum dose Textfield Entering Numbers with spaces",
				"Maximum Dose Textfield Should Display Only numbers are allowed");
		Temp.OARMaxDose.sendKeys("4 8 5");
		Temp.OARMaxDose.clear();
		demo.isdisplayed(Temp.OARMaxDose, "485",test, driver);
		Temp.OARMaxDose.clear();
	}

	@Test(priority = 172)
	public void ToverifyOARmaxDosetextfieldifenterednumberisAplphanumeric() throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName()+ " :   To verify OAR Maximum dose Textfield Entering Alphanumeric",
				" Maximum Dose Textfield Should Display only numbers are allowed");
		Temp.OARMaxDose.sendKeys("64jhdgd");
		Temp.OARMaxDose.clear();
		demo.isdisplayed(Temp.OARMaxDose, "64",test, driver);
		Temp.OARMaxDose.clear();
	}

	@Test(priority = 173)
	public void ToverifyOARMIANDmaxDosetextfieldifenterednumberisSAME() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+ " :   To verify OAR Minium(100) and Maximum dose(100 values  Entering Numbers are same",
				"Minimum Dose cannot be equal to Maximum DoseMaximum Dose cannot be equal to Minimum Dose warning message Should Display ");
		ReferenceOAR(Temp.OARMinDose,"100",test,driver);
		ReferenceOAR(Temp.OARMaxDose,"100",test,driver);
		demo.TextfieldwithWarnmsg(Temp.warnmsg.get(9).getText() + Temp.warnmsg.get(10).getText(),
				"Minimum Dose cannot be equal to Maximum DoseMaximum Dose cannot be equal to Minimum Dose", test,driver);
		Temp.OARMinDose.clear();
		Temp.OARMaxDose.clear();
	}

	@Test(priority = 174)
	public void ToverifyOARmaxDosetextfieldifenterednumber() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+" :   To verify OAR Minium(100) and Maximum dose(100 values  Entering Numbers are same",
				"Minimum Dose cannot be greater than Maximum DoseMaximum Dose cannot be less than Minimum Dose warning message Should Display ");
		ReferenceOAR(Temp.OARMinDose,"100",test,driver);
		ReferenceOAR(Temp.OARMaxDose,"10",test,driver);
		demo.TextfieldwithWarnmsg(Temp.warnmsg.get(9).getText() + Temp.warnmsg.get(10).getText(),
				"Minimum Dose cannot be greater than Maximum DoseMaximum Dose cannot be less than Minimum Dose", test,driver);
		Temp.OARMinDose.clear();
		Temp.OARMaxDose.clear();
	}
	
	

	//@Test(priority = 175)
	public void ToverifyOARMEANDosetextfield() throws InterruptedException, IOException {
		float OARMIN = 0, OARMAX = 0, total;

		Temp.OARMeanDose = Temp.OARMeanDose;
		
		ReferenceOAR(Temp.OARMinDose,"100",test,driver);
		ReferenceOAR(Temp.OARMaxDose,"525",test,driver);
		
		String Value = Temp.OARMinDose.getText();
		String Value1 = Temp.OARMaxDose.getText();
		if (!(Temp.OARMinDose.getText().isEmpty()) && !(Temp.OARMaxDose.getText().isEmpty())) {
			OARMIN = Float.parseFloat(Value);
			OARMAX = Float.parseFloat(Value1);
		}
		total = (OARMIN + OARMAX) / 2;
		String Mean = String.valueOf(total);
		String OARMeanDose = Temp.OARMeanDose.getText();
		test = extent.createTest(funTestCaseName()+"  :   To verify Mean Dose value ",
				" Mean dose value should be  " + total);
		demo.isempty(Temp.OARMeanDose, Mean, test,driver);
	}

	//@Test(priority = 176)
	public void ToverifyOARMEANDosetextfielifMAXandMINtextisEmpty() throws InterruptedException, IOException {
		float OARMIN = 0, OARMAX = 0, total;
		test = extent.createTest(funTestCaseName()+"  :   To verify Mean Dose value if min and max dose is 0 ",
				" Mean dose textfield should be Empty ");
		String Value = Temp.OARMinDose.getText();
		String Value1 = Temp.OARMaxDose.getText();
		if (!(Temp.OARMinDose.getText().isEmpty()) && !(Temp.OARMaxDose.getText().isEmpty())) {
			OARMIN = Float.parseFloat(Value);
			OARMAX = Float.parseFloat(Value1);
		}
		total = (OARMIN + OARMAX) / 2;
		String Mean = String.valueOf(total);
		String OARMeanDose = Temp.OARMeanDose.getText();
		demo.Textcomparsion(Temp.OARMeanDose, Mean, test,driver);
	}
	
	
	
	@Test(priority = 177)
	public void OARDescriptiontextfieldifenteredminiumvalue() throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName() + " :   To verify OAR Description Textfield Entering minimum value",
				" Description Textfield Should accept the Minimum value");

		ReferenceOAR(Temp.OARDescription,"SDFBFISGDFI2",test,driver);
		Temp.OARDescription.clear();
	}

	@Test(priority = 178)
	public void TyOARDescriptiontextfieldifenteredAnynumberintherange() throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName()
						+ " :   To verify OAR Description Textfield Entering Any number Within the Range",
				"Description Textfield Should Accept the Data");

		ReferenceOAR(Temp.OARDescription,"4643464",test,driver);
		Temp.OARDescription.clear();

	}

	@Test(priority = 179)
	public void OARDescriptiontextfieldifenteredMaxnumber() throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName() + " :   To verify OAR Description Textfield Entering Maximum number",
				" Description Textfield should accept the data");
		ReferenceOAR(Temp.OARDescription,"965+$#KJ@9",test,driver);
		Temp.OARDescription.clear();
	}

	@Test(priority = 180)
	public void OARDescriptiontextfieldifenterednumberisOutOfrange() throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName() + " :   To verify OAR Description Textfield Entering out of range values",
				" Description Textfield should accept the data");
		ReferenceOAR(Temp.OARDescription,"100dfgh0000",test,driver);
		Temp.OARDescription.clear();
		Temp.Close.clear();
	}
	
	
	@Test(priority = 181)
	public void ResetOAR() throws IOException
	{
	test = extent.createTest(funTestCaseName() + " : Click on the OAR and click on the close, Data should be empty");
	Temp.OARAdd.click();
	Temp.OARName.sendKeys("Heart");
	Temp.OARMinDose.sendKeys("20");
	Temp.OARMaxDose.clear();
	Temp.OARMaxDose.sendKeys("45.9");
	Temp.OARDescription.sendKeys("Dose is constraints for the data");
	Temp.Close.click();
	Temp.Reset.click();
	demo.isdisplayed(Temp.OARAdd, "Addicon",test, driver);
	Temp.OARAdd.click();
	demo.isempty(Temp.OARName, "OARName", test, driver);
	demo.isempty(Temp.OARMinDose, "Min Dose", test, driver);
	demo.isempty(Temp.OARMaxDose, "Max Dose", test, driver);
	demo.isempty(Temp.OARDescription, "Max Dose", test, driver);
	demo.isempty(Temp.OARMeanDose, "Mean Dose", test, driver);
	}

	
	// *********************Work************************************
	
	@Test(priority = 182)
	public void insertbutton() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName() + " :   To verify Insert button",
				" Insert button should Enable and Temp.Saved oAr should display in list");
		demo.isEnabled(Temp.OARInsertButton, "INSERT", test, driver);
		demo.isEnabled(Temp.OARCloseButton, "CLOSE", test, driver);
		Temp.OARInsertButton.click();
		Temp.OARCloseButton.click();
	}
	

	@Test(priority = 183)
	public void bellyboardcheckboxbeforeselecting() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName() + " :   To verify belly board checkbox before selecting it ",
				" belly board checkbox should be unchecked mode");
		Temp.PatientImmobilzationsetupbutton.click();
		List(Temp.Checkbox, 1,act);
		demo.BydefaultisSelected(Temp.Checkbox.get(0),  "Belly Board checkbox",test,driver);
	}

	@Test(priority = 184)
	public void bellyboardcheckboxafterselecting() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName() + " :   To verify belly board checkbox after selecting it ",
				" belly board checkbox should be selected mode");
		Temp.Checkbox.get(0).click();
		demo.isSelected(Temp.Checkbox.get(0),"Belly Board checkbox",test,driver);
		Temp.Checkbox.get(0).click();
	}

	@Test(priority = 185)
	public void Breastboardcheckboxbeforeselecting() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName() + " :   To verify Breast board checkbox before selecting it ",
				" Breast board checkbox should be unchecked mode");
		demo.BydefaultisSelected(Temp.Checkbox.get(1),  "Breast Board checkbox",test,driver);
	}

	@Test(priority = 186)
	public void Breastboardcheckboxafterselecting() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName() + " :   To verify Breast board checkbox after selecting it ",
				" Breast board checkbox should be selected mode");
		Temp.Checkbox.get(1).click();
		demo.isSelected(Temp.Checkbox.get(1),  "Breast Board checkbox",test,driver);
		Temp.Checkbox.get(1).click();
	}

	@Test(priority = 187)
	public void HeadandshoulderBaseplatecheckboxbeforeselecting() throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName() + " :   To verify Head and shoulder Base plate checkbox before selecting it ",
				" Head and shoulder Base plate  checkbox should be unchecked mode");
		demo.BydefaultisSelected(Temp.Checkbox.get(2), "Head and Shoulder Base plate",test,driver);
	}

	@Test(priority = 188)
	public void HeadandshoulderBaseplatecheckboxafterselecting() throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName() + " :   To verify Head and shoulder Base plate checkbox after selecting it ",
				" Head and shoulder Base plate checkbox should be selected mode");
		Temp.Checkbox.get(2).click();
		demo.isSelected(Temp.Checkbox.get(2), "Head and Shoulder Base plate",test,driver);
		Temp.Checkbox.get(2).click();

	}

	@Test(priority = 189)
	public void Kneefixfeetfixsystemcheckboxbeforeselecting() throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName() + " :   To verify Knee fix Feet fix system checkbox before selecting it ",
				" Knee fix Feet fix system checkbox should be unchecked mode");
		demo.BydefaultisSelected(Temp.Checkbox.get(3), "Knee fix Feet fix system checkbox",test,driver);

	}

	@Test(priority = 190)
	public void Kneefixfeetfixsystemcheckboxafterselecting() throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName() + " :   To verify Knee fix Feet fix system checkbox after selecting it ",
				" Knee fix Feet fix system checkbox should be selected mode");
		Temp.Checkbox.get(3).click();
		demo.isSelected(Temp.Checkbox.get(3), "Knee fix Feet fix system checkbox",test,driver);
		Temp.Checkbox.get(3).click();
		act.sendKeys(Keys.PAGE_DOWN).perform();

	}

	@Test(priority = 191)
	public void KneefixBaseplatecheckboxbeforeselecting() throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName() + " :   To verify Kneefix Base plate checkbox before selecting it ",
				" Kneefix Base plate checkbox should be unchecked mode");
		
		demo.BydefaultisSelected(Temp.Checkbox.get(4), "Kneefix Base plate",test,driver);

	}

	@Test(priority = 192)
	public void KneefixBaseplateBaseplatecheckboxafterselecting() throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName() + " :   To verify Kneefix Base plate checkbox after selecting it ",
				" Kneefix Base plate checkbox should be selected mode");
		Temp.Checkbox.get(4).click();
		demo.isSelected(Temp.Checkbox.get(4), "Kneefix Base plate",test,driver);
		Temp.Checkbox.get(4).click();

	}

	@Test(priority = 193)
	public void PelvicBaseplatecheckboxbeforeselecting() throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName() + " :   To verify Pelvic Base plate  checkbox before selecting it ",
				" Pelvic Base plate  checkbox should be unchecked mode");
		demo.BydefaultisSelected(Temp.Checkbox.get(5), "Pelvic Base plate",test,driver);

	}

	@Test(priority = 194)
	public void PelvicBaseplatecheckboxafterselecting() throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName() + " :   To verify Pelvic Base plate checkbox after selecting it ",
				" Pelvic Base plate checkbox should be selected mode");
		Temp.Checkbox.get(5).click();
		demo.isSelected(Temp.Checkbox.get(5), "Pelvic Base plate",test,driver);
		Temp.Checkbox.get(5).click();

	}

	@Test(priority = 195)
	public void SigmaLiteBoardcheckboxbeforeselecting() throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName() + " :   To verify Sigma Lite Board checkbox before selecting it ",
				" Sigma Lite Board  checkbox should be unchecked mode");
		demo.BydefaultisSelected(Temp.Checkbox.get(6), "Sigma Lite Board",test,driver);

	}

	@Test(priority = 195)
	public void SigmaLiteBoardcheckboxafterselecting() throws InterruptedException, IOException {
		test = extent.createTest(
				funTestCaseName() + " :   To verify Sigma Lite Board checkbox after selecting it ",
				" Sigma Lite Board checkbox should be selected mode");
		Temp.Checkbox.get(6).click();
		demo.isSelected(Temp.Checkbox.get(6), "Sigma Lite Board",test,driver);
		Temp.Checkbox.get(6).click();
		act.sendKeys(Keys.PAGE_DOWN).perform();
	}

	@Test(priority = 196)
	public void WingBoardcheckboxbeforeselecting() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName() + " :   To verify Wing Board checkbox before selecting it ",
				" Wing Board checkbox should be unchecked mode");
		demo.BydefaultisSelected(Temp.Checkbox.get(7), "Wing Board",test,driver);

	}
	
	@Test(priority = 197)
	public void WingBoardcheckboxafterselecting() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName() + " :   To verify Wing Board checkbox after selecting it ",
				" Wing Board checkbox should be selected mode");
		try {
		Temp.Checkbox.get(7).click();
		demo.isSelected(Temp.Checkbox.get(7), "Wing Board",test,driver);
		Temp.Checkbox.get(7).click();
		Thread.sleep(1000);
		}
		catch(Exception e)
		{
			 catchexceptionscreenshot(test,e);
		}
		finally {
		//Temp.Save.click();
		act.moveToElement(Temp.PatientImmobilzationsetupbutton).click().perform();
		Thread.sleep(5000);
		 Temp.OARAdd.click();
	     Temp.OARCloseButton.click();
		}
	}	
	
	
	@Test(priority=198, dataProvider = "testDatavalid")
	public void Templateadd(String Testcase, String Name, String Dose, String MinDose, String MaxDose, String Fractions, String IGRT, String Review, String CBC,String Bolus,String Gating) throws IOException, InterruptedException
	{
		
		test = extent.createTest(funTestCaseName()+" Treatment Parameters","Treatment Parameters GUI labels");
		TemplateText(Testcase, Name, Dose, MinDose, MaxDose, Fractions, IGRT, Review, CBC,Bolus,Gating);
		Temp.Save.click();
		Sitesave1("Template Add","Template Added for selected Site.", "Template Add","Template Added for selected Site.", 0, driver,test);	
	}
	@Test(priority = 199)  // After Save Exceute
	public void TemplatetextfieldifenteringsameTemplateName()
			throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+  " :  To verify the functionality of Entering same Template Name ",
				"Template Name already exists, please enter a different name! message should display");
		Temp.TemplateName.click();
		Temp.TemplateName.clear();
		Temp.TemplateName.sendKeys("H.e.&.5");
		Temp.Save.click();
		demo.Textcomparsion(Temp.TemplateNameexits,"Template Name already exists, please enter a different name!", test,driver);
		Temp.TemplateName.clear();
	}

	@Test(priority=200, dataProvider = "testDatavalidOAR")
	public void TemplateaddOAR(String Testcase, String Name, String Dose, String MinDose, String MaxDose, String Fractions, String IGRT, String Review, String CBC,String Bolus,String Gating,String OARName,String OARMin,String OARMax,String OARDescription) throws IOException, InterruptedException
	{
		
		TemplateText(Testcase, Name, Dose, MinDose, MaxDose, Fractions, IGRT, Review, CBC,Bolus,Gating);
		TemplateOAR(OARName,OARMin,OARMax,OARDescription);
		Thread.sleep(1000);
		Temp.Save.click();
	   
		test = extent.createTest(funTestCaseName()+"Template Save Popup","Template Popup should display");
		Sitesave1("Template Add","Template Added for selected Site.", "Template Add","Template Added for selected Site.", 0, driver,test);	
	}
		
	
	@Test(priority=201, dataProvider = "testDataEmpty")
	public void EmptyData(String Testcase, String Name, String Dose, String MinDose, String MaxDose, String Fractions, String IGRT, String Review, String CBC,String Bolus,String Gating,String E1) throws IOException, InterruptedException
	{
		
		TemplateText(Testcase, Name, Dose, MinDose, MaxDose, Fractions, IGRT, Review, CBC,Bolus,Gating);
		Temp.Save.click();
		demo.isdisplayed(Temp.Inputblank, E1, test, driver);
		
	}
	@Test(priority=202, dataProvider = "testDataReset")
	public void TemplateAddfield(String Testcase, String Name, String Dose, String MinDose, String MaxDose, String Fractions, String IGRT, String Review, String CBC,String Bolus,String Gating) throws IOException, InterruptedException
	{
		test=extent.createTest("==================Add Field==========");
		TemplateText(Testcase, Name, Dose, MinDose, MaxDose, Fractions, IGRT, Review, CBC,Bolus,Gating);
		test = extent.createTest(funTestCaseName()+"Click on Addfield, Data should be Reset","All the data should get reseted");
		Temp.Addfield.click();
		Textempty(test,driver);
		
	}
	@Test(priority=203, dataProvider = "testDataReset")
	public void TemplateReset(String Testcase, String Name, String Dose, String MinDose, String MaxDose, String Fractions, String IGRT, String Review, String CBC,String Bolus,String Gating) throws IOException, InterruptedException
	{
		test=extent.createTest("==================Reset Template==========");
		TemplateText(Testcase, Name, Dose, MinDose, MaxDose, Fractions, IGRT, Review, CBC,Bolus,Gating);
		test = extent.createTest(funTestCaseName()+"Click on Reset, Data should be Reseted","All the data should get reseted");
		Temp.Reset.click();
		Textempty(test,driver);
	}

	@Test(priority=204)
	public void Viewdata() throws IOException, InterruptedException
	{
		test = extent.createTest(funTestCaseName()+"Click on the View button, Edit Button should get displayed in enable state");
		Temp.ViewTemplate.click();
		Temp.Addfield.click();
		Thread.sleep(1000);	
		Temp.OARAdd.click();
		Temp.OARCloseButton.click();
		Thread.sleep(1000);	
		Temp.ViewTemplate.click();
		demo.isdisplayed(Temp.Edit, "EDIT", test, driver);
		demo.isEnabled(Temp.Edit, "EDIT", test, driver);
	}
	
	@Test(priority=205)
	public void EditClick() throws IOException
	{
		test = extent.createTest(funTestCaseName()+"Click on the Edit button, Update button should be displayed");
		Temp.Edit.click();
		demo.isdisplayed(Temp.Update, "UPDATE", test, driver);
		demo.isEnabled(Temp.Update, "UPDATE", test, driver);
	}
	@Test(priority=206)
	public void Editdatacompasrion() throws IOException
	{
		test = extent.createTest(funTestCaseName()+"Click on the Edit button, Check data is correct or not");
		Dataenetred(test);	
	}
	
	public void Dataenetred(ExtentTest test) throws IOException
	{
		demo.Textcomparsion(Temp.TemplateName, "H.e.&.5", test,driver);
		demo.Textcomparsion(Temp.TargetPrescriptionDose, "1", test,driver);
		demo.Textcomparsion(Temp.MinimumDose, "1", test,driver);
		demo.Textcomparsion(Temp.MaximumDose, "2", test,driver);
		demo.Textcomparsion(Temp.NumberofFractions, "1", test,driver);
		demo.Textcomparsion(Temp.RadiationType, "PHOTON", test,driver);
		demo.Textcomparsion(Temp.Energy, "6", test,driver);
		demo.Textcomparsion(Temp.IGRTCycle, "4", test,driver);
		demo.Textcomparsion(Temp.ReviewCycle, "5", test,driver);
		demo.Textcomparsion(Temp.CBCCyclelabel, "6", test,driver);
		demo.isSelected(Temp.BolusYes,  "Yes",test,driver);
		demo.isSelected(Temp.GatingYes,  "Yes",test,driver);
	}
	
	
	@Test(priority=207)
	public void EditandUpdate() throws IOException, InterruptedException
	{
		test = extent.createTest(funTestCaseName()+"Click on the Edit button, Without Modify click on the Update button");
		Temp.Update.click();
		Sitesave1("Template Update","Selected Template updated.", "Template Update","Selected Template updated.", 0, driver,test);
	}
	@Test(priority=208)
	public void EditandAddicon() throws IOException, InterruptedException
	{
		test = extent.createTest(funTestCaseName()+"Click on the Edit button, Without Modify click on the Add button");
		Temp.ViewTemplate.click();
		Temp.Edit.click();
		Temp.Addfield.click();
		Textempty(test,driver);
	}
	@Test(priority=209)
	public void EditandReseticon() throws IOException, InterruptedException
	{
		test = extent.createTest(funTestCaseName()+"Click on the Edit button, Without Modify click on the Reset button");
		Temp.ViewTemplate.click();
		Temp.Edit.click();
		Temp.Reset.click();
		demo.isdisplayed(Temp.Edit,"EDIT", test, driver);
	}
	
	@Test(priority=210)
	public void ModifyandReset() throws IOException, InterruptedException
	{
		test = extent.createTest(funTestCaseName()+"Click on the Edit button,  Modify the data click on the Reset Button");
		Temp.Edit.click();
		Modify(test,driver);
		Temp.Reset.click();
		demo.isdisplayed(Temp.Edit,"EDIT", test, driver);
		Temp.Edit.click();
		Dataenetred(test);
	}
	
	public void Modify(ExtentTest test,WebDriver driver) throws IOException
	{
		ReferenceText(Temp.TargetPrescriptionDose, "10000", test,driver);
		ReferenceText(Temp.MinimumDose, "9999", test,driver);
		ReferenceText(Temp.MaximumDose, "10000", test,driver);
		ReferenceText(Temp.NumberofFractions, "100", test,driver);
		ReferenceText(Temp.IGRTCycle, "99", test,driver);
		ReferenceText(Temp.ReviewCycle, "99", test,driver);
		ReferenceText(Temp.CBCCyclelabel, "99", test,driver);
		Temp.BolusNo.click();	
	}
	@Test(priority=211)
	public void ModifyandAdd() throws IOException, InterruptedException
	{
		test = extent.createTest(funTestCaseName()+"Click on the Edit button,  Modify the data click on the Add Button");

		Thread.sleep(1000);
		Modify(test,driver);
		Thread.sleep(1000);
		Temp.Addfield.click();
		Textempty(test,driver);
	}
	@Test(priority=212)
	public void ModifyandSave() throws IOException, InterruptedException
	{
		test = extent.createTest(funTestCaseName()+"Click on the Edit button,  Modify the data click on the Update Button");
		Temp.ViewTemplate.click();
		Temp.Edit.click();
		Modify(test,driver);
		Temp.Update.click();
		Sitesave1("Template Update","Selected Template updated.", "Template Update","Selected Template updated.", 0, driver,test);	
	}
	@Test(priority=213)
	public void Modifydatacheck() throws IOException
	{
		test = extent.createTest(funTestCaseName()+"Click on the Edit button, Check the modified data");
		Temp.ViewTemplate.click();
		Temp.Edit.click();
		demo.Textcomparsion(Temp.TargetPrescriptionDose, "10000", test,driver);
		demo.Textcomparsion(Temp.MinimumDose, "9999", test,driver);
		demo.Textcomparsion(Temp.MaximumDose, "10000", test,driver);
		demo.Textcomparsion(Temp.NumberofFractions, "100", test,driver);
		demo.Textcomparsion(Temp.IGRTCycle, "99", test,driver);
		demo.Textcomparsion(Temp.ReviewCycle, "99", test,driver);
		demo.Textcomparsion(Temp.CBCCyclelabel, "99", test,driver);
		demo.isSelected(Temp.BolusNo, "No", test, driver);
		demo.isSelected(Temp.GatingYes, "Yes", test, driver);
	}
	@Test(priority=214)
	public void Searchbytemplatename() throws InterruptedException, IOException {

		test = extent.createTest(funTestCaseName()+ " :   To verify Search templatename functionality ",
				"  It should allow to template and should displayed the filter data ");
		Temp.Searchbox.click();
		Temp.Searchbox.sendKeys("H.e.&.5");
		demo.Textcomparsion(Temp.TextNameC.get(0), "H.e.&.5", test,driver);
		Temp.Searchbox.clear();
		demo.isempty(Temp.Searchbox, "SearchBox", test, driver);
		Thread.sleep(500);
		
	}
	@Test(priority=215)
	public void Searchbytemplateinvalid() throws InterruptedException, IOException {

		test = extent.createTest(funTestCaseName()+ " :   To verify Search templatename Enter the sitename functionality ",
				" It should display empty data ");
		
		Thread.sleep(500);
		Temp.Searchbox.sendKeys("Head");
		Temp.Searchbox.click();
		Temp.Searchbox.clear();
		demo.isempty(Temp.Searchbox, "SearchBox", test, driver);
		
	}
	@Test(priority=216)
	public void Searchbyinvaliddata() throws InterruptedException, IOException {

		test = extent.createTest(funTestCaseName()+ " :   To verify Search templatename Enter the sitename functionality ",
				" It should display empty data ");
		Temp.Searchbox.sendKeys("1234567890");
		Temp.Searchbox.click();
		Temp.Searchbox.clear();
		demo.isempty(Temp.Searchbox, "SearchBox", test, driver);	
	}

	@Test(priority=217)
	public void Searchbysitename() throws InterruptedException, IOException {

		test = extent.createTest(funTestCaseName()+ " :   To verify Search SiteName functionality ",
				"  It should allow to template and should displayed the filter data ");
		Temp.ViewTemplate.click();
		String Sitedetails=Temp.Site.getText();
		Temp.ButtonNamesC.get(5).click();
		Temp.SiteName.click();
		Thread.sleep(500);
		Temp.Searchbox.sendKeys(Sitedetails);
		demo.Textcomparsion(Temp.TextNameC.get(0), "H.e.&.5", test,driver);
		Temp.Searchbox.clear();
		demo.isempty(Temp.Searchbox, "SearchBox", test, driver);
	}
	
	@Test(priority=218)
	public void SearchSiteInvalid() throws InterruptedException, IOException {

		test = extent.createTest(funTestCaseName()+ " :   To verify Search SiteName Invalid functionality ",
				" It should display empty data ");
		Temp.Searchbox.sendKeys("1234567890");
		Temp.Searchbox.clear();
		demo.isempty(Temp.Searchbox, "SearchBox", test, driver);
		
	}
	
	
	@Test(priority=219)
	public void delete() throws IOException
	{
		test = extent.createTest(funTestCaseName()+ " To verify the delete button is enabled by default");
		demo.isEnabled(Temp.Delete, "Delete", test, driver);
	}
	
	@Test(priority=220)
	public void deleteCancel() throws IOException, InterruptedException
	{
		Temp.Delete.click();
		test = extent.createTest(funTestCaseName()+ " Click on Cancel button in the delete pop-up");
		SitesaveCancel1("Template Delete","Do you want to delete the selected Template?", "Template Delete","Do you want to delete the selected Template?", 0, driver,test);	
	}
	@Test(priority=221)
	public void deleteok() throws IOException, InterruptedException
	{
		test = extent.createTest(funTestCaseName()+ " Click on delete pop-up ok button, Data should be deleted");
		Temp.Delete.click();
		Sitesave1("Template Delete","Do you want to delete the selected Template?", "Template Delete","Do you want to delete the selected Template?", 0, driver,test);	
		Sitesave1("Template Delete","Selected Template deleted.", "Template Delete","Selected Template deleted.", 0, driver,test);
	}
	
	
	public void ReferenceText(WebElement element,String Text,ExtentTest test,WebDriver driver) throws IOException
	{
		element.clear();
		element.click();
		element.sendKeys(Text);
	}
	
		public void Textempty(ExtentTest test,WebDriver driver) throws IOException
		{
			demo.Textcomparsion(Temp.Site, "Select any site", test,driver);
			demo.isempty(Temp.TemplateName, "Template Name", test,driver);
			demo.isempty(Temp.TargetPrescriptionDose, "TargetPrescription Dose", test,driver);
			demo.isempty(Temp.MinimumDose, "Minimum Dose", test,driver);
			demo.isempty(Temp.MaximumDose, "Maximum Dose", test,driver);
			demo.isempty(Temp.NumberofFractions, "Number of fractions", test,driver);
			demo.Textcomparsion(Temp.BeamType, "DYNAMIC", test,driver);
			demo.Textcomparsion(Temp.RadiationType, "PHOTON", test,driver);
			demo.Textcomparsion(Temp.Energy, "6", test,driver);
			demo.Textcomparsion(Temp.Technique, "BREAST_BRIDGE", test,driver);
			demo.isempty(Temp.IGRTCycle, "IGRT Cycle", test,driver);
			demo.isempty(Temp.ReviewCycle, "Review Cycle", test,driver);
			demo.isempty(Temp.CBCCyclelabel, "CBC Cycle", test,driver);
			demo.BydefaultisSelected(Temp.BolusYes,  "Yes",test,driver);
			demo.BydefaultisSelected(Temp.BolusNo,  "No",test,driver);
			demo.BydefaultisSelected(Temp.GatingYes,  "Yes",test,driver);
			demo.BydefaultisSelected(Temp.GatingNo,  "No",test,driver);
		}

	
	public void TemplateText(String Testcase1, String Name1, String Dose1, String MinDose1, String MaxDose1, String Fractions1, String IGRT1, String Review1, String CBC1,String Bolus1,String Gating1) throws IOException, InterruptedException
	{
		
		test=extent.createTest(guiTestCaseName()+","+Testcase1);
		RoleselectionText(test,0);
		Temp.TemplateName.clear();
		Temp.TemplateName.sendKeys(Name1);
		Temp.TargetPrescriptionDose.clear();
		Temp.TargetPrescriptionDose.sendKeys(Dose1);
		Temp.MinimumDose.clear();
		Temp.MinimumDose.sendKeys(MinDose1);
		Temp.MaximumDose.clear();
		Temp.MaximumDose.sendKeys(MaxDose1);
		Temp.NumberofFractions.clear();
		Temp.NumberofFractions.sendKeys(Fractions1);
		Roleselection(test,2);
		Roleselection(test,5);
		Temp.IGRTCycle.clear();
		Temp.IGRTCycle.sendKeys(IGRT1);
		Temp.ReviewCycle.clear();
		Temp.ReviewCycle.sendKeys(Review1);
		Temp.CBCCyclelabel.clear();
		Temp.CBCCyclelabel.sendKeys(CBC1);
		
		String xpathExpression = "//RadioButton[@ClassName='RadioButton'][@Name='" +Bolus1+ "'][2]";
		WebElement Bolusyes = driver.findElement(By.xpath(xpathExpression));
		Bolusyes.click();
		
		String xpathExpression1 = "//RadioButton[@ClassName='RadioButton'][@Name='" +Gating1+ "']";
		WebElement Gatingyes = driver.findElement(By.xpath(xpathExpression1));
		Gatingyes.click();
	}
	
	public void TemplateOAR(String OARName1,String OARMin1,String OARMax1,String OARDescription1) throws IOException, InterruptedException
	{
		test=extent.createTest(guiTestCaseName()+","+OARName1);
		Temp.OARAdd.click();
		Temp.OARName.clear();
		Temp.OARName.sendKeys(OARName1);
		
		Temp.OARMinDose.clear();
		Temp.OARMinDose.sendKeys(OARMin1);
		
		Temp.OARMaxDose.clear();
		Temp.OARMaxDose.sendKeys(OARMax1);
		
		Temp.OARDescription.clear();
		Temp.OARDescription.sendKeys(OARDescription1);
		Temp.OARInsertButton.click();
		Temp.OARCloseButton.click();
		
	}
	
	@DataProvider(name = "testDatavalid")   // Active
	  public Object[][] testDatavalidname() {
	      return ToleranceDataproviderClass.getUserTemplates("Sheet1"); 
	  }
	
	@DataProvider(name = "testDatavalidOAR")   // Active
	  public Object[][] testDatavalidOAR() {
	      return ToleranceDataproviderClass.getUserTemplates("Sheet2"); 
	  }
	
	@DataProvider(name = "testDataEmpty")   // Active
	  public Object[][] testDatavalidEmpty() {
	      return ToleranceDataproviderClass.getUserTemplates("Sheet6"); 
	  }
	
	@DataProvider(name = "testDataReset")   // Active
	  public Object[][] testDatavalidReset() {
	      return ToleranceDataproviderClass.getUserTemplates("Sheet5"); 
	  }
	
	
	

	
}

