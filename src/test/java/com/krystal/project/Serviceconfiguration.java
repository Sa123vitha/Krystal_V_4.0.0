package com.krystal.project;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.appium.java_client.windows.WindowsDriver;

public class Serviceconfiguration extends ReferencefileChemotheraphy {
	
	
	
	ServiceConfigurationPOM Service;
	
	
	private String description;


	private Actions act;
	
	@Test(priority =1)
	public void Launch()  throws InterruptedException, IOException {
//	DesiredCapabilities appCapabilities = new DesiredCapabilities();
//	appCapabilities.setCapability("app", "C:\\Program Files\\Panacea Medical Technologies\\Krystal\\Krystal.exe");
//	driver = new WindowsDriver<WebElement>(new URL("http://127.0.0.1:4723"), appCapabilities);
	ReferenceSigin Sign=new ReferenceSigin();
	Sign.ServiceLogin(driver);
	Sign.ServiceConfig(driver);
	Service=new ServiceConfigurationPOM(driver);
	action=new Actions(driver);
	act=new Actions(driver);
  }
	
//	@Test(priority =1)
		public void button() throws InterruptedException{
		List<WebElement> elements = driver.findElements(By.className("TextBox"));
	Actions actions = new Actions(driver);
	for (WebElement element : elements) {
	    actions.moveToElement(element).perform();
	    System.out.println(element.getLocation());
	    System.out.println(element.getText());
	    System.out.println("********************************************");
	    Thread.sleep(1000);
	}
		}
	
	@Test(priority =2)
	public void ToverifyserviceconfigurationLabel() throws IOException {
	test = extent.createTest("!!!!!!!!!!SS(SERVICE CONFIGURATION)!!!!!!!");
	test = extent.createTest(guiTestCaseName()+" Service configuration label"," Service Configuration label should be present ");	
	demo.Textcomparsion(Service.serviceConfiguration, "Service Configuration", test, driver);
	}
@Test(priority =2)
	public void ToverifyapplicationpathsLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Application Paths label"," Application Paths label should be present ");	
	demo.Textcomparsion(Service.applicationPaths, "Application Paths", test, driver);
	}
@Test(priority =3)
	public void ToverifydicomimportLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Dicom Import label"," Dicom Import label should be present ");	
	demo.Textcomparsion(Service.dicomImport, "DICOM Import", test, driver);
	}
@Test(priority =4)
	public void ToverifydicomtosqltagchangeLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Dicom to SQL+Tag change label"," Dicom to SQL+Tag change label should be present ");	
	demo.Textcomparsion(Service.dicomtoSql, "DICOM to SQL  + Tag Change", test, driver);
	}
@Test(priority =5)
	public void ToverifydicomexportLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Dicom Export label"," Dicom Export label should be present ");	
	demo.Textcomparsion(Service.dicomExport, "DICOM Export", test, driver);
	}
@Test(priority =6)
	public void ToverifydicomplanvalidationLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Dicom plan validation label"," Dicom plan validation label should be present ");	
	demo.Textcomparsion(Service.dicomPlanValidation, "DICOM Plan Validation", test, driver);
	}
@Test(priority =7)
	public void ToverifyfluencyLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Fluency label"," fluency label should be present ");	
	demo.Textcomparsion(Service.fluencyMap, "Fluency Map", test, driver);
	}
@Test(priority =8)
	public void ToverifysopinstanceuidtagchangeLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" SOPInstanceUID Tag Change label"," SOPInstanceUID Tag Change label should be present ");	
	demo.Textcomparsion(Service.sopInstanceuidTagchange, "SOPInstanceUID Tag Change", test, driver);
	}
@Test(priority =9)
	public void ToverifymlcshaperLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" MLC Shaper label"," MLC Shaper label should be present ");	
	demo.Textcomparsion(Service.mlcShaper, "MLC Shaper", test, driver);
	}
@Test(priority =10)
	public void ToverifycreateplanfromexcelLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Create plan from excel label"," create plan from excel label should be present ");	
	demo.Textcomparsion(Service.createPlanFromExcel, "Create Plan From Excel", test, driver);
	}
@Test(priority =11)
	public void ToverifydeletedcmLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Delete DCM label"," Delete DCM label should be present ");	
	demo.Textcomparsion(Service.deleteDCM, "Delete DCM", test, driver);
	}
