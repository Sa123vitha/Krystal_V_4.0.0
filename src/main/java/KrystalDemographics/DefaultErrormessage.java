package KrystalDemographics;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DefaultErrormessage {
	
	public static void defaultErrorMessage(WebDriver driver) throws InterruptedException 
	{
		PatientListFun.Save(driver);
		
		int i=1;
		WebElement Errorblank=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"DemographicsMainView\"]/Custom[@ClassName=\"DemographicsSection1View\"]/Edit[@ClassName=\"TextBox\"]/Text[@Name=\"Input cannot be blank\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Input cannot be blank\"]"));
		String ExceptedErrorblank="Input Cannot be blank";
		inputcannotbeblank(driver,Errorblank,"FirstName");
		DemographicsGUI.Basicinformation(Errorblank, ExceptedErrorblank, i);
		
		WebElement ErrorDate=driver.findElement(By.name("Please select a date"));
		String ExceptedErrorDate="Please select a date";
		inputcannotbeblank(driver,ErrorDate,"DOB");
		DemographicsGUI.Basicinformation(ErrorDate, ExceptedErrorDate, i);
		
		/*
		WebElement ErrorBloodGroup = driver.findElement(By.name("Select a blood group"));
        Thread.sleep(3000);
        // Create an instance of Actions class
        Actions action1 = new Actions(driver);
        action1.moveToElement(ErrorBloodGroup).perform();
        Thread.sleep(3000);
        WebElement tooltipbloodgroup= driver.findElement(By.name("Select a blood group"));

 
		String ExceptedBloodGroup="Select a blood group";
		
		inputcannotbeblank(driver,tooltipbloodgroup,"BloodGroup");
		DemographicsGUI.Basicinformation(tooltipbloodgroup, ExceptedBloodGroup, i);
		
		WebElement ErrorPatientSize=driver.findElement(By.name("Select a Patient Size"));
		String ExceptedPatientSize="Select a Patient Size";
		
		inputcannotbeblank(driver,ErrorPatientSize,"PatientSize");
		DemographicsGUI.Basicinformation(ErrorPatientSize, ExceptedPatientSize, i);
		*/
		WebElement PateintGender=driver.findElement(By.name("Please Select a Gender"));
		String ExceptedPateintGender="Please Select a Gender";
		inputcannotbeblank(driver,PateintGender,"PatientSize");
		DemographicsGUI.Basicinformation(PateintGender, ExceptedPateintGender, i);
		
		WebElement ErrorNameblank=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"DemographicsMainView\"]/Custom[@ClassName=\"DemographicsSection2View\"]/Edit[@ClassName=\"TextBox\"]/Text[@Name=\"Input cannot be blank\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Input cannot be blank\"]"));
		String ExceptedErrorNameblank="Input cannot be blank";
		inputcannotbeblank(driver,ErrorNameblank,"Name");
		DemographicsGUI.Basicinformation(ErrorNameblank, ExceptedErrorNameblank, i);
		WebElement ErrorContactnumber=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"DemographicsMainView\"]/Custom[@ClassName=\"DemographicsSection2View\"]/Edit[@ClassName=\"TextBox\"]/Text[@Name=\"Input cannot be blank\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Input cannot be blank\"]/Edit[@ClassName=\"TextBox\"]/Text[@Name=\"Input cannot be blank\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Input cannot be blank\"]"));
		String ExceptedErrorContactNumber="Input cannot be blank";
		inputcannotbeblank(driver,ErrorContactnumber,"Contact Number");
		DemographicsGUI.Basicinformation(ErrorContactnumber, ExceptedErrorContactNumber, i);
		
	}
	
	
	
	public static void inputcannotbeblank(WebDriver driver, WebElement ErrorText, String Errorfield)
	{
	
	if (ErrorText.isDisplayed()) {
		
		System.out.println(Errorfield+ " RUN PASS " + " Error message is displayed");
	} else {
		System.out.println(Errorfield+ " RUN FAIL " + " Error message is not displayed");
	}
	}

	
	public static void inputcannotbeblank(WebDriver driver)
	{
		

		
		
	}

}
