package com.krystal.project;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import io.appium.java_client.windows.WindowsDriver;

public class SiteConfigurationTest extends ReferencefileChemotheraphy{
	WebElement SiteButton;
	WebElement Textboxdislayed;
	WebElement saveButtonDisplayed;
	WebElement Save;
	WebElement sitenameexits;
	String siteName;
	String sitedata;
	String Exceptedsitenameexits;
	private SitePOM site;
	private Actions action;
	private Actions act;
	
	
	
	
	
	@Test(priority =1)
	public void Launch()  throws InterruptedException, IOException {
	//DesiredCapabilities appCapabilities = new DesiredCapabilities();
	//appCapabilities.setCapability("app", "C:\\Program Files\\Panacea Medical Technologies\\Krystal\\Krystal.exe");
	//driver = new WindowsDriver<WebElement>(new URL("http://127.0.0.1:4723"), appCapabilities);
	ReferenceSigin Sign=new ReferenceSigin();
	Sign.Login(driver);
	Sign.Siteconfig(driver);
	site=new SitePOM(driver);
	setUp();
	action=new Actions(driver);
	act=new Actions(driver);
	}
   
   
@Test(priority =2)
public void SiteconfigurationLabel() throws IOException {
test = extent.createTest("====GENERAL SETTINGS(SITE CONFIGURATION MODULE)=====");
test = extent.createTest(guiTestCaseName()+" SITE CONFIGURATION label"," SITE CONFIGURATION label should be present ");	
demo.Textcomparsion(site.siteconfig, "SITE CONFIGURATION", test,driver);

}
@Test(priority =3)
public void SitenameLabel() throws IOException {
test = extent.createTest(guiTestCaseName()+" Site Name label"," Site Name label should be present ");	
demo.Textcomparsion(site.SiteName, "Site Name", test,driver);
}


@Test(priority =3)
public void Save() throws IOException {
test = extent.createTest(guiTestCaseName()+" SAVE label"," SAVE label should be present ");	
demo.Textcomparsion(site.Save, "SAVE", test,driver);
}


@Test(priority =4)
public void Sitelist() throws IOException {
test = extent.createTest(guiTestCaseName()+" SITE LIST label"," SITE LIST label should be present ");	
demo.Textcomparsion(site.sitelist, "SITE LIST", test,driver);
}
@Test(priority =5)
public void Sitename() throws IOException {
test = extent.createTest(guiTestCaseName()+" Site Name label"," Site Name label should be present ");	
demo.Textcomparsion(site.sitenamelist, "Site Name", test,driver);
}
WebElement Savebutton;
@Test(priority=6)
public void saveenable() throws InterruptedException, IOException
{
	test = extent.createTest(guiTestCaseName()+" To verify the Save button disabled by default ","By default Save button should be disabled");
	DemographicsExternal demo=new DemographicsExternal();
    demo.BydefaultisEnabled(site.Save,"SAVE", test,driver);
}



//@Test(priority =7)
public void databaseconnectionemptycheck() throws IOException
{
	test = extent.createTest(funTestCaseName()+" To verify the Empty Database for Site Configuration");
	Siteconfig(test);
}

String Text;
@Test(priority=8)
public void Sitesave() throws InterruptedException, IOException
{
	test = extent.createTest(guiTestCaseName()+" To verify the Valid site name","Valid Site should save the data");
	randomalpha(40);
	Thread.sleep(1000);
	Actions action=new Actions(driver);
	 action.moveToElement(site.SiteHead).click().perform();
	driver.switchTo().activeElement().sendKeys(randomStringalpha);
	Thread.sleep(1000);
	demo.ByValidErrormessage(site.SiteHead,randomStringalpha,test,driver);
	Thread.sleep(1000);
	SiteSave(test);
}
@Test(priority=10)
public void Sitealreadysave() throws InterruptedException, IOException
{
	test = extent.createTest(funTestCaseName()+" To verify the site name already exits Save button not enabled");
	Validdata(site.SiteHead,randomStringalpha,driver);
	demo.BydefaultisEnabled(site.Save,"SAVE", test,driver);
	
	test = extent.createTest(funTestCaseName()+" To verify the site name already exits error message is displayed");
	demo.isdisplayed(site.SiteErrormsg, "Site name already exists", test,driver);
	demo.Textcomparsion(site.SiteErrormsg, "Site name already exists", test,driver);
	driver.switchTo().activeElement().clear();	
}
@Test(priority=11)
public void Sitetexbox() throws InterruptedException, IOException
{
		randomUpper(15);
		ValidataUpper("Site Name");
		Thread.sleep(1000);
		SiteSave(test);
		
		randomLower(15);
		ValidataLower("Site Name");
		Thread.sleep(1000);
		SiteSave(test);
		
		randomalpha(15);
		ValidataUpperLower("Site Name");
		Thread.sleep(1000);
		SiteSave(test);
		
		randomNumber(15);
		ValidataNumber("Site Name");
		Thread.sleep(1000);
		SiteSave(test);
		Thread.sleep(1000);
		
		Validatachars("Site Name");
		Thread.sleep(1000);
		SiteSave(test);
		Thread.sleep(1000);
	
		InValidataRange1("Site Name");
		Thread.sleep(1000);
		SiteSave(test);
		
		InValidataspecialchars("Site Name");
}



@Test(priority =12)
public void databaseconnectionsavecheck() throws IOException
{
	test = extent.createTest(funTestCaseName()+" To verify the Saved Database for Site Configuration");
	Siteconfig(test);
}

@Test(priority = 13)
public void viewdataget1() throws IOException, FindFailed, InterruptedException {
    test = extent.createTest(guiTestCaseName() + "To verify the datagrid elements");
    List<WebElement> Listrow = driver.findElements(By.className("DataGridRow"));

    for (WebElement link : Listrow) {
        List<WebElement> datarow = driver.findElements(By.className("DataGridCell"));
        StringBuilder tableHtml = new StringBuilder();
        tableHtml.append("<table style='font-size: 16px; border-collapse: separate; border-spacing: 10px;'>");

        for (int i = 0; i < datarow.size(); i++) {
            WebElement datalink = datarow.get(i);
            if (datalink.getSize() != null) {
                String linkText = datalink.getText();

                // Check if the index is even
                if (i % 2 != 0) {
                    tableHtml.append("<tr><td>").append("</td><td style='margin-left: 10px;'>").append(linkText).append("</td></tr>");
                }
            }
        }

        tableHtml.append("</table>");
        test.pass(MarkupHelper.createLabel(tableHtml.toString(), ExtentColor.WHITE));
        break;
    }
}
@Test(priority = 14)
public void viewdatabase() throws FindFailed, ClassNotFoundException, IOException, InterruptedException, SQLException
{    test = extent.createTest(guiTestCaseName() + "To verify the datagrid and database elements");
	 viewdataget(test);
}
@Test(priority=15)
public void delete() throws InterruptedException, IOException
{
	    test = extent.createTest(funTestCaseName()+" To verify the delete functionality");
	    
	    for(int i=1;i<=5;i++)
	    {
	    	randomrange();
	    	By locator = By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"ConfigurationMainView\"]/Custom[@ClassName=\"ConfigurationSection2View\"]/DataGrid[@ClassName=\"DataGrid\"]/DataItem[@ClassName=\"DataGridRow\"][@Name=\"Presentation.UiElements.ViewModels.TableViewModel\"]/Custom[@ClassName=\"DataGridCell\"][starts-with(@Name,\"Item: Presentation.UiElements.ViewModels.TableViewModel, Column \")]/Button[@ClassName=\"Button\"]");
	    	List<WebElement> elements = driver.findElements(locator);
	    	Thread.sleep(2000);
	    	int desiredIndex = randomNumber; 
	    	if (desiredIndex < elements.size()) {
	    		Thread.sleep(2000);
	    	    WebElement element = elements.get(desiredIndex);
	    	    demo.isEnabled(element,"Delete Field", test,driver);
	    	  if(element.isEnabled())
	    	  {
	    		 test.pass("Delete button is enabled");
	    		 Actions action=new Actions(driver);
	    		 action.moveToElement(element).click().perform();
	    		 SiteDelete(test);
	    		 SiteDeleteconfrimation(test);
	    		 break;
	    	  }
	    	  else
	    	  {
	    		  test.fail("Delete button is not enabled");
	    		  break;
	    	  }
	    }
	}
}

