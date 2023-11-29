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
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.windows.WindowsDriver;


public class PrescChemotherapyFun extends ReferencefileChemotheraphy{
	private Actions act;
	WarningMesages warn;
	private ChemoTherapyPOM chemop;
	private String SiteText6;
	private String Classification6;
	private String SiteText4;
	String SiteText1;
	private String Classification1;
	private String Regimens1;
	private String DrugDose1;
	private String Weight1;
	private String Height1;
	private String SiteText2;
	private String Regimens2;
	private String DrugDose2;
	private String Weight2;
	private String Height2;
	String DrugForm1;
	String Drug1;
	private String Classification2;
	private String DrugForm2;
	private String Drug2;
	private String SiteText3;
	private String Classification3;
	private String Regimens3;
	private String DrugForm3;
	private String Drug3;
	private String Weight3;
	private String DrugDose3;
	private String Height3;
	private String Classification4;
	private String Regimens4;
	private String DrugForm4;
	private String Drug4;
	private String Weight4;
	private String DrugDose4;
	private String Height4;
	private String DrugForm6;
	private String Regimens6;
	private String Drug6;
	private String DrugDose6;
	private String Weight6;
	private String Height6;
	private String Linkprescription4;
	private String RadioSensitizers;
	private String SiteText10;
	private String Classification10;
	private String Regimens10;
	private String DrugForm10;
	private String Drug10;
	private String DrugDose10;
	private String Weight10;
	private String Height10;
	private String DrugDose100;
	private String SiteText21;
	private String Classification21;
	private String Regimens21;
	private String DrugForm21;
	private String Drug21;
	private String Height21;
	private String DrugDose210;
	private String Weight21;
	private String SiteText31;
	private String Classification31;
	private String DrugForm31;
	private String Regimens31;
	private String Drug31;
	private String Weight31;
	private String Height31;
	private String Classification41;
	private String DrugDose41;
	private String DrugDose42;
	private String DrugDose43;
	private String DrugDose221;
	private String DrugDose331;
	private String DrugDose;
	private String DrugDose201;
	private String DrugDose1a;
	private String DrugDose333;
	private String DrugDose444;
	private String DrugForm66;
	private String Regimens66;
	private String DrugDose44;
	private String DrugDose101;
	private String DrugDose447;
	private String DrugDose4g;
	private String DrugDose66;
	private String Drug66;

	@BeforeClass
	public void setUp1()  throws InterruptedException, IOException {
	DesiredCapabilities appCapabilities = new DesiredCapabilities();
	appCapabilities.setCapability("app", "C:\\Program Files\\Panacea Medical Technologies\\Krystal\\Krystal.exe");
	driver = new WindowsDriver<WebElement>(new URL("http://127.0.0.1:4723"), appCapabilities);
	ReferenceSigin Sign=new ReferenceSigin();
	Sign.Login(driver);
	Sign.ChemotheraphyPrecsription(driver);
	chemop=new ChemoTherapyPOM(driver);
	act=new Actions(driver);
	warn=new WarningMesages();
	}
	
	

	//@Test(priority =1)
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


	
	
	@Test(priority =1)     // Use try catch block for each message
   	public void toverifyfunctionalityofWarningmessagesafterclickedonsave() throws InterruptedException, IOException{
		 test = extent.createTest(funTestCaseName()+" : To verify the functionality of Warningmessages below dropdowns, radiobuttons and textfield after clicked on save ", "Warning esaages should display for requiewd fields");
		act.moveToElement(chemop.Save).click().perform();
		try {
		List(chemop.SitePhase, 1,act);
	    List(chemop.Rtids, 1,act);
		}
		catch(Exception e)
		{
			test.error(e);
		}
		try {
		
		String Anysite = warn.Anysite(driver, chemop.Site,act);
		demo.TextfieldwithWarnmsg(Anysite,"Select any site",test,driver);
		String Chemotypeselect = warn.pleaseSelectaChemoType(chemop.TreatmentType,act,driver);
		demo.TextfieldwithWarnmsg(Chemotypeselect,"Select any chemotherapy type",test,driver);
		String AnyDrug = warn.Anydrug(driver, chemop.Drug,act);
		demo.TextfieldwithWarnmsg(AnyDrug,"Select any drug",test,driver);
		String AnyDrugform = warn.AnyDrugform(driver, chemop.DrugForm,act);    
		demo.TextfieldwithWarnmsg(AnyDrugform,"Select a drug form",test,driver);
		String Anydrugdose = warn.Anyselectdrugdose(driver, chemop.DrugDose,act);
		demo.TextfieldwithWarnmsg(Anydrugdose,"Select any drug dose",test,driver);	
		String PatientWeight = warn.PatientWeight(driver, chemop.PatientWeight,act);
		demo.TextfieldwithWarnmsg(PatientWeight,"Input cannot be blank",test,driver);
		String PatientHeight = warn.PatientHeight(driver, chemop.PatientHeight,act);
		demo.TextfieldwithWarnmsg(PatientHeight,"Input cannot be blank",test,driver);
		String Cycles = warn.Cycles(driver, chemop.Cycles,act);
		demo.TextfieldwithWarnmsg(Cycles,"Input cannot be blank",test,driver);
		String frequency = warn.AnyFrequency(driver, chemop.Cycles,act);
		demo.TextfieldwithWarnmsg(frequency,"Select any frequency",test,driver);
		chemop.Weeklylbl.click();
		act.moveToElement(chemop.Save).click().perform();
		String Anyday = warn.SelectanyDay(driver, chemop.Cycles,act);
		demo.TextfieldwithWarnmsg(Anyday,"Select any day",test,driver);
		chemop.Customlbl.click();
		act.moveToElement(chemop.Save).click().perform();
		String Every = warn.Every(chemop.Every,act,driver);
		demo.TextfieldwithWarnmsg(Every,"Input cannot be blank",test,driver);		
	//	System.out.println(driver.findElement(By.xpath("//*[text() = 'RT202309A03']"))+" rtid");
		
		}
		catch(Exception e)
		{
			test.error(e);
		}
}	
	
	@Test(priority =2)
   	public void toverifyfunctionalityofdropdownsenabledafterselectingpostsurgery() throws InterruptedException, IOException{
		 test = extent.createTest(funTestCaseName()+" : To verify the functionality of dropdowns, checkbox and textfield  enabled after selecting postsurgery ", "All dropdowns except radiosensitizer dropdown  should enable and checkboxes will disable");
	//	chemoTherapy.TreatmentType.click();
		 
		act.moveToElement(chemop.SitePhase.get(chemop.SitePhase.size()-1)).click().perform();
		warn.Dropdown1(chemop.TreatmentType, chemop.TreatmentTypes, 0, "chemop.TreatmentType", test,driver,act);
		demo.isEnabled(chemop.Site, "Site", test,driver);
		demo.isEnabled(chemop.Classification, "Classification", test,driver);
		demo.isEnabled(chemop.Drug, "Drug", test,driver);
		demo.isEnabled(chemop.DrugForm, "DrugForm", test,driver);
		demo.isEnabled(chemop.Regimen, "Regimen", test,driver);
		demo.BydefaultisEnabled(chemop.RadioSensitizer, "RadioSensitizer", test,driver);
		demo.isEnabled(chemop.DrugDose, "DrugDose", test,driver);
		demo.isEnabled(chemop.PatientHeight, "PatientHeight", test,driver);
		demo.isEnabled(chemop.PatientWeight, "PatientWeight", test,driver);
		demo.isEnabled(chemop.PatientHeight_D, "PatientHeight_Dropdown", test,driver);
		demo.isEnabled(chemop.PatientWeight_D, "PatientWeight_Dropdown", test,driver);
		demo.isEnabled(chemop.Cycles, "Cycles", test,driver);
		Thread.sleep(100);
		demo.isEnabled(chemop.WeeklyRadiobutton, "WeeklyRadiobutton", test,driver);
		demo.BydefaultisEnabled(chemop.Monday, "Monday", test,driver);
		demo.BydefaultisEnabled(chemop.Tuesday, "Tuesday", test,driver);
		demo.BydefaultisEnabled(chemop.Wednesday, "Wednesday", test,driver);
		demo.BydefaultisEnabled(chemop.Thursday, "Thursday", test,driver);
		demo.BydefaultisEnabled(chemop.Friday, "Friday", test,driver);
		demo.BydefaultisEnabled(chemop.Saturday, "Saturday", test,driver);
		demo.BydefaultisEnabled(chemop.Sunday, "Sunday", test,driver);
		demo.isEnabled(chemop.CustomRadiobutton, "CustomRadiobutton", test,driver);
		demo.isEnabled(chemop.Every, "Every textfield", test,driver);
		
		
}
	
	
	@Test(priority =3)
   	public void toverifyfunctionalityofdropdownsenabledafterselectingpostradiodiation() throws InterruptedException, IOException{
	
		test = extent.createTest(funTestCaseName()+" :  To verify the functionality of dropdowns, checkbox and textfield  enabled after selecting post-radiation ", "All dropdowns except radiosensitizer dropdown  should enable and checkboxes will disable");
		//chemop.PostRadiation.click();
		warn.Dropdown1(chemop.TreatmentType, chemop.TreatmentTypes, 2, "chemop.TreatmentType", test,driver,act);
		demo.isEnabled(chemop.Site, "Site", test,driver);
		demo.isEnabled(chemop.Classification, "Classification", test,driver);
		demo.isEnabled(chemop.Drug, "Drug", test,driver);
		demo.isEnabled(chemop.DrugForm, "DrugForm", test,driver);
		demo.isEnabled(chemop.Regimen, "Regimen", test,driver);
		demo.BydefaultisEnabled(chemop.RadioSensitizer, "RadioSensitizer", test,driver);
		demo.isEnabled(chemop.DrugDose, "DrugDose", test,driver);
		demo.isEnabled(chemop.PatientHeight, "PatientHeight", test,driver);
		demo.isEnabled(chemop.PatientWeight, "PatientWeight", test,driver);
		demo.isEnabled(chemop.PatientHeight_D, "PatientHeight_Dropdown", test,driver);
		demo.isEnabled(chemop.PatientWeight_D, "PatientWeight_Dropdown", test,driver);
		demo.isEnabled(chemop.Cycles, "Cycles", test,driver);
		demo.isEnabled(chemop.WeeklyRadiobutton, "WeeklyRadiobutton", test,driver);
		demo.BydefaultisEnabled(chemop.Monday, "Monday", test,driver);
		demo.BydefaultisEnabled(chemop.Tuesday, "Tuesday", test,driver);
		demo.BydefaultisEnabled(chemop.Wednesday, "Wednesday", test,driver);
		demo.BydefaultisEnabled(chemop.Thursday, "Thursday", test,driver);
		demo.BydefaultisEnabled(chemop.Friday, "Friday", test,driver);
		demo.BydefaultisEnabled(chemop.Saturday, "Saturday", test,driver);
		demo.BydefaultisEnabled(chemop.Sunday, "Sunday", test,driver);
		demo.isEnabled(chemop.CustomRadiobutton, "CustomRadiobutton", test,driver);
		demo.isEnabled(chemop.Every, "Every textfield", test,driver);
		
	}
	

