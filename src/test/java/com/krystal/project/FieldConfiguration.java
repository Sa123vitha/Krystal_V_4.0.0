package com.krystal.project;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Match;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.windows.WindowsDriver;

public class FieldConfiguration extends ReferencefileChemotheraphy {
	
	private WebElement bhataw;
	private WebElement bhamlc;
	private WebElement bha;
	private WebElement sidd;
	private WebElement Userbx;
	private WebElement Pswdbox;
	private WebElement Addfield1;
	private WebElement fieldsave;
	private WebElement Fx;
	private FieldConfigurationPOM Field;
	
	
	@Test(priority =1)
	public void Launch()  throws InterruptedException, IOException {
	//	DesiredCapabilities appCapabilities = new DesiredCapabilities();
	//	appCapabilities.setCapability("app", "C:\\Program Files\\Panacea Medical Technologies\\Krystal\\Krystal.exe");
	//	driver = new WindowsDriver<WebElement>(new URL("http://127.0.0.1:4723"), appCapabilities);
		navigation();
		}
		
	public void navigation() throws InterruptedException 
	{
		Userbx=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Edit[@AutomationId=\"TxtbxUsername\"]"));
		Userbx.click();
		driver.switchTo().activeElement().sendKeys("m");
		Thread.sleep(1000);
		Pswdbox=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Edit[@AutomationId=\"PwdBoxUserPassword\"]"));
		Pswdbox.click();
		driver.switchTo().activeElement().sendKeys("p");
		WebElement Signinbutton = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Button[@Name=\"SIGN IN\"][@AutomationId=\"BtnValidate\"]"));
		Signinbutton.click();
		Thread.sleep(1000);
		WebElement Menuclick = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"NavigationTopBarView\"]/Button[@AutomationId=\"ToolTip\"]"));
		Menuclick.click();
		WebElement Menuitem = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SideMenuView\"]/Menu[@ClassName=\"Menu\"]/MenuItem[@ClassName=\"MenuItem\"][@Name=\"Presentation.UiElements.ViewModels.MenuItemViewModel\"]/MenuItem[@ClassName=\"MenuItem\"][@Name=\"Presentation.UiElements.ViewModels.MenuItemViewModel\"]/Text[@ClassName=\"TextBlock\"][@Name=\"General Settings\"]"));
		Menuitem.click();
		Thread.sleep(2000);
		WebElement Menucombobox = driver.findElement(By.className("ComboBox"));
		Actions actions = new Actions(driver);
		Field= new FieldConfigurationPOM(driver);
		actions.moveToElement(Menucombobox).perform();
		Menucombobox.click();
		Thread.sleep(2000);
		WebElement FieldConfiguration = driver.findElement(By.name("Field Configuration"));
		actions.moveToElement(FieldConfiguration).perform();
		FieldConfiguration.click();	
	}
	

@Test(priority =1)
	public void Fieldconfiguration() throws IOException {
	test = extent.createTest(guiTestCaseName()+" To Verify Field Configuration label"," Field Configuration label should be present ");	
	demo.Textcomparsion(Field.fieldconfig, "Field Configuration", test,driver);
	}

@Test(priority =2)
	public void Addfield() throws IOException {
	test = extent.createTest(guiTestCaseName()+" To Verify Add Field label"," Add Field label should be present ");	
	demo.Textcomparsion(Field.addfield, "Add Field", test,driver);
	}
@Test(priority =3)
	public void Fieldname() throws IOException {
	test = extent.createTest(guiTestCaseName()+" To Verify Field Name label"," Field Name label should be present ");	
	demo.Textcomparsion(Field.fieldname, "Field Name", test,driver);
	}
@Test(priority =4)
	public void Regularfieldcreation() throws IOException {
	test = extent.createTest(guiTestCaseName()+" To Verify Regular Field Configuration label"," Regular Field Configuration label should be present ");	
	demo.Textcomparsion(Field.regfieldconfig, "Regular Field Creation", test,driver);
	}
@Test(priority =5)
	public void Collimatortype() throws IOException {
	test = extent.createTest(guiTestCaseName()+" To Verify Collimator Type label"," Collimator Type label should be present ");	
	demo.Textcomparsion(Field.collitype, "Collimator Type", test,driver);
	}
