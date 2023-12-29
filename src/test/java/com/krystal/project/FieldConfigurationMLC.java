package com.krystal.project;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.sikuli.script.FindFailed;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.windows.WindowsDriver;

public class FieldConfigurationMLC extends ReferencefileChemotheraphy{
	 
	private FieldConfigurationPOM field;
	private Actions act;
	private Actions action;
	   
	@Test(priority =1)
	public void Launch()  throws InterruptedException, IOException {
	// 	DesiredCapabilities appCapabilities = new DesiredCapabilities();
	// 	appCapabilities.setCapability("app", "C:\\Program Files\\Panacea Medical Technologies\\Krystal\\Krystal.exe");
	 //	driver = new WindowsDriver<WebElement>(new URL("http://127.0.0.1:4723"), appCapabilities);
	 	ReferenceSigin Sign=new ReferenceSigin();
	 	Sign.Login(driver);
	 	Sign.fieldconfigsid(driver,"BHABHATRON-II MLC v2_C03");
	 	field=new FieldConfigurationPOM(driver);
	 	act=new Actions(driver);      
	 	action=new Actions(driver);   
	   }
	  @Test(priority=1, dataProvider = "testDatavalidfieldname")
		  public void ValidFieldname(String FieldnameValid,String Fieldname,String Fx, String Fy, String Colliangle) throws IOException, InterruptedException
		  {
		 	
		 	 try {
		 		fieldnamevalid1(FieldnameValid,Fieldname, Fx,Fy, Colliangle); 
		 	 }
		 	 catch(Exception e)
		 	 {
		 		 catchexceptionscreenshot(test,e) ;
		 	 }
		  }
		
	  @Test(priority=2)
	  public void Additionalsearch() throws InterruptedException, IOException
	   {
		   try {
		 		 FieldSearch();
		   }
	 		 catch(Exception e)
	 		 {
	 			 catchexceptionscreenshot(test,e) ;
	 		 }  
		 		 try {
					FieldView();
				} catch (Exception e) {
					
					 catchexceptionscreenshot(test,e) ;
				}
		 		 try {
					Fieldviewclick();
				} catch (Exception e) {
					 catchexceptionscreenshot(test,e) ;
				}
		 		 try {
					Addclick();
				} catch (Exception e) {
					
					 catchexceptionscreenshot(test,e) ;
				}
		 		 try {
					FieldEdit();
				} catch (Exception e) {
					
					 catchexceptionscreenshot(test,e) ;
				}
		 		 try {
					Fieldeditclick();
				} catch (Exception e) {
					 catchexceptionscreenshot(test,e) ;
				}
		 		 try {
					Addclick();
				} catch (Exception e) {
					 catchexceptionscreenshot(test,e) ;
				}
		 		 try {
					Fielddelete();
				} catch (Exception e) {
					 catchexceptionscreenshot(test,e) ;
				}
		 		 try {
					Fielddeleteclick();
				} catch (Exception e) {
					 catchexceptionscreenshot(test,e) ;
				}
	   }
	  
	  public void DataConfigconfig(ExtentTest test1, String Text1, String getdatabase, String getexcel, String Excelpath, String Sheetname) throws IOException {
		    try {
		    	
		        ArrayList<HashMap<String, String>> dataEntriesFromDB = class1.getDataFromDatabaseMachine(Text1);
		        ArrayList<HashMap<String, String>> dataEntriesFromExcel = class1.getDataFromExcel(Excelpath,Sheetname);

		        for (int i = 0; i < dataEntriesFromDB.size(); i++) {
		            HashMap<String, String> dbEntry = dataEntriesFromDB.get(i);
		            HashMap<String, String> excelEntry = dataEntriesFromExcel.get(i);

		            String dbColumnValue = dbEntry.get(getdatabase); 

		            String excelValue = excelEntry.get(getexcel);

		            if (dbColumnValue.equals(excelValue)) 
		            {
		            	test1.pass(dbColumnValue+" Data is equal "+excelValue);
		            } else {
		            	test1.fail(dbColumnValue+" Data is not equal "+excelValue);
		            }
		        }

		    } catch (ClassNotFoundException | SQLException e) {
		        e.printStackTrace();
		        test1.error("Failed to retrieve data from the database.");
		        extent.flush();
		    }
		}
	  
