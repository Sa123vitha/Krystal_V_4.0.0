package com.krystal.project;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;

import java.util.Iterator;



import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.sikuli.hotkey.Keys;
import org.sikuli.script.FindFailed;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import io.appium.java_client.windows.WindowsDriver;
public class HolidaySettings extends ReferencefileChemotheraphy  {
	WebElement Holidaysettings;
	WebElement holidaysettings;
	WebElement holidayconfg;
	WebElement addfield;
	WebElement holidayname;
	WebElement holidaytype;
	WebElement normal;
	WebElement selectday;
	WebElement weekly1;
	WebElement selectdaydropdown;
	WebElement add1;

	WebElement holidaylist;
	WebElement searchholiday;
	WebElement listholidayname;
	WebElement dateday;
	WebElement listdescription;
	WebElement listconsecutive;
	WebElement HolidayType;
	WebElement addfield1;
	private HolidaySettingsPOM holiday;
	public static int testCaseCount = 1;

	
	private int count;
	private WebElement Addfield;

	DemographicsExternal demo;
	private LocalDate currentDate;
	private int day1;
	private int Nextday;
	private String Currentday1;
	private String Nextday1;
	Actions action;
	WebElement weekly;
	private WebElement  Reset;
	private WebElement Addiconnew;


	
	@BeforeClass
	public void setUp1() throws  InterruptedException, IOException {
	DesiredCapabilities appCapabilities = new DesiredCapabilities();
    appCapabilities.setCapability("app", "C:\\Program Files\\Panacea Medical Technologies\\Krystal\\Krystal.exe");
	driver = new WindowsDriver<WebElement>(new URL("http://127.0.0.1:4723"), appCapabilities);
	ReferenceSigin Sign=new ReferenceSigin();
	Sign.Login(driver);
	Sign.HolidaySettings(driver);
	holiday=new HolidaySettingsPOM(driver);
	demo=new DemographicsExternal() ;
	action=new Actions(driver);
  }
	
	
	
	//@Test(priority =1)
	public void button() throws InterruptedException{
	List<WebElement> elements = driver.findElements(By.className("Button"));
    Actions actions = new Actions(driver);
    for (WebElement element : elements) {
        actions.moveToElement(element).perform();
        System.out.println(element.getLocation());
        System.out.println(element.getText());
        System.out.println(count++);
        System.out.println("********************************************");
        Thread.sleep(1000);
    }
	}
	

	
	@Test(priority =1)
	public void ToverifyholidaysettingsLabel() throws IOException {
		test = extent.createTest("============GUI=====================");
	test = extent.createTest(guiTestCaseName()+" Holiday settings Label");	
	demo.Textcomparsion(holiday.holidaysettings, "Holiday Settings", test,driver);
	}
	

@Test(priority =2)
	public void ToverifyholidayconfigurationLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+"Holiday Configuration label");	
	demo.Textcomparsion(holiday.holidayconfg, "HOLIDAY CONFIGURATION", test,driver);
	
	}
 @Test(priority =3)
	public void ToverifyaddfieldLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+"Add Field Icon");	
	 Addfield=driver.findElements(By.className("Button")).get(6);
	 demo.isdisplayed(Addfield,"Addfield", test, driver);
	 demo.isEnabled(Addfield,"Addfield", test, driver);
	}
	
	
	
	@Test(priority =4)
	public void HolidaynameLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Holiday Name label"," Holiday Name label should be present ");	
	demo.Textcomparsion(holiday.holidayname, "Holiday Name", test,driver);
	}
	
	
@Test(priority =5)
	public void ToverifyenternameoftheholidayhereLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Enter name of the holiday here label"," Enter name of the holiday here label should be present ");	
	demo.Textcomparsion(holiday.entername, "Enter name of the holiday here", test,driver);
}

	
@Test(priority =6)
	public void ToverifyholidaytypeLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Holiday type label"," Holiday type label should be present ");	
	demo.Textcomparsion(holiday.holidaytype, "Holiday Type", test,driver);
}

	
@Test(priority =7)
	public void ToverifyholidayNormal() throws IOException {
	test = extent.createTest(guiTestCaseName()+"  Normal label"," Normal label should be present ");	
	demo.Textcomparsion(holiday.normal, "Normal", test,driver);
	}
	
	
@Test(priority =8)
public void ToverifyselectdayLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Select Date label"," Select Day label should be present ");	
demo.Textcomparsion(holiday.selectday, "Select Date", test,driver);
}




@Test(priority =9)
	public void ToverifyweeklyLabel() throws IOException, InterruptedException {
	test = extent.createTest(guiTestCaseName()+" Weekly label"," Weekly label should be present ");	
	demo.Textcomparsion(holiday.weekly, "Weekly", test,driver);
	holiday.weekly.click();
	Thread.sleep(2000);
	}

@Test(priority =10)
	public void ToverifyselectdaydropdownLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Select Day dropdown label"," Select Day dropdown label should be present ");	
	demo.Textcomparsion(holiday.selectdaydropdown, "Select Day", test,driver);
}

	
	
@Test(priority =11)
	public void ToverifycolorLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Color label"," Color label should be present ");	
	demo.Textcomparsion(holiday.color, "Color", test,driver);
	}
	
	
@Test(priority =12)
	public void ToverifydescriptionLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Description label"," Description label should be present ");	
	demo.Textcomparsion(holiday.description, "Description", test,driver);
}

@Test(priority =13)
	public void ToverifyentersomedescriptionabouttheholidayLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Enter some description about the holiday label"," Enter some description about the holiday label should be present ");	
	demo.Textcomparsion(holiday.desptext, "Enter some description about the holiday", test,driver);
	}
	
	
@Test(priority =14)
	public void ToverifyisconsecutiveyearlyLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+"  Is Consecutive Yearly label"," Is Consecutive Yearly label should be present ");	
	demo.Textcomparsion(holiday.consecutive, "Is Consecutive Yearly", test,driver);
}
	
	
@Test(priority =15)
	public void ToverifystartyearLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Start Year label"," Start Year label should be present ");	
	demo.Textcomparsion(holiday.startyear, "Start Year", test,driver);
	}
	
	
@Test(priority =16)
	public void ToverifyenterstartyearLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Enter Start Year label"," Start Year label should be present ");	
	demo.Textcomparsion(holiday.enteryear, "Enter the starting year", test,driver);
}
	
	
	
@Test(priority =17)
	public void ToverifyendyearLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" End Year label"," End Year label should be present ");	
	demo.Textcomparsion(holiday.endyear, "End Year", test,driver);
}
	

