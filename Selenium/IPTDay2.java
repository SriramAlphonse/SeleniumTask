package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IPTDay2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement dress = driver.findElement(By.xpath("//span[text()='Fashion']"));
		dress.click();
		//WebElement tshirt = driver.findElement(By.xpath("(//a[@class=_3490ry'])[2]"));
		//tshirt.click();
		Select se1=new Select(dress);
	    se1.selectByIndex(2);
	    Thread.sleep(3000);
	

	}

}
