package com.krystal.project;

import java.util.concurrent.TimeUnit;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Fun_Demographics extends ReferencefileChemotheraphy{
	@Test(priority=0)
	public void navigation() throws InterruptedException 
	{
		WebElement usernameField = driver.findElement(By.name("User ID"));
		usernameField.click();
		driver.switchTo().activeElement().sendKeys("m");
		Thread.sleep(1000);
		WebElement Passwordbox = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Edit[@AutomationId=\"PwdBoxUserPassword\"]/Text[@Name=\"Password\"][@AutomationId=\"LblName\"]"));
		Passwordbox.click();
		Thread.sleep(1000);
		driver.switchTo().activeElement().sendKeys("p");
		WebElement Signinbutton = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Button[@Name=\"SIGN IN\"][@AutomationId=\"BtnValidate\"]"));
		Signinbutton.click();
		Thread.sleep(1000);
		}
	 
	WebElement FN;
	WebElement MN;
    WebElement LN;
	WebElement Save;
	WebElement AddPatient;
	
	@Test(priority=1)
	public void Addfield()
	{
		driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"NavigationTopBarSubView\"]/Button[@ClassName=\"Button\"]")).click();
	}
	
	public void ImageDisplayed(WebElement image) throws InterruptedException 
	{
		if (image.isDisplayed()) {
			System.out.println("The Image is displayed correctly.");
		} else {
			System.out.println("The  Image  is not displayed.");
		}
	}
	@Test(priority=1)
	public void Browse() throws InterruptedException 
	{
		System.out.println("=======================Browse=========================");
		System.out.println("1. To verify by default image  is not displayed");
		
		Thread.sleep(1000);
		driver.findElement(By.name("BROWSE")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("Pictures")).click();
		Thread.sleep(1000);
		WebElement doubleclickscreen = driver.findElement(By.name("Screenshots"));
		Actions action2 = new Actions(driver);
		action2.moveToElement(doubleclickscreen).doubleClick().perform();
		Thread.sleep(2000);
		driver.findElement(By.name("Screenshot (3474).png")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("Open")).click();
		Thread.sleep(1000);
		WebElement importedimage = driver.findElement(By.className("Image"));
	    ImageDisplayed(importedimage);
		System.out.println("-----------------------------------------------");
		System.out.println("2. To verify Imported image is displayed or not");
		WebElement elementToMouseOverBrowse = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"DemographicsMainView\"]/Custom[@ClassName=\"DemographicsSection1View\"]/Button[@AutomationId=\"DeletePhotoButton\"]"));
        Thread.sleep(3000);
        elementToMouseOverBrowse.click();
	}
	@Test(priority=2)
	public void FirstnameAlphabhets() throws InterruptedException {
	
		FN=driver.findElement(By.name("First Name"));

		
		String Alphabhets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		driver.switchTo().activeElement().sendKeys(Alphabhets);
		
		Save=driver.findElement(By.name("SAVE"));
		Save.click();
	}
	
	@Test(priority=3)
	public void FirstnameNumbers() throws InterruptedException {
		FN.click();
		Thread.sleep(3000);
		//FN.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		driver.switchTo().activeElement().clear();
		
	
		//Thread.sleep(3000);
		
		Thread.sleep(1000);
		String Numbers = "1234567890";
		//WebDriverWait wait = new WebDriverWait(driver, 10); // 10 seconds timeout
		//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(this.FN));
		//element.click();
		FN.click();
		Thread.sleep(3000);
		driver.switchTo().activeElement().sendKeys(Numbers);
		Thread.sleep(2000);
		Save.click();
	}
	@Test(priority=4)
	public void FirstnameSpecial() throws InterruptedException {
		FN.click();
		Thread.sleep(3000);
		driver.switchTo().activeElement().clear();
		Thread.sleep(1000);
		String str = "#$%&()*+-./:;<=>?@[]^_`{|}~";
		FN.click();
		Thread.sleep(3000);
		driver.switchTo().activeElement().sendKeys(str);
		Thread.sleep(2000);
		Save.click();
	}
   @Test(priority=5)
	public void Firstnamespecialchars() throws InterruptedException, IOException {
		FN.click();
		Thread.sleep(3000);
		driver.switchTo().activeElement().clear();
		Thread.sleep(1000);
		String specialchars = "\\,\",'";
		FN.click();
		Thread.sleep(3000);
		driver.switchTo().activeElement().sendKeys(specialchars);
		Thread.sleep(2000);
		Save.click();
		
		String Errormsg = driver.switchTo().activeElement().getText();
		WebElement Errordisplay = driver.findElement(By.name("Input must not contain \\ , '' , '"));
		System.out.println("========================================================================");
		System.out.println("Testcase: To verify enetered specialcracters are not displayed in txtbox");
	
		demo.isdisplayed(Errordisplay, "Input must not contain specialcharcters",test,driver);

	}
    
  @Test(priority=6)
	public void MiddlenameAlphabhets() throws InterruptedException {
    	
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	
		MN=driver.findElement(By.name("Middle Name"));
		//driver.findElement(By.name("Middle Name"));
		//driver.findElement(By.name("Last Name"));
		MN.click();
		String Alphabhets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		driver.switchTo().activeElement().sendKeys(Alphabhets);
		
		Save=driver.findElement(By.name("SAVE"));
		Save.click();
	}
	
	@Test(priority=7)
	public void MiddlenameNumbers() throws InterruptedException {
		MN.click();
		Thread.sleep(3000);
		//FN.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		driver.switchTo().activeElement().clear();
		//Thread.sleep(3000);
		Thread.sleep(1000);
		String Numbers = "1234567890";
		//WebDriverWait wait = new WebDriverWait(driver, 10); // 10 seconds timeout
		//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(this.FN));
		//element.click();
		MN.click();
		Thread.sleep(3000);
		driver.switchTo().activeElement().sendKeys(Numbers);
	
		Thread.sleep(2000);
		Save.click();
	}
	@Test(priority=8)
	public void MiddlenameSpecial() throws InterruptedException {
		MN.click();
		Thread.sleep(3000);
		driver.switchTo().activeElement().clear();
		Thread.sleep(1000);
		String str = "#$%&()*+-./:;<=>?@[]^_`{|}~";
		MN.click();
		Thread.sleep(3000);
		driver.switchTo().activeElement().sendKeys(str);
		Thread.sleep(2000);
		Save.click();
	}
    @Test(priority=9)
	public void Middlespecialchars() throws InterruptedException, IOException {
    	MN.click();
		Thread.sleep(3000);
		driver.switchTo().activeElement().clear();
		Thread.sleep(1000);
		String specialchars = "\\,\",'";
		MN.click();
		Thread.sleep(3000);
		driver.switchTo().activeElement().sendKeys(specialchars);
		Thread.sleep(2000);
		Save.click();
		
		String Errormsg = driver.switchTo().activeElement().getText();
		WebElement Errordisplay = driver.findElement(By.name("Input must not contain \\ , '' , '"));
		System.out.println("========================================================================");
		System.out.println("Testcase: To verify enetered specialcracters are not displayed in txtbox");
		
		demo.isdisplayed(Errordisplay, "Input must not contain specialcharcters",test,driver);

	}
	String Alphabhets;
	
   @Test(priority=10)
   	public void LastnameAlphabhets() throws InterruptedException {
       	
   		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
   	
       	LN  = driver.findElement(By.name("Last Name"));
   		//driver.findElement(By.name("Middle Name"));
   		//driver.findElement(By.name("Last Name"));
       	LN.click();
   		Alphabhets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

   		driver.switchTo().activeElement().sendKeys(Alphabhets);
   		
   		Save=driver.findElement(By.name("SAVE"));
   		Save.click();
   	}
   	
   	@Test(priority=11)
   	public void LastnameNumbers() throws InterruptedException {
   		LN.click();
   		Thread.sleep(3000);
   		//FN.sendKeys(Keys.chord(Keys.CONTROL, "a"));
   		driver.switchTo().activeElement().clear();
   		//Thread.sleep(3000);
   		Thread.sleep(1000);
   		String Numbers = "1234567890";
   		//WebDriverWait wait = new WebDriverWait(driver, 10); // 10 seconds timeout
   		//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(this.FN));
   		//element.click();
   		LN.click();
   		Thread.sleep(3000);
   		driver.switchTo().activeElement().sendKeys(Numbers);
   	
   		Thread.sleep(2000);
   		Save.click();
   	}
  	@Test(priority=12)
   	public void LastnameSpecial() throws InterruptedException {
   		LN.click();
   		Thread.sleep(3000);
   		driver.switchTo().activeElement().clear();
   		Thread.sleep(1000);
   		String str = "#$%&()*+-./:;<=>?@[]^_`{|}~";
   		LN.click();
   		Thread.sleep(3000);
   		driver.switchTo().activeElement().sendKeys(str);
   		Thread.sleep(2000);
   		Save.click();
   	}
       @Test(priority=13)
   	public void Lastspecialchars() throws InterruptedException, IOException {
    	LN.click();
   		Thread.sleep(3000);
   		driver.switchTo().activeElement().clear();
   		Thread.sleep(1000);
   		String specialchars = "\\,\",'";
   		LN.click();
   		Thread.sleep(3000);
   		driver.switchTo().activeElement().sendKeys(specialchars);
   		Thread.sleep(2000);
   		Save.click();
   		
   		String Errormsg = driver.switchTo().activeElement().getText();
   		WebElement Errordisplay = driver.findElement(By.name("Input must not contain \\ , '' , '"));
   		System.out.println("========================================================================");
   		System.out.println("Testcase: To verify enetered specialcracters are not displayed in txtbox");
   		
   		demo.isdisplayed(Errordisplay, "Input must not contain specialcharcters",test,driver);

   	}

  @Test(priority = 14)
   	public void MergeName() throws InterruptedException {
   	    FN = driver.findElement(By.name("First Name"));
   	    MN = driver.findElement(By.name("Middle Name"));
   	    LN = driver.findElement(By.name("Last Name"));
   	    Save = driver.findElement(By.name("SAVE"));

   	    Scanner scan = new Scanner(System.in);
   	    System.out.println("Enter the firstName:");
   	    String Firstname = scan.nextLine();
   	    FN.click();
   	    FN.clear();
   	    driver.switchTo().activeElement().sendKeys(Firstname);

   	    System.out.println("Enter the MiddleName:");
   	    String Middlename = scan.nextLine();
   	    MN.click();
   	    MN.clear();
   	    driver.switchTo().activeElement().sendKeys(Middlename);

   	    System.out.println("Enter the LastName:");
   	    String Lastname = scan.nextLine();
   	    LN.click();
   	    LN.clear();
   	    driver.switchTo().activeElement().sendKeys(Lastname);

   	    String Final = Firstname.concat(Middlename).concat(Lastname);

   	    if (Final.length() > 62) {
   	        int Firsttext = Firstname.length();
   	        int Secondtext = Middlename.length();
   	        int Lasttext = Lastname.length();

   	        String[] expectedTexts = {
   	            "Maximum Name length:62" + ",Count: " + Firsttext,
   	            "djhgdjhd",
   	            "Maximum Name length:62" + ",Count: " + Secondtext,
   	            "jhjgdjhdd",
   	            "Maximum Name length:62" + ",Count: " + Lasttext,
   	            "shjgsjhgshs"
   	        };

   	        Save.click();
   	        Thread.sleep(2000);

   	        By locator = By.xpath("//Text[contains(@Name, 'Maximum Name length:62') and contains(@Name, ',Count:')]");
   	        List<WebElement> elements = driver.findElements(locator);
   	        String[] actualTexts = new String[elements.size()];

   	        int iterations = Math.max(expectedTexts.length, actualTexts.length);
   	        
   	        for (int i = 0; i < iterations; i++) {
   	            WebElement element = elements.get(i);
   	            actualTexts[i] = element.getText();

   	            System.out.println("Actual Text: " + actualTexts[i]);
   	            System.out.println("Expected Text: " + expectedTexts[i]);
   	                if (actualTexts[i].contains(expectedTexts[i])) {
   	                    System.out.println("Text match for element " + (i + 1));
   	                } else {
   	                    System.out.println("Text mismatch for element " + (i + 1));
   	                }
   	                i=i+1;
   	            }
   	        }
   	    }
  
  
  public  void DateofBirth() throws InterruptedException
	{
		driver.findElement(By.name("Show Calendar")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("May, 2023")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("2023")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("2021")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("Jan")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("27")).click();
		
	}
  
  WebElement bloodGroup;
  WebElement bloodGroup1;
  WebElement bloodGroup2;
  WebElement bloodGroup3;
  WebElement bloodGroup4;
  WebElement bloodGroup5;
  WebElement bloodGroup6;
  WebElement bloodGroup7;
  WebElement bloodGroup8;
  String Exceptedbloodgroup1;
  String Exceptedbloodgroup2;
  String Exceptedbloodgroup3;
  String Exceptedbloodgroup4;
  String Exceptedbloodgroup5;
  String Exceptedbloodgroup6;
  String Exceptedbloodgroup7;
  String Exceptedbloodgroup8;
  
  @Test(priority = 15)