@Test(priority =12)
	public void ToverifydicomtosqltpsdataconversionLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" DICOM To SQL TPS Data Conversion label","DICOM To SQL TPS Data Conversion label should be present ");	
	demo.Textcomparsion(Service.dicomtoSqlTps, "DICOM To SQL TPS Data Conversion", test, driver);
	}
@Test(priority =13)
	public void ToverifydatabasepathsLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Database paths label"," Database paths label should be present ");	
	demo.Textcomparsion(Service.databasePaths, "Database Paths", test, driver);
	}

@Test(priority =13)
public void ToverifydatabaseCBCTViewer() throws IOException {
test = extent.createTest(guiTestCaseName()+" CBCT Viewer label"," CBCT Viewer  should be present ");	
demo.Textcomparsion(Service.CBCTViewer, "CBCT Viewer", test, driver);
}




@Test(priority =14)
	public void ToverifysourceLabel1() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Source label"," Source label should be present ");	
	demo.Textcomparsion(Service.asource, "Source", test, driver);
	}
@Test(priority =15)
	public void ToverifydatabasenameLabel1() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Database Name label"," Database Name label should be present ");	
	demo.Textcomparsion(Service.adatabaseName, "Database Name", test, driver);
	}
@Test(priority =16)
	public void ToverifyusernameLabel1() throws IOException {
	test = extent.createTest(guiTestCaseName()+" User Name label"," User Name label should be present ");	
	demo.Textcomparsion(Service.auserName, "User Name", test, driver);
	}
@Test(priority =17)
	public void ToverifypasswordLabel1() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Password label"," Password label should be present ");	
	demo.Textcomparsion(Service.apassword, "Password", test, driver);
	}
@Test(priority =18)
	public void ToverifyofflinesiddharthhospitalLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Oflline Siddharth Hospital label"," Oflline Siddharth Hospital label should be present ");	
	demo.Textcomparsion(Service.offlineSiddharthHospital, "Offline Siddharth Hospital", test, driver);
	}
@Test(priority =19)
	public void ToverifyofflineiddharthOfflinernvLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Oflline Siddharth OfflineRnV label"," Oflline Siddharth OfflineRnV label should be present ");	
	demo.Textcomparsion(Service.offlineSiddharthOffline, "Offline Siddharth OfflineRnV", test, driver);
	}
@Test(priority =20)
	public void ToverifyofflinesettingsLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Oflline Settings label"," Oflline Settings label should be present ");	
	demo.Textcomparsion(Service.offlineSettings, "Offline Settings", test, driver);
	}
@Test(priority =21)
	public void ToverifyimpactFactorySettingsLabel1() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Impact factory settings label","Impact Factory settings label should be present ");	
	demo.Textcomparsion(Service.impactFactorySettings, "Impact Factory Settings", test, driver);
	}

@Test(priority =22)
	public void ToverifyauditlogLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Audit Log label"," Audit Log label should be present ");	
	demo.Textcomparsion(Service.auditLog, "Audit Log", test, driver);
	}
@Test(priority =23)
	public void ToverifysourceLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Source label"," Source label should be present ");	
	demo.Textcomparsion(Service.bsource, "Source", test, driver);
	}
@Test(priority =24)
	public void ToverifydatabasenameLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Database name label"," Database name label should be present ");	
	demo.Textcomparsion(Service.bdatabaseName, "Database Name", test, driver);
	}
@Test(priority =25)
	public void ToverifyusernameLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+"  User name label"," User name label should be present ");	
	demo.Textcomparsion(Service.buserName, "User Name", test, driver);
	}
@Test(priority =26)
	public void ToverifypasswordLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Password label"," Password label should be present ");	
	demo.Textcomparsion(Service.bpassword, "Password", test, driver);
	}
@Test(priority =27)
	public void ToverifytemptreatmentLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Temp Treatment label"," Temp Treatment label should be present ");	
	demo.Textcomparsion(Service.tempTreatment, "Temp Treatment", test, driver);
	}
@Test(priority =28)
	public void ToverifyccbtreatmentLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" CCB treatment label"," CCB Treatment label should be present ");	
	demo.Textcomparsion(Service.ccbTreatment, "CCB Treatment", test, driver);
	}