@Test(priority =18)
	public void ToverifyenterendingyearLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Enter the ending year label"," Enter the ending year label should be present ");	
	demo.Textcomparsion(holiday.endyeartext, "Enter the ending year", test,driver);
	}
	

@Test(priority =19)
	public void ToverifyaddLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Add Button"," Add Button should be present ");	
	demo.Textcomparsion(holiday.addbutton, "ADD", test,driver);
	demo.isEnabled(holiday.addbutton, "ADD", test,driver);
}
	
	
@Test(priority =20)
	public void ToverifyresetLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Reset label"," Reset label should be present ");	
	 Reset=driver.findElements(By.className("Button")).get(8);
	 demo.isdisplayed(Reset,"Reset", test, driver);
	 demo.isEnabled(Reset,"Addfield", test, driver);
	}
	
	
@Test(priority =21)
	public void ToverifyholidaylistLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Holiday List label"," Holiday List label should be present ");	
	demo.Textcomparsion(holiday.holidaylist, "HOLIDAY LIST", test,driver);
}
	

@Test(priority =22)
public void ToverifysearchholidayLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Search Holiday Name label"," Search Holiday label should be present ");	
demo.Textcomparsion(holiday.searchholiday, "Search Holiday Name", test,driver);
}


@Test(priority =23)
public void Toverifyholidayname() throws IOException {
test = extent.createTest(guiTestCaseName()+" Holiday name label in List"," Holiday Name label should be present ");	
demo.Textcomparsion(holiday.listholidayname, "Holiday Name", test,driver);
}
@Test(priority =24)
public void ToverifydatedayLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Date/day label in List"," Date/day label should be present ");	
demo.Textcomparsion(holiday.dateday, "Date / Day", test,driver);
}
@Test(priority =25)
public void Toverifydescription() throws IOException {
test = extent.createTest(guiTestCaseName()+" Description label in List"," Description label should be present ");	
demo.Textcomparsion(holiday.listdescription, "Description", test,driver);
}

@Test(priority =26)
public void Toverifyisconsecutiveyearlylabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Is Consecutive Yeraly label in List"," Is Consecutive Yeraly label should be present ");	
demo.Textcomparsion(holiday.listconsecutive, "Is Consecutive Yearly", test,driver);
}



@Test(priority =27)
public void Toverifyiscolorlabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Color label in List"," Is Color label should be present ");	
demo.Textcomparsion(holiday.color1, "Color", test,driver);
}

@Test(priority =28)
public void Toverifyholidaytype() throws IOException {
test = extent.createTest(guiTestCaseName()+" Holiday Type label in List","Holiday Type label should be present ");	
demo.Textcomparsion(holiday.HolidayType, "Holiday Type", test,driver);
}





	

//******************************************FUN*************************************************
@Test(priority =29)
public void Addbuttonclick() throws IOException
{
	 test = extent.createTest("=========================HOLIDAY NAME===============");
	 test = extent.createTest(funTestCaseName()+" Empty Holidayname, Click on Addbutton ","Input cannot be empty error message get displayed");
	 holiday.addbutton.click();
	 demo.isdisplayed(holiday.Emptyerror, "Input cannot be blank", test, driver);
	 demo.Textcomparsion(holiday.Emptyerror, "Input cannot be blank", test, driver);
}
@Test(priority =30)
public void ValidHolidayname() throws IOException, InterruptedException
{
	test = extent.createTest(funTestCaseName()+" Valid Holiday name","Valid Holiday name  should save the data");
	randomalpha(40);
	Validdatachemo(holiday.entername,randomStringalpha,driver,test);
 	Holidayadd(test);
}
@Test(priority =31)
public void Holidaynamealreadyexits() throws IOException, InterruptedException
{
	test = extent.createTest(funTestCaseName()+" Holiday Name exists errormessage","Holiday name exits");
	Validdatachemo(holiday.entername,randomStringalpha,driver,test);
	holiday.addbutton.click();
	Thread.sleep(1000);
	demo.isdisplayed(holiday.Nameexits, "Holiday name already exists.", test, driver);
	demo.Textcomparsion(holiday.Nameexits, "Holiday name already exists.", test, driver);
	Addiconnew=driver.findElements(By.className("Button")).get(6);
	Addiconnew.click();	
}
@Test(priority =32)
public void HolidaynameValidtextcases() throws InterruptedException, IOException
{
	String Text="Enter name of the holiday here";
	try {
	    
        randomUpper(15);
		ValidataUpper(Text);
		Holidayadd(test);
		Thread.sleep(1000);
	}
	catch(Exception e)
	{
	 test.error(e);
	}
		try {
		randomLower(15);
		ValidataLower(Text);
		Holidayadd(test);
		Thread.sleep(1000);
		}
		catch(Exception e)
		{
		 test.error(e);
		}
		try {
		randomalpha(15);
		ValidataUpperLower(Text);
		Holidayadd(test);
		Thread.sleep(1000);
		}
		catch(Exception e)
		{
		 test.error(e);
		}
		try {
		randomNumber(15);
		ValidataNumber(Text);
		Holidayadd(test);
		Thread.sleep(1000);
		}
		catch(Exception e)
		{
		 test.error(e);
		}
		try {
		randomstringtext(15);
		Validatachars(Text);
		Holidayadd(test);
		Thread.sleep(1000);
		}
		catch(Exception e)
		{
		 test.error(e);
		}
}

@Test(priority =33)
public void databaseconnectionsavecheck() throws IOException
{
	test = extent.createTest(dataTestCaseName()+"Verify the Saved Data to Database");
	Holidayconfig(test);
}

@Test(priority =34)
public void FunHolidaynameinvalid() throws IOException, InterruptedException {
	test = extent.createTest(funTestCaseName()+"Holiday name accepting more than 25chars");
	holiday.entername.click();
	String Ename="jhsjgdjgd8278637836736737337";
	driver.switchTo().activeElement().sendKeys(Ename);
	String Hname=driver.switchTo().activeElement().getText();
	Thread.sleep(1000);
	if(Hname.length()<=25)
	{
		 test.pass("Holiday name is accepting only"+Hname.length()+" and actual eneter length is"+Ename.length());
		 demo.isEnabled(holiday.addbutton,"ADD",test,driver);
		 Holidayadd(test);
	}
	else
	{
		 test.fail("Holiday name is accepting "+Hname.length()+" and actual eneter length is"+Ename.length());
	}
}
@Test(priority =35)
public void Holidayanamespecialchar1() throws IOException
{
	holiday.entername.click();
	
	test = extent.createTest(funTestCaseName()+"Invalid Holiday name Specialchars");	
	driver.switchTo().activeElement().sendKeys("\\,''");
	holiday.addbutton.click();
	demo.isdisplayed(holiday.Nameinvalid, "Input must not contain \\ , '' , '",test, driver);
	holiday.entername.click();
	driver.switchTo().activeElement().clear();
}

