package com.krystal.project;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import io.appium.java_client.windows.WindowsDriver;


public class ToleranceRangeConfigurationTest extends Referencefile {
	WebElement Gantry;
	WebElement GantryRotationAngle;
	WebElement GantryRotationAngleMin;
	WebElement GantryRotationAngleMax;
	WebElement BeamLimitingDevice;
	WebElement BeamLimitingDeviceRotationAngle;
	WebElement BeamLimitingDeviceRotationAngleMin;
	WebElement BeamLimitingDeviceRotationAngleMax;
	WebElement Jaws;
	WebElement JawsMin;
	WebElement JawsMax;
	WebElement MLC1Leaf;
	WebElement MLC1LeafMin;
	WebElement MLC1LeafMax;
	WebElement MLC2Leaf;
	WebElement MLC2LeafMin;
	WebElement MLC2LeafMax;
	WebElement PatientSupport;
	WebElement PatientSupportRotationAngle;
	WebElement PatientSupportRotationAngleMin;
	WebElement PatientSupportRotationAngleMax;
	WebElement Longitudinal;
	WebElement LongitudinalMin;
	WebElement LongitudinalMax;	
	WebElement Lateral;
	WebElement LateralMin;
	WebElement LateralMax;
	WebElement Vertical;
	WebElement VerticalMin;
	WebElement VerticalMax;
	WebElement PitchAngle;
	WebElement PitchAngleMin;
	WebElement PitchAngleMax;
	WebElement RollAngle;
	WebElement RollAngleMin;
	WebElement RollAngleMax;
	WebElement Save;
	WebElement Update;
	WebElement Edit;

	public WindowsDriver<WebElement> driver;
	public ExtentTest test;

	
@BeforeClass
public void setUp1()  throws InterruptedException, IOException {
DesiredCapabilities appCapabilities = new DesiredCapabilities();
appCapabilities.setCapability("app", "C:\\Program Files\\Panacea Medical Technologies\\Krystal\\Krystal.exe");
driver = new WindowsDriver<WebElement>(new URL("http://127.0.0.1:4723"), appCapabilities);
Servicelogin();
}


public void Servicelogin() throws InterruptedException {
WebElement Userbx = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Edit[@AutomationId=\"TxtbxUsername\"]"));
Userbx.click();
driver.switchTo().activeElement().sendKeys("s");
Thread.sleep(1000);
 WebElement Pswdbox = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Edit[@AutomationId=\"PwdBoxUserPassword\"]"));
Pswdbox.click();
	driver.switchTo().activeElement().sendKeys("s");
	WebElement Signinbutton = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Button[@Name=\"SIGN IN\"][@AutomationId=\"BtnValidate\"]"));
	Signinbutton.click();
	Thread.sleep(1000);
WebElement Generatorsettings = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneratorSettingsMainView\"]/Custom[@ClassName=\"GeneratorSettingsSection1View\"]/ComboBox[@ClassName=\"ComboBox\"]"));
Generatorsettings.click();
Thread.sleep(5000);
WebElement Tolerancesettings = driver.findElement(By.name("Tolerance Range Configuration"));
Actions actions = new Actions(driver);
actions.doubleClick(Tolerancesettings).perform(); 
}
//@Test(priority=1)
public void button() throws InterruptedException{
	List<WebElement> elements = driver.findElements(By.className("TextBlock"));
    Actions actions = new Actions(driver);
    for (WebElement element : elements) {
        actions.moveToElement(element).perform();
        System.out.println(element.getText());
        Thread.sleep(1000);
    }
	}