@Test(priority = 16)
public void viewdatabaseafterdelete() throws FindFailed, ClassNotFoundException, IOException, InterruptedException, SQLException
{   test = extent.createTest(guiTestCaseName() + "To verify the datagrid and database elements after delete the site");
	 viewdataget(test);
}

@Test(priority = 18)
public void viewdataserach() throws IOException, FindFailed, InterruptedException
{
	 test = extent.createTest(funTestCaseName() + " To verify the Search box functionality and it is cleared empty textbox");
	 viewdataserachfun(test);
}
//*******************************Page Navigation**************
@Test(priority = 19)
public void pagefirst() throws IOException
{
	test = extent.createTest(guiTestCaseName()+" To verify first page button is displayed");
	demo.isdisplayed(site.FirstPageButton,"First page button", test,driver);
	demo.BydefaultisEnabled(site.FirstPageButton,"First page button", test,driver);
}
@Test(priority = 20)
public void pagesecond() throws IOException
{
	test = extent.createTest(guiTestCaseName()+" To verify Previous Page button is displayed");
	demo.isdisplayed(site.PreviousPageButton,"PreviousPageButton button is displayed", test,driver);
	demo.BydefaultisEnabled(site.PreviousPageButton,"PreviousPageButton button is displayed", test,driver);
}
@Test(priority = 21)
public void pageNext() throws IOException
{
	test = extent.createTest(guiTestCaseName()+" To verify Next Page button is displayed");
	demo.isdisplayed(site.NextPageButton,"NextPageButton button", test,driver);
	demo.BydefaultisEnabled(site.NextPageButton,"NextPageButton button", test,driver);

}
@Test(priority = 21)
public void pagelast() throws IOException
{
	test = extent.createTest(guiTestCaseName()+" To verify Last Page button is displayed");
	demo.isdisplayed(site.LastPageButton,"LastPage button", test,driver);
	demo.BydefaultisEnabled(site.LastPageButton,"LastPage button", test,driver);

}
@Test(priority = 22, invocationCount=2)
public void Sitenameadd() throws IOException, InterruptedException
{
	Sitetexbox();
}

