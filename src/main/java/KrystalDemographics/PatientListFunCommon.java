package KrystalDemographics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PatientListFunCommon  {
	// Testcase 1 : Checking for by default cusor placing in firstname or not.
	
	// method name should be lowercaseUppercase
	
	public static void checkDefaultCursorPlacement (WebDriver driver,WebElement FirstnameText)
	
	{
	
		Actions actions = new Actions(driver);
		WebElement activeElement = driver.switchTo().activeElement();
		System.out.println(FirstnameText);
		System.out.println(activeElement);
		// Compare the active element with the User ID textfield
       
		if (activeElement.equals(FirstnameText)) {
            System.out.println("Mouse cursor is placed in the FirstName Textfield by default");
        }
        else {
            System.out.println("Mouse cursor is not placed in the FirstName Textfield by default");
        }
		
	}
	
	
	
	public static void Textboxhighlight(WebDriver driver, String TextCursor) {
		
	
     WebElement FocusedElement=driver.switchTo().activeElement();
     if(FocusedElement.getAttribute("IsKeyboardFocusable").equals("True"))
     {
     	System.out.println(TextCursor+ " TextCursor is get highlighted ");
     }
     else
     {
    	 System.out.println(TextCursor+ " TextCursor is not get highlighted ");
     }
	}
	
	public static void  testTextBoxAcceptsAlphabets(WebDriver driver,WebElement textBox) throws InterruptedException {
        
        // Enter all alphabets from A to Z in the text box
        for (char c = 'A'; c <= 'Z'; c++) 
        {
         driver.switchTo().activeElement().sendKeys(String.valueOf(c));
           // driver.switchTo().activeElement().sendKeys(Keys.RETURN);   
        }
       // Thread.sleep(2000);
       // String enteredValue = driver.switchTo().activeElement().getText();
       //  WebElement  EnteredValue=driver.switchTo().activeElement();
         
         
         
         
         
         
         
      //  
      //  clear(driver, EnteredValue);
        
       

       
        
        
        
        
                              
      /*  // Verify that all alphabets are present in the text box
        
        System.out.println(enteredValue);
        if(EnteredValue.equals("[A-Z]"))
        	{
        	System.out.println("All alphabets are  present in the text box");
        	}
        else {
        	System.out.println("Not matching");
        }
    
    */
	}
	public static void numbers(WebDriver driver,WebElement  EnteredValue) throws InterruptedException
	{
		EnteredValue.sendKeys("132454264246246254624626");
		Thread.sleep(2000);
		Update(driver);
	}
	
	public static void Update(WebDriver driver) throws InterruptedException
	{
		WebElement Update=driver.findElement(By.name("UPDATE"));
		Update.click();
		Thread.sleep(2000);
		WebElement Updatedetails=driver.findElement(By.name("Demographics data updated for selected patient."));
		if (Updatedetails.isDisplayed()) {
			System.out.println("Text box enetered data is accepting");
		} 
		else
		{
			System.out.println("Text box enetered data is not accepting");
		}	

	}
	public static void clear(WebDriver driver, WebElement  EnteredValue)
	{
		EnteredValue.click();
		String enteredValue = driver.switchTo().activeElement().getText();
	    WebElement  Value=driver.switchTo().activeElement();
	    Value.clear();
		
		if (Value.getText().isEmpty()) {
            System.out.println("Text field cleared successfully");
        } else {
            System.out.println("Failed to clear text field");
        }
	}
	
	public static void errormessage(WebDriver driver)
	{
	int i=1;
	WebElement Errormessage=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"DemographicsMainView\"]/Custom[@ClassName=\"DemographicsSection1View\"]/Edit[@ClassName=\"TextBox\"]/Text[@Name=\"Maximum Name length:62,Count: 26\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Maximum Name length:62,Count: 26\"]"));
	//WebElement SpecialCharctermessage=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"DemographicsMainView\"]/Custom[@ClassName=\"DemographicsSection1View\"]/Edit[@ClassName=\"TextBox\"]/Text[@Name=\"Input must not contain \\ , &apos;&apos; , &apos;\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Input must not contain \\ , &apos;&apos; , &apos;\"]"));
	
	String ExceptedErrormessage="Maximum Name length:62,Count:26";
	
	DemographicsGUI.Basicinformation(Errormessage,ExceptedErrormessage,i);i++;
}
	
	
}
