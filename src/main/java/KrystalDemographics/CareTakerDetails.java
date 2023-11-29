package KrystalDemographics;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CareTakerDetails {
	
	
	public static void CaretakerData(WebDriver driver) throws InterruptedException
	{
		Name(driver,"Name","Akasha");
		Name(driver,"Contact Number","9389489479");
		Name(driver,"Address","Panacea medical malur");
		Name(driver,"Relationship","Brother");
	}
	
	public static void Name(WebDriver driver,String Name, String Data) throws InterruptedException
	{   
		
		Actions actions=new Actions(driver);
		WebElement NametoDoubleClick = driver.findElement(By.name(Name));
		actions.doubleClick(NametoDoubleClick).perform();
		Thread.sleep(1000);
		driver.switchTo().activeElement().sendKeys(Data);
	}
	
	public static void Save()
	{
		
	}
}
