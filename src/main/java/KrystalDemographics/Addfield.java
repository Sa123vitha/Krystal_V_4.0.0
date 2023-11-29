package KrystalDemographics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.windows.WindowsDriver;

public class Addfield {
	static String ExceptedTitle="DEMOGRAPHICS";
	static String ExceptedPateintresult="Patient Menu";
	
	public static void add(WebElement AddPatient, String textdisplayed, int j) {
		// TODO Auto-generated method stub
		
		if (AddPatient.isDisplayed()) {
			System.out.println(textdisplayed+" "+j+ " Run Passed: Text field is displayed by default.");
		} else {
			System.out.println(textdisplayed+" "+j+ " Run Failed: Text field is not displayed by default.");
		}

		if (AddPatient.isEnabled()) {
			System.out.println(textdisplayed+" "+j+ " Run Passed: Text field is enabled by default.");
		} else {
			System.out.println(textdisplayed+" "+j+ " Run Failed: Text field is disabled by default.");
		}
		
		System.out.println("=========================================================================");
		
	}
	
	
	public static void titlename(String title)
	{
		// Test case 1 
		
		if(title.equals(ExceptedTitle))
		{
			System.out.println("Run Pass same as Excepted");
		}
		else
		{
			System.out.println("Run Fail:"+" "+"Actual is: " +title+" "+" Excepted is: " +ExceptedTitle);
		}
		// Test case 2
		if (!title.isEmpty()) {
            System.out.println("Run Pass: Page has a title");
        } else {
            System.out.println("Run Fail: Page does not have a title");
        }
		// Test case 3
		boolean SpecialCharacters = title.matches("[a-zA-Z0-9 ]*");
        if (SpecialCharacters) {
            System.out.println("Run Pass: Title does not contain special characters");
        } else {
            System.out.println("Run Fail: Title contains special characters");
        }
	}
	
	
	public static void productlogo(WebElement logo, String Text)
	{
		if (logo.isDisplayed()) {
			
			System.out.println("Run Pass->"+" : "+ Text +" is Displayed");
		} 
		else 
		{
			System.out.println("Run Fail->"+" : "+ Text +" is not Displayed");
		}
	}
	public static void PatientMenu(String Pateintresult)
	{

		if (Pateintresult.equals(ExceptedPateintresult))
		   {
			System.out.println("5. Run Passed: Patient Name displayed is correct");
			}
			else 
			{
			System.out.println("6. Run Failed: Patient Name displayed is incorrect");
		    }
	}
	
	public static void PateintMenulist(WebElement Menulist,String text, int j)
	{
		if (Menulist.isDisplayed()) {
			System.out.println(text+" "+j+ " Run Passed: Text is displayed by default.");
		} else {
			System.out.println(text+" "+j+ " Run Failed: Text  is not displayed by default.");
		}

		if (!Menulist.isEnabled()) {
			System.out.println(text+" "+j+ " Run Passed: Text field is not enabled by default.");
		} else {
			System.out.println(text+" "+j+ " Run Failed: Text field is enabled by default.");
		}
		
		System.out.println("*******************************************************************");
		
	}
	}
	

	