@Test(priority =35)
public void HolidayanamelessthanRange() throws IOException
{
	holiday.entername.click();
	driver.switchTo().activeElement().clear();
	test = extent.createTest(funTestCaseName()+"Holiday Name enetred less than 3");	
	driver.switchTo().activeElement().sendKeys("H1");
	holiday.addbutton.click();
	demo.isdisplayed(holiday.Namerange, "Input must have atleast 3 character", test,driver);
	holiday.entername.click();
	driver.switchTo().activeElement().clear();
}


//************************	Holiday type************************

@Test(priority =36)
public void Bydefaultnormal()throws IOException, InterruptedException
{
	    test = extent.createTest("=============HOLIDAY TYPE======================");
	    test = extent.createTest(funTestCaseName()+" Default normal is selected and Weekly is not selcted");
		demo.isSelected(holiday.normal, "Normal",test,driver);
		demo.BydefaultisSelected(holiday.weekly, "Weekly",test,driver);
}

@Test(priority =37)
public void Weekly()throws IOException, InterruptedException
{
	    test = extent.createTest(funTestCaseName()+" Click on the weekly Normal radiobutton is not selected");
	    holiday.weekly.click();
	    demo.isSelected(holiday.weekly, "Weekly",test,driver);
	    Thread.sleep(1000);
		demo.BydefaultisSelected(holiday.normal, "Normal",test,driver);	
}

@Test(priority =38)
public void Normal()throws IOException, InterruptedException
{
	    test = extent.createTest(funTestCaseName()+" Click on the Normal, Weekly radiobutton is not selected");
	    holiday.normal.click();
		demo.isSelected(holiday.normal, "Normal",test,driver);	
	    Thread.sleep(1000);
		demo.BydefaultisSelected(holiday.weekly, "Weekly",test,driver);	
}
@Test(priority =39)
public void Weeklysave() throws IOException, InterruptedException
{
	 test = extent.createTest(funTestCaseName()+" Click on the  Weekly, Save the data no errormessage get displayed");
	  randomalpha(40);
	  Validdatachemo(holiday.entername,randomStringalpha,driver,test);
	  holiday.weekly.click();
	  Thread.sleep(1000);
	  Holidayadd(test);
}
@Test(priority =40)
public void Normalsave() throws IOException, InterruptedException
{
	 test = extent.createTest(funTestCaseName()+" Click on the  Normal, Save the data no errormessage get displayed");
	  randomalpha(40);
	  Validdatachemo(holiday.entername,randomStringalpha,driver,test);
	  holiday.normal.click();
	  Thread.sleep(1000);
	  Holidayadd(test);
}

	
	@Test(priority =43)
	public void PreviousandNextday() throws IOException
	{
		test = extent.createTest(funTestCaseName()+" Click on the Calender icon, Previous button should be disabled and Nextbutton should be enabled");
		holiday.Calendar.click();
	    demo.BydefaultisEnabled(holiday.Previousdate, "Previousdate",test, driver);
	    demo.isEnabled(holiday.Nextdate, "Nextdate", test, driver);
	}
@Test(priority =41)
public void selectdate() throws IOException, InterruptedException
{
	test = extent.createTest(funTestCaseName()+" Click on the Currentdate, Save the data no errormessage get displayed");
	randomalpha(40);
	Validdatachemo(holiday.entername,randomStringalpha,driver,test);
	holiday.normal.click();
	
	holiday.Calendar.click();
	Random random=new Random();
	currentDate=LocalDate.now();
    day1=currentDate.getDayOfMonth();
    Currentday1=Integer.toString(day1);
    WebElement element=driver.findElement(By.name(Currentday1));
    element.click();
    Nextday=day1+1+random.nextInt(30-day1-1);
    Holidayadd(test);
}


@Test(priority =42)
public void SelectRandomday() throws IOException, InterruptedException
{
	test = extent.createTest(funTestCaseName()+" Click on the Nextdate, Save the data no errormessage get displayed");
	randomalpha(40);
	Thread.sleep(1000);
	Validdatachemo(holiday.entername,randomStringalpha,driver,test);
	holiday.normal.click();
	holiday.Calendar.click();
	Random random=new Random();
	Nextday=day1+1+random.nextInt(30-day1-1);
	Nextday1=Integer.toString(Nextday);
    WebElement element=driver.findElement(By.name(Nextday1));
    element.click();
    Holidayadd(test);
    
    holiday.Calendar.click();
    demo.BydefaultisEnabled(holiday.Previousdate, "Previousdate",test, driver);
    demo.isEnabled(holiday.Nextdate, "Nextdate", test, driver);
}

int randomNumber;
@Test(priority =43)
public void Selectnextmonth() throws IOException, InterruptedException
{
	test = extent.createTest(funTestCaseName()+" Click on the Nextdate, Save the data no errormessage get displayed");
	randomalpha(40);
	Validdatachemo(holiday.entername,randomStringalpha,driver,test);
	holiday.normal.click();
	holiday.Calendar.click();
	holiday.Nextdate.click();
	 Random rand = new Random();
     randomNumber = rand.nextInt(30) + 1;
     Nextday1=Integer.toString(randomNumber);
     WebElement element=driver.findElement(By.name(Nextday1));
     element.click();
     Holidayadd(test);
}


	@Test(priority =44)
public void SelectMonday() throws IOException, InterruptedException
{    test = extent.createTest(funTestCaseName()+" Weekly Select day Monday and Save data");
	randomalpha(40);
	Validdatachemo(holiday.entername,randomStringalpha,driver,test);
	holiday.weekly.click();
	dayselect("Monday",test,driver,"Monday");
}
	
	
	@Test(priority =45)
public void SelectTuesday() throws IOException, InterruptedException
{    test = extent.createTest(funTestCaseName()+" Weekly Select day Tuesday and Save data");
	randomalpha(40);
	Validdatachemo(holiday.entername,randomStringalpha,driver,test);
	holiday.weekly.click();
	dayselect("Tuesday",test,driver,"Tuesday");
}
	
	@Test(priority =46)
