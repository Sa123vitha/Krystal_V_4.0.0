package com.krystal.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ReferenceSigin {
	private WebElement Userbx;
	private WebElement Pswdbox;
	private WebElement ServiceConfiguration;
	private WebElement MachineSettings;
	private WebElement Prescriptionsettings;
	private WebElement SystemInfromation;
	private WebElement Holidaysettings;
	private WebElement TreatmentPlan;
	public void Login(WebDriver driver) throws InterruptedException  {
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
	  }
	public void Loginfield(WebDriver driver) throws InterruptedException  {
	    Userbx=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Edit[@AutomationId=\"TxtbxUsername\"]"));
		Userbx.click();
		driver.switchTo().activeElement().sendKeys("000000");
		Thread.sleep(1000);
		Pswdbox=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Edit[@AutomationId=\"PwdBoxUserPassword\"]"));
		Pswdbox.click();
		driver.switchTo().activeElement().sendKeys("0000000");
		WebElement Signinbutton = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Button[@Name=\"SIGN IN\"][@AutomationId=\"BtnValidate\"]"));
		Signinbutton.click();
		Thread.sleep(1000);	
  }
	public void ServiceLogin(WebDriver driver) throws InterruptedException  {
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
	}
	public void ChemotheraphyPrecsription(WebDriver driver) throws InterruptedException
	{
		WebElement PatientList=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"OpenPatientMainView\"]/Custom[@ClassName=\"OpenPatientTableView\"]/DataGrid[starts-with(@AutomationId,\"Datagrid\")]/DataItem[@ClassName=\"DataGridRow\"][@Name=\"Presentation.UiElements.ViewModels.TableViewModel\"]/Custom[@ClassName=\"DataGridCell\"][@Name=\"Female\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Female\"]"));
		PatientList.click();
		Thread.sleep(1000);
		WebElement Prescription=driver.findElement(By.name("PRESCRIPTION"));
		Prescription.click();
		Thread.sleep(1000);
		WebElement Chemo=driver.findElement(By.name("Chemotherapy"));
		Chemo.click();
	}
	public void Labreports(WebDriver driver) throws InterruptedException
	{
		WebElement PatientList=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"OpenPatientMainView\"]/Custom[@ClassName=\"OpenPatientTableView\"]/DataGrid[starts-with(@AutomationId,\"Datagrid\")]/DataItem[@ClassName=\"DataGridRow\"][@Name=\"Presentation.UiElements.ViewModels.TableViewModel\"]/Custom[@ClassName=\"DataGridCell\"][@Name=\"Female\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Female\"]"));
		PatientList.click();
		Thread.sleep(1000);
	}
	
	public void Vitals(WebDriver driver) throws InterruptedException
	{
		WebElement PatientList=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"OpenPatientMainView\"]/Custom[@ClassName=\"OpenPatientTableView\"]/DataGrid[starts-with(@AutomationId,\"Datagrid\")]/DataItem[@ClassName=\"DataGridRow\"][@Name=\"Presentation.UiElements.ViewModels.TableViewModel\"]/Custom[@ClassName=\"DataGridCell\"][@Name=\"Female\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Female\"]"));
		PatientList.click();
		Thread.sleep(1000);
		WebElement Vitals=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"SideMenuSubView\"]/Button[@ClassName=\"Button\"][@Name=\"VITALS\"]"));
		Vitals.click();
		Thread.sleep(1000);
	}
	
	
	public void Prescription(WebDriver driver) throws InterruptedException
	{
		WebElement PatientList=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"OpenPatientMainView\"]/Custom[@ClassName=\"OpenPatientTableView\"]/DataGrid[starts-with(@AutomationId,\"Datagrid\")]/DataItem[@ClassName=\"DataGridRow\"][@Name=\"Presentation.UiElements.ViewModels.TableViewModel\"]/Custom[@ClassName=\"DataGridCell\"][@Name=\"Female\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Female\"]"));
		PatientList.click();
		Thread.sleep(1000);
		WebElement Prescription=driver.findElement(By.name("PRESCRIPTION"));
		Prescription.click();
		Thread.sleep(1000);
		
	}
	
	public void Patientlist(WebDriver driver) throws InterruptedException  {
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
		
		WebElement Menu = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"NavigationTopBarView\"]/Button[@AutomationId=\"ToolTip\"]"));
		Menu.click();
		Thread.sleep(1000);
	    TreatmentPlan = driver.findElement(By.name("Treatment Plan"));
	    TreatmentPlan.click();
	
	}
	
	public void PlanApproval(WebDriver driver) throws InterruptedException  {
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
		WebElement PatientList=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"MainContainerView\"]/Custom[@ClassName=\"OpenPatientMainView\"]/Custom[@ClassName=\"OpenPatientTableView\"]/DataGrid[starts-with(@AutomationId,\"Datagrid\")]/DataItem[@ClassName=\"DataGridRow\"][@Name=\"Presentation.UiElements.ViewModels.TableViewModel\"]/Custom[@ClassName=\"DataGridCell\"][@Name=\"Female\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Female\"]"));
		PatientList.click();
		WebElement plan = driver.findElement(By.name("PLAN APPROVAL"));
		plan.click();
	}
	
  
	public void fieldconfigsid(WebDriver driver, String name) throws InterruptedException
	{
		WebElement Menuclick = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"NavigationTopBarView\"]/Button[@AutomationId=\"ToolTip\"]"));
		Menuclick.click();
		WebElement Menuitem = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SideMenuView\"]/Menu[@ClassName=\"Menu\"]/MenuItem[@ClassName=\"MenuItem\"][@Name=\"Presentation.UiElements.ViewModels.MenuItemViewModel\"]/MenuItem[@ClassName=\"MenuItem\"][@Name=\"Presentation.UiElements.ViewModels.MenuItemViewModel\"]/Text[@ClassName=\"TextBlock\"][@Name=\"General Settings\"]"));
		Menuitem.click();
		Thread.sleep(2000);
		WebElement Menucombobox = driver.findElement(By.className("ComboBox"));
		Actions actions = new Actions(driver);
		actions.moveToElement(Menucombobox).perform();
		Menucombobox.click();
		Thread.sleep(2000);
		WebElement FieldConfiguration = driver.findElement(By.name("Field Configuration"));
		actions.moveToElement(FieldConfiguration).perform();
		FieldConfiguration.click();	
		WebElement Selectmachine = driver.findElements(By.className("ComboBox")).get(1);
		actions.moveToElement(Selectmachine).perform();
		Selectmachine.click();
		WebElement Selectmachinename= driver.findElement(By.name(name));
		Thread.sleep(1000);
		actions.moveToElement(Selectmachinename).click().perform();
	}
	
	public void Siteconfig(WebDriver driver) throws InterruptedException
	{
		WebElement Menuclick = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"NavigationTopBarView\"]/Button[@AutomationId=\"ToolTip\"]"));
		Menuclick.click();
		WebElement Menuitem = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SideMenuView\"]/Menu[@ClassName=\"Menu\"]/MenuItem[@ClassName=\"MenuItem\"][@Name=\"Presentation.UiElements.ViewModels.MenuItemViewModel\"]/MenuItem[@ClassName=\"MenuItem\"][@Name=\"Presentation.UiElements.ViewModels.MenuItemViewModel\"]/Text[@ClassName=\"TextBlock\"][@Name=\"General Settings\"]"));
		Menuitem.click();
		Thread.sleep(2000);
		WebElement Menucombobox = driver.findElement(By.className("ComboBox"));
		Actions actions = new Actions(driver);
		actions.moveToElement(Menucombobox).perform();
		Menucombobox.click();
		Thread.sleep(2000);
		WebElement SiteConfiguration = driver.findElement(By.name("Site Configuration"));
		actions.moveToElement(SiteConfiguration).perform();
		SiteConfiguration.click();		
	}
	public void Designationconfig(WebDriver driver) throws InterruptedException
	{
		WebElement Menuclick = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"NavigationTopBarView\"]/Button[@AutomationId=\"ToolTip\"]"));
		Menuclick.click();
		WebElement Menuitem = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SideMenuView\"]/Menu[@ClassName=\"Menu\"]/MenuItem[@ClassName=\"MenuItem\"][@Name=\"Presentation.UiElements.ViewModels.MenuItemViewModel\"]/MenuItem[@ClassName=\"MenuItem\"][@Name=\"Presentation.UiElements.ViewModels.MenuItemViewModel\"]/Text[@ClassName=\"TextBlock\"][@Name=\"General Settings\"]"));
		Menuitem.click();
		Thread.sleep(2000);
		WebElement Menucombobox = driver.findElement(By.className("ComboBox"));
		Actions actions = new Actions(driver);
		actions.moveToElement(Menucombobox).perform();
		Menucombobox.click();
		Thread.sleep(2000);
		WebElement DesgConfiguration = driver.findElement(By.name("Designation Configuration"));
		actions.moveToElement(DesgConfiguration).perform();
		DesgConfiguration.click();		
	}
	
	public void HolidaySettings(WebDriver driver) throws InterruptedException
	{
		WebElement Menu = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"NavigationTopBarView\"]/Button[@AutomationId=\"ToolTip\"]"));
		Menu.click();
		Thread.sleep(1000);
	    Holidaysettings = driver.findElement(By.name("Holiday Settings"));
	    Holidaysettings.click();
	}
	
	public void Chemoconfig(WebDriver driver) throws InterruptedException
	{
		WebElement Menuclick = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"NavigationTopBarView\"]/Button[@AutomationId=\"ToolTip\"]"));
		Menuclick.click();
		WebElement Menuitem = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SideMenuView\"]/Menu[@ClassName=\"Menu\"]/MenuItem[@ClassName=\"MenuItem\"][@Name=\"Presentation.UiElements.ViewModels.MenuItemViewModel\"]/MenuItem[@ClassName=\"MenuItem\"][@Name=\"Presentation.UiElements.ViewModels.MenuItemViewModel\"]/Text[@ClassName=\"TextBlock\"][@Name=\"General Settings\"]"));
		Menuitem.click();
		Thread.sleep(1000);
		WebElement Menucombobox = driver.findElement(By.className("ComboBox"));
		Actions actions = new Actions(driver);
		actions.moveToElement(Menucombobox).perform();
		Menucombobox.click();
		Thread.sleep(1000);
		WebElement ChemoConfiguration = driver.findElement(By.name("Chemotherapy Configuration"));
		actions.moveToElement(ChemoConfiguration).perform();
		ChemoConfiguration.click();		
	}
	
	public void UserManagement(WebDriver driver) throws InterruptedException
	{
		WebElement Menuclick = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"NavigationTopBarView\"]/Button[@AutomationId=\"ToolTip\"]"));
		Menuclick.click();
		WebElement Menuitem = driver.findElement(By.name("User Management"));
		Menuitem.click();	
	}
	

	public void Roleconfig(WebDriver driver) throws InterruptedException
	{
		WebElement Menuclick = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"NavigationTopBarView\"]/Button[@AutomationId=\"ToolTip\"]"));
		Menuclick.click();
		WebElement Menuitem = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SideMenuView\"]/Menu[@ClassName=\"Menu\"]/MenuItem[@ClassName=\"MenuItem\"][@Name=\"Presentation.UiElements.ViewModels.MenuItemViewModel\"]/MenuItem[@ClassName=\"MenuItem\"][@Name=\"Presentation.UiElements.ViewModels.MenuItemViewModel\"]/Text[@ClassName=\"TextBlock\"][@Name=\"General Settings\"]"));
		Menuitem.click();
		Thread.sleep(2000);
		WebElement Menucombobox = driver.findElement(By.className("ComboBox"));
		Actions actions = new Actions(driver);
		actions.moveToElement(Menucombobox).perform();
		Menucombobox.click();
		Thread.sleep(2000);
		WebElement RoleConfiguration = driver.findElement(By.name("Role Configuration"));
		actions.moveToElement(RoleConfiguration).perform();
		RoleConfiguration.click();		
	}
	public void ToleranceSettings(WebDriver driver) throws InterruptedException
	{
		WebElement Menuclick = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"NavigationTopBarView\"]/Button[@AutomationId=\"ToolTip\"]"));
		Menuclick.click();
		WebElement Menuitem = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SideMenuView\"]/Menu[@ClassName=\"Menu\"]/MenuItem[@ClassName=\"MenuItem\"][@Name=\"Presentation.UiElements.ViewModels.MenuItemViewModel\"]/MenuItem[@ClassName=\"MenuItem\"][@Name=\"Presentation.UiElements.ViewModels.MenuItemViewModel\"]/Text[@ClassName=\"TextBlock\"][@Name=\"General Settings\"]"));
		Menuitem.click();
		Thread.sleep(2000);
		WebElement Menucombobox = driver.findElement(By.className("ComboBox"));
		Actions actions = new Actions(driver);
		actions.moveToElement(Menucombobox).perform();
		Menucombobox.click();
		Thread.sleep(2000);
		WebElement Tolerancesettings = driver.findElement(By.name("Tolerance Settings"));
		actions.moveToElement(Tolerancesettings).click().perform();
				
	}
	
	public void APRSettings(WebDriver driver) throws InterruptedException
	{
		WebElement Menuclick = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"NavigationTopBarView\"]/Button[@AutomationId=\"ToolTip\"]"));
		Menuclick.click();
		WebElement Menuitem = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SideMenuView\"]/Menu[@ClassName=\"Menu\"]/MenuItem[@ClassName=\"MenuItem\"][@Name=\"Presentation.UiElements.ViewModels.MenuItemViewModel\"]/MenuItem[@ClassName=\"MenuItem\"][@Name=\"Presentation.UiElements.ViewModels.MenuItemViewModel\"]/Text[@ClassName=\"TextBlock\"][@Name=\"General Settings\"]"));
		Menuitem.click();
		Thread.sleep(2000);
		WebElement Menucombobox = driver.findElement(By.className("ComboBox"));
		Actions actions = new Actions(driver);
		actions.moveToElement(Menucombobox).perform();
		Menucombobox.click();
		Thread.sleep(2000);
		WebElement APRSettings = driver.findElement(By.name("APR Settings"));
		actions.moveToElement(APRSettings).click().perform();
				
	}
	
	public void APRCBCTSettings(WebDriver driver) throws InterruptedException
	{
		WebElement Menuclick = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"NavigationTopBarView\"]/Button[@AutomationId=\"ToolTip\"]"));
		Menuclick.click();
		WebElement Menuitem = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SideMenuView\"]/Menu[@ClassName=\"Menu\"]/MenuItem[@ClassName=\"MenuItem\"][@Name=\"Presentation.UiElements.ViewModels.MenuItemViewModel\"]/MenuItem[@ClassName=\"MenuItem\"][@Name=\"Presentation.UiElements.ViewModels.MenuItemViewModel\"]/Text[@ClassName=\"TextBlock\"][@Name=\"General Settings\"]"));
		Menuitem.click();
		Thread.sleep(2000);
		WebElement Menucombobox = driver.findElement(By.className("ComboBox"));
		Actions actions = new Actions(driver);
		actions.moveToElement(Menucombobox).perform();
		Menucombobox.click();
		Thread.sleep(2000);
		WebElement APRSettings = driver.findElement(By.name("APR CBCT Settings"));
		actions.moveToElement(APRSettings).click().perform();
				
	}
	
	public void MachineQA(WebDriver driver) throws InterruptedException
	{
		WebElement Menuclick = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"NavigationTopBarView\"]/Button[@AutomationId=\"ToolTip\"]"));
		Menuclick.click();
		WebElement Menuitem = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SideMenuView\"]/Menu[@ClassName=\"Menu\"]/MenuItem[@ClassName=\"MenuItem\"][@Name=\"Presentation.UiElements.ViewModels.MenuItemViewModel\"]/MenuItem[@ClassName=\"MenuItem\"][@Name=\"Presentation.UiElements.ViewModels.MenuItemViewModel\"]/Text[@ClassName=\"TextBlock\"][@Name=\"General Settings\"]"));
		Menuitem.click();
		Thread.sleep(2000);
		WebElement Menucombobox = driver.findElement(By.className("ComboBox"));
		Actions actions = new Actions(driver);
		actions.moveToElement(Menucombobox).perform();
		Menucombobox.click();
		Thread.sleep(2000);
		WebElement MachineQA = driver.findElement(By.name("Machine QA"));
		Thread.sleep(2000);
		actions.moveToElement(MachineQA).click().perform();		
	}
	
	public void Machinesettings(WebDriver driver) throws InterruptedException
	{
		WebElement Generatorsettings = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneratorSettingsMainView\"]/Custom[@ClassName=\"GeneratorSettingsSection1View\"]/ComboBox[@ClassName=\"ComboBox\"]"));
		Generatorsettings.click();
		Thread.sleep(5000);
	    MachineSettings = driver.findElement(By.name("Machine Settings"));
		Actions actions = new Actions(driver);
	    actions.doubleClick(MachineSettings).perform(); 	
	}
	
	public void Prescriptionsettings(WebDriver driver) throws InterruptedException
	{
		WebElement Generatorsettings = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneratorSettingsMainView\"]/Custom[@ClassName=\"GeneratorSettingsSection1View\"]/ComboBox[@ClassName=\"ComboBox\"]"));
		Generatorsettings.click();
		Thread.sleep(5000);
	    Prescriptionsettings = driver.findElement(By.name("Prescription Settings"));
		Actions actions = new Actions(driver);
	    actions.doubleClick(Prescriptionsettings).perform(); 	
	}
	
	public void SystemInformation(WebDriver driver) throws InterruptedException
	{
		WebElement Generatorsettings = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneratorSettingsMainView\"]/Custom[@ClassName=\"GeneratorSettingsSection1View\"]/ComboBox[@ClassName=\"ComboBox\"]"));
		Generatorsettings.click();
		Thread.sleep(5000);
	    SystemInfromation = driver.findElement(By.name("System Information"));
		Actions actions = new Actions(driver);
	    actions.doubleClick(SystemInfromation).perform(); 	
	}
	
	public void Help(WebDriver driver) throws InterruptedException
	{
		WebElement Menuclick = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"NavigationTopBarView\"]/Button[@AutomationId=\"ToolTip\"]"));
		Thread.sleep(1000);
		Menuclick.click();
		Thread.sleep(1000);
		WebElement Menuitem = driver.findElement(By.name("Help"));
		Thread.sleep(1000);
		Menuitem.click();
		Thread.sleep(1000);
	}
	
	public void Templates(WebDriver driver) throws InterruptedException
	{
		WebElement Menuclick = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"NavigationTopBarView\"]/Button[@AutomationId=\"ToolTip\"]"));
		Thread.sleep(1000);
		Menuclick.click();
		Thread.sleep(1000);
		WebElement Menuitem = driver.findElement(By.name("Templates"));
		Thread.sleep(1000);
		Menuitem.click();
		Thread.sleep(1000);
	}
	public void Machineslot(WebDriver driver) throws InterruptedException
	{
		WebElement Menuclick = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"NavigationTopBarView\"]/Button[@AutomationId=\"ToolTip\"]"));
		Thread.sleep(1000);
		Menuclick.click();
		Thread.sleep(1000);
		WebElement Menuitem = driver.findElement(By.name("Machine Slot"));
		Thread.sleep(1000);
		Menuitem.click();
		Thread.sleep(1000);
	}
	
	public void ServiceConfig(WebDriver driver) throws InterruptedException
	{
		WebElement Menucombobox = driver.findElement(By.className("ComboBox"));
		Actions actions = new Actions(driver);
		actions.moveToElement(Menucombobox).perform();
		Menucombobox.click();
		Thread.sleep(2000);
		ServiceConfiguration = driver.findElement(By.name("Service Configuration"));
		actions.moveToElement(ServiceConfiguration).perform();
		ServiceConfiguration.click();	
	}
	
	public void RollLogin(WebDriver driver) throws InterruptedException  {
	    Userbx=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Edit[@AutomationId=\"TxtbxUsername\"]"));
		Userbx.click();
		driver.switchTo().activeElement().sendKeys("111111");
		Thread.sleep(1000);
		Pswdbox=driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Edit[@AutomationId=\"PwdBoxUserPassword\"]"));
		Pswdbox.click();
		driver.switchTo().activeElement().sendKeys("111111");
		WebElement Signinbutton = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Button[@Name=\"SIGN IN\"][@AutomationId=\"BtnValidate\"]"));
		Signinbutton.click();
		Thread.sleep(1000);	
  }
	
	
}
