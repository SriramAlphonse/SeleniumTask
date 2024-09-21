package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {
	
	static ChromeDriver driver;
	
	static void Browserlaunch() {
		driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		System.out.println("Browser Launched");	
	}
	static void JavaScriptExecute () throws InterruptedException {
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,3000)");
		Thread.sleep(3000);
		System.out.println("Scroll down Successfully");
		js.executeScript("window.scroll(0,-3000)");
		Thread.sleep(3000);
        System.out.println("Scroll up Successfully");
        WebElement element = driver.findElement(By.xpath("//a[@href='/?src=onlineShopping']"));
        js.executeScript("arguments[0].scrollIntoView();", element);
        System.out.println("Element is Viewed");
        js.executeScript("window.scroll(0,0)");
        System.out.println("windows Moved to Top");
        
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Browserlaunch();
		JavaScriptExecute();
		
	}
}
