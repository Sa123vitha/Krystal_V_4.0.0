package com.krystal.project;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.windows.WindowsDriver;

public class GeneratorSettingsTest extends ReferencefileChemotheraphy {

	WebElement Userbx;
	WebElement Pswdbox;
	private GeneratorSettingsPOM gen;
	private Actions action;
	private Actions act;
	public static int testCaseCount = 1;
	
	
	@Test(priority =0)
	public void Launch()  throws InterruptedException, IOException {
	//DesiredCapabilities appCapabilities = new DesiredCapabilities();
	//appCapabilities.setCapability("app", "C:\\Program Files\\Panacea Medical Technologies\\Krystal\\Krystal.exe");
	//driver = new WindowsDriver<WebElement>(new URL("http://127.0.0.1:4723"), appCapabilities);
	navigation();
	gen=new GeneratorSettingsPOM(driver);
	action=new Actions(driver);
	act=new Actions(driver);
	}
	
		public void navigation() throws InterruptedException 
		{
			Userbx=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Edit[@AutomationId=\"TxtbxUsername\"]"));
			Userbx.click();
			driver.switchTo().activeElement().sendKeys("s");
			Thread.sleep(1000);
			Pswdbox=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Edit[@AutomationId=\"PwdBoxUserPassword\"]"));
			Pswdbox.click();
			driver.switchTo().activeElement().sendKeys("s");
			WebElement Signinbutton = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Button[@Name=\"SIGN IN\"][@AutomationId=\"BtnValidate\"]"));
			Signinbutton.click();
			Thread.sleep(1000);
			WebElement Generatorsettings = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneratorSettingsMainView\"]/Custom[@ClassName=\"GeneratorSettingsSection1View\"]/ComboBox[@ClassName=\"ComboBox\"]"));
			//Generatorsettings.click();
			//Thread.sleep(5000);
			//Generatorsettings = driver.findElement(By.name("Generator Settings"));
			//Actions actions = new Actions(driver);
		   // actions.doubleClick(Generatorsettings).perform(); 
			
	   }
		DemographicsExternal demo=new DemographicsExternal();
		private WebElement Servicesettings;
		private WebElement MachineSettings;
		private WebElement Generatorsettings1;
		
	   // @Test(priority =1)
		public void button() throws InterruptedException{
			List<WebElement> elements =  driver.findElements(By.className("TextBox"));
		    Actions actions = new Actions(driver);
		    for (WebElement element : elements) {
		        actions.moveToElement(element).perform();
		        System.out.println(element.getText());
		        Thread.sleep(1000);
		    }
	}

		
	
	@Test(priority =1)
	public void ToverifygeneratorsettingsLabel() throws IOException {
		test = extent.createTest("======SS(GENERATOR SETTINGS)========");
	test = extent.createTest(guiTestCaseName()+" Service Settings label"," Service Settings label should be present ");	
	demo.Textcomparsion(gen.generatorSettings, "Service Settings", test,driver);
	}
@Test(priority =2)
	public void ToverifyselectmachineLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Select machine label"," Select Machine label should be present ");	
	demo.Textcomparsion(gen.selectMachine, "Select Machine", test,driver);
	}
WebElement GeneratorLimitations;
private WebElement mSSettings;
private WebElement EditmASettings;
@Test(priority =3)
public void ToverifyGeneratorLimitataions() throws IOException {
test = extent.createTest(guiTestCaseName()+" Generator Limitataions label"," Generator Limitataions label should be present ");	
demo.Textcomparsion(gen.GeneratorLimitations, "Generator Limitations", test,driver);
}
@Test(priority =3)
	public void ToverifymaximummaslimitLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Maximum mAs Limit label"," Maximum mAs Limit label should be present ");	
	demo.Textcomparsion(gen.maximummAsLimit, "Maximum mAs Limit", test,driver);
	}

@Test(priority =4)
	public void ToverifymaximumkwlimitLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Maximum kW Limit label"," Maximum kW Limit label should be present ");
	demo.Textcomparsion(gen.maximumkwLimit, "Maximum kW Limit", test,driver);
	}


@Test(priority =5)
public void ToverifymsRange() throws IOException {
test = extent.createTest(guiTestCaseName()+" ms Range label"," ms Range rate label should be present ");	
demo.Textcomparsion(gen.msRange, "ms Range", test,driver);
}

@Test(priority =6)
public void MinmsRange() throws IOException {
test = extent.createTest(guiTestCaseName()+" Minimum ms Range label"," Min ms Range rate label should be present ");	
demo.Textcomparsion(gen.Minms, "Minimum ms", test,driver);
}

@Test(priority =7)
public void MaxmsRange() throws IOException {
test = extent.createTest(guiTestCaseName()+" Maximum ms Range label"," Max ms Range rate label should be present ");	
demo.Textcomparsion(gen.Maxms, "Maximum ms", test,driver);
}



@Test(priority =8)
	public void ToverifyradiographickvrangeLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+"Radiographic kV Range label"," Radiographic kV range label should be present ");	
	demo.Textcomparsion(gen.radiographicKvRange, "Radiographic kV Range", test,driver);
	}
@Test(priority =9)
	public void ToverifyminimumkvLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Radiographic Minimum kV Range label"," Minimum kV range label should be present ");	
	 WebElement RadiominKv=driver.findElements(By.className("TextBlock")).get(12);
	demo.Textcomparsion(RadiominKv, "Minimum kV", test,driver);
	}
@Test(priority =10)
	public void ToverifymaximumkvLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Radiographic Maximum kV Range label"," Maximum kV range label should be present ");	
	 WebElement RadiomaxKv=driver.findElements(By.className("TextBlock")).get(16);
	 demo.Textcomparsion(RadiomaxKv, "Maximum kV", test,driver);
	}

@Test(priority =11)
	public void ToverifykvstepsLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+"  Radiographic kV steps label"," kV steps label should be present ");	
	 WebElement RadioKvSteps=driver.findElements(By.className("TextBlock")).get(18);
	demo.Textcomparsion(RadioKvSteps, "kV Steps", test,driver);
	}
@Test(priority =12)
	public void ToverifycbctkvrangeLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+"  CBCT kV Range label"," CBCT kV Range label should be present ");	
	demo.Textcomparsion(gen.cbctkVRange, "CBCT kV Range", test,driver);
	}
@Test(priority =13)
	public void ToverifycbctminimumkvLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" CBCT Minimum kV Range label"," CBCT Minimum kV Range label should be present ");	
	WebElement CBCTminKv=driver.findElements(By.className("TextBlock")).get(14);
	demo.Textcomparsion(CBCTminKv, "Minimum kV", test,driver);
	}
@Test(priority =14)
	public void ToverifycbctmaximumkvLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" CBCT Maximum kV Range label"," CBCT Maximum kV Range label should be present ");	
	WebElement CBCTmaxKv=driver.findElements(By.className("TextBlock")).get(17);
	demo.Textcomparsion(CBCTmaxKv, "Maximum kV", test,driver);
	}
@Test(priority =15)
	public void ToverifycbctkvLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" CBCT  kV Steps label"," CBCT kV Steps label should be present ");	
	 WebElement CBCTKvSteps=driver.findElements(By.className("TextBlock")).get(19);
	 demo.Textcomparsion(CBCTKvSteps, "kV Steps", test,driver);
	}

@Test(priority =16)
public void Xraytubespec() throws IOException {
test = extent.createTest(guiTestCaseName()+" Xray tube Specification label","X ray tube spec label should be present ");	
demo.Textcomparsion(gen.XraySpec, "X-Ray tube Sepecification", test,driver);
}

@Test(priority =17)
public void Xraytube() throws IOException {
test = extent.createTest(guiTestCaseName()+" Xray tube filter thickness label","X ray tube label should be present ");	
demo.Textcomparsion(gen.XRaytube, "X-Ray tube filter thickness", test,driver);
}

