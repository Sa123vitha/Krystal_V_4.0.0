package com.krystal.project;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.windows.WindowsDriver;

public class WarningMesages {
	
	 WindowsDriver<WebElement> driver;
	 Actions act;
	
	public  void callDriver(WindowsDriver<WebElement> driver1) {
		driver = driver1;
		act = new Actions(driver);
	}
	
	
	 boolean bool = false;// to validate lss than 1 ex =0.9
	public  boolean warnmsg(WebElement warntext) {
		char Firstletter = 0,Secondletter = 0;
		if(warntext.getText().length()>=1) 
		 Firstletter = warntext.getText().charAt(0);
		 if(warntext.getText().length()>1)
		 Secondletter = warntext.getText().charAt(1);
		 if (Firstletter=='0' && Secondletter=='.') 
			bool=true;
		return bool;
	}

	public  String oARNameWarnMessage(WindowsDriver<WebElement> driver, WebElement warntext) {
		String Message = "Right";
		String s = warntext.getText();
		char Fdigit = 0;
		try {
			if(s.length()!=0)
			Fdigit = s.charAt(0);
		} catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		int z = Fdigit;
	
		boolean OArnam =specialchar(warntext.getText());
		int Numcompare = 0;
		String sop = String.valueOf(Fdigit);
		try {
		 Numcompare = Integer.parseInt(sop);
		}catch(Exception e) {
			e.getMessage();
		}
		//System.out.println(Numcompare > 0 && Numcompare < 9);
		boolean OArnam12 = AnyspecialcharInStr(warntext.getText());

//OARNAME 
		
		if (warntext.getText().isEmpty()) {
			WebElement Targetwarnmsg = driver.findElement(By.xpath("//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelOARName\"]/Text[@Name=\"Input cannot be blank\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"]"));
			//System.out.println("OARANameTXT " + Targetwarnmsg.getText());
			Message=Targetwarnmsg.getText();
		} else

		if (OArnam == true || (Numcompare > 0 && Numcompare < 9))
		{
			WebElement Targetwarnmsg = driver.findElement(By.xpath("//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelOARName\"]/Text[@Name=\"Input must start with characters\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Input must start with characters\"]"));
		//	System.out.println("OARANameTXT  " + Targetwarnmsg.getText());
			Message=Targetwarnmsg.getText();
		
		} else if (OArnam12 == true) {
			WebElement OnlyAlphadigitspaceallwarnmsg = driver.findElement(By.xpath("//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelOARName\"]/Text[@Name=\"Only alphabets,digits,space allowed\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Only alphabets,digits,space allowed\"]"));
			//System.out.println("OARANameTXT " + OnlyAlphadigitspaceallwarnmsg.getText());
			Message=OnlyAlphadigitspaceallwarnmsg.getText();
		} else 
			if (warntext.getText().length() < 3 && (z >= 65 || z <= 122)) {
			WebElement Threechar = driver.findElement(By.xpath("//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelOARName\"]/Text[@Name=\"Input must have atleast 3 characters\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Input must have atleast 3 characters\"]"));
		//	System.out.println("OARANameTXT " + Threechar.getText());
			Message=Threechar.getText();
		}
		return Message;
	}
	
	
	public  boolean specialchar(String val) {
		int count = 0;
		String s = val;
		char st = 0;
		boolean B = false;
		for (int i = 0; i < s.length(); i++) {

			if (!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i))
					&& !Character.isWhitespace(s.charAt(i))) {
//	               System.out.println(s.charAt(i));
//	               System.out.println(!Character.isDigit(s.charAt(i)));
				if (i == 0) {
					st = s.charAt(i);
					B = true;
				}
				count++;
			}
		} // if (count == 0)
			// System.out.println("No Special Characters found.");
		// else