	  public void DataConfigconfigmm(ExtentTest test1, String Text1, String getdatabase, String getexcel, String Excelpath, String Sheetname) throws IOException {
		    try {
		    	
		        ArrayList<HashMap<String, String>> dataEntriesFromDB = class1.getDataFromDatabaseMachine(Text1);
		        ArrayList<HashMap<String, String>> dataEntriesFromExcel = class1.getDataFromExcel(Excelpath,Sheetname);

		        for (int i = 0; i < dataEntriesFromDB.size(); i++) {
		            HashMap<String, String> dbEntry = dataEntriesFromDB.get(i);
		            HashMap<String, String> excelEntry = dataEntriesFromExcel.get(i);

		            String dbColumnValue = dbEntry.get(getdatabase); 
		            String excelValue = excelEntry.get(getexcel);

		         // Check if excelValue is not null and is a valid numeric value
		         if (excelValue != null) {
		             try {
		                 double value = Double.parseDouble(excelValue);
		                 double multipliedValue = value * 10;
		                 String resultAsString = Double.toString(multipliedValue);

		                 if (dbColumnValue.equals(resultAsString)) {
		                	 test1.pass(dbColumnValue + " Data is equal " + resultAsString);
		                	 
		                 } else {
		                	 test1.fail(dbColumnValue + " Data is not equal " + resultAsString);
		                 }
		             } catch (NumberFormatException e) {
		                 // Handle the case where excelValue is not a valid number
		            	 test1.fail("excelValue is not a valid number: " + excelValue);
		            	 catchexceptionscreenshot1(test,e) ;
		             }
		         } else {
		             // Handle the case where excelValue is null
		        	 test1.fail("excelValue is null");
		         }
		        }

		    } catch (ClassNotFoundException | SQLException e) {
		        e.printStackTrace();
		        test1.error("Failed to retrieve data from the database.");
		        extent.flush();
		    }
		}
	
	@Test(priority=3, dataProvider = "testDatavalidsym")
	  public void Validsym(String Validsymfield,String Fieldname,String Fx, String Fy, String Colliangle) throws IOException, InterruptedException
	  {
	 	
	 	fieldnamevalid(Validsymfield,Fieldname, Fx,Fy, Colliangle); 
	  }
	
	 @Test(priority=4)
	  public void databasesymmetric() throws IOException
	  {
		  test = extent.createTest(funTestCaseName() + "FieldName comparsion from database to excel");
		  DataConfigconfig(test,"SELECT FieldName FROM FieldConfiguration","FieldName","Fieldname","D:\\Field.xlsx","Sheet1");
		  
		  test = extent.createTest(funTestCaseName() + "Fx, Fy,Colliangle comparsion from database to excel");
		  DataConfigconfigmm(test,"SELECT Fx FROM FieldConfiguration","Fx","Fx","D:\\Field.xlsx","Sheet3");
		  DataConfigconfigmm(test,"SELECT Fy FROM FieldConfiguration","Fy","Fy","D:\\Field.xlsx","Sheet3");
		  DataConfigconfig(test,"SELECT RotationAngle FROM FieldConfiguration","RotationAngle","Colliangle","D:\\Field.xlsx","Sheet3");
	  }
	  
	  @Test(priority=5, dataProvider = "testDatainvalidfieldname")
	  public void InValidFieldname(String InvalidFieldname,String Fieldname,String Fx, String Fy, String Colliangle,String Errormessage) throws IOException, InterruptedException
	  {
		 test = extent.createTest(funTestCaseName() + "Invalid Fieldname "+InvalidFieldname);
	 	 fieldnameerrormsg(InvalidFieldname,Fieldname, Fx,Fy, Colliangle,test);
	 	 applyandsave();
	 	 try {
	 	 WebElement Fieldnameempty=driver.findElement(By.name(Errormessage));
	 	 demo.isdisplayed(Fieldnameempty, Errormessage, test, driver);
	 	 demo.Textcomparsion(Fieldnameempty, Errormessage, test, driver);
	 	 }
	 	 catch(Exception e)
	 	 {
	 		 test.fail("Not found the elemnt");
	 		 catchexceptionscreenshot1(test,e) ;
	 	 }
	  }
	  