//  ****************Edit**************************

@Test(priority =19)
	public void ToverifymasettingsLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" mA Settings label"," mA Settings label should be present ");	
	demo.Textcomparsion(gen.mASettings, "mA Settings", test,driver);
	}


@Test(priority =21)
	public void ToverifyeditmasettingsLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" mA Settings Edit Button", " mA Settings Edit Button should be present ");	
	try {
	EditmASettings=driver.findElements(By.className("Button")).get(5);
	demo.isEnabled(EditmASettings, "Edit", test,driver);
	}
	catch(Exception e)
	{
		 catchexceptionscreenshot(test,e) ;
	}
	finally {
	EditmASettings.click();
	}
	}
@Test(priority =22)
	public void ToverifyupdatemasettingsLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" mA Settings UPDATE Button"," UPDATE Button should be present ");
	demo.BydefaultisEnabled(gen.Update, "UPDATE", test,driver);
	demo.Textcomparsion(gen.Update, "UPDATE", test,driver);
	}

@Test(priority =23)
	public void ToverifycancelmasettingsLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" mA Settings CANCEL Button"," mA Settings CANCEL Button");
	try {
	demo.isEnabled(gen.Cancel, "CANCEL", test,driver);
	demo.Textcomparsion(gen.Cancel, "CANCEL", test,driver);
	}
	catch(Exception e)
	{
		 catchexceptionscreenshot(test,e) ;
	}
	finally {
	gen.Cancel.click();
	}
	}


@Test(priority =24)
public void ToverifymssettingsLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" ms Settings label"," ms Settings label should be present ");	
demo.Textcomparsion(gen.mSSettings, "ms Settings", test,driver);
}

WebElement EditmsSettings;
private WebElement EditFrameSettings;


@Test(priority =25)
	public void ToverifyeditmssettingsLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" mA Settings Edit Button", " mA Settings Edit Button should be present ");	
	try {
	EditmsSettings=driver.findElements(By.className("Button")).get(6);
	demo.isEnabled(EditmsSettings, "Edit", test,driver);
	}
	catch(Exception e)
	{
		 catchexceptionscreenshot(test,e) ;
	}
	finally {
	EditmsSettings.click();
	}
	}
@Test(priority =26)
	public void ToverifyupdatemssettingsLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" ms Settings UPDATE Button"," UPDATE Button should be present ");
	demo.BydefaultisEnabled(gen.Update, "UPDATE", test,driver);
	demo.Textcomparsion(gen.Update, "UPDATE", test,driver);
	}

@Test(priority =27)
	public void ToverifycancelmssettingsLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" ms Settings CANCEL Button"," ms Settings CANCEL Button");
	try {
	demo.isEnabled(gen.Cancel, "CANCEL", test,driver);
	demo.Textcomparsion(gen.Cancel, "CANCEL", test,driver);
	}
	catch(Exception e)
	{
		 catchexceptionscreenshot(test,e) ;
	}
	finally {
	gen.Cancel.click();
	}
	}


@Test(priority =28)
public void ToverifyframerateLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Frame rate label"," Frame rate label should be present ");	
demo.Textcomparsion(gen.frameRate, "Frame Rate Settings", test,driver);
}



@Test(priority =29)
	public void ToverifyeditframesettingsLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" frame Settings Edit Button", " frame Settings Edit Button should be present ");	
	try {
	EditFrameSettings=driver.findElements(By.className("Button")).get(7);
	demo.isEnabled(EditFrameSettings, "Edit", test,driver);
	}
	catch(Exception e)
	{
		 catchexceptionscreenshot(test,e) ;
	}
	finally {
	EditFrameSettings.click();
	}
	}
@Test(priority =30)
	public void ToverifyupdateframesettingsLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Frame Settings UPDATE Button"," Frame Settings UPDATE Button should be present ");
	demo.BydefaultisEnabled(gen.Update, "UPDATE", test,driver);
	demo.Textcomparsion(gen.Update, "UPDATE", test,driver);
	}

@Test(priority =31)
	public void ToverifycancelframesettingsLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" Frame Settings CANCEL Button"," Frame Settings CANCEL Button");
	try {
	demo.isEnabled(gen.Cancel, "CANCEL", test,driver);
	demo.Textcomparsion(gen.Cancel, "CANCEL", test,driver);
	}
	catch(Exception e)
	{
		 catchexceptionscreenshot(test,e) ;
	}
	finally {
	gen.Cancel.click();
	}
	}

@Test(priority =32)
public void Save() throws IOException
{
	test = extent.createTest(guiTestCaseName()+"Save button Enabled");	
	demo.isEnabled(gen.Save, "SAVE", test,driver);
	demo.Textcomparsion(gen.Save, "SAVE", test,driver);
}

@Test(priority=33)
public void Invalidchars() throws InterruptedException, IOException
{
	 

 try {
	 InvalidData(gen.maximummAsLimit,driver,"Maximum mAs Limit");
		
	}
	catch(Exception e)
	{
		 catchexceptionscreenshot(test,e) ;
	}
 
	try {
		InvalidData(gen.maximumkwLimit,driver,"Maximum kw Limit");
		
	}
	catch(Exception e)
	{
		 catchexceptionscreenshot(test,e) ;
	}
	try {
		InvalidData(gen.Minms,driver,"Minimum ms");
		}
		catch(Exception e)
		{
			 catchexceptionscreenshot(test,e) ;
		}
	
	try {
	InvalidData(gen.Maxms,driver,"Maximum ms");
		
		}
		catch(Exception e)
		{
			 catchexceptionscreenshot(test,e) ;
		}	
	
	try {
		WebElement RadiominKv=driver.findElements(By.className("TextBox")).get(3);
		InvalidData(RadiominKv,driver,"Radiographic Minimum KV");
		
		}
		catch(Exception e)
		{
			 catchexceptionscreenshot(test,e) ;
		}
	
	try {
		WebElement RadiomaxKv=driver.findElements(By.className("TextBox")).get(6);
		InvalidData(RadiomaxKv,driver,"Radiographic Maximum KV");
		
		}
		catch(Exception e)
		{
			 catchexceptionscreenshot(test,e) ;
		}
	
	try {
		WebElement RadioKvSteps=driver.findElements(By.className("TextBox")).get(8);
		InvalidData(RadioKvSteps,driver,"Radiographic KV Steps");
		}
		catch(Exception e)
		{
			 catchexceptionscreenshot(test,e) ;
		}
	
	try {
		WebElement CBCTminKv=driver.findElements(By.className("TextBox")).get(4);
		InvalidData(CBCTminKv,driver,"CBCT Minimum KV");
		}
		catch(Exception e)
		{
			 catchexceptionscreenshot(test,e) ;
		}
	
	
	try {
		WebElement CBCTmaxKv=driver.findElements(By.className("TextBox")).get(7);
		InvalidData(CBCTmaxKv,driver,"CBCT Maximum KV");
		
	}
	catch(Exception e)
	{
		 catchexceptionscreenshot(test,e) ;
	}

	
	try {
		 WebElement CBCTKvSteps=driver.findElements(By.className("TextBox")).get(9);
		InvalidData(CBCTKvSteps,driver,"CBCT KV Steps");
	}
	catch(Exception e)
	{
		 catchexceptionscreenshot(test,e) ;
	}
	
	try {

		InvalidData(gen.XRaytube,driver,"X-ray tube filter thickness");
	}
	catch(Exception e)
	{
		 catchexceptionscreenshot(test,e) ;
	}
	try {
		WebElement EditmASettings=driver.findElements(By.className("Button")).get(5);
		EditmASettings.click();
		WebElement EditmAtextbox=driver.findElement(By.className("TextBox"));
		InvalidDatamA(EditmAtextbox,driver,"EditmAtextbox");
		gen.Cancel.click();
	}
	catch(Exception e)
	{
		 catchexceptionscreenshot(test,e) ;
	}
	
	try {
		WebElement EditmsSettings=driver.findElements(By.className("Button")).get(6);
		EditmsSettings.click();
		WebElement Editmstextbox=driver.findElement(By.className("TextBox"));
		InvalidDatamA(Editmstextbox,driver,"Editmstextbox");
		gen.Cancel.click();
	}
	catch(Exception e)
	{
		 catchexceptionscreenshot(test,e) ;
	}
	
	try {
		WebElement EditFrameSettings=driver.findElements(By.className("Button")).get(7);
		EditFrameSettings.click();
		WebElement EditFrametestbox=driver.findElement(By.className("TextBox"));
		InvalidDatamA(EditFrametestbox,driver,"EditFrametestbox");
		gen.Cancel.click();
	}
	catch(Exception e)
	{
		 catchexceptionscreenshot(test,e) ;
	}
}

