package com.krystal.project;

import java.io.IOException;
import java.net.URL;
import java.security.SecureRandom;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.function.Supplier;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.WindowsElement;

public class ReferencefileChemotheraphy {
	public ExtentReports extent;
	public ExtentTest test;
	public ExtentTest subtest;
	public static int testCaseCount = 1;
	public  WindowsDriver<WebElement> driver;
	 


	public void setUp1()  throws InterruptedException, IOException {
		DesiredCapabilities appCapabilities = new DesiredCapabilities();
		appCapabilities.setCapability("app", "C:\\Program Files\\Panacea Medical Technologies\\Krystal\\Krystal.exe");
		driver = new WindowsDriver<WebElement>(new URL("http://127.0.0.1:4723"), appCapabilities);
		

		}
	public String guiTestCaseName() throws IOException {
	    return "STC_GUI_" + String.format("%02d", testCaseCount++);
	}
	public String funTestCaseName() throws IOException {
	    return "STC_FUN_" + String.format("%02d", testCaseCount++);
	}
	
	public String dataTestCaseName() throws IOException {
	    return "STC_DAT_" + String.format("%02d", testCaseCount++);
	}
	public String guiSubTestCaseName() throws IOException {
	    double subTestCaseCount = Double.parseDouble(guiTestCaseName().replace("STC_GUI_", "")) - 1 + 0.01;
	    return "STC_GUI_" + String.format("%.2f", subTestCaseCount);
	}
	
	public String funSubTestCaseName() throws IOException {
	    double subTestCaseCount = testCaseCount + 0.01;
	    return "STC_FUN_" + String.format("%.2f", subTestCaseCount);
	}
		
	@BeforeClass
		public void setUp() {
			extent = ExtendManager.getInstance();
		}
		
	DemographicsExternal demo=new DemographicsExternal() ;
	
	
	WebElement Savebutton;
	public void save() throws InterruptedException
	{
	    Savebutton = driver.findElement(By.name("SAVE"));
		Savebutton.click();
	}
	
		
	public void configsavepopup()
	{
		try {
			Savebutton.click();
			Thread.sleep(2000);
			String mainWindowHandle = driver.getWindowHandle();
		    Set<String> windowHandles = driver.getWindowHandles();
		    for (String handle : windowHandles) {
		        if (!handle.equals(mainWindowHandle)) {
		            driver.switchTo().window(handle);
		            test = extent.createTest(guiTestCaseName()+" To verify save popup titlename");
		            WebElement ToleranceSave=driver.findElement(By.name("Classification Configuration"));
		            demo.Textcomparsion(ToleranceSave, "Classification Configuration", test,driver);
		            WebElement ToleranceSavedescription=driver.findElement(By.name("Classification data saved."));
		            test = extent.createTest(guiTestCaseName()+" To verify save popup description");
		            demo.Textcomparsion(ToleranceSavedescription, "Classification data saved.", test,driver);
		            test = extent.createTest(guiTestCaseName()+" To verify save popup ok button");
		            WebElement OK=driver.findElement(By.name("OK"));
		            demo.Textcomparsion(OK, "OK", test,driver);
		        	OK.click();	
		        	Thread.sleep(2000);
		            }
		            break; 
		        }
		    
		    driver.switchTo().window(mainWindowHandle);	
		}
		catch(Exception e)
		{
			test.fail("Save pop-up is not displayed");
		}
	}
	

	

	
	public final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&_*()";
	public  String generateRandomString(int i) {
	    SecureRandom random = new SecureRandom();
	    int length = random.nextInt(i) + 1; 

	    StringBuilder sb = new StringBuilder(length);
	    for (i = 3; i < length; i++) {
	        int index = random.nextInt(CHARACTERS.length());
	        sb.append(CHARACTERS.charAt(index));
	    }
	    return sb.toString();
	}
	String randomString ;
	public void randomstringtext(int j) {
    randomString = generateRandomString(j);  
	}
	
	
	public final String AlphaUpperLowercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz ";
	public  String generateRandomAlpha(int i) {
	    SecureRandom random = new SecureRandom();
	    int length = random.nextInt(i) + 3; 

	    StringBuilder sb = new StringBuilder(length);
	    for (i = 0; i < length; i++) {
	        int index = random.nextInt(AlphaUpperLowercase.length());
	        sb.append(AlphaUpperLowercase.charAt(index));
	    }
	    return sb.toString();
	}
	String randomStringalpha;
	public void randomalpha(int j) {
    randomStringalpha = generateRandomAlpha(j);  
	}
	
	
	public final String Uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
	public  String generateUpper(int i) {
	    SecureRandom random = new SecureRandom();
	    int length = random.nextInt(i) + 1; 

	    StringBuilder sb = new StringBuilder(length);
	    for (i = 0; i < length; i++) {
	        int index = random.nextInt(Uppercase.length());
	        sb.append(Uppercase.charAt(index));
	    }
	    return sb.toString();
	}
	String randomStringUpper;
	public void randomUpper(int j) {
	randomStringUpper = generateUpper(j);  
	}
	
	
	
	public final String Lowercase = "abcdefghijklmnopqrstuvwxyz ";
	public  String generateLower(int i) {
	    SecureRandom random = new SecureRandom();
	    int length = random.nextInt(i) + 1; 

	    StringBuilder sb = new StringBuilder(length);
	    for (i = 0; i < length; i++) {
	        int index = random.nextInt(Lowercase.length());
	        sb.append(Lowercase.charAt(index));
	    }
	    return sb.toString();
	}
	String randomStringLower;
	public void randomLower(int j) {
    randomStringLower = generateLower(j);  
	}
	
	public final String Numbers = "0123456789 ";
	public  String generateNumber(int i) {
	    SecureRandom random = new SecureRandom();
	    int length = random.nextInt(i) + 1; 

	    StringBuilder sb = new StringBuilder(length);
	    for (i = 0; i < length; i++) {
	        int index = random.nextInt(Numbers.length());
	        sb.append(Numbers.charAt(index));
	    }
	    return sb.toString();
	}
	String randomStringNumber;
	public void randomNumber(int j) {
    randomStringNumber = generateNumber(j);  
	}
	
	
	
	public  final String CharOutOfRange = "!@#$%^&_*() ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&_*() abcdefghijklmnopqrstuvwxyz!@#$%^&_*() 0123456789!@#$%^&_*()";

    public  String generateCharOutOfRange(int i) {
        SecureRandom random = new SecureRandom();
        int length = random.nextInt(i) + 3;

        StringBuilder sb = new StringBuilder(length);
        for (i = 0; i < length; i++) {
            int index = random.nextInt(CharOutOfRange.length());
            sb.append(CharOutOfRange.charAt(index));
        }
        return sb.toString();
    }
    String randomcharString;
	public void randomCharOutOfRange(int j) {
       randomcharString = generateCharOutOfRange(j);  
    }
	int randomNumber;
	public void randomrange()
	{
		Random random = new Random();
        randomNumber = random.nextInt(10) + 1;
	}
	   String selectedOption;
	public void randomstring()
	{
		Random random = new Random();
        int randomNumber = random.nextInt(2);
        String[] options = {"Yes", "No"};
        selectedOption = options[randomNumber];
	}
	
	public void randomdose()
	{
		Random random = new Random();
        int randomNumber = random.nextInt(3);
        String[] options = {"mL", "mg", "g"};
        selectedOption = options[randomNumber];
	}
	
	  int randomNumber1;
	  double randomDecimal;
	  String randomNumber1String;
	  String randomNumber2String;
	   String selectedOption1;
	   
	   public void randomdecimalnumber() {
		    Random random = new Random();
		    int randomNumber1 = random.nextInt(9000) + 1000;
		    String randomNumber1String = String.valueOf(randomNumber1);
		    DecimalFormat decimalFormat = new DecimalFormat("#.00");
		    double randomDecimal = Double.parseDouble(decimalFormat.format(random.nextDouble() * 9000 + 1000));
		    String randomDecimalString = String.valueOf(randomDecimal);
		    
		    int randomNumber = random.nextInt(2);
		    String[] options = {randomNumber1String, randomDecimalString};
		    selectedOption1 = options[randomNumber];
		}
	   
	   String randomStringmix;
	   
	   public void RandomStringGeneartor()
	   {
		   int minLength = 3;
	        int maxLength = 24;
	        
	        randomStringmix = generateRandomString(minLength, maxLength);
	   }
	   
	   
	   public static String generateRandomString(int minLength, int maxLength) {
	        Random random = new Random();
	        int length = random.nextInt(maxLength - minLength + 1) + minLength;
	        
	        StringBuilder result = new StringBuilder();
	        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	        
	        for (int i = 0; i < length; i++) {
	            int index = random.nextInt(characters.length());
	            result.append(characters.charAt(index));
	        }
	        
	        return result.toString();
	    }  
	   
	   
	   
	
	
	
	WebElement SiteName;
	public void ValidataUpper(String Text) throws IOException, InterruptedException 
	{
		 test = extent.createTest(funTestCaseName() +Text+" textbox is accepting the Uppercase letters");
		 SiteName = driver.findElement(By.name(Text));
		 validatachars(SiteName,randomStringUpper,driver);
	}

	public void ValidataLower(String Text) throws IOException, InterruptedException 
	{
		 test = extent.createTest(funTestCaseName() +Text+" textbox is accepting the Lowercase letters");
		 SiteName = driver.findElement(By.name(Text));
		 validatachars(SiteName,randomStringLower,driver);
	}

