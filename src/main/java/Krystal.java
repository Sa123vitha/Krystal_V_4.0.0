import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyDownAction;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class Krystal {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		DesktopOptions option = new DesktopOptions();

		option.setApplicationPath("C:\\Program Files\\Panacea Medical Technologies\\Krystal\\Krystal.exe");
		Thread.sleep(5000);

		WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), option);
		Thread.sleep(5000);
		driver.switchTo().activeElement().sendKeys("m");
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		// driver.findElementByName("Sign IN").click();
		driver.findElement(By.name("Password")).sendKeys("p");
		Thread.sleep(5000);

		System.out.println("entered user id and password completed Completed");
		Thread.sleep(5000);

		// act.sendKeys(Keys.SPACE).build().perform();
		WebElement sign = driver.findElement(By.id("BtnValidate"));
		//System.out.println(sign.getAttribute("SIGN IN"));
		driver.findElement(By.id("BtnValidate")).click();

		/*
		 * // Clear button WebElement sign1 = driver.findElement(By.name("CLEAR"));
		 * System.out.println( sign1.getAttribute("SIGN IN"));
		 * driver.findElement(By.name("CLEAR")).click();
		 */

		Thread.sleep(5000);
		/*
		 * Thread.sleep(5000); boolean
		 * exit=driver.findElement(By.name("EXIT")).isEnabled();
		 * System.out.println(exit); Thread.sleep(3000);
		 */
		// driver.findElement(By.name("EXIT")).click();

		System.out.println("Completed1");
		driver.quit();
	}
}