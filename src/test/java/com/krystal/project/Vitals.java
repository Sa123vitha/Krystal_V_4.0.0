package com.krystal.project;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.windows.WindowsDriver;

public class Vitals extends ReferencefileChemotheraphy{
	
VitalsPOM vitals;

DemographicsExternal demo;

private int count;
WebElement addbutton;
	
@BeforeClass
public void setUp1() throws InterruptedException, IOException {
DesiredCapabilities appCapabilities = new DesiredCapabilities();
appCapabilities.setCapability("app", "C:\\Program Files\\Panacea Medical Technologies\\Krystal\\Krystal.exe");
driver = new WindowsDriver<WebElement>(new URL("http://127.0.0.1:4723"), appCapabilities);
ReferenceSigin Sign=new ReferenceSigin();
Sign.Login(driver);
Sign.Vitals(driver);
vitals=new VitalsPOM(driver);
demo=new DemographicsExternal() ;

}
//@Test(priority =1)
public void addclick1() throws IOException{
	test = extent.createTest(guiTestCaseName()+" To verify the Add icon","Add label should be present ");	
	WebElement addbutton=driver.findElements(By.className("Button")).get(17);
	demo.isEnabled(addbutton, "Add",test,driver);
	Actions action=new Actions(driver);
	action.moveToElement(addbutton).click().perform();
	}
//@Test(priority =2)
	public void button() throws InterruptedException{
	List<WebElement> elements = driver.findElements(By.className("TextBox"));
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
	public  void vitalsTitleLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Vitals Title label","Vitals label should be present ");	
	demo.Textcomparsion(vitals.vitalslabel, "Vitals", test,driver);
	
	}
@Test(priority =2)
	public  void vitalsLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Vitals label","Vitals label should be present ");	
	demo.Textcomparsion(vitals.vitals, "VITALS", test,driver);
	
	}
@Test(priority =4)
	public void heightLabel() throws IOException{
	test = extent.createTest(guiTestCaseName()+" Height(cm) label","Height(cm) label should be present ");	
	demo.Textcomparsion(vitals.height1, "Height  (cm)", test,driver);
	}
@Test(priority =5)
	public void weightLabel() throws IOException{
	test = extent.createTest(guiTestCaseName()+" Weight (kg) label"," Weight (kg) label should be present ");	
	demo.Textcomparsion(vitals.weight, "Weight (kg)", test,driver);
	}
@Test(priority =6)
	public void pulserateLabel() throws IOException{
	test = extent.createTest(guiTestCaseName()+"Pulse rate beats per minute label"," Pulse rate beats per minute label should be present ");	
	demo.Textcomparsion(vitals.pulse, "Pulse Rate (Beats per MINUTE)", test,driver);
	}
@Test(priority =7)
	public void respiratoryrateLabe() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Respiratory rate breaths per minute label"," Respiratory rate breaths per minute label should be present ");	
	demo.Textcomparsion(vitals.rate, "Respiratory Rate (Breaths per MINUTE)", test,driver);
	}
@Test(priority =8)
	public void bloodpressureLabel() throws IOException{
	test = extent.createTest(guiTestCaseName()+" Blood pressure(mm Hg) label"," Blood pressure(mm Hg) label should be present ");	
	demo.Textcomparsion(vitals.blood, "Blood Pressure (mm Hg)", test,driver);
	}
@Test(priority =9)
	public void temperatureLabel() throws IOException{
	test = extent.createTest(guiTestCaseName()+" Temperature(F) label"," Temperature(F) label should be present ");	
	demo.Textcomparsion(vitals.temperature, "Temperature (°F)", test,driver);
	}

@Test(priority =10)
	public void datetimeLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Date time label"," date time label should be present ");	
	demo.Textcomparsion(vitals.datetime, "Date Time", test,driver);
	}
