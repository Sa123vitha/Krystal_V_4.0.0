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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.windows.WindowsDriver;

public class PatientDemographics extends ReferencefileChemotheraphy {
	WebElement Menu;
	WebElement Signout;
	WebElement Theme;
	WebElement Password;
	WebElement Titlename;
	WebElement Productlogo;
	WebElement Patientlist;
	WebElement Addpatient;
	WebElement PatientMenu;
	DemographicsPOM demog;
	 WebElement PBI;
	 WebElement FN;
	 WebElement MN;
	 WebElement LN;
	 WebElement OID;
	 WebElement DOB;
	 WebElement AG;
	 WebElement BG;
	 WebElement GEN;
	 WebElement ML;
	 WebElement FL;
	 WebElement OTH;
	 WebElement PS;
	private WebElement bloodgroup;
	private WebElement PatientSize;
	private Actions action;
	private Actions act;

	@Test(priority =1)
	public void Launch()  throws InterruptedException, IOException {
//	DesiredCapabilities appCapabilities = new DesiredCapabilities();
//	appCapabilities.setCapability("app", "C:\\Program Files\\Panacea Medical Technologies\\Krystal\\Krystal.exe");
//	driver = new WindowsDriver<WebElement>(new URL("http://127.0.0.1:4723"), appCapabilities);
	navigation();
	Addfield();
	action=new Actions(driver);
	act=new Actions(driver);
	}
	
	
	public void Addfield() throws InterruptedException
	{
	driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"NavigationTopBarSubView\"]/Button[@ClassName=\"Button\"]")).click();
	Thread.sleep(2000);
	}
	
	//@Test(priority =2)
		public void button() throws InterruptedException{
		List<WebElement> elements = driver.findElements(By.className("TextBox"));
	  Actions actions = new Actions(driver);
	  for (WebElement element : elements) {
	      actions.moveToElement(element).perform();
	      System.out.println(element.getLocation());
	      System.out.println(element.getText());
	      System.out.println("********************************************");
	      Thread.sleep(1000);
	  }
		}
	public void navigation() throws InterruptedException 
	{
		WebElement Userbx = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Edit[@AutomationId=\"TxtbxUsername\"]"));
		Userbx.click();
		driver.switchTo().activeElement().sendKeys("m");
		Thread.sleep(1000);
		WebElement Pswdbox = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Edit[@AutomationId=\"PwdBoxUserPassword\"]"));
		Pswdbox.click();
		driver.switchTo().activeElement().sendKeys("p");
		WebElement Signinbutton = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Button[@Name=\"SIGN IN\"][@AutomationId=\"BtnValidate\"]"));
		Signinbutton.click();	
		demog=new DemographicsPOM(driver);
			
   }
	
	
	@Test(priority=17)
	public void TitlebarMenu() throws IOException
	{
		test = extent.createTest("!!!!!!!!!!!!!!!!!DEMOGRAPHICS MODULE!!!!!!!!!!!!");
		test = extent.createTest("================TitleBar=================");
		test = extent.createTest(guiTestCaseName()+" To Verify Menu icon displayed and enabled");
		 demo.isdisplayed(demog.Menu, "Menu icon", test, driver);
		 demo.isEnabled(demog.Menu, "Menu icon", test, driver);
	}
	
	
	@Test(priority= 18)
	public void TitlebarSignout() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" To Verify Signout icon displayed and enabled");
		demo.isdisplayed(demog.Signout, "Signout icon", test, driver);
		demo.isEnabled(demog.Signout, "Signout icon", test, driver);		
	}
	
	
	@Test(priority= 19)
	public void TitlebarTheme() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" To Verify Theme icon displayed and enabled");
		demo.isdisplayed(demog.Theme, "Theme icon", test, driver);
		demo.isEnabled(demog.Theme, "Theme icon", test, driver);
	}
	
	@Test(priority= 20)
	public void TitlebarChangepassword() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" To Verify Password icon displayed and enabled");
		demo.isdisplayed(demog.Password, "Password icon", test, driver);
		demo.isEnabled(demog.Password, "Password icon", test, driver);
	}
	@Test(priority= 21)
	public void Titlebarname() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" To Verify Titlename demographics");
		demo.Textcomparsion(demog.Titlename, "Demographics", test, driver);
	}
	@Test(priority=22)
	public void Titlebarkrystallogo() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" To verify Krystal logo is  displayed ");
		demo.isdisplayed(demog.Productlogo, "Krystal logo", test, driver);

	}
	
	@Test(priority=23)
	public void Titlebaraddicon() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" To Verify Add Patient icon displayed and disabled");
		demo.isdisplayed(demog.Addpatient, "Add Patient", test, driver);
	
	}
	@Test(priority=24)
	public void TitlebarPateintlist() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" To Verify PatientMenu icon displayed and enabled");
		demo.isdisplayed(demog.Patientlist, "Patient Menu", test, driver);
		

	}
	// To verify the Patient Menu sidebar===============================================================================================
	@Test(priority=25)
	public void TitlebarPateintmenu() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" To Verify Patient Menu label is displayed");
		demo.isdisplayed(demog.PatientMenu, "Patient Menu", test, driver);
		
	}
	@Test(priority=26)
	public void SidebarDemogarphics() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" To Verify Demographics label in sidebar");
		Sidebarreference(demog.Demographics, "DEMOGRAPHICS", test);
	}
	@Test(priority=27)
	public void SidebarPrescription() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" To Verify Prescription label");
		
		Sidebarreference(demog.Prescription, "PRESCRIPTION", test);
	}
	
	@Test(priority=28)
	public void SidebarPlanAprroval() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" To Verify PlanAprroval label");
		Sidebarreference(demog.PlanAprroval, "PLAN APPROVAL", test);
	}
	@Test(priority=29)
	public void SidebarScheudling() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" To Verify Scheudling label");
		Sidebarreference(demog.Scheudling, "SCHEDULING", test);
	}
	
	@Test(priority=30)
	public void SidebarVitals() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" To Verify Vitals label");
		Sidebarreference(demog.Vitals, "VITALS", test);
	}
	
	@Test(priority=31)
	public void SidebarLabreports() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" To Verify LabReports label");
		Sidebarreference(demog.LabReports, "LAB REPORTS", test);
	}
	
	@Test(priority=32)
	public void SidebarReview() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" To Verify Treatment Review label");
		Sidebarreference(demog.TreatmentReview, "TREATMENT REVIEW", test);
	}
	public void Sidebarreference(WebElement actual, String Excepted, ExtentTest test) throws IOException
	{
		demo.isdisplayed(actual, Excepted, test, driver);
		demo.Textcomparsion(actual, Excepted, test, driver);
		demo.BydefaultisEnabled(actual, Excepted, test, driver);
	}
	
	@Test(priority=33)
	public void Addpatient() throws IOException, InterruptedException
	{
		test = extent.createTest(guiTestCaseName()+" To Verify Add Patient Click ");
		demo.isdisplayed(demog.Addpatient, "Add Patient", test, driver);
	}
	//---------------------------------First Name Functionality---------------------------------------	
	@Test(priority =34)
	public  void patientBasicInformationLabel() throws IOException {
    test = extent.createTest("==========PATIENT BASIC INFORMATION=========");
	test = extent.createTest(guiTestCaseName()+" To Verify Patient Basic information label");
	demo.Textcomparsion(demog.PBI, "PATIENT BASIC INFORMATION", test, driver);
	}

