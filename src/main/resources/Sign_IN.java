import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.windows.WindowsDriver;

public class Sign_IN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String appPath = "C:\\Program Files\\Panacea Medical Technologies\\Krystal\\Krystal.exe";

        // Set the WinAppDriver server URL
        String winAppDriverUrl = "http://127.0.0.1:4723";

        // Create DesiredCapabilities for the application
        DesiredCapabilities appCapabilities = new DesiredCapabilities();
        appCapabilities.setCapability("app", appPath);

        // Create a WindowsDriver instance
        WindowsDriver<WebElement> driver;
        try {
            driver = new WindowsDriver<WebElement>(new URL(winAppDriverUrl), appCapabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return;
        }
        String signIN = driver.findElement(By.name("SIGN IN")).getText();
        System.out.println(signIN);
        WebElement tooltipElement = driver.findElement(By.name("User ID")).getText();
        System.out.println(tooltipElement);
        

	}

}