@Test(priority =6)
	public void Symmetric() throws IOException {
	test = extent.createTest(guiTestCaseName()+" To Verify Symmetric label"," Symmetric label should be present ");	
	demo.Textcomparsion(Field.symm, "Symmetric", test,driver);
	demo.isSelected(Field.symm, "Symmetric", test,driver);
	}
@Test(priority =7)
	public void Asymmetric() throws IOException {
	test = extent.createTest(guiTestCaseName()+" To Verify Asymmetric label"," Asymmetric label should be present ");	
	demo.Textcomparsion(Field.fieldnameAsymtric, "Asymmetric", test,driver);
	demo.BydefaultisSelected(Field.fieldnameAsymtric, "Asymmetric", test,driver);
	}
@Test(priority =8)
	public void fxminmax() throws IOException {
	test = extent.createTest(guiTestCaseName()+" To Verify FX(cm)[Min:0,Max:30] label"," FX(cm)[Min:0,Max:30] label should be present ");	
	demo.Textcomparsion(Field.fxcm, "FX(cm) [Min:0,Max:30]", test,driver);
}
@Test(priority =9)
	public void fyminmax() throws IOException {
	test = extent.createTest(guiTestCaseName()+" To Verify FY(cm)[Min:0,Max:30] label"," FY(cm)[Min:0,Max:30] label should be present ");	
	demo.Textcomparsion(Field.fycm, "FY(cm) [Min:0,Max:30]", test,driver);
	Field.fieldnameAsymtric.click();
	}

@Test(priority =10)
	public void assyfx() throws IOException {
	test = extent.createTest(guiTestCaseName()+" To Verify FX1(cm) [Min:-15,Max:7.5] label"," FX1(cm) [Min:-15,Max:7.5] label should be present ");	
	demo.Textcomparsion(Field.asymfx1, "FX1(cm) [Min:-15,Max:7.5]", test,driver);
	}
@Test(priority =11)
	public void assyfxx() throws IOException {
	test = extent.createTest(guiTestCaseName()+" To Verify FX2(cm) [Min:-7.5,Max:15] label"," FX2(cm) [Min:-7.5,Max:15] label should be present ");	
	demo.Textcomparsion(Field.asymfx2, "FX2(cm) [Min:-7.5,Max:15]", test,driver);
	}
@Test(priority =12)
	public void assyfy() throws IOException {
	test = extent.createTest(guiTestCaseName()+" To Verify FY1(cm) [Min:-15,Max:7.5] label"," FY1(cm) [Min:-15,Max:7.5] label should be present ");	
	demo.Textcomparsion(Field.asymfy1, "FY1(cm) [Min:-15,Max:7.5]", test,driver);
	}
@Test(priority =13)
	public void assyfyy() throws IOException {
	test = extent.createTest(guiTestCaseName()+" To Verify FY2(cm) [Min:-7.5,Max:15] label"," FY2(cm) [Min:-7.5,Max:15] label should be present ");	
	demo.Textcomparsion(Field.asymfy2, "FY2(cm) [Min:-7.5,Max:15]", test,driver);
	}
@Test(priority =14)
	public void Leafvalues() throws IOException {
	test = extent.createTest(guiTestCaseName()+" To Verify Leaf Values label"," Leaf Values label should be present ");	
	demo.Textcomparsion(Field.leafval, "Leaf Values", test,driver);
	}
@Test(priority =15)
	public void Collimatorangle() throws IOException {
	test = extent.createTest(guiTestCaseName()+" To Verify Collimator Angle label"," Collimator Angle label should be present ");	
	demo.Textcomparsion(Field.colliangle, "Collimator Angle", test,driver);
	}
@Test(priority =16)
	public void Leafnumber() throws IOException {
	test = extent.createTest(guiTestCaseName()+" To Verify Leaf Number label"," Leaf Number label should be present ");	
	demo.Textcomparsion(Field.leafnum, "Leaf Number", test,driver);
	}
@Test(priority =17)
	public void Banka() throws IOException {
	test = extent.createTest(guiTestCaseName()+" To Verify Bank A label"," Bank A label should be present ");	
	demo.Textcomparsion(Field.banka, "Bank A", test,driver);
	}