@Test(priority =29)
	public void ToverifymachineqaLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" MachineQA label"," MachineQA label should be present ");	
	demo.Textcomparsion(Service.machineQA, "MachineQA", test, driver);
	}
@Test(priority =29)
	public void ToverifylanguagetranslatorLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Language translator label"," Language translator label should be present ");	
	demo.Textcomparsion(Service.languageTranslator, "LanguageTranslator", test, driver);
	}

@Test(priority =29)
public void ToverifyPatientQALabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" PatientQA label"," PatientQA label should be present ");	
demo.Textcomparsion(Service.PatientQA, "PatientQA", test, driver);
}
@Test(priority =30)
	public void ToverifyeditLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Edit label"," Edit label should be present ");	
	WebElement edit =driver.findElement(By.name("EDIT"));
	demo.Textcomparsion(edit, "EDIT", test, driver);
	demo.isEnabled(Service.edit, "EDIT", test, driver);
	}
@Test(priority =32)
	public void ToverifyconfigureandroidLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Configure android label"," Configure Android label should be present ");	
	demo.Textcomparsion(Service.configureAndroid, "CONFIGURE ANDROID", test, driver);
	demo.BydefaultisEnabled(Service.configureAndroid, "CONFIGURE ANDROID", test, driver);
	}
@Test(priority =33)
	public void ToverifylogenabledLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Log Enabled label"," Log Enabled label should be present ");	
	demo.Textcomparsion(Service.logEnabled, "Log Enabled", test, driver);
	}
@Test(priority =34)
	public void ToverifylanguagetranslationLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Language Translation label"," Language translation label should be present ");	
	demo.Textcomparsion(Service.languageTranslation, "Language Translation", test, driver);
	}



	
	Actions action;
	@Test(priority =35)