	public void ValidataUpperLower(String Text) throws IOException, InterruptedException 
	{
		 test = extent.createTest(funTestCaseName() +Text+" textbox is accepting the Upper and Lowercase letters");
		 SiteName = driver.findElement(By.name(Text));
		 validatachars(SiteName,randomStringalpha,driver);
	}
	public void ValidataNumber(String Text) throws IOException, InterruptedException 
	{
		 test = extent.createTest(funTestCaseName() +Text+" textbox is accepting the Numbers");
		 SiteName = driver.findElement(By.name(Text));
		 validatachars(SiteName,randomStringNumber,driver);
	}
	public void Validatachars(String Text) throws IOException, InterruptedException 
	{
		 test = extent.createTest(funTestCaseName() +Text+" textbox is accepting the Alpha,numbers, specialchars,and spaces");
		 SiteName = driver.findElement(By.name(Text));
		 validatachars(SiteName,randomString,driver);
	}
	public void InValidataRange(String Text) throws IOException, InterruptedException 
	{
		 test = extent.createTest(funTestCaseName() +Text+" textbox is not accepting range if above 40");
		 randomCharOutOfRange(15);
		 SiteName = driver.findElement(By.name(Text));
		 Thread.sleep(1000);
		 Invalidrange(SiteName,randomcharString,driver);
	}
	public void InValidatachars(String Text) throws IOException
	{
		 test = extent.createTest(funTestCaseName() +Text+" textbox is not accepting specialchars");
		 SiteName = driver.findElement(By.name(Text));
		 Invalidrange(SiteName,randomString,driver);
	}
	public void InValidataspecialchars(String Text) throws IOException
	{
		 test = extent.createTest(funTestCaseName() +Text+" textbox is not accepting specialchars and displaying error message");
		 SiteName = driver.findElement(By.name(Text));
		 Specialchar(SiteName,randomString,driver);
		 test = extent.createTest(funTestCaseName() +Text+" save button disabled when enter the specialchars");
		 demo.BydefaultisEnabled(Savebutton,"SAVE", test,driver);
		 driver.switchTo().activeElement().clear();
	}
	
	public void Invalidataspecialchars(String Text) throws IOException, InterruptedException
	{
		 test = extent.createTest(funTestCaseName() +Text+" textbox is not accepting specialchars and displaying error message");
		 SiteName = driver.findElement(By.name(Text));
		 Specialcharenable(Text,driver);
	}
	
	public void Invalidatachars(WebElement element) throws IOException
	{
		 test = extent.createTest(funTestCaseName() +element.getText()+" textbox is not accepting specialchars and displaying error message");
		 Specialchar(element,"Text",driver);
	}
	public void validatachars(WebElement Validdatachars, String Text, WebDriver driver) throws IOException, InterruptedException
	{
		Validdata(Validdatachars,Text,driver);
	}

	public void Invalidrange(WebElement Validdatachars, String Text, WebDriver driver) throws IOException
	{
		ValiddataRange(Validdatachars,Text,driver);
	}
	public void Validdata(WebElement Name, String Text,WebDriver driver) throws IOException, InterruptedException
	{
		Name.click();
		driver.switchTo().activeElement().sendKeys(Text);
		Thread.sleep(1000);
		demo.isdisplayed(Name,Text,test,driver);
	}
	
	public void Validdatachemo(WebElement Name, String Text,WebDriver driver,ExtentTest test) throws IOException, InterruptedException
	{
		Name.click();
		driver.switchTo().activeElement().sendKeys(Text);
		demo.isdisplayed(Name,Text,test,driver);
	}
	
	public void Validdataname(WebElement Name, String Text,WebDriver driver) throws IOException, InterruptedException
	{
		Name.click();
		driver.switchTo().activeElement().sendKeys(Text);
	}

	public void Specialchar(WebElement InValiddatachars, String Text, WebDriver driver) throws IOException
	{
		InValiddatachars.click();
		driver.switchTo().activeElement().sendKeys("\\,");
		WebElement Specialchars=driver.findElement(By.name("Input must not contain \\ , '' , '"));
		demo.isdisplayed(Specialchars, "Input must not contain \\ , '' , '", test,driver);
		//demo.ByValidErrormessage(Specialchars, "Input must not contain \\ , '' , '", test,driver);
	}
	
	public void Specialcharenable(String Text,WebDriver driver) throws IOException, InterruptedException
	{
		test = extent.createTest(funTestCaseName()+" To verify the "+Text+" textbox is not accepting specialchars and displaying error message");
		WebElement DesignationName = driver.findElement(By.name(Text));
		DesignationName.click();
		driver.switchTo().activeElement().sendKeys("\\,");
		save();
		WebElement Specialchars=driver.findElement(By.name("Input must not contain \\ , '' , '"));
		demo.isdisplayed(Specialchars, "Input must not contain \\ , '' , '", test,driver);
		DesignationName.click();
		driver.switchTo().activeElement().clear();
		
	}
	
	public void InvalidData(WebElement Invaliddata, WebDriver driver, String Text) throws IOException
	{
		test = extent.createTest(funTestCaseName() +Text+" textbox should not accept the alphabhets");
		Invaliddata(Invaliddata, "ABCHGHSGHFSHGDHGDD","Only whole and decimal numbers allowed","Only whole and decimal numbers allowed",driver,test);
		test = extent.createTest(funTestCaseName() +Text+" textbox should not accept the specialchars");
		Invaliddata(Invaliddata, "#$%&()*-/:;<=>?@[]^_`{|}~","Only whole and decimal numbers allowed","Only whole and decimal numbers allowed",driver,test);
		test = extent.createTest(funTestCaseName() +Text+" textbox should not accept the invalidchars");
		Invaliddata(Invaliddata, "\\,\",'","Only whole and decimal numbers allowed","Only whole and decimal numbers allowed",driver,test);
		test = extent.createTest(funTestCaseName() +Text+" textbox should not accept the alphanumeric");
		Invaliddata(Invaliddata,  "shgdjdgd&^&%&","Only whole and decimal numbers allowed","Only whole and decimal numbers allowed",driver,test);
	}
	
	public void InvalidDatamA(WebElement Invaliddata, WebDriver driver, String Text) throws IOException
	{
		test = extent.createTest(funTestCaseName() +Text+ "textbox should not accept the alphabhets");
		Invaliddataframe(Invaliddata,"UPDATE","ABCHGHSGHFSHGDHGDD","Only digits with comma allowed","Only digits with comma allowed",driver,test);
		test = extent.createTest(funTestCaseName()  +Text+" textbox should not accept the specialchars");
		Invaliddataframe(Invaliddata,"UPDATE","#$%&()*-/:;<=>?@[]^_`{|}~","Only digits with comma allowed","Only digits with comma allowed",driver,test);
		test = extent.createTest(funTestCaseName()+ Text+" textbox should not accept the invalidchars");
		Invaliddataframe(Invaliddata,"UPDATE", "\\,\"'","Only digits with comma allowed","Only digits with comma allowed",driver,test);
		test = extent.createTest(funTestCaseName()+ Text+" textbox should not accept the alphanumeric");
		Invaliddataframe(Invaliddata,"UPDATE", "shgdjdgd&^&%&","Only digits with comma allowed","Only digits with comma allowed",driver,test);
	}
	
	public void Invaliddata(WebElement Name, String Text,String actual, String Excepted,WebDriver driver,ExtentTest test) throws IOException
	{
		Name.click();
		driver.switchTo().activeElement().clear();
		driver.switchTo().activeElement().sendKeys(Text);
		demo.isempty(Name,Text, test,driver);
		try {
			WebElement errormsg=driver.findElement(By.name(actual));
			demo.isdisplayed(errormsg, Excepted, test,driver);
			demo.Textcomparsion(errormsg, Excepted, test,driver);
		}
		catch(Exception e)
		{
			test.pass("Text box not displaying any rror message");
		}
		
		driver.switchTo().activeElement().clear();
	}
	
	public void Invaliddataframe(WebElement Name, String NameUpadte, String Text,String actual, String Excepted,WebDriver driver,ExtentTest test) throws IOException
	{
		Name.click();
		driver.switchTo().activeElement().clear();
		driver.switchTo().activeElement().sendKeys(Text);
		try {
			WebElement errormsg=driver.findElement(By.name(actual));
			demo.isdisplayed(errormsg, Excepted, test,driver);
			demo.Textcomparsion(errormsg, Excepted, test,driver);
			WebElement Update=driver.findElement(By.name(NameUpadte));
			demo.BydefaultisEnabled(Update, "UPDATE", test, driver);
		}
		catch(Exception e)
		{
			test.pass("Text box not displaying any rror message");
		}
		
		driver.switchTo().activeElement().clear();
	}
	
	public void InValidRangeAngle(WebElement InValidrange,WebDriver driver) throws IOException
	{
		test = extent.createTest(funTestCaseName() +InValidrange.getText()+" range less than 1 and more than 100 error message is displayed or not");
		Invalidrange(InValidrange, "0.4","Range:[0.5 to 100]","Range:[0.5 to 100]",driver,test);
		driver.switchTo().activeElement().clear();
		Invalidrange(InValidrange, "0","Range:[0.5 to 100]","Range:[0.5 to 100]",driver,test);
		driver.switchTo().activeElement().clear();
		Invalidrange(InValidrange, "0.1","Range:[0.5 to 100]","Range:[0.5 to 100]",driver,test);
		driver.switchTo().activeElement().clear();
		Invalidrange(InValidrange, "101","Range:[0.5 to 100]","Range:[0.5 to 100]",driver,test);
		driver.switchTo().activeElement().clear();
		Invalidrange(InValidrange, "100.1","Range:[0.5 to 100]","Range:[0.5 to 100]",driver,test);
		driver.switchTo().activeElement().clear();
		Invalidrange(InValidrange, "0.49","Range:[0.5 to 100]","Range:[0.5 to 100]",driver,test);
	}
	
