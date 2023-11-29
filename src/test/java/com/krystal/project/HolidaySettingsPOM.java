package com.krystal.project;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.windows.WindowsDriver;

public class HolidaySettingsPOM{
	
	WindowsDriver<WebElement> driver;
	public HolidaySettingsPOM(WindowsDriver<WebElement> driver)
		{
			PageFactory.initElements(driver, this);
		}


	
@FindBy(name = "Holiday Settings")
WebElement holidaysettings;


@FindBy(name = "HOLIDAY CONFIGURATION")
WebElement holidayconfg;


@FindBy(name = "Holiday Name")
WebElement holidayname;


@FindBy(name = "Enter name of the holiday here")
WebElement entername;


@FindBy(name = "Holiday Type")
WebElement holidaytype;


@FindBy(name = "Normal")
WebElement normal;


@FindBy(name = "Select Date")
WebElement selectday;


@FindBy(name = "Weekly")
WebElement weekly;


@FindBy(name = "Select Day")
WebElement selectdaydropdown;


@FindBy(name = "Color")
WebElement color;


@FindBy(name = "Description")
WebElement description;


@FindBy(name = "Enter some description about the holiday")
WebElement desptext;


@FindBy(name = "Is Consecutive Yearly")
WebElement consecutive;


@FindBy(name = "Start Year")
WebElement startyear;


@FindBy(name = "Enter the starting year")
WebElement enteryear;


@FindBy(name = "End Year")
WebElement endyear;


@FindBy(name = "Enter the ending year")
WebElement endyeartext;


@FindBy(name = "ADD")
WebElement addbutton;





@FindBy(name = "HOLIDAY LIST")
WebElement holidaylist;


@FindBy(name = "Search Holiday Name")
WebElement searchholiday;


@FindBy(name = "Holiday Name")
WebElement listholidayname;


@FindBy(name = "Date / Day")
WebElement dateday;


@FindBy(name = "Description")
WebElement listdescription;


@FindBy(name = "Is Consecutive Yearly")
WebElement listconsecutive;


@FindBy(name = "Color")
WebElement color1;

@FindBy(name = "RESET")
WebElement reset;


@FindBy(name = "Holiday Type")
WebElement HolidayType;

@FindBy(name = "Add Field")
WebElement addfield;

@FindBy(name = "Input cannot be blank")
WebElement Emptyerror;

@FindBy(name = "Holiday name already exists.")
WebElement Nameexits;

@FindBy(name = "Input must not contain \\ , '' , '")
WebElement Nameinvalid;

@FindBy(name = "Input must have atleast 3 character")
WebElement Namerange;

@FindBy(name = "Show Calendar")
WebElement Calendar;

@FindBy(name = "Previous button")
WebElement Previousdate;

@FindBy(name = "Next button")
WebElement Nextdate;

@FindBy(name = "Enter some description about the holiday")
WebElement Holidaydescription;

@FindBy(name = "Range:[2023 to 9999]")
WebElement starterror;

@FindBy(name = "Ending year cannot be less than starting year!")
WebElement enderror;

@FindBy(name = "UPDATE")
WebElement Update;



}