public void bloodgroup() throws InterruptedException
{
	bloodGroup=driver.findElement(By.name("Blood Group"));
	bloodGroup.click();
	
	Thread.sleep(1000);
	bloodGroup1 = driver.findElement(By.name("A+ve"));
	bloodGroup2 = driver.findElement(By.name("A-ve"));
	bloodGroup3 = driver.findElement(By.name("O+ve"));
	bloodGroup4 = driver.findElement(By.name("O-ve"));
	bloodGroup5 = driver.findElement(By.name("AB+ve"));
	bloodGroup6 = driver.findElement(By.name("AB-ve"));
	bloodGroup7 = driver.findElement(By.name("B+ve"));
	bloodGroup8 = driver.findElement(By.name("B-ve"));
	
   Exceptedbloodgroup1="A+ve";
   Exceptedbloodgroup2="A-ve";
   Exceptedbloodgroup3="O+ve";
   Exceptedbloodgroup4="O-ve";
   Exceptedbloodgroup5="AB+ve";
   Exceptedbloodgroup6="AB-ve";
   Exceptedbloodgroup7="B+ve";
   Exceptedbloodgroup8="B-ve";
	

	
}
 @Test(priority = 16)
public void bloodgroupselection() throws InterruptedException
{
	bloodgroupclick(bloodGroup1,"A+ve");
	//By locator = By.xpath("//Text[contains(@Name, 'A+ve')]");
	//WebElement Firstgroup = driver.findElement(locator);
	
	SoftAssert softAssert = new SoftAssert();
	softAssert.assertEquals(bloodGroup1.getText(),Exceptedbloodgroup1);
	Thread.sleep(2000);
	bloodgroupclick(bloodGroup2,"A-ve");
	softAssert.assertEquals(bloodGroup2.getText(),Exceptedbloodgroup2);
	Thread.sleep(2000);
	bloodgroupclick(bloodGroup3,"O+ve");
	softAssert.assertEquals(bloodGroup3.getText(),Exceptedbloodgroup3);
	Thread.sleep(2000);
	bloodgroupclick(bloodGroup4,"O-ve");
	softAssert.assertEquals(bloodGroup4.getText(),Exceptedbloodgroup4);
	Thread.sleep(2000);
	bloodgroupclick(bloodGroup5,"AB+ve");
	softAssert.assertEquals(bloodGroup5.getText(),Exceptedbloodgroup5);
	Thread.sleep(2000);
	bloodgroupclick(bloodGroup6,"AB-ve");
	softAssert.assertEquals(bloodGroup6.getText(),Exceptedbloodgroup6);
	Thread.sleep(2000);
	bloodgroupclick(bloodGroup7,"B+ve");
	softAssert.assertEquals(bloodGroup7.getText(),Exceptedbloodgroup7);
	Thread.sleep(2000);
	bloodgroupclick(bloodGroup8,"B-ve");
	softAssert.assertEquals(bloodGroup8.getText(),Exceptedbloodgroup8);
	softAssert.assertAll();
}
  
