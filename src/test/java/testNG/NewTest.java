package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import io.appium.java_client.windows.WindowsDriver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.util.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class NewTest {


	    @BeforeSuite
	    public void beforeSuite() {
	        System.out.println("Before Suite");
	    }

	    @AfterSuite
	    public void afterSuite() {
	        System.out.println("After Suite");
	    }

	    @BeforeTest
	    public void beforeTest() {
	        System.out.println("Before Test");
	    }

	    @AfterTest
	    public void afterTest() {
	        System.out.println("After Test");
	    }

	    @BeforeClass
	    public void beforeClass() {
	        System.out.println("Before Class");
	    }

	    @AfterClass
	    public void afterClass() {
	        System.out.println("After Class");
	    }

	    @BeforeMethod
	    public void beforeMethod() {
	        System.out.println("Before Method");
	    }

	    @AfterMethod
	    public void afterMethod() {
	        System.out.println("After Method");
	    }

	    @Test(priority = 1)
	    public void testMethod1() {
	        System.out.println("Test Method 1");
	        AssertJUnit.assertEquals(2 + 2, 4);
	    }

	    @Test(priority = 2)
	    public void testMethod2() {
	        System.out.println("Test Method 2");
	        AssertJUnit.assertTrue(true);
	    }

	    @Test(priority = 3, enabled = false)
	    public void testMethod3() {
	        System.out.println("Test Method 3");
	        AssertJUnit.fail("Intentional failure");
	    }

	    @Test
		@DataProvider(name = "data")
	    public Object[][] testData() {
	        return new Object[][]{{1, 1}, {2, 2}, {3, 3}};
	    }

	    @Test(dataProvider = "data")
	    public void testMethodWithData(int input, int expected) {
	        System.out.println("Test Method with Data: Input - " + input + ", Expected - " + expected);
	        AssertJUnit.assertEquals(input, expected);
	    }
	

	     


}
