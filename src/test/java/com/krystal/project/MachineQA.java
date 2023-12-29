package com.krystal.project;

import java.io.IOException;
import java.net.URL;
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

import io.appium.java_client.windows.WindowsDriver;

public class MachineQA extends ReferencefileChemotheraphy{
	private WebElement machineqa;
	private WebElement selectmachine;
	private WebElement import1;
	private WebElement selecttoltable;
	private WebElement toltable;
	private WebElement toltablenumber;
	private WebElement attributes;
	private WebElement tolerances;
	private WebElement ganangle;
	private WebElement beamlimitdevangle;
	private WebElement beamlimitdevposasymx;
	private WebElement beamlimitdevposasymy;
	private WebElement beamlimitdevposmlcx;
	private WebElement beamlimitdevposmlcy;
	private WebElement patientsupportangle;
	private WebElement tabletoplongpos;
	private WebElement tabletoplatpos;
	private WebElement tabletoppitchangle;
	private WebElement tabletoprollangle;
	private WebElement confirm;
	private WebElement close;
	private WebElement tabletopverticalpos;
	private WebElement description;
	private WebElement Ddrive;
	private WebElement Plans;
	private WebElement Valid;
	private WebElement DCMfile;
	private WebElement Open;
	private WebElement Validtionreport;
	private WebElement Validtionreportmismatch;
	private WebElement slNo;
	private WebElement TagNo;
	private WebElement TagName;
	private WebElement ExpectedResult;
	private WebElement ActualResult;
	private WebElement Close;
	private WebElement PlanID;
	private WebElement PlanName;
	private WebElement Ddrivefile;
	private Actions action;
	private Actions act;
	@Test(priority =1)
	public void launch()  throws InterruptedException, IOException {
	
	ReferenceSigin Sign=new ReferenceSigin();
	Sign.Login(driver);
	Sign.MachineQA(driver);
	action=new Actions(driver);
	act=new Actions(driver);
  }
	
	@Test(priority =2)
	public void Machineqa() throws IOException {
	test = extent.createTest("====GENERAL SETTINGS(MACHINE QA MODULE)====");
	test = extent.createTest(guiTestCaseName()+" Machine QA label"," Machine QA label should be present ");	
	machineqa=driver.findElement(By.name("Machine QA"));
	demo.Textcomparsion(machineqa, "Machine QA", test,driver);
	}
//@Test(priority =2)
	public void selectmachine() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Select Machine label"," Select Machine label should be present ");	
	selectmachine=driver.findElement(By.name("Select Machine"));
	demo.Textcomparsion(selectmachine, "Select Machine", test,driver);
	}
@Test(priority =2)
public void planID() throws IOException {
test = extent.createTest(guiTestCaseName()+" Plan ID label"," Plan ID label should be present ");	
PlanID=driver.findElement(By.name("Plan ID"));
demo.Textcomparsion(PlanID, "Plan ID", test,driver);
}

@Test(priority =2)
public void planName() throws IOException {
test = extent.createTest(guiTestCaseName()+" Plan Name label"," Plan Name label should be present ");	
PlanName=driver.findElement(By.name("Plan Name"));
demo.Textcomparsion(PlanName, "Plan Name", test,driver);
}
@Test(priority =3)
	public void Import() throws IOException {
	test = extent.createTest(guiTestCaseName()+" IMPORT label"," IMPORT label should be present ");	
	import1=driver.findElement(By.name("IMPORT"));
	demo.Textcomparsion(import1, "IMPORT", test,driver);
	demo.isEnabled(import1, "IMPORT", test,driver);
	}
@Test(priority =3)
public void Importclick() throws IOException
{
	test = extent.createTest(funTestCaseName()+" Import Button Click"," Tolerance screen should get opened");
	import1.click();
	demo.isdisplayed(selecttoltable, "Select Tolerance Table", test,driver);
}

