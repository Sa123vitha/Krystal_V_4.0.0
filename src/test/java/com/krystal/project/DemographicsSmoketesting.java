package com.krystal.project;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

import io.appium.java_client.windows.WindowsDriver;

public class DemographicsSmoketesting extends ReferencefileChemotheraphy{
	
	
	
	WebElement PBI;
	 WebElement FN;
	 WebElement MN;
	 WebElement LN;
	 WebElement OID;
	 WebElement DOB;
	 WebElement AG;
	 WebElement BG;
	 WebElement GEN;
	 WebElement OTH;
	 WebElement Save;
	 WebElement Gender;
	 WebElement PatientSizedropdown;
	 WebElement PatientSize;
	 WebElement Nationality;
	 WebElement Languages;
	 WebElement IDtype;
	 WebElement IDNumber;
		WebElement PW;
		WebElement Remarks;
		WebElement PhoneNumber;
		WebElement AlternateNumber;
		WebElement EmailID;
		WebElement Region;
		  WebElement Caretakername;
			WebElement ContactNumber;
			WebElement Relationship;
			WebElement Zipcode;
	  
	 
	@BeforeClass
	public void setUp1()  throws InterruptedException, IOException {
	DesiredCapabilities appCapabilities = new DesiredCapabilities();
	appCapabilities.setCapability("app", "C:\\Program Files\\Panacea Medical Technologies\\Krystal\\Krystal.exe");
	driver = new WindowsDriver<WebElement>(new URL("http://127.0.0.1:4723"), appCapabilities);
	navigation();
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
   }
	@Test(priority=0)
	public void Addfield() throws InterruptedException
	{
	driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"NavigationTopBarSubView\"]/Button[@ClassName=\"Button\"]")).click();
	Thread.sleep(2000);
	}

	@Test(priority =1)
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
	
	public void firstcase(ExtentTest test, WebDriver driver) throws IOException, InterruptedException
	{
	//	OID();
		fn(test,driver);
		mn(test,driver);
		ln(test,driver);
		Dateofbirth(test,driver);
		Bloodgroup(test,driver);
		gender(test,driver);
		Patientsize(test,driver);
		Patientweight(test,driver);
	    Nationality(test,driver);
		Languages(test,driver);
		IDtype(test,driver);
		IDNumber(test,driver);
		Remarks(test,driver);
	     PhoneNumber(test,driver);
	    AlternatePhoneNumber(test,driver);
		Email(test,driver);
		currentAddress(test,driver);
		permanentAddress(test,driver);
		Region(test,driver);
		Zipcode(test,driver);
		caretakername(test,driver);
		caretakernumber(test,driver);
		caretakerrelationshiplabel(test,driver);
		CareTakeraddress(test,driver);	
		SameCurrent(test,driver);
	}
	public void firstcaseupdate(ExtentTest test, WebDriver driver) throws IOException, InterruptedException
	{
		//OID();
		fn(test,driver);
		mn(test,driver);
		ln(test,driver);
		//Dateofbirth();
		Bloodgroup(test,driver);
		gender(test,driver);
		Patientsize(test,driver);
		Patientweight(test,driver);
		Nationality(test,driver);
		Languages(test,driver);
		IDtype(test,driver);
		IDNumber(test,driver);
		Remarks(test,driver);
	    PhoneNumber(test,driver);
	    AlternatePhoneNumber(test,driver) ;
		Email(test,driver);
		currentAddress(test,driver);
		permanentAddress(test,driver);
		Region(test,driver);
		Zipcode(test,driver);
		caretakername(test,driver);
		caretakernumber(test,driver);
		caretakerrelationshiplabel(test,driver);
		CareTakeraddress(test,driver);	
		
	}
	@Test(priority=2)
	public void savedata() throws IOException, InterruptedException
	{
		try {
		test = extent.createTest(funTestCaseName()+" Enter Demographics data to save");
		firstcase(test,driver);
		Thread.sleep(2000);
		}
		catch(Exception e)
		{
		test.error(e);
		}
		try {
		savepopup();
		Thread.sleep(2000);
		}
		catch(Exception e)
		{
		test.error(e);
		}
		try {
		test = extent.createTest(funTestCaseName()+" Menu Buttons enabled or disabled during saved");
		Buttons(test,driver);
		Thread.sleep(2000);
		}
		catch(Exception e)
		{
		test.error(e);
		}
		try {
		test = extent.createTest(funTestCaseName()+" Edit button enabled when data saved");
		Edit(test,driver);
		Thread.sleep(2000);
		}
		catch(Exception e)
		{
		test.error(e);
		}
		try {
		test = extent.createTest(funTestCaseName()+" Data comparsion for save details");
		datasaved(test,driver);
		Thread.sleep(2000);
		}
		catch(Exception e)
		{
		test.error(e);
		}
		try {
		test = extent.createTest("========EDIT DEMOGRAPHICS=======");
		firstcaseupdate(test,driver);
		Update();
		Thread.sleep(2000);
		}
		catch(Exception e)
		{
		test.error(e);
		}
		try {
		test = extent.createTest(funTestCaseName()+" Menu Buttons enabled or disabled during update");
		Buttons(test,driver);
		Thread.sleep(2000);
		}
		catch(Exception e)
		{
		test.error(e);
		}
		try {
		test = extent.createTest(funTestCaseName()+" Edit button enabled when data upadted");
		Edit(test,driver);
		Thread.sleep(2000);
		}
		catch(Exception e)
		{
		test.error(e);
		}
		try {
			test = extent.createTest(funTestCaseName()+" Data saved comparsion for update");
			datasaved(test,driver);
			Thread.sleep(2000);
			Update();
		}
		catch(Exception e)
		{
		test.error(e);
		}
	}
	
	public void Buttons(ExtentTest test,WebDriver driver) throws IOException, InterruptedException
	{
		
		WebElement demos=driver.findElement(By.name("DEMOGRAPHICS"));
		WebElement pres=driver.findElement(By.name("PRESCRIPTION"));
		WebElement plan=driver.findElement(By.name("PLAN APPROVAL"));
		WebElement sche=driver.findElement(By.name("SCHEDULING"));
		WebElement vitals=driver.findElement(By.name("VITALS"));
		WebElement lab=driver.findElement(By.name("LAB REPORTS"));
		WebElement review=driver.findElement(By.name("TREATMENT REVIEW"));
		
		demo.isEnabled(demos, "DEMOGRAPHICS", test, driver);
		demo.isEnabled(pres, "PRESCRIPTION", test, driver);
		demo.BydefaultisEnabled(plan, "PLAN APPROVAL", test, driver);
		demo.BydefaultisEnabled(sche, "SCHEDULING", test, driver);
		demo.isEnabled(vitals, "VITALS", test, driver);
		demo.isEnabled(lab, "LAB REPORTS", test, driver);
		demo.BydefaultisEnabled(review, "TREATMENT REVIEW", test, driver);
		demos.click();
	}
	        String FnText;
			String MnText;
			String LnText;
			String Bg;
			String Gen;
			String Ps;
			String PwText;
			String NtText;
			String EmText ;
			String RgText;
			String ZpText;
			String CtText;
			String LgText;
			String IdText;
			String InText;
			String RmText;
		    String RtText;
		    String CN;
		    String PnText;
		    String AnText;
		    

	public void Edit(ExtentTest test,WebDriver driver) throws IOException
	{
		
		WebElement Edit=driver.findElement(By.name("EDIT"));
		demo.isdisplayed(Edit, "EDIT", test, driver);
		demo.isEnabled(Edit, "EDIT", test, driver);
		Edit.click();
	}
		
		public void datasaved(ExtentTest test,WebDriver driver) throws IOException, InterruptedException
		{
		//demo.ByActionclass(OID, OIDText, test, driver);
		demo.ByActionclass(FN, FnText, test, driver);
		demo.ByActionclass(MN, MnText, test, driver);
		demo.ByActionclass(LN, LnText, test, driver);
		demo.ByActionclass(BG, Bg, test, driver);
	    Thread.sleep(3000);
	    demo.ByActionclass(Nationality, NtText, test, driver);
        demo.ByActionclass(Languages, LgText, test, driver);
		demo.ByActionclass(Gender, Gen, test, driver);
		Thread.sleep(2000);
		demo.ByActionclass(IDtype, IdText, test, driver);
		demo.ByActionclass(PatientSize, Ps, test, driver);
		Thread.sleep(3000);
		demo.ByActionclass(PW, PwText, test, driver);
		demo.ByActionclass(IDNumber, InText, test, driver);
		demo.ByActionclass(Remarks, RmText, test, driver);
		demo.ByActionclass(PhoneNumber, PnText, test, driver);
		demo.ByActionclass(AlternateNumber, AnText, test, driver);
		demo.ByActionclass(EmailID, EmText, test, driver);
		demo.ByActionclass(Region, RgText, test, driver);
		demo.ByActionclass(Zipcode, ZpText, test, driver);
		demo.ByActionclass(Caretakername, CtText, test, driver);
		demo.ByActionclass(ContactNumber, CN, test, driver);
		demo.ByActionclass(Relationship, RtText, test, driver);
		demo.ByActionclass(Region, RgText, test, driver); //Addreess cannot be echeked
		demo.isSelected(Checkbox, "Checkbox", test, driver);
	}
 
 public void Update() throws IOException, InterruptedException
 {
	 WebElement update=driver.findElement(By.name("UPDATE"));
	 update.click();
	 Sitesave("Demographics Update", "Demographics data updated for selected patient.", "Demographics Update", "Demographics data updated for selected patient.", 0, driver);
 }
 WebElement Checkbox;
 public void SameCurrent(ExtentTest test,WebDriver driver) throws IOException
 {
	 Checkbox=driver.findElement(By.name("Same As Current Address"));
	 Checkbox.click();
	 demo.isSelected(Checkbox, "Checkbox", test, driver);
 }
	
	public void PatientSave()
	{ 
		   FN=driver.findElement(By.name("First Name"));
		   MN=driver.findElement(By.name("Middle Name"));
		   LN=driver.findElement(By.name("Last Name"));
		   OID = driver.findElement(By.name("Other ID"));
		   DOB = driver.findElement(By.name("Date Of Birth"));
		   AG = driver.findElement(By.name("Age (years)"));
		   BG = driver.findElement(By.name("Blood Group"));
		   GEN = driver.findElement(By.name("Gender"));
	}
	String OIDText;
	DemographicsExternal demo;
	public void OID(ExtentTest test,WebDriver driver) throws IOException, InterruptedException
	{
		test = extent.createTest(guiTestCaseName()+"Firstname");
		OID=driver.findElement(By.name("Other ID"));
		actionsclass(OID);
		Textelement(OID,driver);
		OIDText = Text;
		demo=new DemographicsExternal() ;
		demo.ByActionclass(OID, OIDText, test,driver);
	}

	public void fn(ExtentTest test,WebDriver driver) throws IOException, InterruptedException
	{
		test = extent.createTest(guiTestCaseName()+"Firstname");
	    FN=driver.findElement(By.name("First Name"));
	    actionsclass(FN);
		Textelement1(FN,driver);
		FnText=Text;
		demo=new DemographicsExternal() ;
		demo.ByActionclass(FN, FnText, test,driver);
	}
	
	
	public void mn(ExtentTest test,WebDriver driver) throws IOException, InterruptedException
	{
		test = extent.createTest(guiTestCaseName()+"Middlename");
		MN=driver.findElement(By.name("Middle Name"));
		actionsclass(MN);
		Textelement(MN,driver);
		MnText=Text;
		demo.ByActionclass(MN, MnText, test, driver);
	}

	public void ln(ExtentTest test,WebDriver driver) throws IOException, InterruptedException
	{
		test = extent.createTest(guiTestCaseName()+"Last Name");
		LN=driver.findElement(By.name("Last Name"));
		actionsclass(LN);
		Textelement1(LN,driver);
		LnText = Text;
		demo.ByActionclass(LN, LnText, test, driver);
	}
	
	public void Dateofbirth(ExtentTest test,WebDriver driver) throws IOException, InterruptedException
	{
			driver.findElement(By.name("Show Calendar")).click();
			Thread.sleep(1000);
			driver.findElement(By.name("November, 2023")).click();
			Thread.sleep(1000);
			driver.findElement(By.name("2023")).click();
			Thread.sleep(1000);
			driver.findElement(By.name("2021")).click();
			Thread.sleep(1000);
			driver.findElement(By.name("Jan")).click();
			Thread.sleep(1000);
			driver.findElement(By.name("27")).click();		
	}
	WebElement bloodgroup;
	public void Bloodgroup(ExtentTest test,WebDriver driver) throws IOException
	{
		test = extent.createTest(guiTestCaseName()+"Bloodgroup");
		BG = driver.findElement(By.name("Blood Group"));
		BG.click();
		BloodGroup();
		bloodgroup=driver.findElement(By.name(selectedBloodGroup));
		Bg=selectedBloodGroup;
		Actions action=new Actions(driver);
		action.moveToElement(bloodgroup).click().perform();
	}
	
	Actions action;
	
	public void gender(ExtentTest test,WebDriver driver) throws IOException
	{
		test = extent.createTest(guiTestCaseName()+"Gender");
		Gender();
		Gender=driver.findElement(By.name(selectedGender));
		Gen=selectedGender;
		Actions action=new Actions(driver);
		action.moveToElement(Gender).click().perform();
		demo.ByActionclass(Gender, Gen, test, driver);
	}
	
	public void Patientsize(ExtentTest test,WebDriver driver) throws IOException
	{
		test = extent.createTest(guiTestCaseName()+"Patient Size");
		PatientSizedropdown = driver.findElement(By.name("Patient Size"));
		PatientSizedropdown.click();
		PatientSize();
		PatientSize=driver.findElement(By.name(selectedPatientSize));
		Actions action=new Actions(driver);
		action.moveToElement(PatientSize).doubleClick().perform();
		Ps=selectedPatientSize;
	}
