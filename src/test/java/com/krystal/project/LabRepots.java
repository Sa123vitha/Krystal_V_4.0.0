package com.krystal.project;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import io.appium.java_client.windows.WindowsDriver;
import net.sourceforge.jtds.jdbc.DateTime;

public class LabRepots extends ReferencefileChemotheraphy {
	
private WebElement Userbx;
private WebElement Pswdbox;
private WebElement labreports;
private WebElement labreportstitle;
private WebElement Import;
LoginPOM login;
private char[] DateTime;
private Actions action;
private Actions act;


@Test(priority =1)
public void Launch()  throws InterruptedException, IOException {
//DesiredCapabilities appCapabilities = new DesiredCapabilities();
//appCapabilities.setCapability("app", "C:\\Program Files\\Panacea Medical Technologies\\Krystal\\Krystal.exe");
//driver = new WindowsDriver<WebElement>(new URL("http://127.0.0.1:4723"), appCapabilities);
ReferenceSigin Sign=new ReferenceSigin();
Sign.Login(driver);
Sign.Labreports(driver);
login= new LoginPOM(driver);
Labreports();
action=new Actions(driver);
act=new Actions(driver);
}

public void Labreports() throws IOException
{
	test = extent.createTest("!!!!!!!!!!LAB REPORTS MODULE!!!!!!!");
	test = extent.createTest(guiTestCaseName()+" Lab reports label"," Lab reports label should be present ");	
	demo.Textcomparsion(login.labreports, "LAB REPORTS", test,driver);
	demo.isEnabled(login.labreports, "LAB REPORTS", test,driver);
	login.labreports.click();
}
@Test(priority =1)
public void Titlename() throws IOException
{
	test = extent.createTest(guiTestCaseName()+" Lab reports Title Name"," Lab reports Titlename should be present ");	
	demo.Textcomparsion(login.labreportstitle, "Lab Reports", test,driver);
}

@Test(priority =2)
public void ImportOne() throws IOException, Exception
{
	test = extent.createTest(funTestCaseName()+" Click on the Import button,Select the file. Pop-up message should get displayed");
	login.ImportReport.click();
	Thread.sleep(1000);
	Importpath();
	Thread.sleep(2000);
	Rollsave("Lab Report Save","Selected Lab Report file saved.","Lab Report Save","Selected Lab Report file saved.", test,driver);
}
@Test(priority =3)
public void ImportSame() throws IOException, Exception
{
	test = extent.createTest(funTestCaseName()+" Import same file, file already exits error message should get displayed");	
	Thread.sleep(2000);
	login.ImportReport.click();
	Thread.sleep(1000);
	Importpathfile();
	Thread.sleep(1000);
	//Thread.sleep(1000);
	//Importpath();
	//Thread.sleep(2000);
	Rollsave("Lab Report Import","Lab Report file already exists, hence cannot import again.","Lab Report Import","Lab Report file already exists, hence cannot import again.", test,driver);
}
@Test(priority =4)
public void databaseconnectionsavecheck() throws IOException
{
	test = extent.createTest(dataTestCaseName()+" To verify the Saved Database for Labreports");
	Designationconfig(test);
}
public void Designationconfig(ExtentTest test1) throws IOException {
    try {
        ArrayList<HashMap<String, String>> dataEntries = class1.getDataFromLabReports();

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
    	catchexceptionscreenshot(test,e);
        test1.error("Failed to retrieve data from the database.");
        extent.flush();
    }
}
@Test(priority =5)
public void delete() throws IOException, InterruptedException, FindFailed
{
	test = extent.createTest(funTestCaseName()+" Import file deleted, Pop-up msg should get displayed");
	Labreports("D:\\Help\\LabReports\\Delete.PNG");
	Thread.sleep(1000);
	Rollcancel("Lab Report Delete","Do you want to delete the selected file?","Lab Report Delete","Do you want to delete the selected file?", test,driver);
	Labreports("D:\\Help\\LabReports\\Delete.PNG");
	Thread.sleep(1000);
	Rollsave("Lab Report Delete","Do you want to delete the selected file?","Lab Report Delete","Do you want to delete the selected file?", test,driver);
	Thread.sleep(1000);
	Rollsave("Lab Report Delete","Selected Lab Report file deleted.","Lab Report Delete","Selected Lab Report file deleted.", test,driver);
}
//@Test(priority =6)
public void databaseconnectionempty() throws IOException
{
	test = extent.createTest(dataTestCaseName()+" To verify the delete Database for labreport");
	Designationconfig(test);
}
@Test(priority =7)
public void deletedimport() throws IOException, FindFailed, InterruptedException
{
	test = extent.createTest(funTestCaseName()+" Import the deleted file once again, Pop-up msg should get displayed");
	Thread.sleep(2000);
	login.ImportReport.click();
	Thread.sleep(1000);
	Importpathfile();
	Thread.sleep(1000);
	try {
		Rollsave("Lab Report Save","Selected Lab Report file saved.","Lab Report Save","Selected Lab Report file saved.", test,driver);
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		catchexceptionscreenshot(test,e);
	} 
}
@Test(priority =8)
public void databaseconnectionimportagain() throws IOException
{
	test = extent.createTest(dataTestCaseName()+" To verify the import the delete file  for labreport in database");
	Designationconfig(test);
}

int day1;
LocalDate currentDate;
int Previoysday;
String Currentday1;
String Previoysday1;
private int Nextday;
private String Nextday1;
String month;
String year;
private int day3;
private Month day2;
String Concatenated;
String month1;

@Test(priority =9)
public void Importbutton() throws IOException
{
	currentDate=LocalDate.now();
    day1=currentDate.getDayOfMonth();
    day2=currentDate.getMonth();
    month=day2.toString();
    month1 =month.substring(0,1).toUpperCase() + month.substring(1).toLowerCase();
    day3=currentDate.getYear();
    year=Integer.toString(day3);
    Concatenated=month1+", "+year;
 
    Previoysday=day1-1;
    
    Currentday1=Integer.toString(day1);
    Previoysday1=Integer.toString(Previoysday);	
}

@Test(priority =10)
public void Currentdayandmonth() throws IOException
{
	test = extent.createTest(guiTestCaseName()+" To verify the Current Month, Year label is displayed");
	WebElement Currentdate=driver.findElement(By.name(Concatenated));
	Actions action=new Actions(driver);
	action.moveToElement(Currentdate).perform();
	demo.isdisplayed(Currentdate, Concatenated,test, driver);	
	demo.Textcomparsion(Currentdate, Concatenated, test, driver);
}
@Test(priority =11)
public void Mondaylabel() throws IOException
{
	test = extent.createTest(guiTestCaseName()+" To verify the Monday label is displayed");
	WebElement Currentdate=driver.findElement(By.name("Monday"));
	Actions action=new Actions(driver);
	action.moveToElement(Currentdate).perform();
	demo.isdisplayed(Currentdate, "Monday",test, driver);	
	demo.Textcomparsion(Currentdate, "Monday",test, driver);	
}
@Test(priority =12)
public void Tuesdaylabel() throws IOException
{
	test = extent.createTest(guiTestCaseName()+" To verify the Tuesday label is displayed");
	WebElement Currentdate=driver.findElement(By.name("Tuesday"));
	Actions action=new Actions(driver);
	action.moveToElement(Currentdate).perform();
	demo.isdisplayed(Currentdate, "Tuesday" ,test, driver);	
	demo.Textcomparsion(Currentdate, "Tuesday",test, driver);	
}
@Test(priority =13)
public void Wednesdaylabel() throws IOException
{
	test = extent.createTest(guiTestCaseName()+" To verify the Wednesday label is displayed");
	WebElement Currentdate=driver.findElement(By.name("Wednesday"));
	Actions action=new Actions(driver);
	action.moveToElement(Currentdate).perform();
	demo.isdisplayed(Currentdate, "Wednesday",test, driver);	
	demo.Textcomparsion(Currentdate, "Wednesday",test, driver);	
}
@Test(priority =14)
public void Thursdaylabel() throws IOException
{
	test = extent.createTest(guiTestCaseName()+" To verify the Thursday label is displayed");
	WebElement Currentdate=driver.findElement(By.name("Thursday"));
	Actions action=new Actions(driver);
	action.moveToElement(Currentdate).perform();
	demo.isdisplayed(Currentdate, "Thursday",test, driver);	
	demo.Textcomparsion(Currentdate, "Thursday",test, driver);	
}
@Test(priority =15)
public void Fridaylabel() throws IOException
{
	test = extent.createTest(guiTestCaseName()+" To verify the Friday label is displayed");
	WebElement Currentdate=driver.findElement(By.name("Friday"));
	Actions action=new Actions(driver);
	action.moveToElement(Currentdate).perform();
	demo.isdisplayed(Currentdate, "Friday",test, driver);	
	demo.Textcomparsion(Currentdate, "Friday",test, driver);	
}
@Test(priority =16)
public void Saturadaylabel() throws IOException
{
	test = extent.createTest(guiTestCaseName()+" To verify the Saturday label is displayed");
	WebElement Currentdate=driver.findElement(By.name("Saturday"));
	Actions action=new Actions(driver);
	action.moveToElement(Currentdate).perform();
	demo.isdisplayed(Currentdate, "Saturday",test, driver);	
	demo.Textcomparsion(Currentdate, "Saturday",test, driver);	
}
@Test(priority =17)
public void Sundaylabel() throws IOException
{
	test = extent.createTest(guiTestCaseName()+" To verify the Sunday label is displayed");
	WebElement Currentdate=driver.findElement(By.name("Sunday"));
	Actions action=new Actions(driver);
	action.moveToElement(Currentdate).perform();
	demo.isdisplayed(Currentdate, "Sunday",test, driver);	
	demo.Textcomparsion(Currentdate, "Sunday",test, driver);	
}
@Test(priority =18)
public void Currentday() throws IOException
{
	test = extent.createTest(funTestCaseName()+" To verify if Click on the Currentdate, Import button is enabled");
	WebElement Currentdate=driver.findElement(By.name(Currentday1));
	Actions action=new Actions(driver);
	action.moveToElement(Currentdate).click().perform();
	demo.isEnabled(login.ImportReport, "IMPORT", test, driver);	
}
@Test(priority =19)
public void Previousday() throws IOException
{
	test = extent.createTest(funTestCaseName()+" To verify if Click on the Previousdate, Import button is enabled");
	WebElement Previoysday=driver.findElement(By.name(Previoysday1));
	Actions action=new Actions(driver);
	action.moveToElement(Previoysday).click().perform();
	demo.isEnabled(login.ImportReport, "IMPORT", test, driver);	
}
@Test(priority =20)
public void Previousdayreport() throws IOException, InterruptedException
{
	test = extent.createTest(funTestCaseName()+" To verify if Click on the Previousdate, Import the report");
	WebElement Previoysday=driver.findElement(By.name(Previoysday1));
	Actions action=new Actions(driver);
	action.moveToElement(Previoysday).click().perform();
	demo.isEnabled(login.ImportReport, "IMPORT", test, driver);	
	login.ImportReport.click();
	Thread.sleep(1000);
	Importpathprevious();
	Thread.sleep(2000);
	Rollsave("Lab Report Save","Selected Lab Report file saved.","Lab Report Save","Selected Lab Report file saved.", test,driver);
}
@Test(priority =21)
public void Reportopen() throws IOException, FindFailed, InterruptedException
{
	test = extent.createTest(funTestCaseName()+" To verify Click on the Pdffile, It is opened the file");
	Labreports("D:\\Help\\LabReports\\Pdffilename.PNG");
	Thread.sleep(2000);
	image("D:\\Help\\LabReports\\Pdffileopen.PNG",test);
	Thread.sleep(2000);
	login.Close.click();
}
@Test(priority =22)
public void filerangeexits() throws IOException, InterruptedException, FindFailed
{
	test = extent.createTest(funTestCaseName()+" Imported file out of range, Pop-up msg displayed");
	login.ImportReport.click();
	Importpathexits();
	Thread.sleep(1000);
	Rollcontains("Lab Report Import", "Selected file size is", "Lab Report Import", "Selected file size is",test,driver);
}
@Test(priority =23)
public void Nextday() throws IOException
{ 
	Importbutton();
	test = extent.createTest(funTestCaseName()+" To verify if Click on the Nextdate, Import button is disabled");
	if(day1<30)
    {
    Random random=new Random();
    Nextday=day1+1+random.nextInt(30-day1-1);
    Nextday1=Integer.toString(Nextday);
    WebElement Nextday=driver.findElement(By.name(Nextday1));
	Actions action=new Actions(driver);
	action.moveToElement(Nextday).click().perform();
	demo.BydefaultisEnabled(login.ImportReport, "IMPORT", test, driver);
    }
    else if(day1==31)
    {
    	WebElement Nextmonth=driver.findElement(By.xpath("//Button[@HelpText=\"Next Month\"]"));
    	Nextmonth.click();
    	Nextday=1;
        Nextday1=Integer.toString(Nextday);
    	WebElement Nextday2=driver.findElement(By.name(Nextday1));
    	Actions action=new Actions(driver);
    	action.moveToElement(Nextday2).click().perform();
    	demo.BydefaultisEnabled(login.ImportReport, "IMPORT", test, driver);
    	WebElement PreviousMonth=driver.findElement(By.xpath("//Button[@HelpText=\"Previous Month\"]"));
    	PreviousMonth.click();
    }	
}

@Test(priority =24)
public void databaseforprevious() throws IOException
{
	test = extent.createTest(dataTestCaseName()+" To verify the Previous file data");
	Designationconfig(test);
}

public void image(String path,ExtentTest test) throws IOException
{
	Screen screen = new Screen();
    String referenceImagePath = path; // Replace with the actual path
    Pattern referenceImage = new Pattern(referenceImagePath);
    try {
        Match match = screen.exists(referenceImage);
        if (match != null) {
           test.pass("PDF file is opened!");
            screen.click(match);
        } else {
            test.fail("PDF file is not opened!");
        }
    } catch (FindFailed e) {
    	catchexceptionscreenshot(test,e);
    }
}

public void Previousmonthclick()
{
	WebElement Previousmonth=driver.findElement(By.xpath("//Text[@Help='Previous Month']"));
	Actions action=new Actions(driver);
	action.moveToElement(Previousmonth).click().perform();
}

public void Importpath() throws InterruptedException
{
    WebElement Downloads = driver.findElement(By.name("Downloads"));
	Downloads.click();
	Thread.sleep(1000);
	WebElement pdffile = driver.findElement(By.name("issues-1.pdf"));
	Actions action=new Actions(driver);
	action.moveToElement(pdffile).click().perform();
	Thread.sleep(1000);
	WebElement Open = driver.findElement(By.name("Open"));
	Open.click();
}

public void Importpathprevious() throws InterruptedException
{
    WebElement Downloads = driver.findElement(By.name("Downloads"));
	Downloads.click();
	Thread.sleep(1000);
	WebElement pdffile = driver.findElement(By.name("issues-2.pdf"));
	pdffile.click();
	Thread.sleep(1000);
	WebElement Open = driver.findElement(By.name("Open"));
	Open.click();
}

public void Importpathexits() throws InterruptedException
{
	WebElement Downloads = driver.findElement(By.name("Downloads"));
    Downloads.click();
	WebElement pdffile = driver.findElement(By.name("PMT-PC1-08-19A_User Manual-R35.pdf"));
	pdffile.click();
	WebElement Open = driver.findElement(By.name("Open"));
	Open.click();
}
public void Importpathfile() throws InterruptedException, FindFailed
{
	Labreports("D:\\Help\\LabReports\\Pdffile.PNG");
	WebElement Open = driver.findElement(By.name("Open"));
	Open.click();
}

public void Labreports(String Text) throws FindFailed {
	 Screen screen = new Screen();
	 String imagePath = Text;
	 Pattern pattern = new Pattern(imagePath);
     Match match = screen.find(pattern);
     match.click();
}


// Lab report already exits message not able to perform
}
