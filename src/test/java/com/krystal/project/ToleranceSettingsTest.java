package com.krystal.project;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.sikuli.script.Match;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.windows.WindowsDriver;

public class ToleranceSettingsTest extends ReferencefileChemotheraphy{

	
	
	TolerancePOM tol;
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
	//@Test(priority =0)
		public void button() throws InterruptedException{
		List<WebElement> elements = driver.findElements(By.className("Button"));
	    Actions actions = new Actions(driver);
	    for (WebElement element : elements) {
	        actions.moveToElement(element).perform();
	        System.out.println(element.getText());
	        Thread.sleep(1000);
	    }
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
//test = extent.createTest(guiTestCaseName()+" Rotation Angle(deg) label"," Rotation Angle(deg) label should be present ");	
//beamrotangle=driver.findElement(By.xpath("//Custom[@ClassName=\"ToleranceSettingsMainView\"]/Custom[@ClassName=\"ToleranceSettingsSection1View\"]/Edit[@ClassName=\"TextBox\"]/Text[@Name=\"Rotation Angle (deg)\"][@AutomationId=\"LblName\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Rotation Angle (deg)\"][1]"));
//Rotation(4,driver);

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
//Rotation(5,driver);
beamrotangle=driver.findElements(By.name("Rotation Angle (deg)")).get(5);
demo.Textcomparsion(beamrotangle, "Rotation Angle(deg)", test,driver);
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
refresh=driver.findElement(By.xpath("//Button[contains(@HelpText,'Refresh')]"));
demo.isdisplayed(refresh, "Refresh", test,driver);
}
//@Test(priority =21)
public void ToleranceListLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Tolerance List label"," Tolerance List label should be present ");	
tollist=driver.findElement(By.name("Tolerance List"));
demo.Textcomparsion(tollist, "Tolerance List", test,driver);
}
//@Test(priority =22)
public void SelectMachineLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Select Machine label"," Select Machine label should be present ");	
selmachine=driver.findElement(By.name("Select Machine"));
demo.Textcomparsion(selmachine, "Select Machine", test,driver);
}
//@Test(priority =23)
public void BhabhatronLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" BHABHATRON-3i_CO6 label"," BHABHATRON-3i_CO6 label should be present ");	
selbha=driver.findElement(By.name("BHABHATRON-3i_CO6"));
demo.Textcomparsion(selbha, "BHABHATRON-3i_CO6", test,driver);
}
//@Test(priority =24)
public void BhabhatronmlcLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" BHABHATRON-II MLC v2_CO3 label"," BHABHATRON-II MLC v2_CO3 label should be present ");	
selbhamlc=driver.findElement(By.name("BHABHATRON-II MLC v2_CO3"));
demo.Textcomparsion(selbhamlc, "BHABHATRON-II MLC v2_CO3", test,driver);
}
//@Test(priority =25)
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
}
@Test(priority =29)
public void SearchTolTablenumberLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Search Tolerance Table Number label"," Search Tolerance Table Number label should be present ");	

searchtolnumber=driver.findElement(By.name("Search Tolerance Table Number"));
demo.Textcomparsion(searchtolnumber, "Search Tolerance Table Number", test,driver);
}
@Test(priority =28)
public void ToleranceTablenumberLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Tolerance Table Number label"," Tolerance Table Number label should be present ");	
toltablenumber=driver.findElement(By.name("Tolerance Table Number"));
demo.Textcomparsion(toltablenumber, "Tolerance Table Number", test,driver);
toltablenumber.click();
}
@Test(priority =27)
public void ToleranceTablenameLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Tolerance Table Name label"," Tolerance Table Name label should be present ");	
searchtolicon=driver.findElement(By.xpath("//Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"ToleranceSettingsMainView\"]/Custom[@ClassName=\"ToleranceSettingsSection2View\"]/Button[@AutomationId=\"SearchMenuButton\"]"));
searchtolicon.click();
toltablename=driver.findElement(By.name("Tolarence Table Name"));
demo.Textcomparsion(toltablename, "Tolarence Table Name", test,driver);
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

@Test(priority=39)
public void savedisable() throws InterruptedException, IOException
{
	test = extent.createTest(guiTestCaseName()+" To verify the Save button disabled by default ","By default Save Button should be disabled ");
    demo.BydefaultisEnabled(tol.Save,"SAVE", test,driver);
}
}