public void Applicationpaths() throws IOException, InterruptedException
{
	action = new Actions(driver);
	test = extent.createTest(funTestCaseName()+" Dicom Import Path Update");
	Service.edit.click();
	/*
	WebElement DicomImport=driver.findElements(By.className("TextBox")).get(0);
	Actions action=new Actions(driver);
	action.moveToElement(DicomImport).doubleClick().perform();
	Thread.sleep(1000);
	Ddriveacccess("DICOMImport","DicomImp.exe",action);
	demo.Textcomparsion(DicomImport, "D:\\DICOMImport\\DicomImp.exe", test, driver);
	*/
	
}
/*
	@Test(priority =36)	
	public void MLCShaper() throws IOException, InterruptedException
	{
		test = extent.createTest(funTestCaseName()+" MLC Shaper Update");
		WebElement MLCShaper=driver.findElements(By.className("TextBox")).get(1);
		Actions action=new Actions(driver);
		action.moveToElement(MLCShaper).doubleClick().perform();
		Ddriveacccess("KrystalMLC","mlc.exe",action);
		demo.Textcomparsion(MLCShaper, "D:\\KrystalMLC\\mlc.exe", test, driver);
		
	}
	
	@Test(priority =37)	
	public void SQLRTPlanChange() throws IOException, InterruptedException
	{
		test = extent.createTest(funTestCaseName()+" SQL RTPlan Change Update");
		WebElement SQLRTPlanChange=driver.findElements(By.className("TextBox")).get(2);
		action.moveToElement(SQLRTPlanChange).doubleClick().perform();
		Ddriveacccess("dicom2sql_RTplanChange_1.0.26","dicom2sql_RTplanChange_1.0.26.exe",action);
		demo.Textcomparsion(SQLRTPlanChange, "D:\\dicom2sql_RTplanChange_1.0.26\\dicom2sql_RTplanChange_1.0.26.exe", test, driver);
	}
		
	@Test(priority =38)	
	public void CreatePlanExcel() throws IOException, InterruptedException
	{
		test = extent.createTest(funTestCaseName()+" Create Plan Excel");
		WebElement CreatePlanExcel=driver.findElements(By.className("TextBox")).get(3);
		Actions action=new Actions(driver);
		action.moveToElement(CreatePlanExcel).doubleClick().perform();
		Ddriveacccess("CreatePlanfromExcel_1.0.9","CreatePlanfromExcel_1.0.9.exe",action);
		demo.Textcomparsion(CreatePlanExcel, "D:\\CreatePlanfromExcel_1.0.9\\CreatePlanfromExcel_1.0.9.exe", test, driver);
	}
	
	@Test(priority =39)	
	public void DicomExport() throws IOException, InterruptedException
	{
		test = extent.createTest(funTestCaseName()+" DicomExport");
		WebElement DicomExport=driver.findElements(By.className("TextBox")).get(4);
		Actions action=new Actions(driver);
		action.moveToElement(DicomExport).doubleClick().perform();
		Ddriveacccess("DICOMExport","DcmExport.exe",action);
		demo.Textcomparsion(DicomExport, "D:\\DICOMExport\\DcmExport.exe", test, driver);
	}
	
	@Test(priority =40)	
	public void DeleteDCM() throws IOException, InterruptedException
	{
		test = extent.createTest(funTestCaseName()+" DeleteDCM");
		WebElement DeleteDCM=driver.findElements(By.className("TextBox")).get(5);
		Actions action=new Actions(driver);
		action.moveToElement(DeleteDCM).doubleClick().perform();
		Ddriveacccess("DeleteDCM","DeleteDCM.exe",action);
		demo.Textcomparsion(DeleteDCM, "D:\\DeleteDCM\\DeleteDCM.exe", test, driver);
	}
	
	@Test(priority =41)	
	public void DCMtoSQL() throws IOException, InterruptedException
	{
		test = extent.createTest(funTestCaseName()+" DCMtoSQL");
		WebElement DCMtoSQL=driver.findElements(By.className("TextBox")).get(6);
		Actions action=new Actions(driver);
		action.moveToElement(DCMtoSQL).doubleClick().perform();
		Ddriveacccess("DCM2SQL_TPS","DCM2SQL_TPS.exe",action);
		demo.Textcomparsion(DCMtoSQL, "D:\\DCM2SQL_TPS\\DCM2SQL_TPS.exe", test, driver);
	}
		
	@Test(priority =42)	
	public void CBCTViewer() throws IOException, InterruptedException
	{
		test = extent.createTest(funTestCaseName()+" CBCTViewer");
		WebElement CBCTViewer=driver.findElements(By.className("TextBox")).get(7);
		Actions action=new Actions(driver);
		action.moveToElement(CBCTViewer).doubleClick().perform();
		Ddriveacccess("KrystalCBCT","KrystalCBCT.exe",action);
		demo.Textcomparsion(CBCTViewer, "D:\\KrystalCBCT\\KrystalCBCT.exe", test, driver);
	}
	
	@Test(priority =43)	
	public void DicomPlanValidation() throws IOException, InterruptedException
	{
		test = extent.createTest(funTestCaseName()+" DicomPlanValidation");
		WebElement DicomPlanValidation=driver.findElements(By.className("TextBox")).get(8);
		Actions action=new Actions(driver);
		action.moveToElement(DicomPlanValidation).doubleClick().perform();
		Ddriveacccess("DicomValidation_fromSQL_2.0.11","DicomValidation_fromSQL_2.0.11.exe",action);
		demo.Textcomparsion(DicomPlanValidation, "D:\\DicomValidation_fromSQL_2.0.11\\DicomValidation_fromSQL_2.0.11.exe", test, driver);
	}
	
	@Test(priority =44)	
	public void FluencyMap() throws IOException, InterruptedException
	{
		test = extent.createTest(funTestCaseName()+" FluencyMap");
		WebElement FluencyMap=driver.findElements(By.className("TextBox")).get(9);
		Actions action=new Actions(driver);
		action.moveToElement(FluencyMap).doubleClick().perform();
		Ddriveacccess("FluencyMap","MLCsoverlapping.exe",action);
		demo.Textcomparsion(FluencyMap, "D:\\FluencyMap\\MLCsoverlapping.exe", test, driver);
	}
*/
	@Test(priority =45)	
	public void SOPTagChange() throws IOException, InterruptedException
	{
		/*
		Service.Edit.click();
		test = extent.createTest(funTestCaseName()+" SOPTagChange");
		WebElement SOPTagChange=driver.findElements(By.className("TextBox")).get(10);
		Actions action=new Actions(driver);
		action.moveToElement(SOPTagChange).doubleClick().perform();
		Ddriveacccess("SOPtagChange","SOPtagChange.exe",action);
		String Text=SOPTagChange.getText();
		System.out.println(Text);
		demo.Textcomparsion(SOPTagChange, "D:\\SOPtagChange\\SOPtagChange.exe", test, driver);
		*/
		Service.Update.click();
		Sitesave1("Service Configuration Update","Service Configuration paths updated." , "Service Configuration Update","Service Configuration paths updated.", 0,driver,test);
	}