@Test(priority =35)
	public  void firstNameLabel() throws IOException  {
	test = extent.createTest(guiTestCaseName()+" To Verify First Name label");
	demo.Textcomparsion(demog.FN, "First Name", test, driver);
}

@Test(priority =36)
public  void MiddleNameLabel() throws IOException  {
test = extent.createTest(guiTestCaseName()+"Middle Name label");
demo.Textcomparsion(demog.MN, "Middle Name", test, driver);
}
@Test(priority =37)
public  void LastNameLabel() throws IOException  {
test = extent.createTest(guiTestCaseName()+"Last Name label");
demo.Textcomparsion(demog.LN, "Last Name", test, driver);
}

@Test(priority =39)
public  void SaveLabel() throws IOException  {
test = extent.createTest(guiTestCaseName()+"Save label");
demo.Textcomparsion(demog.Save, "SAVE", test, driver);

}

@Test(priority =40)
public  void MaleLabel() throws IOException  {
test = extent.createTest(guiTestCaseName()+"Gender Male label");
demo.Textcomparsion(demog.Male, "Male", test, driver);

}

@Test(priority =41)
public  void FemaleLabel() throws IOException  {
test = extent.createTest(guiTestCaseName()+"Gender Female label");
demo.Textcomparsion(demog.Female, "Female", test, driver);

}

