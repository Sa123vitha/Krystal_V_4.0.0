package com.krystal.project;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.appium.java_client.windows.WindowsDriver;

public class UserManagementPOM {

	
	private Actions act;

	public UserManagementPOM(WindowsDriver<WebElement> driver)
	{
		PageFactory.initElements(driver, this);
		act = new Actions(driver);
	}
	
	
	//GUI
	@FindBy(name="User Management")
	  WebElement UserManagementlbl;
	
	
	
	@CacheLookup
	@FindBy(xpath="//Custom[@ClassName=\"UserManagementMainView\"]/Custom[@ClassName=\"UserManagementSection1View\"]/Pane[@ClassName=\"ScrollViewer\"]/Button[@ClassName=\"Button\"][@Name=\"User Configuration\"]")
	WebElement UserConfigurationlbl;
	
	@FindBy(xpath="//Custom[@ClassName=\"UserManagementMainView\"]/Custom[@ClassName=\"UserManagementSection1View\"]/Pane[@ClassName=\"ScrollViewer\"]/Edit[@ClassName=\"TextBox\"]/Text[@Name=\"User ID\"][@AutomationId=\"LblName\"]/Text[@ClassName=\"TextBlock\"][@Name=\"User ID\"]")  
	WebElement UserIdlbl;

	@FindBy(xpath="//Custom[@ClassName=\"UserManagementMainView\"]/Custom[@ClassName=\"UserManagementSection1View\"]/Pane[@ClassName=\"ScrollViewer\"]/Edit[@ClassName=\"TextBox\"]/Text[@Name=\"First Name\"][@AutomationId=\"LblName\"]/Text[@ClassName=\"TextBlock\"][@Name=\"First Name\"]")
	  WebElement FNamelbl;
	
	@FindBy(xpath="//Custom[@ClassName=\"UserManagementMainView\"]/Custom[@ClassName=\"UserManagementSection1View\"]/Pane[@ClassName=\"ScrollViewer\"]/Edit[@ClassName=\"TextBox\"]/Text[@Name=\"Middle Name\"][@AutomationId=\"LblName\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Middle Name\"]")
	  WebElement MNamelbl;
	
	@FindBy(xpath="//Custom[@ClassName=\"UserManagementMainView\"]/Custom[@ClassName=\"UserManagementSection1View\"]/Pane[@ClassName=\"ScrollViewer\"]/Edit[@ClassName=\"TextBox\"]/Text[@Name=\"Last Name\"][@AutomationId=\"LblName\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Last Name\"]")
	  WebElement LNamelbl;
	
	@FindBy(xpath="//Custom[@ClassName=\"UserManagementMainView\"]/Custom[@ClassName=\"UserManagementSection1View\"]/Pane[@ClassName=\"ScrollViewer\"]/Edit[@AutomationId=\"NewPassword\"]/Text[@Name=\"Password\"][@AutomationId=\"LblName\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Password\"]")
	  WebElement Passwordlbl;
	
	@FindBy(xpath="//Custom[@ClassName=\"UserManagementMainView\"]/Custom[@ClassName=\"UserManagementSection1View\"]/Pane[@ClassName=\"ScrollViewer\"]/Edit[@AutomationId=\"ConfirmNewPassword\"]/Text[@Name=\"Confirm Password\"][@AutomationId=\"LblName\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Confirm Password\"]")
	  WebElement ConfirmPasswordlbl;
	
	@FindBy(xpath="Role")
	  WebElement Rolelbl;
	
	@FindBy(xpath="Designation")
	  WebElement Designationlbl;
	
	@FindBy(xpath="//Custom[@ClassName=\"UserManagementMainView\"]/Custom[@ClassName=\"UserManagementSection1View\"]/Pane[@ClassName=\"ScrollViewer\"]/Text[@ClassName=\"Text\"][@Name=\"Status\"]/Text[@Name=\"Status\"][@AutomationId=\"Label\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Status\"]")
	  WebElement Statuslbl;
	