	//@Test(priority =4)
   	public void toverifyfunctionalityofdropdownsenabledafterselectingpreradiodiation() throws InterruptedException, IOException{
		test = extent.createTest(funTestCaseName()+" : To verify the functionality of dropdowns, checkbox and textfield  enabled after selecting pre-radiation ", "All dropdowns except radiosensitizer dropdown  should enable and checkboxes will disable");
		//chemop.PreRadiation.click();
		warn.Dropdown1(chemop.TreatmentType, chemop.TreatmentTypes, 3, "chemop.TreatmentType", test,driver,act);
		demo.isEnabled(chemop.Site, "Site", test,driver);
		demo.isEnabled(chemop.Classification, "Classification", test,driver);
		demo.isEnabled(chemop.Drug, "Drug", test,driver);
		demo.isEnabled(chemop.DrugForm, "DrugForm", test,driver);
		demo.isEnabled(chemop.Regimen, "Regimen", test,driver);
		demo.BydefaultisEnabled(chemop.RadioSensitizer, "RadioSensitizer", test,driver);
		demo.isEnabled(chemop.DrugDose, "DrugDose", test,driver);
		demo.isEnabled(chemop.PatientHeight, "PatientHeight", test,driver);
		demo.isEnabled(chemop.PatientWeight, "PatientWeight", test,driver);
		demo.isEnabled(chemop.PatientHeight_D, "PatientHeight_Dropdown", test,driver);
		demo.isEnabled(chemop.PatientWeight_D, "PatientWeight_Dropdown", test,driver);
		demo.isEnabled(chemop.Cycles, "Cycles", test,driver);
		demo.isEnabled(chemop.WeeklyRadiobutton, "WeeklyRadiobutton", test,driver);
		demo.BydefaultisEnabled(chemop.Monday, "Monday checkbox", test,driver);
		demo.BydefaultisEnabled(chemop.Tuesday, "Tuesday checkbox", test,driver);
		demo.BydefaultisEnabled(chemop.Wednesday, "Wednesday checkbox", test,driver);
		demo.BydefaultisEnabled(chemop.Thursday, "Thursday checkbox", test,driver);
		demo.BydefaultisEnabled(chemop.Friday, "Friday checkbox", test,driver);
		demo.BydefaultisEnabled(chemop.Saturday, "Saturday checkbox", test,driver);
		demo.BydefaultisEnabled(chemop.Sunday, "Sunday checkbox", test,driver);
		demo.isEnabled(chemop.CustomRadiobutton, "CustomRadiobutton", test,driver);
		demo.isEnabled(chemop.Every, "Every textfield", test,driver);
		
	}
	
	//@Test(priority =5)
   	public void toverifyfunctionalityofdropdownsenabledafterselectingconncurrent() throws InterruptedException, IOException{
		test = extent.createTest(funTestCaseName()+" : To verify the functionality of dropdowns, checkbox and textfield  enabled after selecting Concurrent ", "All dropdowns except classification and Regimens dropdown should enable  and checkboxes will disable");
		warn.Dropdown1(chemop.TreatmentType, chemop.TreatmentTypes, 4, "chemop.TreatmentType", test,driver,act);
		demo.isEnabled(chemop.Site, "Site", test,driver);
		demo.BydefaultisEnabled(chemop.Classification, "Classification", test,driver);
		demo.isEnabled(chemop.Drug, "Drug dropdown", test,driver);
		demo.isEnabled(chemop.DrugForm, "DrugForm", test,driver);
		demo.BydefaultisEnabled(chemop.Regimen, "Regimen", test,driver);
		demo.isEnabled(chemop.RadioSensitizer, "RadioSensitizer", test,driver);
		demo.isEnabled(chemop.DrugDose, "DrugDose", test,driver);
		demo.isEnabled(chemop.PatientHeight, "PatientHeight", test,driver);
		demo.isEnabled(chemop.PatientWeight, "PatientWeight", test,driver);
		demo.isEnabled(chemop.PatientHeight_D, "PatientHeight_Dropdown", test,driver);
		demo.isEnabled(chemop.PatientWeight_D, "PatientWeight_Dropdown", test,driver);
		demo.isEnabled(chemop.LinkPrescription, "LinkPrescription dropdown", test,driver);
		demo.isEnabled(chemop.Cycles, "Cycles", test,driver);
		demo.isEnabled(chemop.WeeklyRadiobutton, "WeeklyRadiobutton", test,driver);
		demo.BydefaultisEnabled(chemop.Monday, "Monday checkbox", test,driver);
		demo.BydefaultisEnabled(chemop.Tuesday, "Tuesday checkbox", test,driver);
		demo.BydefaultisEnabled(chemop.Wednesday, "Wednesday checkbox", test,driver);
		demo.BydefaultisEnabled(chemop.Thursday, "Thursday checkbox", test,driver);
		demo.BydefaultisEnabled(chemop.Friday, "Friday checkbox", test,driver);
		demo.BydefaultisEnabled(chemop.Saturday, "Saturday checkbox", test,driver);
		demo.BydefaultisEnabled(chemop.Sunday, "Sunday checkbox", test,driver);
		demo.isEnabled(chemop.CustomRadiobutton, "CustomRadiobutton", test,driver);
		demo.isEnabled(chemop.Every, "Every textfield", test,driver);
		
	}
	
	
	//@Test(priority =6)
   	public void toverifyfunctionalityofdropdownsenabledafterselectingothers() throws InterruptedException, IOException{
		test = extent.createTest(funTestCaseName()+" : To verify the functionality of dropdowns, checkbox and textfield  enabled after selecting Others ", "All dropdowns except radiosensitizer dropdown  should enable and checkboxes will disable");
		warn.Dropdown1(chemop.TreatmentType, chemop.TreatmentTypes, 5, "chemop.TreatmentType", test,driver,act);
		demo.isEnabled(chemop.Site, "Site", test,driver);
		demo.isEnabled(chemop.Classification, "Classification", test,driver);
		demo.isEnabled(chemop.Drug, "Drug", test,driver);
		demo.isEnabled(chemop.DrugForm, "DrugForm", test,driver);
		demo.isEnabled(chemop.Regimen, "Regimen", test,driver);
		demo.BydefaultisEnabled(chemop.RadioSensitizer, "RadioSensitizer", test,driver);
		demo.isEnabled(chemop.DrugDose, "DrugDose", test,driver);
		demo.isEnabled(chemop.PatientHeight, "PatientHeight", test,driver);
		demo.isEnabled(chemop.PatientWeight, "PatientWeight", test,driver);
		demo.isEnabled(chemop.PatientHeight_D, "PatientHeight_Dropdown", test,driver);
		demo.isEnabled(chemop.PatientWeight_D, "PatientWeight_Dropdown", test,driver);
		demo.isEnabled(chemop.Cycles, "Cycles", test,driver);
		demo.isEnabled(chemop.WeeklyRadiobutton, "WeeklyRadiobutton", test,driver);
		demo.BydefaultisEnabled(chemop.Monday, "Monday checkbox", test,driver);
		demo.BydefaultisEnabled(chemop.Tuesday, "Tuesday checkbox", test,driver);
		demo.BydefaultisEnabled(chemop.Wednesday, "Wednesday checkbox", test,driver);
		demo.BydefaultisEnabled(chemop.Thursday, "Thursday checkbox", test,driver);
		demo.BydefaultisEnabled(chemop.Friday, "Friday checkbox", test,driver);
		demo.BydefaultisEnabled(chemop.Saturday, "Saturday checkbox", test,driver);
		demo.BydefaultisEnabled(chemop.Sunday, "Sunday checkbox", test,driver);
		demo.isEnabled(chemop.CustomRadiobutton, "CustomRadiobutton", test,driver);
		demo.isEnabled(chemop.Every, "Every textfield", test,driver);
		
	}

	@Test(priority = 7)
	public void Toverifybfunctionalityofclickingsitedropdown() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+" : To verify the functionality of Clicking site dropdown ","Site Dropdown list Should be Displayed");
		chemop.Chemotherapy.click();
		act.moveToElement(chemop.SitePhase.get(chemop.SitePhase.size()-1)).click().perform();
		chemop.combobox.get(11).click();
		chemop.combobox.get(11).click();
		if(chemop.combobox.get(11).getText().isBlank())
		test.pass( " Site dropdown is blank");
	}
	
	
	int i=0;
	//@Test(priority = 8)
	public void ToverifyfunctionalityofselectingHeadfromthedropdown() throws InterruptedException, IOException {
	 i=0;
		if(chemop.Sites.size() !=0) {
			while(i<chemop.Sites.size()) {
				test = extent.createTest(funTestCaseName()+" : To verify the functionality of selecting "+chemop.Sites.get(i)+" from the Dropdown ",chemop.Sites.get(i)+" Should be selected and Displayed");
		warn.Dropdown2(chemop.combobox.get(11), chemop.Sites.get(i), "site", test,driver,act);
		i++;
			}
		}else
			test.info("No Site are available");
	}
	
	
	
	@Test(priority = 9)
	public void ToverifyfunctionalityofselectingLegfromthedropdown() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+" To verify the functionality phase number  "," no of times phase number selected  should display.");
	
		 demo.textfield(chemop.PhaseNo.get(27), "1", test,driver);
	}


	

	@Test(priority = 10)
	public void Toverifyfunctionalityofclickingclassificationdropdown() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+" : To verify the functionality of clicking classification dropdown ","Classification dropdown list should be Displayed");
		chemop.Classification.click();
		chemop.Classification.click();
		if(chemop.Classification.getText().isBlank())
		test.pass("Classification dropdown is blank");

	}

	@Test(priority = 11)
	public void Sitedrodpown() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+" : To verify the functionality of clicking Site dropdown ","Site dropdown list should be Displayed");
		String SiteText=Roleselection(test, 11);
		System.out.println(SiteText);
		test.info(SiteText);

	}
	
	@Test(priority = 12)
	public void TreatementType() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+" : To verify the functionality of clicking classification dropdown ","Classification dropdown list should be Displayed");
		String Site=Roleselection(test, 9);
		System.out.println(Site);
		test.info(Site);

	}
	
	@Test(priority = 13)
	public void Classifcationtype() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+" : To verify the functionality of clicking classification dropdown ","Classification dropdown list should be Displayed");
		
		String Classification=Roleselection(test, 12);
		System.out.println(Classification);
		test.info(Classification);

	}
	
	
	@Test(priority = 14)
	public void Regimens() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+" : To verify the functionality of clicking Regimens dropdown ","Regimens dropdown list should be Displayed");
		String Regimens=Roleselection(test, 13);
		test.info(Regimens);

	}

	@Test(priority = 15)
	public void DrugForm() throws InterruptedException, IOException {
		test = extent.createTest(funTestCaseName()+" : To verify the functionality of clicking DrugForm dropdown ","DrugForm dropdown list should be Displayed");
		String DrugForm=Roleselection(test, 14);
		test.info(DrugForm);
	}

		@Test(priority = 16)
		public void Radiosentiers() throws InterruptedException, IOException {
			test = extent.createTest(funTestCaseName()+" : To verify the functionality of clicking Rdaiosentiers dropdown ","Rdaiosentiers dropdown list should be Displayed");
			String Radiosentiers=Roleselection(test, 15);
			test.info(Radiosentiers);

		}

		@Test(priority = 17)
		public void Drug1() throws InterruptedException, IOException {
			test = extent.createTest(funTestCaseName()+" : To verify the functionality of clicking Drug dropdown ","Drug dropdown list should be Displayed");
			String Drug=Roleselection(test, 16);
			test.info(Drug);

		}
		@Test(priority = 18)
		public void DrugDose() throws InterruptedException, IOException {
			test = extent.createTest(funTestCaseName()+" : To verify the functionality of clicking DrugDose dropdown ","DrugDose dropdown list should be Displayed");
			String DrugDose=Roleselection(test, 17);
			test.info(DrugDose);
		}
		
@Test(priority = 19)		
public void Patientweightvalidcases() throws IOException
{
	test = extent.createTest(funTestCaseName()+"Patient Weight valid cases");
	Validweight(chemop.PatientWeight,"1",driver,test);
	Validweight(chemop.PatientWeight,"1.1",driver,test);
	Validweight(chemop.PatientWeight,"100",driver,test);
	Validweight(chemop.PatientWeight,"100.1",driver,test);
	Validweight(chemop.PatientWeight,"200",driver,test);
	Validweight(chemop.PatientWeight,"200.1",driver,test);
	Validweight(chemop.PatientWeight,"299",driver,test);
	Validweight(chemop.PatientWeight,"300",driver,test);
}
	

@Test(priority = 20)			
public void PatientweightInvalidcases() throws IOException
{
	test = extent.createTest(funTestCaseName()+"Patient Weight INvalid cases");
	Invalidweight(chemop.PatientWeight,"ABCDEFGHIJKJHDJGD",driver,test);
	Invalidweight(chemop.PatientWeight,")*(*&*^&%%$%@!)((*&&*^",driver,test);
	Invalidweight(chemop.PatientWeight,"0",driver,test);
	Invalidweight(chemop.PatientWeight,"JHHHJG(*&*&^&%^",driver,test);
	Invalidweight(chemop.PatientWeight,".JHJD",driver,test);
	Invaidaccepting(chemop.PatientWeight,"H98","98",driver,test);
	Invaidaccepting(chemop.PatientWeight,"*&^98","98",driver,test);
	Invaidaccepting(chemop.PatientWeight,"10000","100",driver,test);
	Invaidaccepting(chemop.PatientWeight,"999","99",driver,test);
	Invaidaccepting(chemop.PatientWeight,"301","30",driver,test);
}		
		
	