@Test(priority = 23)
public void pageenabled() throws IOException, InterruptedException
{
	List<WebElement> dataGridRows = driver.findElements(By.className("DataGridRow"));
	System.out.println(dataGridRows.size());
    if (dataGridRows.size()==16) 
    {
    	test = extent.createTest(guiTestCaseName()+" To verify Next and last page is enabled");
    	List<WebElement> dataGrid = driver.findElements(By.className("DataGridRow"));
    	test.info("Sitename found in Firstpage are"+dataGrid.size());
    	demo.isEnabled(site.NextPageButton,"Next page button", test,driver);
    	demo.isEnabled(site.LastPageButton,"Last page button", test,driver);
    }
    	else {
        	demo.BydefaultisEnabled(site.FirstPageButton,"First page button", test,driver);
        	demo.BydefaultisEnabled(site.PreviousPageButton,"PreviousPageButton button is displayed", test,driver);
        	demo.BydefaultisEnabled(site.NextPageButton,"NextPageButton button", test,driver);
        	demo.BydefaultisEnabled(site.LastPageButton,"LastPage button", test,driver);
        	Sitetexbox();
        }
  }
@Test(priority = 24)
public void Nextpageenable() throws IOException, FindFailed, InterruptedException
{
	if(site.NextPageButton.isEnabled())
	{
		site.NextPageButton.click();
		viewdataget1();
		test = extent.createTest(guiTestCaseName()+" To verify Click on the Next, First and Previous are enabled");
		List<WebElement> dataGridRows1 = driver.findElements(By.className("DataGridRow"));
		test.info("Sitename found in NextPage are"+dataGridRows1.size());
		demo.isEnabled(site.FirstPageButton,"First page button", test,driver);
		demo.isEnabled(site.PreviousPageButton,"PreviousPageButton", test,driver);
	}
	else {
		test.fail("Next Page button is not enabled");
	}
	
}
@Test(priority = 25)
public void previouspageenabled() throws FindFailed, IOException, InterruptedException
{
	if(site.PreviousPageButton.isEnabled())
	{
		site.PreviousPageButton.click();
		viewdataget1();
		test = extent.createTest(guiTestCaseName()+" To verify Click on the Previous, First and Previous are enabled");
		List<WebElement> dataGridRows2 = driver.findElements(By.className("DataGridRow"));
		test.info("Sitename found in Previous Page are"+dataGridRows2.size());
		demo.isEnabled(site.NextPageButton,"Next page button", test,driver);
    	demo.isEnabled(site.LastPageButton,"Next page button", test,driver);
	}
	else {
		test.fail("PreviousPageButton is not enabled");
	}	
		
}
@Test(priority = 26)
public void Lastpageenabled() throws FindFailed, IOException, InterruptedException
{
	if(site.LastPageButton.isEnabled())
	{
		site.LastPageButton.click();
		viewdataget1();
		test = extent.createTest(guiTestCaseName()+" To verify Click on the Last, First and Previous are enabled");
		List<WebElement> dataGridRows3 = driver.findElements(By.className("DataGridRow"));
		test.info("Sitename found in Last Page are"+dataGridRows3.size());
		demo.isEnabled(site.FirstPageButton,"First page button", test,driver);
		demo.isEnabled(site.PreviousPageButton,"PreviousPageButton", test,driver);
	}
	else {
		test.fail("LastPageButton is not enabled");
	}
}

