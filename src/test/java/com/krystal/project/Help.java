package com.krystal.project;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.windows.WindowsDriver;

public class Help extends ReferencefileChemotheraphy{
	private WebElement HelpDesk;
	private WebElement UserManual;
	private WebElement About;
	private WebElement systemInfo;
	private WebElement ThisPc;
	private WebElement Desktop;
	private WebElement OK;


	@BeforeClass
	public void setUp1()  throws InterruptedException, IOException {
	DesiredCapabilities appCapabilities = new DesiredCapabilities();
	appCapabilities.setCapability("app", "C:\\Program Files\\Panacea Medical Technologies\\Krystal\\Krystal.exe");
	driver = new WindowsDriver<WebElement>(new URL("http://127.0.0.1:4723"), appCapabilities);
	ReferenceSigin Sign=new ReferenceSigin();
	Sign.Login(driver);
	Sign.Help(driver);
  }
	
	
	@Test(priority =2)
	public void HelpDesk() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Help Desk Button"," Help Desk button should be present ");	
	HelpDesk=driver.findElement(By.name("HELP DESK"));
	demo.Textcomparsion(HelpDesk, "HELP DESK", test,driver);
	demo.isEnabled(HelpDesk, "HELP DESK", test,driver);
	}
	
	@Test(priority =3)
	public void UserManual() throws IOException {
	test = extent.createTest(guiTestCaseName()+" User Manual Button"," User Manual button should be present ");	
	UserManual=driver.findElement(By.name("USER MANUAL"));
	demo.Textcomparsion(UserManual, "USER MANUAL", test,driver);
	demo.isEnabled(UserManual, "USER MANUAL", test,driver);
	}
	
	@Test(priority =4)
	public void About() throws IOException {
	test = extent.createTest(guiTestCaseName()+" About Button"," About button should be present ");	
	About=driver.findElement(By.name("ABOUT"));
	demo.Textcomparsion(About, "ABOUT", test,driver);
	demo.isEnabled(About, "ABOUT", test,driver);
	}
	@Test(priority =5)
	public void systemInfo() throws IOException {
	test = extent.createTest(guiTestCaseName()+" system Info"," system Info should be present ");	
	systemInfo=driver.findElement(By.name("SYSTEM INFO"));
	demo.Textcomparsion(systemInfo, "SYSTEM INFO", test,driver);
	demo.isEnabled(systemInfo, "SYSTEM INFO", test,driver);
	}
	@Test(priority =6)
	public void help() throws IOException, InterruptedException
	{
		 test = extent.createTest(funTestCaseName()+" Help window demostic image is displayed"," Help window demostic image should be present ");
		 image("D:\\Help\\Help.PNG");
		 Thread.sleep(2000);
	}
	@Test(priority =7)
	public void helpinternational() throws IOException, InterruptedException
	{
		test = extent.createTest(funTestCaseName()+" International Image "," International Image should be present");
		WebElement internationalbox=driver.findElement(By.className("ComboBox"));
		internationalbox.click();
		Thread.sleep(1000);
		Actions action=new Actions(driver);
		
		WebElement internationalname=driver.findElement(By.name("International"));
		action.moveToElement(internationalname).doubleClick().perform();
		Thread.sleep(3000);
		image("D:\\Help\\Help1.PNG");
	}
	@Test(priority =8)
	public void userManual() throws IOException, InterruptedException
	{
		 test = extent.createTest(funTestCaseName()+" User Manual image is displayed"," User Manual image should be present");
		 UserManual.click();
		 image("D:\\Help\\UserManual.PNG");
		 Thread.sleep(10000);
	}
	@Test(priority =9)
	public void System() throws IOException, InterruptedException
	{
		 test = extent.createTest(funTestCaseName()+" About image is displayed"," About image should be present");
		 About.click();
		 image("D:\\Help\\About.PNG");
		 Thread.sleep(10000);
	}

@Test(priority =10)
public void Systeminfo() throws IOException, InterruptedException {
test = extent.createTest(funTestCaseName()+ " Data export to Desktop"," Exported data should present in the desktop");	
systemInfo=driver.findElement(By.name("SYSTEM INFO"));
systemInfo.click();
ThisPc=driver.findElement(By.name("This PC"));
ThisPc.click();
Desktop=driver.findElement(By.name("Desktop"));
Desktop.click();
OK=driver.findElement(By.name("OK"));
OK.click();
Thread.sleep(1000);
}
	
	public void image(String path) throws IOException
	{
		Screen screen = new Screen();
        String referenceImagePath = path; // Replace with the actual path
        Pattern referenceImage = new Pattern(referenceImagePath);
        try {
            Match match = screen.exists(referenceImage);
            if (match != null) {
               test.pass("Reference image found!");
                screen.click(match);
            } else {
                test.fail("Reference image not found!");
            }
        } catch (FindFailed e) {
            e.printStackTrace();
        }
	}

	@AfterSuite
	public void tearDown() {
	    extent.flush();
	}
	// Deleting the fieles in the d drive and check wheather the runfail is excuted or not
}

