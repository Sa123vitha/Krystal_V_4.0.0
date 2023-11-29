package KrystalDemographics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DemographicsGUI {
	public static void Basicinformation(WebElement pBI, String ePPBI, int k) {
		
		
		String APPBI= pBI.getText();
		if(APPBI.equals(ePPBI))
		{
			System.out.println(k+":"+" RUN PASS "+" -> "+" Excepted is: "+ePPBI+ " and "+" Actual is: "+APPBI);
		}
		else
		{
			System.out.println(k+":"+" RUN FAIL "+" -> "+" Excepted is: "+ePPBI+ " and "+" Actual is: "+APPBI);
		}
		System.out.println("---------------------------------------------------------------------------------");
}
}


