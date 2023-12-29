package com.krystal.project;

import java.io.IOException;
import java.net.URL;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.windows.WindowsDriver;



public class UserMangementTest extends ReferencefileChemotheraphy{
 
	
	private UserManagementPOM user;
	private Actions act;
	private Actions action;

	@Test(priority =1)
	public void Launch()  throws InterruptedException, IOException {
	//DesiredCapabilities appCapabilities = new DesiredCapabilities();
	//appCapabilities.setCapability("app", "C:\\Program Files\\Panacea Medical Technologies\\Krystal\\Krystal.exe");
	//driver = new WindowsDriver<WebElement>(new URL("http://127.0.0.1:4723"), appCapabilities);
	ReferenceSigin Sign=new ReferenceSigin();
	Sign.Login(driver);
	Sign.UserManagement(driver);
	user=new UserManagementPOM(driver);
	action=new Actions(driver);
	act=new Actions(driver);
	}
	
	@Test(priority =1)
	public void ToverifyuserconfigurationLabel()  throws IOException{
	test = extent.createTest("==================USER CONFIGURATION================");
	test = extent.createTest(guiTestCaseName()+" : To verify the User Configuration label"," User Configuration label should be present ");	
	demo.Textcomparsion(user.UserConfigurationlbl, "User Configuration", test,driver);
	}
	

@Test(priority =3)
	public void ToverifyuseridLabel11() throws IOException {
	test = extent.createTest(guiTestCaseName()+" : To verify the User ID label"," User ID label should be present ");	
	demo.Textcomparsion(user.UserIdlbl, "User ID", test,driver);
	}
@Test(priority =4)
	public void ToverifyfirstNameLabel()  throws IOException{
	test = extent.createTest(guiTestCaseName()+" : To verify the First name label"," First name label should be present ");	
	demo.Textcomparsion(user.FNamelbl, "First Name", test,driver);
	}
@Test(priority =5)
	public void ToverifymiddleNameLabel()  throws IOException{
	test = extent.createTest(guiTestCaseName()+" : To verify the Middle name label"," Middle name label should be present ");	
	demo.Textcomparsion(user.MNamelbl, "Middle Name", test,driver);
	}
@Test(priority =6)
	public void ToverifylastNameLabel()  throws IOException{
	test = extent.createTest(guiTestCaseName()+" :To verify the Last name label"," Last name label should be present ");	
	demo.Textcomparsion(user.LNamelbl, "Last Name", test,driver);
	}
@Test(priority =7)
	public void ToverifypasswordLabel()  throws IOException{
	test = extent.createTest(guiTestCaseName()+" : To verify the Password label"," Password label should be present ");	
	demo.Textcomparsion(user.Passwordlbl, "Password", test,driver);
	}

@Test(priority =9)
	public void ToverifyconfirmpasswordLabel()  throws IOException{
	test = extent.createTest(guiTestCaseName()+" : To verify the Confirm Password label"," Confirm Password label should be present ");	
	demo.Textcomparsion(user.ConfirmPasswordlbl, "Confirm Password", test,driver);
	}

@Test(priority =11)
	public void ToverifyroleLabel12() throws InterruptedException, IOException {
	test = extent.createTest(guiTestCaseName()+" : To verify the Role label"," Role label should be present ");	
	act.moveToElement(user.Role).build().perform();
	act.moveByOffset(-150, -20).build().perform();
	Thread.sleep(2000);
	WebElement Role = driver.findElement(By.name("Role"));
	demo.Textcomparsion(Role, "Role", test,driver);
	}
@Test(priority =12)
	public void ToverifydesignationLabel1() throws InterruptedException, IOException {
	test = extent.createTest(guiTestCaseName()+" :To verify the designation label"," designation label should be present ");	
	act.moveToElement(user.Designation).build().perform();
	act.moveByOffset(-150, -20).build().perform();
	Thread.sleep(2000);
	WebElement Designation = driver.findElement(By.name("Designation"));
	demo.Textcomparsion(Designation, "Designation", test,driver);
	}
@Test(priority =13)
	public void ToverifystatusLabel()  throws IOException{
	test = extent.createTest(guiTestCaseName()+" : To verify the Status label"," Status label should be present ");	
	demo.Textcomparsion(user.Statuslbl, "Status", test,driver);
	}
@Test(priority =14)
	public void ToverifyactiveLabel()  throws IOException{
	test = extent.createTest(guiTestCaseName()+" : To verify the Active label"," Active label should be present ");	
	demo.Textcomparsion(user.Activelbl, "Active", test,driver);
	}
@Test(priority =15)
	public void ToverifyinactiveLabel()  throws IOException{
	test = extent.createTest(guiTestCaseName()+" : To verify the InActive label"," InActive label should be present ");	
	demo.Textcomparsion(user.Inactivelbl, "Inactive", test,driver);
	}
@Test(priority =16)
	public void ToverifysaveLabela() throws IOException {
	test = extent.createTest(guiTestCaseName()+" : To verify the Save label"," Save label should be present ");	
	demo.Textcomparsion(user.Save, "SAVE", test,driver);
	}
@Test(priority =17)
	public void ToverifyuserlistLabel()  throws IOException{
	test = extent.createTest("================USER LIST============");
	test = extent.createTest(guiTestCaseName()+" : To verify the User List label"," User List label should be present ");	
	demo.Textcomparsion(user.UserList, "User List", test,driver);
	}

@Test(priority =18)
	public void ToverifyuseridLabel()  throws IOException{
	test = extent.createTest(guiTestCaseName()+" : To verify the User ID label"," User ID label should be present ");	
	demo.Textcomparsion(user.UserId, "User ID", test,driver);
	}
@Test(priority =19)
	public void ToverifyfullnameLabel()  throws IOException{
	test = extent.createTest(guiTestCaseName()+" : To verify the Full name label"," Full name label should be present ");	
	
	demo.Textcomparsion(user.Fullname, "Full name", test,driver);
	}
@Test(priority =20)
	public void ToverifydesignationLabel12() throws IOException {
	test = extent.createTest(guiTestCaseName()+" : To verify the Designation label"," Designation label should be present ");	
	demo.Textcomparsion(user.Designationfield, "Designation", test,driver);
	}
@Test(priority =21)
	public void ToverifyroleLabel1() throws IOException {
	test = extent.createTest(guiTestCaseName()+" :To verify the Role label"," Role label should be present ");	
	demo.Textcomparsion(user.Rolelist, "Role", test,driver);
	}
@Test(priority =22)
	public void ToverifystatusLabel1() throws IOException {
	test = extent.createTest(guiTestCaseName()+" : To verify the status label"," Status label should be present ");	
	demo.Textcomparsion(user.Status, "Status", test,driver);
	}
@Test(priority =23)
	public void ToverifypreferredapridLabel()  throws IOException{
	test = extent.createTest(guiTestCaseName()+" :To verify the Preferred APR ID label","Preferred APR ID label should be present ");	
	demo.Textcomparsion(user.PreferredAPRID, "Preferred APR ID", test,driver);
	}
@Test(priority =24)
	public void ToverifypreferredaprcbctidLabel()  throws IOException{
	test = extent.createTest(guiTestCaseName()+" :To verify the Preferred APR CBCT ID label","Preferred APR CBCT ID label should be present ");	
	demo.Textcomparsion(user.PreferredAPRCBCTID, "Preferred APR CBCT ID", test,driver);
	}
@Test(priority =25)
	public void ToverifysearchuseridLabel1() throws IOException {
	test = extent.createTest("======================SEARCH USERID================");
	test = extent.createTest(guiTestCaseName()+" : To verify the Search User ID label"," Search User ID label should be present ");	
	demo.Textcomparsion(user.Searchboxidlbl, "Search User ID", test,driver);
	}
	
@Test(priority =26)
	public void ToverifyradiouseridLabel()  throws IOException{
	user.SearchMenuButtonicon.click();
	test = extent.createTest(guiTestCaseName()+" : To verify the Radio User ID label"," Radio User ID label should be present ");	
	demo.Textcomparsion(user.SearchMenuuserid, "User ID", test,driver);
	}
@Test(priority =27)
	public void ToverifyradiofullnameLabel()  throws IOException{
	test = extent.createTest(guiTestCaseName()+" : To verify the Radio full name label"," Radio Full Name label should be present ");	
	demo.Textcomparsion(user.SearchMenuusername, "Full Name", test,driver);
	}

@Test(priority =28)
	public void ToverifysearchfullnameLabel()  throws IOException{
	test = extent.createTest(guiTestCaseName()+" : To verify the Search full name label"," Search full name label should be present ");	
	user.SearchMenuButtonicon.click();
	user.SearchMenuusername.click();
	demo.Textcomparsion(user.Searchboxnamelbl, "Search Full Name", test,driver);
	}
	
// Note if Empty data is there we should not check this
@Test(priority =30)
	public void ToverifyupdateuserLabel()  throws IOException{
	int i=1;
	Iterator<WebElement> itr1 = user.List1.iterator();
	while (itr1.hasNext()) {
				WebElement li = itr1.next();
				System.out.println(li.getText() + "    "+i);
				if(i==1) {
				li.click();
				break;
				}
				
				i++;
			}
	test = extent.createTest("======================EDIT================");
	test = extent.createTest(guiTestCaseName()+" :To verify the Update User label"," Update user label should be present ");	
	demo.Textcomparsion(user.updateuserlbl, "Update User", test,driver);
	}

@Test(priority =32)
	public void ToverifyuseridLabel1() throws IOException, InterruptedException {
	test = extent.createTest(guiTestCaseName()+" :To verify the user ID label","User ID label should be present ");	
	demo.Textcomparsion(user.EUserIdlbl, "User ID", test,driver);
	Thread.sleep(1000);
	}
@Test(priority =33)
	public void ToverifyfullnameLabel1() throws IOException {
	test = extent.createTest(guiTestCaseName()+" : To verify the Full Name label","Full Name label should be present ");	
	demo.isdisplayed(user.EFnamelbl, "Full Name", test,driver);
	}
@Test(priority =34)
	public void ToverifymiddlenameLabel()  throws IOException{
	test = extent.createTest(guiTestCaseName()+" : To verify the Middle Name label","Middle Name label should be present ");	
	demo.Textcomparsion(user.EMnamelbl, "Middle Name", test,driver);
	}
@Test(priority =35)
	public void ToverifymiddlenameLabel1() throws IOException {
	test = extent.createTest(guiTestCaseName()+" : To verify the last Name label","last Name label should be present ");	
	demo.Textcomparsion(user.ELnamelbl, "Last Name", test,driver);
	}
@Test(priority =36)
	public void ToverifyroleLabel()  throws IOException,InterruptedException {
	test = extent.createTest(guiTestCaseName()+" : To verify the Role label"," Role label should be present ");	
	act.moveToElement(user.Role).build().perform();
	act.moveByOffset(-150, -20).build().perform();
	Thread.sleep(2000);
	WebElement Role = driver.findElement(By.name("Role"));
	demo.isdisplayed(Role, "Role", test,driver);
	}

@Test(priority =37)
	public void ToverifydesignationLabel()  throws IOException, InterruptedException {
	test = extent.createTest(guiTestCaseName()+" : To verify the Designation label"," Designation label should be present ");	
	act.moveToElement(user.Designation).build().perform();
	act.moveByOffset(-150, -20).build().perform();
	Thread.sleep(2000);
	WebElement Designation = driver.findElement(By.name("Designation"));
	demo.isdisplayed(Designation, "Designation", test,driver);
	}
@Test(priority =38)
	public void ToverifystatusLabel11() throws IOException {
	test = extent.createTest(guiTestCaseName()+" : To verify the status label"," Status label should be present ");	
	demo.Textcomparsion(user.EStatuslbl, "Status", test,driver);
	}
@Test(priority =39)
	public void ToverifyactiveLabel1() throws IOException {
	test = extent.createTest(guiTestCaseName()+" :To verify the Active label"," Active label should be present ");	
	demo.Textcomparsion(user.EActivelbl, "Active", test,driver);
	}
@Test(priority =40)
	public void ToverifyinactiveLabel1() throws IOException {
	test = extent.createTest(guiTestCaseName()+" : To verify the InActive label"," InActive label should be present ");	
	demo.Textcomparsion(user.EInactivelbl, "Inactive", test,driver);
	}
@Test(priority =41)
	public void ToverifyupdateLabel()  throws IOException{
	test = extent.createTest(guiTestCaseName()+" : To verify the Update label"," Update label should be present ");	
	demo.Textcomparsion(user.Eupdatelbl, "UPDATE", test,driver);
	}
@Test(priority =42)
	public void Toverifyresetpassword1Label()  throws IOException {
	test = extent.createTest(guiTestCaseName()+" : To verify the Reset Password label"," Reset Password label should be present ");	
	demo.Textcomparsion(user.EResetpasswordlbl, "RESET PASSWORD", test,driver);
}	

	}
