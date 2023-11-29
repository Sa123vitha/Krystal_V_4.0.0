package com.krystal.project;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.windows.WindowsDriver;

public class MachineSlot extends ReferencefileChemotheraphy {
	private WebElement treatment;
	private WebElement bhamlc;
	private WebElement fractions;
	private WebElement update;
	private WebElement machineslot;
	private WebElement nofractions;
	private WebElement frcationsupdated;
	private WebElement ok;
	
	@BeforeClass
	public void setUp1()  throws InterruptedException, IOException {
	DesiredCapabilities appCapabilities = new DesiredCapabilities();
	appCapabilities.setCapability("app", "C:\\Program Files\\Panacea Medical Technologies\\Krystal\\Krystal.exe");
	driver = new WindowsDriver<WebElement>(new URL("http://127.0.0.1:4723"), appCapabilities);
	Thread.sleep(5000);
	ReferenceSigin Sign=new ReferenceSigin();
	Sign.Login(driver);
	Sign.Machineslot(driver);
  }
 @Test(priority =1)
		public void Machineslot1() throws IOException {
		test = extent.createTest(guiTestCaseName()+" Machine Slot label"," Machine Slot label should be present ");	
		machineslot=driver.findElement(By.name("Machine Slot"));
		demo.Textcomparsion(machineslot, "Machine Slot", test,driver);
		}

 @Test(priority =2)
	public void TreatmentMachine() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Treatment Machine label"," Treatment Machine label should be present ");	
	//treatment=driver.findElement(By.name("Treatement Machine"));
	treatment=driver.findElement(By.xpath("//Custom[@ClassName=\"MachineCalendarMainView\"]/ComboBox[@ClassName=\"ComboBox\"]"));
	demo.Textcomparsion(treatment, "Treatement Machine", test,driver);
	}
 @Test(priority =3)
	public void Bhabhatronmlc() throws IOException {
	test = extent.createTest(guiTestCaseName()+" BHABHATRON-II MLC v2_CO3 label"," BHABHATRON-II MLC v2_CO3 label should be present ");	
	bhamlc=driver.findElement(By.name("BHABHATRON-II MLC v2_C03"));
	demo.Textcomparsion(bhamlc, "BHABHATRON-II MLC v2_C03", test,driver);
	}
 @Test(priority =4)
	public void Fractionsperhour() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Fractions Per Hour label"," Fractions Per Hour label should be present ");	
	fractions=driver.findElement(By.name("Fractions Per Hour"));
	demo.Textcomparsion(fractions, "Fractions Per Hour", test,driver);
	}
 @Test(priority =5)
	public void Update() throws IOException {
	test = extent.createTest(guiTestCaseName()+" UPDATE label"," UPDATE label should be present ");	
	update=driver.findElement(By.name("UPDATE"));
	demo.Textcomparsion(update, "UPDATE", test,driver);
	update.click();
	}
 @Test(priority =6)
	public void NoOffrcationsperupdate() throws IOException, InterruptedException {
	test = extent.createTest(guiTestCaseName()+" No Of Fractions Per Hour Update label"," No Of Fractions Per Hour Update label should be present ");	
	Rollsave("No of Fractions per hour Update", "Number of Fractions per hour updated.", "No of Fractions per hour Update", "Number of Fractions per hour updated.",test,driver);
 }
 @Test(priority =7)
 public void increment() throws Exception {
	 Machineslot("D:\\Help\\Machineslot\\Increment.PNG");
 }
 public void Machineslot(String Text) throws FindFailed {
	 Screen screen = new Screen();
	 String imagePath = Text;
	 Pattern pattern = new Pattern(imagePath);
     Match match = screen.find(pattern);
     match.click();
}
 @AfterSuite
 public void tearDown() {
     extent.flush();
 }

 // Increment of fractions per hour not Possible to perform
	
}

 