@Test(priority=34)
public void InvalidRangeAngle() throws InterruptedException, IOException
{
 try {
	   test=extent.createTest("************* INVALID RANGE*****************");
		
	   InValidRange(gen.maximummAsLimit,"Maximum mAs Limit");
	
	}
	catch(Exception e)
	{
		 catchexceptionscreenshot(test,e) ;
	}
 
	try {
		
		InValidRange(gen.maximumkwLimit,"Maximum kw Limit");
		
	}
	catch(Exception e)
	{
		 catchexceptionscreenshot(test,e);
	}
	try {
		InValidRangeSettings(gen.Minms,"Minimum ms");
		}
		catch(Exception e)
		{
			 catchexceptionscreenshot(test,e);
		}
	
	try {
		InValidRangeSettings(gen.Maxms,"Maximum ms");
		
		}
		catch(Exception e)
		{
			 catchexceptionscreenshot(test,e);
		}	
	
	try {
		WebElement RadiominKv=driver.findElements(By.className("TextBox")).get(3);
		InValidRange(RadiominKv,"Radiographic Minimum KV");
		
		}
		catch(Exception e)
		{
			 catchexceptionscreenshot(test,e);
		}
	
	try {
		WebElement RadiomaxKv=driver.findElements(By.className("TextBox")).get(6);
		InValidRange(RadiomaxKv,"Radiographic Maximum KV");
		
		}
		catch(Exception e)
		{
			 catchexceptionscreenshot(test,e);
		}
	
	try {
		WebElement RadioKvSteps=driver.findElements(By.className("TextBox")).get(8);
		InValidRangeKV(RadioKvSteps,"Radiographic KV Steps");
		}
		catch(Exception e)
		{
			 catchexceptionscreenshot(test,e);
		}
	
	try {
		WebElement CBCTminKv=driver.findElements(By.className("TextBox")).get(4);
		InValidRange(CBCTminKv,"CBCT Minimum KV");
		}
		catch(Exception e)
		{
			 catchexceptionscreenshot(test,e);
		}
	
	
	try {
		WebElement CBCTmaxKv=driver.findElements(By.className("TextBox")).get(7);
		InValidRange(CBCTmaxKv,"CBCT Maximum KV");
		
	}
	catch(Exception e)
	{
		 catchexceptionscreenshot(test,e);
	}

	
	try {
		WebElement CBCTKvSteps=driver.findElements(By.className("TextBox")).get(9);
		InValidRangeKV(CBCTKvSteps,"CBCT KV Steps");
	}
	catch(Exception e)
	{
		 catchexceptionscreenshot(test,e);
	}
	
	try {
		InValidRangeXRay(gen.XRaytube,"X-ray tube filter thickness");
	}
	catch(Exception e)
	{
		 catchexceptionscreenshot(test,e);
	}

	
	try {
		WebElement EditmASettings=driver.findElements(By.className("Button")).get(5);
		EditmASettings.click();
		WebElement EditmAtextbox=driver.findElement(By.className("TextBox"));
		InValidRangemA(EditmAtextbox,"EditmAtextbox");
		gen.Cancel.click();
	}
	catch(Exception e)
	{
		 catchexceptionscreenshot(test,e);
	}
	
	try {
		WebElement EditmsSettings=driver.findElements(By.className("Button")).get(6);
		EditmsSettings.click();
		WebElement Editmstextbox=driver.findElement(By.className("TextBox"));
		InValidRangemA(Editmstextbox,"Editmstextbox");
		gen.Cancel.click();
	}
	catch(Exception e)
	{
		 catchexceptionscreenshot(test,e);
	}
	
	try {
		WebElement EditFrameSettings=driver.findElements(By.className("Button")).get(7);
		EditFrameSettings.click();
		WebElement EditFrametestbox=driver.findElement(By.className("TextBox"));
		InValidRangemA(EditFrametestbox,"EditFrametestbox");
		gen.Cancel.click();
	}
	catch(Exception e)
	{
		 catchexceptionscreenshot(test,e);
	}
	
	
}

@Test(priority=35)
public void MingreaterRange() throws InterruptedException, IOException
{
	try {
		Rangegreaterequal(gen.Minms,gen.Maxms,driver, "ms Range");
		}
		catch(Exception e)
		{
			test.pass("Save pop-up is not displayed");
		}
	try {
		WebElement RadiominKv=driver.findElements(By.className("TextBox")).get(3);
		WebElement RadiomaxKv=driver.findElements(By.className("TextBox")).get(6);
	    Rangegreaterequal(RadiominKv,RadiomaxKv,driver,"Radiographic kV Range");
	}
	catch(Exception e)
	{
		test.pass("Save pop-up is not displayed");
	}
	try {
		WebElement CBCTminKv=driver.findElements(By.className("TextBox")).get(4);
		WebElement CBCTmaxKv=driver.findElements(By.className("TextBox")).get(7);
	    Rangegreaterequal(CBCTminKv,CBCTmaxKv,driver, "CBCT kV Range");
	}
	catch(Exception e)
	{
		 catchexceptionscreenshot(test,e);
	}
	
	try {
		Rangegreaterequal(gen.XRaytube,gen.Maxms,driver,"X-Ray tube filter");
		}
		catch(Exception e)
		{
			test.pass("Save pop-up is not displayed");
		}
	gen.Save.click();
}
@Test(priority=36)
public void BothequalRange() throws InterruptedException, IOException
{
	try {
	Rangeequal(gen.Minms,gen.Maxms,driver,"ms Range");
	}
	catch(Exception e) {
		
		 catchexceptionscreenshot(test,e);
	}
	try {
	WebElement RadiominKv=driver.findElements(By.className("TextBox")).get(3);
	WebElement RadiomaxKv=driver.findElements(By.className("TextBox")).get(6);
	Rangeequal(RadiominKv,RadiomaxKv,driver,"Radiographic kV Range");
	}
	catch(Exception e) {
		
		 catchexceptionscreenshot(test,e);
	}
	
	try {
		WebElement CBCTminKv=driver.findElements(By.className("TextBox")).get(4);
		WebElement CBCTmaxKv=driver.findElements(By.className("TextBox")).get(7);
		Rangeequal(CBCTminKv,CBCTmaxKv,driver,"CBCT kV Range");
		}
		catch(Exception e) {
			
			 catchexceptionscreenshot(test,e);
		}
	try {
		Rangeequal(gen.XRaytube,gen.Maxms,driver,"X-ray tube Specification");
		}
		catch(Exception e)
		{
			test.pass("Save pop-up is not displayed");
		}
	gen.Save.click();
}