@Test(priority =42)
public  void OthersLabel() throws IOException  {
test = extent.createTest(guiTestCaseName()+"Gender Others label");
demo.Textcomparsion(demog.Others, "Others", test, driver);

}

@Test(priority =43)
public  void WeightLabel() throws IOException  {
test = extent.createTest(guiTestCaseName()+"Weight label");
demo.Textcomparsion(demog.Weight, "Patient Weight (kg)", test, driver);

}

@Test(priority =44)
public  void NationalityLabel() throws IOException  {
test = extent.createTest(guiTestCaseName()+"Nationality label");
demo.Textcomparsion(demog.Nationality, "Nationality", test, driver);
}

@Test(priority =45)
public  void LanguagesKnownLabel() throws IOException  {
test = extent.createTest(guiTestCaseName()+"Languages Known label");
demo.Textcomparsion(demog.LanguagesKnown, "Languages Known", test, driver);
}

@Test(priority =46)
public  void IDtypeLabel() throws IOException  {
test = extent.createTest(guiTestCaseName()+"IDtype label");
demo.Textcomparsion(demog.IDtype, "ID Type", test, driver);
}

@Test(priority =47)
public  void IDNumberLabel() throws IOException  {
test = extent.createTest(guiTestCaseName()+"IDNumber label");
demo.Textcomparsion(demog.IDNumber, "ID Number", test, driver);
}

@Test(priority =48)
public  void RemarksLabel() throws IOException  {
test = extent.createTest(guiTestCaseName()+"Remarks label");
demo.Textcomparsion(demog.Remarks, "Remarks", test, driver);
}

@Test(priority =49)
public  void PhoneNumberLabel() throws IOException  {
test = extent.createTest("==========CONTACT GUI DETAILS=========");
test = extent.createTest(guiTestCaseName()+"Phone Number label");
demo.Textcomparsion(demog.PhoneNumber, "Phone Number", test, driver);
}

@Test(priority =50)
public  void AlternateNumberLabel() throws IOException  {
test = extent.createTest(guiTestCaseName()+"Alternate Number label");
WebElement Alternate = driver.findElement(By.name("Alternate Number"));
demo.Textcomparsion(Alternate, "Alternate Number", test, driver);
}

@Test(priority =51)
public  void ContactdetailsLabel() throws IOException  {
test = extent.createTest(guiTestCaseName()+"CONTACT DETAILS label");
demo.Textcomparsion(demog.Contactdetails, "CONTACT DETAILS", test, driver);
}

@Test(priority =52)
public  void EmailIDLabel() throws IOException  {
test = extent.createTest(guiTestCaseName()+"Email ID label");
demo.Textcomparsion(demog.EmailID, "Email ID", test, driver);
}

@Test(priority =53)
public  void CurrentAddressLabel() throws IOException  {
test = extent.createTest(guiTestCaseName()+"Current Address label");
demo.Textcomparsion(demog.CurrentAddress, "Current Address", test, driver);
}

@Test(priority =54)
public  void PermanentAddressLabel() throws IOException  {
test = extent.createTest(guiTestCaseName()+"Permanent Address label");
demo.Textcomparsion(demog.PermanentAddress, "Permanent Address", test, driver);
}

@Test(priority =55)
public  void RegionLabel() throws IOException  {
test = extent.createTest(guiTestCaseName()+"Region label");
demo.Textcomparsion(demog.Region, "Region", test, driver);
}
@Test(priority =56)
public  void ZipcodeLabel() throws IOException  {
test = extent.createTest(guiTestCaseName()+"Zipcode label");
demo.Textcomparsion(demog.Zipcode, "Zip Code", test, driver);
}

@Test(priority =57)
public  void caretakerdetailsLabel() throws IOException  {
	test = extent.createTest("==========CARE TAKER GUI DETAILS=========");
test = extent.createTest(guiTestCaseName()+"CARE TAKER DETAILS label");
demo.Textcomparsion(demog.caretakerdetails, "CARE TAKER DETAILS", test, driver);
}

@Test(priority =58)
public  void caretakernameLabel() throws IOException  {
test = extent.createTest(guiTestCaseName()+"Care taker name label");
demo.Textcomparsion(demog.CareName, "Name", test, driver);

caretakerNumberLabel();
}

@Test(priority =59)
public  void caretakerNumberLabel() throws IOException  {
test = extent.createTest(guiTestCaseName()+"Care taker Number label");
demo.Textcomparsion(demog.CareContactNumber, "Contact Number", test, driver);
}

