package com.krystal.project;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import io.appium.java_client.windows.WindowsDriver;

public class DesignationConfigurationtest extends ReferencefileChemotheraphy {
	
	SiteConfigurationTest name;
	private String imagePath;
	private Screen s;
	private Match match;
	private WebElement Update;
	private WebElement Designationconfig;
	private DesignationPOM desg;
	private Actions act;
	
	
	
	 @Test(priority =1)
		public void launchchemo()  throws InterruptedException, IOException {
		//DesiredCapabilities appCapabilities = new DesiredCapabilities();
		//appCapabilities.setCapability("app", "C:\\Program Files\\Panacea Medical Technologies\\Krystal\\Krystal.exe");
		//driver = new WindowsDriver<WebElement>(new URL("http://127.0.0.1:4723"), appCapabilities);
		ReferenceSigin Sign=new ReferenceSigin();
		Sign.Login(driver);
		Sign.Designationconfig(driver);
		desg=new DesignationPOM(driver);
		setUp();
		action=new Actions(driver);
		act=new Actions(driver);
		}
	
	 
	 @Test(priority =2)
	 public void addDesignationLabel() throws IOException {
		 test = extent.createTest("====GENERAL SETTINGS(DESIGNATION CONFIGURATION MODULE)====");
	 test = extent.createTest(guiTestCaseName()+" Add Designation label"," Add Designation label should be present ");	
	 demo.Textcomparsion(desg.addDesignation, "ADD DESIGNATION", test,driver);
	 }
	 Actions action;
	 @Test(priority =3)
	 public void designationNameLabel() throws IOException, InterruptedException {
		 test = extent.createTest(guiTestCaseName()+" Designation Name label"," Designation Name label should be present ");	
		 guilabelindex("Designation Name", 2,"Designation Name");
	 }
	 
	 @Test(priority =3)
	 public void prescriptionNameLabel() throws IOException, InterruptedException {
	 test = extent.createTest(guiTestCaseName()+" Prescription Name label"," Prescription Name label should be present ");	
	 guilabelindex("Prescription", 2,"Prescription");
	 }
	 
	 
	 @Test(priority =4)
	 public void yesLabel() throws IOException {
	 test = extent.createTest(guiTestCaseName()+" Yes label"," Yes label should be present ");	
	 demo.Textcomparsion(desg.yes, "Yes", test,driver);
	 }
	 
	 @Test(priority =5)
	 public void NoLabel() throws IOException {
	 test = extent.createTest(guiTestCaseName()+" No label", "No label should be present ");	
	 demo.Textcomparsion(desg.no, "No", test,driver);
	 }
	 
	 @Test(priority =6)
	 public void SaveLabel() throws IOException {
	 test = extent.createTest(guiTestCaseName()+" Save label", "Save label should be present ");	
	 demo.Textcomparsion(desg.Save, "SAVE", test,driver);
	 }
	 
	 @Test(priority =7)
	 public void DesignationList() throws IOException {
	 test = extent.createTest(guiTestCaseName()+" Designation List label", "Designation List label should be present ");	
	 demo.Textcomparsion(desg.designationList,"DESIGNATION LIST", test,driver);
	 }
	
	 @Test(priority =8)
	 public void designationNamenextLabel() throws InterruptedException, IOException
	 {
		 test = extent.createTest(guiTestCaseName()+" Designation Name list label"," Designation Name list label should be present ");	
		 guilabelindex("Designation Name", 4,"Designation Name");
	 }
	
	@Test(priority =9)
	 public void prescriptionlistLabel() throws IOException, InterruptedException {
	 test = extent.createTest(guiTestCaseName()+" Prescription List label"," Prescription list label should be present ");	
	 guilabelindex("Prescription", 4,"Prescription");
	 }
	
	 @Test(priority =10)  // ADD in seperate methods
	 public void defaultenabledisable() throws IOException, InterruptedException {
		 
		 test = extent.createTest(guiTestCaseName()+" Save button Enabled by default ","By default Save button should be Enabled");
		 DemographicsExternal demo=new DemographicsExternal();
		 demo.isEnabled(desg.Save,"SAVE", test,driver);
		 test = extent.createTest(guiTestCaseName()+" Yes radio button not selected","Yes radio button not selected");
	     demo.BydefaultisSelected(desg.yes, "Yes", test,driver);
	     test = extent.createTest(guiTestCaseName()+" No radio button not selected","No radio button not selected");
	     demo.BydefaultisSelected(desg.no, "No", test,driver);
	 }
	
	
	 public void databaseconnectionemptycheck() throws IOException
	 {
	 	test = extent.createTest(dataTestCaseName()+" To verify the Empty Database for Designation Configuration");
	 	Designationconfig(test);
	 }
	 
	 
	@Test(priority =12)
	 public void emptytextboxes() throws IOException, InterruptedException
	 {
		 test = extent.createTest(guiTestCaseName()+" Empty Textbox Click on savebutton ","Designation Name and Prsecription error message displayed");
		 desg.Save.click();
		 errormessagedisplayed("Designation Name cannot be empty.","Designation Name cannot be empty.");
		 errormessagedisplayed("Please Select","Please Select");
	 }
	