public void bloodgroupclick(WebElement elementToDateofBirth, String text)
{
	bloodGroup.click();
	Actions actions = new Actions(driver);
	actions.doubleClick(elementToDateofBirth).perform();
    	
}
@Test(priority = 17)
public  void GenderButton() throws InterruptedException
{
	WebElement MaleradioButton = driver.findElement(By.name("Male"));
	System.out.println("1.To verify By default Male radio button is not selected");
	isselected(MaleradioButton,"Male");
	Thread.sleep(2000);
	GenderClick(MaleradioButton);
	

	System.out.println("2. To verify the Male radio button is selected");
	isselectedClick(MaleradioButton,"Male");
	
	
	WebElement FemaleradioButton = driver.findElement(By.name("Female"));
	System.out.println("1.To verify By default Female radio button is not selected");
	isselected(FemaleradioButton,"Female");
	GenderClick(FemaleradioButton);
	

	System.out.println("2. To verify the Female radio button is selected");
	isselectedClick(FemaleradioButton,"Female");
	
	WebElement OtherradioButton = driver.findElement(By.name("Others"));
	
	System.out.println("1.To verify By default Others radio button is not selected");
	isselected(OtherradioButton,"Others");
	GenderClick(OtherradioButton);
	

	System.out.println("2. To verify the Others radio button is selected");
	isselectedClick(OtherradioButton,"Others");	 		
}
public  void isselected(WebElement GenderradioButton, String GenderName)
{


 if (!GenderradioButton.isSelected())
 {
      System.out.println("Run Pass: By default " +GenderName+" radio button is not selected");     
 }
 else
 {
	 System.out.println("Run Fail: By default  " +GenderName+" radio button is selected");
 }
}