@Test(priority=37)
public void ValidRange() throws InterruptedException, IOException
{
	try {
	Rangevalid(gen.maximummAsLimit,gen.maximumkwLimit,"0.1","100",driver);
	}
	catch(Exception e)
	{
		 catchexceptionscreenshot(test,e);
	}
	try {
	Rangevalid(gen.Minms,gen.Maxms,"0.1","100",driver);
	}
	catch(Exception e)
	{
		 catchexceptionscreenshot(test,e);
	}
	try {
	WebElement RadiominKv=driver.findElements(By.className("TextBox")).get(3);
	WebElement RadiomaxKv=driver.findElements(By.className("TextBox")).get(6);
	Rangevalid(RadiominKv,RadiomaxKv,"0.1","100",driver);
	}
	catch(Exception e)
	{
		 catchexceptionscreenshot(test,e);
	}
	try {
		WebElement CBCTminKv=driver.findElements(By.className("TextBox")).get(4);
		WebElement CBCTmaxKv=driver.findElements(By.className("TextBox")).get(7);
	    Rangevalid(CBCTminKv,CBCTmaxKv,"0.1","100",driver);
	}
	catch(Exception e)
	{
		 catchexceptionscreenshot(test,e);
	}
	try {
		WebElement RadioKvSteps=driver.findElements(By.className("TextBox")).get(8);
		WebElement CBCTKvSteps=driver.findElements(By.className("TextBox")).get(9);
	    Rangevalid(RadioKvSteps,CBCTKvSteps,"1","100",driver);
	}
	catch(Exception e)
	{
		 catchexceptionscreenshot(test,e);
	}
	try {
		Rangevalid(gen.XRaytube,gen.XRaytube,"0.1","0.1",driver);
		}
		catch(Exception e)
		{
			 catchexceptionscreenshot(test,e);
		}
	
	
	
	try {
		test = extent.createTest(guiTestCaseName()+ " Enter Valid mA Settings Update button is enabled");
		WebElement EditmASettings=driver.findElements(By.className("Button")).get(5);
		EditmASettings.click();
		WebElement EditmAtextbox=driver.findElement(By.className("TextBox"));
		Rangevalid(EditmAtextbox,EditmAtextbox,"1","10,20,30,40,50",driver);
		demo.isEnabled(gen.Update,"UPDATE", test,driver);
		gen.Update.click();
	}
	catch(Exception e)
	{
		 catchexceptionscreenshot(test,e);
	}
	
	try {
		test = extent.createTest(guiTestCaseName()+ " Enter Valid mS Settings Update button is enabled");
		WebElement EditmsSettings=driver.findElements(By.className("Button")).get(6);
		EditmsSettings.click();
		WebElement Editmstextbox=driver.findElement(By.className("TextBox"));
		Rangevalid(Editmstextbox,Editmstextbox,"1","10,20,30,40,50",driver);
		demo.isEnabled(gen.Update,"UPDATE", test,driver);
		gen.Update.click();
	}
	catch(Exception e)
	{
		 catchexceptionscreenshot(test,e);
	}
	try {
		test = extent.createTest(guiTestCaseName()+" Enter Valid Frame Rate Settings Update button is enabled");
		WebElement EditFrameSettings=driver.findElements(By.className("Button")).get(7);
		EditFrameSettings.click();
		WebElement EditFrametestbox=driver.findElement(By.className("TextBox"));
		Rangevalid(EditFrametestbox,EditFrametestbox,"1","10,20,30,40,50",driver);
		demo.isEnabled(gen.Update,"UPDATE", test,driver);
		gen.Update.click();
	}
	catch(Exception e)
	{
		 catchexceptionscreenshot(test,e);
	}
	test = extent.createTest(guiTestCaseName()+" Enter Valid Range save button enabled");
	demo.isEnabled(gen.Save,"SAVE", test,driver);
	gen.Save.click();
	Thread.sleep(1000);
	SitesaveCancel("Generator Settings","APR created with the previous values will be deleted. Do you want to continue to update the modification?", "Generator Settings", "APR created with the previous values will be deleted. Do you want to continue to update the modification?",0,driver);
	gen.Save.click();
	Sitesave("Generator Settings","APR created with the previous values will be deleted. Do you want to continue to update the modification?", "Generator Settings", "APR created with the previous values will be deleted. Do you want to continue to update the modification?",0,driver);
	Sitesave("Generator settings","Generator settings data saved.", "Generator Settings", "Generator Settings data saved.",0,driver);
}


@Test(priority=38)
public void editdisable() throws IOException
{
	test = extent.createTest(guiTestCaseName()+" Edit button enabled Once saved the Data");
	
	demo.isEnabled(gen.Edit, "EDIT", test,driver);
	demo.Textcomparsion(gen.Edit, "EDIT", test,driver);
	test = extent.createTest(guiTestCaseName()+" Textfields should be disable");
	try {
	textdisable(gen.maximummAsLimit,gen.maximumkwLimit,driver,test);
	}
	catch(Exception e)
	{
		test.fail("Save pop-up is not displayed");
		 catchexceptionscreenshot1(test,e) ;
	}
	
	try {
		textdisable(gen.Minms,gen.Maxms,driver,test);
		}
		catch(Exception e)
		{
			test.fail("Save pop-up is not displayed");
			 catchexceptionscreenshot1(test,e) ;
		}
	try {
		WebElement RadiominKv=driver.findElements(By.className("TextBox")).get(3);
		WebElement RadiomaxKv=driver.findElements(By.className("TextBox")).get(6);
	textdisable(RadiominKv,RadiomaxKv,driver,test);
	}
	catch(Exception e)
	{
		test.fail("Save pop-up is not displayed");
		 catchexceptionscreenshot1(test,e) ;
	}
	try {
		WebElement CBCTminKv=driver.findElements(By.className("TextBox")).get(4);
		WebElement CBCTmaxKv=driver.findElements(By.className("TextBox")).get(7);
	textdisable(CBCTminKv,CBCTmaxKv,driver,test);
	}
	catch(Exception e)
	{
		test.fail("Save pop-up is not displayed");
		 catchexceptionscreenshot1(test,e) ;
	}
	try {
		WebElement RadioKvSteps=driver.findElements(By.className("TextBox")).get(8);
		WebElement CBCTKvSteps=driver.findElements(By.className("TextBox")).get(9);
	textdisable(RadioKvSteps,CBCTKvSteps,driver,test);
	}
	catch(Exception e)
	{
		test.fail("Save pop-up is not displayed");
		 catchexceptionscreenshot1(test,e) ;
	}
	try {
		WebElement XRaytube=driver.findElements(By.className("TextBox")).get(10);
		textdisable(XRaytube,XRaytube,driver,test);
	}
	catch(Exception e)
	{
		test.fail("Save pop-up is not displayed");
		 catchexceptionscreenshot1(test,e) ;
	}
	try {
		WebElement EditmASettings=driver.findElements(By.className("Button")).get(5);
		EditmASettings.click();
		demo.BydefaultisEnabled(EditmASettings, "Edit", test, driver);
	}
	catch(Exception e)
	{
		test.fail("Save pop-up is not displayed");
		 catchexceptionscreenshot1(test,e) ;
	}
	
	try {
		WebElement EditmsSettings=driver.findElements(By.className("Button")).get(6);
		EditmsSettings.click();
		demo.BydefaultisEnabled(EditmsSettings, "Edit", test, driver);
	}
	catch(Exception e)
	{
		test.fail("Save pop-up is not displayed");
		 catchexceptionscreenshot1(test,e) ;
	}
	
	try {
		WebElement EditFrameSettings=driver.findElements(By.className("Button")).get(7);
		EditFrameSettings.click();
		demo.BydefaultisEnabled(EditFrameSettings, "Edit", test, driver);
	}
	catch(Exception e)
	{
		test.fail("Save pop-up is not displayed");
		 catchexceptionscreenshot1(test,e) ;
	}
}