public void SelectWednesday() throws IOException, InterruptedException
{    test = extent.createTest(funTestCaseName()+" Weekly Select day Wednesday and Save data");
	randomalpha(40);
	Validdatachemo(holiday.entername,randomStringalpha,driver,test);
	holiday.weekly.click();
	dayselect("Wednesday",test,driver,"Wednesday");
}
	
	@Test(priority =47)
	public void SelectThursday() throws IOException, InterruptedException
	{    test = extent.createTest(funTestCaseName()+" Weekly Select day Thursday and Save data");
		randomalpha(40);
		Validdatachemo(holiday.entername,randomStringalpha,driver,test);
		holiday.weekly.click();
		dayselect("Thursday",test,driver,"Thursday");
	}
	
	@Test(priority =48)
	public void SelectFriday() throws IOException, InterruptedException
	{    test = extent.createTest(funTestCaseName()+" Weekly Select day Friday and Save data");
		randomalpha(40);
		Validdatachemo(holiday.entername,randomStringalpha,driver,test);
		holiday.weekly.click();
		dayselect("Friday",test,driver,"Friday");
	}
	
	@Test(priority =49)
	public void SelectSaturday() throws IOException, InterruptedException
	{   test = extent.createTest(funTestCaseName()+" Weekly Select day Saturday and Save data");
		randomalpha(40);
		Validdatachemo(holiday.entername,randomStringalpha,driver,test);
		holiday.weekly.click();
		dayselect("Saturday",test,driver,"Saturday");
	}
	
	
	
	public void dayselect(String Text,ExtentTest test,WebDriver driver,String EText) throws IOException, InterruptedException
	{
		WebElement Selectday=driver.findElements(By.className("ComboBox")).get(0);
		Selectday.click();
		WebElement day1=driver.findElement(By.name(Text));
		Actions action=new Actions(driver);
		action.moveToElement(day1).click().perform();
		 demo.Textcomparsion(day1, EText, test, driver);
	     Holidayadd(test);
	}


    
WebElement element;
		  




int randomIndex;
//@Test(priority =50)   // Need to check
public void color5() throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" color");
    WebElement element = driver.findElements(By.className("ComboBox")).get(1);
    element.click();
    List<WebElement> element1 = element.findElements(By.className("ListBoxItem"));
    int size = element1.size();
    System.out.println(size);
    Random rand = new Random();
    int randomIndex = rand.nextInt(size); // No need to add 1 here
    System.out.println(randomIndex);
    if (randomIndex <= 9) {
        String ColorIndex = Integer.toString(randomIndex);
        WebElement elementcolor = driver.findElement(By.name(ColorIndex));
        elementcolor.click();
    } else {
        Actions action = new Actions(driver);
        WebElement element4 = driver.findElement(By.className("Thumb"));
        action.contextClick(element4).perform();
        WebElement element5 = driver.findElement(By.name("Page Down"));
       
        action.moveToElement(element5).click().perform();
        String ColorIndex = Integer.toString(randomIndex);
        WebElement elementcolor = driver.findElement(By.name(ColorIndex));
        elementcolor.click();    
    }   
}
int randomIndex1;
//@Test(priority =50)   // Need to check
public void color6() throws InterruptedException, IOException {
	test = extent.createTest(funTestCaseName()+" color");
	/*
    WebElement element = driver.findElements(By.className("ComboBox")).get(1);
    element.click();
    Thread.sleep(1000);
    List<WebElement> element1 = element.findElements(By.className("ListBoxItem"));
    int size = element1.size();
    System.out.println("Size of element1: " + size);

    if (size > 0) {
        Random rand = new Random();
        int randomIndex = rand.nextInt(size);

        System.out.println("Random index: " + randomIndex);
        
        String ColorIndex = Integer.toString(randomIndex);
        WebElement elementcolor = element1.get(randomIndex);
        Actions action = new Actions(driver);
        action.moveToElement(elementcolor).doubleClick().perform();
        String Text=elementcolor.getText();
        System.out.println(Text);
    } else {
        System.out.println("No TextBlock elements found within ComboBox.");
        // Handle the scenario where there are no elements in the list
        // You might want to perform a different action or log a message here
    }
    */
    
    Roleselection(test,1);
    
     
}






















@Test(priority =50)
public void descriptionalpha() throws IOException, InterruptedException
{
	test = extent.createTest("============DESCRIPTION=================");
	randomNumber(15);
	ValidataNumber("Enter name of the holiday here");
	
	holiday.Holidaydescription.click();
	randomalpha(15);
	ValidataUpperLower("Enter some description about the holiday");
	Holidayadd(test);
}

@Test(priority =51)
public void descriptionnumbers() throws IOException, InterruptedException
{
	randomUpper(15);
	ValidataUpper("Enter name of the holiday here");
	
	holiday.Holidaydescription.click();
	randomNumber(15);
	ValidataNumber("Enter some description about the holiday");
	Holidayadd(test);
}


@Test(priority =52)
public void Holidayanamespecialchar() throws IOException
{
	holiday.Holidaydescription.click();
	test = extent.createTest(funTestCaseName()+"Invalid description Specialchars");	
	driver.switchTo().activeElement().sendKeys("\\,''");
	holiday.addbutton.click();
	demo.isdisplayed(holiday.Nameinvalid, "Invalid Holiday name Specialchars",test, driver);
	holiday.Holidaydescription.click();
	driver.switchTo().activeElement().clear();
	holiday.holidayname.clear();
}


//***********************************************Consicutive yearly*******************
WebElement consectiveEnable;
private WebElement Addicon;

@Test(priority =53)
//Testcase1
public void isconsectiveEnable() throws IOException, InterruptedException
{
	test = extent.createTest("============CONSECUTIVE YEARLY=================");
	test = extent.createTest(guiTestCaseName()+" Default consecutive yearly is enable");
	consectiveEnable=driver.findElements(By.name("Is Consecutive Yearly")).get(1);
	Thread.sleep(2000);
	demo.isEnabled(consectiveEnable, "Is Consecutive Yearly",test,driver);
}

@Test(priority =54)
public void isdisableconsecutive() throws IOException  // Consecuitive year should be disable
{
	test = extent.createTest(guiTestCaseName()+" Consecutive yearly is enable then start year and end year textbox should not enable");
	demo.BydefaultisEnabled(holiday.enteryear,"Start year",test,driver);
	demo.BydefaultisEnabled(holiday.endyeartext,"End year",test,driver);	
}

