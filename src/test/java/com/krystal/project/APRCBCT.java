package com.krystal.project;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import io.appium.java_client.windows.WindowsDriver;

public class APRCBCT extends ReferencefileChemotheraphy{
	 WebElement Role;
		private WebElement select;
		private RolePOM rol;
		private WebElement select1;
		APRCbctPOM aprcbct;
		private Actions action;
		private Actions act;

		@Test(priority =1)
		public void Launch()  throws InterruptedException, IOException {
		//	DesiredCapabilities appCapabilities = new DesiredCapabilities();
		//	appCapabilities.setCapability("app", "C:\\Program Files\\Panacea Medical Technologies\\Krystal\\Krystal.exe");
		//	driver = new WindowsDriver<WebElement>(new URL("http://127.0.0.1:4723"), appCapabilities);
			ReferenceSigin Sign=new ReferenceSigin();
			Sign.Login(driver);
			Sign.APRCBCTSettings(driver);
			aprcbct=new APRCbctPOM(driver);
			action=new Actions(driver);
			act=new Actions(driver);
		  }

		@Test(priority =1)
		public void GeneralSettings() throws IOException {
			test = extent.createTest("======GENERAL SETTINGS(APRCBCT SETTINGS)=====");
		test = extent.createTest(guiTestCaseName()+" General Settings label"," General Settings label should be present ");	
		demo.Textcomparsion(aprcbct.general, "General Settings", test,driver);
		}
		
		@Test(priority =2)
		public void Aprcbctconfiguration() throws IOException {
		test = extent.createTest(guiTestCaseName()+" APR CBCT CONFIGURATION label"," APR CBCT CONFIGURATION label should be present ");	
		demo.Textcomparsion(aprcbct.aprcbctconfig, "APR CBCT CONFIGURATION", test,driver);
		}
		
		@Test(priority =3)
		public void Aprcbctid() throws IOException {
		test = extent.createTest(guiTestCaseName()+" APR CBCT ID label"," APR CBCT ID label should be present ");	
		demo.Textcomparsion(aprcbct.aprcbctid, "APR CBCT ID", test,driver);
		}
	   @Test(priority =4)
		public void Aprsitelist() throws IOException {
		test = extent.createTest(guiTestCaseName()+" APR Site List label"," APR Site List label should be present ");	
		demo.Textcomparsion(aprcbct.aprsitelist, "APR Site List", test,driver);
		}
	 @Test(priority =7)
		public void Aprpatientsize() throws IOException {
		test = extent.createTest(guiTestCaseName()+" APR Patient Size label"," APR Patient Size label should be present ");	
		demo.Textcomparsion(aprcbct.aprpatientsize1, " APR Patient Size", test,driver);
		}
	 @Test(priority =8)
		public void Patientsize() throws IOException {
		test = extent.createTest(guiTestCaseName()+"  Patient Size label","  Patient Size label should be present ");	
		demo.Textcomparsion(aprcbct.patientsize, " Patient Size", test,driver);
		}
	 @Test(priority =9)
	 public void Paediatric() throws IOException {
	 test = extent.createTest(guiTestCaseName()+" Paediatric label","  Paediatric label should be present ");	
	 demo.Textcomparsion(aprcbct.paediatric, " Paediatric", test,driver);
	 }
	 @Test(priority =10)
	 public void Small() throws IOException {
	 test = extent.createTest(guiTestCaseName()+" Small label","  Small label should be present ");	
	 demo.Textcomparsion(aprcbct.small, " Small", test,driver);
	 }
	 
	 @Test(priority =11)
	 public void Medium() throws IOException {
	 test = extent.createTest(guiTestCaseName()+" Medium label"," Medium label should be present ");	
	  demo.Textcomparsion(aprcbct.medium, " Medium", test,driver);
	 }
	  @Test(priority =12)
	 public void Large() throws IOException {
	 test = extent.createTest(guiTestCaseName()+" Large label"," Large label should be present ");	
	  demo.Textcomparsion(aprcbct.large, " Large", test,driver);
	 }
	  @Test(priority =13)
	 	public void Aprfanselection() throws IOException {
	 	test = extent.createTest(guiTestCaseName()+" APR Fan Selection label"," APR Fan Selection label should be present ");	
	 	demo.Textcomparsion(aprcbct.aprfanselection, " APR Fan Selection", test,driver);
	 	}
	 @Test(priority =14)
	 	public void Fantype() throws IOException {
	 	test = extent.createTest(guiTestCaseName()+" Fan Type label"," Fan Type label should be present ");	
	 	demo.Textcomparsion(aprcbct.fantype, " Fan Type", test,driver);
	 	}
	 @Test(priority =15)
	 	public void Halffan() throws IOException {
	 	test = extent.createTest(guiTestCaseName()+" Half Fan label"," Half Fan label should be present ");	
	 	demo.Textcomparsion(aprcbct.halffan, " Half Fan", test,driver);
	 	}
		
	 @Test(priority =16)
		public void Fullfan() throws IOException {
		test = extent.createTest(guiTestCaseName()+" Full Fan label"," Full Fan label should be present ");	
		demo.Textcomparsion(aprcbct.fullfan, " Full Fan", test,driver);
		}
	@Test(priority =17)
		public void Nofan() throws IOException {
		test = extent.createTest(guiTestCaseName()+" No Fan label"," No Fan label should be present ");	
		demo.Textcomparsion(aprcbct.nofan, " No Fan", test,driver);
		}

