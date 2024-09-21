package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement {

	public static ChromeDriver driver;

	public static void Browserlaunch() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/"); // get
		driver.manage().window().maximize();
		driver.navigate().to("https://www.instagram.com/");
	}

	public static void Webelement() {
		String title = driver.getTitle();
		System.out.println(title);
		org.openqa.selenium.WebElement email = driver
				.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
		email.sendKeys("Qwerty@instagram.com");
		org.openqa.selenium.WebElement pass = driver.findElement(By.xpath("//input[@aria-label='Password']"));
		pass.sendKeys("987654");
		String text = pass.getText();
		System.out.println(text);
		boolean displayed = pass.isDisplayed();
		System.out.println(displayed);
		boolean enabled = pass.isEnabled();
		System.out.println(enabled);
		boolean selected = pass.isSelected();
		System.out.println(selected);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Browserlaunch();
		Webelement();
	}
}
