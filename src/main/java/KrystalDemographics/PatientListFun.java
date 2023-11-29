package KrystalDemographics;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.appium.java_client.windows.WindowsDriver;

public class PatientListFun {

	public static void Camera()
	{
		
	}
	public static void ImageDisplayed(WebDriver driver, WebElement image) throws InterruptedException 
	{
		if (image.isDisplayed()) {
			System.out.println("The Image is displayed correctly.");
		} else {
			System.out.println("The  Image  is not displayed.");
		}
	}
	public static void Browse(WebDriver driver) throws InterruptedException 
	{
		System.out.println("=======================Browse=========================");
		//System.out.println("1. To verify by default image  is not displayed");
		//WebElement importedimage = driver.findElement(By.className("Image"));
		//ImageDisplayed(driver,importedimage);
		//Thread.sleep(1000);
		driver.findElement(By.name("BROWSE")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("Pictures")).click();
		Thread.sleep(1000);
		WebElement doubleclickscreen = driver.findElement(By.name("Screenshots"));
		Actions action2 = new Actions(driver);
		action2.moveToElement(doubleclickscreen).doubleClick().perform();
		Thread.sleep(2000);
		driver.findElement(By.name("Screenshot (3474).png")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("Open")).click();
		Thread.sleep(1000);
		
		System.out.println("-----------------------------------------------");
		System.out.println("2. To verify Imported image is displayed or not");
		
	   // ImageDisplayed(driver,importedimage);
		
/*
		WebElement elementToMouseOverBrowse = driver.findElement(By.name("Delete"));
        Thread.sleep(3000);
        // Create an instance of Actions class
        Actions action1 = new Actions(driver);
        action1.moveToElement(elementToMouseOverBrowse).perform();
        Thread.sleep(3000);
        elementToMouseOverBrowse.click();
		
*/
	}
	public static void PatientID(WebElement rTID)
	{
	
		String APID=rTID.getText();
		System.out.println(APID);
	}
	

	public static void FirstName(WebDriver driver) throws InterruptedException {
		System.out.println("=======================FirstName=========================");
		 WebElement textField = driver.findElement(By.name("First Name"));
		// PatientListFunCommon.checkDefaultCursorPlacement(driver,textField);
	     textField.click();
		System.out.println("1. To verify the Textbox get highlighted if clicked on the txtbox");
	     PatientListFunCommon.Textboxhighlight(driver, "First Name");
	     Thread.sleep(4000); 
	     
	     System.out.println("-----------------------------------------------");
	     System.out.println("2. To verify the Textbox if entered alphabhets");
	    PatientListFunCommon.testTextBoxAcceptsAlphabets(driver,textField);
	    
	    //Mandatoryfields(driver);
	    //Savedetails(driver);
	  //  Edit(driver);
	  //  PatientListFunCommon.clear(driver,textField);
	    
	 //   PatientListFunCommon.numbers(driver,textField);
	 //   PatientListFunCommon.Update(driver);
    }
	/*public static void Mandatoryfields(WebDriver driver) throws InterruptedException
	{
		DateofBirth(driver);
		BloodGroup(driver);
		Gender(driver);
		PatientSize(driver);
		CareTakerDetails.Name(driver);
		CareTakerDetails.ContactNumber(driver);
		
	}
	*/
	public static void Savedetails(WebDriver driver) throws InterruptedException
	{
		Save(driver);
		
		
	}
	
	
	//"/Pane[@ClassName=\"#32769\"][@Name=\"Desktop 1\"]/Window[@ClassName=\"Window\"][@Name=\"MessageWindow\"]/Pane[@ClassName=\"ScrollViewer\"][@Name=\"Demographics data updated for selected patient.\"]/Text[@Name=\"Demographics data updated for selected patient.\"][@AutomationId=\"txtblockmessage\"]"
	//"/Pane[@ClassName=\"#32769\"][@Name=\"Desktop 1\"]/Window[@ClassName=\"Window\"][@Name=\"MessageWindow\"]/Button[@Name=\"OK\"][starts-with(@AutomationId,\"successButton\")]"