	@Test(priority =18)
	public void kv() throws IOException {
	test = extent.createTest(guiTestCaseName()+" kV label"," kV label should be present ");	
	demo.Textcomparsion(aprcbct.kv, " kV", test,driver);
	}
	@Test(priority =19)
	public void mA1() throws IOException {
	test = extent.createTest(guiTestCaseName()+" mA label"," mA label should be present ");	
	demo.Textcomparsion(aprcbct.ma, " mA", test,driver);
	}
	@Test(priority =20)
	public void ms1() throws IOException {
	test = extent.createTest(guiTestCaseName()+" ms label"," ms label should be present ");	
	demo.Textcomparsion(aprcbct.ms, " ms", test,driver);
	}
		
	@Test(priority =21)
	public void Frameratepersecond() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Frame Rate per second label"," Frame Rate per second label should be present ");	
	demo.Textcomparsion(aprcbct.framerate, " Frame Rate per second", test,driver);
	}
	@Test(priority =22)
	public void TubeSelection11() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Tube Selection label"," Tube Selection label should be present ");	
	demo.Textcomparsion(aprcbct.tube, " Frame Rate per second", test,driver);
	}

	@Test(priority =23)
	public void Gantryspeed() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Gantry Speed (deg/sec) label"," Gantry Speed (deg/sec) label should be present ");	
	demo.Textcomparsion(aprcbct.gantryspeed, " Gantry Speed (deg/sec)", test,driver);
	}
	@Test(priority =24)
	public void Scanstartangle() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Scan Start Angle(deg) label"," Scan Start Angle(deg) label should be present ");	
	demo.Textcomparsion(aprcbct.scanstartangle, " Scan Start Angle(deg)", test,driver);
	}
	@Test(priority =25)
	public void Scanstopangle() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Scan Stop Angle(deg) label"," Scan Stop Angle(deg) label should be present ");	
	demo.Textcomparsion(aprcbct.scanstopangle, " Scan Stop Angle(deg)", test,driver);
	}	
		
	@Test(priority =26)
	public void Dosecgy() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Dose(cGy) label"," Dose(cGy) label should be present ");	
	demo.Textcomparsion(aprcbct.dosecgy, " Dose(cGy)", test,driver);
	}
	 
	@Test(priority =27)
	public void Aprcbctlist() throws IOException {
	test = extent.createTest(guiTestCaseName()+" APR CBCT LIST label"," APR CBCT LIST label should be present ");	
	demo.Textcomparsion(aprcbct.aprcbctlist, " APR CBCT LIST", test,driver);
	}
	@Test(priority =28)
	public void Selectmachine() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Select Machine label"," Select Machine label should be present ");	
	demo.Textcomparsion(aprcbct.selectmachine, " Select Machine", test,driver);
	}
	@Test(priority =29)
	public void Searchaprcbctid() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Search APR CBCT ID label"," Search APR CBCT ID label should be present ");	
	demo.Textcomparsion(aprcbct.searchaprcbctid, " Search APR CBCT ID", test,driver);
	}
	@Test(priority =30)
	public void Aprcbctid1() throws IOException {
	test = extent.createTest(guiTestCaseName()+" APR CBCT ID label"," APR CBCT ID label should be present ");	
	demo.Textcomparsion(aprcbct.aprcbctidlist, " APR CBCT ID", test,driver);
	}
	@Test(priority =31)
	public void Createddate() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Created Date label"," Created Date label should be present ");	
	demo.Textcomparsion(aprcbct.createddate, " Created Date", test,driver);
	}
	@Test(priority =32)
	public void Modifieddate() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Modified Date label"," Modified Date label should be present ");	
	demo.Textcomparsion(aprcbct.modifieddate, " Modified Date", test,driver);
	}
		
	@Test(priority =33)
	public void ViewApr() throws IOException {
	test = extent.createTest(guiTestCaseName()+" APR ID label"," APR ID label should be present ");	
	demo.Textcomparsion(aprcbct.view, " APR ID:", test,driver);
	}

	@Test(priority =34)
	public void APRID() throws IOException {
	test = extent.createTest(guiTestCaseName()+" APR ID label"," APR ID label should be present ");	
	demo.Textcomparsion(aprcbct.aprid, " APR ID:", test,driver);
	}

	@Test(priority =35)
	public void CBCT() throws IOException {
	test = extent.createTest(guiTestCaseName()+" CBCT label"," CBCT label should be present ");	
	demo.Textcomparsion(aprcbct.cbct, " CBCT", test,driver);
	}

	@Test(priority =36)
	public void Slno() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Slno label"," Slno label should be present ");	
	demo.Textcomparsion(aprcbct.slno, " Sl No", test,driver);
	}
	@Test(priority =37)
	public void Site1() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Site label"," Site label should be present ");	
	demo.Textcomparsion(aprcbct.site, " Site", test,driver);
	}
	@Test(priority =38)
	public void Imagingtype() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Imagingtype label"," Imagingtype label should be present ");	
	demo.Textcomparsion(aprcbct.imaging, "Imaging Type", test,driver);
	}
	@Test(priority =39)
	public void Patientsize1() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Patient Size label"," Patient Size label should be present ");	
	demo.Textcomparsion(aprcbct.patient, "Patient Size", test,driver);
	}
	@Test(priority =40)
	public void Fantype1() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Fantype label"," Fantype label should be present ");	
	demo.Textcomparsion(aprcbct.fantype1, "Fan Type", test,driver);
	}
	@Test(priority =41)
	public void kV() throws IOException {
	test = extent.createTest(guiTestCaseName()+" KV label"," Kv label should be present ");	
	demo.Textcomparsion(aprcbct.kv1, "kV", test,driver);
	}
	@Test(priority =42)
	public void ma() throws IOException {
	test = extent.createTest(guiTestCaseName()+" ma label"," ma label should be present ");	
	demo.Textcomparsion(aprcbct.ma1, "mA", test,driver);
	}
	@Test(priority =43)
	public void ms2() throws IOException {
	test = extent.createTest(guiTestCaseName()+" ms label"," ms label should be present ");	
	demo.Textcomparsion(aprcbct.ms1, "ms", test,driver);
	}
	@Test(priority =44)
	public void Dose1() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Dose label"," Dose label should be present ");	
	demo.Textcomparsion(aprcbct.dose, "Dose", test,driver);
	}
	@Test(priority =45)
	public void FrameRate1() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Frame Rate label"," Frame Rate label should be present ");	
	demo.Textcomparsion(aprcbct.framerate1, "Frame Rate", test,driver);
	}
	@Test(priority =46)
	public void Tube() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Tube Selection label"," Tube Selection label should be present ");	
	demo.Textcomparsion(aprcbct.tube1, "Tube Selection", test,driver);
	}
	@Test(priority =47)
	public void Gantryspeed1() throws IOException {
	test = extent.createTest(guiTestCaseName()+" gantry speed label"," Gantry Speed label should be present ");	
	demo.Textcomparsion(aprcbct.gantry, "Gantry Speed", test,driver);
	}
	@Test(priority =48)
	public void Scan() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Scan Start Angle label"," Scan Start Angle label should be present ");	
	demo.Textcomparsion(aprcbct.scan, "Scan Start Angle", test,driver);
	}
	@Test(priority =49)
	public void Scanstopangle1() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Scan Stop Angle label"," Scan Stop Angle label should be present ");	
	demo.Textcomparsion(aprcbct.scanstop, "Scan Stop Angle", test,driver);
	}	
	
	
		//*********************************************DATABASE CONNECTION*********************************************

	//************************************Fun testing for each textfield*************************	
		//Note: kV,mA,ms not able to perform


		  @Test(priority =50)//******SMOKE testing
			public void databaseconnectionemptycheck() throws IOException
			{
				test = extent.createTest(funTestCaseName()+" To verify the Empty Database for APRIDModels");
				data(test);
				 test = extent.createTest(funTestCaseName()+" To verify the Empty Database for  APRDataModels");
				dataapr(test);
			}
			
			@Test(priority =51)
			public void APRSmall() throws ClassNotFoundException, SQLException, IOException, InterruptedException
			{
				
				 String[] Elements= {"Pediatric", "Small", "Medium", "Large"};
				 String[] webElements = {"Half Fan","Full Fan","No Fan"};

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
			           Thread.sleep(1000);
			           mA();
			           Thread.sleep(1000);
			           ms();
			           Thread.sleep(1000);
			           Framerate();
			           TubeSelection();
			           Gantry1("1");
			           Scanstart("2");
			           Scanstop("3");
			        }
				 }
				 funAPRValid();
				 break;
				
		         	}
		         }
			}
			
		   @Test(priority =52)
			public void databaseconnectionExceution() throws IOException
			{
				test = extent.createTest(funTestCaseName()+" To verify the Saved data to Database for APRIDModels");
				data(test);
				 test = extent.createTest(funTestCaseName()+" To verify the Saved data to Database for APRDataModels");
				dataapr(test);
			}
		   
		   
		   
		   @Test(priority =53)
			public void View() throws Exception
			{
				 Roleconfig("D:\\Help\\APR\\CbctView.PNG");
				 test = extent.createTest(funTestCaseName()+ "Click on View Button, View Pop-up screen is displayed");
				 WebElement slno=driver.findElement(By.name("Sl No"));
				 demo.isdisplayed(slno, "Sl No", test, driver); 
			}
			@Test(priority =54)
			public void SlNo() throws IOException
			{
				 test = extent.createTest(guiTestCaseName()+ "Sl no label");
				 demo.Textcomparsion(aprcbct.SlNo, "Sl No", test,driver);
			}
			@Test(priority =55)
			public void Site11() throws IOException
			{
				 test = extent.createTest(guiTestCaseName()+ "Site label");
				 demo.Textcomparsion(aprcbct.Site, "Site", test,driver);
			}
			@Test(priority =56)
			public void ImagingType() throws IOException
			{
				 test = extent.createTest(guiTestCaseName()+ "Imaging Type label");
				 demo.Textcomparsion(aprcbct.ImagingType, "Imaging Type", test,driver);
			}
			@Test(priority =57)
			public void PatientSize1() throws IOException
			{
				 test = extent.createTest(guiTestCaseName()+ "Patient Size label");
				 demo.Textcomparsion(aprcbct.PatientSize, "Patient Size", test,driver);
			}
			@Test(priority =58)
			public void kv1() throws IOException
			{
				test = extent.createTest(guiTestCaseName()+ "KV label");
				demo.Textcomparsion(aprcbct.kV1, "kV", test,driver);
			}
			@Test(priority =59)
			public void mA11() throws IOException
			{
				test = extent.createTest(guiTestCaseName()+ "mA label");
				demo.Textcomparsion(aprcbct.mA1, "mA", test,driver);
			}
			@Test(priority =60)
			public void ms11() throws IOException
			{
				test = extent.createTest(guiTestCaseName()+ "ms label");
				demo.Textcomparsion(aprcbct.ms2, "ms", test,driver);
			}
			@Test(priority =61)
			public void Dose() throws IOException
			{
				test = extent.createTest(guiTestCaseName()+ "Dose label");
				demo.Textcomparsion(aprcbct.Dose, "Dose", test,driver);
			}
		
			@Test(priority =62)
			public void FanType() throws IOException
			{
				test = extent.createTest(guiTestCaseName()+ "Fan Type label");
				demo.Textcomparsion(aprcbct.FanType, "Fan Type", test,driver);
			}
			
			@Test(priority =63)
			public void FrameRate() throws IOException
			{
				test = extent.createTest(guiTestCaseName()+ "Frame Rate label");
				demo.Textcomparsion(aprcbct.FrameRate, "Frame Rate", test,driver);
			}
			
			@Test(priority =64)
			public void TubeSelection1() throws IOException
			{
				test = extent.createTest(guiTestCaseName()+ "Tube Selection label");
				demo.Textcomparsion(aprcbct.TubeSelection, "Tube Selection", test,driver);
			}
			
			@Test(priority =65)
			public void GantrySpeedView() throws IOException
			{
				test = extent.createTest(guiTestCaseName()+ "Gantry Speed label");
				demo.Textcomparsion(aprcbct.GantrySpeed, "Gantry Speed", test,driver);
			}
			
			
			@Test(priority =66)
			public void ScanStartAngleView() throws IOException
			{
				test = extent.createTest(guiTestCaseName()+ "Scan Start Angle label");
				demo.Textcomparsion(aprcbct.ScanStartAngle, "Scan Start Angle", test,driver);
			}
			
			
			@Test(priority =67)
			public void ScanStopAngleView() throws IOException
			{
				test = extent.createTest(guiTestCaseName()+ "Scan Stop Angle label");
				demo.Textcomparsion(aprcbct.ScanStopAngle, "Scan Stop Angle", test,driver);
			}
			
			@Test(priority =68)
			public void Doseindication() throws IOException
			{
				test = extent.createTest(guiTestCaseName()+ "Dose label");
				demo.Textcomparsion(aprcbct.Doseindication, "*Dose - cGy", test,driver);
			}
			
			@Test(priority =69)
			public void frameindication() throws IOException
			{
				test = extent.createTest(guiTestCaseName()+ "*Frame Rate - Frame per sec label");
				demo.Textcomparsion(aprcbct.FrameRatepersec, "*Frame Rate - Frame per sec", test,driver);
			}
			
			@Test(priority =70)
			public void startindication() throws IOException
			{
				test = extent.createTest(guiTestCaseName()+ "*Scan Start Angle - deg label");
				demo.Textcomparsion(aprcbct.startpersec, "*Scan Start Angle - deg", test,driver);
			}
			@Test(priority =71)
			public void stopindication() throws IOException
			{
				test = extent.createTest(guiTestCaseName()+ "*Scan Stop Angle - deg label");
				demo.Textcomparsion(aprcbct.stoppersec, "*Scan Stop Angle - deg", test,driver);
			}
		
		@Test(priority =72)
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
		test = extent.createTest(guiTestCaseName()+ " Click on Close icon, Pop-up should get closed");
		Roleconfig("D:\\Help\\APR\\CbctClose.PNG"); 
		Thread.sleep(1000);
		demo.isdisplayed(aprcbct.aprcbctconfig,"APR Configuration",test,driver);
		}
		
		public void Roleconfig(String Text) throws FindFailed {
			 Screen screen = new Screen();
			 String imagePath = Text;
			 Pattern pattern = new Pattern(imagePath);
		     Match match = screen.find(pattern);
		     match.click();
		 }
		@Test(priority =73)
		public void search() throws IOException, FindFailed
			{
			test = extent.createTest(funTestCaseName()+ "Click on the Search icon, Element should be searched"); 
			Roleconfig("D:\\Help\\APR\\SearchAPRCbct.PNG");
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
		@Test(priority =74)	
		 public void APRtestboxadd() throws FindFailed, IOException
		 {
			 test = extent.createTest(funTestCaseName()+ "Click on the Add icon, APR textbox should get empty"); 
			 randomUpper(30);
		     validcaserefersh(randomStringUpper, test);
			 Roleconfig("D:\\Help\\Role\\Radd.PNG"); 
			 aprcbct.aprcbctid.click();
			 demo.isempty(aprcbct.aprcbctid, "APRID",test, driver);
		 }
			@Test(priority =75)
		 public void APRtestboxrefersh() throws FindFailed, IOException
		 {
			 test = extent.createTest(funTestCaseName()+ "Click on the Refersh icon, APR textbox should get empty"); 
			 randomUpper(30);
		     validcaserefersh(randomStringUpper, test);
			 Roleconfig("D:\\Help\\Role\\Refersh.PNG"); 
			 aprcbct.aprcbctid.click();
			 demo.isempty(aprcbct.aprcbctid, "APRID",test, driver);
		 }
			@Test(priority =76)
			public void delete() throws IOException, InterruptedException, FindFailed
			{
				try {
				 Roleconfig("D:\\Help\\APR\\Delete.PNG"); 
				 test = extent.createTest(funTestCaseName()+ "Click on the delete icon, Click on the cancel button");
				 Rollcontainscancel("APR delete", "Do you want to delete the APR data", "APR delete", "Do you want to delete the APR data",test,driver);
				}
				catch(Exception e)
				{
					catchexceptionscreenshot(test,e);
				}
				 test = extent.createTest(funTestCaseName()+ "Click on the delete icon, Click on the OK button");
				 Roleconfig("D:\\Help\\APR\\Delete.PNG"); 
				 Rollcontains("APR delete", "Do you want to delete the APR data", "APR delete", "Do you want to delete the APR data",test,driver);
				 Sitesave("APR delete","Selected APR details deleted.", "APR delete","Selected APR details deleted.",1, driver);
			}
			@Test(priority =77)
			public void databaseconnectiondeleted() throws IOException
			{
				test = extent.createTest(funTestCaseName()+" To verify the Datadeleted should be empty in Database for APRIDModels");
				data(test);
				 test = extent.createTest(funTestCaseName()+" To verify the Datadeleted should be empty data to Database for APRDataModels");
				dataapr(test);
			}
			
			
			@Test(priority =78)
			public void GantrySpeed() throws ClassNotFoundException, SQLException, IOException, InterruptedException
			{
				test = extent.createTest(funTestCaseName()+" To verify the enetered Gantry speed valid data no error message displayed");
				CbctSite();
				Gantry("0.1");
				demo.ByValidErrormessage(aprcbct.Gantryspeed, "0.1", test, driver);
				Errormessagenotdisplayed(test,"Range:[0.1 to 6]");
				aprcbct.Gantryspeed.click();
				driver.switchTo().activeElement().clear();
				Gantry("0.2");
				demo.ByValidErrormessage(aprcbct.Gantryspeed, "0.2", test, driver);
				Errormessagenotdisplayed(test,"Range:[0.1 to 6]");
				aprcbct.Gantryspeed.click();
				driver.switchTo().activeElement().clear();
				Gantry("5");
				demo.ByValidErrormessage(aprcbct.Gantryspeed, "5", test, driver);
				Errormessagenotdisplayed(test,"Range:[0.1 to 6]");
				aprcbct.Gantryspeed.click();
				Thread.sleep(1000);
				driver.switchTo().activeElement().clear();
				Gantry("6");
				demo.ByValidErrormessage(aprcbct.Gantryspeed, "6", test, driver);
				Errormessagenotdisplayed(test,"Range:[0.1 to 6]");
				aprcbct.Gantryspeed.click();
				Thread.sleep(1000);
				driver.switchTo().activeElement().clear();
			}
			@Test(priority =79)
			public void invalidgantrydata() throws IOException
			{
				test = extent.createTest(funTestCaseName()+" To verify the entered Gantry speed Invalid data no error message displayed");
				Gantry("-0.09");
				demo.ByValidErrormessage(aprcbct.Gantryspeed,"-0.09", test, driver);
				Errormessageisdisplayed(test,"Range:[0.1 to 6]","Range:[0.1 to 6]");
				aprcbct.Gantryspeed.click();
				driver.switchTo().activeElement().clear();
				Gantry("7");
				demo.ByValidErrormessage(aprcbct.Gantryspeed,"7", test, driver);
				aprcbct.Gantryspeed.click();
				Errormessageisdisplayed(test,"Range:[0.1 to 6]","Range:[0.1 to 6]");
				driver.switchTo().activeElement().clear();
			}
			@Test(priority =80)
			public void ScanStartAngle() throws IOException, ClassNotFoundException, SQLException
			{
				test = extent.createTest(funTestCaseName()+" To verify the enetered Scan Start angle valid data no error message displayed");
				CbctSite();
				Scanstart("0");
				demo.ByValidErrormessage(aprcbct.StartAngle,"0", test, driver);//0
				Errormessagenotdisplayed(test,"Range:[0 to 359.9]");
				aprcbct.StartAngle.click();
				driver.switchTo().activeElement().clear();
				
				Scanstart("1");
				demo.ByValidErrormessage(aprcbct.StartAngle,"1", test, driver);//1
				Errormessagenotdisplayed(test,"Range:[0 to 359.9]");
				aprcbct.StartAngle.click();
				driver.switchTo().activeElement().clear();
				
				Scanstart("359.8");
				demo.ByValidErrormessage(aprcbct.StartAngle,"359.8", test, driver);//359.8
				Errormessagenotdisplayed(test,"Range:[0 to 359.9]");
				aprcbct.StartAngle.click();
				driver.switchTo().activeElement().clear();
				
				Scanstart("359.9");
				demo.ByValidErrormessage(aprcbct.StartAngle,"359.9", test, driver);//359.9
				Errormessagenotdisplayed(test,"Range:[0 to 359.9]");
				aprcbct.StartAngle.click();
				driver.switchTo().activeElement().clear();
				
				Scanstart("359");
				demo.ByValidErrormessage(aprcbct.StartAngle,"359", test, driver);//359
				Errormessagenotdisplayed(test,"Range:[0 to 359.9]");
				aprcbct.StartAngle.click();
				driver.switchTo().activeElement().clear();
			}
			@Test(priority =81)
			public void invalidscanstartdata() throws IOException
			{
				test = extent.createTest(funTestCaseName()+" To verify the entered Scan Start angle Invalid data no error message displayed");
				Scanstart("-1");
				demo.ByValidErrormessage(aprcbct.StartAngle,"-1", test, driver);//0
				Errormessageisdisplayed(test,"Range:[0 to 359.9]","Range:[0 to 359.9]");
				aprcbct.StartAngle.click();
				driver.switchTo().activeElement().clear();

				Scanstart("360");
				demo.ByValidErrormessage(aprcbct.StartAngle,"360", test, driver);//0
				Errormessageisdisplayed(test,"Range:[0 to 359.9]","Range:[0 to 359.9]");
				aprcbct.StartAngle.click();
				driver.switchTo().activeElement().clear();
			}
			@Test(priority =82)
			public void ScanStopAngle() throws IOException, InterruptedException, ClassNotFoundException, SQLException
			{
				test = extent.createTest(funTestCaseName()+" To verify the enetered Scan stop angle valid data no error message displayed");
				CbctSite();
				Scanstop("0");
				demo.ByValidErrormessage(aprcbct.StopAngle,"0", test, driver);//0
				Errormessagenotdisplayed(test,"Range:[0 to 359.9]");
				aprcbct.StopAngle.click();
				driver.switchTo().activeElement().clear();
				
				Scanstop("1");
				demo.ByValidErrormessage(aprcbct.StopAngle,"1", test, driver);//1
				Errormessagenotdisplayed(test,"Range:[0 to 359.9]");
				aprcbct.StopAngle.click();
				driver.switchTo().activeElement().clear();
				
				Scanstop("359.8");
				demo.ByValidErrormessage(aprcbct.StopAngle,"359.8", test, driver);//359.8
				Errormessagenotdisplayed(test,"Range:[0 to 359.9]");
				aprcbct.StopAngle.click();
				driver.switchTo().activeElement().clear();
				
				Scanstop("359.9");
				demo.ByValidErrormessage(aprcbct.StopAngle,"359.9", test, driver);//359.9
				Errormessagenotdisplayed(test,"Range:[0 to 359.9]");
				aprcbct.StopAngle.click();
				Thread.sleep(1000);
				driver.switchTo().activeElement().clear();
				
				Scanstop("359");
				demo.ByValidErrormessage(aprcbct.StopAngle,"359", test, driver);//359
				Errormessagenotdisplayed(test,"Range:[0 to 359.9]");
				aprcbct.StopAngle.click();
				Thread.sleep(1000);
				driver.switchTo().activeElement().clear();
			}
			@Test(priority =83)
			public void invalidscanstopdata() throws IOException, InterruptedException
			{
				test = extent.createTest(funTestCaseName()+" To verify the entered Scan stop angle Invalid data no error message displayed");
				Scanstop("-1");
				demo.ByValidErrormessage(aprcbct.StopAngle,"-1", test, driver);//0
				Errormessageisdisplayed(test,"Range:[0 to 359.9]","Range:[0 to 359.9]");
				Thread.sleep(1000);
				aprcbct.StopAngle.click();
				driver.switchTo().activeElement().clear();

				Scanstop("360");
				demo.ByValidErrormessage(aprcbct.StopAngle,"360", test, driver);//0
				Errormessageisdisplayed(test,"Range:[0 to 359.9]","Range:[0 to 359.9]");
				aprcbct.StopAngle.click();
				driver.switchTo().activeElement().clear();
			}
			@Test(priority = 84)
			public void startandstopsame() throws IOException, ClassNotFoundException, SQLException
			{
				CbctSite();
				try {
				test = extent.createTest(funTestCaseName()+" To verify entered Start and Stop angle is Same, Error message should display");
				Scanstart("3");
				Scanstop("3");
				Thread.sleep(1000);
				Errormessageisdisplayed(test,"Scan start & stop angle cannot be the same","Scan start & stop angle cannot be the same");
				Thread.sleep(1000);
				}
				catch(Exception e)
				{
					catchexceptionscreenshot(test,e);
				}
				
				try {
					test = extent.createTest(funTestCaseName()+" To verify start and stop is same and chnaged the start angle, Error message should not display");
					aprcbct.StartAngle.click();
					driver.switchTo().activeElement().clear();
					Scanstart("2");
					aprcbct.StopAngle.click();
					driver.switchTo().activeElement().clear();
					Scanstop("3");
					Errormessagenotdisplayed(test,"Scan start & stop angle cannot be the same");
				}
				catch(Exception e)
				{
					catchexceptionscreenshot(test,e);
				}
			}
			@Test(priority =85)
				public void startandstopgreater() throws IOException
				{
					try {
						test = extent.createTest(funTestCaseName()+" To verify start angle is greater than the stopangle, Error message should get displayed");
						aprcbct.StartAngle.click();
						driver.switchTo().activeElement().clear();
						Scanstart("5");
						aprcbct.StopAngle.click();
						driver.switchTo().activeElement().clear();
						Scanstop("3");
						Thread.sleep(1000);
						Errormessageisdisplayed(test,"Start angle cannot be greater then Stop angle.","Start angle cannot be greater then Stop angle.");
						Thread.sleep(1000);
						Errormessageisdisplayed(test,"Stop angle cannot be less then Start angle.","Stop angle cannot be less then Start angle.");
						Thread.sleep(1000);
						
						test = extent.createTest(funTestCaseName()+" To verify start angle is empty and stop angle displayed error message not displayed");
						aprcbct.StartAngle.click();
						driver.switchTo().activeElement().clear();
						Scanstart("2");
						Errormessagenotdisplayed(test,"Start angle cannot be greater then Stop angle.");
						Errormessagenotdisplayed(test,"Stop angle cannot be less then Start angle.");
					}
					catch(Exception e)
					{
						catchexceptionscreenshot(test,e);
					}
				}
			
			
			@Test(priority =86)
			public void aprccbctdata() throws ClassNotFoundException, SQLException, IOException, InterruptedException
			{
				APRSmall();
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
							catchexceptionscreenshot(test,e);
					 } 
				 
				 try {
				
					 invalidcase(randomString, "APR ID already exists", "APR ID already exists", test);
					 invalidsaveapr();
					 errormessagedisplayed1("APR ID already exists", "APR ID already exists", test);
					 }
					catch(Exception e)
					 {
						catchexceptionscreenshot(test,e);
					 } 
				 try {
					 test = extent.createTest(funTestCaseName()+ " Entered invalid  data specialchars \\,");
					 invalidcase("\\", "Input must not contain \\ , '' , '\"", "Input must not contain \\ , '' , '\"", test);
					 invalidsaveapr();
					 errormessagecontains("Input must not contain",test,driver);
					 }
					 catch(Exception e)
					 {
							catchexceptionscreenshot(test,e);
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
			 public void invalidcase(String Text, String InputText, String ExceptedDescription, ExtentTest test1) throws IOException
			 {
				 aprcbct.aprid.click();
				 driver.switchTo().activeElement().clear();
				 driver.switchTo().activeElement().sendKeys(Text); 
			 }
			 
			 public void invalidsaveapr() throws InterruptedException, IOException
				{
					aprcbct.Save.click();
					test = extent.createTest(funTestCaseName()+ "Verify Input cannot be blank error message displayed");
					Rollcontains("APR delete","Only completely configured site data", "APR delete","Only completely configured site data",test, driver);
					
				}
			 
			
			@Test(priority =87)
			public void APRlarge() throws ClassNotFoundException, SQLException, IOException, InterruptedException
			{
				 String[] Elements= {"Pediatric", "Small", "Medium", "Large"};
				 String[] webElements = {"Half Fan","Full Fan","No Fan"};

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
			          Thread.sleep(1000);
			          mA();
			          Thread.sleep(1000);
			          ms();
			          Thread.sleep(1000);
			          Framerate();
			          TubeSelection();
			   		  Gantry("1");
			   		  Scanstart("2");
			   		  Scanstop("3");
			        }
				 }
		         	}
		         }
		         try {
		         funAPRIDinvalid();
		         }
		         catch(Exception e){
		        		catchexceptionscreenshot(test,e);
		         }
		 		 funAPRIDtextbox();
			}
		@Test(priority =88)
		public void copy() throws IOException, InterruptedException, FindFailed
		{
			test = extent.createTest(funTestCaseName()+ "Click on the Copy button, the data should be copied");
			 Roleconfig("D:\\Help\\APR\\Copy.PNG"); 
			aprcbct.aprcbctid.click();
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
			if(aprcbct.Save.isEnabled())
			{
				aprcbct.Save.click();
			test = extent.createTest(funTestCaseName()+ "Save pop-up window, when click on the Copy button");
			Rollcontains("APR delete","Only completely configured site data", "APR delete","Only completely configured site data",test, driver);
			Sitesave("APR Configuration","APR data saved.", "APR Configuration","APR data saved.",1, driver);
			}
			else
			{
				test.fail("Save button is not enabled");
			}
			
		}
		
		@Test(priority =89)
		public void Edit() throws IOException, InterruptedException, FindFailed
		{
			test = extent.createTest(funTestCaseName()+ "Click on the Edit button, Update button should be enabled");
			 Roleconfig("D:\\Help\\APR\\Edit.PNG");
			if(aprcbct.Update.isEnabled())
			{
			demo.isEnabled(aprcbct.Update, "UPDATE", test, driver);
			demo.Textcomparsion(aprcbct.Update, "UPDATE", test, driver);
		   test = extent.createTest(funTestCaseName()+ "Click on the Update button, without changes in the data");
		   aprcbct.Update.click();
		   Rollcontains("APR delete","Only completely configured site data", "APR delete","Only completely configured site data",test, driver);
		   Sitesave("APR Configuration","APR data updated.", "APR Configuration","APR data updated.",1, driver);
			}
		   else
			{
				test.fail("Update button is not enabled");
			}
			 test = extent.createTest(funTestCaseName()+ "Click on the Edit button, APR ID textfield should be in disabled");
			 randomUpper(30);
			
			 driver.switchTo().activeElement().sendKeys(randomStringUpper);
			 demo.ByInvalidErrormessage(aprcbct.aprcbctid, randomStringUpper,test,driver);

		}
		@Test(priority =90)
		public void databaseconnectionEdit() throws IOException
		{
			test = extent.createTest(funTestCaseName()+" To verify the Saved data to Database for APRIDModels");
			data(test);
			 test = extent.createTest(funTestCaseName()+" To verify the Saved data to Database for APRDataModels");
			dataapr(test);
		}
			public void validcaserefersh(String Text, ExtentTest test1) throws IOException
			 {
				 try {
					 aprcbct.aprcbctid.click();
					 driver.switchTo().activeElement().sendKeys(Text);
					 demo.ByValidErrormessage(aprcbct.aprcbctid, Text, test1, driver);
					 }
					 catch(Exception e)
					 {
							catchexceptionscreenshot(test,e);
					 } 
			 }
		
		
		
		public void Errormessagenotdisplayed(ExtentTest test, String Text)
		{
			try
			{
				WebElement Errormessage=driver.findElement(By.name(Text));
				demo.isnotdisplayed(Errormessage, Text, test, driver);
			}
			catch(Exception e){
				test.pass(Text+"Range Error message not displayed");
			}
		}
		
		public void Errormessageisdisplayed(ExtentTest test,String Text, String EText)
		{
			WebElement Errormessage=driver.findElement(By.name(Text));
			try
			{
				demo.isdisplayed(Errormessage, EText, test, driver);
				demo.Textcomparsion(Errormessage, EText, test, driver);
			}
			catch(Exception e){
				test.fail(Text+"Range Error message not displayed");
			}
		}
		
		public void CbctSite() throws ClassNotFoundException, SQLException
		{
			ArrayList<String> SiteName = class1.Site();
			 
	         for (String siteName : SiteName) {
	         	WebElement element1=driver.findElement(By.name(siteName));
	         	Actions action=new  Actions(driver);
	         	action.moveToElement(element1).click().perform();
	         }
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		public void funAPRValid() throws IOException, InterruptedException
		{
			test =extent.createTest(funTestCaseName()+" APRID Entered Valid data and saave the data");
			 randomstringtext(30);
			 validcase(randomString,test);
			 saveapr();
		}
		public void validcase(String Text, ExtentTest test1)
		 {
			 try {
				 aprcbct.aprcbctid.click();
				 driver.switchTo().activeElement().clear();
				 driver.switchTo().activeElement().sendKeys(Text);
				 demo.ByValidErrormessage(aprcbct.aprcbctid, Text, test1, driver);
				 }
				 catch(Exception e)
				 {
					 test.error("An error occurred: " + e.getMessage());
				 } 
		 }
		public void saveapr() throws InterruptedException, IOException
		{
			aprcbct.Save.click();
			test = extent.createTest(funTestCaseName()+ "Save pop-up window");
			Rollcontains("APR delete","Only completely configured site data", "APR delete","Only completely configured site data",test, driver);
			Sitesave("APR CBCT Configuration","APR CBCT data saved.", "APR CBCT Configuration","APR CBCT data saved.",1, driver);
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
		
		public void Framerate()
		{
			WebElement Framerate=driver.findElements(By.className("ComboBox")).get(4);
			Framerate.click();
			WebElement first=driver.findElement(By.name("1"));
			Actions action=new Actions(driver);
			action.moveToElement(first).click().perform();
		}
		
		public void TubeSelection()
		{
			WebElement Framerate=driver.findElements(By.className("ComboBox")).get(5);
			Framerate.click();
			WebElement kV1=driver.findElement(By.name("kV1"));
			Actions action=new Actions(driver);
			action.moveToElement(kV1).click().perform();
		}
		public void Gantry(String Text)
		{
			aprcbct.Gantryspeed.click();
			driver.switchTo().activeElement().sendKeys(Text);
		}
		public void Gantry1(String Text) throws IOException, InterruptedException
		{
			aprcbct.Gantryspeed.click();
			driver.switchTo().activeElement().sendKeys(Text);
			demo.Textcomparsion(aprcbct.Gantryspeed, "0.1", test, driver);
			
			aprcbct.Gantryspeed.click();
			Errormessagenotdisplayed(test,"Range:[0.1 to 6]");
			Thread.sleep(1000);
			driver.switchTo().activeElement().clear();
		}
		
		public void Scanstart(String Text)
		{
			aprcbct.StartAngle.click();
			driver.switchTo().activeElement().sendKeys(Text);
		}
		public void Scanstop(String Text)
		{
			aprcbct.StopAngle.click();
			driver.switchTo().activeElement().sendKeys(Text);
		}

		public void data(ExtentTest test1) throws IOException {
		    try {
		        ArrayList<HashMap<String, String>> dataEntries = class1.getDataFromDatabasecbct();

		        StringBuilder tableHtml = new StringBuilder();
		        // Apply CSS styles for font size, row spacing, and table border
		        tableHtml.append("<table style='font-size: 16px; border-collapse: separate; border-spacing: 10px;'>");

		        // Create the table header row
		        tableHtml.append("<tr>");
		        for (String columnName : dataEntries.get(0).keySet()) {
		            tableHtml.append("<th>").append(columnName).append("</th>");
		        }
		        tableHtml.append("</tr>");

		        // Iterate through the data and add rows to the table
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
		 public void dataapr(ExtentTest test1) throws IOException {
			    try {
			        ArrayList<HashMap<String, String>> dataEntries = class1.getDataFromDatabaseAPRcbct();

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
		
		
		
	
	// Note: Delete is enabled or disabled integration was not checked.
}
