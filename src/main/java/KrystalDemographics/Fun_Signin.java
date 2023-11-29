package KrystalDemographics;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.reporters.jq.Main;

import KrystalDemographics.DemographicsGUI;
import io.appium.java_client.windows.WindowsDriver;



public class Fun_Signin extends Main
{

	
	SoftAssert softAssert = new SoftAssert();
	WebElement usernameField = driver.findElement(By.name("User ID"));
	WebElement PateintListscreen = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Image[@ClassName=\"Image\"]"));
	WebElement Errormessage = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Text[@Name=\"User ID or Password cannot be empty.\"][@AutomationId=\"LblSignInError\"]/Text[@ClassName=\"TextBlock\"][@Name=\"User ID or Password cannot be empty.\"]"));
	WebElement Usermsge = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Text[@Name=\"User ID or Password cannot be empty.\"][@AutomationId=\"LblSignInError\"]/Text[@ClassName=\"TextBlock\"][@Name=\"User ID or Password cannot be empty.\"]"));
	WebElement Passwordbox = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Edit[@AutomationId=\"PwdBoxUserPassword\"]/Text[@Name=\"Password\"][@AutomationId=\"LblName\"]"));
	WebElement Psmsge = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Text[@Name=\"User ID or Password cannot be empty.\"][@AutomationId=\"LblSignInError\"]/Text[@ClassName=\"TextBlock\"][@Name=\"User ID or Password cannot be empty.\"]"));
	WebElement UPError = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Text[@Name=\"Invalid Credentials\"][@AutomationId=\"LblSignInError\"]"));
	WebElement Signinbutton = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Button[@Name=\"SIGN IN\"][@AutomationId=\"BtnValidate\"]"));
	WebElement ClearButton = driver.findElement(By.name("CLEAR"));
	
	String ActalErrormessage = "UserID or Password textfields cannont be empty";
	String ActualUsermsge = "UserID or Password cannot be empty";
	String ActualPsmsge = "UserID or Password cannot be empty";
	String ActualUPError = "Invalid Credentials";
	
	@Test
	public void signincase1() throws InterruptedException
	{
		Buttonsignin();
		Patientlistdisplay(driver,PateintListscreen,"PatientList");
		textisDisplayed(driver,Errormessage);
		softAssert.assertEquals(Errormessage.getText(),ActalErrormessage);
	}
	@Test
	public void signincase2() throws InterruptedException
	{
		usernameField.click();
		driver.switchTo().activeElement().sendKeys("123456");
	    Thread.sleep(2000);
	    Buttonsignin();
		Patientlistdisplay(driver,PateintListscreen,"PatientList");
		textisDisplayed(driver,Usermsge);
		softAssert.assertEquals(Usermsge.getText(),ActualUsermsge);
		Buttonclear();
	}
	@Test
	public void signincase3() throws InterruptedException
	{
		Passwordbox.click();
		Thread.sleep(5000);
		driver.switchTo().activeElement().sendKeys("123456");
		Thread.sleep(2000);
		Buttonsignin();
		Patientlistdisplay(driver,PateintListscreen,"Patientlist");
		textisDisplayed(driver,Psmsge);
		softAssert.assertEquals(Psmsge.getText(),ActualPsmsge);
		Thread.sleep(2000);
		Buttonclear();
	}
	@Test
	public void signincase4() throws InterruptedException
	{
		driver.switchTo().activeElement().sendKeys("KJKJHJH&*&*&*");
		Thread.sleep(5000);
		driver.findElement(By.className("PasswordBox")).sendKeys("123456");
		Thread.sleep(2000);
		Buttonsignin();
		Patientlistdisplay(driver,PateintListscreen,"Patientlist");
		textisDisplayed(driver,UPError);
		softAssert.assertEquals(UPError.getText(),ActualUPError);
		Thread.sleep(2000);
		Buttonclear();
	}
	@Test
	public void signincase5() throws InterruptedException
	{
		driver.switchTo().activeElement().sendKeys("m");
		Thread.sleep(1000);
		driver.findElement(By.className("PasswordBox")).sendKeys("p");
		Thread.sleep(1000);
		Buttonsignin();
		WebElement Patientscreen = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]"));
		Patientdisplay(driver,Patientscreen);
		softAssert.assertAll();	
	}
 
	 public void Patientlistdisplay(WebDriver driver, WebElement Signinscreen, String Text) throws InterruptedException 
		{	 
		 softAssert.assertTrue(Signinscreen.isDisplayed(), "Navigating to other screens");
		}
	 
     public void Patientdisplay(WebDriver driver, WebElement Patientlistscreen) throws InterruptedException 
 		{	 
		 softAssert.assertTrue(Patientlistscreen.isDisplayed(), "Not navigating to Patientlist screen");
		}
	
	 public void textisDisplayed(WebDriver driver,WebElement Element) throws InterruptedException
		{
		 softAssert.assertTrue(Element.isDisplayed(),"Error Message is not displaying");
		}
	 
	public void Buttonsignin() throws InterruptedException 
	{
		Signinbutton.click();
		Thread.sleep(2000);
	}
	public void Buttonclear() throws InterruptedException 
	{
		ClearButton.click();
		Thread.sleep(5000);
	}
  
  
  
}
