package com.krystal.project;

import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.sikuli.script.FindFailed;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.windows.WindowsDriver;
public class PatientListGUI extends ReferencefileChemotheraphy{

	private Actions act;
	private PatientListPOM patientlist;
	private int count;
	private Object name;
	private WebElement name1;
	private WebElement RTID;
	private WebElement OtherID;
	private WebElement Age;
	private WebElement create;
	private WebElement modify;
	private Object user;
	private Actions action;

	@Test(priority =0)
	public void Launch()  throws InterruptedException, IOException {
//	DesiredCapabilities appCapabilities = new DesiredCapabilities();
//	appCapabilities.setCapability("app", "C:\\Program Files\\Panacea Medical Technologies\\Krystal\\Krystal.exe");
//	driver = new WindowsDriver<WebElement>(new URL("http://127.0.0.1:4723"), appCapabilities);
	ReferenceSigin Sign=new ReferenceSigin();
	Sign.Patientlist(driver);
	patientlist=new PatientListPOM(driver);
	action=new Actions(driver);
	act=new Actions(driver);
	}

	
 @Test(priority =1)
		public void Menu() throws InterruptedException, IOException
		{
	       test = extent.createTest("!!!!!!!!!!PATEINT LIST!!!!!!!");
			 test = extent.createTest("=======Title Bar========");
			 test = extent.createTest(guiTestCaseName()+" To Verify Menu icon displayed and enabled");
			 demo.isdisplayed(patientlist.Menu, "Menu icon", test, driver);
			 demo.isEnabled(patientlist.Menu, "Menu icon", test, driver);
		}
	 
			
 @Test(priority =1)
			public void Signout() throws InterruptedException, IOException
			{
				 test = extent.createTest(guiTestCaseName()+" To Verify Signout icon displayed and enabled");
				 demo.isdisplayed(patientlist.Signout, "Signout", test, driver);
				 demo.isEnabled(patientlist.Signout, "Signout", test, driver);
			}
			
 @Test(priority =2)
			public void Theme() throws InterruptedException, IOException
			{
				 test = extent.createTest(guiTestCaseName()+" To Verify Theme Icon displayed and enabled");
				 demo.isdisplayed(patientlist.Theme, "Theme", test, driver);
				 demo.isEnabled(patientlist.Theme, "Theme", test, driver);
			}
			
			
 @Test(priority =3)
			public void Password() throws InterruptedException, IOException
			{
				 test = extent.createTest(guiTestCaseName()+" To Verify Password Icon displayed and enabled");
				 demo.isdisplayed(patientlist.Password, "Password", test, driver);
					demo.isEnabled(patientlist.Password, "Password", test, driver);
			}

