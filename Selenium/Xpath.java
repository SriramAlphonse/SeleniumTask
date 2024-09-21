package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.instagram.com/");
		driver.navigate().refresh();
		driver.navigate().back();
		String currentUrl1 = driver.getCurrentUrl();
		System.out.println("URL1 is " + currentUrl1);
		String title1 = driver.getTitle();
		System.out.println("Title1 is " + title1);
		driver.navigate().forward();
		String currentUrl2 = driver.getCurrentUrl();
		System.out.println("URL2 is " + currentUrl2);
		String title2 = driver.getTitle();
		System.out.println("TiTle2 is" + " " + title2);
		WebElement email = driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
		email.sendKeys("qwerty@instagram.com");
		//driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("Asdfgh@instagram.com");
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("Password@456");
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println("Login Successfully");
		login.click();
	}

}