public void DataUpdatebutton() throws IOException, InterruptedException
{
	
	try {
		Rangevalid(gen.maximummAsLimit,gen.maximumkwLimit,"0.2","99",driver);
		}
		catch(Exception e)
		{
			 catchexceptionscreenshot(test,e);
		}
		try {
		Rangevalid(gen.Minms,gen.Maxms,"0.2","99",driver);
		}
		catch(Exception e)
		{
			 catchexceptionscreenshot(test,e);
		}
		try {
		WebElement RadiominKv=driver.findElements(By.className("TextBox")).get(3);
		WebElement RadiomaxKv=driver.findElements(By.className("TextBox")).get(6);
		Rangevalid(RadiominKv,RadiomaxKv,"0.2","99",driver);
		}
		catch(Exception e)
		{
			 catchexceptionscreenshot(test,e);
		}
		try {
			WebElement CBCTminKv=driver.findElements(By.className("TextBox")).get(4);
			WebElement CBCTmaxKv=driver.findElements(By.className("TextBox")).get(7);
		    Rangevalid(CBCTminKv,CBCTmaxKv,"0.2","99",driver);
		}
		catch(Exception e)
		{
			 catchexceptionscreenshot(test,e);
		}
		try {
			WebElement RadioKvSteps=driver.findElements(By.className("TextBox")).get(8);
			WebElement CBCTKvSteps=driver.findElements(By.className("TextBox")).get(9);
		    Rangevalid(RadioKvSteps,CBCTKvSteps,"2","99",driver);
		}
		catch(Exception e)
		{
			 catchexceptionscreenshot(test,e);
		}
		try {
			Rangevalid(gen.XRaytube,gen.XRaytube,"0.2","0.2",driver);
			}
			catch(Exception e)
			{
				 catchexceptionscreenshot(test,e);
			}
		
		
		
		try {
			
			WebElement EditmASettings=driver.findElements(By.className("Button")).get(5);
			EditmASettings.click();
			WebElement EditmAtextbox=driver.findElement(By.className("TextBox"));
			Rangevalid(EditmAtextbox,EditmAtextbox,"2","11.5,21.5,31.5,41.5,51.5",driver);
			test = extent.createTest(guiTestCaseName()+" Valid mA Settings Update button is enabled");
			demo.isEnabled(gen.Update,"UPDATE", test,driver);
			gen.Update.click();
		}
		catch(Exception e)
		{
			 catchexceptionscreenshot(test,e);
		}
		
		try {
			
			WebElement EditmsSettings=driver.findElements(By.className("Button")).get(6);
			EditmsSettings.click();
			WebElement Editmstextbox=driver.findElement(By.className("TextBox"));
			Rangevalid(Editmstextbox,Editmstextbox,"2","11,21,31,41,51",driver);
			test = extent.createTest(guiTestCaseName()+" Valid mS Settings Update button is enabled");
			demo.isEnabled(gen.Update,"UPDATE", test,driver);
			gen.Update.click();
		}
		catch(Exception e)
		{
			 catchexceptionscreenshot(test,e);
		}
		try {
			
			WebElement EditFrameSettings=driver.findElements(By.className("Button")).get(7);
			EditFrameSettings.click();
			WebElement EditFrametestbox=driver.findElement(By.className("TextBox"));
			Rangevalid(EditFrametestbox,EditFrametestbox,"11.1","10.1,20.1,30.1,40.1,50.1",driver);
			test = extent.createTest(guiTestCaseName()+" Valid Frame Rate Settings Update button is enabled");
			demo.isEnabled(gen.Update,"UPDATE", test,driver);
			gen.Update.click();
		}
		catch(Exception e)
		{
			 catchexceptionscreenshot(test,e);
		}
		
}
@Test(priority=39)
public void Updatebutton() throws IOException
{
	test = extent.createTest(guiTestCaseName()+" Click on Edit, Update button is enabled");
	try {
	demo.isEnabled(gen.Edit,"EDIT", test,driver);
	gen.Edit.click();
	}
	catch(Exception e)
	{
	  catchexceptionscreenshot(test,e);
	}
	try {
	demo.isEnabled(gen.Update, "UPDATE", test,driver);
	demo.Textcomparsion(gen.Update, "UPDATE", test,driver);
	}
	catch(Exception e)
	{
		 catchexceptionscreenshot(test,e);
	}
}
@Test(priority=40)
public void UpdateCancel() throws InterruptedException, IOException
{
	test = extent.createTest(guiTestCaseName()+" Enter Valid Data and Click on the Cancel Button");
	DataUpdatebutton();
	demo.isEnabled(gen.Update,"UPDATE", test,driver);
	gen.Update.click();
	SitesaveCancel("Generator Settings","APR created with the previous values will be deleted. Do you want to continue to update the modification?", "Generator Settings", "APR created with the previous values will be deleted. Do you want to continue to update the modification?",0,driver);
	try {
	demo.isdisplayed(gen.Edit,"EDIT", test,driver);
	}
	catch(Exception e)
	{
		 catchexceptionscreenshot(test,e);
	}
	finally {
		WebElement Generatorsettings = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneratorSettingsMainView\"]/Custom[@ClassName=\"GeneratorSettingsSection1View\"]/ComboBox[@ClassName=\"ComboBox\"]"));
		Generatorsettings.click();
		Thread.sleep(3000);
		MachineSettings = driver.findElement(By.name("Machine Settings"));
		Actions actions = new Actions(driver);
	    actions.doubleClick(MachineSettings).click().perform(); 
		Generatorsettings.click();
		Generatorsettings1 = driver.findElement(By.name("Generator Settings"));
	    actions.doubleClick(Generatorsettings1).click().perform(); 
	    Thread.sleep(2000);
	}
	try {
		demo.isdisplayed(gen.Edit,"EDIT", test,driver);
		}
		catch(Exception e)
		{
			 catchexceptionscreenshot(test,e);
		}
	gen.Edit.click();
	Updateddatavalid();
	Thread.sleep(2000);
	gen.Update.click();
	SitesaveCancel("Generator Settings","APR created with the previous values will be deleted. Do you want to continue to update the modification?", "Generator Settings", "APR created with the previous values will be deleted. Do you want to continue to update the modification?",0,driver);
	//gen.Save.click();
	//Sitesave("Generator Settings","APR created with the previous values will be deleted. Do you want to continue to update the modification?", "Generator Settings", "APR created with the previous values will be deleted. Do you want to continue to update the modification?",0,driver);
	//Sitesave("Generator Settings","Generator Settings data saved.", "Generator Settings", "Generator Settings data saved.",0,driver);
}



@Test(priority=41)
public void UpdateOK() throws InterruptedException, IOException
{
	test = extent.createTest(guiTestCaseName()+" Enter Data and Click on the Update Button");
	DataUpdatebutton();
	demo.isEnabled(gen.Update,"UPDATE", test,driver);
	gen.Update.click();
	Sitesave1("Generator Settings","APR created with the previous values will be deleted. Do you want to continue to update the modification?", "Generator Settings", "APR created with the previous values will be deleted. Do you want to continue to update the modification?",0,driver,test);
	Sitesave1("Generator Settings Update","Generator Settings updated.", "Generator Settings Update", "Generator Settings updated.",0,driver,test);
}
@Test(priority=42)
public void UpdateeditValid() throws InterruptedException, IOException
{
	test = extent.createTest(guiTestCaseName()+" To verify Updated data is valid");
	gen.Edit.click();
	UpdateCompare();
	Thread.sleep(1000);
	gen.Update.click();
	Sitesave1("Generator Settings","APR created with the previous values will be deleted. Do you want to continue to update the modification?", "Generator Settings", "APR created with the previous values will be deleted. Do you want to continue to update the modification?",0,driver,test);
	Sitesave1("Generator Settings Update","Generator Settings updated.", "Generator Settings Update", "Generator Settings updated.",0,driver,test);
}

