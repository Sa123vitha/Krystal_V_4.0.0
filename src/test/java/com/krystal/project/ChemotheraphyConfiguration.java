package com.krystal.project;

import java.io.IOException;
import java.net.URL;
import java.security.SecureRandom;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import io.appium.java_client.windows.WindowsDriver;


public class ChemotheraphyConfiguration extends ReferencefileChemotheraphy{
	
	protected ChemotheraphyPOM chemo;
	private WebElement Chemosave;
	private String imagePath;
	private Screen s;
	private Match match;
	private WebElement Regimensave;
	private int count;
	private WebElement DrugEdit;
	private WebElement Drugbox;
	private WebElement DrugUnit;
	private WebElement CloseButton;
	private WebElement DoseLabel;
	private WebElement Addicon;
	private WebElement Update;
	private WebElement Edit;
	private WebElement Delete;
	ChemotheraphyPOM page;
	private Actions action;
	private Actions act;
	@Test(priority =1)
	public void launch()  throws InterruptedException, IOException {
	//DesiredCapabilities appCapabilities = new DesiredCapabilities();
	//appCapabilities.setCapability("app", "C:\\Program Files\\Panacea Medical Technologies\\Krystal\\Krystal.exe");
	//driver = new WindowsDriver<WebElement>(new URL("http://127.0.0.1:4723"), appCapabilities);
	ReferenceSigin Sign=new ReferenceSigin();
	Sign.Login(driver);
	Sign.Chemoconfig(driver);
	chemo=new ChemotheraphyPOM(driver);
	setUp();
	action=new Actions(driver);
	act=new Actions(driver);
	}
	
	//@Test(priority =1)
	public void button() throws InterruptedException{
	List<WebElement> elements = driver.findElements(By.className("Button"));
    Actions actions = new Actions(driver);
    for (WebElement element : elements) {
        actions.moveToElement(element).perform();
        System.out.println(element.getLocation());
        System.out.println(element.getTagName());
        System.out.println(element.getText());
        System.out.println(element.getSize());
        Thread.sleep(1000);
    }
	}
	
	@Test(priority =10)
public void classificationConfigurationGui() throws InterruptedException, IOException
	{
		test = extent.createTest("====GENERAL SETTINGS(CHEMOTHERAPHY CONFIGURATION MODULE)====");
		test = extent.createTest(guiTestCaseName()+"To verify the classification Configuration label");
		demo.Textcomparsion(chemo.classificationConfiguration, "CLASSIFICATION CONFIGURATION", test,driver); 
		
	}
	//@Test(priority =11)
public void classificationNameGui() throws InterruptedException, IOException
	{
	       test = extent.createTest(guiTestCaseName()+"To verify the classification Configuration name label");
	       demo.Textcomparsion(chemo.classificationName, "Classification Name", test,driver);
	}

@Test(priority =12)
public void classificationListGui() throws InterruptedException, IOException
{
       test = extent.createTest(guiTestCaseName()+"To verify the classification List label");
       demo.Textcomparsion(chemo.ClassificationList, "CLASSIFICATION LIST", test,driver);
}



@Test(priority =13)
public void classificationsaveenable() throws IOException
{
	test = extent.createTest(guiTestCaseName()+"To verify Classification Save button Enabled by default");
	WebElement ChemoSave = driver.findElements(By.className("Button")).get(6);
    demo.isEnabled(ChemoSave, "SAVE", test,driver);
    demo.Textcomparsion(ChemoSave, "SAVE", test,driver);
}


public void Chemosave() throws InterruptedException
{
	Save(0,driver);
}



@Test(priority=16)
public void classificationemptytextbox() throws IOException, InterruptedException
{
	test = extent.createTest(guiTestCaseName()+" Empty textbox Classification chemotheraphy error message is displayed");
	chemo.Save.click();
    Thread.sleep(1000);
	errormessagedisplayed1("Classification Name cannot be empty.","Classification Name cannot be empty.",test);
}
@Test(priority=17)
public void Classificationsave() throws InterruptedException, IOException
{ 
	test = extent.createTest(guiTestCaseName()+" To verify the Valid Classification name","Valid Classification  should save the data");
	randomalpha(40);
	Thread.sleep(1000);
	Validdatachemo(chemo.ClassificationName,randomStringalpha,driver,test);
	chemo.Save.click();
	Sitesave1("Classification Configuration", "Classification data saved.", "Classification Configuration", "Classification data saved.",0,driver,test);
}
@Test(priority=18)
public void Classificationalreadysave() throws InterruptedException, IOException
{
	Validdataname(chemo.ClassificationName,randomStringalpha,driver);
	chemo.Save.click();
	test = extent.createTest(funTestCaseName()+" To verify the Classification name already exits error message is displayed");
	demo.isdisplayed(chemo.ClassificationErrormsg, "Classification Name already exists.", test,driver);
	demo.Textcomparsion(chemo.ClassificationErrormsg, "Classification Name already exists.", test,driver);
	chemo.ClassificationName.click();
	driver.switchTo().activeElement().clear();
}
@Test(priority=19)
public void ClassificationChemotheraphy() throws IOException, InterruptedException
{
	randomUpper(20);
	ValidataUpper("Classification Name");
	ClassificationSave();
	randomLower(20);
	ValidataLower("Classification Name");
	ClassificationSave();
	randomalpha(20);
	ValidataUpperLower("Classification Name");
	ClassificationSave();
	randomNumber(20);
	ValidataNumber("Classification Name");
	ClassificationSave();
	randomstringtext(20);
	Validatachars("Classification Name");
	ClassificationSave();
	randomCharOutOfRange(20);
	InValidataRange("Classification Name");
}

@Test(priority =20)
public void databaseconnectionsavecheck() throws IOException
{
	test = extent.createTest(dataTestCaseName()+" To verify the Saved Database for Classification name");
	Chemoconfig(test);
}
@Test(priority = 21)
public void Appdatagridelements() throws IOException, FindFailed, InterruptedException, ClassNotFoundException, SQLException
{
	
	test = extent.createTest(guiTestCaseName() + "To verify Classification datagrid and database elements");
	compareDataWithDatabaseclassification(test, "ChemotherapyConfigurationSection1View");
}
@Test(priority = 22)//*********************UPDATE*******
	public void viewdatabase() throws FindFailed, ClassNotFoundException, IOException, InterruptedException, SQLException
	{    test = extent.createTest(guiTestCaseName() + "To verify the Classification application and database elements");
	viewchemoapp(test,"ChemotherapyConfigurationSection1View");
	}
@Test(priority=23)
public void Addicon() throws IOException, FindFailed, InterruptedException
{
	  test = extent.createTest(funTestCaseName()+" To verify the Click on Classification Addicon  text should be empty");
	  chemo.ClassificationName.click();
	  driver.switchTo().activeElement().sendKeys("Classification Name");
	  edit("D:\\Help\\Chemo\\AddC.PNG");
	  demo.isempty(chemo.ClassificationName, "Empty", test, driver);
}
@Test(priority=24)
public void testSearchTextBox() throws IOException, FindFailed, InterruptedException {

    test = extent.createTest(funTestCaseName()+" To verify the Classification Search box functionality");
    viewdataserachfun("D:\\Help\\Chemo\\SClass.PNG",test,"ChemotherapyConfigurationSection1View",driver);
}

@Test(priority=25)
public void deleteenable() throws IOException
{
	try {
		viewdeleteenable("ChemotherapyConfigurationSection1View"); 
		}
		catch(Exception e)
		{
			test.fail("Delete Button is not enabled");
			catchexceptionscreenshot1(test,e) ;
		}
}
String Actualtext;
@Test(priority=26)
public void deletecancel() throws InterruptedException, IOException, FindFailed
{
	WebElement text= driver.findElement(By.className("ChemotherapyConfigurationSection1View"));
    WebElement Listrow = text.findElements(By.className("DataGridRow")).get(0);
    WebElement Delete=Listrow.findElements(By.className("DataGridCell")).get(1);
    Actualtext=Delete.getText();
	test = extent.createTest(funTestCaseName()+" Click on Classification Delete data, Pop-up should get displayed, Click on Cancel button");
	try {
		delete("ChemotherapyConfigurationSection1View",test);
		Rollcontainscancel("Classification Delete", "Do you want to delete Classification", "Classification Delete", "Do you want to delete Classification",test,driver);
	}
		catch(Exception e)
		{
			test.fail("Classification cancel pop-up window not found");
			catchexceptionscreenshot1(test,e) ;
		}
}
@Test(priority=27)
public void deleteok() throws InterruptedException, IOException, FindFailed
{
	test = extent.createTest(funTestCaseName()+" Click on Classification Delete data, Pop-up should get displayed, Click on OK button");
	try {
		delete("ChemotherapyConfigurationSection1View",test);
		Sitesavecontains("Classification Delete", "Do you want to delete Classification", "Classification Delete", "Do you want to delete Classification",0,driver);
	    Sitesave1("Classification Configuration", "Selected Classification data deleted.", "Classification Delete", "Selected Classification data deleted.",0,driver,test);
		}
		catch(Exception e)
		{
			test.fail("Classification ok pop-up window not found");
			catchexceptionscreenshot1(test,e) ;
		}
}

@Test(priority = 28)//*** Change
public void Deletedatabase() throws FindFailed, ClassNotFoundException, IOException, InterruptedException, SQLException
{    test = extent.createTest(guiTestCaseName() + "To verify the Classification datagrid and database elements for DELETE data");
     compareDataWithDatabaseclassification(test, "ChemotherapyConfigurationSection1View");
}

@Test(priority = 29)
public void deletedatanotdisplayed() throws IOException
{
	test = extent.createTest(funTestCaseName()+"Deleted data not displayed");
	WebElement text= driver.findElement(By.className("ChemotherapyConfigurationSection1View"));
    WebElement Listrow = text.findElements(By.className("DataGridRow")).get(0);
    WebElement Delete=Listrow.findElements(By.className("DataGridCell")).get(1);
	demo.ByInvalidErrormessage(Delete, Actualtext, test, driver);
}

@Test(priority = 30)
public void deletedatasave() throws IOException, InterruptedException
{
	test = extent.createTest(funTestCaseName()+" Deleted Classification name, Enetred Once again it should save the data");
	chemo.ClassificationName.click();
	driver.switchTo().activeElement().sendKeys(Actualtext); 
	Chemosave();
	Sitesave1("Classification Configuration", "Classification data saved.", "Classification Configuration", "Classification data saved.",0,driver,test);
}

@Test(priority = 31)// add
public void Deletedatabaseadd() throws FindFailed, ClassNotFoundException, IOException, InterruptedException, SQLException
{    test = extent.createTest(guiTestCaseName() + "To verify the Classification datagrid and database elements for data added Classification DELETE data");
     compareDataWithDatabaseclassification(test, "ChemotherapyConfigurationSection1View");
}



//*********************************************************REGIMEN DATA SAVE******************************************





