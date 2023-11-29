package com.krystal.project;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.appium.java_client.windows.WindowsDriver;

public class APRSettings extends ReferencefileChemotheraphy{

	 WebElement Role;
		private WebElement select;
		private RolePOM rol;
		private WebElement select1;
		APRSettingsPOM apr;

		@BeforeClass
			public void setUp1()  throws InterruptedException, IOException {
			DesiredCapabilities appCapabilities = new DesiredCapabilities();
			appCapabilities.setCapability("app", "C:\\Program Files\\Panacea Medical Technologies\\Krystal\\Krystal.exe");
			driver = new WindowsDriver<WebElement>(new URL("http://127.0.0.1:4723"), appCapabilities);
			ReferenceSigin Sign=new ReferenceSigin();
			Sign.Login(driver);
			Sign.APRSettings(driver);
			apr=new APRSettingsPOM(driver);
		  }
		
		@Test(priority =1)
		public void GeneralSettings() throws IOException {
		test = extent.createTest(guiTestCaseName()+" General Settings label"," General Settings label should be present ");	
		demo.Textcomparsion(apr.generalsettings, "General Settings", test,driver);
		}
	 @Test(priority =2)
		public void Aprconfiguration() throws IOException {
		test = extent.createTest(guiTestCaseName()+" APR CONFIGURATION label"," APR CONFIGURATION label should be present ");	
		demo.Textcomparsion(apr.AprConfiguration, "APR CONFIGURATION", test,driver);
		}
	 @Test(priority =3)
		public void Aprid() throws IOException {
		test = extent.createTest(guiTestCaseName()+" APR ID label"," APR ID label should be present ");	
		demo.Textcomparsion(apr.aprid, "APR ID", test,driver);
		}
	 @Test(priority =4)
		public void Aprsitelist() throws IOException {
		test = extent.createTest(guiTestCaseName()+" APR Site List label"," APR Site List label should be present ");	
		demo.Textcomparsion(apr.aprsitelist, "APR Site List", test,driver);
		}
	 @Test(priority =5)
		public void Site11() throws IOException {
		test = extent.createTest(guiTestCaseName()+" Site label"," Site label should be present ");	
		demo.Textcomparsion(apr.aprsite, "Site", test,driver);
		}
	 @Test(priority =6)
		public void Head() throws IOException {
		test = extent.createTest(guiTestCaseName()+" Head label"," Head label should be present ");	
		demo.Textcomparsion(apr.sitehead, "Head", test,driver);
		}
	 @Test(priority =9)
		public void Aprimagingtype() throws IOException {
		test = extent.createTest(guiTestCaseName()+" APR Imaging Type label"," APR Imaging Type label should be present ");	
		demo.Textcomparsion(apr.aprimagingtype, "APR Imaging Type", test,driver);
		}
	@Test(priority =10)
		public void Imagingtype() throws IOException {
		test = extent.createTest(guiTestCaseName()+" Imaging Type label","  Imaging Type label should be present ");	
		demo.Textcomparsion(apr.imagingtype, "Imaging Type", test,driver);
		}
	@Test(priority =11)
	public void Aprlat() throws IOException {
	test = extent.createTest(guiTestCaseName()+" AP label"," AP label should be present ");	
	demo.Textcomparsion(apr.ap, "AP", test,driver);
	}
	@Test(priority =12)
	public void Apllat() throws IOException {
	test = extent.createTest(guiTestCaseName()+" PA label"," PA label should be present ");	
	demo.Textcomparsion(apr.pa, "PA", test,driver);
	}
	@Test(priority =13)
	public void Parlat() throws IOException {
	test = extent.createTest(guiTestCaseName()+" RLAT label"," RLAT label should be present ");	
	demo.Textcomparsion(apr.rlat, "RLAT", test,driver);
	}
	@Test(priority =14)
	public void Pallat() throws IOException {
	test = extent.createTest(guiTestCaseName()+" LLAT label"," LLAT label should be present ");	
	demo.Textcomparsion(apr.llat, "LLAT", test,driver);
	}
	@Test(priority =15)
	public void Stereocustom() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Stereo Custom label"," Stereo Custom label should be present ");	
	demo.Textcomparsion(apr.stereocustom, "Stereo Custom", test,driver);
	}
	@Test(priority =16)
	public void Aprpatientsize() throws IOException {
	test = extent.createTest(guiTestCaseName()+" APR Patient Size label"," APR Patient Size label should be present ");	
	demo.Textcomparsion(apr.aprpatientsize, "APR Patient Size", test,driver);
	}
	@Test(priority =17)
	public void Patientsize() throws IOException {
	test = extent.createTest(guiTestCaseName()+"  Patient Size label","  Patient Size label should be present ");	
	demo.Textcomparsion(apr.patientsize, "Patient Size", test,driver);
	}
	@Test(priority =18)
	public void Paediatric() throws IOException {
	test = extent.createTest(guiTestCaseName()+"  Paediatric label","  Paediatric label should be present ");	
	demo.Textcomparsion(apr.paediatric, "Pediatric", test,driver);
	}
	@Test(priority =19)
	public void Small() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Small label","  Small label should be present ");	
	demo.Textcomparsion(apr.small, "Small", test,driver);
	}
	@Test(priority =20)
	public void Medium() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Medium label","  Medium label should be present ");	
	demo.Textcomparsion(apr.medium, "Medium", test,driver);
	}
	@Test(priority =21)
	public void Large() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Large label"," Large label should be present ");	
	demo.Textcomparsion(apr.large, "Large", test,driver);
	}
	@Test(priority =22)
	public void kv() throws IOException {
	test = extent.createTest(guiTestCaseName()+" kV label"," kV label should be present ");	
	demo.Textcomparsion(apr.kv, "kV", test,driver);
	}
	@Test(priority =23)
	public void ma() throws IOException {
	test = extent.createTest(guiTestCaseName()+" mA label"," mA label should be present ");	
	demo.Textcomparsion(apr.ma, "mA", test,driver);
	}
	@Test(priority =24)
	public void ms1() throws IOException {
	test = extent.createTest(guiTestCaseName()+" ms label"," ms label should be present ");	
	demo.Textcomparsion(apr.ms, "ms", test,driver);
	}
	@Test(priority =25)
	public void Dosecgy() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Dose(cGy) label"," Dose(cGy) label should be present ");	
	demo.Textcomparsion(apr.dosecgy, "Dose (cGy)", test,driver);
	}
	@Test(priority =26)
	public void Aprlist() throws IOException {
	test = extent.createTest(guiTestCaseName()+" APR LIST label"," APR LIST label should be present ");	
	demo.Textcomparsion(apr.aprlist, "APR LIST", test,driver);
	}
	@Test(priority =27)
	public void Selectmachine() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Select Machine label"," Select Machine label should be present ");	
	demo.Textcomparsion(apr.selectmachine, "Select Machine", test,driver);
	}
	@Test(priority =28)
	public void Searchaprid() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Search APR ID label"," Search APR ID label should be present ");	
	demo.Textcomparsion(apr.searchaprid, "Search APR ID", test,driver);
	}
	@Test(priority =29)
	public void Aprid1() throws IOException {
	test = extent.createTest(guiTestCaseName()+"  APR ID label","  APR ID label should be present ");	
	demo.Textcomparsion(apr.aprid1, "APR ID", test,driver);
	}
	@Test(priority =30)
	public void Createddate() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Created Date label","  Created Date label should be present ");	
	demo.Textcomparsion(apr.createddate, "Created Date", test,driver);
	}
	@Test(priority =31)
	public void modifieddate() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Modified Date label","  Modified Date label should be present ");	
	demo.Textcomparsion(apr.modifieddate, "Modified Date", test,driver);
	}
	
	
	
	
	//********************************************FUN*****************************************************
	@Test(priority =32)
	public void databaseconnectionemptycheck() throws IOException
	{
		test = extent.createTest(funTestCaseName()+" To verify the Empty Database for APRIDModels");
		data(test);
		 test = extent.createTest(funTestCaseName()+" To verify the Empty Database for  APRDataModels");
		dataapr(test);
	}
	
	@Test(priority = 33)
	public void APRSmall() throws ClassNotFoundException, SQLException, IOException, InterruptedException
	{
		
		 String[] Elements= {"AP", "PA", "RLAT", "LLAT","Stereo Custom"};
		 String[] webElements = {"Pediatric", "Small", "Medium", "Large"};

	        // Iterate over the array and perform actions on each element
		 ArrayList<String> SiteName = class1.Site();
		 
         for (String siteName : SiteName) {
         	WebElement element1=driver.findElement(By.name(siteName));
         	Actions action=new  Actions(driver);
         	action.moveToElement(element1).click().perform();
         	{
		 for (String elementnew:Elements)
		 {
			 WebElement Size1=driver.findElement(By.name(elementnew));
			 Size1.click();
			 
		 
	        for (String element : webElements) {
	           WebElement Size=driver.findElement(By.name(element));
	           Size.click();
	           KV();
	           mA();
	           ms();
	        }
		 }
		 funAPRValid();
		 saveapr();
		 break;
		
         	}
         }
	}
	
	@Test(priority =34)
	public void databaseconnectionExceution() throws IOException
	{
		test = extent.createTest(funTestCaseName()+" To verify the Saved data to Database for APRIDModels");
		data(test);
		 test = extent.createTest(funTestCaseName()+" To verify the Saved data to Database for APRDataModels");
		dataapr(test);
	}
	//===========================================VIEW===============================
		@Test(priority =35)
		public void View() throws Exception
		{
			 Roleconfig("D:\\Help\\APR\\View.PNG");
			 test = extent.createTest(funTestCaseName()+ "Click on View Button, View Pop-up screen is displayed");
			 WebElement slno=driver.findElement(By.name("Sl No"));
			 demo.isdisplayed(slno, "Sl No", test, driver); 
		}
		@Test(priority = 36)
		public void SlNo() throws IOException
		{
			 test = extent.createTest(guiTestCaseName()+ "Sl no label");
			 demo.Textcomparsion(apr.SlNo, "Sl No", test,driver);
		}
		@Test(priority = 37)
		public void Site1() throws IOException
		{
			 test = extent.createTest(guiTestCaseName()+ "Site label");
			 demo.Textcomparsion(apr.Site, "Site", test,driver);
		}
		@Test(priority = 38)
		public void ImagingType() throws IOException
		{
			 test = extent.createTest(guiTestCaseName()+ "Imaging Type label");
			 demo.Textcomparsion(apr.ImagingType, "Imaging Type", test,driver);
		}
		@Test(priority = 39)
		public void PatientSize1() throws IOException
		{
			 test = extent.createTest(guiTestCaseName()+ "Patient Size label");
			 demo.Textcomparsion(apr.PatientSize, "Patient Size", test,driver);
		}
		@Test(priority = 40)
		public void kv1() throws IOException
		{
			test = extent.createTest(guiTestCaseName()+ "KV label");
			demo.Textcomparsion(apr.kV1, "kV", test,driver);
		}
		@Test(priority = 41)
		public void mA1() throws IOException
		{
			test = extent.createTest(guiTestCaseName()+ "mA label");
			demo.Textcomparsion(apr.mA1, "mA", test,driver);
		}
		@Test(priority = 42)
		public void ms2() throws IOException
		{
			test = extent.createTest(guiTestCaseName()+ "ms label");
			demo.Textcomparsion(apr.ms1, "ms", test,driver);
		}
		@Test(priority = 43)
		public void Dose() throws IOException
		{
			test = extent.createTest(guiTestCaseName()+ "Dose label");
			demo.Textcomparsion(apr.Dose, "Dose", test,driver);
		}
		@Test(priority = 44)
		public void Doseindication() throws IOException
		{
			test = extent.createTest(guiTestCaseName()+ "Dose label");
			demo.Textcomparsion(apr.Doseindication, "*Dose - cGy", test,driver);
		}
	
	@Test(priority = 45)
	public void viewdataget1() throws IOException, FindFailed, InterruptedException
	{
		test = extent.createTest(guiTestCaseName()+ "To verify the datagrid elements");
		List<WebElement> Listrow = driver.findElements(By.className("DataGridRow"));
		for (WebElement link : Listrow)
		{
			List<WebElement> datarow = driver.findElements(By.className("DataGridCell"));
			StringBuilder tableHtml = new StringBuilder();
	        tableHtml.append("<table><tr><th><b>Column</b></th><th><b>Value</b></th></tr>");
				for (WebElement datalink : datarow)
				{
					 String linkText = datalink.getText();
					 tableHtml.append("<tr><td>").append("Link test").append("</td><td style='margin-left: 10px;'>").append(linkText).append("</td></tr>");
			    }
				 tableHtml.append("</table>");
				 test.pass(MarkupHelper.createLabel(tableHtml.toString(), ExtentColor.GREY));
				break;	
        }
	test = extent.createTest(guiTestCaseName()+ "Click on Close icon, Pop-up should get closed");
	Roleconfig("D:\\Help\\APR\\AClose.PNG"); 
	Thread.sleep(1000);
	demo.isdisplayed(apr.AprConfiguration,"APR Configuration",test,driver);
	}
	
	

	@Test(priority =46)
	public void search() throws IOException, FindFailed
		{
		test = extent.createTest(funTestCaseName()+ "Click on the Search icon, Element should be searched"); 
		Roleconfig("D:\\Help\\APR\\SearchAPR.PNG");
		driver.switchTo().activeElement().sendKeys(randomString);
		String Text=driver.switchTo().activeElement().getText();
	if(Text.equals(randomString))
	{
		test.pass("Serached element found");
	}
	else
	{
		test.fail("Serached element not found");
	}
		}
	@Test(priority = 47)	
	 public void APRtestboxadd() throws FindFailed, IOException
	 {
		 test = extent.createTest(funTestCaseName()+ "Click on the Add icon, APR textbox should get empty"); 
		 randomUpper(30);
	     validcaserefersh(randomStringUpper, test);
		 Roleconfig("D:\\Help\\Role\\Radd.PNG"); 
		 apr.aprid.click();
		 demo.isempty(apr.aprid, "APRID",test, driver);
	 }
		@Test(priority =48)
	 public void APRtestboxrefersh() throws FindFailed, IOException
	 {
		 test = extent.createTest(funTestCaseName()+ "Click on the Refersh icon, APR textbox should get empty"); 
		 randomUpper(30);
	     validcaserefersh(randomStringUpper, test);
		 Roleconfig("D:\\Help\\Role\\Refersh.PNG"); 
		 apr.aprid.click();
		 demo.isempty(apr.aprid, "APRID",test, driver);
	 }
		@Test(priority =49)
		public void delete() throws IOException, InterruptedException, FindFailed
		{
			try {
			 Roleconfig("D:\\Help\\APR\\Delete.PNG"); 
			 test = extent.createTest(funTestCaseName()+ "Click on the delete icon, Click on the cancel button");
			 Rollcontainscancel("APR delete", "Do you want to delete the APR data", "APR delete", "Do you want to delete the APR data",test,driver);
			}
			catch(Exception e)
			{
				 test.error("An error occurred: " + e.getMessage());
			}
			 test = extent.createTest(funTestCaseName()+ "Click on the delete icon, Click on the OK button");
			 Roleconfig("D:\\Help\\APR\\Delete.PNG"); 
			 Rollcontains("APR delete", "Do you want to delete the APR data", "APR delete", "Do you want to delete the APR data",test,driver);
			 Sitesave("APR delete","Selected APR details deleted.", "APR delete","Selected APR details deleted.",1, driver);
		}
		@Test(priority =50)
		public void databaseconnectiondeleted() throws IOException
		{
			test = extent.createTest(funTestCaseName()+" To verify the Datadeleted should be empty in Database for APRIDModels");
			data(test);
			 test = extent.createTest(funTestCaseName()+" To verify the Datadeleted should be empty data to Database for APRDataModels");
			dataapr(test);
		}
		
		
		@Test(priority =51)
		public void APRlarge() throws ClassNotFoundException, SQLException, IOException, InterruptedException
		{
			 String[] Elements= {"AP", "PA", "RLAT", "LLAT","Stereo Custom"};
			 String[] webElements = {"Pediatric", "Small", "Medium", "Large"};

		        // Iterate over the array and perform actions on each element
			 ArrayList<String> SiteName = class1.Site();
			 
	         for (String siteName : SiteName) {
	         	WebElement element1=driver.findElement(By.name(siteName));
	         	Actions action=new  Actions(driver);
	         	action.moveToElement(element1).click().perform();
	         	{
			 for (String elementnew:Elements)
			 {
				 WebElement Size1=driver.findElement(By.name(elementnew));
				 Size1.click();
		         for (String element : webElements) {
		           WebElement Size=driver.findElement(By.name(element));
		           Size.click();
		           KV();
		           mA();
		           ms();
		        }
		         
			 }
	         	}
	         }
	         funAPRIDinvalid();
	 		 funAPRIDtextbox();
		}
		
		
	
	@Test(priority =52)
	public void copy() throws IOException, InterruptedException, FindFailed
	{
		test = extent.createTest(funTestCaseName()+ "Click on the Copy button, the data should be copied");
		 Roleconfig("D:\\Help\\APR\\Copy.PNG"); 
		apr.aprid.click();
		String APRdetails=driver.switchTo().activeElement().getText();
		if(APRdetails.contains("_Copy"))
		{
			test.pass("APR ID textbox data added "+APRdetails+"with the Copy Keyword");
		}
		else
		{
			test.fail("APR ID textbox data added "+APRdetails+"with no Copy Keyword");
		}
		test = extent.createTest(funTestCaseName()+ "Click on the Save button once Copyed, the pop-up should get displayed");
		if(apr.Save.isEnabled())
		{
		apr.Save.click();
		test = extent.createTest(funTestCaseName()+ "Save pop-up window, when click on the Copy button");
		//Rollcontains("APR delete","Only completely configured site data", "APR delete","Only completely configured site data",test, driver);
		Sitesave("APR Configuration","APR data saved.", "APR Configuration","APR data saved.",1, driver);
		}
		else
		{
			test.fail("Save button is not enabled");
		}
		
	}
	
	@Test(priority =5)
	public void Edit() throws IOException, InterruptedException, FindFailed
	{
		test = extent.createTest(funTestCaseName()+ "Click on the Edit button, Update button should be enabled");
		 Roleconfig("D:\\Help\\APR\\Edit.PNG");
		if(apr.Update.isEnabled())
		{
		demo.isEnabled(apr.Update, "UPDATE", test, driver);
		demo.Textcomparsion(apr.Update, "UPDATE", test, driver);
	   test = extent.createTest(funTestCaseName()+ "Click on the Update button, without changes in the data");
	   apr.Update.click();
	 //  Rollcontains("APR delete","Only completely configured site data", "APR delete","Only completely configured site data",test, driver);
	   Sitesave("APR Configuration","APR data updated.", "APR Configuration","APR data updated.",1, driver);
		}
	   else
		{
			test.fail("Update button is not enabled");
		}
		 test = extent.createTest(funTestCaseName()+ "Click on the Edit button, APR ID textfield should be in disabled");
		 randomUpper(30);
		
		 driver.switchTo().activeElement().sendKeys(randomStringUpper);
		 demo.ByInvalidErrormessage(apr.aprid, randomStringUpper,test,driver);

	}
	@Test(priority =8)
	public void databaseconnectionEdit() throws IOException
	{
		test = extent.createTest(funTestCaseName()+" To verify the Saved data to Database for APRIDModels");
		data(test);
		 test = extent.createTest(funTestCaseName()+" To verify the Saved data to Database for APRDataModels");
		dataapr(test);
	}
	