public void PatientHeightvalidcases() throws IOException
{
	test = extent.createTest(funTestCaseName()+"Patient Height valid cases");
	Validweight(chemop.PatientHeight,"1",driver,test);
	Validweight(chemop.PatientHeight,"1.1",driver,test);
	Validweight(chemop.PatientHeight,"100",driver,test);
	Validweight(chemop.PatientHeight,"100.1",driver,test);
	Validweight(chemop.PatientHeight,"200",driver,test);
	Validweight(chemop.PatientHeight,"200.1",driver,test);
	Validweight(chemop.PatientHeight,"299",driver,test);
	Validweight(chemop.PatientHeight,"300",driver,test);
}
	
		
@Test(priority = 21)			
public void PatientHeightInvalidcases() throws IOException
{
	test = extent.createTest(funTestCaseName()+"Patient Height INvalid cases");
	Invalidweight(chemop.PatientHeight,"ABCDEFGHIJKJHDJGD",driver,test);
	Invalidweight(chemop.PatientHeight,")*(*&*^&%%$%@!)((*&&*^",driver,test);
	Invalidweight(chemop.PatientHeight,"0",driver,test);
	Invalidweight(chemop.PatientHeight,"JHHHJG(*&*&^&%^",driver,test);
	Invalidweight(chemop.PatientHeight,".JHJD",driver,test);
	Invaidaccepting(chemop.PatientHeight,"H98","98",driver,test);
	Invaidaccepting(chemop.PatientHeight,"*&^98","98",driver,test);
	Invaidaccepting(chemop.PatientHeight,"10000","100",driver,test);
	Invaidaccepting(chemop.PatientHeight,"999","99",driver,test);
	Invaidaccepting(chemop.PatientHeight,"301","30",driver,test);
}	



	@Test(priority = 22)
public void PatientCyclesvalidcases() throws IOException
{
	test = extent.createTest(funTestCaseName()+"Patient Cycles valid cases");
	Validweight(chemop.Cycles,"1",driver,test);
	Validweight(chemop.Cycles,"11",driver,test);
	Validweight(chemop.Cycles,"21",driver,test);
	Validweight(chemop.Cycles,"50",driver,test);
	Validweight(chemop.Cycles,"99",driver,test);
	Validweight(chemop.Cycles,"19",driver,test);
	Validweight(chemop.Cycles,"48",driver,test);
	Validweight(chemop.Cycles,"60",driver,test);
}
@Test(priority = 23)			
public void PatientCyclesInvalidcases() throws IOException
{
	test = extent.createTest(funTestCaseName()+"Patient Cycles INvalid cases");
	Invalidweight(chemop.Cycles,"ABCDEFGHIJKJHDJGD",driver,test);
	Invalidweight(chemop.Cycles,")*(*&*^&%%$%@!)((*&&*^",driver,test);
	Invalidweight(chemop.Cycles,"0",driver,test);
	Invalidweight(chemop.Cycles,"JHHHJG(*&*&^&%^",driver,test);
	Invalidweight(chemop.Cycles,".JHJD",driver,test);
	Invaidaccepting(chemop.Cycles,"H98","98",driver,test);
	Invaidaccepting(chemop.Cycles,"*&^98","98",driver,test);
	Invaidaccepting(chemop.Cycles,"100","10",driver,test);
	Invaidaccepting(chemop.Cycles,"999","99",driver,test);
	Invaidaccepting(chemop.Cycles,"100000","10",driver,test);
}


@Test(priority = 24)
		public void Patientweight() throws InterruptedException, IOException {
			test = extent.createTest(funTestCaseName()+" : To verify the functionality of clicking Patientweight dropdown ","Patientweight dropdown list should be Displayed");
			String Weight=Roleselection(test, 18);
			test.info(Weight);
		}
	
@Test(priority = 25)
		public void Patientheight() throws InterruptedException, IOException {
			test = extent.createTest(funTestCaseName()+" : To verify the functionality of clicking Patientheight dropdown ","Patientheight dropdown list should be Displayed");
			String Height=Roleselection(test, 19);
			test.info(Height);
		}
		
		



@Test(priority =26)
	public void toverifyfunctionalityofclickingWeeklywithchecked() throws InterruptedException, IOException{

	test = extent.createTest(funTestCaseName()+" :  To verify the functionality of weekly radio button after clicked on it ", "weekly radio button should select");
	chemop.Weeklylbl.click();
	demo.isSelected( chemop.WeeklyRadiobutton, "Weekly Radiobutton", test,driver);
}




@Test(priority =27)
	public void toverifyfunctionalityofclickingmondaycheckboxwithoutchecked() throws InterruptedException, IOException{
	
	test = extent.createTest(funTestCaseName()+" :  To verify the functionality of clicking monday checkbox ", "Monday checkbox should be unselect");
	demo.BydefaultisSelected( chemop.Monday,"Monday", test,driver);
}


@Test(priority =28)
	public void toverifyfunctionalityofclickingmondaycheckboxwithchecked() throws InterruptedException, IOException{
		test = extent.createTest(funTestCaseName()+" :  To verify the functionality of clicking monday checkbox ", "Monday checkbox should be highlighted and selected");
		radioButtonWithselect(chemop.Monday,act);
		demo.isSelected( chemop.Monday, "Monday", test,driver);
}

@Test(priority =29)
	public void toverifyfunctionalityofclickingTuesdaycheckboxwithoutchecked() throws InterruptedException, IOException{
	test = extent.createTest(funTestCaseName()+" : To verify the functionality of clicking Tuesday checkbox ", "Tuesday checkbox should be unselect");
	demo.BydefaultisSelected( chemop.Tuesday, "Tuesday",test, driver);
	
}


@Test(priority =30)
	public void toverifyfunctionalityofclickingTuesdaycheckboxwithchecked() throws InterruptedException, IOException{
		test = extent.createTest(funTestCaseName()+" :  To verify the functionality of clicking Tuesday checkbox ", "Tuesday checkbox should be highlighted and selected");
		radioButtonWithselect(chemop.Tuesday,act);
		demo.isSelected( chemop.Tuesday, "Tuesday", test,driver);
		
}

@Test(priority =31)
	public void toverifyfunctionalityofclickingWednesdaycheckboxwithoutchecked() throws InterruptedException, IOException{
	test = extent.createTest(funTestCaseName()+" :  To verify the functionality of clicking Wednesday checkbox ", "Wednesday checkbox should be unselect");
	demo.BydefaultisSelected( chemop.Wednesday, "Wednesday",test, driver);
	}

@Test(priority =32)
	public void toverifyfunctionalityofclickingWednesdaycheckboxwithchecked() throws InterruptedException, IOException{
		test = extent.createTest(funTestCaseName()+" : To verify the functionality of clicking Wednesday checkbox ", "Wednesday checkbox should be highlighted and selected");
		radioButtonWithselect(chemop.Wednesday,act);
		demo.isSelected( chemop.Wednesday, "Wednesday", test,driver);
}

@Test(priority =33)
	public void toverifyfunctionalityofclickingThursdaycheckboxwithoutchecked() throws InterruptedException, IOException{
	test = extent.createTest(funTestCaseName()+" :  To verify the functionality of clicking Thursday checkbox ", "Thursday checkbox should be unselect");
	demo.BydefaultisSelected( chemop.Thursday, "Thursday",test, driver);
}


@Test(priority =34)
	public void toverifyfunctionalityofclickingThursdaycheckboxwithchecked() throws InterruptedException, IOException{
		test = extent.createTest(funTestCaseName()+" :  To verify the functionality of clicking Thursday checkbox ", "Thursday checkbox should be highlighted and selected");
		radioButtonWithselect(chemop.Thursday,act);
		demo.isSelected( chemop.Thursday, "Thursday", test,driver);
} 

@Test(priority =35)
	public void toverifyfunctionalityofclickingFridaycheckboxwithoutchecked() throws InterruptedException, IOException{
	test = extent.createTest(funTestCaseName()+" : To verify the functionality of clicking Friday checkbox ", "Friday checkbox should be unselect");
	demo.BydefaultisSelected( chemop.Friday,"Friday", test,driver );
}


@Test(priority =36)
	public void toverifyfunctionalityofclickingFridaycheckboxwithchecked() throws InterruptedException, IOException{
		test = extent.createTest(funTestCaseName()+" : To verify the functionality of clicking Friday checkbox ", "Friday checkbox should be highlighted and selected");
		radioButtonWithselect(chemop.Friday,act);
		demo.isSelected( chemop.Friday, "Friday", test,driver);
}

@Test(priority =37)
	public void toverifyfunctionalityofclickingSaturdaycheckboxwithoutchecked() throws InterruptedException, IOException{
	test = extent.createTest(funTestCaseName()+" :  To verify the functionality of clicking Saturday checkbox ", "Saturday checkbox should be unselect");
	demo.BydefaultisSelected( chemop.Saturday,"Saturday", test,driver );
}


@Test(priority =38)
	public void toverifyfunctionalityofclickingSaturdaycheckboxwithchecked() throws InterruptedException, IOException{
		test = extent.createTest(funTestCaseName()+" : To verify the functionality of clicking Saturday checkbox ", "Saturday checkbox should be highlighted and selected");
		radioButtonWithselect(chemop.Saturday,act);
		demo.isSelected( chemop.Saturday, "Saturday", test,driver);
}

@Test(priority =39)
	public void toverifyfunctionalityofclickingSundaycheckboxwithoutchecked() throws InterruptedException, IOException{
	test = extent.createTest(funTestCaseName()+" :  To verify the functionality of clicking Sunday checkbox ", "Sunday checkbox should be unselect");
	demo.BydefaultisSelected( chemop.Sunday, "Sunday",test, driver);
}


@Test(priority =40)
	public void toverifyfunctionalityofclickingSundaycheckboxwithchecked() throws InterruptedException, IOException{
		test = extent.createTest(funTestCaseName()+" :  To verify the functionality of clicking Sunday checkbox ", "Sunday checkbox should be highlighted and selected");
		radioButtonWithselect(chemop.Sunday,act);
		demo.isSelected( chemop.Sunday, "Sunday", test,driver);
}


@Test(priority =41)
	public void toverifyfunctionalityofclickingcustomwithoutchecked() throws InterruptedException, IOException{
	 test = extent.createTest(funTestCaseName()+" :  To verify the functionality of clicking custom checkbox ", "custom checkbox should be unselect");
	demo.BydefaultisSelected( chemop.CustomRadiobutton,"Custom", test, driver);
}


@Test(priority =42)
	public void toverifyfunctionalityofclickingcustomwithchecked() throws InterruptedException, IOException{
	test = extent.createTest(funTestCaseName()+" : To verify the functionality of clicking custom radiobutton ", "custom radiobutton should be highlighted and selected and Weekly should unselect and disable");
	chemop.Customlbl.click();
	demo.isSelected( chemop.CustomRadiobutton, "Custom", test,driver);
	demo.BydefaultisSelected( chemop.WeeklyRadiobutton,"Weekly", test,driver);
	demo.BydefaultisSelected( chemop.Monday,"Monday", test,driver);
	demo.BydefaultisSelected( chemop.Tuesday,"Tuesday", test,driver);
	demo.BydefaultisSelected( chemop.Wednesday,"Wednesday", test,driver);
	demo.BydefaultisSelected( chemop.Thursday,"Thursday", test,driver);
	demo.BydefaultisSelected( chemop.Friday,"Friday", test,driver);
	demo.BydefaultisSelected( chemop.Saturday,"Saturday", test,driver);
	demo.BydefaultisSelected( chemop.Sunday,"Sunday", test,driver);
	
}

@Test(priority =43)	
public void CustomDays() throws IOException
{
	    test = extent.createTest(funTestCaseName()+" : Custom valid days");
	    Validweight(chemop.Every,"1",driver,test);
	    Validweight(chemop.Every,"28",driver,test);
	    Validweight(chemop.Every,"2",driver,test);
	    Validweight(chemop.Every,"27",driver,test);
	    Validweight(chemop.Every,"11",driver,test);
	    Validweight(chemop.Every,"21",driver,test);
}