@Test(priority =18)
	public void Bankb() throws IOException {
	test = extent.createTest(guiTestCaseName()+" To Verify Bank B label"," Bank B label should be present ");	
	demo.Textcomparsion(Field.bankb, "Bank B", test,driver);
	}
@Test(priority =19)
	public void Apply() throws IOException {
	test = extent.createTest(guiTestCaseName()+" To Verify APPLY label"," APPLY label should be present ");	
	demo.Textcomparsion(Field.apply, "APPLY", test,driver);
	demo.BydefaultisEnabled(Field.apply, "APPLY", test,driver);
	}
@Test(priority =20)
	public void fieldsave() throws Exception  {
	test = extent.createTest(guiTestCaseName()+" To Verify SAVE label"," SAVE label should be present ");	
	demo.Textcomparsion(Field.fieldsave, "SAVE", test,driver);
	demo.BydefaultisEnabled(Field.fieldsave, "SAVE", test,driver);
	}
@Test(priority =21)
	public void beameyeview() throws IOException {
	test = extent.createTest(guiTestCaseName()+" To Verify Beam Eye View label"," Beam Eye View label should be present ");	
	demo.Textcomparsion(Field.beamview, "Beam Eye View", test,driver);
	}
@Test(priority =22)
	public void Configuredfieldlist() throws IOException {
	test = extent.createTest(guiTestCaseName()+" To Verify Configured Field List label"," Configured Field List label should be present ");	
	demo.Textcomparsion(Field.configfield, "Configured Field List", test,driver);
	}
@Test(priority =23)
	public void Searchfieldname() throws IOException {
	test = extent.createTest(guiTestCaseName()+" To Verify Search Field Name label"," Search Field Name label should be present ");	
	demo.Textcomparsion(Field.Search, "Search Field Name", test,driver);
	Field.selection.click();
}

	@Test(priority =24)
	public void FieldnameLabel() throws IOException {
	test = extent.createTest(guiTestCaseName()+" To Verify Field Name label"," Field Name label should be present ");	
	demo.Textcomparsion(Field.fieldName, "Field Name", test,driver);
	}
	
	
	@Test(priority =25)
	public void FieldType() throws IOException, InterruptedException {
	test = extent.createTest(guiTestCaseName()+" To Verify Field Type label"," Field Type label should be present ");	
	demo.Textcomparsion(Field.fieldType, "Field Type", test,driver);
	Field.configfield.click();
	Field.selection.click();
	Field.fieldType.click();
	Thread.sleep(1000);
	}
	
@Test(priority =26)
	public void Searchfieldtype() throws IOException, InterruptedException {
	test = extent.createTest(guiTestCaseName()+" To Verify Search Field Type label"," Search Field Type label should be present ");
	Thread.sleep(1000);
	demo.Textcomparsion(Field.searchfieldType, "Search Field Type", test,driver);
	}
@Test(priority =26)
	public void Selectmachine() throws IOException {
	test = extent.createTest(guiTestCaseName()+" To Verify Select Machine label"," Select Machine label should be present ");	
	demo.Textcomparsion(Field.select, "Select Machine", test,driver);
	}
//@Test(priority =26)
	public void Bhabhatrontaw() throws IOException {
	test = extent.createTest(guiTestCaseName()+" BHABHATRON-II_CO2 label"," BHABHATRON-II_CO2 label should be present ");	
	bhataw=driver.findElement(By.name("BHABHATRON-II_CO2"));
	demo.Textcomparsion(bhataw, "BHABHATRON-II_CO2", test,driver);
	}
//@Test(priority =27)
	public void Bhabhatronmlc() throws IOException {
	test = extent.createTest(guiTestCaseName()+" BHABHATRON-II MLC v2_CO3 label"," BHABHATRON-II MLC v2_CO3 label should be present ");	
	bhamlc=driver.findElement(By.name("BHABHATRON-II MLC v2_CO3"));
	demo.Textcomparsion(bhamlc, "BHABHATRON-II MLC v2_CO3", test,driver);
	}
//@Test(priority =28)
	public void Bhabhatron() throws IOException {
	test = extent.createTest(guiTestCaseName()+" BHABHATRON-3_CO4 label"," BHABHATRON-3_CO4 label should be present ");	
	bha=driver.findElement(By.name("BHABHATRON-3_CO4"));
	demo.Textcomparsion(bha, "BHABHATRON-3_CO4", test,driver);
	}
