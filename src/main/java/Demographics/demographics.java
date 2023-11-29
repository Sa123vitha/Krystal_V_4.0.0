package Demographics;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.windows.WindowsDriver;

public class demographics {
	public void signinmodule()
	{
	}
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
        // SIGNIN MODULE 
      //  WebElement tooltipElement = driver.findElement(By.name("User ID"));
      //  String tooltipText = tooltipElement.getText();
      //  Thread.sleep(2000);
        WebElement usernameField = driver.findElement(By.name("User ID"));
       
        driver.switchTo().activeElement().sendKeys("123456");
        Thread.sleep(2000);
		driver.findElement(By.className("PasswordBox")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Button[@Name=\"SIGN IN\"][@AutomationId=\"BtnValidate\"]")).click();
		Thread.sleep(1000);
	/*
	
	    // ADD PATIENT		
		 // Find the element to perform mouseover on
        WebElement elementToMouseOver = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"NavigationTopBarSubView\"]/Button[@ClassName=\"Button\"]"));
        Thread.sleep(3000);
        // Create an instance of Actions class
        Actions action = new Actions(driver);
        action.moveToElement(elementToMouseOver).perform();
        Thread.sleep(3000);
        WebElement tooltip= driver.findElement(By.name("Add Patient"));

        String Actualtooltip=tooltip.getText();
        String Expectedtooltip="Add Patient";
        if (Actualtooltip.equals(Expectedtooltip))
        {
        	System.out.println("Add Patient tooltip displayed is correct: " + Actualtooltip);
        }
        else {
            System.out.println("Add Patient tooltip wrong. Expected: " + Expectedtooltip+ ", Actual: " + Actualtooltip);
        }
   */   
        driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"NavigationTopBarSubView\"]/Button[@ClassName=\"Button\"]")).click();
        Thread.sleep(1000);
		
        System.out.println("*****************************************************************");
    /*
        // TitleName
        String ActualdemographicsTitle = driver.getTitle();
        String ExpecteddemographicsTitle="DEMOGRAPHICS";
        if (ActualdemographicsTitle.equals(ExpecteddemographicsTitle))
        {
        	System.out.println("Demographics Title name displayed is correct: " + ActualdemographicsTitle);
        }
        else {
            System.out.println("Demographics Title name wrong. Expected: " + ExpecteddemographicsTitle+ ", Actual: " + ActualdemographicsTitle);
            System.out.println("----RUN FAIL----");
        }
        System.out.println("*****************************************************************");
        
        // Camera and Browse button
     
        String ActualBrowsebutton= driver.findElement(By.name("BROWSE")).getText();
        String ExpectedBrowsebutton= "BROWSE";
        if (ActualBrowsebutton.equals(ExpectedBrowsebutton))
        {
        	System.out.println("BROWSE name displayed is correct: " + ActualBrowsebutton);
        }
        else {
            System.out.println("BROWSE  name wrong. Expected: " + ActualBrowsebutton+ ", Actual: " + ExpectedBrowsebutton);
            System.out.println("----RUN FAIL----");
        }
        Thread.sleep(3000);
     // Find the element to perform mouseover on
        WebElement elementToMouseOverBrowse = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"DemographicsMainView\"]/Custom[@ClassName=\"DemographicsSection1View\"]/Button[@Name=\"BROWSE\"][@AutomationId=\"BrowseBtn\"]"));
        Thread.sleep(3000);
        // Create an instance of Actions class
        Actions action1 = new Actions(driver);
        action1.moveToElement(elementToMouseOverBrowse).perform();
        Thread.sleep(3000);
        WebElement tooltipbrowse= driver.findElement(By.name("BROWSE"));

        String Actualtooltipbrowse=tooltipbrowse.getText();
        String Expectedtooltipbrowse="BROWSE";
        if (Actualtooltipbrowse.equals(Expectedtooltipbrowse))
        {
        	System.out.println("BROWSE tooltip displayed is correct: " + Actualtooltipbrowse);
        }
        else {
            System.out.println("BROWSE tooltip wrong. Expected: " + Expectedtooltipbrowse+ ", Actual: " + Expectedtooltipbrowse);
        }
       Thread.sleep(4000);
   
      
       WebElement elementToMouseOverBrowse1 = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"DemographicsMainView\"]/Custom[@ClassName=\"DemographicsSection1View\"]/Button[@Name=\"BROWSE\"][@AutomationId=\"BrowseBtn\"]"));
      
       // Create an instance of Actions class
       Actions action2 = new Actions(driver);
       action2.moveToElement(elementToMouseOverBrowse1).perform();
       
      driver.findElement(By.name("BROWSE")).click();
      Thread.sleep(3000);
       driver.findElement(By.name("Pictures")).click();
       Thread.sleep(1000);
       WebElement doubleclickscreen=driver.findElement(By.name("Screenshots"));
       action2.moveToElement(doubleclickscreen).doubleClick().perform();
     
       Thread.sleep(2000);
       driver.findElement(By.name("Screenshot (3474).png")).click();
       Thread.sleep(3000);
       driver.findElement(By.name("Open")).click();
       Thread.sleep(1000);
       WebElement importedimage=driver.findElement(By.className("Image"));
       if (importedimage.isDisplayed()) {
           System.out.println("The imported image is displayed correctly.");
       } else {
           System.out.println("The imported image is not displayed or displayed wrongly.");
       }
       
       System.out.println("*****************************************************************");
       driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"DemographicsMainView\"]/Custom[@ClassName=\"DemographicsSection1View\"]/Button[@Name=\"BROWSE\"][@AutomationId=\"BrowseBtn\"]")).click();
       Thread.sleep(2000);
       driver.findElement(By.name("Pictures")).click();
       Thread.sleep(1000);
       driver.findElement(By.name("Screenshots")).click();
       Thread.sleep(1000);
       WebElement doubleclickscreen1=driver.findElement(By.name("Screenshots"));
       action2.moveToElement(doubleclickscreen1).doubleClick().perform();
       driver.findElement(By.name("Cancel")).click();
       Thread.sleep(1000);
       WebElement importedimage1=driver.findElement(By.className("Image"));
       if (importedimage.isDisplayed()) {
           System.out.println("The imported image is displayed correctly.");
       } else {
           System.out.println("The imported image is not displayed or displayed wrongly.");
       }
         
       System.out.println("*****************************************************************");
       Thread.sleep(4000);
       
       driver.findElement(By.name("Delete")).click();
       Thread.sleep(3000);
       System.out.println("*****************************************************************");
       driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"DemographicsMainView\"]/Custom[@ClassName=\"DemographicsSection1View\"]/Button[@Name=\"BROWSE\"][@AutomationId=\"BrowseBtn\"]")).click();
       Thread.sleep(2000);
       
       driver.findElement(By.name("Pictures")).click();
       Thread.sleep(1000);
       driver.findElement(By.name("Screenshots")).click();
       Thread.sleep(1000);
       WebElement doubleclickscreen2=driver.findElement(By.name("Screenshots"));
       action2.moveToElement(doubleclickscreen2).doubleClick().perform();
       driver.findElement(By.name("Cancel")).click();
       Thread.sleep(1000);
       WebElement importedimage2=driver.findElement(By.className("Image"));
       if (importedimage2.isDisplayed()) {
           System.out.println("The imported image is displayed correctly.");
       } else {
           System.out.println("The imported image is not displayed or displayed wrongly.");
       }
       
       System.out.println("*****************************************************************");
        
	 */   
     	
    
    String PBI = driver.findElement(By.name("PATIENT BASIC INFORMATION")).getText();
    System.out.println(PBI);
    Thread.sleep(1000);
	String FN = driver.findElement(By.name("First Name")).getText();
	System.out.println(FN);
	Thread.sleep(1000);
	//Actions action2 = new Actions(driver);
	//WebElement Firsttextfield = driver.findElement(By.name("First Name"));
	//Thread.sleep(1000);
	//action2.moveToElement(Firsttextfield).doubleClick().perform();
	//Thread.sleep(3000);
	//driver.findElement(By.name("First Name")).sendKeys("jsgjd");
	 // driver.switchTo().activeElement().sendKeys("m");
	//Thread.sleep(5000);

 	
 
	String MN = driver.findElement(By.name("Middle Name")).getText();
	System.out.println(MN);
	Thread.sleep(1000);
	String LN = driver.findElement(By.name("Last Name")).getText();
	System.out.println(LN);
	Thread.sleep(1000);

	String OT = driver.findElement(By.name("Other ID")).getText();
	System.out.println(OT);
	Thread.sleep(1000);

	String DOB = driver.findElement(By.name("Date Of Birth")).getText();
	System.out.println(DOB);
	Thread.sleep(1000);

	String Age = driver.findElement(By.name("Age (years)")).getText();
	System.out.println(Age);
	Thread.sleep(1000);
	String BloodGroup = driver.findElement(By.name("Blood Group")).getText();
	System.out.println(BloodGroup);
	Thread.sleep(1000);
	String Gender = driver.findElement(By.name("Gender")).getText();
	System.out.println(Gender);
	Thread.sleep(1000);
	String Male= driver.findElement(By.name("Male")).getText();
	System.out.println(Male);
	Thread.sleep(1000);
	String Female= driver.findElement(By.name("Female")).getText();
	System.out.println(Female);
	Thread.sleep(1000);
	String Others= driver.findElement(By.name("Others")).getText();
	System.out.println(Others);
	Thread.sleep(1000);
	String PatientSize= driver.findElement(By.name("Patient Size")).getText();
	System.out.println(PatientSize);
	Thread.sleep(1000);
	//String SelectPlease= driver.findElement(By.name("---Select Please---")).getText();
	//System.out.println(SelectPlease);
	
	String Pediatric= driver.findElement(By.name("Pediatric")).getText();
	System.out.println(Pediatric);
	Thread.sleep(1000);
	String Small= driver.findElement(By.name("Small")).getText();
	System.out.println(Small);
	Thread.sleep(1000);
	String Medium= driver.findElement(By.name("Medium")).getText();
	System.out.println(Medium);
	Thread.sleep(1000);
	String Large= driver.findElement(By.name("Large")).getText();
	System.out.println(Large);
	Thread.sleep(1000);
	
	
	String PatientWeight= driver.findElement(By.name("Patient Weight (kg)")).getText();
	System.out.println(PatientWeight);
	Thread.sleep(1000);
	String Nationality= driver.findElement(By.name("Nationality")).getText();
	System.out.println(Nationality);
	Thread.sleep(1000);
	String Languages= driver.findElement(By.name("Languages Known")).getText();
	System.out.println(Languages);
	Thread.sleep(1000);
	String IDType= driver.findElement(By.name("ID Type")).getText();
	System.out.println(IDType);
	Thread.sleep(1000);
	String IDNumber= driver.findElement(By.name("ID Number")).getText();
	System.out.println(IDNumber);
	Thread.sleep(1000);
	String Remarks= driver.findElement(By.name("Remarks")).getText();
	System.out.println(Remarks);
	Thread.sleep(1000);
	
	System.out.println("***************************************************************");
      
	String CT= driver.findElement(By.name("CONTACT DETAILS")).getText();
	System.out.println(CT);
	Thread.sleep(1000);
	
	String Phone= driver.findElement(By.name("Phone Number")).getText();
	System.out.println(Phone);
	Thread.sleep(1000);
	
	String Alternate= driver.findElement(By.name("Alternate Number")).getText();
	System.out.println(Alternate);
	Thread.sleep(1000);
	
	String Address= driver.findElement(By.name("Current Address")).getText();
	System.out.println(Address);
	Thread.sleep(1000);
	
	String EmailID= driver.findElement(By.name("Email ID")).getText();
	System.out.println(EmailID);
	Thread.sleep(1000);
	
	String PermanentAddress= driver.findElement(By.name("Permanent Address")).getText();
	System.out.println(PermanentAddress);
	Thread.sleep(1000);
	
	String Region= driver.findElement(By.name("Region")).getText();
	System.out.println(Region);
	Thread.sleep(1000);
	
	String ZipCode= driver.findElement(By.name("Zip Code")).getText();
	System.out.println(ZipCode);
	Thread.sleep(2000);
	
	//String Country= driver.findElement(By.name("Country")).getText();
	//System.out.println(Country);
	//Thread.sleep(1000);
      
	System.out.println("***************************************************************");  
     
	String Care= driver.findElement(By.name("CARE TAKER DETAILS")).getText();
	System.out.println(Care);
	Thread.sleep(1000);
	
	String Name= driver.findElement(By.name("Name")).getText();
	System.out.println(Name);
	Thread.sleep(1000);
	
	String Number= driver.findElement(By.name("Contact Number")).getText();
	System.out.println(Number);
	Thread.sleep(1000);
	
	String Address1= driver.findElement(By.name("Address")).getText();
	System.out.println(Address1);
	Thread.sleep(1000);
	
	String Relationship= driver.findElement(By.name("Relationship")).getText();
	System.out.println(Relationship);
	Thread.sleep(1000);
	
	
	
	
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      

	}

}