@Test(priority =44)	
public void CustomInvalidRange() throws IOException
{
	    test = extent.createTest(funTestCaseName()+" : Custom Invalid Range");
	    InvalidEvery(chemop.Every,"0",driver,test);
	    Invaidaccepting(chemop.Every,"00001","000",driver,test);
	    Invaidaccepting(chemop.Every,"289999","289",driver,test);
	    InvalidEvery(chemop.Every,"29",driver,test);
	    Invaidaccepting(chemop.Every,"100000","100",driver,test);
	    InvalidEvery(chemop.Every,"288",driver,test);
}

@Test(priority =45)	
public void CustomInvalidData() throws IOException
{ 
	    test = extent.createTest(funTestCaseName()+" : Custom Invalid Data");
		Invalidweight(chemop.Every,"ABCDEFGHIJKJHDJGD",driver,test);
		Invalidweight(chemop.Every,")*(*&*^&%%$%@!)((*&&*^",driver,test);
		Invalidweight(chemop.Every,"JHHHJG(*&*&^&%^",driver,test);
		Invalidweight(chemop.Every,".JHJD",driver,test);
		Invaidaccepting(chemop.Every,"H98","98",driver,test);
		Invaidaccepting(chemop.Every,"*&^98","98",driver,test);
}

@Test(priority =46)
	public void toverifyfunctionalityofsymptonsTextfieldenteralphabets() throws InterruptedException, IOException{
	
	test = extent.createTest("======SYMPTOMS=======");
	 test = extent.createTest(funTestCaseName()+" : To verify the functionality of Symptom textfield if entered alphabets(abcdy1)", "Symptom textfield should accept entered data");
	 chemop.AddMedications.click();
	 demo.isdisplayed(chemop.Symptom, "Symptom", test, driver);	 
}
@Test(priority =47)
public void SymptomValid() throws IOException
{
	test = extent.createTest(funTestCaseName()+" : Enter Valid Symptomdata data");
	
	ValidSymptonRemarks(chemop.Symptom, "AHGSFDFHFDHD",driver,test);
	ValidSymptonRemarks(chemop.Symptom, "HandPostSurgery",driver,test);
	ValidSymptonRemarks(chemop.Symptom, "Leg_93837736",driver,test);
	ValidSymptonRemarks(chemop.Symptom, "Heart@98736353*&*^^&%%^",driver,test);
	ValidSymptonRemarks(chemop.Symptom, "93939874864",driver,test);
	ValidSymptonRemarks(chemop.Symptom, "!@#$%^&*()_+~}{></",driver,test);
}

@Test(priority =48)
public void SymptomInvalid() throws IOException
{
	test = extent.createTest(funTestCaseName()+" : Enter InValid Symptomdata data");
	
	InvalidSymptonRemarks(chemop.Symptom, "\\,",driver,test);
	demo.textfield(chemop.Symptomwarn, "Input must not contain \\ , \'' , \'", test,driver);
	chemop.Symptom.clear();
	InvalidSymptonRemarks(chemop.Symptom, "JHJD_\\",driver,test);
	demo.textfield(chemop.Symptomwarn, "Input must not contain \\ , \'' , \'", test,driver);
	chemop.Symptom.clear();
	InvalidSymptonRemarks(chemop.Symptom, "837464D_,\\",driver,test);
	demo.textfield(chemop.Symptomwarn, "Input must not contain \\ , \'' , \'", test,driver);
	chemop.Symptom.clear();
	InvalidSymptonRemarks(chemop.Symptom, "   ",driver,test);
	demo.textfield(chemop.Symptomwarn, "Input cannot be blank", test,driver);
	chemop.Symptom.clear();
	
}

@Test(priority =49)
public void Drug() throws IOException, InterruptedException
{
	
	test = extent.createTest(funTestCaseName()+" : Enter Drug");
	String DrugDose=Roleselection(test, 21);
	test.info(DrugDose);
}


@Test(priority =50)
public void RemarksValid() throws IOException
{
	test = extent.createTest("======REMARKS=======");
	test = extent.createTest(funTestCaseName()+" : Enter Valid Remarks data");
	ValidSymptonRemarks(chemop.Remarks, "AHGSFDFHFDHD",driver,test);
	ValidSymptonRemarks(chemop.Remarks, "HandPostSurgery",driver,test);
	ValidSymptonRemarks(chemop.Remarks, "Leg_93837736",driver,test);
	ValidSymptonRemarks(chemop.Remarks, "Heart@98736353*&*^^&%%^",driver,test);
	ValidSymptonRemarks(chemop.Remarks, "93939874864",driver,test);
	ValidSymptonRemarks(chemop.Remarks, "!@#$%^&*()_+~}{></",driver,test);
	ValidSymptonRemarks(chemop.Remarks, "General Medications added valid data poiuytrewq plkjdhdgdfd hdgvxgdfd",driver,test);
}

@Test(priority =51)
public void RemarksInvalid() throws IOException
{
	test = extent.createTest(funTestCaseName()+" : Enter InValid Remarks data");
	
	InvalidSymptonRemarks(chemop.Remarks, "\\,",driver,test);
	demo.textfield(chemop.Symptomwarn, "Input must not contain \\ , \'' , \'", test,driver);
	chemop.Remarks.clear();
	InvalidSymptonRemarks(chemop.Remarks, "JHJD_\\",driver,test);
	demo.textfield(chemop.Symptomwarn, "Input must not contain \\ , \'' , \'", test,driver);
	chemop.Remarks.clear();
	InvalidSymptonRemarks(chemop.Remarks, "837464D_,\\",driver,test);
	demo.textfield(chemop.Symptomwarn, "Input must not contain \\ , \'' , \'", test,driver);
	chemop.Remarks.clear();
	InvalidSymptonRemarks(chemop.Remarks, "   ",driver,test);
	demo.textfield(chemop.Symptomwarn, "Input cannot be blank", test,driver);
	chemop.Remarks.clear();
}
	String DrugDose11;
@Test(priority =52)
public void AddMedications() throws IOException, InterruptedException
{
	test = extent.createTest("======INSERT AND CLOSE MEDICATIONS=======");
	test = extent.createTest(funTestCaseName()+" : Add Medications and Click on the Insert");
	chemop.AddMedications.click();
	InvalidSymptonRemarks(chemop.Symptom, "Hand",driver,test);
	DrugDose11=Roleselection(test, 21);
	InvalidSymptonRemarks(chemop.Remarks, "General Medications added valid",driver,test);
	demo.isEnabled(chemop.Insert, "INSERT", test, driver);
	demo.isEnabled(chemop.Close, "CLOSE", test, driver);
	chemop.Insert.click();
	chemop.Close.click();
	Thread.sleep(2000);
	datagrid(0,"Hand",DrugDose11,"General Medications added valid",test,driver);
}



String DrugDose21;
@Test(priority =53)
public void AddmedicationwithoutRamrks() throws IOException, InterruptedException
{
	test = extent.createTest(funTestCaseName()+" : Add Medications with no remraks and Click on the Insert");
	chemop.AddMedications.click();
	InvalidSymptonRemarks(chemop.Symptom, "Leg_928363",driver,test);
	DrugDose21=Roleselection(test, 21);
	demo.isEnabled(chemop.Insert, "INSERT", test, driver);
	demo.isEnabled(chemop.Close, "CLOSE", test, driver);
	chemop.Insert.click();
	demo.BydefaultisEnabled(chemop.Insert, "INSERT", test, driver);
	chemop.Close.click();
	datagrid(0,"Hand",DrugDose11,"General Medications added valid",test,driver);
	datagrid(1,"Leg_928363",DrugDose21,"",test,driver);
}
String DrugDose31;
private String DrugDose51;
@Test(priority =54)
public void Symptosdataexits() throws IOException, InterruptedException
{
	test = extent.createTest(funTestCaseName()+" : Add Medications Symptoms Exits");
	chemop.AddMedications.click();
	InvalidSymptonRemarks(chemop.Symptom, "Leg_928363",driver,test);
	DrugDose31=Roleselection(test, 21);
	demo.isEnabled(chemop.Insert, "INSERT", test, driver);
	demo.isEnabled(chemop.Close, "CLOSE", test, driver);
	chemop.Insert.click();
	WebElement Symptoms=driver.findElement(By.name("Symptoms already exists"));
	demo.Textcomparsion(Symptoms, "Symptoms already exists", test, driver);
	chemop.Close.click();
}


@Test(priority =55)
public void deletesymptom() throws IOException, InterruptedException
{
	test = extent.createTest("======DELETE MEDICATIONS=======");
	test = extent.createTest(funTestCaseName()+" : Delete Symptom cancel");
	datadelete(0,test,driver);
	SitesaveCancel1("General/Additional Medication Delete", "Do you want to delete the selected General Medication Constraints?", "General/Additional Medication Delete", "Do you want to delete the selected General Medication Constraints?", 0, driver,test);
	datagrid(0,"Hand",DrugDose11,"General Medications added valid",test,driver);
}

@Test(priority =56)
public void delete() throws IOException, InterruptedException
{
	test = extent.createTest(funTestCaseName()+" : Delte Symptom OK");
	datadelete(0,test,driver);
	Sitesave1("General/Additional Medication Delete", "Do you want to delete the selected General Medication Constraints?", "General/Additional Medication Delete", "Do you want to delete the selected General Medication Constraints?", 0, driver,test);
	try
	{
		Sitesave1("General/Additional Medication Delete", "Selected General Medications Constraints deleted.", "General/Additional Medication Delete", "Selected General Medications Constraints deleted.", 0, driver,test);
	}
	catch(Exception e)
	{
		test.info("No pop-up is displayed");
	}
	
	datagrid(0,"Leg_928363",DrugDose21,"",test,driver);
	
}

@Test(priority =57)
public void deleteddataadded() throws IOException, InterruptedException
{
	test = extent.createTest(funTestCaseName()+" : Deleted data enetred once gain Enter");
	chemop.AddMedications.click();
	InvalidSymptonRemarks(chemop.Symptom, "Hand",driver,test);
	DrugDose51=Roleselection(test, 21);
	InvalidSymptonRemarks(chemop.Remarks, "General Medications",driver,test);
	demo.isEnabled(chemop.Insert, "INSERT", test, driver);
	demo.isEnabled(chemop.Close, "CLOSE", test, driver);
	chemop.Insert.click();
	demo.BydefaultisEnabled(chemop.Insert, "INSERT", test, driver);
	chemop.Close.click();
	datagrid(1,"Hand",DrugDose51,"General Medications",test,driver);
	datadelete(1,test,driver);
	Sitesave1("General/Additional Medication Delete", "Do you want to delete the selected General Medication Constraints?", "General/Additional Medication Delete", "Do you want to delete the selected General Medication Constraints?", 0, driver,test);
	try
	{
		Sitesave1("General/Additional Medication Delete", "Selected General Medications Constraints deleted.", "General/Additional Medication Delete", "Selected General Medications Constraints deleted.", 0, driver,test);
	}
	catch(Exception e)
	{
		test.info("No pop-up is displayed");
	}
	Thread.sleep(1000);
	datadelete(0,test,driver);
	Sitesave1("General/Additional Medication Delete", "Do you want to delete the selected General Medication Constraints?", "General/Additional Medication Delete", "Do you want to delete the selected General Medication Constraints?", 0, driver,test);
	Thread.sleep(1000);
}

