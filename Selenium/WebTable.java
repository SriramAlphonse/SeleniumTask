package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://cosmocode.io/automation-practice-webtable/#google_vignette");
		List<WebElement> row = driver.findElements(By.xpath("//table/tbody/tr[11]"));
		for (WebElement Australiarow:row) {
			String output=Australiarow.getText();
			System.out.println(output);
		}
		
		String S1 =null;
	    List<WebElement> TopRow = driver.findElements(By.xpath("//table/tbody/tr[1]"));
	    for (WebElement FirstRow:TopRow) {
	    	S1 = FirstRow.getText();
	    	System.out.println(S1);
	    }
	   
	    
	}

}