@Test(priority =4)
public void Selecttolerancelabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Select Tolerance Table label"," Select Tolerance Table label should be present ");	
selecttoltable=driver.findElement(By.name("Select Tolerance Table"));
demo.Textcomparsion(selecttoltable, "Select Tolerance Table", test,driver);
}
@Test(priority =5)
public void Tolerancetablelabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Tolerance Table label"," Tolerance Table label should be present ");	
toltable=driver.findElement(By.name("Tolerance Table Name"));
demo.Textcomparsion(toltable, "Tolerance Table Name", test,driver);
}
@Test(priority =6)
public void Tolerancetablenumber() throws IOException {
test = extent.createTest(guiTestCaseName()+" Tolerance Table Number label"," Tolerance Table Number label should be present ");	
toltablenumber=driver.findElement(By.name("Tolerance Table Number"));
demo.Textcomparsion(toltablenumber, "Tolerance Table Number", test,driver);
}
@Test(priority =7)
public void Attributes() throws IOException {
test = extent.createTest(guiTestCaseName()+" Attributes label"," Attributes label should be present ");	
attributes=driver.findElement(By.name("Attributes"));
demo.Textcomparsion(attributes, "Attributes", test,driver);
}
@Test(priority =8)
public void Tolerances() throws IOException {
test = extent.createTest(guiTestCaseName()+" Tolerances label"," Tolerances label should be present ");	
tolerances=driver.findElement(By.name("Tolerances"));
demo.Textcomparsion(tolerances, "Tolerances", test,driver);
}
@Test(priority =9)
public void Gantryangle() throws IOException {
test = extent.createTest(guiTestCaseName()+" Gantry Angle label"," Gantry Angle label should be present ");	
ganangle=driver.findElement(By.name("Gantry Angle"));
demo.Textcomparsion(ganangle, "Gantry Angle", test,driver);
}
@Test(priority =10)
public void Beamlimitingdeviceangle() throws IOException {
test = extent.createTest(guiTestCaseName()+" Beam Limiting Device Angle"," Beam Limiting Device Angle label should be present ");	
beamlimitdevangle=driver.findElement(By.name("Beam Limiting Device Angle"));
demo.Textcomparsion(beamlimitdevangle, "Beam Limiting Device Angle", test,driver);
}
@Test(priority =11)
public void Beamlimitingdevicepositionasymx() throws IOException {
test = extent.createTest(guiTestCaseName()+" Beam Limiting Device Position ASYMX"," Beam Limiting Device Position ASYMX label should be present ");	
beamlimitdevposasymx=driver.findElement(By.name("Beam Limiting Device Position ASYMX"));
demo.Textcomparsion(beamlimitdevposasymx, "Beam Limiting Device Position ASYMX", test,driver);
}
@Test(priority =12)
public void Beamlimitingdevicepositionasymy() throws IOException {
test = extent.createTest(guiTestCaseName()+" Beam Limiting Device Position ASYMY"," Beam Limiting Device Position ASYMY label should be present ");	
beamlimitdevposasymy=driver.findElement(By.name("Beam Limiting Device Position ASYMY"));
demo.Textcomparsion(beamlimitdevposasymy, "Beam Limiting Device Position ASYMY", test,driver);
}
@Test(priority =13)
public void Beamlimitingdevicepositionmlcx() throws IOException {
test = extent.createTest(guiTestCaseName()+" Beam Limiting Device Position MLCX"," Beam Limiting Device Position MLCX label should be present ");	
beamlimitdevposmlcx=driver.findElement(By.name("Beam Limiting Device Position MLCX"));
demo.Textcomparsion(beamlimitdevposmlcx, "Beam Limiting Device Position MLCX", test,driver);
}
@Test(priority =14)
public void Beamlimitingdevicepositionmlcy() throws IOException {
test = extent.createTest(guiTestCaseName()+" Beam Limiting Device Position MLCY"," Beam Limiting Device Position MLCY label should be present ");	
beamlimitdevposmlcy=driver.findElement(By.name("Beam Limiting Device Position MLCY"));
demo.Textcomparsion(beamlimitdevposmlcy, "Beam Limiting Device Position MLCY", test,driver);
}
@Test(priority =15)
public void Patientsupportangle() throws IOException {
test = extent.createTest(guiTestCaseName()+" Patient Support Angle"," Patient Support Angle label should be present ");	
patientsupportangle=driver.findElement(By.name("Patient Support Angle"));
demo.Textcomparsion(patientsupportangle, "Patient Support Angle", test,driver);
}
@Test(priority =16)
public void Tabletoplongitudinalposition() throws IOException {
test = extent.createTest(guiTestCaseName()+" Table Top Longitudinal Position"," Table Top Longitudinal Position label should be present ");	
tabletoplongpos=driver.findElement(By.name("Table Top Longitudinal Position"));
demo.Textcomparsion(tabletoplongpos, "Table Top Longitudinal Position", test,driver);
}
@Test(priority =17)
public void Tabletoplateralposition() throws IOException {
test = extent.createTest(guiTestCaseName()+" Table Top Lateral Position"," Table Top Lateral Position label should be present ");	
tabletoplatpos=driver.findElement(By.name("Table Top Lateral Position"));
demo.Textcomparsion(tabletoplatpos, "Table Top Lateral Position", test,driver);
}
@Test(priority =18)
public void Tabletopverticalposition() throws IOException {
test = extent.createTest(guiTestCaseName()+" Table Top Vertical Position"," Table Top Vertical Position label should be present ");	
tabletopverticalpos=driver.findElement(By.name("Table Top Vertical Position"));
demo.Textcomparsion(tabletopverticalpos, "Table Top Vertical Position", test,driver);
}
@Test(priority =19)
public void Tabletoppitchangle() throws IOException {
test = extent.createTest(guiTestCaseName()+" Table Top Pitch Angle"," Table Top Pitch Angle label should be present ");	
tabletoppitchangle=driver.findElement(By.name("Table Top Pitch Angle"));
demo.Textcomparsion(tabletoppitchangle, "Table Top Pitch Angle", test,driver);
}
@Test(priority =20)
public void Tabletoprollangle() throws IOException {
test = extent.createTest(guiTestCaseName()+" Table Top Roll Angle"," Table Top Roll Angle label should be present ");	
tabletoprollangle=driver.findElement(By.name("Table Top Roll Angle"));
demo.Textcomparsion(tabletoprollangle, "Table Top Roll Angle", test,driver);
}
@Test(priority =21)
public void Confirm() throws IOException {
test = extent.createTest(guiTestCaseName()+" CONFIRM"," CONFIRM label should be present ");	
confirm=driver.findElement(By.name("CONFIRM"));
demo.Textcomparsion(confirm, "CONFIRM", test,driver);
demo.isEnabled(confirm, "CONFIRM", test, driver);
}
@Test(priority =22)
public void Close() throws IOException {
test = extent.createTest(guiTestCaseName()+" CLOSE"," CLOSE label should be present ");	
close=driver.findElement(By.name("CLOSE"));
demo.isEnabled(close, "CLOSE", test, driver);
}

