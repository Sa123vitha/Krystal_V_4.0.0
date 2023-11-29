package KrystalDemographics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SigninPage {

	public static void GUISignin(WebDriver driver) {
		int x = 1;
		WebElement SigninProductlogo = driver.findElement(By.xpath(
				"//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Image[@ClassName=\"Image\"]"));

		WebElement SigninProductImage = driver.findElement(By.xpath(
				"//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Image[@ClassName=\"Image\"]"));
		Addfield.productlogo(SigninProductlogo, "Productlogo");
		Addfield.productlogo(SigninProductImage, "ProductImage");

		WebElement Productname = driver.findElement(By.name("Product Name :"));
		WebElement OfflineRnV = driver.findElement(By.name("Offline Record & Verification"));
		WebElement Signinlabel = driver.findElement(By.xpath(
				"//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Text[@ClassName=\"Text\"][@Name=\"SIGN IN\"]/Text[@Name=\"SIGN IN\"][@AutomationId=\"Label\"]/Text[@ClassName=\"TextBlock\"][@Name=\"SIGN IN\"]"));
		WebElement UserName = driver.findElement(By.name("User ID"));
		WebElement Password = driver.findElement(By.name("Password"));

		WebElement SigninButton = driver.findElement(By.xpath(
				"//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Button[@Name=\"SIGN IN\"][@AutomationId=\"BtnValidate\"]"));
		WebElement ClearButton = driver.findElement(By.name("CLEAR"));
		WebElement Notice = driver.findElement(By.name("Disclaimer Notice :"));

		WebElement NoticeDescription = driver.findElement(By.name(
				"This software is protected by copyright law and international treaties. Unauthorized duplication or distribution of this software or any other portion of it may result in severe civil and criminal penalties and will be prosecuted to the maximum extent possible under the law."));
		WebElement Licensed = driver.findElement(By.name("Licensed To :"));
		WebElement Hospital = driver.findElement(By.name("Hospital_Name"));
		WebElement HELP = driver.findElement(By.name("HELP"));
		WebElement EXIT = driver.findElement(By.name("EXIT"));
		WebElement SoftwareVersion = driver.findElement(By.name("Software Version :"));
		WebElement VesrionNumber = driver.findElement(By.name("4.0.0 A1"));
		WebElement Copyright = driver.findElement(By.name("Copyright © Panacea Medical Technologies 2023"));

		String ExceptedProductName = "Product Name :";
		String ExceptedOfflineRnV = "Offline Record & Verification";
		String ExceptedSignin = "SIGN IN";
		String ExceptedUserName = "USER ID";
		String ExceptedPassword = "PASSWORD";
		String ExceptedSigninButton = "SIGN IN";
		String ExceptedClearButton = "CLEAR";
		String ExceptedNotice = "Disclaimer Notice :";
		String ExceptedNoticeDescription = "This software is protected by copyright law and international treaties. Unauthorized duplication or distribution of this software or any other portion of it may result in severe civil and criminal penalties and will be prosecuted to the maximum extent possible under the law.";
		String ExceptedLicensed = "Licensed to :";
		String ExceptedHospital = "Hospital_Name";
		String ExceptedHELP = "HELP";
		String ExceptedEXIT = "EXIT";
		String ExceptedSoftwareVersion = "Software Version :";
		String ExceptedVesrionNumber = "4.0.0_A1";
		String ExceptedCopyright = "Copyright © Panacea Medical Technologies 2023";

		System.out.println("=========================SIGNIN GUI TESTCASES============================");

		DemographicsGUI.Basicinformation(Productname, ExceptedProductName, x);
		x++;
		DemographicsGUI.Basicinformation(OfflineRnV, ExceptedOfflineRnV, x);
		x++;
		DemographicsGUI.Basicinformation(Signinlabel, ExceptedSignin, x);
		x++;
		DemographicsGUI.Basicinformation(UserName, ExceptedUserName, x);
		x++;
		DemographicsGUI.Basicinformation(Password, ExceptedPassword, x);
		x++;
		DemographicsGUI.Basicinformation(ClearButton, ExceptedClearButton, x);
		x++;
		DemographicsGUI.Basicinformation(Notice, ExceptedNotice, x);
		x++;
		DemographicsGUI.Basicinformation(NoticeDescription, ExceptedNoticeDescription, x);
		x++;
		DemographicsGUI.Basicinformation(Licensed, ExceptedLicensed, x);
		x++;
		DemographicsGUI.Basicinformation(Hospital, ExceptedHospital, x);
		x++;
		DemographicsGUI.Basicinformation(HELP, ExceptedHELP, x);
		x++;
		DemographicsGUI.Basicinformation(EXIT, ExceptedEXIT, x);
		x++;
		DemographicsGUI.Basicinformation(SoftwareVersion, ExceptedSoftwareVersion, x);
		x++;
		DemographicsGUI.Basicinformation(VesrionNumber, ExceptedVesrionNumber, x);
		x++;
		DemographicsGUI.Basicinformation(Copyright, ExceptedCopyright, x);
		x++;

	}

	public static void SigninHelp(WebDriver driver) throws InterruptedException {
		int x = 1;
		System.out.println("==========================HELP WINDOW GUI CASE========================");
		String ExceptedHelp = "HELP";
		WebElement Helpfun = driver.findElement(By.name("HELP"));
		Helpfun.click();
		Thread.sleep(2000);
		DemographicsGUI.Basicinformation(Helpfun, ExceptedHelp, x);
		x++;
		Thread.sleep(2000);
		// WebElement
		// Helpproductlogo=driver.findElement(By.name("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Window[@ClassName=\"Window\"][@Name=\"Custom
		// Popup\"]/Custom[@ClassName=\"CustomHelpView\"]/Image[@ClassName=\"Image\"]"));
		// Addfield.productlogo(Helpproductlogo,"HelpProductlogo");
		WebElement HelpContact = driver.findElement(By.name("Contact Panacea Medical Technologies"));
		WebElement HelpRegional = driver.findElement(By.name("Regional Service Engineer"));
		WebElement HelpService = driver.findElement(By.name("Service Engineer : "));
		WebElement HelpSCN = driver.findElement(By.name("Contact Number : "));
		WebElement HelpEmail = driver.findElement(By.name("E-mail ID :"));
		WebElement HelpHeadoffice = driver.findElement(By.name("Head Office"));
		WebElement HelpRCN = driver.findElement(By.name("Contact Number : "));
		WebElement HelpEmailID = driver.findElement(By.name("E-mail ID :"));
		WebElement HelpClose = driver.findElement(By.name("Close"));

		String ExceptedHelpContact = "Contact Panacea Medical Technologies";
		String ExceptedHelpRegional = "Regional Service Engineer";
		String ExceptedHelpService = "Service Engineer : ";
		String ExceptedHelpSCN = "Contact Number : ";
		String ExceptedHelpEmail = "E-mail ID :";
		String ExceptedHelpHeadoffice = "Head Office";
		String ExceptedHelpRCN = "Contact Number : ";
		String ExceptedHelpEmailID = "E-mail ID :";
		String ExceptedHelpClose = "Close";

		// DemographicsGUI.Basicinformation(HelpContact,ExceptedHelpContact,x);x++;
		DemographicsGUI.Basicinformation(HelpRegional, ExceptedHelpRegional, x);
		x++;
		DemographicsGUI.Basicinformation(HelpService, ExceptedHelpService, x);
		x++;
		DemographicsGUI.Basicinformation(HelpSCN, ExceptedHelpSCN, x);
		x++;
		DemographicsGUI.Basicinformation(HelpEmail, ExceptedHelpEmail, x);
		x++;
		DemographicsGUI.Basicinformation(HelpHeadoffice, ExceptedHelpHeadoffice, x);
		x++;
		DemographicsGUI.Basicinformation(HelpRCN, ExceptedHelpRCN, x);
		x++;
		DemographicsGUI.Basicinformation(HelpEmailID, ExceptedHelpEmailID, x);
		x++;
		DemographicsGUI.Basicinformation(HelpClose, ExceptedHelpClose, x);
		x++;

		/*
		System.out.println("===========================HELP WINDOW FUN CASES=============================");
		HelpClose.click();
		
		Thread.sleep(2000);
		System.out.println("To verify click on close icon navigated to signin screen");
		WebElement signInPage = driver.findElement(
				By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]"));
		if (signInPage.isDisplayed()) {
			System.out.println("Successfully navigated to the sign-in page");
		} else {
			System.out.println("Failed to navigate to the sign-in page");
		}
		*/
	}
	public static void Helpdrive(WebDriver driver){
		
    String filePath = "D:\\Krystal\\Help\\Contact Details\\ContactDetails.txt"; // Path to your CSV file
        
    
    
    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
        String line;
    
        while ((line = reader.readLine()) != null) {
           String first=line;
          System.out.println(first);
          CompareHelp(driver, first); 
        }
            // Fetch corresponding data from the desktop application using Selenium
            WebElement ticketNumberElement = driver.findElement(By.name("Service Engineer"));
            String ticketNumberFromApp = ticketNumberElement.getText();
            
            WebElement issueElement = driver.findElement(By.name("(+91) 8042428700"));
            String issueFromApp = issueElement.getText();
            
            WebElement statusElement = driver.findElement(By.name("supportService@panaceamedical.com"));
            String statusFromApp = statusElement.getText();
            
            WebElement statusElement1 = driver.findElement(By.name("(+91) 9865776545"));
            String statusFromApp1 = statusElement.getText();
            
            WebElement statusElement2 = driver.findElement(By.name("supportHeadOfc@panaceamedical.com"));
            String statusFromApp2 = statusElement.getText();
            
     
            
            // ... fetch more data from the application as needed
            
            // Compare the fetched data from the file with the data from the application
         //   if (ticketNumber.equals(ticketNumberFromApp) && issue.equals(issueFromApp) && status.equals(statusFromApp) && status1.equals(statusFromApp1) && status2.equals(statusFromApp2)) {
         //       System.out.println("Data for ticket number " + ticketNumber + " matches!");
         //   } else {
        //        System.out.println("Data for ticket number " + ticketNumber + " does not match!");
        //    }
            
            // Perform any additional actions with the fetched data and application data
            
            System.out.println("-----------------------------");
        }
    catch (IOException e) {
        e.printStackTrace();
    } 		
}
	public static void CompareHelp(WebDriver driver, String HelpText)
	{
		String Firsttext=HelpText;
	}
	
	
	

	public static void signin(WebDriver driver) throws InterruptedException {
		int x = 1;

		WebElement usernameField = driver.findElement(By.name("User ID"));
		
		WebElement PateintListscreen = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Image[@ClassName=\"Image\"]"));
		
		//WebElement Passwordbox = driver.findElement(By.className("PasswordBox"));

	
		
		System.out.println("=======================SIGNIN FUN TESTCASES============================");
		signinButton(driver);

		WebElement Errormessage = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Text[@Name=\"User ID or Password cannot be empty.\"][@AutomationId=\"LblSignInError\"]/Text[@ClassName=\"TextBlock\"][@Name=\"User ID or Password cannot be empty.\"]"));
		String ActalErrormessage = "UserID or Password textfields cannont be empty";
		System.out.println("1. To verify if userid and password is blank, Not navigated to the patient list screen");
		
		Patientlistdisplay(driver,PateintListscreen,"PatientList");
		System.out.println("----------------------------------------------------------------------");
		System.out.println("2. To verify Both Userid and Password is blank, Error message is displaying");
		PatientListFun.textisDisplayed(driver,Errormessage);
		System.out.println("----------------------------------------------------------------------");
		System.out.println("3. To verify  Error message displayed is same as Excepted");
		DemographicsGUI.Basicinformation(Errormessage, ActalErrormessage, x);x++;
		Thread.sleep(5000);
		
		usernameField.click();
		System.out.println("----------------------------------------------------------------------");
		System.out.println("4. To verify if userid is enetred and  Password is blank, Not navigated to patientlist screen");
		driver.switchTo().activeElement().sendKeys("123456");
	    Thread.sleep(2000);
		signinButton(driver);
		Patientlistdisplay(driver,PateintListscreen,"PatientList");
		WebElement Usermsge = driver.findElement(By.xpath(
				"//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Text[@Name=\"User ID or Password cannot be empty.\"][@AutomationId=\"LblSignInError\"]/Text[@ClassName=\"TextBlock\"][@Name=\"User ID or Password cannot be empty.\"]"));
		String ActualUsermsge = "UserID or Password cannot be empty";
		System.out.println("----------------------------------------------------------------------");
		System.out.println("5. To verify Both Userid Entered and Password is blank, Error message is displaying");
		PatientListFun.textisDisplayed(driver,Usermsge);
		System.out.println("----------------------------------------------------------------------");
		System.out.println("6. To verify  Error message displayed is same as Excepted");
		DemographicsGUI.Basicinformation(Usermsge, ActualUsermsge, x);
		x++;
		Thread.sleep(2000);
		clearButton(driver);
		Thread.sleep(2000);
		WebElement Passwordbox = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Edit[@AutomationId=\"PwdBoxUserPassword\"]/Text[@Name=\"Password\"][@AutomationId=\"LblName\"]"));
		Passwordbox.click();
		Thread.sleep(5000);
		//System.out.println("----------------------------------------------------------------------");
		//System.out.println("7. To verify if userid is blank and  Password is entered, Not navigated to patientlist screen");
		driver.switchTo().activeElement().sendKeys("123456");
		Thread.sleep(2000);
		signinButton(driver);
		// Patientlistdisplay(driver,PateintListscreen);
		
		WebElement Psmsge = driver.findElement(By.xpath(
				"//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Text[@Name=\"User ID or Password cannot be empty.\"][@AutomationId=\"LblSignInError\"]/Text[@ClassName=\"TextBlock\"][@Name=\"User ID or Password cannot be empty.\"]"));
		String ActualPsmsge = "UserID or Password cannot be empty";
		System.out.println("----------------------------------------------------------------------");
		System.out.println("7. To verify Both Userid blank and Password is enetred, Error message is displaying");
		PatientListFun.textisDisplayed(driver,Psmsge);
		System.out.println("----------------------------------------------------------------------");
		System.out.println("8. To verify  Error message displayed is same as Excepted");
		DemographicsGUI.Basicinformation(Psmsge, ActualPsmsge, x);
		x++;
		Thread.sleep(2000);
		clearButton(driver);
		Thread.sleep(2000);
		//System.out.println("----------------------------------------------------------------------");
		//System.out.println("10. To verify Userid and Password is inavid, Not navigated to patientlist screen");
		Thread.sleep(3000);
		driver.switchTo().activeElement().sendKeys("KJKJHJH&*&*&*");
		Thread.sleep(5000);
		driver.findElement(By.className("PasswordBox")).sendKeys("123456");
		Thread.sleep(2000);
		signinButton(driver);
		//Patientlistdisplay(driver,PateintListscreen);

		WebElement UPError = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Text[@Name=\"Invalid Credentials\"][@AutomationId=\"LblSignInError\"]"));
		String ActualUPError = "Invalid Credentials";
		System.out.println("----------------------------------------------------------------------");
		System.out.println("9. To verify Both Userid blank and Password is enetred, Error message is displaying");
		PatientListFun.textisDisplayed(driver,UPError);
		System.out.println("----------------------------------------------------------------------");
		System.out.println("10. To verify  Error message displayed is same as Excepted");
		DemographicsGUI.Basicinformation(UPError, ActualUPError, x);
		x++;
		Thread.sleep(2000);
		clearButton(driver);
		Thread.sleep(2000);
		System.out.println("----------------------------------------------------------------------");
		System.out.println("11. To verify if UserID and Password is valid,Navigated to pateint list screen");
		Thread.sleep(1000);
		//PatientListFunCommon.checkDefaultCursorPlacement(driver,TxtUsername);
		driver.switchTo().activeElement().sendKeys("m");
		Thread.sleep(1000);
		driver.findElement(By.className("PasswordBox")).sendKeys("p");
		Thread.sleep(1000);
		signinButton(driver);
		WebElement Patientscreen = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]"));
		if (Patientscreen.isDisplayed()) {
			System.out.println("Run Pass: Navigated to PatientList screen");
		} else {
			System.out.println("Run Fail: Not Navigating to PatientList screen");
		}
		
		
		
	}
	public static void Patientlistdisplay(WebDriver driver, WebElement Signinscreen, String Text) throws InterruptedException 
	{
		if (Signinscreen.isDisplayed()) {
			System.out.println("Run Pass: Not Navigating to" +Text+ " screen");
		} 
		else {
			System.out.println("Run Fail: Not Navigating to" +Text+ " screen");
		}
		Thread.sleep(2000);
	}
	
	public static void signinButton(WebDriver driver) throws InterruptedException {
		WebElement Signinbutton = driver.findElement(By.xpath(
				"//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Button[@Name=\"SIGN IN\"][@AutomationId=\"BtnValidate\"]"));
		Signinbutton.click();
		Thread.sleep(2000);

	}

	public static void clearButton(WebDriver driver) throws InterruptedException {
		WebElement ClearButton = driver.findElement(By.name("CLEAR"));

		ClearButton.click();
		Thread.sleep(5000);

	}

	public static void ExitButton(WebDriver driver) throws InterruptedException {
		int x = 1;
		System.out.println("===========================EXIT Button===============================");
		String ExceptedExit = "EXIT";
		WebElement Exit = driver.findElement(By.name("EXIT"));
		DemographicsGUI.Basicinformation(Exit, ExceptedExit, x);
		x++;
		Thread.sleep(2000);
		Exit.click();
		Thread.sleep(5000);
		// WebElement
		// Desktop=driver.findElement(By.xpath("/Pane[@ClassName=\"#32769\"][@Name=\"Desktop
		// 1\"]/Pane[@ClassName=\"Progman\"][@Name=\"Program
		// Manager\"]/List[@ClassName=\"SysListView32\"][@Name=\"Desktop\"]/ListItem[@Name=\"Krystal\"][starts-with(@AutomationId,\"ListViewItem-\")]"));

		// if (Desktop.isDisplayed()) {
		// System.out.println("Application get exited");
		// } else {
		// System.out.println("Application not exited");
		// }
	}

}
