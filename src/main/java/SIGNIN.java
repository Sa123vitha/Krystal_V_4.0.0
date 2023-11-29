import java.net.URL;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

import io.appium.java_client.windows.WindowsDriver;

public class SIGNIN {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
	        
	        String appPath = "C:\\Program Files\\Panacea Medical Technologies\\Krystal\\Krystal.exe";

	        // Set the WinAppDriver server URL
	        String winAppDriverUrl = "http://127.0.0.1:4723";

	        // Create DesiredCapabilities for the application
	        DesiredCapabilities appCapabilities = new DesiredCapabilities();
	        DesktopOptions options = new DesktopOptions();
	        appCapabilities.setCapability("app", appPath);
	        options.setApplicationPath(appPath);

	        // Create a WindowsDriver instance
	        WindowsDriver<WebElement> driver;
	        try {
	            driver = new WindowsDriver<WebElement>(new URL(winAppDriverUrl), appCapabilities);
	        } catch (MalformedURLException e) {
	            e.printStackTrace();
	            return;
	        }
	        WebElement tooltipElement = driver.findElement(By.name("User ID"));

	        // Get the text of the tooltip element
	        String tooltipText = tooltipElement.getText();
	        System.out.println("Tooltip text: " + tooltipText);
	        Thread.sleep(2000);
	        driver.switchTo().activeElement().sendKeys("m");
	        Thread.sleep(2000);
			driver.findElement(By.className("PasswordBox")).sendKeys("p");
			Thread.sleep(5000);
			//driver.findElement(By.name("SIGN IN")).click();
			driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Button[@Name=\"SIGN IN\"][@AutomationId=\"BtnValidate\"]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"NavigationTopBarView\"]/Button[@AutomationId=\"ToolTip\"]")).click();
	}

}