@Test(priority =55)
public void isenableconsecutive() throws IOException
{
	test = extent.createTest(funTestCaseName()+" Click on the consecutive yearly, it should be disabled");
	action.moveToElement(consectiveEnable).click().perform();
	demo.isEnabled(consectiveEnable,"Consective yearly",test,driver);
}

@Test(priority =56)
public void consecutivetextboxenable() throws IOException
{
	test = extent.createTest(guiTestCaseName()+" Start year and end year is Enabled");
	demo.isEnabled(holiday.enteryear,"Start year",test,driver);
	holiday.enteryear.click();
	demo.isEnabled(holiday.endyeartext,"End year",test,driver);
	holiday.endyeartext.click();
}

@Test(priority =57)
public void Startyearinvaliddata() throws IOException
{
	test = extent.createTest("============START AND END YEAR=================");
	holiday.entername.click();
	driver.switchTo().activeElement().clear();
	driver.switchTo().activeElement().sendKeys("New year");
	if(holiday.enteryear.isEnabled())
	{
		test = extent.createTest(funTestCaseName()+" Start year should not accept the alphebhets");
		Invaliddata(holiday.enteryear, "ABCHGHSGHFSHGDHGDD");
		driver.switchTo().activeElement().clear();
		
		test = extent.createTest(funTestCaseName()+" Start year should not accept the specialchars");
		Invaliddata(holiday.enteryear, "#$%&()*+-./:;<=>?@[]^_`{|}~");
		driver.switchTo().activeElement().clear();
	
		test = extent.createTest(funTestCaseName()+" Start year should not accept the invalidchars");
		Invaliddata(holiday.enteryear,  "\\,\",'");
		driver.switchTo().activeElement().clear();
		
		test = extent.createTest(funTestCaseName()+" Start year should not accept the aplhspecialchars");
		Invaliddata(holiday.enteryear,  "shgdjdgd&^&%&");
		driver.switchTo().activeElement().clear();
		
		test = extent.createTest(funTestCaseName()+" Start year enetered  is less than the current year error message is displayed");
		driver.switchTo().activeElement().sendKeys("2022");
		holiday.addbutton.click();
		demo.isdisplayed(holiday.starterror, "Range:[2023 to 9999]", test, driver);
		demo.Textcomparsion(holiday.starterror, "Range:[2023 to 9999]", test,driver);
		holiday.enteryear.click();
		driver.switchTo().activeElement().clear();
		test = extent.createTest(funTestCaseName()+" Start year enetered  is more than than the current year error message is displayed");
		driver.switchTo().activeElement().sendKeys("10000");
		String element=driver.switchTo().activeElement().getText();
		if(element.length()<=4)
		{
		   test.pass("Start Year is not accepting more than the 4digits"+element.length());	
		}
		else {
			test.fail("Start year is accepting more than the 4digits"+element.length());
		}
		driver.switchTo().activeElement().clear();	
	}
	else
	{
		 test.fail("Start year is disabled and Not able to enter the text");
	}
}
@Test(priority =58)
public void Startvaliddata() throws IOException
{
	test = extent.createTest(funTestCaseName()+" Start year should accept the numbers");
	holiday.enteryear.click();
	driver.switchTo().activeElement().sendKeys("2023");
	WebElement Actualyear=driver.switchTo().activeElement();
	demo.Textcomparsion(Actualyear, "2023", test,driver);
}
@Test(priority =59)
public void Endyearinvaliddata() throws IOException
{
	test = extent.createTest(funTestCaseName()+" Consecutive yearly is disable then end  year  is enabled");
	holiday.endyeartext.click();
	demo.isEnabled(holiday.endyeartext, "End year",test,driver);
	if(holiday.endyeartext.isEnabled())
	{
		test = extent.createTest(funTestCaseName()+" End year should not accept the alphebhets");
		Invaliddata(holiday.endyeartext, "ABCHGHSGHFSHGDHGDD");
		driver.switchTo().activeElement().clear();
		test = extent.createTest(funTestCaseName()+" End year should not accept the specialchars");
		Invaliddata(holiday.endyeartext, "#$%&()*+-./:;<=>?@[]^_`{|}~");
		driver.switchTo().activeElement().clear();
		test = extent.createTest(funTestCaseName()+" End year should not accept the invalidchars");
		Invaliddata(holiday.endyeartext,  "\\,\",'");
		driver.switchTo().activeElement().clear();
		test = extent.createTest(funTestCaseName()+" End should not accept the alphaspecialchars");
		Invaliddata(holiday.endyeartext,  "shgdjdgd&^&%&");
		driver.switchTo().activeElement().clear();
		test = extent.createTest(funTestCaseName()+" End enetered  is less than the current year error message is displayed");
		driver.switchTo().activeElement().sendKeys("2022");
		holiday.addbutton.click();
		demo.isdisplayed(holiday.enderror, "Ending year cannot be less than starting year!", test, driver);
		demo.Textcomparsion(holiday.enderror, "Ending year cannot be less than starting year!", test,driver);
		holiday.endyeartext.click();
		driver.switchTo().activeElement().clear();
		test = extent.createTest(funTestCaseName()+"End year enetered  is more than than the 4digits it should not accept the data");
		driver.switchTo().activeElement().sendKeys("10000");
		String element=driver.switchTo().activeElement().getText();
		if(element.length()<=4)
		{
		   test.pass("End Year is not accepting more than the 4digits"+element.length());	
		}
		else {
			test.fail("End year is accepting more than the 4digits"+element.length());
		}
		driver.switchTo().activeElement().clear();
	}
	else
	{
		 test.fail("Start year is disabled and not able to enter the text");
	}
}

@Test(priority =61)
public void Endyearvalid() throws IOException, InterruptedException
{
	test = extent.createTest(funTestCaseName()+"End year is accept the numbers");
	driver.switchTo().activeElement().sendKeys("2025");
	WebElement Endyear=driver.switchTo().activeElement();
	demo.Textcomparsion(Endyear,"2025", test,driver);
	Holidayadd(test);
}