public void UpdateCompare() throws IOException
{
	test = extent.createTest(guiTestCaseName()+" To verify Updated and compared data is displayed correctly");
	try {
	editupdatedata(gen.maximummAsLimit,"0.2",driver);
	editupdatedata(gen.maximumkwLimit,"99",driver);
	}
	catch(Exception e)
	{
		test.fail("Save pop-up is not displayed");
		 catchexceptionscreenshot1(test,e) ;
	}
	try {
	editupdatedata(gen.Minms,"0.2",driver);
	editupdatedata(gen.Maxms,"99",driver);
	}
	catch(Exception e)
	{
		test.fail("Save pop-up is not displayed");
		 catchexceptionscreenshot1(test,e) ;
	}
	try {
		WebElement RadiominKv=driver.findElements(By.className("TextBox")).get(3);
		WebElement RadiomaxKv=driver.findElements(By.className("TextBox")).get(6);
	editupdatedata(RadiominKv,"0.2",driver);
	editupdatedata(RadiomaxKv,"99",driver);
	}
	catch(Exception e)
	{
		test.fail("Save pop-up is not displayed");
		 catchexceptionscreenshot1(test,e) ;
	}
	try {
		WebElement CBCTminKv=driver.findElements(By.className("TextBox")).get(4);
		WebElement CBCTmaxKv=driver.findElements(By.className("TextBox")).get(7);
	editupdatedata(CBCTminKv,"0.2",driver);
	editupdatedata(CBCTmaxKv,"99",driver);
	}
	catch(Exception e)
	{
		test.fail("Save pop-up is not displayed");
		 catchexceptionscreenshot1(test,e) ;
	}
	try {
		WebElement RadioKvSteps=driver.findElements(By.className("TextBox")).get(8);
		WebElement CBCTKvSteps=driver.findElements(By.className("TextBox")).get(9);
	editupdatedata(RadioKvSteps,"2",driver);
	editupdatedata(CBCTKvSteps,"99",driver);
	}
	catch(Exception e)
	{
		test.fail("Save pop-up is not displayed");
		 catchexceptionscreenshot1(test,e) ;
	}
	try {
		WebElement XRaytube=driver.findElements(By.className("TextBox")).get(10);
		editupdatedata(XRaytube,"0.2",driver);
		}
	catch(Exception e)
	{
		test.fail("Save pop-up is not displayed");
		 catchexceptionscreenshot1(test,e) ;
	}
	
	try {
		WebElement EditmASettings=driver.findElements(By.className("Button")).get(5);
		EditmASettings.click();
		WebElement EditmAtextbox=driver.findElement(By.className("TextBox"));
	    editupdatedata(EditmAtextbox,"11.5,21.5,31.5,41.5,51.5",driver);
	    gen.Update.click();

	}
	catch(Exception e)
	{
		test.fail("Save pop-up is not displayed");
		 catchexceptionscreenshot1(test,e) ;
	}
	try {
		WebElement EditmsSettings=driver.findElements(By.className("Button")).get(6);
		EditmsSettings.click();
		WebElement Editmstextbox=driver.findElement(By.className("TextBox"));
	    editupdatedata(Editmstextbox,"11,21,31,41,51",driver);
	    gen.Update.click();
	}
	catch(Exception e)
	{
		test.fail("Save pop-up is not displayed");
		 catchexceptionscreenshot1(test,e) ;
	}
	try {
		WebElement EditFrameSettings=driver.findElements(By.className("Button")).get(7);
		EditFrameSettings.click();
		WebElement EditFrametestbox=driver.findElement(By.className("TextBox"));
	    editupdatedata(EditFrametestbox,"10.1,20.1,30.1,40.1,50.1",driver);
	    gen.Update.click();
	}
	catch(Exception e)
	{
		test.fail("Save pop-up is not displayed");
		 catchexceptionscreenshot1(test,e) ;
	}
	}


public void Updateddatavalid() throws IOException
{
	test = extent.createTest(guiTestCaseName()+" To verify Updated data is displayed is correctly");
	try {
	editupdatedata(gen.maximummAsLimit,"0.1",driver);
	editupdatedata(gen.maximumkwLimit,"100",driver);
	}
	catch(Exception e)
	{
		test.fail("Save pop-up is not displayed");
		 catchexceptionscreenshot1(test,e) ;
	}
	try {
	editupdatedata(gen.Minms,"0.1",driver);
	editupdatedata(gen.Maxms,"100",driver);
	}
	catch(Exception e)
	{
		test.fail("Save pop-up is not displayed");
		 catchexceptionscreenshot1(test,e) ;
	}
	try {
		WebElement RadiominKv=driver.findElements(By.className("TextBox")).get(3);
		WebElement RadiomaxKv=driver.findElements(By.className("TextBox")).get(6);
	editupdatedata(RadiominKv,"0.1",driver);
	editupdatedata(RadiomaxKv,"100",driver);
	}
	catch(Exception e)
	{
		test.fail("Save pop-up is not displayed");
		 catchexceptionscreenshot1(test,e) ;
	}
	try {
		WebElement CBCTminKv=driver.findElements(By.className("TextBox")).get(4);
		WebElement CBCTmaxKv=driver.findElements(By.className("TextBox")).get(7);
	editupdatedata(CBCTminKv,"0.1",driver);
	editupdatedata(CBCTmaxKv,"100",driver);
	}
	catch(Exception e)
	{
		test.fail("Save pop-up is not displayed");
		 catchexceptionscreenshot1(test,e) ;
	}
	try {
		WebElement RadioKvSteps=driver.findElements(By.className("TextBox")).get(8);
		WebElement CBCTKvSteps=driver.findElements(By.className("TextBox")).get(9);
	editupdatedata(RadioKvSteps,"1",driver);
	editupdatedata(CBCTKvSteps,"100",driver);
	}
	catch(Exception e)
	{
		test.fail("Save pop-up is not displayed");
		 catchexceptionscreenshot1(test,e) ;
	}
	try {
		WebElement XRaytube=driver.findElements(By.className("TextBox")).get(10);
		editupdatedata(XRaytube,"0.1",driver);
		}
	catch(Exception e)
	{
		test.fail("Save pop-up is not displayed");
		 catchexceptionscreenshot1(test,e) ;
	}
	
	try {
		WebElement EditmASettings=driver.findElements(By.className("Button")).get(5);
		EditmASettings.click();
		WebElement EditmAtextbox=driver.findElement(By.className("TextBox"));
	    editupdatedata(EditmAtextbox,"10,20,30,40,50",driver);
	    gen.Update.click();

	}
	catch(Exception e)
	{
		test.fail("Save pop-up is not displayed");
		 catchexceptionscreenshot1(test,e) ;
	}
	try {
		WebElement EditmsSettings=driver.findElements(By.className("Button")).get(6);
		EditmsSettings.click();
		WebElement Editmstextbox=driver.findElement(By.className("TextBox"));
	    editupdatedata(Editmstextbox,"10,20,30,40,50",driver);
	    gen.Update.click();
	}
	catch(Exception e)
	{
		test.fail("Save pop-up is not displayed");
		 catchexceptionscreenshot1(test,e) ;
	}
	try {
		WebElement EditFrameSettings=driver.findElements(By.className("Button")).get(7);
		EditFrameSettings.click();
		WebElement EditFrametestbox=driver.findElement(By.className("TextBox"));
	   editupdatedata(EditFrametestbox,"10,20,30,40,50",driver);
	   gen.Update.click();
	}
	catch(Exception e)
	{
		test.fail("Save pop-up is not displayed");
		 catchexceptionscreenshot1(test,e) ;
	}
	}