@Test(priority =11)
public void vitaltrendLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Vital trend label"," vital trend label should be present ");	
demo.Textcomparsion(vitals.trend, "VITAL TREND", test,driver);
}
@Test(priority =12)
public void ToverifyheightLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Height label"," Height label should be present ");	
demo.Textcomparsion(vitals.height2, "Height", test,driver);
}
@Test(priority =13)
public void ToverifyweightLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Weight label"," Weight label should be present ");	
demo.Textcomparsion(vitals.Weight2, "Weight", test,driver);
}
@Test(priority =14)
public void ToverifypulserateLabel() throws IOException{
test = extent.createTest(guiTestCaseName()+" Pulse rate label"," Pulse rate label should be present ");	
demo.Textcomparsion(vitals.pulse2, "Pulse rate", test,driver);
}
@Test(priority =15)
public void ToverifyrespiratoryrateLabel() throws IOException{
test = extent.createTest(guiTestCaseName()+" Respiratory rate label"," Respiratory rate label should be present ");	
demo.Textcomparsion(vitals.rate2, "Respiratory Rate", test,driver);
}
@Test(priority =16)
public void ToverifysystolicLabel() throws IOException{
test = extent.createTest(guiTestCaseName()+" Systolic label"," Systolic label should be present ");	
demo.Textcomparsion(vitals.sys2, "Systolic", test,driver);
}
@Test(priority =17)
public void ToverifydiastolicLabel() throws IOException{
test = extent.createTest(guiTestCaseName()+" Diastolic label"," Diastolic label should be present ");	
demo.Textcomparsion(vitals.dis2, "Diastolic", test,driver);
}
@Test(priority =18)
public void ToverifytemperatureLabel() throws IOException{
test = extent.createTest(guiTestCaseName()+" Temperature label","Temperature label should be present ");	
demo.Textcomparsion(vitals.temp2, "Temperature",test,driver);
}

@Test(priority =19)
public void addclick() throws IOException{
	test = extent.createTest(guiTestCaseName()+" Add icon button","Add label should be present ");	
	WebElement addbutton=driver.findElements(By.className("Button")).get(17);
	demo.isEnabled(addbutton, "Add",test,driver);
	Actions action=new Actions(driver);
	action.moveToElement(addbutton).click().perform();
	}
@Test(priority =20)
	
	public void Toverifyaddheight() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Height(cm) label"," height(cm) label should be present ");	
	demo.Textcomparsion(vitals.addheight, "Height (cm)", test,driver);
	}

@Test(priority =21)
	public void Toverifyaddweight() throws IOException{
	test = extent.createTest(guiTestCaseName()+" Weight(kg) label"," weight(kg) label should be present ");	
	demo.Textcomparsion(vitals.addweight, "Weight (kg)", test,driver);
	}
@Test(priority =22)
	public void Toverifyaddpulserate() throws IOException{
	test = extent.createTest(guiTestCaseName()+" pulse rate (Beats per MINUTE) label"," pulse rate (Beats per MINUTE) label should be present ");	
	demo.Textcomparsion(vitals.addpulse, "Pulse Rate (Beats per MINUTE)", test,driver);
	}

@Test(priority =23)
	public void Toverifyaddrespiratoryrate() throws IOException{
	test = extent.createTest(guiTestCaseName()+" Respiratory Rate (Breaths per MINUTE) label"," Respiratory Rate (Breaths per MINUTE) label should be present ");	
	demo.Textcomparsion(vitals.addres, "Respiratory Rate (Breaths per MINUTE)", test,driver);
	}

@Test(priority =24)
	public void Toverifyaddblood() throws IOException{
	test = extent.createTest(guiTestCaseName()+" Blood Pressure(mm Hg) label"," Blood Pressure(mm Hg) label should be present ");	
	demo.Textcomparsion(vitals.addblood, "Blood Pressure (mm Hg)", test,driver);
	}
@Test(priority =25)
	public void Toverifyaddtemperature() throws IOException{
	test = extent.createTest(guiTestCaseName()+" Temperature(F) label"," Temperature(F) label should be present ");	
	demo.Textcomparsion(vitals.addtemp, "Temperature (°F)", test,driver);
	}
@Test(priority =26)
	public void Toverifyaddsave() throws IOException{
	test = extent.createTest(guiTestCaseName()+" Save Button is enabled by default"," Save button should be present ");	
	demo.Textcomparsion(vitals.save, "SAVE", test,driver);
	}
