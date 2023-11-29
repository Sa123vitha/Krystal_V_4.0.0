package com.krystal.project;

import java.io.IOException;
import java.net.URL;
import java.util.List;

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
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.windows.WindowsDriver;

public class ToleranceSettings 	extends ReferencefileChemotheraphy{
	
	TolerancePOM tol;
	public ExtentTest test;
		private WebElement treatmenttol;
		private WebElement addtol;
		private WebElement tablenumber;
		private WebElement tablename;
		private WebElement gantry;
		private WebElement ganrotangle;
		private WebElement beamlimit;
		private WebElement beamrotangle;
		private WebElement jaws;
		private WebElement mlcleaf1;
		private WebElement mlcleaf2;
		private WebElement patientsupport;
		private WebElement patientrotangle;
		private WebElement longitudinal;
		private WebElement lateral;
		private WebElement vertical;
		private WebElement pitch;
		private WebElement roll;
		private WebElement save;
		private WebElement refresh;
		private WebElement tollist;
		private WebElement selmachine;
		private WebElement selbha;
		private WebElement selbhamlc;
		private WebElement selsidd;
		private WebElement searchtolname;
		private WebElement searchtolnumber;
		private WebElement toltablenumber;
		private WebElement toltablename;
		private String imagePath;
		private Screen s;
		private Match match;
		private WebElement searchtolicon;
		private WebElement beamrotangle1;
		@BeforeClass
			public void setUp1()  throws InterruptedException, IOException {
			DesiredCapabilities appCapabilities = new DesiredCapabilities();
			appCapabilities.setCapability("app", "C:\\Program Files\\Panacea Medical Technologies\\Krystal\\Krystal.exe");
			driver = new WindowsDriver<WebElement>(new URL("http://127.0.0.1:4723"), appCapabilities);
			ReferenceSigin Sign=new ReferenceSigin();
			Sign.Login(driver);
			Sign.ToleranceSettings(driver);
			tol=new TolerancePOM(driver);
		  }
		@BeforeSuite
		public void setUp() {
			extent = ExtendManager.getInstance();
		}
		@Test(priority =1)
		public void TreatmentToleranceLabel() throws IOException {
		test = extent.createTest(guiTestCaseName()+" Treatment Tolerance label"," Treatment Tolerance label should be present");	
		demo.Textcomparsion(tol.treatementtolerance, "Treatment Tolerance", test,driver);
		}
	//@Test(priority =2)
		public void AddToleranceLabel() throws IOException {
		test = extent.createTest(guiTestCaseName()+" Add Tolerance label"," Add Tolerance label should be present ");	
		addtol=driver.findElement(By.name("Add Tolerance"));
		demo.Textcomparsion(addtol, "Add Tolerance", test,driver);
		}
	@Test(priority =3)
		public void TableNumberLabel() throws IOException {
		test = extent.createTest(guiTestCaseName()+" Table Number label"," Table Number label should be present ");	
		demo.Textcomparsion(tol.tablenumber, "Table Number", test,driver);
		
		}
	@Test(priority =4) 
		public void TableNameLabel() throws IOException {
		test = extent.createTest(guiTestCaseName()+" Table Name label"," Table Name label should be present ");	
		demo.Textcomparsion(tol.tablename, "Table Name", test,driver);
		
		}
	@Test(priority =5)
		public void GantryLabel() throws IOException {
		test = extent.createTest(guiTestCaseName()+" Gantry label"," Gantry label should be present ");	
		demo.Textcomparsion(tol.gantry, "Gantry", test,driver);
		}
	@Test(priority =6)
		public void RotationAngleLabel() throws IOException {
		test = extent.createTest(guiTestCaseName()+" Rotation Angle(deg) label"," Rotation Angle(deg) label should be present ");	
		demo.Textcomparsion(tol.ganrotangle, "Rotation Angle (deg)", test,driver);
	
		}
	@Test(priority =7)
		public void BeamLimitingDeviceLabel() throws IOException {
		test = extent.createTest(guiTestCaseName()+" Beam Limiting Device label"," Beam Limiting Device label should be present ");	
		demo.Textcomparsion(tol.beamlimit, "Beam Limiting Device", test,driver);
		}
	@Test(priority =8)
		public void RotationAngle() throws IOException, InterruptedException {
		test = extent.createTest(guiTestCaseName()+" Rotation Angle(deg) label"," Rotation Angle(deg) label should be present ");	
		
		beamrotangle=driver.findElements(By.name("Rotation Angle (deg)")).get(4);
		demo.Textcomparsion(beamrotangle, "Rotation Angle(deg)", test,driver);
		beamrotangle.click();
		}
	@Test(priority =9)
		public void JawsLabel() throws IOException {
		test = extent.createTest(guiTestCaseName()+" Jaws(cm) label"," Jaws(cm) label should be present ");	
		demo.Textcomparsion(tol.jaws, "Jaws (cm)", test,driver);
		}
	@Test(priority =10)
		public void MlcleafLabel1() throws IOException {
		test = extent.createTest(guiTestCaseName()+" MLC1 Leaf(cm) label"," MLC1 Leaf(cm) label should be present ");	
		demo.Textcomparsion(tol.mlcleaf1, "MLC1 Leaf (cm)", test,driver);
	
		}
	@Test(priority =11)
		public void MlcleafLabel2() throws IOException {
		test = extent.createTest(guiTestCaseName()+" MLC2 Leaf(cm) label"," MLC2 Leaf(cm) label should be present ");	
		demo.Textcomparsion(tol.mlcleaf2, "MLC2 Leaf (cm)", test,driver);
		}
	@Test(priority =12)
		public void PatientSupportLabel() throws IOException {
		test = extent.createTest(guiTestCaseName()+" Patient Support label"," Patient Support label should be present ");	
		demo.Textcomparsion(tol.PatientSupport, "Patient Support", test,driver);
		}
	@Test(priority =13)
		public void RotationAngle3() throws IOException, InterruptedException {
		test = extent.createTest(guiTestCaseName()+" Rotation Angle(deg) label"," Rotation Angle(deg) label should be present ");	
		beamrotangle1=driver.findElements(By.name("Rotation Angle (deg)")).get(5);
		demo.Textcomparsion(beamrotangle1, "Rotation Angle(deg)", test,driver);
		}
	@Test(priority =14)
		public void LongitudinalLabel() throws IOException {
		test = extent.createTest(guiTestCaseName()+" Longitudinal label"," Longitudinal label should be present ");	
		demo.Textcomparsion(tol.longitudinal, "Longitudinal (cm)", test,driver);

		}
	@Test(priority =15)
		public void LateralLabel() throws IOException {
		test = extent.createTest(guiTestCaseName()+" Lateral label"," Lateral label should be present ");	
		demo.Textcomparsion(tol.lateral, "Lateral (cm)", test,driver);
		
		}
	@Test(priority =16)
		public void VerticalLabel() throws IOException {
		test = extent.createTest(guiTestCaseName()+" Vertical label"," Vertical label should be present ");	
		demo.Textcomparsion(tol.vertical, "Vertical (cm)", test,driver);

		}
	@Test(priority =17)
		public void PitchAngleLabel() throws IOException {
		test = extent.createTest(guiTestCaseName()+" Pitch Angle(deg) label"," Pitch Angle(deg) label should be present ");	
		demo.Textcomparsion(tol.pitch, "Pitch Angle (deg)", test,driver);
		}
	@Test(priority =18)
		public void RollAngleLabel() throws IOException {
		test = extent.createTest(guiTestCaseName()+" Roll Angle(deg) label"," Roll Angle(deg) label should be present ");	
		demo.Textcomparsion(tol.roll, "Roll Angle (deg)", test,driver);
		}
	@Test(priority =19)
		public void SaveLabel() throws IOException {
		test = extent.createTest(guiTestCaseName()+" SAVE label"," SAVE label should be present ");	
		demo.Textcomparsion(tol.Save, "SAVE", test,driver);
		}
	@Test(priority =20)
		public void RefreshLabel() throws IOException {
		test = extent.createTest(guiTestCaseName()+" Refresh label"," Refresh label should be present ");	
		refresh=driver.findElement(By.name("Refresh"));
		demo.Textcomparsion(refresh, "Refresh", test,driver);
		}
	@Test(priority =21)
		public void ToleranceListLabel() throws IOException {
		test = extent.createTest(guiTestCaseName()+" Tolerance List label"," Tolerance List label should be present ");	
		tollist=driver.findElement(By.name("Tolerance List"));
		demo.Textcomparsion(tollist, "Tolerance List", test,driver);
		}
	@Test(priority =22)
		public void SelectMachineLabel() throws IOException {
		test = extent.createTest(guiTestCaseName()+" Select Machine label"," Select Machine label should be present ");	
		selmachine=driver.findElement(By.name("Select Machine"));
		demo.Textcomparsion(selmachine, "Select Machine", test,driver);
		}
	@Test(priority =23)
		public void BhabhatronLabel() throws IOException {
		test = extent.createTest(guiTestCaseName()+" BHABHATRON-3i_CO6 label"," BHABHATRON-3i_CO6 label should be present ");	
		selbha=driver.findElement(By.name("BHABHATRON-3i_CO6"));
		demo.Textcomparsion(selbha, "BHABHATRON-3i_CO6", test,driver);
		}
	@Test(priority =24)
		public void BhabhatronmlcLabel() throws IOException {
		test = extent.createTest(guiTestCaseName()+" BHABHATRON-II MLC v2_CO3 label"," BHABHATRON-II MLC v2_CO3 label should be present ");	
		selbhamlc=driver.findElement(By.name("BHABHATRON-II MLC v2_CO3"));
		demo.Textcomparsion(selbhamlc, "BHABHATRON-II MLC v2_CO3", test,driver);
		}
	@Test(priority =25)
		public void SiddharthLabel() throws IOException {
		test = extent.createTest(guiTestCaseName()+" SIDDHARTH-II_CO5 label"," SIDDHARTH-II_CO5 label should be present ");	
		selsidd=driver.findElement(By.name("SIDDHARTH-II_CO5"));
		demo.Textcomparsion(selsidd, "SIDDHARTH-II_CO5", test,driver);
		}
	@Test(priority =26)
		public void SearchTolTablenameLabel() throws IOException {
		test = extent.createTest(guiTestCaseName()+" Search Tolerance Table Name label"," Search Tolerance Table Name label should be present ");	
		searchtolname=driver.findElement(By.name("Search Tolerance Table Name"));
		demo.Textcomparsion(searchtolname, "Search Tolerance Table Name", test,driver);
		searchtolicon=driver.findElement(By.xpath("//Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"ToleranceSettingsMainView\"]/Custom[@ClassName=\"ToleranceSettingsSection2View\"]/Button[@AutomationId=\"SearchMenuButton\"]"));
		searchtolicon.click();
		toltablename=driver.findElement(By.name("Tolarence Table Name"));
		demo.Textcomparsion(toltablename, "Tolarence Table Name", test,driver);
		toltablenumber=driver.findElement(By.name("Tolerance Table Number"));
		demo.Textcomparsion(toltablenumber, "Tolerance Table Number", test,driver);
		toltablenumber.click();
		}
	@Test(priority =27)
		public void SearchTolTablenumberLabel() throws IOException {
		test = extent.createTest(guiTestCaseName()+" Search Tolerance Table Number label"," Search Tolerance Table Number label should be present ");	
		searchtolnumber=driver.findElement(By.name("Search Tolerance Table Number"));
		demo.Textcomparsion(searchtolnumber, "Search Tolerance Table Number", test,driver);
		}
	@Test(priority =29)
		public void ToleranceTablenumberLabel() throws IOException {
		test = extent.createTest(guiTestCaseName()+" Tolerance Table Number label"," Tolerance Table Number label should be present ");	
		toltablenumber=driver.findElement(By.name("Tolerance Table Number"));
		demo.Textcomparsion(toltablenumber, "Tolerance Table Number", test,driver);
		}
	@Test(priority =30)
		public void ToleranceTablenameLabel() throws IOException {
		test = extent.createTest(guiTestCaseName()+" Tolerance Table Name label"," Tolerance Table Name label should be present ");	
		toltablename=driver.findElement(By.name("Tolerance Table Name"));
		demo.Textcomparsion(toltablename, "Tolerance Table Name", test,driver);
		}
	
	
 @Test(priority=31, dataProvider = "testDatavalid")
	 public void ValidName(String Testcase,String Number, String Name, String GR,String BR,String Jaws,String MLC1,String MLC2,String PR,String Long,String Lateral,String Vertical,String Pitch,String Roll) throws IOException, InterruptedException
	 {	 
		 try {
		 ToleranceName(Testcase,Number,Name,GR,BR,Jaws,MLC1,MLC2,PR,Long,Lateral,Vertical,Pitch,Roll); 
		 demo.isEnabled(tol.Save, "Save", test, driver);
		 SaveTolerance(test);
		 }
		 catch(Exception e)
	 	 {
	 	test.error(e);
	 	 }
	 }
	 