public void editupdatedata(WebElement element, String text,WebDriver driver) throws IOException
{
	demo.ByErrormessage(element, text, test,driver);
}
public void textdisable(WebElement element, WebElement element1,WebDriver driver, ExtentTest test) throws IOException
{
	Actions action=new Actions(driver);
	action.moveToElement(element).click().perform();
	demo.BydefaultisEnabled(element, "Click", test,driver);
	action.moveToElement(element1).click().perform();
	demo.BydefaultisEnabled(element1, "Click", test,driver);
}


public void Rangevalid(WebElement Min,WebElement Max, String value, String value1,WebDriver driver) throws IOException
{
	
	Validdata(Min, Max,value,value1,"Range:[1 to 1000]", "Range:[1 to 1000]",driver);
}
public void Validdata(WebElement Name, WebElement RangeName, String Text, String Text1, String actual,String Excepted,WebDriver driver) throws IOException
{
	test = extent.createTest(funTestCaseName()+ "Valid range for "+Name.getText()+" no error message is displayed");
	Name.click();
	driver.switchTo().activeElement().clear();
	driver.switchTo().activeElement().sendKeys(Text);
	demo.ByErrormessage(Name,Text, test,driver);
	RangeName.click();
	driver.switchTo().activeElement().clear();
	driver.switchTo().activeElement().sendKeys(Text1);
	demo.ByErrormessage(RangeName,Text1, test,driver);
	WebElement Element=driver.switchTo().activeElement();
	try {
		WebElement errormsg=driver.findElement(By.name(actual));
		demo.isdisplayed(errormsg, Excepted, test,driver);
		demo.ByErrormessage(errormsg, Excepted, test,driver);
	}
	catch(Exception e)
	{
		test.pass("Range Error message not displayed for the valid data");
	}
}
public void Rangegreaterequal(WebElement Min,WebElement Max,WebDriver driver,String Text) throws IOException
{
	test = extent.createTest(funTestCaseName() +Text+ "Entered Min Range is greater than the Max");
	Invalidrangeequal(Min, Max,"5","3","Min cannot be greater than Max", "Min cannot be greater than Max","Max cannot be lesser than Min", "Max cannot be lesser than Min",driver);
}
public void Rangeequal(WebElement Min,WebElement Max,WebDriver driver,String Text) throws IOException
{
	test = extent.createTest(funTestCaseName() +Text+ "Entered Min Range Equal to Max");
	Invalidrangeequal(Min, Max,"1","1", "Min cannot be equal to Max", "Min cannot be equal to Max","Max cannot be equal to Min", "Max cannot be equal to Min",driver);
}
public void Invalidrangeequal(WebElement Name, WebElement RangeName, String Text, String Text1, String actual, String Excepted,String actual1, String Excepted1,WebDriver driver) throws IOException
{
	Name.click();
	driver.switchTo().activeElement().clear();
	driver.switchTo().activeElement().sendKeys(Text);
	RangeName.click();
	driver.switchTo().activeElement().clear();
	driver.switchTo().activeElement().sendKeys(Text1);
	WebElement errormsg=driver.findElement(By.name(actual));
	demo.isdisplayed(errormsg, Excepted, test,driver);
	demo.Textcomparsion(errormsg, Excepted, test,driver);
	WebElement errormsgdisplayed=driver.findElement(By.name(actual1));
	demo.isdisplayed(errormsgdisplayed, Excepted1, test,driver);
	demo.Textcomparsion(errormsgdisplayed, Excepted1, test,driver);
}

public void InValidRange(WebElement InValidrange, String Text) throws IOException
{
	test = extent.createTest(funTestCaseName() +Text+" range less than 0.1 and more than 100000 error message is displayed");
	Invalidrange(InValidrange, "0","Range:[0.1 to 100000]","Range:[0.1 to 100000]");
	Invalidrange(InValidrange, "0.001","Range:[0.1 to 100000]","Range:[0.1 to 100000]");
	Invalidrange(InValidrange, "100000.09","Range:[0.1 to 100000]","Range:[0.1 to 100000]");
	Invalidrange(InValidrange, "100001","Range:[0.1 to 100000]","Range:[0.1 to 100000]");
	Invalidrange(InValidrange, "-0.01","Range:[0.1 to 100000]","Range:[0.1 to 100000]");
	Invalidrange(InValidrange, "1000000","Range:[0.1 to 100000]","Range:[0.1 to 100000]");
}

public void InValidRangeKV(WebElement InValidrange, String Text) throws IOException
{
	test = extent.createTest(funTestCaseName() +Text+" range less than 1 and more than 100 error message is displayed");
	Invalidrange(InValidrange, "10000","Range:[1 to 100]","Range:[1 to 100]");
	Invalidrange(InValidrange, "109","Range:[1 to 100]","Range:[1 to 100]");
	Invalidrange(InValidrange, "100.09","Range:[1 to 100]","Range:[1 to 100]");
	Invalidrange(InValidrange, "101","Range:[1 to 100]","Range:[1 to 100]");
	try {
	Invalidrange(InValidrange, "-1","Range:[1 to 100]","Range:[1 to 100]");
	}
	catch(Exception e)
	{
		test.fail("-1 is not accepting, Missmatch from compared to all textboxes");
		 catchexceptionscreenshot1(test,e) ;
		driver.switchTo().activeElement().clear();
	}
	try {
	Invalidrange(InValidrange, "0.99999","Range:[1 to 100]","Range:[1 to 100]");
	}
	catch(Exception e)
	{
		test.fail("0 is not accepting, Missmatch from compared to all textboxes");
		 catchexceptionscreenshot1(test,e) ;
		driver.switchTo().activeElement().clear();
	}
}

public void InValidRangeSettings(WebElement InValidrange, String Text) throws IOException
{
	test = extent.createTest(funTestCaseName() +Text+" range less than 0.001 and more than 10000 error message is displayed");
	Invalidrange(InValidrange, "0","Range:[0.001 to 10000]","Range:[0.001 to 10000]");
	Invalidrange(InValidrange, "-0.0099","Range:[0.001 to 10000]","Range:[0.001 to 10000]");
	Invalidrange(InValidrange, "100001","Range:[0.001 to 10000]","Range:[0.001 to 10000]");
	Invalidrange(InValidrange, "10000.01","Range:[0.001 to 10000]","Range:[0.001 to 10000]");
	Invalidrange(InValidrange, "-1","Range:[0.001 to 10000]","Range:[0.001 to 10000]");
	Invalidrange(InValidrange, "-1.9","Range:[0.001 to 10000]","Range:[0.001 to 10000]");
	Invalidrange(InValidrange, "0.00","Range:[0.001 to 10000]","Range:[0.001 to 10000]");
}


public void InValidRangeXRay(WebElement InValidrange, String Text) throws IOException
{
	test = extent.createTest(funTestCaseName() +Text+" range less than 0.1 and more than 10  error message displayed");
	Invalidrange(InValidrange, "0","Range:[0.1 to 10]","Range:[0.1 to 10]");
	Invalidrange(InValidrange, "0.01","Range:[0.1 to 10]","Range:[0.1 to 10]");
	Invalidrange(InValidrange, "-0.1","Range:[0.1 to 10]","Range:[0.1 to 10]");
	Invalidrange(InValidrange, "11","Range:[0.1 to 10]","Range:[0.1 to 10]");
	Invalidrange(InValidrange, "10.01","Range:[0.1 to 10]","Range:[0.1 to 10]");
	Invalidrange(InValidrange, "100","Range:[0.1 to 10]","Range:[0.1 to 10]");
	Invalidrange(InValidrange, "1000","Range:[0.1 to 10]","Range:[0.1 to 10]");
}