@Test(priority =27)
	public void Toverifyaddclose() throws IOException{
	test = extent.createTest(guiTestCaseName()+" Close enabled by default"," Close button should be present ");	
	demo.Textcomparsion(vitals.close, "CLOSE", test,driver);
	}
@Test(priority =28)
public void defaultbuttonenable() throws IOException 
{
	test = extent.createTest(guiTestCaseName()+" Save button enabled","Save button should be enabled");
	demo.isEnabled(vitals.save, "save", test,driver);
	test = extent.createTest(guiTestCaseName()+" Close button enabled","Close button should be enabled");
	demo.isEnabled(vitals.close, "close", test,driver);
}

@Test(priority =29)
public void Emptydatasave() throws IOException, InterruptedException 
{
	test = extent.createTest(funTestCaseName()+"Empty data  Save, Error message should be displayed","Error message should be displayed");
	vitals.save.click();
	demo.isdisplayed(vitals.Inputblank, "Input cannot be blank", test, driver);
	demo.Textcomparsion(vitals.Inputblank, "Input cannot be blank", test, driver);
	
}
@Test(priority =30)
public void InvalidData() throws IOException
{
	test = extent.createTest("*******************INVALID CHARS***************");
   InvalidData(vitals.addheight,"Height");
	InvalidData(vitals.addweight,"Weight");
	InvalidData(vitals.addpulse,"Pulse Rate");
	InvalidData(vitals.addres,"Respiratory Rate");
	WebElement systolic=driver.findElements(By.className("TextBox")).get(4);
	systolic.click();
	InvalidData(systolic,"Systolic");
	WebElement Dialostic=driver.findElements(By.className("TextBox")).get(5);
	InvalidData(Dialostic,"Dialostic");
	InvalidData(vitals.temperature,"Temparture");
}

@Test(priority =31)
public void InvalidRange() throws IOException
{
	test = extent.createTest(funTestCaseName()+"*********INVALID RANGE********");
	InValidRange(vitals.addheight,"Height");
	InValidRange(vitals.addweight,"Weight");
	InValidRangepulse(vitals.addpulse,"Pulse Rate");
	InValidRangepulse(vitals.addres,"Respiratory Rate");
	WebElement systolic=driver.findElements(By.className("TextBox")).get(4);
	InValidRangepulse(systolic,"Systolic");
	WebElement Dialostic=driver.findElements(By.className("TextBox")).get(5);
	InValidRangepulse(Dialostic,"Dialostic");
	InValidRangetemperature(vitals.temperature,"Temparture");
}


@Test(priority =32)
public void invaliddatasave() throws InterruptedException, IOException
{
	test = extent.createTest("*********INVALID VALUES SAVE********");
	test = extent.createTest(funTestCaseName()+" Save pop-up not display when enetered the invalid data");
	savedata(vitals.addheight, "0");
	
	demo.isdisplayed(vitals.Error300, "Range:[1 to 300]", test, driver);
	savedata(vitals.addweight, "301");
	demo.isdisplayed(vitals.Error300, "Range:[1 to 300]", test, driver);
	savedata(vitals.addpulse, "201");
	demo.isdisplayed(vitals.Error200, "Range:[1 to 200]", test, driver);
	savedata(vitals.addres, "0");
	demo.isdisplayed(vitals.Error200, "Range:[1 to 200]", test, driver);
	WebElement systolic=driver.findElements(By.className("TextBox")).get(4);
	savedata(systolic,"205");
	demo.isdisplayed(vitals.Error200, "Range:[1 to 200]", test, driver);
	WebElement Dialostic=driver.findElements(By.className("TextBox")).get(5);
	savedata(Dialostic,"120");
	demo.isdisplayed(vitals.Error200, "Range:[1 to 200]", test, driver);
	savedata(vitals.addtemp, "130");
	demo.isdisplayed(vitals.Error110, "Range:[1 to 110]", test, driver);
	demo.isdisplayed(vitals.close, "CLOSE",test, driver);
	Thread.sleep(2000);
	vitals.close.click();
	test = extent.createTest(funTestCaseName()+"Click on Close textbox should be empty");
	WebElement addbutton=driver.findElements(By.className("Button")).get(17);
	Actions action=new Actions(driver);
	action.moveToElement(addbutton).click().perform();
	demo.isempty(vitals.addheight, "Height", test, driver);
	demo.isempty(vitals.addweight, "Weight", test, driver);
	demo.isempty(vitals.addpulse, "Pulse", test, driver);
	demo.isempty(vitals.addres, "Respiratory Rate", test, driver);
	demo.isempty(systolic, "Systolic", test, driver);
	demo.isempty(Dialostic, "Dialostic", test, driver);
	demo.isempty(vitals.addtemp, "Tempreture", test, driver);
}