@Test(priority =60)
public  void RelationshipLabel() throws IOException  {
test = extent.createTest(guiTestCaseName()+"Relationship label");
demo.Textcomparsion(demog.Relationship, "Relationship", test, driver);
}



@Test(priority =61)
public void Camerabutton() throws IOException
{
	test = extent.createTest("==========FUN=================");
	test = extent.createTest(guiTestCaseName()+"Camera Button is not Present");
	try {
		if(demog.Camera.isDisplayed())
		{
			test.fail("Camera button is displayed");
		}
		else
		{
			test.pass("Camera button is not displayed");
		}
	}
	catch(Exception e)
	{
		test.pass("Camera button is not displayed");
		catchexceptionscreenshot1(test,e);
	}
}
@Test(priority =62)
public void Browsebutton() throws IOException
{
	test = extent.createTest(guiTestCaseName()+"Browse Button is not Present");
	demo.isdisplayed(demog.Browse,"BROWSE", test, driver);
}// Browse is not updated

@Test(priority =63)
public void Saveclick()
{
	 try {
	 test=extent.createTest(funTestCaseName() +"Default Save Enabled"); 
    demo.isEnabled( demog.Save, "SAVE", test, driver);
    test=extent.createTest(funTestCaseName() +" Click on Save,Mandatory field errormessages should get displayed");
	 demog.Save.click();
	 demo.isdisplayed(demog.Blankmessage, "Input cannot be blank", test, driver);
	 demo.Textcomparsion(demog.Blankmessage, "Input cannot be blank", test, driver);
	 
	 demo.isdisplayed(demog.Selectdate, "Please select a date", test, driver);
	 demo.Textcomparsion(demog.Selectdate, "Please select a date", test, driver);
	 
	// demo.isdisplayed(demog.Selectbloodgroup, "Select a blood group", test, driver);
	// demo.Textcomparsion(demog.Selectbloodgroup, "Select a blood group", test, driver);
	 
	 demo.isdisplayed(demog.Selectgender, "Please Select a Gender", test, driver);
	 demo.Textcomparsion(demog.Selectgender, "Please Select a Gender", test, driver);
	 }
	 catch(Exception e)
	 {
		 test.error(e);
	 }
}
@Test(priority =64)
public void FirstnameTextbox() throws IOException, InterruptedException
{
	test = extent.createTest("=================PATIENTNAME===========");
	TextBox("First Name", 40,demog.FN);
	invalid("First Name", 40,demog.FN,driver);
	demog.FN.click();
	driver.switchTo().activeElement().sendKeys("User42562");
}
@Test(priority =65)
public void MiddlenameTextbox() throws IOException, InterruptedException
{
	TextBox("Middle Name", 40,demog.MN);
	invalid("Middle Name", 40,demog.MN,driver);
}
@Test(priority =66)
public void LastnameTextbox() throws IOException, InterruptedException
{
	TextBox("Last Name", 40,demog.LN);
	invalid("Last Name", 40,demog.LN,driver);
}
	
	
//---------------------------------Gender Functionality---------------------------------------	
@Test(priority = 67)
	public  void Gendersave() throws InterruptedException, IOException
	{
	     test = extent.createTest("=================GENDER===========");
		demog.Save.click();
		test = extent.createTest(guiTestCaseName()+"Unselect Gender and Save Error message is displayed");
		errormessagedisplayed("Please Select a Gender","Please Select a Gender");
	}
@Test(priority = 68)
	public  void DefaultMaleGender() throws InterruptedException, IOException
	{
	test = extent.createTest(guiTestCaseName()+" Male gender radio button label");
	DefaultGenderradiobutton("Male", "Male");
	}
WebElement Male;
@Test(priority = 69)
public  void MaleGenderselected() throws InterruptedException, IOException
{
test = extent.createTest(funTestCaseName()+"Male gender radio button is selcted");
demog.Male.click();
Actions action=new Actions(driver);
action.moveToElement(demog.Male).moveByOffset(-6, 0).click().perform();
Thread.sleep(1000);
demo.isSelected(demog.Male, "Male",test,driver);
}
	
@Test(priority = 70)
public  void DefaultFemaleGender() throws InterruptedException, IOException
{
test = extent.createTest(guiTestCaseName()+" Female gender radio button label");
DefaultGenderradiobutton("Female", "Female");
}
WebElement Female;
@Test(priority = 76)
public  void FemaleGenderselected() throws InterruptedException, IOException
{
test = extent.createTest(funTestCaseName()+" Female gender radio button is selcted");
demog.Female.click();
demo.isSelected(demog.Female, "Female",test,driver);
}