	public void InValidRangeBeam(WebElement InValidrange,WebDriver driver) throws IOException
	{

			test = extent.createTest(funTestCaseName()  +InValidrange.getText()+" range less than 0.1 and more than 100 error message is displayed or not");
			Invalidrange(InValidrange, "0","Range:[0.1 to 100]","Range:[0.1 to 100]",driver,test);
			driver.switchTo().activeElement().clear();
			Invalidrange(InValidrange, "0.01","Range:[0.1 to 100]","Range:[0.1 to 100]",driver,test);
			driver.switchTo().activeElement().clear();
			Invalidrange(InValidrange, "100.9","Range:[0.1 to 100]","Range:[0.1 to 100]",driver,test);
			driver.switchTo().activeElement().clear();
			Invalidrange(InValidrange, "101","Range:[0.1 to 100]","Range:[0.1 to 100]",driver,test);
			driver.switchTo().activeElement().clear();
			Invalidrange(InValidrange, "0.01","Range:[0.1 to 100]","Range:[0.1 to 100]",driver,test);
		}
	
	public void InValidRangeCouch(WebElement InValidrange,WebDriver driver) throws IOException
	{

			test = extent.createTest(funTestCaseName()  +InValidrange.getText()+" range less than 0.2 and more than 100 error message is displayed or not");
			Invalidrange(InValidrange, "0.1","Range:[0.2 to 100]","Range:[0.2 to 100]",driver,test);
			driver.switchTo().activeElement().clear();
			Invalidrange(InValidrange, "0","Range:[0.2 to 100]","Range:[0.2 to 100]",driver,test);
			driver.switchTo().activeElement().clear();
			Invalidrange(InValidrange, "101","Range:[0.2 to 100]","Range:[0.2 to 100]",driver,test);
			driver.switchTo().activeElement().clear();
			Invalidrange(InValidrange, "101.9","Range:[0.2 to 100]","Range:[0.2 to 100]",driver,test);
			driver.switchTo().activeElement().clear();
			Invalidrange(InValidrange, "1000","Range:[0.2 to 100]","Range:[0.2 to 100]",driver,test);
		}
	
	public void InValidRangeCouchAngle(WebElement InValidrange,WebDriver driver) throws IOException
	{

			test = extent.createTest(funTestCaseName()  +InValidrange.getText()+" range less than 0.1 and more than 5 error message is displayed or not");
			Invalidrange(InValidrange, "0.01","Range:[0.1 to 5]","Range:[0.1 to 5]",driver,test);
			driver.switchTo().activeElement().clear();
			Invalidrange(InValidrange, "0","Range:[0.1 to 5]","Range:[0.1 to 5]",driver,test);
			driver.switchTo().activeElement().clear();
			Invalidrange(InValidrange, "5.01","Range:[0.1 to 5]","Range:[0.1 to 5]",driver,test);
			driver.switchTo().activeElement().clear();
			Invalidrange(InValidrange, "5.1","Range:[0.1 to 5]","Range:[0.1 to 5]",driver,test);
			driver.switchTo().activeElement().clear();
			Invalidrange(InValidrange, "6","Range:[0.1 to 5]","Range:[0.1 to 5]",driver,test);
		}
	public void Invalidrange(WebElement Name, String Text, String actual, String Excepted,WebDriver driver,ExtentTest test) throws IOException
	{
		Name.click();
		driver.switchTo().activeElement().sendKeys(Text);
		WebElement errormsg=driver.findElement(By.name(actual));
		demo.isdisplayed(errormsg, Excepted, test,driver);
		demo.Textcomparsion(errormsg, Excepted, test,driver);
	}
	
	public void InValidTablenumber(WebElement InValidrange,WebDriver driver) throws IOException
	{
		test = extent.createTest(funTestCaseName() +InValidrange.getText()+" Range");
		Invalidrange(InValidrange, "0","Range:[1 to 1000]","Range:[1 to 1000]",driver,test);
		driver.switchTo().activeElement().clear();
		Invalidrange(InValidrange, "0.9","Range:[1 to 1000]","Range:[1 to 1000]",driver,test);
		driver.switchTo().activeElement().clear();
		Invalidrange(InValidrange, "1000.1","Range:[1 to 1000]","Range:[1 to 1000]",driver,test);
		driver.switchTo().activeElement().clear();
		Invalidrange(InValidrange, "1000.19","Range:[1 to 1000]","Range:[1 to 1000]",driver,test);
		driver.switchTo().activeElement().clear();
		Invalidrange(InValidrange, "0.99","Range:[1 to 1000]","Range:[1 to 1000]",driver,test);
		driver.switchTo().activeElement().clear();
	}
	
	public void InvalidDatatableName(WebElement Invaliddata, WebDriver driver) throws IOException
	{
		test = extent.createTest(funTestCaseName()  +Invaliddata.getText()+" enetred Numbers");
		Invaliddatatable(Invaliddata, "9882782763","Input must start with characters","Input must have only characters or space",driver,test);
		test = extent.createTest(funTestCaseName()+" To verify " +Invaliddata.getText()+" enetred the specialchars");
		Invaliddatatable(Invaliddata, "#$%&()*-/:;<=>?@[]^_`{|}~","Input must start with characters","Input must have only characters or space",driver,test);
		test = extent.createTest(funTestCaseName()+"To verify " +Invaliddata.getText()+" textbox should not accept the invalidchars");
		Invaliddatatable(Invaliddata,"\\,\",'","Input must start with characters","Input must have only characters or space",driver,test);
		test = extent.createTest(funTestCaseName()+" To verify " +Invaliddata.getText()+" textbox entered alphanumeric");
		Invaliddatatable(Invaliddata,"shgdjdgd&^&%&","Input must have only characters or space","Input must have only characters or space",driver,test);
		test = extent.createTest(funTestCaseName()+" To verify " +Invaliddata.getText()+" textbox entered less than 3chars");
		Invaliddatatable(Invaliddata,"AD","Input must have atleast 3 characters","Input must have atleast 3 characters",driver,test);
		test = extent.createTest(funTestCaseName()+" To verify " +Invaliddata.getText()+" textbox entered only the spaces");
		Invaliddatatable(Invaliddata,"   ","Input cannot be blank","Input cannot be blank",driver,test);
	}
	
	
	public void Invaliddatatable(WebElement Name, String Text,String actual, String Excepted,WebDriver driver,ExtentTest test) throws IOException
	{
		Name.click();
		driver.switchTo().activeElement().clear();
		driver.switchTo().activeElement().sendKeys(Text);
		try {
			WebElement errormsg=driver.findElement(By.name(actual));
			demo.isdisplayed(errormsg, Excepted, test,driver);
			demo.Textcomparsion(errormsg, Excepted, test,driver);
		}
		catch(Exception e)
		{
			test.error(e);
		}
		
		driver.switchTo().activeElement().clear();
	}
	

	public void ValiddataRange(WebElement Name,String Text,WebDriver driver) throws IOException
	{
		Name.click();
		String data=driver.switchTo().activeElement().getText();
		if(data.length()<=40)
		{
			test.log(Status.PASS,"Textbox accepted is:"+data.length()+"enetred range is:"+Text.length());
		}
		else
		{
			test.log(Status.FAIL,"Textbox accepted is:"+data.length()+"enetred range is:"+Text.length());
		}
	}
	 WebElement SiteSavedescription;
	public void Sitesave(String Titlename, String Description, String Excepetedtitlename, String Excepeteddescription, int i, WebDriver driver) throws InterruptedException, IOException
	{
		    String mainWindowHandle = driver.getWindowHandle();
		    Set<String> windowHandles = driver.getWindowHandles();
		    for (String handle : windowHandles) {
		        if (!handle.equals(mainWindowHandle)) {
		            driver.switchTo().window(handle);
		            test = extent.createTest(guiTestCaseName()+" To verify popup titlename, description and ok button");
		           try {
		            WebElement SiteAdd=driver.findElement(By.name(Titlename));
		           }
		           catch(Exception e)
		            {
		            	  test.error(e);
		            }
		            try {
		            SiteSavedescription=driver.findElement(By.name(Description));
		            demo.Textcomparsion(SiteSavedescription, Excepeteddescription, test,driver);
		            }
		            catch(Exception e)
		            {
		            	 test.error(e);
		            }
		            
		            WebElement OK=driver.findElement(By.name("OK"));
		            demo.Textcomparsion(OK, "OK", test,driver);
		        	OK.click();	
		        	Thread.sleep(2000);
		            }
		            break; 
		        }
		    driver.switchTo().window(mainWindowHandle);	
		}
	