	   public void fieldnamevalid1(String Fieldnamedata,String name, String Fx1,String Fy1, String colliangle1) throws InterruptedException, IOException
	   {
		     test = extent.createTest(funTestCaseName() + "To verify the Valid Fieldname "+Fieldnamedata);
	 		 field.fieldname.click();
	 		 driver.switchTo().activeElement().sendKeys(name); 
	 		 demo.isdisplayed(field.fieldname, name, test, driver);
	 		 field.MSymfx.click();
	 		 driver.switchTo().activeElement().sendKeys(Fx1);
	 		 demo.isdisplayed(field.MSymfx, Fx1, test, driver);
	 		 field.MSymfy.click();
	 		 driver.switchTo().activeElement().sendKeys(Fy1);
	 		 demo.isdisplayed(field.MSymfy, Fy1, test, driver);
	 		 colliangle(colliangle1,test);
	 		 applyandsave();
	 		 Thread.sleep(1000);
	 		 Sitesave("Field Configuration Save", "Field Configuration saved.", "Field Configuration Save", "Field Configuration saved.", 0, driver);
	 		 Thread.sleep(1000);	 
	   }
	   
	   public void fieldnamevalid(String symfield,String name, String Fx1,String Fy1, String colliangle1) throws InterruptedException, IOException
	   {
		     test = extent.createTest(funTestCaseName() + "Field Size Validation for "+symfield);
	 		 field.fieldname.click();
	 		 driver.switchTo().activeElement().sendKeys(name); 
	 		 demo.isdisplayed(field.fieldname, name, test, driver);
	 		 field.MSymfx.click();
	 		 driver.switchTo().activeElement().sendKeys(Fx1);
	 		 demo.isdisplayed(field.MSymfx, Fx1, test, driver);
	 		 field.MSymfy.click();
	 		 driver.switchTo().activeElement().sendKeys(Fy1);
	 		 demo.isdisplayed(field.MSymfy, Fy1, test, driver);
	 		 colliangle(colliangle1,test);
	 		 applyandsave();
	 		 Thread.sleep(1000);
	 		 Sitesave("Field Configuration Save", "Field Configuration saved.", "Field Configuration Save", "Field Configuration saved.", 0, driver);
	 		 Thread.sleep(1000);	 
	   }
	 
	@Test(priority=6, dataProvider = "testDatainvalidsym")
	 public void inValidsym(String InValidsymfield,String Fieldname,String Fx, String Fy, String Colliangle,String Errormessage) throws IOException, InterruptedException
	 {
	 	 test = extent.createTest(funTestCaseName() + " Invalid Sym fieldSize -> "+ InValidsymfield);
	 	 fieldnameerrormsg(InValidsymfield,Fieldname, Fx, Fy, Colliangle,test);
	 	 applyandsavedisable(test);
	 	 try {
	 	 WebElement Fieldnameempty=driver.findElement(By.name(Errormessage));
	 	 demo.isdisplayed(Fieldnameempty, Errormessage, test, driver);
	 	 demo.Textcomparsion(Fieldnameempty, Errormessage, test, driver);
	 	 }
	 	 catch(Exception e)
	 	 {
	 		 test.pass("No Error messages get displayed "+Errormessage);
	 		 catchexceptionscreenshot1(test,e) ;
	 	 }
	 }
	 
