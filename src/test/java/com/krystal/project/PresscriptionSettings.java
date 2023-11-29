package com.krystal.project;

import java.io.IOException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.windows.WindowsDriver;

public class PresscriptionSettings extends ReferencefileChemotheraphy {


	WebElement Prescriptionsettings;
	WebElement SelectMachine;
	WebElement RangeConfiguration;
	WebElement TotalDose;
	WebElement TotalDoseMin;
	WebElement TotalDoseMax;
	WebElement NumberofFraction;
	WebElement NumberofFractionMin;
	WebElement NumberofFractionMax;
	WebElement MinimumDose;
	WebElement MinimumDosemin;
	WebElement MinimumDosemax;
	WebElement MaximumDose;
	WebElement MaximumDosemin;
	WebElement MaximumDosemax;
	WebElement SelectMachinedropdown;
	WebElement Savebutton;
	WebElement MinErrormsg;
	WebElement MaxErrormsg;
	WebElement MingreaterErrormsg;
	WebElement MaxgreaterErrormsg;
	WebElement Edit;
	WebElement Update;
	WebElement Userbx;
	WebElement Pswdbox;
	@BeforeClass
	public void setUp1()  throws InterruptedException, IOException {
	DesiredCapabilities appCapabilities = new DesiredCapabilities();
	appCapabilities.setCapability("app", "C:\\Program Files\\Panacea Medical Technologies\\Krystal\\Krystal.exe");
	driver = new WindowsDriver<WebElement>(new URL("http://127.0.0.1:4723"), appCapabilities);
	
	ReferenceSigin Sign=new ReferenceSigin();
	Sign.ServiceLogin(driver);
	Sign.Prescriptionsettings(driver);
	}
	
