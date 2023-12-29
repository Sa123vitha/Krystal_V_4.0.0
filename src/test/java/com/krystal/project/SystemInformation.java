package com.krystal.project;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.windows.WindowsDriver;

public class SystemInformation extends ReferencefileChemotheraphy {
	
	private SystemInformationPOM system;
	private Actions action;
	private Actions act;
	
	
	@Test(priority =1)
	public void Launch()  throws InterruptedException, IOException {
//	DesiredCapabilities appCapabilities = new DesiredCapabilities();
//	appCapabilities.setCapability("app", "C:\\Program Files\\Panacea Medical Technologies\\Krystal\\Krystal.exe");
//	driver = new WindowsDriver<WebElement>(new URL("http://127.0.0.1:4723"), appCapabilities);
	ReferenceSigin Sign=new ReferenceSigin();
	Sign.ServiceLogin(driver);
	Sign.SystemInformation(driver);
	system= new SystemInformationPOM (driver);
	action=new Actions(driver);
	act=new Actions(driver);
	}
	
	
	@Test(priority =1)
	public void Systeminformation() throws IOException, InterruptedException {
	test = extent.createTest("!!!!!!!!!!SYSTEM INFORMATION!!!!!!!!!!");
	test = extent.createTest(guiTestCaseName()+"System Information label"," System Information label should be present ");	
	demo.Textcomparsion(system.systeminfo, "System Information", test,driver);
	Thread.sleep(2000);	
	}
@Test(priority =2)
	public void Computername() throws IOException, InterruptedException {
	test = extent.createTest(guiTestCaseName()+"Computer Name label"," Computer Name label should be present ");	
	demo.Textcomparsion(system.compname, "Computer Name", test,driver);
	Thread.sleep(2000);	
	}
@Test(priority =3)
	public void Windowsedition() throws IOException, InterruptedException {
	test = extent.createTest(guiTestCaseName()+" Windows Edition label"," Windows Edition label should be present ");	
	demo.Textcomparsion(system.windowsedit, "Windows Edition", test,driver);
	Thread.sleep(1000);
	}
@Test(priority =4)
	public void Operatingsystem() throws IOException, InterruptedException {
	test = extent.createTest(guiTestCaseName()+"Operating System label"," Operating System label should be present ");	
	demo.Textcomparsion(system.os, "Operating System", test,driver);
	Thread.sleep(1000);	
	}
@Test(priority =5)
	public void Osversion() throws IOException, InterruptedException {
	test = extent.createTest(guiTestCaseName()+" OS Version label"," OS Version label should be present ");	
	demo.Textcomparsion(system.osversion, "OS Version", test,driver);
	Thread.sleep(1000);	
	}
@Test(priority =6)
	public void Osbuild() throws IOException, InterruptedException {
	test = extent.createTest(guiTestCaseName()+" OS Build label"," OS Build label should be present ");	
	demo.Textcomparsion(system.osbuild, "OS Build", test,driver);
	Thread.sleep(1000);	
	}
@Test(priority =7)
	public void Installedon() throws IOException, InterruptedException {
	test = extent.createTest(guiTestCaseName()+" Installed On label"," Installed On label should be present ");	
	demo.Textcomparsion(system.installedon, "Installed On", test,driver);
	Thread.sleep(1000);	
	}
@Test(priority =8)
	public void Systemdirectory() throws IOException, InterruptedException {
	test = extent.createTest(guiTestCaseName()+" System Directory label"," System Directory label should be present ");	
	demo.Textcomparsion(system.systemdir, "System Directory", test,driver);
	Thread.sleep(1000);	
	}
@Test(priority =9)
	public void Systemlanguage() throws IOException, InterruptedException {
	test = extent.createTest(guiTestCaseName()+" System Language label"," System Language label should be present ");	
	demo.Textcomparsion(system.systemlang, "System Language", test,driver);
	Thread.sleep(1000);	
	}
@Test(priority =10)
	public void Userdomainname() throws IOException, InterruptedException {
	test = extent.createTest(guiTestCaseName()+" UserDomainName label"," UserDomainName label should be present ");	
	demo.Textcomparsion(system.userdomain, "UserDomainName", test,driver);
	Thread.sleep(1000);	
	}
@Test(priority =11)
	public void Ram() throws IOException, InterruptedException {
	test = extent.createTest(guiTestCaseName()+" RAM label"," RAM label should be present ");	
	demo.Textcomparsion(system.ram, "RAM", test,driver);
	Thread.sleep(1000);	
	}
@Test(priority =12)
	public void graphiccard() throws IOException, InterruptedException {
	test = extent.createTest(guiTestCaseName()+" Graphic Card label"," Graphic Card label should be present ");	
	demo.Textcomparsion(system.graphiccard, "Graphic Card", test,driver);
	Thread.sleep(1000);	
	}
@Test(priority =13)
	public void processortype() throws IOException, InterruptedException {
	test = extent.createTest(guiTestCaseName()+" Processor type label"," Processor type label should be present ");	
	demo.Textcomparsion(system.processtype, "Processor type", test,driver);
	Thread.sleep(1000);	
	}
@Test(priority =14)
	public void Machineserialnumber() throws IOException, InterruptedException {
	test = extent.createTest(guiTestCaseName()+" Machine Serial Number label"," Machine Serial Number label should be present ");	
	demo.Textcomparsion(system.machinesernum, "Machine Serial Number", test,driver);
	Thread.sleep(1000);	
	}
@Test(priority =15)
	public void Applicationinstalledpath() throws IOException, InterruptedException {
	test = extent.createTest(guiTestCaseName()+" Application Installed Path label"," Application Installed Path label should be present ");	
	demo.Textcomparsion(system.appinstalled, "Application Installed Path", test,driver);
	Thread.sleep(1000);	
	}
@Test(priority =16)
	public void ipaddress() throws IOException, InterruptedException {
	test = extent.createTest(guiTestCaseName()+" IP Address label"," IP Address label should be present ");	
	demo.Textcomparsion(system.ipadd, "IP Address", test,driver);
	Thread.sleep(1000);	
	}
@Test(priority =17)
	public void Diskpartiton() throws IOException, InterruptedException {
	test = extent.createTest(guiTestCaseName()+" Disk Partiton label"," Disk Partiton label should be present ");	
	demo.Textcomparsion(system.disk, "Disk Partiton", test,driver);
	Thread.sleep(1000);	
	}
@Test(priority =18)
	public void Cdrive() throws IOException, InterruptedException {
	test = extent.createTest(guiTestCaseName()+" C:\\"," C:\\ label should be present ");	
	demo.Textcomparsion(system.cdrive, "C:\\", test,driver);
	Thread.sleep(1000);	
	}
@Test(priority =19)
	public void Ddrive() throws IOException, InterruptedException {
	test = extent.createTest(guiTestCaseName()+" D:\\"," D:\\ label should be present ");	
	demo.Textcomparsion(system.ddriver, "D:\\", test,driver);
	Thread.sleep(1000);	
	}

@Test(priority =22)
	public void Databasename() throws IOException, InterruptedException {
	test = extent.createTest(guiTestCaseName()+" Database Name label"," Database Name label should be present ");	
	demo.Textcomparsion(system.dbname, "Database Name", test,driver);
	Thread.sleep(1000);	
	}
@Test(priority =23)
	public void Version() throws IOException, InterruptedException {
	test = extent.createTest(guiTestCaseName()+" Version label"," Version label should be present ");	
	demo.Textcomparsion(system.version, "Version", test,driver);
	Thread.sleep(1000);	
	}
@Test(priority =24)
	public void Configurationpath() throws IOException, InterruptedException {
	test = extent.createTest(guiTestCaseName()+" Configuration Path label"," Configuration Path label should be present ");	
	demo.Textcomparsion(system.configpath, "Configuration Path", test,driver);
	Thread.sleep(1000);	
	}
@Test(priority =25)
	public void ccbtreatment() throws IOException, InterruptedException {
	test = extent.createTest(guiTestCaseName()+" CCB_Treatment label"," CCB_Treatment label should be present ");	
	demo.Textcomparsion(system.ccbtreat, "CCB_Treatment", test,driver);
	Thread.sleep(1000);	
	}
@Test(priority =26)
	public void impactfactorysetting() throws IOException, InterruptedException {
	test = extent.createTest(guiTestCaseName()+" Impact Factory Setting label"," Impact Factory Setting label should be present ");	
	demo.Textcomparsion(system.impactfacset, "Impact Factory Setting", test,driver);
	Thread.sleep(1000);	
	}
@Test(priority =27)
	public void Offlinesettings() throws IOException, InterruptedException {
	test = extent.createTest(guiTestCaseName()+" Offline_Settings label"," Offline_Settings label should be present ");	
	demo.Textcomparsion(system.offlineset, "Offline_Settings", test,driver);
	Thread.sleep(1000);	
	}
@Test(priority =28)
	public void Offlinesiddharthhospital() throws IOException, InterruptedException {
	test = extent.createTest(guiTestCaseName()+" Offline_Siddharth_Hospital label"," Offline_Siddharth_Hospital label should be present ");	
	demo.Textcomparsion(system.offlinesiddhos, "Offline_Siddharth_Hospital", test,driver);
	Thread.sleep(1000);	
	}
@Test(priority =29)
	public void Offlinesiddhartofflinernv() throws IOException, InterruptedException {
	test = extent.createTest(guiTestCaseName()+" Offline_Siddharth_OffLineRnV label"," Offline_Siddharth_OffLineRnV label should be present ");	
	demo.Textcomparsion(system.offlinesiddrnv, "Offline_Siddharth_OffLineRnV", test,driver);
	Thread.sleep(1000);	
	}
@Test(priority =30)
	public void Temptreatment() throws IOException, InterruptedException {
	test = extent.createTest(guiTestCaseName()+" Temp_Treatment label"," Temp_Treatment label should be present ");	
	demo.Textcomparsion(system.temptreatment, "Temp_Treatment", test,driver);
	Thread.sleep(1000);	
	}
@Test(priority =31)
	public void Machineqa() throws IOException, InterruptedException {
	test = extent.createTest(guiTestCaseName()+ " Machine QA label"," Machine QA label should be present ");	
	demo.Textcomparsion(system.machqa, "Machine QA", test,driver);
	Thread.sleep(1000);	
	}
@Test(priority =32)
	public void Languagetranslator() throws IOException, InterruptedException {
	test = extent.createTest(guiTestCaseName()+" Language Translator label"," Language Translator label should be present ");	
	demo.Textcomparsion(system.langtrans, "Language Translator", test,driver);
	Thread.sleep(1000);	
}
	@Test(priority =32)
	public void AuditLog() throws IOException, InterruptedException {
	test = extent.createTest(guiTestCaseName()+" Audit Log  label"," Audit Log label should be present ");	
	demo.Textcomparsion(system.Auditlog, "Audit Log", test,driver);
	Thread.sleep(1000);	
	}
	