public  void isselectedClick(WebElement GenderradioButton, String GenderName)
{

 if (GenderradioButton.isSelected())
 {
      System.out.println("Run Pass: " +GenderName+" radio button is selected"); 
      
 }
 else
 {
	 System.out.println("Run Fail:  " +GenderName+" radio button is not selected");
 }
}
public  void GenderClick(WebElement clickradioButton) throws InterruptedException
{
clickradioButton.click();
Thread.sleep(2000);
}
WebElement dropdownElement;
WebElement Pediatric;
WebElement Small;
WebElement Medium;
WebElement Large;
String ExceptedPediatric;
String ExceptedSmall;
String ExceptedMedium;
String ExceptedLarge;

@Test(priority = 18)
public void patientSize() throws InterruptedException
{
	dropdownElement=driver.findElement(By.name("Patient Size"));
	dropdownElement.click();
	
	Pediatric = driver.findElement(By.name("Pediatric"));
	Small = driver.findElement(By.name("Small"));
	Medium = driver.findElement(By.name("Medium"));
	Large = driver.findElement(By.name("Large"));
	
	   ExceptedPediatric="Pediatric";
	   ExceptedSmall="Small";
	   ExceptedMedium="Medium";
	   ExceptedLarge="Large";
	   
}

@Test(priority = 19)
public void patientSizeSelection() throws InterruptedException
{
	
	patientsizeclick(Pediatric,"Pediatric");
	SoftAssert softAssert = new SoftAssert();
	softAssert.assertEquals(Pediatric.getText(),Pediatric);
	Thread.sleep(2000);
	
	patientsizeclick(Small,"Small");
	softAssert.assertEquals(Small.getText(),ExceptedSmall);
	Thread.sleep(2000);
	patientsizeclick(Medium,"Medium");
	softAssert.assertEquals(Medium.getText(),ExceptedMedium);
	Thread.sleep(2000);
	patientsizeclick(Large,"Large");
	softAssert.assertEquals(Large.getText(),Large);
	Thread.sleep(2000);
	softAssert.assertAll();
}