	public void Sitesave1(String Titlename, String Description, String Excepetedtitlename, String Excepeteddescription, int i, WebDriver driver,ExtentTest test) throws InterruptedException, IOException
	{
		    String mainWindowHandle = driver.getWindowHandle();
		    Set<String> windowHandles = driver.getWindowHandles();
		    for (String handle : windowHandles) {
		        if (!handle.equals(mainWindowHandle)) {
		            driver.switchTo().window(handle);
		           try {
		            WebElement SiteAdd=driver.findElement(By.name(Titlename));
		           }
		           catch(Exception e)
		            {
		            	  test.error(e);
		            }
		            try {
		            SiteSavedescription=driver.findElement(By.name(Description));
		            demo.Textcomparsion(SiteSavedescription, Excepeteddescription, test,driver);
		            }
		            catch(Exception e)
		            {
		            	 test.error(e);
		            }
		            finally {
		            WebElement OK=driver.findElement(By.name("OK"));
		            demo.Textcomparsion(OK, "OK", test,driver);
		        	OK.click();	
		        	Thread.sleep(2000);
		            }
		            }
		            break; 
		        }
		    driver.switchTo().window(mainWindowHandle);	
		}
	public void SitesaveCancel(String Titlename, String Description, String Excepetedtitlename, String Excepeteddescription, int i, WebDriver driver) throws InterruptedException, IOException
	{
		    String mainWindowHandle = driver.getWindowHandle();
		    Set<String> windowHandles = driver.getWindowHandles();
		    for (String handle : windowHandles) {
		        if (!handle.equals(mainWindowHandle)) {
		            driver.switchTo().window(handle);
		            test = extent.createTest(guiTestCaseName()+" To verify popup titlename, description, oK and cancel button");
		           try {
		            WebElement SiteAdd=driver.findElement(By.name(Titlename));
		            
		            demo.Textcomparsion(SiteAdd, Excepetedtitlename, test,driver);
		           }
		           catch(Exception e)
		            {
		        	   test.error(e);
		            }
		            try {
		            SiteSavedescription=driver.findElement(By.name(Description));
		            demo.Textcomparsion(SiteSavedescription, Excepeteddescription, test,driver);
		            }
		            catch(Exception e)
		            {
		            	test.fail("No such element found");
		            }
		            
		            WebElement Cancel=driver.findElement(By.name("CANCEL"));
		            demo.Textcomparsion(Cancel, "CANCEL", test,driver);
		            Cancel.click();	
		        	Thread.sleep(2000);
		            }
		            break; 
		        }
		    driver.switchTo().window(mainWindowHandle);	
		}
	
	public void SitesaveCancel1(String Titlename, String Description, String Excepetedtitlename, String Excepeteddescription, int i, WebDriver driver,ExtentTest test) throws InterruptedException, IOException
	{
		    String mainWindowHandle = driver.getWindowHandle();
		    Set<String> windowHandles = driver.getWindowHandles();
		    for (String handle : windowHandles) {
		        if (!handle.equals(mainWindowHandle)) {
		            driver.switchTo().window(handle);
		           try {
		            WebElement SiteAdd=driver.findElement(By.name(Titlename));
		            
		            demo.Textcomparsion(SiteAdd, Excepetedtitlename, test,driver);
		           }
		           catch(Exception e)
		            {
		        	   test.error(e);
		            }
		            try {
		            SiteSavedescription=driver.findElement(By.name(Description));
		            demo.Textcomparsion(SiteSavedescription, Excepeteddescription, test,driver);
		            }
		            catch(Exception e)
		            {
		            	test.fail("No such element found");
		            }
		            
		            WebElement Cancel=driver.findElement(By.name("CANCEL"));
		            demo.Textcomparsion(Cancel, "CANCEL", test,driver);
		            Cancel.click();	
		        	Thread.sleep(2000);
		            }
		            break; 
		        }
		    driver.switchTo().window(mainWindowHandle);	
		}
	
	
	
	
	public void Sitesavecontains(String Titlename, String Description, String Excepetedtitlename, String Excepeteddescription, int i, WebDriver driver) throws InterruptedException, IOException
	{

		    String mainWindowHandle = driver.getWindowHandle();
		    Set<String> windowHandles = driver.getWindowHandles();
		    for (String handle : windowHandles) {
		        if (!handle.equals(mainWindowHandle)) {
		            driver.switchTo().window(handle);
		            test = extent.createTest(guiTestCaseName()+" To verify popup titlename, description and ok button");
		           
		            WebElement SiteAdd=driver.findElement(By.name(Titlename));
		            
		            demo.Textcomparsion(SiteAdd, Excepetedtitlename, test,driver);
		            try {
		            SiteSavedescription=driver.findElement(By.xpath("//Text[contains(@Name,Description)]"));
		            }
		            catch(Exception e)
		            {
		            	test.fail("No such element found");
		            }
		            demo.isdisplayed(SiteSavedescription, Excepeteddescription, test,driver);
		            WebElement OK=driver.findElement(By.name("OK"));
		            demo.Textcomparsion(OK, "OK", test,driver);
		        	OK.click();	
		        	Thread.sleep(2000);
		            }
		            break; 
		        }
		    driver.switchTo().window(mainWindowHandle);	
		}
	
	  WebElement SiteAdd;
	  WebElement SiteSavedescription1;
	public void Machinesave(String Titlename, String Description,int i, WebDriver driver,ExtentTest test) throws InterruptedException, IOException
	{

		    String mainWindowHandle = driver.getWindowHandle();
		    Set<String> windowHandles = driver.getWindowHandles();
		    for (String handle : windowHandles) {
		        if (!handle.equals(mainWindowHandle)) {
		            driver.switchTo().window(handle);
		          try {
		            SiteAdd=driver.findElement(By.name(Titlename));
		            SiteSavedescription1=driver.findElement(By.name(Description));
		            demo.isnotdisplayed(SiteAdd, "SiteAdd", test, driver);
		            }
		            catch(Exception e)
		            {
		            	demo.isdisplayed(SiteAdd, "SiteAdd", test, driver);
		            }
		            
		            WebElement OK=driver.findElement(By.name("OK"));
		            demo.Textcomparsion(OK, "OK", test,driver);
		        	OK.click();	
		        	Thread.sleep(1000);
		            }
		            break; 
		        }
		    driver.switchTo().window(mainWindowHandle);	
		}
	
	
	
	
	
public void errormessagedisplayed(String Text,String ExceptedMsgDescription) throws IOException
{
	WebElement element=driver.findElement(By.name(Text));
    DemographicsExternal demo=new DemographicsExternal() ;
    demo.isdisplayed(element, ExceptedMsgDescription, test, driver);
    demo.Textcomparsion(element, ExceptedMsgDescription, test, driver);
}
Actions action;
public void guilabelindex(String Text, int i, String Excepted) throws InterruptedException, IOException
{
	 By locator = By.name(Text);
   	List<WebElement> elements = driver.findElements(locator);
   	Thread.sleep(2000);
   	int desiredIndex = i; 
   	if (desiredIndex < elements.size()) {
   		Thread.sleep(2000);
   	    WebElement element = elements.get(desiredIndex);
   	    action=new Actions(driver);
   	    action.moveToElement(element).perform();
   	    demo.Textcomparsion(element, Excepted, test,driver);
   	}
}

//==========================DEmographics=================

int randomweightNumber;
double scaledValue;
String randomweightNumberText;
public void Validweightrange(int i, int j)
{
	SecureRandom secureRandom = new SecureRandom();
    int minValue = i;
    int maxValue = j;
    randomweightNumber = secureRandom.nextInt(maxValue - minValue + 1) + minValue;
    randomweightNumberText = String.valueOf(randomweightNumber);
}
String scaledValuetext;
public void invalidweightrange(int i, int j) {
	SecureRandom secureRandom = new SecureRandom();
	int randomValue = secureRandom.nextInt();
	int minValue = i;
	int maxValue = j;
    scaledValue = minValue + randomValue * (maxValue - minValue);
    scaledValuetext = String.valueOf(scaledValue);
}

public final int NUM_DIGITS = 10;

public String generateRandomNumber() {
    Random random = new Random();
    StringBuilder randomNumber = new StringBuilder();

    for (int i = 0; i < NUM_DIGITS; i++) {
        int digit = random.nextInt(10); // Generates a random digit between 0 and 9 (inclusive).
        randomNumber.append(digit);
    }

    return randomNumber.toString();
}
String randomNum ;
public void randomstringtext() {
randomNum = generateRandomNumber();
}


    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";

    private static final int EMAIL_LENGTH = 10;

    public String generateRandomEmail() {
        SecureRandom random = new SecureRandom();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            sb.append(ALPHABET.charAt(random.nextInt(ALPHABET.length())));
        }

 
        for (int i = 0; i < 3; i++) {
            sb.append(NUMBERS.charAt(random.nextInt(NUMBERS.length())));
        }

   
        sb.append("@example.com");

        return sb.toString();
    }
    String randomEmail;
public void randomemail() {
  randomEmail = generateRandomEmail();
    
}
String selectedBloodGroup;
public void BloodGroup()
{
	Random random = new Random();
    int randomNumber = random.nextInt(8);
    String[] options = {"A+ve","A-ve","O+ve","O-ve","AB+ve","AB-ve","B+ve","B-ve"};
    selectedBloodGroup = options[randomNumber];
}

String selectedGender;
public void Gender()
{
	Random random = new Random();
    int randomNumber = random.nextInt(2);
    String[] options = {"Female","Others"};
    selectedGender = options[randomNumber];
}

String selectedPatientSize;
public void PatientSize()
{
	Random random = new Random();
    int randomNumber = random.nextInt(4);
    String[] options = {"Pediatric","Small","Medium","Large"};
    selectedPatientSize = options[randomNumber];
}
//------------------------------------Theme settings-----------------------------------------------

 String selectedmachine;