public void Roleconfig(String Text) throws FindFailed {
	 Screen screen = new Screen();
	 String imagePath = Text;
	 Pattern pattern = new Pattern(imagePath);
     Match match = screen.find(pattern);
     match.click();
 }
	public void KV()
	{
		WebElement KV=driver.findElements(By.className("ComboBox")).get(1);
		KV.click();
		WebElement One=driver.findElement(By.name("1"));
		Actions action=new Actions(driver);
		action.moveToElement(One).click().perform();
	}
	
	public void mA()
	{
		WebElement mA=driver.findElements(By.className("ComboBox")).get(2);
		mA.click();
		WebElement Two=driver.findElement(By.name("1"));
		Actions action=new Actions(driver);
		action.moveToElement(Two).click().perform();
	}
	
	public void ms()
	{
		WebElement mS=driver.findElements(By.className("ComboBox")).get(3);
		mS.click();
		WebElement first=driver.findElement(By.name("1"));
		Actions action=new Actions(driver);
		action.moveToElement(first).click().perform();
	}
	

	public void sitename()
	{
		 try {
	            ArrayList<String> siteNames = class1.Site();
	            for (String siteName : siteNames) {
	            	WebElement element=driver.findElement(By.name(siteName));
	            	Actions action=new  Actions(driver);
	            	action.moveToElement(element).click().perform();
	            	System.out.println(element);
	            	//element.click();
	            	break;                
	            }
	        } catch (ClassNotFoundException e) {
	        	 test.error("An error occurred: " + e.getMessage());
	        } catch (SQLException e) {
	        	 test.error("An error occurred: " + e.getMessage());
	        }
	}
	
	 public void invalidcase(String Text, String InputText, String ExceptedDescription, ExtentTest test1) throws IOException
	 {
		 apr.aprid.click();
		 driver.switchTo().activeElement().clear();
		 driver.switchTo().activeElement().sendKeys(Text); 
	 }
	 
	 public void data(ExtentTest test1) throws IOException
		{
			 try {
				 ArrayList<HashMap<String, String>> dataEntries = class1.getDataFromDatabaseAPR();
		           
		            StringBuilder tableHtml = new StringBuilder();
			        tableHtml.append("<table><tr><th><b>Column Name</b></th><th><b>Value</b></th></tr>");
			        // Iterate through the data and add rows to the table
			        for (HashMap<String, String> entry : dataEntries) {
			            for (String columnName : entry.keySet()) {
			                String value = entry.get(columnName);
			                tableHtml.append("<tr><td>").append(columnName).append("</td><td style='margin-left: 50px;'>").append(value).append("</td></tr>");
			            }
			        }

			        tableHtml.append("</table>");
			        test1.pass(MarkupHelper.createLabel(tableHtml.toString(), ExtentColor.GREY));
		         
		        } catch (ClassNotFoundException | SQLException e) {
		            e.printStackTrace();
		            test1.error("Failed to retrieve data from the database.");
		            extent.flush();
		        }
		}
	
		public void dataapr1(ExtentTest test1) throws IOException
		{
			 try {
		            ArrayList<HashMap<String, String>> dataEntries = class1.getDataFromDatabaseAPR();
		           
		            StringBuilder tableHtml = new StringBuilder();
			        tableHtml.append("<table><tr><th><b>Column Name</b></th><th><b>Value</b></th></tr>");
			        // Iterate through the data and add rows to the table
			        for (HashMap<String, String> entry : dataEntries) {
			            for (String columnName : entry.keySet()) {
			                String value = entry.get(columnName);
			                tableHtml.append("<tr><td>").append(columnName).append("</td><td style='margin-left: 50px;'>").append(value).append("</td></tr>");
			            }
			        }

			        tableHtml.append("</table>");
			        test1.pass(MarkupHelper.createLabel(tableHtml.toString(), ExtentColor.BROWN));
		        } catch (ClassNotFoundException | SQLException e) {
		            e.printStackTrace();
		            test1.error("Failed to retrieve data from the database.");
		            extent.flush();
		        }
		}
		public void dataapr(ExtentTest test1) throws IOException {
		    try {
		        ArrayList<HashMap<String, String>> dataEntries = class1.getDataFromDatabaseAPR();

		        // Create an HTML table as a string to represent the data
		        StringBuilder tableHtml = new StringBuilder();
		        tableHtml.append("<table><tr><th><b>Column Name</b></th><th><b>Value</b></th></tr>");

		        // Iterate through the data and add rows to the table
		        for (HashMap<String, String> entry : dataEntries) {
		            for (String columnName : entry.keySet()) {
		                String value = entry.get(columnName);
		                tableHtml.append("<tr><td>").append(columnName).append("</td><td style='margin-left: 10px;'>").append(value).append("</td></tr>");
		            }
		        }

		        tableHtml.append("</table>");
		        test1.pass(MarkupHelper.createLabel(tableHtml.toString(), ExtentColor.GREY));
		      

		    } catch (ClassNotFoundException | SQLException e) {
		        e.printStackTrace();
		        test1.error("Failed to retrieve data from the database.");
		        extent.flush();
		    }
		}
		
		
		public void funAPRIDtextbox() throws IOException, InterruptedException
		 {
			     test = extent.createTest(funTestCaseName()+" To verify the APRID Textbox");	
			     randomUpper(30);
			     validcase(randomStringUpper,test);
			 
				 test =extent.createTest(funTestCaseName()+" APRID Entered Lowercase with Spaces");
				 randomLower(30);
				 validcase(randomStringLower,test);
				 
				 test =extent.createTest(funTestCaseName()+" APRID Entered Uppercase and lowercase with Spaces");
				 randomalpha(30);
				 validcase(randomStringalpha,test);
				 
				 test =extent.createTest(funTestCaseName()+" APRID Entered Numbers");
				 randomNumber(30);
				 validcase(randomStringNumber,test);
				 
				 test =extent.createTest(funTestCaseName()+" APRID Entered Ahabhets,numbers,specalchars");
				 randomstringtext(30);
				 validcase(randomString,test);
				 saveapr();
		 }
		
		public void funAPRValid() throws IOException, InterruptedException
		{
			test =extent.createTest(funTestCaseName()+" APRID Entered Valid data and saave the data");
			 randomstringtext(30);
			 validcase(randomString,test);
			 saveapr();
		}
		
		public void funAPRIDinvalid() throws IOException
		 { 
			 try {
				
				 invalidcase("  ", "Input cannot be blank", "Input cannot be blank", test);
				 invalidsaveapr();
				 errormessagedisplayed1("Input cannot be blank","Input cannot be blank", test);
				 }
				 catch(Exception e)
				 {
					 test.error("An error occurred: " + e.getMessage());
				 } 
			 
			 try {
			
				 invalidcase(randomString, "APR ID already exists", "APR ID already exists", test);
				 invalidsaveapr();
				 errormessagedisplayed1("APR ID already exists", "APR ID already exists", test);
				 }
				catch(Exception e)
				 {
					test.error("An error occurred: " + e.getMessage());
				 } 
			 try {
				 test = extent.createTest(funTestCaseName()+ " Entered invalid  data specialchars \\,");
				 invalidcase("\\", "Input must not contain \\ , '' , '\"", "Input must not contain \\ , '' , '\"", test);
				 invalidsaveapr();
				 errormessagecontains("Input must not contain",test,driver);
				 }
				 catch(Exception e)
				 {
					 test.error("An error occurred: " + e.getMessage());
				 }
		 }
		public void validcase(String Text, ExtentTest test1)
		 {
			 try {
				 apr.aprid.click();
				 driver.switchTo().activeElement().clear();
				 driver.switchTo().activeElement().sendKeys(Text);
				 demo.ByValidErrormessage(apr.aprid, Text, test1, driver);
				 }
				 catch(Exception e)
				 {
					 test.error("An error occurred: " + e.getMessage());
				 } 
		 }
		
		public void validcaserefersh(String Text, ExtentTest test1)
		 {
			 try {
				 apr.aprid.click();
				 driver.switchTo().activeElement().sendKeys(Text);
				 demo.ByValidErrormessage(apr.aprid, Text, test1, driver);
				 }
				 catch(Exception e)
				 {
					 test.error("An error occurred: " + e.getMessage());
				 } 
		 }
		public void saveapr() throws InterruptedException, IOException
		{
			apr.Save.click();
			//test = extent.createTest(funTestCaseName()+ "Save pop-up window");
			//Rollcontains("APR delete","Only completely configured site data", "APR delete","Only completely configured site data",test, driver);
			Sitesave("APR Configuration","APR data saved.", "APR Configuration","APR data saved.",1, driver);
		}
		public void invalidsaveapr() throws InterruptedException, IOException
		{
			apr.Save.click();
			test = extent.createTest(funTestCaseName()+ "Verify Input cannot be blank error message displayed");
			Rollcontains("APR delete","Only completely configured site data", "APR delete","Only completely configured site data",test, driver);
			
		}
	 
	
		public void viewdataget() throws IOException, FindFailed, InterruptedException, ClassNotFoundException, SQLException
		{
			List<WebElement> listRow = driver.findElements(By.className("DataGridRow"));
		    List<String> webPageData = new ArrayList<>();

		    for (WebElement row : listRow) {
		        List<WebElement> dataRow = row.findElements(By.className("DataGridCell"));
		        StringBuilder rowData = new StringBuilder();

		        for (WebElement dataCell : dataRow) {
		            rowData.append(dataCell.getText()).append(" ");
		        }

		        webPageData.add(rowData.toString().trim());
		    }
		    
		    ArrayList<HashMap<String, String>> databaseData = class1.getDataFromDatabaseAPR();

		    // Step 3: Compare and print the data
		    if (webPageData.size() != databaseData.size()) {
		        test.fail("Number of rows in web page data and database data are not equal.");
		    } else {
		        for (int i = 0; i < webPageData.size(); i++) {
		            if (webPageData.get(i).equals(databaseData.get(i).toString())) {
		                test.pass("Row " + (i + 1) + ": Web Page Data matches Database Data");
		            } else {
		                test.fail("Row " + (i + 1) + ": Web Page Data does not match Database Data");
		            }
		        }
		    }
		test = extent.createTest(guiTestCaseName()+ "Click on Close icon, Pop-up should get closed");
		Roleconfig("D:\\Help\\APR\\AClose.PNG"); 
		Thread.sleep(1000);
		demo.isdisplayed(apr.AprConfiguration,"APR Configuration",test,driver);
		}
		
	
	
	
	
	@AfterSuite
	  public void tearDown() {
	      extent.flush();
	  }
}