	@Test(priority =32)
	public void PateintQA() throws IOException, InterruptedException {
	test = extent.createTest(guiTestCaseName()+" PatientQA"," PatientQA label should be present ");	
	demo.Textcomparsion(system.PatientQA, "Patient_QA", test,driver);
	Thread.sleep(1000);	
	}
@Test(priority =32)
	public void Hospitalinformation() throws IOException, InterruptedException {
	test = extent.createTest(guiTestCaseName()+ " Hospital Information label"," Hospital Information label should be present ");	
	demo.Textcomparsion(system.hospitalinfo, "Hospital Information", test,driver);
	Thread.sleep(1000);	
	}
@Test(priority =33)
	public void Hospitalname() throws IOException, InterruptedException {
	test = extent.createTest(guiTestCaseName()+ " Hospital Name label"," Hospital Name label should be present ");
	try {
	demo.Textcomparsion(system.hospitalname, "Hospital Name", test,driver);
	}
	catch(Exception e)
	{
		test.fail("Hospital Name"+"Element not found");
		catchexceptionscreenshot1(test,e);
		Thread.sleep(1000);
	}
	}

@Test(priority =34)
	public void Hospitaladdress() throws IOException, InterruptedException {
	test = extent.createTest(guiTestCaseName()+ " Hospital Address label"," Hospital Address label should be present ");
	try {
	demo.Textcomparsion(system.hospitaladd, "Hospital Address", test,driver);
	}
	catch(Exception e)
	{
		test.fail("Hospital Address"+"Element not found");
		catchexceptionscreenshot1(test,e);
		Thread.sleep(1000);
	}
	}
@Test(priority =35)
	public void Username() throws IOException, InterruptedException {
	test = extent.createTest(guiTestCaseName()+ " User Name label"," User Name label should be present ");	
	try {
	demo.Textcomparsion(system.username, "User Name", test,driver);
	}
	catch(Exception e)
	{
		test.fail("User Name"+"Element not found");
		demo.captureScreenshot("Capture",driver);
		Thread.sleep(1000);
	}
	}
@Test(priority =36)
	public void Contactnumber() throws IOException, InterruptedException {
	test = extent.createTest(guiTestCaseName()+ " Contact Number label"," Contact Number label should be present ");	
	try {
	demo.Textcomparsion(system.contact, "Contact Number", test,driver);
	}
	catch(Exception e)
	{
		test.fail("Contact Number"+"Element not found");
		demo.captureScreenshot("Capture",driver);
		Thread.sleep(1000);
	}
	}
@Test(priority =36)
	public void Licenseddatetime() throws IOException, InterruptedException {
	test = extent.createTest(guiTestCaseName()+ " Licensed Date/Time label"," Licensed Date/Time label should be present ");	
	try {
	demo.Textcomparsion(system.license, "Licensed Date/Time", test,driver);
	}
	catch(Exception e)
	{
		test.fail("Licensed Date/Time"+"Element not found");
		demo.captureScreenshot("Capture",driver);
		Thread.sleep(1000);
	}
	}
@Test(priority =37)
	public void Export() throws IOException, InterruptedException {
	test = extent.createTest(guiTestCaseName()+ " Export Button "," Export label should be present ");
try {
	demo.Textcomparsion(system.export, "EXPORT", test,driver);
	test = extent.createTest(guiTestCaseName()+ " Functionality of Export button enabled by default"," Export button should be enabled ");
	demo.isEnabled(system.export, "EXPORT", test, driver);
}
	catch(Exception e)
	{
		test.fail("EXPORT"+"Element not found");
		demo.captureScreenshot("Capture",driver);
		Thread.sleep(1000);
	}
	}

@Test(priority =37)
public void ExportData() throws IOException, InterruptedException {
test = extent.createTest(guiTestCaseName()+ " To Verify Data export to Desktop"," Exported data should present in the desktop");	
try {
system.export.click();
system.ThisPc.click();
system.Desktop.click();
system.OK.click();
system.OK1.click();
}
catch(Exception e)
{
test.fail("Exported PDF pop-up message is not displaying");
demo.captureScreenshot("Capture",driver);
Thread.sleep(1000);
}

}

public void captureScreenshot(String screenshotName, WebDriver driver) {
    try {
    	TakesScreenshot screenshot = (TakesScreenshot) driver;
        File source = screenshot.getScreenshotAs(OutputType.FILE);
        File destination = new File(screenshotName);
        FileUtils.copyFile(source, destination);
    } catch (IOException e) {
        e.printStackTrace();
    }
}

// Pending testcases are Fun getting data from the databases and system information
}