	public void Regimensave() throws InterruptedException
	{
		Save(1,driver);
	}
	
	
	

@Test(priority=43)
public void Regimenemptytextbox() throws IOException, InterruptedException
{
	test = extent.createTest(guiTestCaseName()+" Empty textbox Regimen error message is displayed","Error message should display");
	Regimensave();
	errormessagedisplayed("Regimen Name cannot be empty.","Regimen Name cannot be empty.");
}
WebElement RegimenName;
@Test(priority=44)

public void RegimenValiddata() throws InterruptedException, IOException
{ 
	test = extent.createTest(guiTestCaseName()+" To verify the Valid Regimen name","Valid Regimen should save the data");
	RegimenName = driver.findElement(By.name("Regimen Name"));
	randomalpha(40);
	Validdatachemo(chemo.RegimenName,randomStringalpha,driver,test);
	Thread.sleep(1000);	
	RegimenSavemsg();
}
@Test(priority=45)
public void Regimenreadysave() throws InterruptedException, IOException
{
	
	Validdataname(chemo.RegimenName,randomStringalpha,driver);
	Regimensave();
	test = extent.createTest(funTestCaseName()+" To verify the Regimen name already exits error message is displayed");
	demo.isdisplayed(chemo.RegimenErrormsg, "Regimen Name already exists.", test,driver);
	demo.Textcomparsion(chemo.RegimenErrormsg, "Regimen Name already exists.", test,driver);
	chemo.RegimenName.click();
	driver.switchTo().activeElement().clear();
}
@Test(priority=46)
public void Regimen() throws IOException, InterruptedException
{
	randomUpper(20);
	ValidataUpper("Regimen Name");
	RegimenSavemsg();
	randomLower(20);
	ValidataLower("Regimen Name");
	RegimenSavemsg();
	randomalpha(20);
	ValidataUpperLower("Regimen Name");
	RegimenSavemsg();
	randomNumber(20);
	ValidataNumber("Regimen Name");
	RegimenSavemsg();
	randomstringtext(20);
	Validatachars("Regimen Name");
	RegimenSavemsg();
	randomCharOutOfRange(20);
	InValidataRange("Regimen Name");
}


@Test(priority =47)
public void databaseconnectionsavecheckRegimen1() throws IOException
{
	test = extent.createTest(dataTestCaseName()+" To verify the Saved Database for Regimen Name Configuration");
	Regimenconfig(test);
}
@Test(priority =48)
public void AppdatagridelementsRegimen() throws IOException, FindFailed, InterruptedException, ClassNotFoundException, SQLException
{
	test = extent.createTest(guiTestCaseName() + "To verify the Regimen datagrid and database elements");
	compareDataWithDatabaseregimen(test, "ChemotherapyConfigurationSection2View");
}
@Test(priority = 49)//*********************UPDATE*******
	public void viewdatabaseRegimen() throws FindFailed, ClassNotFoundException, IOException, InterruptedException, SQLException
	{     test = extent.createTest(guiTestCaseName() + "To verify the Regimen application elements");
	      viewchemoapp(test,"ChemotherapyConfigurationSection2View");
	}
	@Test(priority=50)
	public void AddiconRegimen() throws IOException, FindFailed, InterruptedException
	{
		   test = extent.createTest(funTestCaseName()+" To verify the Click on Add icon in Regimen text should be empty");
		      chemo.RegimenName.click();
			  driver.switchTo().activeElement().sendKeys("Regimen Name");
		   edit("D:\\Help\\Chemo\\AddRg.PNG");
		   demo.isempty(chemo.RegimenName, "Regimen Name", test, driver);
	} 

@Test(priority=51)
public void testSearchTextBoxRegimen() throws IOException, FindFailed, InterruptedException {

    test = extent.createTest(funTestCaseName()+" To verify the Search box functionality for RegimenName");
    viewdataserachfun("D:\\Help\\Chemo\\SRegimen.PNG",test,"ChemotherapyConfigurationSection2View",driver);
  
}

@Test(priority=52)
public void deleteenableRegimen()
{
	try {
		viewdeleteenable("ChemotherapyConfigurationSection2View"); 
		}
		catch(Exception e)
		{
			test.fail("Delete Button is not enabled");
		}
}
//**********************************

String Actualtext1;

@Test(priority=53)
public void deletecancelRegimen() throws InterruptedException, IOException, FindFailed
{
	WebElement text= driver.findElement(By.className("ChemotherapyConfigurationSection2View"));
    WebElement Listrow = text.findElements(By.className("DataGridRow")).get(0);
    WebElement Delete=Listrow.findElements(By.className("DataGridCell")).get(1);
    Actualtext1=Delete.getText();
	test = extent.createTest(funTestCaseName()+" Click on Regimen Delete data, Pop-up should get displayed, Click on Cancel button");
	try {
		delete("ChemotherapyConfigurationSection2View",test);
		Rollcontainscancel("Regimen Delete", "Do you want to delete Regimen", "Regimen Delete", "Do you want to delete Regimen",test,driver);
	}
		catch(Exception e)
		{
			test.fail("Regimen cancel pop-up window not found");
		}
}
@Test(priority=54)
public void deleteRegimenok() throws InterruptedException, IOException, FindFailed
{
	test = extent.createTest(funTestCaseName()+" Click on Regimen Delete data, Pop-up should get displayed, Click on OK button");
	try {
		delete("ChemotherapyConfigurationSection2View",test);
		Sitesavecontains("Regimen Delete", "Do you want to delete Regimen", "Regimen Delete", "Do you want to delete Regimen",0,driver);
		Sitesave1("Regimen Configuration", "Selected Regimen data deleted.", "Regimen Delete", "Selected Regimen data deleted.",0,driver,test);
		}
		catch(Exception e)
		{
			test.fail("Classification ok pop-up window not found");
		}
	
	
}

@Test(priority=55)//*** Change
public void DeletedatabaseRegimen() throws FindFailed, ClassNotFoundException, IOException, InterruptedException, SQLException
{    test = extent.createTest(guiTestCaseName() + "To verify the Regimen datagrid and database elements for DELETE data");
     compareDataWithDatabaseregimen(test, "ChemotherapyConfigurationSection2View");
}

@Test(priority=56)
public void deletedatanotdisplayedRegimen1() throws IOException
{
	test = extent.createTest(funTestCaseName()+"Deleted data not displayed");
	WebElement text= driver.findElement(By.className("ChemotherapyConfigurationSection2View"));
    WebElement Listrow = text.findElements(By.className("DataGridRow")).get(0);
    WebElement Delete=Listrow.findElements(By.className("DataGridCell")).get(1);
	demo.ByInvalidErrormessage(Delete, Actualtext1, test, driver);
}

@Test(priority=57)
public void deletedatasaveRegimen1() throws IOException, InterruptedException
{
	test = extent.createTest(funTestCaseName()+" Deleted Regimen name, Enetred Once again it should save the data");
	chemo.RegimenName.click();
	driver.switchTo().activeElement().sendKeys(Actualtext1); 
	RegimenSavemsg();
}

@Test(priority=58)// add
public void DeletedatabaseaddRegimen1() throws FindFailed, ClassNotFoundException, IOException, InterruptedException, SQLException
{    test = extent.createTest(guiTestCaseName() + "To verify the datagrid and database elements for data added Regimen DELETE data");
     compareDataWithDatabaseregimen(test, "ChemotherapyConfigurationSection2View");
}
	