		// System.out.println("String has Special Characters\n" + count + " " + "Special
		// Characters found.");
		return B;

	}
	
	public static boolean AnyspecialcharInStr(String val) {
		int count = 0;
		String s = val;
		char st = 0;
		boolean B = false;
		for (int i = 0; i < s.length(); i++) {

			// Checking the character for not being a
			// letter,digit or space
			if (!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i))
					&& !Character.isWhitespace(s.charAt(i))) {
//	               System.out.println(s.charAt(i));
//	               System.out.println(!Character.isDigit(s.charAt(i)));
				if (i > 0) {
					st = s.charAt(i);
					B = true;
				}
				count++;
			}
		}

		// if (count == 0)

		// Display the print statement
		// System.out.println( "No Special Characters found.");
		// else

		// Special character/s found then
		// Display the print statement
		// System.out.println("String has Special Characters\n" + count + " " + "Special
		// Characters found.");
		return B;

	}
	
	
	public  boolean isNumeric(String string) {
		int intValue;
		boolean B = false;
		// System.out.println(String.format("Parsing string: \"%s\"", string));

		if (string == null || string.equals("")) {
			// System.out.println("String cannot be parsed, it is null or empty.");

			if (string.length() != 0) {
				return true;
			} else
				return false;
		}

		try {
			intValue = Integer.parseInt(string);

		} catch (NumberFormatException e) {
			B = true;
		}
		return B;
	}
	
	
	public  String OARMINMessage(WindowsDriver<WebElement> driver, WebElement warntext, String Value,String Value1) {
		String Message = "Right";
		boolean TOCHECKNUMIN = isNumeric(Value1);
		int OARMIN = Integer.parseInt(Value);
		int OARMAX = Integer.parseInt(Value1);
	// OARMINTXT
	if (TOCHECKNUMIN) {
			WebElement ONA = driver.findElement(By.xpath("//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelOARMinDose\"]/Text[@Name=\"Only numbers are allowed\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Only numbers are allowed\"]"));
			//System.out.println("OARCMINTXT " + ONA.getText());	
			Message=ONA.getText();
		}else if (bool) {
			WebElement ans = driver.findElement(By.xpath("//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelOARMinDose\"]/Text[@Name=\"Input is less than Min Value 1\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Input is less than Min Value 1\"]"));
			
			//System.out.println("TOCHECKNUMAX1  " + ans.getText());
			Message=ans.getText();
			bool=false;
		}
		else 
			if (warntext.getText().isEmpty()) {
			WebElement OARCMINTXTwarnmsg = driver.findElement(By.xpath("//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelOARMinDose\"]/Text[@Name=\"Input cannot be blank\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Input cannot be blank\"]"));
			//System.out.println("OARCMINTXT  " + OARCMINTXTwarnmsg.getText());
			Message=OARCMINTXTwarnmsg.getText();
		} else
			if (warntext.getText().length() > 4 && !warntext.getText().equals("10000") && OARMIN < OARMAX) {
			WebElement IGTM = driver.findElement(By.xpath("//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelOARMinDose\"]/Text[@Name=\"Input is greater than max value 10000\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Input is greater than max value 10000\"]"));
			//System.out.println("OARCMINTXT  " + IGTM.getText());
			Message=IGTM.getText();
		}

		else if ( OARMIN>OARMAX) {

			WebElement GTOLT = driver.findElement(By.xpath(
					"//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelOARMinDose\"]/Text[@Name=\"Minimum Dose cannot be greater than Maximum Dose\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Minimum Dose cannot be greater than Maximum Dose\"]"));
			//System.out.println("OARCMINTXT  " + GTOLT.getText());
			WebElement GTOLTM = driver.findElement(By.xpath(
					"//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelOARMaxDose\"]/Text[@Name=\"Maximum Dose cannot be less than Minimum Dose\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Maximum Dose cannot be less than Minimum Dose\"]"));
			//System.out.println("TOCHECKNUMAX1  " + GTOLTM.getText());
			Message=GTOLT.getText()+GTOLTM.getText();
		}
		else if ( OARMIN==OARMAX) {

			WebElement GTOLT = driver.findElement(By.xpath(
					"//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelOARMinDose\"]/Text[@Name=\"Minimum Dose cannot be equal to Maximum Dose\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Minimum Dose cannot be equal to Maximum Dose\"]"));
			//System.out.println("OARCMINTXT  " + GTOLT.getText());
			WebElement GTOLTM = driver.findElement(By.xpath(
					"//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelOARMaxDose\"]/Text[@Name=\"Maximum Dose cannot be equal to Minimum Dose\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Maximum Dose cannot be equal to Minimum Dose\"]"));
			//System.out.println("TOCHECKNUMAX1  " + GTOLTM.getText());
			Message=GTOLT.getText()+GTOLTM.getText();
		}
	return Message;

	}
	

	public  String OARMINfunMessage(WindowsDriver<WebElement> driver, WebElement warntext,String Value1) {
		String Message = "Right";
		boolean TOCHECKNUMIN = isNumeric(Value1);	
		warnmsg(warntext);
	// OARMINTXT
	if (TOCHECKNUMIN) {
			WebElement ONA = driver.findElement(By.xpath("//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelOARMinDose\"]/Text[@Name=\"Only numbers are allowed\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Only numbers are allowed\"]"));
			//System.out.println("OARCMINTXT " + ONA.getText());	
			Message=ONA.getText();
		} else 
			if (warntext.getText().isEmpty()) {
			WebElement OARCMINTXTwarnmsg = driver.findElement(By.xpath("//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelOARMinDose\"]/Text[@Name=\"Input cannot be blank\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Input cannot be blank\"]"));
			//System.out.println("OARCMINTXT  " + OARCMINTXTwarnmsg.getText());
			Message=OARCMINTXTwarnmsg.getText();
		} else if (bool) {
			WebElement ans = driver.findElement(By.xpath("//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelOARMinDose\"]/Text[@Name=\"Input is less than Min Value 1\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Input is less than Min Value 1\"]"));
			
			//System.out.println("TOCHECKNUMAX1  " + ans.getText());
			Message=ans.getText();
			bool=false;
		}
		else
			if (warntext.getText().length() > 4 && !warntext.getText().equals("10000")) {
			WebElement IGTM = driver.findElement(By.xpath("//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelOARMinDose\"]/Text[@Name=\"Input is greater than max value 10000\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Input is greater than max value 10000\"]"));
			//System.out.println("OARCMINTXT  " + IGTM.getText());
			Message=IGTM.getText();
		}
			else
				if (warntext.getText().length() > 4 && !warntext.getText().equals("10000")) {
				WebElement IGTM = driver.findElement(By.xpath("//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelOARMinDose\"]/Text[@Name=\"Input is greater than max value 10000\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Input is greater than max value 10000\"]"));
				//System.out.println("OARCMINTXT  " + IGTM.getText());
				Message=IGTM.getText();
			}
	return Message;}
	
	
	
	public  String OARMAXMessage(WindowsDriver<WebElement> driver, WebElement warntext, String Value,String Value1) {
		String Message = "Right";
		// Method.textfield(driver1, OARCMAXTXT, " ",OARCMAXTXT.getText());
		warnmsg(warntext);
		boolean TOCHECKNUMAX1 = isNumeric(Value1);
		int OARMIN = Integer.parseInt(Value);
		int OARMAX = Integer.parseInt(Value1);
    //OARMAXTXT 
		if (TOCHECKNUMAX1) {
			WebElement Max = driver.findElement(By.xpath(
					"//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelOARMaxDose\"]/Text[@Name=\"Only numbers are allowed\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Only numbers are allowed\"]"));
			//System.out.println("TOCHECKNUMAX1  " + Max.getText());
			Message=Max.getText();
		} else if (bool) {
			WebElement ans = driver.findElement(By.xpath("//Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelOARMaxDose\"]/Text[@Name=\"Input is less than Min Value 1\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Input is less than Min Value 1\"]"));
			
			//System.out.println("TOCHECKNUMAX1  " + ans.getText());
			Message=ans.getText();
			bool=false;
		}else if (warntext.getText().isEmpty()) {
			WebElement ans = driver.findElement(By.xpath(
					"//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelOARMaxDose\"]/Text[@Name=\"Input cannot be blank\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Input cannot be blank\"]"));
			//System.out.println("TOCHECKNUMAX1  " + ans.getText());
			Message=ans.getText();
		} else if (warntext.getText().length() > 5 && !warntext.getText().equals("10000")&& OARMAX>OARMIN) {
			WebElement abc = driver.findElement(By.xpath(
					"//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelOARMaxDose\"]/Text[@Name=\"Input is greater than max value 10000\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Input is greater than max value 10000\"]"));
			//System.out.println("TOCHECKNUMAX1  " + abc.getText());
			Message=abc.getText();
		} else if (OARMIN>OARMAX) {
			WebElement GTOLT = driver.findElement(By.xpath(
					"//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelOARMaxDose\"]/Text[@Name=\"Maximum Dose cannot be less than Minimum Dose\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Maximum Dose cannot be less than Minimum Dose\"]"));
			//System.out.println("TOCHECKNUMAX1  " + GTOLT.getText());
			WebElement MDGTOLT1 = driver.findElement(By.xpath(
					"//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelOARMinDose\"]/Text[@Name=\"Minimum Dose cannot be greater than Maximum Dose\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Minimum Dose cannot be greater than Maximum Dose\"]"));
		//	System.out.println("OARCMINTXT  " + MDGTOLT1.getText());
			Message=GTOLT.getText()+MDGTOLT1.getText();
		}
		return Message;
	}

	public  String OARMAXfUNMessage(WindowsDriver<WebElement> driver, WebElement warntext,String Value1) {
		String Message = "Right";
		boolean TOCHECKNUMAX1 =isNumeric(Value1);	
		warnmsg(warntext);
	// OARMaxTXT
	if (TOCHECKNUMAX1) {
		WebElement Max = driver.findElement(By.xpath(
				"//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelOARMaxDose\"]/Text[@Name=\"Only numbers are allowed\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Only numbers are allowed\"]"));
		//System.out.println("TOCHECKNUMAX1  " + Max.getText());
		Message=Max.getText();
	} else if (warntext.getText().isEmpty()) {
		WebElement ans = driver.findElement(By.xpath(
				"//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelOARMaxDose\"]/Text[@Name=\"Input cannot be blank\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Input cannot be blank\"]"));
		//System.out.println("TOCHECKNUMAX1  " + ans.getText());
		Message=ans.getText();
	}else if (bool) {
		WebElement ans = driver.findElement(By.xpath("//Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelOARMaxDose\"]/Text[@Name=\"Input is less than Min Value 1\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Input is less than Min Value 1\"]"));
				
		//System.out.println("TOCHECKNUMAX1  " + ans.getText());
		Message=ans.getText();
		bool=false;
	} 
	else if (warntext.getText().length() > 4 && !warntext.getText().equals("10000")) {
		WebElement abc = driver.findElement(By.xpath(
				"//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelOARMaxDose\"]/Text[@Name=\"Input is greater than max value 10000\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Input is greater than max value 10000\"]"));
		//System.out.println("TOCHECKNUMAX1  " + abc.getText());
		Message=abc.getText();
	}
	return Message;
	}
	
	
	
	

	public  String TargetDose(WindowsDriver<WebElement> driver, WebElement warntext) {
		
		warnmsg(warntext);
		String Message = "Right" ;
		if (warntext.getText().isEmpty()) {
			WebElement Targetwarnmsg = driver.findElement(By.xpath("//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelTotalDose\"]/Text[@Name=\"Input cannot be blank\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"]"));
		//	System.out.println("TotalDose " + Targetwarnmsg.getText());
		 Message = Targetwarnmsg.getText();
		} else 
			if (warntext.getText().length() > 4 && (!warntext.getText().equalsIgnoreCase("10000"))) {
			WebElement Targetwarnmsg = driver.findElement(By.xpath("//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelTotalDose\"]/Text[@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"]"));
			//System.out.println("TotalDose" + Targetwarnmsg.getText());
			 Message = Targetwarnmsg.getText();
		}
			else 
				if(bool) 
				{
				WebElement Targetwarnmsg = driver.findElement(By.xpath("//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelTotalDose\"]/Text[@Name='Range:[1 to 10000]'][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"]"));
				//System.out.println("TotalDose" + Targetwarnmsg.getText());
				 Message = Targetwarnmsg.getText();
				 bool=false;
			}

	return Message;
	}
	
	
	
	public  String MInDose(WindowsDriver<WebElement> driver, WebElement warntext) {
		warnmsg(warntext);
		String Message = "Right";
		if (warntext.getText().isEmpty()) {
			WebElement MinDosewarnmsg = driver.findElement(By.xpath(
					"//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelMinDose\"]/Text[@Name=\"Input cannot be blank\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"]"));
			//System.out.println("MinDose  " + MinDosewarnmsg.getText());
			 Message = MinDosewarnmsg.getText();
		} else if (warntext.getText().length() > 4 && (!warntext.getText().equalsIgnoreCase("10000"))) {
			WebElement MinDosewarnmsg = driver.findElement(By.xpath(
					"//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelMinDose\"]/Text[@Name='Range:[1 to 10000]'][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"]"));
		//	System.out.println("MinDose  " + MinDosewarnmsg.getText());
			 Message = MinDosewarnmsg.getText();
		}else if(bool) {
			WebElement MinDosewarnmsg = driver.findElement(By.xpath(
					"//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelMinDose\"]/Text[@Name='Range:[1 to 10000]'][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"]"));
		//	System.out.println("MinDose  " + MinDosewarnmsg.getText());
			 Message = MinDosewarnmsg.getText();
			 bool=false;
		}
		return Message;
	}

	
	
	public  String MaxDose(WebElement warntext, WebElement mintxt, WindowsDriver<WebElement> driver) {
		String Message = "Right";
		warnmsg(warntext);
		
		//System.out.println(!warntext.getText().equalsIgnoreCase("10000"));
		if (warntext.getText().isEmpty()) {
			WebElement MaxDosewarnmsg = driver.findElement(By.xpath(
					"//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelMaxDose\"]/Text[@Name=\"Input cannot be blank\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"]"));
			//System.out.println("Maxdose " + MaxDosewarnmsg.getText());
			 Message = MaxDosewarnmsg.getText();
		} else if (warntext.getText().length() > 4 && (!warntext.getText().equalsIgnoreCase("10000"))) {
			WebElement MaxDosewarnmsg = driver.findElement(By.xpath(
					"//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelMaxDose\"]/Text[@Name='Range:[1 to 10000]'][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"]"));
			//System.out.println("Maxdose  " + MaxDosewarnmsg.getText());
			 Message = MaxDosewarnmsg.getText();
		}else if(bool) {
			WebElement MaxDosewarnmsg = driver.findElement(By.xpath(
					"//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelMaxDose\"]/Text[@Name='Range:[1 to 10000]'][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"]"));
			//System.out.println("Maxdose  " + MaxDosewarnmsg.getText());
			 Message = MaxDosewarnmsg.getText();
			 bool=false;
		}else if(warntext.getText().equals(mintxt.getText())){
			WebElement Min_cannot_be_equal_to_Max = driver.findElement(By.xpath(
					"//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelMinDose\"]/Text[@Name=\"Min cannot be equal to Max\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Min cannot be equal to Max\"]"));
			System.out.println("MinDose  " + Min_cannot_be_equal_to_Max.getText());
			
			WebElement Max_cannot_be_equal_to_Min = driver.findElement(By.xpath(
					"//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelMaxDose\"]/Text[@Name=\"Max cannot be equal to Min\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Max cannot be equal to Min\"]"));
			System.out.println("MaxDose  " + Max_cannot_be_equal_to_Min.getText());
			
			Message	=Min_cannot_be_equal_to_Max.getText()+ Max_cannot_be_equal_to_Min.getText();
			
			}
		
		return Message;
	}
	
	public  String MINandMAXMessage(WindowsDriver<WebElement> driver,WebElement MIN,WebElement MAX) {
		String Message = "Right";
		// Method.textfield(driver1, OARCMAXTXT, " ",OARCMAXTXT.getText());
		int OARMIN = Integer.parseInt(MIN.getText());
		int OARMAX = Integer.parseInt(MAX.getText());
	
		if (OARMIN>OARMAX) {
			WebElement GTOLT = driver.findElement(By.xpath("//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelMinDose\"]/Text[@Name=\"Min cannot be greater than Max\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Min cannot be greater than Max\"]"));
			//System.out.println("TOCHECKNUMAX1  " + GTOLT.getText());
			WebElement MDGTOLT1 = driver.findElement(By.xpath(
					"//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelMaxDose\"]/Text[@Name=\"Max cannot be lesser than Min\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Max cannot be lesser than Min\"]"));
		//	System.out.println("OARCMINTXT  " + MDGTOLT1.getText());
			Message=GTOLT.getText()+MDGTOLT1.getText();
		}
		
		return Message;
	}
		
		
		
		
		
	public  String MaxDose(WindowsDriver<WebElement> driver, WebElement warntext) {
		warnmsg(warntext);
		String Message = "Right";
		//System.out.println(!warntext.getText().equalsIgnoreCase("10000"));
		if (warntext.getText().isEmpty()) {
			WebElement MaxDosewarnmsg = driver.findElement(By.xpath(
					"//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelMaxDose\"]/Text[@Name=\"Input cannot be blank\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"]"));
			//System.out.println("Maxdose " + MaxDosewarnmsg.getText());
			 Message = MaxDosewarnmsg.getText();
		} else if (warntext.getText().length() > 4 && (!warntext.getText().equalsIgnoreCase("10000"))) {
			WebElement MaxDosewarnmsg = driver.findElement(By.xpath(
					"//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelMaxDose\"]/Text[@Name='Range:[1 to 10000]'][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"]"));
			//System.out.println("Maxdose  " + MaxDosewarnmsg.getText());
			 Message = MaxDosewarnmsg.getText();
		}else if(bool) {
			WebElement MaxDosewarnmsg = driver.findElement(By.xpath(
					"//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelMaxDose\"]/Text[@Name='Range:[1 to 10000]'][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"]"));
			//System.out.println("Maxdose  " + MaxDosewarnmsg.getText());
			 Message = MaxDosewarnmsg.getText();
			 bool=false;
		}
		
		return Message;
	}


	
	public  String NumberOfFraction(WindowsDriver<WebElement> driver, WebElement warntext) {
		String Message = "Right";
	
		if (warntext.getText().isEmpty()) {
			WebElement No_Of_Frctnswarnmsg = driver.findElement(By.xpath(
					"//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelNumberOfFractions\"]/Text[@Name=\"Input cannot be blank\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"]"));
			//System.out.println("MinDose" + No_Of_Frctnswarnmsg.getText());
			 Message = No_Of_Frctnswarnmsg.getText();
		} else if (warntext.getText().length() > 2 && (!warntext.getText().equalsIgnoreCase("100"))) {
			WebElement No_Of_Frctnswarnmsg = driver.findElement(By.xpath(
					"//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelNumberOfFractions\"]/Text[@Name='Range:[1 to 100]'][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"]"));
			//System.out.println("MinDose" + No_Of_Frctnswarnmsg.getText());
			 Message = No_Of_Frctnswarnmsg.getText();
		}
		
		return Message;
	}
	
	public  String IGRTcycle(WindowsDriver<WebElement> driver, WebElement warntext) {
		String Message = "Right";
		if (warntext.getText().isEmpty()) {
			WebElement IGRTcyclewarnmsg = driver.findElement(By.xpath("//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelIGRTCycle\"]/Text[@Name=\"Input cannot be blank\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Input cannot be blank\"]"));
			//System.out.println("ReviewCycle  " + IGRTcyclewarnmsg.getText());	
			 Message = IGRTcyclewarnmsg.getText();
		} else if (warntext.getText().length() > 2) {
			WebElement IGRTcyclewarnmsg = driver.findElement(By.xpath("//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelIGRTCycle\"]/Text[@Name='Range:[1 to 99]'][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"]"));
			//System.out.println("ReviewCycle  " + IGRTcyclewarnmsg.getText());
			 Message = IGRTcyclewarnmsg.getText();
		}
		return Message;
	}
	
	
	public  String Reviewcycle(WindowsDriver<WebElement> driver, WebElement warntext) {
		String Message = "Right";
	
		if (warntext.getText().isEmpty()) {
			WebElement Reviewcyclewarnmsg = driver.findElement(By.xpath(
					"//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelReviewCycle\"]/Text[@Name=\"Input cannot be blank\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"]"));
			//System.out.println("ReviewCycle  " + Reviewcyclewarnmsg.getText());
			Message = Reviewcyclewarnmsg.getText();
		} else if (warntext.getText().length() > 2) {
			WebElement Reviewcyclewarnmsg = driver.findElement(By.xpath(
					"//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelReviewCycle\"]/Text[@Name='Range:[1 to 99]'][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"]"));
			//System.out.println("ReviewCycle  " + Reviewcyclewarnmsg.getText());
			Message = Reviewcyclewarnmsg.getText();
			
		}
		return Message;
	}

	
	
	public  String CBCcycle(WindowsDriver<WebElement> driver, WebElement warntext) {
		String Message = "Right";
		
		if (warntext.getText().isEmpty()) {
			WebElement CBCcyclewarnmsg = driver.findElement(By.xpath(
					"//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelCBCCycle\"]/Text[@Name=\"Input cannot be blank\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"]"));
		//	System.out.println("CBCCycle " + CBCcyclewarnmsg.getText());
			Message = CBCcyclewarnmsg.getText();
		} else if (warntext.getText().length() > 2) {
			WebElement CBCcyclewarnmsg = driver.findElement(By.xpath(
					"//Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelCBCCycle\"]/Text[@Name='Range:[1 to 99]'][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"]"));
		//	System.out.println("CBCCycle  " + CBCcyclewarnmsg.getText());
			Message = CBCcyclewarnmsg.getText();
		}
		
		return Message;

	}
	
	
	public  String PatientWeight(WindowsDriver<WebElement> driver, WebElement warntext,Actions act) {
		String Message = "Right";
		if (warntext.getText().isEmpty()) {
			WebElement PatientWeight = driver.findElement(By.xpath("//Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection2View\"]/Edit[@AutomationId=\"TextBoxViewModelPatientWeight\"]/Text[@Name=\"Input cannot be blank\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Input cannot be blank\"]"));
				//	System.out.println("CBCCycle " + CBCcyclewarnmsg.getText());
		//	WebElement PatientWeight = driver.findElement(By.name("Input cannot be blank"));
			Message = PatientWeight.getText();
		}
		return Message;
	}
	
		public  String PatientHeight(WindowsDriver<WebElement> driver, WebElement warntext,Actions act) {
			String Message = "Right";
			if (warntext.getText().isEmpty()) {
				WebElement PatientHeight = driver.findElement(By.xpath("//Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection2View\"]/Edit[@AutomationId=\"TextBoxViewModelPatientHeight\"]/Text[@Name=\"Input cannot be blank\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Input cannot be blank\"]"));
						//	System.out.println("CBCCycle " + CBCcyclewarnmsg.getText());
		//WebElement PatientHeight = driver.findElement(By.name("Input cannot be blank"));
				Message = PatientHeight.getText();
		}
			return Message;
	
		}
	
		public  String AnyFrequency(WindowsDriver<WebElement> driver, WebElement warntext,Actions act) {
			String Message = "Right";
			if (warntext.getText().isEmpty()) {
			//	WebElement AnyFrequency = driver.findElement(By.xpath("//Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection2View\"]/Text[@Name=\"Select Any Frequency\"]"));
				//	System.out.println("CBCCycle " + CBCcyclewarnmsg.getText());
				WebElement AnyFrequency = driver.findElement(By.name("Select any frequency"));
				Message = AnyFrequency.getText();
		}
			return Message;
	
		}	
	
		public  String pleaseSelectaChemoType(WebElement warntext,Actions act,WindowsDriver<WebElement> driver) throws InterruptedException {
			String Message = "Right";
	
			if (warntext.getText().isEmpty()) {
				act.moveToElement(warntext).build().perform();
				act.moveByOffset(-80, 30).build().perform();
				Thread.sleep(1000);
				WebElement pleaseSelectChemoType = driver.findElement(By.name("Select any chemotherapy type"));
				Message = pleaseSelectChemoType.getText();
			}
			return Message;	
}	

		
			public  String Cycles(WebDriver driver, WebElement warntext,Actions act) {
				String Message = "Right";
				WebElement Cycles = driver.findElement(By.xpath("//Custom[@ClassName=\"PrescriptionSection2View\"]/Edit[@AutomationId=\"TextBoxViewModelCycles\"]/Text[@Name=\"Input cannot be blank\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Input cannot be blank\"]"));
			//	WebElement Cycles = driver.findElement(By.name("Input cannot be blank"));
				Message = Cycles.getText();
				return Message;
			}
			
		public  String Anysite(WindowsDriver<WebElement> driver, WebElement warntext,Actions act) throws InterruptedException {
			String Message = "Right";
			if (warntext.getText().isEmpty()) {
				act.moveToElement(warntext).build().perform();
				act.moveByOffset(-80, 30).build().perform();
				Thread.sleep(1500);
				WebElement SelectSite = driver.findElement(By.name("Select any site"));
				//	System.out.println("CBCCycle " + CBCcyclewarnmsg.getText());
				Message = SelectSite.getText();
		}
			return Message;
	
		}	
		
		public  String Anydrug(WindowsDriver<WebElement> driver, WebElement warntext,Actions act) throws InterruptedException {
			String Message = "Right";
			if ((warntext.getText().isEmpty())) {
				act.moveToElement(warntext).build().perform();
				act.moveByOffset(-80, 30).build().perform();
				Thread.sleep(900);
				WebElement SelectSite = driver.findElement(By.name("Select any drug"));
				//	System.out.println("CBCCycle " + CBCcyclewarnmsg.getText());
				Message = SelectSite.getText();
		}
			return Message;
	
		}
		
		public  String AnyDrugform(WindowsDriver<WebElement> driver, WebElement warntext,Actions act) throws InterruptedException {
			String Message = "Right";
			if ((warntext.getText().isEmpty())) {
				act.moveToElement(warntext).build().perform();
				act.moveByOffset(-80, 30).build().perform();
				Thread.sleep(900);
				WebElement SelectSite = driver.findElement(By.name("Select a drug form"));
				//	System.out.println("CBCCycle " + CBCcyclewarnmsg.getText());
				Message = SelectSite.getText();
		}
			return Message;
	
		}
		
		public  String Anyselectdrugdose(WindowsDriver<WebElement> driver, WebElement warntext,Actions act) throws InterruptedException {
			String Message = "Right";
			if ((warntext.getText().isEmpty())) {
				act.moveToElement(warntext).build().perform();
				act.moveByOffset(-80, 30).build().perform();
				Thread.sleep(900);
				WebElement SelectSite = driver.findElement(By.name("Select any drug dose"));
				Message = SelectSite.getText();
		}
			return Message;
	
		}
		public  String SelectanyDay(WindowsDriver<WebElement> driver, WebElement warntext,Actions act) {
			String Message = "Right";
			WebElement SelectAnyday = driver.findElement(By.name("Select any day"));
		
				Message = SelectAnyday.getText();
		
			return Message;
	
		}	
		
		public  String Symptoms(WindowsDriver<WebElement> driver, WebElement warntext,Actions act) {
			String Message = "Right";
			WebElement Symptom = driver.findElement(By.xpath("//Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection2View\"]/Pane[@AutomationId=\"GeneralAdditionalMedicationsScrolviewer\"]/Edit[@AutomationId=\"TextBoxViewModelSymptoms\"]/Text[@Name=\"Input cannot be blank\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Input cannot be blank\"]"));
				Message = Symptom.getText();
		
			return Message;
	
		}
		
		public  String Every( WebElement warntext,Actions act,WindowsDriver<WebElement> driver) {
			String Message = "Right";
			if ((warntext.getText().isEmpty())) {
			WebElement Every = driver.findElement(By.xpath("//Custom[@ClassName=\"PrescriptionSection2View\"]/Edit[@AutomationId=\"TextBoxViewModelEvery\"]/Text[@Name=\"Input cannot be blank\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Input cannot be blank\"]"));
			//	WebElement Every = driver.findElement(By.name("Input cannot be blank"));
				Message = Every.getText();
		
			}else if (!(warntext.getText().isEmpty())) {
			//WebElement Every = driver.findElement(By.xpath("//Custom[@ClassName=\"PrescriptionSection2View\"]/Edit[@AutomationId=\"TextBoxViewModelEvery\"]/Text[@Name='Range:[1 to 28]'[@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Range:[1 to 28\"]"));
			WebElement Every = driver.findElement(By.name("Range:[1 to 28]"));
			Message = Every.getText();
			}
			
			return Message;
		}
		
		public  String IsoTimewarn(WebElement IsotimeE,int time,Actions act) throws InterruptedException {
			act=new Actions(driver);
			String Message = "Right";
			String s = IsotimeE.getText();
			if ((IsotimeE.getText().isEmpty())/* && !Character.isDigit(s.charAt(0))*/) {
				WebElement Isotime = driver.findElement(By.name("Only whole and decimal numbers allowed"));
				act.moveToElement(Isotime).perform();
					Thread.sleep(2000);
					Message = Isotime.getText();
					System.out.println(Isotime.getText());
		
			}else
			{
				WebElement Isotime = driver.findElement(By.name("Range:[0.1 to "+time+"]"));
				act.moveToElement(Isotime).perform();
					Thread.sleep(2000);
					Message = Isotime.getText();
					System.out.println(Isotime.getText());
			}
			return Message;
			
	
		}	
		public  String createplanWarnmsgs(WebElement Element,String range,String Machinename,Actions act) throws InterruptedException {
			act=new Actions(driver);
			String Message = "Right";
		boolean bool = !(Element.getText().isEmpty());
			if(Machinename.equals("BHABHATRON-II MLC v2_C03")) {
			if (!(Element.getText().isEmpty())&& range.equals("X1jaw")) {
				Thread.sleep(3000);
				WebElement Isotime = driver.findElement(By.name("Range:[-10 to 6]"));
				act.moveToElement(Isotime).perform();
					Message = Isotime.getText();
				System.out.println(Isotime.getText());
		
			}else
				if (!(Element.getText().isEmpty())&& range.equals("X2jaw")) {
					Thread.sleep(3000);
					WebElement Isotime = driver.findElement(By.name("Range:[-6 to 10]"));
					act.moveToElement(Isotime).perform();
						
						Message = Isotime.getText();
						System.out.println(Isotime.getText());
						
						
						
				}else
					if (!(Element.getText().isEmpty())&& range.equals("Y1jaw")) {
						Thread.sleep(3000);
						WebElement Isotime = driver.findElement(By.name("Range:[-14 to 0]"));
						act.moveToElement(Isotime).perform();
							
							Message = Isotime.getText();
							System.out.println(Isotime.getText());
					}else
						if (!(Element.getText().isEmpty())&& range.equals("Y2jaw")) {
							Thread.sleep(3000);
							WebElement Isotime = driver.findElement(By.name("Range:[0 to 14]"));
						act.moveToElement(Isotime).perform();
						
							Message = Isotime.getText();
							System.out.println(Isotime.getText());
						}
							
							else
								if (!(Element.getText().isEmpty())&& range.equals("Xjaw")) {
									Thread.sleep(3000);
									WebElement Isotime = driver.findElement(By.name("Range:[0 to 20]"));
									act.moveToElement(Isotime).perform();
										
										Message = Isotime.getText();
										System.out.println(Isotime.getText());
								}else if (!(Element.getText().isEmpty())&& range.equals("Yjaw")) {
									Thread.sleep(3000);
									WebElement Isotime = driver.findElement(By.name("Range:[0 to 28]"));
									act.moveToElement(Isotime).perform();
										
										Message = Isotime.getText();
										System.out.println(Isotime.getText());
								}
								else if (!(Element.getText().isEmpty())&& range.equals("Gantry")) {
									Thread.sleep(3000);
									WebElement Isotime = driver.findElement(By.name("Range:[0 to 359.9]"));
									act.moveToElement(Isotime).perform();
										
										Message = Isotime.getText();
										System.out.println(Isotime.getText());
								}else if (!(Element.getText().isEmpty())&& range.equals("Collimator")) {
									Thread.sleep(3000);
									WebElement Isotime = driver.findElement(By.name("Range is:[0-100],[260-0]"));//Range is:[0-100],[260-0]
									act.moveToElement(Isotime).perform();
										
										Message = Isotime.getText();
										System.out.println(Isotime.getText());
			                       }
								else if (!(Element.getText().isEmpty())&& range.equals("TTime")) {
									Thread.sleep(3000);
									WebElement Isotime = driver.findElement(By.name("Range:[0.1 to 20]"));
									act.moveToElement(Isotime).perform();
										
										Message = Isotime.getText();
										System.out.println(Isotime.getText());
			                       }
								else if (!(Element.getText().isEmpty())&& range.equals("Fractions")) {
									Thread.sleep(3000);
									WebElement Isotime = driver.findElement(By.name("Range:[1 to 100]"));
									act.moveToElement(Isotime).perform();
										
										Message = Isotime.getText();
										System.out.println(Isotime.getText());
			                       }
								else if (!(Element.getText().isEmpty())&& range.equals("Bolus")) {
									Thread.sleep(3000);
									WebElement Isotime = driver.findElement(By.name("Range:[0.1 to 10]"));//note add condition by considering length of string
									act.moveToElement(Isotime).perform();
										
										Message = Isotime.getText();
										System.out.println(Isotime.getText());
			                       }
			}
			return Message;
	}
		
		//Beam name already exists   "Input must not contain \ , '' , '"
		
		public  String BeamNamewarn (WebElement Element,String range,String Machinename,Actions act) throws InterruptedException {
			act=new Actions(driver);
			String Message = "Right";
		
		 if (!(Element.getText().isEmpty())&& range.equals("Beam")) {
			Thread.sleep(3000);
			WebElement Isotime = driver.findElement(By.name("Beam name already exists"));
			act.moveToElement(Isotime).perform();
				
				Message = Isotime.getText();
				System.out.println(Isotime.getText());
           }
		return Message;
		}
		
		
		public  String TemplateName (WebElement Element) throws InterruptedException {
			
			String Message = "Right";
		
			Message = Element.getText();
           
		return Message;
		}
		
		
		
		public  String Dropdown1(WebElement drop1, String[] A, int i, String DropdownName, ExtentTest test1,WebDriver driver,Actions act)
				throws InterruptedException {

			boolean a, a1 = drop1.isEnabled();
			if (a = drop1.isDisplayed()) {
				if (a1) {
					drop1.click();
					Thread.sleep(500);
					WebElement site = driver.findElement(By.name(A[i]));
					Thread.sleep(600);
					act.moveToElement(site).click().perform();
					if (drop1.getText().equals(site.getText()))
						test1.pass(drop1.getText() + "is  displayed in " + DropdownName + "dropdown");
					else
						test1.pass(drop1.getText() + "is not displayed in " + DropdownName + "dropdown");
				}
			}
			return A[i];
		}
	
		public  String Dropdown2(WebElement Dropdown, String  A, String DropdownName, ExtentTest test1,WebDriver driver,Actions act)
				throws InterruptedException {
		//	Thread.sleep(5000);
			
			if(Dropdown.isEnabled()) {
				Dropdown.click();
					Thread.sleep(100);
				WebElement site = driver.findElement(By.name(A));
					Thread.sleep(200);
					act.moveToElement(site).click().perform();
					if (Dropdown.getText().equals(site.getText()))
						test1.pass(Dropdown.getText() + "is  displayed in " + DropdownName + "dropdown");
					else
						test1.pass(Dropdown.getText() + "is not displayed in " + DropdownName + "dropdown");
			}
	System.out.println(Dropdown.getText() + "is  actual and " + DropdownName + " is expected dropdown");
			return A;
		}
		
		
}
		
		




//mincannotmac=Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelMinDose\"]/Text[@Name=\"Min cannot be equal to Max\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Min cannot be equal to Max\"]"));
//maxcannotbe qualmin=Custom[@ClassName=\"PrescriptionSection1View\"]/Edit[@AutomationId=\"TextBoxViewModelMaxDose\"]/Text[@Name=\"Max cannot be equal to Min\"][@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Max cannot be equal to Min\"]"));

//Custom[@ClassName=\"PrescriptionSection1View\"]/DataGrid[@AutomationId=\"Oardatagrid\"]/DataItem[@ClassName=\"DataGridRow\"][@Name=\"Presentation.UiElements.ViewModels.TableViewModel\"]/Custom[@ClassName=\"DataGridCell\"][starts-with(@Name,\"Item: Presentation.UiElements.ViewModels.TableViewModel, Column \")]"));