@Test(priority = 77)
public  void DefaultOthersGender() throws InterruptedException, IOException
{
test = extent.createTest(guiTestCaseName()+" Others gender radio button label");
DefaultGenderradiobutton("Others", "Others");
}
WebElement Others;
@Test(priority = 78)
public  void OthersGenderselected() throws InterruptedException, IOException
{
test = extent.createTest(funTestCaseName()+" To Verify Others gender radio button is selcted");
demog.Others.click();
demo.isSelected(demog.Others, "Others",test,driver);
}
WebElement RadioButton;
public void DefaultGenderradiobutton(String Text, String ExceptedText) throws IOException
{
	RadioButton = driver.findElement(By.name(Text));
	demo.isdisplayed(RadioButton, ExceptedText,test,driver);
	demo.BydefaultisSelected(RadioButton, ExceptedText,test,driver);
	demo.Textcomparsion(RadioButton, ExceptedText,test,driver);
}

//---------------------------------Patient Weight---------------------------------------
@Test(priority =80)
public  void WeightLabelValiddata() throws IOException  {
	test = extent.createTest("=================PATIENT WEIGHT===========");
test = extent.createTest(funTestCaseName()+" Patient weight enetered is correct");
Validweightrange(1,300);
demog.Weight.click();
driver.switchTo().activeElement().sendKeys(randomweightNumberText);
save();
clear(demog.Weight);
}
@Test(priority =81)
public  void WeightLabelInValiddata() throws IOException  {
test = extent.createTest(funTestCaseName()+" Patient weight enetered data is not correct");
invalidweightrange(1,300);
demog.Weight.click();
driver.switchTo().activeElement().sendKeys(scaledValuetext);
save();
try {
errormessagedisplayed("Range:[1 to 300]","Range:[1 to 300]");
clear(demog.Weight);
}
catch(Exception e)
{
	catchexceptionscreenshot(test,e);
	
}
finally {
	clear(demog.Weight);
}
}


WebElement Nationality;


@Test(priority =84)
public  void NationalityValid() throws IOException  {
	test = extent.createTest("=================NATIONALITY===========");
test = extent.createTest(funTestCaseName()+" Nationality data valid");
ValidText(demog.Nationality,test);
}
@Test(priority =85)
public void Nationalitytext() throws IOException, InterruptedException
{
	clear(demog.Nationality);
	Specialcharenable("Nationality",driver);
}

@Test(priority =87)
public  void LanguagesValid() throws IOException  {
test = extent.createTest(funTestCaseName()+" Languages data valid");
ValidText(demog.LanguagesKnown,test);
}
@Test(priority =88)
public void Languagestext() throws IOException, InterruptedException
{
	clear(demog.LanguagesKnown);
	Specialcharenable("Languages Known",driver);
}

@Test(priority =90)
public  void IDtypeValid() throws IOException  {
test = extent.createTest(funTestCaseName()+" IDtype data valid");
ValidText(demog.IDtype,test);
}
@Test(priority =91)
public void IDtypetext() throws IOException, InterruptedException
{
	clear(demog.IDtype);
	Specialcharenable("ID Type",driver);
}


@Test(priority =93)
public  void IDNumberValid() throws IOException  {
test = extent.createTest(funTestCaseName()+" IDNumber valid");
ValidText(demog.IDNumber,test);
}
@Test(priority =94)
public void IDNumbertext() throws IOException, InterruptedException
{
	test = extent.createTest(funTestCaseName()+" IDNumber textbox eneterd specialchar error message is displayed");
	clear(demog.IDNumber);
	Specialcharenable("ID Number",driver);
}


@Test(priority =96)
public  void RemarksValid() throws IOException  {
test = extent.createTest(funTestCaseName()+" Remarks valid");
ValidText(demog.Remarks,test);
}
@Test(priority =97)
public void Remarkstext() throws IOException, InterruptedException
{
	clear(demog.Remarks);
	Specialcharenable("Remarks",driver);
}

//---------------------------------Patient Phone number---------------------------------------

@Test(priority =99)
public  void Contactdetails() throws IOException {
test = extent.createTest("===============CONTACT DETAILS==============");
test = extent.createTest(guiTestCaseName()+" To Verify  Contact details label");
demo.Textcomparsion(demog.Contactdetails, "CONTACT DETAILS", test, driver);
}