@Test(priority =33)
public void Textfieldvalidadata() throws IOException, InterruptedException
{
	test = extent.createTest("*********VALID VALUES SAVE********");
	ValidRange(vitals.addheight,"Height");
	ValidRange(vitals.addweight,"Weight");
	ValidRangepulse(vitals.addpulse,"Pulse Rate");
	ValidRangepulse(vitals.addres,"Respiratory Rate");
	WebElement systolic=driver.findElements(By.className("TextBox")).get(4);
	ValidRangepulse(systolic,"Systolic");
	WebElement Dialostic=driver.findElements(By.className("TextBox")).get(5);
	ValidRangepulse(Dialostic,"Dialostic");
	ValidRangetemperature(vitals.temperature,"Temparture");
	
}


@Test(priority =34) 
public void  validdatasave()throws InterruptedException, IOException
{
test = extent.createTest("*********VALID RANGE SAVE********");
test = extent.createTest(funTestCaseName()+" Verify Vitals Save  pop-up window is displayed");
savedata(vitals.addheight, "1");
savedata(vitals.addweight, "300");
savedata(vitals.addpulse, "3");
savedata(vitals.addres, "8");
WebElement systolic=driver.findElements(By.className("TextBox")).get(4);
savedata(systolic,"6");
WebElement Dialostic=driver.findElements(By.className("TextBox")).get(5);
savedata(Dialostic,"8");
savedata(vitals.addtemp, "19");
Thread.sleep(1000);
Sitesave1("Vitals Save","Vitals data saved for selected patient.", "Vitals Save","Vitals data saved for selected patient.",0,driver,test);

}
@Test(priority =35) 
public void  validdatanextsave()throws InterruptedException, IOException
{
	test = extent.createTest("*********VALID RANGE EXITS********");
    test = extent.createTest(funTestCaseName()+" Verify Vitals data already exits pop-up window is displayed");
	WebElement addbutton=driver.findElements(By.className("Button")).get(17);
	Actions action=new Actions(driver);
	action.moveToElement(addbutton).click().perform();
	savedata(vitals.addheight, "2");
	savedata(vitals.addweight, "200");
	savedata(vitals.addpulse, "5");
	savedata(vitals.addres, "18");
	WebElement systolic=driver.findElements(By.className("TextBox")).get(4);
	savedata(systolic,"4.6");
	WebElement Dialostic=driver.findElements(By.className("TextBox")).get(5);
	savedata(Dialostic,"8.8");
	savedata(vitals.addtemp, "110");
	Sitesave1("Vitals Add","Vitals data for the date already exists, hence cannot add duplicate record.", "Vitals Add","Vitals data for the date already exists, hence cannot add duplicate record.",0,driver,test);
}