	@Test(priority=7, dataProvider = "testDatavalidAsym")
	 public void ValidAsym(String ValidAssymfield,String Fieldname,String Fx1, String Fx2, String Fy1,String Fy2, String Colliangle) throws IOException, InterruptedException
	 {
	 	 test = extent.createTest(funTestCaseName() + "Asymmetric Field Vlaidation for "+ValidAssymfield);
	 	 field.fieldname.click();
	 	 driver.switchTo().activeElement().sendKeys(Fieldname);
	 	 field.fieldnameAsymtric.click();
	 	 Asymfield(Fx1,Fx2,Fy1,Fy2); 
	 	 colliangle(Colliangle,test);
	 	// LeafRange();
	 	 applyandsave();
	 	 Thread.sleep(1000);
	 	 try {
	 	 Sitesave("Field Configuration Save", "Field Configuration saved.", "Field Configuration Save", "Field Configuration saved.", 0, driver);
	 	 }
	 	 catch(Exception e)
	 	 {
	 		 test.fail("Not able to save the data for fieldname:"+Fieldname);
	 		 catchexceptionscreenshot1(test,e) ;
	 	 }
	 }
	@Test(priority=8)
	  public void databaseAssymmetric() throws IOException
	  {
		  test = extent.createTest(funTestCaseName() + "FieldName comparsion for Asymmetric database to excel");
		  DataConfigconfig(test,"SELECT FieldName FROM FieldConfiguration","FieldName","Fieldname","D:\\Field.xlsx","Sheet1");
		  
		  test = extent.createTest(funTestCaseName() + "Fx, Fy,Colliangle comparsion for Asymmetric database to excel");
		  DataConfigconfigmm(test,"SELECT Fx1 FROM FieldConfiguration","Fx1","Fx","D:\\Field.xlsx","Sheet5");
		  DataConfigconfigmm(test,"SELECT Fx2 FROM FieldConfiguration","Fx2","Fx","D:\\Field.xlsx","Sheet5");
		  DataConfigconfigmm(test,"SELECT Fy1 FROM FieldConfiguration","Fy1","Fx","D:\\Field.xlsx","Sheet5");
		  DataConfigconfigmm(test,"SELECT Fy2 FROM FieldConfiguration","Fy2","Fx","D:\\Field.xlsx","Sheet5");
		  DataConfigconfig(test,"SELECT RotationAngle FROM FieldConfiguration","RotationAngle","Colliangle","D:\\Field.xlsx","Sheet1");
	  }
	@Test(priority=9, dataProvider = "testDatainvalidAsymBlank")
	 public void inValidAsymblank(String InvalidAssymfield,String Fieldname,String Fx1, String Fx2, String Fy1,String Fy2, String Colliangle) throws IOException, InterruptedException
	 {
	 	 test = extent.createTest(funTestCaseName() + "Empty data for "+InvalidAssymfield);
	 	 field.fieldname.click();
	 	 driver.switchTo().activeElement().sendKeys(Keys.CONTROL + "a", Keys.DELETE);
	 	 driver.switchTo().activeElement().sendKeys(Fieldname);
	 	 field.fieldnameAsymtric.click();
	 	 Asymfield(Fx1,Fx2,Fy1,Fy2); 
	 	 colliangle(Colliangle,test);
	 	 applyandsavedisable(test);
	 }
	@Test(priority=10, dataProvider = "testDatainvalidAsym")
	 public void inValidAsym(String InvalidAssymfield, String Fieldname,String Fx1, String Fx2, String Fy1,String Fy2, String Colliangle,String E1, String E2, String E3,String E4, String E5) throws IOException, InterruptedException
	 {
	 	 test = extent.createTest(funTestCaseName() + "Invalid Aysmmetric data for "+InvalidAssymfield);
	 	 field.fieldname.click();
	 	 driver.switchTo().activeElement().sendKeys(Keys.CONTROL + "a", Keys.DELETE);
	 	 driver.switchTo().activeElement().sendKeys(Fieldname);
	 	 field.fieldnameAsymtric.click();
	 	 Asymfield(Fx1,Fx2,Fy1,Fy2); 
	 	 colliangle(Colliangle,test);
	 	 applyandsavedisable(test);
	 	 try {
	 	 WebElement Fieldnameempty=driver.findElement(By.name(E1));
	 	 demo.isdisplayed(Fieldnameempty, E1, test, driver);
	 	 demo.Textcomparsion(Fieldnameempty, E1, test, driver);
	 	 WebElement Fieldnameempty1=driver.findElement(By.name(E2));
	 	 demo.isdisplayed(Fieldnameempty1, E2, test, driver);
	 	 demo.Textcomparsion(Fieldnameempty1, E2, test, driver);
	 	 WebElement Fieldnameempty2=driver.findElement(By.name(E3));
	 	 demo.isdisplayed(Fieldnameempty2, E3, test, driver);
	 	 demo.Textcomparsion(Fieldnameempty2, E3, test, driver);
	 	 WebElement Fieldnameempty3=driver.findElement(By.name(E4));
	 	 demo.isdisplayed(Fieldnameempty3, E4, test, driver);
	 	 demo.Textcomparsion(Fieldnameempty3, E4, test, driver);
	 	 WebElement Fieldnameempty4=driver.findElement(By.name(E5));
	 	 demo.isdisplayed(Fieldnameempty4, E5, test, driver);
	 	 demo.Textcomparsion(Fieldnameempty4, E5, test, driver);
	 	 }
	 	 catch(Exception e)
	 	 {
	 		 test.pass("No Error messages get displayed ");
	 		 catchexceptionscreenshot1(test,e) ;
	 	 }
	 }
	