	@FindBy(xpath="//Custom[@ClassName=\"UserManagementMainView\"]/Custom[@ClassName=\"UserManagementSection1View\"]/Pane[@ClassName=\"ScrollViewer\"]/RadioButton[@ClassName=\"RadioButton\"][@Name=\"Active\"]/Text[@Name=\"Active\"][@AutomationId=\"RadioLabel\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Active\"]")
	  WebElement Activelbl;
	
	@FindBy(xpath="//Custom[@ClassName=\"UserManagementMainView\"]/Custom[@ClassName=\"UserManagementSection1View\"]/Pane[@ClassName=\"ScrollViewer\"]/RadioButton[@ClassName=\"RadioButton\"][@Name=\"Inactive\"]/Text[@Name=\"Inactive\"][@AutomationId=\"RadioLabel\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Inactive\"]")
	  WebElement Inactivelbl;
	
	
	@FindBy(name="User List")
	  WebElement UserList;
	
	@FindBy(name="User ID")
	  WebElement UserId;
	
	@FindBy(name="Full name")
	  WebElement Fullname;
	
	@FindBy(name="Designation")
	  WebElement Designationfield;
	
	@FindBy(name="Role")
	  WebElement Rolelist;
	
	@FindBy(name="Status")
	  WebElement Status;
	
	@FindBy(name="Preferred APR ID")
	  WebElement PreferredAPRID;
	
	@FindBy(name="Preferred APR CBCT ID")
	  WebElement PreferredAPRCBCTID;
	
	
	@FindBy(name="Search Full Name")
	  WebElement Searchboxnamelbl;
	
	@FindBy(name="Search User ID")
	  WebElement Searchboxidlbl;
	
	@FindBy(xpath="//Window[@ClassName=\"Popup\"]/Menu[@ClassName=\"ContextMenu\"]/RadioButton[@ClassName=\"RadioButton\"][@Name=\"User ID\"]/Text[@Name=\"User ID\"][@AutomationId=\"RadioLabel\"]/Text[@ClassName=\"TextBlock\"][@Name=\"User ID\"]")
	  WebElement Useridradiobtnlbl;
	
	@FindBy(xpath="//Window[@ClassName=\"Popup\"]/Menu[@ClassName=\"ContextMenu\"]/RadioButton[@ClassName=\"RadioButton\"][@Name=\"Full Name\"]/Text[@Name=\"Full Name\"][@AutomationId=\"RadioLabel\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Full Name\"]")
	  WebElement Fnameradiobtnlbl;
	
	@FindBy(xpath="//Custom[@ClassName=\"UserManagementMainView\"]/Custom[@ClassName=\"UserManagementSection2View\"]/Button[@AutomationId=\"SearchMenuButton\"]")
	  WebElement SearchMenuButtonicon;
	
	@FindBy(xpath="//Window[@ClassName=\"Popup\"]/Menu[@ClassName=\"ContextMenu\"]/RadioButton[@ClassName=\"RadioButton\"][@Name=\"User ID\"]/Text[@Name=\"User ID\"][@AutomationId=\"RadioLabel\"]/Text[@ClassName=\"TextBlock\"][@Name=\"User ID\"]")
	  WebElement SearchMenuuserid;
	
	@FindBy(xpath="//Window[@ClassName=\"Popup\"]/Menu[@ClassName=\"ContextMenu\"]/RadioButton[@ClassName=\"RadioButton\"][@Name=\"Full Name\"]/Text[@Name=\"Full Name\"][@AutomationId=\"RadioLabel\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Full Name\"]")
	  WebElement SearchMenuusername;
	
	@FindBy(xpath="//Custom[@ClassName=\"UserManagementMainView\"]/Custom[@ClassName=\"UserManagementSection3View\"]/Button[@ClassName=\"Button\"][@Name=\"Update User\"]")
	  WebElement updateuserlbl;
	
	@FindBy(xpath="//Custom[@ClassName=\"UserManagementMainView\"]/Custom[@ClassName=\"UserManagementSection3View\"]/Edit[@ClassName=\"TextBox\"]/Text[@Name=\"User ID\"][@AutomationId=\"LblName\"]/Text[@ClassName=\"TextBlock\"][@Name=\"User ID\"]")
	  WebElement EUserIdlbl;
	