	 @Test(priority=32)
	  public void Additionalsearch() throws InterruptedException
	   {
		   try {
		 		 FieldSearch();
		   }
	 		 catch(Exception e)
	 		 {
	 			 test.error(e);
	 		 }  
		 		 try {
					FieldView();
				} catch (Exception e) {
					
					 test.error(e);
				}
		 		 try {
					Fieldviewclick();
				} catch (Exception e) {
					 test.error(e);
				}
		 		 try {
		 		addicon();
				} catch (Exception e) {
					
					 test.error(e);
				}
		 		 try {
					FieldEdit();
				} catch (Exception e) {
					
					 test.error(e);
				}
		 		 try {
					Fieldeditclick();
				} catch (Exception e) {
					 test.error(e);
				}
		 		 try {
		 		addicon();
				} catch (Exception e) {
					 test.error(e);
				}
		 		 try {
					Fielddelete();
				} catch (Exception e) {
					 test.error(e);
				}
		 		 try {
					Fielddeleteclick();
				} catch (Exception e) {
					 test.error(e);
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
		 demo.BydefaultisEnabled(tol.Update, "UPDATE", test, driver);
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
		           		 demo.isdisplayed(tol.Update, "UPDATE", test, driver);
		           		 demo.isEnabled(tol.Update, "UPDATE", test, driver);
		           		 demo.Textcomparsion(tol.Update, "UPDATE", test, driver);
		           		 }
		           		 catch(Exception e){
		           			 test.fail("Element not found");
		           		 }
		          
		            try {
	           			tol.Update.click();
	           			 Sitesave("Tolerance Table Update","Selected Tolerance Table updated.","Tolerance Table Update","Selected Tolerance Table updated.",1,driver);
	           		 }
	           		 catch(Exception e)
	           		 {
	           			 test.fail("No element found");
	           		 }
	           		 break;
		     
		        } else {
		        }
		    }

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
	  
	 
	@Test(priority=33, dataProvider = "testDatainvalid")
	 public void InValidName(String Testcase,String Number, String Name, String GR,String BR,String Jaws,String MLC1,
			 String MLC2,String PR,String Long,String Lateral,String Vertical,String Pitch,String Roll) throws IOException, InterruptedException
	 {
	   
		 ToleranceName(Testcase,Number, Name,GR,BR, Jaws, MLC1,MLC2, PR,Long, Lateral, Vertical, Pitch, Roll); 
		 demo.BydefaultisEnabled(tol.Save, "Save", test, driver);
	 }

	 public void ToleranceName(String Testcase1,String Number1, String Name1, String GR1,String BR1,String Jaws1,String MLC11,
			 String MLC21,String PR1,String Long1,String Lateral1,String Vertical1,String Pitch1,String Roll1) throws IOException, InterruptedException
	 {
		 test=extent.createTest(funTestCaseName() +"," +Testcase1);
		 
		 tol.tablenumber.click();
		 driver.switchTo().activeElement().clear();
		 Thread.sleep(1000);
		 driver.switchTo().activeElement().sendKeys(Number1);
		
		 
		 tol.tablename.click();
		 driver.switchTo().activeElement().clear();
		 driver.switchTo().activeElement().sendKeys(Name1);
		 
		 tol.ganrotangle.click();
		 driver.switchTo().activeElement().clear();
		 driver.switchTo().activeElement().sendKeys(GR1);
		 
		 Rotation(4, driver);//
		 driver.switchTo().activeElement().clear();
		 driver.switchTo().activeElement().sendKeys(BR1);
		 
		 tol.jaws.click();
		 driver.switchTo().activeElement().clear();
		 driver.switchTo().activeElement().sendKeys(Jaws1);
		 
		 tol.mlcleaf1.click();
		 driver.switchTo().activeElement().clear();
		 driver.switchTo().activeElement().sendKeys(MLC11);
		 
		 tol.mlcleaf2.click();
		 driver.switchTo().activeElement().clear();
		 driver.switchTo().activeElement().sendKeys(MLC21);
		 
		 Rotation(5, driver);//
		 driver.switchTo().activeElement().clear();
		 driver.switchTo().activeElement().sendKeys(PR1);
		 
		 
		 tol.longitudinal.click();
		 driver.switchTo().activeElement().clear();
		 driver.switchTo().activeElement().sendKeys(Long1);
		 
		 tol.lateral.click();
		 driver.switchTo().activeElement().clear();
		 driver.switchTo().activeElement().sendKeys(Lateral1);
		 
		 tol.vertical.click();
		 driver.switchTo().activeElement().clear();
		 driver.switchTo().activeElement().sendKeys(Vertical1);
		 
		 tol.pitch.click();
		 driver.switchTo().activeElement().clear();
		 driver.switchTo().activeElement().sendKeys(Pitch1);
		 
		 
		 tol.roll.click();
		 driver.switchTo().activeElement().clear();
		 driver.switchTo().activeElement().sendKeys(Roll1);
	 }
	 
	 WebElement Beamrotaion;
	 WebElement PatientBeamrotaion;
	 @Test(priority=34)
	 public void Beamrotaion() throws InterruptedException
	 {
		Beamrotaion=driver.findElements(By.name("Rotation Angle (deg)")).get(4);
		PatientBeamrotaion=driver.findElements(By.name("Rotation Angle (deg)")).get(5);
		
	 }
	
	 
	 @Test(priority=34)
		public void Invalidchars() throws InterruptedException, IOException
		{
		 try {
			 test=extent.createTest("************* INVALID CHARS*****************");
			 InvalidData(tol.tablenumber,driver,"Tablenumber");
				
			}
			catch(Exception e)
			{
				test.error(e);
			}
		 
			try {
				InvalidData(tol.ganrotangle,driver,"GantryAngle");
				
			}
			catch(Exception e)
			{
				test.error(e);
			}
			try {
				Beamrotaion=driver.findElements(By.name("Rotation Angle (deg)")).get(4);
				InvalidData(Beamrotaion,driver,"Beam Rotation Angle");
				}
				catch(Exception e)
				{
					test.error(e);
				}
			
			try {
			InvalidData(tol.jaws,driver,"Jaws");
				
				}
				catch(Exception e)
				{
					test.error(e);
				}	
			
			try {
				InvalidData(tol.mlcleaf1,driver,"MLC Leaf");
				
				}
				catch(Exception e)
				{
					test.error(e);
				}
			
			try {
				InvalidData(tol.mlcleaf2,driver,"MLC Leaf");
				
				}
				catch(Exception e)
				{
					test.error(e);
				}
			
			try {
				PatientBeamrotaion=driver.findElements(By.name("Rotation Angle (deg)")).get(5);
				InvalidData(PatientBeamrotaion,driver,"Patient Couch");
				}
				catch(Exception e)
				{
					test.error(e);
				}
			
			try {
				InvalidData(tol.longitudinal,driver,"Longitudinal");
				}
				catch(Exception e)
				{
					test.error(e);
				}
			
			
			try {
				InvalidData(tol.lateral,driver,"Lateral");
				
			}
			catch(Exception e)
			{
				test.error(e);
			}
		
			
			try {
				InvalidData(tol.vertical,driver,"Vertical");
			}
			catch(Exception e)
			{
				test.error(e);
			}
			try {
				InvalidData(tol.pitch,driver,"Pitch");
			}
			catch(Exception e)
			{
				test.error(e);
			}
			try {
				InvalidData(tol.roll,driver,"Roll");
			}
			catch(Exception e)
			{
				test.error(e);
			}
		

			try {
				test = extent.createTest(guiTestCaseName()+" To verify if enetered invalid range it should not save the data");
			    demo.BydefaultisEnabled(tol.Save, "SAVE", test, driver);
			}
			catch(Exception e)
			{
				test.fail("Save pop-up is displayed");
			}
		}
	
	 @Test(priority=35)
		public void InvalidRangeAngle() throws InterruptedException, IOException
		{
		 try {
			   test=extent.createTest("************* INVALID RANGE*****************");
				
			   InValidTablenumber(tol.tablenumber,driver);
				
			}
			catch(Exception e)
			{
				test.error(e);
			}
		 
			try {
				
				InValidRangeAngle(tol.ganrotangle,driver);
				
			}
			catch(Exception e)
			{
				test.error(e);
			}
			try {
				Beamrotaion=driver.findElements(By.name("Rotation Angle (deg)")).get(4);
				InValidRangeAngle(Beamrotaion,driver);
				}
				catch(Exception e)
				{
					test.error(e);
				}
			
			try {
				InValidRangeBeam(tol.jaws,driver);
				
				}
				catch(Exception e)
				{
					test.error(e);
				}	
			
			try {
				InValidRangeBeam(tol.mlcleaf1,driver);
				
				}
				catch(Exception e)
				{
					test.error(e);
				}
			
			try {
				InValidRangeBeam(tol.mlcleaf2,driver);
				
				}
				catch(Exception e)
				{
					test.error(e);
				}
			
			try {
				PatientBeamrotaion=driver.findElements(By.name("Rotation Angle (deg)")).get(5);
				InValidRangeAngle(PatientBeamrotaion,driver);
				}
				catch(Exception e)
				{
					test.error(e);
				}
			
			try {
				InValidRangeCouch(tol.longitudinal,driver);
				}
				catch(Exception e)
				{
					test.error(e);
				}
			
			
			try {
				InValidRangeCouch(tol.lateral,driver);
				
			}
			catch(Exception e)
			{
				test.error(e);
			}
		
			
			try {
				InValidRangeCouch(tol.vertical,driver);
			}
			catch(Exception e)
			{
				test.error(e);
			}
			try {

			InValidRangeCouchAngle(tol.pitch,driver);
			}
			catch(Exception e)
			{
				test.error(e);
			}
			try {


			InValidRangeCouchAngle(tol.roll,driver);
			}
			catch(Exception e)
			{
				test.error(e);
			}
		

			try {
				test = extent.createTest(guiTestCaseName()+" To verify if enetered invalid range it should not save the data");
			    demo.BydefaultisEnabled(tol.Save, "SAVE", test, driver);
			}
			catch(Exception e)
			{
				test.fail("Save pop-up is displayed");
			}
		}
		
	 @Test(priority=36)
	 public void Tablenameinvalid() throws IOException
	 {
		 try {
		 InvalidDatatableName(tol.tablename,driver);
		 }
		 catch(Exception e)
			{
			test.error(e);
			}
	 }
		
	 
	 @Test(priority=37)
	 public void addicon() throws IOException, FindFailed
	 {
		 test = extent.createTest(funTestCaseName()+" Click on add icon, Table name is displayed empty"); 
		 edit("D:\\Help\\Tolerance\\Tadd.PNG");
		 demo.isempty(tol.tablename, "Empty", test, driver);
	 }
	
		 @Test(priority=38)
		public void Edit() throws IOException, FindFailed
		{	
			edit("D:\\Help\\Tolerance\\TEdit.PNG");
			test = extent.createTest(funTestCaseName()+" Click on Edit icon, Update button"); 
			demo.isdisplayed(tol.Update,"UPDATE", test, driver);
			demo.isEnabled(tol.Update,"UPDATE", test, driver);
			demo.Textcomparsion(tol.Update,"UPDATE", test, driver);
		}
		@Test(priority=39)
		public void update() throws IOException, InterruptedException
		{
			test = extent.createTest(funTestCaseName()+" Click on Update button, Update pop-up should get displayed"); 	
			tol.Update.click();
			try {
			Sitesave("Tolerance Table Update", "Selected Tolerance Table updated.", "Tolerance Table Update", "Selected Tolerance Table updated.",1, driver);
			}
			catch(Exception e)
			{
				test.fail("Tolerance Table Upadted pop-up is not displayed");
			}
		}
		 @Test(priority=40)	
		public void dataupdate() throws IOException, InterruptedException, FindFailed
		{
			 test = extent.createTest(funTestCaseName()+" Click on Edit the data and Refersh the data"); 
			 edit("D:\\Help\\Tolerance\\TEdit.PNG");
			 tol.ganrotangle.click();
			 driver.switchTo().activeElement().clear();
			 driver.switchTo().activeElement().sendKeys("2.5");
			 Thread.sleep(1000);
			 edit("D:\\Help\\Tolerance\\Trefersh.PNG");
			 Thread.sleep(1000);
			 tol.ganrotangle.click();
			 demo.Textcomparsion(tol.ganrotangle, "1", test, driver);
			 Thread.sleep(1000);
			 
			 tol.ganrotangle.click();
			 driver.switchTo().activeElement().clear();
			 driver.switchTo().activeElement().sendKeys("2.5");
			 
			 Beamrotaion=driver.findElements(By.name("Rotation Angle (deg)")).get(4);
			 Beamrotaion.click();
			 driver.switchTo().activeElement().clear();
			 driver.switchTo().activeElement().sendKeys("2.5");
			 
			 tol.jaws.click();
			 driver.switchTo().activeElement().clear();
			 driver.switchTo().activeElement().sendKeys("2.5");
			 
			 tol.mlcleaf1.click();
			 driver.switchTo().activeElement().clear();
			 driver.switchTo().activeElement().sendKeys("2.5");
			 
			 tol.mlcleaf2.click();
			 driver.switchTo().activeElement().clear();
			 driver.switchTo().activeElement().sendKeys("2.5");
			 
			 PatientBeamrotaion=driver.findElements(By.name("Rotation Angle (deg)")).get(5);
			 PatientBeamrotaion.click();
			 driver.switchTo().activeElement().clear();
			 driver.switchTo().activeElement().sendKeys("2.5");
			 
			 tol.longitudinal.click();
			 driver.switchTo().activeElement().clear();
			 driver.switchTo().activeElement().sendKeys("2.5");
			 
			 tol.lateral.click();
			 driver.switchTo().activeElement().clear();
			 driver.switchTo().activeElement().sendKeys("2.5");
			 
			 tol.vertical.click();
			 driver.switchTo().activeElement().clear();
			 driver.switchTo().activeElement().sendKeys("2.5");
			 
			 tol.pitch.click();
			 driver.switchTo().activeElement().clear();
			 driver.switchTo().activeElement().sendKeys("2.5");
			 
			 tol.roll.click();
			 driver.switchTo().activeElement().clear();
			 driver.switchTo().activeElement().sendKeys("2.5");
			 
			 update();
			 Thread.sleep(2000);
			
			 test = extent.createTest(funTestCaseName()+" Click on Edit the data and Update the data"); 
			 edit("D:\\Help\\Tolerance\\TEdit.PNG");
			 demo.ByValidErrormessage(tol.ganrotangle, "2.5", test, driver);
			 demo.ByValidErrormessage(tol.jaws, "2.5", test, driver);
			 demo.ByValidErrormessage(tol.mlcleaf1, "2.5", test, driver);
			 demo.ByValidErrormessage(tol.mlcleaf2, "2.5", test, driver);
			 demo.ByValidErrormessage(tol.PatientSupport, "2.5", test, driver);
			 demo.ByValidErrormessage(tol.longitudinal, "2.5", test, driver);
			 demo.ByValidErrormessage(tol.lateral, "2.5", test, driver);
			 demo.ByValidErrormessage(tol.vertical, "2.5", test, driver);
			 demo.ByValidErrormessage(tol.pitch, "2.5", test, driver);
			 demo.ByValidErrormessage(tol.roll, "2.5", test, driver);
			 tol.Refresh.click();
		}
		 @Test(priority=41)
		 public void datadelete() throws IOException, FindFailed, InterruptedException {
			 test = extent.createTest(funTestCaseName()+" Click on the delete button, pop-up should be displayed"); 
			 edit("D:\\Help\\Tolerance\\Tdelete.PNG");
			 SitesaveCancel("Tolerance Table Delete", "Do you want to delete the selected tolerance table?", "Tolerance Table Delete", "Do you want to delete the selected tolerance table?", 2, driver);
			 edit("D:\\Help\\Tolerance\\Tdelete.PNG");
			 Sitesave("Tolerance Table Delete", "Do you want to delete the selected tolerance table?", "Tolerance Table Delete", "Do you want to delete the selected tolerance table?", 2, driver);
             Sitesave("Tolerance Table Delete", "Selected Tolerance Table deleted.", "Tolerance Table Delete", "Selected Tolerance Table deleted.", 2, driver);
			 test.pass("Delete pop-up is displayed");
		 }
		 @Test(priority=42)
		 public void dataview() throws IOException, SikuliException {
			 test = extent.createTest(funTestCaseName()+" Click on the View button, Update button should be disable"); 
			 edit("D:\\Help\\Tolerance\\TView.PNG"); 
			 demo.BydefaultisEnabled(tol.Update, "Update", test, driver);
			 demo.BydefaultisEnabled(tol.tablenumber, "Tablenumber", test, driver);
			 demo.BydefaultisEnabled(tol.tablename, "Tablename", test, driver);
			 demo.BydefaultisEnabled(tol.ganrotangle, "Ganrotaangle", test, driver);
			 demo.BydefaultisEnabled(tol.beamlimit, "Beamlimit", test, driver);
			 demo.BydefaultisEnabled(tol.jaws, "Jaws", test, driver);
			 demo.BydefaultisEnabled(tol.mlcleaf1, "Mlcleaf1", test, driver);
			 demo.BydefaultisEnabled(tol.mlcleaf2, "Mlcleaf2", test, driver);
			 demo.BydefaultisEnabled(tol.PatientSupport, "Patientsupport", test, driver);
			 demo.BydefaultisEnabled(tol.longitudinal, "longitudinal", test, driver);
			 demo.BydefaultisEnabled(tol.lateral, "lateral", test, driver);
			 demo.BydefaultisEnabled(tol.vertical, "Vertical", test, driver);
			 demo.BydefaultisEnabled(tol.pitch, "Pitch", test, driver);
			 demo.BydefaultisEnabled(tol.roll, "Roll", test, driver);
			 addicon();
		 }
		//*************************Page Navigation add**************************
			@Test(priority = 43)
			public void pagefirst() throws IOException
			{
				test = extent.createTest(guiTestCaseName()+" To verify first page button is displayed");
				demo.isdisplayed(tol.FirstPageButton,"First page button", test,driver);
				demo.BydefaultisEnabled(tol.FirstPageButton,"First page button", test,driver);
			}
			@Test(priority = 43)
			public void pagesecond() throws IOException
			{
				test = extent.createTest(guiTestCaseName()+" To verify Previous Page button is displayed");
				demo.isdisplayed(tol.PreviousPageButton,"PreviousPageButton button is displayed", test,driver);
				demo.BydefaultisEnabled(tol.PreviousPageButton,"PreviousPageButton button is displayed", test,driver);
			}
			@Test(priority = 44)
			public void pageNext() throws IOException
			{
				test = extent.createTest(guiTestCaseName()+" To verify Next Page button is displayed");
				demo.isdisplayed(tol.NextPageButton,"NextPageButton button", test,driver);
				demo.BydefaultisEnabled(tol.NextPageButton,"NextPageButton button", test,driver);

			}
			@Test(priority = 45)
			public void pagelast() throws IOException
			{
				test = extent.createTest(guiTestCaseName()+" To verify Last Page button is displayed");
				demo.isdisplayed(tol.LastPageButton,"LastPage button", test,driver);
				demo.BydefaultisEnabled(tol.LastPageButton,"LastPage button", test,driver);

			}
			
			 @Test(priority=46, dataProvider = "testDataCase")
			 public void ValidNameNavigation(String Testcase,String Number, String Name, String GR,String BR,String Jaws,String MLC1,String MLC2,String PR,String Long,String Lateral,String Vertical,String Pitch,String Roll) throws IOException, InterruptedException
			 {	 
				 try {
				 ToleranceName(Testcase,Number,Name,GR,BR,Jaws,MLC1,MLC2,PR,Long,Lateral,Vertical,Pitch,Roll); 
				 SaveTolerance(test);
				 }
				 catch(Exception e)
			 	 {
			 	test.error(e);
			 	 }
			 }
		 
		 
			 @Test(priority = 47)
				public void pageenabled() throws IOException, InterruptedException
				{
				        test = extent.createTest(guiTestCaseName()+" To verify  Next and Last are enabled if enetred more tolerance data");
				        demo.isEnabled(tol.NextPageButton,"Next page button", test,driver);
				    	demo.isEnabled(tol.LastPageButton,"Last page button", test,driver);
				    }
				    	
	
				@Test(priority = 48)
				public void Nextpageenable() throws IOException, FindFailed, InterruptedException
				{
					if(tol.NextPageButton.isEnabled())
					{
						tol.NextPageButton.click();
						test = extent.createTest(guiTestCaseName()+" To verify Click on the Next, First and Previous are enabled");
						demo.isEnabled(tol.FirstPageButton,"First page button", test,driver);
						demo.isEnabled(tol.PreviousPageButton,"PreviousPageButton", test,driver);
					}
					else {
						test.fail("Next Page button is not enabled");
					}
					
				}
				@Test(priority = 49)
				public void previouspageenabled() throws FindFailed, IOException, InterruptedException
				{
					if(tol.PreviousPageButton.isEnabled())
					{
						tol.PreviousPageButton.click();
						test = extent.createTest(guiTestCaseName()+" To verify Click on the Previous, Next and Last are enabled");
						demo.isEnabled(tol.NextPageButton,"Next page button", test,driver);
				    	demo.isEnabled(tol.LastPageButton,"Last page button", test,driver);
					}
					else {
						test.fail("PreviousPageButton is not enabled");
					}	
						
				}
				@Test(priority = 50)
				public void Lastpageenabled() throws FindFailed, IOException, InterruptedException
				{
					if(tol.LastPageButton.isEnabled())
					{
						tol.LastPageButton.click();
						test = extent.createTest(guiTestCaseName()+" To verify Click on the Last, First and Previous are enabled");
						demo.isEnabled(tol.FirstPageButton,"First page button", test,driver);
						demo.isEnabled(tol.PreviousPageButton,"PreviousPageButton", test,driver);
					}
					else {
						test.fail("LastPageButton is not enabled");
					}
				}
				@Test(priority = 51)
				public void FirstPageEnabled() throws FindFailed, IOException, InterruptedException
				{
					if(tol.FirstPageButton.isEnabled())
					{
						tol.FirstPageButton.click();
						test = extent.createTest(guiTestCaseName()+" To verify Click on the First, Next and Last are enabled");
						demo.isEnabled(tol.NextPageButton,"Next page button", test,driver);
				    	demo.isEnabled(tol.LastPageButton,"Last page button", test,driver);
					}
					else {
						test.fail("First Page button is not enabled");
					}
				}
		 
		 
				 @Test(priority=52, dataProvider = "testDataCaseexits")
				 public void Alreadydataexits(String Testcase,String Number, String Name, String GR,String BR,String Jaws,String MLC1,String MLC2,String PR,String Long,String Lateral,String Vertical,String Pitch,String Roll, String E1, String E2) throws IOException, InterruptedException
				 {	 
					 try {
					
					 ToleranceName(Testcase,Number,Name,GR,BR,Jaws,MLC1,MLC2,PR,Long,Lateral,Vertical,Pitch,Roll); 
					 demo.isdisplayed(tol.Numberexits, E1, test, driver);
					 demo.isdisplayed(tol.Nameexits, E2, test, driver);
					 demo.BydefaultisEnabled(tol.Save,"Save",test, driver);
					 }
					 catch(Exception e)
				 	 {
				 	test.error(e);
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
	
	 public void Rotation(int i, WebDriver driver) throws InterruptedException
		{
			By locator = By.name("Rotation Angle (deg)");
			List<WebElement> elements = driver.findElements(locator);
			Thread.sleep(1000);
			System.out.println(elements.size());
			int desiredIndex = i; 
			if (desiredIndex < elements.size()) {
				Thread.sleep(1000);
			    WebElement element = elements.get(desiredIndex);
			   element.click();
			}
		}
	 public void SaveTolerance(ExtentTest test) throws InterruptedException, IOException
	 {
		 tol.Save.click();
		 try {
		 Sitesave1("Tolerance Table Add","Tolerance Table added for selected machine.","Tolerance Table Add","Tolerance Table added for selected machine.",1,driver,test);
		 }
		 catch(Exception e){
			 test.fail("No tolerance pop-up found");
		 }
	 }
	 
	 public void deleteclick(String Classtext, int i, ExtentTest test,WebDriver driver, String Text) throws IOException, FindFailed, InterruptedException {
		   // WebElement text = driver.findElement(By.className(Classtext));
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
		                SitesaveCancel("Tolerance Table Delete", "Do you want to delete the selected tolerance table?", "Tolerance Table Delete", "Do you want to delete the selected tolerance table?", 2, driver);
		                	}
		                	catch(Exception e){
		                		test.fail("Element not found");
		                	}
		                	
		                	try {
		                		 Sitesave("Tolerance Table Delete", "Do you want to delete the selected tolerance table?", "Tolerance Table Delete", "Do you want to delete the selected tolerance table?", 2, driver);
				                 Sitesave("Tolerance Table Delete", "Selected Tolerance Table deleted.", "Tolerance Table Delete", "Selected Tolerance Table deleted.", 2, driver);
				                	}
				                	catch(Exception e){
				                		test.fail("Element not found");
				                	}
		                    }
		                else {
		                	
		                }
		        }
	 }
	 
	@DataProvider(name = "testDatavalid")
	  public Object[][] testDatavalidname() {
	      return ToleranceDataproviderClass.getTestData("Sheet1"); 
	  }
	
	@DataProvider(name = "testDatainvalid")
	  public Object[][] testDatainvalidname() {
	      return ToleranceDataproviderClass.getTestData("Sheet2"); 
	  }
	
	@DataProvider(name = "testDataCase")
	  public Object[][] testDatacase() {
	      return ToleranceDataproviderClass.getTestData("Sheet3"); 
	  }
	
	@DataProvider(name = "testDataCaseexits")
	  public Object[][] testDataexits() {
	      return ToleranceDataproviderClass.getTestData("Sheet4"); 
	  }
	@AfterSuite
	public void tearDown() {
	    extent.flush();
	}
 
}
