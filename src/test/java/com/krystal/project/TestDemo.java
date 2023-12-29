package com.krystal.project;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestDemo extends ReferencefileChemotheraphy {

    private LoginPOM login;
    
    @BeforeSuite
    public void setUp() {
        extent = ExtendManager.getInstance();
    }

    @Test(priority = 1)
    public void Launch() throws InterruptedException, IOException {
        login = new LoginPOM(driver);
        demo = new DemographicsExternal();
    }

    @Test(priority = 2)
    public void Signinempty() throws IOException, InterruptedException {
        test = extent.createTest(funTestCaseName() + " To verify click on Signin Empty error message is displaying");
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        login.SigninButton.click();
        Emptyerrormessage();
       
    }


    public void Emptyerrormessage() throws InterruptedException, IOException {
        String expectedText = "User ID or Password cannot be empty.";
        demo.isdisplayed(login.Errormessage, expectedText, test, driver);
        demo.Textcomparsion(login.Errormessage, expectedText, test, driver);
    }
}