@Test(priority =22)
public void Description() throws IOException {
test = extent.createTest(guiTestCaseName()+" Description"," Description should be present ");	
description=driver.findElement(By.name("*All Linear Motions are in cm and Rotational Motions are in degrees"));
demo.Textcomparsion(description, "*All Linear Motions are in cm and Rotational Motions are in degrees", test,driver);
}


@Test(priority =22)

public void InValid() throws IOException, InterruptedException {
	test = extent.createTest(funTestCaseName()+"Importing invalid plan","Error message should be displayed");
	Confrimclick("MisMatchPlan");
	Thread.sleep(5000);
	Sitesave1("Machine QA Plan Validation", "Machine QA Plan Validated, Machine QA Plan is invalid, hence cannot be imported.", "Machine QA Plan Validation", "Machine QA Plan Validated, Machine QA Plan is invalid, hence cannot be imported.", 0,driver,test);
	
	/*
	test = extent.createTest(funTestCaseName()+"Invalid tag Mismtach error messages pop-up is displayed or not.","Invalid tag Mismtach error messages pop-up is displayed or not.");
	
	String Text="VALIDATION REPORT";
	String Text1="Mismatched or Invalid tags were found in the DICOM Plan.The imported DICOM Plan is Invalid and hence cannot be approved.";
	String Text2="CLOSE";
	WebElement Report=driver.findElement(By.name(Text));
	WebElement Invalidmismatch=driver.findElement(By.name(Text1));
	WebElement Close=driver.findElement(By.name(Text2));
	
	demo.isdisplayed(Report, Text, test, driver);
	demo.Textcomparsion(Report, "VALIDATION REPORT", test, driver);
	
	demo.isdisplayed(Invalidmismatch, "Mismatched or Invalid tags were found in the DICOM Plan.The imported DICOM Plan is Invalid and hence cannot be approved.", test, driver);
	demo.Textcomparsion(Invalidmismatch, "VALIDATION REPORT", test, driver);
	
	demo.isdisplayed(Close, Text2, test, driver);
	demo.Textcomparsion(Close, "CLOSE", test, driver);
	if(Close.isEnabled())
	{
		test.pass("Close Button is enabled");
		Close.click();
	}
	else
	{
		test.fail("Close Button is not enabled");
	}
	*/
	
	
}