@Test(priority =100)
public  void PhoneNumbertextfield() throws IOException  {
	test = extent.createTest(funTestCaseName()+" Phone Number enetered valid data");
	WebElement Phn=driver.findElements(By.className("TextBox")).get(16);
	PhoneNumbervalid(Phn,driver,test);
	test = extent.createTest(funTestCaseName()+" Phone Number enetered invalid data");
	PhoneNumberinvalid(Phn,driver);
	
	AlternatePhoneNumbertextfield();
}


@Test(priority =102)
public  void AlternatePhoneNumbertextfield() throws IOException  {
	test = extent.createTest(funTestCaseName()+" Alternate Phone Number enetered valid data");
	WebElement Ahn=driver.findElements(By.className("TextBox")).get(17);
	PhoneNumbervalid(Ahn,driver,test);
	test = extent.createTest(funTestCaseName()+" Alternate Phone Number enetered inaliddata");
	PhoneNumberinvalid(Ahn,driver);
}

public  void PhoneNumbervalid(WebElement element, WebDriver driver,ExtentTest test) throws IOException  {
randomstringtext();
element.click();
driver.switchTo().activeElement().sendKeys(randomNum);
demog.Save.click();
demo.Textcomparsion(element, randomNum, test, driver);
element.click();
driver.switchTo().activeElement().clear();
}
public  void PhoneNumberinvalid(WebElement element,WebDriver driver) throws IOException  {
element.click();
driver.switchTo().activeElement().sendKeys("abc\\","");
demog.Save.click();
errormessagedisplayed("Input must contain only + - ( ) and numbers","Input must contain only + - ( ) and numbers");
element.click();
driver.switchTo().activeElement().clear();

}
WebElement Contactdetails;

@Test(priority =103)
public void ValidEmail() throws IOException
{
	test = extent.createTest(funTestCaseName()+" Email ID enetered valid data");
	randomemail();
	WebElement EmailID= driver.findElements(By.className("TextBox")).get(21);
	EmailID.click();
	driver.switchTo().activeElement().sendKeys(randomEmail);
	demo.ByErrormessage(EmailID, randomEmail, test, driver);
	demog.Save.click();
}
@Test(priority =104)
public void Emailtext() throws IOException, InterruptedException
{
	WebElement EmailID= driver.findElements(By.className("TextBox")).get(21);
	EmailID.click();
	driver.switchTo().activeElement().clear();
	Specialcharenable("Email ID",driver);
}

@Test(priority =105)
public void currentAddress() throws InterruptedException, IOException
{
	test = extent.createTest(funTestCaseName()+" Current Address enetred valid data");
	WebElement CurrentAddress= driver.findElements(By.className("TextBox")).get(18);
	CurrentAddress.click();
	driver.switchTo().activeElement().sendKeys("#123 4th block panacea medical technologies malur");
	demog.Save.click();
	demo.Textcomparsion(CurrentAddress, "#123 4th block panacea medical technologies malur", test, driver);
	CurrentAddress.click();
	driver.switchTo().activeElement().clear();
}

@Test(priority =106)
public void currentAddresstext() throws IOException, InterruptedException
{
	test = extent.createTest(funTestCaseName()+" Current Address Special error message displayed");
	WebElement CurrentAddress= driver.findElements(By.className("TextBox")).get(18);
	CurrentAddress.click();
	driver.switchTo().activeElement().sendKeys("\\,");
	demog.Save.click();
	WebElement Specialchars=driver.findElement(By.name("Input must not contain \\ , '' , '"));
	demo.isdisplayed(Specialchars, "Input must not contain \\ , '' , '", test,driver);
	CurrentAddress.click();
	driver.switchTo().activeElement().clear();
}
@Test(priority =107)
public void permanentAddress() throws InterruptedException, IOException
{
	test = extent.createTest(funTestCaseName()+" Pernament Address enetred valid data");
	WebElement PernamentAddress= driver.findElements(By.className("TextBox")).get(22);
	PernamentAddress.click();
	driver.switchTo().activeElement().sendKeys("#456 4th block panacea medical technologies malur");
	demog.Save.click();
	demo.Textcomparsion(PernamentAddress, "#456 4th block panacea medical technologies malur", test, driver);
	PernamentAddress.click();
	driver.switchTo().activeElement().clear();
}