@Test(priority =62)
public void reseticonname() throws IOException, InterruptedException
{
	test = extent.createTest("============RESET=================");
	test = extent.createTest(funTestCaseName()+" Reset Holiday name");
	holiday.entername.click();
	Thread.sleep(1000);
	driver.switchTo().activeElement().sendKeys("Hospital holiday");
    holiday.reset.click();
	Thread.sleep(1000);
	demo.isempty(holiday.entername, "Hospital holiday", test,driver);
}
@Test(priority =63)
public void reseticonholidaytype() throws IOException, InterruptedException
{
	test = extent.createTest(funTestCaseName()+" Reset Holiday type");
	holiday.weekly.click();
	Thread.sleep(1000);
	holiday.reset.click();
	Thread.sleep(1000);
	demo.isSelected(holiday.normal, "Normal",test,driver);
}
@Test(priority =64)
public void reseticoncolor() throws IOException, InterruptedException
{
	//test = extent.createTest(funTestCaseName()+"To verify Reset color type");
	By locator = By.className("ComboBox");
	List<WebElement> elements = driver.findElements(locator);
	Thread.sleep(1000);
	int desiredIndex = 1; 
	if (desiredIndex < elements.size()) {
	Thread.sleep(1000);
	   colorelement = elements.get(desiredIndex);
	   colorelement.click();
	Thread.sleep(1000);

	WebElement colorblue=driver.findElement(By.name("Blue"));
	WebElement aliceblue=driver.findElement(By.name("AliceBlue"));
	Actions actions = new Actions(driver);
	actions.doubleClick(colorblue).perform();
	Thread.sleep(1000);
	holiday.reset.click();
	Thread.sleep(1000);
	}
}
@Test(priority =65)
public void reseticondescription() throws IOException, InterruptedException
{
	test = extent.createTest(funTestCaseName()+" Reset description");
	holiday.Holidaydescription.click();
	driver.switchTo().activeElement().sendKeys("Every week Saturday decalred as holiday");
	holiday.reset.click();
	Thread.sleep(1000);
	demo.isempty(holiday.Holidaydescription, "Every week Saturday decalred as holiday", test,driver);
	
}
@Test(priority =66)
public void resetconsectuive()throws IOException, InterruptedException
{
	test = extent.createTest(funTestCaseName()+" Reset consecutiveyearly");
	consectiveEnable=driver.findElements(By.name("Is Consecutive Yearly")).get(1);
	action.moveToElement(consectiveEnable).click().perform();
	holiday.enteryear.click();
	driver.switchTo().activeElement().sendKeys("2024");
	holiday.endyeartext.click();
	driver.switchTo().activeElement().sendKeys("2026");
	Thread.sleep(1000);
	holiday.reset.click();
	demo.isempty(holiday.enteryear, "startyear", test,driver);
	demo.isempty(holiday.endyeartext, "endyear", test,driver);	
	demo.isEnabled(consectiveEnable, "Is Consecutive Yearly",test,driver);
}

@Test(priority =71)
public void Addiconname() throws IOException, InterruptedException
{
	test = extent.createTest("============ADDICON=================");
	test = extent.createTest(funTestCaseName()+" Enter Holiday name and click on addicon");
	holiday.entername.click();
	Thread.sleep(1000);
	Addicon=driver.findElements(By.className("Button")).get(6);
	driver.switchTo().activeElement().sendKeys("Hospital holiday");
    Addicon.click();
	Thread.sleep(1000);
	demo.isempty(holiday.entername, "Hospital holiday", test,driver);
}
@Test(priority =72)
public void Addiconholidaytype() throws IOException, InterruptedException
{
	test = extent.createTest(funTestCaseName()+" Select the Holiday type and click on the Addicon");
	holiday.weekly.click();
	Thread.sleep(1000);
	 Addicon.click();
	Thread.sleep(1000);
	demo.isSelected(holiday.normal, "Normal",test,driver);
}
@Test(priority =73)
public void Addiconcolor() throws IOException, InterruptedException
{
	//test = extent.createTest(funTestCaseName()+"To verify Reset color type");
	By locator = By.className("ComboBox");
	List<WebElement> elements = driver.findElements(locator);
	Thread.sleep(1000);
	int desiredIndex = 1; 
	if (desiredIndex < elements.size()) {
	Thread.sleep(1000);
	   colorelement = elements.get(desiredIndex);
	   colorelement.click();
	Thread.sleep(1000);
	WebElement colorblue=driver.findElement(By.name("Blue"));
	WebElement aliceblue=driver.findElement(By.name("AliceBlue"));
	Actions actions = new Actions(driver);
	actions.doubleClick(colorblue).perform();
	Thread.sleep(1000);
	 Addicon.click();
	Thread.sleep(1000);
	}
}
@Test(priority =74)
public void Addicondescription() throws IOException, InterruptedException
{
	test = extent.createTest(funTestCaseName()+" Enter the description and click on the Addicon");
	holiday.Holidaydescription.click();
	driver.switchTo().activeElement().sendKeys("Every week Saturday decalred as holiday");
	Addicon.click();
	Thread.sleep(1000);
	demo.isempty(holiday.Holidaydescription, "Every week Saturday decalred as holiday", test,driver);
	
}
@Test(priority =75)
public void Addconsectuive()throws IOException, InterruptedException
{
	test = extent.createTest(funTestCaseName()+" Consecutiveyearly and click on the add icon");
	consectiveEnable=driver.findElements(By.name("Is Consecutive Yearly")).get(1);
	action.moveToElement(consectiveEnable).click().perform();
	holiday.enteryear.click();
	driver.switchTo().activeElement().sendKeys("2024");
	holiday.endyeartext.click();
	driver.switchTo().activeElement().sendKeys("2026");
	Thread.sleep(1000);
	Addicon.click();
	demo.isempty(holiday.enteryear, "startyear", test,driver);
	demo.isempty(holiday.endyeartext, "endyear", test,driver);	
	demo.isEnabled(consectiveEnable, "Is Consecutive Yearly",test,driver);
}




@Test(priority=76)
public void Editenable()
{
	try {
		test = extent.createTest("===============EDIT==========");
		test = extent.createTest(guiTestCaseName()+" Edit icon are enabled by default");
		vieweditenable("ChemotherapyConfigurationSection4View", 0,test,driver,"Ëdit");
	}
		catch(Exception e)
		{
			test.fail("Edit Button is not enabled");
		}
}

@Test(priority=77)
public void EditHolidayok() throws InterruptedException, IOException, FindFailed
{
	test = extent.createTest(funTestCaseName()+" Click on Holiday Edit data, Without editing click on the Update button");
	try {
		Editdrug(test,"Edit", 0,0);
		}
		catch(Exception e)
		{
			test.fail("Edit Button is not enabled");
		}
	try {
		demo.isdisplayed(holiday.Update, "UPDATE", test, driver);
		demo.isEnabled(holiday.Update, "UPDATE", test, driver);
		HolidayUpdate(test);
	}
	catch(Exception e)
	{
		test.fail(e);
	}	
}