@Test(priority =58)
public void PostSurgery() throws IOException, InterruptedException
{
	act.moveToElement(chemop.Save).click().perform();
	test = extent.createTest("===========POST SURGERY=========");
	test = extent.createTest(funTestCaseName()+" : Click on the Postsurgery, Save the data");
	warn.Dropdown1(chemop.TreatmentType, chemop.TreatmentTypes, 0, "chemop.TreatmentType", test,driver,act);
	SiteText1=Roleselection(test, 11);
	Classification1=Roleselection(test, 12);
	Regimens1=Roleselection(test, 13);
	DrugForm1=Roleselection(test, 14);
	Drug1=Roleselection(test, 16);
	DrugDose1a=Roleselection(test, 17);
	Validweight1(chemop.PatientWeight,"78",driver,test);
	Weight1=Roleselection(test, 18);
	Validweight1(chemop.PatientHeight,"16",driver,test);
	Height1=Roleselection(test, 19);
	Validweight1(chemop.Cycles,"5",driver,test);
	chemop.Weeklylbl.click();
	radioButtonWithselect(chemop.Monday,act);
	radioButtonWithselect(chemop.Sunday,act);
	chemop.AddMedications.click();
	Validweight1(chemop.Symptom, "Hand_9373",driver,test);
	Validweight1(chemop.Remarks, "Medications_Used hjhgdjgd",driver,test);
	DrugDose1=Roleselection(test, 21);
	chemop.Insert.click();
	chemop.Close.click();
	Thread.sleep(1000);
	datagrid(0,"Hand_9373",DrugDose1,"Medications_Used hjhgdjgd",test,driver);
	Thread.sleep(1000);
	act.moveToElement(chemop.Save).click().perform();
	Sitesave1("Chemotherapy Prescription Save", "Chemotherapy Prescription data saved for selected site and phase.", "Chemotherapy Prescription Save", "Chemotherapy Prescription data saved for selected site and phase.", 0, driver,test);
}

@Test(priority =59)
public void SaveDataeditforpost() throws IOException, InterruptedException
{
	Thread.sleep(1000);
	test = extent.createTest(funTestCaseName()+" : Click on the Postsurgery Save, Edit button should be enable");
	demo.isEnabled(chemop.Edit, "EDIT",test, driver);
	test = extent.createTest(funTestCaseName()+" : Click on the Postsurgery Edit,Update button should be displayed");
	Thread.sleep(2000);
	act.moveToElement(chemop.Edit).click().perform();
	demo.isEnabled(chemop.Update, "UPDATE",test, driver);
	Thread.sleep(1000);
	test = extent.createTest(funTestCaseName()+" : Click on the Postsurgery Edit,Without modify click on the Update");
	Editcomparison(11, SiteText1,test,driver);
	Editcomparison(12, Classification1,test,driver);
	Editcomparison(13, Regimens1,test,driver);
	Editcomparison(14, DrugForm1,test,driver);
	Editcomparison(16, Drug1,test,driver);
	Editcomparison(17, DrugDose1a,test,driver);
	EditText(chemop.PatientWeight, "78",test,driver);
	EditText(chemop.PatientHeight, "16",test,driver);
	Editcomparison(18, Weight1,test,driver);
	Editcomparison(19, Height1,test,driver);
	EditText(chemop.Cycles, "5",test,driver);
	demo.isEnabled(chemop.Weeklylbl, "Weekly",test, driver);
	demo.isSelected(chemop.Monday, "Monday",test, driver);
	demo.isSelected(chemop.Sunday, "Sunday",test, driver);
	
	datagrid(0,"Hand_9373",DrugDose1,"Medications_Used hjhgdjgd",test,driver);
	Thread.sleep(1000);
	act.moveToElement(chemop.Update).click().perform();
	Sitesave1("ChemoPrescription Update","ChemoPrescription data updated for selected site and phase.", "ChemoPrescription Update","ChemoPrescription data updated for selected site and phase.", 0, driver,test);
	test = extent.createTest(funTestCaseName()+" : Chemotheraphy saved Postsurgery, Scheudling button should be enabled");
}

@Test(priority =60)
public void PostSurgeryEdit() throws IOException, InterruptedException
{
	test = extent.createTest("===========POST EDIT AND MODIFY=========");
	test = extent.createTest(funTestCaseName()+" : Post Surgey Edit and Update the data");
	act.moveToElement(chemop.Edit).click().perform();
	
	Classification10=Roleselection(test, 12);
	Regimens10=Roleselection(test, 13);
	DrugForm10=Roleselection(test, 14);
	Drug10=Roleselection(test, 16);
	DrugDose101=Roleselection(test, 17);
	chemop.PatientWeight.clear();
	Validweight1(chemop.PatientWeight,"56",driver,test);
	Weight10=Roleselection(test, 18);
	chemop.PatientHeight.clear();
	Validweight1(chemop.PatientHeight,"67",driver,test);
	Height10=Roleselection(test, 19);
	chemop.Cycles.clear();
	Validweight1(chemop.Cycles,"15",driver,test);
	Thread.sleep(1000);
	chemop.Monday.click();
	chemop.Sunday.click();
	radioButtonWithselect(chemop.Monday,act);
	radioButtonWithselect(chemop.Friday,act);
	Thread.sleep(1000);
	chemop.AddMedications.click();
	Validweight1(chemop.Symptom, "KDHJHGD",driver,test);
	Validweight1(chemop.Remarks, "JHFHJFGJSGHGD",driver,test);
	DrugDose10=Roleselection(test, 21);
	chemop.Insert.click();
	chemop.Close.click();
	Thread.sleep(1000);
	chemop.AddMedications.click();
	Validweight1(chemop.Symptom, "LJDHJFHF",driver,test);
	Validweight1(chemop.Remarks, "KKKF_^&^%^&%67",driver,test);
	DrugDose100=Roleselection(test, 21);
	chemop.Insert.click();
	chemop.Close.click();
	Thread.sleep(1000);
	datagrid(1,"KDHJHGD",DrugDose10,"JHFHJFGJSGHGD",test,driver);
	datagrid(2,"LJDHJFHF",DrugDose100,"KKKF_^&^%^&%67",test,driver);
	Thread.sleep(1000);
	act.moveToElement(chemop.Update).click().perform();
	Sitesave1("ChemoPrescription Update","ChemoPrescription data updated for selected site and phase.", "ChemoPrescription Update","ChemoPrescription data updated for selected site and phase.", 0, driver,test);
}

@Test(priority =61)
public void Editcomprasionpost() throws IOException, InterruptedException
{
	test = extent.createTest(funTestCaseName()+" : Click on the Postsurgery Edit,Update button should be displayed");
	Thread.sleep(2000);
	act.moveToElement(chemop.Edit).click().perform();
	demo.isEnabled(chemop.Update, "UPDATE",test, driver);
	Thread.sleep(1000);
	test = extent.createTest(funTestCaseName()+" : Click on the Postsurgery Edit,Without modify click on the Update");
	Editcomparison(11, SiteText1,test,driver);
	Editcomparison(12, Classification10,test,driver);
	Editcomparison(13, Regimens10,test,driver);
	Editcomparison(14, DrugForm10,test,driver);
	Editcomparison(16, Drug10,test,driver);
	Editcomparison(17, DrugDose101,test,driver);
	EditText(chemop.PatientWeight, "56",test,driver);
	EditText(chemop.PatientHeight, "67",test,driver);
	Editcomparison(18, Weight10,test,driver);
	Editcomparison(19, Height10,test,driver);
	EditText(chemop.Cycles, "15",test,driver);
	demo.isSelected(chemop.Monday, "Monday",test, driver);
	demo.isSelected(chemop.Friday, "Friday",test, driver);
	datagrid(1,"KDHJHGD",DrugDose10,"JHFHJFGJSGHGD",test,driver);
	datagrid(2,"LJDHJFHF",DrugDose100,"KKKF_^&^%^&%67",test,driver);
	Thread.sleep(1000);
	act.moveToElement(chemop.Update).click().perform();
	Sitesave1("ChemoPrescription Update","ChemoPrescription data updated for selected site and phase.", "ChemoPrescription Update","ChemoPrescription data updated for selected site and phase.", 0, driver,test);
	test = extent.createTest(funTestCaseName()+" : Chemotheraphy saved Postsurgery, Scheudling button should be enabled");
	demo.isEnabled(chemop.Scheudling, "Scheudling", test, driver);
}

@Test(priority =62)
public void Presurgery() throws IOException, InterruptedException

{
	test = extent.createTest("===========PRE SURGERY=========");
	test = extent.createTest(funTestCaseName()+" : Click on the Presurgery and Save the data");
	act.moveToElement(chemop.SitePhase.get(chemop.SitePhase.size()-1)).click().perform();
	warn.Dropdown1(chemop.TreatmentType, chemop.TreatmentTypes, 1, "chemop.TreatmentType", test,driver,act);
	SiteText2=Roleselection(test, 11);
	Classification2=Roleselection(test, 12);
	Regimens2=Roleselection(test, 13);
	DrugForm2=Roleselection(test, 14);
	Drug2=Roleselection(test, 16);
	DrugDose201=Roleselection(test, 17);
	Validweight1(chemop.PatientWeight,"78",driver,test);
	Weight2=Roleselection(test, 18);
	Validweight1(chemop.PatientHeight,"16",driver,test);
	Height2=Roleselection(test, 19);
	Validweight1(chemop.Cycles,"5",driver,test);
	chemop.Weeklylbl.click();
	radioButtonWithselect(chemop.Monday,act);
	radioButtonWithselect(chemop.Sunday,act);
	chemop.AddMedications.click();
	Validweight1(chemop.Symptom, "Hand_9373",driver,test);
	Validweight1(chemop.Remarks, "Medications_Used hjhgdjgd",driver,test);
	DrugDose2=Roleselection(test, 21);
	chemop.Insert.click();
	chemop.Close.click();
	Thread.sleep(1000);
	datagrid(0,"Hand_9373",DrugDose2,"Medications_Used hjhgdjgd",test,driver);
	Thread.sleep(1000);
	act.moveToElement(chemop.Save).click().perform();
	Sitesave1("Chemotherapy Prescription Save", "Chemotherapy Prescription data saved for selected site and phase.", "Chemotherapy Prescription Save", "Chemotherapy Prescription data saved for selected site and phase.", 0, driver,test);
}

@Test(priority =63)
public void SaveDataeditforpre() throws IOException, InterruptedException
{
	Thread.sleep(1000);
	test = extent.createTest(funTestCaseName()+" : Click on the Presurgery Save, Edit button should be enable");
	demo.isEnabled(chemop.Edit, "EDIT",test, driver);
	test = extent.createTest(funTestCaseName()+" : Click on the Presurgery Edit,Update button should be displayed");
	Thread.sleep(2000);
	act.moveToElement(chemop.Edit).click().perform();
	Thread.sleep(2000);
	demo.isEnabled(chemop.Update, "UPDATE",test, driver);
	Thread.sleep(1000);
	test = extent.createTest(funTestCaseName()+" : Click on the Presurgery Edit,Without modify click on the Update");
	Editcomparison(11, SiteText2,test,driver);
	Editcomparison(12, Classification2,test,driver);
	Editcomparison(13, Regimens2,test,driver);
	Editcomparison(14, DrugForm2,test,driver);
	Editcomparison(16, Drug2,test,driver);
	Editcomparison(17, DrugDose201,test,driver);
	EditText(chemop.PatientWeight, "78",test,driver);
	EditText(chemop.PatientHeight, "16",test,driver);
	Editcomparison(18, Weight2,test,driver);
	Editcomparison(19, Height2,test,driver);
	EditText(chemop.Cycles, "5",test,driver);
	demo.isSelected(chemop.Monday, "Monday",test, driver);
	demo.isSelected(chemop.Sunday, "Sunday",test, driver);
	datagrid(0,"Hand_9373",DrugDose2,"Medications_Used hjhgdjgd",test,driver);
	Thread.sleep(1000);
	act.moveToElement(chemop.Update).click().perform();
	Sitesave1("ChemoPrescription Update","ChemoPrescription data updated for selected site and phase.", "ChemoPrescription Update","ChemoPrescription data updated for selected site and phase.", 0, driver,test);

}



@Test(priority =68)
public void PresurgeryEdit() throws IOException, InterruptedException

