package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	
	static WebDriver driver;
	
	static public void Frames1() {   //Constructor
		driver = new ChromeDriver ();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.automationtesting.in/Frames.html");
		System.out.println("Browser Launched Successfully");
		SingleFrames();	
		}
    static void SingleFrames() {
    	driver.switchTo().frame("singleframe"); //id
    	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Sriram");
    	
    	
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Frames1();
	}

}