// MODIFIYING NEED TO CEHECK HOW TO ADD
public void ModifyHolidayok() throws InterruptedException, IOException, FindFailed
{
	test = extent.createTest(funTestCaseName()+" Click on Holiday Edit data, Modify and click on the Update button");
	try {
		Editdrug(test,"Edit", 0,0);
		}
		catch(Exception e)
		{
			test.fail("Edit Button is not enabled");
		}
	try {
		demo.isdisplayed(holiday.Update, "UPDATE", test, driver);
		demo.isEnabled(holiday.Update, "UPDATE", test, driver);
		HolidayUpdate(test);
	}
	catch(Exception e)
	{
		test.fail(e);
	}	
}

String Holidayname;
@Test(priority=80)
public void Deleteenable()
{
	try {
		test = extent.createTest("=============DELETE==========");
		test = extent.createTest(guiTestCaseName()+" Delete icon are enabled by default");
		vieweditenable("ChemotherapyConfigurationSection4View", 1,test,driver,"Delete");
		WebElement Deletedata=driver.findElements(By.className("DataGridCell")).get(2);
		Holidayname=Deletedata.getText();
		System.out.println(Holidayname);
	}
		catch(Exception e)
		{
			test.fail("Edit Button is not enabled");
		}
}

@Test(priority=81)
public void DeleteHolidayok() throws InterruptedException, IOException, FindFailed
{
	test = extent.createTest(funTestCaseName()+" Click on Holiday Delete data, Data should be deleted");
	try {
		Editdrug(test,"Delete", 0,1);
		}
		catch(Exception e)
		{
			test.fail("Delete Button is not enabled");
		}
	try {
		
		SitesaveCancel1("Holiday Delete", "Do you want to delete the selected holiday?", "Holiday Delete", "Do you want to delete the selected holiday?",0,driver,test);
	}
	catch(Exception e)
	{
		test.fail(e);
	}	
	
	try {
		Editdrug(test,"Delete", 0,1);
		Sitesave1("Holiday Delete", "Do you want to delete the selected holiday?", "Holiday Delete", "Do you want to delete the selected holiday?",0,driver,test);
		Sitesave1("Holiday Delete", "Selected Holiday deleted.", "Holiday Delete", "Selected Holiday deleted.",0,driver,test);
	}
	catch(Exception e)
	{
		test.fail(e);
	}	
	
	}


@Test(priority = 82)
public void deletedatanotdisplayed() throws IOException
{
	test = extent.createTest(funTestCaseName()+"Deleted data not displayed");
	WebElement Deletedata=driver.findElements(By.className("DataGridCell")).get(2);
	demo.ByInvalidErrormessage(Deletedata, Holidayname, test, driver);
}
@Test(priority = 83)
public void deleteddataenetred() throws IOException, InterruptedException
{
	test = extent.createTest(funTestCaseName()+"Deleted Name entered it should allow to save the data");
	holiday.entername.click();
	driver.switchTo().activeElement().sendKeys(Holidayname);
	Holidayadd(test);
}
@Test(priority = 84)
public void holidaysearch() throws IOException, FindFailed, InterruptedException
{
	test = extent.createTest("=============SEARCH==========");
	test = extent.createTest(funTestCaseName()+"To verify the Holiday search");
	viewdataserachfunholiday(test,driver);
}


public void Editdrug(ExtentTest test, String Text, int i,int j) throws IOException, InterruptedException
{

    WebElement Listrow = driver.findElements(By.className("DataGridRow")).get(i);
    WebElement Edit=Listrow.findElements(By.className("DataGridCell")).get(j);
	if(Edit.isEnabled())
	{
	Actions action=new Actions(driver);
	action.moveToElement(Edit).click().perform();
	}
	else
	{
		test.fail(Text+ "Button is not enabled");
	}
	
}

WebElement colorelement;
WebElement color1;
WebElement color2;
WebElement color3;
WebElement color4;
WebElement color5;
WebElement color6;
WebElement color7;
WebElement color8;
WebElement color10;









		public void color() throws InterruptedException, IOException
		{
			By locator = By.className("ComboBox");
			List<WebElement> elements = driver.findElements(locator);
			Thread.sleep(2000);
			int desiredIndex = 1; 
			if (desiredIndex < elements.size()) {
			Thread.sleep(2000);
			   colorelement = elements.get(desiredIndex);
			   colorelement.click();
			   Thread.sleep(2000);
			    color1=driver.findElement(By.name("AliceBlue"));
			    color2=driver.findElement(By.name("AntiqueWhite"));
			    color3=driver.findElement(By.name("Aqua"));
			    color4=driver.findElement(By.name("Aquamarine"));
			    color5=driver.findElement(By.name("Azure"));
			    color6=driver.findElement(By.name("Beige"));
			    color7=driver.findElement(By.name("Bisque"));
			    color8=driver.findElement(By.name("Black"));
			    color10=driver.findElement(By.name("Blue"));
			   
			   Thread.sleep(2000);
			   colorclick(color1,"AliceBlue");
			   Thread.sleep(2000);
			   test = extent.createTest(funTestCaseName()+" To verify the AliceBlue is selected and displayed");	
     		//  ExternalBeamGUI1(color1, "AliceBlue", test);
     		   Thread.sleep(2000);
     		   colorclick(color2,"AntiqueWhite");
     		  Thread.sleep(2000);
			   test = extent.createTest(funTestCaseName()+" To verify the AntiqueWhite is selected and displayed");	
     		 //  ExternalBeamGUI1(color2, "AntiqueWhite", test);
     		   Thread.sleep(2000);
     		   colorclick(color3,"Aqua");
     		  Thread.sleep(2000);
			   test = extent.createTest(funTestCaseName()+" To verify the Aqua is selected and displayed");	
    		  // ExternalBeamGUI1(color3, "Aqua", test);
    		   Thread.sleep(2000);
    		   colorclick(color4,"Aquamarine");
    		   Thread.sleep(2000);
			   test = extent.createTest(funTestCaseName()+" To verify the Aquamarine is selected and displayed");	
    		 //  ExternalBeamGUI1(color4, "Aquamarine", test);
    		   Thread.sleep(2000);
    		   colorclick(color5,"Azure");
    		   Thread.sleep(2000);
			   test = extent.createTest(funTestCaseName()+" To verify the Azure is selected and displayed");	
    		//   ExternalBeamGUI1(color5, "Azure", test);
    		   Thread.sleep(2000);
    		   colorclick(color6,"Beige");
    		   Thread.sleep(2000);
			   test = extent.createTest(funTestCaseName()+" To verify the Beige is selected and displayed");	
    		//   ExternalBeamGUI1(color6, "Beige", test);
			} 
			else 
			{
				test.fail("Element not found or insufficient elements matching the criteria.");
			    
			}
		    	
		}