//@Test(priority =29)
	public void Siddharth() throws IOException {
	test = extent.createTest(guiTestCaseName()+" SIDDHARTH-II_CO5 label"," SIDDHARTH-II_CO5 label should be present ");	
	sidd=driver.findElement(By.name("SIDDHARTH-II_CO5"));
	demo.Textcomparsion(sidd, "SIDDHARTH-II_CO5", test,driver);
	}
@Test(priority =29)
	public void Fieldtype() throws IOException {
	test = extent.createTest(guiTestCaseName()+" To Verify Field Type label"," Field Type label should be present ");	
	demo.Textcomparsion(Field.fieldtype, "Field Type", test,driver);
	}
@Test(priority =30)
public void FieldName() throws IOException {
test = extent.createTest(guiTestCaseName()+" To Verify Field Name label"," Field Name label should be present ");	
demo.Textcomparsion(Field.fieldname, "Field Name", test,driver);
}



@Test(priority =31)
public void Addfield1() throws IOException {
test = extent.createTest(guiTestCaseName()+" Add Field Enable"," Add Field Enable should be present ");	
Addfield1=driver.findElement(By.name("Add field"));
demo.isEnabled(Addfield1, "Add field", test, driver);
}

//@Test(priority =32)
public void funFieldName() throws IOException, InterruptedException
{
	
	Field.fieldname=driver.findElement(By.name("Field Name"));
	TextBox("Field Name",15,Field.fieldname);
	cleartext("Field Name");
}
//@Test(priority =33)
public void funFy() throws IOException
{
	test = extent.createTest(guiTestCaseName()+" Fx and Fy textfield range"," Fy textfield range should be accepted ");
	syminvalidrange("FX(cm) [Min:0,Max:30]",-50,0);
	errormessagedisplayed("Range:[0 to 30]","Range:[0 to 30]");
	syminvalidrange("FY(cm) [Min:0,Max:30]",30,300);
	errormessagedisplayed("Range:[0 to 30]","Range:[0 to 30]");
	demo.BydefaultisEnabled(Field.apply,"APPLY", test, driver);
	cleartext("FY(cm) [Min:0,Max:30]");
	cleartext("FX(cm) [Min:0,Max:30]");
	syminvalidrange("FX(cm) [Min:0,Max:30]",-50,0);
	errormessagedisplayed("Range:[0 to 30]","Range:[0 to 30]");
	cleartext("FX(cm) [Min:0,Max:30]");
	syminvalidrange("FY(cm) [Min:0,Max:30]",30,300);
	errormessagedisplayed("Range:[0 to 30]","Range:[0 to 30]");
	cleartext("FY(cm) [Min:0,Max:30]");
}
//@Test(priority =34)
public void funFx() throws IOException
{
	test = extent.createTest(guiTestCaseName()+" Fx textfield range"," Fx textfield range should be accepted ");	
	symvalid("FX(cm) [Min:0,Max:30]");
	symvalid("FY(cm) [Min:0,Max:30]");
	funFxapply();
}