@Test(priority=2)
	public void Gantry() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" To verify the Gantry label","Gantrye label should be present ");
		Gantry=driver.findElement(By.name("Gantry"));
		demo.Textcomparsion(Gantry, "Gantry", test,driver); 
	}
	@Test(priority=3)
	public void GantryRotationAngle() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" To verify the Gantry Rotation Angle label","Gantry Rotation Angle label should be present ");
		GantryRotationAngle=driver.findElement(By.name("Rotation Angle(deg)"));
		demo.Textcomparsion(GantryRotationAngle, "Rotation Angle(deg)", test,driver); 
	}
	@Test(priority=4)
	public void GantryRotationAngleMin() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" To verify the Gantry Rotation AngleMin label","Gantry Rotation AngleMin label should be present ");
		GantryRotationAngleMin=driver.findElements(By.className("TextBlock")).get(14);
		demo.Textcomparsion(GantryRotationAngleMin, "Min", test,driver); 
	}
	@Test(priority=5)
	public void GantryRotationAngleMax() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" To verify the Gantry Rotation AngleMax label","Gantry Rotation AngleMax label should be present ");
		//GantryRotationAngleMax=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneratorSettingsMainView\"]/Custom[@ClassName=\"ToleranceRangeConfigurationView\"]/Edit[starts-with(@AutomationId,\"TextBoxViewModelGantryMax\")]/Text[@Name=\"Max\"][@AutomationId=\"LblName\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Max\"]"));
		GantryRotationAngleMax=driver.findElements(By.className("TextBlock")).get(16);
		demo.Textcomparsion(GantryRotationAngleMax, "Max", test,driver); 	
	}
	@Test(priority=6)
	public void tableNumberInvalidAlphabhets() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" Beam Limiting Device label","Beam Limiting Device label should be present ");
		BeamLimitingDevice=driver.findElement(By.name("Beam Limiting Device"));
		demo.Textcomparsion(BeamLimitingDevice, "Beam Limiting Device", test,driver); 
	}
	@Test(priority=7)
	public void BeamLimitingDeviceRotationAngle() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" To verify the Beam Limiting Device Rotation Angle label","Beam Limiting Device Rotation Angle label should be present ");
		BeamLimitingDeviceRotationAngle=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneratorSettingsMainView\"]/Custom[@ClassName=\"ToleranceRangeConfigurationView\"]/Text[@ClassName=\"Text\"][@Name=\"Rotation Angle(deg)\"]/Text[@Name=\"Rotation Angle(deg)\"][@AutomationId=\"Label\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Rotation Angle(deg)\"]"));
		//BeamLimitingDeviceRotationAngle=driver.findElements(By.className("TextBlock")).get(19);
		demo.Textcomparsion(BeamLimitingDeviceRotationAngle, "Rotation Angle(deg)", test,driver); 
	}
	@Test(priority=8)
	public void BeamLimitingDeviceRotationAngleMin() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" Beam Limiting Device Rotation Angle Min Label","Beam Limiting Device Rotation AngleMin label should be present");
		//BeamLimitingDeviceRotationAngleMin=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneratorSettingsMainView\"]/Custom[@ClassName=\"ToleranceRangeConfigurationView\"]/Edit[starts-with(@AutomationId,\"TextBoxViewModelBeamAngleMin\")]"));
		BeamLimitingDeviceRotationAngleMin=driver.findElements(By.className("TextBlock")).get(20);
		demo.Textcomparsion(BeamLimitingDeviceRotationAngleMin, "Min", test,driver); 
	}
	@Test(priority=9)
	public void BeamLimitingDeviceRotationAngleMax() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" Beam Limiting Device Rotation AngleMax label","Beam Limiting Device Rotation AngleMax label should be present ");
		//BeamLimitingDeviceRotationAngleMax=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneratorSettingsMainView\"]/Custom[@ClassName=\"ToleranceRangeConfigurationView\"]/Edit[starts-with(@AutomationId,\"TextBoxViewModelBeamAngleMax\")]"));	
		BeamLimitingDeviceRotationAngleMax=driver.findElements(By.className("TextBlock")).get(22);
		demo.Textcomparsion(BeamLimitingDeviceRotationAngleMax, "Max", test,driver); 
	}
	@Test(priority=10)
	public void Jaws() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" Jaws label","Jaws label should be present ");
		Jaws=driver.findElement(By.name("Jaws(cm)"));
		demo.Textcomparsion(Jaws, "Jaws(cm)", test,driver); 
	}
	@Test(priority=11)
	public void JawsMin() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" Jaws Min label","Jaws Min label should be present ");
		//JawsMin=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneratorSettingsMainView\"]/Custom[@ClassName=\"ToleranceRangeConfigurationView\"]/Edit[starts-with(@AutomationId,\"TextBoxViewModelJawsMin\")]"));
		JawsMin=driver.findElements(By.className("TextBlock")).get(24);
		demo.Textcomparsion(JawsMin, "Min", test,driver); 
	}
	@Test(priority=12)
	public void JawsMax() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" Jaws Max label","Jaws Max label should be present ");
		//JawsMax=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneratorSettingsMainView\"]/Custom[@ClassName=\"ToleranceRangeConfigurationView\"]/Edit[starts-with(@AutomationId,\"TextBoxViewModelJawsMax\")]"));
		JawsMax=driver.findElements(By.className("TextBlock")).get(26);
		demo.Textcomparsion(JawsMax, "Max", test,driver); 
	}
	@Test(priority=13)
	public void MLC1Leaf() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" MLC1 Leaf label","MLC1 Leaf label should be present ");
		MLC1Leaf=driver.findElement(By.name("MLC1 Leaf(cm)"));
		demo.Textcomparsion(MLC1Leaf, "MLC1 Leaf(cm)", test,driver); 
	}
	@Test(priority=14)
	public void MLC1LeafMin() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" MLC1 LeafMin label","MLC1 LeafMin label should be present ");
		//MLC1LeafMin=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneratorSettingsMainView\"]/Custom[@ClassName=\"ToleranceRangeConfigurationView\"]/Edit[starts-with(@AutomationId,\"TextBoxViewModelMlcMin\")]"));
		MLC1LeafMin=driver.findElements(By.className("TextBlock")).get(28);
		demo.Textcomparsion(MLC1LeafMin, "Min", test,driver); 
	
	}
	@Test(priority=15)
	public void MLC1LeafMax() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" MLC1 LeafMax label","MLC1 LeafMax label should be present ");
		//MLC1LeafMax=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneratorSettingsMainView\"]/Custom[@ClassName=\"ToleranceRangeConfigurationView\"]/Edit[starts-with(@AutomationId,\"TextBoxViewModelMlcMax\")]"));
		MLC1LeafMax=driver.findElements(By.className("TextBlock")).get(30);
		demo.Textcomparsion(MLC1LeafMax, "Max", test,driver); 
		
	}
	@Test(priority=16)
	public void MLC2Leaf() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" MLC2 Leaf label","MLC2 Leaf label should be present ");
		MLC2Leaf=driver.findElement(By.name("MLCI2 Leaf(cm)"));
		demo.Textcomparsion(MLC2Leaf, "MLCI2 Leaf(cm)", test,driver); 
		
	}
	@Test(priority=17)
	public void MLC2LeafMin() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" MLC2 LeafMin label","MLC2 LeafMin label should be present ");
		//MLC2LeafMin=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneratorSettingsMainView\"]/Custom[@ClassName=\"ToleranceRangeConfigurationView\"]/Edit[@AutomationId=\"TextBoxViewModelMlc2Min1\"]"));
		MLC2LeafMin=driver.findElements(By.className("TextBlock")).get(32);
		demo.Textcomparsion(MLC2LeafMin, "Min", test,driver); 
		
	}
	@Test(priority=18)
	public void MLC2LeafMax() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" MLC2 LeafMax label","MLC2 LeafMax label should be present ");
		//MLC2LeafMax=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneratorSettingsMainView\"]/Custom[@ClassName=\"ToleranceRangeConfigurationView\"]/Edit[@AutomationId=\"TextBoxViewModelMlc2Max1\"]"));
		MLC2LeafMax=driver.findElements(By.className("TextBlock")).get(34);
		demo.Textcomparsion(MLC2LeafMax, "Max", test,driver); 
	}
	@Test(priority=19)
	public void PatientSupport() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" Patient Support label","Patient Support label should be present ");
		PatientSupport=driver.findElement(By.name("Patient Support"));
		demo.Textcomparsion(PatientSupport, "Patient Support", test,driver); 
	}
	@Test(priority=20)
	public void PatientSupportRotationAngle() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" Patient Support RotationA ngle label","Patient Support Rotation Angle label should be present ");
		PatientSupportRotationAngle=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneratorSettingsMainView\"]/Custom[@ClassName=\"ToleranceRangeConfigurationView\"]/Text[@ClassName=\"Text\"][@Name=\"Rotation Angle(deg)\"]/Text[@Name=\"Rotation Angle(deg)\"][@AutomationId=\"Label\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Rotation Angle(deg)\"]"));
		demo.Textcomparsion(PatientSupportRotationAngle, "Rotation Angle(deg)", test,driver); 	
	}
	@Test(priority=21)
	public void PatientSupportRotationAngleMin() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" Patient Support Rotation AngleMin label","Patient Support Rotation AngleMin label should be present ");
		//PatientSupportRotationAngleMin=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneratorSettingsMainView\"]/Custom[@ClassName=\"ToleranceRangeConfigurationView\"]/Edit[starts-with(@AutomationId,\"TextBoxViewModelRotationMin\")]"));
		PatientSupportRotationAngleMin=driver.findElements(By.className("TextBlock")).get(37);
		demo.Textcomparsion(PatientSupportRotationAngleMin, "Min", test,driver); 
	}
	@Test(priority=22)
	public void PatientSupportRotationAngleMax() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" Patient Support Rotation AngleMax label","Patient Support Rotation AngleMax label should be present ");
		//PatientSupportRotationAngleMax=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneratorSettingsMainView\"]/Custom[@ClassName=\"ToleranceRangeConfigurationView\"]/Edit[starts-with(@AutomationId,\"TextBoxViewModelRotationMax\")]"));
		PatientSupportRotationAngleMax=driver.findElements(By.className("TextBlock")).get(39);
		demo.Textcomparsion(PatientSupportRotationAngleMax, "Max", test,driver); 
		
	}
	@Test(priority=23)
	public void Longitudinal() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" Longitudinal label","Longitudinal label should be present ");
		Longitudinal=driver.findElement(By.name("Longitudinal(cm)"));
		demo.Textcomparsion(Longitudinal, "Longitudinal(cm)", test,driver); 
		
	}
	@Test(priority=24)
	public void LongitudinalMin() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" LongitudinalMin label","LongitudinalMin label should be present ");
		//LongitudinalMin=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneratorSettingsMainView\"]/Custom[@ClassName=\"ToleranceRangeConfigurationView\"]/Edit[starts-with(@AutomationId,\"TextBoxViewModelLogitudinalMin\")]"));
		LongitudinalMin=driver.findElements(By.className("TextBlock")).get(41);
		demo.Textcomparsion(LongitudinalMin, "Min", test,driver); 
		
	}
	@Test(priority=25)
	public void LongitudinalMax() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" LongitudinalMax label","LongitudinalMax label should be present ");
		//LongitudinalMax=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneratorSettingsMainView\"]/Custom[@ClassName=\"ToleranceRangeConfigurationView\"]/Edit[starts-with(@AutomationId,\"TextBoxViewModelLogitudinalMax\")]"));
		LongitudinalMax=driver.findElements(By.className("TextBlock")).get(43);
		demo.Textcomparsion(LongitudinalMax, "Max", test,driver); 
		
	}
	@Test(priority=26)
	public void Lateral() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" Lateral label","Lateral label should be present ");
		Lateral=driver.findElement(By.name("Lateral(cm)"));
		demo.Textcomparsion(Lateral, "Lateral(cm)", test,driver); 
		
	}
	@Test(priority=27)
	public void LateralMin() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" LateralMin label","LateralMin label should be present ");
		//LateralMin=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneratorSettingsMainView\"]/Custom[@ClassName=\"ToleranceRangeConfigurationView\"]/Edit[starts-with(@AutomationId,\"TextBoxViewModelLateralMin\")]"));
		LateralMin=driver.findElements(By.className("TextBlock")).get(45);
		demo.Textcomparsion(LateralMin, "Min", test,driver); 
	
	}
	@Test(priority=28)
	public void LateralMax() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" LateralMax label","LateralMax label should be present ");
		//LateralMax=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneratorSettingsMainView\"]/Custom[@ClassName=\"ToleranceRangeConfigurationView\"]/Edit[starts-with(@AutomationId,\"TextBoxViewModelLateralMax\")]"));
		LateralMax=driver.findElements(By.className("TextBlock")).get(47);
		demo.Textcomparsion(LateralMax, "Max", test,driver); 
	
	}
	@Test(priority=29)
	public void Vertical() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" Vertical label","Vertical label should be present ");
		Vertical=driver.findElement(By.name("Vertical(cm)"));
		demo.Textcomparsion(Vertical, "Vertical(cm)", test,driver); 
		
	}
	@Test(priority=30)
	public void VerticalMin() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" VerticalMin label","VerticalMin label should be present ");
		//VerticalMin=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneratorSettingsMainView\"]/Custom[@ClassName=\"ToleranceRangeConfigurationView\"]/Edit[starts-with(@AutomationId,\"TextBoxViewModelVerticalMin\")]"));
		VerticalMin=driver.findElements(By.className("TextBlock")).get(49);
		demo.Textcomparsion(VerticalMin, "Min", test,driver); 
	
	}
	@Test(priority=31)
	public void VerticalMax() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" VerticalMax label","VerticalMax label should be present ");
		//VerticalMax=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneratorSettingsMainView\"]/Custom[@ClassName=\"ToleranceRangeConfigurationView\"]/Edit[starts-with(@AutomationId,\"TextBoxViewModelVerticalMax\")]"));
		VerticalMax=driver.findElements(By.className("TextBlock")).get(51);
		demo.Textcomparsion(VerticalMax, "Max", test,driver); 
		
	}
	@Test(priority=32)
	public void PitchAngle() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" Pitch Angle label","Pitch Angle label should be present ");
		PitchAngle=driver.findElement(By.name("Pitch Angle(deg)"));
		demo.Textcomparsion(PitchAngle, "Pitch Angle(deg)", test,driver); 
		
	}
	@Test(priority=33)
	public void PitchAngleMin() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" Pitch AngleMin label","Pitch AngleMin label should be present ");
		//PitchAngleMin=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneratorSettingsMainView\"]/Custom[@ClassName=\"ToleranceRangeConfigurationView\"]/Edit[starts-with(@AutomationId,\"TextBoxViewModelPitchMin\")]"));
		PitchAngleMin=driver.findElements(By.className("TextBlock")).get(53);
		demo.Textcomparsion(PitchAngleMin, "Min", test,driver); 
		
	}
	@Test(priority=34)
	public void PitchAngleMax() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" Pitch AngleMax label","Pitch AngleMax label should be present ");
		//PitchAngleMax=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneratorSettingsMainView\"]/Custom[@ClassName=\"ToleranceRangeConfigurationView\"]/Edit[starts-with(@AutomationId,\"TextBoxViewModelPitchMax\")]"));
		PitchAngleMax=driver.findElements(By.className("TextBlock")).get(55);
		demo.Textcomparsion(PitchAngleMax, "Max", test,driver); 
	
	}
	@Test(priority=35)
	public void RollAngle() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" Roll Angle label","Roll Angle label should be present ");
		RollAngle=driver.findElement(By.name("Roll Angle(deg)"));
		demo.Textcomparsion(RollAngle, "Roll Angle(deg)", test,driver); 
	}
	@Test(priority=36)
	public void RollAngleMin() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" Roll AngleMin label","Roll AngleMin label should be present ");
		//RollAngleMin=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneratorSettingsMainView\"]/Custom[@ClassName=\"ToleranceRangeConfigurationView\"]/Edit[starts-with(@AutomationId,\"TextBoxViewModelRollMin\")]"));
		RollAngleMin=driver.findElements(By.className("TextBlock")).get(57);
		demo.Textcomparsion(RollAngleMin, "Min", test,driver); 
		
	}
	@Test(priority=37)
	public void RollAngleMax() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" Roll AngleMax label","Roll AngleMax label should be present ");
		//RollAngleMax=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneratorSettingsMainView\"]/Custom[@ClassName=\"ToleranceRangeConfigurationView\"]/Edit[starts-with(@AutomationId,\"TextBoxViewModelRollMax\")]"));
		RollAngleMax=driver.findElements(By.className("TextBlock")).get(59);
		
		demo.Textcomparsion(RollAngleMax, "Max", test,driver); 
	}
	WebElement Savebutton;
	
	@Test(priority=38)
	public void Savelabel() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" To verify the Save label","Save label should be present ");
		Savebutton = driver.findElement(By.name("SAVE"));
		demo.Textcomparsion(Savebutton, "SAVE", test,driver); 
	}
	
	
	// @Test(priority =20)   //*******Database configuration pending********
	 public void databaseconnectionemptycheck() throws IOException
	 {
	 	test = extent.createTest(funTestCaseName()+" To verify the Empty Database for Designation Configuration");
	 	Designationconfig(test);
	 }
	
	
	 public void Designationconfig(ExtentTest test1) throws IOException {
		    try {
		        ArrayList<HashMap<String, String>> dataEntries = class1.getDataFromDatabaseDesignation();

		        StringBuilder tableHtml = new StringBuilder();
		        tableHtml.append("<table style='font-size: 16px; border-collapse: separate; border-spacing: 10px;'>");
		        tableHtml.append("<tr>");
		        for (String columnName : dataEntries.get(0).keySet()) {
		            tableHtml.append("<th>").append(columnName).append("</th>");
		        }
		        tableHtml.append("</tr>");
		        for (HashMap<String, String> entry : dataEntries) {
		            tableHtml.append("<tr>");
		            for (String columnName : entry.keySet()) {
		                String value = entry.get(columnName);
		                tableHtml.append("<td>").append(value).append("</td>");
		            }
		            tableHtml.append("</tr>");
		        }
		        tableHtml.append("</table>");
		        test1.pass(MarkupHelper.createLabel(tableHtml.toString(), ExtentColor.WHITE));

		    } catch (ClassNotFoundException | SQLException e) {
		        e.printStackTrace();
		        test1.error("Failed to retrieve data from the database.");
		        extent.flush();
		    }
		}
	 
	@Test(priority=39)
	public void saveenable() throws InterruptedException, IOException
	{
		test = extent.createTest(guiTestCaseName()+" To verify the Save button enabled by default ","By default Save Button should be enabled ");
		Savebutton = driver.findElement(By.name("SAVE"));
	    demo.isEnabled(Savebutton, "SAVE", test,driver);
	    if(Savebutton.isEnabled())
	    {
	    	Savebutton.click();
	    	test = extent.createTest(guiTestCaseName()+" To verify blank error message is displayed");
	    	WebElement blank = driver.findElement(By.name("Input Cannot be blank"));
	    	demo.isdisplayed(blank, "Input Cannot be blank", test,driver);
			demo.Textcomparsion(blank, "Input Cannot be blank", test,driver);
	    }
	}
	@Test(priority=40)
	public void Invalidchars() throws InterruptedException, IOException
	{
		try {
		InvalidData(GantryRotationAngleMin,driver);
		InvalidData(GantryRotationAngleMax,driver);
		}
		catch(Exception e)
		{
			test.error(e);
		}
		try {
		InvalidData(BeamLimitingDeviceRotationAngleMin,driver);
		InvalidData(BeamLimitingDeviceRotationAngleMax,driver);
		}
		catch(Exception e)
		{
			test.error(e);
		}
		try {
		InvalidData(JawsMin,driver);
		InvalidData(JawsMax,driver);
		}
		catch(Exception e)
		{
			test.error(e);
		}
		try {
		InvalidData(MLC1LeafMin,driver);
		InvalidData(MLC1LeafMax,driver);
		}
		catch(Exception e)
		{
			test.error(e);
		}
		try {
		InvalidData(MLC2LeafMin,driver);
		InvalidData(MLC2LeafMax,driver);
		}
		catch(Exception e)
		{
			test.error(e);
		}
		try {
		InvalidData(PatientSupportRotationAngleMin,driver);
		InvalidData(PatientSupportRotationAngleMax,driver);
		}
		catch(Exception e)
		{
			test.error(e);
		}
		try {
		InvalidData(LongitudinalMin,driver);
		InvalidData(LongitudinalMax,driver);
		}
		catch(Exception e)
		{
			test.error(e);
		}
		try {
		InvalidData(LateralMin,driver);
		InvalidData(LateralMax,driver);
		}
		catch(Exception e)
		{
			test.error(e);
		}
		try {
		InvalidData(VerticalMin,driver);
		InvalidData(VerticalMax,driver);
		}
		catch(Exception e)
		{
			test.error(e);
		}
		try {
		InvalidData(PitchAngleMin,driver);
		InvalidData(PitchAngleMax,driver);
		}
		catch(Exception e)
		{
			test.error(e);
		}
		try {
		InvalidData(RollAngleMin,driver);
		InvalidData(RollAngleMax,driver);
		}
		catch(Exception e)
		{
			test.error(e);
		}
		test = extent.createTest(guiTestCaseName()+" To verify if enetered invalid data it should not save the data");
		try {
			Savedisable(Savebutton, "SAVE",driver);
		}
		catch(Exception e)
		{
			test.pass("Save pop-up is not displayed");
		}
	}
	
	@Test(priority=41)
	public void InvalidRangeAngle() throws InterruptedException, IOException
	{
		try {
		InValidRangeAngle(GantryRotationAngleMin,driver);
		InValidRangeAngle(GantryRotationAngleMax,driver);
		}
		catch(Exception e)
		{
			test.error(e);
		}
		try {
			InValidRangeAngle(BeamLimitingDeviceRotationAngleMin,driver);
			InValidRangeAngle(BeamLimitingDeviceRotationAngleMax,driver);
			}
			catch(Exception e)
			{
				test.error(e);
			}
		
		try {
			InValidRangeBeam(JawsMin,driver);
			InValidRangeBeam(JawsMax,driver);
			}
			catch(Exception e)
			{
				test.error(e);
			}	
		
		try {
			InValidRangeBeam(MLC1LeafMin,driver);
			InValidRangeBeam(MLC1LeafMax,driver);
			}
			catch(Exception e)
			{
				test.error(e);
			}
		
		try {
			InValidRangeBeam(MLC2LeafMin,driver);
			InValidRangeBeam(MLC2LeafMax,driver);
			}
			catch(Exception e)
			{
				test.error(e);
			}
		
		try {
			InValidRangeAngle(PatientSupportRotationAngleMin,driver);
			InValidRangeAngle(PatientSupportRotationAngleMax,driver);
			}
			catch(Exception e)
			{
				test.error(e);
			}
		
		try {
			InValidRangeCouch(LongitudinalMin,driver);
			InValidRangeCouch(LongitudinalMax,driver);
			}
			catch(Exception e)
			{
				test.error(e);
			}
		
		
		try {
			InValidRangeCouch(LateralMin,driver);
			InValidRangeCouch(LateralMax,driver);
		}
		catch(Exception e)
		{
			test.error(e);
		}
	
		
		try {
			InValidRangeCouch(VerticalMin,driver);
			InValidRangeCouch(VerticalMax,driver);
		}
		catch(Exception e)
		{
			test.error(e);
		}
	
		
		try {

			InValidRangeCouchAngle(PitchAngleMin,driver);
			InValidRangeCouchAngle(PitchAngleMax,driver);
		}
		catch(Exception e)
		{
			test.error(e);
		}
		try {


			InValidRangeCouchAngle(RollAngleMin,driver);
			InValidRangeCouchAngle(RollAngleMax,driver);
		}
		catch(Exception e)
		{
			test.error(e);
		}
	

		try {
			test = extent.createTest(guiTestCaseName()+" To verify if enetered invalid range it should not save the data");
			Savedisable(Savebutton, "SAVE",driver);
		}
		catch(Exception e)
		{
			test.pass("Save pop-up is not displayed");
		}
	}
	
	@Test(priority=42)
	public void BothequalRange() throws InterruptedException, IOException
	{
		try {
		Rangeequal(GantryRotationAngleMin,GantryRotationAngleMax,driver);
		}
		catch(Exception e) {
			
			test.error(e);
		}
		try {
		Rangeequal(BeamLimitingDeviceRotationAngleMin,BeamLimitingDeviceRotationAngleMax,driver);
		}
		catch(Exception e) {
			
			test.error(e);
		}
		try {
		Rangeequal(JawsMin,JawsMax,driver);
		}
		catch(Exception e) {
			
			test.error(e);
		}
		try {
		Rangeequal(MLC1LeafMin,MLC1LeafMax,driver);
		}
		catch(Exception e) {
			
			test.error(e);
		}
		try {
		Rangeequal(MLC2LeafMin,MLC2LeafMax,driver);
		}
		catch(Exception e) {
			
			test.error(e);
		}
		try {
		Rangeequal(PatientSupportRotationAngleMin,PatientSupportRotationAngleMax,driver);
		}
		catch(Exception e) {
			
			test.error(e);
		}
		try {
		Rangeequal(LongitudinalMin,LongitudinalMax,driver);
		}
		catch(Exception e) {
			
			test.error(e);
		}
		try {
		Rangeequal(LateralMin,LateralMax,driver);
		}
		catch(Exception e) {
			
			test.error(e);
		}
		try {
		Rangeequal(VerticalMin,VerticalMax,driver);
		}
		catch(Exception e) {
			
			test.error(e);
		}
		try {
		Rangeequal(PitchAngleMin,PitchAngleMax,driver);
		}
		catch(Exception e) {
			
			test.error(e);
		}
		try {
		Rangeequal(RollAngleMin,RollAngleMax,driver);
		}
		catch(Exception e) {
			
			test.error(e);
		}
		try {
			test = extent.createTest(guiTestCaseName()+" To verify if enetered Range equal it should not save the data");
			Savedisable(Savebutton, "SAVE",driver);
		}
		catch(Exception e)
		{
			test.pass("Save pop-up is not displayed");
		}
	}
	@Test(priority=43)
	public void MingreaterRange() throws InterruptedException, IOException
	{
		try {
		Rangegreaterequal(GantryRotationAngleMin,GantryRotationAngleMax,driver);
		}
		catch(Exception e)
		{
			test.pass("Save pop-up is not displayed");
		}
		try {
		Rangegreaterequal(BeamLimitingDeviceRotationAngleMin,BeamLimitingDeviceRotationAngleMax,driver);
		}
		catch(Exception e)
		{
			test.pass("Save pop-up is not displayed");
		}
		try {
		Rangegreaterequal(JawsMin,JawsMax,driver);
		}
		catch(Exception e)
		{
			test.pass("Save pop-up is not displayed");
		}
		try {
		Rangegreaterequal(MLC1LeafMin,MLC1LeafMax,driver);
		}
		catch(Exception e)
		{
			test.pass("Save pop-up is not displayed");
		}
		try {
		Rangegreaterequal(MLC2LeafMin,MLC2LeafMax,driver);
		}
		catch(Exception e)
		{
			test.pass("Save pop-up is not displayed");
		}
		try {
		Rangegreaterequal(PatientSupportRotationAngleMin,PatientSupportRotationAngleMax,driver);
		}
		catch(Exception e)
		{
			test.pass("Save pop-up is not displayed");
		}
		try {
		Rangegreaterequal(LongitudinalMin,LongitudinalMax,driver);
		}
		catch(Exception e)
		{
			test.pass("Save pop-up is not displayed");
		}
		try {
		Rangegreaterequal(LateralMin,LateralMax,driver);
		}
		catch(Exception e)
		{
			test.pass("Save pop-up is not displayed");
		}
		try {
		Rangegreaterequal(VerticalMin,VerticalMax,driver);
		}
		catch(Exception e)
		{
			test.pass("Save pop-up is not displayed");
		}
		try {
		Rangegreaterequal(PitchAngleMin,PitchAngleMax,driver);
		}
		catch(Exception e)
		{
			test.pass("Save pop-up is not displayed");
		}
		try {
		Rangegreaterequal(RollAngleMin,RollAngleMax,driver);
		}
		catch(Exception e)
		{
			test.pass("Save pop-up is not displayed");
		}
		try {
			test = extent.createTest(guiTestCaseName()+" To verify if min greater than range then it should not save the data");
			Savedisable(Savebutton, "SAVE",driver);
		}
		catch(Exception e)
		{
			test.pass("Save pop-up is not displayed");
		}
	}
	@Test(priority=44,groups = "Save")
	public void ValidRange() throws InterruptedException, IOException
	{
		try {
		Rangevalid(GantryRotationAngleMin,GantryRotationAngleMax,"0.5","100",driver);
		}
		catch(Exception e)
		{
			test.pass("Save pop-up is not displayed");
		}
		try {
		Rangevalid(BeamLimitingDeviceRotationAngleMin,BeamLimitingDeviceRotationAngleMax,"0.5","100",driver);
		}
		catch(Exception e)
		{
			test.pass("Save pop-up is not displayed");
		}
		try {
		Rangevalid(JawsMin,JawsMax,"0.1","100",driver);
		}
		catch(Exception e)
		{
			test.pass("Save pop-up is not displayed");
		}
		try {
		Rangevalid(MLC1LeafMin,MLC1LeafMax,"0.1","100",driver);
		}
		catch(Exception e)
		{
			test.pass("Save pop-up is not displayed");
		}
		try {
		Rangevalid(MLC2LeafMin,MLC2LeafMax,"0.1","100",driver);
		}
		catch(Exception e)
		{
			test.pass("Save pop-up is not displayed");
		}
		try {
		Rangevalid(PatientSupportRotationAngleMin,PatientSupportRotationAngleMax,"0.5","100",driver);
		}
		catch(Exception e)
		{
			test.pass("Save pop-up is not displayed");
		}
		try {
		Rangevalid(LongitudinalMin,LongitudinalMax,"0.2","100",driver);
		}
		catch(Exception e)
		{
			test.pass("Save pop-up is not displayed");
		}
		try {
		Rangevalid(LateralMin,LateralMax,"0.2","100",driver);
		}
		catch(Exception e)
		{
			test.pass("Save pop-up is not displayed");
		}
		try {
		Rangevalid(VerticalMin,VerticalMax,"0.2","100",driver);
		}
		catch(Exception e)
		{
			test.pass("Save pop-up is not displayed");
		}
		try {
		Rangevalid(PitchAngleMin,PitchAngleMax,"0.1","5",driver);
		}
		catch(Exception e)
		{
			test.pass("Save pop-up is not displayed");
		}
		try {
		Rangevalid(RollAngleMin,RollAngleMax,"0.1","5",driver);
		}
		catch(Exception e)
		{
			test.pass("Save pop-up is not displayed");
		}
		test = extent.createTest(guiTestCaseName()+" To verify valid  range save button enabled");
		demo.isEnabled(Savebutton,"SAVE", test,driver);
		
			Savebutton.click();
			Thread.sleep(2000);
			try {
			String mainWindowHandle = driver.getWindowHandle();
		    Set<String> windowHandles = driver.getWindowHandles();
		    for (String handle : windowHandles) {
		        if (!handle.equals(mainWindowHandle)) {
		            driver.switchTo().window(handle);
		            test = extent.createTest(guiTestCaseName()+" To verify save popup titlename");
		            WebElement ToleranceSave=driver.findElement(By.name("Tolerance Range Configuration"));
		            demo.Textcomparsion(ToleranceSave, "Tolerance Range Configuration", test,driver);
		            WebElement ToleranceSavedescription=driver.findElement(By.name("Tolerance Range data saved."));
		            test = extent.createTest(guiTestCaseName()+" To verify save popup description");
		            demo.Textcomparsion(ToleranceSavedescription, "Tolerance Range data saved.", test,driver);
		            test = extent.createTest(guiTestCaseName()+" To verify save popup ok button");
		            WebElement OK=driver.findElement(By.name("OK"));
		            demo.Textcomparsion(OK, "OK", test,driver);
		        	OK.click();	
		        	Thread.sleep(2000);
		        	break;
		            }
		        }
		    driver.switchTo().window(mainWindowHandle);	
		}
		catch(Exception e)
		{
			test.fail("Save pop-up is not displayed");
		}
	}
	
	@Test(priority=45,dependsOnGroups = "Save")
	public void editdisable() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" To verify click on edit button is enabled");
		Edit = driver.findElement(By.name("EDIT"));
		demo.isEnabled(Edit, "EDIT", test,driver);
		demo.Textcomparsion(Edit, "EDIT", test,driver);
		test = extent.createTest(guiTestCaseName()+" To verify textfields not selected");
		try {
		textdisable(GantryRotationAngleMin,GantryRotationAngleMax,driver,test);
		}
		catch(Exception e)
		{
			test.fail("Save pop-up is not displayed");
		}
		
		
		textdisable(BeamLimitingDeviceRotationAngleMin,BeamLimitingDeviceRotationAngleMax,driver,test);
		try {
		textdisable(JawsMin,JawsMax,driver,test);
		}
		catch(Exception e)
		{
			test.fail("Save pop-up is not displayed");
		}
		try {
		textdisable(MLC1LeafMin,MLC1LeafMax,driver,test);
		}
		catch(Exception e)
		{
			test.fail("Save pop-up is not displayed");
		}
		try {
		textdisable(MLC2LeafMin,MLC2LeafMax,driver,test);
		}
		catch(Exception e)
		{
			test.fail("Save pop-up is not displayed");
		}
		try {
		textdisable(PatientSupportRotationAngleMin,PatientSupportRotationAngleMax,driver,test);
		}
		catch(Exception e)
		{
			test.fail("Save pop-up is not displayed");
		}
		try {
		textdisable(LongitudinalMin,LongitudinalMax,driver,test);
		}
		catch(Exception e)
		{
			test.fail("Save pop-up is not displayed");
		}
		try {
		textdisable(LateralMin,LateralMax,driver,test);
		}
		catch(Exception e)
		{
			test.fail("Save pop-up is not displayed");
		}
		try {
		textdisable(VerticalMin,VerticalMax,driver,test);
		}
		catch(Exception e)
		{
			test.fail("Save pop-up is not displayed");
		}
		try {
		textdisable(PitchAngleMin,PitchAngleMax,driver,test);
		}
		catch(Exception e)
		{
			test.fail("Save pop-up is not displayed");
		}
		try {
		textdisable(RollAngleMin,RollAngleMax,driver,test);
		}
		catch(Exception e)
		{
			test.fail("Save pop-up is not displayed");
		}
	}
	@Test(priority=46,groups = "Edit")
	public void Updatebutton() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" To verify click on edit button update button is displayed");
		try {
		Edit = driver.findElement(By.name("EDIT"));
		Edit.click();
		}
		catch(Exception e)
		{
		 test.fail("No such element found");
		}
		try {
		Update = driver.findElement(By.name("UPDATE"));
		demo.isEnabled(Update, "UPDATE", test,driver);
		demo.Textcomparsion(Update, "UPDATE", test,driver);
		}
		catch(Exception e)
		{
		 test.fail("No such element found");
		}
	}
	@Test(priority=47,dependsOnGroups = "Edit")
	public void DataUpdatebutton() throws IOException
	{
		try {
		Rangevalid(GantryRotationAngleMin,GantryRotationAngleMax,"0.6","99",driver);
		}
		catch(Exception e)
		{
		 test.fail("No such element found");
		}
		try {
		Rangevalid(BeamLimitingDeviceRotationAngleMin,BeamLimitingDeviceRotationAngleMax,"0.7","98",driver);
		}
		catch(Exception e)
		{
		 test.fail("No such element found");
		}
		try {
		Rangevalid(JawsMin,JawsMax,"0.2","97",driver);
		}
		catch(Exception e)
		{
		 test.fail("No such element found");
		}
		try {
		Rangevalid(MLC1LeafMin,MLC1LeafMax,"0.3","96",driver);
		}
		catch(Exception e)
		{
		 test.fail("No such element found");
		}
		try {
		Rangevalid(MLC2LeafMin,MLC2LeafMax,"0.4","95",driver);
		}
		catch(Exception e)
		{
		 test.fail("No such element found");
		}
		try {
		Rangevalid(PatientSupportRotationAngleMin,PatientSupportRotationAngleMax,"0.8","94",driver);
		}
		catch(Exception e)
		{
		 test.fail("No such element found");
		}
		try {
		Rangevalid(LongitudinalMin,LongitudinalMax,"0.9","93",driver);
		}
		catch(Exception e)
		{
		 test.fail("No such element found");
		}
		try {
		Rangevalid(LateralMin,LateralMax,"0.55","92",driver);
		}
		catch(Exception e)
		{
		 test.fail("No such element found");
		}
		try {
		Rangevalid(VerticalMin,VerticalMax,"0.33","91",driver);
		}
		catch(Exception e)
		{
		 test.fail("No such element found");
		}
		try {
		Rangevalid(PitchAngleMin,PitchAngleMax,"0.12","4",driver);
		}
		catch(Exception e)
		{
		 test.fail("No such element found");
		}
		try {
		Rangevalid(RollAngleMin,RollAngleMax,"0.13","5",driver);
		}
		catch(Exception e)
		{
		 test.fail("No such element found");
		}
		Update.click();
		try {
			String mainWindowHandle = driver.getWindowHandle();
		    Set<String> windowHandles = driver.getWindowHandles();

		    for (String handle : windowHandles) {
		        if (!handle.equals(mainWindowHandle)) {
		            driver.switchTo().window(handle);
		            test = extent.createTest(guiTestCaseName()+" To verify update popup titlename");
		            WebElement ToleranceSave=driver.findElement(By.name("Tolerance Range Configuration"));
		            demo.Textcomparsion(ToleranceSave, "Tolerance Range Configuration", test,driver);
		            try {
		            WebElement ToleranceSavedescription=driver.findElement(By.name("Tolerance Range data updated."));
		            test = extent.createTest(guiTestCaseName()+" To verify update popup description");
		            demo.Textcomparsion(ToleranceSavedescription, "Tolerance Range data updated.", test,driver);
		            }
		            catch(Exception e) {
		            	test.fail("Element not found");
		            }
		            test = extent.createTest(guiTestCaseName()+" To verify update popup ok button");
		            WebElement OK=driver.findElement(By.name("OK"));
		            demo.Textcomparsion(OK, "OK", test,driver);
		        	OK.click();	
		        	Thread.sleep(2000);
		            break; 
		        }
		    }
		    driver.switchTo().window(mainWindowHandle);
		}
		catch(Exception e)
		{
			test.fail("Update pop-up is not displayed");
		}
	}
	@Test(priority=4,dependsOnGroups = "Save")
	public void Updateddatavalid() throws IOException
	{
		Edit.click();
		test = extent.createTest(guiTestCaseName()+" To verify Updated data is displayed is correctly");
		try {
		editupdatedata(GantryRotationAngleMin,"0.6",driver);
		editupdatedata(GantryRotationAngleMax,"99",driver);
		}
		catch(Exception e)
		{
			test.fail("Save pop-up is not displayed");
		}
		try {
		editupdatedata(BeamLimitingDeviceRotationAngleMin,"0.7",driver);
		editupdatedata(BeamLimitingDeviceRotationAngleMax,"98",driver);
		}
		catch(Exception e)
		{
			test.fail("Save pop-up is not displayed");
		}
		try {
		editupdatedata(JawsMin,"0.2",driver);
		editupdatedata(JawsMax,"97",driver);
		}
		catch(Exception e)
		{
			test.fail("Save pop-up is not displayed");
		}
		try {
		editupdatedata(MLC1LeafMin,"0.3",driver);
		editupdatedata(MLC1LeafMax,"96",driver);
		}
		catch(Exception e)
		{
			test.fail("Save pop-up is not displayed");
		}
		try {
		editupdatedata(MLC2LeafMin,"0.4",driver);
		editupdatedata(MLC2LeafMax,"95",driver);
		}
		catch(Exception e)
		{
			test.fail("Save pop-up is not displayed");
		}
		try {
		editupdatedata(PatientSupportRotationAngleMin,"0.8",driver);
		editupdatedata(PatientSupportRotationAngleMax,"94",driver);
		}
		catch(Exception e)
		{
			test.fail("Save pop-up is not displayed");
		}
		try {
		editupdatedata(LongitudinalMin,"0.9",driver);
		editupdatedata(LongitudinalMax,"93",driver);
		}
		catch(Exception e)
		{
			test.fail("Save pop-up is not displayed");
		}
		try {
		editupdatedata(LateralMin,"0.55",driver);
		editupdatedata(LateralMax,"92",driver);
		}
		catch(Exception e)
		{
			test.fail("Save pop-up is not displayed");
		}
		try {
		editupdatedata(VerticalMin,"0.33",driver);
		editupdatedata(VerticalMax,"91",driver);
		}
		catch(Exception e)
		{
			test.fail("Save pop-up is not displayed");
		}
		try {
		editupdatedata(PitchAngleMin,"0.12",driver);
		editupdatedata(PitchAngleMax,"4",driver);
		}
		catch(Exception e)
		{
			test.fail("Save pop-up is not displayed");
		}
		try {
		editupdatedata(RollAngleMin,"0.13",driver);
		editupdatedata(RollAngleMax,"5",driver);
		}
		catch(Exception e)
		{
			test.fail("Save pop-up is not displayed");
		}
		Update.click();
			try {
				String mainWindowHandle = driver.getWindowHandle();
			    Set<String> windowHandles = driver.getWindowHandles();

			    for (String handle : windowHandles) {
			        if (!handle.equals(mainWindowHandle)) {
			            driver.switchTo().window(handle);
			            test = extent.createTest(guiTestCaseName()+" To verify update popup titlename");
			            WebElement ToleranceSave=driver.findElement(By.name("Tolerance Range Configuration"));
			            demo.Textcomparsion(ToleranceSave, "Tolerance Range Configuration", test,driver);
			            try {
			            WebElement ToleranceSavedescription=driver.findElement(By.name("Tolerance Range data updated."));
			            test = extent.createTest(guiTestCaseName()+" To verify update popup description");
			            demo.Textcomparsion(ToleranceSavedescription, "Tolerance Range data updated.", test,driver);
			            }
			            catch(Exception e) {
			            	test.fail("Tolerance Range data updated, is not displayed");
			            }
			            test = extent.createTest(guiTestCaseName()+" To verify update popup ok button");
			            WebElement OK=driver.findElement(By.name("OK"));
			            demo.Textcomparsion(OK, "OK", test,driver);
			        	OK.click();	
			        	Thread.sleep(1000);
			            break; 
			        }
			    }
			    driver.switchTo().window(mainWindowHandle);
			}
			catch(Exception e)
			{
				test.fail("Update pop-up is not displayed");
			}
		}
	
	
	public void Updatevalid() throws InterruptedException, IOException
	{
		Edit.click();
		ValidRange();
		Update.click();
		try {
			String mainWindowHandle = driver.getWindowHandle();
		    Set<String> windowHandles = driver.getWindowHandles();

		    for (String handle : windowHandles) {
		        if (!handle.equals(mainWindowHandle)) {
		            driver.switchTo().window(handle);
		            test = extent.createTest(guiTestCaseName()+" To verify update popup titlename");
		            WebElement ToleranceSave=driver.findElement(By.name("Tolerance Range Configuration"));
		            demo.Textcomparsion(ToleranceSave, "Tolerance Range Configuration", test,driver);
		            try {
		            WebElement ToleranceSavedescription=driver.findElement(By.name("Tolerance Range data updated."));
		            test = extent.createTest(guiTestCaseName()+" To verify update popup description");
		            demo.Textcomparsion(ToleranceSavedescription, "Tolerance Range data updated.", test,driver);
		            }
		            catch(Exception e) {
		            	test.fail("Tolerance Range data updated, is not displayed");
		            }
		            test = extent.createTest(guiTestCaseName()+" To verify update popup ok button");
		            WebElement OK=driver.findElement(By.name("OK"));
		            demo.Textcomparsion(OK, "OK", test,driver);
		        	OK.click();	
		        	Thread.sleep(1000);
		            break; 
		        }
		    }
		    driver.switchTo().window(mainWindowHandle);
		}
		catch(Exception e)
		{
			test.fail("Update pop-up is not displayed");
		}
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