public void SampleMachinesettings()
{
	Random random = new Random();
    int randomNumber = random.nextInt(4);
    String[] options = {"BHABHATRON-3i Machine Settings Sample File.csv","BHABHATRON-II Machine Settings Sample File.csv","BHABHATRON-MLC Machine Settings Sample File.csv","SIDDHARTH-II Machine Settings Sample File.csv"};
    selectedmachine = options[randomNumber];
}

//--------------------------------------Field configuration----------------------------
int randomrange;
String randomrangenum;
public void rangenum()
{
Random random = new Random();
randomrange = random.nextInt(31); 
randomrangenum = String.valueOf(randomrange);
}
int randomrangeinvalid;
 String randomrangenuminvalid;


int rannum;
String randomstring;
int randomzero;
String randomstring1;
String selectedinvalidrange;


int randominvalidfield;
String randomrangefield;
public void invalidrange(int i, int j)
{
	Random random = new Random();
	int lowerBound = i;
    int upperBound = j;
    
    randominvalidfield = lowerBound + random.nextInt(upperBound - lowerBound);
    randomrangefield = String.valueOf(randominvalidfield);
}

double randominvalidfield1;
String randomrangefield1;
String collianglesize;
public void invalidrange(int i, double j)
{
	Random random = new Random();
	int lowerBound = i;
    double upperBound = j;
    
    randominvalidfield1 = lowerBound + random.nextDouble(upperBound - lowerBound);
    randomrangefield1 = String.valueOf(randominvalidfield1);
}


public void collirange()
{
Random random = new Random();
    
    int randomNumber1 = random.nextInt(101);
    String ran1 = String.valueOf(randomNumber1);
    
    int randomNumber2 = random.nextInt(261);  
    int randomNumberInRange2 = 260 - randomNumber2;     
    
    int randomDecreasingNumber = random.nextInt(261); 
    
    String ran2 = String.valueOf(randomNumberInRange2);
    String ranDecreasing = String.valueOf(randomDecreasingNumber);
    
    int randomNumber = random.nextInt(1); 
    String[] options = {ran1};
    collianglesize = options[randomNumber];
    
}

//------------------Templates


String selectedSite;
public void Site()
{
	Random random = new Random();
    int randomNumber = random.nextInt(3);
    String[] options = {"Head","Leg","Neck"};
    selectedSite = options[randomNumber];
}

String selectedMachine;
public void PrescribedMachine()
{
	Random random = new Random();
    int randomNumber = random.nextInt(4);
    String[] options = {"SIDDHARTH-II_C05","BHABHATRON-3i_C04","BHABHATRON-II_C02","BHABHATRON-MLC v2_C03"};
    selectedMachine = options[randomNumber];
}


String selectedBeamtype;
String selectedTechnique;

public void PrescribedBeamType()
{
	Random random = new Random();
    int randomNumber = random.nextInt(2);
    String[] options = {"STATIC", "DYNAMIC"};
    selectedBeamtype = options[randomNumber];
}

public void PrescribedTechnique()
{
	Random random = new Random();
    int randomNumber = random.nextInt(5);
    String[] options = {"ISOCENTRIC", "FIXED_SSD", "TBI", "BREAST_BRIDGE", "SKIN_APPOSITION"};
    selectedTechnique = options[randomNumber];
}

//	=============================================================================================================
public void Rollsave(String Titlename, String Description, String Excepetedtitlename, String Excepeteddescription, ExtentTest test1,  WebDriver driver) throws InterruptedException, IOException
{
	    String mainWindowHandle = driver.getWindowHandle();
	    Set<String> windowHandles = driver.getWindowHandles();
	    for (String handle : windowHandles) {
	        if (!handle.equals(mainWindowHandle)) {
	            driver.switchTo().window(handle);
	           
	           try {
	            WebElement SiteAdd=driver.findElement(By.name(Titlename));
	            demo.Textcomparsion(SiteAdd, Excepetedtitlename, test1,driver);
	           }
	           catch(Exception e)
	            {
	            	test.fail("No Pop-up message get displayed");
	            }
	            try {
	            SiteSavedescription=driver.findElement(By.name(Description));
	            demo.Textcomparsion(SiteSavedescription, Excepeteddescription, test1,driver);
	            }
	            catch(Exception e)
	            {
	            	test.fail("No such element found"+Description);
	            }
	            
	            WebElement OK=driver.findElement(By.name("OK"));
	            demo.Textcomparsion(OK, "OK", test1,driver);
	        	OK.click();	
	        	Thread.sleep(2000);
	            }
	            break; 
	        }
	    driver.switchTo().window(mainWindowHandle);	
	}

public void Rollcancel(String Titlename, String Description, String Excepetedtitlename, String Excepeteddescription, ExtentTest test1,  WebDriver driver) throws InterruptedException, IOException
{
	    String mainWindowHandle = driver.getWindowHandle();
	    Set<String> windowHandles = driver.getWindowHandles();
	    for (String handle : windowHandles) {
	        if (!handle.equals(mainWindowHandle)) {
	            driver.switchTo().window(handle);
	           
	           try {
	            WebElement SiteAdd=driver.findElement(By.name(Titlename));
	            demo.Textcomparsion(SiteAdd, Excepetedtitlename, test1,driver);
	           }
	           catch(Exception e)
	            {
	            	test.fail("No Pop-up message get displayed");
	            	demo.Textcomparsion(SiteAdd, Excepetedtitlename, test1,driver);
	            }
	            try {
	            SiteSavedescription=driver.findElement(By.name(Description));
	            demo.Textcomparsion(SiteSavedescription, Excepeteddescription, test1,driver);
	            }
	            catch(Exception e)
	            {
	            	test.fail("No such element found"+Description);
	            }
	            
	            WebElement Cancel=driver.findElement(By.name("CANCEL"));
	            demo.Textcomparsion(Cancel, "CANCEL", test1,driver);
	            Cancel.click();	
	        	Thread.sleep(1000);
	            }
	            break; 
	        }
	    driver.switchTo().window(mainWindowHandle);	
	}

public void Rollcontains(String Titlename, String Description, String Excepetedtitlename, String Excepeteddescription,ExtentTest test1, WebDriver driver) throws InterruptedException, IOException
{

	    String mainWindowHandle = driver.getWindowHandle();
	    Set<String> windowHandles = driver.getWindowHandles();
	    for (String handle : windowHandles) {
	        if (!handle.equals(mainWindowHandle)) {
	            driver.switchTo().window(handle);
	            WebElement SiteAdd=driver.findElement(By.name(Titlename));
	            
	            demo.Textcomparsion(SiteAdd, Excepetedtitlename, test,driver);
	            try {
	            SiteSavedescription=driver.findElement(By.xpath("//Text[contains(@Name,Description)]"));
	            }
	            catch(Exception e)
	            {
	            	test.fail("No such element found");
	            }
	            demo.isdisplayed(SiteSavedescription, Excepeteddescription, test,driver);
	            WebElement OK=driver.findElement(By.name("OK"));
	            demo.Textcomparsion(OK, "OK", test,driver);
	        	OK.click();	
	        	Thread.sleep(2000);
	            }
	            break; 
	        }
	    driver.switchTo().window(mainWindowHandle);	
	}

public void Rollcontainscancel(String Titlename, String Description, String Excepetedtitlename, String Excepeteddescription,ExtentTest test1, WebDriver driver) throws InterruptedException, IOException
{

	    String mainWindowHandle = driver.getWindowHandle();
	    Set<String> windowHandles = driver.getWindowHandles();
	    for (String handle : windowHandles) {
	        if (!handle.equals(mainWindowHandle)) {
	            driver.switchTo().window(handle);
	            WebElement SiteAdd=driver.findElement(By.name(Titlename));
	            
	            demo.Textcomparsion(SiteAdd, Excepetedtitlename, test,driver);
	            try {
	            SiteSavedescription=driver.findElement(By.xpath("//Text[contains(@Name,Description)]"));
	            }
	            catch(Exception e)
	            {
	            	test.fail("No such element found");
	            }
	            demo.isdisplayed(SiteSavedescription, Excepeteddescription, test,driver);
	            WebElement OK=driver.findElement(By.name("CANCEL"));
	            demo.Textcomparsion(OK, "CANCEL", test,driver);
	        	OK.click();	
	        	Thread.sleep(2000);
	            }
	            break; 
	        }
	    driver.switchTo().window(mainWindowHandle);	
	}

public void errormessagedisplayed1(String Text,String ExceptedMsgDescription, ExtentTest test1) throws IOException
{
	WebElement element=driver.findElement(By.name(Text));
    DemographicsExternal demo=new DemographicsExternal() ;
    demo.isdisplayed(element, ExceptedMsgDescription, test1, driver);
    demo.Textcomparsion(element, ExceptedMsgDescription, test1, driver);
}