{ test = extent.createTest("===========PRE SURGERY EDIT AND MODIFY=========");
	test = extent.createTest(funTestCaseName()+" : Click on the Presurgery, Edit the data");
	act.moveToElement(chemop.Edit).click().perform();
	Thread.sleep(2000);
	Classification21=Roleselection(test, 12);
	Regimens21=Roleselection(test, 13);
	DrugForm21=Roleselection(test, 14);
	Drug21=Roleselection(test, 16);
	DrugDose221=Roleselection(test, 17); 
	chemop.PatientWeight.clear();
	Validweight1(chemop.PatientWeight,"10",driver,test);
	Weight21=Roleselection(test, 18);
	chemop.PatientHeight.clear();
	Validweight1(chemop.PatientHeight,"5",driver,test);
	Height21=Roleselection(test, 19);
	chemop.Cycles.clear();
	Validweight1(chemop.Cycles,"99",driver,test);
	chemop.Customlbl.click();
	Validweight1(chemop.Every,"28",driver,test);
	datadelete(0,test,driver);
	Sitesave1("General/Additional Medication Delete", "Do you want to delete the selected General Medication Constraints?", "General/Additional Medication Delete", "Do you want to delete the selected General Medication Constraints?", 0, driver,test);
	try
	{
		Sitesave1("General/Additional Medication Delete", "Selected General Medications Constraints deleted.", "General/Additional Medication Delete", "Selected General Medications Constraints deleted.", 0, driver,test);
	}
	catch(Exception e)
	{
		test.info("No pop-up is displayed");
	}
	
	chemop.AddMedications.click();
	Validweight1(chemop.Symptom, "01_LEG_kjkdjhkd_&*&*&^",driver,test);
	Validweight1(chemop.Remarks, "02_hjhd_iyieu_yeiu8736",driver,test);
	DrugDose210=Roleselection(test, 21);
	chemop.Insert.click();
	chemop.Close.click();
	Thread.sleep(1000);
	datagrid(0,"01_LEG_kjkdjhkd_&*&*&^",DrugDose210,"02_hjhd_iyieu_yeiu8736",test,driver);
	Thread.sleep(1000);
	act.moveToElement(chemop.Update).click().perform();
	Sitesave1("ChemoPrescription Update","ChemoPrescription data updated for selected site and phase.", "ChemoPrescription Update","ChemoPrescription data updated for selected site and phase.", 0, driver,test);
	Thread.sleep(1000);
}

@Test(priority =70)
public void PreEditComparsion() throws IOException, InterruptedException
{
	
	test = extent.createTest(funTestCaseName()+" : Click on the Presurgery Edit,Update button should be displayed");
	Thread.sleep(2000);
	act.moveToElement(chemop.Edit).click().perform();
	Thread.sleep(2000);
	demo.isEnabled(chemop.Update, "UPDATE",test, driver);
	Thread.sleep(1000);
	test = extent.createTest(funTestCaseName()+" : Click on the Presurgery Edit,Without modify click on the Update");
	Editcomparison(11, SiteText2,test,driver);
	Editcomparison(12, Classification21,test,driver);
	Editcomparison(13, Regimens21,test,driver);
	Editcomparison(14, DrugForm21,test,driver);
	Editcomparison(16, Drug21,test,driver);
	Editcomparison(17, DrugDose221,test,driver);
	EditText(chemop.PatientWeight, "10",test,driver);
	EditText(chemop.PatientHeight, "5",test,driver);
	Editcomparison(18, Weight21,test,driver);
	Editcomparison(19, Height21,test,driver);
	EditText(chemop.Cycles, "99",test,driver);
	demo.isEnabled(chemop.Every, "Every",test, driver);
	EditText(chemop.Every, "28",test,driver);
	datagrid(0,"01_LEG_kjkdjhkd_&*&*&^",DrugDose210,"02_hjhd_iyieu_yeiu8736",test,driver);
	Thread.sleep(1000);
	chemop.Customlbl.click();
	act.moveToElement(chemop.Update).click().perform();
	Sitesave1("ChemoPrescription Update","ChemoPrescription data updated for selected site and phase.", "ChemoPrescription Update","ChemoPrescription data updated for selected site and phase.", 0, driver,test);
	test = extent.createTest(funTestCaseName()+" : Chemotheraphy saved Postsurgery, Scheudling button should be enabled");
	demo.isEnabled(chemop.Scheudling, "Scheudling", test, driver);
}



@Test(priority =72)
public void PostRadiation() throws IOException, InterruptedException

{
	test = extent.createTest("===========POST RADATION=========");
	test = extent.createTest(funTestCaseName()+" : Click on the PostRadiation, Select the data");
	act.moveToElement(chemop.SitePhase.get(chemop.SitePhase.size()-1)).click().perform();
	warn.Dropdown1(chemop.TreatmentType, chemop.TreatmentTypes, 2, "chemop.TreatmentType", test,driver,act);
	SiteText3=Roleselection(test, 11);
	Classification3=Roleselection(test, 12);
	Regimens3=Roleselection(test, 13);
	DrugForm3=Roleselection(test, 14);
	Drug3=Roleselection(test, 16);
	DrugDose333=Roleselection(test, 17);
	Validweight1(chemop.PatientWeight,"56",driver,test);
	Weight3=Roleselection(test, 18);
	Validweight1(chemop.PatientHeight,"98",driver,test);
	Height3=Roleselection(test, 19);
	Validweight1(chemop.Cycles,"15",driver,test);
	chemop.Weeklylbl.click();
	radioButtonWithselect(chemop.Tuesday,act);
	radioButtonWithselect(chemop.Saturday,act);
	chemop.AddMedications.click();
	Validweight1(chemop.Symptom, "Demo symptoms",driver,test);
	Validweight1(chemop.Remarks, "POEUE UEUYEIE",driver,test);
	DrugDose3=Roleselection(test, 21);
	chemop.Insert.click();
	chemop.Close.click();
	Thread.sleep(1000);
	datagrid(0,"Demo symptoms",DrugDose3,"POEUE UEUYEIE",test,driver);
	Thread.sleep(1000);
	act.moveToElement(chemop.Save).click().perform();
	Sitesave1("Chemotherapy Prescription Save", "Chemotherapy Prescription data saved for selected site and phase.", "Chemotherapy Prescription Save", "Chemotherapy Prescription data saved for selected site and phase.", 0, driver,test);
}

@Test(priority =74)
public void SaveDataeditPostRadation() throws IOException, InterruptedException
{
	Thread.sleep(1000);
	test = extent.createTest(funTestCaseName()+" : Click on the Save, Edit button should be enable");
	demo.isEnabled(chemop.Edit, "EDIT",test, driver);
	test = extent.createTest(funTestCaseName()+" : Click on the Edit,Update button should be displayed");
	Thread.sleep(2000);
	act.moveToElement(chemop.Edit).click().perform();
	Thread.sleep(2000);
	demo.isEnabled(chemop.Update, "UPDATE",test, driver);
	Thread.sleep(1000);
	test = extent.createTest(funTestCaseName()+" : Click on the Edit,Without modify click on the Update");
	Editcomparison(11, SiteText3,test,driver);
	Editcomparison(12, Classification3,test,driver);
	Editcomparison(13, Regimens3,test,driver);
	Editcomparison(14, DrugForm3,test,driver);
	Editcomparison(16, Drug3,test,driver);
	Editcomparison(17, DrugDose333,test,driver);
	EditText(chemop.PatientWeight, "56",test,driver);
	EditText(chemop.PatientHeight, "98",test,driver);
	Editcomparison(18, Weight3,test,driver);
	Editcomparison(19, Height3,test,driver);
	EditText(chemop.Cycles, "15",test,driver);
	demo.isSelected(chemop.Tuesday, "Tuesday",test, driver);
	demo.isSelected(chemop.Saturday, "Saturday",test, driver);
	datagrid(0,"Demo symptoms",DrugDose3,"POEUE UEUYEIE",test,driver);
	Thread.sleep(1000);
	act.moveToElement(chemop.Update).click().perform();
	Sitesave1("ChemoPrescription Update","ChemoPrescription data updated for selected site and phase.", "ChemoPrescription Update","ChemoPrescription data updated for selected site and phase.", 0, driver,test);
	test = extent.createTest(funTestCaseName()+" : Chemotheraphy saved Postsurgery, Scheudling button should be enabled");
	demo.isEnabled(chemop.Scheudling, "Scheudling", test, driver);
}



@Test(priority =76)
public void PostRadiationEdit() throws IOException, InterruptedException

{
	test = extent.createTest("===========POST RADATION EDIT AND UPDATE=========");
	test = extent.createTest(funTestCaseName()+" : Click on the PostRadiation, Edit and Update the data");
	act.moveToElement(chemop.Edit).click().perform();
	Thread.sleep(2000);
	Classification31=Roleselection(test, 12);
	Regimens31=Roleselection(test, 13);
	DrugForm31=Roleselection(test, 14);
	Drug31=Roleselection(test, 16);
	DrugDose331=Roleselection(test, 17);
	chemop.PatientWeight.clear();
	Validweight1(chemop.PatientWeight,"56",driver,test);
	Weight31=Roleselection(test, 18);
	chemop.PatientHeight.clear();
	Validweight1(chemop.PatientHeight,"98",driver,test);
	Height31=Roleselection(test, 19);
	chemop.Cycles.clear();
	Validweight1(chemop.Cycles,"15",driver,test);
	chemop.Weeklylbl.click();
	chemop.Tuesday.click();
	chemop.Saturday.click();
	radioButtonWithselect(chemop.Wednesday,act);
	radioButtonWithselect(chemop.Saturday,act);
	radioButtonWithselect(chemop.Sunday,act);
	datadelete(0,test,driver);
	Sitesave1("General/Additional Medication Delete", "Do you want to delete the selected General Medication Constraints?", "General/Additional Medication Delete", "Do you want to delete the selected General Medication Constraints?", 0, driver,test);
	try
	{
		Sitesave1("General/Additional Medication Delete", "Selected General Medications Constraints deleted.", "General/Additional Medication Delete", "Selected General Medications Constraints deleted.", 0, driver,test);
	}
	catch(Exception e)
	{
		test.info("No pop-up is displayed");
	}
	
	Thread.sleep(1000);
	act.moveToElement(chemop.Update).click().perform();
	Sitesave1("ChemoPrescription Update","ChemoPrescription data updated for selected site and phase.", "ChemoPrescription Update","ChemoPrescription data updated for selected site and phase.", 0, driver,test);
	Thread.sleep(1000);
}

@Test(priority =78)
public void EditPostRadationCompasrion() throws IOException, InterruptedException
{
	Thread.sleep(1000);
	test = extent.createTest(funTestCaseName()+" : Click on the PostRadiation Save, Edit button should be enable");
	demo.isEnabled(chemop.Edit, "EDIT",test, driver);
	test = extent.createTest(funTestCaseName()+" : Click on the PostRadiation Edit,Update button should be displayed");
	Thread.sleep(2000);
	act.moveToElement(chemop.Edit).click().perform();
	Thread.sleep(2000);
	demo.isEnabled(chemop.Update, "UPDATE",test, driver);
	Thread.sleep(1000);
	test = extent.createTest(funTestCaseName()+" : Click on the PostRadiation Edit,Without modify click on the Update");
	Editcomparison(11, SiteText3,test,driver);
	Editcomparison(12, Classification31,test,driver);
	Editcomparison(13, Regimens31,test,driver);
	Editcomparison(14, DrugForm31,test,driver);
	Editcomparison(16, Drug31,test,driver);
	Editcomparison(17, DrugDose331,test,driver);
	EditText(chemop.PatientWeight, "56",test,driver);
	EditText(chemop.PatientHeight, "98",test,driver);
	Editcomparison(18, Weight31,test,driver);
	Editcomparison(19, Height31,test,driver);
	EditText(chemop.Cycles, "15",test,driver);
	demo.BydefaultisSelected(chemop.Tuesday, "Tuesday",test, driver);
	demo.isSelected(chemop.Saturday, "Saturday",test, driver);
	demo.isSelected(chemop.Wednesday, "Wednesday",test, driver);
	demo.isSelected(chemop.Sunday, "Sunday",test, driver);
	Thread.sleep(1000);
	act.moveToElement(chemop.Update).click().perform();
	Sitesave1("ChemoPrescription Update","ChemoPrescription data updated for selected site and phase.", "ChemoPrescription Update","ChemoPrescription data updated for selected site and phase.", 0, driver,test);
	test = extent.createTest(funTestCaseName()+" : Chemotheraphy saved Postsurgery, Scheudling button should be enabled");
	demo.isEnabled(chemop.Scheudling, "Scheudling", test, driver);
}


@Test(priority =80)
public void PreRadiation() throws IOException, InterruptedException