@Test(priority =46)
public void Edit() throws IOException, InterruptedException {
test = extent.createTest(funTestCaseName()+" Click on the Edit button"," Update and configure android button should be enabled ");	
Service.Edit.click();
demo.isdisplayed(Service.Update, "UPDATE", test, driver);
demo.isEnabled(Service.Update, "UPDATE", test, driver);
demo.isEnabled(Service.configureAndroid, "CONFIGURE ANDROID", test, driver);
}

@Test(priority =47)
public void ToverifyImpactLabel() throws IOException {
	
test = extent.createTest("************ CONFIGURE ANDROID**********");		
	
Service.configureAndroid.click();
test = extent.createTest(guiTestCaseName()+" Click on the Configure android Button Impact Android Device ID pop-up should be displayed"," Impact Android Device ID pop-up should be present ");	
demo.isdisplayed(Service.ImpactAndroid, "Impact Android Device ID", test, driver);
}


@Test(priority =48)
public void ToverifyImpactandroidLabel() throws IOException {
	
test = extent.createTest(guiTestCaseName()+" Impact Android Device ID label"," Impact Android Device ID label should be present ");	
demo.isdisplayed(Service.ImpactAndroid, "Impact Android Device ID", test, driver);
}


@Test(priority =49)
public void ToverifyConfigureLabel() throws IOException, InterruptedException {
test = extent.createTest(guiTestCaseName()+" Configure and cancel button"," Configure and Cancel button should be present ");	
demo.Textcomparsion(Service.Configure, "CONFIGURE", test, driver);
demo.isEnabled(Service.Configure, "CONFIGURE", test, driver);
demo.isEnabled(Service.Cancel, "CANCEL", test, driver);
demo.Textcomparsion(Service.Cancel, "CANCEL", test, driver);
Thread.sleep(2000);

}

@Test(priority =50)
public void ToverifyConfigurebutton() throws IOException, InterruptedException {
test = extent.createTest(funTestCaseName()+"Click on Configure button Without Entered Data "," Input cannot be empty error message should be displayed");
try {
Service.Configure.click();
demo.isdisplayed(Service.Errordisplay, "Input cannot be empty", test, driver);
}
catch (IOException e) {
	catchexceptionscreenshot1(test,e);
}
}
@Test(priority =51)
public void Cancelclick() throws IOException
{
	test = extent.createTest(funTestCaseName()+"Click on the  Cancel button"," Pop-up should be closed");	
	try {
	Service.Cancel.click();
	Thread.sleep(1000);
	demo.isdisplayed(Service.configureAndroid, "Android Pop-up is closed", test, driver);
	}
	catch (Exception e) {
	test.fail(" Popup is not getting Closed ");
	catchexceptionscreenshot1(test,e);
	}	
}
@Test(priority =52)
public void AndroidIP() throws InterruptedException, IOException
{
	try {
		test = extent.createTest(funTestCaseName()+"Enter the text in the textbox and click on the Configure");
		Service.configureAndroid.click();
		Thread.sleep(1000);
		Service.element.click();
		driver.switchTo().activeElement().sendKeys("192.168.10.18");
		Service.Configure.click();
		demo.Textcomparsion(Service.element, "192.168.10.18", test, driver);
		}
		catch (Exception e) {
			catchexceptionscreenshot(test,e);
		}
		Sitesave1("Android Configuration", "Impact android device Id saved.", "Android Configuration", "Impact android device Id saved.", 0,driver,test);
		test = extent.createTest(funTestCaseName()+"Click on the configure button, Pop-up should get closed");
		demo.isnotdisplayed(Service.ImpactAndroid, "Impact Android Device ID", test, driver);
		Thread.sleep(1000);
		Service.Cancel.click();
		Thread.sleep(1000);
}