public void errormessagecontains(String Description,ExtentTest test1,WebDriver driver) throws IOException
{
	 SiteSavedescription=driver.findElement(By.xpath("//Text[contains(@Name,Description)]"));
	 demo.isdisplayed(SiteSavedescription, "Input should not contain", test1, driver);
}






 
public void viewdataserachfun(String Text, ExtentTest Test,String Classtext,WebDriver driver) throws IOException, FindFailed, InterruptedException {
	   
	WebElement text= driver.findElement(By.className(Classtext));
    List<WebElement> Listrow = text.findElements(By.className("DataGridRow"));
    System.out.println(Listrow.size());
    for (WebElement link : Listrow) {
    	//System.out.println(link);
        List<WebElement> datarow = link.findElements(By.className("DataGridCell"));
        System.out.println(datarow.size());
        int randomOddIndex = new Random().nextInt((datarow.size() / 2)) * 2 + 1;
        
        if (randomOddIndex < Listrow.size()) {
            WebElement randomOddElement = datarow.get(randomOddIndex);
            String linkText = randomOddElement.getText();
            
            edit(Text);
            
            // Enter the linkText in the search box
            WebElement searchBox = driver.switchTo().activeElement();
            searchBox.sendKeys(linkText);

            // Wait for a moment to allow search results to appear (you can adjust the wait time as needed)
           Thread.sleep(1000);

           // Check if only one row is displayed in the data grid
           WebElement text1= driver.findElement(By.className(Classtext));
           List<WebElement> dataGridRows = text.findElements(By.className("DataGridRow"));
           for (WebElement link1 : dataGridRows) {
           if (dataGridRows.size()!=0) {
                WebElement data=link1.findElements(By.className("DataGridCell")).get(1);
                
                if (data.getText().contains(linkText)) {
                    test.pass(linkText + " Searched element found");
                } 
               else {
                    test.fail(linkText + " Searched element not found");
               }
           } else {
        	   WebElement data=link1.findElements(By.className("DataGridCell")).get(3);
               
               if (data.getText().contains(linkText)) {
                   test.pass(linkText + " Searched element found");
               } 
              else {
                   test.fail(linkText + " Searched element not found");
              }

            }
           }
            // Clear the search box
            searchBox.clear();
            Thread.sleep(1000);
            demo.isempty(searchBox, linkText, test, driver);
            test.info("****************************************************************************");
        }
    }
    }

public void viewDataSearchDrug(String Text, ExtentTest Test,String Classtext,WebDriver driver) throws IOException, FindFailed, InterruptedException {
	WebElement text= driver.findElement(By.className(Classtext));
	
	List<WebElement> Listrow = driver.findElements(By.className("DataGridRow"));
	    System.out.println(Listrow.size());
	    for (WebElement row : Listrow) {
	        List<WebElement> datarow = row.findElements(By.className("DataGridCell"));
	        System.out.println(datarow.size());

	        if (datarow.size() >= 4) { 
	            WebElement cell4 = datarow.get(2); 
	            String linkText = cell4.getText();
	            edit(Text);
	            WebElement searchBox = driver.switchTo().activeElement();
	            searchBox.sendKeys(linkText);

	            // Check if only one row is displayed in the data grid
	            WebElement text1= driver.findElement(By.className(Classtext));
	            List<WebElement> dataGridRows = text.findElements(By.className("DataGridRow"));
	            for (WebElement link1 : dataGridRows) {
	            if (dataGridRows.size()!=0) {
	                 WebElement data=link1.findElements(By.className("DataGridCell")).get(2);
	                 
	                 if (data.getText().contains(linkText)) {
	                     test.pass(linkText + " Searched element found");
	                 } 
	                else {
	                     test.fail(linkText + " Searched element not found");
	                }
	            } else {
	         	   WebElement data=link1.findElements(By.className("DataGridCell")).get(6);
	                
	                if (data.getText().contains(linkText)) {
	                    test.pass(linkText + " Searched element found");
	                } 
	               else {
	                    test.fail(linkText + " Searched element not found");
	               }

	             }
	            }
	             // Clear the search box
	             searchBox.clear();
	             Thread.sleep(1000);
	             demo.isempty(searchBox, linkText, test, driver);
	         }
	        }
	    }

public void viewDataDelete(String Text, ExtentTest Test,String Classtext,WebDriver driver) throws IOException, FindFailed, InterruptedException {
	WebElement text= driver.findElement(By.className(Classtext));
	
	List<WebElement> Listrow = driver.findElements(By.className("DataGridRow"));
	    System.out.println(Listrow.size());

	    for (WebElement row : Listrow) {
	        List<WebElement> datarow = row.findElements(By.className("DataGridCell"));
	        System.out.println(datarow.size());

	        if (datarow.size() >= 4) { 
	            WebElement cell4 = datarow.get(2); 
	            String linkText = cell4.getText();
	            edit(Text);
	            WebElement searchBox = driver.switchTo().activeElement();
	            searchBox.sendKeys(linkText);

	            // Check if only one row is displayed in the data grid
	            WebElement text1= driver.findElement(By.className(Classtext));
	            List<WebElement> dataGridRows = text.findElements(By.className("DataGridRow"));
	            for (WebElement link1 : dataGridRows) {
	            if (dataGridRows.size()!=0) {
	                 WebElement data=link1.findElements(By.className("DataGridCell")).get(2);
	                 
	                 if (data.getText().contains(linkText)) {
	                     test.pass(linkText + " Searched element found");
	                 } 
	                else {
	                     test.fail(linkText + " Searched element not found");
	                }
	            } else {
	         	   WebElement data=link1.findElements(By.className("DataGridCell")).get(6);
	                
	                if (data.getText().contains(linkText)) {
	                    test.pass(linkText + " Searched element found");
	                } 
	               else {
	                    test.fail(linkText + " Searched element not found");
	               }

	             }
	            }
	             // Clear the search box
	             searchBox.clear();
	             Thread.sleep(1000);
	             demo.isempty(searchBox, linkText, test, driver);
	         }
	        }
	    }



public void viewdataserachfun(ExtentTest test, WebDriver driver) throws IOException, FindFailed, InterruptedException {
    List<WebElement> Listrow = driver.findElements(By.className("DataGridRow"));
    System.out.println(Listrow.size());

    for (WebElement row : Listrow) {
        List<WebElement> datarow = row.findElements(By.className("DataGridCell"));
        System.out.println(datarow.size());
        if (datarow.size() >= 5) { 
            WebElement cell5 = datarow.get(4); // Accessing the 5th element (index 4)
            String cellText = cell5.getText();
            edit("D:\\Help\\Field\\Searchfield.PNG");
            WebElement searchBox = driver.switchTo().activeElement();
            searchBox.sendKeys(cellText);

            List<WebElement> dataGridRows = driver.findElements(By.className("DataGridRow"));
            
            if (!datarow.isEmpty()) {
            	WebElement data = datarow.get(4);
                if (data.getText().toLowerCase().contains(cellText.toLowerCase())) {
                    test.pass(cellText + " Searched element found");
                } else {
                    test.fail(cellText + " Searched element not found");
                }
            }
            
            // Clear the search box
            searchBox.clear();
            Thread.sleep(1000);
            demo.isempty(searchBox, cellText, test, driver);
            break;
        }
    }
}


public void vieweditenable(String Classtext, int i, ExtentTest test, WebDriver driver, String Text) throws IOException, FindFailed, InterruptedException {
    List<WebElement> Listrow = driver.findElements(By.className("DataGridRow"));
    System.out.println(Listrow.size());
    for (WebElement row : Listrow) {
        List<WebElement> datarow = row.findElements(By.className("DataGridCell"));
        System.out.println(datarow.size());

        if (datarow.size() >= 5) {
            WebElement firstDataGridCell = datarow.get(i);
            Actions action = new Actions(driver);
            action.moveToElement(firstDataGridCell).perform();
            demo.isEnabled(firstDataGridCell, Text, test, driver);
        } else {
        }
    }

}
public void vieweditenableclick(String Classtext, int i, ExtentTest test, WebDriver driver, String Text) throws IOException, FindFailed, InterruptedException {
    List<WebElement> Listrow = driver.findElements(By.className("DataGridRow"));
    System.out.println(Listrow.size());


    for (WebElement row : Listrow) {
        List<WebElement> datarow = row.findElements(By.className("DataGridCell"));
        System.out.println(datarow.size());

        if (datarow.size() >= 5) {
            WebElement firstDataGridCell = datarow.get(i);
            Actions action = new Actions(driver);
            action.moveToElement(firstDataGridCell).click().perform();
            demo.isEnabled(firstDataGridCell, Text, test, driver);
            break;
        } else {
        }
    }

}
    

public void viewdeleteenable(String Classtext) throws IOException, FindFailed, InterruptedException {
    test = extent.createTest(guiTestCaseName() + "To verify the all the delete button enabled when save the data");
     WebElement text= driver.findElement(By.className(Classtext));
    List<WebElement> Listrow = text.findElements(By.className("DataGridRow"));
    System.out.println(Listrow.size());
    for (WebElement link : Listrow) {
        List<WebElement> datarow = driver.findElements(By.className("DataGridCell"));
        System.out.println(datarow.size());
        for (int i = 0; i < Listrow.size(); i++) {
            WebElement datalink = datarow.get(i);
            if (datalink.getSize() != null) {
                if (i % 2!= 0) {
                   demo.isEnabled(datalink, "Delete", test, driver);
                   if(Listrow.size()==13)
                   {
                	   Actions actions=new Actions(driver);
                	   actions.sendKeys(Keys.PAGE_DOWN).perform();
                	   List<WebElement> datarow1 = driver.findElements(By.className("DataGridCell"));
                       for (int i1 = 0; i < datarow1.size(); i++) {
                           WebElement datalink1 = datarow.get(i1);
                           if (datalink1.getSize() != null) {
                               String linkText1 = datalink1.getText();
                               test.info(linkText1);
                           }
                       }
                   }
                   else
                   {
                	   break;
                   }
                 
                }
            }
        }
    }
       
    }