@Test(priority = 27)
public void FirstPageEnabled() throws FindFailed, IOException, InterruptedException
{
	if(site.FirstPageButton.isEnabled())
	{
		site.FirstPageButton.click();
		viewdataget1();
		test = extent.createTest(guiTestCaseName()+" To verify Click on the First, Next and Last are enabled");
		List<WebElement> dataGridRows4 = driver.findElements(By.className("DataGridRow"));
		test.info("Sitename found in First Page are"+dataGridRows4.size());
		demo.isEnabled(site.NextPageButton,"Next page button", test,driver);
    	demo.isEnabled(site.LastPageButton,"Last page button", test,driver);
	}
	else {
		test.fail("First Page button is not enabled");
	}
}

@Test(priority = 28)
public void Searchelementnext() throws IOException, FindFailed, InterruptedException
{
	test = extent.createTest(guiTestCaseName()+" To verify Search item in the Next page button");
	if(site.NextPageButton.isEnabled())
	{
		site.NextPageButton.click();
		Thread.sleep(10000);
		viewdataserachfun(test);
	}
	else {
		test.fail("Next Page button is not enabled");
	}
	
}


@Test(priority = 29)
public void Searchempty() throws IOException, FindFailed, InterruptedException
{
	test = extent.createTest(funTestCaseName()+" To verify Serach invaliddata it should display the empty data");
	Siteconfig("D:\\Help\\Site\\SiteSearch.PNG");
    WebElement searchBox = driver.switchTo().activeElement();
    searchBox.sendKeys("Z908");
    List<WebElement> dataGridRows = driver.findElements(By.className("DataGridRow"));
    if (dataGridRows.size()==0) {
    	test.pass("Search Sitename Not displayed "+dataGridRows.size());
    }
    else
    {
    	 test.fail("Search Sitename displayed "+dataGridRows.size());
    }
    Thread.sleep(1000);
    searchBox.clear();
    Thread.sleep(1000);
    demo.isempty(searchBox, "Search Box Empty", test, driver);
    Thread.sleep(1000);
}