	@Test(priority =13)
	 public void emptyPrescriptiontextboxes() throws IOException, InterruptedException
	 {
		 test = extent.createTest(guiTestCaseName()+" Empty Prescription  Click on savebutton ","Prescription error message displayed");
		 desg.designationName.click();
		 driver.switchTo().activeElement().sendKeys("Physician123");
		 desg.Save.click();
		 errormessagedisplayed("Please Select","Please Select");
	 }
	
	 @Test(priority =14)
	 public void emptydesignationtextboxes() throws IOException
	 {
		 test = extent.createTest(guiTestCaseName()+" Empty Designation Textbox Click on savebutton ","Designation error message displayed");
		 desg.designationName.click();
		 driver.switchTo().activeElement().clear();
		 randomstring();
		 WebElement Designationsave=driver.findElement(By.name(selectedOption));
		 Actions action=new Actions(driver);
		 action.moveToElement(Designationsave).perform();
		 action.moveByOffset(-5,0).click().perform();
		 desg.Save.click();
		 errormessagedisplayed("Designation Name cannot be empty.","Designation Name cannot be empty.");
	 }
	 String Text;
	 WebElement SiteHead;

         @Test(priority=15)
	 public void Designationsave() throws InterruptedException, IOException
	 { 
	 	test = extent.createTest(guiTestCaseName()+" To verify the Valid Designation name","Valid Designation  should save the data");
	 	randomalpha(40);
	 	Validdata(desg.designationName,randomStringalpha,driver);
	 	DesignationSave(test);
	 }
         
	@Test(priority=16)
	 public void Designationalreadysave() throws InterruptedException, IOException
	 {
	 	Validdata(desg.designationName,randomStringalpha,driver);
	 	DesignationSave(test);
	 	test = extent.createTest(funTestCaseName()+" To verify the Designation name already exits error message is displayed");
	 	WebElement DesignationErrormsg = driver.findElement(By.name("Designation Name Already Exists."));
	 	demo.isdisplayed(DesignationErrormsg, "Designation Name Already Exists.", test,driver);
	 	demo.Textcomparsion(DesignationErrormsg, "Designation Name Already Exists.", test,driver);
	 	desg.designationName.click();
	 	driver.switchTo().activeElement().clear();
	 }
	
	@Test(priority=17)
	 public void Designationtexbox() throws InterruptedException, IOException
	 {
		
		    desg.designationName.click();
	 	    driver.switchTo().activeElement().clear();
		    randomUpper(15);
	 		ValidataUpper("Designation Name");
	 		DesignationSave(test);
	 		Thread.sleep(2000);
	 		randomLower(15);
	 		ValidataLower("Designation Name");
	 		DesignationSave(test);
	 		
	 		Thread.sleep(2000);
	 		randomalpha(15);
	 		ValidataUpperLower("Designation Name");
	 		DesignationSave(test);
	 		Thread.sleep(2000);
	 		randomNumber(15);
	 		ValidataNumber("Designation Name");
	 		DesignationSave(test);
	 		Thread.sleep(1000);
	 		
	 		randomstringtext(15);
	 		Thread.sleep(1000);
	 		Validatachars("Designation Name");
	 		DesignationSave(test);
	 		Thread.sleep(1000);
	 		
	 		randomCharOutOfRange(64);
	 		Thread.sleep(1000);
	 		InValidataDesign("Designation Name");
	 		DesignationSave(test);
	 		Thread.sleep(1000);
	 		
	 		Specialcharenable("Designation Name",driver);
	 		desg.designationName.click();
	 		desg.designationName.clear();			
	 		
	 }
	 
	
	@Test(priority =18)
	public void databaseconnectionsavecheck() throws IOException
	{
		test = extent.createTest(dataTestCaseName()+" To verify the Saved Database for Site Configuration");
		Designationconfig(test);
	}
	@Test(priority = 19)
	public void viewdataget1() throws IOException, FindFailed, InterruptedException {
	    test = extent.createTest(guiTestCaseName() + "To verify the datagrid elements for designation configuration");
	    List<WebElement> Listrow = driver.findElements(By.className("DataGridRow"));
	    StringBuilder tableHtml = new StringBuilder();
	    tableHtml.append("<table style='font-size: 16px; border-collapse: separate; border-spacing: 10px;'>");

	    tableHtml.append("<tr><th>Database Name</th><th> Prescription Value</th></tr>");
	    for (WebElement row : Listrow) {
	       
	        List<WebElement> datarow = row.findElements(By.className("DataGridCell"));
	        // Check if there are at least 4 cells in the row
	        if (datarow.size() >= 4) {
	            // Extract text from the 3rd and 4th cells (index 2 and 3)
	            String cell3Text = datarow.get(2).getText();
	            String cell4Text = datarow.get(3).getText();

	            // Add the text from the 3rd and 4th cells to the table
	            tableHtml.append("<tr><td>").append(cell3Text).append("</td><td style='margin-left: 10px;'>").append(cell4Text).append("</td></tr>");
	        }
	    }
	        tableHtml.append("</table>");
	        test.pass(MarkupHelper.createLabel(tableHtml.toString(), ExtentColor.WHITE));
	    
	}
	