@Test(priority =108)
public void permanenttext() throws IOException, InterruptedException
{
	test = extent.createTest(funTestCaseName()+" Pernament Address Specialchars error message displayed");
	WebElement PernamentAddress= driver.findElements(By.className("TextBox")).get(22);
	PernamentAddress.click();
	driver.switchTo().activeElement().sendKeys("\\,");
	demog.Save.click();
	WebElement Specialchars=driver.findElement(By.name("Input must not contain \\ , '' , '"));
	demo.isdisplayed(Specialchars, "Input must not contain \\ , '' , '", test,driver);
	PernamentAddress.click();
	driver.switchTo().activeElement().clear();
}

@Test(priority =109)
public void CurrentRegiondatavalid()throws InterruptedException, IOException
{
	test = extent.createTest(guiTestCaseName()+" Current Region data validation");
	Region(19, "Indian,Cristhan",driver,test);
	
}

@Test(priority =110)
public void CurrentRegiontext() throws IOException, InterruptedException
{
	test = extent.createTest(funTestCaseName()+" Current Region Specialchars error message displayed");
	specialchar(19, "\\,",driver,test,"Input must not contain \\ , '' , '");
}
@Test(priority =111)
public void CurrentZipcodevalid()throws InterruptedException, IOException
{
	test = extent.createTest(guiTestCaseName()+" Current Zipcode data validation");
	Region(20, "563-101",driver,test);
	
}

@Test(priority =112)
public void CurrentZiptext() throws IOException, InterruptedException
{
	test = extent.createTest(funTestCaseName()+" Current Zipcode Specialchars error message displayed");
	specialchar(20, "\\,",driver,test,"Input must not contain \\ , '' , '");
}


@Test(priority =113)
public void PermentRegiondatavalid()throws InterruptedException, IOException
{
	test = extent.createTest(guiTestCaseName()+" Pernament Region data validation");
	Region(23, "Islam,Cristhan",driver,test);
	
}

@Test(priority =114)
public void PermentRegiontext() throws IOException, InterruptedException
{
	test = extent.createTest(funTestCaseName()+" Pernamnet Region Specialchars error message displayed");
	specialchar(23, "\\,",driver,test,"Input must not contain \\ , '' , '");
}
@Test(priority =115)
public void PermentZipcodevalid()throws InterruptedException, IOException
{
	test = extent.createTest(guiTestCaseName()+" Pernamnet Zipcode data validation");
	Region(24, "564001",driver,test);
}


@Test(priority =116)
public void PermentZiptext() throws IOException, InterruptedException
{
	test = extent.createTest(funTestCaseName()+" Pernamnet Zipcode Specialchars error message displayed");
	specialchar(24, "\\,",driver,test,"Input must not contain \\ , '' , '");
}


public void Region(int i, String Text,WebDriver driver,ExtentTest test) throws IOException
{
	WebElement CurrentRegion= driver.findElements(By.className("TextBox")).get(i);
	CurrentRegion.click();
	driver.switchTo().activeElement().sendKeys(Text);
	demog.Save.click();
	demo.Textcomparsion(CurrentRegion, Text, test, driver);
	CurrentRegion.click();
	driver.switchTo().activeElement().clear();
}

public void specialchar(int i, String Text,WebDriver driver,ExtentTest test, String element) throws IOException
{
	WebElement CurrentRegion= driver.findElements(By.className("TextBox")).get(i);
	CurrentRegion.click();
	driver.switchTo().activeElement().sendKeys(Text);
	demog.Save.click();
	WebElement Specialchars=driver.findElement(By.name(element));
	demo.isdisplayed(Specialchars, element, test,driver);
	CurrentRegion.click();
	driver.switchTo().activeElement().clear();
}



WebElement caretakerdetails;
@Test(priority =118)
public void caretakerdeatils() throws IOException
{
	test = extent.createTest("===============CARE TAKER DETAILS==============");
	test = extent.createTest(guiTestCaseName()+" Care taker details label");
	caretakerdetails=driver.findElement(By.name("CARE TAKER DETAILS"));
    demo.Textcomparsion(demog.caretakerdetails, "CARE TAKER DETAILS", test, driver);
}
@Test(priority =119)
public void caretakervalidation() throws IOException
{
	test = extent.createTest(funTestCaseName()+" Care taker name data validation");
	ValidText(demog.Caretakername,test);
	save();
}