@Test(priority = 30)
public void viewdataget2() throws IOException, FindFailed, InterruptedException {
    test = extent.createTest(guiTestCaseName() + "To verify the all the delete button enabled when save the data");
    List<WebElement> Listrow = driver.findElements(By.className("DataGridRow"));

    for (WebElement link : Listrow) {
        List<WebElement> datarow = driver.findElements(By.className("DataGridCell"));
        for (int i = 0; i < datarow.size(); i++) {
            WebElement datalink = datarow.get(i);
            if (datalink.getSize() != null) {
                String linkText = datalink.getText();
                test.info(linkText);
                // Check if the index is even
                if (i % 2 == 0) {
                   demo.isEnabled(datalink, "Delete", test, driver);
                   if(datarow.size()==16)
                   {
                	   site.NextPageButton.click(); 
                	   List<WebElement> datarow1 = driver.findElements(By.className("DataGridCell"));
                       for (int i1 = 0; i < datarow1.size(); i++) {
                           WebElement datalink1 = datarow.get(i1);
                           if (datalink1.getSize() != null) {
                               String linkText1 = datalink1.getText();
                               test.info(linkText1);
                           }
                       }
                   }
                   else
                   {
                	   test.info("NextPageButton");
                   }
                }
            }
        }
        break;
    }
}


public void Siteconfig(String Text) throws FindFailed {
	 Screen screen = new Screen();
	 String imagePath = Text;
	 Pattern pattern = new Pattern(imagePath);
    Match match = screen.find(pattern);
    match.click();
}
WebElement SiteName;
public void ValidataUpper(String Text) throws IOException
{
	 test = extent.createTest(funTestCaseName()+" To verify the "+Text+" textbox is accepting the Uppercase letters");
	 SiteName = driver.findElement(By.name(Text));
	 validatachars(SiteName,randomStringUpper,driver);
}

public void ValidataLower(String Text) throws IOException
{
	 test = extent.createTest(funTestCaseName()+" To verify the "+Text+" textbox is accepting the Lowercase letters");
	 SiteName = driver.findElement(By.name(Text));
	 validatachars(SiteName,randomStringLower,driver);
}

public void ValidataUpperLower(String Text) throws IOException
{
	 test = extent.createTest(funTestCaseName()+" To verify the "+Text+" textbox is accepting the Upper and Lowercase letters");
	 SiteName = driver.findElement(By.name(Text));
	 validatachars(SiteName,randomStringalpha,driver);
}
public void ValidataNumber(String Text) throws IOException
{
	 test = extent.createTest(funTestCaseName()+" To verify the "+Text+" textbox is accepting the Numbers");
	 SiteName = driver.findElement(By.name(Text));
	 validatachars(SiteName,randomStringNumber,driver);
}
public void Validatachars(String Text) throws IOException, InterruptedException 
{
	 test = extent.createTest(funTestCaseName()+ " To verify the "+Text+" textbox is accepting the Alpha,numbers, specialchars,and spaces");
	 SiteName = driver.findElement(By.name(Text));
	 randomstringtext(15);
	 Thread.sleep(1000);
	 validatachars(SiteName,randomString,driver);
}
public void InValidataRange(String Text) throws IOException, InterruptedException
{
	 test = extent.createTest(funTestCaseName()+ " To verify the "+Text+" textbox is not accepting range if above 40");
	 SiteName = driver.findElement(By.name(Text));
	 randomCharOutOfRange(40);
	 Thread.sleep(1000);
	 Invalidrange(SiteName,randomcharString,driver);
}

public void InValidataRange1(String Text) throws IOException, InterruptedException
{
	 test = extent.createTest(funTestCaseName()+ " To verify the "+Text+" textbox is not accepting range if above 40");
	 SiteName = driver.findElement(By.name(Text));
	 randomCharOutOfRange1(50);
	 Thread.sleep(1000);
	 Invalidrange(SiteName,randomcharString,driver);
}
public void InValidatachars(String Text) throws IOException
{
	 test = extent.createTest(funTestCaseName()+ " To verify the "+Text+" textbox is not accepting specialchars");
	 SiteName = driver.findElement(By.name(Text));
	 Invalidrange(SiteName,randomString,driver);
}
public void InValidataspecialchars(String Text) throws IOException
{
	 test = extent.createTest(funTestCaseName()+ " To verify the "+Text+" textbox is not accepting specialchars and displaying error message");
	 SiteName = driver.findElement(By.name(Text));
	 Specialchar(SiteName,randomString,driver,test);
	 test = extent.createTest(funTestCaseName()+ " To verify the "+Text+" save button disabled when enter the specialchars");
	 demo.BydefaultisEnabled(site.Save,"SAVE", test,driver);
	 driver.switchTo().activeElement().clear();
}
public void validatachars(WebElement Validdatachars, String Text, WebDriver driver) throws IOException
{
	Validdata(Validdatachars,Text,driver);
}