	@Test(priority = 20)
	public void viewdatabase() throws FindFailed, ClassNotFoundException, IOException, InterruptedException, SQLException
	{    test = extent.createTest(dataTestCaseName() + "To verify the datagrid and database elements");
		 viewdataget(test);
	}

	@Test(priority=21)// Prescription selected empty
	public void add() throws IOException, FindFailed
	{
		test = extent.createTest(funTestCaseName()+" Click on add icon, Designation Name and prescription is displayed as empty");	
		editrefersh("D:\\Help\\Designation\\Addicon.PNG",test);
	}
	
	@Test(priority=22)// Prescription selected empty 
	public void Refresh() throws IOException, FindFailed
	{
		 test = extent.createTest(funTestCaseName()+" Click on Refersh icon, Designation Name and prescription is displayed as empty");	
		 editrefersh("D:\\Help\\Designation\\Refresh.PNG",test); 
	}
	
	
	@Test(priority = 23)
	public void viewdeleteenable() throws IOException, FindFailed, InterruptedException {
	    test = extent.createTest(guiTestCaseName() + "To verify the all the delete button enabled when save the data");
	    List<WebElement> Listrow = driver.findElements(By.className("DataGridRow"));
	    for (WebElement link : Listrow) {
	        List<WebElement> datarow = driver.findElements(By.className("DataGridCell"));
	        for (int i = 0; i < datarow.size(); i++) {
	            WebElement datalink = datarow.get(i);
	            if (datalink.getSize() != null) {
	                String linkText = datalink.getText();
	               // test.info(linkText);
	                // Check if the index is even
	                if (i % 2 == 0) {
	                   demo.isEnabled(datalink, "Delete", test, driver);
	                   if(datarow.size()==16)
	                   {
	                	   desg.NextPageButton.click(); 
	                	   List<WebElement> datarow1 = driver.findElements(By.className("DataGridCell"));
	                       for (int i1 = 0; i < datarow1.size(); i++) {
	                           WebElement datalink1 = datarow.get(i1);
	                           if (datalink1.getSize() != null) {
	                               String linkText1 = datalink1.getText();
	                               test.info(linkText1);
	                           }
	                       }
	                   }
	                   else
	                   {
	                	   test.info("NextPageButton is not enabled");
	                   }
	                   break;
	                }
	            }
	        }
	       
	    }
	}
	@Test(priority = 24)
	public void vieweditenable() throws IOException, FindFailed, InterruptedException {
	    test = extent.createTest(guiTestCaseName() + "To verify the all the EDIT button enabled when save the data");
	    List<WebElement> Listrow = driver.findElements(By.className("DataGridRow"));
	    for (WebElement link : Listrow) {
	        List<WebElement> datarow = driver.findElements(By.className("DataGridCell"));
	        for (int i = 0; i < datarow.size(); i++) {
	            WebElement datalink = datarow.get(i);
	            if (datalink.getSize() != null) {
	                String linkText = datalink.getText();
	               // test.info(linkText);
	                // Check if the index is even
	                if (i % 1 == 0) {
	                   demo.isEnabled(datalink, "Delete", test, driver);
	                   if(datarow.size()==16)
	                   {
	                	   desg.NextPageButton.click(); 
	                	   List<WebElement> datarow1 = driver.findElements(By.className("DataGridCell"));
	                       for (int i1 = 0; i < datarow1.size(); i++) {
	                           WebElement datalink1 = datarow.get(i1);
	                           if (datalink1.getSize() != null) {
	                               String linkText1 = datalink1.getText();
	                               test.info(linkText1);
	                           }
	                       }
	                   }
	                   else
	                   {
	                	   test.info("NextPageButton is not enabled");
	                   }
	                   break;
	                }
	            }
	        }
	       
	    }
	}
	// Check the edit and delete is enabled or not

	@Test(priority =25)
	public void Editbutton() throws IOException, FindFailed
	{
		 test = extent.createTest(funTestCaseName()+" Click on Edit button, Update button is enabled");
		 EditElement();
		 demo.isEnabled(desg.Update, "UPDATE", test, driver);
		 demo.Textcomparsion(desg.Update, "UPDATE", test, driver);
	}
	
	@Test(priority =26)
	public void EditElement()
	{
		WebElement Edit=driver.findElements(By.className("DataGridCell")).get(0);
		 Actions action=new Actions(driver);
		 action.moveToElement(Edit).moveByOffset(3,0).click().perform();
	}

