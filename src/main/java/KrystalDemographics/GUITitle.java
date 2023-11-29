package KrystalDemographics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.appium.java_client.windows.WindowsDriver;

public class GUITitle {
	
	static int i=1;
	static int a=1;
	public static void demotitle(WebDriver driver) throws InterruptedException
	{ 
	
	
	// MENU TITLE
	WebElement Menu = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"NavigationTopBarView\"]/Button[@AutomationId=\"ToolTip\"]"));
	WebElement Signout = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"NavigationTopBarView\"]/Button[@ClassName=\"Button\"]"));
	WebElement Theme = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"NavigationTopBarView\"]/Button[@AutomationId=\"SearchMenuBuutton\"]"));
	WebElement Password = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"NavigationTopBarView\"]/Button[@AutomationId=\"SearchMenuButton\"]"));
	WebElement Titlename = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"NavigationTopBarView\"]/Text[@ClassName=\"Text\"][@Name=\"Demographics\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Demographics\"]"));
	WebElement Productlogo = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"NavigationTopBarView\"]/Image[@ClassName=\"Image\"]"));
	WebElement Patientlist = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"NavigationTopBarSubView\"]/Button[@ClassName=\"Button\"]"));
	System.out.println("=======================Title bar GUI cases==========================");
    Addfield.add(Signout,"Signout",i);i++;
	Addfield.add(Menu,"Menu",i);i++;
	Addfield.add(Theme,"Theme",i);i++;
	Addfield.add(Password,"Password",i);i++;
	Addfield.add(Titlename,"Titlename",i);i++;
	Addfield.add(Patientlist,"Patientlist",i);i++;
	Thread.sleep(2000);
	String title=Titlename.getText();
	Thread.sleep(2000);
	Addfield.titlename(title);
	Thread.sleep(2000);
	Addfield.productlogo(Productlogo,"Krystallogo");
	
	// Patient menu
	WebElement PatientMenu=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"SideMenuSubView\"]/Text[@ClassName=\"Text\"][@Name=\"Patient Menu\"]/Text[@Name=\"Patient Menu\"][@AutomationId=\"Label\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Patient Menu\"]"
));
	String ActualPateintresult=PatientMenu.getText();
	
	Addfield.PatientMenu(ActualPateintresult);
}
	public static void Addfield(WebDriver driver) throws InterruptedException
	{
		System.out.println("--------------------------------------------------------------------");
		System.out.println("To verify, Click on the Add Patient icon navigated to the Demographics screen");
		driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"NavigationTopBarSubView\"]/Button[@ClassName=\"Button\"]")).click();
		Thread.sleep(1000);
		WebElement Adddisplay=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"DemographicsMainView\"]/Custom[@ClassName=\"DemographicsSection1View\"]"));
		if (Adddisplay.isDisplayed()) {
			System.out.println("Run Pass: Navigated to Demographics screen");
		} else {
			System.out.println("Run Fail: Not Navigating to Demographics screen");
		}
	}
	public static void SideMenu(WebDriver driver)throws InterruptedException
	{
	    System.out.println("=======================PATIENT LIST GUI TESTCASES==========================");
		System.out.println("=======================Side Menu bar GUI cases==========================");
		WebElement AddPatient = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"NavigationTopBarSubView\"]/Button[@ClassName=\"Button\"]"));
		WebElement Demographics=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"SideMenuSubView\"]/Button[@ClassName=\"Button\"][@Name=\"DEMOGRAPHICS\"]"));
		WebElement Prescription=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"SideMenuSubView\"]/Button[@ClassName=\"Button\"][@Name=\"PRESCRIPTION\"]"));
		WebElement PlanAprroval=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"SideMenuSubView\"]/Button[@ClassName=\"Button\"][@Name=\"PLAN APPROVAL\"]"));
		WebElement Scheudling=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"SideMenuSubView\"]/Button[@ClassName=\"Button\"][@Name=\"SCHEDULING\"]"));
		WebElement Vitals=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"SideMenuSubView\"]/Button[@ClassName=\"Button\"][@Name=\"VITALS\"]"));
		WebElement LabReports=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"SideMenuSubView\"]/Button[@ClassName=\"Button\"][@Name=\"LAB REPORTS\"]"));
		WebElement TreatmentReview=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"SideMenuSubView\"]/Button[@ClassName=\"Button\"][@Name=\"TREATMENT REVIEW\"]"));
		Addfield.PateintMenulist(AddPatient,"AddPatient",i);i++;
	    Addfield.PateintMenulist(Demographics,"Demographics",i);i++;
	    Addfield.PateintMenulist(Prescription,"Prescription",i);i++;
	    Addfield.PateintMenulist(PlanAprroval,"PlanAprroval",i);i++;
	    Addfield.PateintMenulist(Scheudling,"Scheudling",i);i++;
	    Addfield.PateintMenulist(Vitals,"Vitals",i);i++;
	    Addfield.PateintMenulist(LabReports,"LabReports",i);i++;
	    Addfield.PateintMenulist(TreatmentReview,"TreatmentReview",i);i++;
	   
	}
	
	// Demographics GUI
	public static void FrontMenu(WebDriver driver)throws InterruptedException
	{
		// Actual Result 
		System.out.println("=======================Patient Table list GUI cases==========================");
		WebElement PBI=driver.findElement(By.name("PATIENT BASIC INFORMATION"));
	    WebElement FN=driver.findElement(By.name("First Name"));
	    WebElement MN=driver.findElement(By.name("Middle Name"));
	    WebElement LN=driver.findElement(By.name("Last Name"));
	    WebElement OID = driver.findElement(By.name("Other ID"));
	    WebElement DOB = driver.findElement(By.name("Date Of Birth"));
	    WebElement AG = driver.findElement(By.name("Age (years)"));
	    WebElement BG = driver.findElement(By.name("Blood Group"));
	    WebElement GEN = driver.findElement(By.name("Gender"));
	    WebElement ML = driver.findElement(By.name("Male"));
	    WebElement FL = driver.findElement(By.name("Female"));
	    WebElement OTH = driver.findElement(By.name("Others"));
	    WebElement PS = driver.findElement(By.name("Patient Size"));
	   // WebElement SP = driver.findElement(By.name("---Select Please---"));
	   // WebElement PT = driver.findElement(By.name("Pediatric"));
	   // WebElement SM = driver.findElement(By.name("Small"));
	  //  WebElement ME = driver.findElement(By.name("Medium"));
	  //  WebElement LA = driver.findElement(By.name("Large"));
	    WebElement PW = driver.findElement(By.name("Patient Weight (kg)"));
	    WebElement NT = driver.findElement(By.name("Nationality"));
	    WebElement LK = driver.findElement(By.name("Languages Known"));
	    WebElement ID = driver.findElement(By.name("ID Type"));
	    WebElement IDN = driver.findElement(By.name("ID Number"));
	    WebElement RM = driver.findElement(By.name("Remarks"));
	   
	 // Excepted Result 
	    String EPPBI="PATIENT BASIC INFORMATION";
	    String EFN="First Name";
	    String EMN="Middle Name";
	    String ELN="Last Name";
	    String EOID="Other ID";
	    String EDOB="Date Of Birth";
	    String EAG="Age (years)";
	    String EBG="Blood Group";
	    String EGEN="Gender";
	    String EML="Male";
	    String EFL="Female";
	    String EOTH="Others";
	    String EPS="Patient Size";
	    String EPW="Patient Weight (kg)";
	    String ENT="Nationality";
	    String ELK="Languages Known";
	    String EID="ID Type";
	    String EIDN="ID Number";
	    String ERM="Remarks";
	    
	    DemographicsGUI.Basicinformation(PBI,EPPBI,a);a++;
	    DemographicsGUI.Basicinformation(FN,EFN,a);a++; 
	    
	    DemographicsGUI.Basicinformation(MN,EMN,a);a++;
	    
	    DemographicsGUI.Basicinformation(LN,ELN,a);a++;
	    
	    DemographicsGUI.Basicinformation(OID,EOID,a);a++;
	    
	    DemographicsGUI.Basicinformation(DOB,EDOB,a);a++;
	    
	    DemographicsGUI.Basicinformation(AG,EAG,a);a++;
	    
	    DemographicsGUI.Basicinformation(BG,EBG,a);a++;
	    
	    DemographicsGUI.Basicinformation(GEN,EGEN,a);a++;
	    
	    DemographicsGUI.Basicinformation(ML,EML,a);a++;
	    
	    DemographicsGUI.Basicinformation(FL,EFL,a);a++;
	    
	    DemographicsGUI.Basicinformation(OTH,EOTH,a);a++;
	    
	    DemographicsGUI.Basicinformation(PS,EPS,a);a++;
	    
	    DemographicsGUI.Basicinformation(PW,EPW,a);a++;
	    
	    DemographicsGUI.Basicinformation(NT,ENT,a);a++;
	    
	    DemographicsGUI.Basicinformation(LK,ELK,a);a++;
	    
	    DemographicsGUI.Basicinformation(ID,EID,a);a++;
	    
	    DemographicsGUI.Basicinformation(IDN,EIDN,a);a++;
	    
	    DemographicsGUI.Basicinformation(RM,ERM,a);a++;
	    
	    
	    
	}
	public static void Contactdetails(WebDriver driver)throws InterruptedException
	{
		System.out.println("=======================Contact details==========================");
	      Thread.sleep(1000);
		WebElement CT = driver.findElement(By.name("CONTACT DETAILS"));
		WebElement Phone = driver.findElement(By.name("Phone Number"));
		WebElement Alternate = driver.findElement(By.name("Alternate Number"));
		WebElement Address = driver.findElement(By.name("Current Address"));
		WebElement EmailID = driver.findElement(By.name("Email ID"));
		WebElement PermanentAddress = driver.findElement(By.name("Permanent Address"));
		WebElement Region = driver.findElement(By.name("Region"));
		WebElement ZipCode = driver.findElement(By.name("Zip Code"));
		//WebElement Country = driver.findElement(By.name("Country"));
		System.out.println("=======================Care taker details==========================");
		WebElement Care = driver.findElement(By.name("CARE TAKER DETAILS"));
		WebElement Name = driver.findElement(By.name("Name"));
		WebElement Number = driver.findElement(By.name("Contact Number"));
		WebElement Address1 = driver.findElement(By.name("Address"));
		WebElement Relationship = driver.findElement(By.name("Relationship"));
		WebElement Save = driver.findElement(By.name("SAVE"));

		String ECT = "CONTACT DETAILS";
		String EPhone = "Phone Number";
		String EAlternate = "Alternate Number";
		String EAddress = "Current Address";
		String EEmailID = "Email ID";
		String EPermanentAddress = "Permanent Address";
		String ERegion = "Region";
		String EZipCode = "Zip Code";
		//String ECountry = "Country";
		String ECare = "CARE TAKER DETAILS";
		String EName = "Name";
		String ENumber = "Contact Number";
		String EAddress1 = "Address";
		String ERelationship = "Relationship";
		String ESave = "SAVE";
		
		DemographicsGUI.Basicinformation(CT,ECT,a);a++;
		 DemographicsGUI.Basicinformation(Phone,EPhone,a);a++;
		 
		 DemographicsGUI.Basicinformation(Alternate,EAlternate,a);a++;
		 DemographicsGUI.Basicinformation(Address,EAddress,a);a++;
		 DemographicsGUI.Basicinformation(EmailID,EEmailID,a);a++;
		 DemographicsGUI.Basicinformation(PermanentAddress,EPermanentAddress,a);a++;
		 DemographicsGUI.Basicinformation(Region,ERegion,a);a++;
		 DemographicsGUI.Basicinformation(ZipCode,EZipCode,a);a++;
		// DemographicsGUI.Basicinformation(Country,ECountry,a);a++;
		 DemographicsGUI.Basicinformation(Care,ECare,a);a++;
		 DemographicsGUI.Basicinformation(Name,EName,a);a++;
		 DemographicsGUI.Basicinformation(Number,ENumber,a);a++;
		 DemographicsGUI.Basicinformation(Address1,EAddress1,a);a++;
		 DemographicsGUI.Basicinformation(Relationship,ERelationship,a);a++;
		 DemographicsGUI.Basicinformation(Save,ESave,a);a++;
		
		 
		 
		
		 
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}