//@Test(priority =35)
public void funCollimatorinvalid() throws IOException
{
	test = extent.createTest(guiTestCaseName()+"Collimator range textfield","Collimator range textfield");
	cleartext("Collimator Angle");
	syminvalidrange("Collimator Angle", -50, 0);
	errormessagedisplayed("Range:[0 to 359.9]","Range:[0 to 359.9]");
	cleartext("Collimator Angle");
	syminvalidrange("Collimator Angle", (int) 359.9, 600);
	errormessagedisplayed("Range:[0 to 359.9]","Range:[0 to 359.9]");
	demo.BydefaultisEnabled(Field.apply,"APPLY", test, driver);
}
String element;
private WebElement Rangemsg;
ExtentTest parentTest;
private WebElement Symfx;
private WebElement Symfy;
private String Text;
private String Fxnum;
private String sidname;
private String sidfxnum;
private String sidfynum;
private String sidcolli;
private String sidnameupdated;
private String sidfynumupdated;
private String sidfxnumupdated;
//@Test(priority =36)
public void funCollimatorvalid() throws IOException, InterruptedException
{
	test = extent.createTest(guiTestCaseName()+"Collimator range textfield","Collimator range textfield");
	WebElement angle=driver.findElement(By.name("Collimator Angle"));
	Actions actions = new Actions(driver); 
	invalidrange(0,359.9);
	actions.moveToElement(angle,205,0).click().perform();
	driver.switchTo().activeElement().sendKeys(Keys.CONTROL + "a", Keys.DELETE);
	Thread.sleep(2000);
	actions.moveToElement(angle,205,0).click().sendKeys(randomrangefield1).perform();
	for(int  i=0;i<3;i++)
	{
	if(randomrangefield1.length()>100 && randomrangefield1.length()<260)
	{
		errormessagedisplayed("Range is:[0-100],[260-0]","Range is:[0-100],[260-0]");
		demo.BydefaultisEnabled(Field.apply,"APPLY", test, driver);
		actions.moveToElement(angle,205,0).click().perform();
		
		driver.switchTo().activeElement().sendKeys(Keys.CONTROL + "a", Keys.DELETE);
	}
	else
	{
		funFxapply();
		break;
	}
	}
}
//@Test(priority =37)
public void funapplybutton() throws IOException, InterruptedException
{
	test = extent.createTest(guiTestCaseName()+"Only enter the fieldname and Symmetric field and save the data");
	Field.fieldname=driver.findElement(By.name("Field Name"));
	clear(Field.fieldname);
	randomstringtext(16);
	Textelement(Field.fieldname);
	sidname=Text;
	
	Symfx=driver.findElement(By.name("FX(cm) [Min:0,Max:30]"));
	Numelement(Symfx);
	sidfxnum=Fxnum;
	
	Symfy=driver.findElement(By.name("FY(cm) [Min:0,Max:30]"));
	Numelement(Symfy);
	sidfynum=Fxnum;
	WebElement angle=driver.findElement(By.name("Collimator Angle"));
	Actions actions = new Actions(driver); 
	collirange();
	actions.moveToElement(angle,205,0).click().perform();
	driver.switchTo().activeElement().sendKeys(Keys.CONTROL + "a", Keys.DELETE);
	Thread.sleep(2000);
	actions.moveToElement(angle,205,0).click().sendKeys(collianglesize).perform();
	sidcolli=collianglesize;
	Field.apply.click();
	fieldsave.click();
	Sitesave("Field Configuration Save", "Field Configuration saved.", "Field Configuration Save", "Field Configuration saved.", 0, driver);
	
}
@Test(priority =38)
public void common()
{
	Field.fieldname=driver.findElement(By.name("Field Name"));
	Symfx=driver.findElement(By.name("FX(cm) [Min:0,Max:30]"));
	Symfy=driver.findElement(By.name("FY(cm) [Min:0,Max:30]"));
}
@Test(priority =38)
public void edit() throws IOException, InterruptedException, FindFailed
{
	test = extent.createTest(funTestCaseName()+" Edit button enabled when data saved");

	String imagePath = "D:\\EditCapture.PNG";
    Screen screen = new Screen();
    Match match = screen.find(imagePath);
    if (match != null) {
        
        match.click();
    } else {
        test.fail("Image not created");
    }
    Thread.sleep(2000);
	datasave();
	Thread.sleep(3000);
	test = extent.createTest(funTestCaseName()+" Edit the data");
	
//	clear(fieldname);
//	randomstringtext(16);
//	Thread.sleep(2000);
//	Textelement(fieldname);
//	Thread.sleep(2000);
//	sidnameupdated=Text;
//	demo.ByInvalidErrormessage(fieldname, sidnameupdated, test, driver);
	
	Numelement(Symfx);
	sidfxnumupdated=Fxnum;
	Thread.sleep(1000);
	Numelement(Symfy);
	sidfynum=Fxnum;
	Thread.sleep(1000);
	WebElement angle=driver.findElement(By.name("Collimator Angle"));
	Actions actions = new Actions(driver); 
	collirange();
	actions.moveToElement(angle,205,0).click().perform();
	driver.switchTo().activeElement().sendKeys(Keys.CONTROL + "a", Keys.DELETE);
	Thread.sleep(2000);
	actions.moveToElement(angle,205,0).click().sendKeys(collianglesize).perform();
	sidcolli=collianglesize;
	Field.apply.click();
	WebElement Update=driver.findElement(By.name("UPDATE"));
	Update.click();
	Sitesave("Field Configuration Update", "Selected Field Configuration updated", "Field Configuration Update", "Selected Field Configuration updated", 0, driver);
	//Edit.click();
	match.click();
	dataupdate();
	Field.apply.click();
	Update.click();

	

}