        @Test(priority =27)
	public void EditNoChange() throws IOException
	{
		 test = extent.createTest(funTestCaseName()+" Click on Edit button, Don't change the data click on the Update button");
		 desg.Update.click();
		 try {
			 Sitesave1("Designation Configuration", "Designation data Updated.", "Designation Configuration", "Designation data Updated.",0,driver,test);
		 }
		 catch(Exception e)
		 {
			 test.fail("Update Pop-up is not displayed");
			 catchexceptionscreenshot1(test,e) ;
		 }	 
	}
	 String EditText;

        @Test(priority =28)
	public void EditChange() throws IOException
	{
		 test = extent.createTest(funTestCaseName()+" Click on Edit button, Enter alreday exits data, Error message should get display");
		 EditElement();
		 desg.designationName.click();
		 EditText=driver.switchTo().activeElement().getText();
		 desg.designationName.click();
		 driver.switchTo().activeElement().clear();
		 driver.switchTo().activeElement().sendKeys(randomStringNumber);
		 desg.Update.click();
		 try {
			 demo.isdisplayed(desg.Alreadyexits, "Designation Name Already Present.", test, driver); 
		 }
		 catch(Exception e)
		 {
			 test.fail("Designation Name Already Present not displayed");
			 catchexceptionscreenshot1(test,e) ;
		 } 
	}

        @Test(priority =29)
	public void EditSpecial()  throws IOException, InterruptedException
	{
         EditElement();
		 desg.designationName.click();
		 driver.switchTo().activeElement().clear();
		 try {
		 desg.designationName.click();
		 driver.switchTo().activeElement().sendKeys("\\,");
		 desg.Update.click();
		 WebElement Specialchars=driver.findElement(By.name("Input must not contain \\ , '' , '"));
		 demo.isdisplayed(Specialchars, "Input must not contain \\ , '' , '", test,driver);
		 }
		 catch(Exception e)
		 {
			 test.fail("Special Char error message not displayed"); 
			 catchexceptionscreenshot1(test,e) ;
		 }
	}

	@Test(priority =30)
	public void editadd() throws FindFailed, IOException
	{
		EditElement();
		desg.designationName.click();
		driver.switchTo().activeElement().clear();
		add();
	}

	@Test(priority =31)
	public void editRefersh() throws FindFailed, IOException
	{
		test = extent.createTest(funTestCaseName()+" Click on Refersh button button, Previous data should get displayed");
		 EditElement();
		 desg.designationName.click();
		 driver.switchTo().activeElement().clear();
		 WebElement cell3Text = driver.findElements(By.className("DataGridCell")).get(2);
		 String cell3Text1=cell3Text.getText();
		 WebElement cell4Text = driver.findElements(By.className("DataGridCell")).get(3);
		 String cell4Text1=cell4Text.getText();
		 editdatarefersh("D:\\Help\\Designation\\Refresh.PNG",test);
		 demo.ByValidErrormessage(desg.designationName, cell3Text1, test, driver);
		 WebElement Designationsave=driver.findElement(By.name(cell4Text1));
		 demo.isSelected(Designationsave, cell4Text1, test, driver);
		 
	}
	String Editdata;

        @Test(priority =32)
	public void editchange() throws IOException, InterruptedException
	{
		 test = extent.createTest(funTestCaseName()+" Click on Edit button, Change the data, Click on Update");
		 EditElement();
		 desg.designationName.click();
		 driver.switchTo().activeElement().clear();
		 Thread.sleep(1000);
		 randomLower(15);
		 Thread.sleep(1000);
		 desg.designationName.click();
		 driver.switchTo().activeElement().sendKeys(randomStringLower);
		 Editdata=randomStringLower;
		 Thread.sleep(1000);
		 desg.Update.click();
		 try {
		 Sitesave1("Designation Configuration", "Designation data Updated.", "Designation Configuration", "Designation data Updated.",0,driver,test);
		 }
		 catch(Exception e)
		 {
			 test.fail("Update Pop-up is not displayed");
			 catchexceptionscreenshot1(test,e) ;
		 }
	}

        
	@Test(priority = 33)
	public void Editdatabase() throws FindFailed, ClassNotFoundException, IOException, InterruptedException, SQLException
	{    test = extent.createTest(dataTestCaseName() + "To verify the datagrid and database elements for EDIT data");
		 viewdataget(test);
	}
	
        @Test(priority = 34)
	public void EditchangeUpdate() throws IOException
	{
		 test = extent.createTest(funTestCaseName()+" Click on Edit button, Check edited data is displayed correctly or not");
		 WebElement Edit=driver.findElements(By.className("DataGridCell")).get(0);
		 Actions action=new Actions(driver);
		 action.moveToElement(Edit).moveByOffset(3,0).click().perform();
		 desg.designationName.click();
		 String Actualdata =driver.switchTo().activeElement().getText();
		if(Actualdata.equals(Editdata))
		{
			test.pass("Edit Designation name data is Upadted");
		}
		else
		{
			test.fail("Edited Designation name is not updated"+Actualdata+","+Editdata);
		} 
	}
	