public void InValidRangemA(WebElement InValidrange, String Text) throws IOException
{
	test = extent.createTest(funTestCaseName() +Text+" Invalid Range for mA,mS,Frame");
	Invalidrange(InValidrange, "1,1","Duplicate values are not allowed","Duplicate values are not allowed");
	Invalidrange(InValidrange, "7,5,7","Duplicate values are not allowed","Duplicate values are not allowed");
	Invalidrange(InValidrange, "8,100,98,8.24,8","Duplicate values are not allowed","Duplicate values are not allowed");
	Invalidrange(InValidrange, "1.25,8,45,1.25","Duplicate values are not allowed","Duplicate values are not allowed");
	Invalidrange(InValidrange, "7.5,15,7.5,7.1","Duplicate values are not allowed","Duplicate values are not allowed");
	Invalidrange(InValidrange, "8.25,10.3,98,8.24,8.25","Duplicate values are not allowed","Duplicate values are not allowed");
	
}
public void InValidRangeminmax(WebElement InValidrange, String Text) throws IOException
{
	test = extent.createTest(funTestCaseName() +Text+"range less than 0.1 and more than 10  error message displayed");
	Invalidrange(InValidrange, "0","Range:[0.1 to 10]","Range:[0.1 to 10]");
	Invalidrange(InValidrange, "0.01","Range:[0.1 to 10]","Range:[0.1 to 10]");
	Invalidrange(InValidrange, "-0.1","Range:[0.1 to 10]","Range:[0.1 to 10]");
	Invalidrange(InValidrange, "11","Range:[0.1 to 10]","Range:[0.1 to 10]");
	Invalidrange(InValidrange, "10.01","Range:[0.1 to 10]","Range:[0.1 to 10]");
	Invalidrange(InValidrange, "100","Range:[0.1 to 10]","Range:[0.1 to 10]");
	Invalidrange(InValidrange, "1000","Range:[0.1 to 10]","Range:[0.1 to 10]");
}


public void ValidRangeKV(WebElement Validrange, String Text) throws IOException
{
	test = extent.createTest(funTestCaseName()  +Validrange.getText()+" textbox should accept wholenumbers and decimalnumbers and not display errormessage");
	Validdata(Validrange, "1","Range:[1 to 100]","Range:[1 to 100]");
	Validdata(Validrange, "2","Range:[1 to 100]","Range:[1 to 100]");
	Validdata(Validrange, "55","Range:[1 to 100]","Range:[1 to 100]");
	Validdata(Validrange, "56","Range:[1 to 100]","Range:[1 to 100]");
	Validdata(Validrange, "99","Range:[1 to 100]","Range:[1 to 100]");
	Validdata(Validrange, "98","Range:[1 to 100]","Range:[1 to 100]");
	Validdata(Validrange, "100","Range:[1 to 100]","Range:[1 to 100]");
	
}


public void ValidRangeSettings(WebElement Validrange, String Text) throws IOException
{
	test = extent.createTest(funTestCaseName()  +Validrange.getText()+" textbox should accept wholenumbers and decimalnumbers");
	Validdata(Validrange, "1","Range:[1 to 1000]","Range:[0.1 to 1000]");
	Validdata(Validrange, "2","Range:[0.1 to 1000]","Range:[0.1 to 1000]");
	Validdata(Validrange, "55","Range:[0.1 to 1000]","Range:[0.1 to 1000]");
	Validdata(Validrange, "56","Range:[0.1 to 1000]","Range:[0.1 to 1000]");
	Validdata(Validrange, "999","Range:[0.1 to 1000]","Range:[0.1 to 1000]");
	Validdata(Validrange, "998","Range:[0.1 to 1000]","Range:[0.1 to 1000]");
	Validdata(Validrange, "1000","Range:[0.1 to 1000]","Range:[0.1 to 1000]");
	
}

public void ValidRange(WebElement Validrange, String Text) throws IOException
{
	test = extent.createTest(funTestCaseName()  +Validrange.getText()+" textbox should not accept wholenumbers and decimalnumbers");
	Validdata(Validrange, "0.1","Range:[0.1 to 100000]","Range:[0.1 to 100000]");
	Validdata(Validrange, "0.2","Range:[0.1 to 100000]","Range:[0.1 to 100000]");
	Validdata(Validrange, "101","Range:[0.1 to 100000]","Range:[0.1 to 100000]");
	Validdata(Validrange, "1000","Range:[0.1 to 100000]","Range:[0.1 to 100000]");
	Validdata(Validrange, "9999","Range:[0.1 to 100000]","Range:[0.1 to 100000]");
	Validdata(Validrange, "10000","Range:[0.1 to 100000]","Range:[0.1 to 100000]");
}

public void InvalidDataSettings(WebElement Invaliddata, String Text) throws IOException
{
	test = extent.createTest(funTestCaseName() +Invaliddata.getText()+" textbox should not accept the alphabhets");
	Invaliddatasettings(Invaliddata, "ABCHGHSGHFSHGDHGDD","Only digits with comma allowed","Only digits with comma allowed");
	test = extent.createTest(funTestCaseName() +Invaliddata.getText()+" textbox should not accept the specialchars");
	Invaliddatasettings(Invaliddata, "#$%&-()*-/:;<=>?@[]^_`{|}~","Only digits with comma allowed","Only digits with comma allowed");
	test = extent.createTest(funTestCaseName() +Invaliddata.getText()+" textbox should not accept the invalidchars");
	try {
	Invaliddatasettings(Invaliddata,  "\\,\"'","Only digits with comma allowed","Only digits with comma allowed");
	}
	catch(Exception e)
	{
		test.fail("Error message not displaying");
		 catchexceptionscreenshot1(test,e) ;
	}
	test = extent.createTest(funTestCaseName()  +Invaliddata.getText()+" textbox should not accept the alphanumeric");
	Invaliddatasettings(Invaliddata,  "shgdjdgd&^&%&","Only digits with comma allowed","Only digits with comma allowed");
}	


public void Validdata(WebElement Name, String Text,String actual, String Excepted) throws IOException
{
	Name.click();
	driver.switchTo().activeElement().clear();
	driver.switchTo().activeElement().sendKeys(Text);
	WebElement Element=driver.switchTo().activeElement();
	demo.Textcomparsion(Element,Text, test,driver);
	try {
		WebElement errormsg=driver.findElement(By.name(actual));
		demo.isdisplayed(errormsg, Excepted, test,driver);
		demo.Textcomparsion(errormsg, Excepted, test,driver);
	}
	catch(Exception e)
	{
		test.pass("Range Error message not displayed for the valid data");
		 catchexceptionscreenshot1(test,e) ;
	}
}

public void Invaliddata(WebElement Name, String Text,String actual, String Excepted) throws IOException
{
	Name.click();
	driver.switchTo().activeElement().sendKeys(Text);
	demo.isempty(Name,Text, test,driver);
	driver.switchTo().activeElement().clear();
}

public void Invaliddatasettings(WebElement Name, String Text,String actual, String Excepted) throws IOException
{
	Name.click();
	driver.switchTo().activeElement().sendKeys(Text);
	demo.isnotempty(Name,Text, test,driver);
	WebElement errormsg=driver.findElement(By.name(actual));
	demo.isdisplayed(errormsg, Excepted, test,driver);
	demo.Textcomparsion(errormsg, Excepted, test,driver);
	driver.switchTo().activeElement().clear();
}
	
	
public void Invalidrange(WebElement Name, String Text, String actual, String Excepted) throws IOException
{
	Name.click();
	driver.switchTo().activeElement().sendKeys(Text);
	WebElement errormsg=driver.findElement(By.name(actual));
	demo.isdisplayed(errormsg, Excepted, test,driver);
	demo.Textcomparsion(errormsg, Excepted, test,driver);
	driver.switchTo().activeElement().clear();
}

	
}
