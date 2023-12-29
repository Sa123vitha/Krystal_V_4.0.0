package com.krystal.project;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.windows.WindowsDriver;

public class ThemeSettings extends ReferencefileChemotheraphy{
	
	private Actions action;
	private Actions act;
	@Test(priority =0)
	public void Launch()  throws InterruptedException, IOException {
//	DesiredCapabilities appCapabilities = new DesiredCapabilities();
//	appCapabilities.setCapability("app", "C:\\Program Files\\Panacea Medical Technologies\\Krystal\\Krystal.exe");
//	driver = new WindowsDriver<WebElement>(new URL("http://127.0.0.1:4723"), appCapabilities);
	navigation();
	action=new Actions(driver);
	act=new Actions(driver);
	}
	public void navigation() throws InterruptedException 
	{
		WebElement Userbx = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Edit[@AutomationId=\"TxtbxUsername\"]"));
		Userbx.click();
		driver.switchTo().activeElement().sendKeys("m");
		Thread.sleep(1000);
		WebElement Pswdbox = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Edit[@AutomationId=\"PwdBoxUserPassword\"]"));
		Pswdbox.click();
		driver.switchTo().activeElement().sendKeys("p");
		WebElement Signinbutton = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Button[@Name=\"SIGN IN\"][@AutomationId=\"BtnValidate\"]"));
		Signinbutton.click();		
	}
	
		WebElement Themeicon;
		@Test(priority =1)
	public void Themeicon() throws IOException
	{
			test = extent.createTest("!!!!!!!!!!THEME SETTINGS!!!!!!!");
		test = extent.createTest(guiTestCaseName()+" Theme icon"," Theme icon should be present ");	
		Themeicon=driver.findElement(By.xpath("//Button[@HelpText=\"Click here for Theme Menu\"]"));
		demo.isdisplayed(Themeicon, "Theme icon", test, driver);
		demo.isEnabled(Themeicon, "Theme icon", test, driver);
	}
		@Test(priority =2)  
		public void Themeapply() throws IOException, InterruptedException
		{
			test = extent.createTest(guiTestCaseName()+" Theme selected applied to the application"," Themes selected is applied to the application");
	        for(int i=0;i<=10; i++)//11
	        {
	        Themeicon.click();
			Theme("werwer",i);	
	        }
		}


		public void Theme(String actual, int j) throws InterruptedException, IOException {
			By locator = By.name(actual);
			List<WebElement> elements = driver.findElements(locator);
			int desiredIndex = j;
			if (desiredIndex < elements.size()) {
				Thread.sleep(1000);
			    WebElement element = elements.get(desiredIndex);
			    element.click();  
			    Sitesave("Theme Select", "Selected Theme applied to application.", "Theme Select", "Selected Theme applied to application.", 0, driver);
		}
		}
		
	
}