        @Test(priority = 35)
	public void deletecancel() throws IOException, InterruptedException
	{
		test = extent.createTest(funTestCaseName()+" Click on Delete data, Pop-up should get displayed, Click on Cancel button");
		WebElement Delete=driver.findElements(By.className("DataGridCell")).get(1);
		 Actions action=new Actions(driver);
		 action.moveToElement(Delete).moveByOffset(3,0).click().perform();
		if(Delete.isEnabled())
		{
			Delete.click();
			try {
			Rollcontainscancel("Designation Delete", "Do you want to delete Designation", "Designation Delete", "Do you want to delete Designation",test,driver);
			
		     }
			catch(Exception e)
			{
				test.fail("Delete Pop-up not found");
				catchexceptionscreenshot1(test,e) ;
			}
		}
		else
		{
			test.fail("Delete button is not enabled");
		}
		
	}
	
        @Test(priority = 36)
	public void deleteok() throws IOException
	{
		test = extent.createTest(funTestCaseName()+" Click on Delete data, Pop-up should get displayed, Click on OK button");
		WebElement Delete=driver.findElements(By.className("DataGridCell")).get(1);
		if(Delete.isEnabled())
		{
			Actions action=new Actions(driver);
			 action.moveToElement(Delete).moveByOffset(3,0).click().perform();
			try {
			Rollcontains("Designation Delete", "Do you want to delete Designation", "Designation Delete", "Do you want to delete Designation",test,driver);
			Sitesave1("Designation Configuration", "Designation data deleted.", "Designation Delete", "Designation data deleted.",0,driver,test);
		     }
			catch(Exception e)
			{
				test.fail("Delete Pop-up not found");
				catchexceptionscreenshot1(test,e) ;
			}
		}
		else
		{
			test.fail("Delete button is not enabled");
		}	
	}


	@Test(priority = 37)
	public void Deletedatabase() throws FindFailed, ClassNotFoundException, IOException, InterruptedException, SQLException
	{    test = extent.createTest(dataTestCaseName() + "To verify the datagrid and database elements for DELETE data");
		 viewdataget(test);
	}
	
	@Test(priority = 38)
	public void deletedatanotdisplayed() throws IOException
	{
		test = extent.createTest(funTestCaseName()+"Deleted data not displayed");
		WebElement Deletedata=driver.findElements(By.className("DataGridCell")).get(2);
		demo.ByInvalidErrormessage(Deletedata, Editdata, test, driver);
	}
	
	@Test(priority = 39)
	public void deletedatasave() throws IOException, InterruptedException
	{
		test = extent.createTest(funTestCaseName()+" Deleted name, Enetred Once again it should save the data");
		desg.designationName.click();
		driver.switchTo().activeElement().sendKeys(randomStringLower); 
		DesignationSave(test);
	}

	@Test(priority = 40)
	public void Deletedatabaseadd() throws FindFailed, ClassNotFoundException, IOException, InterruptedException, SQLException
	{    test = extent.createTest(dataTestCaseName() + "To verify the datagrid and database elements for data added DELETE data");
		 viewdataget(test);
	}

	@Test(priority = 41)
	public void viewdataserach() throws IOException, FindFailed, InterruptedException
	{
		 test = extent.createTest(funTestCaseName() + " To verify the Search box functionality and it is cleared empty textbox");
		// viewdataserachfun(test);
		 viewdataserachfundelete(test,driver);
	}

	//*******************************Page Navigation**************
	
