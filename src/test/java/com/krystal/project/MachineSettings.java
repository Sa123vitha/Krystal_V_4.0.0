package com.krystal.project;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import io.appium.java_client.windows.WindowsDriver;

public class MachineSettings extends ReferencefileChemotheraphy{
 
	private MachineSettingsPOM machine;
	private Actions act;
	
	
	@Test(priority =1)
	public void Launch()  throws InterruptedException, IOException {
//	DesiredCapabilities appCapabilities = new DesiredCapabilities();
//	appCapabilities.setCapability("app", "C:\\Program Files\\Panacea Medical Technologies\\Krystal\\Krystal.exe");
//	driver = new WindowsDriver<WebElement>(new URL("http://127.0.0.1:4723"), appCapabilities);
	Thread.sleep(1000);
	ReferenceSigin Sign=new ReferenceSigin();
	Sign.ServiceLogin(driver);
	Sign.Machinesettings(driver);
	action=new Actions(driver);
	act=new Actions(driver);
	
	machine=new MachineSettingsPOM(driver);
	}
	@Test(priority =1)
	public void Machinelist() throws IOException {
		test = extent.createTest("!!!!!!!!!!SS(MACHINE SETTINGS MODULE)!!!!!!!");
	test = extent.createTest(guiTestCaseName()+" To Verify Machine List Label "," Machine List label should be present ");	
	demo.Textcomparsion(machine.machinelist, "Machine List", test,driver);
	}
@Test(priority =2)
	public void Selectbrowsefile() throws IOException {
	test = extent.createTest(guiTestCaseName()+"  To Verify Select Browse File Label  "," Select Browse File label should be present ");	
	demo.Textcomparsion(machine.selectbrowse, "Select Browse File", test,driver);
	}
@Test(priority =3)
	public void Browse() throws IOException {
	test = extent.createTest(guiTestCaseName()+" To Verify BROWSE Label "," BROWSE label should be present ");	
	demo.Textcomparsion(machine.browse, "BROWSE", test,driver);
	demo.isEnabled(machine.browse, "BROWSE", test,driver);
	}
@Test(priority =4)
	public void Modelname() throws IOException {
	test = extent.createTest(guiTestCaseName()+"  To Verify Model Name Label "," Model Name label should be present ");	
	demo.Textcomparsion(machine.modelname, "Model Name", test,driver);
	}
@Test(priority =5)
	public void Deviceserialnumber() throws IOException {
	test = extent.createTest(guiTestCaseName()+"  To Verify Device Serial Number Label "," Device Serial Number label should be present ");	
	demo.Textcomparsion(machine.devsernum, "Device Serial Number", test,driver);
	}
@Test(priority =6)
	public void Fileupdated() throws IOException {
	test = extent.createTest(guiTestCaseName()+"  To Verify File Updated Label "," File Updated label should be present ");	
	demo.Textcomparsion(machine.fileupdated, "File Updated", test,driver);
	}

	
@Test(priority =7)
public void Browsebuttonsid() throws SQLException, Exception {
	
test = extent.createTest(funTestCaseName()+" Sidharth file imported "," Machine settings file should get  imported");	
Browsecommon("SIDDHARTH-II Machine Settings Sample File.csv", "Machine Settings Import","Machine Settings Import","For machine import changes to take effect, application has to be restarted. Click OK to continue.","For machine import changes to take effect, application has to be restarted. Click OK to continue.",test);
Signout(test);
Thread.sleep(2000);
databasssave();


test = extent.createTest(funTestCaseName()+" Sidharth same file importing again"," Already exits error message should display");
Browsecommon("SIDDHARTH-II Machine Settings Sample File.csv", "Machine Settings Import","Machine Settings Import","Machine data for SIDDHARTH-II C05 already exists.","Machine data for SIDDHARTH-II C05 already exists.",test);
Thread.sleep(2000);
databasssave();

test = extent.createTest(funTestCaseName()+" Sidharth file deleting"," Delete error message should display");
delete("Machine Settings Delete","Do you want to delete the machine settings for SIDDHARTH-II_C05?","Machine Settings Delete","Do you want to delete the machine settings for SIDDHARTH-II_C05?",0,test);
Thread.sleep(2000);
delete1("Machine Settings Delete","For machine delete changes to take effect, application has to be restarted. Click OK to continue.","Machine Settings Delete","For machine delete changes to take effect, application has to be restarted. Click OK to continue.",test);
Signout(test);

test = extent.createTest(funTestCaseName()+" Sidharth file importing once deleted"," Machine settings file should get  imported");
Browsecommon("SIDDHARTH-II Machine Settings Sample File.csv", "Machine Settings Import","Machine Settings Import","For machine import changes to take effect, application has to be restarted. Click OK to continue.","For machine import changes to take effect, application has to be restarted. Click OK to continue.",test);
Thread.sleep(2000);
databasssave();
}

public void databaseempty() throws SQLException, Exception
{
	test = extent.createTest(dataTestCaseName()+" To verify the Empty Database for Machine settings");
 	DataConfigconfig(test,"SELECT * FROM MachineSettings");
 	DataConfigconfig(test,"SELECT * FROM MachineSettingsSection1");
 	DataConfigconfig(test,"SELECT * FROM MachineSettingsSection2");
}

public void databasssave() throws SQLException, Exception
{
	test = extent.createTest(dataTestCaseName()+" To verify the Saved data of Machine settings");
 	DataConfigconfig(test,"SELECT * FROM MachineSettings");
 	DataConfigconfig(test,"SELECT * FROM MachineSettingsSection1");
 	DataConfigconfig(test,"SELECT * FROM MachineSettingsSection2");
}

public void DataConfigconfig(ExtentTest test1, String Text1) throws IOException, Exception, SQLException {
    ArrayList<HashMap<String, String>> dataEntries = class1.getDataFromDatabaseMachine(Text1);

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
}




@Test(priority =9)
public void BrowsebuttonII() throws Exception, Exception {

	
test = extent.createTest(funTestCaseName()+" BHABHATRON-II file imported "," Machine settings file should get  imported");	
Browsecommon("BHABHATRON-II Machine Settings Sample File.csv", "Machine Settings Import","Machine Settings Import","For machine import changes to take effect, application has to be restarted. Click OK to continue.","For machine import changes to take effect, application has to be restarted. Click OK to continue.",test);
Signout(test);
Thread.sleep(2000);
databasssave();

test = extent.createTest(funTestCaseName()+" BHABHATRON-II same file importing again"," Already exits error message should display");
Browsecommon("BHABHATRON-II Machine Settings Sample File.csv", "Machine Settings Import","Machine Settings Import","Machine data for BHABHATRON-II C02 already exists.","Machine data for BHABHATRON-II C02 already exists.",test);
Thread.sleep(4000);
databasssave();

test = extent.createTest(funTestCaseName()+" BHABHATRON-II file deleting"," Delete error message should display");
delete("Machine Settings Delete","Do you want to delete the machine settings for BHABHATRON-II TAW_C02?","Machine Settings Delete","Do you want to delete the machine settings for BHABHATRON-II TAW_C02?",1,test);
Thread.sleep(2000);
delete1("Machine Settings Delete","For machine delete changes to take effect, application has to be restarted. Click OK to continue.","Machine Settings Delete","For machine delete changes to take effect, application has to be restarted. Click OK to continue.",test);
Signout(test);


test = extent.createTest(funTestCaseName()+" BHABHATRON-II file importing once deleted"," Machine settings file should get  imported");
Browsecommon("BHABHATRON-II Machine Settings Sample File.csv", "Machine Settings Import","Machine Settings Import","For machine import changes to take effect, application has to be restarted. Click OK to continue.","For machine import changes to take effect, application has to be restarted. Click OK to continue.",test);
Thread.sleep(2000);
databasssave();

}
@Test(priority =11)
public void BrowsebuttonMLC() throws SQLException, Exception {

test = extent.createTest(funTestCaseName()+" BHABHATRON-MLC file imported "," Machine settings file should get  imported");	
Browsecommon("BHABHATRON-MLC Machine Settings Sample File.csv", "Machine Settings Import","Machine Settings Import","For machine import changes to take effect, application has to be restarted. Click OK to continue.","For machine import changes to take effect, application has to be restarted. Click OK to continue.",test);
Signout(test);
Thread.sleep(2000);
databasssave();

test = extent.createTest(funTestCaseName()+" BHABHATRON-MLC same file importing again"," Already exits error message should display");
Browsecommon("BHABHATRON-MLC Machine Settings Sample File.csv", "Machine Settings Import","Machine Settings Import","Machine data for BHABHATRON-II MLC v2 C03 already exists.","Machine data for BHABHATRON-II MLC v2 C03 already exists.",test);
Thread.sleep(2000);
databasssave();

test = extent.createTest(funTestCaseName()+" BHABHATRON-MLC file deleting"," Delete error message should display");
delete("Machine Settings Delete","Do you want to delete the machine settings for BHABHATRON-II MLC v2_C03?","Machine Settings Delete","Do you want to delete the machine settings for BHABHATRON-II MLC v2_C03?",2,test);
Thread.sleep(2000);
delete1("Machine Settings Delete","For machine delete changes to take effect, application has to be restarted. Click OK to continue.","Machine Settings Delete","For machine delete changes to take effect, application has to be restarted. Click OK to continue.",test);
Signout(test);
Thread.sleep(2000);


test = extent.createTest(funTestCaseName()+" BHABHATRON-MLC file importing once deleted"," Machine settings file should get  imported");
Browsecommon("BHABHATRON-MLC Machine Settings Sample File.csv", "Machine Settings Import","Machine Settings Import","For machine import changes to take effect, application has to be restarted. Click OK to continue.","For machine import changes to take effect, application has to be restarted. Click OK to continue.",test);
Thread.sleep(2000);
databasssave();
}
@Test(priority =13)
public void Browsebutton3i() throws SQLException, Exception {

	
test = extent.createTest(funTestCaseName()+" BHABHATRON-3i file imported "," Machine settings file should get  imported");	
Browsecommon("BHABHATRON-3i Machine Settings Sample File.csv", "Machine Settings Import","Machine Settings Import","For machine import changes to take effect, application has to be restarted. Click OK to continue.","For machine import changes to take effect, application has to be restarted. Click OK to continue.",test);
Signout(test);
Thread.sleep(2000);
databasssave();


test = extent.createTest(funTestCaseName()+" BHABHATRON-3i same file importing again"," Already exits error message should display");
Browsecommon("BHABHATRON-3i Machine Settings Sample File.csv", "Machine Settings Import","Machine Settings Import","Machine data for BHABHATRON-3i C04 already exists.","Machine data for BHABHATRON-3i C04 already exists.",test);
Thread.sleep(2000);
databasssave();


test = extent.createTest(funTestCaseName()+" BHABHATRON-3i file deleting"," Delete error message should display");
delete("Machine Settings Delete","Do you want to delete the machine settings for BHABHATRON-3i_C06?","Machine Settings Delete","Do you want to delete the machine settings for BHABHATRON-3i_C06?",3,test);
Thread.sleep(2000);
delete1("Machine Settings Delete","For machine delete changes to take effect, application has to be restarted. Click OK to continue.","Machine Settings Delete","For machine delete changes to take effect, application has to be restarted. Click OK to continue.",test);
Signout(test);
Thread.sleep(2000);


test = extent.createTest(funTestCaseName()+" BHABHATRON-3i file importing once deleted"," Machine settings file should get  imported");
Browsecommon("BHABHATRON-3i Machine Settings Sample File.csv", "Machine Settings Import","Machine Settings Import","For machine import changes to take effect, application has to be restarted. Click OK to continue.","For machine import changes to take effect, application has to be restarted. Click OK to continue.",test);
Thread.sleep(2000);
databasssave();

}

@Test(priority =14)
public void invalidfile() throws IOException, InterruptedException
{
	test = extent.createTest(funTestCaseName()+" Import Invalid Machine settings file "," It should display the Error message");	
	Browsecommoninvalid("2D_APR_Settings_R00.csv", "Machine Settings Import","Machine Settings saved for machine.",test);
}




public void Signout(ExtentTest test) throws InterruptedException, IOException
{
	machine.Signout.click();
	Thread.sleep(1000);
	Sitesave1("Sign Out","Do you want to Sign out?","Sign out","Do you want to Sign out?", 1, driver,test);	
	Thread.sleep(1000);
	ReferenceSigin Sign=new ReferenceSigin();
	Sign.ServiceLogin(driver);
	Thread.sleep(1000);
	Sign.Machinesettings(driver);
}


public void Browsecommon(String actualtext, String actualtitlename1,String Exceptedtitlename1,String actualdescription1,String Excepteddescription1,ExtentTest test) throws InterruptedException, IOException
{
	machine.browse.click();
	Thread.sleep(1000);
	WebElement Machine1 = driver.findElement(By.name(actualtext));
	Machine1.click();
	Actions action=new Actions(driver);
	action.doubleClick(Machine1).perform();
	Thread.sleep(4000);
	Sitesave1(actualtitlename1, actualdescription1,Exceptedtitlename1, Excepteddescription1, 1, driver,test);
}
public void Browsecommoninvalid(String actualtext, String actualtitlename1,String actualdescription1,ExtentTest test) throws InterruptedException, IOException
{
	machine.browse.click();
	Thread.sleep(1000);
	WebElement Machine1 = driver.findElement(By.name(actualtext));
	Machine1.click();
	Actions action=new Actions(driver);
	action.doubleClick(Machine1).perform();
	Thread.sleep(3000);
	Machinesave(actualtitlename1, actualdescription1, 1, driver,test);
}

public void delete(String actualtitlename,String actualdescription,String Exceptedtitlename,String Excepteddescription,int j,ExtentTest test) throws InterruptedException, IOException
{
	WebElement Delete = driver.findElement(By.name("DELETE"));
	guilabelindex("DELETE", j,test);
	Sitesave1(actualtitlename, actualdescription, Exceptedtitlename, Excepteddescription, 1, driver,test);
}
public void delete1(String actualtitlename,String actualdescription,String Exceptedtitlename,String Excepteddescription,ExtentTest test) throws InterruptedException, IOException
{
	Sitesave1(actualtitlename, actualdescription, Exceptedtitlename, Excepteddescription, 1, driver,test);
}


Actions action;
public void guilabelindex(String Text, int i,ExtentTest test) throws InterruptedException, IOException
{
	 By locator = By.name(Text);
   	List<WebElement> elements = driver.findElements(locator);
   	System.out.println(elements.size());
   	Thread.sleep(2000);
   	int desiredIndex = i; 
   	if (desiredIndex < elements.size()) {
   		Thread.sleep(2000);
   	    WebElement element = elements.get(desiredIndex);
   	    demo.isEnabled(element, "Delete", test, driver);
   	    element.click();
   	}
}

}