public void patientsizeclick(WebElement Patientsize, String text)
{
	dropdownElement.click();
	Actions actions = new Actions(driver);
	actions.doubleClick(Patientsize).perform();  	
}


@Test(priority = 20)
public void Weight() throws InterruptedException
{

	WebElement WeightElement=driver.findElement(By.name("Patient Weight (kg)"));
	WeightElement.click();
	Thread.sleep(2000);
	System.out.println("1. To verify the Weight Textfield is not accepting alphabhets");
	String Alphabhets="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	acceptElements(Alphabhets);

	System.out.println("2. To verify the Weight Textfield is not accepting specialcharcters");
	String Specialchars="(*((&*&*^&^&%^&%^_)_()";
	acceptElements(Specialchars);
	
	System.out.println("3. To verify the Weight textfield displaying error message when entered range is min 0 to max 301");
	acceptvalidRange();
}
public void acceptElements(String Element) throws InterruptedException
{
	
	WebElement TextElement=driver.switchTo().activeElement();
	TextElement.sendKeys(Element);
	String enteredValue = driver.switchTo().activeElement().getText();
	Thread.sleep(1000);
	System.out.println(enteredValue);
    if (enteredValue.equals(Element)) {
    	
      System.out.println("Test failed: The text field accepted the entered "+Element);
   } else {
       System.out.println("Test passed: The text field did not accept the entered "+Element);
       
   }
    
		
}
@Test(priority = 21)
public void acceptvalidRange() throws InterruptedException
{
	
	String Numbers="0";
	WebElement TextElement=driver.switchTo().activeElement();
	TextElement.sendKeys(Numbers);
	
	String enteredValue = driver.switchTo().activeElement().getText();
	Thread.sleep(1000);
	WebElement Text=driver.findElement(By.name("Range:[1 to 300]"));
	System.out.println("4. To verify if enetred number is 0, Error message is displaying");
	textisDisplayed(Text);
    TextElement.clear();
    Thread.sleep(4000);
    
	String Nextnumber="301";
	WebElement NextElement=driver.switchTo().activeElement();
	System.out.println("5. To verify if enetred number is 301, Error message is displaying");
	NextElement.sendKeys(Nextnumber);
	textisDisplayed(Text);
	 TextElement.clear();
	 
	 String Correctnumber="300";
	 WebElement CorrectElement=driver.switchTo().activeElement();
	 CorrectElement.sendKeys(Correctnumber);
	 Thread.sleep(2000);
}
public  void textisDisplayed(WebElement Element) throws InterruptedException
{
	 if (Element.isDisplayed())
	 {
          System.out.println("Test Pass: Error message is displaying.");
          
       } 
	 else
       {
           System.out.println("Test Fail : Error message is not displaying."); 
       }
	  
}
@Test(priority = 22)
public  void Nationality() throws InterruptedException
{
	
	WebElement Text=driver.findElement(By.name("Nationality"));
	Text.click();
	WebElement NextElement=driver.switchTo().activeElement();
	NextElement.sendKeys("Indian");
}