public void Invalidrange(WebElement Validdatachars, String Text, WebDriver driver) throws IOException
{
	ValiddataRange(Validdatachars,Text,driver);
}


public void validatacharsempty(WebElement Validdatachars, String Text, WebDriver driver) throws IOException
{
	Validdataempty(Validdatachars,Text,driver);
}

public void Invalidrangeempty(WebElement Validdatachars, String Text, WebDriver driver) throws IOException
{
	Validdataempty(Validdatachars,Text,driver);
}
public void Validdata(WebElement Name, String Text,WebDriver driver) throws IOException
{
 Actions action=new Actions(driver);
 action.moveToElement(Name).click().perform();
		driver.switchTo().activeElement().sendKeys(Text);
		demo.ByValidErrormessage(Name,Text,test,driver);

}
public void Validdataempty(WebElement Name, String Text,WebDriver driver) throws IOException
{
	Name.click();
	driver.switchTo().activeElement().sendKeys(Text);
	demo.ByValidErrormessage(Name,Text,test,driver);
}

public void Specialchar(WebElement InValiddatachars, String Text, WebDriver driver, ExtentTest test) throws IOException
{
	InValiddatachars.click();
	driver.switchTo().activeElement().sendKeys("\\,");
	WebElement Specialchars=driver.findElement(By.name("Input must not contain \\ , '' , '"));
	demo.isdisplayed(Specialchars, "Input must not contain \\ , '' , '", test,driver);
	demo.Textcomparsion(Specialchars, "Input must not contain \\ , '' , '", test,driver);
}

public void ValiddataRange(WebElement Name,String Text,WebDriver driver) throws IOException
{
	Name.click();
	driver.switchTo().activeElement().sendKeys(Text);
	String data=driver.switchTo().activeElement().getText();
	if(data.length()<=40)
	{
		test.pass("Textbox accepted is:"+data.length()+"enetred range is:"+Text.length());
	}
	else
	{
		test.fail("Textbox accepted is:"+data.length()+"enetred range is:"+Text.length());
	}
}
public void SiteSave(ExtentTest test) throws InterruptedException, IOException
{
	site.Save.click();
	Sitesave1("Site Add", "Site configuration added.", "Site Add", "Site configuration added.",0,driver,test);
}

public void SiteDelete(ExtentTest test) throws InterruptedException, IOException
{
	Sitesave1("Site Delete", "Do you want to delete the selected site?", "Site Delete", "Do you want to delete the selected site?",0,driver,test);
}
public void SiteDeleteconfrimation(ExtentTest test) throws InterruptedException, IOException
{
	Sitesave1("Site Delete", "Site configuration deleted.", "Site Delete", "Site configuration deleted.",0,driver,test);
}


public void Sitesave(String Titlename, String Description, String Excepetedtitlename, String Excepeteddescription, int i, WebDriver driver) throws InterruptedException, IOException
{

	    String mainWindowHandle = driver.getWindowHandle();
	    Set<String> windowHandles = driver.getWindowHandles();
	    for (String handle : windowHandles) {
	        if (!handle.equals(mainWindowHandle)) {
	            driver.switchTo().window(handle);
	            test = extent.createTest(guiTestCaseName()+" To verify popup titlename, description and ok button");
	            WebElement SiteAdd=driver.findElement(By.name(Titlename));
	            demo.Textcomparsion(SiteAdd, Excepetedtitlename, test,driver);
	            WebElement SiteSavedescription=driver.findElement(By.name(Description));
	            demo.Textcomparsion(SiteSavedescription, Excepeteddescription, test,driver);
	            WebElement OK=driver.findElement(By.name("OK"));
	            demo.Textcomparsion(OK, "OK", test,driver);
	        	OK.click();	
	        	Thread.sleep(2000);
	            }
	            break; 
	        }
	    driver.switchTo().window(mainWindowHandle);	
	}