	@FindBy(xpath="//Custom[@ClassName=\"UserManagementMainView\"]/Custom[@ClassName=\"UserManagementSection3View\"]/Edit[@ClassName=\"TextBox\"]/Text[@Name=\"Full Name\"][@AutomationId=\"LblName\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Full Name\"]")
	  WebElement EFnamelbl;
	
	@FindBy(xpath="//Custom[@ClassName=\"UserManagementMainView\"]/Custom[@ClassName=\"UserManagementSection3View\"]/Edit[@ClassName=\"TextBox\"]/Text[@Name=\"Middle Name\"][@AutomationId=\"LblName\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Middle Name\"]")
	  WebElement EMnamelbl;
	
	@FindBy(xpath="//Custom[@ClassName=\"UserManagementMainView\"]/Custom[@ClassName=\"UserManagementSection3View\"]/Edit[@ClassName=\"TextBox\"]/Text[@Name=\"Last Name\"][@AutomationId=\"LblName\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Last Name\"]")
	  WebElement ELnamelbl;
	
	@FindBy(xpath="//Custom[@ClassName=\"UserManagementMainView\"]/Custom[@ClassName=\"UserManagementSection3View\"]/Text[@ClassName=\"Text\"][@Name=\"Status\"]/Text[@Name=\"Status\"][@AutomationId=\"Label\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Status\"]")
	  WebElement EStatuslbl;
	
	@FindBy(xpath="//Custom[@ClassName=\"UserManagementMainView\"]/Custom[@ClassName=\"UserManagementSection3View\"]/RadioButton[@ClassName=\"RadioButton\"][@Name=\"Active\"]/Text[@Name=\"Active\"][@AutomationId=\"RadioLabel\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Active\"]")
	  WebElement EActivelbl;
	
	@FindBy(xpath="//Custom[@ClassName=\"UserManagementMainView\"]/Custom[@ClassName=\"UserManagementSection3View\"]/RadioButton[@ClassName=\"RadioButton\"][@Name=\"Inactive\"]/Text[@Name=\"Inactive\"][@AutomationId=\"RadioLabel\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Inactive\"]")
	  WebElement EInactivelbl;
	
	@FindBy(xpath="//Custom[@ClassName=\"UserManagementMainView\"]/Custom[@ClassName=\"UserManagementSection3View\"]/Button[@ClassName=\"Button\"][@Name=\"UPDATE\"]")
	  WebElement Eupdatelbl;
	