@Test(priority = 23)
public  void LanguagesKnow() throws InterruptedException
{
	WebElement Languages=driver.findElement(By.name("Languages Known"));
	Languages.click();
	WebElement LanguagesKnown=driver.switchTo().activeElement();
	LanguagesKnown.sendKeys("Kannada,English, Hindi");
}
@Test(priority = 24)
public void IDtype()  throws InterruptedException
{
	WebElement IDtypename=driver.findElement(By.name("ID Type"));
	IDtypename.click();
	WebElement IDtypedata=driver.switchTo().activeElement();
	IDtypedata.sendKeys("Ahdhar");
}
@Test(priority = 25)
public void IDNumber(WebDriver driver)  throws InterruptedException
{
	WebElement IDNumbername=driver.findElement(By.name("ID Number"));
	IDNumbername.click();
	WebElement IDNumberdata=driver.switchTo().activeElement();
	 IDNumberdata.sendKeys("Ahdhar");
}
@Test(priority = 26)
public void Remarks()  throws InterruptedException
{
	WebElement Remarksname=driver.findElement(By.name("Remarks"));
	Remarksname.click();
	WebElement Remarksnamedata=driver.switchTo().activeElement();
	Remarksnamedata.sendKeys("Details of patient details ");
}
@Test(priority = 27)
public void contactDetails() {
	
	System.out.println(" =========Contact details==============");	
}

@Test(priority = 28)
public void phoneNumber() throws InterruptedException
{
	WebElement phoneNumber=driver.findElement(By.name("Phone Number"));
	Thread.sleep(1000);
	phoneNumber.click();
	Thread.sleep(3000);
	WebElement phoneNumberdata=driver.switchTo().activeElement();
	
	phoneNumberdata.sendKeys("jdhdhgh^&^&%^&%^%^");
	Savebutton();
	By locator = By.xpath("//Text[contains(@Name, 'Input must contain only')]");
    WebElement PhoneNumbererror=driver.findElement(locator);
    String str=PhoneNumbererror.getText();
	String str1="Input must contain only + - ( ) and numbers";
	
	if(str.equals(str1))
	{
		System.out.println("Run Pass: Error meessage Excepted is:"+str1+"Actual is:"+str);
	}
	else
	{
		System.out.println("Run Fail: Error meessage Excepted is:"+str1+"Actual is:"+str1);
	}
	phoneNumberdata.clear();
	phoneNumberdata.sendKeys("9273988369");
	Thread.sleep(3000);
	Savebutton();
}
@Test(priority = 29)
public void AlternateNumber() throws InterruptedException
{
	WebElement AlternateNumber=driver.findElement(By.name("Alternate Number"));
	AlternateNumber.click();
	Thread.sleep(2000);
	WebElement phoneNumberdata=driver.switchTo().activeElement();
	
	phoneNumberdata.sendKeys("jdhdhgh^&^&%^&%^%^");
	Savebutton();
	By locator = By.xpath("//Text[contains(@Name, 'Input must contain only')]");
    WebElement PhoneNumbererror=driver.findElement(locator);
    String str=PhoneNumbererror.getText();
	String str1="Input must contain only + - ( ) and numbers";
	if(str.equals(str1))
	{
		System.out.println("Run Pass: Error meessage Excepted is: "+str1+" Actual is: "+str);
	}
	else
	{
		System.out.println("Run Fail: Error meessage Excepted is: "+str1+" Actual is: "+str);
	}
	phoneNumberdata.clear();
	phoneNumberdata.sendKeys("9273988369");
	Thread.sleep(2000);
	Savebutton();
	
}
@Test(priority = 30)
public void CurrentAddress() throws InterruptedException
{
	By locator = By.xpath("//Text[@Name='Address']");
	List<WebElement> elements = driver.findElements(locator);
	Thread.sleep(5000);

	int desiredIndex = 2; // Index 10 corresponds to the 11th element
	if (desiredIndex < elements.size()) {
		Thread.sleep(5000);
	    WebElement element = elements.get(desiredIndex);
	    element.click();
	    Thread.sleep(5000);
	    driver.switchTo().activeElement().sendKeys("#123 4th block panacea medical technologies malur");
		Savebutton();
	} 
	else 
	{
	    System.out.println("Element not found or insufficient elements matching the criteria.");
	}
}