public void vieweditenabledrug(String Classtext) throws IOException, FindFailed, InterruptedException {
    test = extent.createTest(guiTestCaseName() + "To verify the all the Edit button enabled when save the data for drugdose");
     WebElement text= driver.findElement(By.className(Classtext));
    List<WebElement> Listrow = text.findElements(By.className("DataGridRow"));
    System.out.println(Listrow.size());
    for (WebElement link : Listrow) {
        List<WebElement> datarow = driver.findElements(By.className("DataGridCell"));
        System.out.println(datarow.size());
        for (int i = 0; i < Listrow.size(); i++) {
            WebElement datalink = datarow.get(i);
            if (datalink.getSize() != null) {
                if (i % 2!= 0) {
                   demo.isEnabled(datalink, "Edit", test, driver);
                   if(Listrow.size()==13)
                   {
                	   Actions actions=new Actions(driver);
                	   actions.sendKeys(Keys.PAGE_DOWN).perform();
                	   List<WebElement> datarow1 = driver.findElements(By.className("DataGridCell"));
                       for (int i1 = 0; i < datarow1.size(); i++) {
                           WebElement datalink1 = datarow.get(i1);
                           if (datalink1.getSize() != null) {
                               String linkText1 = datalink1.getText();
                               test.info(linkText1);
                           }
                       }
                   }
                   else
                   {
                	   break;
                   }
                 
                }
            }
        }
    }
       
    }
    
    
    
    
    
    public void viewdeleteenabledrug(String Classtext) throws IOException, FindFailed, InterruptedException {
        test = extent.createTest(guiTestCaseName() + "To verify the all the delete button enabled when save the data");
         WebElement text= driver.findElement(By.className(Classtext));
        List<WebElement> Listrow = text.findElements(By.className("DataGridRow"));
        System.out.println(Listrow.size());
        for (WebElement link : Listrow) {
            List<WebElement> datarow = driver.findElements(By.className("DataGridCell"));
            System.out.println(datarow.size());
            for (int i = 1; i < Listrow.size(); i++) {
                WebElement datalink = datarow.get(i);
                if (datalink.getSize() != null) {
                    if (i % 2!= 0) {
                       demo.isEnabled(datalink, "Delete", test, driver);
                       if(Listrow.size()==13)
                       {
                    	   Actions actions=new Actions(driver);
                    	   actions.sendKeys(Keys.PAGE_DOWN).perform();
                    	   List<WebElement> datarow1 = driver.findElements(By.className("DataGridCell"));
                           for (int i1 = 0; i < datarow1.size(); i++) {
                               WebElement datalink1 = datarow.get(i1);
                               if (datalink1.getSize() != null) {
                                   String linkText1 = datalink1.getText();
                                   test.info(linkText1);
                               }
                           }
                       }
                       else
                       {
                    	   break;
                       }
                     
                    }
                }
            }
           
        }
}



























public void viewdeleteenable1(String Classtext) throws IOException, FindFailed, InterruptedException {
    test = extent.createTest(guiTestCaseName() + "To verify the all the delete button enabled when save the data");
     WebElement text= driver.findElement(By.className(Classtext));
    List<WebElement> Listrow = text.findElements(By.className("DataGridRow"));
    System.out.println(Listrow.size());
    for (WebElement link : Listrow) {
        List<WebElement> datarow = driver.findElements(By.className("DataGridCell"));
        System.out.println(datarow.size());
        for (int i = 1; i < Listrow.size(); i++) {
            WebElement datalink = datarow.get(i);
            if (datalink.getSize() != null) {
                if (i % 2!= 0) {
                   demo.isEnabled(datalink, "Delete", test, driver);
                   if(Listrow.size()==13)
                   {
                	   Actions actions=new Actions(driver);
                	   actions.sendKeys(Keys.PAGE_DOWN).perform();
                	   List<WebElement> datarow1 = driver.findElements(By.className("DataGridCell"));
                       for (int i1 = 0; i < datarow1.size(); i++) {
                           WebElement datalink1 = datarow.get(i1);
                           if (datalink1.getSize() != null) {
                               String linkText1 = datalink1.getText();
                               test.info(linkText1);
                           }
                       }
                   }
                   else
                   {
                	   break;
                   }
                 
                }
            }
        }
       
    }
}

public void viewdataget1(ExtentTest test,String Classtext) throws IOException, FindFailed, InterruptedException {
    WebElement text= driver.findElement(By.className(Classtext));
    List<WebElement> Listrow = text.findElements(By.className("DataGridRow"));
    StringBuilder tableHtml = new StringBuilder();
    tableHtml.append("<table style='font-size: 16px; border-collapse: separate; border-spacing: 10px;'>");

    tableHtml.append("<tr><th>Database Name</th><th> Prescription Value</th></tr>");
    for (WebElement row : Listrow) {
       
        List<WebElement> datarow = row.findElements(By.className("DataGridCell"));
        // Check if there are at least 4 cells in the row
        if (datarow.size() >= 4) {
            // Extract text from the 3rd and 4th cells (index 2 and 3)
            String cell3Text = datarow.get(2).getText();
            String cell4Text = datarow.get(3).getText();

            // Add the text from the 3rd and 4th cells to the table
            tableHtml.append("<tr><td>").append(cell3Text).append("</td><td style='margin-left: 10px;'>").append(cell4Text).append("</td></tr>");
        }
    }
        tableHtml.append("</table>");
        test.pass(MarkupHelper.createLabel(tableHtml.toString(), ExtentColor.WHITE));
    
}

public void viewchemoapp(ExtentTest test, String Classtext) throws IOException, FindFailed, InterruptedException {
    WebElement text = driver.findElement(By.className(Classtext));
    List<WebElement> Listrow = text.findElements(By.className("DataGridRow"));
    System.out.println(Listrow.size());
    StringBuilder tableHtml = new StringBuilder();
    tableHtml.append("<table style='font-size: 16px; border-collapse: separate; border-spacing: 10px;'>");
    tableHtml.append("<tr><th>Name</th></tr>");
    
    for (WebElement row : Listrow) {
        WebElement firstCell = row.findElements(By.className("DataGridCell")).get(1); // Find the 1st cell in each row
        String cellText = firstCell.getText();
        
        tableHtml.append("<tr><td>").append(cellText).append("</td></tr>");
    }

    tableHtml.append("</table>");
    test.pass(MarkupHelper.createLabel(tableHtml.toString(), ExtentColor.WHITE));
}

public void viewDrugapp(ExtentTest test, String Classtext) throws IOException, FindFailed, InterruptedException {
    WebElement text = driver.findElement(By.className(Classtext));
    List<WebElement> Listrow = text.findElements(By.className("DataGridRow"));
    System.out.println(Listrow.size());
    StringBuilder tableHtml = new StringBuilder();
    tableHtml.append("<table style='font-size: 16px; border-collapse: separate; border-spacing: 10px;'>");
    tableHtml.append("<tr><th>Name</th></tr>");
    
    for (WebElement row : Listrow) {
        WebElement firstCell = row.findElements(By.className("DataGridCell")).get(2);
        WebElement SecondCell = row.findElements(By.className("DataGridCell")).get(3);// Find the 1st cell in each row
        String cellText = firstCell.getText();
        String SecondText = SecondCell.getText();
        
        tableHtml.append("<tr><td>").append(cellText).append(SecondText).append("</td></tr>");
    }

    tableHtml.append("</table>");
    test.pass(MarkupHelper.createLabel(tableHtml.toString(), ExtentColor.WHITE));
}
       
    



public void delete(String Classtext,ExtentTest test) throws IOException, InterruptedException
{

	WebElement text= driver.findElement(By.className(Classtext));
    WebElement Listrow = text.findElements(By.className("DataGridRow")).get(0);
    WebElement Delete=Listrow.findElements(By.className("DataGridCell")).get(0);
	if(Delete.isEnabled())
	{
		Delete.click();
	}
	else
	{
		test.fail("Delete button is not enabled");
	}
	
}

public void deletedrug(String Classtext,ExtentTest test) throws IOException, InterruptedException
{

	WebElement text= driver.findElement(By.className(Classtext));
    WebElement Listrow = text.findElements(By.className("DataGridRow")).get(0);
    WebElement Delete=Listrow.findElements(By.className("DataGridCell")).get(1);
	if(Delete.isEnabled())
	{
	Actions action=new Actions(driver);
	action.moveToElement(Delete).moveByOffset(-3, 0).click().perform();
	}
	else
	{
		test.fail("Delete button is not enabled");
	}
	
}

public void Editdrug(String Classtext,ExtentTest test) throws IOException, InterruptedException
{

	WebElement text= driver.findElement(By.className(Classtext));
    WebElement Listrow = text.findElements(By.className("DataGridRow")).get(0);
    WebElement Edit=Listrow.findElements(By.className("DataGridCell")).get(0);
	if(Edit.isEnabled())
	{
	Actions action=new Actions(driver);
	action.moveToElement(Edit).click().perform();
	}
	else
	{
		test.fail("Edit button is not enabled");
	}
	
}

private Actions act;
public void edit(String Name) throws IOException, FindFailed
{
	      
	      String imagePath = Name;
	        Screen s = new Screen();
	        Pattern textPattern = new Pattern(imagePath);
	        Match match = s.find(textPattern);
	        match.click();
}