{
	test = extent.createTest("===========PRE RADATION=========");
	test = extent.createTest(funTestCaseName()+" : Click on the PreRadiation, Select the Tuesday,Saturday");
	act.moveToElement(chemop.SitePhase.get(chemop.SitePhase.size()-1)).click().perform();
	warn.Dropdown1(chemop.TreatmentType, chemop.TreatmentTypes, 3, "chemop.TreatmentType", test,driver,act);
	SiteText4=Roleselection(test, 11);
	Classification4=Roleselection(test, 12);
	Regimens4=Roleselection(test, 13);
	DrugForm4=Roleselection(test, 14);
	Drug4=Roleselection(test, 16);
	DrugDose444=Roleselection(test, 17);
	Validweight1(chemop.PatientWeight,"66",driver,test);
	Weight4=Roleselection(test, 18);
	Validweight1(chemop.PatientHeight,"66",driver,test);
	Height4=Roleselection(test, 19);
	Validweight1(chemop.Cycles,"99",driver,test);
	chemop.Weeklylbl.click();
	radioButtonWithselect(chemop.Wednesday,act);
	radioButtonWithselect(chemop.Thursday,act);
	chemop.AddMedications.click();
	Validweight1(chemop.Symptom, "oeioroirhjh*&*^h",driver,test);
	Validweight1(chemop.Remarks, "ldkd878648gjgkljhgkjhgkhgglgjuie",driver,test);
	DrugDose4=Roleselection(test, 21);
	chemop.Insert.click();
	chemop.Close.click();
	Thread.sleep(1000);
	datagrid(0,"oeioroirhjh*&*^h",DrugDose4,"ldkd878648gjgkljhgkjhgkhgglgjuie",test,driver);
	Thread.sleep(1000);
	act.moveToElement(chemop.Save).click().perform();
	Sitesave1("Chemotherapy Prescription Save", "Chemotherapy Prescription data saved for selected site and phase.", "Chemotherapy Prescription Save", "Chemotherapy Prescription data saved for selected site and phase.", 0, driver,test);
	test = extent.createTest(funTestCaseName()+" : Chemotheraphy saved Preradation, Scheudling button should be enabled");
	demo.isEnabled(chemop.Scheudling, "Scheudling", test, driver);
}

@Test(priority =81)
public void SaveDataeditPreRadiation() throws IOException, InterruptedException
{
	Thread.sleep(1000);
	test = extent.createTest(funTestCaseName()+" : Click on the PreRadiation Save, Edit button should be enable");
	demo.isEnabled(chemop.Edit, "EDIT",test, driver);
	test = extent.createTest(funTestCaseName()+" : Click on the PreRadiation Edit,Update button should be displayed");
	Thread.sleep(2000);
	act.moveToElement(chemop.Edit).click().perform();
	Thread.sleep(2000);
	demo.isEnabled(chemop.Update, "UPDATE",test, driver);
	Thread.sleep(1000);
	test = extent.createTest(funTestCaseName()+" : Click on the PreRadiation Edit,Without modify click on the Update");
	Editcomparison(11, SiteText4,test,driver);
	Editcomparison(12, Classification4,test,driver);
	Editcomparison(13, Regimens4,test,driver);
	Editcomparison(14, DrugForm4,test,driver);
	Editcomparison(16, Drug4,test,driver);
	Editcomparison(17, DrugDose444,test,driver);
	EditText(chemop.PatientWeight, "66",test,driver);
	EditText(chemop.PatientHeight, "66",test,driver);
	Editcomparison(18, Weight4,test,driver);
	Editcomparison(19, Height4,test,driver);
	EditText(chemop.Cycles, "99",test,driver);
	demo.isEnabled(chemop.Weeklylbl, "Weekly",test, driver);
	demo.isSelected(chemop.Wednesday, "Wednesday",test, driver);
	demo.isSelected(chemop.Thursday, "Thursday",test, driver);
	datagrid(0,"oeioroirhjh*&*^h",DrugDose4,"ldkd878648gjgkljhgkjhgkhgglgjuie",test,driver);
	Thread.sleep(1000);
	act.moveToElement(chemop.Update).click().perform();
	Sitesave1("ChemoPrescription Update","ChemoPrescription data updated for selected site and phase.", "ChemoPrescription Update","ChemoPrescription data updated for selected site and phase.", 0, driver,test);
	Thread.sleep(1000);
}



@Test(priority =82)
public void PreRadiationEdit() throws IOException, InterruptedException

{
	test = extent.createTest("===========PRE RADATION EDIT AND UPDATE=========");
	test = extent.createTest(funTestCaseName()+" : Click on the PreRadiation, Edit the Data");
	act.moveToElement(chemop.Edit).click().perform();
	Thread.sleep(2000);
	Classification41=Roleselection(test, 12);
	chemop.PatientWeight.clear();
	Validweight1(chemop.PatientWeight,"66",driver,test);
	chemop.PatientHeight.clear();
	Validweight1(chemop.PatientHeight,"66",driver,test);
	chemop.Cycles.clear();
	Validweight1(chemop.Cycles,"98",driver,test);
	chemop.Weeklylbl.click();
	radioButtonWithselect(chemop.Monday,act);
	radioButtonWithselect(chemop.Tuesday,act);
	radioButtonWithselect(chemop.Wednesday,act);
	radioButtonWithselect(chemop.Thursday,act);
	radioButtonWithselect(chemop.Friday,act);
	radioButtonWithselect(chemop.Saturday,act);
	chemop.AddMedications.click();
	Validweight1(chemop.Symptom, "HDJGJDF",driver,test);
	Validweight1(chemop.Remarks, "939873 8377836",driver,test);
	DrugDose41=Roleselection(test, 21);
	chemop.Insert.click();
	chemop.Close.click();
	
	chemop.AddMedications.click();
	Validweight1(chemop.Symptom, "POEIIUE",driver,test);
	Validweight1(chemop.Remarks, "IEIEY EYUUYEUE EUYE",driver,test);
	DrugDose42=Roleselection(test, 21);
	chemop.Insert.click();
	chemop.Close.click();
	
	chemop.AddMedications.click();
	Validweight1(chemop.Symptom, "puhjhjd_jhdjgd",driver,test);
	Validweight1(chemop.Remarks, "eouiey_jhdj",driver,test);
	DrugDose43=Roleselection(test, 21);
	chemop.Insert.click();
	chemop.Close.click();
	
	Thread.sleep(1000);
	datagrid(1,"HDJGJDF",DrugDose41,"939873 8377836",test,driver);
	datagrid(2,"POEIIUE",DrugDose42,"IEIEY EYUUYEUE EUYE",test,driver);
	datagrid(3,"puhjhjd_jhdjgd",DrugDose43,"eouiey_jhdj",test,driver);
	act.moveToElement(chemop.Update).click().perform();
	Sitesave1("ChemoPrescription Update","ChemoPrescription data updated for selected site and phase.", "ChemoPrescription Update","ChemoPrescription data updated for selected site and phase.", 0, driver,test);
	Thread.sleep(1000);
	test = extent.createTest(funTestCaseName()+" : Chemotheraphy saved Preradation, Scheudling button should be enabled");
	demo.isEnabled(chemop.Scheudling, "Scheudling", test, driver);
}

@Test(priority =83)
public void EditCompasrionPreRadiation() throws IOException, InterruptedException
{
	Thread.sleep(1000);
	test = extent.createTest(funTestCaseName()+" : Click on the PreRadiation Save, Edit button should be enable");
	demo.isEnabled(chemop.Edit, "EDIT",test, driver);
	test = extent.createTest(funTestCaseName()+" : Click on the PreRadiation Edit,Update button should be displayed");
	Thread.sleep(2000);
	act.moveToElement(chemop.Edit).click().perform();
	Thread.sleep(2000);
	demo.isEnabled(chemop.Update, "UPDATE",test, driver);
	Thread.sleep(1000);
	test = extent.createTest(funTestCaseName()+" : Click on the PreRadiation Edit,Without modify click on the Update");
	Editcomparison(11, SiteText4,test,driver);
	Editcomparison(12, Classification41,test,driver);
	Editcomparison(13, Regimens4,test,driver);
	Editcomparison(14, DrugForm4,test,driver);
	Editcomparison(16, Drug4,test,driver);
	Editcomparison(17, DrugDose444,test,driver);
	EditText(chemop.PatientWeight, "66",test,driver);
	EditText(chemop.PatientHeight, "66",test,driver);
	Editcomparison(18, Weight4,test,driver);
	Editcomparison(19, Height4,test,driver);
	EditText(chemop.Cycles, "98",test,driver);
	demo.isSelected(chemop.Monday, "Monday",test, driver);
	demo.isSelected(chemop.Tuesday, "Tuesday",test, driver);
	demo.isSelected(chemop.Wednesday, "Wednesday",test, driver);
	demo.isSelected(chemop.Thursday, "Thursday",test, driver);
	demo.isSelected(chemop.Friday, "Friday",test, driver);
	demo.isSelected(chemop.Saturday, "Saturday",test, driver);
	datagrid(0,"oeioroirhjh*&*^h",DrugDose4,"ldkd878648gjgkljhgkjhgkhgglgjuie",test,driver);
	Thread.sleep(1000);
	datagrid(1,"HDJGJDF",DrugDose41,"939873 8377836",test,driver);
	datagrid(2,"POEIIUE",DrugDose42,"IEIEY EYUUYEUE EUYE",test,driver);
	datagrid(3,"puhjhjd_jhdjgd",DrugDose43,"eouiey_jhdj",test,driver);
	Thread.sleep(1000);
	act.moveToElement(chemop.Update).click().perform();
	Sitesave1("ChemoPrescription Update","ChemoPrescription data updated for selected site and phase.", "ChemoPrescription Update","ChemoPrescription data updated for selected site and phase.", 0, driver,test);
}

@Test(priority =86)
public void Others() throws IOException, InterruptedException

{
	test = extent.createTest("========== OTHERS=========");

	test = extent.createTest(funTestCaseName()+" : Click on the Others, Save the data");
	act.moveToElement(chemop.SitePhase.get(chemop.SitePhase.size()-1)).click().perform();

	warn.Dropdown1(chemop.TreatmentType, chemop.TreatmentTypes, 5, "chemop.TreatmentType", test,driver,act);
	SiteText6=Roleselection(test, 11);
	Classification6=Roleselection(test, 12);
	Regimens66=Roleselection(test, 13);
	DrugForm66=Roleselection(test, 14);
	Drug66=Roleselection(test, 16);
	DrugDose66=Roleselection(test, 17);
	Validweight1(chemop.PatientWeight,"300",driver,test);
	Weight6=Roleselection(test, 18);
	Validweight1(chemop.PatientHeight,"200",driver,test);
	Height6=Roleselection(test, 19);
	Validweight1(chemop.Cycles,"11",driver,test);
	chemop.Customlbl.click();
	Validweight1(chemop.Every,"5",driver,test);
	chemop.AddMedications.click();
	Validweight1(chemop.Symptom, "Drug_0397836",driver,test);
	Validweight1(chemop.Remarks, "Rematskdh_09/09/203",driver,test);
	DrugDose6=Roleselection(test, 21);
	chemop.Insert.click();
	chemop.Close.click();
	Thread.sleep(1000);
	datagrid(0,"Drug_0397836",DrugDose6,"Rematskdh_09/09/203",test,driver);
	Thread.sleep(1000);
	act.moveToElement(chemop.Save).click().perform();
	Sitesave1("Chemotherapy Prescription Save", "Chemotherapy Prescription data saved for selected site and phase.", "Chemotherapy Prescription Save", "Chemotherapy Prescription data saved for selected site and phase.", 0, driver,test);
	test = extent.createTest(funTestCaseName()+" : Chemotheraphy saved Others, Scheudling button should be enabled");
	demo.isEnabled(chemop.Scheudling, "Scheudling", test, driver);
}