public void datasave() throws IOException
{
	demo.ByActionclass(Field.fieldname, sidname, test, driver);
	demo.ByActionclass(Symfx, sidfxnum, test, driver);
	demo.ByActionclass(Symfy, sidfynum, test, driver);
}
public void dataupdate() throws IOException
{
	demo.ByActionclass(Field.fieldname, sidname, test, driver);
	demo.ByActionclass(Symfx, sidfxnumupdated, test, driver);
	demo.ByActionclass(Symfy, sidfxnumupdated, test, driver);
}
public void funFxapply() throws IOException
{
	test = extent.createTest(guiTestCaseName()+" Valid Range Apply and Save button"," Valid Range Apply and Save button");	
	demo.isEnabled(Field.apply,"APPLY", test, driver);
	demo.BydefaultisEnabled(fieldsave,"SAVE", test, driver);
	Field.apply.click();
	demo.isEnabled(fieldsave,"SAVE", test, driver);
	fieldsave.click();
	errormessagedisplayed("Field Name Cannot be Empty","Field Name Cannot be Empty");
}

public void Textelement(WebElement element)
{
	element.click();
	randomstringtext(15);
	Text=randomString;
	driver.switchTo().activeElement().sendKeys(Text);
}
public void Numelement(WebElement element)
{
	rangenum();
	element.click();
	clear(element);
	Fxnum=randomrangenum;
	driver.switchTo().activeElement().sendKeys(randomrangenum);
}
public void symvalid(String Text) throws IOException
{
	Fx=driver.findElement(By.name(Text));
	rangenum();
	Fx.click();
	driver.switchTo().activeElement().sendKeys(randomrangenum);
	demo.ByValidErrormessage(Fx,randomrangenum,test,driver);
}
public void syminvalidrange(String Text, int a, int b) throws IOException
{
	Fx=driver.findElement(By.name(Text));
	invalidrange(a,b);
	Fx.click();
	driver.switchTo().activeElement().sendKeys(randomrangefield);
	demo.ByValidErrormessage(Fx,randomrangefield,test,driver);
}
public void syminvalidrange(String Text, int a, double b) throws IOException
{
	Fx=driver.findElement(By.name(Text));
	invalidrange(a,b);
	Fx.click();
	driver.switchTo().activeElement().sendKeys(randomrangefield1);
	demo.ByValidErrormessage(Fx,randomrangefield,test,driver);
}

public void syminvalidrange1(String Text, int a, double b) throws IOException
{
	Fx=driver.findElement(By.xpath(element));
	invalidrange(a,b);
	Fx.click();
	driver.switchTo().activeElement().sendKeys(randomrangefield);
	demo.ByValidErrormessage(Fx,randomrangefield,test,driver);
}
public void smfieldname(String Text, int i) throws IOException, InterruptedException
{
	randomstringtext(i);
	Validatachars(Text);
}
public  void TextBox(String Text, int i,WebElement actual) throws IOException, InterruptedException 
{
	randomUpper(i);
	ValidataUpper(Text);
	applydisable(actual);
	clear(actual);
	randomLower(i);
	ValidataLower(Text);
	applydisable(actual);
	clear(actual);
	randomalpha(i);
	ValidataUpperLower(Text);
	applydisable(actual);
	clear(actual);
	randomNumber(i);
	ValidataNumber(Text);
	applydisable(actual);
	clear(actual);
	randomstringtext(i);
	Validatachars(Text);
	applydisable(actual);
	clear(actual);
	Invalidatachars(actual);
	applydisable(actual);
}

public void clear(WebElement element)
{
	element.click();
	driver.switchTo().activeElement().clear();
}
public void cleartext(String Text)
{
	Fx=driver.findElement(By.name(Text));
	Fx.click();
	driver.switchTo().activeElement().clear();
}
public void applydisable(WebElement element) throws IOException
{
	demo.isEnabled(element, "Apply", test, driver);
}

}