@Test(priority = 31)
public void Region() throws InterruptedException
{
	WebElement Region=driver.findElement(By.name("Region"));
	Region.click();
	Thread.sleep(2000);
	WebElement Regiondata=driver.switchTo().activeElement();
	Regiondata.clear();
	Regiondata.sendKeys("Indian,Cristhan");
	Thread.sleep(2000);
	Savebutton();
}

@Test(priority = 32)
public void Zipcode() throws InterruptedException
{
	WebElement Zipcode=driver.findElement(By.name("Zip Code"));
	Zipcode.click();
	Thread.sleep(2000);
	WebElement Zipcodedata=driver.switchTo().activeElement();
	Zipcodedata.clear();
	Zipcodedata.sendKeys("564001");
	Thread.sleep(2000);

}
@Test(priority = 33)
public void PernamentAddress() throws InterruptedException
{
	By locator = By.xpath("//Text[@Name='Address']");
	List<WebElement> elements = driver.findElements(locator);
	Thread.sleep(5000);

	int desiredIndex = 5; // Index 10 corresponds to the 11th element
	if (desiredIndex < elements.size()) {
		Thread.sleep(5000);
	    WebElement element = elements.get(desiredIndex);
	    element.click();
	    Thread.sleep(5000);
	    driver.switchTo().activeElement().sendKeys("#123 4th block Panacea medical technologies");
		Savebutton();
	} 
	else 
	{
	    System.out.println("Element not found or insufficient elements matching the criteria.");
	
	}
}

@Test(priority = 34)
public  void PernamentCountry() throws InterruptedException
{
	By locator = By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"DemographicsMainView\"]/Custom[@ClassName=\"DemographicsSection5View\"]/ComboBox[@AutomationId=\"ComboBoxViewModelPermanentCountryGroup\"]");
	WebElement Country=driver.findElement(locator);
	Country.click();
	Thread.sleep(2000);
	WebElement Countryname=driver.findElement(By.name("India"));
	Actions actions = new Actions(driver);
	actions.doubleClick(Countryname).perform();
	System.out.println(Country.getText());	
}

@Test(priority = 33)
public void CurrentCountry() throws InterruptedException
{
	WebElement pernamentCountry=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"DemographicsMainView\"]/Custom[@ClassName=\"DemographicsSection5View\"]/ComboBox[@AutomationId=\"ComboBoxViewModelCurrentCountryGroup\"]"));
	pernamentCountry.click();
	Thread.sleep(2000);
	WebElement Countryname=driver.findElement(By.name("India"));
	Actions actions = new Actions(driver);
	actions.doubleClick(Countryname).perform();
	System.out.println(pernamentCountry.getText());



}
WebElement Caretakername;
Actions actions;
@Test(priority=39)
public void CaretakerNameSpecialchars() throws InterruptedException, IOException {
	
	actions=new Actions(driver);
	Caretakername=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"DemographicsMainView\"]/Custom[@ClassName=\"DemographicsSection2View\"]/Edit[@AutomationId=\"TextBoxViewModelCaretakerName\"]"));
	//actions.moveToElement(Caretakername).click();
	Caretakername.click();
	Thread.sleep(3000);
	
	String specialchars = "\\,\",'";
	Caretakername.click();
	Thread.sleep(3000);
	driver.switchTo().activeElement().sendKeys(specialchars);
	Thread.sleep(2000);
	Save.click();
	
	String Errormsg = driver.switchTo().activeElement().getText();
	WebElement Errordisplay = driver.findElement(By.name("Input must not contain \\ , '' , '"));
	System.out.println("========================================================================");
	System.out.println("Testcase: To verify enetered specialcracters are not displayed in txtbox");
	
	demo.isdisplayed(Errordisplay, "Input must not contain specialcharcters",test,driver);

}

