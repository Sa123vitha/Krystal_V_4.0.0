package com.krystal.project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.appium.java_client.windows.WindowsDriver;

public class APRCbctPOM extends ReferencefileChemotheraphy {
 
	public APRCbctPOM(WindowsDriver<WebElement> driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(name = "General Settings")
	WebElement general;
	
	@FindBy(name = "APR CBCT CONFIGURATION")
	WebElement aprcbctconfig;
	
	@FindBy(name = "APR CBCT ID")
	WebElement aprcbctid;
	
	@FindBy(name = "APR Site List")
	WebElement aprsitelist;
	
	@FindBy(name = "SAVE")
	WebElement Save;
	
	@FindBy(name = "UPDATE")
	WebElement Update;
	
	
	@FindBy(name = "APR Patient Size")
	WebElement aprpatientsize1;
	
	//@FindBy(xpath = "//Custom[@ClassName=\"APRSettingsMainView\"]/Custom[@ClassName=\"APRSettingsSection1View\"]/DataGrid[@ClassName=\"DataGrid\"]/Header[@AutomationId=\"PART_ColumnHeadersPresenter\"]/HeaderItem[@ClassName=\"DataGridColumnHeader\"][@Name=\"Patient Size\"]/Text[@Name=\"Patient Size\"][@AutomationId=\"Label\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Patient Size\"]")
			@FindBy(name = "Patient Size")
			WebElement patientsize;
			
			//@FindBy(xpath = "//Custom[@ClassName=\"APRSettingsMainView\"]/Custom[@ClassName=\"APRSettingsSection1View\"]/DataGrid[@ClassName=\"DataGrid\"]/DataItem[@ClassName=\"DataGridRow\"][@Name=\"APRSettingsSection1.Models.ListPendingViewModel\"]/Custom[@ClassName=\"DataGridCell\"][@Name=\"Pediatric\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Pediatric\"]")
			@FindBy(name = "Pediatric")
			WebElement paediatric;
		
			//@FindBy(xpath = "//Custom[@ClassName=\"APRSettingsMainView\"]/Custom[@ClassName=\"APRSettingsSection1View\"]/DataGrid[@ClassName=\"DataGrid\"]/DataItem[@ClassName=\"DataGridRow\"][@Name=\"APRSettingsSection1.Models.ListPendingViewModel\"]/Custom[@ClassName=\"DataGridCell\"][@Name=\"Small\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Small\"]")
			@FindBy(name = "Small")
			WebElement small;
			
			//@FindBy(xpath = "//Custom[@ClassName=\"APRSettingsMainView\"]/Custom[@ClassName=\"APRSettingsSection1View\"]/DataGrid[@ClassName=\"DataGrid\"]/DataItem[@ClassName=\"DataGridRow\"][@Name=\"APRSettingsSection1.Models.ListPendingViewModel\"]/Custom[@ClassName=\"DataGridCell\"][@Name=\"Medium\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Medium\"]")
			@FindBy(name = "Medium")
			WebElement medium;
			
			//@FindBy(xpath = "//Custom[@ClassName=\"APRSettingsMainView\"]/Custom[@ClassName=\"APRSettingsSection1View\"]/DataGrid[@ClassName=\"DataGrid\"]/DataItem[@ClassName=\"DataGridRow\"][@Name=\"APRSettingsSection1.Models.ListPendingViewModel\"]/Custom[@ClassName=\"DataGridCell\"][@Name=\"Large\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Large\"]")
			@FindBy(name = "Large")
			WebElement large;
			
			//@FindBy(xpath = "//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"APRSettingsMainView\"]/Custom[@ClassName=\"APRSettingsSection1View\"]/ComboBox[@ClassName=\"ComboBox\"][1]")
			@FindBy(name = "kV")
			WebElement kv;
			
			//@FindBy(xpath="//Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"APRSettingsMainView\"]/Custom[@ClassName=\"APRSettingsSection1View\"]/ComboBox[@ClassName=\"ComboBox\"][1]")
			
			
			
			
			//@FindBy(xpath = "//Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"APRSettingsMainView\"]/Custom[@ClassName=\"APRSettingsSection1View\"]/ComboBox[@ClassName=\"ComboBox\"][2]")
			@FindBy(name = "mA")
			WebElement ma;
			
			//@FindBy(xpath = "//Custom[@ClassName=\"GeneralSettingsMainView\"]/Custom[@ClassName=\"APRSettingsMainView\"]/Custom[@ClassName=\"APRSettingsSection1View\"]/ComboBox[@ClassName=\"ComboBox\"][3]")
			@FindBy(name = "ms")
			WebElement ms;	
    
    @FindBy(xpath = "APR Fan Selection")
    WebElement aprfanselection;
    
    @FindBy(xpath = "Fan Type")
    WebElement fantype;
    
    @FindBy(xpath = "Half Fan")
    WebElement halffan;
    
    @FindBy(xpath = "Full Fan")
    WebElement fullfan;
	
    @FindBy(xpath = "No Fan")
    WebElement nofan;
    
    
    
    @FindBy(xpath = "//Custom[@ClassName=\"APRCBCTSettingsMainView\"]/Custom[@ClassName=\"APRCBCTSettingsSection1View\"]/ComboBox[@ClassName=\"ComboBox\"][4]")
    WebElement framerate;
    
    @FindBy(xpath = "//Custom[@ClassName=\"APRCBCTSettingsMainView\"]/Custom[@ClassName=\"APRCBCTSettingsSection1View\"]/ComboBox[@ClassName=\"ComboBox\"][5]")
    WebElement tube;
    
    @FindBy(xpath = "//Custom[@ClassName=\"APRCBCTSettingsMainView\"]/Custom[@ClassName=\"APRCBCTSettingsSection1View\"]/Edit[@ClassName=\"TextBox\"]/Text[@Name=\"Gantry Speed (deg/sec)\"][@AutomationId=\"LblName\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Gantry Speed (deg/sec)\"]")
    WebElement gantryspeed;
    
    @FindBy(xpath = "//Custom[@ClassName=\"APRCBCTSettingsMainView\"]/Custom[@ClassName=\"APRCBCTSettingsSection1View\"]/Edit[@ClassName=\"TextBox\"]/Text[@Name=\"Scan Start Angle (deg)\"][@AutomationId=\"LblName\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Scan Start Angle (deg)\"]")
    WebElement scanstartangle;
    
    @FindBy(xpath = "//Custom[@ClassName=\"APRCBCTSettingsMainView\"]/Custom[@ClassName=\"APRCBCTSettingsSection1View\"]/Edit[@ClassName=\"TextBox\"]/Text[@Name=\"Scan Stop Angle (deg)\"][@AutomationId=\"LblName\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Scan Stop Angle (deg)\"]")
    WebElement scanstopangle;
    
    @FindBy(xpath = "//Custom[@ClassName=\"APRCBCTSettingsMainView\"]/Custom[@ClassName=\"APRCBCTSettingsSection1View\"]/Edit[@ClassName=\"TextBox\"]/Text[@Name=\"Dose (cGy)\"][@AutomationId=\"LblName\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Dose (cGy)\"]")
    WebElement dosecgy;
    
    @FindBy(xpath = "//Custom[@ClassName=\"APRCBCTSettingsMainView\"]/Custom[@ClassName=\"APRCBCTSettingsSection2View\"]/Button[@ClassName=\"Button\"][@Name=\"APR CBCT LIST\"]")
    WebElement aprcbctlist;
    
    @FindBy(xpath = "//Custom[@ClassName=\"APRCBCTSettingsMainView\"]/Custom[@ClassName=\"APRCBCTSettingsSection2View\"]/ComboBox[@ClassName=\"ComboBox\"]")
    WebElement selectmachine;
    
    @FindBy(xpath = "//Custom[@ClassName=\"APRCBCTSettingsMainView\"]/Custom[@ClassName=\"APRCBCTSettingsSection2View\"]/Edit[@ClassName=\"TextBox\"]/Edit[starts-with(@AutomationId,\"presenter\")]")
    WebElement searchaprcbctid;
    
    @FindBy(xpath = "//Custom[@ClassName=\"APRCBCTSettingsMainView\"]/Custom[@ClassName=\"APRCBCTSettingsSection2View\"]/DataGrid[@ClassName=\"DataGrid\"]/Header[@AutomationId=\"PART_ColumnHeadersPresenter\"]/HeaderItem[@ClassName=\"DataGridColumnHeader\"][@Name=\"APR CBCT ID\"]/Text[@Name=\"APR CBCT ID\"][@AutomationId=\"Label\"]/Text[@ClassName=\"TextBlock\"][@Name=\"APR CBCT ID\"]")
    WebElement aprcbctidlist;
    
    @FindBy(xpath = "//Custom[@ClassName=\"APRCBCTSettingsMainView\"]/Custom[@ClassName=\"APRCBCTSettingsSection2View\"]/DataGrid[@ClassName=\"DataGrid\"]/Header[@AutomationId=\"PART_ColumnHeadersPresenter\"]/HeaderItem[@ClassName=\"DataGridColumnHeader\"][@Name=\"Created Date\"]/Text[@Name=\"Created Date\"][@AutomationId=\"Label\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Created Date\"]")
    WebElement createddate;
    
    @FindBy(xpath = "//Custom[@ClassName=\"APRCBCTSettingsMainView\"]/Custom[@ClassName=\"APRCBCTSettingsSection2View\"]/DataGrid[@ClassName=\"DataGrid\"]/Header[@AutomationId=\"PART_ColumnHeadersPresenter\"]/HeaderItem[@ClassName=\"DataGridColumnHeader\"][@Name=\"Modified Date\"]/Text[@Name=\"Modified Date\"][@AutomationId=\"Label\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Modified Date\"]")
    WebElement modifieddate;
    
    @FindBy(xpath = "//Custom[@ClassName=\"APRCBCTSettingsMainView\"]/Custom[@ClassName=\"APRCBCTSettingsSection2View\"]/DataGrid[@ClassName=\"DataGrid\"]/DataItem[@ClassName=\"DataGridRow\"][@Name=\"Presentation.UiElements.ViewModels.TableViewModel\"]/Custom[@ClassName=\"DataGridCell\"][starts-with(@Name,\"Item: Presentation.UiElements.ViewModels.TableViewModel, Column \")]/Button[@ClassName=\"Button\"]")
    WebElement view;
    
    @FindBy(xpath = "//Custom[@ClassName=\"APRCBCTDataPopupView\"]/Text[@ClassName=\"Text\"][@Name=\"APR ID:\"]/Text[@Name=\"APR ID:\"][@AutomationId=\"Label\"]/Text[@ClassName=\"TextBlock\"][@Name=\"APR ID:\"]")
    WebElement aprid;	
    		
    @FindBy(xpath =	"//Custom[@ClassName=\"APRCBCTDataPopupView\"]/Text[@ClassName=\"Text\"][@Name=\"CBCT\"]/Text[@Name=\"CBCT\"][@AutomationId=\"Label\"]/Text[@ClassName=\"TextBlock\"][@Name=\"CBCT\"]")
    WebElement cbct;	
    		
    @FindBy(xpath = "//Custom[@ClassName=\"APRCBCTDataPopupView\"]/DataGrid[@ClassName=\"DataGrid\"]/Header[@AutomationId=\"PART_ColumnHeadersPresenter\"]/HeaderItem[@ClassName=\"DataGridColumnHeader\"][@Name=\"Sl No\"]/Text[@Name=\"Sl No\"][@AutomationId=\"Label\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Sl No\"]")
    WebElement slno;		
    		
    @FindBy(xpath =	"//Custom[@ClassName=\"APRCBCTDataPopupView\"]/DataGrid[@ClassName=\"DataGrid\"]/Header[@AutomationId=\"PART_ColumnHeadersPresenter\"]/HeaderItem[@ClassName=\"DataGridColumnHeader\"][@Name=\"Site\"]/Text[@Name=\"Site\"][@AutomationId=\"Label\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Site\"]")
    WebElement site;		
    		
    @FindBy(xpath = "//Custom[@ClassName=\"APRCBCTDataPopupView\"]/DataGrid[@ClassName=\"DataGrid\"]/Header[@AutomationId=\"PART_ColumnHeadersPresenter\"]/HeaderItem[@ClassName=\"DataGridColumnHeader\"][@Name=\"Imaging Type\"]/Text[@Name=\"Imaging Type\"][@AutomationId=\"Label\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Imaging Type\"]")	
    WebElement imaging;	
    		
    @FindBy(xpath = "//Custom[@ClassName=\"APRCBCTDataPopupView\"]/DataGrid[@ClassName=\"DataGrid\"]/Header[@AutomationId=\"PART_ColumnHeadersPresenter\"]/HeaderItem[@ClassName=\"DataGridColumnHeader\"][@Name=\"Patient Size\"]/Text[@Name=\"Patient Size\"][@AutomationId=\"Label\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Patient Size\"]")
    WebElement patient;
    
    @FindBy(xpath = "//Custom[@ClassName=\"APRCBCTDataPopupView\"]/DataGrid[@ClassName=\"DataGrid\"]/Header[@AutomationId=\"PART_ColumnHeadersPresenter\"]/HeaderItem[@ClassName=\"DataGridColumnHeader\"][@Name=\"Fan Type\"]/Text[@Name=\"Fan Type\"][@AutomationId=\"Label\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Fan Type\"]")
    WebElement fantype1;
    
    @FindBy(xpath = "//Custom[@ClassName=\"APRCBCTDataPopupView\"]/DataGrid[@ClassName=\"DataGrid\"]/Header[@AutomationId=\"PART_ColumnHeadersPresenter\"]/HeaderItem[@ClassName=\"DataGridColumnHeader\"][@Name=\"kV\"]/Text[@Name=\"kV\"][@AutomationId=\"Label\"]/Text[@ClassName=\"TextBlock\"][@Name=\"kV\"]")
    WebElement kv1;
    
    @FindBy(xpath = "//Custom[@ClassName=\"APRCBCTDataPopupView\"]/DataGrid[@ClassName=\"DataGrid\"]/Header[@AutomationId=\"PART_ColumnHeadersPresenter\"]/HeaderItem[@ClassName=\"DataGridColumnHeader\"][@Name=\"mA\"]/Text[@Name=\"mA\"][@AutomationId=\"Label\"]/Text[@ClassName=\"TextBlock\"][@Name=\"mA\"]")
    WebElement ma1;
    
    @FindBy(xpath = "//Custom[@ClassName=\"APRCBCTDataPopupView\"]/DataGrid[@ClassName=\"DataGrid\"]/Header[@AutomationId=\"PART_ColumnHeadersPresenter\"]/HeaderItem[@ClassName=\"DataGridColumnHeader\"][@Name=\"ms\"]/Text[@Name=\"ms\"][@AutomationId=\"Label\"]/Text[@ClassName=\"TextBlock\"][@Name=\"ms\"]")
    WebElement ms1;
    
    @FindBy(xpath = "//Custom[@ClassName=\"APRCBCTDataPopupView\"]/DataGrid[@ClassName=\"DataGrid\"]/Header[@AutomationId=\"PART_ColumnHeadersPresenter\"]/HeaderItem[@ClassName=\"DataGridColumnHeader\"][@Name=\"Dose\"]/Text[@Name=\"Dose\"][@AutomationId=\"Label\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Dose\"]")
    WebElement dose;
     
    @FindBy(xpath = "//Custom[@ClassName=\"APRCBCTDataPopupView\"]/DataGrid[@ClassName=\"DataGrid\"]/Header[@AutomationId=\"PART_ColumnHeadersPresenter\"]/HeaderItem[@ClassName=\"DataGridColumnHeader\"][@Name=\"Frame Rate\"]/Text[@Name=\"Frame Rate\"][@AutomationId=\"Label\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Frame Rate\"]")
    WebElement framerate1;
    
    @FindBy(xpath = "//Custom[@ClassName=\"APRCBCTDataPopupView\"]/DataGrid[@ClassName=\"DataGrid\"]/Header[@AutomationId=\"PART_ColumnHeadersPresenter\"]/HeaderItem[@ClassName=\"DataGridColumnHeader\"][@Name=\"Tube Selection\"]/Text[@Name=\"Tube Selection\"][@AutomationId=\"Label\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Tube Selection\"]")
    WebElement tube1;
    
    @FindBy(xpath = "//Custom[@ClassName=\"APRCBCTDataPopupView\"]/DataGrid[@ClassName=\"DataGrid\"]/Header[@AutomationId=\"PART_ColumnHeadersPresenter\"]/HeaderItem[@ClassName=\"DataGridColumnHeader\"][@Name=\"Gantry Speed\"]/Text[@Name=\"Gantry Speed\"][@AutomationId=\"Label\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Gantry Speed\"]")
    WebElement gantry;
    
    @FindBy(xpath = "//Custom[@ClassName=\"APRCBCTDataPopupView\"]/DataGrid[@ClassName=\"DataGrid\"]/Header[@AutomationId=\"PART_ColumnHeadersPresenter\"]/HeaderItem[@ClassName=\"DataGridColumnHeader\"][@Name=\"Scan Start Angle\"]/Text[@Name=\"Scan Start Angle\"][@AutomationId=\"Label\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Scan Start Angle\"]")
    WebElement scan;
    
    @FindBy(xpath = "//Custom[@ClassName=\"APRCBCTDataPopupView\"]/DataGrid[@ClassName=\"DataGrid\"]/Header[@AutomationId=\"PART_ColumnHeadersPresenter\"]/HeaderItem[@ClassName=\"DataGridColumnHeader\"][@Name=\"Scan Stop Angle\"]/Text[@Name=\"Scan Stop Angle\"][@AutomationId=\"Label\"]/Text[@ClassName=\"TextBlock\"][@Name=\"Scan Stop Angle\"]")
    WebElement scanstop;
	
    @FindBy(name = "Gantry Speed (deg/sec)")
    WebElement Gantryspeed;
    
    @FindBy(name = "Scan Start Angle (deg)")
    WebElement StartAngle;
    
    @FindBy(name = "Scan Stop Angle (deg)")
    WebElement StopAngle;
    
    @FindBy(name = "APR ID :")
	WebElement aprid2;
	
	@FindBy(name = "Sl No")
	WebElement SlNo;
	
	@FindBy(name = "Site")
	WebElement Site;
	
	@FindBy(name = "Imaging Type")
	WebElement ImagingType;
	
	@FindBy(name = "Patient Size")
	WebElement PatientSize;
	
	@FindBy(name = "kV")
	WebElement kV1;
	
	@FindBy(name = "mA")
	WebElement mA1;
	
	@FindBy(name = "ms")
	WebElement ms2;
	@FindBy(name = "Dose")
	WebElement Dose;
	
	@FindBy(name = "Fan Type")
	WebElement FanType;
	
	@FindBy(name = "Frame Rate")
	WebElement FrameRate;
	
	@FindBy(name = "Tube Selection")
	WebElement TubeSelection;
	
	@FindBy(name = "Gantry Speed")
	WebElement GantrySpeed;
	
	@FindBy(name = "Scan Start Angle")
	WebElement ScanStartAngle;
	
	@FindBy(name = "Scan Stop Angle")
	WebElement ScanStopAngle;
	
	
	
	
	
	
	@FindBy(name = "*Frame Rate - Frame per sec")
	WebElement FrameRatepersec;
	
	@FindBy(name = "*Gantry Speed - deg per sec")
	WebElement Gantryspeedpersec;
	
	@FindBy(name = "*Scan Start Angle - deg")
	WebElement startpersec;
	
	@FindBy(name = "*Scan Stop Angle - deg")
	WebElement stoppersec;
	
	@FindBy(name = "*Dose - cGy")
	WebElement Doseindication;
	
	
	
	

    
	
	
	
	
	
}