	@Test(priority = 42)
	public void pagefirst() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" To verify first page button is displayed");
		demo.isdisplayed(desg.FirstPageButton,"First page button", test,driver);
		demo.BydefaultisEnabled(desg.FirstPageButton,"First page button", test,driver);
	}
	@Test(priority = 43)
	public void pagesecond() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" To verify Previous Page button is displayed");
		demo.isdisplayed(desg.PreviousPageButton,"PreviousPageButton button is displayed", test,driver);
		demo.BydefaultisEnabled(desg.PreviousPageButton,"PreviousPageButton button is displayed", test,driver);
	}
	@Test(priority = 44)
	public void pageNext() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" To verify Next Page button is displayed");
		demo.isdisplayed(desg.NextPageButton,"NextPageButton button", test,driver);
		demo.BydefaultisEnabled(desg.NextPageButton,"NextPageButton button", test,driver);

	}
	@Test(priority = 45)
	public void pagelast() throws IOException
	{
		test = extent.createTest(guiTestCaseName()+" To verify Last Page button is displayed");
		demo.isdisplayed(desg.LastPageButton,"LastPage button", test,driver);
		demo.BydefaultisEnabled(desg.LastPageButton,"LastPage button", test,driver);

	}
	@Test(priority = 46, invocationCount=3)
	public void Sitenameadd() throws IOException, InterruptedException
	{
		Designationtexbox();
	}

	@Test(priority = 47)
	public void pageenabled() throws IOException, InterruptedException
	{
		List<WebElement> dataGridRows = driver.findElements(By.className("DataGridRow"));
		System.out.println(dataGridRows.size());
	    if (dataGridRows.size()>=17) 
	    {
	    	test = extent.createTest(guiTestCaseName()+" To verify Next and last page is enabled");
	    	List<WebElement> dataGrid = driver.findElements(By.className("DataGridRow"));
	    	test.info("Designation name found in Firstpage are"+dataGrid.size());
	    	demo.isEnabled(desg.NextPageButton,"Next page button", test,driver);
	    	demo.isEnabled(desg.LastPageButton,"Last page button", test,driver);
	    }
	    	else {
	        	Designationtexbox();
	        }
	  }
	@Test(priority = 48)
	public void Nextpageenable() throws IOException, FindFailed, InterruptedException
	{
		if(desg.NextPageButton.isEnabled())
		{
			desg.NextPageButton.click();
			viewdataget1();
			test = extent.createTest(guiTestCaseName()+" To verify Click on the Next, First and Previous are enabled");
			List<WebElement> dataGridRows1 = driver.findElements(By.className("DataGridRow"));
			test.info("Designation name found in NextPage are"+dataGridRows1.size());
			demo.isEnabled(desg.FirstPageButton,"First page button", test,driver);
			demo.isEnabled(desg.PreviousPageButton,"PreviousPageButton", test,driver);
		}
		else {
			test.fail("Next Page button is not enabled");
		}
		
	}
	@Test(priority = 49)
	public void previouspageenabled() throws FindFailed, IOException, InterruptedException
	{
		if(desg.PreviousPageButton.isEnabled())
		{
			desg.PreviousPageButton.click();
			viewdataget1();
			test = extent.createTest(guiTestCaseName()+" To verify Click on the Previous, First and Previous are enabled");
			List<WebElement> dataGridRows2 = driver.findElements(By.className("DataGridRow"));
			test.info("Designation name found in Previous Page are"+dataGridRows2.size());
			demo.isEnabled(desg.NextPageButton,"Next page button", test,driver);
	    	demo.isEnabled(desg.LastPageButton,"Next page button", test,driver);
		}
		else {
			test.fail("PreviousPageButton is not enabled");
		}	
			
	}
	@Test(priority = 50)
	public void Lastpageenabled() throws FindFailed, IOException, InterruptedException
	{
		if(desg.LastPageButton.isEnabled())
		{
			desg.LastPageButton.click();
			viewdataget1();
			test = extent.createTest(guiTestCaseName()+" To verify Click on the Last, First and Previous are enabled");
			List<WebElement> dataGridRows3 = driver.findElements(By.className("DataGridRow"));
			test.info("Designation name found in Last Page are"+dataGridRows3.size());
			demo.isEnabled(desg.FirstPageButton,"First page button", test,driver);
			demo.isEnabled(desg.PreviousPageButton,"PreviousPageButton", test,driver);
		}
		else {
			test.fail("LastPageButton is not enabled");
		}
	}
	@Test(priority = 51)
	public void FirstPageEnabled() throws FindFailed, IOException, InterruptedException
	{
		if(desg.FirstPageButton.isEnabled())
		{
			desg.FirstPageButton.click();
			viewdataget1();
			test = extent.createTest(guiTestCaseName()+" To verify Click on the First, Next and Last are enabled");
			List<WebElement> dataGridRows4 = driver.findElements(By.className("DataGridRow"));
			test.info("Designation name found in First Page are"+dataGridRows4.size());
			demo.isEnabled(desg.NextPageButton,"Next page button", test,driver);
	    	demo.isEnabled(desg.LastPageButton,"Last page button", test,driver);
		}
		else {
			test.fail("First Page button is not enabled");
		}
	}

	@Test(priority = 52)
	public void Searchelementnext() throws IOException, FindFailed, InterruptedException
	{
		test = extent.createTest(guiTestCaseName()+" To verify Search item in the Next page button");
		if(desg.NextPageButton.isEnabled())
		{
			desg.NextPageButton.click();
			Thread.sleep(1000);
			viewdataserachfun(test,driver);
		}
		else {
			test.fail("Next Page button is not enabled");
		}
		
	}
	
	
	@Test(priority = 53)
	public void Searchempty() throws IOException, FindFailed
	{
		test = extent.createTest(funTestCaseName()+" To verify Search invaliddata it should display the empty data");
		edit("D:\\Help\\Designation\\Search.PNG");
	    WebElement searchBox = driver.switchTo().activeElement();
	    searchBox.sendKeys("Z908");
	    List<WebElement> dataGridRows = driver.findElements(By.className("DataGridRow"));
	    
	    if (dataGridRows.size()==0) {
	    	test.pass("Search Sitename Not displayed "+dataGridRows.size());
	    }
	    else
	    {
	    	test.fail("Search Sitename displayed "+dataGridRows.size());
	    }
	}
	
	
	

	public void edit(String Name) throws IOException, FindFailed
	{
		      
		        imagePath = Name;
		        s = new Screen();
		        Pattern textPattern = new Pattern(imagePath);
		        match = s.find(textPattern);
		        match.click();
	}

	public void DesignationDelete(ExtentTest test) throws InterruptedException, IOException
	{
		Sitesave1("Designation Delete", "Do you want to delete the Designation?", "Designation Delete", "Do you want to delete the Designation?",0,driver,test);
	}
	public void DesignationDeleteconfrimation(ExtentTest test) throws InterruptedException, IOException
	{
		Sitesave1("Designation Configuration", "Designation data deleted.", "Designation Delete", "Designation data deleted.",0,driver,test);
	}
	 public void DesignationSave(ExtentTest test) throws InterruptedException, IOException
	 {
		Thread.sleep(1000);
		randomstring();
		WebElement Designationsave=driver.findElement(By.name(selectedOption));
		Actions action=new Actions(driver);
		action.moveToElement(Designationsave).perform();
		action.moveByOffset(-5,0).click().perform();
		demo.isSelected(Designationsave, "Designation save", test,driver);
	 	desg.Save.click();
	 	Sitesave1("Designation Configuration", "Designation data saved.", "Designation Configuration", "Designation data saved.",0,driver,test);
	 }
	 
	 
	 public void Designationconfig(ExtentTest test1) throws IOException {
		    try {
		        ArrayList<HashMap<String, String>> dataEntries = class1.getDataFromDatabaseDesignation();
		        StringBuilder tableHtml = new StringBuilder();
		        tableHtml.append("<table style='font-size: 16px; border-collapse: separate; border-spacing: 10px;'>");
		        tableHtml.append("<tr>");
		        for (String columnName : dataEntries.get(0).keySet()) {
		            tableHtml.append("<th>").append(columnName).append("</th>");
		        }
		        tableHtml.append("</tr>");
		        for (HashMap<String, String> entry : dataEntries) {
		            tableHtml.append("<tr>");
		            for (String columnName : entry.keySet()) {
		                String value = entry.get(columnName);
		                tableHtml.append("<td>").append(value).append("</td>");
		            }
		            tableHtml.append("</tr>");
		        }
		        tableHtml.append("</table>");
		        test1.pass(MarkupHelper.createLabel(tableHtml.toString(), ExtentColor.WHITE));

		    } catch (ClassNotFoundException | SQLException e) {
		        e.printStackTrace();
		        test1.error("Failed to retrieve data from the database.");
		        extent.flush();
		    }
		}
	 
		
		public void viewdataserachfun(ExtentTest Test,WebDriver driver) throws IOException, FindFailed, InterruptedException {
			   
		    List<WebElement> Listrow = driver.findElements(By.className("DataGridRow"));

		    for (WebElement link : Listrow) {
		        List<WebElement> datarow = driver.findElements(By.className("DataGridCell"));
		        Random random = new Random();
		        int randomOddIndex = random.nextInt((datarow.size() / 2) + 1) * 2;
		        
		        if (randomOddIndex < datarow.size()) {
		            WebElement randomOddElement = datarow.get(randomOddIndex);
		            String linkText = randomOddElement.getText();
		            
		            edit("D:\\Help\\Designation\\Search.PNG");
		            
		            WebElement searchBox = driver.switchTo().activeElement();
		            searchBox.sendKeys(linkText);
		           List<WebElement> dataGridRows = driver.findElements(By.className("DataGridRow"));
		           
		           if (dataGridRows.size()!=0) {
		                WebElement data=driver.findElements(By.className("DataGridCell")).get(2);
		              
		                
		                if (data.getText().contains(linkText)) {
		                	Test.pass(linkText + " Searched element found");
		                  
		                } 
		               else {
		            	   Test.fail(linkText + " Searched element not found");
		               }
		           } else {
		        	   WebElement data=driver.findElements(By.className("DataGridCell")).get(4);
		               
		               if (data.getText().contains(linkText)) {
		            	   Test.pass(linkText + " Searched element found");
		               } 
		              else {
		            	  Test.fail(linkText + " Searched element not found");
		              }

		            }
		            // Clear the search box
		            searchBox.clear();
		            Thread.sleep(1000);
		            demo.isempty(searchBox, linkText, Test, driver);
		        }
		    }
		    }
		
		public void viewdataserachfundelete(ExtentTest Test, WebDriver driver) throws IOException, FindFailed, InterruptedException {
			   
		    List<WebElement> Listrow = driver.findElements(By.className("DataGridRow"));

		    for (WebElement link : Listrow) {
		        List<WebElement> datarow = driver.findElements(By.className("DataGridCell"));
		        Random random = new Random();
		        int randomOddIndex = random.nextInt((datarow.size() / 2) + 1) * 2;
		        
		        if (randomOddIndex < datarow.size()) {
		            WebElement randomOddElement = datarow.get(randomOddIndex);
		            String linkText = randomOddElement.getText();
		            
		            edit("D:\\Help\\Designation\\Search.PNG");
		           
		            WebElement searchBox = driver.switchTo().activeElement();
		            searchBox.click();
		            searchBox.sendKeys(linkText);
		           List<WebElement> dataGridRows = driver.findElements(By.className("DataGridRow"));
		           
		           if (dataGridRows.size()!=0) {
		                WebElement data=driver.findElements(By.className("DataGridCell")).get(2);
		                
		                if (data.getText().contains(linkText)) {
		                	Test.pass(linkText + " Searched element found");
		                    Thread.sleep(1000);
		                    deleteok();
		                } 
		               else {
		            	   Test.fail(linkText + " Searched element not found");
		               }
		           } else {
		        	   WebElement data=driver.findElements(By.className("DataGridCell")).get(4);
		               
		               if (data.getText().contains(linkText)) {
		            	   Test.pass(linkText + " Searched element found");
		               } 
		              else {
		            	  Test.fail(linkText + " Searched element not found");
		              }

		            }
		            // Clear the search box
		            searchBox.clear();
		            Thread.sleep(1000);
		            demo.isempty(searchBox, linkText, test, driver);
		        }
		    }
		    }
		public void viewdataget(ExtentTest Test) throws IOException, FindFailed, InterruptedException, ClassNotFoundException, SQLException {
		    ArrayList<HashMap<String, String>> dataEntries = class1.getDataFromDatabaseDesignation();
		    List<WebElement> Listrow = driver.findElements(By.className("DataGridRow"));
		    StringBuilder tableHtml = new StringBuilder();
		    tableHtml.append("<table style='font-size: 16px; border-collapse: separate; border-spacing: 10px;'>");
		    tableHtml.append("<tr><th>DatabaseDesignationName</th><th>AppDesignationName</th><th>DatabasePrescriptionValue</th><th>AppPrescriptionValue</th></tr>");

		    for (WebElement row : Listrow) {
		        List<WebElement> datarow = row.findElements(By.className("DataGridCell"));

		        if (datarow.size() >= 4) {
		            String cell3Text = datarow.get(2).getText();
		            String cell4Text = datarow.get(3).getText();
		            
		            for (HashMap<String, String> entry : dataEntries) {
		                String databaseDesignation = entry.get("DesignationName"); // Assuming "DesignationName" is the database column name
		                String databasePrescription = entry.get("Prescription"); // Assuming "Prescription" is the database column name

		                if (cell3Text.equals(databaseDesignation) || cell4Text.equals(databasePrescription)) {
		                    // Add the matching pair to the HTML table
		                    tableHtml.append("<tr><td>").append(cell3Text).append("</td><td style='margin-left: 10px;'>").append(databaseDesignation)
		                            .append("</td><td style='margin-left: 10px;'>").append(cell4Text).append("</td><td style='margin-left: 10px;'>")
		                            .append(databasePrescription).append("</td></tr>");
		                }
		            }
		        }
		    }

		    // Close the HTML table
		    tableHtml.append("</table>");

		    // Log the generated HTML table for debugging
		    System.out.println(tableHtml.toString());
		    Test.info("Total entries found in Application are "+Listrow.size()+" Database are "+dataEntries.size());

		    // Check if any matches were found before passing the table to the report
		    if (tableHtml.indexOf("<tr>") >= 0) {
		        Test.pass(MarkupHelper.createLabel(tableHtml.toString(), ExtentColor.WHITE));
		    } else {
		        Test.info("No matching data found");
		    }
		}
	
		
		public void editrefersh(String Text, ExtentTest Test) throws FindFailed, IOException
		{
			 desg.designationName.click();
			 randomLower(15);
			 driver.switchTo().activeElement().sendKeys(randomStringLower);
			 WebElement Designationsave=driver.findElement(By.name(selectedOption));
			 Actions action=new Actions(driver);
			 action.moveToElement(Designationsave).perform();
			 action.moveByOffset(-5,0).click().perform();
			 edit(Text);
			 demo.isempty(desg.designationName, "Empty", test, driver);
			 demo.BydefaultisSelected(desg.yes, "Yes", test,driver);
		     demo.BydefaultisSelected(desg.no, "No", test,driver);
		}
		
		public void editdatarefersh(String Text, ExtentTest Test) throws FindFailed, IOException
		{
			 desg.designationName.click();
			 driver.switchTo().activeElement().clear();
			 randomLower(15);
			 desg.designationName.click();
			 driver.switchTo().activeElement().sendKeys(randomStringLower);
			 WebElement Designationsave=driver.findElement(By.name(selectedOption));
			 Actions action=new Actions(driver);
			 action.moveToElement(Designationsave).perform();
			 action.moveByOffset(-5,0).click().perform();
			 edit(Text);
		}
		
	
	
	 
	 
		
		
		
	 // Search textbox should be check	
	 
	 //Once deleted same name providing
	 
}