	public static void Edit(WebDriver driver) throws InterruptedException
	{
		
		WebElement Editdetails= driver.findElement(By.name("EDIT"));
		Editdetails.click();
	}
	public static void MiddleName(WebDriver driver) throws InterruptedException{
		WebElement textField = driver.findElement(By.name("Middle Name"));
	     textField.click();
	     PatientListFunCommon.Textboxhighlight(driver, "Middle Name");
	     Thread.sleep(4000);
	     PatientListFunCommon.testTextBoxAcceptsAlphabets(driver,textField);
	}
	public static void LastName(WebDriver driver) throws InterruptedException
	{
		WebElement textField = driver.findElement(By.name("Last Name"));
	     textField.click();
	     PatientListFunCommon.Textboxhighlight(driver, "Last Name");
	     Thread.sleep(4000);
	     PatientListFunCommon.testTextBoxAcceptsAlphabets(driver,textField);
	}
	public static void DateofBirth(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.name("Show Calendar")).click();
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
		
	}
	public static void Age()
	{
		
	}
	public static void BloodGroup(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.name("Blood Group")).click();
		Thread.sleep(1000);
		WebElement elementToDateofBirth = driver.findElement(By.name("A-ve"));
		Actions actions = new Actions(driver);
		actions.doubleClick(elementToDateofBirth).perform();
	}
	public static void Gender(WebDriver driver) throws InterruptedException
	{
		System.out.println("=======================Gender=========================");
		WebElement MaleradioButton = driver.findElement(By.name("Male"));
		System.out.println("1.To verify By default Male radio button is not selected");
		isselected(MaleradioButton,"Male");
		Thread.sleep(5000);
		GenderClick(MaleradioButton);
		
	
		System.out.println("2. To verify the Male radio button is selected");
		isselectedClick(MaleradioButton,"Male");
		WebElement FemaleradioButton = driver.findElement(By.name("Female"));
		
		System.out.println("-------------------------------------------------");
		System.out.println("1.To verify By default Female radio button is not selected");
		isselected(FemaleradioButton,"Female");
		GenderClick(FemaleradioButton);
		
	
		System.out.println("2. To verify the Female radio button is selected");
		isselectedClick(FemaleradioButton,"Female");
		
		WebElement OtherradioButton = driver.findElement(By.name("Others"));
		
		System.out.println("-------------------------------------------------");
		System.out.println("1.To verify By default Others radio button is not selected");
		isselected(OtherradioButton,"Others");
		GenderClick(OtherradioButton);
		
	
		System.out.println("2. To verify the Others radio button is selected");
		isselectedClick(OtherradioButton,"Others");
		
		
		
		 		
	}
public static void isselected(WebElement GenderradioButton, String GenderName)
{
	

	 if (!GenderradioButton.isSelected())
	 {
          System.out.println("Run Pass: By default " +GenderName+" radio button is not selected");     
     }
	 else
	 {
		 System.out.println("Run Fail: By default  " +GenderName+" radio button is selected");
	 }
}

