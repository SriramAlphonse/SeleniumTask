package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	static ChromeDriver driver;
		static void Browserlaunch() {
		driver = new ChromeDriver();
		driver.get("https://testpages.eviltester.com/styled/alerts/alert-test.html");
		driver.manage().window().maximize();
		System.out.println("Browser Launched");	}
	static void SimpleAlert() throws InterruptedException {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,500)");
		WebElement simplealert = driver.findElement(By.xpath("//input[@value='Show alert box']"));
		simplealert.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		System.out.println("Simple Alert Executed Successfully");}
	static void ConfirmAlert() throws InterruptedException {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,500)");
		WebElement confirmalert = driver.findElement(By.xpath("//input[@value='Show confirm box']"));
		confirmalert.click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		System.out.println("Confirm Alert Executed Successfully");}
	static void PromptAlert() throws InterruptedException {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,500)");
		WebElement promptalert = driver.findElement(By.xpath("//input[@onclick='show_prompt()']"));
		promptalert.click();
		Thread.sleep(3000);
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().sendKeys("Prompt Alert - Done");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		System.out.println("Prompt Alert Executed Successfully");}
	public static void main(String[] args) throws InterruptedException {
		Browserlaunch();
		SimpleAlert();
		ConfirmAlert();
		PromptAlert();}}