	 public void Fielddata() throws IOException
	 {
		 try {
		 FieldView();
		 }
		 catch(Exception e)
		 {
			 catchexceptionscreenshot(test,e) ;
		 }
		 try {
			 FieldEdit();
			 }
			 catch(Exception e)
			 {
				 catchexceptionscreenshot(test,e) ;
			 }
		 try {
			 Fielddelete();
			 }
			 catch(Exception e)
			 {
				 catchexceptionscreenshot(test,e) ;
			 }
		 try {
			 FieldSearch();
			 }
			 catch(Exception e)
			 {
				 catchexceptionscreenshot(test,e) ;
			 }
	 }
	
	 public void FieldView() throws FindFailed, IOException, InterruptedException
	 {
		 test = extent.createTest(funTestCaseName()+" To verify the View Button enabled by default");
		 vieweditenable("FieldConfigurationSection3View", 0,test,driver,"View Button");
		 
	 }
	 public void Fieldviewclick() throws IOException, FindFailed, InterruptedException
	 {
		 test = extent.createTest(funTestCaseName()+" To verify Click on the Viewbutton, Apply and Update button is displayed and disabled");
		 vieweditenableclick("FieldConfigurationSection3View", 0,test,driver,"View Button");
		 demo.BydefaultisEnabled(field.apply, "Apply", test, driver);
		 demo.BydefaultisEnabled(field.fieldupdate, "UPDATE", test, driver);
	 }
	
	
	 public void FieldEdit() throws FindFailed, IOException, InterruptedException
	 {
		 test = extent.createTest(funTestCaseName()+" To verify the Edit Button enabled by default");
		 vieweditenable("FieldConfigurationSection3View", 1,test,driver,"Edit Button");
	 }
	
	 public void Fieldeditclick() throws IOException, FindFailed, InterruptedException
	 {
		 test = extent.createTest(funTestCaseName()+" To verify Click on the Editbutton, Apply and Update button is displayed and Enabled");
		 vieweditenableclickedit("FieldConfigurationSection3View", 1,test,driver,"Edit Button");
		 
	 }

	 public void Fielddelete() throws FindFailed, IOException, InterruptedException
	 {
		 test = extent.createTest(funTestCaseName()+" To verify the Delete Button enabled by default");
		 vieweditenable("FieldConfigurationSection3View", 2,test,driver,"Delete Button");
	 }
	

	 public void Fielddeleteclick() throws IOException, FindFailed, InterruptedException
	 {
		 test = extent.createTest(funTestCaseName()+" To verify Click on the deletebutton, Button should get deleted");
		 deleteclick("FieldConfigurationSection3View", 2,test,driver,"Delete Button");
	 }
	 
	 public void FieldSearch() throws FindFailed, IOException, InterruptedException
	 {
		 test = extent.createTest(funTestCaseName()+" To verify the Search box functionality for Sidtharth fieldConfiguration");
		 viewdataserachfun(test,driver);
	 }
	 public void viewclick(String Classtext, int i, ExtentTest test,WebDriver driver, String Text) throws IOException, FindFailed, InterruptedException {
		   // WebElement text = driver.findElement(By.className(Classtext));
		    List<WebElement> Listrow = driver.findElements(By.className("DataGridRow"));
		  
		    for (WebElement row : Listrow) {
		        List<WebElement> datarow = row.findElements(By.className("DataGridCell"));
		           WebElement databutton = row.findElements(By.className("Button")).get(i);
		        if (datarow.size() >= 0) { 
		            WebElement firstDataGridCell = datarow.get(i); 
		            Actions action=new Actions(driver);
		        	action.moveToElement(databutton).perform();
		        	
		        	if(databutton.isEnabled())
		        	{
		                demo.isEnabled(databutton, Text, test, driver);
		                databutton.click();
		                try {
		           		 demo.isdisplayed(field.fieldupdate, "UPDATE", test, driver);
		           		 demo.BydefaultisEnabled(field.fieldupdate, "UPDATE", test, driver);
		           		 demo.Textcomparsion(field.fieldupdate, "UPDATE", test, driver);
		           		 }
		           		 catch(Exception e){
		           			 test.fail("Element not found");
		           			 catchexceptionscreenshot(test,e) ;
		           		 }
		           		 try {
		           			 demo.isdisplayed(field.apply, "APPLY", test, driver);
		           			 demo.BydefaultisEnabled(field.apply, "APPLY", test, driver);
		           			 demo.Textcomparsion(field.apply, "APPLY", test, driver);
		           			 }
		           			 catch(Exception e){
		           				 test.fail("Element not found");
		           				 catchexceptionscreenshot(test,e) ;
		           			 }
		           		 break;
		        	}
		        	else {
		        		test.fail("Button is not enabled");
		        	}
		        }
		                else {
		                    break;
		                }
		            }
		        }
	 