@Test(priority =53)
public void configureandroid() throws InterruptedException, IOException
{
test = extent.createTest(funTestCaseName()+"Update the data and click on the Configure button, Pop-up should be displayed and closed");
try {
Service.configureAndroid.click();
Service.element.click();
driver.switchTo().activeElement().clear();
driver.switchTo().activeElement().sendKeys("192.168.10.18");
Service.Configure.click();
}
catch (Exception e) {
test.fail("Input cannot be empty");
catchexceptionscreenshot1(test,e);
}
Thread.sleep(2000);

Sitesave1("Android Configuration", "Impact android device Id updated.", "Android Configuration", "Impact android device Id updated.", 0,driver,test);
test = extent.createTest(funTestCaseName()+" To Verify the Functionality of Updating the IP and Clicking on the update pop-up shuld get closed"," Update, Pop-up window should get closed");
demo.isdisplayed(Service.bpassword, "Password", test, driver);
Thread.sleep(1000);
Service.Update.click();
Sitesave1("Service Configuration Update","Service Configuration paths updated.","Service Configuration Update","Service Configuration paths updated.", 0,driver,test);
}

@Test(priority =54)
public void configureandroidupdated() throws InterruptedException, IOException
{
	test = extent.createTest(funTestCaseName()+"Android IP entered is updated correctly");
	Service.Edit.click();
	Service.configureAndroid.click();
	demo.ByValidErrormessage(Service.element,"192.168.10.18", test, driver);
	Service.Configure.click();
	Sitesave1("Android Configuration", "Impact android device Id updated.", "Android Configuration", "Impact android device Id updated.", 0,driver,test);
	Thread.sleep(1000);
	Service.Update.click();
	Thread.sleep(1000);
	Sitesave1("Service Configuration Update","Service Configuration paths updated." , "Service Configuration Update","Service Configuration paths updated.", 0,driver,test);
}

@Test(priority =55)
public void databaseconnection() throws IOException, InterruptedException
{
	Service.Edit.click();
	test = extent.createTest(funTestCaseName()+" To Verify the Functionality of  Connection estabhlished"," Database connection estabhlised errormessage should be displayed");
	Service.Update.click();
	Sitesave1("Service Configuration Update","Service Configuration paths updated." , "Service Configuration Update","Service Configuration paths updated.", 0,driver,test);
	Thread.sleep(2000);
	demo.isdisplayed(Service.Connection, "Database Connection Established", test, driver);
	demo.Textcomparsion(Service.Connection, "Database Connection Established", test, driver);
}
@Test(priority =56)
public void languagetranslation() throws InterruptedException, IOException
{
	Service.Edit.click();
	Thread.sleep(1000);
	test = extent.createTest(guiTestCaseName()+" Click on Language translator Checkbox  Enable"," Language transltor checkbox get enabled");
	Service.languageTranslator1.click();
	demo.isEnabled(Service.languageTranslator1, "LanguageTranlator", test, driver);
	Thread.sleep(1000);
	Service.Update.click();
	String description="For Language Translation applicability changes to take effect, application has to be restarted. Do you want to continue?";
	SitesaveCancel1("Service Configuration Save", description, "Service Configuration Save", description, 0,driver,test);
	test = extent.createTest(guiTestCaseName()+" Functionality of Clicking on Cancel button translator Checkbox disable"," Language transltor checkbox get disable");
	Service.languageTranslator1.click();
	Service.Update.click();
	//Sitesave("Service Configuration Save", description, "Service Configuration Save", description, 0,driver);	
	Sitesave1("Service Configuration Update","Service Configuration paths updated." , "Service Configuration Update","Service Configuration paths updated.", 0,driver,test);
}
	public void Ddriveacccess(String Text1,String Text2, Actions action) throws InterruptedException
	{
		WebElement Ddrive=driver.findElement(By.name("New Volume (D:)"));
		Ddrive.click();
		Thread.sleep(1000);
		WebElement DicomImport1=driver.findElement(By.name(Text1));
		action.moveToElement(DicomImport1).doubleClick().perform();
		Thread.sleep(1000);
		WebElement DicomImport2=driver.findElement(By.name(Text2));
		
		action.moveToElement(DicomImport2).click().perform();
		WebElement Open = driver.findElements(By.xpath("//Button[@Name=\"Open\"]")).get(2);
		action.moveToElement(Open).doubleClick().perform();
	}
	

	 


// Database Paths providing is pending

}