@Test(priority =24)
public void Validtionreport() throws IOException {
test = extent.createTest(guiTestCaseName()+" Validation Report label "," Validation Report label present ");	
Validtionreport=driver.findElement(By.name("VALIDATION REPORT"));
demo.Textcomparsion(Validtionreport,"VALIDATION REPORT", test,driver);
}

@Test(priority =25)
public void Validtionreportmismatch() throws IOException {
test = extent.createTest(guiTestCaseName()+" Description Validation Report label "," Description Validation Report label present ");	
Validtionreportmismatch=driver.findElement(By.name("Mismatched or Invalid tags were found in the DICOM Plan.The imported DICOM Plan is Invalid and hence cannot be approved."));
demo.Textcomparsion(Validtionreport,"VALIDATION REPORT", test,driver);
}
@Test(priority =26)
public void ValidtionslNo() throws IOException {
test = extent.createTest(guiTestCaseName()+" sl No label "," sl No label present ");	
slNo=driver.findElement(By.name("Sl No."));
demo.Textcomparsion(slNo,"Sl No.",test,driver);
}
@Test(priority =27)
public void ValidtionTagNo() throws IOException {
test = extent.createTest(guiTestCaseName()+" Tag No label "," Tag Nolabel present ");	
TagNo=driver.findElement(By.name("Tag No."));
demo.Textcomparsion(TagNo,"Tag No.", test,driver);
}
@Test(priority =28)
public void ValidtionTagName() throws IOException {
test = extent.createTest(guiTestCaseName()+" Tag Name label "," Tag Name label present ");	
TagName=driver.findElement(By.name("Tag Name"));
demo.Textcomparsion(TagName,"Tag Name", test,driver);
}
@Test(priority =29)
public void ValidtionExcepted() throws IOException {
test = extent.createTest(guiTestCaseName()+" Expected result Report label "," Expected result Report label present ");	
ExpectedResult=driver.findElement(By.name("Expected Result"));
demo.Textcomparsion(ExpectedResult,"Expected Result", test,driver);
}
@Test(priority =30)
public void ValidtionActual() throws IOException {
test = extent.createTest(guiTestCaseName()+" Validation Actual label "," Validation Actual label present ");	
ActualResult=driver.findElement(By.name("Actual Result"));
demo.Textcomparsion(ActualResult,"Actual Result", test,driver);
}

@Test(priority =31)
public void ValidationClose() throws IOException {
test = extent.createTest(guiTestCaseName()+" CLOSE label "," CLOSE label present ");	
Close=driver.findElement(By.name("CLOSE"));
demo.Textcomparsion(Close,"CLOSE", test,driver);
demo.isEnabled(Close,"CLOSE", test,driver);
}