	 public void Addclick() throws FindFailed, IOException
	 {
		 test = extent.createTest(funTestCaseName()+" To verify Click on Add icon, Textboxes get empty");
		 edit("D:\\Help\\Field\\AddField.PNG"); 
		 try {
		 demo.isempty(field.fieldname, "Fieldname", test, driver);
		 demo.isempty(field.MSymfx, "Symx", test, driver);
		 demo.isempty(field.MSymfy, "Symy", test, driver);
		 }
		 catch(Exception e)
		 {
			 catchexceptionscreenshot(test,e) ;
		 }
		 
		 try {
			 demo.isdisplayed(field.apply, "APPLY", test, driver);
			 demo.BydefaultisEnabled(field.apply, "APPLY", test, driver);
			 demo.Textcomparsion(field.apply, "APPLY", test, driver);
			 }
			 catch(Exception e)
			 {
				 catchexceptionscreenshot(test,e) ;
			 }
		 try {
			 demo.isdisplayed(field.fieldsave, "SAVE", test, driver);
			 demo.BydefaultisEnabled(field.fieldsave, "SAVE", test, driver);
			 demo.Textcomparsion(field.fieldsave, "SAVE", test, driver);
			 }
			 catch(Exception e)
			 {
				 test.error(e);// Collimator empty not checking
				 catchexceptionscreenshot(test,e) ;
			 }
	 }
	 
	 public void vieweditenableclickedit(String Classtext, int i, ExtentTest test, WebDriver driver, String Text) throws IOException, FindFailed, InterruptedException {
		    List<WebElement> Listrow = driver.findElements(By.className("DataGridRow"));
		    System.out.println(Listrow.size());


		    for (WebElement row : Listrow) {
		        List<WebElement> datarow = row.findElements(By.className("DataGridCell"));
		        System.out.println(datarow.size());

		        if (datarow.size() >= 5) {
		            WebElement firstDataGridCell = datarow.get(i);
		            Actions action = new Actions(driver);
		            action.moveToElement(firstDataGridCell).click().perform();
		            demo.isEnabled(firstDataGridCell, Text, test, driver);
		            try {
		           		 demo.isdisplayed(field.fieldupdate, "UPDATE", test, driver);
		           		 demo.isEnabled(field.fieldupdate, "UPDATE", test, driver);
		           		 demo.Textcomparsion(field.fieldupdate, "UPDATE", test, driver);
		           		 }
		           		 catch(Exception e){
		           			 test.fail("Element not found");
		           			 catchexceptionscreenshot(test,e) ;
		           		 }
		            try {
	           			 demo.isdisplayed(field.apply, "APPLY", test, driver);
	           			 demo.isEnabled(field.apply, "APPLY", test, driver);
	           			 demo.Textcomparsion(field.apply, "APPLY", test, driver);
	           			 }
	           			 catch(Exception e){
	           				 test.fail("Element not found");
	           				 catchexceptionscreenshot(test,e) ;
	           			 }
		            try {
	           			 field.apply.click();
	           			 field.fieldupdate.click();
	           			 Sitesave("Field Configuration Update","Selected Field Configuration updated.","Field Configuration Update","Selected Field Configuration updated.",1,driver);
	           		 }
	           		 catch(Exception e)
	           		 {
	           			 test.fail("No element found");
	           			 catchexceptionscreenshot(test,e) ;
	           		 }
	           		 break;
		     
		        } else {
		        }
		    }

		}
	 