public void viewdataserachfunholiday(ExtentTest Test, WebDriver driver) throws IOException, FindFailed, InterruptedException {
    List<WebElement> Listrow = driver.findElements(By.className("DataGridRow"));

    for (WebElement link : Listrow) {
        List<WebElement> datarow = link.findElements(By.className("DataGridCell"));

        if (datarow.size() >= 2) {
            WebElement elementToSearch = datarow.get(2);
            String linkText = elementToSearch.getText();

            edit("D:\\Help\\Designation\\Search.PNG");

            WebElement searchBox = driver.switchTo().activeElement();
            searchBox.sendKeys(linkText);
            List<WebElement> dataGridRows = driver.findElements(By.className("DataGridRow"));

            if (dataGridRows.size() != 0) {
                WebElement data = dataGridRows.get(0).findElements(By.className("DataGridCell")).get(2);

                if (data.getText().contains(linkText)) {
                    Test.pass(linkText + " Searched element found");
                } else {
                    Test.fail(linkText + " Searched element not found");
                }
            } else {
                WebElement data = dataGridRows.get(0).findElements(By.className("DataGridCell")).get(4);

                if (data.getText().contains(linkText)) {
                    Test.pass(linkText + " Searched element found");
                } else {
                    Test.fail(linkText + " Searched element not found");
                }
            }

            // Clear the search box
            searchBox.clear();
            Thread.sleep(1000);
            demo.isempty(searchBox, linkText, Test, driver);
        }
    }
}



public void viewdataUser(ExtentTest test, WebDriver driver, String Text,int i,int j) throws IOException, FindFailed, InterruptedException {
    List<WebElement> Listrow = driver.findElements(By.className("DataGridRow"));
    System.out.println(Listrow.size());

    for (WebElement row : Listrow) {
        List<WebElement> datarow = row.findElements(By.className("DataGridCell"));
        System.out.println(datarow.size());
        if (datarow.size() >= 5) { 
            WebElement cell5 = datarow.get(i); // Accessing the 5th element (index 4)
            String cellText = cell5.getText();
            edit(Text);
            WebElement searchBox = driver.switchTo().activeElement();
            searchBox.sendKeys(cellText);

            List<WebElement> dataGridRows = driver.findElements(By.className("DataGridRow"));
            
            if (!datarow.isEmpty()) {
            	WebElement data = datarow.get(j);
                if (data.getText().toLowerCase().contains(cellText.toLowerCase())) {
                    test.pass(cellText + " Searched element found");
                } else {
                    test.fail(cellText + " Searched element not found");
                }
            }
            
            // Clear the search box
            searchBox.clear();
            Thread.sleep(1000);
            demo.isempty(searchBox, cellText, test, driver);
            break;
        }
    }
}

public void viewdataUserinvalid(ExtentTest test, WebDriver driver, String Text,int i,int j) throws IOException, FindFailed, InterruptedException {
   List<WebElement> Listrow = driver.findElements(By.className("DataGridRow"));             
   System.out.println(Listrow.size());                                                      
                                                                                            
   for (WebElement row : Listrow) {                                                         
       List<WebElement> datarow = row.findElements(By.className("DataGridCell"));           
       System.out.println(datarow.size());                                                  
       if (datarow.size() >= 5) {                                                           
           WebElement cell5 = datarow.get(i); // Accessing the 5th element (index 4)        
           String cellText = cell5.getText();                                               
           edit(Text);                                                                      
           WebElement searchBox = driver.switchTo().activeElement();                        
           searchBox.sendKeys(cellText);                                                    
            List<WebElement> dataGridRows = driver.findElements(By.className("DataGridRow"));
              
              if (dataGridRows.size()==0) {
              	test.pass("Search UserData Not displayed "+dataGridRows.size());
              }
              else
              {
              	test.fail("Search Userdata iddisplayed "+dataGridRows.size());  

                  } 
              
                                                                  
           searchBox.clear();                                     
           Thread.sleep(1000);                                    
           demo.isempty(searchBox, cellText, test, driver);       
           break;                                                 
   }    
        
   }  }
String Text;
private int OardeleteNUm;
  public String Roleselection(ExtentTest test, int i) throws InterruptedException, IOException {
  	    WebElement element = driver.findElements(By.className("ComboBox")).get(i);
  	    element.click();
  	    Thread.sleep(1000);
  	    List<WebElement> element1 = element.findElements(By.className("TextBlock"));

  	    int size = element1.size();
  	    System.out.println("Size of element1: " + size);

  	    if (size > 0) {
  	        Random rand = new Random();
  	        int randomIndex = rand.nextInt(size);
	
		        System.out.println("Random index: " + randomIndex);
		        
		        String ColorIndex = Integer.toString(randomIndex);
		        WebElement elementcolor = element1.get(randomIndex);
		        Text=elementcolor.getText();
  	        test.info(Text);
  	        
  	        Actions action = new Actions(driver);
  	        action.moveToElement(elementcolor).click().perform();
  	        
  	        if(element.getText().equals(Text))
  	        {
  	        	 demo.Textcomparsion(element, Text, test, driver);
  	        }
  	        else
  	        {
  	        	 element.click();
  		           WebElement Scroll = driver.findElement(By.className("Thumb"));
  		           WebElement Scroll1 = driver.findElements(By.className("RepeatButton")).get(1);
  		           Thread.sleep(3000);
  	           action.dragAndDrop(Scroll,Scroll1).perform();
  	           Thread.sleep(3000);
  	           action.moveToElement(elementcolor).click().perform();
  	        }
  	        if(element.getText().equals(Text))
  	        {
  	        	 demo.Textcomparsion(element, Text, test, driver);
  	        }
  	        else
  	        {
  	        	  element.click();
  		           WebElement Scroll = driver.findElement(By.className("Thumb"));
  		           WebElement Scroll1 = driver.findElements(By.className("RepeatButton")).get(0);
  		           Thread.sleep(3000);
  	           action.dragAndDrop(Scroll,Scroll1).perform();
  	           Thread.sleep(3000);
  	           action.moveToElement(elementcolor).click().perform();
  	        }
  	        
  	        
  	    } else {
  	        System.out.println("No TextBlock elements found within ComboBox.");
  	    }
  	    return Text;
  	}
  
  
  
	public  int List(List<WebElement> text, int val, Actions action) throws InterruptedException {
		int count=0;
		Iterator<WebElement> itr1 = text.iterator();
		int i = 1;
		while (itr1.hasNext()) {
			WebElement li = itr1.next();
	//		System.out.print(li.isDisplayed());
			
			action.moveToElement(li).perform(); 
			//Thread.sleep(500);
			System.out.print(li.getText() + "    "+count);
		//	System.out.print(li.getAttribute("HelpText"));   
			if (i == val) {
				System.out.println();
				i = 0;
				count++;
			}
			i++;
		}
		return count;
	}
	public  void radioButtonWithselect(WebElement radio,Actions act)
			throws InterruptedException {

		boolean ID = radio.isDisplayed();
		if (ID) {
			// System.out.println(radio.getText() +"radio button is Displayed "+ID);
			boolean ED = radio.isEnabled();
			if (ED) {
				// System.out.println("radio button selected" + radio.getText() + " is Enabled
				// "+ED);

				// System.out.println("******************Without clicking************");

				boolean SL = !radio.isSelected();
				if (SL) {
					act.moveToElement(radio).build().perform();
					if (radio.getText().equals("Yes")) {
						Thread.sleep(500);
						act.moveByOffset(-9, 0).click().build().perform();
					//	act.moveToElement(radio).click().build().perform();
					} else {
						act.moveToElement(radio).click().build().perform();
					}
			//		Assert.assertTrue(SL);
				}
			//	if (radio.isSelected())
				//	System.out.println(radio.getText() + " radio button selected " + radio.isSelected());
			//	else
				//	System.out.println(radio.getText() + " radio button selected " + radio.isSelected());
			}// else
			//	System.out.println(ED + "is disabled");
		} //else
			//System.out.println(ID + "is disabled");
	}

  
	 public String OarDelete(int ItemNoTodelete,int delete,String sitephase,ExtentTest report,WebDriver driver) throws InterruptedException, IOException {
			String OARName="-";
			WebElement tableElement = driver.findElement(By.xpath("//DataGrid[@AutomationId=\"Oardatagrid\"]"));
				 
			     List<WebElement> rows = tableElement.findElements(By.className("DataGridRow")); // Replace with your row class name
			      String[][] Actual = new String[rows.size()][6];
			      boolean Bool=false;
			     // Loop through rows and columns to populate the array
			      
			      if(Actual.length !=0){
				        for (int i = 0; i < rows.size(); i++) {
				        	if(i==ItemNoTodelete) {
			            java.util.List<WindowsElement> columns = rows.get(i).findElements(By.className("DataGridCell")); // Replace with your column class name
			            for (int j = 0; j < columns.size(); j++) {
			            	if(i==ItemNoTodelete && j==0) {
			            		OARName = columns.get(1).getText();
			            		columns.get(j).click();
			            		OardeleteNUm=ItemNoTodelete;
			            	
			            		System.out.print(OARName);
			            		 Bool = true;
			            		break;
			            	}
			            	Actual[i][j] = columns.get(j).getText();
			               System.out.print(Actual[i][j]);
			            }
			            
			            if(Bool) {
			            	break;
			            }
			            System.out.println();
			        }
				}
			      }report.info("List is Empty");
			      
			      return OARName;
		}
  
  
  
  
  
  
  
  
  
  
  
  
   } 