@Test(priority =36)  
public void validedit() throws InterruptedException, IOException
{
	test = extent.createTest(guiTestCaseName()+"Edit and Delete button should be displayed and enabled");
	demo.isdisplayed(vitals.Edit, "EDIT", test,driver);
	demo.isEnabled(vitals.Edit, "EDIT", test,driver);
	
	demo.isdisplayed(vitals.Delete, "DELETE", test,driver);
	demo.isEnabled(vitals.Delete, "DELETE", test,driver);
	
}
@Test(priority =37) 
public void Editclick() throws IOException, InterruptedException
{
	vitals.Edit.click();
	test = extent.createTest(funTestCaseName()+"Click on Edit Update and Close displayed and enabled");
	Thread.sleep(1000);
	demo.isdisplayed(vitals.Update, "UPDATE", test,driver);
	demo.isEnabled(vitals.Update, "UPDATE", test,driver);
	demo.Textcomparsion(vitals.Update, "UPDATE", test,driver);
	demo.isdisplayed(vitals.close, "CLOSE", test,driver);
	demo.isEnabled(vitals.close, "CLOSE", test,driver);
	demo.Textcomparsion(vitals.close, "CLOSE", test,driver);

}
@Test(priority =38) 
public void Editdata() throws IOException, InterruptedException
{
	test = extent.createTest(funTestCaseName()+"Modify the data and Click on the Update Button pop-up should be displayed");	
	validdataedit(test);
	vitals.Update.click();
	Sitesave1("Vitals Update","Selected Vitals data updated.", "Vitals Update","Selected Vitals data updated.",0,driver,test);
}


@Test(priority =39) 
public void gettext() throws IOException, InterruptedException
{
	
	vitals.Edit.click();
	test = extent.createTest(funTestCaseName()+"Updated Values displayed correctly");
	demo.ByValidErrormessage(vitals.addheight, "300", test, driver);
	demo.ByValidErrormessage(vitals.addweight, "1", test, driver);
	demo.ByValidErrormessage(vitals.addpulse, "6", test, driver);
	demo.ByValidErrormessage(vitals.addres, "10", test, driver);
	demo.ByValidErrormessage(vitals.addblood, "16", test, driver);
	WebElement Dialostic=driver.findElements(By.className("TextBox")).get(5);
	demo.ByValidErrormessage(Dialostic, "81", test, driver);
	demo.ByValidErrormessage(vitals.addtemp, "110", test, driver);
	vitals.Update.click();
	Sitesave1("Vitals Update","Selected Vitals data updated.", "Vitals Update","Selected Vitals data updated.",0,driver,test);
}
@Test(priority =40) 
public void deleteCancelbutton() throws IOException, InterruptedException
{
	test = extent.createTest(funTestCaseName()+"Click on delete pop-up message is displayed and click on cancel");
	vitals.Delete.click();
	SitesaveCancel1("Vitals Delete","Do you want to delete the selected Vitals details?", "Vitals Delete","Do you want to delete the selected Vitals details?",0,driver,test);
}

@Test(priority =41) 
public void deleteOKbutton() throws IOException, InterruptedException
{
	test = extent.createTest(funTestCaseName()+"Click on delete pop-up message is displayed and Click on OK Button");
	vitals.Delete.click();
	Sitesave1("Vitals Delete","Do you want to delete the selected Vitals details?", "Vitals Delete","Do you want to delete the selected Vitals details?",0,driver,test);
	Sitesave1("Vitals Delete","Selected Vitals data deleted.", "Vitals Delete","Selected Vitals data deleted.",0,driver,test);
}
@Test(priority =42) 
public void deleteenterdata() throws IOException, InterruptedException
{
	addclick();
	validdatasave();
}


	
//@Test(priority =43) 	
public void VitalsThred() throws IOException, InterruptedException
{
	test = extent.createTest("******************VITALS THREAD*************************");
	vitals.Menu.click();
}

