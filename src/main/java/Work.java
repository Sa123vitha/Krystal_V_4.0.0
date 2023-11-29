import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import KrystalDemographics.PatientListFun;
import io.appium.java_client.windows.WindowsDriver;

public class Work {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String appPath = "C:\\Program Files\\Panacea Medical Technologies\\Krystal\\Krystal.exe";

        // Set the WinAppDriver server URL
        String winAppDriverUrl = "http://127.0.0.1:4723";

        // Create DesiredCapabilities for the application
        DesiredCapabilities appCapabilities = new DesiredCapabilities();
        appCapabilities.setCapability("app", appPath);

        // Create a WindowsDriver instance
        WindowsDriver<WebElement> driver;
        try {
            driver = new WindowsDriver<WebElement>(new URL(winAppDriverUrl), appCapabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return;
        }
        String signIN = driver.findElement(By.name("SIGN IN")).getText();
        System.out.println(signIN);
        if(signIN.equalsIgnoreCase("SIGN IN"))
        {
        	System.out.println("SignIN label  verified");
        }
         String tooltipElement = driver.findElement(By.name("User ID")).getText();
        System.out.println(tooltipElement);
        if(tooltipElement.equalsIgnoreCase("User ID"))
        {
        	System.out.println("User ID  verified");
        }
    	driver.switchTo().activeElement().sendKeys("123456");
		Thread.sleep(2000);
		
		//Thread.sleep(2000);
		
		//driver.findElement(By.name("Password")).sendKeys("p");;
		driver.findElement(By.className("PasswordBox")).sendKeys("123456");
		//System.out.println(signbtm.getSize());
		//signbtm.sendKeys("p");
		Thread.sleep(5000);
	//	WebElement signbtm2 = driver.findElement(By.id("BtnValidate"));
		WebElement signinbtm = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Button[@Name=\"SIGN IN\"][@AutomationId=\"BtnValidate\"]"));
		String sign = signinbtm.getText();
		Thread.sleep(3000);
		if(sign.equalsIgnoreCase("SIGN IN"))
        {
        	System.out.println("sign button verified  verified");
        }
		//signbtm2.click();
		Thread.sleep(1000);
		//driver.findElement(By.name("SIGN IN")).click();
		signinbtm.click();
		Thread.sleep(1000);
		//Thread.sleep(3000);
	Actions act = new Actions(driver);
	 
		driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"NavigationTopBarSubView\"]/Button[@ClassName=\"Button\"]")).click();
		Thread.sleep(2000);//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"NavigationTopBarSubView\"]/Button[@ClassName=\"Button\"]"
	// Demographics 
	//	String RTID = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"DemographicsMainView\"]/Custom[@ClassName=\"DemographicsSection1View\"]/Edit[@ClassName=\"TextBox\"]")).getText();
	//	System.out.println(RTID);
		//Thread.sleep(1000);
//atient selection in list
/* List<WebElement> list = driver.findElements(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"OpenPatientMainView\"]/Custom[@ClassName=\"OpenPatientTableView\"]/DataGrid[starts-with(@AutomationId,\"Datagrid\")]/DataItem[@ClassName=\"DataGridRow\"][@Name=\"Presentation.UiElements.ViewModels.TableViewModel\"]/Custom[@ClassName=\"DataGridCell\"]"));
		Iterator<WebElement> itr = list.iterator();
		
			while(itr.hasNext())   
			{  
				WebElement li = itr.next();
				
					System.out.print(li.getText()+" "); 
					
			}  
			for( WebElement list1 : list)
			{
				String list2 = list1.getText();
				if(list2.contains("RT202305A01")) {
					list1.click();
				}
			}
				*/
			
		PatientListFun.FirstName(driver);
		/*
		Thread.sleep(4000);//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"OpenPatientMainView\"]/Custom[@ClassName=\"OpenPatientTableView\"]/DataGrid[starts-with(@AutomationId,\"Datagrid\")]/DataItem[@ClassName=\"DataGridRow\"][@Name=\"Presentation.UiElements.ViewModels.TableViewModel\"]/Custom[@ClassName=\"DataGridCell\"][@Name=\"Treatment Plan  \"]/Text[@ClassName=\"TextBlock\"][@Name=\"Treatment Plan  \"]"
		
		 driver.findElement(By.id("PART_Button")).click();//"/Pane[@ClassName=\"#32769\"][@Name=\"Desktop 1\"]/Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"OpenPatientMainView\"]/Custom[@ClassName=\"OpenPatientTableView\"]/DataGrid[starts-with(@AutomationId,\"Datagrid\")]/DataItem[@ClassName=\"DataGridRow\"][@Name=\"Presentation.UiElements.ViewModels.TableViewModel\"]"
		
		driver.findElement(By.id("PART_Button")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("May, 2023")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("2023")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("2021")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("Jan")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("27")).click();
		driver.findElement(By.name("Blood Group")).click();
		Thread.sleep(1000);
		WebElement elementToDateofBirth = driver.findElement(By.name("A-ve"));
		Actions actions = new Actions(driver);
		actions.doubleClick(elementToDateofBirth).perform();
		driver.findElement(By.name("Male")).click();
		driver.findElement(By.name("Patient Size")).click();
		Thread.sleep(2000);
		WebElement elementToDoubleClick = driver.findElement(By.name("Small"));
        // Perform the double-click action on the element
        actions.doubleClick(elementToDoubleClick).perform();
		
		Thread.sleep(2000);
		WebElement NametoDoubleClick = driver.findElement(By.name("Name"));
		actions.doubleClick(NametoDoubleClick).perform();
		Thread.sleep(2000);
		driver.findElement(By.name("Name")).sendKeys("New Patient");
		
		
		WebElement NumbertoDoubleClick = driver.findElement(By.name("Contact Number"));
		actions.doubleClick(NumbertoDoubleClick).perform();
		Thread.sleep(2000);
		driver.findElement(By.name("Contact Number")).sendKeys("938387833");
		
		*/
		driver.findElement(By.name("SAVE")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("OK")).click();
		Thread.sleep(2000);
//driver.quit();
	}

}
