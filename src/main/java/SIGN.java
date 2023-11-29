import java.net.MalformedURLException;
import org.openqa.selenium.WebDriverException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class SIGN {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesktopOptions option = new DesktopOptions();

		option.setApplicationPath("C:\\Program Files\\Panacea Medical Technologies\\Krystal\\Krystal.exe");
		
		WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), option);
		
		
		Thread.sleep(5000);
		
		
		//WebElement tooltipElement = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Text[@ClassName=\"Text\"][@Name=\"SIGN IN\"]/Text[@Name=\"SIGN IN\"][@AutomationId=\"Label\"]/Text[@ClassName=\"TextBlock\"][@Name=\"SIGN IN\"]"));
	//	 System.out.println("Cell text: " + tooltipElement.getText()); 
        //Get the text of the tooltip element
      // String tooltipText = tooltipElement.getText();
       // System.out.println("Tooltip text: " + tooltipText);
		
       
		
		
		
	//SIGN IN PAGE 	
		
		//driver.switchTo().activeElement().sendKeys("123456");
		String t3 =driver.findElement(By.name("This software is protected by copyright law and international treaties. Unauthorized duplication or distribution of this software or any other portion of it may result in severe civil and criminal penalties and will be prosecuted to the maximum extent possible under the law.")).getAttribute("Name");
		 
		//driver.findElement(By.name("This software is protected by copyright law and international treaties. Unauthorized duplication or distribution of this software or any other portion of it may result in severe civil and criminal penalties and will be prosecuted to the maximum extent possible under the law.")).sendKeys("123456");
		String t2 = driver.findElement(By.name("Product Name :")).getAttribute("Name");
		
		String t4 = driver.findElement(By.name("Offline Record & Verification")).getAttribute("Name");
		
		driver.findElement(By.name("User ID")).sendKeys("123456");
		String t1 = driver.findElement(By.name("User ID")).getAttribute("Name");
		Thread.sleep(2000);
		
		//String user = driver.findElement(By.xpath("//Window[@ClassName=\"Window\"][@Name=\"Krystal\"]/Custom[@ClassName=\"SignInView\"]/Edit[@AutomationId=\"TxtbxUsername\"]/Text[@Name=\"User ID\"][@AutomationId=\"LblName\"]/Text[@ClassName=\"TextBlock\"][@Name=\"User ID\"]")).getText();
		//System.out.println(user);
		Actions act = new Actions(driver);
		driver.findElement(By.name("Password")).sendKeys("123456");
		String t = driver.findElement(By.name("Password")).getAttribute("Name");
		Thread.sleep(1000);
		//System.out.println(driver.findElement(By.id("BtnValidate")).getText());
		
		
		 WebElement d = driver.findElement(By.id("BtnValidate"));
		String D = d.getAttribute("Name");
		 System.out.println(t3);
		 System.out.println(t4);
		System.out.println(t);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(D);
		System.out.println(t4);
		WebElement im = driver.findElement(By.className("Image"));
		String t6 = im.getAttribute("className");
		System.out.println(t6);
		d.click();
		Thread.sleep(3000);
		/*WebElement add = driver.findElement(By.className("Button"));
		String t5 = add.getAttribute("className");
		add.click();
		Thread.sleep(1000);
		WebElement oth = driver.findElement(By.name("Other ID"));
		oth.sendKeys("RT172752");
		String t7 = oth.getAttribute("Name");
		System.out.println(t7);
		Thread.sleep(1000);
		driver.findElement(By.name("SAVE")).click();
		Thread.sleep(2000);
	/*	WebElement FstName = driver.findElement(By.name("Input cannot be blank"));
		String FN = FstName.getAttribute("Name");
		System.out.println(FN);*/
		
	/*// Add Patient
		driver.findElement(By.className("Button")).click();
		Thread.sleep(2000);
	// Demographics 
		driver.findElement(By.name("Other ID")).sendKeys("RT172752");
		Thread.sleep(1000);*/
		/*driver.findElement(By.name("First Name")).sendKeys("Savitha");
		Thread.sleep(1000);
		driver.findElement(By.id("PART_Button")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("May, 2023")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("2023")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("2021")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("Jan")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("27")).click();
		driver.findElement(By.name("Blood Group")).click();
		Thread.sleep(1000);
		WebElement elementToDateofBirth = driver.findElement(By.name("A-ve"));
		Actions actions = new Actions(driver);
		actions.doubleClick(elementToDateofBirth).perform();
		driver.findElement(By.name("Male")).click();
		driver.findElement(By.name("Patient Size")).click();
		Thread.sleep(2000);
		WebElement elementToDoubleClick = driver.findElement(By.name("Small"));
        // Perform the double-click action on the element
        actions.doubleClick(elementToDoubleClick).perform();
		
		Thread.sleep(2000);
		WebElement NametoDoubleClick = driver.findElement(By.name("Name"));
		actions.doubleClick(NametoDoubleClick).perform();
		Thread.sleep(2000);
		driver.findElement(By.name("Name")).sendKeys("New Patient");
		
		
		WebElement NumbertoDoubleClick = driver.findElement(By.name("Contact Number"));
		actions.doubleClick(NumbertoDoubleClick).perform();
		Thread.sleep(2000);
		driver.findElement(By.name("Contact Number")).sendKeys("938387833");
		
		
		driver.findElement(By.name("SAVE")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("OK")).click();
		Thread.sleep(2000);*/
		/*WebElement list = driver.findElement(By.name("Presentation.UiElements.ViewModels.TableViewMode"));
		String li = list.getAttribute("Name");
		System.out.println(li);*/
		Actions act1=new Actions(driver);
		WebElement rt = driver.findElement(By.name("RT202305A00"));
		act1.moveToElement(rt).click().perform();
		//List<WebElement> list = driver.findElements(By.xpath("//Window[@ClassName='Window'][@Name='Krystal']/Custom[@ClassName='MainContainerView']/Custom[@ClassName='OpenPatientMainView']/Custom[@ClassName='OpenPatientTableView']/DataGrid[starts-with(@AutomationId,'Datagrid')]/DataItem[@ClassName='DataGridRow'][@Name='Presentation.UiElements.ViewModels.TableViewModel']/Custom[@ClassName='DataGridCell']"));
		/*List<WebElement> list = driver.findElements(By.xpath("//DataGrid[starts-with(@AutomationId,'Datagrid')]/DataItem[@ClassName='DataGridRow'][@Name='Presentation.UiElements.ViewModels.TableViewModel']/Custom[@ClassName='DataGridCell']"));
		Iterator<WebElement> itr = list.iterator();
		
			while(itr.hasNext())   
			{  
				WebElement li = itr.next();
				
					System.out.print(li.getText()+" "); 
					
			}  
			for( WebElement list1 : list)
			{
				String list2 = list1.getText();
				if(list2.contains("RT202305A01")) {
					list1.click();
				}
			}
		*/
		
	
		
		
	
        

	}

}
