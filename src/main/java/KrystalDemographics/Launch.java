package KrystalDemographics;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.WindowsElement;

public class Launch {

	public static void main(String[] args) throws Exception {
		  // Set the WinAppDriver URL
        URL winAppDriverUrl = new URL("http://127.0.0.1:4723");
        

        // Set desired capabilities
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app","C:\\Users\\Public\\Desktop"); // Set the root window as the target
        
        // Create a WinAppDriver instance
        WindowsDriver<WindowsElement> driver = new WindowsDriver<>(winAppDriverUrl, capabilities);

        // Find the application element by its name or other properties
        WindowsElement applicationElement = driver.findElementByName("Krystal");
        Actions action=new Actions(driver);
        action.doubleClick(applicationElement);
     

        // Double-click on the application element to launch the desktop application
        driver.executeScript("ms-appautomation://" + applicationElement.getId() + "/InvokePattern.Invoke");

        // Perform actions on the launched desktop application

        // Close the driver
        driver.quit();
    }

	}