public void validdataedit(ExtentTest test) throws InterruptedException, IOException
{
	vitals.addheight.click();
	String height=vitals.addheight.getText();
	driver.switchTo().activeElement().clear();
	savedataedit(vitals.addheight, "300");
	demo.ByValidErrormessage(vitals.addheight, "300", test, driver);
	vitals.addweight.click();
	String weight=vitals.addweight.getText();
	driver.switchTo().activeElement().clear();
	savedataedit(vitals.addweight, "1");
	demo.ByValidErrormessage(vitals.addweight, "1", test, driver);
	vitals.addpulse.click();
	String pulse=vitals.addpulse.getText();
	driver.switchTo().activeElement().clear();
	savedataedit(vitals.addpulse, "6");
	demo.ByValidErrormessage(vitals.addpulse, "6", test, driver);
	vitals.addres.click();
	String res=vitals.addres.getText();
	driver.switchTo().activeElement().clear();
	savedataedit(vitals.addres, "10");
	demo.ByValidErrormessage(vitals.addres, "10", test, driver);
	vitals.addblood.click();
	String blood=vitals.addblood.getText();
	driver.switchTo().activeElement().clear();
	savedataedit(vitals.addblood, "16");
	demo.ByValidErrormessage(vitals.addblood, "16", test, driver);
	Actions action=new Actions(driver);
	action.moveToElement(vitals.addblood).moveByOffset(200,0).click().perform();
	WebElement Bloodnext=driver.switchTo().activeElement();
	String bloodnext=Bloodnext.getText();
	driver.switchTo().activeElement().clear();
	savedataedit(Bloodnext, "81");
	demo.ByValidErrormessage(Bloodnext, "81", test, driver);
	vitals.addtemp.click();
	String temp=vitals.addtemp.getText();
	driver.switchTo().activeElement().clear();
	savedataedit(vitals.addtemp, "110");
	demo.ByValidErrormessage(vitals.addtemp, "110", test, driver);
}


public void savedata(WebElement savedata, String Text)
{
	savedata.click();
	driver.switchTo().activeElement().sendKeys(Text);
	vitals.save.click();
}

public void savedataedit(WebElement savedata, String Text)
{
	savedata.click();
	driver.switchTo().activeElement().sendKeys(Text);
}


public void InvalidData(WebElement Invaliddata, String Text) throws IOException
{
	test = extent.createTest(funTestCaseName() +Text+" textbox should not accept the alphabhets");
	Invaliddata(Invaliddata, "ABCHGHSGHFSHGDHGDD");
	test = extent.createTest(funTestCaseName() +Text+" textbox should not accept the specialchars");
	Invaliddata(Invaliddata, "#$%&()*-/:;<=>?@[]^_`{|}~");
	test = extent.createTest(funTestCaseName() +Text+" textbox should not accept the invalidchars");
	Invaliddata(Invaliddata,  "\\,\",'");
	test = extent.createTest(funTestCaseName() +Text+" textbox should not accept the alphanumeric");
	Invaliddata(Invaliddata,  "shgdjdgd&^&%&");
}
public void ValidRange(WebElement Validrange,String Text) throws IOException
{
	test = extent.createTest(funTestCaseName() +Text+" textbox should  accept wholenumbers and decimalnumbers");
	Validdata(Validrange, "1");
	Validdata(Validrange, "1.89");
	Validdata(Validrange, "150");
	Validdata(Validrange, "150.76");
	Validdata(Validrange, "299");
	Validdata(Validrange, "299.99");
	Validdata(Validrange, "300");
	
}
public void InValidRange(WebElement InValidrange,String Text) throws IOException
{
	test = extent.createTest(funTestCaseName() +Text+" range less than 1 and more than 300 error message is displayed or not");
	Invalidrange(InValidrange, "0");
	Invalidrange(InValidrange, "0.9");
	Invalidrange(InValidrange, "300.09");
	Invalidrange(InValidrange, "301");
	Invalidrange(InValidrange, "0.9");
	Invalidrange(InValidrange, "0.1");
	Invalidrange(InValidrange, "301");
}
public void ValidRangepulse(WebElement Validrange,String Text) throws IOException
{
	test = extent.createTest(funTestCaseName() +Text+" textbox  accept wholenumbers and decimalnumbers");
	Validdata(Validrange, "1");
	Validdata(Validrange, "1.99");
	Validdata(Validrange, "150");
	Validdata(Validrange, "149.99");
	Validdata(Validrange, "199");
	Validdata(Validrange, "199.9");
	Validdata(Validrange, "200");
	
}
public void InValidRangepulse(WebElement InValidrange,String Text) throws IOException
{
	test = extent.createTest(funTestCaseName() +Text+" range less than 1 and more than 300 error message is displayed or not");
	Invalidrangepulse(InValidrange, "0");
	Invalidrangepulse(InValidrange, "0.9");
	Invalidrangepulse(InValidrange, "300.1");
	Invalidrangepulse(InValidrange, "201");
	Invalidrangepulse(InValidrange, "0.99");
	Invalidrangepulse(InValidrange, "200.9");
	Invalidrangepulse(InValidrange, "00");
}

