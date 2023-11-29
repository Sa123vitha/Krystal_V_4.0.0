package KrystalDemographics;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.WindowsElement;

public class DemographicsMain {
	
	   static WebDriver driver;
	
		public static void main(String[] args) throws InterruptedException, MalformedURLException {
			
			/*
			String Apppath="C:\\Program Files\\Panacea Medical Technologies\\Krystal\\Krystal.exe";
			DesktopOptions option = new DesktopOptions();
			option.setApplicationPath(Apppath);
			WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), option);
			Thread.sleep(5000);
			
			*/
			String appPath = "C:\\Program Files\\Panacea Medical Technologies\\Krystal\\Krystal.exe";
	        String winAppDriverUrl = "http://127.0.0.1:4723";
	        DesiredCapabilities appCapabilities = new DesiredCapabilities();
	        appCapabilities.setCapability("app", appPath);
	        WindowsDriver<WebElement> driver;
	        try {
	            driver = new WindowsDriver<WebElement>(new URL(winAppDriverUrl), appCapabilities);
	        } catch (MalformedURLException e) {
	            e.printStackTrace();
	            return;
	        }
		
		
	        
			SigninPage.GUISignin(driver);
			SigninPage.SigninHelp(driver);
			SigninPage.Helpdrive(driver);
		    SigninPage.signin(driver);
		   //SigninPage.ExitButton(driver);
		    PatientListFun.signout(driver);
		    Thread.sleep(8000);
		    GUITitle.Addfield(driver);
			GUITitle.SideMenu(driver);
			GUITitle.demotitle(driver);
			GUITitle.FrontMenu(driver);
			GUITitle.Contactdetails(driver);
			PatientListFun.Browse(driver);
			PatientListFun.FirstName(driver);
			//PatientListFun.MiddleName(driver);
			//PatientListFun.LastName(driver);		
			PatientListFun.DateofBirth(driver);	
			PatientListFun.BloodGroup(driver);	
			PatientListFun.Gender(driver);
			PatientListFun.PatientSize(driver);
			PatientListFun.Weight(driver);
			PatientListFun.Nationality(driver);
			PatientListFun.LanguagesKnow(driver);
			PatientListFun.IDtype(driver);
			PatientListFun.IDNumber(driver);
			PatientListFun.Remarks(driver);
			CareTakerDetails.CaretakerData(driver);
			PatientListFun.Save(driver);
			
		    
		//DefaultErrormessage.defaultErrorMessage(driver);
		//PatientListFunCommon.errormessage(driver);
			
			
			

	}

}