	@Test(priority=1)
	public void selectmachine() throws InterruptedException
	{   SelectMachine = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneratorSettingsMainView\"]/Custom[@ClassName=\"PrescriptionServiceSettingsView\"]/ComboBox[@ClassName=\"ComboBox\"]"));
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		actions.moveToElement(SelectMachine).click().perform();
		Thread.sleep(5000);
		SelectMachinedropdown = driver.findElement(By.name("SIDDHARTH-II_C05"));
	    actions.doubleClick(SelectMachinedropdown).perform(); 
	    Thread.sleep(3000);
	}
	
	 DemographicsExternal demo=new DemographicsExternal() ;
	@Test(priority=2)
	public void SelectMachinelabel() throws IOException
	{
		//test = extent.createTest(guiTestCaseName()+" To verify the Select Machine label","Select Machine label should be present ");
		SelectMachine = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneratorSettingsMainView\"]/Custom[@ClassName=\"PrescriptionServiceSettingsView\"]/ComboBox[@ClassName=\"ComboBox\"]"));
        DemographicsExternal demo=new DemographicsExternal() ;
		//demo.Textcomparsion(SelectMachine, "Select Treatment Machine", test,driver); 
	}
	@Test(priority=3)
	public void RangeConfigurationlabel() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" To verify the Range Configuration label","Range Configuration label should be present ");
		RangeConfiguration = driver.findElement(By.name("Range Configuration"));
		demo.Textcomparsion(RangeConfiguration, "Range Configuration", test,driver); 
	}
	@Test(priority=4)
	public void Prescriptionsettingslabel() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" To verify the Prescription settings label","Prescription settings label should be present ");
		Prescriptionsettings = driver.findElement(By.name("Prescription Settings"));
		demo.Textcomparsion(Prescriptionsettings, "Prescription Settings", test,driver); 
	}
	@Test(priority=5)
	public void TotalDoselabel() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" To verify the Total Dose (cGy) label","Total Dose (cGy) label should be present ");
		TotalDose = driver.findElement(By.name("Total Dose (cGy)"));
		demo.Textcomparsion(TotalDose, "Total Dose (cGy)", test,driver); 
	}
	@Test(priority=6)
	public void TotalDoseMinlabel() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" To verify the Total Dose min label","Total Dose min label should be present ");
		TotalDoseMin = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneratorSettingsMainView\"]/Custom[@ClassName=\"PrescriptionServiceSettingsView\"]/Edit[starts-with(@AutomationId,\"TextBoxViewModelTotalDosecGyMin\")]/Text[@Name=\"Min\"][@AutomationId=\"LblName\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Min\"]"));
		demo.Textcomparsion(TotalDoseMin, "Min", test,driver); 
	}
	@Test(priority=7)
	public void TotalDoseMaxlabel() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" To verify the Total Dose max label","Total Dose max label should be present ");
		TotalDoseMax = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneratorSettingsMainView\"]/Custom[@ClassName=\"PrescriptionServiceSettingsView\"]/Edit[starts-with(@AutomationId,\"TextBoxViewModelTotalDosecGyMax\")]/Text[@Name=\"Max\"][@AutomationId=\"LblName\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Max\"]"));		

		demo.Textcomparsion(TotalDoseMax, "Max", test,driver); 
	}
	@Test(priority=8)
	public void NumberofFractionlabel() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" To verify the Number of fractions label","Number of fractions  label should be present ");
		NumberofFraction = driver.findElement(By.name("Number of Fraction"));
		demo.Textcomparsion(NumberofFraction, "Number of Fraction", test,driver); 
	}
	@Test(priority=9)
	public void NumberofFractionminlabel() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" To verify the Number of fractions min label","Number of fractions min label should be present ");
		NumberofFractionMin = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneratorSettingsMainView\"]/Custom[@ClassName=\"PrescriptionServiceSettingsView\"]/Edit[starts-with(@AutomationId,\"TextBoxViewModelNumberofFractionMin\")]/Text[@Name=\"Min\"][@AutomationId=\"LblName\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Min\"]"));
		demo.Textcomparsion(NumberofFractionMin, "Min", test,driver); 
	}
	@Test(priority=10)
	public void NumberofFractionmaxlabel() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" To verify the Number of fractions max label","Number of fractions max label should be present ");
		NumberofFractionMax = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneratorSettingsMainView\"]/Custom[@ClassName=\"PrescriptionServiceSettingsView\"]/Edit[starts-with(@AutomationId,\"TextBoxViewModelNumberofFractionMax\")]/Text[@Name=\"Max\"][@AutomationId=\"LblName\"]"));
		demo.Textcomparsion(NumberofFractionMax, "Max", test,driver); 
	
	}
	@Test(priority=11)
	public void MinimumDoselabel() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" To verify the Minimum Dose label","Minimum Dose  label should be present ");
		MinimumDose = driver.findElement(By.name("Minimum Dose (cGy)"));
		demo.Textcomparsion(MinimumDose, "Minimum Dose (cGy)", test,driver); 
	}
	@Test(priority=12)
	public void MinimumDoseminlabel() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" To verify the Minimum Dose min label","Minimum Dose min label should be present ");
		MinimumDosemin = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneratorSettingsMainView\"]/Custom[@ClassName=\"PrescriptionServiceSettingsView\"]/Edit[starts-with(@AutomationId,\"TextBoxViewModelMinimumDosecGyMin\")]/Text[@Name=\"Min\"][@AutomationId=\"LblName\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Min\"]"));
		demo.Textcomparsion(MinimumDosemin, "Min", test,driver); 
	}
	@Test(priority=13)
	public void MinimumDosemaxlabel() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" To verify the Minimum Dose max label","Minimum Dose max label should be present ");
		MinimumDosemax = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneratorSettingsMainView\"]/Custom[@ClassName=\"PrescriptionServiceSettingsView\"]/Edit[starts-with(@AutomationId,\"TextBoxViewModelMinimumDosecGyMax\")]/Text[@Name=\"Max\"][@AutomationId=\"LblName\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Max\"]"));
		demo.Textcomparsion(MinimumDosemax, "Max", test,driver); 
	}
	@Test(priority=14)
	public void MaximumDoselabel() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" To verify the Maximum Dose label","Maximum Dose  label should be present ");
		MaximumDose = driver.findElement(By.name("Maximum Dose (cGy)"));
		demo.Textcomparsion(MaximumDose, "Maximum Dose (cGy)", test,driver); 
	}
	@Test(priority=15)
	public void MaximumDoseminlabel() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" To verify the Maximum Dose min label","Maximum Dose min label should be present ");
		MaximumDosemin = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneratorSettingsMainView\"]/Custom[@ClassName=\"PrescriptionServiceSettingsView\"]/Edit[starts-with(@AutomationId,\"TextBoxViewModelMaximumDosecGyMin\")]/Text[@Name=\"Min\"][@AutomationId=\"LblName\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Min\"]"));
		demo.Textcomparsion(MaximumDosemin, "Min", test,driver); 
	}
	@Test(priority=16)
	public void MaximumDosemaxlabel() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" To verify the Maximum Dose max label","Maximum Dose max label should be present ");
		MaximumDosemax = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneratorSettingsMainView\"]/Custom[@ClassName=\"PrescriptionServiceSettingsView\"]/Edit[starts-with(@AutomationId,\"TextBoxViewModelMaximumDosecGyMax\")]/Text[@Name=\"Max\"][@AutomationId=\"LblName\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Max\"]"));
		demo.Textcomparsion(MaximumDosemax, "Max", test,driver); 
	}
	@Test(priority=17)
	public void Savelabel() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" To verify the Save label","Save label should be present ");
		Savebutton = driver.findElement(By.name("SAVE"));
		demo.Textcomparsion(MaximumDosemax, "Max", test,driver); 
	}
	
	@Test(priority=18)
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
	
	@Test(priority=19)
	public void Invalidchars() throws InterruptedException, IOException
	{
		
		InvalidData(TotalDoseMin);
		InvalidData(TotalDoseMax);
		InvalidData(NumberofFractionMin);
		InvalidData(NumberofFractionMax);
		InvalidData(MinimumDosemin);
		InvalidData(MinimumDosemax);
		InvalidData(MaximumDosemin);
		InvalidData(MaximumDosemax);	
		Savebutton.click();
		try {
			popuphandlesave();
		}
		catch(Exception e)
		{
			test = extent.createTest(guiTestCaseName()+" To verify if enetered invalid chars it should not save the data");
			test.pass("Save pop-up is not displayed");
		}
	}
	@Test(priority=20)
	public void InvalidRange() throws InterruptedException, IOException
	{
		InValidRange(TotalDoseMin);
		InValidRange(TotalDoseMax);
		InValidRangefractions(NumberofFractionMin);
		InValidRangefractions(NumberofFractionMax);
		InValidRange(MinimumDosemin);
		InValidRange(MinimumDosemax);
		InValidRange(MaximumDosemin);
		InValidRange(MaximumDosemax);
		Savebutton.click();
		test = extent.createTest(guiTestCaseName()+" To verify if enetered invalid range it should not save the data");
		try {
			popuphandlesave();
		}
		catch(Exception e)
		{
			test.pass("Save pop-up is not displayed");
		}
	}
	
	@Test(priority=21)
	public void BothequalRange() throws InterruptedException, IOException
	{
		Rangeequal(TotalDoseMin,TotalDoseMax);
		Rangeequal(NumberofFractionMin,NumberofFractionMax);
		Rangeequal(MinimumDosemin,MinimumDosemax);
		Rangeequal(MaximumDosemin,MaximumDosemax);
		Savebutton.click();
		test = extent.createTest(guiTestCaseName()+" To verify if enetered Range equal it should not save the data");
		try {
			popuphandlesave();
		}
		catch(Exception e)
		{
			test.info("Save pop-up is not displayed");
		}
	}
	@Test(priority=22)
	public void MingreaterRange() throws InterruptedException, IOException
	{
		Rangegreaterequal(TotalDoseMin,TotalDoseMax);
		Rangegreaterequal(NumberofFractionMin,NumberofFractionMax);
		Rangegreaterequal(MinimumDosemin,MinimumDosemax);
		Rangegreaterequal(MaximumDosemin,MaximumDosemax);
		Savebutton.click();
		test = extent.createTest(guiTestCaseName()+" To verify if min greater than range then it should not save the data");
		try {
			popuphandlesave();
			Edit();
		}
		catch(Exception e)
		{
			test.info("Save pop-up is not displayed");
		}
	}
	@Test(priority=23)
	public void ValidRange() throws InterruptedException, IOException
	{
	
		Rangevalid(TotalDoseMin,TotalDoseMax,"1","1000");
		Rangevalid(NumberofFractionMin,NumberofFractionMax,"1","100");
		Rangevalid(MinimumDosemin,MinimumDosemax,"1","1000");
		Rangevalid(MaximumDosemin,MaximumDosemax,"1","1000");
		Savebutton.click();
		try {
			popuphandlesave();
		}
		catch(Exception e)
		{
			test.fail("Save pop-up is not displayed");
		}
	}
	@Test(priority=24)
	public void editdisable() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" To verify textfields not selected");
		textdisable(TotalDoseMin,TotalDoseMax);
		textdisable(NumberofFractionMin,NumberofFractionMax);
		textdisable(MinimumDosemin,MinimumDosemax);
		textdisable(MaximumDosemin,MaximumDosemax);
	}
	@Test(priority=25)
	public void Updatebutton() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" To verify click on edit button update button is displayed");
		Edit = driver.findElement(By.name("EDIT"));
		Edit.click();
		Update = driver.findElement(By.name("UPDATE"));
		demo.isEnabled(Update, "UPDATE", test,driver);
		demo.Textcomparsion(Update, "UPDATE", test,driver);
	}
	@Test(priority=26)
	public void DataUpdatebutton() throws IOException
	{
		
		Rangevalid(TotalDoseMin,TotalDoseMax,"2","999");
		Rangevalid(NumberofFractionMin,NumberofFractionMax,"3","98");
		Rangevalid(MinimumDosemin,MinimumDosemax,"4","997");
		Rangevalid(MaximumDosemin,MaximumDosemax,"5","996");
		Update.click();
		try {
			popuphandleupdate();
		}
		catch(Exception e)
		{
			test.fail("Update pop-up is not displayed");
		}
	}
	@Test(priority=27)
	public void Updateddatavalid() throws IOException
	{
		Edit.click();
		test = extent.createTest(guiTestCaseName()+" To verify Updated data is displayed is correctly");
		editupdatedata(TotalDoseMin, "2");
		editupdatedata(TotalDoseMax, "999");
		editupdatedata(NumberofFractionMin, "3");
		editupdatedata(NumberofFractionMax, "98");
		editupdatedata(MinimumDosemin, "4");
		editupdatedata(MinimumDosemax, "997");
		editupdatedata(MaximumDosemin, "5");
		editupdatedata(MaximumDosemax, "996");
		Update.click();
		try {
			popuphandleupdate();
		}
		catch(Exception e)
		{
			test.fail("Update pop-up is not displayed");
		}
	}

	@Test(priority=28)
	public void Edit() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" To verify Edit button is enabled once clicked on the Save button");
		Edit=driver.findElement(By.name("EDIT"));
		demo.isEnabled(Edit, "EDIT", test,driver);
		demo.Textcomparsion(Edit, "EDIT", test,driver);
	}
	
	public void editupdatedata(WebElement element, String text) throws IOException
	{
		demo.ByErrormessage(element, text, test,driver);
	}
	
	
	public void textdisable(WebElement element, WebElement element1) throws IOException
	{
		Actions action=new Actions(driver);
		action.moveToElement(element).click().perform();
		demo.BydefaultisSelected(element, "Click", test,driver);
		action.moveToElement(element1).click().perform();
		demo.BydefaultisSelected(element1, "Click", test,driver);
	}
	
		public void popuphandlesave() throws IOException, InterruptedException
		{
			String mainWindowHandle = driver.getWindowHandle();
		    Set<String> windowHandles = driver.getWindowHandles();

		    for (String handle : windowHandles) {
		        if (!handle.equals(mainWindowHandle)) {
		            driver.switchTo().window(handle);
		            test = extent.createTest(guiTestCaseName()+" To verify save popup titlename");
		            WebElement PrescriptionSave=driver.findElement(By.name("Prescription Settings Save"));
		            demo.Textcomparsion(PrescriptionSave, "Prescription Settings Save", test,driver);
		            WebElement PrescriptionSavedescription=driver.findElement(By.name("Prescription Settings saved for selected Machine."));
		            test = extent.createTest(guiTestCaseName()+" To verify save popup description");
		            demo.Textcomparsion(PrescriptionSavedescription, "Prescription Settings saved for selected Machine.", test,driver);
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
		
		public void popuphandleupdate() throws IOException, InterruptedException
		{
		
			String mainWindowHandle = driver.getWindowHandle();
		    Set<String> windowHandles = driver.getWindowHandles();

		    for (String handle : windowHandles) {
		        if (!handle.equals(mainWindowHandle)) {
		            driver.switchTo().window(handle);
		            test = extent.createTest(guiTestCaseName()+" To verify update popup titlename");
		            WebElement PrescriptionSave=driver.findElement(By.name("Prescription Settings Update"));
		            demo.Textcomparsion(PrescriptionSave, "Prescription Settings Update", test,driver);
		            WebElement PrescriptionSavedescription=driver.findElement(By.name("Prescription Settings updated for selected Machine."));
		            test = extent.createTest(guiTestCaseName()+" To verify save popup description");
		            demo.Textcomparsion(PrescriptionSavedescription, "Prescription Settings updated for selected Machine.", test,driver);
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
	public void InvalidData(WebElement Invaliddata) throws IOException
	{
		test = extent.createTest(funTestCaseName()+" To verify " +Invaliddata.getText()+" textbox should not accept the alphabhets");
		Invaliddata(Invaliddata, "ABCHGHSGHFSHGDHGDD","Only whole and decimal numbers allowed","Only whole and decimal numbers allowed");
		test = extent.createTest(funTestCaseName()+" To verify " +Invaliddata.getText()+" textbox should not accept the specialchars");
		Invaliddata(Invaliddata, "#$%&()*-/:;<=>?@[]^_`{|}~","Only whole and decimal numbers allowed","Only whole and decimal numbers allowed");
		test = extent.createTest(funTestCaseName()+"To verify " +Invaliddata.getText()+" textbox should not accept the invalidchars");
		Invaliddata(Invaliddata, "\\,\",'","Only whole and decimal numbers allowed","Only whole and decimal numbers allowed");
		test = extent.createTest(funTestCaseName()+" To verify " +Invaliddata.getText()+" textbox should not accept the alphanumeric");
		Invaliddata(Invaliddata,  "shgdjdgd&^&%&","Only whole and decimal numbers allowed","Only whole and decimal numbers allowed");
	}
	public void Invaliddata(WebElement Name, String Text,String actual, String Excepted) throws IOException
	{
		Name.click();
		driver.switchTo().activeElement().sendKeys(Text);
		demo.isempty(Name,Text, test,driver);
		try {
			WebElement errormsg=driver.findElement(By.name(actual));
			demo.isdisplayed(errormsg, Excepted, test,driver);
			demo.Textcomparsion(errormsg, Excepted, test,driver);
		}
		catch(Exception e)
		{
			test.pass("Text box contains only wholenumbers and decimals Error message not displayed");
		}
		
		driver.switchTo().activeElement().clear();
	}
	
	public void InValidRange(WebElement InValidrange) throws IOException
	{
		test = extent.createTest(funTestCaseName()+" To verify " +InValidrange.getText()+" range less than 1 and more than 10000 error message is displayed or not");
		Invalidrange(InValidrange, "0","Range:[1 to 10000]","Range:[1 to 10000]");
		driver.switchTo().activeElement().clear();
		Invalidrange(InValidrange, "0.001","Range:[1 to 10000]","Range:[1 to 10000]");
		driver.switchTo().activeElement().clear();
		Invalidrange(InValidrange, "10000.09","Range:[1 to 10000]","Range:[1 to 10000]");
		driver.switchTo().activeElement().clear();
		Invalidrange(InValidrange, "10001","Range:[1 to 10000]","Range:[1 to 10000]");
		driver.switchTo().activeElement().clear();
		Invalidrange(InValidrange, "0.01","Range:[1 to 10000]","Range:[1 to 10000]");
		driver.switchTo().activeElement().clear();
		Invalidrange(InValidrange, "10010","Range:[1 to 10000]","Range:[1 to 10000]");
	}
	public void InValidRangefractions(WebElement InValidRangefractions) throws IOException
	{
		test = extent.createTest(funTestCaseName()+" To verify " +InValidRangefractions.getText()+" range less than 1 and more than 100 error message is displayed or not");
		try {
		Invalidrange(InValidRangefractions, "0","Range:[1 to 100]","Range:[1 to 100]");
		}
		catch(Exception e){
			test.pass(" 0 is not able to eneter");
		}
		driver.switchTo().activeElement().clear();
		Invalidrange(InValidRangefractions, "100.09","Range:[1 to 100]","Range:[1 to 100]");
		driver.switchTo().activeElement().clear();
		Invalidrange(InValidRangefractions, "101","Range:[1 to 100]","Range:[1 to 100]");
		driver.switchTo().activeElement().clear();
		Invalidrange(InValidRangefractions, "100.90","Range:[1 to 100]","Range:[1 to 100]");
	}
	
	public void Rangeequal(WebElement Min,WebElement Max) throws IOException
	{
		test = extent.createTest(funTestCaseName()+" To verify enetred equal range for "+Min.getText()+ Max.getText()+" error message is displayed or not");
		Invalidrangeequal(Min, Max,"1","1", "Min cannot be equal to Max", "Min cannot be equal to Max","Max cannot be equal to Min", "Max cannot be equal to Min");
	}
	public void Rangegreaterequal(WebElement Min,WebElement Max) throws IOException
	{
		test = extent.createTest(funTestCaseName()+" To verify enetred min greater range for "+Min.getText()+ " error message is displayed or not");
		Invalidrangeequal(Min, Max,"5","3","Min cannot be greater than Max", "Min cannot be greater than Max","Max cannot be lesser than Min", "Max cannot be lesser than Min");
	}
	public void Rangevalid(WebElement Min,WebElement Max, String value, String value1) throws IOException
	{
		test = extent.createTest(funTestCaseName()+" To verify enetred Valid range no error message is displayed");
		Validdata(Min, Max,value,value1,"Range:[1 to 1000]", "Range:[1 to 1000]");
	}
	
	public void Validdata(WebElement Name, WebElement RangeName, String Text, String Text1, String actual,String Excepted) throws IOException
	{
		Name.click();
		driver.switchTo().activeElement().clear();
		driver.switchTo().activeElement().sendKeys(Text);
		demo.ByErrormessage(Name,Text, test,driver);
		RangeName.click();
		driver.switchTo().activeElement().clear();
		driver.switchTo().activeElement().sendKeys(Text1);
		demo.ByErrormessage(RangeName,Text1, test,driver);
		WebElement Element=driver.switchTo().activeElement();
		
		try {
			WebElement errormsg=driver.findElement(By.name(actual));
			demo.isdisplayed(errormsg, Excepted, test,driver);
			demo.ByErrormessage(errormsg, Excepted, test,driver);
		}
		catch(Exception e)
		{
			test.pass("Range Error message not displayed for the valid data");
		}
	}
	
	public void Invalidrangeequal(WebElement Name, WebElement RangeName, String Text, String Text1, String actual, String Excepted,String actual1, String Excepted1) throws IOException
	{
		Name.click();
		driver.switchTo().activeElement().clear();
		driver.switchTo().activeElement().sendKeys(Text);
		RangeName.click();
		driver.switchTo().activeElement().clear();
		driver.switchTo().activeElement().sendKeys(Text1);
		WebElement errormsg=driver.findElement(By.name(actual));
		demo.isdisplayed(errormsg, Excepted, test,driver);
		demo.Textcomparsion(errormsg, Excepted, test,driver);
		WebElement errormsgdisplayed=driver.findElement(By.name(actual1));
		demo.isdisplayed(errormsgdisplayed, Excepted1, test,driver);
		demo.Textcomparsion(errormsgdisplayed, Excepted1, test,driver);
	}
	
public void Invalidrange(WebElement Name, String Text, String actual, String Excepted) throws IOException
{
	Name.click();
	driver.switchTo().activeElement().sendKeys(Text);
	WebElement errormsg=driver.findElement(By.name(actual));
	demo.isdisplayed(errormsg, Excepted, test,driver);
	demo.Textcomparsion(errormsg, Excepted, test,driver);
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

// Pending Integration With templates and Prescription module is pending




