	@FindBy(xpath="//Custom[@ClassName=\"UserManagementMainView\"]/Custom[@ClassName=\"UserManagementSection3View\"]/Button[@ClassName=\"Button\"][@Name=\"RESET PASSWORD\"]")
	  WebElement EResetpasswordlbl;
	
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"MessageWindow\"]/Pane[@ClassName=\"ScrollViewer\"][@Name=\"User added with selected credentials.\"]/Text[@Name=\"User added with selected credentials.\"][@AutomationId=\"txtblockmessage\"]")
	  WebElement WSaveDescription;
	
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"MessageWindow\"]/Pane[@ClassName=\"ScrollViewer\"][@Name=\"Selected User Details updated.\"]/Text[@Name=\"Selected User Details updated.\"][@AutomationId=\"txtblockmessage\"]")
	  WebElement WUpdateDescription;
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"MessageWindow\"]/Pane[@ClassName=\"ScrollViewer\"][@Name=\"Password has been reset for the selected user.\"]/Text[@Name=\"Password has been reset for the selected user.\"][@AutomationId=\"txtblockmessage\"]")
	  WebElement WResetDescription;
	
	@FindBy(name="User Add")
	  WebElement WUserSave;
	
	@FindBy(name="User Update")
	  WebElement WUserUpdate;
	//
	@FindBy(name="Password Reset")
	  WebElement WUserPwdReset;
	
	
	
	//Functionalities


	
	@FindBy(xpath = "//Custom[@ClassName=\"UserManagementMainView\"]//Pane[@ClassName=\"ScrollViewer\"]/Button[starts-with(@AutomationId,\"BtnMoreAdd\")]")
	@CacheLookup
	WebElement AddUser;		
			
	@FindBy(xpath = "//Edit[@ClassName=\"TextBox\"][1]")
	@CacheLookup
	WebElement User_ID;
	
	@FindBy(xpath = "//Edit[@ClassName=\"TextBox\"][2]")
	@CacheLookup
	WebElement FName;
	
	@FindBy(xpath = "//Edit[@ClassName=\"TextBox\"][3]")
	@CacheLookup
	WebElement MName;
	
	@FindBy(xpath = "//Edit[@ClassName=\"TextBox\"][4]")
	@CacheLookup
	WebElement LName;
	
	@FindBy(xpath = "//Edit[@AutomationId=\"NewPassword\"]")
	@CacheLookup
	WebElement Password;
	
	@FindBy(xpath = "//Edit[@AutomationId=\"ConfirmNewPassword\"]")
	@CacheLookup
	WebElement Confirmpassword;
	
	
	 ArrayList<String>Roles;
	@FindBy(xpath ="//ComboBox[@ClassName=\"ComboBox\"][1]" )
	@CacheLookup
	WebElement Role;
	  
	 ArrayList<String>Designations;
	 @FindBy(xpath ="//ComboBox[@ClassName=\"ComboBox\"][2]" )
	 @CacheLookup
	 WebElement Designation;
	
	 ArrayList<String>PreferredAprIds;
	 @FindBy(xpath ="//ComboBox[@ClassName=\"ComboBox\"][3]" )
	 @CacheLookup
	 WebElement PreferredAprId;
	
	
	 ArrayList<String>PreferredAprCBCTIds;
	 @FindBy(xpath ="//ComboBox[@ClassName=\"ComboBox\"][4]" )
	 @CacheLookup
	 WebElement PreferredAprCBCTId;
	
	@FindBy(xpath ="//RadioButton[@ClassName=\"RadioButton\"][@Name=\"Active\"]" )	 
	@CacheLookup
	WebElement Active;
	
	@FindBy(xpath ="//RadioButton[@ClassName=\"RadioButton\"][@Name=\"Inactive\"]" )
	@CacheLookup
	WebElement Inactive;
	
	@FindBy(xpath ="//Button[@Name=\"SAVE\"][@AutomationId=\"BtnValidate\"]")
	WebElement Save;
	
	@FindBy(xpath ="//Window[@ClassName=\"Window\"][@Name=\"MessageWindow\"]/Button[@Name=\"OK\"][starts-with(@AutomationId,\"successButton\")]")
	WebElement Wok;
	
	
	@FindBy(xpath = "//Edit[@ClassName=\"TextBox\"][1]")
	WebElement User_ID1;
	
	@FindBy(xpath = "//Edit[@ClassName=\"TextBox\"][2]")
	WebElement FName1;
	
	@FindBy(xpath = "//Edit[@ClassName=\"TextBox\"][3]")
	WebElement MName1;
	
	@FindBy(xpath = "//Edit[@ClassName=\"TextBox\"][4]")
	WebElement LName1;
	
	@FindBy(xpath = "//Edit[@AutomationId=\"NewPassword\"]")
	WebElement Password1;
	
	@FindBy(xpath = "//Edit[@AutomationId=\"ConfirmNewPassword\"]")
	WebElement Confirmpassword1;
	
	@FindBy(xpath ="//ComboBox[@ClassName=\"ComboBox\"][1]" )
	WebElement Role1;
	  
	 @FindBy(xpath ="//ComboBox[@ClassName=\"ComboBox\"][2]" )
	 WebElement Designation1;
	
	 @FindBy(xpath ="//ComboBox[@ClassName=\"ComboBox\"][3]" )
	WebElement PreferredAprId1;
	
	 @FindBy(xpath ="//ComboBox[@ClassName=\"ComboBox\"][4]" )
	WebElement PreferredAprCBCTId1;
	
	@FindBy(xpath ="//RadioButton[@ClassName=\"RadioButton\"][@Name=\"Active\"]" )	 
	WebElement Active1;
	
	@FindBy(xpath ="//RadioButton[@ClassName=\"RadioButton\"][@Name=\"Inactive\"]" )
	WebElement Inactive1;
	
	@FindBy(xpath ="//Button[@Name=\"SAVE\"][@AutomationId=\"BtnValidate\"]")
	WebElement Save1;
	
	
	@FindBy(xpath ="//Custom[@ClassName=\"UserManagementMainView\"]/Custom[@ClassName=\"UserManagementSection2View\"]/DataGrid[@ClassName=\"DataGrid\"]/DataItem[@ClassName=\"DataGridRow\"][@Name=\"Presentation.UiElements.ViewModels.TableViewModel\"]/Custom[@ClassName=\"DataGridCell\"]")
	 List<WebElement> List1;
	
	@FindBy(xpath ="//Custom[@ClassName=\"UserManagementMainView\"]/Custom[@ClassName=\"UserManagementSection2View\"]/DataGrid[@ClassName=\"DataGrid\"]/DataItem[@ClassName=\"DataGridRow\"][@Name=\"Presentation.UiElements.ViewModels.TableViewModel\"]/Custom[@ClassName=\"DataGridCell\"][starts-with(@Name,\"Item: Presentation.UiElements.ViewModels.TableViewModel, Column \")]/Button[@ClassName=\"Button\"][2]")
	WebElement Edit;
	
	
	@FindBy(xpath ="//Custom[@ClassName=\"UserManagementMainView\"]/Custom[@ClassName=\"UserManagementSection3View\"]/Button[@ClassName=\"Button\"][@Name=\"UPDATE\"]")
	WebElement Update1;
	
	@FindBy(xpath ="//Custom[@ClassName=\"UserManagementMainView\"]/Custom[@ClassName=\"UserManagementSection3View\"]/Button[@ClassName=\"Button\"][@Name=\"RESET PASSWORD\"]")
	WebElement ResetPassword1;
	
	@FindBy(name="UPDATE")
	  WebElement Update;
	
	
	@FindBy(name="RESET PASSWORD")
	  WebElement ResetPassword;
	

	@FindBy(xpath ="//Edit[@ClassName=\"TextBox\"]/Edit[starts-with(@AutomationId,\"presenter\")]")
	@CacheLookup
	WebElement Search;
	
	
	@FindBy(xpath ="//Custom[@ClassName=\"UserManagementMainView\"]/Custom[@ClassName=\"UserManagementSection2View\"]/Button[@ClassName=\"Button\"][@Name=\"First\"]")
	@CacheLookup
	WebElement First;
	
	@FindBy(xpath ="//Custom[@ClassName=\"UserManagementMainView\"]/Custom[@ClassName=\"UserManagementSection2View\"]/Button[@ClassName=\"Button\"][@Name=\"Previous\"]")
	@CacheLookup
	WebElement Previous;
	
	
	@FindBy(xpath ="//Custom[@ClassName=\"UserManagementMainView\"]/Custom[@ClassName=\"UserManagementSection2View\"]/Text[@ClassName=\"Text\"][1]")
	@CacheLookup
	WebElement Page;
	
	@FindBy(xpath ="//Custom[@ClassName=\"UserManagementMainView\"]/Custom[@ClassName=\"UserManagementSection2View\"]/Text[@ClassName=\"Text\"][2]")
	@CacheLookup
	WebElement One;
	
	@FindBy(xpath ="//Custom[@ClassName=\"UserManagementMainView\"]/Custom[@ClassName=\"UserManagementSection2View\"]/Text[@ClassName=\"Text\"][3]")
	@CacheLookup
	WebElement of;
	
	@FindBy(xpath ="//Custom[@ClassName=\"UserManagementMainView\"]/Custom[@ClassName=\"UserManagementSection2View\"]/Text[@ClassName=\"Text\"][4]")
	@CacheLookup
	WebElement one1;
	
	@FindBy(xpath ="//Custom[@ClassName=\"UserManagementMainView\"]/Custom[@ClassName=\"UserManagementSection2View\"]/Button[@ClassName=\"Button\"][@Name=\"Next\"]")
	@CacheLookup
	WebElement Next;
	
	@FindBy(xpath ="//Custom[@ClassName=\"UserManagementMainView\"]/Custom[@ClassName=\"UserManagementSection2View\"]/Button[@ClassName=\"Button\"][@Name=\"Last\"]")
	@CacheLookup
	WebElement Last;

	//Warning Messages
	
	//UserId
	@FindBy(xpath ="//Pane[@ClassName=\"ScrollViewer\"]/Edit[@ClassName=\"TextBox\"]/Text[@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"]")
	
	List<WebElement> warnmsg;// User iD =0 and first Name=1 index values
	@FindBy(xpath ="//Custom[@ClassName=\"UserManagementSection1View\"]/Pane[@ClassName=\"ScrollViewer\"]/Edit[@AutomationId=\"NewPassword\"]/Text[@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"]")
	@CacheLookup
	WebElement NewPassword;

	@FindBy(xpath ="//Custom[@ClassName=\"UserManagementSection1View\"]/Pane[@ClassName=\"ScrollViewer\"]/Edit[@AutomationId=\"ConfirmNewPassword\"]/Text[@AutomationId=\"LblResult\"]/Text[@ClassName=\"TextBlock\"]")
	@CacheLookup
	WebElement Cpassword;

	
	@FindBy(name="Input cannot be blank")
	  WebElement InputBlank;
	
	@FindBy(xpath = "//TextBlock[contains(@Name, 'Select Any Role')]")
	
	  WebElement SelectAnyRole;
	
	@FindBy(name="Select Any Designation")
	  WebElement SelectAnyDesignation;
	
	@FindBy(name="Select Any APR ID")
	  WebElement SelectAnyAprId;
	
	@FindBy(name="Select Any APR CBCT ID")
	  WebElement SelectAnyAprCBCTId;
	
	@FindBy(name="Select Any Status")
	  WebElement SelectAnyStatus;
	
	@FindBy(name="Input Character Min 6")
	  WebElement Inputchar;
	
	@FindBy(name="User ID already exists")
	  WebElement UserIDexits;
	
	@FindBy(name="User Name already exists")
	  WebElement UserNameexits;
	
	@FindBy(xpath = "//TextBlock[contains(@Name, 'User Name already exists')]")                
	 WebElement UserNameexits1;
	
	
	@FindBy(name="User Inactive Mode.")
	  WebElement UserInactive;
	
	
	@FindBy(xpath ="//Button[@HelpText=\"Show Password\"][1]")
	@CacheLookup
	WebElement UserPwdEye;
	
	@FindBy(xpath ="//Button[@HelpText=\"Show Password\"][2]")
	@CacheLookup
	WebElement UserCPwdEye;
	
	
	@FindBy (xpath = "//Button[@HelpText=\"Reset\"]")
	 WebElement Reset;
	
	@FindBy (xpath = "//TextBlock[@Name=\"Full Name\"]")
	 WebElement Fullnametext;
	
	@FindBy (xpath = "//TextBlock[@Name=\"Role\"]")
	 WebElement Roletext;
	
	@FindBy (xpath = "//TextBlock[@Name=\"Designation\"]")
	 WebElement DesignationText;

	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Edit[@AutomationId=\"PwdBoxUserPassword\"]")
	WebElement Pswdbox;
	
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Edit[@AutomationId=\"TxtbxUsername\"]")
	WebElement Userbx;
	@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Button[@Name=\"SIGN IN\"][@AutomationId=\"BtnValidate\"]")
	WebElement SigninButton;
	
	
	@FindBy(className = "Thumb")
	public static
	WebElement Dropdownscroll;
	
	@FindBy(className = "ListBoxItem")
	public static
	List<WebElement> Dropdown;
	
	@FindBy (name = "Patient List")
	 WebElement TreatmentPlan;
	
     @FindBy(xpath = "//Button[contains(@HelpText, 'Sign Out')]")                
	 WebElement Signout;


      	@FindBy(name = "First")
      	WebElement FirstPageButton;
      	
      	@FindBy(name = "Previous")
      	WebElement PreviousPageButton;
      	
      	@FindBy(name = "Next")
      	WebElement NextPageButton;
      	
      	@FindBy(name = "Last")
      	WebElement LastPageButton;
      	
      	@FindBy(name = "Page")
      	WebElement PageButton;
      	
      	@FindBy(name ="1" )
      	WebElement Onelabel;
      	
      	@FindBy(name = "of")
      	WebElement oflabel;
      	
      	@FindBy(name = "2")
      	WebElement oftwo;



















}