	 public void deleteclick(String Classtext, int i, ExtentTest test,WebDriver driver, String Text) throws IOException, FindFailed, InterruptedException {
		   // WebElement text = driver.findElement(By.className(Classtext));
		    List<WebElement> Listrow = driver.findElements(By.className("DataGridRow"));
		    for (WebElement row : Listrow) {
		        List<WebElement> datarow = row.findElements(By.className("DataGridCell"));
		           WebElement databutton = row.findElements(By.className("Button")).get(i);
		        System.out.println(datarow.size());

		        if (datarow.size() >= 0) { 
		            WebElement firstDataGridCell = datarow.get(i); 
		            Actions action=new Actions(driver);
		        	action.moveToElement(databutton).perform();
		                demo.isEnabled(databutton, Text, test, driver);
		                if(databutton.isEnabled())
		                {
		                	try {
		                databutton.click();
		                SitesaveCancel("Field Delete", "Do you want to delete the selected field?", "Field Delete", "Do you want to delete the selected field?", 2, driver);
		                	}
		                	catch(Exception e){
		                		test.fail("Element not found");
		                		 catchexceptionscreenshot(test,e) ;
		                	}
		                	
		                	try {
				                databutton.click();
				                Sitesave("Field Delete", "Do you want to delete the selected field?", "Field Delete", "Do you want to delete the selected field?", 2, driver);
				                Sitesave("Field Configuration Delete", "Selected Field Configuration deleted.", "Field Configuration Delete", "Selected Field Configuration deleted.", 2, driver);
				                break;
		                	}
				                	catch(Exception e){
				                		test.fail("Element not found");
				                		 catchexceptionscreenshot(test,e) ;
				                	}
		                    }
		                else {
		                	test.fail("Delete button not enabled");
		                	 break;
		                }
		           }
		                else {
		                    break;
		                }
		            }
		        }
	 
	 
	 public void LeafRange() throws InterruptedException
	 {
	 	driver.findElement(By.className("DataGridCell"));
	 	 By locator = By.className("DataGridCell");
	 	   	List<WebElement> elements = driver.findElements(locator);
	 	   	System.out.println(elements.size());
	 	   	Thread.sleep(2000);
	 	   for (int i=1;i<elements.size();i++)
	 	   {
	 	   	if (i < elements.size()) {
	 	   		Thread.sleep(2000);
	 	   	    WebElement element = elements.get(i);
	 	   	    action=new Actions(driver);
	 	   	    action.moveToElement(element).perform();
	 	   	    System.out.println(element.getText());
	 	   	}
	 	   	else
	 	   	{
	 	   		break;
	 	   	}
	 	   }
	 }
	 public void Asymfield(String AFx1,String AFx2,String AFy1,String AFy2)
	 {
	 	
	 	field.MASymfx1.click();
	 	driver.switchTo().activeElement().sendKeys(AFx1);
	 	field.MASymfx2.click();
	 	driver.switchTo().activeElement().sendKeys(AFx2);
	 	field.MASymfy1.click();
	 	driver.switchTo().activeElement().sendKeys(AFy1);
	 	field.MASymfY2.click();
	 	driver.switchTo().activeElement().sendKeys(AFy2);
	 }
	 public void AsymfieldDelete(String AFx1,String AFx2,String AFy1,String AFy2)
	 {
	 	field.MASymfx1.click();
	 	driver.switchTo().activeElement().sendKeys(Keys.CONTROL + "a", Keys.DELETE);
	 	driver.switchTo().activeElement().sendKeys(AFx1);
	 	field.MASymfx2.click();
	 	driver.switchTo().activeElement().sendKeys(Keys.CONTROL + "a", Keys.DELETE);
	 	driver.switchTo().activeElement().sendKeys(AFx2);
	 	field.MASymfy1.click();
	 	driver.switchTo().activeElement().sendKeys(Keys.CONTROL + "a", Keys.DELETE);
	 	driver.switchTo().activeElement().sendKeys(AFy1);
	 	field.MASymfY2.click();
	 	driver.switchTo().activeElement().sendKeys(Keys.CONTROL + "a", Keys.DELETE);
	 	driver.switchTo().activeElement().sendKeys(AFy2);
	 }
	  