@Test(priority =32)
public void ValidationClick() throws IOException {
test = extent.createTest(funTestCaseName()+" Close Click button"," Close Click");	
if(Close.isEnabled())
{
	test.pass("Close Button is enabled");
	Close.click();
}
else
{
	test.fail("Close Button is not enabled");
}
}

@Test(priority =33) 
public void Valid() throws IOException, InterruptedException {
	test = extent.createTest(funTestCaseName()+"Importing Valid plan","Plan should be imported and pop-up should be displayed");
	Thread.sleep(1000);
	import1.click();
	Thread.sleep(1000);
	Confrimclick("ValidPlan");
	Thread.sleep(1000);
	Sitesave1("Machine QA Plan Import", "Machine QA Plan Imported.", "Machine QA Plan Import", "Machine QA Plan Imported.", 0,driver,test);
}
@Test(priority =34)
public void Planalreadyexits() throws IOException, InterruptedException {
	test = extent.createTest(funTestCaseName()+"Importing Valided plan already exits","Plan should be imported and pop-up should be displayed");
	import1.click();
	Thread.sleep(1000);
	Confrimclick("PlanValid");
	Sitesave1("Machine QA Plan Import", "Machine QA Plan already exists, hence cannot be imported.", "Machine QA Plan Import", "Machine QA Plan already exists, hence cannot be imported.", 0,driver,test);
}
@Test(priority =35)
public void Plandelete() throws IOException, InterruptedException {
	test = extent.createTest(funTestCaseName()+"Deleteing Imported plan ","Plan should be deleted and pop-up should be displayed");
	WebElement deletebutton=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"MachineQASection1View\"]/DataGrid[@ClassName=\"DataGrid\"]/DataItem[@ClassName=\"DataGridRow\"][@Name=\"Presentation.UiElements.ViewModels.TableViewModel\"]/Custom[@ClassName=\"DataGridCell\"][starts-with(@Name,\"Item: Presentation.UiElements.ViewModels.TableViewModel, Column \")]/Button[@ClassName=\"Button\"][1]"));
	demo.isEnabled(deletebutton, "Delete", test, driver);
	deletebutton.click();
	Sitesave1("Machine QA Delete", "Do you want to delete the selected Machine QA plan?", "Machine QA Delete", "Do you want to delete the selected Machine QA plan?", 0,driver,test);
	Thread.sleep(1000);
	Sitesave1("Machine QA Delete", "Selected Machine QA Plan Deleted.", "Machine QA Delete", "Selected Machine QA Plan Deleted.", 0,driver,test);
}
@Test(priority =38)
public void DeletedPlanimport() throws IOException, InterruptedException{
	test = extent.createTest(funTestCaseName()+"Importing Deleted Plan ","Plan should be imported and pop-up should be displayed");
	import1.click();
	Thread.sleep(1000);
	Confrimclick("PlanValid");
	Thread.sleep(1000);
	Sitesave1("Machine QA Plan Import", "Machine QA Plan Imported.", "Machine QA Plan Import", "Machine QA Plan Imported.", 0,driver,test);
	
}
public void Confrimclick(String name) throws IOException, InterruptedException {	
confirm.click();
Thread.sleep(2000);
Actions action=new Actions(driver);
//Ddrive=driver.findElement(By.name("New Volume (D:)"));
Ddrivefile=driver.findElement(By.name("New Volume (D:)"));
action.moveToElement(Ddrivefile).click().perform();

Thread.sleep(1000);
Plans=driver.findElement(By.name("PLANS"));

action.moveToElement(Plans).doubleClick().perform();
Valid=driver.findElement(By.name(name)); 
action.moveToElement(Valid).doubleClick().perform();
Thread.sleep(1000);
List<WebElement> elements = driver.findElements(By.name("Name"));

WebElement desiredElement = elements.get(1);
action.moveToElement(desiredElement).doubleClick().perform();
Thread.sleep(5000);
}





}