	public void Radiosave() throws InterruptedException
	{
		Save(2,driver);
	}
	
	
	
	

@Test(priority=70)
public void Radioemptytextbox() throws IOException, InterruptedException
{
	test = extent.createTest(guiTestCaseName()+" Empty textbox Radio error message is displayed","Error message should display");
	Radiosave();
	errormessagedisplayed("Radio Sensitizer Name cannot be empty.","Radio Sensitizer Name cannot be empty.");
}
	

WebElement RadioName;
@Test(priority=71)

public void RadioValiddata() throws InterruptedException, IOException
{ 
	test = extent.createTest(guiTestCaseName()+" To verify the Valid Radio name","Valid Radio should save the data");
	RadioName = driver.findElement(By.name("Radio Sensitizers Name"));
	randomalpha(45);
	Validdatachemo(chemo.RadioName,randomStringalpha,driver,test);
	Thread.sleep(1000);
	RadioSavemsg();
}
@Test(priority=72)
public void Radioalreadysave() throws InterruptedException, IOException
{
	
	Validdataname(chemo.RadioName,randomStringalpha,driver);
	Radiosave();
	test = extent.createTest(funTestCaseName()+" To verify the Radio name already exits error message is displayed");
	demo.isdisplayed(chemo.RadioErrormsg, "Radio Sensitizer already exists.", test,driver);
	demo.Textcomparsion(chemo.RadioErrormsg, "Radio Sensitizer already exists.", test,driver);
	chemo.RadioName.click();
	driver.switchTo().activeElement().clear();
}
@Test(priority=73)
public void Radiosenitizers() throws IOException, InterruptedException
{
	randomUpper(20);
	ValidataUpper("Radio Sensitizers Name");
	RadioSavemsg();
	randomLower(20);
	ValidataLower("Radio Sensitizers Name");
	RadioSavemsg();
	randomalpha(20);
	ValidataUpperLower("Radio Sensitizers Name");
	RadioSavemsg();
	randomNumber(20);
	ValidataNumber("Radio Sensitizers Name");
	RadioSavemsg();
	randomstringtext(20);
	Validatachars("Radio Sensitizers Name");
	RadioSavemsg();
	randomCharOutOfRange(20);
	InValidataRange("Radio Sensitizers Name");
}

@Test(priority =74)
public void databaseconnectionsavecheckRegimen() throws IOException
{
	test = extent.createTest(dataTestCaseName()+" To verify the Saved Database for Radio Name Configuration");
	Radioconfig(test);
}
@Test(priority =75)
public void AppdatagridelementsRadio() throws IOException, FindFailed, InterruptedException, ClassNotFoundException, SQLException
{
	test = extent.createTest(guiTestCaseName() + "To verify the Radio datagrid and database elements");
	compareDataWithDatabaseRadio(test,"ChemotherapyConfigurationSection3View");
}


@Test(priority = 76)//*********************UPDATE*******
	public void viewdatabaseRadio() throws FindFailed, ClassNotFoundException, IOException, InterruptedException, SQLException
	{    test = extent.createTest(guiTestCaseName() + "To verify the Radio datagrid and database elements");
	viewchemoapp(test,"ChemotherapyConfigurationSection3View");
	}
	@Test(priority=77)
	public void AddiconRadio() throws IOException, FindFailed, InterruptedException
	{
		 test = extent.createTest(funTestCaseName()+" To verify the Click on Radio Add textshould be empty for RadioName");
		  chemo.RadioName.click();
		  driver.switchTo().activeElement().sendKeys("Radio Name");
		  edit("D:\\Help\\Chemo\\AddRd.PNG");
		  demo.isempty(chemo.RadioName, "RadioName", test, driver);
	} 

@Test(priority=78)
public void testSearchTextBoxRadio() throws IOException, FindFailed, InterruptedException {

    test = extent.createTest(funTestCaseName()+" To verify the Radio Search box functionality for RadioName");
    viewdataserachfun("D:\\Help\\Chemo\\SRadio.PNG",test,"ChemotherapyConfigurationSection3View",driver);
    
}
@Test(priority=79)
public void deleteenableRadio()
{
	try {
		viewdeleteenable("ChemotherapyConfigurationSection3View"); 
		}
		catch(Exception e)
		{
			test.fail("Delete Button is not enabled");
		}
}

String Actualtext2;
@Test(priority=80)
public void deletecancelRadio() throws InterruptedException, IOException, FindFailed
{
	WebElement text= driver.findElement(By.className("ChemotherapyConfigurationSection3View"));
    WebElement Listrow = text.findElements(By.className("DataGridRow")).get(0);
    WebElement Delete=Listrow.findElements(By.className("DataGridCell")).get(1);
    Actualtext2=Delete.getText();
	test = extent.createTest(funTestCaseName()+" Click on Radio Delete data, Pop-up should get displayed, Click on Cancel button");
	try {
		delete("ChemotherapyConfigurationSection3View",test);
		Rollcontainscancel("Radio Sensitizer Delete", "Do you want to delete Radio Sensitizer", "Radio Sensitizer Delete", "Do you want to delete Radio Sensitizer",test,driver);
	}
		catch(Exception e)
		{
			test.fail("Regimen cancel pop-up window not found");
		}
}

@Test(priority=81)
public void deleteRadionok() throws InterruptedException, IOException, FindFailed
{
	test = extent.createTest(funTestCaseName()+" Click on Radio Delete data, Pop-up should get displayed, Click on OK button");
	try {
		delete("ChemotherapyConfigurationSection3View",test);
		Sitesavecontains("Radio Sensitizer Delete", "Do you want to delete Radio Sensitizer", "Radio Sensitizer Delete", "Do you want to delete Radio Sensitizer",0,driver);
		Sitesave1("Radio Sensitizers Configuration", "Selected Radio Sensitizers data deleted.", "Radio Sensitizer Delete", "Selected Radio Sensitizers data deleted.",0,driver,test);
		}
		catch(Exception e)
		{
			test.fail("Classification ok pop-up window not found");
			catchexceptionscreenshot1(test,e) ;
		}
}

@Test(priority=82)//*** Change
public void DeletedatabaseRadio() throws FindFailed, ClassNotFoundException, IOException, InterruptedException, SQLException
{    test = extent.createTest(guiTestCaseName() + "To verify the Radio datagrid and database elements for DELETE data");
      compareDataWithDatabaseRadio(test,"ChemotherapyConfigurationSection3View");
}

@Test(priority=83)
public void deletedatanotdisplayedRadio() throws IOException
{
	test = extent.createTest(funTestCaseName()+"Deleted data not displayed");
	WebElement text= driver.findElement(By.className("ChemotherapyConfigurationSection3View"));
    WebElement Listrow = text.findElements(By.className("DataGridRow")).get(0);
    WebElement Delete=Listrow.findElements(By.className("DataGridCell")).get(1);
	demo.ByInvalidErrormessage(Delete, Actualtext2, test, driver);
}

@Test(priority=84)
public void deletedatasaveRadio() throws IOException, InterruptedException
{
	test = extent.createTest(funTestCaseName()+" Deleted Radio name, Enetred Once again it should save the data");
	chemo.RadioName.click();
	driver.switchTo().activeElement().sendKeys(Actualtext2); 
	RadioSavemsg();
}

@Test(priority=85)// add
public void DeletedatabaseaddRadio() throws FindFailed, ClassNotFoundException, IOException, InterruptedException, SQLException
{    test = extent.createTest(guiTestCaseName() + "To verify the Radio datagrid and database elements for data added Regimen DELETE data");
      compareDataWithDatabaseRadio(test,"ChemotherapyConfigurationSection3View");
}

public void ClassificationSave() throws InterruptedException, IOException
{
	Chemosave();
	Sitesave("Classification Configuration", "Classification data saved.", "Classification Configuration","Classification data saved.",0,driver);
}


public void RegimenSavemsg() throws InterruptedException, IOException
{
	Regimensave();
	Sitesave("Regimen Configuration", "Regimen data saved.", "Regimen Configuration", "Regimen data saved.",1,driver);
}
public void RadioSavemsg() throws InterruptedException, IOException
{
	Radiosave();
	Thread.sleep(1000);
	Sitesave("Radio Sensitizers Configuration", "Radio Sensitizers data saved.", "Radio Sensitizers Configuration", "Radio Sensitizers data saved.",2,driver);
}




