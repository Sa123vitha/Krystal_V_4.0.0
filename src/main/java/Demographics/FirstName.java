package Demographics;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.windows.WindowsDriver;

public class FirstName {

	public static void main(String[] args) throws InterruptedException {
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
		WebElement usernameField = driver.findElement(By.name("User ID"));

		driver.switchTo().activeElement().sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.className("PasswordBox")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Button[@Name=\"SIGN IN\"][@AutomationId=\"BtnValidate\"]"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"NavigationTopBarSubView\"]/Button[@ClassName=\"Button\"]"))
				.click();
		Thread.sleep(2000);

		System.out.println("*****************************************************************");
		
		// Add Patient
		// driver.findElement(By.name("SAVE")).click();
		// Thread.sleep(2000);
		// Verify that an error message is displayed
		// String Actualresult =
		// driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"DemographicsMainView\"]/Custom[@ClassName=\"DemographicsSection1View\"]/Edit[@ClassName=\"TextBox\"]/Text[@Name=\"Input
		// cannot be
		// blank\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Input
		// cannot be blank\"]")).getText();
		// String Exceptedresult="First Name should not be blank";
		// if (Actualresult.equals(Exceptedresult)) {
		// System.out.println("Test Case 4 Passed: Empty First Name");
		// }
		// else {
		// System.out.println("Test Case 4 Failed: Excepted result is:"+"
		// "+Exceptedresult+" and "+"Actual result displayed is:"+Actualresult);
		// }

		// MENU
	
		WebElement Menu = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"NavigationTopBarView\"]/Button[@AutomationId=\"ToolTip\"]"));
		WebElement Signout = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"NavigationTopBarView\"]/Button[@ClassName=\"Button\"]"));
		WebElement Theme = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"NavigationTopBarView\"]/Button[@AutomationId=\"SearchMenuBuutton\"]"));
		WebElement Password = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"NavigationTopBarView\"]/Button[@AutomationId=\"SearchMenuButton\"]"));
		WebElement Titlename = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"NavigationTopBarView\"]/Text[@ClassName=\"Text\"][@Name=\"Demographics\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Demographics\"]"));
		WebElement Productlogo = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"NavigationTopBarView\"]/Image[@ClassName=\"Image\"]"));
		WebElement Patientlist = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"NavigationTopBarSubView\"]/Button[@ClassName=\"Button\"]"));
		
		
		int i=1;
		
	    Addfield.add(Signout,"Signout",i);i++;
		Addfield.add(Menu,"Menu",i);i++;
		Addfield.add(Theme,"Theme",i);i++;
		Addfield.add(Password,"Password",i);i++;
		Addfield.add(Titlename,"Titlename",i);i++;
		Addfield.add(Patientlist,"Patientlist",i);i++;
		
		String title=Titlename.getText();
		
		Addfield.titlename(title);
		Addfield.productlogo(Productlogo);
		
		// Patient menu
		WebElement PatientMenu=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"SideMenuSubView\"]/Text[@ClassName=\"Text\"][@Name=\"Patient Menu\"]/Text[@Name=\"Patient Menu\"][@AutomationId=\"Label\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Patient Menu\"]"
));
		String ActualPateintresult=PatientMenu.getText();
		
		Addfield.PatientMenu(ActualPateintresult);
		
		// Patient menu 
		WebElement AddPatient = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"NavigationTopBarSubView\"]/Button[@ClassName=\"Button\"]"));
		WebElement Demographics=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"SideMenuSubView\"]/Button[@ClassName=\"Button\"][@Name=\"DEMOGRAPHICS\"]"));
		WebElement Prescription=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"SideMenuSubView\"]/Button[@ClassName=\"Button\"][@Name=\"PRESCRIPTION\"]"));
		WebElement PlanAprroval=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"SideMenuSubView\"]/Button[@ClassName=\"Button\"][@Name=\"PLAN APPROVAL\"]"));
		WebElement Scheudling=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"SideMenuSubView\"]/Button[@ClassName=\"Button\"][@Name=\"SCHEDULING\"]"));
		WebElement Vitals=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"SideMenuSubView\"]/Button[@ClassName=\"Button\"][@Name=\"VITALS\"]"));
		WebElement LabReports=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"SideMenuSubView\"]/Button[@ClassName=\"Button\"][@Name=\"LAB REPORTS\"]"));
		WebElement TreatmentReview=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"SideMenuSubView\"]/Button[@ClassName=\"Button\"][@Name=\"TREATMENT REVIEW\"]"));
		Addfield.PateintMenulist(AddPatient, i);i++;
	    Addfield.PateintMenulist(Demographics, i);i++;
	    Addfield.PateintMenulist(Prescription, i);i++;
	    Addfield.PateintMenulist(PlanAprroval,i);i++;
	    Addfield.PateintMenulist(Scheudling,i);i++;
	    Addfield.PateintMenulist(Vitals,i);i++;
	    Addfield.PateintMenulist(LabReports,i);i++;
	    Addfield.PateintMenulist(TreatmentReview,i);i++;
	    
	    
	    WebElement PBI=driver.findElement(By.name("PATIENT BASIC INFORMATION"));
	    WebElement FN=driver.findElement(By.name("First Name"));
	    WebElement MN=driver.findElement(By.name("Middle Name"));
	    String EPPBI="PATIENT BASIC INFORMATION";
	    String EFN="First Name";
	    String EMN="Middle Name";
	    
	    
	    GUI_Demographics.Basciinformation(PBI,EPPBI);
	    GUI_Demographics.Basciinformation(FN,EFN);
	    GUI_Demographics.Basciinformation(MN,EMN);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	
	}
}
