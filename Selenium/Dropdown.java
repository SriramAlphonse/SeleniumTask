package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
	static ChromeDriver driver;
	
	static void Browserlaunch() {
		driver = new ChromeDriver ();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println("Browser Launched Successfully");
		}
	
	static void Singledropdown() throws InterruptedException {
		driver.navigate().to("https://www.amazon.in/");
		WebElement element = driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']"));
	    element.click();
	    Select se1=new Select(element);
	    se1.selectByIndex(4);
	    Thread.sleep(3000);
	    System.out.println("slected By index Successfully");
	    WebElement element2 = driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']"));
	    element2.click();
	    Select se2=new Select(element2);
	    se2.selectByVisibleText("Books");
	    WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
	    search.sendKeys("Novel Book");
	    WebElement searchclick = driver.findElement(By.id("nav-search-submit-button"));
	    searchclick.click();
	    System.out.println("slected By Visible Text Successfully");
	    driver.navigate().back();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Browserlaunch();
		Singledropdown();
	}

}