public void ValidRangetemperature(WebElement Validrange,String Text) throws IOException
{
	test = extent.createTest(funTestCaseName() +Text+" textbox accept wholenumbers and decimalnumbers");
	Validdata(Validrange, "1");
	Validdata(Validrange, "1.99");
	Validdata(Validrange, "55");
	Validdata(Validrange, "55.99");
	Validdata(Validrange, "109");
	Validdata(Validrange, "109.99");
	Validdata(Validrange, "110");
	
}
public void InValidRangetemperature(WebElement InValidrange,String Text) throws IOException
{
	test = extent.createTest(funTestCaseName() +Text+" range less than 1 and more than 300 error message is displayed or not");
	Invalidrangetemp(InValidrange, "0");
	Invalidrangetemp(InValidrange, "0.9");
	Invalidrangetemp(InValidrange, "110.09");
	Invalidrangetemp(InValidrange, "111");
	Invalidrangetemp(InValidrange, "0.1");
	Invalidrangetemp(InValidrange, "0.999");
	Invalidrangetemp(InValidrange, "0.00");
}
public void Invaliddata(WebElement Name, String Text) throws IOException
{
	Name.click();
	driver.switchTo().activeElement().sendKeys(Text);
	demo.isempty(Name,Text, test,driver);
	//WebElement errormsg=driver.findElement(By.name("Only whole and decimal numbers allowed"));
	//demo.isdisplayed(errormsg, "Only whole and decimal numbers allowed", test,driver);
	//demo.Textcomparsion(errormsg, "Only whole and decimal numbers allowed", test,driver);
	driver.switchTo().activeElement().clear();
}

public void Validdata(WebElement Name, String Text) throws IOException
{
	Name.click();
	driver.switchTo().activeElement().sendKeys(Text);
	WebElement Element=driver.switchTo().activeElement();
	demo.Textcomparsion(Element,Text, test,driver);
	Name.click();
	driver.switchTo().activeElement().clear();
}
public void Invalidrange(WebElement Name, String Text) throws IOException
{
	Name.click();
	driver.switchTo().activeElement().sendKeys(Text);
	vitals.save.click();
	WebElement errormsg=driver.findElement(By.name("Range:[1 to 300]"));
	demo.isdisplayed(errormsg, "Range:[1 to 300]", test,driver);
	demo.Textcomparsion(errormsg, "Range:[1 to 300]", test,driver);
	Name.click();
	driver.switchTo().activeElement().clear();
}

public void Invalidrangepulse(WebElement Name, String Text) throws IOException
{
	Name.click();
	driver.switchTo().activeElement().sendKeys(Text);
	vitals.save.click();
	WebElement errormsg=driver.findElement(By.name("Range:[1 to 200]"));
	demo.isdisplayed(errormsg, "Range:[1 to 200]", test,driver);
	demo.Textcomparsion(errormsg, "Range:[1 to 200]", test,driver);
	Name.click();
	driver.switchTo().activeElement().clear();
}

public void Invalidrangetemp(WebElement Name, String Text) throws IOException
{
	Name.click();
	driver.switchTo().activeElement().sendKeys(Text);
	vitals.save.click();
	WebElement errormsg=driver.findElement(By.name("Range:[1 to 110]"));
	demo.isdisplayed(errormsg, "Range:[1 to 110]", test,driver);
	demo.Textcomparsion(errormsg, "Range:[1 to 110]", test,driver);
	Name.click();
	driver.switchTo().activeElement().clear();
}
@AfterSuite
	    public void tearDown() {
	        extent.flush();
	    }

// Note:  Vitals Thread perform Manually
 
}