public void Siteconfig(ExtentTest test1) throws IOException {
    try {
        ArrayList<HashMap<String, String>> dataEntries = class1.getDataFromDatabaseSite();

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


public void viewdataget(ExtentTest Test) throws IOException, FindFailed, InterruptedException, ClassNotFoundException, SQLException {
	 

    // Get the DataGridCell elements
    List<WebElement> datarow = driver.findElements(By.className("DataGridCell"));

    // Retrieve site names from the database
    ArrayList<HashMap<String, String>> dataEntries = class1.getDataFromDatabaseSite();

    // StringBuilder for the HTML table
    StringBuilder tableHtml = new StringBuilder();
    tableHtml.append("<table style='font-size: 16px; border-collapse: separate; border-spacing: 10px;'>");

    // Add headers for database names and link test values
    tableHtml.append("<tr><th>Database Site Name</th><th> Site Configuration Value</th></tr>");

    for (int i = 0; i < datarow.size(); i++) {
        WebElement datalink = datarow.get(i);
        if (datalink.getSize() != null) {
            String linkText = datalink.getText();

            for (HashMap<String, String> entry : dataEntries) {
                String databaseSiteName = entry.get("SiteName"); // Assuming "SiteName" is the database column name

                // Check if the linkText matches the databaseSiteName
                if (linkText.equals(databaseSiteName)) {
                    // Add the matching pair to the HTML table
                    tableHtml.append("<tr><td>").append(databaseSiteName).append("</td><td style='margin-left: 10px;'>").append(linkText).append("</td></tr>");
                }
            }
        }
    }

    // Close the HTML table
    tableHtml.append("</table>");
    
    // Check if any matches were found before passing the table to the report
    if (tableHtml.indexOf("<tr>") >= 0) {
    	Test.pass(MarkupHelper.createLabel(tableHtml.toString(), ExtentColor.WHITE));
    } else {
    	Test.info("No matching data found");
    }
}

public void viewdataserachfun(ExtentTest Test) throws IOException, FindFailed, InterruptedException {
   
    List<WebElement> Listrow = driver.findElements(By.className("DataGridRow"));

    for (WebElement link : Listrow) {
        List<WebElement> datarow = driver.findElements(By.className("DataGridCell"));
        int randomOddIndex = new Random().nextInt((datarow.size() / 2)) * 2 + 1;
        
        if (randomOddIndex < datarow.size()) {
            WebElement randomOddElement = datarow.get(randomOddIndex);
            String linkText = randomOddElement.getText();
            
            Siteconfig("D:\\Help\\Site\\SiteSearch.PNG");
            
            // Enter the linkText in the search box
            WebElement searchBox = driver.switchTo().activeElement();
            searchBox.sendKeys(linkText);

            // Wait for a moment to allow search results to appear (you can adjust the wait time as needed)
           Thread.sleep(1000);

           // Check if only one row is displayed in the data grid
           List<WebElement> dataGridRows = driver.findElements(By.className("DataGridRow"));
           
           if (dataGridRows.size()!=0) {
                WebElement data=driver.findElements(By.className("DataGridCell")).get(1);
                
                if (data.getText().contains(linkText)) {
                    test.pass(linkText + " Searched element found");
                } 
               else {
                    test.fail(linkText + " Searched element not found");
               }
           } else {
        	   WebElement data=driver.findElements(By.className("DataGridCell")).get(3);
               
               if (data.getText().contains(linkText)) {
                   test.pass(linkText + " Searched element found");
               } 
              else {
                   test.fail(linkText + " Searched element not found");
              }

            }
            // Clear the search box
            searchBox.clear();
            Thread.sleep(1000);
            demo.isempty(searchBox, linkText, test, driver);
        }
    }
    }

}