	   WebElement angle;
	   public void fieldnameerrormsg(String Invalidfeild,String name, String Fx1,String Fy1, String colliangle1, ExtentTest test1) throws InterruptedException, IOException
	   {
	 	  field.fieldname.click();
	 	  driver.switchTo().activeElement().sendKeys(Keys.CONTROL + "a", Keys.DELETE);
	 	  driver.switchTo().activeElement().sendKeys(name);  
	 	  symmetric(Fx1, Fy1);
	 	  colliangle(colliangle1,test1);
	   }
	   
	   public void symmetric(String SFx1, String SFx2)
	   {
	      field.MSymfx.click();
	      driver.switchTo().activeElement().sendKeys(Keys.CONTROL + "a", Keys.DELETE);
	      driver.switchTo().activeElement().sendKeys(SFx1);
	      field.MSymfy.click();
	  	  driver.switchTo().activeElement().sendKeys(Keys.CONTROL + "a", Keys.DELETE);
	  	  driver.switchTo().activeElement().sendKeys(SFx2); 
	   }
	   public void colliangle(String Colli, ExtentTest test) throws InterruptedException, IOException
	   {
	 	     
	 		 Actions actions = new Actions(driver); 
	 		 actions.moveToElement(field.angle,205,0).click().perform();
	 		 driver.switchTo().activeElement().sendKeys(Keys.CONTROL + "a", Keys.DELETE);
	 		 Thread.sleep(1000);
	 		 actions.moveToElement(field.angle,205,0).click().sendKeys(Colli).perform();  
	 		// demo.ByValidErrormessage(angle, Colli, test, driver);
	   }
	   
	   public void applyandsave() throws InterruptedException
	   {
	 		 field.apply.click();
	 		 field.fieldsave.click();
	 		 Thread.sleep(1000);  
	   }
	   public void applyandsavedisable(ExtentTest test) throws IOException
	   {
	 		 demo.BydefaultisEnabled(field.apply, "Apply", test, driver);
	 		 demo.BydefaultisEnabled(field.fieldsave, "SAVE", test, driver);
	   }
	   
	   public void fieldnamevalid(String name, String Fx1,String Fy1, String colliangle1) throws InterruptedException, IOException
	   {
	 		 field.fieldname.click();
	 		 driver.switchTo().activeElement().sendKeys(name); 
	 		 field.MSymfx.click();
	 		 driver.switchTo().activeElement().sendKeys(Fx1);
	 		 field.MSymfy.click();
	 		 driver.switchTo().activeElement().sendKeys(Fy1);
	 		 colliangle(colliangle1,test);
	 		 applyandsave();
	 		 Thread.sleep(1000);
	 		 Sitesave("Field Configuration Save", "Field Configuration saved.", "Field Configuration Save", "Field Configuration saved.", 0, driver);
	 		 Thread.sleep(1000);
	   }
	   // Valid Field name
	   @DataProvider(name = "testDatavalidfieldname")
	   public Object[][] testDatavalidfieldname() {
	       return DataProviderclass.getTestMlc("Sheet1"); 
	   }
	   // Field name Error message
	   @DataProvider(name = "testDatainvalidfieldname")
	   public Object[][] testDatainvalidfieldname() {
	       return DataProviderclass.getTestMlc("Sheet2"); 
	   }
	   // Valid Jaws
	   @DataProvider(name = "testDatavalidsym")
	   public Object[][] testDataalidsym() {
	       return DataProviderclass.getTestMlc("Sheet3"); 
	   }
	   // Field name and Jaws Empty Error message
	   @DataProvider(name = "testDatainvalidsym")
	   public Object[][] testDatainvalidsym() {
	       return DataProviderclass.getTestMlc("Sheet4"); 
	   }
	   // Valid Asym data
	   @DataProvider(name = "testDatavalidAsym")
	   public Object[][] testDataalidAsym() {
	       return DataProviderclass.getTestMlc("Sheet5"); 
	   }
	   // Valid Empty Asymmetric data
	   @DataProvider(name = "testDatainvalidAsymBlank")
	   public Object[][] testDatainvalidAsymBlank() {
	       return DataProviderclass.getTestMlc("Sheet6"); 
	   }
	   // Asym data out of range
	   @DataProvider(name = "testDatainvalidAsym")
	   public Object[][] testDatainvalidAsym() {
	       return DataProviderclass.getTestMlc("Sheet7"); 
	   }
	   
	 
}