@Test(priority =89)
public void SaveDataeditOthers() throws IOException, InterruptedException
{
	Thread.sleep(1000);
	test = extent.createTest(funTestCaseName()+" : Click on the Others Save, Edit button should be enable");
	demo.isEnabled(chemop.Edit, "EDIT",test, driver);
	test = extent.createTest(funTestCaseName()+" : Click on the Others Edit,Update button should be displayed");
	Thread.sleep(1000);
	act.moveToElement(chemop.Edit).click().perform();
	Thread.sleep(1000);
	demo.isEnabled(chemop.Update, "UPDATE",test, driver);
	Thread.sleep(1000);
	test = extent.createTest(funTestCaseName()+" : Click on the Others Edit,Without modify click on the Update");
	Editcomparison(11, SiteText6,test,driver);
	Editcomparison(12, Classification6,test,driver);
	Editcomparison(13, Regimens66,test,driver);
	Editcomparison(14, DrugForm66,test,driver);
	Editcomparison(16, Drug66,test,driver);
	Editcomparison(17, DrugDose66,test,driver);
	EditText(chemop.PatientWeight, "300",test,driver);
	EditText(chemop.PatientHeight, "200",test,driver);
	Editcomparison(18, Weight6,test,driver);
	Editcomparison(19, Height6,test,driver);
	EditText(chemop.Cycles, "11",test,driver);
	
	EditText(chemop.Every, "5",test,driver);
	datagrid(0,"Drug_0397836",DrugDose6,"Rematskdh_09/09/203",test,driver);
	act.moveToElement(chemop.Update).click().perform();
	Sitesave1("ChemoPrescription Update","ChemoPrescription data updated for selected site and phase.", "ChemoPrescription Update","ChemoPrescription data updated for selected site and phase.", 0, driver,test);
	Thread.sleep(1000);
	
}



@Test(priority =91)
public void Concurrent() throws IOException, InterruptedException

{
	test = extent.createTest("========== CONCURRENT=========");
	test = extent.createTest(funTestCaseName()+" : Click on the Concurrent, Save the data");
	act.moveToElement(chemop.SitePhase.get(chemop.SitePhase.size()-1)).click().perform();
	warn.Dropdown1(chemop.TreatmentType, chemop.TreatmentTypes, 4, "chemop.TreatmentType", test,driver,act);
	SiteText4=Roleselection(test, 11);
	Thread.sleep(2000);
	try {
	Linkprescription4=Roleselection(test, 10);
	}
	catch(Exception e)
	{
		test.error(e);
	}
	DrugForm4=Roleselection(test, 14);
	RadioSensitizers=Roleselection(test, 15);
	Drug4=Roleselection(test, 16);
	DrugDose447=Roleselection(test, 17);
	Validweight1(chemop.PatientWeight,"66",driver,test);
	Weight4=Roleselection(test, 18);
	Validweight1(chemop.PatientHeight,"66",driver,test);
	Height4=Roleselection(test, 19);
	Validweight1(chemop.Cycles,"99",driver,test);
	chemop.Weeklylbl.click();
	radioButtonWithselect(chemop.Sunday,act);
	radioButtonWithselect(chemop.Monday,act);
	radioButtonWithselect(chemop.Tuesday,act);
	radioButtonWithselect(chemop.Wednesday,act);
	radioButtonWithselect(chemop.Thursday,act);
	radioButtonWithselect(chemop.Friday,act);
	radioButtonWithselect(chemop.Saturday,act);
	
	chemop.AddMedications.click();
	Validweight1(chemop.Symptom, "oeioroirhjh*&*^h",driver,test);
	Validweight1(chemop.Remarks, "ldkd878648gjgkljhgkjhgkhgglgjuie",driver,test);
	DrugDose4g=Roleselection(test, 21);
	chemop.Insert.click();
	chemop.Close.click();
	Thread.sleep(1000);
	datagrid(0,"oeioroirhjh*&*^h",DrugDose4g,"ldkd878648gjgkljhgkjhgkhgglgjuie",test,driver);
	Thread.sleep(1000);
	act.moveToElement(chemop.Save).click().perform();
	Sitesave1("Chemotherapy Prescription Save", "Chemotherapy Prescription data saved for selected site and phase.", "Chemotherapy Prescription Save", "Chemotherapy Prescription data saved for selected site and phase.", 0, driver,test);
}

@Test(priority =93)
public void SaveDataeditConcurrent() throws IOException, InterruptedException
{
	Thread.sleep(1000);
	test = extent.createTest(funTestCaseName()+" : Click on the Concurrent Save, Edit button should be enable");
	demo.isEnabled(chemop.Edit, "EDIT",test, driver);
	test = extent.createTest(funTestCaseName()+" : Click on the Concurrent Edit,Update button should be displayed");
	Thread.sleep(1000);
	act.moveToElement(chemop.Edit).click().perform();
	Thread.sleep(2000);
	demo.isEnabled(chemop.Update, "UPDATE",test, driver);
	Thread.sleep(1000);
	test = extent.createTest(funTestCaseName()+" : Click on the Concurrent Edit,Without modify click on the Update");
	Editcomparison(11, SiteText4,test,driver);
	Editcomparison(10, Linkprescription4,test,driver);
	Editcomparison(15, RadioSensitizers,test,driver);
	Editcomparison(14, DrugForm4,test,driver);
	Editcomparison(16, Drug4,test,driver);
	Editcomparison(17, DrugDose447,test,driver);
	EditText(chemop.PatientWeight, "66",test,driver);
	EditText(chemop.PatientHeight, "66",test,driver);
	Editcomparison(18, Weight4,test,driver);
	Editcomparison(19, Height4,test,driver);
	EditText(chemop.Cycles, "99",test,driver);
	demo.isEnabled(chemop.Weeklylbl, "Weekly",test, driver);
	demo.isSelected(chemop.Sunday, "Sunday",test, driver);
	demo.isSelected(chemop.Monday, "Monday",test, driver);
	demo.isSelected(chemop.Tuesday, "Tuesday",test, driver);
	demo.isSelected(chemop.Wednesday, "Wednesday",test, driver);
	demo.isSelected(chemop.Thursday, "Thursday",test, driver);
	demo.isSelected(chemop.Friday, "Friday",test, driver);
	demo.isSelected(chemop.Saturday, "Saturday",test, driver);
	
	datagrid(0,"oeioroirhjh*&*^h",DrugDose4g,"ldkd878648gjgkljhgkjhgkhgglgjuie",test,driver);
	act.moveToElement(chemop.Update).click().perform();
	Sitesave1("ChemoPrescription Update","ChemoPrescription data updated for selected site and phase.", "ChemoPrescription Update","ChemoPrescription data updated for selected site and phase.", 0, driver,test);
}





//@Test(priority =95)
public void Export() throws IOException
{
	test = extent.createTest(funTestCaseName()+" : Click on the Export the PDF should get displayed ");
	chemop.Export.click();
	image("D:\\Help\\Prescription\\Exportfail.PNG");
}

//@Test(priority =89)  // Delete fun do manually
	public void toverifyfunctionalityofdelete2siteforchemotherapy() throws InterruptedException, IOException{
	
	 test = extent.createTest(funTestCaseName()+" :  To verify site deleting for 2 site in chemotherapy", " able to delete created site ");			
		act.moveToElement(chemop.SitePhase.get(chemop.SitePhase.size()-2)).contextClick().perform();
		chemop.DeleteTab.click();
		SitesaveCancel1("ChemoPrescription Delete","Do you want to delete the selected ChemoPrescription?", "ChemoPrescription Delete","Do you want to delete the selected ChemoPrescription?", 0, driver,test);
		act.moveToElement(chemop.SitePhase.get(chemop.SitePhase.size()-2)).contextClick().perform();
		chemop.DeleteTab.click();
		Sitesave1("ChemoPrescription Delete","Do you want to delete the selected ChemoPrescription?", "ChemoPrescription Delete","Do you want to delete the selected ChemoPrescription?", 0, driver,test);
		Sitesave1("Chemotherapy Prescription Delete","Selected Chemotherapy Prescription deleted.", "Chemotherapy Prescription Delete","Selected Chemotherapy Prescription deleted.", 0, driver,test);
}


public void image(String path) throws IOException
{
	Screen screen = new Screen();
    String referenceImagePath = path; // Replace with the actual path
    Pattern referenceImage = new Pattern(referenceImagePath);
    try {
        Match match = screen.exists(referenceImage);
        if (match != null) {
           test.pass("Reference image found!");
            screen.click(match);
        } else {
            test.fail("Reference image not found!");
        }
    } catch (FindFailed e) {
        e.printStackTrace();
    }
}

public void Editcomparison(int i, String Text,ExtentTest test,WebDriver driver) throws IOException
{
	WebElement element = driver.findElements(By.className("ComboBox")).get(i);
	demo.Textcomparsion(element, Text, test, driver);

}

public void EditText(WebElement element, String Text,ExtentTest test,WebDriver driver) throws IOException
{
	element.click();
	demo.Textcomparsion(element, Text, test, driver);

}
public void datadelete(int i,ExtentTest test,WebDriver driver) throws IOException, InterruptedException
{
	List<WebElement> Listrow = driver.findElements(By.className("DataGridRow"));
	WebElement element=Listrow.get(i);
	WebElement Delete=element.findElements(By.className("DataGridCell")).get(0);
	demo.isEnabled(Delete, "Delete", test, driver);
	Delete.click();	
}

public void InvalidEvery(WebElement element, String Text,WindowsDriver  driver,ExtentTest test) throws IOException
{
	element.click();
	driver.switchTo().activeElement().sendKeys(Text);
	chemop.Save.click();
	demo.Textcomparsion(element, Text, test, driver);
	String bool = warn.Every(chemop.Every,act,driver);
	demo.TextfieldwithWarnmsg(bool,"Range:[1 to 28]",test,driver);
	element.click();
	element.clear();
}			
public void Invalidweight(WebElement element, String Text,WebDriver driver,ExtentTest test) throws IOException
{
	element.click();
	driver.switchTo().activeElement().sendKeys(Text);
	chemop.Save.click();
	demo.isempty(element, Text, test, driver);
	element.clear();
}	

public void Invaidaccepting(WebElement element, String Text,String Etext,WebDriver driver,ExtentTest test) throws IOException
{
	element.click();
	driver.switchTo().activeElement().sendKeys(Text);
	chemop.Save.click();
	demo.Textcomparsion(element, Etext, test, driver);
	element.clear();
}
		
		
public void Validweight(WebElement element, String Text,WebDriver driver,ExtentTest test) throws IOException
{
	element.click();
	driver.switchTo().activeElement().sendKeys(Text);
	chemop.Save.click();
	demo.Textcomparsion(element, Text, test, driver);
	element.clear();
}

public void Validweight1(WebElement element, String Text,WebDriver driver,ExtentTest test) throws IOException
{
	element.click();
	driver.switchTo().activeElement().sendKeys(Text);
	demo.Textcomparsion(element, Text, test, driver);
}

public void ValidSymptonRemarks(WebElement element, String Text,WebDriver driver,ExtentTest test) throws IOException
{
	element.click();
	driver.switchTo().activeElement().sendKeys(Text);
	demo.Textcomparsion(element, Text, test, driver);
	element.clear();
}	

public void InvalidSymptonRemarks(WebElement element, String Text,WebDriver driver,ExtentTest test) throws IOException
{
	element.click();
	driver.switchTo().activeElement().sendKeys(Text);
	demo.Textcomparsion(element, Text, test, driver);
}		
	
	
		
		
	public void datagrid(int i,String ES,String ED, String ER, ExtentTest test,WebDriver driver) throws IOException
   {
	WebElement text= driver.findElement(By.xpath("//Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"PrescriptionMainView\"]/Custom[@ClassName=\"PrescriptionSection2View\"]/DataGrid[@AutomationId=\"generalmedicationdatagrid\"]"));
	List<WebElement> Listrow = text.findElements(By.className("DataGridRow"));
	WebElement element=Listrow.get(i);
	WebElement Delete=element.findElements(By.className("DataGridCell")).get(0);
	demo.isEnabled(Delete, "Delete", test, driver);
	WebElement Symptom=element.findElements(By.className("DataGridCell")).get(1);
	String Symptomtext=Symptom.getText();
	demo.Textcomparsion(Symptom, ES, test, driver);
	WebElement Drug=element.findElements(By.className("DataGridCell")).get(2);
	String Drugtext=Drug.getText();
	demo.Textcomparsion(Drug, ED, test, driver);
	WebElement Remarks=element.findElements(By.className("DataGridCell")).get(3);
	String Remarkstext=Remarks.getText();
	demo.Textcomparsion(Remarks, ER, test, driver);
	//WebElement DateandTime=element.findElements(By.className("DataGridCell")).get(4);
}	
		

		
	@AfterSuite
    public void tearDown() {
        extent.flush();
    }
	
	//Pending:
	// Edit the Each data and save 
	// Edit and dont save the data
	// Add and delete the addmedications
	// Concurrent and others not performed the edit and Update the data
	
}