 @Test(priority = 4)
 public void Patientlist() throws IOException {
 	  test = extent.createTest(guiTestCaseName()+ " To verify the Patient List Label", " Patient List Label should be present");  
 		demo.Textcomparsion(patientlist.Patient, "Patient List", test,driver);	
   }
 
@Test(priority = 5)
public void Patienttablelist() throws IOException {
	test=extent.createTest("====== GRID ======");
	test = extent.createTest(guiTestCaseName()+ " To verify the Patient Table List Label", " Patient Table List Label should be present");  
    demo.Textcomparsion(patientlist.patientlist, "Patient Table List", test,driver);	
	patientlist.cust.click();
	demo.isdisplayed(patientlist.cust, "PatientCustomization", test, driver);
  }

@Test(priority = 6)
public void SelectAll() throws IOException {
	  test = extent.createTest(guiTestCaseName()+ " To verify the Select All Label", " Select All Label should be present");  
		demo.Textcomparsion(patientlist.select, "Select All", test,driver);
}

@Test(priority = 7)
public void Age () throws IOException {
	  test = extent.createTest(guiTestCaseName()+ " To verify the Age Label", " Age Label should be present");  
		demo.Textcomparsion(patientlist.age, "Age", test,driver);
}

@Test(priority = 8)
public void CreatedDate () throws IOException {
	  test = extent.createTest(guiTestCaseName()+ " To verify the Created Date Label", " Created Date Label should be present");  
		demo.Textcomparsion(patientlist.createdate, "Created Date", test,driver);
}

@Test(priority = 9)
public void Dateofbirth () throws IOException {
	  test = extent.createTest(guiTestCaseName()+ " To verify the Date Of Birth Label", " Date Of Birth Label should be present");  
		demo.Textcomparsion(patientlist.dob, "Date of Birth", test,driver);
}

@Test(priority = 10)
public void Genderpatient() throws IOException {
	  test = extent.createTest(guiTestCaseName()+ " To verify the Gender Label", " Gender Label should be present");  
		try {
			demo.Textcomparsion(patientlist.gender, "Gender", test,driver);
		} catch (IOException e) {
			e.printStackTrace();
		}
}


@Test(priority = 11)
public void Machine () throws IOException {
	  test = extent.createTest(guiTestCaseName()+ " To verify the Machine Label", " Machine Label should be present");  
		demo.Textcomparsion(patientlist.machine, "Machine", test,driver);
}

@Test(priority = 12)
public void ModifiedDate () throws IOException {
	  test = extent.createTest(guiTestCaseName()+ " To verify the Modified Date Label", " Modified Date Label should be present");  
		demo.Textcomparsion(patientlist.modified, "Modified Date", test,driver);
}

@Test(priority = 13)
public void OtherID () throws IOException {
	  test = extent.createTest(guiTestCaseName()+ " To verify the Other ID Label", " Other ID Label should be present");  
		demo.Textcomparsion(patientlist.other, "Other ID", test,driver);
}

@Test(priority = 14)
public void Physician () throws IOException {
	  test = extent.createTest(guiTestCaseName()+ " To verify the Physician Label", " Physician Label should be present");  
		demo.Textcomparsion(patientlist.physician, "Physician", test,driver);
		patientlist.cust.click();
}

@Test(priority = 15)
public void Name () throws IOException {
	  test = extent.createTest(guiTestCaseName()+ " To verify the Name Label", " Name Label should be present");  
		demo.Textcomparsion(patientlist.name, "Name", test,driver);
}

@Test(priority = 16)
public void RTID () throws IOException {
	  test = extent.createTest(guiTestCaseName()+ " To verify the RT ID Label", " RT ID Label should be present");  
		demo.Textcomparsion(patientlist.rtid, "RT ID", test,driver);
}

@Test(priority = 17)
public void OtherID1 () throws IOException {
	  test = extent.createTest(guiTestCaseName()+ " To verify the Other ID Label", " Other ID Label should be present");  
		demo.Textcomparsion(patientlist.otherid, "Other ID", test,driver);
}

@Test(priority = 18)
public void Gender1 () throws IOException {
	  test = extent.createTest(guiTestCaseName()+ " To verify the Gender Label", " Gender Label should be present");  
		demo.Textcomparsion(patientlist.gender1, "Gender", test,driver);
		patientlist.filter.click();
}

@Test(priority = 19)
public void Genderselect () throws IOException {
	  test = extent.createTest(guiTestCaseName()+ " To verify the Gender Label", " Gender Label should be present");  
		demo.Textcomparsion(patientlist.gender1, "Gender", test,driver);
}

@Test(priority = 20)
public void Male () throws IOException {
	  test = extent.createTest(guiTestCaseName()+ " To verify the Male Label", " Male Label should be present");  
		demo.Textcomparsion(patientlist.male, "Male", test,driver);
}

@Test(priority = 21)
public void Female () throws IOException {
	  test = extent.createTest(guiTestCaseName()+ " To verify the Female Label", " Female Label should be present");  
		demo.Textcomparsion(patientlist.female, "Female", test,driver);
}

@Test(priority = 22)
public void Others () throws IOException {
	  test = extent.createTest(guiTestCaseName()+ " To verify the Others Label", " Others Label should be present");  
		demo.Textcomparsion(patientlist.others, "Others", test,driver);
		patientlist.filter.click();
}

@Test(priority = 23)
public void DateofBirth () throws IOException {
	  test = extent.createTest(guiTestCaseName()+ " To verify the Date of Birth Label", " Date of Birth Label should be present");  
		demo.Textcomparsion(patientlist.dob1, "Date of Birth", test,driver);
}

@Test(priority = 24)
public void Age1 () throws IOException {
	  test = extent.createTest(guiTestCaseName()+ " To verify the Age Label", " Age Label should be present");  
		demo.Textcomparsion(patientlist.age1, "Age", test,driver);
}

@Test(priority = 25)
public void Createddate () throws IOException {
	  test = extent.createTest(guiTestCaseName()+ " To verify the Created date Label", " Created date Label should be present");  
		demo.Textcomparsion(patientlist.create, "Created date", test,driver);
}

@Test(priority = 26)
public void Modifieddate () throws IOException {
	  test = extent.createTest(guiTestCaseName()+ " To verify the Modified date Label", " Modified date Label should be present");  
		demo.Textcomparsion(patientlist.modify, "Modified date", test,driver);
}

@Test(priority = 27)
public void Physician1 () throws IOException {
	  test = extent.createTest(guiTestCaseName()+ " To verify the Physician Label", " Physician Label should be present");  
		demo.Textcomparsion(patientlist.phy, "Physician", test,driver);
}

@Test(priority = 28)
public void Machine1 () throws IOException {
	  test = extent.createTest(guiTestCaseName()+ " To verify the Machine Label", " Machine Label should be present");  
		demo.Textcomparsion(patientlist.machine1, "Machine", test,driver);
}

@Test(priority = 29)
public void SearchRTID () throws IOException {
	  test = extent.createTest(guiTestCaseName()+ " To verify the Search RT ID Label", " Search RT ID Label should be present");  
		demo.Textcomparsion(patientlist.search, "Search RT ID", test,driver);
		patientlist.selection.click();
}

@Test(priority = 30)
public void Dateofbirth1 () throws IOException {
	  test = extent.createTest(guiTestCaseName()+ " To verify the Date of Birth Label", " Date of Birth Label should be present");  
		demo.Textcomparsion(patientlist.dob, "Date of Birth", test,driver);
}

@Test(priority = 31)
public void Name1 () throws IOException {
	  test = extent.createTest(guiTestCaseName()+ " To verify the Name Label", " Name Label should be present");  
		demo.Textcomparsion(patientlist.name, "Name", test,driver);
}

@Test(priority = 32)
public void Otherid () throws IOException {
	  test = extent.createTest(guiTestCaseName()+ " To verify the Other ID Label", " Other ID Label should be present");  
		demo.Textcomparsion(patientlist.otherid, "Other ID", test,driver);
}

@Test(priority = 33)
public void RTID1 () throws IOException, InterruptedException {
	  test = extent.createTest(guiTestCaseName()+ " To verify the RT ID Label", " RT ID Label should be present");  
		demo.Textcomparsion(patientlist.rtid, "RT ID", test,driver);
		patientlist.selection.click();
		Thread.sleep(2000);
}

@Test(priority = 34)
public void Patientmenu () throws IOException, InterruptedException {
	 test=extent.createTest("====== PatienMenu ======");
	  test = extent.createTest(guiTestCaseName()+ " To verify the Patientmenu Label", " Patientmenu Label should be present");  
		demo.Textcomparsion(patientlist.patientmenu, "Patient Menu", test,driver);
}


@Test(priority = 35)
public void Demographics () throws IOException, InterruptedException {
	  test = extent.createTest(guiTestCaseName()+ " To verify the Demographics Label", " Demographics Label should be present"); 
		demo.Textcomparsion(patientlist.demo, "DEMOGRAPHICS", test,driver);
		demo.BydefaultisEnabled(patientlist.demo, "DEMOGRAPHICS", test,driver);
		}



@Test(priority = 36)
public void Prescription () throws IOException, InterruptedException {
	  test = extent.createTest(guiTestCaseName()+ " To verify the Prescription Label", " Prescription Label should be present"); 
		demo.Textcomparsion(patientlist.pres, "PRESCRIPTION", test,driver);
		demo.BydefaultisEnabled(patientlist.pres, "PRESCRIPTION", test,driver);
}

@Test(priority = 37)
public void PlanApproval () throws IOException, InterruptedException {
	  test = extent.createTest(guiTestCaseName()+ " To verify the PlanApproval Label", " PlanApproval Label should be present"); 
		demo.Textcomparsion(patientlist.plan, "PLAN APPROVAL", test,driver);
		demo.BydefaultisEnabled(patientlist.plan, "PLAN APPROVAL", test,driver);
}


@Test(priority = 38)
public void Scheduling () throws IOException, InterruptedException {
	  test = extent.createTest(guiTestCaseName()+ " To verify the Scheduling Label", " Scheduling Label should be present"); 
		demo.Textcomparsion(patientlist.scheduling, "SCHEDULING", test,driver);
		demo.BydefaultisEnabled(patientlist.scheduling, "SCHEDULING", test,driver);
}

@Test(priority = 39)
public void Vitals () throws IOException, InterruptedException {
	  test = extent.createTest(guiTestCaseName()+ " To verify the Vitals Label", " Vitals Label should be present"); 
		demo.Textcomparsion(patientlist.vital, "VITALS", test,driver);
		demo.BydefaultisEnabled(patientlist.vital, "VITALS", test,driver);
}

@Test(priority = 40)
public void LabReports () throws IOException, InterruptedException {
	  test = extent.createTest(guiTestCaseName()+ " To verify the LabReports Label", " LabReports Label should be present"); 
		demo.Textcomparsion(patientlist.lab, "LAB REPORTS", test,driver);
		demo.BydefaultisEnabled(patientlist.lab, "LAB REPORTS", test,driver);
}

@Test(priority = 41)
public void Treatmentreview () throws IOException, InterruptedException {
	  test = extent.createTest(guiTestCaseName()+ " To verify the Treatmentreview Label", " Treatmentreview Label should be present"); 
		demo.Textcomparsion(patientlist.review, "TREATMENT REVIEW", test,driver);
		demo.BydefaultisEnabled(patientlist.review, "TREATMENT REVIEW", test,driver);
}


@Test(priority = 42)
public void SoftwareVersion () throws IOException, InterruptedException {
	test=extent.createTest("====== FootBar ======");
	  test = extent.createTest(guiTestCaseName()+ " To verify the Software Version Label", " Software Version Label should be present"); 
	  Thread.sleep(1000);
		demo.Textcomparsion(patientlist.swversion, "Software Version :", test,driver);
		Thread.sleep(2000);
}

@Test(priority = 43)
public void HospitalName () throws IOException, InterruptedException {
	  test = extent.createTest(guiTestCaseName()+ " To verify the Licensed to : Hospital_Name Label", " Licensed to : Hospital_Name Label should be present");  
	  Thread.sleep(1000);
		demo.Textcomparsion(patientlist.licensed, "Licensed to : Hospital_Name", test,driver);
		Thread.sleep(2000);
}


//@Test(priority =1)
public void button() throws InterruptedException{
List<WebElement> elements = driver.findElements(By.xpath("//Button[@HelpText='Sort']"));
Actions actions = new Actions(driver);
for (WebElement element : elements) {
    actions.moveToElement(element).perform();
    System.out.println(element.getLocation());
    System.out.println(element.getText());
    System.out.println(count++);
    System.out.println("********************************************");
    Thread.sleep(1000);
}
}

@Test(priority =44)
public void Namesort() throws IOException, InterruptedException {
	test=extent.createTest("====== Sort Icon ======");
test = extent.createTest(guiTestCaseName()+" To Verify the Name Sort Enabled"," Name Sort should be Enabled ");	
name1=driver.findElements(By.xpath("//Button[@HelpText='Sort']")).get(0);
 demo.isdisplayed(name1,"Sort", test, driver);
 demo.isEnabled(name1,"Sort", test, driver);
 Thread.sleep(2000);
}

@Test(priority =45)
public void RTIDsort() throws IOException {
test = extent.createTest(guiTestCaseName()+" To Verify the RTID Sort Enabled"," RTID Sort should be Enabled ");	
RTID=driver.findElements(By.xpath("//Button[@HelpText='Sort']")).get(1);

 demo.isdisplayed(RTID,"Sort", test, driver);
 demo.isEnabled(RTID,"Sort", test, driver);
}

@Test(priority =46)
public void OtherIDsort() throws IOException {
test = extent.createTest(guiTestCaseName()+" To Verify the OtherID Sort Enabled"," OtherID Sort should be Enabled ");	
OtherID=driver.findElements(By.xpath("//Button[@HelpText='Sort']")).get(2);
 demo.isdisplayed(OtherID,"Sort", test, driver);
 demo.isEnabled(OtherID,"Sort", test, driver);
}

@Test(priority =47)
public void Agesort() throws IOException {
test = extent.createTest(guiTestCaseName()+" To Verify the Age Sort Enabled"," Age Sort should be Enabled ");	
Age=driver.findElements(By.xpath("//Button[@HelpText='Sort']")).get(3);

 demo.isdisplayed(Age,"Sort", test, driver);
 demo.isEnabled(Age,"Sort", test, driver);
}

@Test(priority =48)
public void CreatedDatesort() throws IOException {
test = extent.createTest(guiTestCaseName()+" To Verify the CreatedDate Sort Enabled"," CreatedDate Sort should be Enabled ");	
create=driver.findElements(By.xpath("//Button[@HelpText='Sort']")).get(4);

 demo.isdisplayed(create,"Sort", test, driver);
 demo.isEnabled(create,"Sort", test, driver);
}

@Test(priority =49)
public void ModifiedDatesort() throws IOException {
test = extent.createTest(guiTestCaseName()+" To Verify the ModifiedDate Sort Enabled"," ModifiedDate Sort should be Enabled ");	
modify=driver.findElements(By.xpath("//Button[@HelpText='Sort']")).get(5);

 demo.isdisplayed(modify,"Sort", test, driver);
 demo.isEnabled(modify,"Sort", test, driver);
}

@Test(priority = 50)
public void PageEnable() throws IOException, FindFailed, InterruptedException
{
test = extent.createTest(guiTestCaseName()+" To verify Page Icon Disabled , Page Icon Should be Disabled");
demo.BydefaultisEnabled(patientlist.FirstPageButton,"First page button", test,driver);
demo.BydefaultisEnabled(patientlist.PreviousPageButton,"PreviousPageButton", test,driver);
demo.BydefaultisEnabled(patientlist.NextPageButton,"Next page button", test,driver);
demo.BydefaultisEnabled(patientlist.LastPageButton,"Last page button", test,driver);
		
}




}













































