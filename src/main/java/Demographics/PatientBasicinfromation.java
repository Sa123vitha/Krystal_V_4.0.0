package Demographics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.appium.java_client.windows.WindowsDriver;

public class PatientBasicinfromation{
	
	public static void Camera()
	{
		
	}
	public static void Browse()
	{
		
	}
	public static void PatientID(WebElement rTID)
	{
	
		String APID=rTID.getText();
		System.out.println(APID);
	}
	

	public static void OtherID(WebDriver driver, String fieldId, String expectedErrorMessage) throws InterruptedException
	{
	 {
		        WebElement textField = driver.findElement(By.name("First Name"));
		        textField.click();
		        driver.switchTo().activeElement().sendKeys("123456");
		        driver.findElement(By.name("SAVE")).click();
				Thread.sleep(2000);

		        WebElement errorElement = driver.findElement(By.className("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"DemographicsMainView\"]/Custom[@ClassName=\"DemographicsSection1View\"]/Edit[@ClassName=\"TextBox\"]/Text[@Name=\"Input cannot be blank\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Input cannot be blank\"]"));
		        
		        String actualErrorMessage = errorElement.getText();

		        compareResults(expectedErrorMessage, actualErrorMessage, "Required Field Validation");
		    }
				
	}
	public static void compareResults(Object expected, Object actual, String description) 
	{
        if (expected.equals(actual)) {
            System.out.println(description + " - Test passed. Expected: " + expected + " | Actual: " + actual);
        } 
        
        else {
            System.out.println(description + " - Test failed. Expected: " + expected + " | Actual: " + actual);
        }
	}
	
	
	public static void FirstName()
	{
		
	}
	public static void MiddleName()
	{
		
	}
	public static void LastName()
	{
		
	}
	public static void DateofBirth()
	{
		
	}
	public static void Age()
	{
		
	}
	public static void BloodGroup()
	{
		
	}
	public static void Gender()
	{
		
	}
	public static void PatientSize()
	{
		
	}
	public static void Weight()
	{
		
	}
	public static void Nationality()
	{
		
	}
	public static void LanguagesKnow()
	{
		
	}
	public static void IDtype()
	{
		
	}
	public static void IDNumber()
	{
		
	}
	public static void Remarks()
	{
		
	}

	
	
}