@Test(priority =120)
public void caretakernametext() throws IOException, InterruptedException
{
	WebElement CareTakerName= driver.findElements(By.className("TextBox")).get(12);
	CareTakerName.click();
	driver.switchTo().activeElement().clear();
	driver.switchTo().activeElement().sendKeys("\\,");
	demog.Save.click();
	WebElement Specialchars=driver.findElement(By.name("Input must not contain \\ , '' , '"));
	demo.isdisplayed(Specialchars, "Input must not contain \\ , '' , '", test,driver);
	CareTakerName.click();
	driver.switchTo().activeElement().clear();
}
@Test(priority =121)
public void caretakernumbervalidation() throws IOException
{
	test = extent.createTest(funTestCaseName()+"Care taker Number data validation");
	ValidNumber(demog.ContactNumber,test);
	save();
}
@Test(priority =122)
public void caretakernumbertext() throws IOException, InterruptedException
{
	WebElement CareTakerNumber= driver.findElements(By.className("TextBox")).get(13);
	CareTakerNumber.click();
	driver.switchTo().activeElement().clear();
	driver.switchTo().activeElement().sendKeys("\\,");
	demog.Save.click();
	WebElement Specialchars=driver.findElement(By.name("Input must contain only + - ( ) and numbers"));
	demo.isdisplayed(Specialchars, "Input must contain only + - ( ) and numbers", test,driver);
	CareTakerNumber.click();
	driver.switchTo().activeElement().clear();
}


@Test(priority =123)
public void CareTakerAddress() throws InterruptedException, IOException
{
	test = extent.createTest(funTestCaseName()+" Care Taker Address enetred valid data");
	WebElement CareTakerAddress= driver.findElements(By.className("TextBox")).get(14);
	CareTakerAddress.click();
	driver.switchTo().activeElement().sendKeys("#098 -123 4th block panacea medical technologies malur");
	demog.Save.click();
	demo.Textcomparsion(CareTakerAddress, "#098 -123 4th block panacea medical technologies malur", test, driver);
	CareTakerAddress.click();
	driver.switchTo().activeElement().clear();
}

@Test(priority =124)
public void CareTakerAddresstext() throws IOException, InterruptedException
{
	test = extent.createTest(funTestCaseName()+" Care Taker Address Special error message displayed");
	WebElement CareTakerAddresstext= driver.findElements(By.className("TextBox")).get(14);
	CareTakerAddresstext.click();
	driver.switchTo().activeElement().sendKeys("\\,");
	demog.Save.click();
	WebElement Specialchars=driver.findElement(By.name("Input must not contain \\ , '' , '"));
	demo.isdisplayed(Specialchars, "Input must not contain \\ , '' , '", test,driver);
	CareTakerAddresstext.click();
	driver.switchTo().activeElement().clear();
}

@Test(priority =125)
public void caretakerRelationship() throws IOException
{
	test = extent.createTest(funTestCaseName()+" Care taker Relationship valid data");
	ValidText(demog.Relationship,test);
	save();
}
@Test(priority =126)
public void Relationshiptext() throws IOException, InterruptedException
{
	clear(demog.Relationship);
	Specialcharenable("Relationship",driver);
}






public void ValidNumber(WebElement element,ExtentTest Test) throws IOException
{
	 randomstringtext();
	 element.click();
	 driver.switchTo().activeElement().sendKeys(randomNum);
	 demo.ByErrormessage(element, randomNum, Test, driver);
}


public void ValidText(WebElement element, ExtentTest Test) throws IOException
{
	randomCharOutOfRange(20);
	element.click();
	driver.switchTo().activeElement().sendKeys(randomcharString);
	demo.isdisplayed(element, randomcharString, Test, driver);
}

public  void TextBox(String Text, int i,WebElement actual) throws IOException, InterruptedException 
{
	randomUpper(i);
	ValidataUpper(Text);
	save();
	clear(actual);
	
	randomLower(i);
	ValidataLower(Text);
	save();
	clear(actual);
	
	randomalpha(i);
	ValidataUpperLower(Text);
	save();
	clear(actual);
	
	randomNumber(i);
	ValidataNumber(Text);
	save();
	clear(actual);
	
	randomstringtext(i);
	Validatachars(Text);
	save();
	clear(actual);
	
}


public void invalid(String Text, int i,WebElement actual,WebDriver driver) throws IOException, InterruptedException
{
	Specialcharenable(Text,driver);
	save();
}


	
public void save()
{
	demog.Save.click();
}
public void clear(WebElement element)
{
	element.click();
	driver.switchTo().activeElement().clear();
}

	
}