@Test(priority=40)
public void CaretakerNameNumbers() throws InterruptedException {
	Thread.sleep(3000);
	Caretakername.click();
	Thread.sleep(3000);
	driver.switchTo().activeElement().clear();
	Thread.sleep(1000);
	String Numbers = "1234567890";
	Caretakername.click();
	Thread.sleep(3000);
	driver.switchTo().activeElement().sendKeys(Numbers);
	Thread.sleep(2000);
	Save.click();
	Thread.sleep(3000);
	Caretakername.clear();
}
@Test(priority=41)
public void CaretakerNameSpecial() throws InterruptedException {
	Caretakername.click();
	Thread.sleep(3000);
	driver.switchTo().activeElement().clear();
	Thread.sleep(1000);
	String str = "#$%&()*+-./:;<=>?@[]^_`{|}~";
	Caretakername.click();
	Thread.sleep(3000);
	driver.switchTo().activeElement().sendKeys(str);
	Thread.sleep(2000);
	Save.click();
	Thread.sleep(3000);
	Caretakername.clear();
}
@Test(priority=42)
public void CaretakerNameChars() throws InterruptedException {
	actions.doubleClick(Caretakername).perform();
	Thread.sleep(3000);
	Caretakername.click();
	Thread.sleep(3000);
	driver.switchTo().activeElement().clear();
	Thread.sleep(1000);
	String Alphabhets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	driver.switchTo().activeElement().sendKeys(Alphabhets);
	Thread.sleep(3000);
	Save=driver.findElement(By.name("SAVE"));
	Save.click();
	Thread.sleep(3000);
	Caretakername.clear();
	
}
@Test(priority=43)
public void careTakerContactNumber() throws InterruptedException
{
	WebElement ContactNumber=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"DemographicsMainView\"]/Custom[@ClassName=\"DemographicsSection2View\"]/Edit[@AutomationId=\"TextBoxViewModelCtContactNum\"]"));
	Thread.sleep(1000);
	ContactNumber.click();
	Thread.sleep(3000);
	WebElement ContactNumberdata=driver.switchTo().activeElement();
	
	ContactNumber.sendKeys("jdhdhgh^&^&%^&%^%^");
	Savebutton();
	By locator = By.xpath("//Text[contains(@Name, 'Input must contain only')]");
    WebElement ContactNumbererror=driver.findElement(locator);
    String str=ContactNumbererror.getText();
	String str1="Input must contain only + - ( ) and numbers";
	
	if(str.equals(str1))
	{
		System.out.println("Run Pass: Error meessage Excepted is:"+str1+"Actual is:"+str);
	}
	else
	{
		System.out.println("Run Fail: Error meessage Excepted is:"+str1+"Actual is:"+str1);
	}
	ContactNumberdata.clear();
	ContactNumberdata.sendKeys("9273988369");
	Thread.sleep(3000);
	Savebutton();
}
@Test(priority=44)
public void CaretakerAddress() throws InterruptedException
{
	By locator = By.xpath("//Text[@Name='Address']");
	List<WebElement> elements = driver.findElements(locator);
	Thread.sleep(5000);

	int desiredIndex = 1; // Index 10 corresponds to the 11th element
	if (desiredIndex < elements.size()) {
		Thread.sleep(5000);
	    WebElement element = elements.get(desiredIndex);
	    element.click();
	    Thread.sleep(5000);
	    driver.switchTo().activeElement().sendKeys("#123 4th block Panacea medical technologies");
		Savebutton();
	} 
	else 
	{
	    System.out.println("Element not found or insufficient elements matching the criteria.");
	
	}
}
@Test(priority=45)
public void careTakerRelationship() throws InterruptedException
{
	WebElement Relationship=driver.findElement(By.name("Relationship"));
	Relationship.click();
	Thread.sleep(3000);
	WebElement Relationshipdata=driver.switchTo().activeElement();
	Relationshipdata.sendKeys("Brother");

}
public void Savebutton()
{
	WebElement Save=driver.findElement(By.name("SAVE"));
	Save.click();
}




}









   	