public static void isselectedClick(WebElement GenderradioButton, String GenderName)
{
	
	 if (GenderradioButton.isSelected())
	 {
          System.out.println("Run Pass: " +GenderName+" radio button is selected"); 
          
     }
	 else
	 {
		 System.out.println("Run Fail:  " +GenderName+" radio button is not selected");
	 }
}
public static void GenderClick(WebElement clickradioButton) throws InterruptedException
{
	clickradioButton.click();
	Thread.sleep(2000);
}
	


	public static void PatientSize(WebDriver driver) throws InterruptedException
	{
		WebElement dropdownElement=driver.findElement(By.name("Patient Size"));
		dropdownElement.click();
		WebElement elementToDoubleClick = driver.findElement(By.name("Small"));
		Actions actions = new Actions(driver);
        actions.doubleClick(elementToDoubleClick).perform();   
	}
	
	public static void Weight(WebDriver driver) throws InterruptedException
	{
		System.out.println("=======================Weight=========================");
		WebElement dropdownElement=driver.findElement(By.name("Patient Weight (kg)"));
		dropdownElement.click();
		Thread.sleep(2000);
		System.out.println("-------------------------------------------------");
		System.out.println("1. To verify the Weight Textfield is not accepting alphabhets");
		acceptalphabhets(driver,dropdownElement);

		System.out.println("2. To verify the Weight Textfield is not accepting specialcharcters");
		acceptspecialcharcters(driver,dropdownElement);
		
		System.out.println("3. To verify the Weight textfield displaying error message when entered range is min 0 to max 301");
		acceptvalidRange(driver,dropdownElement);
	}
	public static void acceptalphabhets(WebDriver driver, WebElement Element) throws InterruptedException
	{
		String Alphabhets="KSJDKHDJKHDJDJHGDJD";
		WebElement TextElement=driver.switchTo().activeElement();
		TextElement.sendKeys(Alphabhets);
		String enteredValue = driver.switchTo().activeElement().getText();
		Thread.sleep(1000);
    	System.out.println(enteredValue);
        if (enteredValue.equals(Alphabhets)) {
        	
          System.out.println("Test failed: The text field accepted the entered alphabets.");
          
       } else {
           System.out.println("Test passed: The text field did not accept the entered alphabets.");
           
       }
        
			
	}
	public static void acceptspecialcharcters(WebDriver driver, WebElement Element) throws InterruptedException
	{
		String Alphabhets="(*((&*&*^&^&%^&%^_)_()";
		WebElement TextElement=driver.switchTo().activeElement();
		TextElement.sendKeys(Alphabhets);
		String enteredValue = driver.switchTo().activeElement().getText();
		Thread.sleep(1000);
    	System.out.println(enteredValue);
        if (enteredValue.equals(Alphabhets)) {
          System.out.println("Test failed: The text field accepted the entered specialcharcters.");
          
       } else {
           System.out.println("Test passed: The text field did not accept the specialcharcters.");
           
       }
		
		
	}
	
	public static void acceptvalidRange(WebDriver driver, WebElement Element) throws InterruptedException
	{
		
		String Numbers="0";
		WebElement TextElement=driver.switchTo().activeElement();
		TextElement.sendKeys(Numbers);
		
		String enteredValue = driver.switchTo().activeElement().getText();
		Thread.sleep(1000);
		WebElement Text=driver.findElement(By.name("Range:[1 to 300]"));
		System.out.println("4. To verify if enetred number is 0, Error message is displaying");
		textisDisplayed(driver,Text);
        TextElement.clear();
        Thread.sleep(4000);
        
		String Nextnumber="301";
		WebElement NextElement=driver.switchTo().activeElement();
		System.out.println("5. To verify if enetred number is 301, Error message is displaying");
		NextElement.sendKeys(Nextnumber);
		textisDisplayed(driver,Text);
		 TextElement.clear();
		 
		 String Correctnumber="300";
		 WebElement CorrectElement=driver.switchTo().activeElement();
		 CorrectElement.sendKeys(Correctnumber);
		 Thread.sleep(2000);
	}
	public static void textisDisplayed(WebDriver driver,WebElement Element) throws InterruptedException
	{
		 if (Element.isDisplayed())
		 {
	          System.out.println("Test Pass: Error message is displaying.");
	          
	       } 
		 else
	       {
			 
	           System.out.println("Test Fail : Error message is not displaying.");
	           
	       }
		  
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void Nationality(WebDriver driver) throws InterruptedException
	{
		
		WebElement Text=driver.findElement(By.name("Nationality"));
		Text.click();
		WebElement NextElement=driver.switchTo().activeElement();
		NextElement.sendKeys("Indian");
	}
	public static void LanguagesKnow(WebDriver driver) throws InterruptedException
	{
		WebElement Languages=driver.findElement(By.name("Languages Known"));
		Languages.click();
		WebElement LanguagesKnown=driver.switchTo().activeElement();
		LanguagesKnown.sendKeys("Kannada,English, Hindi");
	}
	public static void IDtype(WebDriver driver)  throws InterruptedException
	{
		WebElement IDtypename=driver.findElement(By.name("ID Type"));
		IDtypename.click();
		WebElement IDtypedata=driver.switchTo().activeElement();
		IDtypedata.sendKeys("Ahdhar");
	}
	public static void IDNumber(WebDriver driver)  throws InterruptedException
	{
		WebElement IDNumbername=driver.findElement(By.name("ID Number"));
		IDNumbername.click();
		WebElement IDNumberdata=driver.switchTo().activeElement();
		 IDNumberdata.sendKeys("Ahdhar");
	}
	
	public static void Remarks(WebDriver driver)  throws InterruptedException
	{
		WebElement Remarksname=driver.findElement(By.name("Remarks"));
		Remarksname.click();
		WebElement Remarksnamedata=driver.switchTo().activeElement();
		Remarksnamedata.sendKeys("Details of patient details ");
	}
	
	public static void signout(WebDriver driver) throws InterruptedException
	{
		//WebElement Signout=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"NavigationTopBarView\"]/Button[@AutomationId=\"ToolTip\"]"));
		//Signout.click();
		//[7.35AC.1AC7692]
		//[7.39F4.1B24ACB]

				//WebElement Signout1=driver.findElement(By.xpath("//*[@RuntimeId=\"7.39F4.1B24ACB\" and @ClassName=\"Button\"]"));
			//	AutomationId: "successButton1" Name=OK and  ClassName:	"Button"

		//Signout1.click();
		//WebElement Signout1=driver.findElement(By.id("7.2D14.2EA5BBC"));

	
	WebElement Signout1=driver.findElement(By.xpath("//Button[@HelpText=\"Sign Out (User ID: 123456)\"]"));

	Signout1.click();
	Thread.sleep(7000);
	
	

	//System.out.println("Hi");
	//Actions actions=new Actions(driver);
	//actions.keyDown(Keys.ALT).sendKeys(Keys.F4).keyUp(Keys.ALT).perform();

	//Thread.sleep(7000);
	//System.out.println("Hi");
	//driver.close();
	
	//WebElement Signout2=driver.findElement(By.name("OK"));
	//Thread.sleep(9000);
	
	// Signout1.click();
	// Thread.sleep(5000);
//	WebElement Signout2=driver.findElement(By.xpath("//Text[@Name=\"Do you want to Sign out?\"][@AutomationId=\"txtblockmessage\"]"));
	
	//WebElement Signout2=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"MessageWindow\"]/Separator[@ClassName=\"Separator\"]/[@Name=\"Sign Out\"]"));
   // Thread.sleep(9000);
  //  Actions action=new Actions(driver);
  //   action.moveToElement(Signout2).perform();
  //   Thread.sleep(2000);

    
	/*
	File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	String destinationPath = "D:\\screenshot.png";
	try {
        ImageIO.write(ImageIO.read(screenshotFile), "png", new File(destinationPath));
        System.out.println("Screenshot saved successfully.");
    } catch (IOException e) {
        System.err.println("Failed to save the screenshot: " + e.getMessage());
    }
		
	*/			
	//WebElement Signout2=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"MessageWindow\"]/Pane[@ClassName=\"ScrollViewer\"][@Name=\"Do you want to Sign out?\"]"));
		/* Set<String> Set = driver.getWindowHandles();
		    Iterator<String> Iterator = Set.iterator();
		    String p=Iterator.next();
		    
		   String c= Iterator.next();
		   System.out.println(p);
		   System.out.println(c);
		   driver.switchTo().window(c);
		   Thread.sleep(2000);
		   
		 */
		

	}
	public static void Save(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.name("SAVE")).click();
	     Thread.sleep(7000);
	   // Alert alert = driver.switchTo().alert();
	    
	  // alert.accept();
	    
	    
	
	 //  driver.switchTo().window(c);
	 
	  // driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"MessageWindow\"]/Button[@Name=\"OK\"][starts-with(@AutomationId,\"successButton\")]")).click();
	   
	
	 	Actions actions=new Actions(driver);
	 	actions.keyDown(Keys.ALT).sendKeys(Keys.F4).keyUp(Keys.ALT).perform(); 
	}
	
	

		
	}
	
	
	
	