public void colorclick(WebElement elementday, String text) throws InterruptedException
{	
	    colorelement.click();
		Actions actions = new Actions(driver);
		actions.doubleClick(elementday).perform();  
}






/*

// Not considred below code
WebElement editelement;
WebElement Updatebutton;

@Test(priority =45)
public void editbutton() throws InterruptedException, IOException
{
	
	test = extent.createTest(funTestCaseName()+" To verify click on the edit icon update button is enabled");
	By locator = By.name("EDIT");
	List<WebElement> elements = driver.findElements(locator);
	Thread.sleep(2000);
	int desiredIndex = 5;
	if (desiredIndex < elements.size()) {
		editelement = elements.get(desiredIndex);
		editelement.click();
		Updatebutton=driver.findElement(By.name("UPDATE"));
		demo.isEnabled(Updatebutton,"UPDATE",test,driver);

	}
}

@Test(priority =46)
public void deletebutton() throws InterruptedException, IOException
{
	holiday.entername.click();
	WebElement deleteicon=driver.findElement(By.name("DELETE"));
	deleteicon.click();
	Thread.sleep(2000);
	Holidayadd(test);
}

WebElement editelementnew;
@Test(priority =47)
public void updatebutton() throws InterruptedException, IOException
{
	holiday.entername.click();
	String editname=driver.switchTo().activeElement().getText();
	driver.switchTo().activeElement().clear();
	driver.switchTo().activeElement().sendKeys("Hjhfgjf hello");
	String updatedname=driver.switchTo().activeElement().getText();
	Updatebutton.click();
	Thread.sleep(2000);
	Holidayadd(test);
	Thread.sleep(3000);
	Actions actions = new Actions(driver);
    actions.moveByOffset(-100, 0).perform();
    holiday.entername.click();
	By locator = By.name("EDIT");
	List<WebElement> editelements = driver.findElements(locator);
	Thread.sleep(2000);
	int Index = 5;
	if (Index < editelements.size()) {
		editelementnew = editelements.get(Index);
		editelementnew.click();
		Updatebutton=driver.findElement(By.name("UPDATE"));
		demo.isEnabled(Updatebutton,"UPDATE",test,driver);
	}
	Thread.sleep(2000);
	holiday.entername.click();
    WebElement validname=driver.switchTo().activeElement();
    demo.Textcomparsion(validname, updatedname, test,driver);
}
@Test(priority =48)
public void ToverifysearchLabel() throws IOException {
test = extent.createTest(funTestCaseName()+" To verify the Search Holiday label"," Search Holiday label should be present ");	
//WebElement searchholiday = driver.findElement(By.xpath("//Custom[@ClassName=\"HolidayMainView\"]/Custom[@ClassName=\"HolidaySection1View\"]/Edit[@ClassName=\"TextBox\"]/Edit[starts-with(@AutomationId,\"presenter\")]"));
searchholiday=driver.findElement(By.name("Search Holiday"));
demo.Textcomparsion(searchholiday, "Search Holiday", test,driver);
searchholiday.click();
driver.switchTo().activeElement().sendKeys("Hjhfgjf hello");
WebElement search=driver.switchTo().activeElement();
demo.Textcomparsion(search, "Hjhfgjf hello", test,driver);
driver.switchTo().activeElement().clear();


}

@Test(priority =49)
public void serachlist() throws IOException
{
	By locator = By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"HolidayMainView\"]/Custom[@ClassName=\"HolidaySection1View\"]/DataGrid[@ClassName=\"DataGrid\"]/DataItem[@ClassName=\"DataGridRow\"][@Name=\"Presentation.UiElements.ViewModels.TableViewModel\"]/Custom[@ClassName=\"DataGridCell\"]");
	List<WebElement> editelements = driver.findElements(locator);
	 int elementCount = editelements.size();
     System.out.println("Number of elements found: " + elementCount);
     searchholiday.click();
     driver.switchTo().activeElement().clear();
     demo.isempty(searchholiday, "Hjhfgjf hello", test,driver);
     List<WebElement> editelements1 = driver.findElements(locator);
	 int elementCount1 = editelements.size();
     System.out.println("Number of elements found: " + elementCount1);
     
     if(elementCount!=elementCount1)
     {
    	 test.pass("Search is working correctly");
     }
     else
     {
    	 test.fail("Search is not working correctly");
     }
}


*/

public void selectdayclick(WebElement elementday, String text) throws InterruptedException
{
	     elementday.click();
	 	Actions actions = new Actions(driver);
		actions.doubleClick(elementday).perform();  

}

public void Holidayadd(ExtentTest test) throws InterruptedException, IOException
{
	holiday.addbutton.click();
	Thread.sleep(1000);
	Sitesave1("Holiday Add", "Holiday Added on selected date.", "Holiday Add", "Holiday Added on selected date.",0,driver,test);
}

public void HolidayUpdate(ExtentTest test) throws InterruptedException, IOException
{
	holiday.Update.click();
	Thread.sleep(1000);
	Sitesave1("Holiday Update", "Selected Holiday updated.", "Holiday Update", "Selected Holiday updated.",0,driver,test);
}


public void InvalidRangedata(WebElement Name, String Text) throws IOException
{
	Name.click();
	driver.switchTo().activeElement().sendKeys(Text);
	demo.ByInvalidErrormessage(Name, Text, test,driver);
	demo.Textcomparsion(Name, "Text", test,driver);
}

public void Invaliddata(WebElement Name, String Text) throws IOException
{
	Name.click();
	driver.switchTo().activeElement().sendKeys(Text);
	demo.isempty(Name,Text, test,driver);
}

WebElement  AddHoliday;
WebElement  AddHolidaydescription;





	public void captureScreenshot(String screenshotName) {
	    try {
	        TakesScreenshot screenshot = (TakesScreenshot) driver;
	        File source = screenshot.getScreenshotAs(OutputType.FILE);
	        File destination = new File(screenshotName);
	        FileUtils.copyFile(source, destination);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
	 public void Holidayconfig(ExtentTest test1) throws IOException {
		    try {
		        ArrayList<HashMap<String, String>> dataEntries = class1.getDataFromDatabaseHoliday();

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

@AfterSuite
public void tearDown() {
    extent.flush();
}
	
	
// Note: Color dropdown selcting is pending no particular elements are there for that	
	
	
	
	
	
}
