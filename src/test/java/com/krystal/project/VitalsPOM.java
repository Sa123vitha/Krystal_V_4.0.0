package com.krystal.project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.appium.java_client.windows.WindowsDriver;

public class VitalsPOM extends ReferencefileChemotheraphy {
 
	public VitalsPOM(WindowsDriver<WebElement> driver)
	{
		PageFactory.initElements(driver, this);
	}
		
		@FindBy(name = "Vitals")
		WebElement vitalslabel;
		
		@FindBy(name = "VITALS")
		WebElement vitals;
		
		@FindBy(name = "Height  (cm)")
		WebElement height1;
		
		@FindBy(name = "Height (cm)")
		WebElement height;
		
		@FindBy(name = "Weight (kg)")
		WebElement weight;
		
		@FindBy(name = "Pulse Rate (Beats per MINUTE)")
		WebElement pulse;
		
		@FindBy(name = "Respiratory Rate (Breaths per MINUTE)")
		WebElement rate;
		
		@FindBy(name = "Blood Pressure (mm Hg)")
		WebElement blood;
		
		@FindBy(name = "Temperature (°F)")
		WebElement temperature;
		
		@FindBy(name = "Date Time")
		WebElement datetime;
		
		@FindBy(name = "Height")
		WebElement height2;
		
		@FindBy(name = "Weight")
		WebElement Weight2;
		
		@FindBy(name = "Pulse rate")
		WebElement pulse2;
		
		@FindBy(name = "Respiratory Rate")
		WebElement rate2;
		
		@FindBy(name = "Systolic")
		WebElement sys2;
		
		@FindBy(name = "Diastolic")
		WebElement dis2;
		
		@FindBy(name = "Temperature")
		WebElement temp2;

		@FindBy(name = "Height (cm)")
		WebElement addheight;
		
		@FindBy(name = "Weight (kg)")
		WebElement addweight;
		
		@FindBy(name = "Pulse Rate (Beats per MINUTE)")
		WebElement addpulse;
		
		@FindBy(name = "Respiratory Rate (Breaths per MINUTE)")
		WebElement addres;
		
		@FindBy(name = "Blood Pressure (mm Hg)")
		WebElement addblood;
		
		@FindBy(name = "Temperature (°F)")
		WebElement addtemp;
		
		@FindBy(name = "SAVE")
		WebElement save;
		
		@FindBy(name = "CLOSE")
		WebElement close;
		
		@FindBy(name = "VITAL TREND")
		WebElement trend;
		
		@FindBy(name = "EDIT")
		WebElement Edit;
		
		@FindBy(name = "DELETE")
		WebElement Delete;
		
		@FindBy(name = "UPDATE")
		WebElement Update;
		
		@FindBy(name = "Vitals data for the date already exists, hence cannot add duplicate record.")
		WebElement Vitalsalreadyexits;
		
		@FindBy(name = "Input cannot be blank")
		WebElement Inputblank;
		
		@FindBy(name = "Range:[1 to 300]")
		WebElement Error300;
		
		@FindBy(name = "Range:[1 to 200]")
		WebElement Error200;
		
		@FindBy(name = "Range:[1 to 110]")
		WebElement Error110;
		
		@FindBy (xpath = "//Button[@HelpText=\"Menu\"]")
		 WebElement Menu;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