public void actionsclass(WebElement element)
{
	Actions action=new Actions(driver);
	element.click();
	action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
    action.sendKeys(Keys.DELETE).build().perform();
}
	public void Patientweight(ExtentTest test,WebDriver driver) throws IOException
	{
		test = extent.createTest(guiTestCaseName()+"Patient weight");
		PW = driver.findElement(By.name("Patient Weight (kg)"));
		actionsclass(PW);
		Validweightrange(1, 300);
		PW.click();
		driver.switchTo().activeElement().sendKeys(randomweightNumberText);
		PwText = randomweightNumberText;
		demo.ByActionclass(PW, PwText, test, driver);
	}
	
	public  void Nationality(ExtentTest test,WebDriver driver) throws IOException, InterruptedException  {
		test = extent.createTest(guiTestCaseName()+" Nationality Name");
		Nationality = driver.findElement(By.name("Nationality"));
		actionsclass(Nationality);
		Textelement1(Nationality,driver);
	    NtText = Text;
		demo.ByActionclass(Nationality, NtText, test, driver);
		}
	
	public  void Languages(ExtentTest test,WebDriver driver) throws IOException, InterruptedException  {
		test = extent.createTest(guiTestCaseName()+" Languages Known");
		Languages = driver.findElement(By.name("Languages Known"));
		actionsclass(Languages);
		Textelement(Languages,driver);
	    LgText = Text;
		demo.ByActionclass(Languages, LgText, test, driver);
		}
	
	public  void IDtype(ExtentTest test,WebDriver driver) throws IOException, InterruptedException  {
		test = extent.createTest(guiTestCaseName()+" IDtype Known");
		IDtype = driver.findElement(By.name("ID Type"));
		actionsclass(IDtype);
		Textelement1(IDtype,driver);
	    IdText = Text;
		demo.ByActionclass(IDtype, IdText, test, driver);
		}
	
	public  void IDNumber(ExtentTest test,WebDriver driver) throws IOException, InterruptedException  {
		test = extent.createTest(guiTestCaseName()+" IDNumber");
		IDNumber = driver.findElement(By.name("ID Number"));
		actionsclass(IDNumber);
		TextNumber(IDNumber,driver);
		InText = Text;
		demo.ByActionclass(IDNumber, InText, test, driver);
		Thread.sleep(2000);
		}
	
	public  void Remarks(ExtentTest test,WebDriver driver) throws IOException, InterruptedException  {
		test = extent.createTest(guiTestCaseName()+" Remarks");
		Remarks = driver.findElement(By.name("Remarks"));
		actionsclass(Remarks);
		Textelement1(Remarks,driver);
	    RmText = Text;
		demo.ByActionclass(Remarks, RmText, test, driver);
		
		}
	
	public  void PhoneNumber(ExtentTest test,WebDriver driver) throws IOException  {
		test = extent.createTest(guiTestCaseName()+" Phone Number");
		PhoneNumber = driver.findElement(By.name("Phone Number"));
		actionsclass(PhoneNumber);
		randomstringtext();
		PhoneNumber.click();
		demo=new DemographicsExternal() ;
		 driver.switchTo().activeElement().sendKeys(randomNum);
			
		PnText = randomNum;
		demo.ByErrormessage(PhoneNumber, PnText, test, driver);
	}
	
	public  void AlternatePhoneNumber(ExtentTest test,WebDriver driver) throws IOException  {
		test = extent.createTest(guiTestCaseName()+" Alternate Number");
		AlternateNumber = driver.findElement(By.name("Alternate Number"));
		actionsclass(AlternateNumber);
		randomstringtext();
		AlternateNumber.click();
		driver.switchTo().activeElement().sendKeys(randomNum);
		AnText = randomNum;
		demo.ByActionclass(AlternateNumber, AnText, test, driver);
	}

	public  void Email(ExtentTest test,WebDriver driver) throws IOException, InterruptedException {
		test = extent.createTest(guiTestCaseName()+" Email ID label");
		EmailID = driver.findElement(By.name("Email ID"));
		actionsclass(EmailID);
		randomemail();
		EmailID.click();
		driver.switchTo().activeElement().sendKeys(randomEmail);
		EmText = randomEmail;
		demo.ByActionclass(EmailID, EmText, test, driver);
		Thread.sleep(1000);
		}

	public void currentAddress(ExtentTest test,WebDriver driver) throws InterruptedException, IOException
	{
		test = extent.createTest(funTestCaseName()+" Current Address enetred valid data");
		Address("//Text[@Name='Address']",2);
	}
	public void permanentAddress(ExtentTest test,WebDriver driver) throws InterruptedException, IOException
	{
		test = extent.createTest(funTestCaseName()+" Pernament Address enetred valid data");
		Address("//Text[@Name='Address']",5);
	}

	public void Region(ExtentTest test,WebDriver driver)throws InterruptedException, IOException
	{
		test = extent.createTest(guiTestCaseName()+" Region");
		Region = driver.findElement(By.name("Region"));
		actionsclass(Region);
		Textelement1(Region,driver);
	    RgText = Text;
		demo.ByActionclass(Region, RgText, test, driver);
	}


	public void Zipcode(ExtentTest test,WebDriver driver)throws InterruptedException, IOException
	{
		test = extent.createTest(guiTestCaseName()+" Zipcode");
		Zipcode = driver.findElement(By.name("Zip Code"));
		actionsclass(Zipcode);
		TextNumber(Zipcode,driver);
	    ZpText = Text;
		demo.ByActionclass(Zipcode, ZpText, test, driver);
	}
	
	public void caretakername(ExtentTest test,WebDriver driver) throws IOException, InterruptedException
	{
		test = extent.createTest(guiTestCaseName()+" Care taker name label");
	   Caretakername = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"DemographicsMainView\"]/Custom[@ClassName=\"DemographicsSection2View\"]/Edit[@AutomationId=\"TextBoxViewModelCaretakerName\"]"));
	   Thread.sleep(1000);
	   actionsclass(Caretakername);
	   Thread.sleep(1000);
	   Textelement1(Caretakername,driver);
	   Thread.sleep(1000);
	    CtText = Text;
		demo.ByActionclass(Caretakername, CtText, test, driver);
	}
	
	public void caretakernumber(ExtentTest test,WebDriver driver) throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" Care taker number label");
		ContactNumber = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"DemographicsMainView\"]/Custom[@ClassName=\"DemographicsSection2View\"]/Edit[@AutomationId=\"TextBoxViewModelCtContactNum\"]"));
		actionsclass(ContactNumber);
		randomstringtext();
		ContactNumber.click();
		driver.switchTo().activeElement().sendKeys(randomNum);
		CN=randomNum;
		demo.ByActionclass(ContactNumber, CN, test, driver);
	}

	public void caretakerrelationshiplabel(ExtentTest test,WebDriver driver) throws IOException, InterruptedException
	{
		test = extent.createTest(guiTestCaseName()+" Relationship label");
		Relationship = driver.findElement(By.name("Relationship"));
		actionsclass(Relationship);
		Textelement(Relationship,driver);
	    RtText = Text;
		demo.ByActionclass(Relationship, RtText, test, driver);
	}
	
	public void CareTakeraddress(ExtentTest test,WebDriver driver) throws InterruptedException, IOException
	{
		test = extent.createTest(funTestCaseName()+" Caretaker Address enetred valid ");
		Address("//Text[@Name='Address']",1);
	}
	public void savepopup() throws InterruptedException, IOException
	{
		Save=driver.findElement(By.name("SAVE"));
		Save.click();
		Sitesave("Demographics Save", "Demographics data saved for patient.", "Demographics Save", "Demographics data saved for patient.", 0, driver);
	}
	
	public void Address(String actualText, int i) throws InterruptedException
	{
			By locator = By.xpath(actualText);
			List<WebElement> elements = driver.findElements(locator);
			int desiredIndex = i;
			if (desiredIndex < elements.size()) {
				Thread.sleep(2000);
			    WebElement element = elements.get(desiredIndex);
			    element.click();  
			    driver.switchTo().activeElement().sendKeys("#123 4th block");
			} 	
	}

	String Text;
	public void Textelement(WebElement element,WebDriver driver) throws InterruptedException
	{
		element.click();
		Thread.sleep(1000);
		randomstringtext(15);
		Thread.sleep(1000);
		driver.switchTo().activeElement().sendKeys(randomString);
		Text=randomString;
	}
	
	public void Textelement1(WebElement element,WebDriver driver) throws InterruptedException
	{
		element.click();
		randomalpha(15);
		Thread.sleep(1000);
		driver.switchTo().activeElement().sendKeys(randomStringalpha);
		Text=randomStringalpha;
	}
	
	
	public void TextNumber(WebElement element,WebDriver driver) throws InterruptedException
	{
		element.click();
		randomNumber(11);
		Thread.sleep(1000);
		driver.switchTo().activeElement().sendKeys(randomStringNumber);
		Text=randomStringNumber;
	}
	
	String Number;
	public void Numberelement(WebElement element, int k) throws InterruptedException
	{
		element.click();
		randomNumber(k);
		Text=randomStringNumber;
		Thread.sleep(1000);
		driver.switchTo().activeElement().sendKeys(randomStringNumber);
	}
	
	
	@AfterSuite
	public void tearDown() {
	    extent.flush();

	}
	
}