	public void Editclick1() throws IOException
	{
	WebElement element1 = driver.findElements(By.className("Button")).get(18);
	randomdecimalnumber();
	Actions action=new Actions(driver);
	action.moveToElement(element1).click().perform();
	}
String drugdose;

public void Dosevaliddata(int i) throws IOException, InterruptedException
{
randomdecimalnumber();
Drugbox = driver.findElements(By.className("TextBox")).get(i);
Drugbox.click();
driver.switchTo().activeElement().sendKeys(selectedOption1);
drugdose=selectedOption1;
Thread.sleep(1000);
}

String Unitdose;
private WebElement DrugEdit1;


@Test(priority=97)
public void Drugemptytextbox() throws IOException, InterruptedException
{
	DrugEdit = driver.findElements(By.className("Button")).get(18);//Drugedit
	test = extent.createTest(guiTestCaseName()+" Empty textbox Drug and Dose error message is displayed");
	Drugsave();
	errormessagedisplayed("Drug Name cannot be empty.","Drug Name cannot be empty.");
	errormessagedisplayed("Please Select Dose and Unit","Please Select Dose and Unit");
	
}
String Drugname;
@Test(priority=98)
public void DrugValiddata() throws InterruptedException, IOException, FindFailed
{ 
test = extent.createTest(guiTestCaseName()+" To verify the Valid Drug name and dose","Valid Drug should save the data");
randomalpha(40);
Validdata(chemo.DrugName,randomStringalpha,driver);
Drugname=randomStringalpha;
Editclick1();
WebElement edit1=driver.findElement(By.name("Dose"));
demo.isdisplayed(edit1, "Dose", test, driver);
Dosevaliddata(0);
EditUpdate(1);
Thread.sleep(1000);
DrugSavemsg();
}



@Test(priority=101)
public void Drugalreadysave() throws InterruptedException, IOException
{
		chemo.DrugName.click();
		driver.switchTo().activeElement().sendKeys(Drugname);
		Editclick1();
		Dosevaliddata(0);
		EditUpdate(1);
		Drugsave();
		test = extent.createTest(funTestCaseName()+" To verify the Drug name already exits error message is displayed");
		demo.isdisplayed(chemo.DrugNameexits, "Drug Name already exists.", test,driver);
		demo.Textcomparsion(chemo.DrugNameexits, "Drug Name already exists.", test,driver);
		
}
//To verify the DrugDosepop-up window


public void DrugDoseElements() throws InterruptedException
{
   Drugbox = driver.findElements(By.className("TextBox")).get(0);//Textbox
 
	DrugUnit = driver.findElements(By.className("ComboBox")).get(1);//Drugunit
	//action.moveToElement(DrugUnit).perform();
	
	CloseButton = driver.findElements(By.className("Button")).get(4);// close icon
	//action.moveToElement(CloseButton).perform();
	
	DoseLabel = driver.findElements(By.className("Button")).get(5);// 5 is Dose 
	//action.moveToElement(DoseLabel).perform();
	
	Addicon = driver.findElements(By.className("Button")).get(6);// 5 is aDDICON 
	//action.moveToElement(Addicon).perform();
	
	Update = driver.findElements(By.className("Button")).get(7);// 7  is update
	//action.moveToElement(Update).perform();

	Edit = driver.findElements(By.className("Button")).get(8); // is edit
	//action.moveToElement(Edit).perform();

	Delete = driver.findElements(By.className("Button")).get(9);// delete
	//action.moveToElement(Delete).perform();
}

@Test(priority=103)

public void DrugAddicon() throws InterruptedException, IOException, FindFailed
{
try {
test = extent.createTest(funTestCaseName()+" To verify the Click on the Addicon, DrugName and Dose and Unit data get reseted");
WebElement DrugAddicon = driver.findElements(By.className("Button")).get(17);
Actions action=new Actions(driver);
action.moveToElement(DrugAddicon).click().perform();
Thread.sleep(1000);
demo.isempty(chemo.DrugName, "DrugName", test, driver);
Editclick1();
Thread.sleep(1000);
WebElement Drugbox = driver.findElements(By.className("TextBox")).get(0);
demo.isempty(Drugbox, "Drugbox", test, driver);

WebElement Drugbox1 = driver.findElements(By.className("ComboBox")).get(1);
String Drugdosetext=Drugbox1.getText();
if(Drugdosetext.contains("Select Any"))
{
	test.pass("Unit element is refershed " +Drugdosetext);
}
else
{
	test.fail("Unit element is not changed " +Drugdosetext);
}

}
catch(Exception e)
{
	catchexceptionscreenshot(test,e) ;
}
CloseButton = driver.findElements(By.className("Button")).get(4);
Actions action=new Actions(driver);
action.moveToElement(CloseButton).moveByOffset(-2, 0).click().perform();
}



@Test(priority=104)
public void DrugUpperCase() throws IOException, InterruptedException
{// Add index is 17 and edit index is 18
	randomUpper(20);
	ValidataUpper("Drug Name");
	Thread.sleep(1000);
	Editclick1();
	Thread.sleep(1000);
	Dosevaliddata(0);
	Thread.sleep(1000);
	EditUpdate(1);
	DrugSavemsg();	
}
@Test(priority=105)
public void Druglowercase() throws IOException, InterruptedException
{  
	randomLower(20);
	ValidataLower("Drug Name");
	Thread.sleep(1000);
	Editclick1();
	Dosevaliddata(0);
	Thread.sleep(1000);
	EditUpdate(1);
	Thread.sleep(1000);
	DrugSavemsg();
}
@Test(priority=106)
public void DrugUpperlower() throws IOException, InterruptedException
{
	randomalpha(20);
	ValidataUpperLower("Drug Name");
	Thread.sleep(1000);
	Editclick1();
	Dosevaliddata(0);
	Thread.sleep(1000);
	EditUpdate(1);
	Thread.sleep(1000);
	DrugSavemsg();	
}
@Test(priority=107)
public void DrugNumber() throws IOException, InterruptedException
{
	randomNumber(20);
	ValidataNumber("Drug Name");
	Thread.sleep(1000);
	Editclick1();
	Dosevaliddata(0);
	Thread.sleep(1000);
	EditUpdate(1);
	Thread.sleep(1000);
	DrugSavemsg();
}
@Test(priority=108)
public void DrugChars() throws IOException, InterruptedException
{
	randomstringtext(20);
	Validatachars("Drug Name");
	Thread.sleep(1000);
	Editclick1();
	Dosevaliddata(0);
	Thread.sleep(1000);
	EditUpdate(1);
	Thread.sleep(1000);
	DrugSavemsg();	
}
@Test(priority=109)
public void DrugSpecialchars() throws InterruptedException, IOException
{
	
	InValidataRange("Drug Name");
	Thread.sleep(1000);
	Editclick1();
	Dosevaliddata(0);
	Thread.sleep(1000);
	EditUpdate(1);
	Thread.sleep(1000);
	DrugSavemsg();
}
@Test(priority=110)
public void DrugInvalid() throws IOException, InterruptedException
{
	test = extent.createTest(funTestCaseName()+" To verify the  textbox is not accepting specialchars \\,' and displaying error message");
	chemo.DrugName.click();
	driver.switchTo().activeElement().sendKeys("\\,");
	Drugsave();
	WebElement Specialchars=driver.findElement(By.name("Input must not contain \\ , '' , '"));
	demo.isdisplayed(Specialchars, "Input must not contain \\ , '' , '", test,driver);
	chemo.DrugName.clear();
}


@Test(priority =111)
public void databaseconnectionsavecheckDrug() throws IOException
{
	test = extent.createTest(dataTestCaseName()+" To verify the Saved Database for Drug and Dose Name Configuration");
	Drugconfig(test);
}
@Test(priority =112)
public void AppdatagridelementsDrug() throws IOException, FindFailed, InterruptedException, ClassNotFoundException, SQLException
{
	test = extent.createTest(guiTestCaseName() + "To verify the Drug and Dose Name datagrid elements");
	compareDataWithDatabaseDrugname(test, "ChemotherapyConfigurationSection4View");
}

@Test(priority = 112)//*********************UPDATE*******
	public void viewdatabaseDrug() throws FindFailed, ClassNotFoundException, IOException, InterruptedException, SQLException
	{    test = extent.createTest(guiTestCaseName() + "To verify the Drug and Dose Name datagrid and database elements");
	viewDrugapp(test,"ChemotherapyConfigurationSection4View");
	}
	

@Test(priority=113)
public void testSearchTextBoxDrug() throws IOException, FindFailed, InterruptedException {

    test = extent.createTest(funTestCaseName()+" To verify the Drug and Dose Name Search box functionality");
    viewDataSearchDrug("D:\\Help\\Chemo\\SearchDrug.PNG",test,"ChemotherapyConfigurationSection4View",driver);  
}
@Test(priority=114)
public void deleteenableDrug() throws IOException
{
	try {
		viewdeleteenabledrug("ChemotherapyConfigurationSection4View"); 
		}
		catch(Exception e)
		{
			test.fail("Delete Button is not enabled");
			catchexceptionscreenshot1(test,e) ;
		}
}

String Actualtext5;
private String Actualtext7;
@Test(priority=115)
public void deletecancelDrug() throws InterruptedException, IOException, FindFailed
{
	WebElement text= driver.findElement(By.className("ChemotherapyConfigurationSection4View"));
    WebElement Listrow = text.findElements(By.className("DataGridRow")).get(0);
    WebElement Delete=Listrow.findElements(By.className("DataGridCell")).get(2);
    Actualtext7=Delete.getText();
	test = extent.createTest(funTestCaseName()+" Click on Drug Delete data, Pop-up should get displayed, Click on Cancel button");
	try {
		deletedrug("ChemotherapyConfigurationSection4View",test);
		Rollcontainscancel("Drug Delete", "Do you want to delete Drug", "Drug Delete", "Do you want to delete Drug",test,driver);
	}
		catch(Exception e)
		{
			test.fail("Regimen cancel pop-up window not found");
			catchexceptionscreenshot1(test,e) ;
		}
}

@Test(priority=116)
public void deleteDrugok() throws InterruptedException, IOException, FindFailed
{
	test = extent.createTest(funTestCaseName()+" Click on Drug Delete data, Pop-up should get displayed, Click on OK button");
	try {
		deletedrug("ChemotherapyConfigurationSection4View",test);
		Sitesavecontains("Drug Delete", "Do you want to delete Drug", "Drug Delete", "Do you want to delete Drug",0,driver);
		Sitesave1("Drug Configuration", "Selected Drug data deleted.", "Drug Configuration", "Selected Drug data deleted.",0,driver,test);
		}
		catch(Exception e)
		{
			test.fail("Drug Configuration ok pop-up window not found");
			catchexceptionscreenshot1(test,e) ;
		}
	
	
}

public void DrugEditenable() throws IOException
{
	try {
		vieweditenabledrug("ChemotherapyConfigurationSection4View"); 
		}
		catch(Exception e)
		{
			test.fail("Edit Button is not enabled");
			catchexceptionscreenshot1(test,e) ;
		}
}

@Test(priority=117)
public void EditDrugok() throws InterruptedException, IOException, FindFailed
{
	test = extent.createTest(funTestCaseName()+" Click on Drug Edit data, Without editing click on the Update button");
	try {
		Editdrug("ChemotherapyConfigurationSection4View",test);
		}
		catch(Exception e)
		{
			test.fail("Drug Configuration not able to edit");
			catchexceptionscreenshot1(test,e) ;
		}
	try {
		demo.isdisplayed(chemo.Update, "UPDATE", test, driver);
		demo.isEnabled(chemo.Update, "UPDATE", test, driver);
		chemo.Update.click();
		Sitesave1("Drug Configuration", "Drug data Updated.", "Drug Configuration", "Drug data Updated.",0,driver,test);
	}
	catch(Exception e)
	{
		catchexceptionscreenshot(test,e) ;
	}	
}

@Test(priority=118)
public void EditDrugmodify() throws InterruptedException, IOException, FindFailed
{
	test = extent.createTest(funTestCaseName()+" Click on Drug Edit data, Modify the data click on the Update data");
	try {
		Editdrug("ChemotherapyConfigurationSection4View",test);
		WebElement text= driver.findElement(By.className("ChemotherapyConfigurationSection4View"));
	    WebElement Listrow = text.findElements(By.className("DataGridRow")).get(0);
	    WebElement DrugName=Listrow.findElements(By.className("DataGridCell")).get(2);
	    String Drugeditname=DrugName.getText();
	    
	    chemo.DrugName.click();
	    driver.switchTo().activeElement().sendKeys("Drug1");
	    demo.ByInvalidErrormessage(chemo.DrugName, "Drug1", test, driver);
	    Thread.sleep(1000);
	    Editclick1();
	    Editdrug(8,test);
	    Drugbox = driver.findElements(By.className("TextBox")).get(0);
	    Drugbox.clear();
		Dosevaliddata(0);
		EditUpdate(1);
		DrugSavemsg();
		chemo.Update.click();
		Sitesave1("Drug Configuration", "Drug data Updated.", "Drug Configuration", "Drug data Updated.",0,driver,test);
		}
		catch(Exception e)
		{
			test.fail("Drug Configuration not able to edit");
			catchexceptionscreenshot1(test,e) ;
		}
		
}





@Test(priority=119)//*** Change
public void DeletedatabaseDrug() throws FindFailed, ClassNotFoundException, IOException, InterruptedException, SQLException
{    test = extent.createTest(guiTestCaseName() + "To verify the datagrid and database elements for DELETE data");
compareDataWithDatabaseDrugname(test, "ChemotherapyConfigurationSection4View");
}

@Test(priority=120)
public void deletedatanotdisplayedDrug() throws IOException
{
	test = extent.createTest(funTestCaseName()+"Deleted data not displayed");
	WebElement text= driver.findElement(By.className("ChemotherapyConfigurationSection4View"));
    WebElement Listrow = text.findElements(By.className("DataGridRow")).get(0);
    WebElement Delete=Listrow.findElements(By.className("DataGridCell")).get(2);

	demo.ByInvalidErrormessage(Delete, Actualtext7, test, driver);
}

@Test(priority=121)
public void deletedatasaveDrug() throws IOException, InterruptedException
{
	test = extent.createTest(funTestCaseName()+" Deleted Drug name, Enetred Once again it should save the data");
	chemo.DrugName.click();
	driver.switchTo().activeElement().sendKeys(Actualtext7); 
	Editclick1();
	Dosevaliddata(0);
	EditUpdate(1);
	DrugSavemsg();
}

@Test(priority=122)
public void DeletedatabaseaddDrug() throws FindFailed, ClassNotFoundException, IOException, InterruptedException, SQLException
{    test = extent.createTest(guiTestCaseName() + "To verify the datagrid and database elements for data added Drug DELETE data");
compareDataWithDatabaseDrugname(test, "ChemotherapyConfigurationSection4View");
}

@Test(priority=122)
public void Doseanddurgfun() throws IOException
{
	Editclick1();
}
@Test(priority=123)
public void Addiconlabel() throws IOException
{
	DrugEdit = driver.findElements(By.className("Button")).get(18);
	 DrugEdit.click();
	 test = extent.createTest(guiTestCaseName()+" To verify Drug Add icon label");
	 Addicon = driver.findElements(By.className("Button")).get(6);
	 demo.isdisplayed(Addicon, "Add icon", test, driver);
	 demo.isEnabled(Addicon, "Add icon", test, driver);
	 
}
@Test(priority=124)
public void DrugUnitlabel() throws IOException
{
	test = extent.createTest(guiTestCaseName()+" To verify Dose and Durg Unit Configuration");
	 DoseLabel = driver.findElements(By.className("Button")).get(5);
	 demo.isdisplayed(DoseLabel, "DOSE AND UNIT CONFIGURATION", test, driver);
	 demo.Textcomparsion(DoseLabel, "DOSE AND UNIT CONFIGURATION", test, driver); 
}
@Test(priority=125)
public void CloseButtonlabel() throws IOException
{
	test = extent.createTest(guiTestCaseName()+" To verify Close Button");
	 demo.isdisplayed(CloseButton, "Close Button", test, driver);
	  
}
@Test(priority=126)
public void Editlabel() throws IOException
{
	test = extent.createTest(guiTestCaseName()+" To verify Drug Edit button is displayed and enabled by default");
	Edit = driver.findElements(By.className("Button")).get(8);
	 demo.isdisplayed(Edit, "Edit", test, driver);
	 demo.isEnabled(Edit, "Edit", test, driver);	  
}

@Test(priority=127)
public void Deletelabel() throws IOException
{
	test = extent.createTest(guiTestCaseName()+" To verify Drug Delete is displayed and disabled by default");
	Delete = driver.findElements(By.className("Button")).get(9);
	 demo.isdisplayed(Delete, "Delete", test, driver);
	 demo.BydefaultisEnabled(Delete, "Delete", test, driver);  
}

@Test(priority=128)
public void Update() throws IOException
{
	 test = extent.createTest(guiTestCaseName()+" To verify Drug Update is displayed and Enabled by default");
	 demo.isdisplayed(chemo.Update, "Update", test, driver);
	 demo.isEnabled(chemo.Update, "Update", test, driver);  
}

@Test(priority=129)
public void Doselabel() throws IOException
{
	 test = extent.createTest(guiTestCaseName()+" To verify Dose label is displayed");
	 demo.isdisplayed(chemo.Dose, "Dose", test, driver);
	 demo.Textcomparsion(chemo.Dose, "Dose", test, driver);  
}

@Test(priority=130)
public void DoseTextbox() throws IOException
{
	 test = extent.createTest(guiTestCaseName()+" To verify Dose Textbox is displayed");
	 Drugbox = driver.findElements(By.className("TextBox")).get(0);
	 demo.isdisplayed(Drugbox,"Drugbox", test, driver);
	 demo.isempty(Drugbox,"Drugbox", test, driver);
	  
}
@Test(priority=131)
public void Unitlabel() throws IOException
{
	 test = extent.createTest(guiTestCaseName()+" To verify Unit label is displayed");
	 demo.isdisplayed(chemo.Unit, "Unit", test, driver);
	 demo.Textcomparsion(chemo.Unit, "Unit", test, driver);   
}

@Test(priority=132)
public void UnitCombobox() throws IOException
{
	 test = extent.createTest(guiTestCaseName()+" To verify Unit Combobox is displayed");
	 DrugUnit = driver.findElements(By.className("ComboBox")).get(1);
	 demo.isdisplayed(DrugUnit, "Select Any", test, driver);  
}


@Test(priority=133)
public void Editanddelete() throws IOException
{
	test = extent.createTest(guiTestCaseName()+" Click on the Drug Update button errormessage should be displayed");
	chemo.Update.click();
	
	try {
		demo.isdisplayed(chemo.blankmessage, "Input cannot be blank", test, driver);
	   }
	catch(Exception e)
	{
		test.fail("Input cannot be blank error element not found");
		catchexceptionscreenshot1(test,e) ;
	}

}

@Test(priority=134)
public void Errormessageclose() throws IOException, InterruptedException
{
	test = extent.createTest(guiTestCaseName()+" Click on the Drug Close and Open Errormessage should not display");
	Actions action=new Actions(driver);
	action.moveToElement(CloseButton).moveByOffset(-2, 0).click().perform();
	try {
		if(!chemo.blankmessage.isDisplayed())
		{
			test.pass("Error message is not displaying");
		}
		else
		{
			test.fail("Error message is displaying");
		}
	}
		catch(Exception e)
		{
			test.pass("Error message is not displaying");
			catchexceptionscreenshot1(test,e) ;
		}
}




@Test(priority=135)
public void Drugtextbox() throws IOException, InterruptedException
{
	
	
	randomUpper(20);
	Thread.sleep(1000);
	ValidataUpper("Drug Name");
	Thread.sleep(1000);
	DrugEdit = driver.findElements(By.className("Button")).get(18);
	DrugEdit.click();
	Thread.sleep(1000);
	Dosevaliddata(0);
	Thread.sleep(1000);
	chemo.Update.click();
	test = extent.createTest(guiTestCaseName()+" Enter only  DrugDose and Drugname error message is displayed");
	demo.isdisplayed(chemo.SelectAny, "Select Any", test, driver);
	Thread.sleep(1000);
   Actions action=new Actions(driver);
    CloseButton = driver.findElements(By.className("Button")).get(4);
    action.moveToElement(CloseButton).moveByOffset(-2, 0).click().perform();
}

@Test(priority=136)
public void Unittextbox() throws IOException, InterruptedException
{
	test = extent.createTest(guiTestCaseName()+" Enter only  Unit and Empty Dosetextbox  error message is displayed");
	DrugEdit = driver.findElements(By.className("Button")).get(18);
	DrugEdit.click();
	EditUpdate(1);
	demo.isdisplayed(chemo.blankmessage, "Input cannot be blank", test, driver);
	 Actions action=new Actions(driver);
	 CloseButton = driver.findElements(By.className("Button")).get(4);
	 action.moveToElement(CloseButton).moveByOffset(-2, 0).click().perform();
}




//@Test(priority=137)
public void DrugDoseElements1() throws InterruptedException
{
	
	
    Drugbox = driver.findElements(By.className("TextBox")).get(0);//Textbox
 
	DrugUnit = driver.findElements(By.className("ComboBox")).get(1);//Drugunit
	//action.moveToElement(DrugUnit).perform();
	
	CloseButton = driver.findElements(By.className("Button")).get(4);// close icon
	//action.moveToElement(CloseButton).perform();
	
	DoseLabel = driver.findElements(By.className("Button")).get(5);// 5 is Dose 
	//action.moveToElement(DoseLabel).perform();
	
	Addicon = driver.findElements(By.className("Button")).get(6);// 5 is aDDICON 
	//action.moveToElement(Addicon).perform();
	
	Update = driver.findElements(By.className("Button")).get(7);// 7  is update
	//action.moveToElement(Update).perform();

	Edit = driver.findElements(By.className("Button")).get(8); // is edit
	//action.moveToElement(Edit).perform();

	Delete = driver.findElements(By.className("Button")).get(9);// delete
	//action.moveToElement(Delete).perform();
}
@Test(priority=138)
public void DrugandUnittextbox() throws IOException, InterruptedException
{
	test = extent.createTest(guiTestCaseName()+" Enter both Drug and Doseunit and Update the data");
	DrugEdit = driver.findElements(By.className("Button")).get(18);
	DrugEdit.click();
	Dosevaliddata(0);
	EditUpdate1(1);
	try {
	Drugbox = driver.findElements(By.className("TextBox")).get(0);
	DrugUnit = driver.findElements(By.className("ComboBox")).get(1);
	demo.Textcomparsion(Drugbox, drugdose, test, driver);
	demo.isdisplayed(DrugUnit, Unitdose, test, driver);
	}
	catch(Exception e)
	{
		catchexceptionscreenshot(test,e) ;
	}
	finally {
		 Actions action=new Actions(driver);
	action.moveToElement(chemo.Update).click().perform();
	}
}


@Test(priority=139)
public void Drugdoseadd() throws IOException, InterruptedException
{
	test = extent.createTest(guiTestCaseName()+" Click on the Drug Addicon, Edit and delete button are enabled");
	for(int i=1;i<=10;i++)
	{
	DrugEdit = driver.findElements(By.className("Button")).get(18);
	DrugEdit.click();
	//demo.isEnabled(Addicon, "Addicon", test, driver);
	Addicon = driver.findElements(By.className("Button")).get(6);
	 Actions action=new Actions(driver);
	action.moveToElement(Addicon).click().perform();
	Edit = driver.findElements(By.className("Button")).get(8);
	demo.isEnabled(Edit, "Edit", test, driver);
	Delete = driver.findElements(By.className("Button")).get(9);
	demo.isEnabled(Delete, "Delete", test, driver);
	Dosevaliddata(i);
	EditUpdate1(i+1);
	test.info("*******************************************************************");
	chemo.Update.click();
	if(i==2)
	{
		chemo.DrugName.click();
		chemo.DrugName.clear();
		driver.switchTo().activeElement().sendKeys("Dose and Drug");
		DrugSavemsg();
		break;
	}
	}
}

@Test(priority=140)
public void Drugnameinvalid() throws IOException, InterruptedException
{
	DrugEdit = driver.findElements(By.className("Button")).get(18);
	DrugEdit.click();
	Thread.sleep(1000);
	Drugbox = driver.findElements(By.className("TextBox")).get(0);
	test = extent.createTest(funTestCaseName()+" To verify Drugdose textbox should not accept the alphabhets");
	Invaliddata(Drugbox, "ABCHGHSGHFSHGDHGDD",test);
	Thread.sleep(1000);
	test = extent.createTest(funTestCaseName()+" To verify Drugdose textbox should not accept the specialchars");
	Invaliddata(Drugbox, "#$%&()*-/:;<=>?@[]^_`{|}~",test);
	Thread.sleep(1000);
	test = extent.createTest(funTestCaseName()+"To verify  Drugdose textbox should not accept the invalidchars");
	Invaliddata(Drugbox,  "\\,\",'",test);
	Thread.sleep(1000);
	test = extent.createTest(funTestCaseName()+" To verify  Drugdose textbox should not accept the alphanumeric");
	Invaliddata(Drugbox,  "shgdjdgd&^&%&",test);
	Thread.sleep(1000);
	CloseButton = driver.findElements(By.className("Button")).get(4);
	 Actions action=new Actions(driver);
	action.moveToElement(CloseButton).moveByOffset(-2, 0).click().perform();	
}

@Test(priority=141)
public void DrugnameRangevalidation() throws IOException
{
	DrugEdit = driver.findElements(By.className("Button")).get(18);
	DrugEdit.click();
	Drugbox = driver.findElements(By.className("TextBox")).get(0);
try
	{
	
	test = extent.createTest(funTestCaseName()+" To verify Entered Drugdose less than Min error message should get displayed");
	InvalidRange(Drugbox, "0.01","Range:[0.1 to 10000]","Range:[0.1 to 10000]",test);
     }
catch(Exception e)
      {
	catchexceptionscreenshot1(test,e) ;
     }

try
{
test = extent.createTest(funTestCaseName()+" To verify Entered Drugdose more than Max error message should get displayed");
InvalidRange(Drugbox, "100000","Range:[0.1 to 10000]","Range:[0.1 to 10000]",test);
 }
catch(Exception e)
  {
	catchexceptionscreenshot1(test,e) ;
 }
CloseButton = driver.findElements(By.className("Button")).get(4);	
Actions action=new Actions(driver);
action.moveToElement(CloseButton).moveByOffset(-2, 0).click().perform();	
}

@Test(priority=142)
public void Samenameexits() throws IOException, InterruptedException
{
	test = extent.createTest(funTestCaseName()+" To verify enetred same drugname errormessage is displayed");
	DrugEdit = driver.findElements(By.className("Button")).get(18);
	DrugEdit.click();
	Thread.sleep(1000);
	Drugbox = driver.findElements(By.className("TextBox")).get(0);
	Drugbox.click();
	driver.switchTo().activeElement().sendKeys("0.9");
	Thread.sleep(1000);
	EditUpdate1(1);
	Addicon = driver.findElements(By.className("Button")).get(6);
	Addicon.click();
	Drugbox = driver.findElements(By.className("TextBox")).get(1);
	Drugbox.click();
	driver.switchTo().activeElement().sendKeys("0.9");
	Thread.sleep(1000);
	EditUpdate2(2);
	WebElement SameDosemessage=driver.findElement(By.name("Same Dose and Unit already exist"));
	demo.isdisplayed(SameDosemessage, "Same Dose and Unit already exist", test, driver);
	demo.Textcomparsion(SameDosemessage, "Same Dose and Unit already exist", test, driver);
	CloseButton = driver.findElements(By.className("Button")).get(4);	
	 Actions action=new Actions(driver);
	action.moveToElement(CloseButton).moveByOffset(-2, 0).click().perform();
}

@Test(priority=143)
public void EditandUpdatedrug() throws InterruptedException, IOException
{
	test = extent.createTest(funTestCaseName()+" To verify Drug data edited and updated is displayed correctly or not");
	int j=0;
	DrugEdit = driver.findElements(By.className("Button")).get(18);
	DrugEdit.click();
	for(int i=0;i<=20;i++)
	{
	Dosevaliddata(i);
	EditUpdate1(i+1);
	String Drugdata=drugdose;
	String DrugUnitdata=selectedOption;
	chemo.Update.click();
	DrugEdit = driver.findElements(By.className("Button")).get(18);
	DrugEdit.click();
	Editdrug(i+8+j,test);
	
	Thread.sleep(1000);
	Drugbox = driver.findElements(By.className("TextBox")).get(i);
	demo.ByValidErrormessage(Drugbox, Drugdata, test, driver);
	Thread.sleep(1000);
	DrugUnit = driver.findElements(By.className("ComboBox")).get(i+1);
	demo.Textcomparsion(DrugUnit, DrugUnitdata, test, driver);
	Thread.sleep(1000);
	Drugbox.clear();
	
	
	Dosevaliddata(i);
	EditUpdate1(i+1);
	String Drugdata1=drugdose;
	String DrugUnit2=selectedOption;
	chemo.Update.click();
	DrugEdit = driver.findElements(By.className("Button")).get(18);
	DrugEdit.click();
	Editdrug(i+8+j,test);
	Thread.sleep(1000);
	j=j+1;
	System.out.println(j);
	Thread.sleep(1000);
	Drugbox = driver.findElements(By.className("TextBox")).get(i);
	demo.ByValidErrormessage(Drugbox, Drugdata1, test, driver);
	Thread.sleep(1000);
	DrugUnit = driver.findElements(By.className("ComboBox")).get(i+1);
	demo.Textcomparsion(DrugUnit, DrugUnit2, test, driver);
	Thread.sleep(1000);
	test.info("***************************************************************************************");
	if(i==1)
	{
		chemo.Update.click();
		randomUpper(20);
		Thread.sleep(1000);
		ValidataUpper("Drug Name");
		Thread.sleep(1000);
		DrugSavemsg();
		break;
	}
	Addicon = driver.findElements(By.className("Button")).get(6);
	Addicon.click();
	}
}
@Test(priority=144)
public void Drugdelete() throws IOException, InterruptedException
{
	test = extent.createTest(funTestCaseName()+" To verify Drugdata deleted and Updated");
	int j=0;
	DrugEdit = driver.findElements(By.className("Button")).get(18);
	DrugEdit.click();
	Dosevaliddata(0);
	EditUpdate1(1);
	Delete = driver.findElements(By.className("Button")).get(9);
	demo.BydefaultisEnabled(Delete, "Delete", test, driver);
	for(int i=1;i<=20;i++)
	{
	Addicon = driver.findElements(By.className("Button")).get(6);
	Addicon.click();
	Delete = driver.findElements(By.className("Button")).get(9);
	Thread.sleep(1000);
	Dosevaliddata(i);
	EditUpdate1(i+1);
	Thread.sleep(1000);
	Editdrug(i+10,test);
	Thread.sleep(1000);
	chemo.Update.click();
	DrugEdit = driver.findElements(By.className("Button")).get(18);
	DrugEdit.click();
	demo.BydefaultisEnabled(Delete, "Delete", test, driver);
	chemo.Update.click();
	randomalpha(20);
	ValidataUpperLower("Drug Name");
	Thread.sleep(1000);
	DrugSavemsg();
	break;
	}
}

@Test(priority=145)
public void Drugdeleteclose() throws IOException, InterruptedException
{
	
	randomalpha(20);
	ValidataUpperLower("Drug Name");
	test = extent.createTest(funTestCaseName()+" To verify Drugdata deleted and closed without update the data");
	int j=0;
	DrugEdit = driver.findElements(By.className("Button")).get(18);
	DrugEdit.click();
	Dosevaliddata(0);
	EditUpdate1(1);
	Delete = driver.findElements(By.className("Button")).get(9);
	demo.BydefaultisEnabled(Delete, "Delete", test, driver);
	chemo.Update.click();
	DrugEdit = driver.findElements(By.className("Button")).get(18);
	DrugEdit.click();
	for(int i=1;i<=20;i++)
	{
	Addicon = driver.findElements(By.className("Button")).get(6);
	Addicon.click();
	Thread.sleep(1000);
	Dosevaliddata(i);
	EditUpdate1(i+1);
	Thread.sleep(1000);
	Editdrug(i+10,test);
	Thread.sleep(1000);
	 Actions action=new Actions(driver);
	action.moveToElement(CloseButton).moveByOffset(-2, 0).click().perform();
	DrugEdit = driver.findElements(By.className("Button")).get(18);
	DrugEdit.click();
	chemo.Update.click();
	Thread.sleep(1000);
	DrugSavemsg();
	break;
	}
	
}// Delete the doe in the middle



public void Editdrug(int i, ExtentTest test) throws InterruptedException, IOException
{
	Edit = driver.findElements(By.className("Button")).get(i);
	demo.isEnabled(Edit,"Edit", test, driver);
	Edit.click();
}


public void EditUpdate1(int i) throws InterruptedException
{
	DrugUnit = driver.findElements(By.className("ComboBox")).get(i);
	Actions action=new Actions(driver);
	action.moveToElement(DrugUnit).click().perform();
	randomdose();
	WebElement UnitmL=driver.findElement(By.name(selectedOption));
	Unitdose=selectedOption;
	action.moveToElement(UnitmL).click().perform();
}


public void EditUpdate(int i) throws InterruptedException
{
	DrugUnit = driver.findElements(By.className("ComboBox")).get(i);
	Actions action=new Actions(driver);
	action.moveToElement(DrugUnit).click().perform();
	randomdose();
	WebElement UnitmL=driver.findElement(By.name(selectedOption));
	Unitdose=selectedOption;
	action.moveToElement(UnitmL).click().perform();
	Update = driver.findElements(By.className("Button")).get(7);
	action.moveToElement(Update).click().perform();
}

public void EditUpdate2(int i) throws InterruptedException
{
	DrugUnit = driver.findElements(By.className("ComboBox")).get(i);
	Actions action=new Actions(driver);
	action.moveToElement(DrugUnit).click().perform();
	WebElement UnitmL=driver.findElement(By.name(selectedOption));
	Unitdose=selectedOption;
	action.moveToElement(UnitmL).click().perform();
	Update = driver.findElements(By.className("Button")).get(7);
	action.moveToElement(Update).click().perform();
}

public void Invaliddata(WebElement Name, String Text, ExtentTest test) throws IOException
{
	Name.click();
	driver.switchTo().activeElement().sendKeys(Text);
	demo.isempty(Name,Text, test,driver);
	Name.click();
	driver.switchTo().activeElement().clear();
}

public void InvalidRange(WebElement Name, String Text,String Aelement,String Eelement,ExtentTest test) throws IOException
{
	Name.click();
	driver.switchTo().activeElement().sendKeys(Text);
	chemo.Update.click();
	WebElement element=driver.findElement(By.name(Aelement));
	demo.isdisplayed(element, Eelement, test, driver);
	demo.Textcomparsion(element, Eelement, test, driver);
	Name.click();
	driver.switchTo().activeElement().clear();
}


public void DrugSavemsg() throws InterruptedException, IOException
{
	Drugsave();
	Sitesave("Drug Configuration", "Drug data saved.", "Drug Configuration", "Drug data saved.",3,driver);
}


public void Save(int i, WebDriver driver) throws InterruptedException
{
	By locator = By.name("SAVE");
	List<WebElement> elements = driver.findElements(locator);
	Thread.sleep(1000);
	int desiredIndex = i; 
	if (desiredIndex < elements.size()) {
		Thread.sleep(1000);
	    WebElement element = elements.get(desiredIndex);
	   element.click();
	}
}


public void DrugUpdate() throws InterruptedException, IOException
{
Sitesavecontains("Drug Configuration", "Drug data Updated.", "Drug Configuration", "Drug data Updated.",0,driver);
}

public void DrugDelete() throws InterruptedException, IOException
{
Sitesavecontains("Drug Delete", "Do you want to delete Drug", "Drug Delete", "Do you want to delete Drug",0,driver);
}
public void DrugDeleteconfrimation() throws InterruptedException, IOException
{
Sitesave("Drug Configuration", "Selected Drug data deleted.", "Drug Delete", "Selected Drug data deleted.",0,driver);
}


public void Drugsave() throws InterruptedException
{
	Save(3,driver);
}



public void edit(String Name) throws IOException, FindFailed
{
	        imagePath = Name;
	        s = new Screen();
	        Pattern textPattern = new Pattern(imagePath);
	        match = s.find(textPattern);
	        match.click();
}
public void Chemoconfig(ExtentTest test1) throws IOException {
    try {
        ArrayList<HashMap<String, String>> dataEntries = class1.getDataFromDatabaseChemo();
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

public void Regimenconfig(ExtentTest test1) throws IOException {
    try {
        ArrayList<HashMap<String, String>> dataEntries = class1.getDataFromDatabaseRegimen();
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

public void Radioconfig(ExtentTest test1) throws IOException {
    try {
        ArrayList<HashMap<String, String>> dataEntries = class1.getDataFromDatabaseRadio();
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

public void Drugconfig(ExtentTest test1) throws IOException {
    try {
        ArrayList<HashMap<String, String>> dataEntries = class1.getDataFromDatabaseDrug();
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

public void errormessagedisplayed1(String Text,String ExceptedMsgDescription, ExtentTest test1) throws IOException
{
	try {
		WebElement element=driver.findElement(By.name(Text));
	    DemographicsExternal demo=new DemographicsExternal() ;
	    demo.isdisplayed(element, ExceptedMsgDescription, test1, driver);
	    demo.Textcomparsion(element, ExceptedMsgDescription, test1, driver);
	}
	catch(Exception e) {
		test.fail(ExceptedMsgDescription+" Error message not displayed");
		catchexceptionscreenshot1(test,e) ;
	}
}





public List<String> retrieveDataFromDatabase() throws ClassNotFoundException, SQLException {
    // Your code to retrieve data from the database, returning a list of Classification Names.
    ArrayList<HashMap<String, String>> dataEntries = class1.getDataFromDatabaseChemo();
    List<String> classificationNames = new ArrayList<>();
    for (HashMap<String, String> entry : dataEntries) {
        String classificationName = entry.get("ClassificationName");
        classificationNames.add(classificationName);
    }
    return classificationNames;
}

public List<String> retrieveDataFromDatabaseregimen() throws ClassNotFoundException, SQLException {
    // Your code to retrieve data from the database, returning a list of Classification Names.
    ArrayList<HashMap<String, String>> dataEntries = class1.getDataFromDatabaseRegimen();
    List<String> classificationNames = new ArrayList<>();
    for (HashMap<String, String> entry : dataEntries) {
        String classificationName = entry.get("RegimenName");
        classificationNames.add(classificationName);
    }
    return classificationNames;
}

public List<String> retrieveDataFromDatabaseradio() throws ClassNotFoundException, SQLException {
    // Your code to retrieve data from the database, returning a list of Classification Names.
    ArrayList<HashMap<String, String>> dataEntries = class1.getDataFromDatabaseRadio();
    List<String> classificationNames = new ArrayList<>();
    for (HashMap<String, String> entry : dataEntries) {
        String classificationName = entry.get("RadioSensitizersName");
        classificationNames.add(classificationName);
    }
    return classificationNames;
}

public List<String> retrieveDataFromDatabaseDrug() throws ClassNotFoundException, SQLException {
    // Your code to retrieve data from the database, returning a list of Classification Names.
    ArrayList<HashMap<String, String>> dataEntries = class1.getDataFromDatabaseDrug();
    List<String> classificationNames = new ArrayList<>();
    for (HashMap<String, String> entry : dataEntries) {
        String classificationName = entry.get("DrugName");
        classificationNames.add(classificationName);
    }
    return classificationNames;
}

public List<String> retrieveDataFromDatabaseDose() throws ClassNotFoundException, SQLException {
    // Your code to retrieve data from the database, returning a list of Classification Names.
    ArrayList<HashMap<String, String>> dataEntries = class1.getDataFromDatabaseDrug();
    List<String> classificationNames = new ArrayList<>();
    for (HashMap<String, String> entry : dataEntries) {
        String classificationName = entry.get("DoseAndUnit");
        classificationNames.add(classificationName);
    }
    return classificationNames;
}






public void compareDataWithDatabaseclassification(
	    ExtentTest test, String Classtext) throws IOException, FindFailed, InterruptedException, ClassNotFoundException, SQLException {
	    WebElement text = driver.findElement(By.className(Classtext));
	    List<WebElement> Listrow = text.findElements(By.className("DataGridRow"));
	    System.out.println(Listrow.size());

	    StringBuilder tableHtml = new StringBuilder();
	    tableHtml.append("<table style='font-size: 16px; border-collapse: separate; border-spacing: 10px;'>");
	    tableHtml.append("<tr><th>Row</th><th>Application Value</th><th>Database Value</th><th>Result</th></tr>");

	    for (int i = 0; i < Listrow.size(); i++) {
	        WebElement firstCell = Listrow.get(i).findElements(By.className("DataGridCell")).get(1); // Find the 1st cell in each row
	        String cellText = firstCell.getText();

	        List<String> databaseValues = retrieveDataFromDatabase(); // Retrieve database values using the supplier

	        if (i < databaseValues.size()) {
	            String databaseValue = databaseValues.get(i);
	            String result = cellText.equals(databaseValue) ? "Pass" : "Fail";

	            tableHtml.append("<tr><td>").append(i + 1).append("</td><td>").append(cellText).append("</td><td>")
	                    .append(databaseValue).append("</td><td>").append(result).append("</td></tr>");

	        } else {
	            tableHtml.append("<tr><td>").append(i + 1).append("</td><td>").append(cellText).append("</td><td>")
	                    .append("No matching database value found").append("</td><td>").append("Fail").append("</td></tr>");
	        }
	    }

	    tableHtml.append("</table>");

	    // Pass the table HTML to the Extent report using MarkupHelper
	    test.pass(MarkupHelper.createLabel(tableHtml.toString(), ExtentColor.WHITE));
	}


public void compareDataWithDatabaseregimen(
	    ExtentTest test, String Classtext) throws IOException, FindFailed, InterruptedException, ClassNotFoundException, SQLException {
	    WebElement text = driver.findElement(By.className(Classtext));
	    List<WebElement> Listrow = text.findElements(By.className("DataGridRow"));
	    System.out.println(Listrow.size());

	    StringBuilder tableHtml = new StringBuilder();
	    tableHtml.append("<table style='font-size: 16px; border-collapse: separate; border-spacing: 10px;'>");
	    tableHtml.append("<tr><th>Row</th><th>Application Value</th><th>Database Value</th><th>Result</th></tr>");

	    for (int i = 0; i < Listrow.size(); i++) {
	        WebElement firstCell = Listrow.get(i).findElements(By.className("DataGridCell")).get(1); // Find the 1st cell in each row
	        String cellText = firstCell.getText();

	        List<String> databaseValues = retrieveDataFromDatabaseregimen(); // Retrieve database values using the supplier

	        if (i < databaseValues.size()) {
	            String databaseValue = databaseValues.get(i);
	            String result = cellText.equals(databaseValue) ? "Pass" : "Fail";

	            tableHtml.append("<tr><td>").append(i + 1).append("</td><td>").append(cellText).append("</td><td>")
	                    .append(databaseValue).append("</td><td>").append(result).append("</td></tr>");

	        } else {
	            tableHtml.append("<tr><td>").append(i + 1).append("</td><td>").append(cellText).append("</td><td>")
	                    .append("No matching database value found").append("</td><td>").append("Fail").append("</td></tr>");
	        }
	    }

	    tableHtml.append("</table>");

	    // Pass the table HTML to the Extent report using MarkupHelper
	    test.pass(MarkupHelper.createLabel(tableHtml.toString(), ExtentColor.WHITE));
	}

public void compareDataWithDatabaseRadio(
	    ExtentTest test, String Classtext) throws IOException, FindFailed, InterruptedException, ClassNotFoundException, SQLException {
	    WebElement text = driver.findElement(By.className(Classtext));
	    List<WebElement> Listrow = text.findElements(By.className("DataGridRow"));
	    System.out.println(Listrow.size());

	    StringBuilder tableHtml = new StringBuilder();
	    tableHtml.append("<table style='font-size: 16px; border-collapse: separate; border-spacing: 10px;'>");
	    tableHtml.append("<tr><th>Row</th><th>Application Value</th><th>Database Value</th><th>Result</th></tr>");

	    for (int i = 0; i < Listrow.size(); i++) {
	        WebElement firstCell = Listrow.get(i).findElements(By.className("DataGridCell")).get(1); // Find the 1st cell in each row
	        String cellText = firstCell.getText();

	        List<String> databaseValues = retrieveDataFromDatabaseradio(); // Retrieve database values using the supplier

	        if (i < databaseValues.size()) {
	            String databaseValue = databaseValues.get(i);
	            String result = cellText.equals(databaseValue) ? "Pass" : "Fail";

	            tableHtml.append("<tr><td>").append(i + 1).append("</td><td>").append(cellText).append("</td><td>")
	                    .append(databaseValue).append("</td><td>").append(result).append("</td></tr>");

	        } else {
	            tableHtml.append("<tr><td>").append(i + 1).append("</td><td>").append(cellText).append("</td><td>")
	                    .append("No matching database value found").append("</td><td>").append("Fail").append("</td></tr>");
	        }
	    }

	    tableHtml.append("</table>");

	    // Pass the table HTML to the Extent report using MarkupHelper
	    test.pass(MarkupHelper.createLabel(tableHtml.toString(), ExtentColor.WHITE));
	}



public void compareDataWithDatabaseDrugname(
	    ExtentTest test, String Classtext) throws IOException, FindFailed, InterruptedException, ClassNotFoundException, SQLException {
	    WebElement text = driver.findElement(By.className(Classtext));
	    List<WebElement> Listrow = text.findElements(By.className("DataGridRow"));
	    System.out.println(Listrow.size());

	    StringBuilder tableHtml = new StringBuilder();
	    tableHtml.append("<table style='font-size: 16px; border-collapse: separate; border-spacing: 10px;'>");
	    tableHtml.append("<tr><th>Row</th><th>Drugname (Application)</th><th>Dose (Application)</th><th>Drugname (Database)</th><th>Dose (Database)</th><th>Result</th></tr>");

	    for (int i = 0; i < Listrow.size(); i++) {
	        WebElement drugnameCell = Listrow.get(i).findElements(By.className("DataGridCell")).get(2); // Drugname cell
	        WebElement doseCell = Listrow.get(i).findElements(By.className("DataGridCell")).get(3); // Dose cell

	        String drugname = drugnameCell.getText();
	        String dose = doseCell.getText();

	        List<String> databaseDrugnames = retrieveDataFromDatabaseDrug(); // Retrieve database Drugnames using the supplier
	        List<String> databaseDoses = retrieveDataFromDatabaseDose(); // Retrieve database Doses using the supplier

	        if (i < databaseDrugnames.size() && i < databaseDoses.size()) {
	            String databaseDrugname = databaseDrugnames.get(i);
	            String databaseDose = databaseDoses.get(i);

	            String result = (drugname.equals(databaseDrugname) && dose.equals(databaseDose)) ? "Pass" : "Fail";

	            tableHtml.append("<tr><td>").append(i + 1).append("</td><td>").append(drugname).append("</td><td>").append(dose)
	                    .append("</td><td>").append(databaseDrugname).append("</td><td>").append(databaseDose)
	                    .append("</td><td>").append(result).append("</td></tr>");

	        } else {
	            tableHtml.append("<tr><td>").append(i + 1).append("</td><td>").append(drugname).append("</td><td>").append(dose)
	                    .append("</td><td>Database value missing</td><td>Database value missing</td><td>Fail</td></tr>");
	        }
	    }

	    tableHtml.append("</table>");

	    // Pass the table HTML to the Extent report using MarkupHelper
	    test.pass(MarkupHelper.createLabel(tableHtml.toString(), ExtentColor.WHITE));
	}














 
}
